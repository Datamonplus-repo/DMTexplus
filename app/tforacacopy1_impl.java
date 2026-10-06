package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tforacacopy1_impl extends GXDataArea
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
         gxload_22( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A252CliCod, A65ArtCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A396EmprCod, A457FasCod) ;
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
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV22CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22CliCod), "ZZZZZ9")));
            AV23CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23CliNom", AV23CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23CliNom, ""))));
            AV24ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ArtCod", AV24ArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24ArtCod, ""))));
            AV25ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25ProCod", AV25ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25ProCod, ""))));
            AV26FasCod = httpContext.GetPar( "FasCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26FasCod", AV26FasCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26FasCod, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tratamientos Quimicos", ""), (short)(0)) ;
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

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_79 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_79"))) ;
      nGXsfl_79_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_79_idx"))) ;
      sGXsfl_79_idx = httpContext.GetPar( "sGXsfl_79_idx") ;
      A4894ArtProULin = (short)(GXutil.lval( httpContext.GetPar( "ArtProULin"))) ;
      n4894ArtProULin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public tforacacopy1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tforacacopy1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tforacacopy1_impl.class ));
   }

   public tforacacopy1_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORACACopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACACopy1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtCod_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACACopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACACopy1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACACopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACACopy1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACACopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORACACopy1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtProFac_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtProFac_Internalname, httpContext.getMessage( "Factor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtProFac_Internalname, GXutil.ltrim( localUtil.ntoc( A4896ArtProFac, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtProFac_Enabled!=0) ? localUtil.format( A4896ArtProFac, "ZZZZ9.99") : localUtil.format( A4896ArtProFac, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtProFac_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtProFac_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORACACopy1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACACopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACACopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORACACopy1.htm");
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
      /* User Defined Control */
      ucCombo_artprocod.setProperty("Caption", Combo_artprocod_Caption);
      ucCombo_artprocod.setProperty("Cls", Combo_artprocod_Cls);
      ucCombo_artprocod.setProperty("IsGridItem", Combo_artprocod_Isgriditem);
      ucCombo_artprocod.setProperty("EmptyItem", Combo_artprocod_Emptyitem);
      ucCombo_artprocod.setProperty("DropDownOptionsData", AV30ArtProCod_Data);
      ucCombo_artprocod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_artprocod_Internalname, "COMBO_ARTPROCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol79( ) ;
      nGXsfl_79_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount723 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_723 = (short)(1) ;
            scanStart1PE723( ) ;
            while ( RcdFound723 != 0 )
            {
               init_level_properties723( ) ;
               getByPrimaryKey1PE723( ) ;
               addRow1PE723( ) ;
               scanNext1PE723( ) ;
            }
            scanEnd1PE723( ) ;
            nBlankRcdCount723 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4894ArtProULin = A4894ArtProULin ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
         standaloneNotModal1PE723( ) ;
         standaloneModal1PE723( ) ;
         sMode723 = Gx_mode ;
         while ( nGXsfl_79_idx < nRC_GXsfl_79 )
         {
            bGXsfl_79_Refreshing = true ;
            readRow1PE723( ) ;
            edtArtProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtArtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROCOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProCod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            if ( ( nRcdExists_723 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1PE723( ) ;
            }
            sendRow1PE723( ) ;
            bGXsfl_79_Refreshing = false ;
         }
         Gx_mode = sMode723 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4894ArtProULin = B4894ArtProULin ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount723 = (short)(5) ;
         nRcdExists_723 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1PE723( ) ;
            while ( RcdFound723 != 0 )
            {
               sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_79723( ) ;
               init_level_properties723( ) ;
               standaloneNotModal1PE723( ) ;
               getByPrimaryKey1PE723( ) ;
               standaloneModal1PE723( ) ;
               addRow1PE723( ) ;
               scanNext1PE723( ) ;
            }
            scanEnd1PE723( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode723 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_79723( ) ;
         initAll1PE723( ) ;
         init_level_properties723( ) ;
         B4894ArtProULin = A4894ArtProULin ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
         nRcdExists_723 = (short)(0) ;
         nIsMod_723 = (short)(0) ;
         nRcdDeleted_723 = (short)(0) ;
         nBlankRcdCount723 = (short)(nBlankRcdUsr723+nBlankRcdCount723) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount723 > 0 )
         {
            standaloneNotModal1PE723( ) ;
            standaloneModal1PE723( ) ;
            addRow1PE723( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtArtProLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount723 = (short)(nBlankRcdCount723-1) ;
         }
         Gx_mode = sMode723 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4894ArtProULin = B4894ArtProULin ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
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
      e111PE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vARTPROCOD_DATA"), AV30ArtProCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z4894ArtProULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4894ArtProULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4896ArtProFac = localUtil.ctond( httpContext.cgiGet( "Z4896ArtProFac")) ;
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            A4894ArtProULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4894ArtProULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4894ArtProULin = false ;
            O4894ArtProULin = (short)(localUtil.ctol( httpContext.cgiGet( "O4894ArtProULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV22CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23CliNom = httpContext.cgiGet( "vCLINOM") ;
            AV24ArtCod = httpContext.cgiGet( "vARTCOD") ;
            AV25ProCod = httpContext.cgiGet( "vPROCOD") ;
            AV26FasCod = httpContext.cgiGet( "vFASCOD") ;
            A4894ArtProULin = (short)(localUtil.ctol( httpContext.cgiGet( "ARTPROULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A4286FasForMul = httpContext.cgiGet( "FASFORMUL") ;
            n4286FasForMul = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Combo_artprocod_Objectcall = httpContext.cgiGet( "COMBO_ARTPROCOD_Objectcall") ;
            Combo_artprocod_Class = httpContext.cgiGet( "COMBO_ARTPROCOD_Class") ;
            Combo_artprocod_Icontype = httpContext.cgiGet( "COMBO_ARTPROCOD_Icontype") ;
            Combo_artprocod_Icon = httpContext.cgiGet( "COMBO_ARTPROCOD_Icon") ;
            Combo_artprocod_Caption = httpContext.cgiGet( "COMBO_ARTPROCOD_Caption") ;
            Combo_artprocod_Tooltip = httpContext.cgiGet( "COMBO_ARTPROCOD_Tooltip") ;
            Combo_artprocod_Cls = httpContext.cgiGet( "COMBO_ARTPROCOD_Cls") ;
            Combo_artprocod_Selectedvalue_set = httpContext.cgiGet( "COMBO_ARTPROCOD_Selectedvalue_set") ;
            Combo_artprocod_Selectedvalue_get = httpContext.cgiGet( "COMBO_ARTPROCOD_Selectedvalue_get") ;
            Combo_artprocod_Selectedtext_set = httpContext.cgiGet( "COMBO_ARTPROCOD_Selectedtext_set") ;
            Combo_artprocod_Selectedtext_get = httpContext.cgiGet( "COMBO_ARTPROCOD_Selectedtext_get") ;
            Combo_artprocod_Gamoauthtoken = httpContext.cgiGet( "COMBO_ARTPROCOD_Gamoauthtoken") ;
            Combo_artprocod_Ddointernalname = httpContext.cgiGet( "COMBO_ARTPROCOD_Ddointernalname") ;
            Combo_artprocod_Titlecontrolalign = httpContext.cgiGet( "COMBO_ARTPROCOD_Titlecontrolalign") ;
            Combo_artprocod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ARTPROCOD_Dropdownoptionstype") ;
            Combo_artprocod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTPROCOD_Enabled")) ;
            Combo_artprocod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTPROCOD_Visible")) ;
            Combo_artprocod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ARTPROCOD_Titlecontrolidtoreplace") ;
            Combo_artprocod_Datalisttype = httpContext.cgiGet( "COMBO_ARTPROCOD_Datalisttype") ;
            Combo_artprocod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTPROCOD_Allowmultipleselection")) ;
            Combo_artprocod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ARTPROCOD_Datalistfixedvalues") ;
            Combo_artprocod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTPROCOD_Isgriditem")) ;
            Combo_artprocod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTPROCOD_Hasdescription")) ;
            Combo_artprocod_Datalistproc = httpContext.cgiGet( "COMBO_ARTPROCOD_Datalistproc") ;
            Combo_artprocod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ARTPROCOD_Datalistprocparametersprefix") ;
            Combo_artprocod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ARTPROCOD_Remoteservicesparameters") ;
            Combo_artprocod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ARTPROCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_artprocod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTPROCOD_Includeonlyselectedoption")) ;
            Combo_artprocod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTPROCOD_Includeselectalloption")) ;
            Combo_artprocod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTPROCOD_Emptyitem")) ;
            Combo_artprocod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTPROCOD_Includeaddnewoption")) ;
            Combo_artprocod_Htmltemplate = httpContext.cgiGet( "COMBO_ARTPROCOD_Htmltemplate") ;
            Combo_artprocod_Multiplevaluestype = httpContext.cgiGet( "COMBO_ARTPROCOD_Multiplevaluestype") ;
            Combo_artprocod_Loadingdata = httpContext.cgiGet( "COMBO_ARTPROCOD_Loadingdata") ;
            Combo_artprocod_Noresultsfound = httpContext.cgiGet( "COMBO_ARTPROCOD_Noresultsfound") ;
            Combo_artprocod_Emptyitemtext = httpContext.cgiGet( "COMBO_ARTPROCOD_Emptyitemtext") ;
            Combo_artprocod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ARTPROCOD_Onlyselectedvalues") ;
            Combo_artprocod_Selectalltext = httpContext.cgiGet( "COMBO_ARTPROCOD_Selectalltext") ;
            Combo_artprocod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ARTPROCOD_Multiplevaluesseparator") ;
            Combo_artprocod_Addnewoptiontext = httpContext.cgiGet( "COMBO_ARTPROCOD_Addnewoptiontext") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtProFac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtProFac_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTPROFAC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtArtProFac_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4896ArtProFac = DecimalUtil.ZERO ;
               n4896ArtProFac = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4896ArtProFac", GXutil.ltrimstr( A4896ArtProFac, 8, 2));
            }
            else
            {
               A4896ArtProFac = localUtil.ctond( httpContext.cgiGet( edtArtProFac_Internalname)) ;
               n4896ArtProFac = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4896ArtProFac", GXutil.ltrimstr( A4896ArtProFac, 8, 2));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TFORACACopy1");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tforacacopy1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A457FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
                  sMode476 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode476 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound476 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1PE0( ) ;
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
                        e111PE2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121PE2 ();
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
         e121PE2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1PE476( ) ;
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
         disableAttributes1PE476( ) ;
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

   public void confirm_1PE0( )
   {
      beforeValidate1PE476( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PE476( ) ;
         }
         else
         {
            checkExtendedTable1PE476( ) ;
            closeExtendedTableCursors1PE476( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode476 = Gx_mode ;
         confirm_1PE723( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode476 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1PE723( )
   {
      s4894ArtProULin = O4894ArtProULin ;
      n4894ArtProULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRow1PE723( ) ;
         if ( ( nRcdExists_723 != 0 ) || ( nIsMod_723 != 0 ) )
         {
            getKey1PE723( ) ;
            if ( ( nRcdExists_723 == 0 ) && ( nRcdDeleted_723 == 0 ) )
            {
               if ( RcdFound723 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1PE723( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1PE723( ) ;
                     closeExtendedTableCursors1PE723( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4894ArtProULin = A4894ArtProULin ;
                     n4894ArtProULin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "ARTPROLIN_" + sGXsfl_79_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtArtProLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound723 != 0 )
               {
                  if ( nRcdDeleted_723 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1PE723( ) ;
                     load1PE723( ) ;
                     beforeValidate1PE723( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1PE723( ) ;
                        O4894ArtProULin = A4894ArtProULin ;
                        n4894ArtProULin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_723 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1PE723( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1PE723( ) ;
                           closeExtendedTableCursors1PE723( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4894ArtProULin = A4894ArtProULin ;
                           n4894ArtProULin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_723 == 0 )
                  {
                     GXCCtl = "ARTPROLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtArtProLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtArtProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtProCod_Internalname, GXutil.rtrim( A4898ArtProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4897ArtProLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4898ArtProCod_"+sGXsfl_79_idx, GXutil.rtrim( Z4898ArtProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_723_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_723_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_723_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_723 != 0 )
         {
            httpContext.changePostValue( "ARTPROLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROCOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4894ArtProULin = s4894ArtProULin ;
      n4894ArtProULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1PE0( )
   {
   }

   public void e111PE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tforacacopy1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tforacacopy1_impl.this.A396EmprCod = GXv_char2[0] ;
      tforacacopy1_impl.this.AV11EmprNom = GXv_char3[0] ;
      tforacacopy1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tforacacopy1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tforacacopy1_impl.this.AV10EmprCod = GXv_char4[0] ;
      tforacacopy1_impl.this.AV11EmprNom = GXv_char3[0] ;
      tforacacopy1_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV27WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV27WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_artprocod_Titlecontrolidtoreplace = edtArtProCod_Internalname ;
      ucCombo_artprocod.sendProperty(context, "", false, Combo_artprocod_Internalname, "TitleControlIdToReplace", Combo_artprocod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOARTPROCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV28TrnContext.fromxml(AV29WebSession.getValue("TrnContext"), null, null);
   }

   public void e121PE2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV28TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tforacacopy1ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOARTPROCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV30ArtProCod_Data ;
      GXv_char4[0] = AV31ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.tforacacopy1loaddvcombo(remoteHandle, context).execute( "ArtProCod", Gx_mode, AV10EmprCod, AV22CliCod, AV23CliNom, AV24ArtCod, AV25ProCod, AV26FasCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tforacacopy1_impl.this.AV31ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV30ArtProCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm1PE476( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4894ArtProULin = T01PE5_A4894ArtProULin[0] ;
            Z4896ArtProFac = T01PE5_A4896ArtProFac[0] ;
         }
         else
         {
            Z4894ArtProULin = A4894ArtProULin ;
            Z4896ArtProFac = A4896ArtProFac ;
         }
      }
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         Z279CliNom = T01PE8_A279CliNom[0] ;
      }
      if ( GX_JID == -20 )
      {
         Z4894ArtProULin = A4894ArtProULin ;
         Z4896ArtProFac = A4896ArtProFac ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z759ProDsc = A759ProDsc ;
         Z460FasDsc = A460FasDsc ;
         Z4286FasForMul = A4286FasForMul ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01PE6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01PE6_A407EmprNom[0] ;
      n407EmprNom = T01PE6_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (0==AV22CliCod) )
      {
         A252CliCod = AV22CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV22CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV22CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV23CliNom)==0) )
      {
         edtCliNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      }
      else
      {
         edtCliNom_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV23CliNom)==0) )
      {
         edtCliNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV24ArtCod)==0) )
      {
         A65ArtCod = AV24ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      if ( ! (GXutil.strcmp("", AV24ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      else
      {
         edtArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV24ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV25ProCod)==0) )
      {
         A758ProCod = AV25ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (GXutil.strcmp("", AV25ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV25ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV26FasCod)==0) )
      {
         A457FasCod = AV26FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      if ( ! (GXutil.strcmp("", AV26FasCod)==0) )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV26FasCod)==0) )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
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
         /* Using cursor T01PE8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         zm1PE476( 22) ;
         A279CliNom = T01PE8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(6);
         /* Using cursor T01PE9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01PE9_A69ArtDsc[0] ;
         n69ArtDsc = T01PE9_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(7);
         /* Using cursor T01PE10 */
         pr_default.execute(8, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01PE10_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(8);
         /* Using cursor T01PE12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01PE12_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A4286FasForMul = T01PE12_A4286FasForMul[0] ;
         n4286FasForMul = T01PE12_n4286FasForMul[0] ;
         pr_default.close(10);
         if ( ! (GXutil.strcmp("", AV23CliNom)==0) )
         {
            A279CliNom = AV23CliNom ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         }
      }
   }

   public void load1PE476( )
   {
      /* Using cursor T01PE13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A279CliNom = T01PE13_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T01PE13_A407EmprNom[0] ;
         n407EmprNom = T01PE13_n407EmprNom[0] ;
         A69ArtDsc = T01PE13_A69ArtDsc[0] ;
         n69ArtDsc = T01PE13_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A759ProDsc = T01PE13_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T01PE13_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A4286FasForMul = T01PE13_A4286FasForMul[0] ;
         n4286FasForMul = T01PE13_n4286FasForMul[0] ;
         A4894ArtProULin = T01PE13_A4894ArtProULin[0] ;
         n4894ArtProULin = T01PE13_n4894ArtProULin[0] ;
         A4896ArtProFac = T01PE13_A4896ArtProFac[0] ;
         n4896ArtProFac = T01PE13_n4896ArtProFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4896ArtProFac", GXutil.ltrimstr( A4896ArtProFac, 8, 2));
         zm1PE476( -20) ;
      }
      pr_default.close(11);
      onLoadActions1PE476( ) ;
   }

   public void onLoadActions1PE476( )
   {
      if ( ! (GXutil.strcmp("", AV23CliNom)==0) )
      {
         A279CliNom = AV23CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      }
   }

   public void checkExtendedTable1PE476( )
   {
      nIsDirty_476 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01PE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PE8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      if ( ! (GXutil.strcmp("", AV23CliNom)==0) )
      {
         nIsDirty_476 = (short)(1) ;
         A279CliNom = AV23CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      }
      /* Using cursor T01PE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01PE9_A69ArtDsc[0] ;
      n69ArtDsc = T01PE9_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(7);
      /* Using cursor T01PE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01PE10_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(8);
      /* Using cursor T01PE11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(9);
      /* Using cursor T01PE12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01PE12_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4286FasForMul = T01PE12_A4286FasForMul[0] ;
      n4286FasForMul = T01PE12_n4286FasForMul[0] ;
      pr_default.close(10);
   }

   public void closeExtendedTableCursors1PE476( )
   {
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_22( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01PE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PE8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_23( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod )
   {
      /* Using cursor T01PE14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01PE14_A69ArtDsc[0] ;
      n69ArtDsc = T01PE14_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_24( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01PE15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01PE15_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_25( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod ,
                          String A758ProCod )
   {
      /* Using cursor T01PE16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_26( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01PE17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01PE17_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4286FasForMul = T01PE17_A4286FasForMul[0] ;
      n4286FasForMul = T01PE17_n4286FasForMul[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey1PE476( )
   {
      /* Using cursor T01PE18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound476 = (short)(1) ;
      }
      else
      {
         RcdFound476 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01PE5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PE476( 20) ;
         RcdFound476 = (short)(1) ;
         A4894ArtProULin = T01PE5_A4894ArtProULin[0] ;
         n4894ArtProULin = T01PE5_n4894ArtProULin[0] ;
         A4896ArtProFac = T01PE5_A4896ArtProFac[0] ;
         n4896ArtProFac = T01PE5_n4896ArtProFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4896ArtProFac", GXutil.ltrimstr( A4896ArtProFac, 8, 2));
         A252CliCod = T01PE5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01PE5_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01PE5_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T01PE5_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         O4894ArtProULin = A4894ArtProULin ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         sMode476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PE476( ) ;
         if ( AnyError == 1 )
         {
            RcdFound476 = (short)(0) ;
            initializeNonKey1PE476( ) ;
         }
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound476 = (short)(0) ;
         initializeNonKey1PE476( ) ;
         sMode476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1PE476( ) ;
      if ( RcdFound476 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound476 = (short)(0) ;
      /* Using cursor T01PE19 */
      pr_default.execute(17, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A758ProCod, A758ProCod, A65ArtCod, Integer.valueOf(A252CliCod), A457FasCod, A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T01PE19_A252CliCod[0] < A252CliCod ) || ( T01PE19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE19_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01PE19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PE19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE19_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01PE19_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PE19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PE19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE19_A457FasCod[0], A457FasCod) < 0 ) ) && ( GXutil.strcmp(T01PE19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T01PE19_A252CliCod[0] > A252CliCod ) || ( T01PE19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE19_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01PE19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PE19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE19_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01PE19_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PE19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PE19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE19_A457FasCod[0], A457FasCod) > 0 ) ) && ( GXutil.strcmp(T01PE19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01PE19_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01PE19_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = T01PE19_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A457FasCod = T01PE19_A457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound476 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound476 = (short)(0) ;
      /* Using cursor T01PE20 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A758ProCod, A758ProCod, A65ArtCod, Integer.valueOf(A252CliCod), A457FasCod, A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T01PE20_A252CliCod[0] > A252CliCod ) || ( T01PE20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE20_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01PE20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PE20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE20_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01PE20_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PE20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PE20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE20_A457FasCod[0], A457FasCod) > 0 ) ) && ( GXutil.strcmp(T01PE20_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T01PE20_A252CliCod[0] < A252CliCod ) || ( T01PE20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE20_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01PE20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PE20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE20_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01PE20_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PE20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PE20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PE20_A457FasCod[0], A457FasCod) < 0 ) ) && ( GXutil.strcmp(T01PE20_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01PE20_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01PE20_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = T01PE20_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A457FasCod = T01PE20_A457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound476 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PE476( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4894ArtProULin = O4894ArtProULin ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PE476( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound476 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A457FasCod = Z457FasCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4894ArtProULin = O4894ArtProULin ;
               n4894ArtProULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A4894ArtProULin = O4894ArtProULin ;
               n4894ArtProULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
               update1PE476( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               /* Insert record */
               A4894ArtProULin = O4894ArtProULin ;
               n4894ArtProULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PE476( ) ;
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
                  A4894ArtProULin = O4894ArtProULin ;
                  n4894ArtProULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1PE476( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = Z457FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4894ArtProULin = O4894ArtProULin ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1PE476( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z4894ArtProULin != T01PE4_A4894ArtProULin[0] ) || ( DecimalUtil.compareTo(Z4896ArtProFac, T01PE4_A4896ArtProFac[0]) != 0 ) )
         {
            if ( Z4894ArtProULin != T01PE4_A4894ArtProULin[0] )
            {
               GXutil.writeLogln("tforacacopy1:[seudo value changed for attri]"+"ArtProULin");
               GXutil.writeLogRaw("Old: ",Z4894ArtProULin);
               GXutil.writeLogRaw("Current: ",T01PE4_A4894ArtProULin[0]);
            }
            if ( DecimalUtil.compareTo(Z4896ArtProFac, T01PE4_A4896ArtProFac[0]) != 0 )
            {
               GXutil.writeLogln("tforacacopy1:[seudo value changed for attri]"+"ArtProFac");
               GXutil.writeLogRaw("Old: ",Z4896ArtProFac);
               GXutil.writeLogRaw("Current: ",T01PE4_A4896ArtProFac[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPSERPAU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01PE21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z279CliNom, T01PE21_A279CliNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T01PE21_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tforacacopy1:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T01PE21_A279CliNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PE476( )
   {
      beforeValidate1PE476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PE476( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PE476( 0) ;
         checkOptimisticConcurrency1PE476( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PE476( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PE476( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PE22 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n4894ArtProULin), Short.valueOf(A4894ArtProULin), Boolean.valueOf(n4896ArtProFac), A4896ArtProFac, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
                  if ( (pr_default.getStatus(20) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11PE476( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1PE476( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1PE0( ) ;
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
            load1PE476( ) ;
         }
         endLevel1PE476( ) ;
      }
      closeExtendedTableCursors1PE476( ) ;
   }

   public void update1PE476( )
   {
      beforeValidate1PE476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PE476( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PE476( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PE476( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PE476( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PE23 */
                  pr_default.execute(21, new Object[] {Boolean.valueOf(n4894ArtProULin), Short.valueOf(A4894ArtProULin), Boolean.valueOf(n4896ArtProFac), A4896ArtProFac, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PE476( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11PE476( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1PE476( ) ;
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
         endLevel1PE476( ) ;
      }
      closeExtendedTableCursors1PE476( ) ;
   }

   public void deferredUpdate1PE476( )
   {
   }

   public void delete( )
   {
      beforeValidate1PE476( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PE476( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PE476( ) ;
         afterConfirm1PE476( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PE476( ) ;
            if ( AnyError == 0 )
            {
               A4894ArtProULin = O4894ArtProULin ;
               n4894ArtProULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
               scanStart1PE723( ) ;
               while ( RcdFound723 != 0 )
               {
                  getByPrimaryKey1PE723( ) ;
                  delete1PE723( ) ;
                  scanNext1PE723( ) ;
                  O4894ArtProULin = A4894ArtProULin ;
                  n4894ArtProULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
               }
               scanEnd1PE723( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PE24 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11PE476( ) ;
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
      sMode476 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PE476( ) ;
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PE476( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PE25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         Z279CliNom = T01PE25_A279CliNom[0] ;
         A279CliNom = T01PE25_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(23);
         if ( ! (GXutil.strcmp("", AV23CliNom)==0) )
         {
            A279CliNom = AV23CliNom ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         }
         /* Using cursor T01PE26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01PE26_A69ArtDsc[0] ;
         n69ArtDsc = T01PE26_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(24);
         /* Using cursor T01PE27 */
         pr_default.execute(25, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01PE27_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(25);
         /* Using cursor T01PE28 */
         pr_default.execute(26, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01PE28_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A4286FasForMul = T01PE28_A4286FasForMul[0] ;
         n4286FasForMul = T01PE28_n4286FasForMul[0] ;
         pr_default.close(26);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PE29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametro por Fase-Serie-Clien", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevel1PE723( )
   {
      s4894ArtProULin = O4894ArtProULin ;
      n4894ArtProULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRow1PE723( ) ;
         if ( ( nRcdExists_723 != 0 ) || ( nIsMod_723 != 0 ) )
         {
            standaloneNotModal1PE723( ) ;
            getKey1PE723( ) ;
            if ( ( nRcdExists_723 == 0 ) && ( nRcdDeleted_723 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1PE723( ) ;
            }
            else
            {
               if ( RcdFound723 != 0 )
               {
                  if ( ( nRcdDeleted_723 != 0 ) && ( nRcdExists_723 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1PE723( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_723 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1PE723( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_723 == 0 )
                  {
                     GXCCtl = "ARTPROLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtArtProLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4894ArtProULin = A4894ArtProULin ;
            n4894ArtProULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
         }
         httpContext.changePostValue( edtArtProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtProCod_Internalname, GXutil.rtrim( A4898ArtProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4897ArtProLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4898ArtProCod_"+sGXsfl_79_idx, GXutil.rtrim( Z4898ArtProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_723_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_723_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_723_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_723 != 0 )
         {
            httpContext.changePostValue( "ARTPROLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTPROCOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1PE723( ) ;
      if ( AnyError != 0 )
      {
         O4894ArtProULin = s4894ArtProULin ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
      }
      nRcdExists_723 = (short)(0) ;
      nIsMod_723 = (short)(0) ;
      nRcdDeleted_723 = (short)(0) ;
   }

   public void processLevel1PE476( )
   {
      /* Save parent mode. */
      sMode476 = Gx_mode ;
      processNestedLevel1PE723( ) ;
      if ( AnyError != 0 )
      {
         O4894ArtProULin = s4894ArtProULin ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01PE30 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n4894ArtProULin), Short.valueOf(A4894ArtProULin), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
   }

   public void updateTablesN11PE476( )
   {
      /* Using cursor T01PE31 */
      pr_default.execute(29, new Object[] {A279CliNom, A396EmprCod, Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
   }

   public void endLevel1PE476( )
   {
      pr_default.close(2);
      pr_default.close(19);
      if ( AnyError == 0 )
      {
         beforeComplete1PE476( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tforacacopy1");
         if ( AnyError == 0 )
         {
            confirmValues1PE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tforacacopy1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PE476( )
   {
      /* Scan By routine */
      /* Using cursor T01PE32 */
      pr_default.execute(30, new Object[] {A396EmprCod});
      RcdFound476 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A252CliCod = T01PE32_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01PE32_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01PE32_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T01PE32_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PE476( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound476 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A252CliCod = T01PE32_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01PE32_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01PE32_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T01PE32_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
   }

   public void scanEnd1PE476( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1PE476( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PE476( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PE476( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PE476( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PE476( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PE476( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PE476( )
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
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtArtProFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProFac_Enabled), 5, 0), true);
   }

   public void zm1PE723( int GX_JID )
   {
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4898ArtProCod = T01PE3_A4898ArtProCod[0] ;
         }
         else
         {
            Z4898ArtProCod = A4898ArtProCod ;
         }
      }
      if ( GX_JID == -27 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z4897ArtProLin = A4897ArtProLin ;
         Z4898ArtProCod = A4898ArtProCod ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
      }
   }

   public void standaloneNotModal1PE723( )
   {
   }

   public void standaloneModal1PE723( )
   {
      if ( isIns( )  )
      {
         A4894ArtProULin = (short)(O4894ArtProULin+10) ;
         n4894ArtProULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A4897ArtProLin = A4894ArtProULin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtArtProLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         edtArtProLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
   }

   public void load1PE723( )
   {
      /* Using cursor T01PE33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound723 = (short)(1) ;
         A4898ArtProCod = T01PE33_A4898ArtProCod[0] ;
         zm1PE723( -27) ;
      }
      pr_default.close(31);
      onLoadActions1PE723( ) ;
   }

   public void onLoadActions1PE723( )
   {
   }

   public void checkExtendedTable1PE723( )
   {
      nIsDirty_723 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1PE723( ) ;
   }

   public void closeExtendedTableCursors1PE723( )
   {
   }

   public void enableDisable1PE723( )
   {
   }

   public void getKey1PE723( )
   {
      /* Using cursor T01PE34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound723 = (short)(1) ;
      }
      else
      {
         RcdFound723 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKey1PE723( )
   {
      /* Using cursor T01PE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01PE3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PE723( 27) ;
         RcdFound723 = (short)(1) ;
         initializeNonKey1PE723( ) ;
         A4897ArtProLin = T01PE3_A4897ArtProLin[0] ;
         A4898ArtProCod = T01PE3_A4898ArtProCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z4897ArtProLin = A4897ArtProLin ;
         sMode723 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PE723( ) ;
         Gx_mode = sMode723 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound723 = (short)(0) ;
         initializeNonKey1PE723( ) ;
         sMode723 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1PE723( ) ;
         Gx_mode = sMode723 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1PE723( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1PE723( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPArtFor"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4898ArtProCod, T01PE2_A4898ArtProCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4898ArtProCod, T01PE2_A4898ArtProCod[0]) != 0 )
            {
               GXutil.writeLogln("tforacacopy1:[seudo value changed for attri]"+"ArtProCod");
               GXutil.writeLogRaw("Old: ",Z4898ArtProCod);
               GXutil.writeLogRaw("Current: ",T01PE2_A4898ArtProCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPArtFor"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PE723( )
   {
      beforeValidate1PE723( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PE723( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PE723( 0) ;
         checkOptimisticConcurrency1PE723( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PE723( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PE723( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PE35 */
                  pr_default.execute(33, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Short.valueOf(A4897ArtProLin), A4898ArtProCod, A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPArtFor");
                  if ( (pr_default.getStatus(33) == 1) )
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
            load1PE723( ) ;
         }
         endLevel1PE723( ) ;
      }
      closeExtendedTableCursors1PE723( ) ;
   }

   public void update1PE723( )
   {
      beforeValidate1PE723( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PE723( ) ;
      }
      if ( ( nIsMod_723 != 0 ) || ( nIsDirty_723 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1PE723( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1PE723( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1PE723( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01PE36 */
                     pr_default.execute(34, new Object[] {A4898ArtProCod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPArtFor");
                     if ( (pr_default.getStatus(34) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPArtFor"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1PE723( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1PE723( ) ;
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
            endLevel1PE723( ) ;
         }
      }
      closeExtendedTableCursors1PE723( ) ;
   }

   public void deferredUpdate1PE723( )
   {
   }

   public void delete1PE723( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PE723( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PE723( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PE723( ) ;
         afterConfirm1PE723( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PE723( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PE37 */
               pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPArtFor");
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
      sMode723 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PE723( ) ;
      Gx_mode = sMode723 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PE723( )
   {
      standaloneModal1PE723( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1PE723( )
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

   public void scanStart1PE723( )
   {
      /* Scan By routine */
      /* Using cursor T01PE38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      RcdFound723 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound723 = (short)(1) ;
         A4897ArtProLin = T01PE38_A4897ArtProLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PE723( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound723 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound723 = (short)(1) ;
         A4897ArtProLin = T01PE38_A4897ArtProLin[0] ;
      }
   }

   public void scanEnd1PE723( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1PE723( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PE723( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PE723( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PE723( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PE723( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PE723( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PE723( )
   {
      edtArtProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtArtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProCod_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void send_integrity_lvl_hashes1PE723( )
   {
   }

   public void send_integrity_lvl_hashes1PE476( )
   {
   }

   public void subsflControlProps_79723( )
   {
      edtArtProLin_Internalname = "ARTPROLIN_"+sGXsfl_79_idx ;
      edtArtProCod_Internalname = "ARTPROCOD_"+sGXsfl_79_idx ;
   }

   public void subsflControlProps_fel_79723( )
   {
      edtArtProLin_Internalname = "ARTPROLIN_"+sGXsfl_79_fel_idx ;
      edtArtProCod_Internalname = "ARTPROCOD_"+sGXsfl_79_fel_idx ;
   }

   public void addRow1PE723( )
   {
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_79723( ) ;
      sendRow1PE723( ) ;
   }

   public void sendRow1PE723( )
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
         if ( ((int)((nGXsfl_79_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_723_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4897ArtProLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtArtProLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_723_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtProCod_Internalname,GXutil.rtrim( A4898ArtProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtArtProCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1PE723( ) ;
      GXCCtl = "Z4897ArtProLin_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4897ArtProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4898ArtProCod_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4898ArtProCod));
      GXCCtl = "nRcdDeleted_723_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_723_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_723_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_723, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_79_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV28TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV28TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV22CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCLINOM_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV23CliNom));
      GXCCtl = "vARTCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV24ArtCod));
      GXCCtl = "vPROCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV25ProCod));
      GXCCtl = "vFASCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV26FasCod));
      GXCCtl = "EMPRCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPROLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPROCOD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1PE723( )
   {
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_79723( ) ;
      edtArtProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTPROCOD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ARTPROLIN_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtProLin_Internalname ;
         wbErr = true ;
         A4897ArtProLin = (short)(0) ;
      }
      else
      {
         A4897ArtProLin = (short)(localUtil.ctol( httpContext.cgiGet( edtArtProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4898ArtProCod = httpContext.cgiGet( edtArtProCod_Internalname) ;
      GXCCtl = "Z4897ArtProLin_" + sGXsfl_79_idx ;
      Z4897ArtProLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4898ArtProCod_" + sGXsfl_79_idx ;
      Z4898ArtProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_723_" + sGXsfl_79_idx ;
      nRcdDeleted_723 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_723_" + sGXsfl_79_idx ;
      nRcdExists_723 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_723_" + sGXsfl_79_idx ;
      nIsMod_723 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtArtProLin_Enabled = edtArtProLin_Enabled ;
   }

   public void confirmValues1PE0( )
   {
      nGXsfl_79_idx = 0 ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_79723( ) ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_79723( ) ;
         httpContext.changePostValue( "Z4897ArtProLin_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4897ArtProLin_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4897ArtProLin_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z4898ArtProCod_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z4898ArtProCod_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4898ArtProCod_"+sGXsfl_79_idx) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tforacacopy1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV22CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV23CliNom)),GXutil.URLEncode(GXutil.rtrim(AV24ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV25ProCod)),GXutil.URLEncode(GXutil.rtrim(AV26FasCod))}, new String[] {"Gx_mode","EmprCod","CliCod","CliNom","ArtCod","ProCod","FasCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFORACACopy1");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tforacacopy1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4894ArtProULin", GXutil.ltrim( localUtil.ntoc( Z4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4896ArtProFac", GXutil.ltrim( localUtil.ntoc( Z4896ArtProFac, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "O4894ArtProULin", GXutil.ltrim( localUtil.ntoc( O4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_79", GXutil.ltrim( localUtil.ntoc( nGXsfl_79_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vARTPROCOD_DATA", AV30ArtProCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vARTPROCOD_DATA", AV30ArtProCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV28TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV28TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV28TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV22CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV23CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV24ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV25ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV26FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPROULIN", GXutil.ltrim( localUtil.ntoc( A4894ArtProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORMUL", GXutil.rtrim( A4286FasForMul));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTPROCOD_Objectcall", GXutil.rtrim( Combo_artprocod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTPROCOD_Cls", GXutil.rtrim( Combo_artprocod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTPROCOD_Enabled", GXutil.booltostr( Combo_artprocod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTPROCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_artprocod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTPROCOD_Isgriditem", GXutil.booltostr( Combo_artprocod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTPROCOD_Emptyitem", GXutil.booltostr( Combo_artprocod_Emptyitem));
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
      return formatLink("app.tforacacopy1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV22CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV23CliNom)),GXutil.URLEncode(GXutil.rtrim(AV24ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV25ProCod)),GXutil.URLEncode(GXutil.rtrim(AV26FasCod))}, new String[] {"Gx_mode","EmprCod","CliCod","CliNom","ArtCod","ProCod","FasCod"})  ;
   }

   public String getPgmname( )
   {
      return "TFORACACopy1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tratamientos Quimicos", "") ;
   }

   public void initializeNonKey1PE476( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4286FasForMul = "" ;
      n4286FasForMul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      A4894ArtProULin = (short)(0) ;
      n4894ArtProULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
      A4896ArtProFac = DecimalUtil.ZERO ;
      n4896ArtProFac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4896ArtProFac", GXutil.ltrimstr( A4896ArtProFac, 8, 2));
      O4894ArtProULin = A4894ArtProULin ;
      n4894ArtProULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
      Z4894ArtProULin = (short)(0) ;
      Z4896ArtProFac = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
   }

   public void initAll1PE476( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      initializeNonKey1PE476( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1PE723( )
   {
      A4898ArtProCod = "" ;
      Z4898ArtProCod = "" ;
   }

   public void initAll1PE723( )
   {
      A4897ArtProLin = (short)(0) ;
      initializeNonKey1PE723( ) ;
   }

   public void standaloneModalInsert1PE723( )
   {
      A4894ArtProULin = i4894ArtProULin ;
      n4894ArtProULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4894ArtProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4894ArtProULin), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211673598", true, true);
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
      httpContext.AddJavascriptSource("tforacacopy1.js", "?20268211673599", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties723( )
   {
      edtArtProLin_Enabled = defedtArtProLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtProLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void startgridcontrol79( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4897ArtProLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4898ArtProCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtArtProFac_Internalname = "ARTPROFAC" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtArtProLin_Internalname = "ARTPROLIN" ;
      edtArtProCod_Internalname = "ARTPROCOD" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_artprocod_Internalname = "COMBO_ARTPROCOD" ;
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
      Combo_artprocod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Tratamientos Quimicos", "") );
      edtArtProCod_Jsonclick = "" ;
      edtArtProLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_artprocod_Titlecontrolidtoreplace = "" ;
      edtArtProCod_Enabled = 1 ;
      edtArtProLin_Enabled = 1 ;
      Combo_artprocod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_artprocod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_artprocod_Cls = "ExtendedCombo" ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtArtProFac_Jsonclick = "" ;
      edtArtProFac_Enabled = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
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
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
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
      subsflControlProps_79723( ) ;
      while ( nGXsfl_79_idx <= nRC_GXsfl_79 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1PE723( ) ;
         standaloneModal1PE723( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1PE723( ) ;
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_79723( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
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
      /* Using cursor T01PE25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      Z279CliNom = T01PE25_A279CliNom[0] ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01PE25_A279CliNom[0] ;
      pr_default.close(23);
      if ( ! (GXutil.strcmp("", AV23CliNom)==0) )
      {
         A279CliNom = AV23CliNom ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n69ArtDsc = false ;
      /* Using cursor T01PE26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A69ArtDsc = T01PE26_A69ArtDsc[0] ;
      n69ArtDsc = T01PE26_n69ArtDsc[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
   }

   public void valid_Procod( )
   {
      /* Using cursor T01PE27 */
      pr_default.execute(25, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T01PE27_A759ProDsc[0] ;
      pr_default.close(25);
      /* Using cursor T01PE39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Fascod( )
   {
      n4286FasForMul = false ;
      /* Using cursor T01PE28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01PE28_A460FasDsc[0] ;
      A4286FasForMul = T01PE28_A4286FasForMul[0] ;
      n4286FasForMul = T01PE28_n4286FasForMul[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", GXutil.rtrim( A4286FasForMul));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV22CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV23CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV24ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV25ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV26FasCod',fld:'vFASCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV22CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV23CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV24ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV25ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV26FasCod',fld:'vFASCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121PE2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV23CliNom',fld:'vCLINOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'}]}");
      setEventMetadata("VALID_ARTPROLIN","{handler:'valid_Artprolin',iparms:[]");
      setEventMetadata("VALID_ARTPROLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Artprocod',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(37);
      pr_default.close(23);
      pr_default.close(26);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV10EmprCod = "" ;
      wcpOAV23CliNom = "" ;
      wcpOAV24ArtCod = "" ;
      wcpOAV25ProCod = "" ;
      wcpOAV26FasCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      Z4896ArtProFac = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z4898ArtProCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      Gx_mode = "" ;
      AV10EmprCod = "" ;
      AV23CliNom = "" ;
      AV24ArtCod = "" ;
      AV25ProCod = "" ;
      AV26FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      A759ProDsc = "" ;
      A460FasDsc = "" ;
      A4896ArtProFac = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucCombo_artprocod = new com.genexus.webpanels.GXUserControl();
      Combo_artprocod_Caption = "" ;
      AV30ArtProCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode723 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A4286FasForMul = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_artprocod_Objectcall = "" ;
      Combo_artprocod_Class = "" ;
      Combo_artprocod_Icontype = "" ;
      Combo_artprocod_Icon = "" ;
      Combo_artprocod_Tooltip = "" ;
      Combo_artprocod_Selectedvalue_set = "" ;
      Combo_artprocod_Selectedvalue_get = "" ;
      Combo_artprocod_Selectedtext_set = "" ;
      Combo_artprocod_Selectedtext_get = "" ;
      Combo_artprocod_Gamoauthtoken = "" ;
      Combo_artprocod_Ddointernalname = "" ;
      Combo_artprocod_Titlecontrolalign = "" ;
      Combo_artprocod_Dropdownoptionstype = "" ;
      Combo_artprocod_Datalisttype = "" ;
      Combo_artprocod_Datalistfixedvalues = "" ;
      Combo_artprocod_Datalistproc = "" ;
      Combo_artprocod_Datalistprocparametersprefix = "" ;
      Combo_artprocod_Remoteservicesparameters = "" ;
      Combo_artprocod_Htmltemplate = "" ;
      Combo_artprocod_Multiplevaluestype = "" ;
      Combo_artprocod_Loadingdata = "" ;
      Combo_artprocod_Noresultsfound = "" ;
      Combo_artprocod_Emptyitemtext = "" ;
      Combo_artprocod_Onlyselectedvalues = "" ;
      Combo_artprocod_Selectalltext = "" ;
      Combo_artprocod_Multiplevaluesseparator = "" ;
      Combo_artprocod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode476 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A4898ArtProCod = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV27WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV29WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV31ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z69ArtDsc = "" ;
      Z759ProDsc = "" ;
      Z460FasDsc = "" ;
      Z4286FasForMul = "" ;
      T01PE6_A407EmprNom = new String[] {""} ;
      T01PE6_n407EmprNom = new boolean[] {false} ;
      T01PE8_A279CliNom = new String[] {""} ;
      T01PE9_A69ArtDsc = new String[] {""} ;
      T01PE9_n69ArtDsc = new boolean[] {false} ;
      T01PE10_A759ProDsc = new String[] {""} ;
      T01PE12_A460FasDsc = new String[] {""} ;
      T01PE12_A4286FasForMul = new String[] {""} ;
      T01PE12_n4286FasForMul = new boolean[] {false} ;
      T01PE13_A279CliNom = new String[] {""} ;
      T01PE13_A407EmprNom = new String[] {""} ;
      T01PE13_n407EmprNom = new boolean[] {false} ;
      T01PE13_A69ArtDsc = new String[] {""} ;
      T01PE13_n69ArtDsc = new boolean[] {false} ;
      T01PE13_A759ProDsc = new String[] {""} ;
      T01PE13_A460FasDsc = new String[] {""} ;
      T01PE13_A4286FasForMul = new String[] {""} ;
      T01PE13_n4286FasForMul = new boolean[] {false} ;
      T01PE13_A4894ArtProULin = new short[1] ;
      T01PE13_n4894ArtProULin = new boolean[] {false} ;
      T01PE13_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PE13_n4896ArtProFac = new boolean[] {false} ;
      T01PE13_A396EmprCod = new String[] {""} ;
      T01PE13_A252CliCod = new int[1] ;
      T01PE13_A65ArtCod = new String[] {""} ;
      T01PE13_A758ProCod = new String[] {""} ;
      T01PE13_A457FasCod = new String[] {""} ;
      T01PE11_A396EmprCod = new String[] {""} ;
      T01PE14_A69ArtDsc = new String[] {""} ;
      T01PE14_n69ArtDsc = new boolean[] {false} ;
      T01PE15_A759ProDsc = new String[] {""} ;
      T01PE16_A396EmprCod = new String[] {""} ;
      T01PE17_A460FasDsc = new String[] {""} ;
      T01PE17_A4286FasForMul = new String[] {""} ;
      T01PE17_n4286FasForMul = new boolean[] {false} ;
      T01PE18_A396EmprCod = new String[] {""} ;
      T01PE18_A252CliCod = new int[1] ;
      T01PE18_A65ArtCod = new String[] {""} ;
      T01PE18_A758ProCod = new String[] {""} ;
      T01PE18_A457FasCod = new String[] {""} ;
      T01PE5_A4894ArtProULin = new short[1] ;
      T01PE5_n4894ArtProULin = new boolean[] {false} ;
      T01PE5_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PE5_n4896ArtProFac = new boolean[] {false} ;
      T01PE5_A396EmprCod = new String[] {""} ;
      T01PE5_A252CliCod = new int[1] ;
      T01PE5_A65ArtCod = new String[] {""} ;
      T01PE5_A758ProCod = new String[] {""} ;
      T01PE5_A457FasCod = new String[] {""} ;
      T01PE19_A396EmprCod = new String[] {""} ;
      T01PE19_A252CliCod = new int[1] ;
      T01PE19_A65ArtCod = new String[] {""} ;
      T01PE19_A758ProCod = new String[] {""} ;
      T01PE19_A457FasCod = new String[] {""} ;
      T01PE20_A396EmprCod = new String[] {""} ;
      T01PE20_A252CliCod = new int[1] ;
      T01PE20_A65ArtCod = new String[] {""} ;
      T01PE20_A758ProCod = new String[] {""} ;
      T01PE20_A457FasCod = new String[] {""} ;
      T01PE4_A4894ArtProULin = new short[1] ;
      T01PE4_n4894ArtProULin = new boolean[] {false} ;
      T01PE4_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PE4_n4896ArtProFac = new boolean[] {false} ;
      T01PE4_A396EmprCod = new String[] {""} ;
      T01PE4_A252CliCod = new int[1] ;
      T01PE4_A65ArtCod = new String[] {""} ;
      T01PE4_A758ProCod = new String[] {""} ;
      T01PE4_A457FasCod = new String[] {""} ;
      T01PE21_A279CliNom = new String[] {""} ;
      T01PE25_A279CliNom = new String[] {""} ;
      T01PE26_A69ArtDsc = new String[] {""} ;
      T01PE26_n69ArtDsc = new boolean[] {false} ;
      T01PE27_A759ProDsc = new String[] {""} ;
      T01PE28_A460FasDsc = new String[] {""} ;
      T01PE28_A4286FasForMul = new String[] {""} ;
      T01PE28_n4286FasForMul = new boolean[] {false} ;
      T01PE29_A396EmprCod = new String[] {""} ;
      T01PE29_A252CliCod = new int[1] ;
      T01PE29_A65ArtCod = new String[] {""} ;
      T01PE29_A758ProCod = new String[] {""} ;
      T01PE29_A457FasCod = new String[] {""} ;
      T01PE29_A1664ParFasCod = new short[1] ;
      T01PE32_A396EmprCod = new String[] {""} ;
      T01PE32_A252CliCod = new int[1] ;
      T01PE32_A65ArtCod = new String[] {""} ;
      T01PE32_A758ProCod = new String[] {""} ;
      T01PE32_A457FasCod = new String[] {""} ;
      T01PE33_A252CliCod = new int[1] ;
      T01PE33_A65ArtCod = new String[] {""} ;
      T01PE33_A758ProCod = new String[] {""} ;
      T01PE33_A4897ArtProLin = new short[1] ;
      T01PE33_A4898ArtProCod = new String[] {""} ;
      T01PE33_A396EmprCod = new String[] {""} ;
      T01PE33_A457FasCod = new String[] {""} ;
      T01PE34_A396EmprCod = new String[] {""} ;
      T01PE34_A252CliCod = new int[1] ;
      T01PE34_A65ArtCod = new String[] {""} ;
      T01PE34_A758ProCod = new String[] {""} ;
      T01PE34_A457FasCod = new String[] {""} ;
      T01PE34_A4897ArtProLin = new short[1] ;
      T01PE3_A252CliCod = new int[1] ;
      T01PE3_A65ArtCod = new String[] {""} ;
      T01PE3_A758ProCod = new String[] {""} ;
      T01PE3_A4897ArtProLin = new short[1] ;
      T01PE3_A4898ArtProCod = new String[] {""} ;
      T01PE3_A396EmprCod = new String[] {""} ;
      T01PE3_A457FasCod = new String[] {""} ;
      T01PE2_A252CliCod = new int[1] ;
      T01PE2_A65ArtCod = new String[] {""} ;
      T01PE2_A758ProCod = new String[] {""} ;
      T01PE2_A4897ArtProLin = new short[1] ;
      T01PE2_A4898ArtProCod = new String[] {""} ;
      T01PE2_A396EmprCod = new String[] {""} ;
      T01PE2_A457FasCod = new String[] {""} ;
      T01PE38_A396EmprCod = new String[] {""} ;
      T01PE38_A252CliCod = new int[1] ;
      T01PE38_A65ArtCod = new String[] {""} ;
      T01PE38_A758ProCod = new String[] {""} ;
      T01PE38_A457FasCod = new String[] {""} ;
      T01PE38_A4897ArtProLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      T01PE39_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tforacacopy1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tforacacopy1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tforacacopy1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tforacacopy1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tforacacopy1__default(),
         new Object[] {
             new Object[] {
            T01PE2_A252CliCod, T01PE2_A65ArtCod, T01PE2_A758ProCod, T01PE2_A4897ArtProLin, T01PE2_A4898ArtProCod, T01PE2_A396EmprCod, T01PE2_A457FasCod
            }
            , new Object[] {
            T01PE3_A252CliCod, T01PE3_A65ArtCod, T01PE3_A758ProCod, T01PE3_A4897ArtProLin, T01PE3_A4898ArtProCod, T01PE3_A396EmprCod, T01PE3_A457FasCod
            }
            , new Object[] {
            T01PE4_A4894ArtProULin, T01PE4_n4894ArtProULin, T01PE4_A4896ArtProFac, T01PE4_n4896ArtProFac, T01PE4_A396EmprCod, T01PE4_A252CliCod, T01PE4_A65ArtCod, T01PE4_A758ProCod, T01PE4_A457FasCod
            }
            , new Object[] {
            T01PE5_A4894ArtProULin, T01PE5_n4894ArtProULin, T01PE5_A4896ArtProFac, T01PE5_n4896ArtProFac, T01PE5_A396EmprCod, T01PE5_A252CliCod, T01PE5_A65ArtCod, T01PE5_A758ProCod, T01PE5_A457FasCod
            }
            , new Object[] {
            T01PE6_A407EmprNom, T01PE6_n407EmprNom
            }
            , new Object[] {
            T01PE7_A279CliNom
            }
            , new Object[] {
            T01PE8_A279CliNom
            }
            , new Object[] {
            T01PE9_A69ArtDsc, T01PE9_n69ArtDsc
            }
            , new Object[] {
            T01PE10_A759ProDsc
            }
            , new Object[] {
            T01PE11_A396EmprCod
            }
            , new Object[] {
            T01PE12_A460FasDsc, T01PE12_A4286FasForMul, T01PE12_n4286FasForMul
            }
            , new Object[] {
            T01PE13_A279CliNom, T01PE13_A407EmprNom, T01PE13_n407EmprNom, T01PE13_A69ArtDsc, T01PE13_n69ArtDsc, T01PE13_A759ProDsc, T01PE13_A460FasDsc, T01PE13_A4286FasForMul, T01PE13_n4286FasForMul, T01PE13_A4894ArtProULin,
            T01PE13_n4894ArtProULin, T01PE13_A4896ArtProFac, T01PE13_n4896ArtProFac, T01PE13_A396EmprCod, T01PE13_A252CliCod, T01PE13_A65ArtCod, T01PE13_A758ProCod, T01PE13_A457FasCod
            }
            , new Object[] {
            T01PE14_A69ArtDsc, T01PE14_n69ArtDsc
            }
            , new Object[] {
            T01PE15_A759ProDsc
            }
            , new Object[] {
            T01PE16_A396EmprCod
            }
            , new Object[] {
            T01PE17_A460FasDsc, T01PE17_A4286FasForMul, T01PE17_n4286FasForMul
            }
            , new Object[] {
            T01PE18_A396EmprCod, T01PE18_A252CliCod, T01PE18_A65ArtCod, T01PE18_A758ProCod, T01PE18_A457FasCod
            }
            , new Object[] {
            T01PE19_A396EmprCod, T01PE19_A252CliCod, T01PE19_A65ArtCod, T01PE19_A758ProCod, T01PE19_A457FasCod
            }
            , new Object[] {
            T01PE20_A396EmprCod, T01PE20_A252CliCod, T01PE20_A65ArtCod, T01PE20_A758ProCod, T01PE20_A457FasCod
            }
            , new Object[] {
            T01PE21_A279CliNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PE25_A279CliNom
            }
            , new Object[] {
            T01PE26_A69ArtDsc, T01PE26_n69ArtDsc
            }
            , new Object[] {
            T01PE27_A759ProDsc
            }
            , new Object[] {
            T01PE28_A460FasDsc, T01PE28_A4286FasForMul, T01PE28_n4286FasForMul
            }
            , new Object[] {
            T01PE29_A396EmprCod, T01PE29_A252CliCod, T01PE29_A65ArtCod, T01PE29_A758ProCod, T01PE29_A457FasCod, T01PE29_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PE32_A396EmprCod, T01PE32_A252CliCod, T01PE32_A65ArtCod, T01PE32_A758ProCod, T01PE32_A457FasCod
            }
            , new Object[] {
            T01PE33_A252CliCod, T01PE33_A65ArtCod, T01PE33_A758ProCod, T01PE33_A4897ArtProLin, T01PE33_A4898ArtProCod, T01PE33_A396EmprCod, T01PE33_A457FasCod
            }
            , new Object[] {
            T01PE34_A396EmprCod, T01PE34_A252CliCod, T01PE34_A65ArtCod, T01PE34_A758ProCod, T01PE34_A457FasCod, T01PE34_A4897ArtProLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PE38_A396EmprCod, T01PE38_A252CliCod, T01PE38_A65ArtCod, T01PE38_A758ProCod, T01PE38_A457FasCod, T01PE38_A4897ArtProLin
            }
            , new Object[] {
            T01PE39_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
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
   private short Z4894ArtProULin ;
   private short O4894ArtProULin ;
   private short Z4897ArtProLin ;
   private short nRcdDeleted_723 ;
   private short nRcdExists_723 ;
   private short nIsMod_723 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4894ArtProULin ;
   private short nBlankRcdCount723 ;
   private short RcdFound723 ;
   private short B4894ArtProULin ;
   private short nBlankRcdUsr723 ;
   private short RcdFound476 ;
   private short s4894ArtProULin ;
   private short A4897ArtProLin ;
   private short nIsDirty_476 ;
   private short nIsDirty_723 ;
   private short i4894ArtProULin ;
   private int wcpOAV22CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_79 ;
   private int nGXsfl_79_idx=1 ;
   private int A252CliCod ;
   private int AV22CliCod ;
   private int trnEnded ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtArtProFac_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtArtProLin_Enabled ;
   private int edtArtProCod_Enabled ;
   private int fRowAdded ;
   private int Combo_artprocod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtArtProLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4896ArtProFac ;
   private java.math.BigDecimal A4896ArtProFac ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV23CliNom ;
   private String wcpOAV24ArtCod ;
   private String wcpOAV25ProCod ;
   private String wcpOAV26FasCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String Z279CliNom ;
   private String Z4898ArtProCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String Gx_mode ;
   private String AV10EmprCod ;
   private String AV23CliNom ;
   private String AV24ArtCod ;
   private String AV25ProCod ;
   private String AV26FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_79_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtArtProFac_Internalname ;
   private String edtArtProFac_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_artprocod_Caption ;
   private String Combo_artprocod_Cls ;
   private String Combo_artprocod_Internalname ;
   private String sMode723 ;
   private String edtArtProLin_Internalname ;
   private String edtArtProCod_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A4286FasForMul ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_artprocod_Objectcall ;
   private String Combo_artprocod_Class ;
   private String Combo_artprocod_Icontype ;
   private String Combo_artprocod_Icon ;
   private String Combo_artprocod_Tooltip ;
   private String Combo_artprocod_Selectedvalue_set ;
   private String Combo_artprocod_Selectedvalue_get ;
   private String Combo_artprocod_Selectedtext_set ;
   private String Combo_artprocod_Selectedtext_get ;
   private String Combo_artprocod_Gamoauthtoken ;
   private String Combo_artprocod_Ddointernalname ;
   private String Combo_artprocod_Titlecontrolalign ;
   private String Combo_artprocod_Dropdownoptionstype ;
   private String Combo_artprocod_Titlecontrolidtoreplace ;
   private String Combo_artprocod_Datalisttype ;
   private String Combo_artprocod_Datalistfixedvalues ;
   private String Combo_artprocod_Datalistproc ;
   private String Combo_artprocod_Datalistprocparametersprefix ;
   private String Combo_artprocod_Remoteservicesparameters ;
   private String Combo_artprocod_Htmltemplate ;
   private String Combo_artprocod_Multiplevaluestype ;
   private String Combo_artprocod_Loadingdata ;
   private String Combo_artprocod_Noresultsfound ;
   private String Combo_artprocod_Emptyitemtext ;
   private String Combo_artprocod_Onlyselectedvalues ;
   private String Combo_artprocod_Selectalltext ;
   private String Combo_artprocod_Multiplevaluesseparator ;
   private String Combo_artprocod_Addnewoptiontext ;
   private String hsh ;
   private String sMode476 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A4898ArtProCod ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z69ArtDsc ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z4286FasForMul ;
   private String sGXsfl_79_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtArtProLin_Jsonclick ;
   private String edtArtProCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n4894ArtProULin ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_artprocod_Isgriditem ;
   private boolean Combo_artprocod_Emptyitem ;
   private boolean bGXsfl_79_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4286FasForMul ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_artprocod_Enabled ;
   private boolean Combo_artprocod_Visible ;
   private boolean Combo_artprocod_Allowmultipleselection ;
   private boolean Combo_artprocod_Hasdescription ;
   private boolean Combo_artprocod_Includeonlyselectedoption ;
   private boolean Combo_artprocod_Includeselectalloption ;
   private boolean Combo_artprocod_Includeaddnewoption ;
   private boolean n69ArtDsc ;
   private boolean n4896ArtProFac ;
   private boolean returnInSub ;
   private String AV31ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV29WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_artprocod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01PE6_A407EmprNom ;
   private boolean[] T01PE6_n407EmprNom ;
   private String[] T01PE8_A279CliNom ;
   private String[] T01PE9_A69ArtDsc ;
   private boolean[] T01PE9_n69ArtDsc ;
   private String[] T01PE10_A759ProDsc ;
   private String[] T01PE12_A460FasDsc ;
   private String[] T01PE12_A4286FasForMul ;
   private boolean[] T01PE12_n4286FasForMul ;
   private String[] T01PE13_A279CliNom ;
   private String[] T01PE13_A407EmprNom ;
   private boolean[] T01PE13_n407EmprNom ;
   private String[] T01PE13_A69ArtDsc ;
   private boolean[] T01PE13_n69ArtDsc ;
   private String[] T01PE13_A759ProDsc ;
   private String[] T01PE13_A460FasDsc ;
   private String[] T01PE13_A4286FasForMul ;
   private boolean[] T01PE13_n4286FasForMul ;
   private short[] T01PE13_A4894ArtProULin ;
   private boolean[] T01PE13_n4894ArtProULin ;
   private java.math.BigDecimal[] T01PE13_A4896ArtProFac ;
   private boolean[] T01PE13_n4896ArtProFac ;
   private String[] T01PE13_A396EmprCod ;
   private int[] T01PE13_A252CliCod ;
   private String[] T01PE13_A65ArtCod ;
   private String[] T01PE13_A758ProCod ;
   private String[] T01PE13_A457FasCod ;
   private String[] T01PE11_A396EmprCod ;
   private String[] T01PE14_A69ArtDsc ;
   private boolean[] T01PE14_n69ArtDsc ;
   private String[] T01PE15_A759ProDsc ;
   private String[] T01PE16_A396EmprCod ;
   private String[] T01PE17_A460FasDsc ;
   private String[] T01PE17_A4286FasForMul ;
   private boolean[] T01PE17_n4286FasForMul ;
   private String[] T01PE18_A396EmprCod ;
   private int[] T01PE18_A252CliCod ;
   private String[] T01PE18_A65ArtCod ;
   private String[] T01PE18_A758ProCod ;
   private String[] T01PE18_A457FasCod ;
   private short[] T01PE5_A4894ArtProULin ;
   private boolean[] T01PE5_n4894ArtProULin ;
   private java.math.BigDecimal[] T01PE5_A4896ArtProFac ;
   private boolean[] T01PE5_n4896ArtProFac ;
   private String[] T01PE5_A396EmprCod ;
   private int[] T01PE5_A252CliCod ;
   private String[] T01PE5_A65ArtCod ;
   private String[] T01PE5_A758ProCod ;
   private String[] T01PE5_A457FasCod ;
   private String[] T01PE19_A396EmprCod ;
   private int[] T01PE19_A252CliCod ;
   private String[] T01PE19_A65ArtCod ;
   private String[] T01PE19_A758ProCod ;
   private String[] T01PE19_A457FasCod ;
   private String[] T01PE20_A396EmprCod ;
   private int[] T01PE20_A252CliCod ;
   private String[] T01PE20_A65ArtCod ;
   private String[] T01PE20_A758ProCod ;
   private String[] T01PE20_A457FasCod ;
   private short[] T01PE4_A4894ArtProULin ;
   private boolean[] T01PE4_n4894ArtProULin ;
   private java.math.BigDecimal[] T01PE4_A4896ArtProFac ;
   private boolean[] T01PE4_n4896ArtProFac ;
   private String[] T01PE4_A396EmprCod ;
   private int[] T01PE4_A252CliCod ;
   private String[] T01PE4_A65ArtCod ;
   private String[] T01PE4_A758ProCod ;
   private String[] T01PE4_A457FasCod ;
   private String[] T01PE21_A279CliNom ;
   private String[] T01PE25_A279CliNom ;
   private String[] T01PE26_A69ArtDsc ;
   private boolean[] T01PE26_n69ArtDsc ;
   private String[] T01PE27_A759ProDsc ;
   private String[] T01PE28_A460FasDsc ;
   private String[] T01PE28_A4286FasForMul ;
   private boolean[] T01PE28_n4286FasForMul ;
   private String[] T01PE29_A396EmprCod ;
   private int[] T01PE29_A252CliCod ;
   private String[] T01PE29_A65ArtCod ;
   private String[] T01PE29_A758ProCod ;
   private String[] T01PE29_A457FasCod ;
   private short[] T01PE29_A1664ParFasCod ;
   private String[] T01PE32_A396EmprCod ;
   private int[] T01PE32_A252CliCod ;
   private String[] T01PE32_A65ArtCod ;
   private String[] T01PE32_A758ProCod ;
   private String[] T01PE32_A457FasCod ;
   private int[] T01PE33_A252CliCod ;
   private String[] T01PE33_A65ArtCod ;
   private String[] T01PE33_A758ProCod ;
   private short[] T01PE33_A4897ArtProLin ;
   private String[] T01PE33_A4898ArtProCod ;
   private String[] T01PE33_A396EmprCod ;
   private String[] T01PE33_A457FasCod ;
   private String[] T01PE34_A396EmprCod ;
   private int[] T01PE34_A252CliCod ;
   private String[] T01PE34_A65ArtCod ;
   private String[] T01PE34_A758ProCod ;
   private String[] T01PE34_A457FasCod ;
   private short[] T01PE34_A4897ArtProLin ;
   private int[] T01PE3_A252CliCod ;
   private String[] T01PE3_A65ArtCod ;
   private String[] T01PE3_A758ProCod ;
   private short[] T01PE3_A4897ArtProLin ;
   private String[] T01PE3_A4898ArtProCod ;
   private String[] T01PE3_A396EmprCod ;
   private String[] T01PE3_A457FasCod ;
   private int[] T01PE2_A252CliCod ;
   private String[] T01PE2_A65ArtCod ;
   private String[] T01PE2_A758ProCod ;
   private short[] T01PE2_A4897ArtProLin ;
   private String[] T01PE2_A4898ArtProCod ;
   private String[] T01PE2_A396EmprCod ;
   private String[] T01PE2_A457FasCod ;
   private String[] T01PE38_A396EmprCod ;
   private int[] T01PE38_A252CliCod ;
   private String[] T01PE38_A65ArtCod ;
   private String[] T01PE38_A758ProCod ;
   private String[] T01PE38_A457FasCod ;
   private short[] T01PE38_A4897ArtProLin ;
   private String[] T01PE39_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01PE7_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV30ArtProCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV27WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV28TrnContext ;
}

final  class tforacacopy1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforacacopy1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforacacopy1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforacacopy1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tforacacopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PE2", "SELECT CliCod, ArtCod, ProCod, ArtProLin, ArtProCod, EmprCod, FasCod FROM TXPArtFor WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ?  FOR UPDATE OF ArtProCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE3", "SELECT CliCod, ArtCod, ProCod, ArtProLin, ArtProCod, EmprCod, FasCod FROM TXPArtFor WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE4", "SELECT ArtProULin, ArtProFac, EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?  FOR UPDATE OF ArtProULin, ArtProFac NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE5", "SELECT ArtProULin, ArtProFac, EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE9", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE10", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE11", "SELECT EmprCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE12", "SELECT FasDsc, FasForMul FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE13", "SELECT /*+ FIRST_ROWS(100) */ T3.CliNom, T2.EmprNom, T4.ArtDsc, T5.ProDsc, T6.FasDsc, T6.FasForMul, TM1.ArtProULin, TM1.ArtProFac, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod, TM1.FasCod FROM (((((TXPSERPAU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) INNER JOIN TXPFASPRO T6 ON T6.EmprCod = TM1.EmprCod AND T6.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.ProCod = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod, TM1.FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE14", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE15", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE16", "SELECT EmprCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE17", "SELECT FasDsc, FasForMul FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE18", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE ( CliCod > ? or CliCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and ProCod > ? or ProCod = ? and ArtCod = ? and CliCod = ? and FasCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PE20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE ( CliCod < ? or CliCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and ProCod < ? or ProCod = ? and ArtCod = ? and CliCod = ? and FasCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, ProCod DESC, FasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PE21", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PE22", "INSERT INTO TXPSERPAU(ArtProULin, ArtProFac, EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProFacT, CCTCod, ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPSERPAU")
         ,new UpdateCursor("T01PE23", "UPDATE TXPSERPAU SET ArtProULin=?, ArtProFac=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new UpdateCursor("T01PE24", "DELETE FROM TXPSERPAU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new ForEachCursor("T01PE25", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE26", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE27", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE28", "SELECT FasDsc, FasForMul FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PE30", "UPDATE TXPSERPAU SET ArtProULin=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new UpdateCursor("T01PE31", "UPDATE TXPCLIENT SET CliNom=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T01PE32", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE33", "SELECT CliCod, ArtCod, ProCod, ArtProLin, ArtProCod, EmprCod, FasCod FROM TXPArtFor WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? and ArtProLin = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE34", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin FROM TXPArtFor WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PE35", "INSERT INTO TXPArtFor(CliCod, ArtCod, ProCod, ArtProLin, ArtProCod, EmprCod, FasCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPArtFor")
         ,new UpdateCursor("T01PE36", "UPDATE TXPArtFor SET ArtProCod=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ?", GX_NOMASK, "TXPArtFor")
         ,new UpdateCursor("T01PE37", "DELETE FROM TXPArtFor  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ArtProLin = ?", GX_NOMASK, "TXPArtFor")
         ,new ForEachCursor("T01PE38", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin FROM TXPArtFor WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PE39", "SELECT EmprCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((String[]) buf[6])[0] = rslt.getString(5, 28);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 8);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 31 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 37 :
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
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
               stmt.setString(5, (String)parms[6], 16);
               stmt.setString(6, (String)parms[7], 8);
               stmt.setString(7, (String)parms[8], 8);
               return;
            case 21 :
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
               stmt.setString(5, (String)parms[6], 16);
               stmt.setString(6, (String)parms[7], 8);
               stmt.setString(7, (String)parms[8], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 8);
               stmt.setString(6, (String)parms[6], 8);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}

