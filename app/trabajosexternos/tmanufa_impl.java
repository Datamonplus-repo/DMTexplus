package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmanufa_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRVCOD") == 0 )
      {
         A13798PrvDscID = httpContext.GetPar( "PrvDscID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprvcod7H0( A13798PrvDscID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRVCOD") == 0 )
      {
         A13798PrvDscID = httpContext.GetPar( "PrvDscID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprvcod7H0( A13798PrvDscID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PRVCOD") == 0 )
      {
         h781PrvCod = httpContext.GetPar( "h781PrvCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaprvcod7H304( h781PrvCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"MANCOD") == 0 )
      {
         AV33ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ManCod), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33ManCod), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asamancod7H304( AV33ManCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"MANCOD") == 0 )
      {
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         n2248ManCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         AV39autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asamancod7H304( A2248ManCod, AV39autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A781PrvCod = (short)(GXutil.lval( httpContext.GetPar( "PrvCod"))) ;
         n781PrvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A781PrvCod) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV33ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ManCod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33ManCod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Manufacturadores", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tmanufa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmanufa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmanufa_impl.class ));
   }

   public tmanufa_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManCod_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TMANUFA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManNom_Internalname, httpContext.getMessage( "Manufacturador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManNom_Internalname, GXutil.rtrim( A2249ManNom), GXutil.rtrim( localUtil.format( A2249ManNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManNif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManNif_Internalname, httpContext.getMessage( "Nif", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManNif_Internalname, GXutil.rtrim( A3302ManNif), GXutil.rtrim( localUtil.format( A3302ManNif, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManNif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManDom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManDom_Internalname, httpContext.getMessage( "Domicilio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManDom_Internalname, GXutil.rtrim( A2250ManDom), GXutil.rtrim( localUtil.format( A2250ManDom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManDom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManDom_Enabled, 0, "text", "", 34, "chr", 1, "row", 34, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManPob_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManPob_Internalname, httpContext.getMessage( "Poblacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManPob_Internalname, GXutil.rtrim( A2251ManPob), GXutil.rtrim( localUtil.format( A2251ManPob, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManPob_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManPob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManCpo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManCpo_Internalname, httpContext.getMessage( "Codigo Postal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCpo_Internalname, GXutil.rtrim( A2252ManCpo), GXutil.rtrim( localUtil.format( A2252ManCpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCpo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManCpo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManCp2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManCp2_Internalname, httpContext.getMessage( "Codigo Postal (2)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCp2_Internalname, GXutil.rtrim( A10743ManCp2), GXutil.rtrim( localUtil.format( A10743ManCp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCp2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManCp2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvCod_Internalname, httpContext.getMessage( "Codigo Provincia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCod_Internalname, h781PrvCod, GXutil.rtrim( localUtil.format( h781PrvCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCod_Enabled, 1, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManTel1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManTel1_Internalname, httpContext.getMessage( "Telefono (1)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManTel1_Internalname, GXutil.rtrim( A3299ManTel1), GXutil.rtrim( localUtil.format( A3299ManTel1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManTel1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManTel1_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManTel2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManTel2_Internalname, httpContext.getMessage( "Telefono (2)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManTel2_Internalname, GXutil.rtrim( A3300ManTel2), GXutil.rtrim( localUtil.format( A3300ManTel2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManTel2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManTel2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManFax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManFax_Internalname, httpContext.getMessage( "Fax", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManFax_Internalname, GXutil.rtrim( A3301ManFax), GXutil.rtrim( localUtil.format( A3301ManFax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManFax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManFax_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManDto_Internalname, httpContext.getMessage( "Descuento ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManDto_Internalname, GXutil.ltrim( localUtil.ntoc( A3409ManDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtManDto_Enabled!=0) ? localUtil.format( A3409ManDto, "Z9.99") : localUtil.format( A3409ManDto, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManDto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TMANUFA.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TMANUFA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TMANUFA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TMANUFA.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV40Pgmname), GXutil.rtrim( localUtil.format( AV40Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TMANUFA.htm");
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
      e117H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2249ManNom = httpContext.cgiGet( "Z2249ManNom") ;
            Z2250ManDom = httpContext.cgiGet( "Z2250ManDom") ;
            Z2251ManPob = httpContext.cgiGet( "Z2251ManPob") ;
            Z2252ManCpo = httpContext.cgiGet( "Z2252ManCpo") ;
            Z10743ManCp2 = httpContext.cgiGet( "Z10743ManCp2") ;
            Z3299ManTel1 = httpContext.cgiGet( "Z3299ManTel1") ;
            Z3300ManTel2 = httpContext.cgiGet( "Z3300ManTel2") ;
            Z3301ManFax = httpContext.cgiGet( "Z3301ManFax") ;
            Z3302ManNif = httpContext.cgiGet( "Z3302ManNif") ;
            Z3409ManDto = localUtil.ctond( httpContext.cgiGet( "Z3409ManDto")) ;
            Z781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z781PrvCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "N781PrvCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13847ManNomID = httpContext.cgiGet( "MANNOMID") ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV33ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "vMANCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Insert_PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PRVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCPRVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A787PrvDsc = httpContext.cgiGet( "PRVDSC") ;
            n787PrvDsc = false ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtManCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2248ManCod = (short)(0) ;
               n2248ManCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            }
            else
            {
               A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n2248ManCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            }
            A2249ManNom = httpContext.cgiGet( edtManNom_Internalname) ;
            n2249ManNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
            A3302ManNif = GXutil.upper( httpContext.cgiGet( edtManNif_Internalname)) ;
            n3302ManNif = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3302ManNif", A3302ManNif);
            A2250ManDom = httpContext.cgiGet( edtManDom_Internalname) ;
            n2250ManDom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2250ManDom", A2250ManDom);
            A2251ManPob = httpContext.cgiGet( edtManPob_Internalname) ;
            n2251ManPob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2251ManPob", A2251ManPob);
            A2252ManCpo = httpContext.cgiGet( edtManCpo_Internalname) ;
            n2252ManCpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2252ManCpo", A2252ManCpo);
            A10743ManCp2 = httpContext.cgiGet( edtManCp2_Internalname) ;
            n10743ManCp2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10743ManCp2", A10743ManCp2);
            h781PrvCod = httpContext.cgiGet( edtPrvCod_Internalname) ;
            A3299ManTel1 = httpContext.cgiGet( edtManTel1_Internalname) ;
            n3299ManTel1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3299ManTel1", A3299ManTel1);
            A3300ManTel2 = httpContext.cgiGet( edtManTel2_Internalname) ;
            n3300ManTel2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3300ManTel2", A3300ManTel2);
            A3301ManFax = httpContext.cgiGet( edtManFax_Internalname) ;
            n3301ManFax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3301ManFax", A3301ManFax);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtManDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtManDto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANDTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtManDto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3409ManDto = DecimalUtil.ZERO ;
               n3409ManDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3409ManDto", GXutil.ltrimstr( A3409ManDto, 5, 2));
            }
            else
            {
               A3409ManDto = localUtil.ctond( httpContext.cgiGet( edtManDto_Internalname)) ;
               n3409ManDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3409ManDto", GXutil.ltrimstr( A3409ManDto, 5, 2));
            }
            AV40Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Pgmname", AV40Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMANUFA");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV40Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Pgmname", AV40Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV40Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A2248ManCod != Z2248ManCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("trabajosexternos\\tmanufa:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
               n2248ManCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
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
                  sMode304 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode304 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound304 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_7H0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "MANCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtManCod_Internalname ;
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
                        e117H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e127H2 ();
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
         e127H2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll7H304( ) ;
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
         disableAttributes7H304( ) ;
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

   public void confirm_7H0( )
   {
      beforeValidate7H304( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls7H304( ) ;
         }
         else
         {
            checkExtendedTable7H304( ) ;
            closeExtendedTableCursors7H304( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption7H0( )
   {
   }

   public void e117H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmanufa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmanufa_impl.this.AV32EmprCod = GXv_char2[0] ;
      tmanufa_impl.this.AV16EmprNom = GXv_char3[0] ;
      tmanufa_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV35TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV40Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV41GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GXV1), 8, 0));
         while ( AV41GXV1 <= AV35TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV38TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV35TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV41GXV1));
            if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvCod") == 0 )
            {
               AV37Insert_PrvCod = (short)(GXutil.lval( AV38TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Insert_PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Insert_PrvCod), 3, 0));
            }
            AV41GXV1 = (int)(AV41GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GXV1), 8, 0));
         }
      }
      GXt_int6 = (byte)(AV39autonumber) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV32EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int7) ;
      tmanufa_impl.this.GXt_int6 = GXv_int7[0] ;
      AV39autonumber = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39autonumber), 4, 0));
   }

   public void e127H2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV35TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.trabajosexternos.tmanufaww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm7H304( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2249ManNom = T007H3_A2249ManNom[0] ;
            Z2250ManDom = T007H3_A2250ManDom[0] ;
            Z2251ManPob = T007H3_A2251ManPob[0] ;
            Z2252ManCpo = T007H3_A2252ManCpo[0] ;
            Z10743ManCp2 = T007H3_A10743ManCp2[0] ;
            Z3299ManTel1 = T007H3_A3299ManTel1[0] ;
            Z3300ManTel2 = T007H3_A3300ManTel2[0] ;
            Z3301ManFax = T007H3_A3301ManFax[0] ;
            Z3302ManNif = T007H3_A3302ManNif[0] ;
            Z3409ManDto = T007H3_A3409ManDto[0] ;
            Z781PrvCod = T007H3_A781PrvCod[0] ;
         }
         else
         {
            Z2249ManNom = A2249ManNom ;
            Z2250ManDom = A2250ManDom ;
            Z2251ManPob = A2251ManPob ;
            Z2252ManCpo = A2252ManCpo ;
            Z10743ManCp2 = A10743ManCp2 ;
            Z3299ManTel1 = A3299ManTel1 ;
            Z3300ManTel2 = A3300ManTel2 ;
            Z3301ManFax = A3301ManFax ;
            Z3302ManNif = A3302ManNif ;
            Z3409ManDto = A3409ManDto ;
            Z781PrvCod = A781PrvCod ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z2248ManCod = A2248ManCod ;
         Z2249ManNom = A2249ManNom ;
         Z2250ManDom = A2250ManDom ;
         Z2251ManPob = A2251ManPob ;
         Z2252ManCpo = A2252ManCpo ;
         Z10743ManCp2 = A10743ManCp2 ;
         Z3299ManTel1 = A3299ManTel1 ;
         Z3300ManTel2 = A3300ManTel2 ;
         Z3301ManFax = A3301ManFax ;
         Z3302ManNif = A3302ManNif ;
         Z3409ManDto = A3409ManDto ;
         Z396EmprCod = A396EmprCod ;
         Z781PrvCod = A781PrvCod ;
         Z407EmprNom = A407EmprNom ;
         Z787PrvDsc = A787PrvDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV40Pgmname = "TrabajosExternos.TMANUFA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Pgmname", AV40Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T007H4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T007H4_A407EmprNom[0] ;
      n407EmprNom = T007H4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV33ManCod) )
      {
         A2248ManCod = AV33ManCod ;
         n2248ManCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
      if ( ! (0==AV33ManCod) )
      {
         edtManCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      }
      else
      {
         edtManCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV33ManCod) )
      {
         edtManCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV37Insert_PrvCod) )
      {
         edtPrvCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Enabled), 5, 0), true);
      }
      else
      {
         edtPrvCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV37Insert_PrvCod) )
      {
         A781PrvCod = AV37Insert_PrvCod ;
         n781PrvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         /* Using cursor T007H6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
         h781PrvCod = "" ;
         while ( (pr_default.getStatus(4) != 101) )
         {
            h781PrvCod = T007H6_A13798PrvDscID[0] ;
            if (true) break;
         }
         pr_default.close(4);
         httpContext.ajax_rsp_assign_attri("", false, "h781PrvCod", h781PrvCod);
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
         /* Using cursor T007H5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
         A787PrvDsc = T007H5_A787PrvDsc[0] ;
         n787PrvDsc = T007H5_n787PrvDsc[0] ;
         pr_default.close(3);
      }
   }

   public void load7H304( )
   {
      /* Using cursor T007H7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound304 = (short)(1) ;
         A407EmprNom = T007H7_A407EmprNom[0] ;
         n407EmprNom = T007H7_n407EmprNom[0] ;
         A2249ManNom = T007H7_A2249ManNom[0] ;
         n2249ManNom = T007H7_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         A2250ManDom = T007H7_A2250ManDom[0] ;
         n2250ManDom = T007H7_n2250ManDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2250ManDom", A2250ManDom);
         A2251ManPob = T007H7_A2251ManPob[0] ;
         n2251ManPob = T007H7_n2251ManPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2251ManPob", A2251ManPob);
         A2252ManCpo = T007H7_A2252ManCpo[0] ;
         n2252ManCpo = T007H7_n2252ManCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2252ManCpo", A2252ManCpo);
         A10743ManCp2 = T007H7_A10743ManCp2[0] ;
         n10743ManCp2 = T007H7_n10743ManCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10743ManCp2", A10743ManCp2);
         A787PrvDsc = T007H7_A787PrvDsc[0] ;
         n787PrvDsc = T007H7_n787PrvDsc[0] ;
         A3299ManTel1 = T007H7_A3299ManTel1[0] ;
         n3299ManTel1 = T007H7_n3299ManTel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3299ManTel1", A3299ManTel1);
         A3300ManTel2 = T007H7_A3300ManTel2[0] ;
         n3300ManTel2 = T007H7_n3300ManTel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3300ManTel2", A3300ManTel2);
         A3301ManFax = T007H7_A3301ManFax[0] ;
         n3301ManFax = T007H7_n3301ManFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3301ManFax", A3301ManFax);
         A3302ManNif = T007H7_A3302ManNif[0] ;
         n3302ManNif = T007H7_n3302ManNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3302ManNif", A3302ManNif);
         A3409ManDto = T007H7_A3409ManDto[0] ;
         n3409ManDto = T007H7_n3409ManDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3409ManDto", GXutil.ltrimstr( A3409ManDto, 5, 2));
         A781PrvCod = T007H7_A781PrvCod[0] ;
         n781PrvCod = T007H7_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         zm7H304( -15) ;
      }
      pr_default.close(5);
      onLoadActions7H304( ) ;
   }

   public void onLoadActions7H304( )
   {
      A13847ManNomID = GXutil.trim( GXutil.str( A2248ManCod, 4, 0)) + "-" + GXutil.trim( A2249ManNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13847ManNomID", A13847ManNomID);
      /* Using cursor T007H8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      h781PrvCod = "" ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         h781PrvCod = T007H8_A13798PrvDscID[0] ;
         if (true) break;
      }
      pr_default.close(6);
      httpContext.ajax_rsp_assign_attri("", false, "h781PrvCod", h781PrvCod);
   }

   public void checkExtendedTable7H304( )
   {
      nIsDirty_304 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h781PrvCod)==0) )
      {
         nIsDirty_304 = (short)(1) ;
         A781PrvCod = (short)(0) ;
         n781PrvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
      }
      else
      {
         A13798PrvDscID = h781PrvCod ;
         /* Using cursor T007H9 */
         pr_default.execute(7, new Object[] {A13798PrvDscID});
         A781PrvCod = T007H9_A781PrvCod[0] ;
         n781PrvCod = T007H9_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         A781PrvCod = T007H9_A781PrvCod[0] ;
         n781PrvCod = T007H9_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         if ( ! ( (pr_default.getStatus(7) == 101) ) )
         {
            pr_default.readNext(7);
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion-Codigo", "")}), 1, "PRVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(7);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h781PrvCod", h781PrvCod);
      nIsDirty_304 = (short)(1) ;
      A13847ManNomID = GXutil.trim( GXutil.str( A2248ManCod, 4, 0)) + "-" + GXutil.trim( A2249ManNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13847ManNomID", A13847ManNomID);
      if ( (GXutil.strcmp("", h781PrvCod)==0) )
      {
         nIsDirty_304 = (short)(1) ;
         A781PrvCod = (short)(0) ;
         n781PrvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
      }
      else
      {
         A13798PrvDscID = h781PrvCod ;
         /* Using cursor T007H10 */
         pr_default.execute(8, new Object[] {A13798PrvDscID});
         A781PrvCod = T007H10_A781PrvCod[0] ;
         n781PrvCod = T007H10_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         A781PrvCod = T007H10_A781PrvCod[0] ;
         n781PrvCod = T007H10_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         if ( ! ( (pr_default.getStatus(8) == 101) ) )
         {
            pr_default.readNext(8);
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion-Codigo", "")}), 1, "PRVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(8);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h781PrvCod", h781PrvCod);
      /* Using cursor T007H5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A787PrvDsc = T007H5_A787PrvDsc[0] ;
      n787PrvDsc = T007H5_n787PrvDsc[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors7H304( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_17( short A781PrvCod )
   {
      /* Using cursor T007H11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A787PrvDsc = T007H11_A787PrvDsc[0] ;
      n787PrvDsc = T007H11_n787PrvDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A787PrvDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey7H304( )
   {
      /* Using cursor T007H12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound304 = (short)(1) ;
      }
      else
      {
         RcdFound304 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T007H3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm7H304( 15) ;
         RcdFound304 = (short)(1) ;
         A2248ManCod = T007H3_A2248ManCod[0] ;
         n2248ManCod = T007H3_n2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2249ManNom = T007H3_A2249ManNom[0] ;
         n2249ManNom = T007H3_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         A2250ManDom = T007H3_A2250ManDom[0] ;
         n2250ManDom = T007H3_n2250ManDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2250ManDom", A2250ManDom);
         A2251ManPob = T007H3_A2251ManPob[0] ;
         n2251ManPob = T007H3_n2251ManPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2251ManPob", A2251ManPob);
         A2252ManCpo = T007H3_A2252ManCpo[0] ;
         n2252ManCpo = T007H3_n2252ManCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2252ManCpo", A2252ManCpo);
         A10743ManCp2 = T007H3_A10743ManCp2[0] ;
         n10743ManCp2 = T007H3_n10743ManCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10743ManCp2", A10743ManCp2);
         A3299ManTel1 = T007H3_A3299ManTel1[0] ;
         n3299ManTel1 = T007H3_n3299ManTel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3299ManTel1", A3299ManTel1);
         A3300ManTel2 = T007H3_A3300ManTel2[0] ;
         n3300ManTel2 = T007H3_n3300ManTel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3300ManTel2", A3300ManTel2);
         A3301ManFax = T007H3_A3301ManFax[0] ;
         n3301ManFax = T007H3_n3301ManFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3301ManFax", A3301ManFax);
         A3302ManNif = T007H3_A3302ManNif[0] ;
         n3302ManNif = T007H3_n3302ManNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3302ManNif", A3302ManNif);
         A3409ManDto = T007H3_A3409ManDto[0] ;
         n3409ManDto = T007H3_n3409ManDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3409ManDto", GXutil.ltrimstr( A3409ManDto, 5, 2));
         A396EmprCod = T007H3_A396EmprCod[0] ;
         A781PrvCod = T007H3_A781PrvCod[0] ;
         n781PrvCod = T007H3_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z2248ManCod = A2248ManCod ;
         sMode304 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load7H304( ) ;
         if ( AnyError == 1 )
         {
            RcdFound304 = (short)(0) ;
            initializeNonKey7H304( ) ;
         }
         Gx_mode = sMode304 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound304 = (short)(0) ;
         initializeNonKey7H304( ) ;
         sMode304 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode304 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey7H304( ) ;
      if ( RcdFound304 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound304 = (short)(0) ;
      /* Using cursor T007H13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T007H13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T007H13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T007H13_A2248ManCod[0] < A2248ManCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T007H13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T007H13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T007H13_A2248ManCod[0] > A2248ManCod ) ) )
         {
            A396EmprCod = T007H13_A396EmprCod[0] ;
            A2248ManCod = T007H13_A2248ManCod[0] ;
            n2248ManCod = T007H13_n2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            RcdFound304 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound304 = (short)(0) ;
      /* Using cursor T007H14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T007H14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T007H14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T007H14_A2248ManCod[0] > A2248ManCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T007H14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T007H14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T007H14_A2248ManCod[0] < A2248ManCod ) ) )
         {
            A396EmprCod = T007H14_A396EmprCod[0] ;
            A2248ManCod = T007H14_A2248ManCod[0] ;
            n2248ManCod = T007H14_n2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            RcdFound304 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey7H304( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert7H304( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound304 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2248ManCod = Z2248ManCod ;
               n2248ManCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MANCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtManCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtManCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update7H304( ) ;
               GX_FocusControl = edtManCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtManCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert7H304( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MANCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtManCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtManCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert7H304( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = Z2248ManCod ;
         n2248ManCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency7H304( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h781PrvCod)==0) )
         {
            A781PrvCod = (short)(0) ;
            n781PrvCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         }
         else
         {
            A13798PrvDscID = h781PrvCod ;
            /* Using cursor T007H15 */
            pr_default.execute(13, new Object[] {A13798PrvDscID});
            A781PrvCod = T007H15_A781PrvCod[0] ;
            n781PrvCod = T007H15_n781PrvCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
            A781PrvCod = T007H15_A781PrvCod[0] ;
            n781PrvCod = T007H15_n781PrvCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               pr_default.readNext(13);
               if ( ! ( (pr_default.getStatus(13) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion-Codigo", "")}), 1, "PRVCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrvCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(13);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h781PrvCod", h781PrvCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T007H2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMANUFA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z2249ManNom, T007H2_A2249ManNom[0]) != 0 ) || ( GXutil.strcmp(Z2250ManDom, T007H2_A2250ManDom[0]) != 0 ) || ( GXutil.strcmp(Z2251ManPob, T007H2_A2251ManPob[0]) != 0 ) || ( GXutil.strcmp(Z2252ManCpo, T007H2_A2252ManCpo[0]) != 0 ) || ( GXutil.strcmp(Z10743ManCp2, T007H2_A10743ManCp2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3299ManTel1, T007H2_A3299ManTel1[0]) != 0 ) || ( GXutil.strcmp(Z3300ManTel2, T007H2_A3300ManTel2[0]) != 0 ) || ( GXutil.strcmp(Z3301ManFax, T007H2_A3301ManFax[0]) != 0 ) || ( GXutil.strcmp(Z3302ManNif, T007H2_A3302ManNif[0]) != 0 ) || ( DecimalUtil.compareTo(Z3409ManDto, T007H2_A3409ManDto[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z781PrvCod != T007H2_A781PrvCod[0] ) )
         {
            if ( GXutil.strcmp(Z2249ManNom, T007H2_A2249ManNom[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManNom");
               GXutil.writeLogRaw("Old: ",Z2249ManNom);
               GXutil.writeLogRaw("Current: ",T007H2_A2249ManNom[0]);
            }
            if ( GXutil.strcmp(Z2250ManDom, T007H2_A2250ManDom[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManDom");
               GXutil.writeLogRaw("Old: ",Z2250ManDom);
               GXutil.writeLogRaw("Current: ",T007H2_A2250ManDom[0]);
            }
            if ( GXutil.strcmp(Z2251ManPob, T007H2_A2251ManPob[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManPob");
               GXutil.writeLogRaw("Old: ",Z2251ManPob);
               GXutil.writeLogRaw("Current: ",T007H2_A2251ManPob[0]);
            }
            if ( GXutil.strcmp(Z2252ManCpo, T007H2_A2252ManCpo[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManCpo");
               GXutil.writeLogRaw("Old: ",Z2252ManCpo);
               GXutil.writeLogRaw("Current: ",T007H2_A2252ManCpo[0]);
            }
            if ( GXutil.strcmp(Z10743ManCp2, T007H2_A10743ManCp2[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManCp2");
               GXutil.writeLogRaw("Old: ",Z10743ManCp2);
               GXutil.writeLogRaw("Current: ",T007H2_A10743ManCp2[0]);
            }
            if ( GXutil.strcmp(Z3299ManTel1, T007H2_A3299ManTel1[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManTel1");
               GXutil.writeLogRaw("Old: ",Z3299ManTel1);
               GXutil.writeLogRaw("Current: ",T007H2_A3299ManTel1[0]);
            }
            if ( GXutil.strcmp(Z3300ManTel2, T007H2_A3300ManTel2[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManTel2");
               GXutil.writeLogRaw("Old: ",Z3300ManTel2);
               GXutil.writeLogRaw("Current: ",T007H2_A3300ManTel2[0]);
            }
            if ( GXutil.strcmp(Z3301ManFax, T007H2_A3301ManFax[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManFax");
               GXutil.writeLogRaw("Old: ",Z3301ManFax);
               GXutil.writeLogRaw("Current: ",T007H2_A3301ManFax[0]);
            }
            if ( GXutil.strcmp(Z3302ManNif, T007H2_A3302ManNif[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManNif");
               GXutil.writeLogRaw("Old: ",Z3302ManNif);
               GXutil.writeLogRaw("Current: ",T007H2_A3302ManNif[0]);
            }
            if ( DecimalUtil.compareTo(Z3409ManDto, T007H2_A3409ManDto[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"ManDto");
               GXutil.writeLogRaw("Old: ",Z3409ManDto);
               GXutil.writeLogRaw("Current: ",T007H2_A3409ManDto[0]);
            }
            if ( Z781PrvCod != T007H2_A781PrvCod[0] )
            {
               GXutil.writeLogln("trabajosexternos.tmanufa:[seudo value changed for attri]"+"PrvCod");
               GXutil.writeLogRaw("Old: ",Z781PrvCod);
               GXutil.writeLogRaw("Current: ",T007H2_A781PrvCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMANUFA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert7H304( )
   {
      beforeValidate7H304( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7H304( ) ;
      }
      if ( AnyError == 0 )
      {
         zm7H304( 0) ;
         checkOptimisticConcurrency7H304( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm7H304( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert7H304( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007H16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod), Boolean.valueOf(n2249ManNom), A2249ManNom, Boolean.valueOf(n2250ManDom), A2250ManDom, Boolean.valueOf(n2251ManPob), A2251ManPob, Boolean.valueOf(n2252ManCpo), A2252ManCpo, Boolean.valueOf(n10743ManCp2), A10743ManCp2, Boolean.valueOf(n3299ManTel1), A3299ManTel1, Boolean.valueOf(n3300ManTel2), A3300ManTel2, Boolean.valueOf(n3301ManFax), A3301ManFax, Boolean.valueOf(n3302ManNif), A3302ManNif, Boolean.valueOf(n3409ManDto), A3409ManDto, A396EmprCod, Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMANUFA");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption7H0( ) ;
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
            load7H304( ) ;
         }
         endLevel7H304( ) ;
      }
      closeExtendedTableCursors7H304( ) ;
   }

   public void update7H304( )
   {
      beforeValidate7H304( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7H304( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency7H304( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm7H304( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate7H304( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007H17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n2249ManNom), A2249ManNom, Boolean.valueOf(n2250ManDom), A2250ManDom, Boolean.valueOf(n2251ManPob), A2251ManPob, Boolean.valueOf(n2252ManCpo), A2252ManCpo, Boolean.valueOf(n10743ManCp2), A10743ManCp2, Boolean.valueOf(n3299ManTel1), A3299ManTel1, Boolean.valueOf(n3300ManTel2), A3300ManTel2, Boolean.valueOf(n3301ManFax), A3301ManFax, Boolean.valueOf(n3302ManNif), A3302ManNif, Boolean.valueOf(n3409ManDto), A3409ManDto, Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod), A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMANUFA");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMANUFA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate7H304( ) ;
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
         endLevel7H304( ) ;
      }
      closeExtendedTableCursors7H304( ) ;
   }

   public void deferredUpdate7H304( )
   {
   }

   public void delete( )
   {
      beforeValidate7H304( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency7H304( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls7H304( ) ;
         afterConfirm7H304( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete7H304( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T007H18 */
               pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMANUFA");
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
      sMode304 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel7H304( ) ;
      Gx_mode = sMode304 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls7H304( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13847ManNomID = GXutil.trim( GXutil.str( A2248ManCod, 4, 0)) + "-" + GXutil.trim( A2249ManNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13847ManNomID", A13847ManNomID);
         /* Using cursor T007H19 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
         A787PrvDsc = T007H19_A787PrvDsc[0] ;
         n787PrvDsc = T007H19_n787PrvDsc[0] ;
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T007H20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIMTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T007H21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T007H22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T007H23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T007H24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T007H25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T007H26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T007H27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T007H28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T007H29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T007H30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T007H31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T007H32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T007H33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T007H34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T007H35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T007H36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T007H37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T007H38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T007H39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T007H40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T007H41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T007H42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T007H43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T007H44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T007H45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T007H46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T007H47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T007H48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T007H49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T007H50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T007H51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T007H52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T007H53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T007H54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T007H55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T007H56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T007H57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T007H58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T007H59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T007H60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T007H61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T007H62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T007H63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T007H64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T007H65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T007H66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T007H67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T007H68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T007H69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T007H70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T007H71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T007H72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T007H73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T007H74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T007H75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T007H76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T007H77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T007H78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T007H79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T007H80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T007H81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T007H82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T007H83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T007H84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T007H85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T007H86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T007H87 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T007H88 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T007H89 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T007H90 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T007H91 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T007H92 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T007H93 */
         pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T007H94 */
         pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T007H95 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T007H96 */
         pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T007H97 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T007H98 */
         pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor T007H99 */
         pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor T007H100 */
         pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor T007H101 */
         pr_default.execute(99, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor T007H102 */
         pr_default.execute(100, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor T007H103 */
         pr_default.execute(101, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor T007H104 */
         pr_default.execute(102, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor T007H105 */
         pr_default.execute(103, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
         /* Using cursor T007H106 */
         pr_default.execute(104, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(104) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(104);
         /* Using cursor T007H107 */
         pr_default.execute(105, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(105) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(105);
         /* Using cursor T007H108 */
         pr_default.execute(106, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor T007H109 */
         pr_default.execute(107, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
         /* Using cursor T007H110 */
         pr_default.execute(108, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(108) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(108);
         /* Using cursor T007H111 */
         pr_default.execute(109, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(109) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(109);
         /* Using cursor T007H112 */
         pr_default.execute(110, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(110) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(110);
         /* Using cursor T007H113 */
         pr_default.execute(111, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(111) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(111);
         /* Using cursor T007H114 */
         pr_default.execute(112, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(112) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(112);
         /* Using cursor T007H115 */
         pr_default.execute(113, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(113) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(113);
         /* Using cursor T007H116 */
         pr_default.execute(114, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(114) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(114);
         /* Using cursor T007H117 */
         pr_default.execute(115, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(115) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(115);
         /* Using cursor T007H118 */
         pr_default.execute(116, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(116) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(116);
         /* Using cursor T007H119 */
         pr_default.execute(117, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(117) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(117);
         /* Using cursor T007H120 */
         pr_default.execute(118, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(118) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(118);
         /* Using cursor T007H121 */
         pr_default.execute(119, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
         /* Using cursor T007H122 */
         pr_default.execute(120, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(120) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(120);
         /* Using cursor T007H123 */
         pr_default.execute(121, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(121) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRPEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(121);
         /* Using cursor T007H124 */
         pr_default.execute(122, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(122) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEXMVP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(122);
         /* Using cursor T007H125 */
         pr_default.execute(123, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(123) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEXTPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(123);
         /* Using cursor T007H126 */
         pr_default.execute(124, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(124) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(124);
         /* Using cursor T007H127 */
         pr_default.execute(125, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         if ( (pr_default.getStatus(125) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(125);
      }
   }

   public void endLevel7H304( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete7H304( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.tmanufa");
         if ( AnyError == 0 )
         {
            confirmValues7H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trabajosexternos.tmanufa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart7H304( )
   {
      /* Scan By routine */
      /* Using cursor T007H128 */
      pr_default.execute(126);
      RcdFound304 = (short)(0) ;
      if ( (pr_default.getStatus(126) != 101) )
      {
         RcdFound304 = (short)(1) ;
         A396EmprCod = T007H128_A396EmprCod[0] ;
         A2248ManCod = T007H128_A2248ManCod[0] ;
         n2248ManCod = T007H128_n2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext7H304( )
   {
      /* Scan next routine */
      pr_default.readNext(126);
      RcdFound304 = (short)(0) ;
      if ( (pr_default.getStatus(126) != 101) )
      {
         RcdFound304 = (short)(1) ;
         A396EmprCod = T007H128_A396EmprCod[0] ;
         A2248ManCod = T007H128_A2248ManCod[0] ;
         n2248ManCod = T007H128_n2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
   }

   public void scanEnd7H304( )
   {
      pr_default.close(126);
   }

   public void afterConfirm7H304( )
   {
      /* After Confirm Rules */
      if ( (0==A2248ManCod) && (0==AV39autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert7H304( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A2248ManCod) && ( AV39autonumber == 1 ) )
      {
         GXt_int8 = A2248ManCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.trabajosexternos.tmanufa_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         tmanufa_impl.this.GXt_int8 = GXv_int9[0] ;
         A2248ManCod = GXt_int8 ;
         n2248ManCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
   }

   public void beforeUpdate7H304( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete7H304( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete7H304( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate7H304( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes7H304( )
   {
      edtManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      edtManNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManNom_Enabled), 5, 0), true);
      edtManNif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManNif_Enabled), 5, 0), true);
      edtManDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManDom_Enabled), 5, 0), true);
      edtManPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManPob_Enabled), 5, 0), true);
      edtManCpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCpo_Enabled), 5, 0), true);
      edtManCp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCp2_Enabled), 5, 0), true);
      edtPrvCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Enabled), 5, 0), true);
      edtManTel1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManTel1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManTel1_Enabled), 5, 0), true);
      edtManTel2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManTel2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManTel2_Enabled), 5, 0), true);
      edtManFax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManFax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManFax_Enabled), 5, 0), true);
      edtManDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManDto_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes7H304( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues7H0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.tmanufa", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33ManCod,4,0))}, new String[] {"Gx_mode","EmprCod","ManCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMANUFA");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV40Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\tmanufa:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2249ManNom", GXutil.rtrim( Z2249ManNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2250ManDom", GXutil.rtrim( Z2250ManDom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2251ManPob", GXutil.rtrim( Z2251ManPob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2252ManCpo", GXutil.rtrim( Z2252ManCpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10743ManCp2", GXutil.rtrim( Z10743ManCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3299ManTel1", GXutil.rtrim( Z3299ManTel1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3300ManTel2", GXutil.rtrim( Z3300ManTel2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3301ManFax", GXutil.rtrim( Z3301ManFax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3302ManNif", GXutil.rtrim( Z3302ManNif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3409ManDto", GXutil.ltrim( localUtil.ntoc( Z3409ManDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z781PrvCod", GXutil.ltrim( localUtil.ntoc( Z781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N781PrvCod", GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "MANNOMID", A13847ManNomID);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMANCOD", GXutil.ltrim( localUtil.ntoc( AV33ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMANCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33ManCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV39autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRVCOD", GXutil.ltrim( localUtil.ntoc( AV37Insert_PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPRVCOD", GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVDSC", GXutil.rtrim( A787PrvDsc));
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
      return formatLink("app.trabajosexternos.tmanufa", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33ManCod,4,0))}, new String[] {"Gx_mode","EmprCod","ManCod"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TMANUFA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Manufacturadores", "") ;
   }

   public void initializeNonKey7H304( )
   {
      h781PrvCod = "" ;
      A13847ManNomID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13847ManNomID", A13847ManNomID);
      A2249ManNom = "" ;
      n2249ManNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      A2250ManDom = "" ;
      n2250ManDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2250ManDom", A2250ManDom);
      A2251ManPob = "" ;
      n2251ManPob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2251ManPob", A2251ManPob);
      A2252ManCpo = "" ;
      n2252ManCpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2252ManCpo", A2252ManCpo);
      A10743ManCp2 = "" ;
      n10743ManCp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10743ManCp2", A10743ManCp2);
      A787PrvDsc = "" ;
      n787PrvDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", A787PrvDsc);
      A3299ManTel1 = "" ;
      n3299ManTel1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3299ManTel1", A3299ManTel1);
      A3300ManTel2 = "" ;
      n3300ManTel2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3300ManTel2", A3300ManTel2);
      A3301ManFax = "" ;
      n3301ManFax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3301ManFax", A3301ManFax);
      A3302ManNif = "" ;
      n3302ManNif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3302ManNif", A3302ManNif);
      A3409ManDto = DecimalUtil.ZERO ;
      n3409ManDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3409ManDto", GXutil.ltrimstr( A3409ManDto, 5, 2));
      Z2249ManNom = "" ;
      Z2250ManDom = "" ;
      Z2251ManPob = "" ;
      Z2252ManCpo = "" ;
      Z10743ManCp2 = "" ;
      Z3299ManTel1 = "" ;
      Z3300ManTel2 = "" ;
      Z3301ManFax = "" ;
      Z3302ManNif = "" ;
      Z3409ManDto = DecimalUtil.ZERO ;
      Z781PrvCod = (short)(0) ;
   }

   public void initAll7H304( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2248ManCod = (short)(0) ;
      n2248ManCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      initializeNonKey7H304( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211654847", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/tmanufa.js", "?20268211654847", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtManCod_Internalname = "MANCOD" ;
      edtManNom_Internalname = "MANNOM" ;
      edtManNif_Internalname = "MANNIF" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtManDom_Internalname = "MANDOM" ;
      edtManPob_Internalname = "MANPOB" ;
      edtManCpo_Internalname = "MANCPO" ;
      edtManCp2_Internalname = "MANCP2" ;
      edtPrvCod_Internalname = "PRVCOD" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtManTel1_Internalname = "MANTEL1" ;
      edtManTel2_Internalname = "MANTEL2" ;
      edtManFax_Internalname = "MANFAX" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtManDto_Internalname = "MANDTO" ;
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
      Form.setCaption( httpContext.getMessage( "Manufacturadores", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtManDto_Jsonclick = "" ;
      edtManDto_Enabled = 1 ;
      edtManFax_Jsonclick = "" ;
      edtManFax_Enabled = 1 ;
      edtManTel2_Jsonclick = "" ;
      edtManTel2_Enabled = 1 ;
      edtManTel1_Jsonclick = "" ;
      edtManTel1_Enabled = 1 ;
      edtPrvCod_Jsonclick = "" ;
      edtPrvCod_Enabled = 1 ;
      edtManCp2_Jsonclick = "" ;
      edtManCp2_Enabled = 1 ;
      edtManCpo_Jsonclick = "" ;
      edtManCpo_Enabled = 1 ;
      edtManPob_Jsonclick = "" ;
      edtManPob_Enabled = 1 ;
      edtManDom_Jsonclick = "" ;
      edtManDom_Enabled = 1 ;
      edtManNif_Jsonclick = "" ;
      edtManNif_Enabled = 1 ;
      edtManNom_Jsonclick = "" ;
      edtManNom_Enabled = 1 ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Enabled = 1 ;
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

   public void gxsgaprvcod7H0( String A13798PrvDscID )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaprvcod_data7H0( A13798PrvDscID) ;
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

   protected void gxsgaprvcod_data7H0( String A13798PrvDscID )
   {
      l13798PrvDscID = GXutil.concat( GXutil.rtrim( A13798PrvDscID), "%", "") ;
      /* Using cursor T007H129 */
      pr_default.execute(127, new Object[] {l13798PrvDscID});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(127) != 101) )
      {
         if ( GXutil.like( GXutil.upper( T007H129_A13798PrvDscID[0]) , GXutil.padr( "%" + GXutil.upper( A13798PrvDscID) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(T007H129_A13798PrvDscID[0]);
            gxdynajaxctrldescr.add(T007H129_A13798PrvDscID[0]);
         }
         pr_default.readNext(127);
      }
      pr_default.close(127);
   }

   public void gxhcaprvcod7H304( String A13798PrvDscID )
   {
      /* Using cursor T007H130 */
      pr_default.execute(128, new Object[] {A13798PrvDscID});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(128) != 101) )
      {
         if ( GXutil.strcmp(T007H130_A13798PrvDscID[0], A13798PrvDscID) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13798PrvDscID = T007H130_A13798PrvDscID[0] ;
            A781PrvCod = T007H130_A781PrvCod[0] ;
            n781PrvCod = T007H130_n781PrvCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         }
         pr_default.readNext(128);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(128);
   }

   public void gx5asamancod7H304( short AV33ManCod )
   {
      if ( ! (0==AV33ManCod) )
      {
         A2248ManCod = AV33ManCod ;
         n2248ManCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asamancod7H304( short A2248ManCod ,
                                  short AV39autonumber ,
                                  String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A2248ManCod) && ( AV39autonumber == 1 ) )
      {
         GXt_int8 = A2248ManCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.trabajosexternos.tmanufa_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         tmanufa_impl.this.GXt_int8 = GXv_int9[0] ;
         A2248ManCod = GXt_int8 ;
         n2248ManCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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

   public void valid_Prvcod( )
   {
      n781PrvCod = false ;
      n787PrvDsc = false ;
      if ( (GXutil.strcmp("", h781PrvCod)==0) )
      {
         A781PrvCod = (short)(0) ;
         n781PrvCod = false ;
      }
      else
      {
         A13798PrvDscID = h781PrvCod ;
         /* Using cursor T007H131 */
         pr_default.execute(129, new Object[] {A13798PrvDscID});
         A781PrvCod = T007H131_A781PrvCod[0] ;
         n781PrvCod = T007H131_n781PrvCod[0] ;
         A781PrvCod = T007H131_A781PrvCod[0] ;
         n781PrvCod = T007H131_n781PrvCod[0] ;
         if ( ! ( (pr_default.getStatus(129) == 101) ) )
         {
            pr_default.readNext(129);
            if ( ! ( (pr_default.getStatus(129) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Descripcion-Codigo", "")}), 1, "PRVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(129);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h781PrvCod", h781PrvCod);
      /* Using cursor T007H132 */
      pr_default.execute(130, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(130) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
      }
      A787PrvDsc = T007H132_A787PrvDsc[0] ;
      n787PrvDsc = T007H132_n787PrvDsc[0] ;
      pr_default.close(130);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", GXutil.rtrim( A787PrvDsc));
      httpContext.ajax_rsp_assign_attri("", false, "h781PrvCod", h781PrvCod);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33ManCod',fld:'vMANCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33ManCod',fld:'vMANCOD',pic:'ZZZ9',hsh:true},{av:'AV40Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e127H2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[]");
      setEventMetadata("VALID_MANCOD",",oparms:[]}");
      setEventMetadata("VALID_MANNOM","{handler:'valid_Mannom',iparms:[]");
      setEventMetadata("VALID_MANNOM",",oparms:[]}");
      setEventMetadata("VALID_PRVCOD","{handler:'valid_Prvcod',iparms:[{av:'h781PrvCod'},{av:'A781PrvCod',fld:'PRVCOD',pic:'ZZ9'},{av:'A787PrvDsc',fld:'PRVDSC',pic:'@!'}]");
      setEventMetadata("VALID_PRVCOD",",oparms:[{av:'A781PrvCod',fld:'PRVCOD',pic:'ZZ9'},{av:'A787PrvDsc',fld:'PRVDSC',pic:'@!'},{av:'h781PrvCod'}]}");
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
      pr_default.close(130);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      Z396EmprCod = "" ;
      Z2249ManNom = "" ;
      Z2250ManDom = "" ;
      Z2251ManPob = "" ;
      Z2252ManCpo = "" ;
      Z10743ManCp2 = "" ;
      Z3299ManTel1 = "" ;
      Z3300ManTel2 = "" ;
      Z3301ManFax = "" ;
      Z3302ManNif = "" ;
      Z3409ManDto = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13798PrvDscID = "" ;
      h781PrvCod = "" ;
      A396EmprCod = "" ;
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
      A2249ManNom = "" ;
      A3302ManNif = "" ;
      A2250ManDom = "" ;
      A2251ManPob = "" ;
      A2252ManCpo = "" ;
      A10743ManCp2 = "" ;
      A3299ManTel1 = "" ;
      A3300ManTel2 = "" ;
      A3301ManFax = "" ;
      A3409ManDto = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV40Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A13847ManNomID = "" ;
      A407EmprNom = "" ;
      A787PrvDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode304 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      AV38TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_int7 = new byte[1] ;
      Z407EmprNom = "" ;
      Z787PrvDsc = "" ;
      T007H4_A407EmprNom = new String[] {""} ;
      T007H4_n407EmprNom = new boolean[] {false} ;
      T007H6_A13798PrvDscID = new String[] {""} ;
      T007H6_A781PrvCod = new short[1] ;
      T007H6_n781PrvCod = new boolean[] {false} ;
      T007H5_A787PrvDsc = new String[] {""} ;
      T007H5_n787PrvDsc = new boolean[] {false} ;
      T007H7_A2248ManCod = new short[1] ;
      T007H7_n2248ManCod = new boolean[] {false} ;
      T007H7_A407EmprNom = new String[] {""} ;
      T007H7_n407EmprNom = new boolean[] {false} ;
      T007H7_A2249ManNom = new String[] {""} ;
      T007H7_n2249ManNom = new boolean[] {false} ;
      T007H7_A2250ManDom = new String[] {""} ;
      T007H7_n2250ManDom = new boolean[] {false} ;
      T007H7_A2251ManPob = new String[] {""} ;
      T007H7_n2251ManPob = new boolean[] {false} ;
      T007H7_A2252ManCpo = new String[] {""} ;
      T007H7_n2252ManCpo = new boolean[] {false} ;
      T007H7_A10743ManCp2 = new String[] {""} ;
      T007H7_n10743ManCp2 = new boolean[] {false} ;
      T007H7_A787PrvDsc = new String[] {""} ;
      T007H7_n787PrvDsc = new boolean[] {false} ;
      T007H7_A3299ManTel1 = new String[] {""} ;
      T007H7_n3299ManTel1 = new boolean[] {false} ;
      T007H7_A3300ManTel2 = new String[] {""} ;
      T007H7_n3300ManTel2 = new boolean[] {false} ;
      T007H7_A3301ManFax = new String[] {""} ;
      T007H7_n3301ManFax = new boolean[] {false} ;
      T007H7_A3302ManNif = new String[] {""} ;
      T007H7_n3302ManNif = new boolean[] {false} ;
      T007H7_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007H7_n3409ManDto = new boolean[] {false} ;
      T007H7_A396EmprCod = new String[] {""} ;
      T007H7_A781PrvCod = new short[1] ;
      T007H7_n781PrvCod = new boolean[] {false} ;
      T007H8_A13798PrvDscID = new String[] {""} ;
      T007H8_A781PrvCod = new short[1] ;
      T007H8_n781PrvCod = new boolean[] {false} ;
      T007H9_A13798PrvDscID = new String[] {""} ;
      T007H9_A781PrvCod = new short[1] ;
      T007H9_n781PrvCod = new boolean[] {false} ;
      T007H10_A13798PrvDscID = new String[] {""} ;
      T007H10_A781PrvCod = new short[1] ;
      T007H10_n781PrvCod = new boolean[] {false} ;
      T007H11_A787PrvDsc = new String[] {""} ;
      T007H11_n787PrvDsc = new boolean[] {false} ;
      T007H12_A396EmprCod = new String[] {""} ;
      T007H12_A2248ManCod = new short[1] ;
      T007H12_n2248ManCod = new boolean[] {false} ;
      T007H3_A2248ManCod = new short[1] ;
      T007H3_n2248ManCod = new boolean[] {false} ;
      T007H3_A2249ManNom = new String[] {""} ;
      T007H3_n2249ManNom = new boolean[] {false} ;
      T007H3_A2250ManDom = new String[] {""} ;
      T007H3_n2250ManDom = new boolean[] {false} ;
      T007H3_A2251ManPob = new String[] {""} ;
      T007H3_n2251ManPob = new boolean[] {false} ;
      T007H3_A2252ManCpo = new String[] {""} ;
      T007H3_n2252ManCpo = new boolean[] {false} ;
      T007H3_A10743ManCp2 = new String[] {""} ;
      T007H3_n10743ManCp2 = new boolean[] {false} ;
      T007H3_A3299ManTel1 = new String[] {""} ;
      T007H3_n3299ManTel1 = new boolean[] {false} ;
      T007H3_A3300ManTel2 = new String[] {""} ;
      T007H3_n3300ManTel2 = new boolean[] {false} ;
      T007H3_A3301ManFax = new String[] {""} ;
      T007H3_n3301ManFax = new boolean[] {false} ;
      T007H3_A3302ManNif = new String[] {""} ;
      T007H3_n3302ManNif = new boolean[] {false} ;
      T007H3_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007H3_n3409ManDto = new boolean[] {false} ;
      T007H3_A396EmprCod = new String[] {""} ;
      T007H3_A781PrvCod = new short[1] ;
      T007H3_n781PrvCod = new boolean[] {false} ;
      T007H13_A396EmprCod = new String[] {""} ;
      T007H13_A2248ManCod = new short[1] ;
      T007H13_n2248ManCod = new boolean[] {false} ;
      T007H14_A396EmprCod = new String[] {""} ;
      T007H14_A2248ManCod = new short[1] ;
      T007H14_n2248ManCod = new boolean[] {false} ;
      T007H15_A13798PrvDscID = new String[] {""} ;
      T007H15_A781PrvCod = new short[1] ;
      T007H15_n781PrvCod = new boolean[] {false} ;
      T007H2_A2248ManCod = new short[1] ;
      T007H2_n2248ManCod = new boolean[] {false} ;
      T007H2_A2249ManNom = new String[] {""} ;
      T007H2_n2249ManNom = new boolean[] {false} ;
      T007H2_A2250ManDom = new String[] {""} ;
      T007H2_n2250ManDom = new boolean[] {false} ;
      T007H2_A2251ManPob = new String[] {""} ;
      T007H2_n2251ManPob = new boolean[] {false} ;
      T007H2_A2252ManCpo = new String[] {""} ;
      T007H2_n2252ManCpo = new boolean[] {false} ;
      T007H2_A10743ManCp2 = new String[] {""} ;
      T007H2_n10743ManCp2 = new boolean[] {false} ;
      T007H2_A3299ManTel1 = new String[] {""} ;
      T007H2_n3299ManTel1 = new boolean[] {false} ;
      T007H2_A3300ManTel2 = new String[] {""} ;
      T007H2_n3300ManTel2 = new boolean[] {false} ;
      T007H2_A3301ManFax = new String[] {""} ;
      T007H2_n3301ManFax = new boolean[] {false} ;
      T007H2_A3302ManNif = new String[] {""} ;
      T007H2_n3302ManNif = new boolean[] {false} ;
      T007H2_A3409ManDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007H2_n3409ManDto = new boolean[] {false} ;
      T007H2_A396EmprCod = new String[] {""} ;
      T007H2_A781PrvCod = new short[1] ;
      T007H2_n781PrvCod = new boolean[] {false} ;
      T007H19_A787PrvDsc = new String[] {""} ;
      T007H19_n787PrvDsc = new boolean[] {false} ;
      T007H20_A396EmprCod = new String[] {""} ;
      T007H20_A966PartCod = new String[] {""} ;
      T007H20_A252CliCod = new int[1] ;
      T007H20_A5849UbiLin = new short[1] ;
      T007H21_A396EmprCod = new String[] {""} ;
      T007H21_A2248ManCod = new short[1] ;
      T007H21_n2248ManCod = new boolean[] {false} ;
      T007H21_A5835ManFasCod = new String[] {""} ;
      T007H22_A396EmprCod = new String[] {""} ;
      T007H22_A3415ParManNum = new int[1] ;
      T007H23_A396EmprCod = new String[] {""} ;
      T007H23_A3331LanBroCod = new byte[1] ;
      T007H23_A3333LanBroLin = new short[1] ;
      T007H24_A396EmprCod = new String[] {""} ;
      T007H24_A2248ManCod = new short[1] ;
      T007H24_n2248ManCod = new boolean[] {false} ;
      T007H24_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T007H25_A396EmprCod = new String[] {""} ;
      T007H25_A2248ManCod = new short[1] ;
      T007H25_n2248ManCod = new boolean[] {false} ;
      T007H25_A2689ExHdrFas = new String[] {""} ;
      T007H26_A396EmprCod = new String[] {""} ;
      T007H26_A2420OpeAntCod = new int[1] ;
      T007H27_A396EmprCod = new String[] {""} ;
      T007H27_A2420OpeAntCod = new int[1] ;
      T007H28_A396EmprCod = new String[] {""} ;
      T007H28_A2420OpeAntCod = new int[1] ;
      T007H29_A396EmprCod = new String[] {""} ;
      T007H29_A2420OpeAntCod = new int[1] ;
      T007H30_A396EmprCod = new String[] {""} ;
      T007H30_A2420OpeAntCod = new int[1] ;
      T007H31_A396EmprCod = new String[] {""} ;
      T007H31_A2420OpeAntCod = new int[1] ;
      T007H32_A396EmprCod = new String[] {""} ;
      T007H32_A2420OpeAntCod = new int[1] ;
      T007H33_A396EmprCod = new String[] {""} ;
      T007H33_A2420OpeAntCod = new int[1] ;
      T007H34_A396EmprCod = new String[] {""} ;
      T007H34_A2420OpeAntCod = new int[1] ;
      T007H35_A396EmprCod = new String[] {""} ;
      T007H35_A2420OpeAntCod = new int[1] ;
      T007H36_A396EmprCod = new String[] {""} ;
      T007H36_A2420OpeAntCod = new int[1] ;
      T007H37_A396EmprCod = new String[] {""} ;
      T007H37_A2420OpeAntCod = new int[1] ;
      T007H38_A396EmprCod = new String[] {""} ;
      T007H38_A2420OpeAntCod = new int[1] ;
      T007H39_A396EmprCod = new String[] {""} ;
      T007H39_A2420OpeAntCod = new int[1] ;
      T007H40_A396EmprCod = new String[] {""} ;
      T007H40_A2420OpeAntCod = new int[1] ;
      T007H41_A396EmprCod = new String[] {""} ;
      T007H41_A2420OpeAntCod = new int[1] ;
      T007H42_A396EmprCod = new String[] {""} ;
      T007H42_A2420OpeAntCod = new int[1] ;
      T007H43_A396EmprCod = new String[] {""} ;
      T007H43_A2420OpeAntCod = new int[1] ;
      T007H44_A396EmprCod = new String[] {""} ;
      T007H44_A2420OpeAntCod = new int[1] ;
      T007H45_A396EmprCod = new String[] {""} ;
      T007H45_A2420OpeAntCod = new int[1] ;
      T007H46_A396EmprCod = new String[] {""} ;
      T007H46_A2420OpeAntCod = new int[1] ;
      T007H47_A396EmprCod = new String[] {""} ;
      T007H47_A2420OpeAntCod = new int[1] ;
      T007H48_A396EmprCod = new String[] {""} ;
      T007H48_A2420OpeAntCod = new int[1] ;
      T007H49_A396EmprCod = new String[] {""} ;
      T007H49_A2420OpeAntCod = new int[1] ;
      T007H50_A396EmprCod = new String[] {""} ;
      T007H50_A2420OpeAntCod = new int[1] ;
      T007H51_A396EmprCod = new String[] {""} ;
      T007H51_A2420OpeAntCod = new int[1] ;
      T007H52_A396EmprCod = new String[] {""} ;
      T007H52_A2420OpeAntCod = new int[1] ;
      T007H53_A396EmprCod = new String[] {""} ;
      T007H53_A2420OpeAntCod = new int[1] ;
      T007H54_A396EmprCod = new String[] {""} ;
      T007H54_A2420OpeAntCod = new int[1] ;
      T007H55_A396EmprCod = new String[] {""} ;
      T007H55_A2420OpeAntCod = new int[1] ;
      T007H56_A396EmprCod = new String[] {""} ;
      T007H56_A2420OpeAntCod = new int[1] ;
      T007H57_A396EmprCod = new String[] {""} ;
      T007H57_A2420OpeAntCod = new int[1] ;
      T007H58_A396EmprCod = new String[] {""} ;
      T007H58_A2420OpeAntCod = new int[1] ;
      T007H59_A396EmprCod = new String[] {""} ;
      T007H59_A2420OpeAntCod = new int[1] ;
      T007H60_A396EmprCod = new String[] {""} ;
      T007H60_A2420OpeAntCod = new int[1] ;
      T007H61_A396EmprCod = new String[] {""} ;
      T007H61_A2420OpeAntCod = new int[1] ;
      T007H62_A396EmprCod = new String[] {""} ;
      T007H62_A2420OpeAntCod = new int[1] ;
      T007H63_A396EmprCod = new String[] {""} ;
      T007H63_A2420OpeAntCod = new int[1] ;
      T007H64_A396EmprCod = new String[] {""} ;
      T007H64_A2420OpeAntCod = new int[1] ;
      T007H65_A396EmprCod = new String[] {""} ;
      T007H65_A2420OpeAntCod = new int[1] ;
      T007H66_A396EmprCod = new String[] {""} ;
      T007H66_A2420OpeAntCod = new int[1] ;
      T007H67_A396EmprCod = new String[] {""} ;
      T007H67_A2420OpeAntCod = new int[1] ;
      T007H68_A396EmprCod = new String[] {""} ;
      T007H68_A2420OpeAntCod = new int[1] ;
      T007H69_A396EmprCod = new String[] {""} ;
      T007H69_A2420OpeAntCod = new int[1] ;
      T007H70_A396EmprCod = new String[] {""} ;
      T007H70_A2420OpeAntCod = new int[1] ;
      T007H71_A396EmprCod = new String[] {""} ;
      T007H71_A2420OpeAntCod = new int[1] ;
      T007H72_A396EmprCod = new String[] {""} ;
      T007H72_A2420OpeAntCod = new int[1] ;
      T007H73_A396EmprCod = new String[] {""} ;
      T007H73_A2420OpeAntCod = new int[1] ;
      T007H74_A396EmprCod = new String[] {""} ;
      T007H74_A2420OpeAntCod = new int[1] ;
      T007H75_A396EmprCod = new String[] {""} ;
      T007H75_A2420OpeAntCod = new int[1] ;
      T007H76_A396EmprCod = new String[] {""} ;
      T007H76_A2420OpeAntCod = new int[1] ;
      T007H77_A396EmprCod = new String[] {""} ;
      T007H77_A2420OpeAntCod = new int[1] ;
      T007H78_A396EmprCod = new String[] {""} ;
      T007H78_A2420OpeAntCod = new int[1] ;
      T007H79_A396EmprCod = new String[] {""} ;
      T007H79_A2420OpeAntCod = new int[1] ;
      T007H80_A396EmprCod = new String[] {""} ;
      T007H80_A2420OpeAntCod = new int[1] ;
      T007H81_A396EmprCod = new String[] {""} ;
      T007H81_A2420OpeAntCod = new int[1] ;
      T007H82_A396EmprCod = new String[] {""} ;
      T007H82_A2420OpeAntCod = new int[1] ;
      T007H83_A396EmprCod = new String[] {""} ;
      T007H83_A2420OpeAntCod = new int[1] ;
      T007H84_A396EmprCod = new String[] {""} ;
      T007H84_A2420OpeAntCod = new int[1] ;
      T007H85_A396EmprCod = new String[] {""} ;
      T007H85_A2420OpeAntCod = new int[1] ;
      T007H86_A396EmprCod = new String[] {""} ;
      T007H86_A2420OpeAntCod = new int[1] ;
      T007H87_A396EmprCod = new String[] {""} ;
      T007H87_A2420OpeAntCod = new int[1] ;
      T007H88_A396EmprCod = new String[] {""} ;
      T007H88_A2420OpeAntCod = new int[1] ;
      T007H89_A396EmprCod = new String[] {""} ;
      T007H89_A2420OpeAntCod = new int[1] ;
      T007H90_A396EmprCod = new String[] {""} ;
      T007H90_A2420OpeAntCod = new int[1] ;
      T007H91_A396EmprCod = new String[] {""} ;
      T007H91_A2420OpeAntCod = new int[1] ;
      T007H92_A396EmprCod = new String[] {""} ;
      T007H92_A2420OpeAntCod = new int[1] ;
      T007H93_A396EmprCod = new String[] {""} ;
      T007H93_A2420OpeAntCod = new int[1] ;
      T007H94_A396EmprCod = new String[] {""} ;
      T007H94_A2420OpeAntCod = new int[1] ;
      T007H95_A396EmprCod = new String[] {""} ;
      T007H95_A2420OpeAntCod = new int[1] ;
      T007H96_A396EmprCod = new String[] {""} ;
      T007H96_A2420OpeAntCod = new int[1] ;
      T007H97_A396EmprCod = new String[] {""} ;
      T007H97_A2420OpeAntCod = new int[1] ;
      T007H98_A396EmprCod = new String[] {""} ;
      T007H98_A2420OpeAntCod = new int[1] ;
      T007H99_A396EmprCod = new String[] {""} ;
      T007H99_A2420OpeAntCod = new int[1] ;
      T007H100_A396EmprCod = new String[] {""} ;
      T007H100_A2420OpeAntCod = new int[1] ;
      T007H101_A396EmprCod = new String[] {""} ;
      T007H101_A2420OpeAntCod = new int[1] ;
      T007H102_A396EmprCod = new String[] {""} ;
      T007H102_A2420OpeAntCod = new int[1] ;
      T007H103_A396EmprCod = new String[] {""} ;
      T007H103_A2420OpeAntCod = new int[1] ;
      T007H104_A396EmprCod = new String[] {""} ;
      T007H104_A2420OpeAntCod = new int[1] ;
      T007H105_A396EmprCod = new String[] {""} ;
      T007H105_A2420OpeAntCod = new int[1] ;
      T007H106_A396EmprCod = new String[] {""} ;
      T007H106_A2420OpeAntCod = new int[1] ;
      T007H107_A396EmprCod = new String[] {""} ;
      T007H107_A2420OpeAntCod = new int[1] ;
      T007H108_A396EmprCod = new String[] {""} ;
      T007H108_A2420OpeAntCod = new int[1] ;
      T007H109_A396EmprCod = new String[] {""} ;
      T007H109_A2420OpeAntCod = new int[1] ;
      T007H110_A396EmprCod = new String[] {""} ;
      T007H110_A2420OpeAntCod = new int[1] ;
      T007H111_A396EmprCod = new String[] {""} ;
      T007H111_A2420OpeAntCod = new int[1] ;
      T007H112_A396EmprCod = new String[] {""} ;
      T007H112_A2420OpeAntCod = new int[1] ;
      T007H113_A396EmprCod = new String[] {""} ;
      T007H113_A2420OpeAntCod = new int[1] ;
      T007H114_A396EmprCod = new String[] {""} ;
      T007H114_A2420OpeAntCod = new int[1] ;
      T007H115_A396EmprCod = new String[] {""} ;
      T007H115_A2420OpeAntCod = new int[1] ;
      T007H116_A396EmprCod = new String[] {""} ;
      T007H116_A2420OpeAntCod = new int[1] ;
      T007H117_A396EmprCod = new String[] {""} ;
      T007H117_A2420OpeAntCod = new int[1] ;
      T007H118_A396EmprCod = new String[] {""} ;
      T007H118_A2420OpeAntCod = new int[1] ;
      T007H119_A396EmprCod = new String[] {""} ;
      T007H119_A2420OpeAntCod = new int[1] ;
      T007H120_A396EmprCod = new String[] {""} ;
      T007H120_A2420OpeAntCod = new int[1] ;
      T007H121_A396EmprCod = new String[] {""} ;
      T007H121_A2420OpeAntCod = new int[1] ;
      T007H122_A396EmprCod = new String[] {""} ;
      T007H122_A2406ExhAlbCod = new int[1] ;
      T007H123_A396EmprCod = new String[] {""} ;
      T007H123_A2248ManCod = new short[1] ;
      T007H123_n2248ManCod = new boolean[] {false} ;
      T007H123_A2364RpExPdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T007H124_A396EmprCod = new String[] {""} ;
      T007H124_A2248ManCod = new short[1] ;
      T007H124_n2248ManCod = new boolean[] {false} ;
      T007H124_A2358ExMvpFas = new String[] {""} ;
      T007H125_A396EmprCod = new String[] {""} ;
      T007H125_A2333ExtPdoAlb = new int[1] ;
      T007H126_A396EmprCod = new String[] {""} ;
      T007H126_A2253SalExtAlb = new int[1] ;
      T007H127_A396EmprCod = new String[] {""} ;
      T007H127_A30AlbProCod = new long[1] ;
      T007H127_A129BarCod = new int[1] ;
      T007H127_A132BarCodReo = new byte[1] ;
      T007H127_A130BarCodPar = new String[] {""} ;
      T007H128_A396EmprCod = new String[] {""} ;
      T007H128_A2248ManCod = new short[1] ;
      T007H128_n2248ManCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13798PrvDscID = "" ;
      T007H129_A781PrvCod = new short[1] ;
      T007H129_n781PrvCod = new boolean[] {false} ;
      T007H129_A13798PrvDscID = new String[] {""} ;
      T007H130_A13798PrvDscID = new String[] {""} ;
      T007H130_A781PrvCod = new short[1] ;
      T007H130_n781PrvCod = new boolean[] {false} ;
      GXv_int9 = new short[1] ;
      T007H131_A13798PrvDscID = new String[] {""} ;
      T007H131_A781PrvCod = new short[1] ;
      T007H131_n781PrvCod = new boolean[] {false} ;
      T007H132_A787PrvDsc = new String[] {""} ;
      T007H132_n787PrvDsc = new boolean[] {false} ;
      Zh781PrvCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.tmanufa__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.tmanufa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.tmanufa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.tmanufa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.tmanufa__default(),
         new Object[] {
             new Object[] {
            T007H2_A2248ManCod, T007H2_A2249ManNom, T007H2_n2249ManNom, T007H2_A2250ManDom, T007H2_n2250ManDom, T007H2_A2251ManPob, T007H2_n2251ManPob, T007H2_A2252ManCpo, T007H2_n2252ManCpo, T007H2_A10743ManCp2,
            T007H2_n10743ManCp2, T007H2_A3299ManTel1, T007H2_n3299ManTel1, T007H2_A3300ManTel2, T007H2_n3300ManTel2, T007H2_A3301ManFax, T007H2_n3301ManFax, T007H2_A3302ManNif, T007H2_n3302ManNif, T007H2_A3409ManDto,
            T007H2_n3409ManDto, T007H2_A396EmprCod, T007H2_A781PrvCod, T007H2_n781PrvCod
            }
            , new Object[] {
            T007H3_A2248ManCod, T007H3_A2249ManNom, T007H3_n2249ManNom, T007H3_A2250ManDom, T007H3_n2250ManDom, T007H3_A2251ManPob, T007H3_n2251ManPob, T007H3_A2252ManCpo, T007H3_n2252ManCpo, T007H3_A10743ManCp2,
            T007H3_n10743ManCp2, T007H3_A3299ManTel1, T007H3_n3299ManTel1, T007H3_A3300ManTel2, T007H3_n3300ManTel2, T007H3_A3301ManFax, T007H3_n3301ManFax, T007H3_A3302ManNif, T007H3_n3302ManNif, T007H3_A3409ManDto,
            T007H3_n3409ManDto, T007H3_A396EmprCod, T007H3_A781PrvCod, T007H3_n781PrvCod
            }
            , new Object[] {
            T007H4_A407EmprNom, T007H4_n407EmprNom
            }
            , new Object[] {
            T007H5_A787PrvDsc, T007H5_n787PrvDsc
            }
            , new Object[] {
            T007H6_A13798PrvDscID, T007H6_A781PrvCod
            }
            , new Object[] {
            T007H7_A2248ManCod, T007H7_A407EmprNom, T007H7_n407EmprNom, T007H7_A2249ManNom, T007H7_n2249ManNom, T007H7_A2250ManDom, T007H7_n2250ManDom, T007H7_A2251ManPob, T007H7_n2251ManPob, T007H7_A2252ManCpo,
            T007H7_n2252ManCpo, T007H7_A10743ManCp2, T007H7_n10743ManCp2, T007H7_A787PrvDsc, T007H7_n787PrvDsc, T007H7_A3299ManTel1, T007H7_n3299ManTel1, T007H7_A3300ManTel2, T007H7_n3300ManTel2, T007H7_A3301ManFax,
            T007H7_n3301ManFax, T007H7_A3302ManNif, T007H7_n3302ManNif, T007H7_A3409ManDto, T007H7_n3409ManDto, T007H7_A396EmprCod, T007H7_A781PrvCod, T007H7_n781PrvCod
            }
            , new Object[] {
            T007H8_A13798PrvDscID, T007H8_A781PrvCod
            }
            , new Object[] {
            T007H9_A13798PrvDscID, T007H9_A781PrvCod
            }
            , new Object[] {
            T007H10_A13798PrvDscID, T007H10_A781PrvCod
            }
            , new Object[] {
            T007H11_A787PrvDsc, T007H11_n787PrvDsc
            }
            , new Object[] {
            T007H12_A396EmprCod, T007H12_A2248ManCod
            }
            , new Object[] {
            T007H13_A396EmprCod, T007H13_A2248ManCod
            }
            , new Object[] {
            T007H14_A396EmprCod, T007H14_A2248ManCod
            }
            , new Object[] {
            T007H15_A13798PrvDscID, T007H15_A781PrvCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T007H19_A787PrvDsc, T007H19_n787PrvDsc
            }
            , new Object[] {
            T007H20_A396EmprCod, T007H20_A966PartCod, T007H20_A252CliCod, T007H20_A5849UbiLin
            }
            , new Object[] {
            T007H21_A396EmprCod, T007H21_A2248ManCod, T007H21_A5835ManFasCod
            }
            , new Object[] {
            T007H22_A396EmprCod, T007H22_A3415ParManNum
            }
            , new Object[] {
            T007H23_A396EmprCod, T007H23_A3331LanBroCod, T007H23_A3333LanBroLin
            }
            , new Object[] {
            T007H24_A396EmprCod, T007H24_A2248ManCod, T007H24_A2711RpExHdFe
            }
            , new Object[] {
            T007H25_A396EmprCod, T007H25_A2248ManCod, T007H25_A2689ExHdrFas
            }
            , new Object[] {
            T007H26_A396EmprCod, T007H26_A2420OpeAntCod
            }
            , new Object[] {
            T007H27_A396EmprCod, T007H27_A2420OpeAntCod
            }
            , new Object[] {
            T007H28_A396EmprCod, T007H28_A2420OpeAntCod
            }
            , new Object[] {
            T007H29_A396EmprCod, T007H29_A2420OpeAntCod
            }
            , new Object[] {
            T007H30_A396EmprCod, T007H30_A2420OpeAntCod
            }
            , new Object[] {
            T007H31_A396EmprCod, T007H31_A2420OpeAntCod
            }
            , new Object[] {
            T007H32_A396EmprCod, T007H32_A2420OpeAntCod
            }
            , new Object[] {
            T007H33_A396EmprCod, T007H33_A2420OpeAntCod
            }
            , new Object[] {
            T007H34_A396EmprCod, T007H34_A2420OpeAntCod
            }
            , new Object[] {
            T007H35_A396EmprCod, T007H35_A2420OpeAntCod
            }
            , new Object[] {
            T007H36_A396EmprCod, T007H36_A2420OpeAntCod
            }
            , new Object[] {
            T007H37_A396EmprCod, T007H37_A2420OpeAntCod
            }
            , new Object[] {
            T007H38_A396EmprCod, T007H38_A2420OpeAntCod
            }
            , new Object[] {
            T007H39_A396EmprCod, T007H39_A2420OpeAntCod
            }
            , new Object[] {
            T007H40_A396EmprCod, T007H40_A2420OpeAntCod
            }
            , new Object[] {
            T007H41_A396EmprCod, T007H41_A2420OpeAntCod
            }
            , new Object[] {
            T007H42_A396EmprCod, T007H42_A2420OpeAntCod
            }
            , new Object[] {
            T007H43_A396EmprCod, T007H43_A2420OpeAntCod
            }
            , new Object[] {
            T007H44_A396EmprCod, T007H44_A2420OpeAntCod
            }
            , new Object[] {
            T007H45_A396EmprCod, T007H45_A2420OpeAntCod
            }
            , new Object[] {
            T007H46_A396EmprCod, T007H46_A2420OpeAntCod
            }
            , new Object[] {
            T007H47_A396EmprCod, T007H47_A2420OpeAntCod
            }
            , new Object[] {
            T007H48_A396EmprCod, T007H48_A2420OpeAntCod
            }
            , new Object[] {
            T007H49_A396EmprCod, T007H49_A2420OpeAntCod
            }
            , new Object[] {
            T007H50_A396EmprCod, T007H50_A2420OpeAntCod
            }
            , new Object[] {
            T007H51_A396EmprCod, T007H51_A2420OpeAntCod
            }
            , new Object[] {
            T007H52_A396EmprCod, T007H52_A2420OpeAntCod
            }
            , new Object[] {
            T007H53_A396EmprCod, T007H53_A2420OpeAntCod
            }
            , new Object[] {
            T007H54_A396EmprCod, T007H54_A2420OpeAntCod
            }
            , new Object[] {
            T007H55_A396EmprCod, T007H55_A2420OpeAntCod
            }
            , new Object[] {
            T007H56_A396EmprCod, T007H56_A2420OpeAntCod
            }
            , new Object[] {
            T007H57_A396EmprCod, T007H57_A2420OpeAntCod
            }
            , new Object[] {
            T007H58_A396EmprCod, T007H58_A2420OpeAntCod
            }
            , new Object[] {
            T007H59_A396EmprCod, T007H59_A2420OpeAntCod
            }
            , new Object[] {
            T007H60_A396EmprCod, T007H60_A2420OpeAntCod
            }
            , new Object[] {
            T007H61_A396EmprCod, T007H61_A2420OpeAntCod
            }
            , new Object[] {
            T007H62_A396EmprCod, T007H62_A2420OpeAntCod
            }
            , new Object[] {
            T007H63_A396EmprCod, T007H63_A2420OpeAntCod
            }
            , new Object[] {
            T007H64_A396EmprCod, T007H64_A2420OpeAntCod
            }
            , new Object[] {
            T007H65_A396EmprCod, T007H65_A2420OpeAntCod
            }
            , new Object[] {
            T007H66_A396EmprCod, T007H66_A2420OpeAntCod
            }
            , new Object[] {
            T007H67_A396EmprCod, T007H67_A2420OpeAntCod
            }
            , new Object[] {
            T007H68_A396EmprCod, T007H68_A2420OpeAntCod
            }
            , new Object[] {
            T007H69_A396EmprCod, T007H69_A2420OpeAntCod
            }
            , new Object[] {
            T007H70_A396EmprCod, T007H70_A2420OpeAntCod
            }
            , new Object[] {
            T007H71_A396EmprCod, T007H71_A2420OpeAntCod
            }
            , new Object[] {
            T007H72_A396EmprCod, T007H72_A2420OpeAntCod
            }
            , new Object[] {
            T007H73_A396EmprCod, T007H73_A2420OpeAntCod
            }
            , new Object[] {
            T007H74_A396EmprCod, T007H74_A2420OpeAntCod
            }
            , new Object[] {
            T007H75_A396EmprCod, T007H75_A2420OpeAntCod
            }
            , new Object[] {
            T007H76_A396EmprCod, T007H76_A2420OpeAntCod
            }
            , new Object[] {
            T007H77_A396EmprCod, T007H77_A2420OpeAntCod
            }
            , new Object[] {
            T007H78_A396EmprCod, T007H78_A2420OpeAntCod
            }
            , new Object[] {
            T007H79_A396EmprCod, T007H79_A2420OpeAntCod
            }
            , new Object[] {
            T007H80_A396EmprCod, T007H80_A2420OpeAntCod
            }
            , new Object[] {
            T007H81_A396EmprCod, T007H81_A2420OpeAntCod
            }
            , new Object[] {
            T007H82_A396EmprCod, T007H82_A2420OpeAntCod
            }
            , new Object[] {
            T007H83_A396EmprCod, T007H83_A2420OpeAntCod
            }
            , new Object[] {
            T007H84_A396EmprCod, T007H84_A2420OpeAntCod
            }
            , new Object[] {
            T007H85_A396EmprCod, T007H85_A2420OpeAntCod
            }
            , new Object[] {
            T007H86_A396EmprCod, T007H86_A2420OpeAntCod
            }
            , new Object[] {
            T007H87_A396EmprCod, T007H87_A2420OpeAntCod
            }
            , new Object[] {
            T007H88_A396EmprCod, T007H88_A2420OpeAntCod
            }
            , new Object[] {
            T007H89_A396EmprCod, T007H89_A2420OpeAntCod
            }
            , new Object[] {
            T007H90_A396EmprCod, T007H90_A2420OpeAntCod
            }
            , new Object[] {
            T007H91_A396EmprCod, T007H91_A2420OpeAntCod
            }
            , new Object[] {
            T007H92_A396EmprCod, T007H92_A2420OpeAntCod
            }
            , new Object[] {
            T007H93_A396EmprCod, T007H93_A2420OpeAntCod
            }
            , new Object[] {
            T007H94_A396EmprCod, T007H94_A2420OpeAntCod
            }
            , new Object[] {
            T007H95_A396EmprCod, T007H95_A2420OpeAntCod
            }
            , new Object[] {
            T007H96_A396EmprCod, T007H96_A2420OpeAntCod
            }
            , new Object[] {
            T007H97_A396EmprCod, T007H97_A2420OpeAntCod
            }
            , new Object[] {
            T007H98_A396EmprCod, T007H98_A2420OpeAntCod
            }
            , new Object[] {
            T007H99_A396EmprCod, T007H99_A2420OpeAntCod
            }
            , new Object[] {
            T007H100_A396EmprCod, T007H100_A2420OpeAntCod
            }
            , new Object[] {
            T007H101_A396EmprCod, T007H101_A2420OpeAntCod
            }
            , new Object[] {
            T007H102_A396EmprCod, T007H102_A2420OpeAntCod
            }
            , new Object[] {
            T007H103_A396EmprCod, T007H103_A2420OpeAntCod
            }
            , new Object[] {
            T007H104_A396EmprCod, T007H104_A2420OpeAntCod
            }
            , new Object[] {
            T007H105_A396EmprCod, T007H105_A2420OpeAntCod
            }
            , new Object[] {
            T007H106_A396EmprCod, T007H106_A2420OpeAntCod
            }
            , new Object[] {
            T007H107_A396EmprCod, T007H107_A2420OpeAntCod
            }
            , new Object[] {
            T007H108_A396EmprCod, T007H108_A2420OpeAntCod
            }
            , new Object[] {
            T007H109_A396EmprCod, T007H109_A2420OpeAntCod
            }
            , new Object[] {
            T007H110_A396EmprCod, T007H110_A2420OpeAntCod
            }
            , new Object[] {
            T007H111_A396EmprCod, T007H111_A2420OpeAntCod
            }
            , new Object[] {
            T007H112_A396EmprCod, T007H112_A2420OpeAntCod
            }
            , new Object[] {
            T007H113_A396EmprCod, T007H113_A2420OpeAntCod
            }
            , new Object[] {
            T007H114_A396EmprCod, T007H114_A2420OpeAntCod
            }
            , new Object[] {
            T007H115_A396EmprCod, T007H115_A2420OpeAntCod
            }
            , new Object[] {
            T007H116_A396EmprCod, T007H116_A2420OpeAntCod
            }
            , new Object[] {
            T007H117_A396EmprCod, T007H117_A2420OpeAntCod
            }
            , new Object[] {
            T007H118_A396EmprCod, T007H118_A2420OpeAntCod
            }
            , new Object[] {
            T007H119_A396EmprCod, T007H119_A2420OpeAntCod
            }
            , new Object[] {
            T007H120_A396EmprCod, T007H120_A2420OpeAntCod
            }
            , new Object[] {
            T007H121_A396EmprCod, T007H121_A2420OpeAntCod
            }
            , new Object[] {
            T007H122_A396EmprCod, T007H122_A2406ExhAlbCod
            }
            , new Object[] {
            T007H123_A396EmprCod, T007H123_A2248ManCod, T007H123_A2364RpExPdFe
            }
            , new Object[] {
            T007H124_A396EmprCod, T007H124_A2248ManCod, T007H124_A2358ExMvpFas
            }
            , new Object[] {
            T007H125_A396EmprCod, T007H125_A2333ExtPdoAlb
            }
            , new Object[] {
            T007H126_A396EmprCod, T007H126_A2253SalExtAlb
            }
            , new Object[] {
            T007H127_A396EmprCod, T007H127_A30AlbProCod, T007H127_A129BarCod, T007H127_A132BarCodReo, T007H127_A130BarCodPar
            }
            , new Object[] {
            T007H128_A396EmprCod, T007H128_A2248ManCod
            }
            , new Object[] {
            T007H129_A781PrvCod, T007H129_A13798PrvDscID
            }
            , new Object[] {
            T007H130_A13798PrvDscID, T007H130_A781PrvCod
            }
            , new Object[] {
            T007H131_A13798PrvDscID, T007H131_A781PrvCod
            }
            , new Object[] {
            T007H132_A787PrvDsc, T007H132_n787PrvDsc
            }
         }
      );
      AV40Pgmname = "TrabajosExternos.TMANUFA" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV33ManCod ;
   private short Z2248ManCod ;
   private short Z781PrvCod ;
   private short N781PrvCod ;
   private short AV33ManCod ;
   private short A2248ManCod ;
   private short AV39autonumber ;
   private short A781PrvCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV37Insert_PrvCod ;
   private short RcdFound304 ;
   private short nIsDirty_304 ;
   private short gxhchits ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private int trnEnded ;
   private int edtManCod_Enabled ;
   private int edtManNom_Enabled ;
   private int edtManNif_Enabled ;
   private int edtManDom_Enabled ;
   private int edtManPob_Enabled ;
   private int edtManCpo_Enabled ;
   private int edtManCp2_Enabled ;
   private int edtPrvCod_Enabled ;
   private int edtManTel1_Enabled ;
   private int edtManTel2_Enabled ;
   private int edtManFax_Enabled ;
   private int edtManDto_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int AV41GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private java.math.BigDecimal Z3409ManDto ;
   private java.math.BigDecimal A3409ManDto ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String Z396EmprCod ;
   private String Z2249ManNom ;
   private String Z2250ManDom ;
   private String Z2251ManPob ;
   private String Z2252ManCpo ;
   private String Z10743ManCp2 ;
   private String Z3299ManTel1 ;
   private String Z3300ManTel2 ;
   private String Z3301ManFax ;
   private String Z3302ManNif ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtManCod_Internalname ;
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
   private String edtManCod_Jsonclick ;
   private String edtManNom_Internalname ;
   private String A2249ManNom ;
   private String edtManNom_Jsonclick ;
   private String edtManNif_Internalname ;
   private String A3302ManNif ;
   private String edtManNif_Jsonclick ;
   private String edtManDom_Internalname ;
   private String A2250ManDom ;
   private String edtManDom_Jsonclick ;
   private String edtManPob_Internalname ;
   private String A2251ManPob ;
   private String edtManPob_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtManCpo_Internalname ;
   private String A2252ManCpo ;
   private String edtManCpo_Jsonclick ;
   private String edtManCp2_Internalname ;
   private String A10743ManCp2 ;
   private String edtManCp2_Jsonclick ;
   private String edtPrvCod_Internalname ;
   private String edtPrvCod_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtManTel1_Internalname ;
   private String A3299ManTel1 ;
   private String edtManTel1_Jsonclick ;
   private String edtManTel2_Internalname ;
   private String A3300ManTel2 ;
   private String edtManTel2_Jsonclick ;
   private String edtManFax_Internalname ;
   private String A3301ManFax ;
   private String edtManFax_Jsonclick ;
   private String edtManDto_Internalname ;
   private String edtManDto_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV40Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A407EmprNom ;
   private String A787PrvDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode304 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z787PrvDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String gxwrpcisep ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n2248ManCod ;
   private boolean n781PrvCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean n787PrvDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n2249ManNom ;
   private boolean n3302ManNif ;
   private boolean n2250ManDom ;
   private boolean n2251ManPob ;
   private boolean n2252ManCpo ;
   private boolean n10743ManCp2 ;
   private boolean n3299ManTel1 ;
   private boolean n3300ManTel2 ;
   private boolean n3301ManFax ;
   private boolean n3409ManDto ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13798PrvDscID ;
   private String h781PrvCod ;
   private String A13847ManNomID ;
   private String l13798PrvDscID ;
   private String Zh781PrvCod ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T007H4_A407EmprNom ;
   private boolean[] T007H4_n407EmprNom ;
   private String[] T007H6_A13798PrvDscID ;
   private short[] T007H6_A781PrvCod ;
   private boolean[] T007H6_n781PrvCod ;
   private String[] T007H5_A787PrvDsc ;
   private boolean[] T007H5_n787PrvDsc ;
   private short[] T007H7_A2248ManCod ;
   private boolean[] T007H7_n2248ManCod ;
   private String[] T007H7_A407EmprNom ;
   private boolean[] T007H7_n407EmprNom ;
   private String[] T007H7_A2249ManNom ;
   private boolean[] T007H7_n2249ManNom ;
   private String[] T007H7_A2250ManDom ;
   private boolean[] T007H7_n2250ManDom ;
   private String[] T007H7_A2251ManPob ;
   private boolean[] T007H7_n2251ManPob ;
   private String[] T007H7_A2252ManCpo ;
   private boolean[] T007H7_n2252ManCpo ;
   private String[] T007H7_A10743ManCp2 ;
   private boolean[] T007H7_n10743ManCp2 ;
   private String[] T007H7_A787PrvDsc ;
   private boolean[] T007H7_n787PrvDsc ;
   private String[] T007H7_A3299ManTel1 ;
   private boolean[] T007H7_n3299ManTel1 ;
   private String[] T007H7_A3300ManTel2 ;
   private boolean[] T007H7_n3300ManTel2 ;
   private String[] T007H7_A3301ManFax ;
   private boolean[] T007H7_n3301ManFax ;
   private String[] T007H7_A3302ManNif ;
   private boolean[] T007H7_n3302ManNif ;
   private java.math.BigDecimal[] T007H7_A3409ManDto ;
   private boolean[] T007H7_n3409ManDto ;
   private String[] T007H7_A396EmprCod ;
   private short[] T007H7_A781PrvCod ;
   private boolean[] T007H7_n781PrvCod ;
   private String[] T007H8_A13798PrvDscID ;
   private short[] T007H8_A781PrvCod ;
   private boolean[] T007H8_n781PrvCod ;
   private String[] T007H9_A13798PrvDscID ;
   private short[] T007H9_A781PrvCod ;
   private boolean[] T007H9_n781PrvCod ;
   private String[] T007H10_A13798PrvDscID ;
   private short[] T007H10_A781PrvCod ;
   private boolean[] T007H10_n781PrvCod ;
   private String[] T007H11_A787PrvDsc ;
   private boolean[] T007H11_n787PrvDsc ;
   private String[] T007H12_A396EmprCod ;
   private short[] T007H12_A2248ManCod ;
   private boolean[] T007H12_n2248ManCod ;
   private short[] T007H3_A2248ManCod ;
   private boolean[] T007H3_n2248ManCod ;
   private String[] T007H3_A2249ManNom ;
   private boolean[] T007H3_n2249ManNom ;
   private String[] T007H3_A2250ManDom ;
   private boolean[] T007H3_n2250ManDom ;
   private String[] T007H3_A2251ManPob ;
   private boolean[] T007H3_n2251ManPob ;
   private String[] T007H3_A2252ManCpo ;
   private boolean[] T007H3_n2252ManCpo ;
   private String[] T007H3_A10743ManCp2 ;
   private boolean[] T007H3_n10743ManCp2 ;
   private String[] T007H3_A3299ManTel1 ;
   private boolean[] T007H3_n3299ManTel1 ;
   private String[] T007H3_A3300ManTel2 ;
   private boolean[] T007H3_n3300ManTel2 ;
   private String[] T007H3_A3301ManFax ;
   private boolean[] T007H3_n3301ManFax ;
   private String[] T007H3_A3302ManNif ;
   private boolean[] T007H3_n3302ManNif ;
   private java.math.BigDecimal[] T007H3_A3409ManDto ;
   private boolean[] T007H3_n3409ManDto ;
   private String[] T007H3_A396EmprCod ;
   private short[] T007H3_A781PrvCod ;
   private boolean[] T007H3_n781PrvCod ;
   private String[] T007H13_A396EmprCod ;
   private short[] T007H13_A2248ManCod ;
   private boolean[] T007H13_n2248ManCod ;
   private String[] T007H14_A396EmprCod ;
   private short[] T007H14_A2248ManCod ;
   private boolean[] T007H14_n2248ManCod ;
   private String[] T007H15_A13798PrvDscID ;
   private short[] T007H15_A781PrvCod ;
   private boolean[] T007H15_n781PrvCod ;
   private short[] T007H2_A2248ManCod ;
   private boolean[] T007H2_n2248ManCod ;
   private String[] T007H2_A2249ManNom ;
   private boolean[] T007H2_n2249ManNom ;
   private String[] T007H2_A2250ManDom ;
   private boolean[] T007H2_n2250ManDom ;
   private String[] T007H2_A2251ManPob ;
   private boolean[] T007H2_n2251ManPob ;
   private String[] T007H2_A2252ManCpo ;
   private boolean[] T007H2_n2252ManCpo ;
   private String[] T007H2_A10743ManCp2 ;
   private boolean[] T007H2_n10743ManCp2 ;
   private String[] T007H2_A3299ManTel1 ;
   private boolean[] T007H2_n3299ManTel1 ;
   private String[] T007H2_A3300ManTel2 ;
   private boolean[] T007H2_n3300ManTel2 ;
   private String[] T007H2_A3301ManFax ;
   private boolean[] T007H2_n3301ManFax ;
   private String[] T007H2_A3302ManNif ;
   private boolean[] T007H2_n3302ManNif ;
   private java.math.BigDecimal[] T007H2_A3409ManDto ;
   private boolean[] T007H2_n3409ManDto ;
   private String[] T007H2_A396EmprCod ;
   private short[] T007H2_A781PrvCod ;
   private boolean[] T007H2_n781PrvCod ;
   private String[] T007H19_A787PrvDsc ;
   private boolean[] T007H19_n787PrvDsc ;
   private String[] T007H20_A396EmprCod ;
   private String[] T007H20_A966PartCod ;
   private int[] T007H20_A252CliCod ;
   private short[] T007H20_A5849UbiLin ;
   private String[] T007H21_A396EmprCod ;
   private short[] T007H21_A2248ManCod ;
   private boolean[] T007H21_n2248ManCod ;
   private String[] T007H21_A5835ManFasCod ;
   private String[] T007H22_A396EmprCod ;
   private int[] T007H22_A3415ParManNum ;
   private String[] T007H23_A396EmprCod ;
   private byte[] T007H23_A3331LanBroCod ;
   private short[] T007H23_A3333LanBroLin ;
   private String[] T007H24_A396EmprCod ;
   private short[] T007H24_A2248ManCod ;
   private boolean[] T007H24_n2248ManCod ;
   private java.util.Date[] T007H24_A2711RpExHdFe ;
   private String[] T007H25_A396EmprCod ;
   private short[] T007H25_A2248ManCod ;
   private boolean[] T007H25_n2248ManCod ;
   private String[] T007H25_A2689ExHdrFas ;
   private String[] T007H26_A396EmprCod ;
   private int[] T007H26_A2420OpeAntCod ;
   private String[] T007H27_A396EmprCod ;
   private int[] T007H27_A2420OpeAntCod ;
   private String[] T007H28_A396EmprCod ;
   private int[] T007H28_A2420OpeAntCod ;
   private String[] T007H29_A396EmprCod ;
   private int[] T007H29_A2420OpeAntCod ;
   private String[] T007H30_A396EmprCod ;
   private int[] T007H30_A2420OpeAntCod ;
   private String[] T007H31_A396EmprCod ;
   private int[] T007H31_A2420OpeAntCod ;
   private String[] T007H32_A396EmprCod ;
   private int[] T007H32_A2420OpeAntCod ;
   private String[] T007H33_A396EmprCod ;
   private int[] T007H33_A2420OpeAntCod ;
   private String[] T007H34_A396EmprCod ;
   private int[] T007H34_A2420OpeAntCod ;
   private String[] T007H35_A396EmprCod ;
   private int[] T007H35_A2420OpeAntCod ;
   private String[] T007H36_A396EmprCod ;
   private int[] T007H36_A2420OpeAntCod ;
   private String[] T007H37_A396EmprCod ;
   private int[] T007H37_A2420OpeAntCod ;
   private String[] T007H38_A396EmprCod ;
   private int[] T007H38_A2420OpeAntCod ;
   private String[] T007H39_A396EmprCod ;
   private int[] T007H39_A2420OpeAntCod ;
   private String[] T007H40_A396EmprCod ;
   private int[] T007H40_A2420OpeAntCod ;
   private String[] T007H41_A396EmprCod ;
   private int[] T007H41_A2420OpeAntCod ;
   private String[] T007H42_A396EmprCod ;
   private int[] T007H42_A2420OpeAntCod ;
   private String[] T007H43_A396EmprCod ;
   private int[] T007H43_A2420OpeAntCod ;
   private String[] T007H44_A396EmprCod ;
   private int[] T007H44_A2420OpeAntCod ;
   private String[] T007H45_A396EmprCod ;
   private int[] T007H45_A2420OpeAntCod ;
   private String[] T007H46_A396EmprCod ;
   private int[] T007H46_A2420OpeAntCod ;
   private String[] T007H47_A396EmprCod ;
   private int[] T007H47_A2420OpeAntCod ;
   private String[] T007H48_A396EmprCod ;
   private int[] T007H48_A2420OpeAntCod ;
   private String[] T007H49_A396EmprCod ;
   private int[] T007H49_A2420OpeAntCod ;
   private String[] T007H50_A396EmprCod ;
   private int[] T007H50_A2420OpeAntCod ;
   private String[] T007H51_A396EmprCod ;
   private int[] T007H51_A2420OpeAntCod ;
   private String[] T007H52_A396EmprCod ;
   private int[] T007H52_A2420OpeAntCod ;
   private String[] T007H53_A396EmprCod ;
   private int[] T007H53_A2420OpeAntCod ;
   private String[] T007H54_A396EmprCod ;
   private int[] T007H54_A2420OpeAntCod ;
   private String[] T007H55_A396EmprCod ;
   private int[] T007H55_A2420OpeAntCod ;
   private String[] T007H56_A396EmprCod ;
   private int[] T007H56_A2420OpeAntCod ;
   private String[] T007H57_A396EmprCod ;
   private int[] T007H57_A2420OpeAntCod ;
   private String[] T007H58_A396EmprCod ;
   private int[] T007H58_A2420OpeAntCod ;
   private String[] T007H59_A396EmprCod ;
   private int[] T007H59_A2420OpeAntCod ;
   private String[] T007H60_A396EmprCod ;
   private int[] T007H60_A2420OpeAntCod ;
   private String[] T007H61_A396EmprCod ;
   private int[] T007H61_A2420OpeAntCod ;
   private String[] T007H62_A396EmprCod ;
   private int[] T007H62_A2420OpeAntCod ;
   private String[] T007H63_A396EmprCod ;
   private int[] T007H63_A2420OpeAntCod ;
   private String[] T007H64_A396EmprCod ;
   private int[] T007H64_A2420OpeAntCod ;
   private String[] T007H65_A396EmprCod ;
   private int[] T007H65_A2420OpeAntCod ;
   private String[] T007H66_A396EmprCod ;
   private int[] T007H66_A2420OpeAntCod ;
   private String[] T007H67_A396EmprCod ;
   private int[] T007H67_A2420OpeAntCod ;
   private String[] T007H68_A396EmprCod ;
   private int[] T007H68_A2420OpeAntCod ;
   private String[] T007H69_A396EmprCod ;
   private int[] T007H69_A2420OpeAntCod ;
   private String[] T007H70_A396EmprCod ;
   private int[] T007H70_A2420OpeAntCod ;
   private String[] T007H71_A396EmprCod ;
   private int[] T007H71_A2420OpeAntCod ;
   private String[] T007H72_A396EmprCod ;
   private int[] T007H72_A2420OpeAntCod ;
   private String[] T007H73_A396EmprCod ;
   private int[] T007H73_A2420OpeAntCod ;
   private String[] T007H74_A396EmprCod ;
   private int[] T007H74_A2420OpeAntCod ;
   private String[] T007H75_A396EmprCod ;
   private int[] T007H75_A2420OpeAntCod ;
   private String[] T007H76_A396EmprCod ;
   private int[] T007H76_A2420OpeAntCod ;
   private String[] T007H77_A396EmprCod ;
   private int[] T007H77_A2420OpeAntCod ;
   private String[] T007H78_A396EmprCod ;
   private int[] T007H78_A2420OpeAntCod ;
   private String[] T007H79_A396EmprCod ;
   private int[] T007H79_A2420OpeAntCod ;
   private String[] T007H80_A396EmprCod ;
   private int[] T007H80_A2420OpeAntCod ;
   private String[] T007H81_A396EmprCod ;
   private int[] T007H81_A2420OpeAntCod ;
   private String[] T007H82_A396EmprCod ;
   private int[] T007H82_A2420OpeAntCod ;
   private String[] T007H83_A396EmprCod ;
   private int[] T007H83_A2420OpeAntCod ;
   private String[] T007H84_A396EmprCod ;
   private int[] T007H84_A2420OpeAntCod ;
   private String[] T007H85_A396EmprCod ;
   private int[] T007H85_A2420OpeAntCod ;
   private String[] T007H86_A396EmprCod ;
   private int[] T007H86_A2420OpeAntCod ;
   private String[] T007H87_A396EmprCod ;
   private int[] T007H87_A2420OpeAntCod ;
   private String[] T007H88_A396EmprCod ;
   private int[] T007H88_A2420OpeAntCod ;
   private String[] T007H89_A396EmprCod ;
   private int[] T007H89_A2420OpeAntCod ;
   private String[] T007H90_A396EmprCod ;
   private int[] T007H90_A2420OpeAntCod ;
   private String[] T007H91_A396EmprCod ;
   private int[] T007H91_A2420OpeAntCod ;
   private String[] T007H92_A396EmprCod ;
   private int[] T007H92_A2420OpeAntCod ;
   private String[] T007H93_A396EmprCod ;
   private int[] T007H93_A2420OpeAntCod ;
   private String[] T007H94_A396EmprCod ;
   private int[] T007H94_A2420OpeAntCod ;
   private String[] T007H95_A396EmprCod ;
   private int[] T007H95_A2420OpeAntCod ;
   private String[] T007H96_A396EmprCod ;
   private int[] T007H96_A2420OpeAntCod ;
   private String[] T007H97_A396EmprCod ;
   private int[] T007H97_A2420OpeAntCod ;
   private String[] T007H98_A396EmprCod ;
   private int[] T007H98_A2420OpeAntCod ;
   private String[] T007H99_A396EmprCod ;
   private int[] T007H99_A2420OpeAntCod ;
   private String[] T007H100_A396EmprCod ;
   private int[] T007H100_A2420OpeAntCod ;
   private String[] T007H101_A396EmprCod ;
   private int[] T007H101_A2420OpeAntCod ;
   private String[] T007H102_A396EmprCod ;
   private int[] T007H102_A2420OpeAntCod ;
   private String[] T007H103_A396EmprCod ;
   private int[] T007H103_A2420OpeAntCod ;
   private String[] T007H104_A396EmprCod ;
   private int[] T007H104_A2420OpeAntCod ;
   private String[] T007H105_A396EmprCod ;
   private int[] T007H105_A2420OpeAntCod ;
   private String[] T007H106_A396EmprCod ;
   private int[] T007H106_A2420OpeAntCod ;
   private String[] T007H107_A396EmprCod ;
   private int[] T007H107_A2420OpeAntCod ;
   private String[] T007H108_A396EmprCod ;
   private int[] T007H108_A2420OpeAntCod ;
   private String[] T007H109_A396EmprCod ;
   private int[] T007H109_A2420OpeAntCod ;
   private String[] T007H110_A396EmprCod ;
   private int[] T007H110_A2420OpeAntCod ;
   private String[] T007H111_A396EmprCod ;
   private int[] T007H111_A2420OpeAntCod ;
   private String[] T007H112_A396EmprCod ;
   private int[] T007H112_A2420OpeAntCod ;
   private String[] T007H113_A396EmprCod ;
   private int[] T007H113_A2420OpeAntCod ;
   private String[] T007H114_A396EmprCod ;
   private int[] T007H114_A2420OpeAntCod ;
   private String[] T007H115_A396EmprCod ;
   private int[] T007H115_A2420OpeAntCod ;
   private String[] T007H116_A396EmprCod ;
   private int[] T007H116_A2420OpeAntCod ;
   private String[] T007H117_A396EmprCod ;
   private int[] T007H117_A2420OpeAntCod ;
   private String[] T007H118_A396EmprCod ;
   private int[] T007H118_A2420OpeAntCod ;
   private String[] T007H119_A396EmprCod ;
   private int[] T007H119_A2420OpeAntCod ;
   private String[] T007H120_A396EmprCod ;
   private int[] T007H120_A2420OpeAntCod ;
   private String[] T007H121_A396EmprCod ;
   private int[] T007H121_A2420OpeAntCod ;
   private String[] T007H122_A396EmprCod ;
   private int[] T007H122_A2406ExhAlbCod ;
   private String[] T007H123_A396EmprCod ;
   private short[] T007H123_A2248ManCod ;
   private boolean[] T007H123_n2248ManCod ;
   private java.util.Date[] T007H123_A2364RpExPdFe ;
   private String[] T007H124_A396EmprCod ;
   private short[] T007H124_A2248ManCod ;
   private boolean[] T007H124_n2248ManCod ;
   private String[] T007H124_A2358ExMvpFas ;
   private String[] T007H125_A396EmprCod ;
   private int[] T007H125_A2333ExtPdoAlb ;
   private String[] T007H126_A396EmprCod ;
   private int[] T007H126_A2253SalExtAlb ;
   private String[] T007H127_A396EmprCod ;
   private long[] T007H127_A30AlbProCod ;
   private int[] T007H127_A129BarCod ;
   private byte[] T007H127_A132BarCodReo ;
   private String[] T007H127_A130BarCodPar ;
   private String[] T007H128_A396EmprCod ;
   private short[] T007H128_A2248ManCod ;
   private boolean[] T007H128_n2248ManCod ;
   private short[] T007H129_A781PrvCod ;
   private boolean[] T007H129_n781PrvCod ;
   private String[] T007H129_A13798PrvDscID ;
   private String[] T007H130_A13798PrvDscID ;
   private short[] T007H130_A781PrvCod ;
   private boolean[] T007H130_n781PrvCod ;
   private String[] T007H131_A13798PrvDscID ;
   private short[] T007H131_A781PrvCod ;
   private boolean[] T007H131_n781PrvCod ;
   private String[] T007H132_A787PrvDsc ;
   private boolean[] T007H132_n787PrvDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV38TrnContextAtt ;
}

final  class tmanufa__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmanufa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmanufa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmanufa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmanufa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T007H2", "SELECT ManCod, ManNom, ManDom, ManPob, ManCpo, ManCp2, ManTel1, ManTel2, ManFax, ManNif, ManDto, EmprCod, PrvCod FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ?  FOR UPDATE OF ManNom, ManDom, ManPob, ManCpo, ManCp2, ManTel1, ManTel2, ManFax, ManNif, ManDto, PrvCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H3", "SELECT ManCod, ManNom, ManDom, ManPob, ManCpo, ManCp2, ManTel1, ManTel2, ManFax, ManNif, ManDto, EmprCod, PrvCod FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H5", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H6", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID, PrvCod FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H7", "SELECT /*+ FIRST_ROWS(100) */ TM1.ManCod, T2.EmprNom, TM1.ManNom, TM1.ManDom, TM1.ManPob, TM1.ManCpo, TM1.ManCp2, T3.PrvDsc, TM1.ManTel1, TM1.ManTel2, TM1.ManFax, TM1.ManNif, TM1.ManDto, TM1.EmprCod, TM1.PrvCod FROM ((TXPMANUFA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = TM1.PrvCod) WHERE TM1.EmprCod = ? and TM1.ManCod = ? ORDER BY TM1.EmprCod, TM1.ManCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID, PrvCod FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H9", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID, PrvCod FROM TXPPROVIN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H10", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID, PrvCod FROM TXPPROVIN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H11", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod FROM TXPMANUFA WHERE ( EmprCod > ? or EmprCod = ? and ManCod > ?) ORDER BY EmprCod, ManCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod FROM TXPMANUFA WHERE ( EmprCod < ? or EmprCod = ? and ManCod < ?) ORDER BY EmprCod DESC, ManCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H15", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID, PrvCod FROM TXPPROVIN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T007H16", "INSERT INTO TXPMANUFA(ManCod, ManNom, ManDom, ManPob, ManCpo, ManCp2, ManTel1, ManTel2, ManFax, ManNif, ManDto, EmprCod, PrvCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMANUFA")
         ,new UpdateCursor("T007H17", "UPDATE TXPMANUFA SET ManNom=?, ManDom=?, ManPob=?, ManCpo=?, ManCp2=?, ManTel1=?, ManTel2=?, ManFax=?, ManNif=?, ManDto=?, PrvCod=?  WHERE EmprCod = ? AND ManCod = ?", GX_NOMASK, "TXPMANUFA")
         ,new UpdateCursor("T007H18", "DELETE FROM TXPMANUFA  WHERE EmprCod = ? AND ManCod = ?", GX_NOMASK, "TXPMANUFA")
         ,new ForEachCursor("T007H19", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H20", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod, UbiLin FROM TXPUBIMTO WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H21", "SELECT * FROM (SELECT EmprCod, ManCod, ManFasCod FROM TXPPREMOP WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H22", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H23", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H24", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe FROM TXPCREXHD WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H25", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas FROM TXPCEXMVH WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H26", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprOpe = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H27", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H28", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H29", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H30", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H31", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H32", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H33", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H34", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H35", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H36", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H37", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H38", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H39", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H40", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H41", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H42", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H43", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H44", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H45", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H46", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H47", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H48", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H49", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H50", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H51", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H52", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H53", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H54", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H55", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H56", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H57", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H58", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H59", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H60", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H61", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H62", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H63", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H64", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H65", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H66", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H67", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H68", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H69", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H70", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H71", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H72", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H73", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H74", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H75", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H76", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H77", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H78", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H79", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H80", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H81", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H82", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H83", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H84", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H85", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H86", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H87", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H88", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H89", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H90", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H91", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H92", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H93", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H94", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H95", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H96", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H97", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H98", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H99", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H100", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H101", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H102", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H103", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H104", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H105", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H106", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H107", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H108", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H109", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H110", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H111", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H112", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H113", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H114", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H115", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H116", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H117", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H118", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H119", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H120", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H121", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H122", "SELECT * FROM (SELECT EmprCod, ExhAlbCod FROM TXPCEXPER WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H123", "SELECT * FROM (SELECT EmprCod, ManCod, RpExPdFe FROM TXPCRPEXP WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H124", "SELECT * FROM (SELECT EmprCod, ManCod, ExMvpFas FROM TXPCEXMVP WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H125", "SELECT * FROM (SELECT EmprCod, ExtPdoAlb FROM TXPCEXTPD WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H126", "SELECT * FROM (SELECT EmprCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H127", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND ManCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007H128", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ManCod FROM TXPMANUFA ORDER BY EmprCod, ManCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H129", "SELECT * FROM (SELECT PrvCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID FROM TXPPROVIN WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, '')))) like '%' || UPPER(?) ORDER BY PrvDscID) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H130", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID, PrvCod FROM TXPPROVIN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H131", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID, PrvCod FROM TXPPROVIN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007H132", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 34);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((short[]) buf[22])[0] = rslt.getShort(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 34);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((short[]) buf[22])[0] = rslt.getShort(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 34);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 9);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((short[]) buf[26])[0] = rslt.getShort(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 113 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 114 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 115 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 116 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 117 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 118 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 119 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
      }
      getresults120( cursor, rslt, buf) ;
   }

   public void getresults120( int cursor ,
                              IFieldGetter rslt ,
                              Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 121 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 123 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 124 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 125 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 126 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 127 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 128 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 129 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 130 :
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 35);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 35);
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
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
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
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 35);
               return;
            case 14 :
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
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 34);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 9);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 9);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 10);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 20);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               stmt.setString(12, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 34);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 9);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 9);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 10);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 20);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               stmt.setString(12, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
            case 46 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 74 :
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
            case 75 :
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
            case 76 :
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
            case 77 :
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
            case 78 :
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
            case 79 :
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
            case 80 :
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
            case 81 :
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
            case 82 :
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
            case 83 :
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
            case 84 :
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
            case 85 :
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
            case 86 :
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
            case 87 :
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
            case 88 :
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
            case 89 :
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
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
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
            case 91 :
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
            case 92 :
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
            case 93 :
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
            case 94 :
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
            case 95 :
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
            case 96 :
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
            case 97 :
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
            case 98 :
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
            case 99 :
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
            case 100 :
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
            case 101 :
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
            case 102 :
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
            case 103 :
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
            case 104 :
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
            case 105 :
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
            case 106 :
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
            case 107 :
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
            case 108 :
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
            case 109 :
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
            case 110 :
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
            case 111 :
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
            case 112 :
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
            case 113 :
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
            case 114 :
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
            case 115 :
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
            case 116 :
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
            case 117 :
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
            case 118 :
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
            case 119 :
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
      setparameters120( cursor, stmt, parms) ;
   }

   public void setparameters120( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
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
            case 121 :
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
            case 122 :
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
            case 123 :
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
            case 124 :
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
            case 125 :
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
            case 127 :
               stmt.setVarchar(1, (String)parms[0], 35);
               return;
            case 128 :
               stmt.setVarchar(1, (String)parms[0], 35);
               return;
            case 129 :
               stmt.setVarchar(1, (String)parms[0], 35);
               return;
            case 130 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
      }
   }

}

