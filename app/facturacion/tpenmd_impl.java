package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpenmd_impl extends GXDataArea
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV33CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33CliCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Penalizaciones Moda 21", ""), (short)(0)) ;
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
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
      A8402PMDLinUlt = (int)(GXutil.lval( httpContext.GetPar( "PMDLinUlt"))) ;
      n8402PMDLinUlt = false ;
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

   public tpenmd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpenmd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpenmd_impl.class ));
   }

   public tpenmd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TPenMD.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDPreLim_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDPreLim_Internalname, httpContext.getMessage( "Preço Total : <", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDPreLim_Internalname, GXutil.ltrim( localUtil.ntoc( A8400PMDPreLim, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDPreLim_Enabled!=0) ? localUtil.format( A8400PMDPreLim, "Z,ZZ9.99 €") : localUtil.format( A8400PMDPreLim, "Z,ZZ9.99 €"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDPreLim_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMDPreLim_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPMDPreMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPMDPreMin_Internalname, httpContext.getMessage( "Aplicar o valor:", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMDPreMin_Internalname, GXutil.ltrim( localUtil.ntoc( A8401PMDPreMin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMDPreMin_Enabled!=0) ? localUtil.format( A8401PMDPreMin, "Z,ZZ9.99 €") : localUtil.format( A8401PMDPreMin, "Z,ZZ9.99 €"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMDPreMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPMDPreMin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPenMD.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPenMD.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV38Pgmname), GXutil.rtrim( localUtil.format( AV38Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TPenMD.htm");
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

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol52( ) ;
      nGXsfl_52_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1160 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1160 = (short)(1) ;
            scanStart11N1160( ) ;
            while ( RcdFound1160 != 0 )
            {
               init_level_properties1160( ) ;
               getByPrimaryKey11N1160( ) ;
               addRow11N1160( ) ;
               scanNext11N1160( ) ;
            }
            scanEnd11N1160( ) ;
            nBlankRcdCount1160 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B8402PMDLinUlt = A8402PMDLinUlt ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
         standaloneNotModal11N1160( ) ;
         standaloneModal11N1160( ) ;
         sMode1160 = Gx_mode ;
         while ( nGXsfl_52_idx < nRC_GXsfl_52 )
         {
            bGXsfl_52_Refreshing = true ;
            readRow11N1160( ) ;
            edtPMDLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDLIN_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDLin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            edtPMDKgmMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDKGMMIN_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDKgmMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDKgmMin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            edtPMDKgmMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDKGMMAX_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDKgmMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDKgmMax_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            edtPMDTinPrc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDTINPRC_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDTinPrc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDTinPrc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            edtPMDAcaPrc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDACAPRC_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDAcaPrc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDAcaPrc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            edtPMDKgmMinS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDKGMMINS_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMDKgmMinS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDKgmMinS_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            if ( ( nRcdExists_1160 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal11N1160( ) ;
            }
            sendRow11N1160( ) ;
            bGXsfl_52_Refreshing = false ;
         }
         Gx_mode = sMode1160 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A8402PMDLinUlt = B8402PMDLinUlt ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1160 = (short)(5) ;
         nRcdExists_1160 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart11N1160( ) ;
            while ( RcdFound1160 != 0 )
            {
               sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_521160( ) ;
               init_level_properties1160( ) ;
               standaloneNotModal11N1160( ) ;
               getByPrimaryKey11N1160( ) ;
               standaloneModal11N1160( ) ;
               addRow11N1160( ) ;
               scanNext11N1160( ) ;
            }
            scanEnd11N1160( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1160 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_521160( ) ;
         initAll11N1160( ) ;
         init_level_properties1160( ) ;
         B8402PMDLinUlt = A8402PMDLinUlt ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
         nRcdExists_1160 = (short)(0) ;
         nIsMod_1160 = (short)(0) ;
         nRcdDeleted_1160 = (short)(0) ;
         nBlankRcdCount1160 = (short)(nBlankRcdUsr1160+nBlankRcdCount1160) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1160 > 0 )
         {
            standaloneNotModal11N1160( ) ;
            standaloneModal11N1160( ) ;
            addRow11N1160( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPMDLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1160 = (short)(nBlankRcdCount1160-1) ;
         }
         Gx_mode = sMode1160 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A8402PMDLinUlt = B8402PMDLinUlt ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
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
      e1111N2 ();
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
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            Z8400PMDPreLim = localUtil.ctond( httpContext.cgiGet( "Z8400PMDPreLim")) ;
            Z8401PMDPreMin = localUtil.ctond( httpContext.cgiGet( "Z8401PMDPreMin")) ;
            Z8402PMDLinUlt = (int)(localUtil.ctol( httpContext.cgiGet( "Z8402PMDLinUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8402PMDLinUlt = (int)(localUtil.ctol( httpContext.cgiGet( "Z8402PMDLinUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8402PMDLinUlt = false ;
            O8402PMDLinUlt = (int)(localUtil.ctol( httpContext.cgiGet( "O8402PMDLinUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV33CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8402PMDLinUlt = (int)(localUtil.ctol( httpContext.cgiGet( "PMDLINULT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
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
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreLim_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreLim_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDPRELIM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMDPreLim_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8400PMDPreLim = DecimalUtil.ZERO ;
               n8400PMDPreLim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
            }
            else
            {
               A8400PMDPreLim = localUtil.ctond( httpContext.cgiGet( edtPMDPreLim_Internalname)) ;
               n8400PMDPreLim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDPreMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDPreMin_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMDPREMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMDPreMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8401PMDPreMin = DecimalUtil.ZERO ;
               n8401PMDPreMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
            }
            else
            {
               A8401PMDPreMin = localUtil.ctond( httpContext.cgiGet( edtPMDPreMin_Internalname)) ;
               n8401PMDPreMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
            }
            AV38Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPenMD");
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\tpenmd:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                  sMode21 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode21 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound21 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_11N0( ) ;
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
                        e1111N2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1211N2 ();
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
         e1211N2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll11N21( ) ;
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
         disableAttributes11N21( ) ;
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

   public void confirm_11N0( )
   {
      beforeValidate11N21( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls11N21( ) ;
         }
         else
         {
            checkExtendedTable11N21( ) ;
            closeExtendedTableCursors11N21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_11N1160( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode21 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_11N1160( )
   {
      s8402PMDLinUlt = O8402PMDLinUlt ;
      n8402PMDLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      nGXsfl_52_idx = 0 ;
      while ( nGXsfl_52_idx < nRC_GXsfl_52 )
      {
         readRow11N1160( ) ;
         if ( ( nRcdExists_1160 != 0 ) || ( nIsMod_1160 != 0 ) )
         {
            getKey11N1160( ) ;
            if ( ( nRcdExists_1160 == 0 ) && ( nRcdDeleted_1160 == 0 ) )
            {
               if ( RcdFound1160 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate11N1160( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable11N1160( ) ;
                     closeExtendedTableCursors11N1160( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O8402PMDLinUlt = A8402PMDLinUlt ;
                     n8402PMDLinUlt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
                  }
               }
               else
               {
                  GXCCtl = "PMDLIN_" + sGXsfl_52_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMDLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1160 != 0 )
               {
                  if ( nRcdDeleted_1160 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey11N1160( ) ;
                     load11N1160( ) ;
                     beforeValidate11N1160( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls11N1160( ) ;
                        O8402PMDLinUlt = A8402PMDLinUlt ;
                        n8402PMDLinUlt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1160 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate11N1160( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable11N1160( ) ;
                           closeExtendedTableCursors11N1160( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O8402PMDLinUlt = A8402PMDLinUlt ;
                           n8402PMDLinUlt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1160 == 0 )
                  {
                     GXCCtl = "PMDLIN_" + sGXsfl_52_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMDLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMDLin_Internalname, GXutil.ltrim( localUtil.ntoc( A8403PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDKgmMin_Internalname, GXutil.ltrim( localUtil.ntoc( A8404PMDKgmMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDKgmMax_Internalname, GXutil.ltrim( localUtil.ntoc( A8405PMDKgmMax, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDTinPrc_Internalname, GXutil.ltrim( localUtil.ntoc( A8406PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDAcaPrc_Internalname, GXutil.ltrim( localUtil.ntoc( A8407PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDKgmMinS_Internalname, GXutil.ltrim( localUtil.ntoc( A8408PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8403PMDLin_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8403PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8404PMDKgmMin_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8404PMDKgmMin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8405PMDKgmMax_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8405PMDKgmMax, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8406PMDTinPrc_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8406PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8407PMDAcaPrc_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8407PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8408PMDKgmMinS_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8408PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1160_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1160, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1160_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1160, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1160_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1160, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1160 != 0 )
         {
            httpContext.changePostValue( "PMDLIN_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDKGMMIN_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDKGMMAX_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDTINPRC_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDTinPrc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDACAPRC_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDAcaPrc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDKGMMINS_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMinS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O8402PMDLinUlt = s8402PMDLinUlt ;
      n8402PMDLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption11N0( )
   {
   }

   public void e1111N2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tpenmd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpenmd_impl.this.AV32EmprCod = GXv_char2[0] ;
      tpenmd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpenmd_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tpenmd_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tpenmd_impl.this.AV32EmprCod = GXv_char4[0] ;
      tpenmd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpenmd_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
   }

   public void e1211N2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm11N21( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T011N5_A279CliNom[0] ;
            Z8400PMDPreLim = T011N5_A8400PMDPreLim[0] ;
            Z8401PMDPreMin = T011N5_A8401PMDPreMin[0] ;
            Z8402PMDLinUlt = T011N5_A8402PMDLinUlt[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
            Z8400PMDPreLim = A8400PMDPreLim ;
            Z8401PMDPreMin = A8401PMDPreMin ;
            Z8402PMDLinUlt = A8402PMDLinUlt ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z8400PMDPreLim = A8400PMDPreLim ;
         Z8401PMDPreMin = A8401PMDPreMin ;
         Z8402PMDLinUlt = A8402PMDLinUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      AV38Pgmname = "Facturacion.TPenMD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T011N6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T011N6_A407EmprNom[0] ;
      n407EmprNom = T011N6_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (0==AV33CliCod) )
      {
         A252CliCod = AV33CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV33CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV33CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
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
   }

   public void load11N21( )
   {
      /* Using cursor T011N7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A407EmprNom = T011N7_A407EmprNom[0] ;
         n407EmprNom = T011N7_n407EmprNom[0] ;
         A279CliNom = T011N7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8400PMDPreLim = T011N7_A8400PMDPreLim[0] ;
         n8400PMDPreLim = T011N7_n8400PMDPreLim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
         A8401PMDPreMin = T011N7_A8401PMDPreMin[0] ;
         n8401PMDPreMin = T011N7_n8401PMDPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
         A8402PMDLinUlt = T011N7_A8402PMDLinUlt[0] ;
         n8402PMDLinUlt = T011N7_n8402PMDLinUlt[0] ;
         zm11N21( -9) ;
      }
      pr_default.close(5);
      onLoadActions11N21( ) ;
   }

   public void onLoadActions11N21( )
   {
   }

   public void checkExtendedTable11N21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors11N21( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey11N21( )
   {
      /* Using cursor T011N8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T011N5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm11N21( 9) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T011N5_A252CliCod[0] ;
         n252CliCod = T011N5_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T011N5_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8400PMDPreLim = T011N5_A8400PMDPreLim[0] ;
         n8400PMDPreLim = T011N5_n8400PMDPreLim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
         A8401PMDPreMin = T011N5_A8401PMDPreMin[0] ;
         n8401PMDPreMin = T011N5_n8401PMDPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
         A8402PMDLinUlt = T011N5_A8402PMDLinUlt[0] ;
         n8402PMDLinUlt = T011N5_n8402PMDLinUlt[0] ;
         A396EmprCod = T011N5_A396EmprCod[0] ;
         O8402PMDLinUlt = A8402PMDLinUlt ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load11N21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey11N21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey11N21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey11N21( ) ;
      if ( RcdFound21 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T011N9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T011N9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T011N9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011N9_A252CliCod[0] < A252CliCod ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T011N9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T011N9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011N9_A252CliCod[0] > A252CliCod ) ) )
         {
            A396EmprCod = T011N9_A396EmprCod[0] ;
            A252CliCod = T011N9_A252CliCod[0] ;
            n252CliCod = T011N9_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T011N10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T011N10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T011N10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011N10_A252CliCod[0] > A252CliCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T011N10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T011N10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011N10_A252CliCod[0] < A252CliCod ) ) )
         {
            A396EmprCod = T011N10_A396EmprCod[0] ;
            A252CliCod = T011N10_A252CliCod[0] ;
            n252CliCod = T011N10_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey11N21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A8402PMDLinUlt = O8402PMDLinUlt ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert11N21( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound21 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A8402PMDLinUlt = O8402PMDLinUlt ;
               n8402PMDLinUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A8402PMDLinUlt = O8402PMDLinUlt ;
               n8402PMDLinUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
               update11N21( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               /* Insert record */
               A8402PMDLinUlt = O8402PMDLinUlt ;
               n8402PMDLinUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert11N21( ) ;
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
                  A8402PMDLinUlt = O8402PMDLinUlt ;
                  n8402PMDLinUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert11N21( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A8402PMDLinUlt = O8402PMDLinUlt ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency11N21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T011N4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z279CliNom, T011N4_A279CliNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z8400PMDPreLim, T011N4_A8400PMDPreLim[0]) != 0 ) || ( DecimalUtil.compareTo(Z8401PMDPreMin, T011N4_A8401PMDPreMin[0]) != 0 ) || ( Z8402PMDLinUlt != T011N4_A8402PMDLinUlt[0] ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T011N4_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T011N4_A279CliNom[0]);
            }
            if ( DecimalUtil.compareTo(Z8400PMDPreLim, T011N4_A8400PMDPreLim[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd:[seudo value changed for attri]"+"PMDPreLim");
               GXutil.writeLogRaw("Old: ",Z8400PMDPreLim);
               GXutil.writeLogRaw("Current: ",T011N4_A8400PMDPreLim[0]);
            }
            if ( DecimalUtil.compareTo(Z8401PMDPreMin, T011N4_A8401PMDPreMin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd:[seudo value changed for attri]"+"PMDPreMin");
               GXutil.writeLogRaw("Old: ",Z8401PMDPreMin);
               GXutil.writeLogRaw("Current: ",T011N4_A8401PMDPreMin[0]);
            }
            if ( Z8402PMDLinUlt != T011N4_A8402PMDLinUlt[0] )
            {
               GXutil.writeLogln("facturacion.tpenmd:[seudo value changed for attri]"+"PMDLinUlt");
               GXutil.writeLogRaw("Old: ",Z8402PMDLinUlt);
               GXutil.writeLogRaw("Current: ",T011N4_A8402PMDLinUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11N21( )
   {
      beforeValidate11N21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11N21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11N21( 0) ;
         checkOptimisticConcurrency11N21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11N21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11N21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011N11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A279CliNom, Boolean.valueOf(n8400PMDPreLim), A8400PMDPreLim, Boolean.valueOf(n8401PMDPreMin), A8401PMDPreMin, Boolean.valueOf(n8402PMDLinUlt), Integer.valueOf(A8402PMDLinUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel11N21( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption11N0( ) ;
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
            load11N21( ) ;
         }
         endLevel11N21( ) ;
      }
      closeExtendedTableCursors11N21( ) ;
   }

   public void update11N21( )
   {
      beforeValidate11N21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11N21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11N21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11N21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate11N21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011N12 */
                  pr_default.execute(10, new Object[] {A279CliNom, Boolean.valueOf(n8400PMDPreLim), A8400PMDPreLim, Boolean.valueOf(n8401PMDPreMin), A8401PMDPreMin, Boolean.valueOf(n8402PMDLinUlt), Integer.valueOf(A8402PMDLinUlt), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate11N21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel11N21( ) ;
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
         endLevel11N21( ) ;
      }
      closeExtendedTableCursors11N21( ) ;
   }

   public void deferredUpdate11N21( )
   {
   }

   public void delete( )
   {
      beforeValidate11N21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11N21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11N21( ) ;
         afterConfirm11N21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11N21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T011N13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel11N21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11N21( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T011N14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T011N15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEX000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T011N16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T011N17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T011N18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T011N19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T011N20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T011N21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T011N22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T011N23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T011N24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T011N25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T011N26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIMOD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T011N27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIIN2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T011N28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T011N29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T011N30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPRLL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T011N31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pagos de Clientes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T011N32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T011N33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESTPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T011N34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T011N35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Hdr)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T011N36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores p/Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T011N37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WEBU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T011N38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Empesas de la Disposición", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T011N39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHISES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T011N40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRPEQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T011N41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRMOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T011N42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRCIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T011N43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T011N44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T011N45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T011N46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T011N47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCONTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T011N48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T011N49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T011N50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COMREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T011N51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T011N52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T011N53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LKGSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T011N54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T011N55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T011N56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T011N57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T011N58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T011N59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T011N60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T011N61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T011N62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T011N63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T011N64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T011N65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T011N66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T011N67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T011N68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T011N69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T011N70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T011N71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T011N72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T011N73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T011N74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T011N75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
      }
   }

   public void processNestedLevel11N1160( )
   {
      s8402PMDLinUlt = O8402PMDLinUlt ;
      n8402PMDLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      nGXsfl_52_idx = 0 ;
      while ( nGXsfl_52_idx < nRC_GXsfl_52 )
      {
         readRow11N1160( ) ;
         if ( ( nRcdExists_1160 != 0 ) || ( nIsMod_1160 != 0 ) )
         {
            standaloneNotModal11N1160( ) ;
            getKey11N1160( ) ;
            if ( ( nRcdExists_1160 == 0 ) && ( nRcdDeleted_1160 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert11N1160( ) ;
            }
            else
            {
               if ( RcdFound1160 != 0 )
               {
                  if ( ( nRcdDeleted_1160 != 0 ) && ( nRcdExists_1160 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete11N1160( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1160 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update11N1160( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1160 == 0 )
                  {
                     GXCCtl = "PMDLIN_" + sGXsfl_52_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMDLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O8402PMDLinUlt = A8402PMDLinUlt ;
            n8402PMDLinUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
         }
         httpContext.changePostValue( edtPMDLin_Internalname, GXutil.ltrim( localUtil.ntoc( A8403PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDKgmMin_Internalname, GXutil.ltrim( localUtil.ntoc( A8404PMDKgmMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDKgmMax_Internalname, GXutil.ltrim( localUtil.ntoc( A8405PMDKgmMax, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDTinPrc_Internalname, GXutil.ltrim( localUtil.ntoc( A8406PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDAcaPrc_Internalname, GXutil.ltrim( localUtil.ntoc( A8407PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMDKgmMinS_Internalname, GXutil.ltrim( localUtil.ntoc( A8408PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8403PMDLin_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8403PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8404PMDKgmMin_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8404PMDKgmMin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8405PMDKgmMax_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8405PMDKgmMax, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8406PMDTinPrc_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8406PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8407PMDAcaPrc_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8407PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8408PMDKgmMinS_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( Z8408PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1160_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1160, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1160_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1160, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1160_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1160, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1160 != 0 )
         {
            httpContext.changePostValue( "PMDLIN_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDKGMMIN_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDKGMMAX_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDTINPRC_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDTinPrc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDACAPRC_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDAcaPrc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMDKGMMINS_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMinS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll11N1160( ) ;
      if ( AnyError != 0 )
      {
         O8402PMDLinUlt = s8402PMDLinUlt ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      }
      nRcdExists_1160 = (short)(0) ;
      nIsMod_1160 = (short)(0) ;
      nRcdDeleted_1160 = (short)(0) ;
   }

   public void processLevel11N21( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel11N1160( ) ;
      if ( AnyError != 0 )
      {
         O8402PMDLinUlt = s8402PMDLinUlt ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T011N76 */
      pr_default.execute(74, new Object[] {Boolean.valueOf(n8402PMDLinUlt), Integer.valueOf(A8402PMDLinUlt), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
   }

   public void endLevel11N21( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete11N21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpenmd");
         if ( AnyError == 0 )
         {
            confirmValues11N0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tpenmd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart11N21( )
   {
      /* Scan By routine */
      /* Using cursor T011N77 */
      pr_default.execute(75);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(75) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T011N77_A396EmprCod[0] ;
         A252CliCod = T011N77_A252CliCod[0] ;
         n252CliCod = T011N77_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11N21( )
   {
      /* Scan next routine */
      pr_default.readNext(75);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(75) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T011N77_A396EmprCod[0] ;
         A252CliCod = T011N77_A252CliCod[0] ;
         n252CliCod = T011N77_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd11N21( )
   {
      pr_default.close(75);
   }

   public void afterConfirm11N21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert11N21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11N21( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11N21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11N21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11N21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11N21( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtPMDPreLim_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreLim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreLim_Enabled), 5, 0), true);
      edtPMDPreMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDPreMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDPreMin_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm11N1160( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8404PMDKgmMin = T011N3_A8404PMDKgmMin[0] ;
            Z8405PMDKgmMax = T011N3_A8405PMDKgmMax[0] ;
            Z8406PMDTinPrc = T011N3_A8406PMDTinPrc[0] ;
            Z8407PMDAcaPrc = T011N3_A8407PMDAcaPrc[0] ;
            Z8408PMDKgmMinS = T011N3_A8408PMDKgmMinS[0] ;
         }
         else
         {
            Z8404PMDKgmMin = A8404PMDKgmMin ;
            Z8405PMDKgmMax = A8405PMDKgmMax ;
            Z8406PMDTinPrc = A8406PMDTinPrc ;
            Z8407PMDAcaPrc = A8407PMDAcaPrc ;
            Z8408PMDKgmMinS = A8408PMDKgmMinS ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z252CliCod = A252CliCod ;
         Z8403PMDLin = A8403PMDLin ;
         Z8404PMDKgmMin = A8404PMDKgmMin ;
         Z8405PMDKgmMax = A8405PMDKgmMax ;
         Z8406PMDTinPrc = A8406PMDTinPrc ;
         Z8407PMDAcaPrc = A8407PMDAcaPrc ;
         Z8408PMDKgmMinS = A8408PMDKgmMinS ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal11N1160( )
   {
   }

   public void standaloneModal11N1160( )
   {
      if ( isIns( )  )
      {
         A8402PMDLinUlt = (int)(O8402PMDLinUlt+1) ;
         n8402PMDLinUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A8403PMDLin = (short)(A8402PMDLinUlt) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMDLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMDLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDLin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      }
      else
      {
         edtPMDLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMDLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDLin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      }
   }

   public void load11N1160( )
   {
      /* Using cursor T011N78 */
      pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound1160 = (short)(1) ;
         A8404PMDKgmMin = T011N78_A8404PMDKgmMin[0] ;
         A8405PMDKgmMax = T011N78_A8405PMDKgmMax[0] ;
         A8406PMDTinPrc = T011N78_A8406PMDTinPrc[0] ;
         A8407PMDAcaPrc = T011N78_A8407PMDAcaPrc[0] ;
         A8408PMDKgmMinS = T011N78_A8408PMDKgmMinS[0] ;
         zm11N1160( -11) ;
      }
      pr_default.close(76);
      onLoadActions11N1160( ) ;
   }

   public void onLoadActions11N1160( )
   {
   }

   public void checkExtendedTable11N1160( )
   {
      nIsDirty_1160 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal11N1160( ) ;
   }

   public void closeExtendedTableCursors11N1160( )
   {
   }

   public void enableDisable11N1160( )
   {
   }

   public void getKey11N1160( )
   {
      /* Using cursor T011N79 */
      pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound1160 = (short)(1) ;
      }
      else
      {
         RcdFound1160 = (short)(0) ;
      }
      pr_default.close(77);
   }

   public void getByPrimaryKey11N1160( )
   {
      /* Using cursor T011N3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm11N1160( 11) ;
         RcdFound1160 = (short)(1) ;
         initializeNonKey11N1160( ) ;
         A8403PMDLin = T011N3_A8403PMDLin[0] ;
         A8404PMDKgmMin = T011N3_A8404PMDKgmMin[0] ;
         A8405PMDKgmMax = T011N3_A8405PMDKgmMax[0] ;
         A8406PMDTinPrc = T011N3_A8406PMDTinPrc[0] ;
         A8407PMDAcaPrc = T011N3_A8407PMDAcaPrc[0] ;
         A8408PMDKgmMinS = T011N3_A8408PMDKgmMinS[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z8403PMDLin = A8403PMDLin ;
         sMode1160 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load11N1160( ) ;
         Gx_mode = sMode1160 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1160 = (short)(0) ;
         initializeNonKey11N1160( ) ;
         sMode1160 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal11N1160( ) ;
         Gx_mode = sMode1160 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes11N1160( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency11N1160( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T011N2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPenMD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8404PMDKgmMin, T011N2_A8404PMDKgmMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z8405PMDKgmMax, T011N2_A8405PMDKgmMax[0]) != 0 ) || ( DecimalUtil.compareTo(Z8406PMDTinPrc, T011N2_A8406PMDTinPrc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8407PMDAcaPrc, T011N2_A8407PMDAcaPrc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8408PMDKgmMinS, T011N2_A8408PMDKgmMinS[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8404PMDKgmMin, T011N2_A8404PMDKgmMin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd:[seudo value changed for attri]"+"PMDKgmMin");
               GXutil.writeLogRaw("Old: ",Z8404PMDKgmMin);
               GXutil.writeLogRaw("Current: ",T011N2_A8404PMDKgmMin[0]);
            }
            if ( DecimalUtil.compareTo(Z8405PMDKgmMax, T011N2_A8405PMDKgmMax[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd:[seudo value changed for attri]"+"PMDKgmMax");
               GXutil.writeLogRaw("Old: ",Z8405PMDKgmMax);
               GXutil.writeLogRaw("Current: ",T011N2_A8405PMDKgmMax[0]);
            }
            if ( DecimalUtil.compareTo(Z8406PMDTinPrc, T011N2_A8406PMDTinPrc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd:[seudo value changed for attri]"+"PMDTinPrc");
               GXutil.writeLogRaw("Old: ",Z8406PMDTinPrc);
               GXutil.writeLogRaw("Current: ",T011N2_A8406PMDTinPrc[0]);
            }
            if ( DecimalUtil.compareTo(Z8407PMDAcaPrc, T011N2_A8407PMDAcaPrc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd:[seudo value changed for attri]"+"PMDAcaPrc");
               GXutil.writeLogRaw("Old: ",Z8407PMDAcaPrc);
               GXutil.writeLogRaw("Current: ",T011N2_A8407PMDAcaPrc[0]);
            }
            if ( DecimalUtil.compareTo(Z8408PMDKgmMinS, T011N2_A8408PMDKgmMinS[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tpenmd:[seudo value changed for attri]"+"PMDKgmMinS");
               GXutil.writeLogRaw("Old: ",Z8408PMDKgmMinS);
               GXutil.writeLogRaw("Current: ",T011N2_A8408PMDKgmMinS[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPenMD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11N1160( )
   {
      beforeValidate11N1160( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11N1160( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11N1160( 0) ;
         checkOptimisticConcurrency11N1160( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11N1160( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11N1160( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011N80 */
                  pr_default.execute(78, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin), A8404PMDKgmMin, A8405PMDKgmMax, A8406PMDTinPrc, A8407PMDAcaPrc, A8408PMDKgmMinS, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPenMD");
                  if ( (pr_default.getStatus(78) == 1) )
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
            load11N1160( ) ;
         }
         endLevel11N1160( ) ;
      }
      closeExtendedTableCursors11N1160( ) ;
   }

   public void update11N1160( )
   {
      beforeValidate11N1160( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11N1160( ) ;
      }
      if ( ( nIsMod_1160 != 0 ) || ( nIsDirty_1160 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency11N1160( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm11N1160( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate11N1160( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T011N81 */
                     pr_default.execute(79, new Object[] {A8404PMDKgmMin, A8405PMDKgmMax, A8406PMDTinPrc, A8407PMDAcaPrc, A8408PMDKgmMinS, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPenMD");
                     if ( (pr_default.getStatus(79) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPenMD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate11N1160( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey11N1160( ) ;
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
            endLevel11N1160( ) ;
         }
      }
      closeExtendedTableCursors11N1160( ) ;
   }

   public void deferredUpdate11N1160( )
   {
   }

   public void delete11N1160( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate11N1160( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11N1160( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11N1160( ) ;
         afterConfirm11N1160( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11N1160( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T011N82 */
               pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPenMD");
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
      sMode1160 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel11N1160( ) ;
      Gx_mode = sMode1160 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11N1160( )
   {
      standaloneModal11N1160( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel11N1160( )
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

   public void scanStart11N1160( )
   {
      /* Scan By routine */
      /* Using cursor T011N83 */
      pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound1160 = (short)(0) ;
      if ( (pr_default.getStatus(81) != 101) )
      {
         RcdFound1160 = (short)(1) ;
         A8403PMDLin = T011N83_A8403PMDLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11N1160( )
   {
      /* Scan next routine */
      pr_default.readNext(81);
      RcdFound1160 = (short)(0) ;
      if ( (pr_default.getStatus(81) != 101) )
      {
         RcdFound1160 = (short)(1) ;
         A8403PMDLin = T011N83_A8403PMDLin[0] ;
      }
   }

   public void scanEnd11N1160( )
   {
      pr_default.close(81);
   }

   public void afterConfirm11N1160( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert11N1160( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11N1160( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11N1160( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11N1160( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11N1160( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11N1160( )
   {
      edtPMDLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDLin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtPMDKgmMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDKgmMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDKgmMin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtPMDKgmMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDKgmMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDKgmMax_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtPMDTinPrc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDTinPrc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDTinPrc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtPMDAcaPrc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDAcaPrc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDAcaPrc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtPMDKgmMinS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDKgmMinS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDKgmMinS_Enabled), 5, 0), !bGXsfl_52_Refreshing);
   }

   public void send_integrity_lvl_hashes11N1160( )
   {
   }

   public void send_integrity_lvl_hashes11N21( )
   {
   }

   public void subsflControlProps_521160( )
   {
      edtPMDLin_Internalname = "PMDLIN_"+sGXsfl_52_idx ;
      edtPMDKgmMin_Internalname = "PMDKGMMIN_"+sGXsfl_52_idx ;
      edtPMDKgmMax_Internalname = "PMDKGMMAX_"+sGXsfl_52_idx ;
      edtPMDTinPrc_Internalname = "PMDTINPRC_"+sGXsfl_52_idx ;
      edtPMDAcaPrc_Internalname = "PMDACAPRC_"+sGXsfl_52_idx ;
      edtPMDKgmMinS_Internalname = "PMDKGMMINS_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_521160( )
   {
      edtPMDLin_Internalname = "PMDLIN_"+sGXsfl_52_fel_idx ;
      edtPMDKgmMin_Internalname = "PMDKGMMIN_"+sGXsfl_52_fel_idx ;
      edtPMDKgmMax_Internalname = "PMDKGMMAX_"+sGXsfl_52_fel_idx ;
      edtPMDTinPrc_Internalname = "PMDTINPRC_"+sGXsfl_52_fel_idx ;
      edtPMDAcaPrc_Internalname = "PMDACAPRC_"+sGXsfl_52_fel_idx ;
      edtPMDKgmMinS_Internalname = "PMDKGMMINS_"+sGXsfl_52_fel_idx ;
   }

   public void addRow11N1160( )
   {
      nGXsfl_52_idx = (int)(nGXsfl_52_idx+1) ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_521160( ) ;
      sendRow11N1160( ) ;
   }

   public void sendRow11N1160( )
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
         if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1160_" + sGXsfl_52_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDLin_Internalname,GXutil.ltrim( localUtil.ntoc( A8403PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8403PMDLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1160_" + sGXsfl_52_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDKgmMin_Internalname,GXutil.ltrim( localUtil.ntoc( A8404PMDKgmMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDKgmMin_Enabled!=0) ? localUtil.format( A8404PMDKgmMin, "Z,ZZ9.99 kg") : localUtil.format( A8404PMDKgmMin, "Z,ZZ9.99 kg"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDKgmMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDKgmMin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1160_" + sGXsfl_52_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDKgmMax_Internalname,GXutil.ltrim( localUtil.ntoc( A8405PMDKgmMax, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDKgmMax_Enabled!=0) ? localUtil.format( A8405PMDKgmMax, "Z,ZZ9.99 kg") : localUtil.format( A8405PMDKgmMax, "Z,ZZ9.99 kg"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDKgmMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDKgmMax_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1160_" + sGXsfl_52_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDTinPrc_Internalname,GXutil.ltrim( localUtil.ntoc( A8406PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDTinPrc_Enabled!=0) ? localUtil.format( A8406PMDTinPrc, "ZZ9.99") : localUtil.format( A8406PMDTinPrc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDTinPrc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDTinPrc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1160_" + sGXsfl_52_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDAcaPrc_Internalname,GXutil.ltrim( localUtil.ntoc( A8407PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDAcaPrc_Enabled!=0) ? localUtil.format( A8407PMDAcaPrc, "ZZ9.99") : localUtil.format( A8407PMDAcaPrc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDAcaPrc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDAcaPrc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1160_" + sGXsfl_52_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDKgmMinS_Internalname,GXutil.ltrim( localUtil.ntoc( A8408PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPMDKgmMinS_Enabled!=0) ? localUtil.format( A8408PMDKgmMinS, "ZZZ9.99") : localUtil.format( A8408PMDKgmMinS, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDKgmMinS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPMDKgmMinS_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes11N1160( ) ;
      GXCCtl = "Z8403PMDLin_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8403PMDLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8404PMDKgmMin_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8404PMDKgmMin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8405PMDKgmMax_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8405PMDKgmMax, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8406PMDTinPrc_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8406PMDTinPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8407PMDAcaPrc_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8407PMDAcaPrc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8408PMDKgmMinS_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8408PMDKgmMinS, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1160_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1160, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1160_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1160, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1160_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1160, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDLIN_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDKGMMIN_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDKGMMAX_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDTINPRC_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDTinPrc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDACAPRC_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDAcaPrc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDKGMMINS_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMinS_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow11N1160( )
   {
      nGXsfl_52_idx = (int)(nGXsfl_52_idx+1) ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_521160( ) ;
      edtPMDLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDLIN_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDKgmMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDKGMMIN_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDKgmMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDKGMMAX_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDTinPrc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDTINPRC_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDAcaPrc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDACAPRC_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMDKgmMinS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMDKGMMINS_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMDLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMDLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PMDLIN_" + sGXsfl_52_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDLin_Internalname ;
         wbErr = true ;
         A8403PMDLin = (short)(0) ;
      }
      else
      {
         A8403PMDLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDKgmMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDKgmMin_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDKGMMIN_" + sGXsfl_52_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDKgmMin_Internalname ;
         wbErr = true ;
         A8404PMDKgmMin = DecimalUtil.ZERO ;
      }
      else
      {
         A8404PMDKgmMin = localUtil.ctond( httpContext.cgiGet( edtPMDKgmMin_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDKgmMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDKgmMax_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDKGMMAX_" + sGXsfl_52_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDKgmMax_Internalname ;
         wbErr = true ;
         A8405PMDKgmMax = DecimalUtil.ZERO ;
      }
      else
      {
         A8405PMDKgmMax = localUtil.ctond( httpContext.cgiGet( edtPMDKgmMax_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDTinPrc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDTinPrc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDTINPRC_" + sGXsfl_52_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDTinPrc_Internalname ;
         wbErr = true ;
         A8406PMDTinPrc = DecimalUtil.ZERO ;
      }
      else
      {
         A8406PMDTinPrc = localUtil.ctond( httpContext.cgiGet( edtPMDTinPrc_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDAcaPrc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDAcaPrc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDACAPRC_" + sGXsfl_52_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDAcaPrc_Internalname ;
         wbErr = true ;
         A8407PMDAcaPrc = DecimalUtil.ZERO ;
      }
      else
      {
         A8407PMDAcaPrc = localUtil.ctond( httpContext.cgiGet( edtPMDAcaPrc_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPMDKgmMinS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPMDKgmMinS_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "PMDKGMMINS_" + sGXsfl_52_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMDKgmMinS_Internalname ;
         wbErr = true ;
         A8408PMDKgmMinS = DecimalUtil.ZERO ;
      }
      else
      {
         A8408PMDKgmMinS = localUtil.ctond( httpContext.cgiGet( edtPMDKgmMinS_Internalname)) ;
      }
      GXCCtl = "Z8403PMDLin_" + sGXsfl_52_idx ;
      Z8403PMDLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8404PMDKgmMin_" + sGXsfl_52_idx ;
      Z8404PMDKgmMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8405PMDKgmMax_" + sGXsfl_52_idx ;
      Z8405PMDKgmMax = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8406PMDTinPrc_" + sGXsfl_52_idx ;
      Z8406PMDTinPrc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8407PMDAcaPrc_" + sGXsfl_52_idx ;
      Z8407PMDAcaPrc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8408PMDKgmMinS_" + sGXsfl_52_idx ;
      Z8408PMDKgmMinS = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1160_" + sGXsfl_52_idx ;
      nRcdDeleted_1160 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1160_" + sGXsfl_52_idx ;
      nRcdExists_1160 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1160_" + sGXsfl_52_idx ;
      nIsMod_1160 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPMDLin_Enabled = edtPMDLin_Enabled ;
   }

   public void confirmValues11N0( )
   {
      nGXsfl_52_idx = 0 ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_521160( ) ;
      while ( nGXsfl_52_idx < nRC_GXsfl_52 )
      {
         nGXsfl_52_idx = (int)(nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_521160( ) ;
         httpContext.changePostValue( "Z8403PMDLin_"+sGXsfl_52_idx, httpContext.cgiGet( "ZT_"+"Z8403PMDLin_"+sGXsfl_52_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8403PMDLin_"+sGXsfl_52_idx) ;
         httpContext.changePostValue( "Z8404PMDKgmMin_"+sGXsfl_52_idx, httpContext.cgiGet( "ZT_"+"Z8404PMDKgmMin_"+sGXsfl_52_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8404PMDKgmMin_"+sGXsfl_52_idx) ;
         httpContext.changePostValue( "Z8405PMDKgmMax_"+sGXsfl_52_idx, httpContext.cgiGet( "ZT_"+"Z8405PMDKgmMax_"+sGXsfl_52_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8405PMDKgmMax_"+sGXsfl_52_idx) ;
         httpContext.changePostValue( "Z8406PMDTinPrc_"+sGXsfl_52_idx, httpContext.cgiGet( "ZT_"+"Z8406PMDTinPrc_"+sGXsfl_52_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8406PMDTinPrc_"+sGXsfl_52_idx) ;
         httpContext.changePostValue( "Z8407PMDAcaPrc_"+sGXsfl_52_idx, httpContext.cgiGet( "ZT_"+"Z8407PMDAcaPrc_"+sGXsfl_52_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8407PMDAcaPrc_"+sGXsfl_52_idx) ;
         httpContext.changePostValue( "Z8408PMDKgmMinS_"+sGXsfl_52_idx, httpContext.cgiGet( "ZT_"+"Z8408PMDKgmMinS_"+sGXsfl_52_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8408PMDKgmMinS_"+sGXsfl_52_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tpenmd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPenMD");
      forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tpenmd:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8400PMDPreLim", GXutil.ltrim( localUtil.ntoc( Z8400PMDPreLim, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8401PMDPreMin", GXutil.ltrim( localUtil.ntoc( Z8401PMDPreMin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8402PMDLinUlt", GXutil.ltrim( localUtil.ntoc( Z8402PMDLinUlt, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8402PMDLinUlt", GXutil.ltrim( localUtil.ntoc( O8402PMDLinUlt, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nGXsfl_52_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV33CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDLINULT", GXutil.ltrim( localUtil.ntoc( A8402PMDLinUlt, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
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
      return formatLink("app.facturacion.tpenmd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TPenMD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Penalizaciones Moda 21", "") ;
   }

   public void initializeNonKey11N21( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8400PMDPreLim = DecimalUtil.ZERO ;
      n8400PMDPreLim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8400PMDPreLim", GXutil.ltrimstr( A8400PMDPreLim, 7, 2));
      A8401PMDPreMin = DecimalUtil.ZERO ;
      n8401PMDPreMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8401PMDPreMin", GXutil.ltrimstr( A8401PMDPreMin, 7, 2));
      A8402PMDLinUlt = 0 ;
      n8402PMDLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      O8402PMDLinUlt = A8402PMDLinUlt ;
      n8402PMDLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
      Z279CliNom = "" ;
      Z8400PMDPreLim = DecimalUtil.ZERO ;
      Z8401PMDPreMin = DecimalUtil.ZERO ;
      Z8402PMDLinUlt = 0 ;
   }

   public void initAll11N21( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey11N21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey11N1160( )
   {
      A8404PMDKgmMin = DecimalUtil.ZERO ;
      A8405PMDKgmMax = DecimalUtil.ZERO ;
      A8406PMDTinPrc = DecimalUtil.ZERO ;
      A8407PMDAcaPrc = DecimalUtil.ZERO ;
      A8408PMDKgmMinS = DecimalUtil.ZERO ;
      Z8404PMDKgmMin = DecimalUtil.ZERO ;
      Z8405PMDKgmMax = DecimalUtil.ZERO ;
      Z8406PMDTinPrc = DecimalUtil.ZERO ;
      Z8407PMDAcaPrc = DecimalUtil.ZERO ;
      Z8408PMDKgmMinS = DecimalUtil.ZERO ;
   }

   public void initAll11N1160( )
   {
      A8403PMDLin = (short)(0) ;
      initializeNonKey11N1160( ) ;
   }

   public void standaloneModalInsert11N1160( )
   {
      A8402PMDLinUlt = i8402PMDLinUlt ;
      n8402PMDLinUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8402PMDLinUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8402PMDLinUlt), 5, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211662727", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tpenmd.js", "?20268211662727", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1160( )
   {
      edtPMDLin_Enabled = defedtPMDLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDLin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
   }

   public void startgridcontrol52( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8403PMDLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8404PMDKgmMin, (byte)(11), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8405PMDKgmMax, (byte)(11), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8406PMDTinPrc, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDTinPrc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8407PMDAcaPrc, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDAcaPrc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8408PMDKgmMinS, (byte)(7), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMDKgmMinS_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtPMDPreLim_Internalname = "PMDPRELIM" ;
      edtPMDPreMin_Internalname = "PMDPREMIN" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPMDLin_Internalname = "PMDLIN" ;
      edtPMDKgmMin_Internalname = "PMDKGMMIN" ;
      edtPMDKgmMax_Internalname = "PMDKGMMAX" ;
      edtPMDTinPrc_Internalname = "PMDTINPRC" ;
      edtPMDAcaPrc_Internalname = "PMDACAPRC" ;
      edtPMDKgmMinS_Internalname = "PMDKGMMINS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
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
      Form.setCaption( httpContext.getMessage( "Penalizaciones Moda 21", "") );
      edtPMDKgmMinS_Jsonclick = "" ;
      edtPMDAcaPrc_Jsonclick = "" ;
      edtPMDTinPrc_Jsonclick = "" ;
      edtPMDKgmMax_Jsonclick = "" ;
      edtPMDKgmMin_Jsonclick = "" ;
      edtPMDLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtPMDKgmMinS_Enabled = 1 ;
      edtPMDAcaPrc_Enabled = 1 ;
      edtPMDTinPrc_Enabled = 1 ;
      edtPMDKgmMax_Enabled = 1 ;
      edtPMDKgmMin_Enabled = 1 ;
      edtPMDLin_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Peso de Entrada", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtPMDPreMin_Jsonclick = "" ;
      edtPMDPreMin_Enabled = 1 ;
      edtPMDPreLim_Jsonclick = "" ;
      edtPMDPreLim_Enabled = 1 ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_521160( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal11N1160( ) ;
         standaloneModal11N1160( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow11N1160( ) ;
         nGXsfl_52_idx = (int)(nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_521160( ) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1211N2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_PMDLIN","{handler:'valid_Pmdlin',iparms:[]");
      setEventMetadata("VALID_PMDLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pmdkgmmins',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z8400PMDPreLim = DecimalUtil.ZERO ;
      Z8401PMDPreMin = DecimalUtil.ZERO ;
      Z8404PMDKgmMin = DecimalUtil.ZERO ;
      Z8405PMDKgmMax = DecimalUtil.ZERO ;
      Z8406PMDTinPrc = DecimalUtil.ZERO ;
      Z8407PMDAcaPrc = DecimalUtil.ZERO ;
      Z8408PMDKgmMinS = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
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
      A8400PMDPreLim = DecimalUtil.ZERO ;
      A8401PMDPreMin = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV38Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1160 = "" ;
      sStyleString = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
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
      sMode21 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A8404PMDKgmMin = DecimalUtil.ZERO ;
      A8405PMDKgmMax = DecimalUtil.ZERO ;
      A8406PMDTinPrc = DecimalUtil.ZERO ;
      A8407PMDAcaPrc = DecimalUtil.ZERO ;
      A8408PMDKgmMinS = DecimalUtil.ZERO ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T011N6_A407EmprNom = new String[] {""} ;
      T011N6_n407EmprNom = new boolean[] {false} ;
      T011N7_A252CliCod = new int[1] ;
      T011N7_n252CliCod = new boolean[] {false} ;
      T011N7_A407EmprNom = new String[] {""} ;
      T011N7_n407EmprNom = new boolean[] {false} ;
      T011N7_A279CliNom = new String[] {""} ;
      T011N7_A8400PMDPreLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N7_n8400PMDPreLim = new boolean[] {false} ;
      T011N7_A8401PMDPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N7_n8401PMDPreMin = new boolean[] {false} ;
      T011N7_A8402PMDLinUlt = new int[1] ;
      T011N7_n8402PMDLinUlt = new boolean[] {false} ;
      T011N7_A396EmprCod = new String[] {""} ;
      T011N8_A396EmprCod = new String[] {""} ;
      T011N8_A252CliCod = new int[1] ;
      T011N8_n252CliCod = new boolean[] {false} ;
      T011N5_A252CliCod = new int[1] ;
      T011N5_n252CliCod = new boolean[] {false} ;
      T011N5_A279CliNom = new String[] {""} ;
      T011N5_A8400PMDPreLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N5_n8400PMDPreLim = new boolean[] {false} ;
      T011N5_A8401PMDPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N5_n8401PMDPreMin = new boolean[] {false} ;
      T011N5_A8402PMDLinUlt = new int[1] ;
      T011N5_n8402PMDLinUlt = new boolean[] {false} ;
      T011N5_A396EmprCod = new String[] {""} ;
      T011N9_A396EmprCod = new String[] {""} ;
      T011N9_A252CliCod = new int[1] ;
      T011N9_n252CliCod = new boolean[] {false} ;
      T011N10_A396EmprCod = new String[] {""} ;
      T011N10_A252CliCod = new int[1] ;
      T011N10_n252CliCod = new boolean[] {false} ;
      T011N4_A252CliCod = new int[1] ;
      T011N4_n252CliCod = new boolean[] {false} ;
      T011N4_A279CliNom = new String[] {""} ;
      T011N4_A8400PMDPreLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N4_n8400PMDPreLim = new boolean[] {false} ;
      T011N4_A8401PMDPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N4_n8401PMDPreMin = new boolean[] {false} ;
      T011N4_A8402PMDLinUlt = new int[1] ;
      T011N4_n8402PMDLinUlt = new boolean[] {false} ;
      T011N4_A396EmprCod = new String[] {""} ;
      T011N14_A396EmprCod = new String[] {""} ;
      T011N14_A252CliCod = new int[1] ;
      T011N14_n252CliCod = new boolean[] {false} ;
      T011N14_A6930Lb_rclin = new int[1] ;
      T011N15_A396EmprCod = new String[] {""} ;
      T011N15_A6850Tex_NPed = new int[1] ;
      T011N16_A396EmprCod = new String[] {""} ;
      T011N16_A252CliCod = new int[1] ;
      T011N16_n252CliCod = new boolean[] {false} ;
      T011N16_A829TipArtCod = new short[1] ;
      T011N16_A831TipColCod = new byte[1] ;
      T011N16_A583IntCod = new byte[1] ;
      T011N16_A5098TipDisCod = new String[] {""} ;
      T011N16_A6603Est1_anyo = new short[1] ;
      T011N16_A6604Est1_mes = new byte[1] ;
      T011N16_A6605Est1_dia = new byte[1] ;
      T011N17_A396EmprCod = new String[] {""} ;
      T011N17_A6319C_Barcod = new int[1] ;
      T011N17_A6320C_Barcodre = new byte[1] ;
      T011N17_A6321C_Barcodpa = new String[] {""} ;
      T011N17_A6322C_Reclinma = new short[1] ;
      T011N18_A396EmprCod = new String[] {""} ;
      T011N18_A6235DevEmpCod = new int[1] ;
      T011N19_A396EmprCod = new String[] {""} ;
      T011N19_A602MaqCod = new String[] {""} ;
      T011N19_A6078MaqCliCod = new int[1] ;
      T011N19_A6079MaqArtCod = new String[] {""} ;
      T011N20_A396EmprCod = new String[] {""} ;
      T011N20_A5532Lb_numero = new int[1] ;
      T011N21_A396EmprCod = new String[] {""} ;
      T011N21_A252CliCod = new int[1] ;
      T011N21_n252CliCod = new boolean[] {false} ;
      T011N21_A5503CliifLin = new short[1] ;
      T011N22_A396EmprCod = new String[] {""} ;
      T011N22_A252CliCod = new int[1] ;
      T011N22_n252CliCod = new boolean[] {false} ;
      T011N22_A5499ClieiLin = new short[1] ;
      T011N23_A396EmprCod = new String[] {""} ;
      T011N23_A252CliCod = new int[1] ;
      T011N23_n252CliCod = new boolean[] {false} ;
      T011N23_A5495ClidtLin = new short[1] ;
      T011N24_A396EmprCod = new String[] {""} ;
      T011N24_A252CliCod = new int[1] ;
      T011N24_n252CliCod = new boolean[] {false} ;
      T011N24_A5491CliedLin = new short[1] ;
      T011N25_A396EmprCod = new String[] {""} ;
      T011N25_A252CliCod = new int[1] ;
      T011N25_n252CliCod = new boolean[] {false} ;
      T011N25_A5452P_ForCod = new String[] {""} ;
      T011N26_A396EmprCod = new String[] {""} ;
      T011N26_A252CliCod = new int[1] ;
      T011N26_n252CliCod = new boolean[] {false} ;
      T011N26_A5443Mdl_Cod = new String[] {""} ;
      T011N27_A396EmprCod = new String[] {""} ;
      T011N27_A252CliCod = new int[1] ;
      T011N27_n252CliCod = new boolean[] {false} ;
      T011N27_A5436IntCodF2 = new short[1] ;
      T011N28_A396EmprCod = new String[] {""} ;
      T011N28_A252CliCod = new int[1] ;
      T011N28_n252CliCod = new boolean[] {false} ;
      T011N28_A5396IntCodFC = new byte[1] ;
      T011N28_A5434Tip_ColC = new byte[1] ;
      T011N29_A396EmprCod = new String[] {""} ;
      T011N29_A252CliCod = new int[1] ;
      T011N29_n252CliCod = new boolean[] {false} ;
      T011N29_A5428FasPreCod = new String[] {""} ;
      T011N30_A396EmprCod = new String[] {""} ;
      T011N30_A252CliCod = new int[1] ;
      T011N30_n252CliCod = new boolean[] {false} ;
      T011N30_A5398Cli_Proc = new String[] {""} ;
      T011N31_A396EmprCod = new String[] {""} ;
      T011N31_A5130PagIden = new int[1] ;
      T011N32_A396EmprCod = new String[] {""} ;
      T011N32_A5059Hl_hdr = new int[1] ;
      T011N32_A5060Hl_hdrr = new byte[1] ;
      T011N32_A5061Hl_hdrp = new String[] {""} ;
      T011N33_A396EmprCod = new String[] {""} ;
      T011N33_A252CliCod = new int[1] ;
      T011N33_n252CliCod = new boolean[] {false} ;
      T011N33_A4718DishCod = new String[] {""} ;
      T011N33_A5020TipEstCod = new byte[1] ;
      T011N33_A5022GraCod = new byte[1] ;
      T011N34_A396EmprCod = new String[] {""} ;
      T011N34_A4618EnsLCod = new int[1] ;
      T011N35_A396EmprCod = new String[] {""} ;
      T011N35_A4492HreBarCod = new int[1] ;
      T011N35_A4493HreBarReo = new byte[1] ;
      T011N35_A4494HreBarPar = new String[] {""} ;
      T011N35_A4495HreNumCie = new byte[1] ;
      T011N36_A396EmprCod = new String[] {""} ;
      T011N36_A252CliCod = new int[1] ;
      T011N36_n252CliCod = new boolean[] {false} ;
      T011N36_A4415EstCol = new String[] {""} ;
      T011N37_A396EmprCod = new String[] {""} ;
      T011N37_A4185WEBUSU = new String[] {""} ;
      T011N38_A396EmprCod = new String[] {""} ;
      T011N38_A252CliCod = new int[1] ;
      T011N38_n252CliCod = new boolean[] {false} ;
      T011N38_A4079WEBDISCOD = new String[] {""} ;
      T011N38_A4078EMPCOD = new String[] {""} ;
      T011N39_A396EmprCod = new String[] {""} ;
      T011N39_A2637HisEstHRu = new int[1] ;
      T011N39_A2636HisEstHRe = new byte[1] ;
      T011N39_A2635HisEstHPa = new String[] {""} ;
      T011N39_A2638HisEstLCo = new byte[1] ;
      T011N39_A2630HisEstCom = new String[] {""} ;
      T011N39_A2634HisEstFon = new String[] {""} ;
      T011N40_A396EmprCod = new String[] {""} ;
      T011N40_A2574GrpDibCod = new int[1] ;
      T011N41_A396EmprCod = new String[] {""} ;
      T011N41_A2558GrmDibCod = new int[1] ;
      T011N42_A396EmprCod = new String[] {""} ;
      T011N42_A2542GrcDibCod = new int[1] ;
      T011N43_A396EmprCod = new String[] {""} ;
      T011N43_A1031EmpesCod = new String[] {""} ;
      T011N43_A252CliCod = new int[1] ;
      T011N43_n252CliCod = new boolean[] {false} ;
      T011N43_A1032FonCod = new String[] {""} ;
      T011N44_A396EmprCod = new String[] {""} ;
      T011N44_A1013DibCli = new String[] {""} ;
      T011N44_A252CliCod = new int[1] ;
      T011N44_n252CliCod = new boolean[] {false} ;
      T011N44_A1014DibInt = new int[1] ;
      T011N45_A396EmprCod = new String[] {""} ;
      T011N45_A1736AlbExtCod = new long[1] ;
      T011N46_A396EmprCod = new String[] {""} ;
      T011N46_A252CliCod = new int[1] ;
      T011N46_n252CliCod = new boolean[] {false} ;
      T011N46_A3661FacProAny = new short[1] ;
      T011N46_A3662FacProSer = new String[] {""} ;
      T011N46_A3663FacProInt = new byte[1] ;
      T011N46_A3664FacProTip = new byte[1] ;
      T011N46_A3665FacProTar = new short[1] ;
      T011N47_A396EmprCod = new String[] {""} ;
      T011N47_A3646EstTinAny = new short[1] ;
      T011N47_A3647EstTinMes = new byte[1] ;
      T011N47_A3648EstTinDia = new byte[1] ;
      T011N47_A1929EstTinNr = new short[1] ;
      T011N48_A396EmprCod = new String[] {""} ;
      T011N48_A3617AlbTrnCod = new long[1] ;
      T011N49_A396EmprCod = new String[] {""} ;
      T011N49_A252CliCod = new int[1] ;
      T011N49_n252CliCod = new boolean[] {false} ;
      T011N49_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N50_A396EmprCod = new String[] {""} ;
      T011N50_A3073RepCod = new String[] {""} ;
      T011N50_A252CliCod = new int[1] ;
      T011N50_n252CliCod = new boolean[] {false} ;
      T011N51_A396EmprCod = new String[] {""} ;
      T011N51_A3061Codia = new byte[1] ;
      T011N51_A3062CoMes = new byte[1] ;
      T011N51_A3063CoAny = new short[1] ;
      T011N51_A3065CoLin = new byte[1] ;
      T011N51_A3010CoBarCod = new int[1] ;
      T011N51_A3011CoBarReo = new byte[1] ;
      T011N51_A3012CoBarPar = new String[] {""} ;
      T011N52_A396EmprCod = new String[] {""} ;
      T011N52_A2971SabFacCod = new int[1] ;
      T011N53_A396EmprCod = new String[] {""} ;
      T011N53_A2954TiDia = new byte[1] ;
      T011N53_A2955TiMes = new byte[1] ;
      T011N53_A2956TiAny = new short[1] ;
      T011N53_A2958TiLin = new byte[1] ;
      T011N53_A2959TiBarCod = new int[1] ;
      T011N53_A2960TiBarReo = new byte[1] ;
      T011N53_A2961TiBarPar = new String[] {""} ;
      T011N54_A396EmprCod = new String[] {""} ;
      T011N54_A252CliCod = new int[1] ;
      T011N54_n252CliCod = new boolean[] {false} ;
      T011N54_A2933RecTipCon = new short[1] ;
      T011N55_A396EmprCod = new String[] {""} ;
      T011N55_A252CliCod = new int[1] ;
      T011N55_n252CliCod = new boolean[] {false} ;
      T011N55_A2927RecProCod = new String[] {""} ;
      T011N56_A396EmprCod = new String[] {""} ;
      T011N56_A252CliCod = new int[1] ;
      T011N56_n252CliCod = new boolean[] {false} ;
      T011N56_A2891HMaForSer = new String[] {""} ;
      T011N56_A2892HMaForCNom = new String[] {""} ;
      T011N56_A2893HMaForCNum = new int[1] ;
      T011N56_A2894HMaTipCCod = new byte[1] ;
      T011N56_A2895HMaForNumC = new int[1] ;
      T011N56_A2897HMaColLin = new short[1] ;
      T011N56_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T011N56_A2907HmaLin = new short[1] ;
      T011N57_A396EmprCod = new String[] {""} ;
      T011N57_A252CliCod = new int[1] ;
      T011N57_n252CliCod = new boolean[] {false} ;
      T011N57_A425EstAny = new short[1] ;
      T011N57_A2755EstSerFac = new String[] {""} ;
      T011N58_A396EmprCod = new String[] {""} ;
      T011N58_A2730RecTipCo = new short[1] ;
      T011N58_A252CliCod = new int[1] ;
      T011N58_n252CliCod = new boolean[] {false} ;
      T011N59_A396EmprCod = new String[] {""} ;
      T011N59_A2720TarSec = new String[] {""} ;
      T011N59_A252CliCod = new int[1] ;
      T011N59_n252CliCod = new boolean[] {false} ;
      T011N59_A829TipArtCod = new short[1] ;
      T011N59_A831TipColCod = new byte[1] ;
      T011N60_A396EmprCod = new String[] {""} ;
      T011N60_A2382AbcTerCod = new String[] {""} ;
      T011N60_A2381AbcSec = new String[] {""} ;
      T011N60_A252CliCod = new int[1] ;
      T011N60_n252CliCod = new boolean[] {false} ;
      T011N61_A396EmprCod = new String[] {""} ;
      T011N61_A252CliCod = new int[1] ;
      T011N61_n252CliCod = new boolean[] {false} ;
      T011N61_A2308CliDesCod = new int[1] ;
      T011N62_A396EmprCod = new String[] {""} ;
      T011N62_A2268MovParCod = new String[] {""} ;
      T011N62_A252CliCod = new int[1] ;
      T011N62_n252CliCod = new boolean[] {false} ;
      T011N63_A396EmprCod = new String[] {""} ;
      T011N63_A966PartCod = new String[] {""} ;
      T011N63_A252CliCod = new int[1] ;
      T011N63_n252CliCod = new boolean[] {false} ;
      T011N64_A396EmprCod = new String[] {""} ;
      T011N64_A1387AlbPrvCod = new int[1] ;
      T011N65_A396EmprCod = new String[] {""} ;
      T011N65_A252CliCod = new int[1] ;
      T011N65_n252CliCod = new boolean[] {false} ;
      T011N65_A1213TalCod = new String[] {""} ;
      T011N66_A396EmprCod = new String[] {""} ;
      T011N66_A252CliCod = new int[1] ;
      T011N66_n252CliCod = new boolean[] {false} ;
      T011N66_A457FasCod = new String[] {""} ;
      T011N67_A396EmprCod = new String[] {""} ;
      T011N67_A539HisBarCod = new int[1] ;
      T011N67_A545HisCodReo = new byte[1] ;
      T011N67_A544HisCodPar = new String[] {""} ;
      T011N67_A833TipDefCod = new short[1] ;
      T011N68_A396EmprCod = new String[] {""} ;
      T011N68_A506HbaBarCod = new int[1] ;
      T011N68_A508HbaBarReo = new byte[1] ;
      T011N68_A507HbaBarPar = new String[] {""} ;
      T011N69_A396EmprCod = new String[] {""} ;
      T011N69_A252CliCod = new int[1] ;
      T011N69_n252CliCod = new boolean[] {false} ;
      T011N69_A494ForSer = new String[] {""} ;
      T011N69_A482ForColNom = new String[] {""} ;
      T011N69_A483ForColNum = new int[1] ;
      T011N69_A831TipColCod = new byte[1] ;
      T011N70_A396EmprCod = new String[] {""} ;
      T011N70_A252CliCod = new int[1] ;
      T011N70_n252CliCod = new boolean[] {false} ;
      T011N70_A287CliPagLin = new byte[1] ;
      T011N71_A396EmprCod = new String[] {""} ;
      T011N71_A252CliCod = new int[1] ;
      T011N71_n252CliCod = new boolean[] {false} ;
      T011N71_A266CliEnvLin = new byte[1] ;
      T011N72_A396EmprCod = new String[] {""} ;
      T011N72_A252CliCod = new int[1] ;
      T011N72_n252CliCod = new boolean[] {false} ;
      T011N72_A65ArtCod = new String[] {""} ;
      T011N73_A396EmprCod = new String[] {""} ;
      T011N73_A44AlbRecCod = new int[1] ;
      T011N74_A396EmprCod = new String[] {""} ;
      T011N74_A30AlbProCod = new long[1] ;
      T011N75_A396EmprCod = new String[] {""} ;
      T011N75_A14AlbComCod = new int[1] ;
      T011N77_A396EmprCod = new String[] {""} ;
      T011N77_A252CliCod = new int[1] ;
      T011N77_n252CliCod = new boolean[] {false} ;
      T011N78_A252CliCod = new int[1] ;
      T011N78_n252CliCod = new boolean[] {false} ;
      T011N78_A8403PMDLin = new short[1] ;
      T011N78_A8404PMDKgmMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N78_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N78_A8406PMDTinPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N78_A8407PMDAcaPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N78_A8408PMDKgmMinS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N78_A396EmprCod = new String[] {""} ;
      T011N79_A396EmprCod = new String[] {""} ;
      T011N79_A252CliCod = new int[1] ;
      T011N79_n252CliCod = new boolean[] {false} ;
      T011N79_A8403PMDLin = new short[1] ;
      T011N3_A252CliCod = new int[1] ;
      T011N3_n252CliCod = new boolean[] {false} ;
      T011N3_A8403PMDLin = new short[1] ;
      T011N3_A8404PMDKgmMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N3_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N3_A8406PMDTinPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N3_A8407PMDAcaPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N3_A8408PMDKgmMinS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N3_A396EmprCod = new String[] {""} ;
      T011N2_A252CliCod = new int[1] ;
      T011N2_n252CliCod = new boolean[] {false} ;
      T011N2_A8403PMDLin = new short[1] ;
      T011N2_A8404PMDKgmMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N2_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N2_A8406PMDTinPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N2_A8407PMDAcaPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N2_A8408PMDKgmMinS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011N2_A396EmprCod = new String[] {""} ;
      T011N83_A396EmprCod = new String[] {""} ;
      T011N83_A252CliCod = new int[1] ;
      T011N83_n252CliCod = new boolean[] {false} ;
      T011N83_A8403PMDLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd__default(),
         new Object[] {
             new Object[] {
            T011N2_A252CliCod, T011N2_A8403PMDLin, T011N2_A8404PMDKgmMin, T011N2_A8405PMDKgmMax, T011N2_A8406PMDTinPrc, T011N2_A8407PMDAcaPrc, T011N2_A8408PMDKgmMinS, T011N2_A396EmprCod
            }
            , new Object[] {
            T011N3_A252CliCod, T011N3_A8403PMDLin, T011N3_A8404PMDKgmMin, T011N3_A8405PMDKgmMax, T011N3_A8406PMDTinPrc, T011N3_A8407PMDAcaPrc, T011N3_A8408PMDKgmMinS, T011N3_A396EmprCod
            }
            , new Object[] {
            T011N4_A252CliCod, T011N4_A279CliNom, T011N4_A8400PMDPreLim, T011N4_n8400PMDPreLim, T011N4_A8401PMDPreMin, T011N4_n8401PMDPreMin, T011N4_A8402PMDLinUlt, T011N4_n8402PMDLinUlt, T011N4_A396EmprCod
            }
            , new Object[] {
            T011N5_A252CliCod, T011N5_A279CliNom, T011N5_A8400PMDPreLim, T011N5_n8400PMDPreLim, T011N5_A8401PMDPreMin, T011N5_n8401PMDPreMin, T011N5_A8402PMDLinUlt, T011N5_n8402PMDLinUlt, T011N5_A396EmprCod
            }
            , new Object[] {
            T011N6_A407EmprNom, T011N6_n407EmprNom
            }
            , new Object[] {
            T011N7_A252CliCod, T011N7_A407EmprNom, T011N7_n407EmprNom, T011N7_A279CliNom, T011N7_A8400PMDPreLim, T011N7_n8400PMDPreLim, T011N7_A8401PMDPreMin, T011N7_n8401PMDPreMin, T011N7_A8402PMDLinUlt, T011N7_n8402PMDLinUlt,
            T011N7_A396EmprCod
            }
            , new Object[] {
            T011N8_A396EmprCod, T011N8_A252CliCod
            }
            , new Object[] {
            T011N9_A396EmprCod, T011N9_A252CliCod
            }
            , new Object[] {
            T011N10_A396EmprCod, T011N10_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011N14_A396EmprCod, T011N14_A252CliCod, T011N14_A6930Lb_rclin
            }
            , new Object[] {
            T011N15_A396EmprCod, T011N15_A6850Tex_NPed
            }
            , new Object[] {
            T011N16_A396EmprCod, T011N16_A252CliCod, T011N16_A829TipArtCod, T011N16_A831TipColCod, T011N16_A583IntCod, T011N16_A5098TipDisCod, T011N16_A6603Est1_anyo, T011N16_A6604Est1_mes, T011N16_A6605Est1_dia
            }
            , new Object[] {
            T011N17_A396EmprCod, T011N17_A6319C_Barcod, T011N17_A6320C_Barcodre, T011N17_A6321C_Barcodpa, T011N17_A6322C_Reclinma
            }
            , new Object[] {
            T011N18_A396EmprCod, T011N18_A6235DevEmpCod
            }
            , new Object[] {
            T011N19_A396EmprCod, T011N19_A602MaqCod, T011N19_A6078MaqCliCod, T011N19_A6079MaqArtCod
            }
            , new Object[] {
            T011N20_A396EmprCod, T011N20_A5532Lb_numero
            }
            , new Object[] {
            T011N21_A396EmprCod, T011N21_A252CliCod, T011N21_A5503CliifLin
            }
            , new Object[] {
            T011N22_A396EmprCod, T011N22_A252CliCod, T011N22_A5499ClieiLin
            }
            , new Object[] {
            T011N23_A396EmprCod, T011N23_A252CliCod, T011N23_A5495ClidtLin
            }
            , new Object[] {
            T011N24_A396EmprCod, T011N24_A252CliCod, T011N24_A5491CliedLin
            }
            , new Object[] {
            T011N25_A396EmprCod, T011N25_A252CliCod, T011N25_A5452P_ForCod
            }
            , new Object[] {
            T011N26_A396EmprCod, T011N26_A252CliCod, T011N26_A5443Mdl_Cod
            }
            , new Object[] {
            T011N27_A396EmprCod, T011N27_A252CliCod, T011N27_A5436IntCodF2
            }
            , new Object[] {
            T011N28_A396EmprCod, T011N28_A252CliCod, T011N28_A5396IntCodFC, T011N28_A5434Tip_ColC
            }
            , new Object[] {
            T011N29_A396EmprCod, T011N29_A252CliCod, T011N29_A5428FasPreCod
            }
            , new Object[] {
            T011N30_A396EmprCod, T011N30_A252CliCod, T011N30_A5398Cli_Proc
            }
            , new Object[] {
            T011N31_A396EmprCod, T011N31_A5130PagIden
            }
            , new Object[] {
            T011N32_A396EmprCod, T011N32_A5059Hl_hdr, T011N32_A5060Hl_hdrr, T011N32_A5061Hl_hdrp
            }
            , new Object[] {
            T011N33_A396EmprCod, T011N33_A252CliCod, T011N33_A4718DishCod, T011N33_A5020TipEstCod, T011N33_A5022GraCod
            }
            , new Object[] {
            T011N34_A396EmprCod, T011N34_A4618EnsLCod
            }
            , new Object[] {
            T011N35_A396EmprCod, T011N35_A4492HreBarCod, T011N35_A4493HreBarReo, T011N35_A4494HreBarPar, T011N35_A4495HreNumCie
            }
            , new Object[] {
            T011N36_A396EmprCod, T011N36_A252CliCod, T011N36_A4415EstCol
            }
            , new Object[] {
            T011N37_A396EmprCod, T011N37_A4185WEBUSU
            }
            , new Object[] {
            T011N38_A396EmprCod, T011N38_A252CliCod, T011N38_A4079WEBDISCOD, T011N38_A4078EMPCOD
            }
            , new Object[] {
            T011N39_A396EmprCod, T011N39_A2637HisEstHRu, T011N39_A2636HisEstHRe, T011N39_A2635HisEstHPa, T011N39_A2638HisEstLCo, T011N39_A2630HisEstCom, T011N39_A2634HisEstFon
            }
            , new Object[] {
            T011N40_A396EmprCod, T011N40_A2574GrpDibCod
            }
            , new Object[] {
            T011N41_A396EmprCod, T011N41_A2558GrmDibCod
            }
            , new Object[] {
            T011N42_A396EmprCod, T011N42_A2542GrcDibCod
            }
            , new Object[] {
            T011N43_A396EmprCod, T011N43_A1031EmpesCod, T011N43_A252CliCod, T011N43_A1032FonCod
            }
            , new Object[] {
            T011N44_A396EmprCod, T011N44_A1013DibCli, T011N44_A252CliCod, T011N44_A1014DibInt
            }
            , new Object[] {
            T011N45_A396EmprCod, T011N45_A1736AlbExtCod
            }
            , new Object[] {
            T011N46_A396EmprCod, T011N46_A252CliCod, T011N46_A3661FacProAny, T011N46_A3662FacProSer, T011N46_A3663FacProInt, T011N46_A3664FacProTip, T011N46_A3665FacProTar
            }
            , new Object[] {
            T011N47_A396EmprCod, T011N47_A3646EstTinAny, T011N47_A3647EstTinMes, T011N47_A3648EstTinDia, T011N47_A1929EstTinNr
            }
            , new Object[] {
            T011N48_A396EmprCod, T011N48_A3617AlbTrnCod
            }
            , new Object[] {
            T011N49_A396EmprCod, T011N49_A252CliCod, T011N49_A3320CliLimKgs
            }
            , new Object[] {
            T011N50_A396EmprCod, T011N50_A3073RepCod, T011N50_A252CliCod
            }
            , new Object[] {
            T011N51_A396EmprCod, T011N51_A3061Codia, T011N51_A3062CoMes, T011N51_A3063CoAny, T011N51_A3065CoLin, T011N51_A3010CoBarCod, T011N51_A3011CoBarReo, T011N51_A3012CoBarPar
            }
            , new Object[] {
            T011N52_A396EmprCod, T011N52_A2971SabFacCod
            }
            , new Object[] {
            T011N53_A396EmprCod, T011N53_A2954TiDia, T011N53_A2955TiMes, T011N53_A2956TiAny, T011N53_A2958TiLin, T011N53_A2959TiBarCod, T011N53_A2960TiBarReo, T011N53_A2961TiBarPar
            }
            , new Object[] {
            T011N54_A396EmprCod, T011N54_A252CliCod, T011N54_A2933RecTipCon
            }
            , new Object[] {
            T011N55_A396EmprCod, T011N55_A252CliCod, T011N55_A2927RecProCod
            }
            , new Object[] {
            T011N56_A396EmprCod, T011N56_A252CliCod, T011N56_A2891HMaForSer, T011N56_A2892HMaForCNom, T011N56_A2893HMaForCNum, T011N56_A2894HMaTipCCod, T011N56_A2895HMaForNumC, T011N56_A2897HMaColLin, T011N56_A2896HMaFec, T011N56_A2907HmaLin
            }
            , new Object[] {
            T011N57_A396EmprCod, T011N57_A252CliCod, T011N57_A425EstAny, T011N57_A2755EstSerFac
            }
            , new Object[] {
            T011N58_A396EmprCod, T011N58_A2730RecTipCo, T011N58_A252CliCod
            }
            , new Object[] {
            T011N59_A396EmprCod, T011N59_A2720TarSec, T011N59_A252CliCod, T011N59_A829TipArtCod, T011N59_A831TipColCod
            }
            , new Object[] {
            T011N60_A396EmprCod, T011N60_A2382AbcTerCod, T011N60_A2381AbcSec, T011N60_A252CliCod
            }
            , new Object[] {
            T011N61_A396EmprCod, T011N61_A252CliCod, T011N61_A2308CliDesCod
            }
            , new Object[] {
            T011N62_A396EmprCod, T011N62_A2268MovParCod, T011N62_A252CliCod
            }
            , new Object[] {
            T011N63_A396EmprCod, T011N63_A966PartCod, T011N63_A252CliCod
            }
            , new Object[] {
            T011N64_A396EmprCod, T011N64_A1387AlbPrvCod
            }
            , new Object[] {
            T011N65_A396EmprCod, T011N65_A252CliCod, T011N65_A1213TalCod
            }
            , new Object[] {
            T011N66_A396EmprCod, T011N66_A252CliCod, T011N66_A457FasCod
            }
            , new Object[] {
            T011N67_A396EmprCod, T011N67_A539HisBarCod, T011N67_A545HisCodReo, T011N67_A544HisCodPar, T011N67_A833TipDefCod
            }
            , new Object[] {
            T011N68_A396EmprCod, T011N68_A506HbaBarCod, T011N68_A508HbaBarReo, T011N68_A507HbaBarPar
            }
            , new Object[] {
            T011N69_A396EmprCod, T011N69_A252CliCod, T011N69_A494ForSer, T011N69_A482ForColNom, T011N69_A483ForColNum, T011N69_A831TipColCod
            }
            , new Object[] {
            T011N70_A396EmprCod, T011N70_A252CliCod, T011N70_A287CliPagLin
            }
            , new Object[] {
            T011N71_A396EmprCod, T011N71_A252CliCod, T011N71_A266CliEnvLin
            }
            , new Object[] {
            T011N72_A396EmprCod, T011N72_A252CliCod, T011N72_A65ArtCod
            }
            , new Object[] {
            T011N73_A396EmprCod, T011N73_A44AlbRecCod
            }
            , new Object[] {
            T011N74_A396EmprCod, T011N74_A30AlbProCod
            }
            , new Object[] {
            T011N75_A396EmprCod, T011N75_A14AlbComCod
            }
            , new Object[] {
            }
            , new Object[] {
            T011N77_A396EmprCod, T011N77_A252CliCod
            }
            , new Object[] {
            T011N78_A252CliCod, T011N78_A8403PMDLin, T011N78_A8404PMDKgmMin, T011N78_A8405PMDKgmMax, T011N78_A8406PMDTinPrc, T011N78_A8407PMDAcaPrc, T011N78_A8408PMDKgmMinS, T011N78_A396EmprCod
            }
            , new Object[] {
            T011N79_A396EmprCod, T011N79_A252CliCod, T011N79_A8403PMDLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011N83_A396EmprCod, T011N83_A252CliCod, T011N83_A8403PMDLin
            }
         }
      );
      AV38Pgmname = "Facturacion.TPenMD" ;
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
   private short Z8403PMDLin ;
   private short nRcdDeleted_1160 ;
   private short nRcdExists_1160 ;
   private short nIsMod_1160 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1160 ;
   private short RcdFound1160 ;
   private short nBlankRcdUsr1160 ;
   private short RcdFound21 ;
   private short A8403PMDLin ;
   private short nIsDirty_21 ;
   private short nIsDirty_1160 ;
   private int wcpOAV33CliCod ;
   private int Z252CliCod ;
   private int Z8402PMDLinUlt ;
   private int O8402PMDLinUlt ;
   private int nRC_GXsfl_52 ;
   private int nGXsfl_52_idx=1 ;
   private int AV33CliCod ;
   private int trnEnded ;
   private int A8402PMDLinUlt ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtPMDPreLim_Enabled ;
   private int edtPMDPreMin_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int B8402PMDLinUlt ;
   private int edtPMDLin_Enabled ;
   private int edtPMDKgmMin_Enabled ;
   private int edtPMDKgmMax_Enabled ;
   private int edtPMDTinPrc_Enabled ;
   private int edtPMDAcaPrc_Enabled ;
   private int edtPMDKgmMinS_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int s8402PMDLinUlt ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtPMDLin_Enabled ;
   private int i8402PMDLinUlt ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8400PMDPreLim ;
   private java.math.BigDecimal Z8401PMDPreMin ;
   private java.math.BigDecimal Z8404PMDKgmMin ;
   private java.math.BigDecimal Z8405PMDKgmMax ;
   private java.math.BigDecimal Z8406PMDTinPrc ;
   private java.math.BigDecimal Z8407PMDAcaPrc ;
   private java.math.BigDecimal Z8408PMDKgmMinS ;
   private java.math.BigDecimal A8400PMDPreLim ;
   private java.math.BigDecimal A8401PMDPreMin ;
   private java.math.BigDecimal A8404PMDKgmMin ;
   private java.math.BigDecimal A8405PMDKgmMax ;
   private java.math.BigDecimal A8406PMDTinPrc ;
   private java.math.BigDecimal A8407PMDAcaPrc ;
   private java.math.BigDecimal A8408PMDKgmMinS ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_52_idx="0001" ;
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
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtPMDPreLim_Internalname ;
   private String edtPMDPreLim_Jsonclick ;
   private String edtPMDPreMin_Internalname ;
   private String edtPMDPreMin_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV38Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sMode1160 ;
   private String edtPMDLin_Internalname ;
   private String edtPMDKgmMin_Internalname ;
   private String edtPMDKgmMax_Internalname ;
   private String edtPMDTinPrc_Internalname ;
   private String edtPMDAcaPrc_Internalname ;
   private String edtPMDKgmMinS_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A396EmprCod ;
   private String A407EmprNom ;
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
   private String sMode21 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtPMDLin_Jsonclick ;
   private String edtPMDKgmMin_Jsonclick ;
   private String edtPMDKgmMax_Jsonclick ;
   private String edtPMDTinPrc_Jsonclick ;
   private String edtPMDAcaPrc_Jsonclick ;
   private String edtPMDKgmMinS_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n8402PMDLinUlt ;
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
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n252CliCod ;
   private boolean n8400PMDPreLim ;
   private boolean n8401PMDPreMin ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T011N6_A407EmprNom ;
   private boolean[] T011N6_n407EmprNom ;
   private int[] T011N7_A252CliCod ;
   private boolean[] T011N7_n252CliCod ;
   private String[] T011N7_A407EmprNom ;
   private boolean[] T011N7_n407EmprNom ;
   private String[] T011N7_A279CliNom ;
   private java.math.BigDecimal[] T011N7_A8400PMDPreLim ;
   private boolean[] T011N7_n8400PMDPreLim ;
   private java.math.BigDecimal[] T011N7_A8401PMDPreMin ;
   private boolean[] T011N7_n8401PMDPreMin ;
   private int[] T011N7_A8402PMDLinUlt ;
   private boolean[] T011N7_n8402PMDLinUlt ;
   private String[] T011N7_A396EmprCod ;
   private String[] T011N8_A396EmprCod ;
   private int[] T011N8_A252CliCod ;
   private boolean[] T011N8_n252CliCod ;
   private int[] T011N5_A252CliCod ;
   private boolean[] T011N5_n252CliCod ;
   private String[] T011N5_A279CliNom ;
   private java.math.BigDecimal[] T011N5_A8400PMDPreLim ;
   private boolean[] T011N5_n8400PMDPreLim ;
   private java.math.BigDecimal[] T011N5_A8401PMDPreMin ;
   private boolean[] T011N5_n8401PMDPreMin ;
   private int[] T011N5_A8402PMDLinUlt ;
   private boolean[] T011N5_n8402PMDLinUlt ;
   private String[] T011N5_A396EmprCod ;
   private String[] T011N9_A396EmprCod ;
   private int[] T011N9_A252CliCod ;
   private boolean[] T011N9_n252CliCod ;
   private String[] T011N10_A396EmprCod ;
   private int[] T011N10_A252CliCod ;
   private boolean[] T011N10_n252CliCod ;
   private int[] T011N4_A252CliCod ;
   private boolean[] T011N4_n252CliCod ;
   private String[] T011N4_A279CliNom ;
   private java.math.BigDecimal[] T011N4_A8400PMDPreLim ;
   private boolean[] T011N4_n8400PMDPreLim ;
   private java.math.BigDecimal[] T011N4_A8401PMDPreMin ;
   private boolean[] T011N4_n8401PMDPreMin ;
   private int[] T011N4_A8402PMDLinUlt ;
   private boolean[] T011N4_n8402PMDLinUlt ;
   private String[] T011N4_A396EmprCod ;
   private String[] T011N14_A396EmprCod ;
   private int[] T011N14_A252CliCod ;
   private boolean[] T011N14_n252CliCod ;
   private int[] T011N14_A6930Lb_rclin ;
   private String[] T011N15_A396EmprCod ;
   private int[] T011N15_A6850Tex_NPed ;
   private String[] T011N16_A396EmprCod ;
   private int[] T011N16_A252CliCod ;
   private boolean[] T011N16_n252CliCod ;
   private short[] T011N16_A829TipArtCod ;
   private byte[] T011N16_A831TipColCod ;
   private byte[] T011N16_A583IntCod ;
   private String[] T011N16_A5098TipDisCod ;
   private short[] T011N16_A6603Est1_anyo ;
   private byte[] T011N16_A6604Est1_mes ;
   private byte[] T011N16_A6605Est1_dia ;
   private String[] T011N17_A396EmprCod ;
   private int[] T011N17_A6319C_Barcod ;
   private byte[] T011N17_A6320C_Barcodre ;
   private String[] T011N17_A6321C_Barcodpa ;
   private short[] T011N17_A6322C_Reclinma ;
   private String[] T011N18_A396EmprCod ;
   private int[] T011N18_A6235DevEmpCod ;
   private String[] T011N19_A396EmprCod ;
   private String[] T011N19_A602MaqCod ;
   private int[] T011N19_A6078MaqCliCod ;
   private String[] T011N19_A6079MaqArtCod ;
   private String[] T011N20_A396EmprCod ;
   private int[] T011N20_A5532Lb_numero ;
   private String[] T011N21_A396EmprCod ;
   private int[] T011N21_A252CliCod ;
   private boolean[] T011N21_n252CliCod ;
   private short[] T011N21_A5503CliifLin ;
   private String[] T011N22_A396EmprCod ;
   private int[] T011N22_A252CliCod ;
   private boolean[] T011N22_n252CliCod ;
   private short[] T011N22_A5499ClieiLin ;
   private String[] T011N23_A396EmprCod ;
   private int[] T011N23_A252CliCod ;
   private boolean[] T011N23_n252CliCod ;
   private short[] T011N23_A5495ClidtLin ;
   private String[] T011N24_A396EmprCod ;
   private int[] T011N24_A252CliCod ;
   private boolean[] T011N24_n252CliCod ;
   private short[] T011N24_A5491CliedLin ;
   private String[] T011N25_A396EmprCod ;
   private int[] T011N25_A252CliCod ;
   private boolean[] T011N25_n252CliCod ;
   private String[] T011N25_A5452P_ForCod ;
   private String[] T011N26_A396EmprCod ;
   private int[] T011N26_A252CliCod ;
   private boolean[] T011N26_n252CliCod ;
   private String[] T011N26_A5443Mdl_Cod ;
   private String[] T011N27_A396EmprCod ;
   private int[] T011N27_A252CliCod ;
   private boolean[] T011N27_n252CliCod ;
   private short[] T011N27_A5436IntCodF2 ;
   private String[] T011N28_A396EmprCod ;
   private int[] T011N28_A252CliCod ;
   private boolean[] T011N28_n252CliCod ;
   private byte[] T011N28_A5396IntCodFC ;
   private byte[] T011N28_A5434Tip_ColC ;
   private String[] T011N29_A396EmprCod ;
   private int[] T011N29_A252CliCod ;
   private boolean[] T011N29_n252CliCod ;
   private String[] T011N29_A5428FasPreCod ;
   private String[] T011N30_A396EmprCod ;
   private int[] T011N30_A252CliCod ;
   private boolean[] T011N30_n252CliCod ;
   private String[] T011N30_A5398Cli_Proc ;
   private String[] T011N31_A396EmprCod ;
   private int[] T011N31_A5130PagIden ;
   private String[] T011N32_A396EmprCod ;
   private int[] T011N32_A5059Hl_hdr ;
   private byte[] T011N32_A5060Hl_hdrr ;
   private String[] T011N32_A5061Hl_hdrp ;
   private String[] T011N33_A396EmprCod ;
   private int[] T011N33_A252CliCod ;
   private boolean[] T011N33_n252CliCod ;
   private String[] T011N33_A4718DishCod ;
   private byte[] T011N33_A5020TipEstCod ;
   private byte[] T011N33_A5022GraCod ;
   private String[] T011N34_A396EmprCod ;
   private int[] T011N34_A4618EnsLCod ;
   private String[] T011N35_A396EmprCod ;
   private int[] T011N35_A4492HreBarCod ;
   private byte[] T011N35_A4493HreBarReo ;
   private String[] T011N35_A4494HreBarPar ;
   private byte[] T011N35_A4495HreNumCie ;
   private String[] T011N36_A396EmprCod ;
   private int[] T011N36_A252CliCod ;
   private boolean[] T011N36_n252CliCod ;
   private String[] T011N36_A4415EstCol ;
   private String[] T011N37_A396EmprCod ;
   private String[] T011N37_A4185WEBUSU ;
   private String[] T011N38_A396EmprCod ;
   private int[] T011N38_A252CliCod ;
   private boolean[] T011N38_n252CliCod ;
   private String[] T011N38_A4079WEBDISCOD ;
   private String[] T011N38_A4078EMPCOD ;
   private String[] T011N39_A396EmprCod ;
   private int[] T011N39_A2637HisEstHRu ;
   private byte[] T011N39_A2636HisEstHRe ;
   private String[] T011N39_A2635HisEstHPa ;
   private byte[] T011N39_A2638HisEstLCo ;
   private String[] T011N39_A2630HisEstCom ;
   private String[] T011N39_A2634HisEstFon ;
   private String[] T011N40_A396EmprCod ;
   private int[] T011N40_A2574GrpDibCod ;
   private String[] T011N41_A396EmprCod ;
   private int[] T011N41_A2558GrmDibCod ;
   private String[] T011N42_A396EmprCod ;
   private int[] T011N42_A2542GrcDibCod ;
   private String[] T011N43_A396EmprCod ;
   private String[] T011N43_A1031EmpesCod ;
   private int[] T011N43_A252CliCod ;
   private boolean[] T011N43_n252CliCod ;
   private String[] T011N43_A1032FonCod ;
   private String[] T011N44_A396EmprCod ;
   private String[] T011N44_A1013DibCli ;
   private int[] T011N44_A252CliCod ;
   private boolean[] T011N44_n252CliCod ;
   private int[] T011N44_A1014DibInt ;
   private String[] T011N45_A396EmprCod ;
   private long[] T011N45_A1736AlbExtCod ;
   private String[] T011N46_A396EmprCod ;
   private int[] T011N46_A252CliCod ;
   private boolean[] T011N46_n252CliCod ;
   private short[] T011N46_A3661FacProAny ;
   private String[] T011N46_A3662FacProSer ;
   private byte[] T011N46_A3663FacProInt ;
   private byte[] T011N46_A3664FacProTip ;
   private short[] T011N46_A3665FacProTar ;
   private String[] T011N47_A396EmprCod ;
   private short[] T011N47_A3646EstTinAny ;
   private byte[] T011N47_A3647EstTinMes ;
   private byte[] T011N47_A3648EstTinDia ;
   private short[] T011N47_A1929EstTinNr ;
   private String[] T011N48_A396EmprCod ;
   private long[] T011N48_A3617AlbTrnCod ;
   private String[] T011N49_A396EmprCod ;
   private int[] T011N49_A252CliCod ;
   private boolean[] T011N49_n252CliCod ;
   private java.math.BigDecimal[] T011N49_A3320CliLimKgs ;
   private String[] T011N50_A396EmprCod ;
   private String[] T011N50_A3073RepCod ;
   private int[] T011N50_A252CliCod ;
   private boolean[] T011N50_n252CliCod ;
   private String[] T011N51_A396EmprCod ;
   private byte[] T011N51_A3061Codia ;
   private byte[] T011N51_A3062CoMes ;
   private short[] T011N51_A3063CoAny ;
   private byte[] T011N51_A3065CoLin ;
   private int[] T011N51_A3010CoBarCod ;
   private byte[] T011N51_A3011CoBarReo ;
   private String[] T011N51_A3012CoBarPar ;
   private String[] T011N52_A396EmprCod ;
   private int[] T011N52_A2971SabFacCod ;
   private String[] T011N53_A396EmprCod ;
   private byte[] T011N53_A2954TiDia ;
   private byte[] T011N53_A2955TiMes ;
   private short[] T011N53_A2956TiAny ;
   private byte[] T011N53_A2958TiLin ;
   private int[] T011N53_A2959TiBarCod ;
   private byte[] T011N53_A2960TiBarReo ;
   private String[] T011N53_A2961TiBarPar ;
   private String[] T011N54_A396EmprCod ;
   private int[] T011N54_A252CliCod ;
   private boolean[] T011N54_n252CliCod ;
   private short[] T011N54_A2933RecTipCon ;
   private String[] T011N55_A396EmprCod ;
   private int[] T011N55_A252CliCod ;
   private boolean[] T011N55_n252CliCod ;
   private String[] T011N55_A2927RecProCod ;
   private String[] T011N56_A396EmprCod ;
   private int[] T011N56_A252CliCod ;
   private boolean[] T011N56_n252CliCod ;
   private String[] T011N56_A2891HMaForSer ;
   private String[] T011N56_A2892HMaForCNom ;
   private int[] T011N56_A2893HMaForCNum ;
   private byte[] T011N56_A2894HMaTipCCod ;
   private int[] T011N56_A2895HMaForNumC ;
   private short[] T011N56_A2897HMaColLin ;
   private java.util.Date[] T011N56_A2896HMaFec ;
   private short[] T011N56_A2907HmaLin ;
   private String[] T011N57_A396EmprCod ;
   private int[] T011N57_A252CliCod ;
   private boolean[] T011N57_n252CliCod ;
   private short[] T011N57_A425EstAny ;
   private String[] T011N57_A2755EstSerFac ;
   private String[] T011N58_A396EmprCod ;
   private short[] T011N58_A2730RecTipCo ;
   private int[] T011N58_A252CliCod ;
   private boolean[] T011N58_n252CliCod ;
   private String[] T011N59_A396EmprCod ;
   private String[] T011N59_A2720TarSec ;
   private int[] T011N59_A252CliCod ;
   private boolean[] T011N59_n252CliCod ;
   private short[] T011N59_A829TipArtCod ;
   private byte[] T011N59_A831TipColCod ;
   private String[] T011N60_A396EmprCod ;
   private String[] T011N60_A2382AbcTerCod ;
   private String[] T011N60_A2381AbcSec ;
   private int[] T011N60_A252CliCod ;
   private boolean[] T011N60_n252CliCod ;
   private String[] T011N61_A396EmprCod ;
   private int[] T011N61_A252CliCod ;
   private boolean[] T011N61_n252CliCod ;
   private int[] T011N61_A2308CliDesCod ;
   private String[] T011N62_A396EmprCod ;
   private String[] T011N62_A2268MovParCod ;
   private int[] T011N62_A252CliCod ;
   private boolean[] T011N62_n252CliCod ;
   private String[] T011N63_A396EmprCod ;
   private String[] T011N63_A966PartCod ;
   private int[] T011N63_A252CliCod ;
   private boolean[] T011N63_n252CliCod ;
   private String[] T011N64_A396EmprCod ;
   private int[] T011N64_A1387AlbPrvCod ;
   private String[] T011N65_A396EmprCod ;
   private int[] T011N65_A252CliCod ;
   private boolean[] T011N65_n252CliCod ;
   private String[] T011N65_A1213TalCod ;
   private String[] T011N66_A396EmprCod ;
   private int[] T011N66_A252CliCod ;
   private boolean[] T011N66_n252CliCod ;
   private String[] T011N66_A457FasCod ;
   private String[] T011N67_A396EmprCod ;
   private int[] T011N67_A539HisBarCod ;
   private byte[] T011N67_A545HisCodReo ;
   private String[] T011N67_A544HisCodPar ;
   private short[] T011N67_A833TipDefCod ;
   private String[] T011N68_A396EmprCod ;
   private int[] T011N68_A506HbaBarCod ;
   private byte[] T011N68_A508HbaBarReo ;
   private String[] T011N68_A507HbaBarPar ;
   private String[] T011N69_A396EmprCod ;
   private int[] T011N69_A252CliCod ;
   private boolean[] T011N69_n252CliCod ;
   private String[] T011N69_A494ForSer ;
   private String[] T011N69_A482ForColNom ;
   private int[] T011N69_A483ForColNum ;
   private byte[] T011N69_A831TipColCod ;
   private String[] T011N70_A396EmprCod ;
   private int[] T011N70_A252CliCod ;
   private boolean[] T011N70_n252CliCod ;
   private byte[] T011N70_A287CliPagLin ;
   private String[] T011N71_A396EmprCod ;
   private int[] T011N71_A252CliCod ;
   private boolean[] T011N71_n252CliCod ;
   private byte[] T011N71_A266CliEnvLin ;
   private String[] T011N72_A396EmprCod ;
   private int[] T011N72_A252CliCod ;
   private boolean[] T011N72_n252CliCod ;
   private String[] T011N72_A65ArtCod ;
   private String[] T011N73_A396EmprCod ;
   private int[] T011N73_A44AlbRecCod ;
   private String[] T011N74_A396EmprCod ;
   private long[] T011N74_A30AlbProCod ;
   private String[] T011N75_A396EmprCod ;
   private int[] T011N75_A14AlbComCod ;
   private String[] T011N77_A396EmprCod ;
   private int[] T011N77_A252CliCod ;
   private boolean[] T011N77_n252CliCod ;
   private int[] T011N78_A252CliCod ;
   private boolean[] T011N78_n252CliCod ;
   private short[] T011N78_A8403PMDLin ;
   private java.math.BigDecimal[] T011N78_A8404PMDKgmMin ;
   private java.math.BigDecimal[] T011N78_A8405PMDKgmMax ;
   private java.math.BigDecimal[] T011N78_A8406PMDTinPrc ;
   private java.math.BigDecimal[] T011N78_A8407PMDAcaPrc ;
   private java.math.BigDecimal[] T011N78_A8408PMDKgmMinS ;
   private String[] T011N78_A396EmprCod ;
   private String[] T011N79_A396EmprCod ;
   private int[] T011N79_A252CliCod ;
   private boolean[] T011N79_n252CliCod ;
   private short[] T011N79_A8403PMDLin ;
   private int[] T011N3_A252CliCod ;
   private boolean[] T011N3_n252CliCod ;
   private short[] T011N3_A8403PMDLin ;
   private java.math.BigDecimal[] T011N3_A8404PMDKgmMin ;
   private java.math.BigDecimal[] T011N3_A8405PMDKgmMax ;
   private java.math.BigDecimal[] T011N3_A8406PMDTinPrc ;
   private java.math.BigDecimal[] T011N3_A8407PMDAcaPrc ;
   private java.math.BigDecimal[] T011N3_A8408PMDKgmMinS ;
   private String[] T011N3_A396EmprCod ;
   private int[] T011N2_A252CliCod ;
   private boolean[] T011N2_n252CliCod ;
   private short[] T011N2_A8403PMDLin ;
   private java.math.BigDecimal[] T011N2_A8404PMDKgmMin ;
   private java.math.BigDecimal[] T011N2_A8405PMDKgmMax ;
   private java.math.BigDecimal[] T011N2_A8406PMDTinPrc ;
   private java.math.BigDecimal[] T011N2_A8407PMDAcaPrc ;
   private java.math.BigDecimal[] T011N2_A8408PMDKgmMinS ;
   private String[] T011N2_A396EmprCod ;
   private String[] T011N83_A396EmprCod ;
   private int[] T011N83_A252CliCod ;
   private boolean[] T011N83_n252CliCod ;
   private short[] T011N83_A8403PMDLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
}

final  class tpenmd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T011N2", "SELECT CliCod, PMDLin, PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS, EmprCod FROM TXPPenMD WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ?  FOR UPDATE OF PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011N3", "SELECT CliCod, PMDLin, PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS, EmprCod FROM TXPPenMD WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011N4", "SELECT CliCod, CliNom, PMDPreLim, PMDPreMin, PMDLinUlt, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom, PMDPreLim, PMDPreMin, PMDLinUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011N5", "SELECT CliCod, CliNom, PMDPreLim, PMDPreMin, PMDLinUlt, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011N6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011N7", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, T2.EmprNom, TM1.CliNom, TM1.PMDPreLim, TM1.PMDPreMin, TM1.PMDLinUlt, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011N8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011N9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ?) ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ?) ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T011N11", "INSERT INTO TXPCLIENT(CliCod, CliNom, PMDPreLim, PMDPreMin, PMDLinUlt, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T011N12", "UPDATE TXPCLIENT SET CliNom=?, PMDPreLim=?, PMDPreMin=?, PMDLinUlt=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T011N13", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T011N14", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N15", "SELECT * FROM (SELECT EmprCod, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N16", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N17", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N18", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N19", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N20", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N21", "SELECT * FROM (SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N22", "SELECT * FROM (SELECT EmprCod, CliCod, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N23", "SELECT * FROM (SELECT EmprCod, CliCod, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N24", "SELECT * FROM (SELECT EmprCod, CliCod, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N25", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N26", "SELECT * FROM (SELECT EmprCod, CliCod, Mdl_Cod FROM TXPCLIMOD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N27", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodF2 FROM TXPCLIIN2 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N28", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodFC, Tip_ColC FROM TXPCLIINT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N29", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N30", "SELECT * FROM (SELECT EmprCod, CliCod, Cli_Proc FROM TXPCLIPRL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N31", "SELECT * FROM (SELECT EmprCod, PagIden FROM TXPPAGCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N32", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N33", "SELECT * FROM (SELECT EmprCod, CliCod, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N34", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N35", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N36", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol FROM TXPCEstCo WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N37", "SELECT * FROM (SELECT EMPRCOD, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? AND CLICOD = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N38", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD, EMPCOD FROM TXPWeDiEm WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N39", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon FROM TXPCHISES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N40", "SELECT * FROM (SELECT EmprCod, GrpDibCod FROM TXPCGRPEQ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N41", "SELECT * FROM (SELECT EmprCod, GrmDibCod FROM TXPCGRMOL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N42", "SELECT * FROM (SELECT EmprCod, GrcDibCod FROM TXPCGRCIL WHERE EmprCod = ? AND CliCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N43", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N44", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N45", "SELECT * FROM (SELECT EmprCod, AlbExtCod FROM TXPCALEXT WHERE EmprAlbExt = ? AND AlbExtCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N46", "SELECT * FROM (SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N47", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N48", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N49", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N50", "SELECT * FROM (SELECT EmprCod, RepCod, CliCod FROM TXPCOMREP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N51", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N52", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N53", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N54", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N55", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N56", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N57", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N58", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N59", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N60", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N61", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N62", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N63", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N64", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N65", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod FROM TXPCENTMA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N66", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N67", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N68", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N69", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N70", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N71", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N72", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N73", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N74", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND GuiRemCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011N75", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T011N76", "UPDATE TXPCLIENT SET PMDLinUlt=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T011N77", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011N78", "SELECT CliCod, PMDLin, PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS, EmprCod FROM TXPPenMD WHERE EmprCod = ? and CliCod = ? and PMDLin = ? ORDER BY EmprCod, CliCod, PMDLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011N79", "SELECT EmprCod, CliCod, PMDLin FROM TXPPenMD WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T011N80", "INSERT INTO TXPPenMD(CliCod, PMDLin, PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPenMD")
         ,new UpdateCursor("T011N81", "UPDATE TXPPenMD SET PMDKgmMin=?, PMDKgmMax=?, PMDTinPrc=?, PMDAcaPrc=?, PMDKgmMinS=?  WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ?", GX_NOMASK, "TXPPenMD")
         ,new UpdateCursor("T011N82", "DELETE FROM TXPPenMD  WHERE EmprCod = ? AND CliCod = ? AND PMDLin = ?", GX_NOMASK, "TXPPenMD")
         ,new ForEachCursor("T011N83", "SELECT EmprCod, CliCod, PMDLin FROM TXPPenMD WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, PMDLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               return;
            case 5 :
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
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 8 :
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
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 30);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               stmt.setString(6, (String)parms[9], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               stmt.setString(5, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               return;
            case 11 :
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
            case 12 :
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
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
               return;
            case 62 :
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
               return;
            case 64 :
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
            case 65 :
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
               return;
            case 67 :
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
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(8, (String)parms[8], 3);
               return;
            case 79 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 81 :
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
      }
   }

}

