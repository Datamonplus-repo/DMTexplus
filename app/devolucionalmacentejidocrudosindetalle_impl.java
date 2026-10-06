package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devolucionalmacentejidocrudosindetalle_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_27_1PP1633( A396EmprCod, A11669DevCruId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action40") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_40_1PP1634( A396EmprCod, A44AlbRecCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod1PP0( A396EmprCod, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1PP0( A396EmprCod, A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod1PP0( A396EmprCod, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h252CliCod = httpContext.GetPar( "h252CliCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaclicod1PP1633( A396EmprCod, h252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1PP0( A396EmprCod, A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h840TrnCod = httpContext.GetPar( "h840TrnCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatrncod1PP1633( A396EmprCod, h840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"DEVCRUSAL") == 0 )
      {
         A11670DevCruFec = localUtil.parseDateParm( httpContext.GetPar( "DevCruFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx12asadevcrusal1PP1633( A11670DevCruFec, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_45") == 0 )
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
         gxload_45( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_46") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_46( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_48") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_48( A396EmprCod, A44AlbRecCod) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8DevCruId), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DevCruId), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion Almacen Tejido Crudo (sin detalle)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDevCruId_Internalname ;
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
      nRC_GXsfl_68 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_68"))) ;
      nGXsfl_68_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_68_idx"))) ;
      sGXsfl_68_idx = httpContext.GetPar( "sGXsfl_68_idx") ;
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

   public devolucionalmacentejidocrudosindetalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public devolucionalmacentejidocrudosindetalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devolucionalmacentejidocrudosindetalle_impl.class ));
   }

   public devolucionalmacentejidocrudosindetalle_impl( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruId_Internalname, httpContext.getMessage( "Devolucion Id", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruId_Internalname, GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruId_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruFec_Internalname, httpContext.getMessage( "Fecha Devolucion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevCruFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruFec_Internalname, localUtil.format(A11670DevCruFec, "99/99/99"), localUtil.format( A11670DevCruFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruSal_Internalname, httpContext.getMessage( "Fecha-Hora Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevCruSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruSal_Internalname, localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11673DevCruSal, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruSal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, h252CliCod, GXutil.rtrim( localUtil.format( h252CliCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruMat_Internalname, GXutil.rtrim( A11672DevCruMat), GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruObs_Internalname, A11682DevCruObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", (short)(0), 1, edtDevCruObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableinvisible_Internalname, divTableinvisible_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavError_confirmacion_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavError_confirmacion_Internalname, GXutil.ltrim( localUtil.ntoc( AV32Error_confirmacion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavError_confirmacion_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32Error_confirmacion), "9") : localUtil.format( DecimalUtil.doubleToDec(AV32Error_confirmacion), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavError_confirmacion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavError_confirmacion_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrusal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavDevcrusal_Internalname, httpContext.getMessage( "Fecha-Hora Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtavDevcrusal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrusal_Internalname, localUtil.ttoc( AV31DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV31DevCruSal, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrusal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrusal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtavDevcrusal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDevcrusal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      httpContext.writeTextNL( "</div>") ;
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruEst_Internalname, GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruEst_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruEst_Visible, edtDevCruEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruHash_Internalname, GXutil.rtrim( A11674DevCruHash), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", (short)(0), edtDevCruHash_Visible, edtDevCruHash_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruDesc_Internalname, GXutil.rtrim( A11675DevCruDesc), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", (short)(0), edtDevCruDesc_Visible, edtDevCruDesc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevCruDtSy_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruDtSy_Internalname, localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruDtSy_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruDtSy_Visible, edtDevCruDtSy_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruDtSy_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtDevCruDtSy_Visible==0)||(edtDevCruDtSy_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruGros_Internalname, GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruGros_Enabled!=0) ? localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99") : localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruGros_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruGros_Visible, edtDevCruGros_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruStt_Internalname, GXutil.rtrim( A11678DevCruStt), GXutil.rtrim( localUtil.format( A11678DevCruStt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruStt_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruStt_Visible, edtDevCruStt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruEnvA_Internalname, GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruEnvA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9") : localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruEnvA_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruEnvA_Visible, edtDevCruEnvA_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruAtId_Internalname, GXutil.rtrim( A11680DevCruAtId), GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruAtId_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruAtId_Visible, edtDevCruAtId_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruAT_Internalname, GXutil.rtrim( A11681DevCruAT), GXutil.rtrim( localUtil.format( A11681DevCruAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruAT_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruAT_Visible, edtDevCruAT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV30CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DevolucionAlmacenTejidoCrudosindetalle.htm");
      /* User Defined Control */
      ucGridlevel_level1_titlescategories.setProperty("GridTitlesCategories", Gridlevel_level1_titlescategories_Gridtitlescategories);
      ucGridlevel_level1_titlescategories.render(context, "dvelop.gridtitlescategories", Gridlevel_level1_titlescategories_Internalname, "GRIDLEVEL_LEVEL1_TITLESCATEGORIESContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol68( ) ;
      nGXsfl_68_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1634 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1634 = (short)(1) ;
            scanStart1PP1634( ) ;
            while ( RcdFound1634 != 0 )
            {
               init_level_properties1634( ) ;
               getByPrimaryKey1PP1634( ) ;
               addRow1PP1634( ) ;
               scanNext1PP1634( ) ;
            }
            scanEnd1PP1634( ) ;
            nBlankRcdCount1634 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1PP1634( ) ;
         standaloneModal1PP1634( ) ;
         sMode1634 = Gx_mode ;
         while ( nGXsfl_68_idx < nRC_GXsfl_68 )
         {
            bGXsfl_68_Refreshing = true ;
            readRow1PP1634( ) ;
            edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREF_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAlbRefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREFDSC_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtDevCruUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUUND_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruUnd_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            cmbAlbRUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNI_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
            edtDevCruPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUPZS_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruPzs_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
            imgprompt_44_Link = httpContext.cgiGet( "PROMPT_44_"+sGXsfl_68_idx+"Link") ;
            if ( ( nRcdExists_1634 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1PP1634( ) ;
            }
            sendRow1PP1634( ) ;
            bGXsfl_68_Refreshing = false ;
         }
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1634 = (short)(5) ;
         nRcdExists_1634 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1PP1634( ) ;
            while ( RcdFound1634 != 0 )
            {
               sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_681634( ) ;
               init_level_properties1634( ) ;
               standaloneNotModal1PP1634( ) ;
               getByPrimaryKey1PP1634( ) ;
               standaloneModal1PP1634( ) ;
               addRow1PP1634( ) ;
               scanNext1PP1634( ) ;
            }
            scanEnd1PP1634( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1634 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_681634( ) ;
         initAll1PP1634( ) ;
         init_level_properties1634( ) ;
         nRcdExists_1634 = (short)(0) ;
         nIsMod_1634 = (short)(0) ;
         nRcdDeleted_1634 = (short)(0) ;
         nBlankRcdCount1634 = (short)(nBlankRcdUsr1634+nBlankRcdCount1634) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1634 > 0 )
         {
            standaloneNotModal1PP1634( ) ;
            standaloneModal1PP1634( ) ;
            addRow1PP1634( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1634 = (short)(nBlankRcdCount1634-1) ;
         }
         Gx_mode = sMode1634 ;
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
      e111PP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "Z11669DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11673DevCruSal = localUtil.ctot( httpContext.cgiGet( "Z11673DevCruSal"), 0) ;
            Z11670DevCruFec = localUtil.ctod( httpContext.cgiGet( "Z11670DevCruFec"), 0) ;
            Z11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11671DevCruEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11672DevCruMat = httpContext.cgiGet( "Z11672DevCruMat") ;
            Z11674DevCruHash = httpContext.cgiGet( "Z11674DevCruHash") ;
            Z11675DevCruDesc = httpContext.cgiGet( "Z11675DevCruDesc") ;
            Z11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( "Z11676DevCruDtSy"), 0) ;
            Z11677DevCruGros = localUtil.ctond( httpContext.cgiGet( "Z11677DevCruGros")) ;
            Z11678DevCruStt = httpContext.cgiGet( "Z11678DevCruStt") ;
            Z11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11679DevCruEnvA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11680DevCruAtId = httpContext.cgiGet( "Z11680DevCruAtId") ;
            Z11681DevCruAT = httpContext.cgiGet( "Z11681DevCruAT") ;
            Z11682DevCruObs = httpContext.cgiGet( "Z11682DevCruObs") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "vDEVCRUID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15FirmaD = (short)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            AV41Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV29FlagCli = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Gridlevel_level1_titlescategories_Objectcall = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall") ;
            Gridlevel_level1_titlescategories_Class = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Class") ;
            Gridlevel_level1_titlescategories_Enabled = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled")) ;
            Gridlevel_level1_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname") ;
            Gridlevel_level1_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories") ;
            Gridlevel_level1_titlescategories_Visible = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Visible")) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11669DevCruId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            }
            else
            {
               A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtDevCruFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVCRUFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11670DevCruFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
            }
            else
            {
               A11670DevCruFec = localUtil.ctod( httpContext.cgiGet( edtDevCruFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtDevCruSal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DEVCRUSAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruSal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( edtDevCruSal_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            h252CliCod = httpContext.cgiGet( edtCliCod_Internalname) ;
            h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
            A11672DevCruMat = httpContext.cgiGet( edtDevCruMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
            A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
            AV32Error_confirmacion = (byte)(localUtil.ctol( httpContext.cgiGet( edtavError_confirmacion_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31DevCruSal = localUtil.ctot( httpContext.cgiGet( edtavDevcrusal_Internalname)) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11671DevCruEst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
            }
            else
            {
               A11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevCruEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
            }
            A11674DevCruHash = httpContext.cgiGet( edtDevCruHash_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
            A11675DevCruDesc = httpContext.cgiGet( edtDevCruDesc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
            A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevCruGros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevCruGros_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUGROS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruGros_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11677DevCruGros = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
            }
            else
            {
               A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( edtDevCruGros_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
            }
            A11678DevCruStt = httpContext.cgiGet( edtDevCruStt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruEnvA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruEnvA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUENVA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruEnvA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11679DevCruEnvA = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
            }
            else
            {
               A11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevCruEnvA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
            }
            A11680DevCruAtId = httpContext.cgiGet( edtDevCruAtId_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
            A11681DevCruAT = httpContext.cgiGet( edtDevCruAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
            AV30CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30CliCod), 6, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionAlmacenTejidoCrudosindetalle");
            A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("DevCruDtSy", localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A11669DevCruId != Z11669DevCruId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("devolucionalmacentejidocrudosindetalle:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
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
                  sMode1633 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1633 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1633 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1PP0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DEVCRUID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevCruId_Internalname ;
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
                        e111PP2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121PP2 ();
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
         e121PP2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1PP1633( ) ;
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
         disableAttributes1PP1633( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavError_confirmacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavError_confirmacion_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrusal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrusal_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
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

   public void confirm_1PP0( )
   {
      beforeValidate1PP1633( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PP1633( ) ;
         }
         else
         {
            checkExtendedTable1PP1633( ) ;
            closeExtendedTableCursors1PP1633( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1633 = Gx_mode ;
         confirm_1PP1634( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1633 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1633 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1PP1634( )
   {
      nGXsfl_68_idx = 0 ;
      while ( nGXsfl_68_idx < nRC_GXsfl_68 )
      {
         readRow1PP1634( ) ;
         if ( ( nRcdExists_1634 != 0 ) || ( nIsMod_1634 != 0 ) )
         {
            getKey1PP1634( ) ;
            if ( ( nRcdExists_1634 == 0 ) && ( nRcdDeleted_1634 == 0 ) )
            {
               if ( RcdFound1634 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1PP1634( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1PP1634( ) ;
                     closeExtendedTableCursors1PP1634( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ALBRECCOD_" + sGXsfl_68_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1634 != 0 )
               {
                  if ( nRcdDeleted_1634 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1PP1634( ) ;
                     load1PP1634( ) ;
                     beforeValidate1PP1634( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1PP1634( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1634 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1PP1634( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1PP1634( ) ;
                           closeExtendedTableCursors1PP1634( ) ;
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
                  if ( nRcdDeleted_1634 == 0 )
                  {
                     GXCCtl = "ALBRECCOD_" + sGXsfl_68_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc)) ;
         httpContext.changePostValue( edtDevCruUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni)) ;
         httpContext.changePostValue( edtDevCruPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_68_idx, GXutil.rtrim( Z45AlbRef)) ;
         httpContext.changePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_68_idx, GXutil.rtrim( Z3613AlbRefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z56AlbRUni_"+sGXsfl_68_idx, GXutil.rtrim( Z56AlbRUni)) ;
         httpContext.changePostValue( "T11684DevCruPzs_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T54AlbRPieUti_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11683DevCruUnd_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T60AlbRUniUti_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1634_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1634_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1634_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1634 != 0 )
         {
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREF_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREFDSC_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUUND_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNI_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUPZS_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1PP0( )
   {
   }

   public void e111PP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      devolucionalmacentejidocrudosindetalle_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      devolucionalmacentejidocrudosindetalle_impl.this.A396EmprCod = GXv_char2[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV27EmprNom = GXv_char3[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV28UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV28UsurCod", AV28UsurCod);
      GXt_int5 = (byte)(AV15FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      devolucionalmacentejidocrudosindetalle_impl.this.GXt_int5 = GXv_int6[0] ;
      AV15FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FirmaD), 4, 0));
      GXt_int5 = (byte)(AV16Ws) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WSDM", ""), GXv_int6) ;
      devolucionalmacentejidocrudosindetalle_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Ws", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Ws), 4, 0));
      GXt_int5 = (byte)(AV17Modhh) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      devolucionalmacentejidocrudosindetalle_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Modhh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Modhh), 4, 0));
      GXt_int5 = (byte)(AV18Reg000) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REG000", ""), GXv_int6) ;
      devolucionalmacentejidocrudosindetalle_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18Reg000 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Reg000", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Reg000), 4, 0));
      GXt_int7 = AV19copias ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVEND", ""), GXv_int8) ;
      devolucionalmacentejidocrudosindetalle_impl.this.GXt_int7 = GXv_int8[0] ;
      AV19copias = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19copias), 4, 0));
      AV19copias = (short)(((0==AV19copias) ? 1 : AV19copias)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19copias), 4, 0));
      AV20Copias2 = AV19copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Copias2), 4, 0));
      GXt_char1 = AV37Path ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CPRPEM", ""), GXv_char4) ;
      devolucionalmacentejidocrudosindetalle_impl.this.GXt_char1 = GXv_char4[0] ;
      AV37Path = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Path", AV37Path);
      GXt_char1 = AV26Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      devolucionalmacentejidocrudosindetalle_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char2[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char4, GXv_char3, GXv_char2) ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV7EmprCod = GXv_char4[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV27EmprNom = GXv_char3[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV28UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV28UsurCod", AV28UsurCod);
      GXv_SdtWWPContext9[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV9WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV41Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV42GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GXV1), 8, 0));
         while ( AV42GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV42GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV12Insert_CliCod = (int)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_CliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV13Insert_TrnCod = (short)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_TrnCod), 4, 0));
            }
            AV42GXV1 = (int)(AV42GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GXV1), 8, 0));
         }
      }
      edtDevCruEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruEst_Visible), 5, 0), true);
      edtDevCruHash_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruHash_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruHash_Visible), 5, 0), true);
      edtDevCruDesc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDesc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDesc_Visible), 5, 0), true);
      edtDevCruDtSy_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Visible), 5, 0), true);
      edtDevCruGros_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruGros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruGros_Visible), 5, 0), true);
      edtDevCruStt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruStt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruStt_Visible), 5, 0), true);
      edtDevCruEnvA_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruEnvA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruEnvA_Visible), 5, 0), true);
      edtDevCruAtId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAtId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAtId_Visible), 5, 0), true);
      edtDevCruAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAT_Visible), 5, 0), true);
      edtavClicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), true);
      Gridlevel_level1_titlescategories_Gridinternalname = subGridlevel_level1_Internalname ;
      ucGridlevel_level1_titlescategories.sendProperty(context, "", false, Gridlevel_level1_titlescategories_Internalname, "GridInternalName", Gridlevel_level1_titlescategories_Gridinternalname);
   }

   public void e121PP2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.devolucionalmacentejidocrudosindetalleww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A11669DevCruId ;
      GXv_date10[0] = A11670DevCruFec ;
      GXv_dtime11[0] = A11676DevCruDtSy ;
      GXv_int6[0] = (byte)(3) ;
      GXv_int12[0] = (byte)(1) ;
      GXv_char3[0] = AV33Cadena ;
      new app.almacensindetalle.obtengocadenaparahashdevolucionalmacen(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_date10, GXv_dtime11, GXv_int6, GXv_int12, GXv_char3) ;
      devolucionalmacentejidocrudosindetalle_impl.this.A396EmprCod = GXv_char4[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.A11669DevCruId = GXv_int8[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.A11670DevCruFec = GXv_date10[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.A11676DevCruDtSy = GXv_dtime11[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV33Cadena = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXv_char4[0] = AV36Hash ;
      GXv_objcol_SdtMessages_Message13[0] = AV38Messages ;
      GXv_boolean14[0] = AV39OK ;
      new app.hash_obtener(remoteHandle, context).execute( AV33Cadena, GXv_char4, GXv_objcol_SdtMessages_Message13, GXv_boolean14) ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV36Hash = GXv_char4[0] ;
      AV38Messages = GXv_objcol_SdtMessages_Message13[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV39OK = GXv_boolean14[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A11669DevCruId ;
      GXv_char3[0] = AV33Cadena ;
      GXv_char2[0] = AV36Hash ;
      new app.almacensindetalle.actualizohashdevolucionalmacen(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      devolucionalmacentejidocrudosindetalle_impl.this.A396EmprCod = GXv_char4[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.A11669DevCruId = GXv_int8[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV33Cadena = GXv_char3[0] ;
      devolucionalmacentejidocrudosindetalle_impl.this.AV36Hash = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      httpContext.popup(formatLink("app.almacensindetalle.horasalidadocumentoenvioat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A11676DevCruDtSy)),GXutil.URLEncode(GXutil.rtrim(AV33Cadena)),GXutil.URLEncode(GXutil.rtrim(AV36Hash))}, new String[] {"Emprcod","DevCruId","DevCruDtSys","Cadena","Hash"}) , new Object[] {"A396EmprCod","A11669DevCruId","A11676DevCruDtSy","AV33Cadena","AV36Hash"});
      httpContext.popup(formatLink("app.almacensindetalle.imprimirdevolucion", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0))}, new String[] {"Emprcod","DevCruId"}) , new Object[] {"A396EmprCod","A11669DevCruId"});
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm1PP1633( int GX_JID )
   {
      if ( ( GX_JID == 43 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11673DevCruSal = T01PP7_A11673DevCruSal[0] ;
            Z11670DevCruFec = T01PP7_A11670DevCruFec[0] ;
            Z11671DevCruEst = T01PP7_A11671DevCruEst[0] ;
            Z11672DevCruMat = T01PP7_A11672DevCruMat[0] ;
            Z11674DevCruHash = T01PP7_A11674DevCruHash[0] ;
            Z11675DevCruDesc = T01PP7_A11675DevCruDesc[0] ;
            Z11676DevCruDtSy = T01PP7_A11676DevCruDtSy[0] ;
            Z11677DevCruGros = T01PP7_A11677DevCruGros[0] ;
            Z11678DevCruStt = T01PP7_A11678DevCruStt[0] ;
            Z11679DevCruEnvA = T01PP7_A11679DevCruEnvA[0] ;
            Z11680DevCruAtId = T01PP7_A11680DevCruAtId[0] ;
            Z11681DevCruAT = T01PP7_A11681DevCruAT[0] ;
            Z11682DevCruObs = T01PP7_A11682DevCruObs[0] ;
            Z252CliCod = T01PP7_A252CliCod[0] ;
            Z840TrnCod = T01PP7_A840TrnCod[0] ;
         }
         else
         {
            Z11673DevCruSal = A11673DevCruSal ;
            Z11670DevCruFec = A11670DevCruFec ;
            Z11671DevCruEst = A11671DevCruEst ;
            Z11672DevCruMat = A11672DevCruMat ;
            Z11674DevCruHash = A11674DevCruHash ;
            Z11675DevCruDesc = A11675DevCruDesc ;
            Z11676DevCruDtSy = A11676DevCruDtSy ;
            Z11677DevCruGros = A11677DevCruGros ;
            Z11678DevCruStt = A11678DevCruStt ;
            Z11679DevCruEnvA = A11679DevCruEnvA ;
            Z11680DevCruAtId = A11680DevCruAtId ;
            Z11681DevCruAT = A11681DevCruAT ;
            Z11682DevCruObs = A11682DevCruObs ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
         }
      }
      if ( GX_JID == -43 )
      {
         Z11669DevCruId = A11669DevCruId ;
         Z11673DevCruSal = A11673DevCruSal ;
         Z11670DevCruFec = A11670DevCruFec ;
         Z11671DevCruEst = A11671DevCruEst ;
         Z11672DevCruMat = A11672DevCruMat ;
         Z11674DevCruHash = A11674DevCruHash ;
         Z11675DevCruDesc = A11675DevCruDesc ;
         Z11676DevCruDtSy = A11676DevCruDtSy ;
         Z11677DevCruGros = A11677DevCruGros ;
         Z11678DevCruStt = A11678DevCruStt ;
         Z11679DevCruEnvA = A11679DevCruEnvA ;
         Z11680DevCruAtId = A11680DevCruAtId ;
         Z11681DevCruAT = A11681DevCruAT ;
         Z11682DevCruObs = A11682DevCruObs ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDevCruDtSy_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Enabled), 5, 0), true);
      divTableinvisible_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTableinvisible_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableinvisible_Visible), 5, 0), true);
      AV41Pgmname = "DevolucionAlmacenTejidoCrudosindetalle" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDevCruDtSy_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01PP8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01PP8_A407EmprNom[0] ;
      n407EmprNom = T01PP8_n407EmprNom[0] ;
      pr_default.close(6);
      if ( ! (0==AV8DevCruId) )
      {
         A11669DevCruId = AV8DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      if ( ! (0==AV8DevCruId) )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            edtDevCruId_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
         }
         else
         {
            edtDevCruId_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV8DevCruId) )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_TrnCod) )
      {
         A840TrnCod = AV13Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         /* Using cursor T01PP11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         h840TrnCod = "" ;
         while ( (pr_default.getStatus(9) != 101) )
         {
            h840TrnCod = T01PP11_A13738TrnCNom[0] ;
            if (true) break;
         }
         pr_default.close(9);
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         A252CliCod = AV12Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         /* Using cursor T01PP12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         h252CliCod = "" ;
         while ( (pr_default.getStatus(10) != 101) )
         {
            h252CliCod = T01PP12_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(10);
         httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A11670DevCruFec)) && ( Gx_BScreen == 0 ) )
      {
         A11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11676DevCruDtSy) && ( Gx_BScreen == 0 ) )
      {
         A11676DevCruDtSy = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && (GXutil.strcmp("", A11680DevCruAtId)==0) && ( Gx_BScreen == 0 ) )
      {
         A11680DevCruAtId = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      }
      if ( isIns( )  && (0==A11679DevCruEnvA) && ( Gx_BScreen == 0 ) )
      {
         A11679DevCruEnvA = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A11681DevCruAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A11681DevCruAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11678DevCruStt)==0) && ( Gx_BScreen == 0 ) )
      {
         A11678DevCruStt = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01PP10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01PP10_A841TrnNom[0] ;
         n841TrnNom = T01PP10_n841TrnNom[0] ;
         pr_default.close(8);
         /* Using cursor T01PP9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PP9_A279CliNom[0] ;
         pr_default.close(7);
         if ( true /* After */ )
         {
            AV30CliCod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30CliCod), 6, 0));
         }
      }
   }

   public void load1PP1633( )
   {
      /* Using cursor T01PP13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11673DevCruSal = T01PP13_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A407EmprNom = T01PP13_A407EmprNom[0] ;
         n407EmprNom = T01PP13_n407EmprNom[0] ;
         A11670DevCruFec = T01PP13_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A279CliNom = T01PP13_A279CliNom[0] ;
         A841TrnNom = T01PP13_A841TrnNom[0] ;
         n841TrnNom = T01PP13_n841TrnNom[0] ;
         A11671DevCruEst = T01PP13_A11671DevCruEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
         A11672DevCruMat = T01PP13_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11674DevCruHash = T01PP13_A11674DevCruHash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
         A11675DevCruDesc = T01PP13_A11675DevCruDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
         A11676DevCruDtSy = T01PP13_A11676DevCruDtSy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = T01PP13_A11677DevCruGros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
         A11678DevCruStt = T01PP13_A11678DevCruStt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
         A11679DevCruEnvA = T01PP13_A11679DevCruEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = T01PP13_A11680DevCruAtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = T01PP13_A11681DevCruAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
         A11682DevCruObs = T01PP13_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         A252CliCod = T01PP13_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01PP13_A840TrnCod[0] ;
         n840TrnCod = T01PP13_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         zm1PP1633( -43) ;
      }
      pr_default.close(11);
      onLoadActions1PP1633( ) ;
   }

   public void onLoadActions1PP1633( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) && true /* After */ )
      {
         GXt_dtime15 = A11673DevCruSal ;
         GXv_dtime11[0] = GXt_dtime15 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime11) ;
         devolucionalmacentejidocrudosindetalle_impl.this.GXt_dtime15 = GXv_dtime11[0] ;
         A11673DevCruSal = GXt_dtime15 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* After */ )
      {
         AV30CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30CliCod), 6, 0));
      }
      /* Using cursor T01PP14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      h252CliCod = "" ;
      while ( (pr_default.getStatus(12) != 101) )
      {
         h252CliCod = T01PP14_A13735CliCNom[0] ;
         if (true) break;
      }
      pr_default.close(12);
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      /* Using cursor T01PP15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      h840TrnCod = "" ;
      while ( (pr_default.getStatus(13) != 101) )
      {
         h840TrnCod = T01PP15_A13738TrnCNom[0] ;
         if (true) break;
      }
      pr_default.close(13);
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void checkExtendedTable1PP1633( )
   {
      nIsDirty_1633 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_1633 = (short)(1) ;
         A252CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor T01PP16 */
         pr_default.execute(14, new Object[] {A13735CliCNom, A396EmprCod});
         A396EmprCod = T01PP16_A396EmprCod[0] ;
         A252CliCod = T01PP16_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T01PP16_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(14) == 101) ) )
         {
            pr_default.readNext(14);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(14);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_1633 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01PP17 */
         pr_default.execute(15, new Object[] {A13738TrnCNom, A396EmprCod});
         A396EmprCod = T01PP17_A396EmprCod[0] ;
         A840TrnCod = T01PP17_A840TrnCod[0] ;
         n840TrnCod = T01PP17_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01PP17_A840TrnCod[0] ;
         n840TrnCod = T01PP17_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      if ( ( AV15FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "DEVCRUATID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruAtId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A11678DevCruStt, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA", ""), 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) && true /* After */ )
      {
         nIsDirty_1633 = (short)(1) ;
         GXt_dtime15 = A11673DevCruSal ;
         GXv_dtime11[0] = GXt_dtime15 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime11) ;
         devolucionalmacentejidocrudosindetalle_impl.this.GXt_dtime15 = GXv_dtime11[0] ;
         A11673DevCruSal = GXt_dtime15 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* After */ )
      {
         AV30CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30CliCod), 6, 0));
      }
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_1633 = (short)(1) ;
         A252CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor T01PP18 */
         pr_default.execute(16, new Object[] {A13735CliCNom, A396EmprCod});
         A252CliCod = T01PP18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T01PP18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(16) == 101) ) )
         {
            pr_default.readNext(16);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(16);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_1633 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01PP19 */
         pr_default.execute(17, new Object[] {A13738TrnCNom, A396EmprCod});
         A840TrnCod = T01PP19_A840TrnCod[0] ;
         n840TrnCod = T01PP19_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01PP19_A840TrnCod[0] ;
         n840TrnCod = T01PP19_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(17) == 101) ) )
         {
            pr_default.readNext(17);
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(17);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01PP9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PP9_A279CliNom[0] ;
      pr_default.close(7);
      /* Using cursor T01PP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01PP10_A841TrnNom[0] ;
      n841TrnNom = T01PP10_n841TrnNom[0] ;
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1PP1633( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_45( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01PP20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PP20_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_46( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01PP21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01PP21_A841TrnNom[0] ;
      n841TrnNom = T01PP21_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1PP1633( )
   {
      /* Using cursor T01PP22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1633 = (short)(1) ;
      }
      else
      {
         RcdFound1633 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01PP7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PP1633( 43) ;
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01PP7_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A11673DevCruSal = T01PP7_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11670DevCruFec = T01PP7_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11671DevCruEst = T01PP7_A11671DevCruEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
         A11672DevCruMat = T01PP7_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11674DevCruHash = T01PP7_A11674DevCruHash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
         A11675DevCruDesc = T01PP7_A11675DevCruDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
         A11676DevCruDtSy = T01PP7_A11676DevCruDtSy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = T01PP7_A11677DevCruGros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
         A11678DevCruStt = T01PP7_A11678DevCruStt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
         A11679DevCruEnvA = T01PP7_A11679DevCruEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = T01PP7_A11680DevCruAtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = T01PP7_A11681DevCruAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
         A11682DevCruObs = T01PP7_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         A252CliCod = T01PP7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01PP7_A840TrnCod[0] ;
         n840TrnCod = T01PP7_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z11669DevCruId = A11669DevCruId ;
         sMode1633 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PP1633( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1633 = (short)(0) ;
            initializeNonKey1PP1633( ) ;
         }
         Gx_mode = sMode1633 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1633 = (short)(0) ;
         initializeNonKey1PP1633( ) ;
         sMode1633 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1633 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1PP1633( ) ;
      if ( RcdFound1633 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1633 = (short)(0) ;
      /* Using cursor T01PP23 */
      pr_default.execute(21, new Object[] {Integer.valueOf(A11669DevCruId), A396EmprCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( T01PP23_A11669DevCruId[0] < A11669DevCruId ) ) && ( GXutil.strcmp(T01PP23_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( T01PP23_A11669DevCruId[0] > A11669DevCruId ) ) && ( GXutil.strcmp(T01PP23_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11669DevCruId = T01PP23_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1633 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void move_previous( )
   {
      RcdFound1633 = (short)(0) ;
      /* Using cursor T01PP24 */
      pr_default.execute(22, new Object[] {Integer.valueOf(A11669DevCruId), A396EmprCod});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( T01PP24_A11669DevCruId[0] > A11669DevCruId ) ) && ( GXutil.strcmp(T01PP24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( T01PP24_A11669DevCruId[0] < A11669DevCruId ) ) && ( GXutil.strcmp(T01PP24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11669DevCruId = T01PP24_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1633 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PP1633( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PP1633( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1633 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
            {
               A11669DevCruId = Z11669DevCruId ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DEVCRUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1PP1633( ) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
            {
               /* Insert record */
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PP1633( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DEVCRUID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevCruId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDevCruId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1PP1633( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
      {
         A11669DevCruId = Z11669DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1PP1633( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h252CliCod)==0) )
         {
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A13735CliCNom = h252CliCod ;
            /* Using cursor T01PP25 */
            pr_default.execute(23, new Object[] {A13735CliCNom, A396EmprCod});
            A396EmprCod = T01PP25_A396EmprCod[0] ;
            A252CliCod = T01PP25_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A252CliCod = T01PP25_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            if ( ! ( (pr_default.getStatus(23) == 101) ) )
            {
               pr_default.readNext(23);
               if ( ! ( (pr_default.getStatus(23) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(23);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A13738TrnCNom = h840TrnCod ;
            /* Using cursor T01PP26 */
            pr_default.execute(24, new Object[] {A13738TrnCNom, A396EmprCod});
            A396EmprCod = T01PP26_A396EmprCod[0] ;
            A840TrnCod = T01PP26_A840TrnCod[0] ;
            n840TrnCod = T01PP26_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = T01PP26_A840TrnCod[0] ;
            n840TrnCod = T01PP26_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(24) == 101) ) )
            {
               pr_default.readNext(24);
               if ( ! ( (pr_default.getStatus(24) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTrnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(24);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01PP6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCRU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || !( GXutil.dateCompare(Z11673DevCruSal, T01PP6_A11673DevCruSal[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z11670DevCruFec), GXutil.resetTime(T01PP6_A11670DevCruFec[0])) ) || ( Z11671DevCruEst != T01PP6_A11671DevCruEst[0] ) || ( GXutil.strcmp(Z11672DevCruMat, T01PP6_A11672DevCruMat[0]) != 0 ) || ( GXutil.strcmp(Z11674DevCruHash, T01PP6_A11674DevCruHash[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11675DevCruDesc, T01PP6_A11675DevCruDesc[0]) != 0 ) || !( GXutil.dateCompare(Z11676DevCruDtSy, T01PP6_A11676DevCruDtSy[0]) ) || ( DecimalUtil.compareTo(Z11677DevCruGros, T01PP6_A11677DevCruGros[0]) != 0 ) || ( GXutil.strcmp(Z11678DevCruStt, T01PP6_A11678DevCruStt[0]) != 0 ) || ( Z11679DevCruEnvA != T01PP6_A11679DevCruEnvA[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11680DevCruAtId, T01PP6_A11680DevCruAtId[0]) != 0 ) || ( GXutil.strcmp(Z11681DevCruAT, T01PP6_A11681DevCruAT[0]) != 0 ) || ( GXutil.strcmp(Z11682DevCruObs, T01PP6_A11682DevCruObs[0]) != 0 ) || ( Z252CliCod != T01PP6_A252CliCod[0] ) || ( Z840TrnCod != T01PP6_A840TrnCod[0] ) )
         {
            if ( !( GXutil.dateCompare(Z11673DevCruSal, T01PP6_A11673DevCruSal[0]) ) )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruSal");
               GXutil.writeLogRaw("Old: ",Z11673DevCruSal);
               GXutil.writeLogRaw("Current: ",T01PP6_A11673DevCruSal[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11670DevCruFec), GXutil.resetTime(T01PP6_A11670DevCruFec[0])) ) )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruFec");
               GXutil.writeLogRaw("Old: ",Z11670DevCruFec);
               GXutil.writeLogRaw("Current: ",T01PP6_A11670DevCruFec[0]);
            }
            if ( Z11671DevCruEst != T01PP6_A11671DevCruEst[0] )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruEst");
               GXutil.writeLogRaw("Old: ",Z11671DevCruEst);
               GXutil.writeLogRaw("Current: ",T01PP6_A11671DevCruEst[0]);
            }
            if ( GXutil.strcmp(Z11672DevCruMat, T01PP6_A11672DevCruMat[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruMat");
               GXutil.writeLogRaw("Old: ",Z11672DevCruMat);
               GXutil.writeLogRaw("Current: ",T01PP6_A11672DevCruMat[0]);
            }
            if ( GXutil.strcmp(Z11674DevCruHash, T01PP6_A11674DevCruHash[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruHash");
               GXutil.writeLogRaw("Old: ",Z11674DevCruHash);
               GXutil.writeLogRaw("Current: ",T01PP6_A11674DevCruHash[0]);
            }
            if ( GXutil.strcmp(Z11675DevCruDesc, T01PP6_A11675DevCruDesc[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruDesc");
               GXutil.writeLogRaw("Old: ",Z11675DevCruDesc);
               GXutil.writeLogRaw("Current: ",T01PP6_A11675DevCruDesc[0]);
            }
            if ( !( GXutil.dateCompare(Z11676DevCruDtSy, T01PP6_A11676DevCruDtSy[0]) ) )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruDtSy");
               GXutil.writeLogRaw("Old: ",Z11676DevCruDtSy);
               GXutil.writeLogRaw("Current: ",T01PP6_A11676DevCruDtSy[0]);
            }
            if ( DecimalUtil.compareTo(Z11677DevCruGros, T01PP6_A11677DevCruGros[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruGros");
               GXutil.writeLogRaw("Old: ",Z11677DevCruGros);
               GXutil.writeLogRaw("Current: ",T01PP6_A11677DevCruGros[0]);
            }
            if ( GXutil.strcmp(Z11678DevCruStt, T01PP6_A11678DevCruStt[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruStt");
               GXutil.writeLogRaw("Old: ",Z11678DevCruStt);
               GXutil.writeLogRaw("Current: ",T01PP6_A11678DevCruStt[0]);
            }
            if ( Z11679DevCruEnvA != T01PP6_A11679DevCruEnvA[0] )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruEnvA");
               GXutil.writeLogRaw("Old: ",Z11679DevCruEnvA);
               GXutil.writeLogRaw("Current: ",T01PP6_A11679DevCruEnvA[0]);
            }
            if ( GXutil.strcmp(Z11680DevCruAtId, T01PP6_A11680DevCruAtId[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruAtId");
               GXutil.writeLogRaw("Old: ",Z11680DevCruAtId);
               GXutil.writeLogRaw("Current: ",T01PP6_A11680DevCruAtId[0]);
            }
            if ( GXutil.strcmp(Z11681DevCruAT, T01PP6_A11681DevCruAT[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruAT");
               GXutil.writeLogRaw("Old: ",Z11681DevCruAT);
               GXutil.writeLogRaw("Current: ",T01PP6_A11681DevCruAT[0]);
            }
            if ( GXutil.strcmp(Z11682DevCruObs, T01PP6_A11682DevCruObs[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruObs");
               GXutil.writeLogRaw("Old: ",Z11682DevCruObs);
               GXutil.writeLogRaw("Current: ",T01PP6_A11682DevCruObs[0]);
            }
            if ( Z252CliCod != T01PP6_A252CliCod[0] )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01PP6_A252CliCod[0]);
            }
            if ( Z840TrnCod != T01PP6_A840TrnCod[0] )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01PP6_A840TrnCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCRU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PP1633( )
   {
      beforeValidate1PP1633( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PP1633( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PP1633( 0) ;
         checkOptimisticConcurrency1PP1633( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PP1633( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PP1633( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PP27 */
                  pr_default.execute(25, new Object[] {Integer.valueOf(A11669DevCruId), A11673DevCruSal, A11670DevCruFec, Byte.valueOf(A11671DevCruEst), A11672DevCruMat, A11674DevCruHash, A11675DevCruDesc, A11676DevCruDtSy, A11677DevCruGros, A11678DevCruStt, Byte.valueOf(A11679DevCruEnvA), A11680DevCruAtId, A11681DevCruAT, A11682DevCruObs, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
                  if ( (pr_default.getStatus(25) == 1) )
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
                        processLevel1PP1633( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1PP0( ) ;
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
            load1PP1633( ) ;
         }
         endLevel1PP1633( ) ;
      }
      closeExtendedTableCursors1PP1633( ) ;
   }

   public void update1PP1633( )
   {
      beforeValidate1PP1633( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PP1633( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PP1633( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PP1633( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PP1633( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PP28 */
                  pr_default.execute(26, new Object[] {A11673DevCruSal, A11670DevCruFec, Byte.valueOf(A11671DevCruEst), A11672DevCruMat, A11674DevCruHash, A11675DevCruDesc, A11676DevCruDtSy, A11677DevCruGros, A11678DevCruStt, Byte.valueOf(A11679DevCruEnvA), A11680DevCruAtId, A11681DevCruAT, A11682DevCruObs, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), A396EmprCod, Integer.valueOf(A11669DevCruId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
                  if ( (pr_default.getStatus(26) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCRU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PP1633( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1PP1633( ) ;
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
         endLevel1PP1633( ) ;
      }
      closeExtendedTableCursors1PP1633( ) ;
   }

   public void deferredUpdate1PP1633( )
   {
   }

   public void delete( )
   {
      beforeValidate1PP1633( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PP1633( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PP1633( ) ;
         afterConfirm1PP1633( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PP1633( ) ;
            if ( AnyError == 0 )
            {
               scanStart1PP1634( ) ;
               while ( RcdFound1634 != 0 )
               {
                  getByPrimaryKey1PP1634( ) ;
                  delete1PP1634( ) ;
                  scanNext1PP1634( ) ;
               }
               scanEnd1PP1634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PP29 */
                  pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
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
      sMode1633 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PP1633( ) ;
      Gx_mode = sMode1633 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PP1633( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( AV15FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "DEVCRUATID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevCruAtId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* After */ )
         {
            AV30CliCod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30CliCod), 6, 0));
         }
         /* Using cursor T01PP30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PP30_A279CliNom[0] ;
         pr_default.close(28);
         /* Using cursor T01PP31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01PP31_A841TrnNom[0] ;
         n841TrnNom = T01PP31_n841TrnNom[0] ;
         pr_default.close(29);
      }
   }

   public void processNestedLevel1PP1634( )
   {
      nGXsfl_68_idx = 0 ;
      while ( nGXsfl_68_idx < nRC_GXsfl_68 )
      {
         readRow1PP1634( ) ;
         if ( ( nRcdExists_1634 != 0 ) || ( nIsMod_1634 != 0 ) )
         {
            standaloneNotModal1PP1634( ) ;
            getKey1PP1634( ) ;
            if ( ( nRcdExists_1634 == 0 ) && ( nRcdDeleted_1634 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1PP1634( ) ;
            }
            else
            {
               if ( RcdFound1634 != 0 )
               {
                  if ( ( nRcdDeleted_1634 != 0 ) && ( nRcdExists_1634 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1PP1634( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1634 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1PP1634( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1634 == 0 )
                  {
                     GXCCtl = "ALBRECCOD_" + sGXsfl_68_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc)) ;
         httpContext.changePostValue( edtDevCruUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni)) ;
         httpContext.changePostValue( edtDevCruPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_68_idx, GXutil.rtrim( Z45AlbRef)) ;
         httpContext.changePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_68_idx, GXutil.rtrim( Z3613AlbRefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z56AlbRUni_"+sGXsfl_68_idx, GXutil.rtrim( Z56AlbRUni)) ;
         httpContext.changePostValue( "T11684DevCruPzs_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T54AlbRPieUti_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11683DevCruUnd_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T60AlbRUniUti_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1634_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1634_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1634_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1634 != 0 )
         {
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREF_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREFDSC_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUUND_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNI_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUPZS_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1PP1634( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1634 = (short)(0) ;
      nIsMod_1634 = (short)(0) ;
      nRcdDeleted_1634 = (short)(0) ;
   }

   public void processLevel1PP1633( )
   {
      /* Save parent mode. */
      sMode1633 = Gx_mode ;
      processNestedLevel1PP1634( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1633 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1PP1633( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PP1633( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "devolucionalmacentejidocrudosindetalle");
         if ( AnyError == 0 )
         {
            confirmValues1PP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "devolucionalmacentejidocrudosindetalle");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PP1633( )
   {
      /* Scan By routine */
      /* Using cursor T01PP32 */
      pr_default.execute(30, new Object[] {A396EmprCod});
      RcdFound1633 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01PP32_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PP1633( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1633 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01PP32_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
   }

   public void scanEnd1PP1633( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1PP1633( )
   {
      /* After Confirm Rules */
      if ( (0==A11669DevCruId) && true /* After */ )
      {
         GXv_int8[0] = A11669DevCruId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int8) ;
         devolucionalmacentejidocrudosindetalle_impl.this.A11669DevCruId = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
   }

   public void beforeInsert1PP1633( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PP1633( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PP1633( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PP1633( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PP1633( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PP1633( )
   {
      edtDevCruId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      edtDevCruFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFec_Enabled), 5, 0), true);
      edtDevCruSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruSal_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtDevCruMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruMat_Enabled), 5, 0), true);
      edtDevCruObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruObs_Enabled), 5, 0), true);
      edtDevCruEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruEst_Enabled), 5, 0), true);
      edtDevCruHash_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruHash_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruHash_Enabled), 5, 0), true);
      edtDevCruDesc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDesc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDesc_Enabled), 5, 0), true);
      edtDevCruDtSy_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Enabled), 5, 0), true);
      edtDevCruGros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruGros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruGros_Enabled), 5, 0), true);
      edtDevCruStt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruStt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruStt_Enabled), 5, 0), true);
      edtDevCruEnvA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruEnvA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruEnvA_Enabled), 5, 0), true);
      edtDevCruAtId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAtId_Enabled), 5, 0), true);
      edtDevCruAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAT_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
   }

   public void zm1PP1634( int GX_JID )
   {
      if ( ( GX_JID == 47 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11683DevCruUnd = T01PP3_A11683DevCruUnd[0] ;
            Z11684DevCruPzs = T01PP3_A11684DevCruPzs[0] ;
         }
         else
         {
            Z11683DevCruUnd = A11683DevCruUnd ;
            Z11684DevCruPzs = A11684DevCruPzs ;
         }
      }
      if ( ( GX_JID == 48 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = T01PP5_A47AlbREst[0] ;
         Z45AlbRef = T01PP5_A45AlbRef[0] ;
         Z3613AlbRefDsc = T01PP5_A3613AlbRefDsc[0] ;
         Z58AlbRUniEnt = T01PP5_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01PP5_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01PP5_A56AlbRUni[0] ;
      }
      if ( GX_JID == -47 )
      {
         Z11669DevCruId = A11669DevCruId ;
         Z11683DevCruUnd = A11683DevCruUnd ;
         Z11684DevCruPzs = A11684DevCruPzs ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z45AlbRef = A45AlbRef ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z56AlbRUni = A56AlbRUni ;
      }
   }

   public void standaloneNotModal1PP1634( )
   {
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
   }

   public void standaloneModal1PP1634( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      }
   }

   public void load1PP1634( )
   {
      /* Using cursor T01PP33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A60AlbRUniUti = T01PP33_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01PP33_A54AlbRPieUti[0] ;
         A47AlbREst = T01PP33_A47AlbREst[0] ;
         A45AlbRef = T01PP33_A45AlbRef[0] ;
         A3613AlbRefDsc = T01PP33_A3613AlbRefDsc[0] ;
         A11683DevCruUnd = T01PP33_A11683DevCruUnd[0] ;
         A11684DevCruPzs = T01PP33_A11684DevCruPzs[0] ;
         A58AlbRUniEnt = T01PP33_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01PP33_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01PP33_A56AlbRUni[0] ;
         zm1PP1634( -47) ;
      }
      pr_default.close(31);
      onLoadActions1PP1634( ) ;
   }

   public void onLoadActions1PP1634( )
   {
      if ( isDlt( )  )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O11683DevCruUnd) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
         }
      }
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O11684DevCruPzs) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
         }
      }
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
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( ( A51AlbRPieDis <= 0 ) && ( A57AlbRUniDis.doubleValue() <= 0 ) )
      {
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis > 0 ) && ( A57AlbRUniDis.doubleValue() > 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
      }
   }

   public void checkExtendedTable1PP1634( )
   {
      nIsDirty_1634 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1PP1634( ) ;
      /* Using cursor T01PP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01PP5_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01PP5_A54AlbRPieUti[0] ;
      A47AlbREst = T01PP5_A47AlbREst[0] ;
      A45AlbRef = T01PP5_A45AlbRef[0] ;
      A3613AlbRefDsc = T01PP5_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01PP5_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01PP5_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01PP5_A56AlbRUni[0] ;
      nIsDirty_1634 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      nIsDirty_1634 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(3);
      if ( isDlt( )  )
      {
         nIsDirty_1634 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(O11683DevCruUnd) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_1634 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
         }
      }
      if ( isDlt( )  )
      {
         nIsDirty_1634 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-O11684DevCruPzs) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_1634 = (short)(1) ;
            A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_1634 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_1634 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            nIsDirty_1634 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      nIsDirty_1634 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( ( A51AlbRPieDis <= 0 ) && ( A57AlbRUniDis.doubleValue() <= 0 ) )
      {
         nIsDirty_1634 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis > 0 ) && ( A57AlbRUniDis.doubleValue() > 0 ) )
         {
            nIsDirty_1634 = (short)(1) ;
            A47AlbREst = (byte)(0) ;
         }
      }
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_int16[0] = A252CliCod ;
         GXv_int12[0] = (byte)(AV29FlagCli) ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int16, GXv_int12) ;
         devolucionalmacentejidocrudosindetalle_impl.this.A396EmprCod = GXv_char4[0] ;
         devolucionalmacentejidocrudosindetalle_impl.this.A44AlbRecCod = GXv_int8[0] ;
         devolucionalmacentejidocrudosindetalle_impl.this.A252CliCod = GXv_int16[0] ;
         devolucionalmacentejidocrudosindetalle_impl.this.AV29FlagCli = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV29FlagCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29FlagCli), 4, 0));
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         GXCCtl = "DEVCRUUND_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A11683DevCruUnd)==0) && true /* After */ )
      {
         GXCCtl = "DEVCRUUND_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Unidades a devolver ¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1PP1634( )
   {
      pr_default.close(2);
   }

   public void enableDisable1PP1634( )
   {
   }

   public void gxload_48( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01PP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01PP5_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01PP5_A54AlbRPieUti[0] ;
      A47AlbREst = T01PP5_A47AlbREst[0] ;
      A45AlbRef = T01PP5_A45AlbRef[0] ;
      A3613AlbRefDsc = T01PP5_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01PP5_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01PP5_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01PP5_A56AlbRUni[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3613AlbRefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void getKey1PP1634( )
   {
      /* Using cursor T01PP34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1634 = (short)(1) ;
      }
      else
      {
         RcdFound1634 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKey1PP1634( )
   {
      /* Using cursor T01PP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01PP3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PP1634( 47) ;
         RcdFound1634 = (short)(1) ;
         initializeNonKey1PP1634( ) ;
         A11683DevCruUnd = T01PP3_A11683DevCruUnd[0] ;
         A11684DevCruPzs = T01PP3_A11684DevCruPzs[0] ;
         A44AlbRecCod = T01PP3_A44AlbRecCod[0] ;
         O11684DevCruPzs = A11684DevCruPzs ;
         O11683DevCruUnd = A11683DevCruUnd ;
         Z396EmprCod = A396EmprCod ;
         Z11669DevCruId = A11669DevCruId ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PP1634( ) ;
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1634 = (short)(0) ;
         initializeNonKey1PP1634( ) ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1PP1634( ) ;
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1PP1634( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1PP1634( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11683DevCruUnd, T01PP2_A11683DevCruUnd[0]) != 0 ) || ( Z11684DevCruPzs != T01PP2_A11684DevCruPzs[0] ) )
         {
            if ( DecimalUtil.compareTo(Z11683DevCruUnd, T01PP2_A11683DevCruUnd[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruUnd");
               GXutil.writeLogRaw("Old: ",Z11683DevCruUnd);
               GXutil.writeLogRaw("Current: ",T01PP2_A11683DevCruUnd[0]);
            }
            if ( Z11684DevCruPzs != T01PP2_A11684DevCruPzs[0] )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"DevCruPzs");
               GXutil.writeLogRaw("Old: ",Z11684DevCruPzs);
               GXutil.writeLogRaw("Current: ",T01PP2_A11684DevCruPzs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCR1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01PP35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(33) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != T01PP35_A47AlbREst[0] ) || ( GXutil.strcmp(Z45AlbRef, T01PP35_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z3613AlbRefDsc, T01PP35_A3613AlbRefDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01PP35_A58AlbRUniEnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01PP35_A52AlbRPieEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z56AlbRUni, T01PP35_A56AlbRUni[0]) != 0 ) )
         {
            if ( Z47AlbREst != T01PP35_A47AlbREst[0] )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01PP35_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01PP35_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01PP35_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T01PP35_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01PP35_A3613AlbRefDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01PP35_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01PP35_A58AlbRUniEnt[0]);
            }
            if ( Z52AlbRPieEnt != T01PP35_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01PP35_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01PP35_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("devolucionalmacentejidocrudosindetalle:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01PP35_A56AlbRUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PP1634( )
   {
      beforeValidate1PP1634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PP1634( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PP1634( 0) ;
         checkOptimisticConcurrency1PP1634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PP1634( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PP1634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PP36 */
                  pr_default.execute(34, new Object[] {Integer.valueOf(A11669DevCruId), A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                  if ( (pr_default.getStatus(34) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11PP1634( ) ;
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
            load1PP1634( ) ;
         }
         endLevel1PP1634( ) ;
      }
      closeExtendedTableCursors1PP1634( ) ;
   }

   public void update1PP1634( )
   {
      beforeValidate1PP1634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PP1634( ) ;
      }
      if ( ( nIsMod_1634 != 0 ) || ( nIsDirty_1634 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1PP1634( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1PP1634( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1PP1634( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01PP37 */
                     pr_default.execute(35, new Object[] {A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                     if ( (pr_default.getStatus(35) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1PP1634( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN11PP1634( ) ;
                           getByPrimaryKey1PP1634( ) ;
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
            endLevel1PP1634( ) ;
         }
      }
      closeExtendedTableCursors1PP1634( ) ;
   }

   public void deferredUpdate1PP1634( )
   {
   }

   public void delete1PP1634( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PP1634( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PP1634( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PP1634( ) ;
         afterConfirm1PP1634( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PP1634( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PP38 */
               pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
               if ( AnyError == 0 )
               {
                  updateTablesN11PP1634( ) ;
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
      sMode1634 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PP1634( ) ;
      Gx_mode = sMode1634 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PP1634( )
   {
      standaloneModal1PP1634( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PP39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Z47AlbREst = T01PP39_A47AlbREst[0] ;
         Z45AlbRef = T01PP39_A45AlbRef[0] ;
         Z3613AlbRefDsc = T01PP39_A3613AlbRefDsc[0] ;
         Z58AlbRUniEnt = T01PP39_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01PP39_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01PP39_A56AlbRUni[0] ;
         A60AlbRUniUti = T01PP39_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01PP39_A54AlbRPieUti[0] ;
         A47AlbREst = T01PP39_A47AlbREst[0] ;
         A45AlbRef = T01PP39_A45AlbRef[0] ;
         A3613AlbRefDsc = T01PP39_A3613AlbRefDsc[0] ;
         A58AlbRUniEnt = T01PP39_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01PP39_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01PP39_A56AlbRUni[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         O60AlbRUniUti = A60AlbRUniUti ;
         pr_default.close(37);
         if ( isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O11683DevCruUnd) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
            }
         }
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
         if ( isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-O11684DevCruPzs) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         if ( ( A51AlbRPieDis <= 0 ) && ( A57AlbRUniDis.doubleValue() <= 0 ) )
         {
            A47AlbREst = (byte)(1) ;
         }
         else
         {
            if ( ( A51AlbRPieDis > 0 ) && ( A57AlbRUniDis.doubleValue() > 0 ) )
            {
               A47AlbREst = (byte)(0) ;
            }
         }
      }
   }

   public void updateTablesN11PP1634( )
   {
      /* Using cursor T01PP40 */
      pr_default.execute(38, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1PP1634( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(33);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PP1634( )
   {
      /* Scan By routine */
      /* Using cursor T01PP41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A44AlbRecCod = T01PP41_A44AlbRecCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PP1634( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A44AlbRecCod = T01PP41_A44AlbRecCod[0] ;
      }
   }

   public void scanEnd1PP1634( )
   {
      pr_default.close(39);
   }

   public void afterConfirm1PP1634( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PP1634( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PP1634( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PP1634( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PP1634( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PP1634( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PP1634( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtDevCruUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruUnd_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
      edtDevCruPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruPzs_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
   }

   public void send_integrity_lvl_hashes1PP1634( )
   {
   }

   public void send_integrity_lvl_hashes1PP1633( )
   {
   }

   public void subsflControlProps_681634( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_68_idx ;
      imgprompt_44_Internalname = "PROMPT_44_"+sGXsfl_68_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_68_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_68_idx ;
      edtDevCruUnd_Internalname = "DEVCRUUND_"+sGXsfl_68_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_68_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_68_idx );
      edtDevCruPzs_Internalname = "DEVCRUPZS_"+sGXsfl_68_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_68_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_68_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_68_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_68_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_68_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_68_idx );
   }

   public void subsflControlProps_fel_681634( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_68_fel_idx ;
      imgprompt_44_Internalname = "PROMPT_44_"+sGXsfl_68_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_68_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_68_fel_idx ;
      edtDevCruUnd_Internalname = "DEVCRUUND_"+sGXsfl_68_fel_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_68_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_68_fel_idx );
      edtDevCruPzs_Internalname = "DEVCRUPZS_"+sGXsfl_68_fel_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_68_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_68_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_68_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_68_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_68_fel_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_68_fel_idx );
   }

   public void addRow1PP1634( )
   {
      nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_681634( ) ;
      sendRow1PP1634( ) ;
   }

   public void sendRow1PP1634( )
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
         if ( ((int)((nGXsfl_68_idx) % (2))) == 0 )
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
      imgprompt_44_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.consultaalmacentejido"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"ALBRECCOD_"+sGXsfl_68_idx+"'), id:'"+"ALBRECCOD_"+sGXsfl_68_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vCLICOD"+"'), id:'"+"vCLICOD"+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_1634_"+sGXsfl_68_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1634_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_44_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_44_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_level1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_44_Internalname,sImgUrl,imgprompt_44_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_44_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRefDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1634_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevCruUnd_Enabled!=0) ? localUtil.format( A11683DevCruUnd, "ZZZZZ9.99") : localUtil.format( A11683DevCruUnd, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDevCruUnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniDis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "ALBRUNI_" + sGXsfl_68_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbAlbRUni.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_68_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1634_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruPzs_Internalname,GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevCruPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDevCruPzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieDis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRUniUti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRUniEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRPieUti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRPieEnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "ALBREST_" + sGXsfl_68_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(cmbAlbREst.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_68_Refreshing);
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1PP1634( ) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11683DevCruUnd_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11684DevCruPzs_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z47AlbREst_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z45AlbRef_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z45AlbRef));
      GXCCtl = "Z3613AlbRefDsc_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3613AlbRefDsc));
      GXCCtl = "Z58AlbRUniEnt_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z52AlbRPieEnt_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z56AlbRUni_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z56AlbRUni));
      GXCCtl = "O11684DevCruPzs_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O54AlbRPieUti_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O11683DevCruUnd_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O60AlbRUniUti_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1634_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1634_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1634_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_68_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "EMPRCOD_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vEMPRCOD_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vDEVCRUID_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREF_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREFDSC_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUUND_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIDIS_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNI_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUPZS_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEDIS_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_44_"+sGXsfl_68_idx+"Link", GXutil.rtrim( imgprompt_44_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1PP1634( )
   {
      nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_681634( ) ;
      edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREF_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREFDSC_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevCruUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUUND_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbRUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNI_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtDevCruPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUPZS_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      imgprompt_44_Link = httpContext.cgiGet( "PROMPT_44_"+sGXsfl_68_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         wbErr = true ;
         A44AlbRecCod = 0 ;
      }
      else
      {
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
      A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DEVCRUUND_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
         wbErr = true ;
         A11683DevCruUnd = DecimalUtil.ZERO ;
      }
      else
      {
         A11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)) ;
      }
      A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
      cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
      cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
      A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "DEVCRUPZS_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruPzs_Internalname ;
         wbErr = true ;
         A11684DevCruPzs = 0 ;
      }
      else
      {
         A11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
      A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
      A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbREst.setName( cmbAlbREst.getInternalname() );
      cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
      A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_68_idx ;
      Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11683DevCruUnd_" + sGXsfl_68_idx ;
      Z11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11684DevCruPzs_" + sGXsfl_68_idx ;
      Z11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z47AlbREst_" + sGXsfl_68_idx ;
      Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z45AlbRef_" + sGXsfl_68_idx ;
      Z45AlbRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3613AlbRefDsc_" + sGXsfl_68_idx ;
      Z3613AlbRefDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z58AlbRUniEnt_" + sGXsfl_68_idx ;
      Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z52AlbRPieEnt_" + sGXsfl_68_idx ;
      Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z56AlbRUni_" + sGXsfl_68_idx ;
      Z56AlbRUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O11684DevCruPzs_" + sGXsfl_68_idx ;
      O11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O54AlbRPieUti_" + sGXsfl_68_idx ;
      O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O11683DevCruUnd_" + sGXsfl_68_idx ;
      O11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O60AlbRUniUti_" + sGXsfl_68_idx ;
      O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1634_" + sGXsfl_68_idx ;
      nRcdDeleted_1634 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1634_" + sGXsfl_68_idx ;
      nRcdExists_1634 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1634_" + sGXsfl_68_idx ;
      nIsMod_1634 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defcmbAlbREst_Enabled = cmbAlbREst.getEnabled() ;
      defedtAlbRPieEnt_Enabled = edtAlbRPieEnt_Enabled ;
      defedtAlbRPieUti_Enabled = edtAlbRPieUti_Enabled ;
      defedtAlbRUniEnt_Enabled = edtAlbRUniEnt_Enabled ;
      defedtAlbRUniUti_Enabled = edtAlbRUniUti_Enabled ;
      defedtAlbRecCod_Enabled = edtAlbRecCod_Enabled ;
   }

   public void confirmValues1PP0( )
   {
      nGXsfl_68_idx = 0 ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_681634( ) ;
      while ( nGXsfl_68_idx < nRC_GXsfl_68 )
      {
         nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_681634( ) ;
         httpContext.changePostValue( "Z44AlbRecCod_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z44AlbRecCod_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z11683DevCruUnd_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z11684DevCruPzs_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z47AlbREst_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z47AlbREst_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z45AlbRef_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z45AlbRef_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z3613AlbRefDsc_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z58AlbRUniEnt_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z52AlbRPieEnt_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z56AlbRUni_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z56AlbRUni_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z56AlbRUni_"+sGXsfl_68_idx) ;
      }
      httpContext.changePostValue( "O11684DevCruPzs", httpContext.cgiGet( "T11684DevCruPzs")) ;
      httpContext.deletePostValue( "T11684DevCruPzs") ;
      httpContext.changePostValue( "O54AlbRPieUti", httpContext.cgiGet( "T54AlbRPieUti")) ;
      httpContext.deletePostValue( "T54AlbRPieUti") ;
      httpContext.changePostValue( "O11683DevCruUnd", httpContext.cgiGet( "T11683DevCruUnd")) ;
      httpContext.deletePostValue( "T11683DevCruUnd") ;
      httpContext.changePostValue( "O60AlbRUniUti", httpContext.cgiGet( "T60AlbRUniUti")) ;
      httpContext.deletePostValue( "T60AlbRUniUti") ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.devolucionalmacentejidocrudosindetalle", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DevCruId,8,0))}, new String[] {"Gx_mode","EmprCod","DevCruId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionAlmacenTejidoCrudosindetalle");
      forbiddenHiddens.add("DevCruDtSy", localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("devolucionalmacentejidocrudosindetalle:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11669DevCruId", GXutil.ltrim( localUtil.ntoc( Z11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11673DevCruSal", localUtil.ttoc( Z11673DevCruSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11670DevCruFec", localUtil.dtoc( Z11670DevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11671DevCruEst", GXutil.ltrim( localUtil.ntoc( Z11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11672DevCruMat", GXutil.rtrim( Z11672DevCruMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11674DevCruHash", GXutil.rtrim( Z11674DevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11675DevCruDesc", GXutil.rtrim( Z11675DevCruDesc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11676DevCruDtSy", localUtil.ttoc( Z11676DevCruDtSy, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11677DevCruGros", GXutil.ltrim( localUtil.ntoc( Z11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11678DevCruStt", GXutil.rtrim( Z11678DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11679DevCruEnvA", GXutil.ltrim( localUtil.ntoc( Z11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11680DevCruAtId", GXutil.rtrim( Z11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11681DevCruAT", GXutil.rtrim( Z11681DevCruAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11682DevCruObs", Z11682DevCruObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_68", GXutil.ltrim( localUtil.ntoc( nGXsfl_68_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV10TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV8DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV12Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCCLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV13Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV15FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCLI", GXutil.ltrim( localUtil.ntoc( AV29FlagCli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall", GXutil.rtrim( Gridlevel_level1_titlescategories_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled", GXutil.booltostr( Gridlevel_level1_titlescategories_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridtitlescategories));
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
      return formatLink("app.devolucionalmacentejidocrudosindetalle", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DevCruId,8,0))}, new String[] {"Gx_mode","EmprCod","DevCruId"})  ;
   }

   public String getPgmname( )
   {
      return "DevolucionAlmacenTejidoCrudosindetalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion Almacen Tejido Crudo (sin detalle)", "") ;
   }

   public void initializeNonKey1PP1633( )
   {
      h252CliCod = "" ;
      h840TrnCod = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV30CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A11671DevCruEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
      A11672DevCruMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
      A11674DevCruHash = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
      A11675DevCruDesc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
      A11677DevCruGros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
      A11682DevCruObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      A11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11676DevCruDtSy = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11678DevCruStt = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      A11679DevCruEnvA = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11680DevCruAtId = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11681DevCruAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11671DevCruEst = (byte)(0) ;
      Z11672DevCruMat = "" ;
      Z11674DevCruHash = "" ;
      Z11675DevCruDesc = "" ;
      Z11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      Z11677DevCruGros = DecimalUtil.ZERO ;
      Z11678DevCruStt = "" ;
      Z11679DevCruEnvA = (byte)(0) ;
      Z11680DevCruAtId = "" ;
      Z11681DevCruAT = "" ;
      Z11682DevCruObs = "" ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
   }

   public void initAll1PP1633( )
   {
      A11669DevCruId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      initializeNonKey1PP1633( ) ;
   }

   public void standaloneModalInsert( )
   {
      A11670DevCruFec = i11670DevCruFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11676DevCruDtSy = i11676DevCruDtSy ;
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11680DevCruAtId = i11680DevCruAtId ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11679DevCruEnvA = i11679DevCruEnvA ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11681DevCruAT = i11681DevCruAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      A11678DevCruStt = i11678DevCruStt ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
   }

   public void initializeNonKey1PP1634( )
   {
      AV29FlagCli = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FlagCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29FlagCli), 4, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A54AlbRPieUti = 0 ;
      A47AlbREst = (byte)(0) ;
      A51AlbRPieDis = 0 ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A11684DevCruPzs = 0 ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A52AlbRPieEnt = 0 ;
      A56AlbRUni = "" ;
      O11684DevCruPzs = A11684DevCruPzs ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O11683DevCruUnd = A11683DevCruUnd ;
      O60AlbRUniUti = A60AlbRUniUti ;
      Z11683DevCruUnd = DecimalUtil.ZERO ;
      Z11684DevCruPzs = 0 ;
      Z47AlbREst = (byte)(0) ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z56AlbRUni = "" ;
   }

   public void initAll1PP1634( )
   {
      A44AlbRecCod = 0 ;
      initializeNonKey1PP1634( ) ;
   }

   public void standaloneModalInsert1PP1634( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211682259", true, true);
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
      httpContext.AddJavascriptSource("devolucionalmacentejidocrudosindetalle.js", "?20268211682259", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1634( )
   {
      cmbAlbREst.setEnabled( defcmbAlbREst_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRPieEnt_Enabled = defedtAlbRPieEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRPieUti_Enabled = defedtAlbRPieUti_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRUniEnt_Enabled = defedtAlbRUniEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRUniUti_Enabled = defedtAlbRUniUti_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAlbRecCod_Enabled = defedtAlbRecCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
   }

   public void startgridcontrol68( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtDevCruId_Internalname = "DEVCRUID" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtDevCruFec_Internalname = "DEVCRUFEC" ;
      edtDevCruSal_Internalname = "DEVCRUSAL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtCliCod_Internalname = "CLICOD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtDevCruMat_Internalname = "DEVCRUMAT" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtDevCruObs_Internalname = "DEVCRUOBS" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtDevCruUnd_Internalname = "DEVCRUUND" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtDevCruPzs_Internalname = "DEVCRUPZS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavError_confirmacion_Internalname = "vERROR_CONFIRMACION" ;
      edtavDevcrusal_Internalname = "vDEVCRUSAL" ;
      divTableinvisible_Internalname = "TABLEINVISIBLE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtDevCruEst_Internalname = "DEVCRUEST" ;
      edtDevCruHash_Internalname = "DEVCRUHASH" ;
      edtDevCruDesc_Internalname = "DEVCRUDESC" ;
      edtDevCruDtSy_Internalname = "DEVCRUDTSY" ;
      edtDevCruGros_Internalname = "DEVCRUGROS" ;
      edtDevCruStt_Internalname = "DEVCRUSTT" ;
      edtDevCruEnvA_Internalname = "DEVCRUENVA" ;
      edtDevCruAtId_Internalname = "DEVCRUATID" ;
      edtDevCruAT_Internalname = "DEVCRUAT" ;
      edtavClicod_Internalname = "vCLICOD" ;
      Gridlevel_level1_titlescategories_Internalname = "GRIDLEVEL_LEVEL1_TITLESCATEGORIES" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_44_Internalname = "PROMPT_44" ;
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
      Form.setCaption( httpContext.getMessage( "Devolucion Almacen Tejido Crudo (sin detalle)", "") );
      cmbAlbREst.setJsonclick( "" );
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtDevCruPzs_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRUniDis_Jsonclick = "" ;
      edtDevCruUnd_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      imgprompt_44_Visible = 1 ;
      imgprompt_44_Link = "" ;
      imgprompt_44_Visible = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      cmbAlbREst.setEnabled( 0 );
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRPieDis_Enabled = 0 ;
      edtDevCruPzs_Enabled = 1 ;
      cmbAlbRUni.setEnabled( 0 );
      edtAlbRUniDis_Enabled = 0 ;
      edtDevCruUnd_Enabled = 1 ;
      edtAlbRefDsc_Enabled = 0 ;
      edtAlbRef_Enabled = 0 ;
      edtAlbRecCod_Enabled = 1 ;
      Gridlevel_level1_titlescategories_Gridtitlescategories = ";;Referencia;Referencia;Unidades;Unidades;Unidades;Piezas;Piezas;;;;;" ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavClicod_Visible = 1 ;
      edtDevCruAT_Jsonclick = "" ;
      edtDevCruAT_Enabled = 1 ;
      edtDevCruAT_Visible = 1 ;
      edtDevCruAtId_Jsonclick = "" ;
      edtDevCruAtId_Enabled = 1 ;
      edtDevCruAtId_Visible = 1 ;
      edtDevCruEnvA_Jsonclick = "" ;
      edtDevCruEnvA_Enabled = 1 ;
      edtDevCruEnvA_Visible = 1 ;
      edtDevCruStt_Jsonclick = "" ;
      edtDevCruStt_Enabled = 1 ;
      edtDevCruStt_Visible = 1 ;
      edtDevCruGros_Jsonclick = "" ;
      edtDevCruGros_Enabled = 1 ;
      edtDevCruGros_Visible = 1 ;
      edtDevCruDtSy_Jsonclick = "" ;
      edtDevCruDtSy_Enabled = 0 ;
      edtDevCruDtSy_Visible = 1 ;
      edtDevCruDesc_Enabled = 1 ;
      edtDevCruDesc_Visible = 1 ;
      edtDevCruHash_Enabled = 1 ;
      edtDevCruHash_Visible = 1 ;
      edtDevCruEst_Jsonclick = "" ;
      edtDevCruEst_Enabled = 1 ;
      edtDevCruEst_Visible = 1 ;
      edtavDevcrusal_Jsonclick = "" ;
      edtavDevcrusal_Enabled = 0 ;
      edtavError_confirmacion_Jsonclick = "" ;
      edtavError_confirmacion_Enabled = 0 ;
      divTableinvisible_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDevCruObs_Enabled = 1 ;
      edtDevCruMat_Jsonclick = "" ;
      edtDevCruMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtDevCruSal_Jsonclick = "" ;
      edtDevCruSal_Enabled = 1 ;
      edtDevCruFec_Jsonclick = "" ;
      edtDevCruFec_Enabled = 1 ;
      edtDevCruId_Jsonclick = "" ;
      edtDevCruId_Enabled = 1 ;
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

   public void gxsgaclicod1PP0( String A396EmprCod ,
                                String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaclicod_data1PP0( A396EmprCod, A13735CliCNom) ;
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

   protected void gxsgaclicod_data1PP0( String A396EmprCod ,
                                        String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor T01PP42 */
      pr_default.execute(40, new Object[] {A396EmprCod, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(40) != 101) )
      {
         gxdynajaxctrlcodr.add(T01PP42_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(T01PP42_A13735CliCNom[0]);
         pr_default.readNext(40);
      }
      pr_default.close(40);
   }

   public void gxsgatrncod1PP0( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1PP0( A396EmprCod, A13738TrnCNom) ;
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

   protected void gxsgatrncod_data1PP0( String A396EmprCod ,
                                        String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor T01PP43 */
      pr_default.execute(41, new Object[] {A396EmprCod, l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(41) != 101) )
      {
         gxdynajaxctrlcodr.add(T01PP43_A13738TrnCNom[0]);
         gxdynajaxctrldescr.add(T01PP43_A13738TrnCNom[0]);
         pr_default.readNext(41);
      }
      pr_default.close(41);
   }

   public void gxhcaclicod1PP1633( String A396EmprCod ,
                                   String A13735CliCNom )
   {
      /* Using cursor T01PP44 */
      pr_default.execute(42, new Object[] {A13735CliCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(42) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = T01PP44_A13735CliCNom[0] ;
         A396EmprCod = T01PP44_A396EmprCod[0] ;
         A252CliCod = T01PP44_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.readNext(42);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(42);
   }

   public void gxhcatrncod1PP1633( String A396EmprCod ,
                                   String A13738TrnCNom )
   {
      /* Using cursor T01PP45 */
      pr_default.execute(43, new Object[] {A13738TrnCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(43) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13738TrnCNom = T01PP45_A13738TrnCNom[0] ;
         A396EmprCod = T01PP45_A396EmprCod[0] ;
         A840TrnCod = T01PP45_A840TrnCod[0] ;
         n840TrnCod = T01PP45_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.readNext(43);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(43);
   }

   public void gx12asadevcrusal1PP1633( java.util.Date A11670DevCruFec ,
                                        String Gx_mode ,
                                        String A396EmprCod )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) && true /* After */ )
      {
         GXt_dtime15 = A11673DevCruSal ;
         GXv_dtime11[0] = GXt_dtime15 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime11) ;
         devolucionalmacentejidocrudosindetalle_impl.this.GXt_dtime15 = GXv_dtime11[0] ;
         A11673DevCruSal = GXt_dtime15 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_27_1PP1633( String A396EmprCod ,
                              int A11669DevCruId )
   {
      if ( (0==A11669DevCruId) && true /* After */ )
      {
         GXv_int16[0] = A11669DevCruId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int16) ;
         A11669DevCruId = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_40_1PP1634( String A396EmprCod ,
                              int A44AlbRecCod ,
                              int A252CliCod )
   {
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int16[0] = A44AlbRecCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int12[0] = (byte)(AV29FlagCli) ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int16, GXv_int8, GXv_int12) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int16[0] ;
         A252CliCod = GXv_int8[0] ;
         AV29FlagCli = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV29FlagCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29FlagCli), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV29FlagCli, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_681634( ) ;
      while ( nGXsfl_68_idx <= nRC_GXsfl_68 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1PP1634( ) ;
         standaloneModal1PP1634( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1PP1634( ) ;
         nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_681634( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "ALBRUNI_" + sGXsfl_68_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      GXCCtl = "ALBREST_" + sGXsfl_68_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
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

   public void valid_Devcrufec( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) && true /* After */ )
      {
         GXt_dtime15 = A11673DevCruSal ;
         GXv_dtime11[0] = GXt_dtime15 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime11) ;
         devolucionalmacentejidocrudosindetalle_impl.this.GXt_dtime15 = GXv_dtime11[0] ;
         A11673DevCruSal = GXt_dtime15 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void valid_Clicod( )
   {
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         A252CliCod = 0 ;
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor T01PP46 */
         pr_default.execute(44, new Object[] {A13735CliCNom, A396EmprCod});
         A252CliCod = T01PP46_A252CliCod[0] ;
         A252CliCod = T01PP46_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(44) == 101) ) )
         {
            pr_default.readNext(44);
            if ( ! ( (pr_default.getStatus(44) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(44);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      /* Using cursor T01PP47 */
      pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01PP47_A279CliNom[0] ;
      pr_default.close(45);
      if ( true /* After */ )
      {
         AV30CliCod = A252CliCod ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV30CliCod", GXutil.ltrim( localUtil.ntoc( AV30CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01PP48 */
         pr_default.execute(46, new Object[] {A13738TrnCNom, A396EmprCod});
         A840TrnCod = T01PP48_A840TrnCod[0] ;
         n840TrnCod = T01PP48_n840TrnCod[0] ;
         A840TrnCod = T01PP48_A840TrnCod[0] ;
         n840TrnCod = T01PP48_n840TrnCod[0] ;
         if ( ! ( (pr_default.getStatus(46) == 101) ) )
         {
            pr_default.readNext(46);
            if ( ! ( (pr_default.getStatus(46) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(46);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01PP49 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(47) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01PP49_A841TrnNom[0] ;
      n841TrnNom = T01PP49_n841TrnNom[0] ;
      pr_default.close(47);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void valid_Devcruatid( )
   {
      if ( ( AV15FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "DEVCRUATID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruAtId_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Albreccod( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      /* Using cursor T01PP39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Z47AlbREst = T01PP39_A47AlbREst[0] ;
      Z45AlbRef = T01PP39_A45AlbRef[0] ;
      Z3613AlbRefDsc = T01PP39_A3613AlbRefDsc[0] ;
      Z58AlbRUniEnt = T01PP39_A58AlbRUniEnt[0] ;
      Z52AlbRPieEnt = T01PP39_A52AlbRPieEnt[0] ;
      Z56AlbRUni = T01PP39_A56AlbRUni[0] ;
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A60AlbRUniUti = T01PP39_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01PP39_A54AlbRPieUti[0] ;
      A47AlbREst = T01PP39_A47AlbREst[0] ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      A45AlbRef = T01PP39_A45AlbRef[0] ;
      A3613AlbRefDsc = T01PP39_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01PP39_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01PP39_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01PP39_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(37);
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int16[0] = A44AlbRecCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int12[0] = (byte)(AV29FlagCli) ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int16, GXv_int8, GXv_int12) ;
         devolucionalmacentejidocrudosindetalle_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         devolucionalmacentejidocrudosindetalle_impl.this.A44AlbRecCod = GXv_int16[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         devolucionalmacentejidocrudosindetalle_impl.this.A252CliCod = GXv_int8[0] ;
         A252CliCod = this.A252CliCod ;
         devolucionalmacentejidocrudosindetalle_impl.this.AV29FlagCli = GXv_int12[0] ;
         AV29FlagCli = this.AV29FlagCli ;
      }
      dynload_actions( ) ;
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
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
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV29FlagCli", GXutil.ltrim( localUtil.ntoc( AV29FlagCli, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121PP2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_DEVCRUID","{handler:'valid_Devcruid',iparms:[]");
      setEventMetadata("VALID_DEVCRUID",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUFEC","{handler:'valid_Devcrufec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'}]");
      setEventMetadata("VALID_DEVCRUFEC",",oparms:[{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'h252CliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV30CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV30CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'h252CliCod'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'h840TrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'h840TrnCod'}]}");
      setEventMetadata("VALID_DEVCRUATID","{handler:'valid_Devcruatid',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15FirmaD',fld:'vFIRMAD',pic:'ZZZ9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''}]");
      setEventMetadata("VALID_DEVCRUATID",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'h252CliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'AV29FlagCli',fld:'vFLAGCLI',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV29FlagCli',fld:'vFLAGCLI',pic:'ZZZ9'},{av:'h252CliCod'}]}");
      setEventMetadata("VALID_DEVCRUUND","{handler:'valid_Devcruund',iparms:[]");
      setEventMetadata("VALID_DEVCRUUND",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUPZS","{handler:'valid_Devcrupzs',iparms:[]");
      setEventMetadata("VALID_DEVCRUPZS",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[]");
      setEventMetadata("VALID_ALBREST",",oparms:[]}");
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
      pr_default.close(45);
      pr_default.close(28);
      pr_default.close(47);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11672DevCruMat = "" ;
      Z11674DevCruHash = "" ;
      Z11675DevCruDesc = "" ;
      Z11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      Z11677DevCruGros = DecimalUtil.ZERO ;
      Z11678DevCruStt = "" ;
      Z11680DevCruAtId = "" ;
      Z11681DevCruAT = "" ;
      Z11682DevCruObs = "" ;
      Z11683DevCruUnd = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      O11683DevCruUnd = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13735CliCNom = "" ;
      A13738TrnCNom = "" ;
      h252CliCod = "" ;
      h840TrnCod = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV31DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11677DevCruGros = DecimalUtil.ZERO ;
      A11678DevCruStt = "" ;
      A11680DevCruAtId = "" ;
      A11681DevCruAT = "" ;
      ucGridlevel_level1_titlescategories = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1634 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      AV41Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Gridlevel_level1_titlescategories_Objectcall = "" ;
      Gridlevel_level1_titlescategories_Class = "" ;
      Gridlevel_level1_titlescategories_Gridinternalname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1633 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      T11683DevCruUnd = DecimalUtil.ZERO ;
      T60AlbRUniUti = DecimalUtil.ZERO ;
      AV26Station = "" ;
      AV27EmprNom = "" ;
      AV28UsurCod = "" ;
      AV37Path = "" ;
      GXt_char1 = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_date10 = new java.util.Date[1] ;
      GXv_int6 = new byte[1] ;
      AV33Cadena = "" ;
      AV36Hash = "" ;
      AV38Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message13 = new GXBaseCollection[1] ;
      GXv_boolean14 = new boolean[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z841TrnNom = "" ;
      T01PP8_A407EmprNom = new String[] {""} ;
      T01PP8_n407EmprNom = new boolean[] {false} ;
      T01PP11_A13738TrnCNom = new String[] {""} ;
      T01PP11_A396EmprCod = new String[] {""} ;
      T01PP11_A840TrnCod = new short[1] ;
      T01PP11_n840TrnCod = new boolean[] {false} ;
      T01PP12_A13735CliCNom = new String[] {""} ;
      T01PP12_A396EmprCod = new String[] {""} ;
      T01PP12_A252CliCod = new int[1] ;
      T01PP10_A841TrnNom = new String[] {""} ;
      T01PP10_n841TrnNom = new boolean[] {false} ;
      T01PP9_A279CliNom = new String[] {""} ;
      T01PP13_A11669DevCruId = new int[1] ;
      T01PP13_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01PP13_A407EmprNom = new String[] {""} ;
      T01PP13_n407EmprNom = new boolean[] {false} ;
      T01PP13_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PP13_A279CliNom = new String[] {""} ;
      T01PP13_A841TrnNom = new String[] {""} ;
      T01PP13_n841TrnNom = new boolean[] {false} ;
      T01PP13_A11671DevCruEst = new byte[1] ;
      T01PP13_A11672DevCruMat = new String[] {""} ;
      T01PP13_A11674DevCruHash = new String[] {""} ;
      T01PP13_A11675DevCruDesc = new String[] {""} ;
      T01PP13_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01PP13_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP13_A11678DevCruStt = new String[] {""} ;
      T01PP13_A11679DevCruEnvA = new byte[1] ;
      T01PP13_A11680DevCruAtId = new String[] {""} ;
      T01PP13_A11681DevCruAT = new String[] {""} ;
      T01PP13_A11682DevCruObs = new String[] {""} ;
      T01PP13_A396EmprCod = new String[] {""} ;
      T01PP13_A252CliCod = new int[1] ;
      T01PP13_A840TrnCod = new short[1] ;
      T01PP13_n840TrnCod = new boolean[] {false} ;
      T01PP14_A13735CliCNom = new String[] {""} ;
      T01PP14_A396EmprCod = new String[] {""} ;
      T01PP14_A252CliCod = new int[1] ;
      T01PP15_A13738TrnCNom = new String[] {""} ;
      T01PP15_A396EmprCod = new String[] {""} ;
      T01PP15_A840TrnCod = new short[1] ;
      T01PP15_n840TrnCod = new boolean[] {false} ;
      T01PP16_A13735CliCNom = new String[] {""} ;
      T01PP16_A396EmprCod = new String[] {""} ;
      T01PP16_A252CliCod = new int[1] ;
      T01PP17_A13738TrnCNom = new String[] {""} ;
      T01PP17_A396EmprCod = new String[] {""} ;
      T01PP17_A840TrnCod = new short[1] ;
      T01PP17_n840TrnCod = new boolean[] {false} ;
      T01PP18_A13735CliCNom = new String[] {""} ;
      T01PP18_A396EmprCod = new String[] {""} ;
      T01PP18_A252CliCod = new int[1] ;
      T01PP19_A13738TrnCNom = new String[] {""} ;
      T01PP19_A396EmprCod = new String[] {""} ;
      T01PP19_A840TrnCod = new short[1] ;
      T01PP19_n840TrnCod = new boolean[] {false} ;
      T01PP20_A279CliNom = new String[] {""} ;
      T01PP21_A841TrnNom = new String[] {""} ;
      T01PP21_n841TrnNom = new boolean[] {false} ;
      T01PP22_A396EmprCod = new String[] {""} ;
      T01PP22_A11669DevCruId = new int[1] ;
      T01PP7_A11669DevCruId = new int[1] ;
      T01PP7_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01PP7_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PP7_A11671DevCruEst = new byte[1] ;
      T01PP7_A11672DevCruMat = new String[] {""} ;
      T01PP7_A11674DevCruHash = new String[] {""} ;
      T01PP7_A11675DevCruDesc = new String[] {""} ;
      T01PP7_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01PP7_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP7_A11678DevCruStt = new String[] {""} ;
      T01PP7_A11679DevCruEnvA = new byte[1] ;
      T01PP7_A11680DevCruAtId = new String[] {""} ;
      T01PP7_A11681DevCruAT = new String[] {""} ;
      T01PP7_A11682DevCruObs = new String[] {""} ;
      T01PP7_A396EmprCod = new String[] {""} ;
      T01PP7_A252CliCod = new int[1] ;
      T01PP7_A840TrnCod = new short[1] ;
      T01PP7_n840TrnCod = new boolean[] {false} ;
      T01PP23_A396EmprCod = new String[] {""} ;
      T01PP23_A11669DevCruId = new int[1] ;
      T01PP24_A396EmprCod = new String[] {""} ;
      T01PP24_A11669DevCruId = new int[1] ;
      T01PP25_A13735CliCNom = new String[] {""} ;
      T01PP25_A396EmprCod = new String[] {""} ;
      T01PP25_A252CliCod = new int[1] ;
      T01PP26_A13738TrnCNom = new String[] {""} ;
      T01PP26_A396EmprCod = new String[] {""} ;
      T01PP26_A840TrnCod = new short[1] ;
      T01PP26_n840TrnCod = new boolean[] {false} ;
      T01PP6_A11669DevCruId = new int[1] ;
      T01PP6_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01PP6_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01PP6_A11671DevCruEst = new byte[1] ;
      T01PP6_A11672DevCruMat = new String[] {""} ;
      T01PP6_A11674DevCruHash = new String[] {""} ;
      T01PP6_A11675DevCruDesc = new String[] {""} ;
      T01PP6_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01PP6_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP6_A11678DevCruStt = new String[] {""} ;
      T01PP6_A11679DevCruEnvA = new byte[1] ;
      T01PP6_A11680DevCruAtId = new String[] {""} ;
      T01PP6_A11681DevCruAT = new String[] {""} ;
      T01PP6_A11682DevCruObs = new String[] {""} ;
      T01PP6_A396EmprCod = new String[] {""} ;
      T01PP6_A252CliCod = new int[1] ;
      T01PP6_A840TrnCod = new short[1] ;
      T01PP6_n840TrnCod = new boolean[] {false} ;
      T01PP30_A279CliNom = new String[] {""} ;
      T01PP31_A841TrnNom = new String[] {""} ;
      T01PP31_n841TrnNom = new boolean[] {false} ;
      T01PP32_A396EmprCod = new String[] {""} ;
      T01PP32_A11669DevCruId = new int[1] ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      T01PP33_A11669DevCruId = new int[1] ;
      T01PP33_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP33_A54AlbRPieUti = new int[1] ;
      T01PP33_A47AlbREst = new byte[1] ;
      T01PP33_A45AlbRef = new String[] {""} ;
      T01PP33_A3613AlbRefDsc = new String[] {""} ;
      T01PP33_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP33_A11684DevCruPzs = new int[1] ;
      T01PP33_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP33_A52AlbRPieEnt = new int[1] ;
      T01PP33_A56AlbRUni = new String[] {""} ;
      T01PP33_A396EmprCod = new String[] {""} ;
      T01PP33_A44AlbRecCod = new int[1] ;
      T01PP5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP5_A54AlbRPieUti = new int[1] ;
      T01PP5_A47AlbREst = new byte[1] ;
      T01PP5_A45AlbRef = new String[] {""} ;
      T01PP5_A3613AlbRefDsc = new String[] {""} ;
      T01PP5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP5_A52AlbRPieEnt = new int[1] ;
      T01PP5_A56AlbRUni = new String[] {""} ;
      T01PP34_A396EmprCod = new String[] {""} ;
      T01PP34_A11669DevCruId = new int[1] ;
      T01PP34_A44AlbRecCod = new int[1] ;
      T01PP3_A11669DevCruId = new int[1] ;
      T01PP3_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP3_A11684DevCruPzs = new int[1] ;
      T01PP3_A396EmprCod = new String[] {""} ;
      T01PP3_A44AlbRecCod = new int[1] ;
      T01PP2_A11669DevCruId = new int[1] ;
      T01PP2_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP2_A11684DevCruPzs = new int[1] ;
      T01PP2_A396EmprCod = new String[] {""} ;
      T01PP2_A44AlbRecCod = new int[1] ;
      T01PP35_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP35_A54AlbRPieUti = new int[1] ;
      T01PP35_A47AlbREst = new byte[1] ;
      T01PP35_A45AlbRef = new String[] {""} ;
      T01PP35_A3613AlbRefDsc = new String[] {""} ;
      T01PP35_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP35_A52AlbRPieEnt = new int[1] ;
      T01PP35_A56AlbRUni = new String[] {""} ;
      T01PP39_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP39_A54AlbRPieUti = new int[1] ;
      T01PP39_A47AlbREst = new byte[1] ;
      T01PP39_A45AlbRef = new String[] {""} ;
      T01PP39_A3613AlbRefDsc = new String[] {""} ;
      T01PP39_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PP39_A52AlbRPieEnt = new int[1] ;
      T01PP39_A56AlbRUni = new String[] {""} ;
      T01PP41_A396EmprCod = new String[] {""} ;
      T01PP41_A11669DevCruId = new int[1] ;
      T01PP41_A44AlbRecCod = new int[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_44_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11670DevCruFec = GXutil.nullDate() ;
      i11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      i11680DevCruAtId = "" ;
      i11681DevCruAT = "" ;
      i11678DevCruStt = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13735CliCNom = "" ;
      T01PP42_A13735CliCNom = new String[] {""} ;
      l13738TrnCNom = "" ;
      T01PP43_A13738TrnCNom = new String[] {""} ;
      T01PP44_A13735CliCNom = new String[] {""} ;
      T01PP44_A396EmprCod = new String[] {""} ;
      T01PP44_A252CliCod = new int[1] ;
      T01PP45_A13738TrnCNom = new String[] {""} ;
      T01PP45_A396EmprCod = new String[] {""} ;
      T01PP45_A840TrnCod = new short[1] ;
      T01PP45_n840TrnCod = new boolean[] {false} ;
      GXt_dtime15 = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime11 = new java.util.Date[1] ;
      T01PP46_A13735CliCNom = new String[] {""} ;
      T01PP46_A396EmprCod = new String[] {""} ;
      T01PP46_A252CliCod = new int[1] ;
      T01PP47_A279CliNom = new String[] {""} ;
      Zh252CliCod = "" ;
      T01PP48_A13738TrnCNom = new String[] {""} ;
      T01PP48_A396EmprCod = new String[] {""} ;
      T01PP48_A840TrnCod = new short[1] ;
      T01PP48_n840TrnCod = new boolean[] {false} ;
      T01PP49_A841TrnNom = new String[] {""} ;
      T01PP49_n841TrnNom = new boolean[] {false} ;
      Zh840TrnCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int12 = new byte[1] ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidocrudosindetalle__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidocrudosindetalle__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidocrudosindetalle__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidocrudosindetalle__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidocrudosindetalle__default(),
         new Object[] {
             new Object[] {
            T01PP2_A11669DevCruId, T01PP2_A11683DevCruUnd, T01PP2_A11684DevCruPzs, T01PP2_A396EmprCod, T01PP2_A44AlbRecCod
            }
            , new Object[] {
            T01PP3_A11669DevCruId, T01PP3_A11683DevCruUnd, T01PP3_A11684DevCruPzs, T01PP3_A396EmprCod, T01PP3_A44AlbRecCod
            }
            , new Object[] {
            T01PP4_A60AlbRUniUti, T01PP4_A54AlbRPieUti, T01PP4_A47AlbREst, T01PP4_A45AlbRef, T01PP4_A3613AlbRefDsc, T01PP4_A58AlbRUniEnt, T01PP4_A52AlbRPieEnt, T01PP4_A56AlbRUni
            }
            , new Object[] {
            T01PP5_A60AlbRUniUti, T01PP5_A54AlbRPieUti, T01PP5_A47AlbREst, T01PP5_A45AlbRef, T01PP5_A3613AlbRefDsc, T01PP5_A58AlbRUniEnt, T01PP5_A52AlbRPieEnt, T01PP5_A56AlbRUni
            }
            , new Object[] {
            T01PP6_A11669DevCruId, T01PP6_A11673DevCruSal, T01PP6_A11670DevCruFec, T01PP6_A11671DevCruEst, T01PP6_A11672DevCruMat, T01PP6_A11674DevCruHash, T01PP6_A11675DevCruDesc, T01PP6_A11676DevCruDtSy, T01PP6_A11677DevCruGros, T01PP6_A11678DevCruStt,
            T01PP6_A11679DevCruEnvA, T01PP6_A11680DevCruAtId, T01PP6_A11681DevCruAT, T01PP6_A11682DevCruObs, T01PP6_A396EmprCod, T01PP6_A252CliCod, T01PP6_A840TrnCod, T01PP6_n840TrnCod
            }
            , new Object[] {
            T01PP7_A11669DevCruId, T01PP7_A11673DevCruSal, T01PP7_A11670DevCruFec, T01PP7_A11671DevCruEst, T01PP7_A11672DevCruMat, T01PP7_A11674DevCruHash, T01PP7_A11675DevCruDesc, T01PP7_A11676DevCruDtSy, T01PP7_A11677DevCruGros, T01PP7_A11678DevCruStt,
            T01PP7_A11679DevCruEnvA, T01PP7_A11680DevCruAtId, T01PP7_A11681DevCruAT, T01PP7_A11682DevCruObs, T01PP7_A396EmprCod, T01PP7_A252CliCod, T01PP7_A840TrnCod, T01PP7_n840TrnCod
            }
            , new Object[] {
            T01PP8_A407EmprNom, T01PP8_n407EmprNom
            }
            , new Object[] {
            T01PP9_A279CliNom
            }
            , new Object[] {
            T01PP10_A841TrnNom, T01PP10_n841TrnNom
            }
            , new Object[] {
            T01PP11_A13738TrnCNom, T01PP11_A396EmprCod, T01PP11_A840TrnCod
            }
            , new Object[] {
            T01PP12_A13735CliCNom, T01PP12_A396EmprCod, T01PP12_A252CliCod
            }
            , new Object[] {
            T01PP13_A11669DevCruId, T01PP13_A11673DevCruSal, T01PP13_A407EmprNom, T01PP13_n407EmprNom, T01PP13_A11670DevCruFec, T01PP13_A279CliNom, T01PP13_A841TrnNom, T01PP13_n841TrnNom, T01PP13_A11671DevCruEst, T01PP13_A11672DevCruMat,
            T01PP13_A11674DevCruHash, T01PP13_A11675DevCruDesc, T01PP13_A11676DevCruDtSy, T01PP13_A11677DevCruGros, T01PP13_A11678DevCruStt, T01PP13_A11679DevCruEnvA, T01PP13_A11680DevCruAtId, T01PP13_A11681DevCruAT, T01PP13_A11682DevCruObs, T01PP13_A396EmprCod,
            T01PP13_A252CliCod, T01PP13_A840TrnCod, T01PP13_n840TrnCod
            }
            , new Object[] {
            T01PP14_A13735CliCNom, T01PP14_A396EmprCod, T01PP14_A252CliCod
            }
            , new Object[] {
            T01PP15_A13738TrnCNom, T01PP15_A396EmprCod, T01PP15_A840TrnCod
            }
            , new Object[] {
            T01PP16_A13735CliCNom, T01PP16_A396EmprCod, T01PP16_A252CliCod
            }
            , new Object[] {
            T01PP17_A13738TrnCNom, T01PP17_A396EmprCod, T01PP17_A840TrnCod
            }
            , new Object[] {
            T01PP18_A13735CliCNom, T01PP18_A396EmprCod, T01PP18_A252CliCod
            }
            , new Object[] {
            T01PP19_A13738TrnCNom, T01PP19_A396EmprCod, T01PP19_A840TrnCod
            }
            , new Object[] {
            T01PP20_A279CliNom
            }
            , new Object[] {
            T01PP21_A841TrnNom, T01PP21_n841TrnNom
            }
            , new Object[] {
            T01PP22_A396EmprCod, T01PP22_A11669DevCruId
            }
            , new Object[] {
            T01PP23_A396EmprCod, T01PP23_A11669DevCruId
            }
            , new Object[] {
            T01PP24_A396EmprCod, T01PP24_A11669DevCruId
            }
            , new Object[] {
            T01PP25_A13735CliCNom, T01PP25_A396EmprCod, T01PP25_A252CliCod
            }
            , new Object[] {
            T01PP26_A13738TrnCNom, T01PP26_A396EmprCod, T01PP26_A840TrnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PP30_A279CliNom
            }
            , new Object[] {
            T01PP31_A841TrnNom, T01PP31_n841TrnNom
            }
            , new Object[] {
            T01PP32_A396EmprCod, T01PP32_A11669DevCruId
            }
            , new Object[] {
            T01PP33_A11669DevCruId, T01PP33_A60AlbRUniUti, T01PP33_A54AlbRPieUti, T01PP33_A47AlbREst, T01PP33_A45AlbRef, T01PP33_A3613AlbRefDsc, T01PP33_A11683DevCruUnd, T01PP33_A11684DevCruPzs, T01PP33_A58AlbRUniEnt, T01PP33_A52AlbRPieEnt,
            T01PP33_A56AlbRUni, T01PP33_A396EmprCod, T01PP33_A44AlbRecCod
            }
            , new Object[] {
            T01PP34_A396EmprCod, T01PP34_A11669DevCruId, T01PP34_A44AlbRecCod
            }
            , new Object[] {
            T01PP35_A60AlbRUniUti, T01PP35_A54AlbRPieUti, T01PP35_A47AlbREst, T01PP35_A45AlbRef, T01PP35_A3613AlbRefDsc, T01PP35_A58AlbRUniEnt, T01PP35_A52AlbRPieEnt, T01PP35_A56AlbRUni
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PP39_A60AlbRUniUti, T01PP39_A54AlbRPieUti, T01PP39_A47AlbREst, T01PP39_A45AlbRef, T01PP39_A3613AlbRefDsc, T01PP39_A58AlbRUniEnt, T01PP39_A52AlbRPieEnt, T01PP39_A56AlbRUni
            }
            , new Object[] {
            }
            , new Object[] {
            T01PP41_A396EmprCod, T01PP41_A11669DevCruId, T01PP41_A44AlbRecCod
            }
            , new Object[] {
            T01PP42_A13735CliCNom
            }
            , new Object[] {
            T01PP43_A13738TrnCNom
            }
            , new Object[] {
            T01PP44_A13735CliCNom, T01PP44_A396EmprCod, T01PP44_A252CliCod
            }
            , new Object[] {
            T01PP45_A13738TrnCNom, T01PP45_A396EmprCod, T01PP45_A840TrnCod
            }
            , new Object[] {
            T01PP46_A13735CliCNom, T01PP46_A396EmprCod, T01PP46_A252CliCod
            }
            , new Object[] {
            T01PP47_A279CliNom
            }
            , new Object[] {
            T01PP48_A13738TrnCNom, T01PP48_A396EmprCod, T01PP48_A840TrnCod
            }
            , new Object[] {
            T01PP49_A841TrnNom, T01PP49_n841TrnNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV41Pgmname = "DevolucionAlmacenTejidoCrudosindetalle" ;
      Z11678DevCruStt = " " ;
      A11678DevCruStt = " " ;
      i11678DevCruStt = " " ;
      Z11681DevCruAT = " " ;
      A11681DevCruAT = " " ;
      i11681DevCruAT = " " ;
      Z11679DevCruEnvA = (byte)(0) ;
      A11679DevCruEnvA = (byte)(0) ;
      i11679DevCruEnvA = (byte)(0) ;
      Z11680DevCruAtId = " " ;
      A11680DevCruAtId = " " ;
      i11680DevCruAtId = " " ;
      Z11676DevCruDtSy = GXutil.now( ) ;
      A11676DevCruDtSy = GXutil.now( ) ;
      i11676DevCruDtSy = GXutil.now( ) ;
      Z11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
   }

   private byte Z11671DevCruEst ;
   private byte Z11679DevCruEnvA ;
   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte AV32Error_confirmacion ;
   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private byte Gx_BScreen ;
   private byte A47AlbREst ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i11679DevCruEnvA ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int12[] ;
   private short nIsMod_1634 ;
   private short Z840TrnCod ;
   private short N840TrnCod ;
   private short nRcdDeleted_1634 ;
   private short nRcdExists_1634 ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1634 ;
   private short RcdFound1634 ;
   private short nBlankRcdUsr1634 ;
   private short AV13Insert_TrnCod ;
   private short AV15FirmaD ;
   private short AV29FlagCli ;
   private short RcdFound1633 ;
   private short AV16Ws ;
   private short AV17Modhh ;
   private short AV18Reg000 ;
   private short AV19copias ;
   private short AV20Copias2 ;
   private short nIsDirty_1633 ;
   private short nIsDirty_1634 ;
   private short gxhchits ;
   private short ZV29FlagCli ;
   private int wcpOAV8DevCruId ;
   private int Z11669DevCruId ;
   private int Z252CliCod ;
   private int nRC_GXsfl_68 ;
   private int nGXsfl_68_idx=1 ;
   private int N252CliCod ;
   private int Z44AlbRecCod ;
   private int Z11684DevCruPzs ;
   private int Z52AlbRPieEnt ;
   private int O11684DevCruPzs ;
   private int O54AlbRPieUti ;
   private int A11669DevCruId ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV8DevCruId ;
   private int trnEnded ;
   private int edtDevCruId_Enabled ;
   private int edtDevCruFec_Enabled ;
   private int edtDevCruSal_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtDevCruMat_Enabled ;
   private int edtDevCruObs_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int divTableinvisible_Visible ;
   private int edtavError_confirmacion_Enabled ;
   private int edtavDevcrusal_Enabled ;
   private int edtDevCruEst_Enabled ;
   private int edtDevCruEst_Visible ;
   private int edtDevCruHash_Visible ;
   private int edtDevCruHash_Enabled ;
   private int edtDevCruDesc_Visible ;
   private int edtDevCruDesc_Enabled ;
   private int edtDevCruDtSy_Visible ;
   private int edtDevCruDtSy_Enabled ;
   private int edtDevCruGros_Enabled ;
   private int edtDevCruGros_Visible ;
   private int edtDevCruStt_Visible ;
   private int edtDevCruStt_Enabled ;
   private int edtDevCruEnvA_Enabled ;
   private int edtDevCruEnvA_Visible ;
   private int edtDevCruAtId_Visible ;
   private int edtDevCruAtId_Enabled ;
   private int edtDevCruAT_Visible ;
   private int edtDevCruAT_Enabled ;
   private int AV30CliCod ;
   private int edtavClicod_Enabled ;
   private int edtavClicod_Visible ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtDevCruUnd_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtDevCruPzs_Enabled ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRPieUti_Enabled ;
   private int edtAlbRPieEnt_Enabled ;
   private int fRowAdded ;
   private int AV12Insert_CliCod ;
   private int A11684DevCruPzs ;
   private int A51AlbRPieDis ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int T11684DevCruPzs ;
   private int T54AlbRPieUti ;
   private int GXt_int7 ;
   private int AV42GXV1 ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int imgprompt_44_Visible ;
   private int defcmbAlbREst_Enabled ;
   private int defedtAlbRPieEnt_Enabled ;
   private int defedtAlbRPieUti_Enabled ;
   private int defedtAlbRUniEnt_Enabled ;
   private int defedtAlbRUniUti_Enabled ;
   private int defedtAlbRecCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int ZV30CliCod ;
   private int GXv_int16[] ;
   private int GXv_int8[] ;
   private int ZO54AlbRPieUti ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11677DevCruGros ;
   private java.math.BigDecimal Z11683DevCruUnd ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O11683DevCruUnd ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal A11677DevCruGros ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal T11683DevCruUnd ;
   private java.math.BigDecimal T60AlbRUniUti ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private String sPrefix ;
   private String sGXsfl_68_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z11672DevCruMat ;
   private String Z11674DevCruHash ;
   private String Z11675DevCruDesc ;
   private String Z11678DevCruStt ;
   private String Z11680DevCruAtId ;
   private String Z11681DevCruAT ;
   private String Z45AlbRef ;
   private String Z3613AlbRefDsc ;
   private String Z56AlbRUni ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDevCruId_Internalname ;
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
   private String edtDevCruId_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtDevCruFec_Internalname ;
   private String edtDevCruFec_Jsonclick ;
   private String edtDevCruSal_Internalname ;
   private String edtDevCruSal_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtDevCruMat_Internalname ;
   private String A11672DevCruMat ;
   private String edtDevCruMat_Jsonclick ;
   private String edtDevCruObs_Internalname ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divTableinvisible_Internalname ;
   private String edtavError_confirmacion_Internalname ;
   private String edtavError_confirmacion_Jsonclick ;
   private String edtavDevcrusal_Internalname ;
   private String edtavDevcrusal_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtDevCruEst_Internalname ;
   private String edtDevCruEst_Jsonclick ;
   private String edtDevCruHash_Internalname ;
   private String A11674DevCruHash ;
   private String edtDevCruDesc_Internalname ;
   private String A11675DevCruDesc ;
   private String edtDevCruDtSy_Internalname ;
   private String edtDevCruDtSy_Jsonclick ;
   private String edtDevCruGros_Internalname ;
   private String edtDevCruGros_Jsonclick ;
   private String edtDevCruStt_Internalname ;
   private String A11678DevCruStt ;
   private String edtDevCruStt_Jsonclick ;
   private String edtDevCruEnvA_Internalname ;
   private String edtDevCruEnvA_Jsonclick ;
   private String edtDevCruAtId_Internalname ;
   private String A11680DevCruAtId ;
   private String edtDevCruAtId_Jsonclick ;
   private String edtDevCruAT_Internalname ;
   private String A11681DevCruAT ;
   private String edtDevCruAT_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String Gridlevel_level1_titlescategories_Gridtitlescategories ;
   private String Gridlevel_level1_titlescategories_Internalname ;
   private String sMode1634 ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRef_Internalname ;
   private String edtAlbRefDsc_Internalname ;
   private String edtDevCruUnd_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String edtDevCruPzs_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String imgprompt_44_Link ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String AV41Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Gridlevel_level1_titlescategories_Objectcall ;
   private String Gridlevel_level1_titlescategories_Class ;
   private String Gridlevel_level1_titlescategories_Gridinternalname ;
   private String hsh ;
   private String sMode1633 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String AV26Station ;
   private String AV27EmprNom ;
   private String AV28UsurCod ;
   private String AV37Path ;
   private String GXt_char1 ;
   private String AV33Cadena ;
   private String AV36Hash ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String imgprompt_44_Internalname ;
   private String sGXsfl_68_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtAlbRecCod_Jsonclick ;
   private String imgprompt_44_gximage ;
   private String sImgUrl ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtDevCruUnd_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtDevCruPzs_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11680DevCruAtId ;
   private String i11681DevCruAT ;
   private String i11678DevCruStt ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String GXv_char4[] ;
   private java.util.Date Z11673DevCruSal ;
   private java.util.Date Z11676DevCruDtSy ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV31DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date i11676DevCruDtSy ;
   private java.util.Date GXt_dtime15 ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date Z11670DevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date i11670DevCruFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_68_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Gridlevel_level1_titlescategories_Enabled ;
   private boolean Gridlevel_level1_titlescategories_Visible ;
   private boolean returnInSub ;
   private boolean AV39OK ;
   private boolean GXv_boolean14[] ;
   private boolean Gx_longc ;
   private String Z11682DevCruObs ;
   private String A13735CliCNom ;
   private String A13738TrnCNom ;
   private String h252CliCod ;
   private String h840TrnCod ;
   private String A11682DevCruObs ;
   private String l13735CliCNom ;
   private String l13738TrnCNom ;
   private String Zh252CliCod ;
   private String Zh840TrnCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucGridlevel_level1_titlescategories ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private String[] T01PP8_A407EmprNom ;
   private boolean[] T01PP8_n407EmprNom ;
   private String[] T01PP11_A13738TrnCNom ;
   private String[] T01PP11_A396EmprCod ;
   private short[] T01PP11_A840TrnCod ;
   private boolean[] T01PP11_n840TrnCod ;
   private String[] T01PP12_A13735CliCNom ;
   private String[] T01PP12_A396EmprCod ;
   private int[] T01PP12_A252CliCod ;
   private String[] T01PP10_A841TrnNom ;
   private boolean[] T01PP10_n841TrnNom ;
   private String[] T01PP9_A279CliNom ;
   private int[] T01PP13_A11669DevCruId ;
   private java.util.Date[] T01PP13_A11673DevCruSal ;
   private String[] T01PP13_A407EmprNom ;
   private boolean[] T01PP13_n407EmprNom ;
   private java.util.Date[] T01PP13_A11670DevCruFec ;
   private String[] T01PP13_A279CliNom ;
   private String[] T01PP13_A841TrnNom ;
   private boolean[] T01PP13_n841TrnNom ;
   private byte[] T01PP13_A11671DevCruEst ;
   private String[] T01PP13_A11672DevCruMat ;
   private String[] T01PP13_A11674DevCruHash ;
   private String[] T01PP13_A11675DevCruDesc ;
   private java.util.Date[] T01PP13_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01PP13_A11677DevCruGros ;
   private String[] T01PP13_A11678DevCruStt ;
   private byte[] T01PP13_A11679DevCruEnvA ;
   private String[] T01PP13_A11680DevCruAtId ;
   private String[] T01PP13_A11681DevCruAT ;
   private String[] T01PP13_A11682DevCruObs ;
   private String[] T01PP13_A396EmprCod ;
   private int[] T01PP13_A252CliCod ;
   private short[] T01PP13_A840TrnCod ;
   private boolean[] T01PP13_n840TrnCod ;
   private String[] T01PP14_A13735CliCNom ;
   private String[] T01PP14_A396EmprCod ;
   private int[] T01PP14_A252CliCod ;
   private String[] T01PP15_A13738TrnCNom ;
   private String[] T01PP15_A396EmprCod ;
   private short[] T01PP15_A840TrnCod ;
   private boolean[] T01PP15_n840TrnCod ;
   private String[] T01PP16_A13735CliCNom ;
   private String[] T01PP16_A396EmprCod ;
   private int[] T01PP16_A252CliCod ;
   private String[] T01PP17_A13738TrnCNom ;
   private String[] T01PP17_A396EmprCod ;
   private short[] T01PP17_A840TrnCod ;
   private boolean[] T01PP17_n840TrnCod ;
   private String[] T01PP18_A13735CliCNom ;
   private String[] T01PP18_A396EmprCod ;
   private int[] T01PP18_A252CliCod ;
   private String[] T01PP19_A13738TrnCNom ;
   private String[] T01PP19_A396EmprCod ;
   private short[] T01PP19_A840TrnCod ;
   private boolean[] T01PP19_n840TrnCod ;
   private String[] T01PP20_A279CliNom ;
   private String[] T01PP21_A841TrnNom ;
   private boolean[] T01PP21_n841TrnNom ;
   private String[] T01PP22_A396EmprCod ;
   private int[] T01PP22_A11669DevCruId ;
   private int[] T01PP7_A11669DevCruId ;
   private java.util.Date[] T01PP7_A11673DevCruSal ;
   private java.util.Date[] T01PP7_A11670DevCruFec ;
   private byte[] T01PP7_A11671DevCruEst ;
   private String[] T01PP7_A11672DevCruMat ;
   private String[] T01PP7_A11674DevCruHash ;
   private String[] T01PP7_A11675DevCruDesc ;
   private java.util.Date[] T01PP7_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01PP7_A11677DevCruGros ;
   private String[] T01PP7_A11678DevCruStt ;
   private byte[] T01PP7_A11679DevCruEnvA ;
   private String[] T01PP7_A11680DevCruAtId ;
   private String[] T01PP7_A11681DevCruAT ;
   private String[] T01PP7_A11682DevCruObs ;
   private String[] T01PP7_A396EmprCod ;
   private int[] T01PP7_A252CliCod ;
   private short[] T01PP7_A840TrnCod ;
   private boolean[] T01PP7_n840TrnCod ;
   private String[] T01PP23_A396EmprCod ;
   private int[] T01PP23_A11669DevCruId ;
   private String[] T01PP24_A396EmprCod ;
   private int[] T01PP24_A11669DevCruId ;
   private String[] T01PP25_A13735CliCNom ;
   private String[] T01PP25_A396EmprCod ;
   private int[] T01PP25_A252CliCod ;
   private String[] T01PP26_A13738TrnCNom ;
   private String[] T01PP26_A396EmprCod ;
   private short[] T01PP26_A840TrnCod ;
   private boolean[] T01PP26_n840TrnCod ;
   private int[] T01PP6_A11669DevCruId ;
   private java.util.Date[] T01PP6_A11673DevCruSal ;
   private java.util.Date[] T01PP6_A11670DevCruFec ;
   private byte[] T01PP6_A11671DevCruEst ;
   private String[] T01PP6_A11672DevCruMat ;
   private String[] T01PP6_A11674DevCruHash ;
   private String[] T01PP6_A11675DevCruDesc ;
   private java.util.Date[] T01PP6_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01PP6_A11677DevCruGros ;
   private String[] T01PP6_A11678DevCruStt ;
   private byte[] T01PP6_A11679DevCruEnvA ;
   private String[] T01PP6_A11680DevCruAtId ;
   private String[] T01PP6_A11681DevCruAT ;
   private String[] T01PP6_A11682DevCruObs ;
   private String[] T01PP6_A396EmprCod ;
   private int[] T01PP6_A252CliCod ;
   private short[] T01PP6_A840TrnCod ;
   private boolean[] T01PP6_n840TrnCod ;
   private String[] T01PP30_A279CliNom ;
   private String[] T01PP31_A841TrnNom ;
   private boolean[] T01PP31_n841TrnNom ;
   private String[] T01PP32_A396EmprCod ;
   private int[] T01PP32_A11669DevCruId ;
   private int[] T01PP33_A11669DevCruId ;
   private java.math.BigDecimal[] T01PP33_A60AlbRUniUti ;
   private int[] T01PP33_A54AlbRPieUti ;
   private byte[] T01PP33_A47AlbREst ;
   private String[] T01PP33_A45AlbRef ;
   private String[] T01PP33_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01PP33_A11683DevCruUnd ;
   private int[] T01PP33_A11684DevCruPzs ;
   private java.math.BigDecimal[] T01PP33_A58AlbRUniEnt ;
   private int[] T01PP33_A52AlbRPieEnt ;
   private String[] T01PP33_A56AlbRUni ;
   private String[] T01PP33_A396EmprCod ;
   private int[] T01PP33_A44AlbRecCod ;
   private java.math.BigDecimal[] T01PP5_A60AlbRUniUti ;
   private int[] T01PP5_A54AlbRPieUti ;
   private byte[] T01PP5_A47AlbREst ;
   private String[] T01PP5_A45AlbRef ;
   private String[] T01PP5_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01PP5_A58AlbRUniEnt ;
   private int[] T01PP5_A52AlbRPieEnt ;
   private String[] T01PP5_A56AlbRUni ;
   private String[] T01PP34_A396EmprCod ;
   private int[] T01PP34_A11669DevCruId ;
   private int[] T01PP34_A44AlbRecCod ;
   private int[] T01PP3_A11669DevCruId ;
   private java.math.BigDecimal[] T01PP3_A11683DevCruUnd ;
   private int[] T01PP3_A11684DevCruPzs ;
   private String[] T01PP3_A396EmprCod ;
   private int[] T01PP3_A44AlbRecCod ;
   private int[] T01PP2_A11669DevCruId ;
   private java.math.BigDecimal[] T01PP2_A11683DevCruUnd ;
   private int[] T01PP2_A11684DevCruPzs ;
   private String[] T01PP2_A396EmprCod ;
   private int[] T01PP2_A44AlbRecCod ;
   private java.math.BigDecimal[] T01PP35_A60AlbRUniUti ;
   private int[] T01PP35_A54AlbRPieUti ;
   private byte[] T01PP35_A47AlbREst ;
   private String[] T01PP35_A45AlbRef ;
   private String[] T01PP35_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01PP35_A58AlbRUniEnt ;
   private int[] T01PP35_A52AlbRPieEnt ;
   private String[] T01PP35_A56AlbRUni ;
   private java.math.BigDecimal[] T01PP39_A60AlbRUniUti ;
   private int[] T01PP39_A54AlbRPieUti ;
   private byte[] T01PP39_A47AlbREst ;
   private String[] T01PP39_A45AlbRef ;
   private String[] T01PP39_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01PP39_A58AlbRUniEnt ;
   private int[] T01PP39_A52AlbRPieEnt ;
   private String[] T01PP39_A56AlbRUni ;
   private String[] T01PP41_A396EmprCod ;
   private int[] T01PP41_A11669DevCruId ;
   private int[] T01PP41_A44AlbRecCod ;
   private String[] T01PP42_A13735CliCNom ;
   private String[] T01PP43_A13738TrnCNom ;
   private String[] T01PP44_A13735CliCNom ;
   private String[] T01PP44_A396EmprCod ;
   private int[] T01PP44_A252CliCod ;
   private String[] T01PP45_A13738TrnCNom ;
   private String[] T01PP45_A396EmprCod ;
   private short[] T01PP45_A840TrnCod ;
   private boolean[] T01PP45_n840TrnCod ;
   private String[] T01PP46_A13735CliCNom ;
   private String[] T01PP46_A396EmprCod ;
   private int[] T01PP46_A252CliCod ;
   private String[] T01PP47_A279CliNom ;
   private String[] T01PP48_A13738TrnCNom ;
   private String[] T01PP48_A396EmprCod ;
   private short[] T01PP48_A840TrnCod ;
   private boolean[] T01PP48_n840TrnCod ;
   private String[] T01PP49_A841TrnNom ;
   private boolean[] T01PP49_n841TrnNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01PP4_A60AlbRUniUti ;
   private int[] T01PP4_A54AlbRPieUti ;
   private byte[] T01PP4_A47AlbREst ;
   private String[] T01PP4_A45AlbRef ;
   private String[] T01PP4_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01PP4_A58AlbRUniEnt ;
   private int[] T01PP4_A52AlbRPieEnt ;
   private String[] T01PP4_A56AlbRUni ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV38Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class devolucionalmacentejidocrudosindetalle__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devolucionalmacentejidocrudosindetalle__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devolucionalmacentejidocrudosindetalle__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devolucionalmacentejidocrudosindetalle__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devolucionalmacentejidocrudosindetalle__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PP2", "SELECT DevCruId, DevCruUnd, DevCruPzs, EmprCod, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?  FOR UPDATE OF DevCruUnd, DevCruPzs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP3", "SELECT DevCruId, DevCruUnd, DevCruPzs, EmprCod, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP4", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP5", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP6", "SELECT DevCruId, DevCruSal, DevCruFec, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, EmprCod, CliCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ?  FOR UPDATE OF DevCruSal, DevCruFec, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, CliCod, TrnCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP7", "SELECT DevCruId, DevCruSal, DevCruFec, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, EmprCod, CliCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP10", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP12", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP13", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevCruId, TM1.DevCruSal, T2.EmprNom, TM1.DevCruFec, T3.CliNom, T4.TrnNom, TM1.DevCruEst, TM1.DevCruMat, TM1.DevCruHash, TM1.DevCruDesc, TM1.DevCruDtSy, TM1.DevCruGros, TM1.DevCruStt, TM1.DevCruEnvA, TM1.DevCruAtId, TM1.DevCruAT, TM1.DevCruObs, TM1.EmprCod, TM1.CliCod, TM1.TrnCod FROM (((TXPDEVCRU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.DevCruId = ? ORDER BY TM1.EmprCod, TM1.DevCruId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP14", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP15", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP16", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP17", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP18", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP19", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP20", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP21", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP22", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE ( DevCruId > ?) and EmprCod = ? ORDER BY EmprCod, DevCruId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PP24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE ( DevCruId < ?) and EmprCod = ? ORDER BY EmprCod DESC, DevCruId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PP25", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP26", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PP27", "INSERT INTO TXPDEVCRU(DevCruId, DevCruSal, DevCruFec, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, EmprCod, CliCod, TrnCod, DevCruATCU, DevCruSerA, DevCruTipA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ')", GX_NOMASK, "TXPDEVCRU")
         ,new UpdateCursor("T01PP28", "UPDATE TXPDEVCRU SET DevCruSal=?, DevCruFec=?, DevCruEst=?, DevCruMat=?, DevCruHash=?, DevCruDesc=?, DevCruDtSy=?, DevCruGros=?, DevCruStt=?, DevCruEnvA=?, DevCruAtId=?, DevCruAT=?, DevCruObs=?, CliCod=?, TrnCod=?  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK, "TXPDEVCRU")
         ,new UpdateCursor("T01PP29", "DELETE FROM TXPDEVCRU  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK, "TXPDEVCRU")
         ,new ForEachCursor("T01PP30", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP31", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP32", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? ORDER BY EmprCod, DevCruId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP33", "SELECT T1.DevCruId, T2.AlbRUniUti, T2.AlbRPieUti, T2.AlbREst, T2.AlbRef, T2.AlbRefDsc, T1.DevCruUnd, T1.DevCruPzs, T2.AlbRUniEnt, T2.AlbRPieEnt, T2.AlbRUni, T1.EmprCod, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP34", "SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP35", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PP36", "INSERT INTO TXPDEVCR1(DevCruId, DevCruUnd, DevCruPzs, EmprCod, AlbRecCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01PP37", "UPDATE TXPDEVCR1 SET DevCruUnd=?, DevCruPzs=?  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01PP38", "DELETE FROM TXPDEVCR1  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new ForEachCursor("T01PP39", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PP40", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01PP41", "SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId, AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP42", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) ORDER BY CliCNom) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP43", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?)) ORDER BY TrnCNom) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP44", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP45", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP46", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP47", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP48", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PP49", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 300);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 300);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((String[]) buf[10])[0] = rslt.getString(9, 200);
               ((String[]) buf[11])[0] = rslt.getString(10, 300);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 20);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((String[]) buf[18])[0] = rslt.getVarchar(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 37 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 25 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 20);
               stmt.setString(6, (String)parms[5], 200);
               stmt.setString(7, (String)parms[6], 300);
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 20);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setVarchar(14, (String)parms[13], 200, false);
               stmt.setString(15, (String)parms[14], 3);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[17]).shortValue());
               }
               return;
            case 26 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 200);
               stmt.setString(6, (String)parms[5], 300);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 20);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setVarchar(13, (String)parms[12], 200, false);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[15]).shortValue());
               }
               stmt.setString(16, (String)parms[16], 3);
               stmt.setInt(17, ((Number) parms[17]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
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
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 35 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 42 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 43 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 44 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 46 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 47 :
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

