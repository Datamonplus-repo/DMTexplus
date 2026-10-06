package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
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
         gxload_26( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod, A758ProCod) ;
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
            AV57EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57EmprCod", AV57EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
            AV71CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71CliCod), "ZZZZZ9")));
            AV72ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72ArtCod", AV72ArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72ArtCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PROCESOS", ""), (short)(0)) ;
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
      nRC_GXsfl_47 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_47"))) ;
      nGXsfl_47_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_47_idx"))) ;
      sGXsfl_47_idx = httpContext.GetPar( "sGXsfl_47_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV17UsurCod = httpContext.GetPar( "UsurCod") ;
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

   public tarticp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tarticp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticp_impl.class ));
   }

   public tarticp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICP.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtCod_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICP.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarinfasociada_Internalname, "", httpContext.getMessage( "Eliminar Inf Asociada", ""), bttBtneliminarinfasociada_Jsonclick, 7, httpContext.getMessage( "Eliminar Inf Asociada", ""), "", StyleString, ClassString, bttBtneliminarinfasociada_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11au10_client"+"'", TempTags, "", 2, "HLP_TARTICP.htm");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTabletabs_Internalname, divTabletabs_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
      ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
      ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
      ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, "GXUITABSPANEL_TABSContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTratamientosquimicos_title_Internalname, httpContext.getMessage( "Tratamientos Quimicos", ""), "", "", lblTratamientosquimicos_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICP.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "TratamientosQuimicos") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, divUnnamedtable2_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      if ( ! isFullAjaxMode( ) )
      {
         /* WebComponent */
         app.GxWebStd.gx_hidden_field( httpContext, "W0070"+"", GXutil.rtrim( WebComp_Wcwcartfor_Component));
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0070"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Wcwcartfor_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWcwcartfor), GXutil.lower( WebComp_Wcwcartfor_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0070"+"");
            }
            WebComp_Wcwcartfor.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWcwcartfor), GXutil.lower( WebComp_Wcwcartfor_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
      }
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblParametros_title_Internalname, httpContext.getMessage( "Parametros", ""), "", "", lblParametros_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICP.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
      httpContext.writeText( "Parametros") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      if ( ! isFullAjaxMode( ) )
      {
         /* WebComponent */
         app.GxWebStd.gx_hidden_field( httpContext, "W0078"+"", GXutil.rtrim( WebComp_Wcwcserpau_Component));
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0078"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Wcwcserpau_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWcwcserpau), GXutil.lower( WebComp_Wcwcserpau_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0078"+"");
            }
            WebComp_Wcwcserpau.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWcwcserpau), GXutil.lower( WebComp_Wcwcserpau_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
      }
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV80Pgmname), GXutil.rtrim( localUtil.format( AV80Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICP.htm");
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
      /* User Defined Control */
      ucCombo_procod.setProperty("Caption", Combo_procod_Caption);
      ucCombo_procod.setProperty("Cls", Combo_procod_Cls);
      ucCombo_procod.setProperty("IsGridItem", Combo_procod_Isgriditem);
      ucCombo_procod.setProperty("EmptyItem", Combo_procod_Emptyitem);
      ucCombo_procod.setProperty("DropDownOptionsData", AV76ProCod_Data);
      ucCombo_procod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_procod_Internalname, "COMBO_PROCODContainer");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btneliminarinfasociada_Internalname, tblTabledvelop_confirmpanel_btneliminarinfasociada_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_btneliminarinfasociada.setProperty("Title", Dvelop_confirmpanel_btneliminarinfasociada_Title);
      ucDvelop_confirmpanel_btneliminarinfasociada.setProperty("ConfirmationText", Dvelop_confirmpanel_btneliminarinfasociada_Confirmationtext);
      ucDvelop_confirmpanel_btneliminarinfasociada.setProperty("YesButtonCaption", Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttoncaption);
      ucDvelop_confirmpanel_btneliminarinfasociada.setProperty("NoButtonCaption", Dvelop_confirmpanel_btneliminarinfasociada_Nobuttoncaption);
      ucDvelop_confirmpanel_btneliminarinfasociada.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btneliminarinfasociada_Cancelbuttoncaption);
      ucDvelop_confirmpanel_btneliminarinfasociada.setProperty("YesButtonPosition", Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttonposition);
      ucDvelop_confirmpanel_btneliminarinfasociada.setProperty("ConfirmType", Dvelop_confirmpanel_btneliminarinfasociada_Confirmtype);
      ucDvelop_confirmpanel_btneliminarinfasociada.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btneliminarinfasociada_Internalname, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADAContainer"+"Body"+"\" style=\"display:none;\">") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      startgridcontrol47( ) ;
      nGXsfl_47_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount11 = (short)(subGridlevel_level1_Rows) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_11 = (short)(1) ;
            scanStartAU11( ) ;
            while ( RcdFound11 != 0 )
            {
               init_level_properties11( ) ;
               getByPrimaryKeyAU11( ) ;
               addRowAU11( ) ;
               scanNextAU11( ) ;
            }
            scanEndAU11( ) ;
            nBlankRcdCount11 = (short)(subGridlevel_level1_Rows) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalAU11( ) ;
         standaloneModalAU11( ) ;
         sMode11 = Gx_mode ;
         while ( nGXsfl_47_idx < nRC_GXsfl_47 )
         {
            bGXsfl_47_Refreshing = true ;
            readRowAU11( ) ;
            edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtProUserA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROUSERA_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtProFecA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFECA_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtProUserM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROUSERM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtProFecM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFECM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            chkProAct.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PROACT_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkProAct.getEnabled(), 5, 0), !bGXsfl_47_Refreshing);
            if ( ( nRcdExists_11 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalAU11( ) ;
            }
            sendRowAU11( ) ;
            bGXsfl_47_Refreshing = false ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount11 = (short)(subGridlevel_level1_Rows) ;
         nRcdExists_11 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartAU11( ) ;
            while ( RcdFound11 != 0 )
            {
               sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_4711( ) ;
               init_level_properties11( ) ;
               standaloneNotModalAU11( ) ;
               getByPrimaryKeyAU11( ) ;
               standaloneModalAU11( ) ;
               addRowAU11( ) ;
               scanNextAU11( ) ;
            }
            scanEndAU11( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode11 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_4711( ) ;
         initAllAU11( ) ;
         init_level_properties11( ) ;
         nRcdExists_11 = (short)(0) ;
         nIsMod_11 = (short)(0) ;
         nRcdDeleted_11 = (short)(0) ;
         nBlankRcdCount11 = (short)(nBlankRcdUsr11+nBlankRcdCount11) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount11 > 0 )
         {
            standaloneNotModalAU11( ) ;
            standaloneModalAU11( ) ;
            addRowAU11( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount11 = (short)(nBlankRcdCount11-1) ;
         }
         Gx_mode = sMode11 ;
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcartfor_Component) != 0 )
            {
               WebComp_Wcwcartfor.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcserpau_Component) != 0 )
            {
               WebComp_Wcwcserpau.componentstart();
            }
         }
      }
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
      e12AU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROCOD_DATA"), AV76ProCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_47"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV57EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV71CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV72ArtCod = httpContext.cgiGet( "vARTCOD") ;
            AV63Foraca = (byte)(localUtil.ctol( httpContext.cgiGet( "vFORACA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            A12141ProSta = (byte)(localUtil.ctol( httpContext.cgiGet( "PROSTA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12142ProStFec = localUtil.ctot( httpContext.cgiGet( "PROSTFEC"), 0) ;
            A10026DscCFa = httpContext.cgiGet( "DSCCFA") ;
            A11272ProFabs = localUtil.ctond( httpContext.cgiGet( "PROFABS")) ;
            A759ProDsc = httpContext.cgiGet( "PRODSC") ;
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
            Gxuitabspanel_tabs_Objectcall = httpContext.cgiGet( "GXUITABSPANEL_TABS_Objectcall") ;
            Gxuitabspanel_tabs_Enabled = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Enabled")) ;
            Gxuitabspanel_tabs_Activepage = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Activepage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs_Activepagecontrolname = httpContext.cgiGet( "GXUITABSPANEL_TABS_Activepagecontrolname") ;
            Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gxuitabspanel_tabs_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS_Class") ;
            Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Historymanagement")) ;
            Gxuitabspanel_tabs_Visible = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Visible")) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_procod_Objectcall = httpContext.cgiGet( "COMBO_PROCOD_Objectcall") ;
            Combo_procod_Class = httpContext.cgiGet( "COMBO_PROCOD_Class") ;
            Combo_procod_Icontype = httpContext.cgiGet( "COMBO_PROCOD_Icontype") ;
            Combo_procod_Icon = httpContext.cgiGet( "COMBO_PROCOD_Icon") ;
            Combo_procod_Caption = httpContext.cgiGet( "COMBO_PROCOD_Caption") ;
            Combo_procod_Tooltip = httpContext.cgiGet( "COMBO_PROCOD_Tooltip") ;
            Combo_procod_Cls = httpContext.cgiGet( "COMBO_PROCOD_Cls") ;
            Combo_procod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROCOD_Selectedvalue_set") ;
            Combo_procod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROCOD_Selectedvalue_get") ;
            Combo_procod_Selectedtext_set = httpContext.cgiGet( "COMBO_PROCOD_Selectedtext_set") ;
            Combo_procod_Selectedtext_get = httpContext.cgiGet( "COMBO_PROCOD_Selectedtext_get") ;
            Combo_procod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROCOD_Gamoauthtoken") ;
            Combo_procod_Ddointernalname = httpContext.cgiGet( "COMBO_PROCOD_Ddointernalname") ;
            Combo_procod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROCOD_Titlecontrolalign") ;
            Combo_procod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROCOD_Dropdownoptionstype") ;
            Combo_procod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Enabled")) ;
            Combo_procod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Visible")) ;
            Combo_procod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROCOD_Titlecontrolidtoreplace") ;
            Combo_procod_Datalisttype = httpContext.cgiGet( "COMBO_PROCOD_Datalisttype") ;
            Combo_procod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Allowmultipleselection")) ;
            Combo_procod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROCOD_Datalistfixedvalues") ;
            Combo_procod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Isgriditem")) ;
            Combo_procod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Hasdescription")) ;
            Combo_procod_Datalistproc = httpContext.cgiGet( "COMBO_PROCOD_Datalistproc") ;
            Combo_procod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROCOD_Datalistprocparametersprefix") ;
            Combo_procod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROCOD_Remoteservicesparameters") ;
            Combo_procod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_procod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Includeonlyselectedoption")) ;
            Combo_procod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Includeselectalloption")) ;
            Combo_procod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Emptyitem")) ;
            Combo_procod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Includeaddnewoption")) ;
            Combo_procod_Htmltemplate = httpContext.cgiGet( "COMBO_PROCOD_Htmltemplate") ;
            Combo_procod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROCOD_Multiplevaluestype") ;
            Combo_procod_Loadingdata = httpContext.cgiGet( "COMBO_PROCOD_Loadingdata") ;
            Combo_procod_Noresultsfound = httpContext.cgiGet( "COMBO_PROCOD_Noresultsfound") ;
            Combo_procod_Emptyitemtext = httpContext.cgiGet( "COMBO_PROCOD_Emptyitemtext") ;
            Combo_procod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROCOD_Onlyselectedvalues") ;
            Combo_procod_Selectalltext = httpContext.cgiGet( "COMBO_PROCOD_Selectalltext") ;
            Combo_procod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROCOD_Multiplevaluesseparator") ;
            Combo_procod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROCOD_Addnewoptiontext") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Objectcall") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Enabled")) ;
            Dvelop_confirmpanel_btneliminarinfasociada_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Width") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Height") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Class") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Title") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Confirmationtext") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Yesbuttoncaption") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Nobuttoncaption") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Yesbuttonposition") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Confirmtype") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Comment") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Bodytype") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Bodycontentinternalname") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Result") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Texttype") ;
            Dvelop_confirmpanel_btneliminarinfasociada_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Visible")) ;
            Gridlevel_level1_titlescategories_Objectcall = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall") ;
            Gridlevel_level1_titlescategories_Class = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Class") ;
            Gridlevel_level1_titlescategories_Enabled = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled")) ;
            Gridlevel_level1_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname") ;
            Gridlevel_level1_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories") ;
            Gridlevel_level1_titlescategories_Visible = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Visible")) ;
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
            AV80Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TARTICP");
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            forbiddenHiddens.add("ArtDsc", GXutil.rtrim( localUtil.format( A69ArtDsc, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tarticp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
                  sMode10 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode10 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound10 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_AU0( ) ;
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e13AU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e12AU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e14AU2 ();
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
               if ( GXutil.strcmp(sEvtType, "W") == 0 )
               {
                  sEvtType = GXutil.left( sEvt, 4) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                  nCmpId = (short)(GXutil.lval( sEvtType)) ;
                  if ( nCmpId == 70 )
                  {
                     OldWcwcartfor = httpContext.cgiGet( "W0070") ;
                     if ( ( GXutil.len( OldWcwcartfor) == 0 ) || ( GXutil.strcmp(OldWcwcartfor, WebComp_Wcwcartfor_Component) != 0 ) )
                     {
                        WebComp_Wcwcartfor = WebUtils.getWebComponent(getClass(), "app." + OldWcwcartfor + "_impl", remoteHandle, context);
                        WebComp_Wcwcartfor_Component = OldWcwcartfor ;
                     }
                     if ( GXutil.len( WebComp_Wcwcartfor_Component) != 0 )
                     {
                        WebComp_Wcwcartfor.componentprocess("W0070", "", sEvt);
                     }
                     WebComp_Wcwcartfor_Component = OldWcwcartfor ;
                  }
                  else if ( nCmpId == 78 )
                  {
                     OldWcwcserpau = httpContext.cgiGet( "W0078") ;
                     if ( ( GXutil.len( OldWcwcserpau) == 0 ) || ( GXutil.strcmp(OldWcwcserpau, WebComp_Wcwcserpau_Component) != 0 ) )
                     {
                        WebComp_Wcwcserpau = WebUtils.getWebComponent(getClass(), "app." + OldWcwcserpau + "_impl", remoteHandle, context);
                        WebComp_Wcwcserpau_Component = OldWcwcserpau ;
                     }
                     if ( GXutil.len( WebComp_Wcwcserpau_Component) != 0 )
                     {
                        WebComp_Wcwcserpau.componentprocess("W0078", "", sEvt);
                     }
                     WebComp_Wcwcserpau_Component = OldWcwcserpau ;
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
         e14AU2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllAU10( ) ;
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
         disableAttributesAU10( ) ;
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

   public void confirm_AU0( )
   {
      beforeValidateAU10( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsAU10( ) ;
         }
         else
         {
            checkExtendedTableAU10( ) ;
            closeExtendedTableCursorsAU10( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_AU11( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode10 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_AU11( )
   {
      nGXsfl_47_idx = 0 ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         readRowAU11( ) ;
         if ( ( nRcdExists_11 != 0 ) || ( nIsMod_11 != 0 ) )
         {
            getKeyAU11( ) ;
            if ( ( nRcdExists_11 == 0 ) && ( nRcdDeleted_11 == 0 ) )
            {
               if ( RcdFound11 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateAU11( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableAU11( ) ;
                     closeExtendedTableCursorsAU11( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_47_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound11 != 0 )
               {
                  if ( nRcdDeleted_11 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyAU11( ) ;
                     loadAU11( ) ;
                     beforeValidateAU11( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsAU11( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_11 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateAU11( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableAU11( ) ;
                           closeExtendedTableCursorsAU11( ) ;
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
                  if ( nRcdDeleted_11 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_47_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProUserA_Internalname, GXutil.rtrim( A10553ProUserA)) ;
         httpContext.changePostValue( edtProFecA_Internalname, localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtProUserM_Internalname, GXutil.rtrim( A10555ProUserM)) ;
         httpContext.changePostValue( edtProFecM_Internalname, localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( chkProAct.getInternalname(), ((GXutil.strcmp(A10412ProAct, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_47_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10412ProAct_"+sGXsfl_47_idx, GXutil.rtrim( Z10412ProAct)) ;
         httpContext.changePostValue( "ZT_"+"Z10553ProUserA_"+sGXsfl_47_idx, GXutil.rtrim( Z10553ProUserA)) ;
         httpContext.changePostValue( "ZT_"+"Z10554ProFecA_"+sGXsfl_47_idx, localUtil.ttoc( Z10554ProFecA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12141ProSta_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z12141ProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12142ProStFec_"+sGXsfl_47_idx, localUtil.ttoc( Z12142ProStFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10555ProUserM_"+sGXsfl_47_idx, GXutil.rtrim( Z10555ProUserM)) ;
         httpContext.changePostValue( "ZT_"+"Z10556ProFecM_"+sGXsfl_47_idx, localUtil.ttoc( Z10556ProFecM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10026DscCFa_"+sGXsfl_47_idx, GXutil.rtrim( Z10026DscCFa)) ;
         httpContext.changePostValue( "ZT_"+"Z11272ProFabs_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z11272ProFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10412ProAct_"+sGXsfl_47_idx, GXutil.rtrim( O10412ProAct)) ;
         httpContext.changePostValue( "nRcdDeleted_11_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_11_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_11_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_11 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROUSERA_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFECA_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROUSERM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFECM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROACT_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkProAct.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionAU0( )
   {
   }

   public void e12AU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV52Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tarticp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV52Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Station", AV52Station);
      GXv_char2[0] = AV57EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char2, GXv_char3, GXv_char4) ;
      tarticp_impl.this.AV57EmprCod = GXv_char2[0] ;
      tarticp_impl.this.AV16EmprNom = GXv_char3[0] ;
      tarticp_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57EmprCod", AV57EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV73WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV73WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_procod_Titlecontrolidtoreplace = edtProCod_Internalname ;
      ucCombo_procod.sendProperty(context, "", false, Combo_procod_Internalname, "TitleControlIdToReplace", Combo_procod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPROCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV74TrnContext.fromxml(AV75WebSession.getValue("TrnContext"), null, null);
      Gridlevel_level1_titlescategories_Gridinternalname = subGridlevel_level1_Internalname ;
      ucGridlevel_level1_titlescategories.sendProperty(context, "", false, Gridlevel_level1_titlescategories_Internalname, "GridInternalName", Gridlevel_level1_titlescategories_Gridinternalname);
      subGridlevel_level1_Rows = 0 ;
      GXt_int6 = AV68Parfss ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( ((GXutil.strcmp("", AV78AusEmprCod)==0) ? AV57EmprCod : AV78AusEmprCod), "PARFSS", GXv_int7) ;
      tarticp_impl.this.GXt_int6 = GXv_int7[0] ;
      AV68Parfss = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Parfss", GXutil.str( AV68Parfss, 1, 0));
      GXt_int6 = AV63Foraca ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV57EmprCod, "FORACA", GXv_int7) ;
      tarticp_impl.this.GXt_int6 = GXv_int7[0] ;
      AV63Foraca = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Foraca", GXutil.str( AV63Foraca, 1, 0));
   }

   public void e14AU2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV74TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tarticpww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e13AU2( )
   {
      /* Dvelop_confirmpanel_btneliminarinfasociada_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btneliminarinfasociada_Result, "Yes") == 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A758ProCod ;
         GXv_char9[0] = httpContext.getMessage( "PRO", "") ;
         new app.pborrser(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char9) ;
         tarticp_impl.this.A396EmprCod = GXv_char4[0] ;
         tarticp_impl.this.A252CliCod = GXv_int8[0] ;
         tarticp_impl.this.A65ArtCod = GXv_char3[0] ;
         tarticp_impl.this.A758ProCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divTabletabs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabletabs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabs_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV76ProCod_Data ;
      GXv_char9[0] = AV77ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.tarticploaddvcombo(remoteHandle, context).execute( "ProCod", Gx_mode, AV57EmprCod, AV71CliCod, AV72ArtCod, GXv_char9, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      tarticp_impl.this.AV77ComboSelectedValue = GXv_char9[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV76ProCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   }

   public void zmAU10( int GX_JID )
   {
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z69ArtDsc = T00AU6_A69ArtDsc[0] ;
         }
         else
         {
            Z69ArtDsc = A69ArtDsc ;
         }
      }
      if ( GX_JID == -24 )
      {
         Z65ArtCod = A65ArtCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      AV80Pgmname = "TARTICP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV57EmprCod)==0) )
      {
         A396EmprCod = AV57EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00AU7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00AU7_A407EmprNom[0] ;
      n407EmprNom = T00AU7_n407EmprNom[0] ;
      pr_default.close(5);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV57EmprCod, httpContext.getMessage( httpContext.getMessage( "FORACA", ""), ""), GXv_int7) ;
      tarticp_impl.this.GXt_int6 = GXv_int7[0] ;
      divUnnamedtable2_Visible = (((GXt_int6==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      if ( ! (0==AV71CliCod) )
      {
         A252CliCod = AV71CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV71CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV71CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV72ArtCod)==0) )
      {
         A65ArtCod = AV72ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      if ( ! (GXutil.strcmp("", AV72ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      else
      {
         edtArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV72ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      divTabletabs_Visible = (((AV63Foraca==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTabletabs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabs_Visible), 5, 0), true);
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
         /* Using cursor T00AU8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00AU8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(6);
      }
   }

   public void loadAU10( )
   {
      /* Using cursor T00AU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A279CliNom = T00AU9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T00AU9_A407EmprNom[0] ;
         n407EmprNom = T00AU9_n407EmprNom[0] ;
         A69ArtDsc = T00AU9_A69ArtDsc[0] ;
         n69ArtDsc = T00AU9_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         zmAU10( -24) ;
      }
      pr_default.close(7);
      onLoadActionsAU10( ) ;
   }

   public void onLoadActionsAU10( )
   {
   }

   public void checkExtendedTableAU10( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00AU8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00AU8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursorsAU10( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_26( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T00AU10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00AU10_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKeyAU10( )
   {
      /* Using cursor T00AU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00AU6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zmAU10( 24) ;
         RcdFound10 = (short)(1) ;
         A65ArtCod = T00AU6_A65ArtCod[0] ;
         n65ArtCod = T00AU6_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A69ArtDsc = T00AU6_A69ArtDsc[0] ;
         n69ArtDsc = T00AU6_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A396EmprCod = T00AU6_A396EmprCod[0] ;
         A252CliCod = T00AU6_A252CliCod[0] ;
         n252CliCod = T00AU6_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadAU10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKeyAU10( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKeyAU10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyAU10( ) ;
      if ( RcdFound10 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T00AU12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00AU12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00AU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00AU12_A252CliCod[0] < A252CliCod ) || ( T00AU12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00AU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00AU12_A65ArtCod[0], A65ArtCod) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00AU12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00AU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00AU12_A252CliCod[0] > A252CliCod ) || ( T00AU12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00AU12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00AU12_A65ArtCod[0], A65ArtCod) > 0 ) ) )
         {
            A396EmprCod = T00AU12_A396EmprCod[0] ;
            A252CliCod = T00AU12_A252CliCod[0] ;
            n252CliCod = T00AU12_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T00AU12_A65ArtCod[0] ;
            n65ArtCod = T00AU12_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T00AU13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00AU13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00AU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00AU13_A252CliCod[0] > A252CliCod ) || ( T00AU13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00AU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00AU13_A65ArtCod[0], A65ArtCod) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00AU13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00AU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00AU13_A252CliCod[0] < A252CliCod ) || ( T00AU13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00AU13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00AU13_A65ArtCod[0], A65ArtCod) < 0 ) ) )
         {
            A396EmprCod = T00AU13_A396EmprCod[0] ;
            A252CliCod = T00AU13_A252CliCod[0] ;
            n252CliCod = T00AU13_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T00AU13_A65ArtCod[0] ;
            n65ArtCod = T00AU13_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyAU10( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertAU10( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
               updateAU10( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertAU10( ) ;
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
                  insertAU10( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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

   public void checkOptimisticConcurrencyAU10( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00AU5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z69ArtDsc, T00AU5_A69ArtDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z69ArtDsc, T00AU5_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T00AU5_A69ArtDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertAU10( )
   {
      beforeValidateAU10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableAU10( ) ;
      }
      if ( AnyError == 0 )
      {
         zmAU10( 0) ;
         checkOptimisticConcurrencyAU10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmAU10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertAU10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00AU14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevelAU10( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionAU0( ) ;
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
            loadAU10( ) ;
         }
         endLevelAU10( ) ;
      }
      closeExtendedTableCursorsAU10( ) ;
   }

   public void updateAU10( )
   {
      beforeValidateAU10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableAU10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyAU10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmAU10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateAU10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00AU15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateAU10( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char9[0] = A396EmprCod ;
                     GXv_int8[0] = A252CliCod ;
                     GXv_char4[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_char4) ;
                     tarticp_impl.this.A396EmprCod = GXv_char9[0] ;
                     tarticp_impl.this.A252CliCod = GXv_int8[0] ;
                     tarticp_impl.this.A65ArtCod = GXv_char4[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelAU10( ) ;
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
         endLevelAU10( ) ;
      }
      closeExtendedTableCursorsAU10( ) ;
   }

   public void deferredUpdateAU10( )
   {
   }

   public void delete( )
   {
      beforeValidateAU10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyAU10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsAU10( ) ;
         afterConfirmAU10( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteAU10( ) ;
            if ( AnyError == 0 )
            {
               scanStartAU11( ) ;
               while ( RcdFound11 != 0 )
               {
                  getByPrimaryKeyAU11( ) ;
                  deleteAU11( ) ;
                  scanNextAU11( ) ;
               }
               scanEndAU11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00AU16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelAU10( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsAU10( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00AU17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00AU17_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00AU18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00AU19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00AU20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00AU21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00AU22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00AU23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00AU24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00AU25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00AU26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00AU27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00AU28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00AU29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00AU30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00AU31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00AU32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00AU33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00AU34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00AU35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00AU36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00AU37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00AU38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00AU39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00AU40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00AU41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T00AU42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T00AU43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T00AU44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T00AU45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T00AU46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T00AU47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T00AU48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00AU49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00AU50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00AU51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00AU52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00AU53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T00AU54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T00AU55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T00AU56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T00AU57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T00AU58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T00AU59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T00AU60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T00AU61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de parametro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
      }
   }

   public void processNestedLevelAU11( )
   {
      nGXsfl_47_idx = 0 ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         readRowAU11( ) ;
         if ( ( nRcdExists_11 != 0 ) || ( nIsMod_11 != 0 ) )
         {
            standaloneNotModalAU11( ) ;
            getKeyAU11( ) ;
            if ( ( nRcdExists_11 == 0 ) && ( nRcdDeleted_11 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertAU11( ) ;
            }
            else
            {
               if ( RcdFound11 != 0 )
               {
                  if ( ( nRcdDeleted_11 != 0 ) && ( nRcdExists_11 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteAU11( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_11 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateAU11( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_11 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_47_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProUserA_Internalname, GXutil.rtrim( A10553ProUserA)) ;
         httpContext.changePostValue( edtProFecA_Internalname, localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtProUserM_Internalname, GXutil.rtrim( A10555ProUserM)) ;
         httpContext.changePostValue( edtProFecM_Internalname, localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( chkProAct.getInternalname(), ((GXutil.strcmp(A10412ProAct, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_47_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10412ProAct_"+sGXsfl_47_idx, GXutil.rtrim( Z10412ProAct)) ;
         httpContext.changePostValue( "ZT_"+"Z10553ProUserA_"+sGXsfl_47_idx, GXutil.rtrim( Z10553ProUserA)) ;
         httpContext.changePostValue( "ZT_"+"Z10554ProFecA_"+sGXsfl_47_idx, localUtil.ttoc( Z10554ProFecA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12141ProSta_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z12141ProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12142ProStFec_"+sGXsfl_47_idx, localUtil.ttoc( Z12142ProStFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10555ProUserM_"+sGXsfl_47_idx, GXutil.rtrim( Z10555ProUserM)) ;
         httpContext.changePostValue( "ZT_"+"Z10556ProFecM_"+sGXsfl_47_idx, localUtil.ttoc( Z10556ProFecM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10026DscCFa_"+sGXsfl_47_idx, GXutil.rtrim( Z10026DscCFa)) ;
         httpContext.changePostValue( "ZT_"+"Z11272ProFabs_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z11272ProFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10412ProAct_"+sGXsfl_47_idx, GXutil.rtrim( O10412ProAct)) ;
         httpContext.changePostValue( "nRcdDeleted_11_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_11_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_11_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_11 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROUSERA_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFECA_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROUSERM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFECM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROACT_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkProAct.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllAU11( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_11 = (short)(0) ;
      nIsMod_11 = (short)(0) ;
      nRcdDeleted_11 = (short)(0) ;
   }

   public void processLevelAU10( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevelAU11( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelAU10( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteAU10( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tarticp");
         if ( AnyError == 0 )
         {
            confirmValuesAU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tarticp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartAU10( )
   {
      /* Scan By routine */
      /* Using cursor T00AU62 */
      pr_default.execute(60);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(60) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A396EmprCod = T00AU62_A396EmprCod[0] ;
         A252CliCod = T00AU62_A252CliCod[0] ;
         n252CliCod = T00AU62_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T00AU62_A65ArtCod[0] ;
         n65ArtCod = T00AU62_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextAU10( )
   {
      /* Scan next routine */
      pr_default.readNext(60);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(60) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A396EmprCod = T00AU62_A396EmprCod[0] ;
         A252CliCod = T00AU62_A252CliCod[0] ;
         n252CliCod = T00AU62_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T00AU62_A65ArtCod[0] ;
         n65ArtCod = T00AU62_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
   }

   public void scanEndAU10( )
   {
      pr_default.close(60);
   }

   public void afterConfirmAU10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertAU10( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateAU10( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteAU10( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteAU10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateAU10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesAU10( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zmAU11( int GX_JID )
   {
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10412ProAct = T00AU3_A10412ProAct[0] ;
            Z10553ProUserA = T00AU3_A10553ProUserA[0] ;
            Z10554ProFecA = T00AU3_A10554ProFecA[0] ;
            Z12141ProSta = T00AU3_A12141ProSta[0] ;
            Z12142ProStFec = T00AU3_A12142ProStFec[0] ;
            Z10555ProUserM = T00AU3_A10555ProUserM[0] ;
            Z10556ProFecM = T00AU3_A10556ProFecM[0] ;
            Z10026DscCFa = T00AU3_A10026DscCFa[0] ;
            Z11272ProFabs = T00AU3_A11272ProFabs[0] ;
         }
         else
         {
            Z10412ProAct = A10412ProAct ;
            Z10553ProUserA = A10553ProUserA ;
            Z10554ProFecA = A10554ProFecA ;
            Z12141ProSta = A12141ProSta ;
            Z12142ProStFec = A12142ProStFec ;
            Z10555ProUserM = A10555ProUserM ;
            Z10556ProFecM = A10556ProFecM ;
            Z10026DscCFa = A10026DscCFa ;
            Z11272ProFabs = A11272ProFabs ;
         }
      }
      if ( GX_JID == -27 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10412ProAct = A10412ProAct ;
         Z10553ProUserA = A10553ProUserA ;
         Z10554ProFecA = A10554ProFecA ;
         Z12141ProSta = A12141ProSta ;
         Z12142ProStFec = A12142ProStFec ;
         Z10555ProUserM = A10555ProUserM ;
         Z10556ProFecM = A10556ProFecM ;
         Z10026DscCFa = A10026DscCFa ;
         Z11272ProFabs = A11272ProFabs ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z5289ProProvi = A5289ProProvi ;
      }
   }

   public void standaloneNotModalAU11( )
   {
      edtProFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProFecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProUserA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProUserM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), !bGXsfl_47_Refreshing);
   }

   public void standaloneModalAU11( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A10412ProAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A10412ProAct = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10553ProUserA)==0) && ( Gx_BScreen == 0 ) )
      {
         A10553ProUserA = AV17UsurCod ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10554ProFecA) && ( Gx_BScreen == 0 ) )
      {
         A10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      }
      if ( isIns( )  && (0==A12141ProSta) && ( Gx_BScreen == 0 ) )
      {
         A12141ProSta = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.str( A12141ProSta, 1, 0));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A12142ProStFec) && ( Gx_BScreen == 0 ) )
      {
         A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
         httpContext.ajax_rsp_assign_attri("", false, "A12142ProStFec", localUtil.ttoc( A12142ProStFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void loadAU11( )
   {
      /* Using cursor T00AU63 */
      pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A10412ProAct = T00AU63_A10412ProAct[0] ;
         A10553ProUserA = T00AU63_A10553ProUserA[0] ;
         A10554ProFecA = T00AU63_A10554ProFecA[0] ;
         A12141ProSta = T00AU63_A12141ProSta[0] ;
         A12142ProStFec = T00AU63_A12142ProStFec[0] ;
         A10555ProUserM = T00AU63_A10555ProUserM[0] ;
         A10556ProFecM = T00AU63_A10556ProFecM[0] ;
         A759ProDsc = T00AU63_A759ProDsc[0] ;
         A5289ProProvi = T00AU63_A5289ProProvi[0] ;
         A10026DscCFa = T00AU63_A10026DscCFa[0] ;
         A11272ProFabs = T00AU63_A11272ProFabs[0] ;
         zmAU11( -27) ;
      }
      pr_default.close(61);
      onLoadActionsAU11( ) ;
   }

   public void onLoadActionsAU11( )
   {
   }

   public void checkExtendedTableAU11( )
   {
      nIsDirty_11 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalAU11( ) ;
      /* Using cursor T00AU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00AU4_A759ProDsc[0] ;
      A5289ProProvi = T00AU4_A5289ProProvi[0] ;
      pr_default.close(2);
      if ( ! ( ( GXutil.strcmp(A10412ProAct, "S") == 0 ) || ( GXutil.strcmp(A10412ProAct, "N") == 0 ) ) )
      {
         GXCCtl = "PROACT_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Activo?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkProAct.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsAU11( )
   {
      pr_default.close(2);
   }

   public void enableDisableAU11( )
   {
   }

   public void gxload_28( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T00AU64 */
      pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(62) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00AU64_A759ProDsc[0] ;
      A5289ProProvi = T00AU64_A5289ProProvi[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5289ProProvi))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(62) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(62);
   }

   public void getKeyAU11( )
   {
      /* Using cursor T00AU65 */
      pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(63);
   }

   public void getByPrimaryKeyAU11( )
   {
      /* Using cursor T00AU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmAU11( 27) ;
         RcdFound11 = (short)(1) ;
         initializeNonKeyAU11( ) ;
         A10412ProAct = T00AU3_A10412ProAct[0] ;
         A10553ProUserA = T00AU3_A10553ProUserA[0] ;
         A10554ProFecA = T00AU3_A10554ProFecA[0] ;
         A12141ProSta = T00AU3_A12141ProSta[0] ;
         A12142ProStFec = T00AU3_A12142ProStFec[0] ;
         A10555ProUserM = T00AU3_A10555ProUserM[0] ;
         A10556ProFecM = T00AU3_A10556ProFecM[0] ;
         A10026DscCFa = T00AU3_A10026DscCFa[0] ;
         A11272ProFabs = T00AU3_A11272ProFabs[0] ;
         A758ProCod = T00AU3_A758ProCod[0] ;
         n758ProCod = T00AU3_n758ProCod[0] ;
         O10412ProAct = A10412ProAct ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadAU11( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKeyAU11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalAU11( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesAU11( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyAU11( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00AU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10412ProAct, T00AU2_A10412ProAct[0]) != 0 ) || ( GXutil.strcmp(Z10553ProUserA, T00AU2_A10553ProUserA[0]) != 0 ) || !( GXutil.dateCompare(Z10554ProFecA, T00AU2_A10554ProFecA[0]) ) || ( Z12141ProSta != T00AU2_A12141ProSta[0] ) || !( GXutil.dateCompare(Z12142ProStFec, T00AU2_A12142ProStFec[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10555ProUserM, T00AU2_A10555ProUserM[0]) != 0 ) || !( GXutil.dateCompare(Z10556ProFecM, T00AU2_A10556ProFecM[0]) ) || ( GXutil.strcmp(Z10026DscCFa, T00AU2_A10026DscCFa[0]) != 0 ) || ( DecimalUtil.compareTo(Z11272ProFabs, T00AU2_A11272ProFabs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10412ProAct, T00AU2_A10412ProAct[0]) != 0 )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"ProAct");
               GXutil.writeLogRaw("Old: ",Z10412ProAct);
               GXutil.writeLogRaw("Current: ",T00AU2_A10412ProAct[0]);
            }
            if ( GXutil.strcmp(Z10553ProUserA, T00AU2_A10553ProUserA[0]) != 0 )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"ProUserA");
               GXutil.writeLogRaw("Old: ",Z10553ProUserA);
               GXutil.writeLogRaw("Current: ",T00AU2_A10553ProUserA[0]);
            }
            if ( !( GXutil.dateCompare(Z10554ProFecA, T00AU2_A10554ProFecA[0]) ) )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"ProFecA");
               GXutil.writeLogRaw("Old: ",Z10554ProFecA);
               GXutil.writeLogRaw("Current: ",T00AU2_A10554ProFecA[0]);
            }
            if ( Z12141ProSta != T00AU2_A12141ProSta[0] )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"ProSta");
               GXutil.writeLogRaw("Old: ",Z12141ProSta);
               GXutil.writeLogRaw("Current: ",T00AU2_A12141ProSta[0]);
            }
            if ( !( GXutil.dateCompare(Z12142ProStFec, T00AU2_A12142ProStFec[0]) ) )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"ProStFec");
               GXutil.writeLogRaw("Old: ",Z12142ProStFec);
               GXutil.writeLogRaw("Current: ",T00AU2_A12142ProStFec[0]);
            }
            if ( GXutil.strcmp(Z10555ProUserM, T00AU2_A10555ProUserM[0]) != 0 )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"ProUserM");
               GXutil.writeLogRaw("Old: ",Z10555ProUserM);
               GXutil.writeLogRaw("Current: ",T00AU2_A10555ProUserM[0]);
            }
            if ( !( GXutil.dateCompare(Z10556ProFecM, T00AU2_A10556ProFecM[0]) ) )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"ProFecM");
               GXutil.writeLogRaw("Old: ",Z10556ProFecM);
               GXutil.writeLogRaw("Current: ",T00AU2_A10556ProFecM[0]);
            }
            if ( GXutil.strcmp(Z10026DscCFa, T00AU2_A10026DscCFa[0]) != 0 )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"DscCFa");
               GXutil.writeLogRaw("Old: ",Z10026DscCFa);
               GXutil.writeLogRaw("Current: ",T00AU2_A10026DscCFa[0]);
            }
            if ( DecimalUtil.compareTo(Z11272ProFabs, T00AU2_A11272ProFabs[0]) != 0 )
            {
               GXutil.writeLogln("tarticp:[seudo value changed for attri]"+"ProFabs");
               GXutil.writeLogRaw("Old: ",Z11272ProFabs);
               GXutil.writeLogRaw("Current: ",T00AU2_A11272ProFabs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertAU11( )
   {
      beforeValidateAU11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableAU11( ) ;
      }
      if ( AnyError == 0 )
      {
         zmAU11( 0) ;
         checkOptimisticConcurrencyAU11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmAU11( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertAU11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00AU66 */
                  pr_default.execute(64, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A10412ProAct, A10553ProUserA, A10554ProFecA, Byte.valueOf(A12141ProSta), A12142ProStFec, A10555ProUserM, A10556ProFecM, A10026DscCFa, A11272ProFabs, A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
                  if ( (pr_default.getStatus(64) == 1) )
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
            loadAU11( ) ;
         }
         endLevelAU11( ) ;
      }
      closeExtendedTableCursorsAU11( ) ;
   }

   public void updateAU11( )
   {
      beforeValidateAU11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableAU11( ) ;
      }
      if ( ( nIsMod_11 != 0 ) || ( nIsDirty_11 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyAU11( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmAU11( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateAU11( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00AU67 */
                     pr_default.execute(65, new Object[] {A10412ProAct, A10553ProUserA, A10554ProFecA, Byte.valueOf(A12141ProSta), A12142ProStFec, A10555ProUserM, A10556ProFecM, A10026DscCFa, A11272ProFabs, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
                     if ( (pr_default.getStatus(65) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTLIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateAU11( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char9[0] = A396EmprCod ;
                        GXv_int8[0] = A252CliCod ;
                        GXv_char4[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_char4) ;
                        tarticp_impl.this.A396EmprCod = GXv_char9[0] ;
                        tarticp_impl.this.A252CliCod = GXv_int8[0] ;
                        tarticp_impl.this.A65ArtCod = GXv_char4[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyAU11( ) ;
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
            endLevelAU11( ) ;
         }
      }
      closeExtendedTableCursorsAU11( ) ;
   }

   public void deferredUpdateAU11( )
   {
   }

   public void deleteAU11( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateAU11( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyAU11( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsAU11( ) ;
         afterConfirmAU11( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteAU11( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00AU68 */
               pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelAU11( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsAU11( )
   {
      standaloneModalAU11( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00AU69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
         A759ProDsc = T00AU69_A759ProDsc[0] ;
         A5289ProProvi = T00AU69_A5289ProProvi[0] ;
         pr_default.close(67);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00AU70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T00AU71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPFMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T00AU72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T00AU73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos p/Modelo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T00AU74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de parametro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
      }
   }

   public void endLevelAU11( )
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

   public void scanStartAU11( )
   {
      /* Scan By routine */
      /* Using cursor T00AU75 */
      pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(73) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A758ProCod = T00AU75_A758ProCod[0] ;
         n758ProCod = T00AU75_n758ProCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextAU11( )
   {
      /* Scan next routine */
      pr_default.readNext(73);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(73) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A758ProCod = T00AU75_A758ProCod[0] ;
         n758ProCod = T00AU75_n758ProCod[0] ;
      }
   }

   public void scanEndAU11( )
   {
      pr_default.close(73);
   }

   public void afterConfirmAU11( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( GXutil.strcmp(A10412ProAct, O10412ProAct) != 0 ) )
      {
         A10556ProFecM = GXutil.serverNow( context, remoteHandle, pr_default) ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A10412ProAct, O10412ProAct) != 0 ) )
      {
         A10555ProUserM = AV17UsurCod ;
      }
   }

   public void beforeInsertAU11( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateAU11( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteAU11( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteAU11( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateAU11( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesAU11( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProUserA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProUserM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProFecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      chkProAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkProAct.getEnabled(), 5, 0), !bGXsfl_47_Refreshing);
   }

   public void send_integrity_lvl_hashesAU11( )
   {
   }

   public void send_integrity_lvl_hashesAU10( )
   {
   }

   public void subsflControlProps_4711( )
   {
      edtProCod_Internalname = "PROCOD_"+sGXsfl_47_idx ;
      edtProUserA_Internalname = "PROUSERA_"+sGXsfl_47_idx ;
      edtProFecA_Internalname = "PROFECA_"+sGXsfl_47_idx ;
      edtProUserM_Internalname = "PROUSERM_"+sGXsfl_47_idx ;
      edtProFecM_Internalname = "PROFECM_"+sGXsfl_47_idx ;
      chkProAct.setInternalname( "PROACT_"+sGXsfl_47_idx );
   }

   public void subsflControlProps_fel_4711( )
   {
      edtProCod_Internalname = "PROCOD_"+sGXsfl_47_fel_idx ;
      edtProUserA_Internalname = "PROUSERA_"+sGXsfl_47_fel_idx ;
      edtProFecA_Internalname = "PROFECA_"+sGXsfl_47_fel_idx ;
      edtProUserM_Internalname = "PROUSERM_"+sGXsfl_47_fel_idx ;
      edtProFecM_Internalname = "PROFECM_"+sGXsfl_47_fel_idx ;
      chkProAct.setInternalname( "PROACT_"+sGXsfl_47_fel_idx );
   }

   public void addRowAU11( )
   {
      nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4711( ) ;
      sendRowAU11( ) ;
   }

   public void sendRowAU11( )
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
         if ( ((int)((nGXsfl_47_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProUserA_Internalname,GXutil.rtrim( A10553ProUserA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProUserA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProUserA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFecA_Internalname,localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10554ProFecA, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFecA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProFecA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProUserM_Internalname,GXutil.rtrim( A10555ProUserM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProUserM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProUserM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFecM_Internalname,localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10556ProFecM, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFecM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProFecM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "PROACT_" + sGXsfl_47_idx ;
      chkProAct.setName( GXCCtl );
      chkProAct.setWebtags( "" );
      chkProAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "TitleCaption", chkProAct.getCaption(), !bGXsfl_47_Refreshing);
      chkProAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A10412ProAct)==0) )
      {
         A10412ProAct = httpContext.getMessage( "S", "") ;
      }
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkProAct.getInternalname(),A10412ProAct,"","",Integer.valueOf(-1),Integer.valueOf(chkProAct.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(53, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,53);\""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesAU11( ) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z758ProCod));
      GXCCtl = "Z10412ProAct_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10412ProAct));
      GXCCtl = "Z10553ProUserA_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10553ProUserA));
      GXCCtl = "Z10554ProFecA_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10554ProFecA, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12141ProSta_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12141ProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12142ProStFec_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12142ProStFec, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10555ProUserM_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10555ProUserM));
      GXCCtl = "Z10556ProFecM_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10556ProFecM, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10026DscCFa_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10026DscCFa));
      GXCCtl = "Z11272ProFabs_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11272ProFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O10412ProAct_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O10412ProAct));
      GXCCtl = "nRcdDeleted_11_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_11_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_11_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_47_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV74TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV74TrnContext);
      }
      GXCCtl = "PRODSC_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A759ProDsc));
      GXCCtl = "EMPRCOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vEMPRCOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV57EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV71CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vARTCOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV72ArtCod));
      GXCCtl = "PROSTA_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A12141ProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "PROSTFEC_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( A12142ProStFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROUSERA_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFECA_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROUSERM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFECM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROACT_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkProAct.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowAU11( )
   {
      nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4711( ) ;
      edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProUserA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROUSERA_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFecA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFECA_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProUserM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROUSERM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFecM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFECM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkProAct.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PROACT_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
      n758ProCod = false ;
      A10553ProUserA = httpContext.cgiGet( edtProUserA_Internalname) ;
      A10554ProFecA = localUtil.ctot( httpContext.cgiGet( edtProFecA_Internalname)) ;
      A10555ProUserM = httpContext.cgiGet( edtProUserM_Internalname) ;
      A10556ProFecM = localUtil.ctot( httpContext.cgiGet( edtProFecM_Internalname)) ;
      A10412ProAct = ((GXutil.strcmp(httpContext.cgiGet( chkProAct.getInternalname()), "S")==0) ? "S" : "N") ;
      GXCCtl = "Z758ProCod_" + sGXsfl_47_idx ;
      Z758ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10412ProAct_" + sGXsfl_47_idx ;
      Z10412ProAct = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10553ProUserA_" + sGXsfl_47_idx ;
      Z10553ProUserA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10554ProFecA_" + sGXsfl_47_idx ;
      Z10554ProFecA = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12141ProSta_" + sGXsfl_47_idx ;
      Z12141ProSta = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12142ProStFec_" + sGXsfl_47_idx ;
      Z12142ProStFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10555ProUserM_" + sGXsfl_47_idx ;
      Z10555ProUserM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10556ProFecM_" + sGXsfl_47_idx ;
      Z10556ProFecM = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10026DscCFa_" + sGXsfl_47_idx ;
      Z10026DscCFa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11272ProFabs_" + sGXsfl_47_idx ;
      Z11272ProFabs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12141ProSta_" + sGXsfl_47_idx ;
      A12141ProSta = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12142ProStFec_" + sGXsfl_47_idx ;
      A12142ProStFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10026DscCFa_" + sGXsfl_47_idx ;
      A10026DscCFa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11272ProFabs_" + sGXsfl_47_idx ;
      A11272ProFabs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O10412ProAct_" + sGXsfl_47_idx ;
      O10412ProAct = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_11_" + sGXsfl_47_idx ;
      nRcdDeleted_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_11_" + sGXsfl_47_idx ;
      nRcdExists_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_11_" + sGXsfl_47_idx ;
      nIsMod_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "PROSTA_" + sGXsfl_47_idx ;
      A12141ProSta = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "PROSTFEC_" + sGXsfl_47_idx ;
      A12142ProStFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
   }

   public void assign_properties_default( )
   {
      defedtProFecM_Enabled = edtProFecM_Enabled ;
      defedtProUserM_Enabled = edtProUserM_Enabled ;
      defedtProFecA_Enabled = edtProFecA_Enabled ;
      defedtProUserA_Enabled = edtProUserA_Enabled ;
      defedtProCod_Enabled = edtProCod_Enabled ;
   }

   public void confirmValuesAU0( )
   {
      nGXsfl_47_idx = 0 ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4711( ) ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4711( ) ;
         httpContext.changePostValue( "Z758ProCod_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z758ProCod_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z10412ProAct_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z10412ProAct_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10412ProAct_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z10553ProUserA_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z10553ProUserA_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10553ProUserA_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z10554ProFecA_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z10554ProFecA_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10554ProFecA_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z12141ProSta_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z12141ProSta_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12141ProSta_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z12142ProStFec_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z12142ProStFec_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12142ProStFec_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z10555ProUserM_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z10555ProUserM_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10555ProUserM_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z10556ProFecM_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z10556ProFecM_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10556ProFecM_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z10026DscCFa_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z10026DscCFa_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10026DscCFa_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z11272ProFabs_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z11272ProFabs_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11272ProFabs_"+sGXsfl_47_idx) ;
      }
      httpContext.changePostValue( "O10412ProAct", httpContext.cgiGet( "T10412ProAct")) ;
      httpContext.deletePostValue( "T10412ProAct") ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tarticp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV57EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV71CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV72ArtCod))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TARTICP");
      forbiddenHiddens.add("ArtDsc", GXutil.rtrim( localUtil.format( A69ArtDsc, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tarticp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_47", GXutil.ltrim( localUtil.ntoc( nGXsfl_47_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROCOD_DATA", AV76ProCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROCOD_DATA", AV76ProCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV74TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV74TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV74TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV57EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV71CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV72ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORACA", GXutil.ltrim( localUtil.ntoc( AV63Foraca, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PROSTA", GXutil.ltrim( localUtil.ntoc( A12141ProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROSTFEC", localUtil.ttoc( A12142ProStFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DSCCFA", GXutil.rtrim( A10026DscCFa));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFABS", GXutil.ltrim( localUtil.ntoc( A11272ProFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC", GXutil.rtrim( A759ProDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Objectcall", GXutil.rtrim( Gxuitabspanel_tabs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Enabled", GXutil.booltostr( Gxuitabspanel_tabs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Objectcall", GXutil.rtrim( Combo_procod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Cls", GXutil.rtrim( Combo_procod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Enabled", GXutil.booltostr( Combo_procod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_procod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Isgriditem", GXutil.booltostr( Combo_procod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Emptyitem", GXutil.booltostr( Combo_procod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_btneliminarinfasociada_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Enabled", GXutil.booltostr( Dvelop_confirmpanel_btneliminarinfasociada_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Title", GXutil.rtrim( Dvelop_confirmpanel_btneliminarinfasociada_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btneliminarinfasociada_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminarinfasociada_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminarinfasociada_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btneliminarinfasociada_Confirmtype));
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
      if ( ! ( WebComp_Wcwcartfor == null ) )
      {
         WebComp_Wcwcartfor.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcserpau == null ) )
      {
         WebComp_Wcwcserpau.componentjscripts();
      }
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcartfor_Component) != 0 )
            {
               WebComp_Wcwcartfor.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcserpau_Component) != 0 )
            {
               WebComp_Wcwcserpau.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcartfor_Component) != 0 )
            {
               WebComp_Wcwcartfor.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcserpau_Component) != 0 )
            {
               WebComp_Wcwcserpau.componentstart();
            }
         }
      }
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
      return formatLink("app.tarticp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV57EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV71CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV72ArtCod))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TARTICP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PROCESOS", "") ;
   }

   public void initializeNonKeyAU10( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      Z69ArtDsc = "" ;
   }

   public void initAllAU10( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      n65ArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      initializeNonKeyAU10( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyAU11( )
   {
      A10555ProUserM = "" ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A5289ProProvi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
      A10026DscCFa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10026DscCFa", A10026DscCFa);
      A11272ProFabs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11272ProFabs", GXutil.ltrimstr( A11272ProFabs, 6, 2));
      A10412ProAct = httpContext.getMessage( "S", "") ;
      A10553ProUserA = AV17UsurCod ;
      A10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A12141ProSta = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.str( A12141ProSta, 1, 0));
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A12142ProStFec", localUtil.ttoc( A12142ProStFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      O10412ProAct = A10412ProAct ;
      Z10412ProAct = "" ;
      Z10553ProUserA = "" ;
      Z10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      Z12141ProSta = (byte)(0) ;
      Z12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      Z10555ProUserM = "" ;
      Z10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      Z10026DscCFa = "" ;
      Z11272ProFabs = DecimalUtil.ZERO ;
   }

   public void initAllAU11( )
   {
      A758ProCod = "" ;
      n758ProCod = false ;
      initializeNonKeyAU11( ) ;
   }

   public void standaloneModalInsertAU11( )
   {
      A10412ProAct = i10412ProAct ;
      A10553ProUserA = i10553ProUserA ;
      A10554ProFecA = i10554ProFecA ;
      A12141ProSta = i12141ProSta ;
      httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.str( A12141ProSta, 1, 0));
      A12142ProStFec = i12142ProStFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A12142ProStFec", localUtil.ttoc( A12142ProStFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcwcartfor == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcartfor_Component) != 0 )
         {
            WebComp_Wcwcartfor.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcserpau == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcserpau_Component) != 0 )
         {
            WebComp_Wcwcserpau.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655761", true, true);
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
      httpContext.AddJavascriptSource("tarticp.js", "?20268211655761", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties11( )
   {
      edtProFecM_Enabled = defedtProFecM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProUserM_Enabled = defedtProUserM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProFecA_Enabled = defedtProFecA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProUserA_Enabled = defedtProUserA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtProCod_Enabled = defedtProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
   }

   public void startgridcontrol47( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10553ProUserA));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10555ProUserM));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10412ProAct));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkProAct.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProUserA_Internalname = "PROUSERA" ;
      edtProFecA_Internalname = "PROFECA" ;
      edtProUserM_Internalname = "PROUSERM" ;
      edtProFecM_Internalname = "PROFECM" ;
      chkProAct.setInternalname( "PROACT" );
      bttBtneliminarinfasociada_Internalname = "BTNELIMINARINFASOCIADA" ;
      lblTratamientosquimicos_title_Internalname = "TRATAMIENTOSQUIMICOS_TITLE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblParametros_title_Internalname = "PARAMETROS_TITLE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divTabletabs_Internalname = "TABLETABS" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_procod_Internalname = "COMBO_PROCOD" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Internalname = "DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA" ;
      tblTabledvelop_confirmpanel_btneliminarinfasociada_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA" ;
      Gridlevel_level1_titlescategories_Internalname = "GRIDLEVEL_LEVEL1_TITLESCATEGORIES" ;
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
      Combo_procod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PROCESOS", "") );
      chkProAct.setCaption( "" );
      edtProFecM_Jsonclick = "" ;
      edtProUserM_Jsonclick = "" ;
      edtProFecA_Jsonclick = "" ;
      edtProUserA_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_procod_Titlecontrolidtoreplace = "" ;
      chkProAct.setEnabled( 1 );
      edtProFecM_Enabled = 0 ;
      edtProUserM_Enabled = 0 ;
      edtProFecA_Enabled = 0 ;
      edtProUserA_Enabled = 0 ;
      edtProCod_Enabled = 1 ;
      subGridlevel_level1_Rows = 1 ;
      Gridlevel_level1_titlescategories_Gridtitlescategories = ";;Alta;Alta;Modificacion;Modificacion;" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Confirmtype = "1" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Confirmationtext = "¿Desea eliminar la Informacion Asociada?" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Title = "" ;
      Combo_procod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_procod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_procod_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      divUnnamedtable2_Visible = 1 ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 2 ;
      divTabletabs_Visible = 1 ;
      bttBtneliminarinfasociada_Visible = 1 ;
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
      subsflControlProps_4711( ) ;
      while ( nGXsfl_47_idx <= nRC_GXsfl_47 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalAU11( ) ;
         standaloneModalAU11( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowAU11( ) ;
         nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4711( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "PROACT_" + sGXsfl_47_idx ;
      chkProAct.setName( GXCCtl );
      chkProAct.setWebtags( "" );
      chkProAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "TitleCaption", chkProAct.getCaption(), !bGXsfl_47_Refreshing);
      chkProAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A10412ProAct)==0) )
      {
         A10412ProAct = httpContext.getMessage( "S", "") ;
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
      n252CliCod = false ;
      /* Using cursor T00AU17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T00AU17_A279CliNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Procod( )
   {
      n758ProCod = false ;
      /* Using cursor T00AU69 */
      pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(67) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T00AU69_A759ProDsc[0] ;
      A5289ProProvi = T00AU69_A5289ProProvi[0] ;
      pr_default.close(67);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV72ArtCod',fld:'vARTCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV74TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV72ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e14AU2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV74TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOELIMINARINFASOCIADA'","{handler:'e11AU10',iparms:[{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("'DOELIMINARINFASOCIADA'",",oparms:[{av:'Dvelop_confirmpanel_btneliminarinfasociada_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA.CLOSE","{handler:'e13AU2',iparms:[{av:'Dvelop_confirmpanel_btneliminarinfasociada_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARINFASOCIADA.CLOSE",",oparms:[{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
      setEventMetadata("VALID_PROACT","{handler:'valid_Proact',iparms:[]");
      setEventMetadata("VALID_PROACT",",oparms:[]}");
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
      pr_default.close(67);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV57EmprCod = "" ;
      wcpOAV72ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z69ArtDsc = "" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Result = "" ;
      Z758ProCod = "" ;
      Z10412ProAct = "" ;
      Z10553ProUserA = "" ;
      Z10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      Z12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      Z10555ProUserM = "" ;
      Z10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      Z10026DscCFa = "" ;
      Z11272ProFabs = DecimalUtil.ZERO ;
      O10412ProAct = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      Gx_mode = "" ;
      AV57EmprCod = "" ;
      AV72ArtCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      AV17UsurCod = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      bttBtneliminarinfasociada_Jsonclick = "" ;
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTratamientosquimicos_title_Jsonclick = "" ;
      WebComp_Wcwcartfor_Component = "" ;
      OldWcwcartfor = "" ;
      lblParametros_title_Jsonclick = "" ;
      WebComp_Wcwcserpau_Component = "" ;
      OldWcwcserpau = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV80Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_procod = new com.genexus.webpanels.GXUserControl();
      Combo_procod_Caption = "" ;
      AV76ProCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      sStyleString = "" ;
      ucDvelop_confirmpanel_btneliminarinfasociada = new com.genexus.webpanels.GXUserControl();
      ucGridlevel_level1_titlescategories = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode11 = "" ;
      A407EmprNom = "" ;
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      A10026DscCFa = "" ;
      A11272ProFabs = DecimalUtil.ZERO ;
      A759ProDsc = "" ;
      A5289ProProvi = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Gxuitabspanel_tabs_Objectcall = "" ;
      Gxuitabspanel_tabs_Activepagecontrolname = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_procod_Objectcall = "" ;
      Combo_procod_Class = "" ;
      Combo_procod_Icontype = "" ;
      Combo_procod_Icon = "" ;
      Combo_procod_Tooltip = "" ;
      Combo_procod_Selectedvalue_set = "" ;
      Combo_procod_Selectedvalue_get = "" ;
      Combo_procod_Selectedtext_set = "" ;
      Combo_procod_Selectedtext_get = "" ;
      Combo_procod_Gamoauthtoken = "" ;
      Combo_procod_Ddointernalname = "" ;
      Combo_procod_Titlecontrolalign = "" ;
      Combo_procod_Dropdownoptionstype = "" ;
      Combo_procod_Datalisttype = "" ;
      Combo_procod_Datalistfixedvalues = "" ;
      Combo_procod_Datalistproc = "" ;
      Combo_procod_Datalistprocparametersprefix = "" ;
      Combo_procod_Remoteservicesparameters = "" ;
      Combo_procod_Htmltemplate = "" ;
      Combo_procod_Multiplevaluestype = "" ;
      Combo_procod_Loadingdata = "" ;
      Combo_procod_Noresultsfound = "" ;
      Combo_procod_Emptyitemtext = "" ;
      Combo_procod_Onlyselectedvalues = "" ;
      Combo_procod_Selectalltext = "" ;
      Combo_procod_Multiplevaluesseparator = "" ;
      Combo_procod_Addnewoptiontext = "" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Objectcall = "" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Width = "" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Height = "" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Class = "" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Comment = "" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Bodytype = "" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_btneliminarinfasociada_Texttype = "" ;
      Gridlevel_level1_titlescategories_Objectcall = "" ;
      Gridlevel_level1_titlescategories_Class = "" ;
      Gridlevel_level1_titlescategories_Gridinternalname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode10 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A10553ProUserA = "" ;
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      A10412ProAct = "" ;
      T10412ProAct = "" ;
      AV52Station = "" ;
      GXt_char1 = "" ;
      AV16EmprNom = "" ;
      AV73WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV74TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV75WebSession = httpContext.getWebSession();
      AV78AusEmprCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV77ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T00AU7_A407EmprNom = new String[] {""} ;
      T00AU7_n407EmprNom = new boolean[] {false} ;
      GXv_int7 = new byte[1] ;
      T00AU8_A279CliNom = new String[] {""} ;
      T00AU9_A65ArtCod = new String[] {""} ;
      T00AU9_n65ArtCod = new boolean[] {false} ;
      T00AU9_A279CliNom = new String[] {""} ;
      T00AU9_A407EmprNom = new String[] {""} ;
      T00AU9_n407EmprNom = new boolean[] {false} ;
      T00AU9_A69ArtDsc = new String[] {""} ;
      T00AU9_n69ArtDsc = new boolean[] {false} ;
      T00AU9_A396EmprCod = new String[] {""} ;
      T00AU9_A252CliCod = new int[1] ;
      T00AU9_n252CliCod = new boolean[] {false} ;
      T00AU10_A279CliNom = new String[] {""} ;
      T00AU11_A396EmprCod = new String[] {""} ;
      T00AU11_A252CliCod = new int[1] ;
      T00AU11_n252CliCod = new boolean[] {false} ;
      T00AU11_A65ArtCod = new String[] {""} ;
      T00AU11_n65ArtCod = new boolean[] {false} ;
      T00AU6_A65ArtCod = new String[] {""} ;
      T00AU6_n65ArtCod = new boolean[] {false} ;
      T00AU6_A69ArtDsc = new String[] {""} ;
      T00AU6_n69ArtDsc = new boolean[] {false} ;
      T00AU6_A396EmprCod = new String[] {""} ;
      T00AU6_A252CliCod = new int[1] ;
      T00AU6_n252CliCod = new boolean[] {false} ;
      T00AU12_A396EmprCod = new String[] {""} ;
      T00AU12_A252CliCod = new int[1] ;
      T00AU12_n252CliCod = new boolean[] {false} ;
      T00AU12_A65ArtCod = new String[] {""} ;
      T00AU12_n65ArtCod = new boolean[] {false} ;
      T00AU13_A396EmprCod = new String[] {""} ;
      T00AU13_A252CliCod = new int[1] ;
      T00AU13_n252CliCod = new boolean[] {false} ;
      T00AU13_A65ArtCod = new String[] {""} ;
      T00AU13_n65ArtCod = new boolean[] {false} ;
      T00AU5_A65ArtCod = new String[] {""} ;
      T00AU5_n65ArtCod = new boolean[] {false} ;
      T00AU5_A69ArtDsc = new String[] {""} ;
      T00AU5_n69ArtDsc = new boolean[] {false} ;
      T00AU5_A396EmprCod = new String[] {""} ;
      T00AU5_A252CliCod = new int[1] ;
      T00AU5_n252CliCod = new boolean[] {false} ;
      T00AU17_A279CliNom = new String[] {""} ;
      T00AU18_A396EmprCod = new String[] {""} ;
      T00AU18_A252CliCod = new int[1] ;
      T00AU18_n252CliCod = new boolean[] {false} ;
      T00AU18_A65ArtCod = new String[] {""} ;
      T00AU18_n65ArtCod = new boolean[] {false} ;
      T00AU18_A499GrpFamCod = new byte[1] ;
      T00AU19_A396EmprCod = new String[] {""} ;
      T00AU19_A252CliCod = new int[1] ;
      T00AU19_n252CliCod = new boolean[] {false} ;
      T00AU19_A12814ARTConID = new String[] {""} ;
      T00AU19_A65ArtCod = new String[] {""} ;
      T00AU19_n65ArtCod = new boolean[] {false} ;
      T00AU20_A396EmprCod = new String[] {""} ;
      T00AU20_A252CliCod = new int[1] ;
      T00AU20_n252CliCod = new boolean[] {false} ;
      T00AU20_A65ArtCod = new String[] {""} ;
      T00AU20_n65ArtCod = new boolean[] {false} ;
      T00AU20_A12363SocInt = new byte[1] ;
      T00AU21_A396EmprCod = new String[] {""} ;
      T00AU21_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU21_A5728JBCLLin = new short[1] ;
      T00AU22_A396EmprCod = new String[] {""} ;
      T00AU22_A252CliCod = new int[1] ;
      T00AU22_n252CliCod = new boolean[] {false} ;
      T00AU22_A5809MMezCod = new String[] {""} ;
      T00AU22_A65ArtCod = new String[] {""} ;
      T00AU22_n65ArtCod = new boolean[] {false} ;
      T00AU23_A396EmprCod = new String[] {""} ;
      T00AU23_A252CliCod = new int[1] ;
      T00AU23_n252CliCod = new boolean[] {false} ;
      T00AU23_A5234MezCod = new String[] {""} ;
      T00AU23_A5240MezLin = new byte[1] ;
      T00AU24_A396EmprCod = new String[] {""} ;
      T00AU24_A252CliCod = new int[1] ;
      T00AU24_n252CliCod = new boolean[] {false} ;
      T00AU24_A65ArtCod = new String[] {""} ;
      T00AU24_n65ArtCod = new boolean[] {false} ;
      T00AU24_A4116estreclim = new int[1] ;
      T00AU25_A396EmprCod = new String[] {""} ;
      T00AU25_A252CliCod = new int[1] ;
      T00AU25_n252CliCod = new boolean[] {false} ;
      T00AU25_A65ArtCod = new String[] {""} ;
      T00AU25_n65ArtCod = new boolean[] {false} ;
      T00AU25_A4061EstNomCol = new String[] {""} ;
      T00AU26_A396EmprCod = new String[] {""} ;
      T00AU26_A9705ErpNped = new String[] {""} ;
      T00AU26_A8652ErpLin = new short[1] ;
      T00AU27_A396EmprCod = new String[] {""} ;
      T00AU27_A252CliCod = new int[1] ;
      T00AU27_n252CliCod = new boolean[] {false} ;
      T00AU27_A65ArtCod = new String[] {""} ;
      T00AU27_n65ArtCod = new boolean[] {false} ;
      T00AU27_A7266CAAqP = new String[] {""} ;
      T00AU28_A396EmprCod = new String[] {""} ;
      T00AU28_A252CliCod = new int[1] ;
      T00AU28_n252CliCod = new boolean[] {false} ;
      T00AU28_A65ArtCod = new String[] {""} ;
      T00AU28_n65ArtCod = new boolean[] {false} ;
      T00AU28_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU29_A396EmprCod = new String[] {""} ;
      T00AU29_A252CliCod = new int[1] ;
      T00AU29_n252CliCod = new boolean[] {false} ;
      T00AU29_A65ArtCod = new String[] {""} ;
      T00AU29_n65ArtCod = new boolean[] {false} ;
      T00AU29_A10972Int_cod = new byte[1] ;
      T00AU30_A396EmprCod = new String[] {""} ;
      T00AU30_A252CliCod = new int[1] ;
      T00AU30_n252CliCod = new boolean[] {false} ;
      T00AU30_A65ArtCod = new String[] {""} ;
      T00AU30_n65ArtCod = new boolean[] {false} ;
      T00AU30_A10577Pg_Procod = new String[] {""} ;
      T00AU31_A396EmprCod = new String[] {""} ;
      T00AU31_A252CliCod = new int[1] ;
      T00AU31_n252CliCod = new boolean[] {false} ;
      T00AU31_A65ArtCod = new String[] {""} ;
      T00AU31_n65ArtCod = new boolean[] {false} ;
      T00AU31_A10272Hz_cod = new String[] {""} ;
      T00AU32_A396EmprCod = new String[] {""} ;
      T00AU32_A252CliCod = new int[1] ;
      T00AU32_n252CliCod = new boolean[] {false} ;
      T00AU32_A65ArtCod = new String[] {""} ;
      T00AU32_n65ArtCod = new boolean[] {false} ;
      T00AU32_A10041ArtSH = new String[] {""} ;
      T00AU33_A396EmprCod = new String[] {""} ;
      T00AU33_A252CliCod = new int[1] ;
      T00AU33_n252CliCod = new boolean[] {false} ;
      T00AU33_A65ArtCod = new String[] {""} ;
      T00AU33_n65ArtCod = new boolean[] {false} ;
      T00AU33_A8427TipoCt = new String[] {""} ;
      T00AU33_A8428CapMxMq = new int[1] ;
      T00AU34_A396EmprCod = new String[] {""} ;
      T00AU34_A252CliCod = new int[1] ;
      T00AU34_n252CliCod = new boolean[] {false} ;
      T00AU34_A65ArtCod = new String[] {""} ;
      T00AU34_n65ArtCod = new boolean[] {false} ;
      T00AU34_A8342CodPred = new short[1] ;
      T00AU35_A396EmprCod = new String[] {""} ;
      T00AU35_A252CliCod = new int[1] ;
      T00AU35_n252CliCod = new boolean[] {false} ;
      T00AU35_A65ArtCod = new String[] {""} ;
      T00AU35_n65ArtCod = new boolean[] {false} ;
      T00AU35_A8089ArtcodTj = new String[] {""} ;
      T00AU36_A396EmprCod = new String[] {""} ;
      T00AU36_A252CliCod = new int[1] ;
      T00AU36_n252CliCod = new boolean[] {false} ;
      T00AU36_A65ArtCod = new String[] {""} ;
      T00AU36_n65ArtCod = new boolean[] {false} ;
      T00AU36_A7956Mq_CodM = new String[] {""} ;
      T00AU37_A396EmprCod = new String[] {""} ;
      T00AU37_A252CliCod = new int[1] ;
      T00AU37_n252CliCod = new boolean[] {false} ;
      T00AU37_A65ArtCod = new String[] {""} ;
      T00AU37_n65ArtCod = new boolean[] {false} ;
      T00AU37_A7949Par_Art = new short[1] ;
      T00AU38_A396EmprCod = new String[] {""} ;
      T00AU38_A252CliCod = new int[1] ;
      T00AU38_n252CliCod = new boolean[] {false} ;
      T00AU38_A65ArtCod = new String[] {""} ;
      T00AU38_n65ArtCod = new boolean[] {false} ;
      T00AU38_A7135Lin_fast = new short[1] ;
      T00AU39_A396EmprCod = new String[] {""} ;
      T00AU39_A252CliCod = new int[1] ;
      T00AU39_n252CliCod = new boolean[] {false} ;
      T00AU39_A65ArtCod = new String[] {""} ;
      T00AU39_n65ArtCod = new boolean[] {false} ;
      T00AU39_A6954Mat_lin = new short[1] ;
      T00AU40_A396EmprCod = new String[] {""} ;
      T00AU40_A602MaqCod = new String[] {""} ;
      T00AU40_A6078MaqCliCod = new int[1] ;
      T00AU40_A6079MaqArtCod = new String[] {""} ;
      T00AU41_A396EmprCod = new String[] {""} ;
      T00AU41_A252CliCod = new int[1] ;
      T00AU41_n252CliCod = new boolean[] {false} ;
      T00AU41_A65ArtCod = new String[] {""} ;
      T00AU41_n65ArtCod = new boolean[] {false} ;
      T00AU41_A5382EstCatAny = new short[1] ;
      T00AU41_A5383EstCatSer = new String[] {""} ;
      T00AU41_A5384EstCatTip = new short[1] ;
      T00AU42_A396EmprCod = new String[] {""} ;
      T00AU42_A252CliCod = new int[1] ;
      T00AU42_n252CliCod = new boolean[] {false} ;
      T00AU42_A65ArtCod = new String[] {""} ;
      T00AU42_n65ArtCod = new boolean[] {false} ;
      T00AU42_A4658MdlCod = new String[] {""} ;
      T00AU43_A396EmprCod = new String[] {""} ;
      T00AU43_A252CliCod = new int[1] ;
      T00AU43_n252CliCod = new boolean[] {false} ;
      T00AU43_A4175WebEmpCod = new String[] {""} ;
      T00AU44_A396EmprCod = new String[] {""} ;
      T00AU44_A252CliCod = new int[1] ;
      T00AU44_n252CliCod = new boolean[] {false} ;
      T00AU44_A4079WEBDISCOD = new String[] {""} ;
      T00AU45_A396EmprCod = new String[] {""} ;
      T00AU45_A252CliCod = new int[1] ;
      T00AU45_n252CliCod = new boolean[] {false} ;
      T00AU45_A65ArtCod = new String[] {""} ;
      T00AU45_n65ArtCod = new boolean[] {false} ;
      T00AU45_A4058CCFColNom = new String[] {""} ;
      T00AU45_A4059CCFColNum = new int[1] ;
      T00AU46_A396EmprCod = new String[] {""} ;
      T00AU46_A252CliCod = new int[1] ;
      T00AU46_n252CliCod = new boolean[] {false} ;
      T00AU46_A65ArtCod = new String[] {""} ;
      T00AU46_n65ArtCod = new boolean[] {false} ;
      T00AU46_A1177Dibujo = new String[] {""} ;
      T00AU46_A1790DibIntCod = new int[1] ;
      T00AU47_A396EmprCod = new String[] {""} ;
      T00AU47_A252CliCod = new int[1] ;
      T00AU47_n252CliCod = new boolean[] {false} ;
      T00AU47_A65ArtCod = new String[] {""} ;
      T00AU47_n65ArtCod = new boolean[] {false} ;
      T00AU47_A1080LinPre = new byte[1] ;
      T00AU48_A396EmprCod = new String[] {""} ;
      T00AU48_A3814PePCod = new long[1] ;
      T00AU49_A396EmprCod = new String[] {""} ;
      T00AU49_A3413OpeManCod = new byte[1] ;
      T00AU49_A3430PreManNMt = new String[] {""} ;
      T00AU49_A252CliCod = new int[1] ;
      T00AU49_n252CliCod = new boolean[] {false} ;
      T00AU49_A65ArtCod = new String[] {""} ;
      T00AU49_n65ArtCod = new boolean[] {false} ;
      T00AU50_A396EmprCod = new String[] {""} ;
      T00AU50_A3415ParManNum = new int[1] ;
      T00AU51_A396EmprCod = new String[] {""} ;
      T00AU51_A3331LanBroCod = new byte[1] ;
      T00AU51_A3333LanBroLin = new short[1] ;
      T00AU52_A396EmprCod = new String[] {""} ;
      T00AU52_A252CliCod = new int[1] ;
      T00AU52_n252CliCod = new boolean[] {false} ;
      T00AU52_A65ArtCod = new String[] {""} ;
      T00AU52_n65ArtCod = new boolean[] {false} ;
      T00AU52_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AU53_A396EmprCod = new String[] {""} ;
      T00AU53_A252CliCod = new int[1] ;
      T00AU53_n252CliCod = new boolean[] {false} ;
      T00AU53_A65ArtCod = new String[] {""} ;
      T00AU53_n65ArtCod = new boolean[] {false} ;
      T00AU53_A3288CCalCod = new String[] {""} ;
      T00AU54_A396EmprCod = new String[] {""} ;
      T00AU54_A252CliCod = new int[1] ;
      T00AU54_n252CliCod = new boolean[] {false} ;
      T00AU54_A65ArtCod = new String[] {""} ;
      T00AU54_n65ArtCod = new boolean[] {false} ;
      T00AU54_A3033CCCod = new String[] {""} ;
      T00AU55_A396EmprCod = new String[] {""} ;
      T00AU55_A252CliCod = new int[1] ;
      T00AU55_n252CliCod = new boolean[] {false} ;
      T00AU55_A65ArtCod = new String[] {""} ;
      T00AU55_n65ArtCod = new boolean[] {false} ;
      T00AU55_A2937RecIntCod = new byte[1] ;
      T00AU56_A396EmprCod = new String[] {""} ;
      T00AU56_A252CliCod = new int[1] ;
      T00AU56_n252CliCod = new boolean[] {false} ;
      T00AU56_A65ArtCod = new String[] {""} ;
      T00AU56_n65ArtCod = new boolean[] {false} ;
      T00AU56_A2931Limite2 = new short[1] ;
      T00AU57_A396EmprCod = new String[] {""} ;
      T00AU57_A252CliCod = new int[1] ;
      T00AU57_n252CliCod = new boolean[] {false} ;
      T00AU57_A65ArtCod = new String[] {""} ;
      T00AU57_n65ArtCod = new boolean[] {false} ;
      T00AU57_A71ArtEstAny = new short[1] ;
      T00AU57_A2756ArtEstSer = new String[] {""} ;
      T00AU58_A396EmprCod = new String[] {""} ;
      T00AU58_A252CliCod = new int[1] ;
      T00AU58_n252CliCod = new boolean[] {false} ;
      T00AU58_A1504CliProCod = new String[] {""} ;
      T00AU58_A65ArtCod = new String[] {""} ;
      T00AU58_n65ArtCod = new boolean[] {false} ;
      T00AU59_A396EmprCod = new String[] {""} ;
      T00AU59_A252CliCod = new int[1] ;
      T00AU59_n252CliCod = new boolean[] {false} ;
      T00AU59_A65ArtCod = new String[] {""} ;
      T00AU59_n65ArtCod = new boolean[] {false} ;
      T00AU59_A598LinRec = new byte[1] ;
      T00AU60_A396EmprCod = new String[] {""} ;
      T00AU60_A252CliCod = new int[1] ;
      T00AU60_n252CliCod = new boolean[] {false} ;
      T00AU60_A65ArtCod = new String[] {""} ;
      T00AU60_n65ArtCod = new boolean[] {false} ;
      T00AU60_A831TipColCod = new byte[1] ;
      T00AU61_A396EmprCod = new String[] {""} ;
      T00AU61_A252CliCod = new int[1] ;
      T00AU61_n252CliCod = new boolean[] {false} ;
      T00AU61_A65ArtCod = new String[] {""} ;
      T00AU61_n65ArtCod = new boolean[] {false} ;
      T00AU61_A758ProCod = new String[] {""} ;
      T00AU61_n758ProCod = new boolean[] {false} ;
      T00AU61_A457FasCod = new String[] {""} ;
      T00AU62_A396EmprCod = new String[] {""} ;
      T00AU62_A252CliCod = new int[1] ;
      T00AU62_n252CliCod = new boolean[] {false} ;
      T00AU62_A65ArtCod = new String[] {""} ;
      T00AU62_n65ArtCod = new boolean[] {false} ;
      Z759ProDsc = "" ;
      Z5289ProProvi = "" ;
      T00AU63_A252CliCod = new int[1] ;
      T00AU63_n252CliCod = new boolean[] {false} ;
      T00AU63_A65ArtCod = new String[] {""} ;
      T00AU63_n65ArtCod = new boolean[] {false} ;
      T00AU63_A10412ProAct = new String[] {""} ;
      T00AU63_A10553ProUserA = new String[] {""} ;
      T00AU63_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU63_A12141ProSta = new byte[1] ;
      T00AU63_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU63_A10555ProUserM = new String[] {""} ;
      T00AU63_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU63_A759ProDsc = new String[] {""} ;
      T00AU63_A5289ProProvi = new String[] {""} ;
      T00AU63_A10026DscCFa = new String[] {""} ;
      T00AU63_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AU63_A396EmprCod = new String[] {""} ;
      T00AU63_A758ProCod = new String[] {""} ;
      T00AU63_n758ProCod = new boolean[] {false} ;
      T00AU4_A759ProDsc = new String[] {""} ;
      T00AU4_A5289ProProvi = new String[] {""} ;
      T00AU64_A759ProDsc = new String[] {""} ;
      T00AU64_A5289ProProvi = new String[] {""} ;
      T00AU65_A396EmprCod = new String[] {""} ;
      T00AU65_A252CliCod = new int[1] ;
      T00AU65_n252CliCod = new boolean[] {false} ;
      T00AU65_A65ArtCod = new String[] {""} ;
      T00AU65_n65ArtCod = new boolean[] {false} ;
      T00AU65_A758ProCod = new String[] {""} ;
      T00AU65_n758ProCod = new boolean[] {false} ;
      T00AU3_A252CliCod = new int[1] ;
      T00AU3_n252CliCod = new boolean[] {false} ;
      T00AU3_A65ArtCod = new String[] {""} ;
      T00AU3_n65ArtCod = new boolean[] {false} ;
      T00AU3_A10412ProAct = new String[] {""} ;
      T00AU3_A10553ProUserA = new String[] {""} ;
      T00AU3_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU3_A12141ProSta = new byte[1] ;
      T00AU3_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU3_A10555ProUserM = new String[] {""} ;
      T00AU3_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU3_A10026DscCFa = new String[] {""} ;
      T00AU3_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AU3_A396EmprCod = new String[] {""} ;
      T00AU3_A758ProCod = new String[] {""} ;
      T00AU3_n758ProCod = new boolean[] {false} ;
      T00AU2_A252CliCod = new int[1] ;
      T00AU2_n252CliCod = new boolean[] {false} ;
      T00AU2_A65ArtCod = new String[] {""} ;
      T00AU2_n65ArtCod = new boolean[] {false} ;
      T00AU2_A10412ProAct = new String[] {""} ;
      T00AU2_A10553ProUserA = new String[] {""} ;
      T00AU2_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU2_A12141ProSta = new byte[1] ;
      T00AU2_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU2_A10555ProUserM = new String[] {""} ;
      T00AU2_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      T00AU2_A10026DscCFa = new String[] {""} ;
      T00AU2_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AU2_A396EmprCod = new String[] {""} ;
      T00AU2_A758ProCod = new String[] {""} ;
      T00AU2_n758ProCod = new boolean[] {false} ;
      GXv_char9 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char4 = new String[1] ;
      T00AU69_A759ProDsc = new String[] {""} ;
      T00AU69_A5289ProProvi = new String[] {""} ;
      T00AU70_A396EmprCod = new String[] {""} ;
      T00AU70_A11604PArtId = new int[1] ;
      T00AU71_A396EmprCod = new String[] {""} ;
      T00AU71_A252CliCod = new int[1] ;
      T00AU71_n252CliCod = new boolean[] {false} ;
      T00AU71_A65ArtCod = new String[] {""} ;
      T00AU71_n65ArtCod = new boolean[] {false} ;
      T00AU71_A758ProCod = new String[] {""} ;
      T00AU71_n758ProCod = new boolean[] {false} ;
      T00AU71_A9836FasCodM = new String[] {""} ;
      T00AU72_A396EmprCod = new String[] {""} ;
      T00AU72_A252CliCod = new int[1] ;
      T00AU72_n252CliCod = new boolean[] {false} ;
      T00AU72_A65ArtCod = new String[] {""} ;
      T00AU72_n65ArtCod = new boolean[] {false} ;
      T00AU72_A758ProCod = new String[] {""} ;
      T00AU72_n758ProCod = new boolean[] {false} ;
      T00AU72_A6986NumLinPro = new short[1] ;
      T00AU73_A396EmprCod = new String[] {""} ;
      T00AU73_A252CliCod = new int[1] ;
      T00AU73_n252CliCod = new boolean[] {false} ;
      T00AU73_A65ArtCod = new String[] {""} ;
      T00AU73_n65ArtCod = new boolean[] {false} ;
      T00AU73_A4658MdlCod = new String[] {""} ;
      T00AU73_A758ProCod = new String[] {""} ;
      T00AU73_n758ProCod = new boolean[] {false} ;
      T00AU74_A396EmprCod = new String[] {""} ;
      T00AU74_A252CliCod = new int[1] ;
      T00AU74_n252CliCod = new boolean[] {false} ;
      T00AU74_A65ArtCod = new String[] {""} ;
      T00AU74_n65ArtCod = new boolean[] {false} ;
      T00AU74_A758ProCod = new String[] {""} ;
      T00AU74_n758ProCod = new boolean[] {false} ;
      T00AU74_A457FasCod = new String[] {""} ;
      T00AU75_A396EmprCod = new String[] {""} ;
      T00AU75_A252CliCod = new int[1] ;
      T00AU75_n252CliCod = new boolean[] {false} ;
      T00AU75_A65ArtCod = new String[] {""} ;
      T00AU75_n65ArtCod = new boolean[] {false} ;
      T00AU75_A758ProCod = new String[] {""} ;
      T00AU75_n758ProCod = new boolean[] {false} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10412ProAct = "" ;
      i10553ProUserA = "" ;
      i10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      i12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tarticp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tarticp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tarticp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tarticp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticp__default(),
         new Object[] {
             new Object[] {
            T00AU2_A252CliCod, T00AU2_A65ArtCod, T00AU2_A10412ProAct, T00AU2_A10553ProUserA, T00AU2_A10554ProFecA, T00AU2_A12141ProSta, T00AU2_A12142ProStFec, T00AU2_A10555ProUserM, T00AU2_A10556ProFecM, T00AU2_A10026DscCFa,
            T00AU2_A11272ProFabs, T00AU2_A396EmprCod, T00AU2_A758ProCod
            }
            , new Object[] {
            T00AU3_A252CliCod, T00AU3_A65ArtCod, T00AU3_A10412ProAct, T00AU3_A10553ProUserA, T00AU3_A10554ProFecA, T00AU3_A12141ProSta, T00AU3_A12142ProStFec, T00AU3_A10555ProUserM, T00AU3_A10556ProFecM, T00AU3_A10026DscCFa,
            T00AU3_A11272ProFabs, T00AU3_A396EmprCod, T00AU3_A758ProCod
            }
            , new Object[] {
            T00AU4_A759ProDsc, T00AU4_A5289ProProvi
            }
            , new Object[] {
            T00AU5_A65ArtCod, T00AU5_A69ArtDsc, T00AU5_n69ArtDsc, T00AU5_A396EmprCod, T00AU5_A252CliCod
            }
            , new Object[] {
            T00AU6_A65ArtCod, T00AU6_A69ArtDsc, T00AU6_n69ArtDsc, T00AU6_A396EmprCod, T00AU6_A252CliCod
            }
            , new Object[] {
            T00AU7_A407EmprNom, T00AU7_n407EmprNom
            }
            , new Object[] {
            T00AU8_A279CliNom
            }
            , new Object[] {
            T00AU9_A65ArtCod, T00AU9_A279CliNom, T00AU9_A407EmprNom, T00AU9_n407EmprNom, T00AU9_A69ArtDsc, T00AU9_n69ArtDsc, T00AU9_A396EmprCod, T00AU9_A252CliCod
            }
            , new Object[] {
            T00AU10_A279CliNom
            }
            , new Object[] {
            T00AU11_A396EmprCod, T00AU11_A252CliCod, T00AU11_A65ArtCod
            }
            , new Object[] {
            T00AU12_A396EmprCod, T00AU12_A252CliCod, T00AU12_A65ArtCod
            }
            , new Object[] {
            T00AU13_A396EmprCod, T00AU13_A252CliCod, T00AU13_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00AU17_A279CliNom
            }
            , new Object[] {
            T00AU18_A396EmprCod, T00AU18_A252CliCod, T00AU18_A65ArtCod, T00AU18_A499GrpFamCod
            }
            , new Object[] {
            T00AU19_A396EmprCod, T00AU19_A252CliCod, T00AU19_A12814ARTConID, T00AU19_A65ArtCod
            }
            , new Object[] {
            T00AU20_A396EmprCod, T00AU20_A252CliCod, T00AU20_A65ArtCod, T00AU20_A12363SocInt
            }
            , new Object[] {
            T00AU21_A396EmprCod, T00AU21_A4929Inc_Dia, T00AU21_A5728JBCLLin
            }
            , new Object[] {
            T00AU22_A396EmprCod, T00AU22_A252CliCod, T00AU22_A5809MMezCod, T00AU22_A65ArtCod
            }
            , new Object[] {
            T00AU23_A396EmprCod, T00AU23_A252CliCod, T00AU23_A5234MezCod, T00AU23_A5240MezLin
            }
            , new Object[] {
            T00AU24_A396EmprCod, T00AU24_A252CliCod, T00AU24_A65ArtCod, T00AU24_A4116estreclim
            }
            , new Object[] {
            T00AU25_A396EmprCod, T00AU25_A252CliCod, T00AU25_A65ArtCod, T00AU25_A4061EstNomCol
            }
            , new Object[] {
            T00AU26_A396EmprCod, T00AU26_A9705ErpNped, T00AU26_A8652ErpLin
            }
            , new Object[] {
            T00AU27_A396EmprCod, T00AU27_A252CliCod, T00AU27_A65ArtCod, T00AU27_A7266CAAqP
            }
            , new Object[] {
            T00AU28_A396EmprCod, T00AU28_A252CliCod, T00AU28_A65ArtCod, T00AU28_A11084H_DiaA
            }
            , new Object[] {
            T00AU29_A396EmprCod, T00AU29_A252CliCod, T00AU29_A65ArtCod, T00AU29_A10972Int_cod
            }
            , new Object[] {
            T00AU30_A396EmprCod, T00AU30_A252CliCod, T00AU30_A65ArtCod, T00AU30_A10577Pg_Procod
            }
            , new Object[] {
            T00AU31_A396EmprCod, T00AU31_A252CliCod, T00AU31_A65ArtCod, T00AU31_A10272Hz_cod
            }
            , new Object[] {
            T00AU32_A396EmprCod, T00AU32_A252CliCod, T00AU32_A65ArtCod, T00AU32_A10041ArtSH
            }
            , new Object[] {
            T00AU33_A396EmprCod, T00AU33_A252CliCod, T00AU33_A65ArtCod, T00AU33_A8427TipoCt, T00AU33_A8428CapMxMq
            }
            , new Object[] {
            T00AU34_A396EmprCod, T00AU34_A252CliCod, T00AU34_A65ArtCod, T00AU34_A8342CodPred
            }
            , new Object[] {
            T00AU35_A396EmprCod, T00AU35_A252CliCod, T00AU35_A65ArtCod, T00AU35_A8089ArtcodTj
            }
            , new Object[] {
            T00AU36_A396EmprCod, T00AU36_A252CliCod, T00AU36_A65ArtCod, T00AU36_A7956Mq_CodM
            }
            , new Object[] {
            T00AU37_A396EmprCod, T00AU37_A252CliCod, T00AU37_A65ArtCod, T00AU37_A7949Par_Art
            }
            , new Object[] {
            T00AU38_A396EmprCod, T00AU38_A252CliCod, T00AU38_A65ArtCod, T00AU38_A7135Lin_fast
            }
            , new Object[] {
            T00AU39_A396EmprCod, T00AU39_A252CliCod, T00AU39_A65ArtCod, T00AU39_A6954Mat_lin
            }
            , new Object[] {
            T00AU40_A396EmprCod, T00AU40_A602MaqCod, T00AU40_A6078MaqCliCod, T00AU40_A6079MaqArtCod
            }
            , new Object[] {
            T00AU41_A396EmprCod, T00AU41_A252CliCod, T00AU41_A65ArtCod, T00AU41_A5382EstCatAny, T00AU41_A5383EstCatSer, T00AU41_A5384EstCatTip
            }
            , new Object[] {
            T00AU42_A396EmprCod, T00AU42_A252CliCod, T00AU42_A65ArtCod, T00AU42_A4658MdlCod
            }
            , new Object[] {
            T00AU43_A396EmprCod, T00AU43_A252CliCod, T00AU43_A4175WebEmpCod
            }
            , new Object[] {
            T00AU44_A396EmprCod, T00AU44_A252CliCod, T00AU44_A4079WEBDISCOD
            }
            , new Object[] {
            T00AU45_A396EmprCod, T00AU45_A252CliCod, T00AU45_A65ArtCod, T00AU45_A4058CCFColNom, T00AU45_A4059CCFColNum
            }
            , new Object[] {
            T00AU46_A396EmprCod, T00AU46_A252CliCod, T00AU46_A65ArtCod, T00AU46_A1177Dibujo, T00AU46_A1790DibIntCod
            }
            , new Object[] {
            T00AU47_A396EmprCod, T00AU47_A252CliCod, T00AU47_A65ArtCod, T00AU47_A1080LinPre
            }
            , new Object[] {
            T00AU48_A396EmprCod, T00AU48_A3814PePCod
            }
            , new Object[] {
            T00AU49_A396EmprCod, T00AU49_A3413OpeManCod, T00AU49_A3430PreManNMt, T00AU49_A252CliCod, T00AU49_A65ArtCod
            }
            , new Object[] {
            T00AU50_A396EmprCod, T00AU50_A3415ParManNum
            }
            , new Object[] {
            T00AU51_A396EmprCod, T00AU51_A3331LanBroCod, T00AU51_A3333LanBroLin
            }
            , new Object[] {
            T00AU52_A396EmprCod, T00AU52_A252CliCod, T00AU52_A65ArtCod, T00AU52_A3319ArtCapKgs
            }
            , new Object[] {
            T00AU53_A396EmprCod, T00AU53_A252CliCod, T00AU53_A65ArtCod, T00AU53_A3288CCalCod
            }
            , new Object[] {
            T00AU54_A396EmprCod, T00AU54_A252CliCod, T00AU54_A65ArtCod, T00AU54_A3033CCCod
            }
            , new Object[] {
            T00AU55_A396EmprCod, T00AU55_A252CliCod, T00AU55_A65ArtCod, T00AU55_A2937RecIntCod
            }
            , new Object[] {
            T00AU56_A396EmprCod, T00AU56_A252CliCod, T00AU56_A65ArtCod, T00AU56_A2931Limite2
            }
            , new Object[] {
            T00AU57_A396EmprCod, T00AU57_A252CliCod, T00AU57_A65ArtCod, T00AU57_A71ArtEstAny, T00AU57_A2756ArtEstSer
            }
            , new Object[] {
            T00AU58_A396EmprCod, T00AU58_A252CliCod, T00AU58_A1504CliProCod, T00AU58_A65ArtCod
            }
            , new Object[] {
            T00AU59_A396EmprCod, T00AU59_A252CliCod, T00AU59_A65ArtCod, T00AU59_A598LinRec
            }
            , new Object[] {
            T00AU60_A396EmprCod, T00AU60_A252CliCod, T00AU60_A65ArtCod, T00AU60_A831TipColCod
            }
            , new Object[] {
            T00AU61_A396EmprCod, T00AU61_A252CliCod, T00AU61_A65ArtCod, T00AU61_A758ProCod, T00AU61_A457FasCod
            }
            , new Object[] {
            T00AU62_A396EmprCod, T00AU62_A252CliCod, T00AU62_A65ArtCod
            }
            , new Object[] {
            T00AU63_A252CliCod, T00AU63_A65ArtCod, T00AU63_A10412ProAct, T00AU63_A10553ProUserA, T00AU63_A10554ProFecA, T00AU63_A12141ProSta, T00AU63_A12142ProStFec, T00AU63_A10555ProUserM, T00AU63_A10556ProFecM, T00AU63_A759ProDsc,
            T00AU63_A5289ProProvi, T00AU63_A10026DscCFa, T00AU63_A11272ProFabs, T00AU63_A396EmprCod, T00AU63_A758ProCod
            }
            , new Object[] {
            T00AU64_A759ProDsc, T00AU64_A5289ProProvi
            }
            , new Object[] {
            T00AU65_A396EmprCod, T00AU65_A252CliCod, T00AU65_A65ArtCod, T00AU65_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00AU69_A759ProDsc, T00AU69_A5289ProProvi
            }
            , new Object[] {
            T00AU70_A396EmprCod, T00AU70_A11604PArtId
            }
            , new Object[] {
            T00AU71_A396EmprCod, T00AU71_A252CliCod, T00AU71_A65ArtCod, T00AU71_A758ProCod, T00AU71_A9836FasCodM
            }
            , new Object[] {
            T00AU72_A396EmprCod, T00AU72_A252CliCod, T00AU72_A65ArtCod, T00AU72_A758ProCod, T00AU72_A6986NumLinPro
            }
            , new Object[] {
            T00AU73_A396EmprCod, T00AU73_A252CliCod, T00AU73_A65ArtCod, T00AU73_A4658MdlCod, T00AU73_A758ProCod
            }
            , new Object[] {
            T00AU74_A396EmprCod, T00AU74_A252CliCod, T00AU74_A65ArtCod, T00AU74_A758ProCod, T00AU74_A457FasCod
            }
            , new Object[] {
            T00AU75_A396EmprCod, T00AU75_A252CliCod, T00AU75_A65ArtCod, T00AU75_A758ProCod
            }
         }
      );
      AV80Pgmname = "TARTICP" ;
      Z12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      i12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      Z12141ProSta = (byte)(0) ;
      A12141ProSta = (byte)(0) ;
      i12141ProSta = (byte)(0) ;
      Z10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z10553ProUserA = "" ;
      A10553ProUserA = "" ;
      i10553ProUserA = "" ;
      Z10412ProAct = httpContext.getMessage( "S", "") ;
      O10412ProAct = httpContext.getMessage( "S", "") ;
      A10412ProAct = httpContext.getMessage( "S", "") ;
      T10412ProAct = httpContext.getMessage( "S", "") ;
      i10412ProAct = httpContext.getMessage( "S", "") ;
      WebComp_Wcwcartfor = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcserpau = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte Z12141ProSta ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV63Foraca ;
   private byte A12141ProSta ;
   private byte AV68Parfss ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i12141ProSta ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_11 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount11 ;
   private short RcdFound11 ;
   private short nBlankRcdUsr11 ;
   private short RcdFound10 ;
   private short nCmpId ;
   private short nIsDirty_10 ;
   private short nIsDirty_11 ;
   private int wcpOAV71CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_47 ;
   private int nGXsfl_47_idx=1 ;
   private int A252CliCod ;
   private int AV71CliCod ;
   private int trnEnded ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int bttBtneliminarinfasociada_Visible ;
   private int divTabletabs_Visible ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int divUnnamedtable2_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int subGridlevel_level1_Rows ;
   private int edtProCod_Enabled ;
   private int edtProUserA_Enabled ;
   private int edtProFecA_Enabled ;
   private int edtProUserM_Enabled ;
   private int edtProFecM_Enabled ;
   private int fRowAdded ;
   private int Gxuitabspanel_tabs_Activepage ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_procod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int GXv_int8[] ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtProFecM_Enabled ;
   private int defedtProUserM_Enabled ;
   private int defedtProFecA_Enabled ;
   private int defedtProUserA_Enabled ;
   private int defedtProCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11272ProFabs ;
   private java.math.BigDecimal A11272ProFabs ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV57EmprCod ;
   private String wcpOAV72ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z69ArtDsc ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Result ;
   private String Z758ProCod ;
   private String Z10412ProAct ;
   private String Z10553ProUserA ;
   private String Z10555ProUserM ;
   private String Z10026DscCFa ;
   private String O10412ProAct ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String Gx_mode ;
   private String AV57EmprCod ;
   private String AV72ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_47_idx="0001" ;
   private String AV17UsurCod ;
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
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtArtCod_Internalname ;
   private String A65ArtCod ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtneliminarinfasociada_Internalname ;
   private String bttBtneliminarinfasociada_Jsonclick ;
   private String divTabletabs_Internalname ;
   private String Gxuitabspanel_tabs_Class ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTratamientosquimicos_title_Internalname ;
   private String lblTratamientosquimicos_title_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wcwcartfor_Component ;
   private String OldWcwcartfor ;
   private String lblParametros_title_Internalname ;
   private String lblParametros_title_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcwcserpau_Component ;
   private String OldWcwcserpau ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV80Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_procod_Caption ;
   private String Combo_procod_Cls ;
   private String Combo_procod_Internalname ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btneliminarinfasociada_Internalname ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Title ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Confirmationtext ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Confirmtype ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Internalname ;
   private String Gridlevel_level1_titlescategories_Gridtitlescategories ;
   private String Gridlevel_level1_titlescategories_Internalname ;
   private String sMode11 ;
   private String edtProCod_Internalname ;
   private String edtProUserA_Internalname ;
   private String edtProFecA_Internalname ;
   private String edtProUserM_Internalname ;
   private String edtProFecM_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A10026DscCFa ;
   private String A759ProDsc ;
   private String A5289ProProvi ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Gxuitabspanel_tabs_Objectcall ;
   private String Gxuitabspanel_tabs_Activepagecontrolname ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_procod_Objectcall ;
   private String Combo_procod_Class ;
   private String Combo_procod_Icontype ;
   private String Combo_procod_Icon ;
   private String Combo_procod_Tooltip ;
   private String Combo_procod_Selectedvalue_set ;
   private String Combo_procod_Selectedvalue_get ;
   private String Combo_procod_Selectedtext_set ;
   private String Combo_procod_Selectedtext_get ;
   private String Combo_procod_Gamoauthtoken ;
   private String Combo_procod_Ddointernalname ;
   private String Combo_procod_Titlecontrolalign ;
   private String Combo_procod_Dropdownoptionstype ;
   private String Combo_procod_Titlecontrolidtoreplace ;
   private String Combo_procod_Datalisttype ;
   private String Combo_procod_Datalistfixedvalues ;
   private String Combo_procod_Datalistproc ;
   private String Combo_procod_Datalistprocparametersprefix ;
   private String Combo_procod_Remoteservicesparameters ;
   private String Combo_procod_Htmltemplate ;
   private String Combo_procod_Multiplevaluestype ;
   private String Combo_procod_Loadingdata ;
   private String Combo_procod_Noresultsfound ;
   private String Combo_procod_Emptyitemtext ;
   private String Combo_procod_Onlyselectedvalues ;
   private String Combo_procod_Selectalltext ;
   private String Combo_procod_Multiplevaluesseparator ;
   private String Combo_procod_Addnewoptiontext ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Objectcall ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Width ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Height ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Class ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Comment ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Bodytype ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_btneliminarinfasociada_Texttype ;
   private String Gridlevel_level1_titlescategories_Objectcall ;
   private String Gridlevel_level1_titlescategories_Class ;
   private String Gridlevel_level1_titlescategories_Gridinternalname ;
   private String hsh ;
   private String sMode10 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A10553ProUserA ;
   private String A10555ProUserM ;
   private String A10412ProAct ;
   private String T10412ProAct ;
   private String AV52Station ;
   private String GXt_char1 ;
   private String AV16EmprNom ;
   private String AV78AusEmprCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z5289ProProvi ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String sGXsfl_47_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtProCod_Jsonclick ;
   private String edtProUserA_Jsonclick ;
   private String edtProFecA_Jsonclick ;
   private String edtProUserM_Jsonclick ;
   private String edtProFecM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10412ProAct ;
   private String i10553ProUserA ;
   private String subGridlevel_level1_Header ;
   private java.util.Date Z10554ProFecA ;
   private java.util.Date Z12142ProStFec ;
   private java.util.Date Z10556ProFecM ;
   private java.util.Date A12142ProStFec ;
   private java.util.Date A10554ProFecA ;
   private java.util.Date A10556ProFecM ;
   private java.util.Date i10554ProFecA ;
   private java.util.Date i12142ProStFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n758ProCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Combo_procod_Isgriditem ;
   private boolean Combo_procod_Emptyitem ;
   private boolean bGXsfl_47_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Gxuitabspanel_tabs_Enabled ;
   private boolean Gxuitabspanel_tabs_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_procod_Enabled ;
   private boolean Combo_procod_Visible ;
   private boolean Combo_procod_Allowmultipleselection ;
   private boolean Combo_procod_Hasdescription ;
   private boolean Combo_procod_Includeonlyselectedoption ;
   private boolean Combo_procod_Includeselectalloption ;
   private boolean Combo_procod_Includeaddnewoption ;
   private boolean Dvelop_confirmpanel_btneliminarinfasociada_Enabled ;
   private boolean Dvelop_confirmpanel_btneliminarinfasociada_Visible ;
   private boolean Gridlevel_level1_titlescategories_Enabled ;
   private boolean Gridlevel_level1_titlescategories_Visible ;
   private boolean n65ArtCod ;
   private boolean n69ArtDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV77ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private GXWebComponent WebComp_Wcwcartfor ;
   private GXWebComponent WebComp_Wcwcserpau ;
   private com.genexus.webpanels.WebSession AV75WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_procod ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btneliminarinfasociada ;
   private com.genexus.webpanels.GXUserControl ucGridlevel_level1_titlescategories ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkProAct ;
   private IDataStoreProvider pr_default ;
   private String[] T00AU7_A407EmprNom ;
   private boolean[] T00AU7_n407EmprNom ;
   private String[] T00AU8_A279CliNom ;
   private String[] T00AU9_A65ArtCod ;
   private boolean[] T00AU9_n65ArtCod ;
   private String[] T00AU9_A279CliNom ;
   private String[] T00AU9_A407EmprNom ;
   private boolean[] T00AU9_n407EmprNom ;
   private String[] T00AU9_A69ArtDsc ;
   private boolean[] T00AU9_n69ArtDsc ;
   private String[] T00AU9_A396EmprCod ;
   private int[] T00AU9_A252CliCod ;
   private boolean[] T00AU9_n252CliCod ;
   private String[] T00AU10_A279CliNom ;
   private String[] T00AU11_A396EmprCod ;
   private int[] T00AU11_A252CliCod ;
   private boolean[] T00AU11_n252CliCod ;
   private String[] T00AU11_A65ArtCod ;
   private boolean[] T00AU11_n65ArtCod ;
   private String[] T00AU6_A65ArtCod ;
   private boolean[] T00AU6_n65ArtCod ;
   private String[] T00AU6_A69ArtDsc ;
   private boolean[] T00AU6_n69ArtDsc ;
   private String[] T00AU6_A396EmprCod ;
   private int[] T00AU6_A252CliCod ;
   private boolean[] T00AU6_n252CliCod ;
   private String[] T00AU12_A396EmprCod ;
   private int[] T00AU12_A252CliCod ;
   private boolean[] T00AU12_n252CliCod ;
   private String[] T00AU12_A65ArtCod ;
   private boolean[] T00AU12_n65ArtCod ;
   private String[] T00AU13_A396EmprCod ;
   private int[] T00AU13_A252CliCod ;
   private boolean[] T00AU13_n252CliCod ;
   private String[] T00AU13_A65ArtCod ;
   private boolean[] T00AU13_n65ArtCod ;
   private String[] T00AU5_A65ArtCod ;
   private boolean[] T00AU5_n65ArtCod ;
   private String[] T00AU5_A69ArtDsc ;
   private boolean[] T00AU5_n69ArtDsc ;
   private String[] T00AU5_A396EmprCod ;
   private int[] T00AU5_A252CliCod ;
   private boolean[] T00AU5_n252CliCod ;
   private String[] T00AU17_A279CliNom ;
   private String[] T00AU18_A396EmprCod ;
   private int[] T00AU18_A252CliCod ;
   private boolean[] T00AU18_n252CliCod ;
   private String[] T00AU18_A65ArtCod ;
   private boolean[] T00AU18_n65ArtCod ;
   private byte[] T00AU18_A499GrpFamCod ;
   private String[] T00AU19_A396EmprCod ;
   private int[] T00AU19_A252CliCod ;
   private boolean[] T00AU19_n252CliCod ;
   private String[] T00AU19_A12814ARTConID ;
   private String[] T00AU19_A65ArtCod ;
   private boolean[] T00AU19_n65ArtCod ;
   private String[] T00AU20_A396EmprCod ;
   private int[] T00AU20_A252CliCod ;
   private boolean[] T00AU20_n252CliCod ;
   private String[] T00AU20_A65ArtCod ;
   private boolean[] T00AU20_n65ArtCod ;
   private byte[] T00AU20_A12363SocInt ;
   private String[] T00AU21_A396EmprCod ;
   private java.util.Date[] T00AU21_A4929Inc_Dia ;
   private short[] T00AU21_A5728JBCLLin ;
   private String[] T00AU22_A396EmprCod ;
   private int[] T00AU22_A252CliCod ;
   private boolean[] T00AU22_n252CliCod ;
   private String[] T00AU22_A5809MMezCod ;
   private String[] T00AU22_A65ArtCod ;
   private boolean[] T00AU22_n65ArtCod ;
   private String[] T00AU23_A396EmprCod ;
   private int[] T00AU23_A252CliCod ;
   private boolean[] T00AU23_n252CliCod ;
   private String[] T00AU23_A5234MezCod ;
   private byte[] T00AU23_A5240MezLin ;
   private String[] T00AU24_A396EmprCod ;
   private int[] T00AU24_A252CliCod ;
   private boolean[] T00AU24_n252CliCod ;
   private String[] T00AU24_A65ArtCod ;
   private boolean[] T00AU24_n65ArtCod ;
   private int[] T00AU24_A4116estreclim ;
   private String[] T00AU25_A396EmprCod ;
   private int[] T00AU25_A252CliCod ;
   private boolean[] T00AU25_n252CliCod ;
   private String[] T00AU25_A65ArtCod ;
   private boolean[] T00AU25_n65ArtCod ;
   private String[] T00AU25_A4061EstNomCol ;
   private String[] T00AU26_A396EmprCod ;
   private String[] T00AU26_A9705ErpNped ;
   private short[] T00AU26_A8652ErpLin ;
   private String[] T00AU27_A396EmprCod ;
   private int[] T00AU27_A252CliCod ;
   private boolean[] T00AU27_n252CliCod ;
   private String[] T00AU27_A65ArtCod ;
   private boolean[] T00AU27_n65ArtCod ;
   private String[] T00AU27_A7266CAAqP ;
   private String[] T00AU28_A396EmprCod ;
   private int[] T00AU28_A252CliCod ;
   private boolean[] T00AU28_n252CliCod ;
   private String[] T00AU28_A65ArtCod ;
   private boolean[] T00AU28_n65ArtCod ;
   private java.util.Date[] T00AU28_A11084H_DiaA ;
   private String[] T00AU29_A396EmprCod ;
   private int[] T00AU29_A252CliCod ;
   private boolean[] T00AU29_n252CliCod ;
   private String[] T00AU29_A65ArtCod ;
   private boolean[] T00AU29_n65ArtCod ;
   private byte[] T00AU29_A10972Int_cod ;
   private String[] T00AU30_A396EmprCod ;
   private int[] T00AU30_A252CliCod ;
   private boolean[] T00AU30_n252CliCod ;
   private String[] T00AU30_A65ArtCod ;
   private boolean[] T00AU30_n65ArtCod ;
   private String[] T00AU30_A10577Pg_Procod ;
   private String[] T00AU31_A396EmprCod ;
   private int[] T00AU31_A252CliCod ;
   private boolean[] T00AU31_n252CliCod ;
   private String[] T00AU31_A65ArtCod ;
   private boolean[] T00AU31_n65ArtCod ;
   private String[] T00AU31_A10272Hz_cod ;
   private String[] T00AU32_A396EmprCod ;
   private int[] T00AU32_A252CliCod ;
   private boolean[] T00AU32_n252CliCod ;
   private String[] T00AU32_A65ArtCod ;
   private boolean[] T00AU32_n65ArtCod ;
   private String[] T00AU32_A10041ArtSH ;
   private String[] T00AU33_A396EmprCod ;
   private int[] T00AU33_A252CliCod ;
   private boolean[] T00AU33_n252CliCod ;
   private String[] T00AU33_A65ArtCod ;
   private boolean[] T00AU33_n65ArtCod ;
   private String[] T00AU33_A8427TipoCt ;
   private int[] T00AU33_A8428CapMxMq ;
   private String[] T00AU34_A396EmprCod ;
   private int[] T00AU34_A252CliCod ;
   private boolean[] T00AU34_n252CliCod ;
   private String[] T00AU34_A65ArtCod ;
   private boolean[] T00AU34_n65ArtCod ;
   private short[] T00AU34_A8342CodPred ;
   private String[] T00AU35_A396EmprCod ;
   private int[] T00AU35_A252CliCod ;
   private boolean[] T00AU35_n252CliCod ;
   private String[] T00AU35_A65ArtCod ;
   private boolean[] T00AU35_n65ArtCod ;
   private String[] T00AU35_A8089ArtcodTj ;
   private String[] T00AU36_A396EmprCod ;
   private int[] T00AU36_A252CliCod ;
   private boolean[] T00AU36_n252CliCod ;
   private String[] T00AU36_A65ArtCod ;
   private boolean[] T00AU36_n65ArtCod ;
   private String[] T00AU36_A7956Mq_CodM ;
   private String[] T00AU37_A396EmprCod ;
   private int[] T00AU37_A252CliCod ;
   private boolean[] T00AU37_n252CliCod ;
   private String[] T00AU37_A65ArtCod ;
   private boolean[] T00AU37_n65ArtCod ;
   private short[] T00AU37_A7949Par_Art ;
   private String[] T00AU38_A396EmprCod ;
   private int[] T00AU38_A252CliCod ;
   private boolean[] T00AU38_n252CliCod ;
   private String[] T00AU38_A65ArtCod ;
   private boolean[] T00AU38_n65ArtCod ;
   private short[] T00AU38_A7135Lin_fast ;
   private String[] T00AU39_A396EmprCod ;
   private int[] T00AU39_A252CliCod ;
   private boolean[] T00AU39_n252CliCod ;
   private String[] T00AU39_A65ArtCod ;
   private boolean[] T00AU39_n65ArtCod ;
   private short[] T00AU39_A6954Mat_lin ;
   private String[] T00AU40_A396EmprCod ;
   private String[] T00AU40_A602MaqCod ;
   private int[] T00AU40_A6078MaqCliCod ;
   private String[] T00AU40_A6079MaqArtCod ;
   private String[] T00AU41_A396EmprCod ;
   private int[] T00AU41_A252CliCod ;
   private boolean[] T00AU41_n252CliCod ;
   private String[] T00AU41_A65ArtCod ;
   private boolean[] T00AU41_n65ArtCod ;
   private short[] T00AU41_A5382EstCatAny ;
   private String[] T00AU41_A5383EstCatSer ;
   private short[] T00AU41_A5384EstCatTip ;
   private String[] T00AU42_A396EmprCod ;
   private int[] T00AU42_A252CliCod ;
   private boolean[] T00AU42_n252CliCod ;
   private String[] T00AU42_A65ArtCod ;
   private boolean[] T00AU42_n65ArtCod ;
   private String[] T00AU42_A4658MdlCod ;
   private String[] T00AU43_A396EmprCod ;
   private int[] T00AU43_A252CliCod ;
   private boolean[] T00AU43_n252CliCod ;
   private String[] T00AU43_A4175WebEmpCod ;
   private String[] T00AU44_A396EmprCod ;
   private int[] T00AU44_A252CliCod ;
   private boolean[] T00AU44_n252CliCod ;
   private String[] T00AU44_A4079WEBDISCOD ;
   private String[] T00AU45_A396EmprCod ;
   private int[] T00AU45_A252CliCod ;
   private boolean[] T00AU45_n252CliCod ;
   private String[] T00AU45_A65ArtCod ;
   private boolean[] T00AU45_n65ArtCod ;
   private String[] T00AU45_A4058CCFColNom ;
   private int[] T00AU45_A4059CCFColNum ;
   private String[] T00AU46_A396EmprCod ;
   private int[] T00AU46_A252CliCod ;
   private boolean[] T00AU46_n252CliCod ;
   private String[] T00AU46_A65ArtCod ;
   private boolean[] T00AU46_n65ArtCod ;
   private String[] T00AU46_A1177Dibujo ;
   private int[] T00AU46_A1790DibIntCod ;
   private String[] T00AU47_A396EmprCod ;
   private int[] T00AU47_A252CliCod ;
   private boolean[] T00AU47_n252CliCod ;
   private String[] T00AU47_A65ArtCod ;
   private boolean[] T00AU47_n65ArtCod ;
   private byte[] T00AU47_A1080LinPre ;
   private String[] T00AU48_A396EmprCod ;
   private long[] T00AU48_A3814PePCod ;
   private String[] T00AU49_A396EmprCod ;
   private byte[] T00AU49_A3413OpeManCod ;
   private String[] T00AU49_A3430PreManNMt ;
   private int[] T00AU49_A252CliCod ;
   private boolean[] T00AU49_n252CliCod ;
   private String[] T00AU49_A65ArtCod ;
   private boolean[] T00AU49_n65ArtCod ;
   private String[] T00AU50_A396EmprCod ;
   private int[] T00AU50_A3415ParManNum ;
   private String[] T00AU51_A396EmprCod ;
   private byte[] T00AU51_A3331LanBroCod ;
   private short[] T00AU51_A3333LanBroLin ;
   private String[] T00AU52_A396EmprCod ;
   private int[] T00AU52_A252CliCod ;
   private boolean[] T00AU52_n252CliCod ;
   private String[] T00AU52_A65ArtCod ;
   private boolean[] T00AU52_n65ArtCod ;
   private java.math.BigDecimal[] T00AU52_A3319ArtCapKgs ;
   private String[] T00AU53_A396EmprCod ;
   private int[] T00AU53_A252CliCod ;
   private boolean[] T00AU53_n252CliCod ;
   private String[] T00AU53_A65ArtCod ;
   private boolean[] T00AU53_n65ArtCod ;
   private String[] T00AU53_A3288CCalCod ;
   private String[] T00AU54_A396EmprCod ;
   private int[] T00AU54_A252CliCod ;
   private boolean[] T00AU54_n252CliCod ;
   private String[] T00AU54_A65ArtCod ;
   private boolean[] T00AU54_n65ArtCod ;
   private String[] T00AU54_A3033CCCod ;
   private String[] T00AU55_A396EmprCod ;
   private int[] T00AU55_A252CliCod ;
   private boolean[] T00AU55_n252CliCod ;
   private String[] T00AU55_A65ArtCod ;
   private boolean[] T00AU55_n65ArtCod ;
   private byte[] T00AU55_A2937RecIntCod ;
   private String[] T00AU56_A396EmprCod ;
   private int[] T00AU56_A252CliCod ;
   private boolean[] T00AU56_n252CliCod ;
   private String[] T00AU56_A65ArtCod ;
   private boolean[] T00AU56_n65ArtCod ;
   private short[] T00AU56_A2931Limite2 ;
   private String[] T00AU57_A396EmprCod ;
   private int[] T00AU57_A252CliCod ;
   private boolean[] T00AU57_n252CliCod ;
   private String[] T00AU57_A65ArtCod ;
   private boolean[] T00AU57_n65ArtCod ;
   private short[] T00AU57_A71ArtEstAny ;
   private String[] T00AU57_A2756ArtEstSer ;
   private String[] T00AU58_A396EmprCod ;
   private int[] T00AU58_A252CliCod ;
   private boolean[] T00AU58_n252CliCod ;
   private String[] T00AU58_A1504CliProCod ;
   private String[] T00AU58_A65ArtCod ;
   private boolean[] T00AU58_n65ArtCod ;
   private String[] T00AU59_A396EmprCod ;
   private int[] T00AU59_A252CliCod ;
   private boolean[] T00AU59_n252CliCod ;
   private String[] T00AU59_A65ArtCod ;
   private boolean[] T00AU59_n65ArtCod ;
   private byte[] T00AU59_A598LinRec ;
   private String[] T00AU60_A396EmprCod ;
   private int[] T00AU60_A252CliCod ;
   private boolean[] T00AU60_n252CliCod ;
   private String[] T00AU60_A65ArtCod ;
   private boolean[] T00AU60_n65ArtCod ;
   private byte[] T00AU60_A831TipColCod ;
   private String[] T00AU61_A396EmprCod ;
   private int[] T00AU61_A252CliCod ;
   private boolean[] T00AU61_n252CliCod ;
   private String[] T00AU61_A65ArtCod ;
   private boolean[] T00AU61_n65ArtCod ;
   private String[] T00AU61_A758ProCod ;
   private boolean[] T00AU61_n758ProCod ;
   private String[] T00AU61_A457FasCod ;
   private String[] T00AU62_A396EmprCod ;
   private int[] T00AU62_A252CliCod ;
   private boolean[] T00AU62_n252CliCod ;
   private String[] T00AU62_A65ArtCod ;
   private boolean[] T00AU62_n65ArtCod ;
   private int[] T00AU63_A252CliCod ;
   private boolean[] T00AU63_n252CliCod ;
   private String[] T00AU63_A65ArtCod ;
   private boolean[] T00AU63_n65ArtCod ;
   private String[] T00AU63_A10412ProAct ;
   private String[] T00AU63_A10553ProUserA ;
   private java.util.Date[] T00AU63_A10554ProFecA ;
   private byte[] T00AU63_A12141ProSta ;
   private java.util.Date[] T00AU63_A12142ProStFec ;
   private String[] T00AU63_A10555ProUserM ;
   private java.util.Date[] T00AU63_A10556ProFecM ;
   private String[] T00AU63_A759ProDsc ;
   private String[] T00AU63_A5289ProProvi ;
   private String[] T00AU63_A10026DscCFa ;
   private java.math.BigDecimal[] T00AU63_A11272ProFabs ;
   private String[] T00AU63_A396EmprCod ;
   private String[] T00AU63_A758ProCod ;
   private boolean[] T00AU63_n758ProCod ;
   private String[] T00AU4_A759ProDsc ;
   private String[] T00AU4_A5289ProProvi ;
   private String[] T00AU64_A759ProDsc ;
   private String[] T00AU64_A5289ProProvi ;
   private String[] T00AU65_A396EmprCod ;
   private int[] T00AU65_A252CliCod ;
   private boolean[] T00AU65_n252CliCod ;
   private String[] T00AU65_A65ArtCod ;
   private boolean[] T00AU65_n65ArtCod ;
   private String[] T00AU65_A758ProCod ;
   private boolean[] T00AU65_n758ProCod ;
   private int[] T00AU3_A252CliCod ;
   private boolean[] T00AU3_n252CliCod ;
   private String[] T00AU3_A65ArtCod ;
   private boolean[] T00AU3_n65ArtCod ;
   private String[] T00AU3_A10412ProAct ;
   private String[] T00AU3_A10553ProUserA ;
   private java.util.Date[] T00AU3_A10554ProFecA ;
   private byte[] T00AU3_A12141ProSta ;
   private java.util.Date[] T00AU3_A12142ProStFec ;
   private String[] T00AU3_A10555ProUserM ;
   private java.util.Date[] T00AU3_A10556ProFecM ;
   private String[] T00AU3_A10026DscCFa ;
   private java.math.BigDecimal[] T00AU3_A11272ProFabs ;
   private String[] T00AU3_A396EmprCod ;
   private String[] T00AU3_A758ProCod ;
   private boolean[] T00AU3_n758ProCod ;
   private int[] T00AU2_A252CliCod ;
   private boolean[] T00AU2_n252CliCod ;
   private String[] T00AU2_A65ArtCod ;
   private boolean[] T00AU2_n65ArtCod ;
   private String[] T00AU2_A10412ProAct ;
   private String[] T00AU2_A10553ProUserA ;
   private java.util.Date[] T00AU2_A10554ProFecA ;
   private byte[] T00AU2_A12141ProSta ;
   private java.util.Date[] T00AU2_A12142ProStFec ;
   private String[] T00AU2_A10555ProUserM ;
   private java.util.Date[] T00AU2_A10556ProFecM ;
   private String[] T00AU2_A10026DscCFa ;
   private java.math.BigDecimal[] T00AU2_A11272ProFabs ;
   private String[] T00AU2_A396EmprCod ;
   private String[] T00AU2_A758ProCod ;
   private boolean[] T00AU2_n758ProCod ;
   private String[] T00AU69_A759ProDsc ;
   private String[] T00AU69_A5289ProProvi ;
   private String[] T00AU70_A396EmprCod ;
   private int[] T00AU70_A11604PArtId ;
   private String[] T00AU71_A396EmprCod ;
   private int[] T00AU71_A252CliCod ;
   private boolean[] T00AU71_n252CliCod ;
   private String[] T00AU71_A65ArtCod ;
   private boolean[] T00AU71_n65ArtCod ;
   private String[] T00AU71_A758ProCod ;
   private boolean[] T00AU71_n758ProCod ;
   private String[] T00AU71_A9836FasCodM ;
   private String[] T00AU72_A396EmprCod ;
   private int[] T00AU72_A252CliCod ;
   private boolean[] T00AU72_n252CliCod ;
   private String[] T00AU72_A65ArtCod ;
   private boolean[] T00AU72_n65ArtCod ;
   private String[] T00AU72_A758ProCod ;
   private boolean[] T00AU72_n758ProCod ;
   private short[] T00AU72_A6986NumLinPro ;
   private String[] T00AU73_A396EmprCod ;
   private int[] T00AU73_A252CliCod ;
   private boolean[] T00AU73_n252CliCod ;
   private String[] T00AU73_A65ArtCod ;
   private boolean[] T00AU73_n65ArtCod ;
   private String[] T00AU73_A4658MdlCod ;
   private String[] T00AU73_A758ProCod ;
   private boolean[] T00AU73_n758ProCod ;
   private String[] T00AU74_A396EmprCod ;
   private int[] T00AU74_A252CliCod ;
   private boolean[] T00AU74_n252CliCod ;
   private String[] T00AU74_A65ArtCod ;
   private boolean[] T00AU74_n65ArtCod ;
   private String[] T00AU74_A758ProCod ;
   private boolean[] T00AU74_n758ProCod ;
   private String[] T00AU74_A457FasCod ;
   private String[] T00AU75_A396EmprCod ;
   private int[] T00AU75_A252CliCod ;
   private boolean[] T00AU75_n252CliCod ;
   private String[] T00AU75_A65ArtCod ;
   private boolean[] T00AU75_n65ArtCod ;
   private String[] T00AU75_A758ProCod ;
   private boolean[] T00AU75_n758ProCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV76ProCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV73WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV74TrnContext ;
}

final  class tarticp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00AU2", "SELECT CliCod, ArtCod, ProAct, ProUserA, ProFecA, ProSta, ProStFec, ProUserM, ProFecM, DscCFa, ProFabs, EmprCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?  FOR UPDATE OF ProAct, ProUserA, ProFecA, ProSta, ProStFec, ProUserM, ProFecM, DscCFa, ProFabs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU3", "SELECT CliCod, ArtCod, ProAct, ProUserA, ProFecA, ProSta, ProStFec, ProUserM, ProFecM, DscCFa, ProFabs, EmprCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU4", "SELECT ProDsc, ProProvi FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU5", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU6", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU9", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtCod, T3.CliNom, T2.EmprNom, TM1.ArtDsc, TM1.EmprCod, TM1.CliCod FROM ((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU10", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ArtCod > ?) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ArtCod < ?) ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00AU14", "INSERT INTO TXPARTICU(ArtCod, ArtDsc, EmprCod, CliCod, ArtMat, TipArtCod, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T00AU15", "UPDATE TXPARTICU SET ArtDsc=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T00AU16", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T00AU17", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU18", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU19", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU20", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU21", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU22", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU23", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU24", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU25", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU26", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU27", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU28", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU30", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU31", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU32", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU33", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU34", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU35", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU36", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU37", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU38", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU39", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU40", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU41", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU42", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU43", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU44", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU45", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU46", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU47", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU48", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU49", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU50", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU51", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU52", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU53", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU54", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU55", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU56", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU57", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU58", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU59", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU60", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU61", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU62", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU63", "SELECT T1.CliCod, T1.ArtCod, T1.ProAct, T1.ProUserA, T1.ProFecA, T1.ProSta, T1.ProStFec, T1.ProUserM, T1.ProFecM, T2.ProDsc, T2.ProProvi, T1.DscCFa, T1.ProFabs, T1.EmprCod, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU64", "SELECT ProDsc, ProProvi FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU65", "SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00AU66", "INSERT INTO TXPARTLIN(CliCod, ArtCod, ProAct, ProUserA, ProFecA, ProSta, ProStFec, ProUserM, ProFecM, DscCFa, ProFabs, EmprCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, Art_Tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPARTLIN")
         ,new UpdateCursor("T00AU67", "UPDATE TXPARTLIN SET ProAct=?, ProUserA=?, ProFecA=?, ProSta=?, ProStFec=?, ProUserM=?, ProFecM=?, DscCFa=?, ProFabs=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK, "TXPARTLIN")
         ,new UpdateCursor("T00AU68", "DELETE FROM TXPARTLIN  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK, "TXPARTLIN")
         ,new ForEachCursor("T00AU69", "SELECT ProDsc, ProProvi FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AU70", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU71", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM FROM TXPCAPFMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU72", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, NumLinPro FROM TXPPARART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU73", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, ProCod FROM TXPModPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU74", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AU75", "SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 61 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 73 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 10 :
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
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
            case 61 :
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
            case 62 :
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
            case 63 :
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
            case 64 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setString(3, (String)parms[4], 1);
               stmt.setString(4, (String)parms[5], 10);
               stmt.setDateTime(5, (java.util.Date)parms[6], false);
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setDateTime(7, (java.util.Date)parms[8], false);
               stmt.setString(8, (String)parms[9], 10);
               stmt.setDateTime(9, (java.util.Date)parms[10], false);
               stmt.setString(10, (String)parms[11], 30);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[12], 2);
               stmt.setString(12, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[15], 8);
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
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
            case 66 :
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
            case 67 :
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
            case 68 :
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
            case 69 :
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
            case 70 :
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
            case 71 :
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
            case 72 :
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
            case 73 :
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
      }
   }

}

