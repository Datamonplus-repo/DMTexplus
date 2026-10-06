package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttransp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"TRNCOD") == 0 )
      {
         AV47TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TrnCod), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47TrnCod), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asatrncod2K108( AV47TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TRNCOD") == 0 )
      {
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         AV51autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatrncod2K108( A840TrnCod, AV51autonumber, A396EmprCod) ;
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
            AV40EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40EmprCod", AV40EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40EmprCod, "@!"))));
            AV47TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TrnCod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47TrnCod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Transportista", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttransp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttransp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttransp_impl.class ));
   }

   public ttransp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnNom_Internalname, httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnNif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnNif_Internalname, httpContext.getMessage( "Nif", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNif_Internalname, GXutil.rtrim( A3643TrnNif), GXutil.rtrim( localUtil.format( A3643TrnNif, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnDom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnDom_Internalname, httpContext.getMessage( "Domicilio ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnDom_Internalname, GXutil.rtrim( A3637TrnDom), GXutil.rtrim( localUtil.format( A3637TrnDom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnDom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnDom_Enabled, 0, "text", "", 34, "chr", 1, "row", 34, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCpo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCpo_Internalname, httpContext.getMessage( "C.Postal ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCpo_Internalname, GXutil.rtrim( A3639TrnCpo), GXutil.rtrim( localUtil.format( A3639TrnCpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnCpo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCpo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCpo2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCpo2_Internalname, httpContext.getMessage( "C.postal(cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCpo2_Internalname, GXutil.rtrim( A13867TrnCpo2), GXutil.rtrim( localUtil.format( A13867TrnCpo2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnCpo2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCpo2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnPob_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnPob_Internalname, httpContext.getMessage( "Poblacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnPob_Internalname, GXutil.rtrim( A3638TrnPob), GXutil.rtrim( localUtil.format( A3638TrnPob, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnPob_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnPob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCellFL RequiredDataContentCellFL ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprvcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprvcod_Internalname, httpContext.getMessage( "Codigo Provincia", ""), "", "", lblTextblockprvcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_prvcod.setProperty("Caption", Combo_prvcod_Caption);
      ucCombo_prvcod.setProperty("Cls", Combo_prvcod_Cls);
      ucCombo_prvcod.setProperty("EmptyItem", Combo_prvcod_Emptyitem);
      ucCombo_prvcod.setProperty("DropDownOptionsData", AV48PrvCod_Data);
      ucCombo_prvcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prvcod_Internalname, "COMBO_PRVCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvCod_Internalname, httpContext.getMessage( "Codigo Provincia", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCod_Internalname, GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCod_Jsonclick, 0, "Attribute", "", "", "", "", edtPrvCod_Visible, edtPrvCod_Enabled, 1, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTRANSP.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnMat_Internalname, GXutil.rtrim( A10776TrnMat), GXutil.rtrim( localUtil.format( A10776TrnMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnEmail_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnEmail_Internalname, httpContext.getMessage( "Email", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnEmail_Internalname, GXutil.rtrim( A3645TrnEmail), GXutil.rtrim( localUtil.format( A3645TrnEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnEmail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnEmail_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnTel1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnTel1_Internalname, httpContext.getMessage( "Telefono (1)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnTel1_Internalname, GXutil.rtrim( A3640TrnTel1), GXutil.rtrim( localUtil.format( A3640TrnTel1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnTel1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnTel1_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnTel2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnTel2_Internalname, httpContext.getMessage( "Telefono (2)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnTel2_Internalname, GXutil.rtrim( A3641TrnTel2), GXutil.rtrim( localUtil.format( A3641TrnTel2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnTel2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnTel2_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnFax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnFax_Internalname, httpContext.getMessage( "Fax ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnFax_Internalname, GXutil.rtrim( A3642TrnFax), GXutil.rtrim( localUtil.format( A3642TrnFax, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnFax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnFax_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTRANSP.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TTRANSP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TTRANSP.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_prvcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprvcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV50ComboPrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboprvcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50ComboPrvCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50ComboPrvCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprvcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprvcod_Visible, edtavComboprvcod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTRANSP.htm");
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
      e112K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRVCOD_DATA"), AV48PrvCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z841TrnNom = httpContext.cgiGet( "Z841TrnNom") ;
            Z3637TrnDom = httpContext.cgiGet( "Z3637TrnDom") ;
            Z3638TrnPob = httpContext.cgiGet( "Z3638TrnPob") ;
            Z3639TrnCpo = httpContext.cgiGet( "Z3639TrnCpo") ;
            Z13867TrnCpo2 = httpContext.cgiGet( "Z13867TrnCpo2") ;
            Z3640TrnTel1 = httpContext.cgiGet( "Z3640TrnTel1") ;
            Z3641TrnTel2 = httpContext.cgiGet( "Z3641TrnTel2") ;
            Z3642TrnFax = httpContext.cgiGet( "Z3642TrnFax") ;
            Z3643TrnNif = httpContext.cgiGet( "Z3643TrnNif") ;
            Z3645TrnEmail = httpContext.cgiGet( "Z3645TrnEmail") ;
            Z10776TrnMat = httpContext.cgiGet( "Z10776TrnMat") ;
            Z781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z781PrvCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "N781PrvCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13738TrnCNom = httpContext.cgiGet( "TRNCNOM") ;
            AV40EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV47TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vTRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV51autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV45Insert_PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PRVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A787PrvDsc = httpContext.cgiGet( "PRVDSC") ;
            n787PrvDsc = false ;
            AV52Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Combo_prvcod_Objectcall = httpContext.cgiGet( "COMBO_PRVCOD_Objectcall") ;
            Combo_prvcod_Class = httpContext.cgiGet( "COMBO_PRVCOD_Class") ;
            Combo_prvcod_Icontype = httpContext.cgiGet( "COMBO_PRVCOD_Icontype") ;
            Combo_prvcod_Icon = httpContext.cgiGet( "COMBO_PRVCOD_Icon") ;
            Combo_prvcod_Caption = httpContext.cgiGet( "COMBO_PRVCOD_Caption") ;
            Combo_prvcod_Tooltip = httpContext.cgiGet( "COMBO_PRVCOD_Tooltip") ;
            Combo_prvcod_Cls = httpContext.cgiGet( "COMBO_PRVCOD_Cls") ;
            Combo_prvcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRVCOD_Selectedvalue_set") ;
            Combo_prvcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRVCOD_Selectedvalue_get") ;
            Combo_prvcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PRVCOD_Selectedtext_set") ;
            Combo_prvcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PRVCOD_Selectedtext_get") ;
            Combo_prvcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRVCOD_Gamoauthtoken") ;
            Combo_prvcod_Ddointernalname = httpContext.cgiGet( "COMBO_PRVCOD_Ddointernalname") ;
            Combo_prvcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRVCOD_Titlecontrolalign") ;
            Combo_prvcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRVCOD_Dropdownoptionstype") ;
            Combo_prvcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Enabled")) ;
            Combo_prvcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Visible")) ;
            Combo_prvcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRVCOD_Titlecontrolidtoreplace") ;
            Combo_prvcod_Datalisttype = httpContext.cgiGet( "COMBO_PRVCOD_Datalisttype") ;
            Combo_prvcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Allowmultipleselection")) ;
            Combo_prvcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRVCOD_Datalistfixedvalues") ;
            Combo_prvcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Isgriditem")) ;
            Combo_prvcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Hasdescription")) ;
            Combo_prvcod_Datalistproc = httpContext.cgiGet( "COMBO_PRVCOD_Datalistproc") ;
            Combo_prvcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRVCOD_Datalistprocparametersprefix") ;
            Combo_prvcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRVCOD_Remoteservicesparameters") ;
            Combo_prvcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRVCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prvcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Includeonlyselectedoption")) ;
            Combo_prvcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Includeselectalloption")) ;
            Combo_prvcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Emptyitem")) ;
            Combo_prvcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Includeaddnewoption")) ;
            Combo_prvcod_Htmltemplate = httpContext.cgiGet( "COMBO_PRVCOD_Htmltemplate") ;
            Combo_prvcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRVCOD_Multiplevaluestype") ;
            Combo_prvcod_Loadingdata = httpContext.cgiGet( "COMBO_PRVCOD_Loadingdata") ;
            Combo_prvcod_Noresultsfound = httpContext.cgiGet( "COMBO_PRVCOD_Noresultsfound") ;
            Combo_prvcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PRVCOD_Emptyitemtext") ;
            Combo_prvcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRVCOD_Onlyselectedvalues") ;
            Combo_prvcod_Selectalltext = httpContext.cgiGet( "COMBO_PRVCOD_Selectalltext") ;
            Combo_prvcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRVCOD_Multiplevaluesseparator") ;
            Combo_prvcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRVCOD_Addnewoptiontext") ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A840TrnCod = (short)(0) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
            n841TrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
            A3643TrnNif = GXutil.upper( httpContext.cgiGet( edtTrnNif_Internalname)) ;
            n3643TrnNif = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
            A3637TrnDom = httpContext.cgiGet( edtTrnDom_Internalname) ;
            n3637TrnDom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3637TrnDom", A3637TrnDom);
            A3639TrnCpo = httpContext.cgiGet( edtTrnCpo_Internalname) ;
            n3639TrnCpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3639TrnCpo", A3639TrnCpo);
            A13867TrnCpo2 = httpContext.cgiGet( edtTrnCpo2_Internalname) ;
            n13867TrnCpo2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13867TrnCpo2", A13867TrnCpo2);
            A3638TrnPob = httpContext.cgiGet( edtTrnPob_Internalname) ;
            n3638TrnPob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3638TrnPob", A3638TrnPob);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A781PrvCod = (short)(0) ;
               n781PrvCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
            }
            else
            {
               A781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n781PrvCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
            }
            A10776TrnMat = httpContext.cgiGet( edtTrnMat_Internalname) ;
            n10776TrnMat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10776TrnMat", A10776TrnMat);
            A3645TrnEmail = httpContext.cgiGet( edtTrnEmail_Internalname) ;
            n3645TrnEmail = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3645TrnEmail", A3645TrnEmail);
            A3640TrnTel1 = httpContext.cgiGet( edtTrnTel1_Internalname) ;
            n3640TrnTel1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3640TrnTel1", A3640TrnTel1);
            A3641TrnTel2 = httpContext.cgiGet( edtTrnTel2_Internalname) ;
            n3641TrnTel2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3641TrnTel2", A3641TrnTel2);
            A3642TrnFax = httpContext.cgiGet( edtTrnFax_Internalname) ;
            n3642TrnFax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3642TrnFax", A3642TrnFax);
            AV50ComboPrvCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavComboprvcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50ComboPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50ComboPrvCod), 3, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTRANSP");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A840TrnCod != Z840TrnCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\ttransp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
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
                  sMode108 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode108 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound108 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_2K0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TRNCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTrnCod_Internalname ;
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
                        e112K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e122K2 ();
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
         e122K2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2K108( ) ;
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
         disableAttributes2K108( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvcod_Enabled), 5, 0), true);
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

   public void confirm_2K0( )
   {
      beforeValidate2K108( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2K108( ) ;
         }
         else
         {
            checkExtendedTable2K108( ) ;
            closeExtendedTableCursors2K108( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption2K0( )
   {
   }

   public void e112K2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttransp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttransp_impl.this.A396EmprCod = GXv_char2[0] ;
      ttransp_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttransp_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV51autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      ttransp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV51autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51autonumber), 4, 0));
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttransp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV40EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttransp_impl.this.AV40EmprCod = GXv_char4[0] ;
      ttransp_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttransp_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40EmprCod", AV40EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV42WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV42WWPContext = GXv_SdtWWPContext7[0] ;
      edtPrvCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Visible), 5, 0), true);
      AV50ComboPrvCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50ComboPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50ComboPrvCod), 3, 0));
      edtavComboprvcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRVCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV43TrnContext.fromxml(AV44WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV43TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV52Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV53GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GXV1), 8, 0));
         while ( AV53GXV1 <= AV43TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV46TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV43TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV53GXV1));
            if ( GXutil.strcmp(AV46TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvCod") == 0 )
            {
               AV45Insert_PrvCod = (short)(GXutil.lval( AV46TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45Insert_PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45Insert_PrvCod), 3, 0));
               if ( ! (0==AV45Insert_PrvCod) )
               {
                  AV50ComboPrvCod = AV45Insert_PrvCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV50ComboPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50ComboPrvCod), 3, 0));
                  Combo_prvcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV50ComboPrvCod, 3, 0)) ;
                  ucCombo_prvcod.sendProperty(context, "", false, Combo_prvcod_Internalname, "SelectedValue_set", Combo_prvcod_Selectedvalue_set);
                  Combo_prvcod_Enabled = false ;
                  ucCombo_prvcod.sendProperty(context, "", false, Combo_prvcod_Internalname, "Enabled", GXutil.booltostr( Combo_prvcod_Enabled));
               }
            }
            AV53GXV1 = (int)(AV53GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GXV1), 8, 0));
         }
      }
   }

   public void e122K2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV43TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.ttranspww", new String[] {}, new String[] {}) );
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

   public void S112( )
   {
      /* 'LOADCOMBOPRVCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV48PrvCod_Data ;
      GXv_char4[0] = AV49ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ficherosbasicos.ttransploaddvcombo(remoteHandle, context).execute( "PrvCod", Gx_mode, AV40EmprCod, AV47TrnCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      ttransp_impl.this.AV49ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV48PrvCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_prvcod_Selectedvalue_set = AV49ComboSelectedValue ;
      ucCombo_prvcod.sendProperty(context, "", false, Combo_prvcod_Internalname, "SelectedValue_set", Combo_prvcod_Selectedvalue_set);
      AV50ComboPrvCod = (short)(GXutil.lval( AV49ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50ComboPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50ComboPrvCod), 3, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_prvcod_Enabled = false ;
         ucCombo_prvcod.sendProperty(context, "", false, Combo_prvcod_Internalname, "Enabled", GXutil.booltostr( Combo_prvcod_Enabled));
      }
   }

   public void zm2K108( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z841TrnNom = T002K3_A841TrnNom[0] ;
            Z3637TrnDom = T002K3_A3637TrnDom[0] ;
            Z3638TrnPob = T002K3_A3638TrnPob[0] ;
            Z3639TrnCpo = T002K3_A3639TrnCpo[0] ;
            Z13867TrnCpo2 = T002K3_A13867TrnCpo2[0] ;
            Z3640TrnTel1 = T002K3_A3640TrnTel1[0] ;
            Z3641TrnTel2 = T002K3_A3641TrnTel2[0] ;
            Z3642TrnFax = T002K3_A3642TrnFax[0] ;
            Z3643TrnNif = T002K3_A3643TrnNif[0] ;
            Z3645TrnEmail = T002K3_A3645TrnEmail[0] ;
            Z10776TrnMat = T002K3_A10776TrnMat[0] ;
            Z781PrvCod = T002K3_A781PrvCod[0] ;
         }
         else
         {
            Z841TrnNom = A841TrnNom ;
            Z3637TrnDom = A3637TrnDom ;
            Z3638TrnPob = A3638TrnPob ;
            Z3639TrnCpo = A3639TrnCpo ;
            Z13867TrnCpo2 = A13867TrnCpo2 ;
            Z3640TrnTel1 = A3640TrnTel1 ;
            Z3641TrnTel2 = A3641TrnTel2 ;
            Z3642TrnFax = A3642TrnFax ;
            Z3643TrnNif = A3643TrnNif ;
            Z3645TrnEmail = A3645TrnEmail ;
            Z10776TrnMat = A10776TrnMat ;
            Z781PrvCod = A781PrvCod ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z840TrnCod = A840TrnCod ;
         Z841TrnNom = A841TrnNom ;
         Z3637TrnDom = A3637TrnDom ;
         Z3638TrnPob = A3638TrnPob ;
         Z3639TrnCpo = A3639TrnCpo ;
         Z13867TrnCpo2 = A13867TrnCpo2 ;
         Z3640TrnTel1 = A3640TrnTel1 ;
         Z3641TrnTel2 = A3641TrnTel2 ;
         Z3642TrnFax = A3642TrnFax ;
         Z3643TrnNif = A3643TrnNif ;
         Z3645TrnEmail = A3645TrnEmail ;
         Z10776TrnMat = A10776TrnMat ;
         Z396EmprCod = A396EmprCod ;
         Z781PrvCod = A781PrvCod ;
         Z407EmprNom = A407EmprNom ;
         Z787PrvDsc = A787PrvDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV52Pgmname = "FicherosBasicos.TTRANSP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV40EmprCod)==0) )
      {
         A396EmprCod = AV40EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T002K4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T002K4_A407EmprNom[0] ;
      n407EmprNom = T002K4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV47TrnCod) )
      {
         A840TrnCod = AV47TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      if ( ! (0==AV47TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV47TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV45Insert_PrvCod) )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV45Insert_PrvCod) )
      {
         A781PrvCod = AV45Insert_PrvCod ;
         n781PrvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
      }
      else
      {
         A781PrvCod = AV50ComboPrvCod ;
         n781PrvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
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
         /* Using cursor T002K5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
         A787PrvDsc = T002K5_A787PrvDsc[0] ;
         n787PrvDsc = T002K5_n787PrvDsc[0] ;
         pr_default.close(3);
      }
   }

   public void load2K108( )
   {
      /* Using cursor T002K6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound108 = (short)(1) ;
         A841TrnNom = T002K6_A841TrnNom[0] ;
         n841TrnNom = T002K6_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3637TrnDom = T002K6_A3637TrnDom[0] ;
         n3637TrnDom = T002K6_n3637TrnDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3637TrnDom", A3637TrnDom);
         A3638TrnPob = T002K6_A3638TrnPob[0] ;
         n3638TrnPob = T002K6_n3638TrnPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3638TrnPob", A3638TrnPob);
         A3639TrnCpo = T002K6_A3639TrnCpo[0] ;
         n3639TrnCpo = T002K6_n3639TrnCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3639TrnCpo", A3639TrnCpo);
         A13867TrnCpo2 = T002K6_A13867TrnCpo2[0] ;
         n13867TrnCpo2 = T002K6_n13867TrnCpo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13867TrnCpo2", A13867TrnCpo2);
         A787PrvDsc = T002K6_A787PrvDsc[0] ;
         n787PrvDsc = T002K6_n787PrvDsc[0] ;
         A3640TrnTel1 = T002K6_A3640TrnTel1[0] ;
         n3640TrnTel1 = T002K6_n3640TrnTel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3640TrnTel1", A3640TrnTel1);
         A3641TrnTel2 = T002K6_A3641TrnTel2[0] ;
         n3641TrnTel2 = T002K6_n3641TrnTel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3641TrnTel2", A3641TrnTel2);
         A3642TrnFax = T002K6_A3642TrnFax[0] ;
         n3642TrnFax = T002K6_n3642TrnFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3642TrnFax", A3642TrnFax);
         A3643TrnNif = T002K6_A3643TrnNif[0] ;
         n3643TrnNif = T002K6_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         A3645TrnEmail = T002K6_A3645TrnEmail[0] ;
         n3645TrnEmail = T002K6_n3645TrnEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3645TrnEmail", A3645TrnEmail);
         A407EmprNom = T002K6_A407EmprNom[0] ;
         n407EmprNom = T002K6_n407EmprNom[0] ;
         A10776TrnMat = T002K6_A10776TrnMat[0] ;
         n10776TrnMat = T002K6_n10776TrnMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10776TrnMat", A10776TrnMat);
         A781PrvCod = T002K6_A781PrvCod[0] ;
         n781PrvCod = T002K6_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         zm2K108( -15) ;
      }
      pr_default.close(4);
      onLoadActions2K108( ) ;
   }

   public void onLoadActions2K108( )
   {
      A13738TrnCNom = GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) + "-" + GXutil.trim( A841TrnNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13738TrnCNom", A13738TrnCNom);
   }

   public void checkExtendedTable2K108( )
   {
      nIsDirty_108 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_108 = (short)(1) ;
      A13738TrnCNom = GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) + "-" + GXutil.trim( A841TrnNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13738TrnCNom", A13738TrnCNom);
      /* Using cursor T002K5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A787PrvDsc = T002K5_A787PrvDsc[0] ;
      n787PrvDsc = T002K5_n787PrvDsc[0] ;
      pr_default.close(3);
      if ( (0==A781PrvCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Provincia es requerido.", ""), 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors2K108( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_17( short A781PrvCod )
   {
      /* Using cursor T002K7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A787PrvDsc = T002K7_A787PrvDsc[0] ;
      n787PrvDsc = T002K7_n787PrvDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A787PrvDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey2K108( )
   {
      /* Using cursor T002K8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound108 = (short)(1) ;
      }
      else
      {
         RcdFound108 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002K3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T002K3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm2K108( 15) ;
         RcdFound108 = (short)(1) ;
         A840TrnCod = T002K3_A840TrnCod[0] ;
         n840TrnCod = T002K3_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A841TrnNom = T002K3_A841TrnNom[0] ;
         n841TrnNom = T002K3_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3637TrnDom = T002K3_A3637TrnDom[0] ;
         n3637TrnDom = T002K3_n3637TrnDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3637TrnDom", A3637TrnDom);
         A3638TrnPob = T002K3_A3638TrnPob[0] ;
         n3638TrnPob = T002K3_n3638TrnPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3638TrnPob", A3638TrnPob);
         A3639TrnCpo = T002K3_A3639TrnCpo[0] ;
         n3639TrnCpo = T002K3_n3639TrnCpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3639TrnCpo", A3639TrnCpo);
         A13867TrnCpo2 = T002K3_A13867TrnCpo2[0] ;
         n13867TrnCpo2 = T002K3_n13867TrnCpo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13867TrnCpo2", A13867TrnCpo2);
         A3640TrnTel1 = T002K3_A3640TrnTel1[0] ;
         n3640TrnTel1 = T002K3_n3640TrnTel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3640TrnTel1", A3640TrnTel1);
         A3641TrnTel2 = T002K3_A3641TrnTel2[0] ;
         n3641TrnTel2 = T002K3_n3641TrnTel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3641TrnTel2", A3641TrnTel2);
         A3642TrnFax = T002K3_A3642TrnFax[0] ;
         n3642TrnFax = T002K3_n3642TrnFax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3642TrnFax", A3642TrnFax);
         A3643TrnNif = T002K3_A3643TrnNif[0] ;
         n3643TrnNif = T002K3_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         A3645TrnEmail = T002K3_A3645TrnEmail[0] ;
         n3645TrnEmail = T002K3_n3645TrnEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3645TrnEmail", A3645TrnEmail);
         A10776TrnMat = T002K3_A10776TrnMat[0] ;
         n10776TrnMat = T002K3_n10776TrnMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10776TrnMat", A10776TrnMat);
         A781PrvCod = T002K3_A781PrvCod[0] ;
         n781PrvCod = T002K3_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         sMode108 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2K108( ) ;
         if ( AnyError == 1 )
         {
            RcdFound108 = (short)(0) ;
            initializeNonKey2K108( ) ;
         }
         Gx_mode = sMode108 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound108 = (short)(0) ;
         initializeNonKey2K108( ) ;
         sMode108 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode108 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2K108( ) ;
      if ( RcdFound108 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound108 = (short)(0) ;
      /* Using cursor T002K9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T002K9_A840TrnCod[0] < A840TrnCod ) ) && ( GXutil.strcmp(T002K9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T002K9_A840TrnCod[0] > A840TrnCod ) ) && ( GXutil.strcmp(T002K9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A840TrnCod = T002K9_A840TrnCod[0] ;
            n840TrnCod = T002K9_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            RcdFound108 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound108 = (short)(0) ;
      /* Using cursor T002K10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T002K10_A840TrnCod[0] > A840TrnCod ) ) && ( GXutil.strcmp(T002K10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T002K10_A840TrnCod[0] < A840TrnCod ) ) && ( GXutil.strcmp(T002K10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A840TrnCod = T002K10_A840TrnCod[0] ;
            n840TrnCod = T002K10_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            RcdFound108 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2K108( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2K108( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound108 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A840TrnCod != Z840TrnCod ) )
            {
               A840TrnCod = Z840TrnCod ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update2K108( ) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A840TrnCod != Z840TrnCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2K108( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TRNCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTrnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTrnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2K108( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A840TrnCod != Z840TrnCod ) )
      {
         A840TrnCod = Z840TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency2K108( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002K2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRANSP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z841TrnNom, T002K2_A841TrnNom[0]) != 0 ) || ( GXutil.strcmp(Z3637TrnDom, T002K2_A3637TrnDom[0]) != 0 ) || ( GXutil.strcmp(Z3638TrnPob, T002K2_A3638TrnPob[0]) != 0 ) || ( GXutil.strcmp(Z3639TrnCpo, T002K2_A3639TrnCpo[0]) != 0 ) || ( GXutil.strcmp(Z13867TrnCpo2, T002K2_A13867TrnCpo2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3640TrnTel1, T002K2_A3640TrnTel1[0]) != 0 ) || ( GXutil.strcmp(Z3641TrnTel2, T002K2_A3641TrnTel2[0]) != 0 ) || ( GXutil.strcmp(Z3642TrnFax, T002K2_A3642TrnFax[0]) != 0 ) || ( GXutil.strcmp(Z3643TrnNif, T002K2_A3643TrnNif[0]) != 0 ) || ( GXutil.strcmp(Z3645TrnEmail, T002K2_A3645TrnEmail[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10776TrnMat, T002K2_A10776TrnMat[0]) != 0 ) || ( Z781PrvCod != T002K2_A781PrvCod[0] ) )
         {
            if ( GXutil.strcmp(Z841TrnNom, T002K2_A841TrnNom[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnNom");
               GXutil.writeLogRaw("Old: ",Z841TrnNom);
               GXutil.writeLogRaw("Current: ",T002K2_A841TrnNom[0]);
            }
            if ( GXutil.strcmp(Z3637TrnDom, T002K2_A3637TrnDom[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnDom");
               GXutil.writeLogRaw("Old: ",Z3637TrnDom);
               GXutil.writeLogRaw("Current: ",T002K2_A3637TrnDom[0]);
            }
            if ( GXutil.strcmp(Z3638TrnPob, T002K2_A3638TrnPob[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnPob");
               GXutil.writeLogRaw("Old: ",Z3638TrnPob);
               GXutil.writeLogRaw("Current: ",T002K2_A3638TrnPob[0]);
            }
            if ( GXutil.strcmp(Z3639TrnCpo, T002K2_A3639TrnCpo[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnCpo");
               GXutil.writeLogRaw("Old: ",Z3639TrnCpo);
               GXutil.writeLogRaw("Current: ",T002K2_A3639TrnCpo[0]);
            }
            if ( GXutil.strcmp(Z13867TrnCpo2, T002K2_A13867TrnCpo2[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnCpo2");
               GXutil.writeLogRaw("Old: ",Z13867TrnCpo2);
               GXutil.writeLogRaw("Current: ",T002K2_A13867TrnCpo2[0]);
            }
            if ( GXutil.strcmp(Z3640TrnTel1, T002K2_A3640TrnTel1[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnTel1");
               GXutil.writeLogRaw("Old: ",Z3640TrnTel1);
               GXutil.writeLogRaw("Current: ",T002K2_A3640TrnTel1[0]);
            }
            if ( GXutil.strcmp(Z3641TrnTel2, T002K2_A3641TrnTel2[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnTel2");
               GXutil.writeLogRaw("Old: ",Z3641TrnTel2);
               GXutil.writeLogRaw("Current: ",T002K2_A3641TrnTel2[0]);
            }
            if ( GXutil.strcmp(Z3642TrnFax, T002K2_A3642TrnFax[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnFax");
               GXutil.writeLogRaw("Old: ",Z3642TrnFax);
               GXutil.writeLogRaw("Current: ",T002K2_A3642TrnFax[0]);
            }
            if ( GXutil.strcmp(Z3643TrnNif, T002K2_A3643TrnNif[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnNif");
               GXutil.writeLogRaw("Old: ",Z3643TrnNif);
               GXutil.writeLogRaw("Current: ",T002K2_A3643TrnNif[0]);
            }
            if ( GXutil.strcmp(Z3645TrnEmail, T002K2_A3645TrnEmail[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnEmail");
               GXutil.writeLogRaw("Old: ",Z3645TrnEmail);
               GXutil.writeLogRaw("Current: ",T002K2_A3645TrnEmail[0]);
            }
            if ( GXutil.strcmp(Z10776TrnMat, T002K2_A10776TrnMat[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"TrnMat");
               GXutil.writeLogRaw("Old: ",Z10776TrnMat);
               GXutil.writeLogRaw("Current: ",T002K2_A10776TrnMat[0]);
            }
            if ( Z781PrvCod != T002K2_A781PrvCod[0] )
            {
               GXutil.writeLogln("ficherosbasicos.ttransp:[seudo value changed for attri]"+"PrvCod");
               GXutil.writeLogRaw("Old: ",Z781PrvCod);
               GXutil.writeLogRaw("Current: ",T002K2_A781PrvCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTRANSP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2K108( )
   {
      beforeValidate2K108( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2K108( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2K108( 0) ;
         checkOptimisticConcurrency2K108( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2K108( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2K108( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002K11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n841TrnNom), A841TrnNom, Boolean.valueOf(n3637TrnDom), A3637TrnDom, Boolean.valueOf(n3638TrnPob), A3638TrnPob, Boolean.valueOf(n3639TrnCpo), A3639TrnCpo, Boolean.valueOf(n13867TrnCpo2), A13867TrnCpo2, Boolean.valueOf(n3640TrnTel1), A3640TrnTel1, Boolean.valueOf(n3641TrnTel2), A3641TrnTel2, Boolean.valueOf(n3642TrnFax), A3642TrnFax, Boolean.valueOf(n3643TrnNif), A3643TrnNif, Boolean.valueOf(n3645TrnEmail), A3645TrnEmail, Boolean.valueOf(n10776TrnMat), A10776TrnMat, A396EmprCod, Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRANSP");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption2K0( ) ;
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
            load2K108( ) ;
         }
         endLevel2K108( ) ;
      }
      closeExtendedTableCursors2K108( ) ;
   }

   public void update2K108( )
   {
      beforeValidate2K108( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2K108( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2K108( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2K108( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2K108( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002K12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, Boolean.valueOf(n3637TrnDom), A3637TrnDom, Boolean.valueOf(n3638TrnPob), A3638TrnPob, Boolean.valueOf(n3639TrnCpo), A3639TrnCpo, Boolean.valueOf(n13867TrnCpo2), A13867TrnCpo2, Boolean.valueOf(n3640TrnTel1), A3640TrnTel1, Boolean.valueOf(n3641TrnTel2), A3641TrnTel2, Boolean.valueOf(n3642TrnFax), A3642TrnFax, Boolean.valueOf(n3643TrnNif), A3643TrnNif, Boolean.valueOf(n3645TrnEmail), A3645TrnEmail, Boolean.valueOf(n10776TrnMat), A10776TrnMat, Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod), A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRANSP");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRANSP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2K108( ) ;
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
         endLevel2K108( ) ;
      }
      closeExtendedTableCursors2K108( ) ;
   }

   public void deferredUpdate2K108( )
   {
   }

   public void delete( )
   {
      beforeValidate2K108( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2K108( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2K108( ) ;
         afterConfirm2K108( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2K108( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002K13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRANSP");
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
      sMode108 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2K108( ) ;
      Gx_mode = sMode108 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2K108( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13738TrnCNom = GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) + "-" + GXutil.trim( A841TrnNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13738TrnCNom", A13738TrnCNom);
         /* Using cursor T002K14 */
         pr_default.execute(12, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
         A787PrvDsc = T002K14_A787PrvDsc[0] ;
         n787PrvDsc = T002K14_n787PrvDsc[0] ;
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002K15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Albaran Transporte Proveedor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T002K16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION GENERO CRUDO detail", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T002K17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Cabecera)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T002K18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FICHA TECNICA ASOCIADA A NOF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T002K19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTES TRANSPORTISTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T002K20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FICHA TECNICA ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T002K21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T002K22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REMLAVs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T002K23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T002K24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T002K25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T002K26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEXTPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T002K27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T002K28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T002K29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T002K30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T002K31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T002K32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T002K33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T002K34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T002K35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T002K36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T002K37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T002K38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T002K39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T002K40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T002K41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T002K42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T002K43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T002K44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T002K45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T002K46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T002K47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T002K48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T002K49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T002K50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T002K51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T002K52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T002K53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T002K54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T002K55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T002K56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T002K57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T002K58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T002K59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T002K60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T002K61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T002K62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T002K63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T002K64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T002K65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T002K66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T002K67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T002K68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T002K69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T002K70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T002K71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T002K72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T002K73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T002K74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T002K75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T002K76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T002K77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T002K78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T002K79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T002K80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T002K81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T002K82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T002K83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T002K84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T002K85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T002K86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T002K87 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T002K88 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T002K89 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T002K90 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T002K91 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T002K92 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T002K93 */
         pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T002K94 */
         pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T002K95 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T002K96 */
         pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T002K97 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T002K98 */
         pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor T002K99 */
         pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor T002K100 */
         pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor T002K101 */
         pr_default.execute(99, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor T002K102 */
         pr_default.execute(100, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor T002K103 */
         pr_default.execute(101, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor T002K104 */
         pr_default.execute(102, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor T002K105 */
         pr_default.execute(103, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
         /* Using cursor T002K106 */
         pr_default.execute(104, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(104) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(104);
         /* Using cursor T002K107 */
         pr_default.execute(105, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(105) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(105);
         /* Using cursor T002K108 */
         pr_default.execute(106, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor T002K109 */
         pr_default.execute(107, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
         /* Using cursor T002K110 */
         pr_default.execute(108, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(108) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(108);
         /* Using cursor T002K111 */
         pr_default.execute(109, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(109) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(109);
         /* Using cursor T002K112 */
         pr_default.execute(110, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(110) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(110);
         /* Using cursor T002K113 */
         pr_default.execute(111, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(111) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(111);
         /* Using cursor T002K114 */
         pr_default.execute(112, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(112) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(112);
         /* Using cursor T002K115 */
         pr_default.execute(113, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(113) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(113);
         /* Using cursor T002K116 */
         pr_default.execute(114, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(114) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(114);
         /* Using cursor T002K117 */
         pr_default.execute(115, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(115) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(115);
         /* Using cursor T002K118 */
         pr_default.execute(116, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(116) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(116);
         /* Using cursor T002K119 */
         pr_default.execute(117, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(117) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(117);
         /* Using cursor T002K120 */
         pr_default.execute(118, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(118) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(118);
         /* Using cursor T002K121 */
         pr_default.execute(119, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
         /* Using cursor T002K122 */
         pr_default.execute(120, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(120) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(120);
         /* Using cursor T002K123 */
         pr_default.execute(121, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(121) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(121);
         /* Using cursor T002K124 */
         pr_default.execute(122, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(122) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(122);
         /* Using cursor T002K125 */
         pr_default.execute(123, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(123) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(123);
         /* Using cursor T002K126 */
         pr_default.execute(124, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(124) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(124);
         /* Using cursor T002K127 */
         pr_default.execute(125, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         if ( (pr_default.getStatus(125) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(125);
      }
   }

   public void endLevel2K108( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2K108( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.ttransp");
         if ( AnyError == 0 )
         {
            confirmValues2K0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.ttransp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2K108( )
   {
      /* Scan By routine */
      /* Using cursor T002K128 */
      pr_default.execute(126, new Object[] {A396EmprCod});
      RcdFound108 = (short)(0) ;
      if ( (pr_default.getStatus(126) != 101) )
      {
         RcdFound108 = (short)(1) ;
         A840TrnCod = T002K128_A840TrnCod[0] ;
         n840TrnCod = T002K128_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2K108( )
   {
      /* Scan next routine */
      pr_default.readNext(126);
      RcdFound108 = (short)(0) ;
      if ( (pr_default.getStatus(126) != 101) )
      {
         RcdFound108 = (short)(1) ;
         A840TrnCod = T002K128_A840TrnCod[0] ;
         n840TrnCod = T002K128_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
   }

   public void scanEnd2K108( )
   {
      pr_default.close(126);
   }

   public void afterConfirm2K108( )
   {
      /* After Confirm Rules */
      if ( (0==A840TrnCod) && (0==AV51autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert2K108( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A840TrnCod) && ( AV51autonumber == 1 ) )
      {
         GXt_int10 = A840TrnCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.ficherosbasicos.ttransp_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int11) ;
         ttransp_impl.this.GXt_int10 = GXv_int11[0] ;
         A840TrnCod = GXt_int10 ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
   }

   public void beforeUpdate2K108( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2K108( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2K108( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2K108( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2K108( )
   {
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtTrnNif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNif_Enabled), 5, 0), true);
      edtTrnDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnDom_Enabled), 5, 0), true);
      edtTrnCpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCpo_Enabled), 5, 0), true);
      edtTrnCpo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCpo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCpo2_Enabled), 5, 0), true);
      edtTrnPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnPob_Enabled), 5, 0), true);
      edtPrvCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Enabled), 5, 0), true);
      edtTrnMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnMat_Enabled), 5, 0), true);
      edtTrnEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnEmail_Enabled), 5, 0), true);
      edtTrnTel1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnTel1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnTel1_Enabled), 5, 0), true);
      edtTrnTel2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnTel2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnTel2_Enabled), 5, 0), true);
      edtTrnFax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnFax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnFax_Enabled), 5, 0), true);
      edtavComboprvcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvcod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2K108( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues2K0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.ttransp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV40EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV47TrnCod,4,0))}, new String[] {"Gx_mode","EmprCod","TrnCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTRANSP");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\ttransp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3637TrnDom", GXutil.rtrim( Z3637TrnDom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3638TrnPob", GXutil.rtrim( Z3638TrnPob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3639TrnCpo", GXutil.rtrim( Z3639TrnCpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13867TrnCpo2", GXutil.rtrim( Z13867TrnCpo2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3640TrnTel1", GXutil.rtrim( Z3640TrnTel1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3641TrnTel2", GXutil.rtrim( Z3641TrnTel2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3642TrnFax", GXutil.rtrim( Z3642TrnFax));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3643TrnNif", GXutil.rtrim( Z3643TrnNif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3645TrnEmail", GXutil.rtrim( Z3645TrnEmail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10776TrnMat", GXutil.rtrim( Z10776TrnMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z781PrvCod", GXutil.ltrim( localUtil.ntoc( Z781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N781PrvCod", GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRVCOD_DATA", AV48PrvCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRVCOD_DATA", AV48PrvCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV43TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV43TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV43TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNCNOM", A13738TrnCNom);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV40EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTRNCOD", GXutil.ltrim( localUtil.ntoc( AV47TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47TrnCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV51autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRVCOD", GXutil.ltrim( localUtil.ntoc( AV45Insert_PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVDSC", GXutil.rtrim( A787PrvDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV52Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Objectcall", GXutil.rtrim( Combo_prvcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Cls", GXutil.rtrim( Combo_prvcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Selectedvalue_set", GXutil.rtrim( Combo_prvcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Enabled", GXutil.booltostr( Combo_prvcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Emptyitem", GXutil.booltostr( Combo_prvcod_Emptyitem));
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
      return formatLink("app.ficherosbasicos.ttransp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV40EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV47TrnCod,4,0))}, new String[] {"Gx_mode","EmprCod","TrnCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TTRANSP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Transportista", "") ;
   }

   public void initializeNonKey2K108( )
   {
      A781PrvCod = (short)(0) ;
      n781PrvCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
      A13738TrnCNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13738TrnCNom", A13738TrnCNom);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3637TrnDom = "" ;
      n3637TrnDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3637TrnDom", A3637TrnDom);
      A3638TrnPob = "" ;
      n3638TrnPob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3638TrnPob", A3638TrnPob);
      A3639TrnCpo = "" ;
      n3639TrnCpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3639TrnCpo", A3639TrnCpo);
      A13867TrnCpo2 = "" ;
      n13867TrnCpo2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13867TrnCpo2", A13867TrnCpo2);
      A787PrvDsc = "" ;
      n787PrvDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", A787PrvDsc);
      A3640TrnTel1 = "" ;
      n3640TrnTel1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3640TrnTel1", A3640TrnTel1);
      A3641TrnTel2 = "" ;
      n3641TrnTel2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3641TrnTel2", A3641TrnTel2);
      A3642TrnFax = "" ;
      n3642TrnFax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3642TrnFax", A3642TrnFax);
      A3643TrnNif = "" ;
      n3643TrnNif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      A3645TrnEmail = "" ;
      n3645TrnEmail = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3645TrnEmail", A3645TrnEmail);
      A10776TrnMat = "" ;
      n10776TrnMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10776TrnMat", A10776TrnMat);
      Z841TrnNom = "" ;
      Z3637TrnDom = "" ;
      Z3638TrnPob = "" ;
      Z3639TrnCpo = "" ;
      Z13867TrnCpo2 = "" ;
      Z3640TrnTel1 = "" ;
      Z3641TrnTel2 = "" ;
      Z3642TrnFax = "" ;
      Z3643TrnNif = "" ;
      Z3645TrnEmail = "" ;
      Z10776TrnMat = "" ;
      Z781PrvCod = (short)(0) ;
   }

   public void initAll2K108( )
   {
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      initializeNonKey2K108( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211654025", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/ttransp.js", "?20268211654025", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtTrnCod_Internalname = "TRNCOD" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtTrnNif_Internalname = "TRNNIF" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtTrnDom_Internalname = "TRNDOM" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtTrnCpo_Internalname = "TRNCPO" ;
      edtTrnCpo2_Internalname = "TRNCPO2" ;
      edtTrnPob_Internalname = "TRNPOB" ;
      lblTextblockprvcod_Internalname = "TEXTBLOCKPRVCOD" ;
      Combo_prvcod_Internalname = "COMBO_PRVCOD" ;
      edtPrvCod_Internalname = "PRVCOD" ;
      divTablesplittedprvcod_Internalname = "TABLESPLITTEDPRVCOD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtTrnMat_Internalname = "TRNMAT" ;
      edtTrnEmail_Internalname = "TRNEMAIL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtTrnTel1_Internalname = "TRNTEL1" ;
      edtTrnTel2_Internalname = "TRNTEL2" ;
      edtTrnFax_Internalname = "TRNFAX" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboprvcod_Internalname = "vCOMBOPRVCOD" ;
      divSectionattribute_prvcod_Internalname = "SECTIONATTRIBUTE_PRVCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Transportista", "") );
      edtavComboprvcod_Jsonclick = "" ;
      edtavComboprvcod_Enabled = 0 ;
      edtavComboprvcod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtTrnFax_Jsonclick = "" ;
      edtTrnFax_Enabled = 1 ;
      edtTrnTel2_Jsonclick = "" ;
      edtTrnTel2_Enabled = 1 ;
      edtTrnTel1_Jsonclick = "" ;
      edtTrnTel1_Enabled = 1 ;
      edtTrnEmail_Jsonclick = "" ;
      edtTrnEmail_Enabled = 1 ;
      edtTrnMat_Jsonclick = "" ;
      edtTrnMat_Enabled = 1 ;
      edtPrvCod_Jsonclick = "" ;
      edtPrvCod_Enabled = 1 ;
      edtPrvCod_Visible = 1 ;
      Combo_prvcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prvcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prvcod_Enabled = GXutil.toBoolean( -1) ;
      edtTrnPob_Jsonclick = "" ;
      edtTrnPob_Enabled = 1 ;
      edtTrnCpo2_Jsonclick = "" ;
      edtTrnCpo2_Enabled = 1 ;
      edtTrnCpo_Jsonclick = "" ;
      edtTrnCpo_Enabled = 1 ;
      edtTrnDom_Jsonclick = "" ;
      edtTrnDom_Enabled = 1 ;
      edtTrnNif_Jsonclick = "" ;
      edtTrnNif_Enabled = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
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

   public void gx5asatrncod2K108( short AV47TrnCod )
   {
      if ( ! (0==AV47TrnCod) )
      {
         A840TrnCod = AV47TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asatrncod2K108( short A840TrnCod ,
                                  short AV51autonumber ,
                                  String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A840TrnCod) && ( AV51autonumber == 1 ) )
      {
         GXt_int10 = A840TrnCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.ficherosbasicos.ttransp_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int11) ;
         ttransp_impl.this.GXt_int10 = GXv_int11[0] ;
         A840TrnCod = GXt_int10 ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      /* Using cursor T002K14 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
      }
      A787PrvDsc = T002K14_A787PrvDsc[0] ;
      n787PrvDsc = T002K14_n787PrvDsc[0] ;
      pr_default.close(12);
      if ( (0==A781PrvCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Provincia es requerido.", ""), 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", GXutil.rtrim( A787PrvDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV40EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV47TrnCod',fld:'vTRNCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV43TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV40EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV47TrnCod',fld:'vTRNCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e122K2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV43TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_TRNNOM","{handler:'valid_Trnnom',iparms:[]");
      setEventMetadata("VALID_TRNNOM",",oparms:[]}");
      setEventMetadata("VALID_PRVCOD","{handler:'valid_Prvcod',iparms:[{av:'A781PrvCod',fld:'PRVCOD',pic:'ZZ9'},{av:'A787PrvDsc',fld:'PRVDSC',pic:'@!'}]");
      setEventMetadata("VALID_PRVCOD",",oparms:[{av:'A787PrvDsc',fld:'PRVDSC',pic:'@!'}]}");
      setEventMetadata("VALIDV_COMBOPRVCOD","{handler:'validv_Comboprvcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOPRVCOD",",oparms:[]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV40EmprCod = "" ;
      Z396EmprCod = "" ;
      Z841TrnNom = "" ;
      Z3637TrnDom = "" ;
      Z3638TrnPob = "" ;
      Z3639TrnCpo = "" ;
      Z13867TrnCpo2 = "" ;
      Z3640TrnTel1 = "" ;
      Z3641TrnTel2 = "" ;
      Z3642TrnFax = "" ;
      Z3643TrnNif = "" ;
      Z3645TrnEmail = "" ;
      Z10776TrnMat = "" ;
      Combo_prvcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV40EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A841TrnNom = "" ;
      A3643TrnNif = "" ;
      A3637TrnDom = "" ;
      A3639TrnCpo = "" ;
      A13867TrnCpo2 = "" ;
      A3638TrnPob = "" ;
      lblTextblockprvcod_Jsonclick = "" ;
      ucCombo_prvcod = new com.genexus.webpanels.GXUserControl();
      Combo_prvcod_Caption = "" ;
      AV48PrvCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A10776TrnMat = "" ;
      A3645TrnEmail = "" ;
      A3640TrnTel1 = "" ;
      A3641TrnTel2 = "" ;
      A3642TrnFax = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A13738TrnCNom = "" ;
      A407EmprNom = "" ;
      A787PrvDsc = "" ;
      AV52Pgmname = "" ;
      Combo_prvcod_Objectcall = "" ;
      Combo_prvcod_Class = "" ;
      Combo_prvcod_Icontype = "" ;
      Combo_prvcod_Icon = "" ;
      Combo_prvcod_Tooltip = "" ;
      Combo_prvcod_Selectedvalue_set = "" ;
      Combo_prvcod_Selectedtext_set = "" ;
      Combo_prvcod_Selectedtext_get = "" ;
      Combo_prvcod_Gamoauthtoken = "" ;
      Combo_prvcod_Ddointernalname = "" ;
      Combo_prvcod_Titlecontrolalign = "" ;
      Combo_prvcod_Dropdownoptionstype = "" ;
      Combo_prvcod_Titlecontrolidtoreplace = "" ;
      Combo_prvcod_Datalisttype = "" ;
      Combo_prvcod_Datalistfixedvalues = "" ;
      Combo_prvcod_Datalistproc = "" ;
      Combo_prvcod_Datalistprocparametersprefix = "" ;
      Combo_prvcod_Remoteservicesparameters = "" ;
      Combo_prvcod_Htmltemplate = "" ;
      Combo_prvcod_Multiplevaluestype = "" ;
      Combo_prvcod_Loadingdata = "" ;
      Combo_prvcod_Noresultsfound = "" ;
      Combo_prvcod_Emptyitemtext = "" ;
      Combo_prvcod_Onlyselectedvalues = "" ;
      Combo_prvcod_Selectalltext = "" ;
      Combo_prvcod_Multiplevaluesseparator = "" ;
      Combo_prvcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode108 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV42WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV44WebSession = httpContext.getWebSession();
      AV46TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV49ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z787PrvDsc = "" ;
      T002K4_A407EmprNom = new String[] {""} ;
      T002K4_n407EmprNom = new boolean[] {false} ;
      T002K5_A787PrvDsc = new String[] {""} ;
      T002K5_n787PrvDsc = new boolean[] {false} ;
      T002K6_A840TrnCod = new short[1] ;
      T002K6_n840TrnCod = new boolean[] {false} ;
      T002K6_A841TrnNom = new String[] {""} ;
      T002K6_n841TrnNom = new boolean[] {false} ;
      T002K6_A3637TrnDom = new String[] {""} ;
      T002K6_n3637TrnDom = new boolean[] {false} ;
      T002K6_A3638TrnPob = new String[] {""} ;
      T002K6_n3638TrnPob = new boolean[] {false} ;
      T002K6_A3639TrnCpo = new String[] {""} ;
      T002K6_n3639TrnCpo = new boolean[] {false} ;
      T002K6_A13867TrnCpo2 = new String[] {""} ;
      T002K6_n13867TrnCpo2 = new boolean[] {false} ;
      T002K6_A787PrvDsc = new String[] {""} ;
      T002K6_n787PrvDsc = new boolean[] {false} ;
      T002K6_A3640TrnTel1 = new String[] {""} ;
      T002K6_n3640TrnTel1 = new boolean[] {false} ;
      T002K6_A3641TrnTel2 = new String[] {""} ;
      T002K6_n3641TrnTel2 = new boolean[] {false} ;
      T002K6_A3642TrnFax = new String[] {""} ;
      T002K6_n3642TrnFax = new boolean[] {false} ;
      T002K6_A3643TrnNif = new String[] {""} ;
      T002K6_n3643TrnNif = new boolean[] {false} ;
      T002K6_A3645TrnEmail = new String[] {""} ;
      T002K6_n3645TrnEmail = new boolean[] {false} ;
      T002K6_A407EmprNom = new String[] {""} ;
      T002K6_n407EmprNom = new boolean[] {false} ;
      T002K6_A10776TrnMat = new String[] {""} ;
      T002K6_n10776TrnMat = new boolean[] {false} ;
      T002K6_A396EmprCod = new String[] {""} ;
      T002K6_A781PrvCod = new short[1] ;
      T002K6_n781PrvCod = new boolean[] {false} ;
      T002K7_A787PrvDsc = new String[] {""} ;
      T002K7_n787PrvDsc = new boolean[] {false} ;
      T002K8_A396EmprCod = new String[] {""} ;
      T002K8_A840TrnCod = new short[1] ;
      T002K8_n840TrnCod = new boolean[] {false} ;
      T002K3_A840TrnCod = new short[1] ;
      T002K3_n840TrnCod = new boolean[] {false} ;
      T002K3_A841TrnNom = new String[] {""} ;
      T002K3_n841TrnNom = new boolean[] {false} ;
      T002K3_A3637TrnDom = new String[] {""} ;
      T002K3_n3637TrnDom = new boolean[] {false} ;
      T002K3_A3638TrnPob = new String[] {""} ;
      T002K3_n3638TrnPob = new boolean[] {false} ;
      T002K3_A3639TrnCpo = new String[] {""} ;
      T002K3_n3639TrnCpo = new boolean[] {false} ;
      T002K3_A13867TrnCpo2 = new String[] {""} ;
      T002K3_n13867TrnCpo2 = new boolean[] {false} ;
      T002K3_A3640TrnTel1 = new String[] {""} ;
      T002K3_n3640TrnTel1 = new boolean[] {false} ;
      T002K3_A3641TrnTel2 = new String[] {""} ;
      T002K3_n3641TrnTel2 = new boolean[] {false} ;
      T002K3_A3642TrnFax = new String[] {""} ;
      T002K3_n3642TrnFax = new boolean[] {false} ;
      T002K3_A3643TrnNif = new String[] {""} ;
      T002K3_n3643TrnNif = new boolean[] {false} ;
      T002K3_A3645TrnEmail = new String[] {""} ;
      T002K3_n3645TrnEmail = new boolean[] {false} ;
      T002K3_A10776TrnMat = new String[] {""} ;
      T002K3_n10776TrnMat = new boolean[] {false} ;
      T002K3_A396EmprCod = new String[] {""} ;
      T002K3_A781PrvCod = new short[1] ;
      T002K3_n781PrvCod = new boolean[] {false} ;
      T002K9_A396EmprCod = new String[] {""} ;
      T002K9_A840TrnCod = new short[1] ;
      T002K9_n840TrnCod = new boolean[] {false} ;
      T002K10_A396EmprCod = new String[] {""} ;
      T002K10_A840TrnCod = new short[1] ;
      T002K10_n840TrnCod = new boolean[] {false} ;
      T002K2_A840TrnCod = new short[1] ;
      T002K2_n840TrnCod = new boolean[] {false} ;
      T002K2_A841TrnNom = new String[] {""} ;
      T002K2_n841TrnNom = new boolean[] {false} ;
      T002K2_A3637TrnDom = new String[] {""} ;
      T002K2_n3637TrnDom = new boolean[] {false} ;
      T002K2_A3638TrnPob = new String[] {""} ;
      T002K2_n3638TrnPob = new boolean[] {false} ;
      T002K2_A3639TrnCpo = new String[] {""} ;
      T002K2_n3639TrnCpo = new boolean[] {false} ;
      T002K2_A13867TrnCpo2 = new String[] {""} ;
      T002K2_n13867TrnCpo2 = new boolean[] {false} ;
      T002K2_A3640TrnTel1 = new String[] {""} ;
      T002K2_n3640TrnTel1 = new boolean[] {false} ;
      T002K2_A3641TrnTel2 = new String[] {""} ;
      T002K2_n3641TrnTel2 = new boolean[] {false} ;
      T002K2_A3642TrnFax = new String[] {""} ;
      T002K2_n3642TrnFax = new boolean[] {false} ;
      T002K2_A3643TrnNif = new String[] {""} ;
      T002K2_n3643TrnNif = new boolean[] {false} ;
      T002K2_A3645TrnEmail = new String[] {""} ;
      T002K2_n3645TrnEmail = new boolean[] {false} ;
      T002K2_A10776TrnMat = new String[] {""} ;
      T002K2_n10776TrnMat = new boolean[] {false} ;
      T002K2_A396EmprCod = new String[] {""} ;
      T002K2_A781PrvCod = new short[1] ;
      T002K2_n781PrvCod = new boolean[] {false} ;
      T002K14_A787PrvDsc = new String[] {""} ;
      T002K14_n787PrvDsc = new boolean[] {false} ;
      T002K15_A396EmprCod = new String[] {""} ;
      T002K15_A13418AlbProID = new int[1] ;
      T002K16_A396EmprCod = new String[] {""} ;
      T002K16_A11669DevCruId = new int[1] ;
      T002K17_A396EmprCod = new String[] {""} ;
      T002K17_A4850DevComCod = new int[1] ;
      T002K18_A396EmprCod = new String[] {""} ;
      T002K18_A11103Nof_Hdr = new int[1] ;
      T002K18_A11104Nof_r = new byte[1] ;
      T002K18_A11105Nof_p = new String[] {""} ;
      T002K19_A396EmprCod = new String[] {""} ;
      T002K19_A840TrnCod = new short[1] ;
      T002K19_n840TrnCod = new boolean[] {false} ;
      T002K19_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T002K20_A396EmprCod = new String[] {""} ;
      T002K20_A252CliCod = new int[1] ;
      T002K20_A10978Bros_Art = new String[] {""} ;
      T002K21_A396EmprCod = new String[] {""} ;
      T002K21_A10588H_RecCod = new int[1] ;
      T002K22_A396EmprCod = new String[] {""} ;
      T002K22_A7566Su_AlbCod = new long[1] ;
      T002K23_A396EmprCod = new String[] {""} ;
      T002K23_A6235DevEmpCod = new int[1] ;
      T002K24_A396EmprCod = new String[] {""} ;
      T002K24_A3617AlbTrnCod = new long[1] ;
      T002K25_A396EmprCod = new String[] {""} ;
      T002K25_A2406ExhAlbCod = new int[1] ;
      T002K26_A396EmprCod = new String[] {""} ;
      T002K26_A2333ExtPdoAlb = new int[1] ;
      T002K27_A396EmprCod = new String[] {""} ;
      T002K27_A2253SalExtAlb = new int[1] ;
      T002K28_A396EmprCod = new String[] {""} ;
      T002K28_A966PartCod = new String[] {""} ;
      T002K28_A252CliCod = new int[1] ;
      T002K28_A979PartLin = new int[1] ;
      T002K29_A396EmprCod = new String[] {""} ;
      T002K29_A323DevGenCod = new int[1] ;
      T002K30_A396EmprCod = new String[] {""} ;
      T002K30_A44AlbRecCod = new int[1] ;
      T002K31_A396EmprCod = new String[] {""} ;
      T002K31_A30AlbProCod = new long[1] ;
      T002K32_A396EmprCod = new String[] {""} ;
      T002K32_A30AlbProCod = new long[1] ;
      T002K33_A396EmprCod = new String[] {""} ;
      T002K33_A30AlbProCod = new long[1] ;
      T002K34_A396EmprCod = new String[] {""} ;
      T002K34_A30AlbProCod = new long[1] ;
      T002K35_A396EmprCod = new String[] {""} ;
      T002K35_A30AlbProCod = new long[1] ;
      T002K36_A396EmprCod = new String[] {""} ;
      T002K36_A30AlbProCod = new long[1] ;
      T002K37_A396EmprCod = new String[] {""} ;
      T002K37_A30AlbProCod = new long[1] ;
      T002K38_A396EmprCod = new String[] {""} ;
      T002K38_A30AlbProCod = new long[1] ;
      T002K39_A396EmprCod = new String[] {""} ;
      T002K39_A30AlbProCod = new long[1] ;
      T002K40_A396EmprCod = new String[] {""} ;
      T002K40_A30AlbProCod = new long[1] ;
      T002K41_A396EmprCod = new String[] {""} ;
      T002K41_A30AlbProCod = new long[1] ;
      T002K42_A396EmprCod = new String[] {""} ;
      T002K42_A30AlbProCod = new long[1] ;
      T002K43_A396EmprCod = new String[] {""} ;
      T002K43_A30AlbProCod = new long[1] ;
      T002K44_A396EmprCod = new String[] {""} ;
      T002K44_A30AlbProCod = new long[1] ;
      T002K45_A396EmprCod = new String[] {""} ;
      T002K45_A30AlbProCod = new long[1] ;
      T002K46_A396EmprCod = new String[] {""} ;
      T002K46_A30AlbProCod = new long[1] ;
      T002K47_A396EmprCod = new String[] {""} ;
      T002K47_A30AlbProCod = new long[1] ;
      T002K48_A396EmprCod = new String[] {""} ;
      T002K48_A30AlbProCod = new long[1] ;
      T002K49_A396EmprCod = new String[] {""} ;
      T002K49_A30AlbProCod = new long[1] ;
      T002K50_A396EmprCod = new String[] {""} ;
      T002K50_A30AlbProCod = new long[1] ;
      T002K51_A396EmprCod = new String[] {""} ;
      T002K51_A30AlbProCod = new long[1] ;
      T002K52_A396EmprCod = new String[] {""} ;
      T002K52_A30AlbProCod = new long[1] ;
      T002K53_A396EmprCod = new String[] {""} ;
      T002K53_A30AlbProCod = new long[1] ;
      T002K54_A396EmprCod = new String[] {""} ;
      T002K54_A30AlbProCod = new long[1] ;
      T002K55_A396EmprCod = new String[] {""} ;
      T002K55_A30AlbProCod = new long[1] ;
      T002K56_A396EmprCod = new String[] {""} ;
      T002K56_A30AlbProCod = new long[1] ;
      T002K57_A396EmprCod = new String[] {""} ;
      T002K57_A30AlbProCod = new long[1] ;
      T002K58_A396EmprCod = new String[] {""} ;
      T002K58_A30AlbProCod = new long[1] ;
      T002K59_A396EmprCod = new String[] {""} ;
      T002K59_A30AlbProCod = new long[1] ;
      T002K60_A396EmprCod = new String[] {""} ;
      T002K60_A30AlbProCod = new long[1] ;
      T002K61_A396EmprCod = new String[] {""} ;
      T002K61_A30AlbProCod = new long[1] ;
      T002K62_A396EmprCod = new String[] {""} ;
      T002K62_A30AlbProCod = new long[1] ;
      T002K63_A396EmprCod = new String[] {""} ;
      T002K63_A30AlbProCod = new long[1] ;
      T002K64_A396EmprCod = new String[] {""} ;
      T002K64_A30AlbProCod = new long[1] ;
      T002K65_A396EmprCod = new String[] {""} ;
      T002K65_A30AlbProCod = new long[1] ;
      T002K66_A396EmprCod = new String[] {""} ;
      T002K66_A30AlbProCod = new long[1] ;
      T002K67_A396EmprCod = new String[] {""} ;
      T002K67_A30AlbProCod = new long[1] ;
      T002K68_A396EmprCod = new String[] {""} ;
      T002K68_A30AlbProCod = new long[1] ;
      T002K69_A396EmprCod = new String[] {""} ;
      T002K69_A30AlbProCod = new long[1] ;
      T002K70_A396EmprCod = new String[] {""} ;
      T002K70_A30AlbProCod = new long[1] ;
      T002K71_A396EmprCod = new String[] {""} ;
      T002K71_A30AlbProCod = new long[1] ;
      T002K72_A396EmprCod = new String[] {""} ;
      T002K72_A30AlbProCod = new long[1] ;
      T002K73_A396EmprCod = new String[] {""} ;
      T002K73_A30AlbProCod = new long[1] ;
      T002K74_A396EmprCod = new String[] {""} ;
      T002K74_A30AlbProCod = new long[1] ;
      T002K75_A396EmprCod = new String[] {""} ;
      T002K75_A30AlbProCod = new long[1] ;
      T002K76_A396EmprCod = new String[] {""} ;
      T002K76_A30AlbProCod = new long[1] ;
      T002K77_A396EmprCod = new String[] {""} ;
      T002K77_A30AlbProCod = new long[1] ;
      T002K78_A396EmprCod = new String[] {""} ;
      T002K78_A30AlbProCod = new long[1] ;
      T002K79_A396EmprCod = new String[] {""} ;
      T002K79_A30AlbProCod = new long[1] ;
      T002K80_A396EmprCod = new String[] {""} ;
      T002K80_A30AlbProCod = new long[1] ;
      T002K81_A396EmprCod = new String[] {""} ;
      T002K81_A30AlbProCod = new long[1] ;
      T002K82_A396EmprCod = new String[] {""} ;
      T002K82_A30AlbProCod = new long[1] ;
      T002K83_A396EmprCod = new String[] {""} ;
      T002K83_A30AlbProCod = new long[1] ;
      T002K84_A396EmprCod = new String[] {""} ;
      T002K84_A30AlbProCod = new long[1] ;
      T002K85_A396EmprCod = new String[] {""} ;
      T002K85_A30AlbProCod = new long[1] ;
      T002K86_A396EmprCod = new String[] {""} ;
      T002K86_A30AlbProCod = new long[1] ;
      T002K87_A396EmprCod = new String[] {""} ;
      T002K87_A30AlbProCod = new long[1] ;
      T002K88_A396EmprCod = new String[] {""} ;
      T002K88_A30AlbProCod = new long[1] ;
      T002K89_A396EmprCod = new String[] {""} ;
      T002K89_A30AlbProCod = new long[1] ;
      T002K90_A396EmprCod = new String[] {""} ;
      T002K90_A30AlbProCod = new long[1] ;
      T002K91_A396EmprCod = new String[] {""} ;
      T002K91_A30AlbProCod = new long[1] ;
      T002K92_A396EmprCod = new String[] {""} ;
      T002K92_A30AlbProCod = new long[1] ;
      T002K93_A396EmprCod = new String[] {""} ;
      T002K93_A30AlbProCod = new long[1] ;
      T002K94_A396EmprCod = new String[] {""} ;
      T002K94_A30AlbProCod = new long[1] ;
      T002K95_A396EmprCod = new String[] {""} ;
      T002K95_A30AlbProCod = new long[1] ;
      T002K96_A396EmprCod = new String[] {""} ;
      T002K96_A30AlbProCod = new long[1] ;
      T002K97_A396EmprCod = new String[] {""} ;
      T002K97_A30AlbProCod = new long[1] ;
      T002K98_A396EmprCod = new String[] {""} ;
      T002K98_A30AlbProCod = new long[1] ;
      T002K99_A396EmprCod = new String[] {""} ;
      T002K99_A30AlbProCod = new long[1] ;
      T002K100_A396EmprCod = new String[] {""} ;
      T002K100_A30AlbProCod = new long[1] ;
      T002K101_A396EmprCod = new String[] {""} ;
      T002K101_A30AlbProCod = new long[1] ;
      T002K102_A396EmprCod = new String[] {""} ;
      T002K102_A30AlbProCod = new long[1] ;
      T002K103_A396EmprCod = new String[] {""} ;
      T002K103_A30AlbProCod = new long[1] ;
      T002K104_A396EmprCod = new String[] {""} ;
      T002K104_A30AlbProCod = new long[1] ;
      T002K105_A396EmprCod = new String[] {""} ;
      T002K105_A30AlbProCod = new long[1] ;
      T002K106_A396EmprCod = new String[] {""} ;
      T002K106_A30AlbProCod = new long[1] ;
      T002K107_A396EmprCod = new String[] {""} ;
      T002K107_A30AlbProCod = new long[1] ;
      T002K108_A396EmprCod = new String[] {""} ;
      T002K108_A30AlbProCod = new long[1] ;
      T002K109_A396EmprCod = new String[] {""} ;
      T002K109_A30AlbProCod = new long[1] ;
      T002K110_A396EmprCod = new String[] {""} ;
      T002K110_A30AlbProCod = new long[1] ;
      T002K111_A396EmprCod = new String[] {""} ;
      T002K111_A30AlbProCod = new long[1] ;
      T002K112_A396EmprCod = new String[] {""} ;
      T002K112_A30AlbProCod = new long[1] ;
      T002K113_A396EmprCod = new String[] {""} ;
      T002K113_A30AlbProCod = new long[1] ;
      T002K114_A396EmprCod = new String[] {""} ;
      T002K114_A30AlbProCod = new long[1] ;
      T002K115_A396EmprCod = new String[] {""} ;
      T002K115_A30AlbProCod = new long[1] ;
      T002K116_A396EmprCod = new String[] {""} ;
      T002K116_A30AlbProCod = new long[1] ;
      T002K117_A396EmprCod = new String[] {""} ;
      T002K117_A30AlbProCod = new long[1] ;
      T002K118_A396EmprCod = new String[] {""} ;
      T002K118_A30AlbProCod = new long[1] ;
      T002K119_A396EmprCod = new String[] {""} ;
      T002K119_A30AlbProCod = new long[1] ;
      T002K120_A396EmprCod = new String[] {""} ;
      T002K120_A30AlbProCod = new long[1] ;
      T002K121_A396EmprCod = new String[] {""} ;
      T002K121_A30AlbProCod = new long[1] ;
      T002K122_A396EmprCod = new String[] {""} ;
      T002K122_A30AlbProCod = new long[1] ;
      T002K123_A396EmprCod = new String[] {""} ;
      T002K123_A30AlbProCod = new long[1] ;
      T002K124_A396EmprCod = new String[] {""} ;
      T002K124_A30AlbProCod = new long[1] ;
      T002K125_A396EmprCod = new String[] {""} ;
      T002K125_A30AlbProCod = new long[1] ;
      T002K126_A396EmprCod = new String[] {""} ;
      T002K126_A30AlbProCod = new long[1] ;
      T002K127_A396EmprCod = new String[] {""} ;
      T002K127_A14AlbComCod = new int[1] ;
      T002K128_A396EmprCod = new String[] {""} ;
      T002K128_A840TrnCod = new short[1] ;
      T002K128_n840TrnCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int11 = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttransp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttransp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttransp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttransp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttransp__default(),
         new Object[] {
             new Object[] {
            T002K2_A840TrnCod, T002K2_A841TrnNom, T002K2_n841TrnNom, T002K2_A3637TrnDom, T002K2_n3637TrnDom, T002K2_A3638TrnPob, T002K2_n3638TrnPob, T002K2_A3639TrnCpo, T002K2_n3639TrnCpo, T002K2_A13867TrnCpo2,
            T002K2_n13867TrnCpo2, T002K2_A3640TrnTel1, T002K2_n3640TrnTel1, T002K2_A3641TrnTel2, T002K2_n3641TrnTel2, T002K2_A3642TrnFax, T002K2_n3642TrnFax, T002K2_A3643TrnNif, T002K2_n3643TrnNif, T002K2_A3645TrnEmail,
            T002K2_n3645TrnEmail, T002K2_A10776TrnMat, T002K2_n10776TrnMat, T002K2_A396EmprCod, T002K2_A781PrvCod, T002K2_n781PrvCod
            }
            , new Object[] {
            T002K3_A840TrnCod, T002K3_A841TrnNom, T002K3_n841TrnNom, T002K3_A3637TrnDom, T002K3_n3637TrnDom, T002K3_A3638TrnPob, T002K3_n3638TrnPob, T002K3_A3639TrnCpo, T002K3_n3639TrnCpo, T002K3_A13867TrnCpo2,
            T002K3_n13867TrnCpo2, T002K3_A3640TrnTel1, T002K3_n3640TrnTel1, T002K3_A3641TrnTel2, T002K3_n3641TrnTel2, T002K3_A3642TrnFax, T002K3_n3642TrnFax, T002K3_A3643TrnNif, T002K3_n3643TrnNif, T002K3_A3645TrnEmail,
            T002K3_n3645TrnEmail, T002K3_A10776TrnMat, T002K3_n10776TrnMat, T002K3_A396EmprCod, T002K3_A781PrvCod, T002K3_n781PrvCod
            }
            , new Object[] {
            T002K4_A407EmprNom, T002K4_n407EmprNom
            }
            , new Object[] {
            T002K5_A787PrvDsc, T002K5_n787PrvDsc
            }
            , new Object[] {
            T002K6_A840TrnCod, T002K6_A841TrnNom, T002K6_n841TrnNom, T002K6_A3637TrnDom, T002K6_n3637TrnDom, T002K6_A3638TrnPob, T002K6_n3638TrnPob, T002K6_A3639TrnCpo, T002K6_n3639TrnCpo, T002K6_A13867TrnCpo2,
            T002K6_n13867TrnCpo2, T002K6_A787PrvDsc, T002K6_n787PrvDsc, T002K6_A3640TrnTel1, T002K6_n3640TrnTel1, T002K6_A3641TrnTel2, T002K6_n3641TrnTel2, T002K6_A3642TrnFax, T002K6_n3642TrnFax, T002K6_A3643TrnNif,
            T002K6_n3643TrnNif, T002K6_A3645TrnEmail, T002K6_n3645TrnEmail, T002K6_A407EmprNom, T002K6_n407EmprNom, T002K6_A10776TrnMat, T002K6_n10776TrnMat, T002K6_A396EmprCod, T002K6_A781PrvCod, T002K6_n781PrvCod
            }
            , new Object[] {
            T002K7_A787PrvDsc, T002K7_n787PrvDsc
            }
            , new Object[] {
            T002K8_A396EmprCod, T002K8_A840TrnCod
            }
            , new Object[] {
            T002K9_A396EmprCod, T002K9_A840TrnCod
            }
            , new Object[] {
            T002K10_A396EmprCod, T002K10_A840TrnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002K14_A787PrvDsc, T002K14_n787PrvDsc
            }
            , new Object[] {
            T002K15_A396EmprCod, T002K15_A13418AlbProID
            }
            , new Object[] {
            T002K16_A396EmprCod, T002K16_A11669DevCruId
            }
            , new Object[] {
            T002K17_A396EmprCod, T002K17_A4850DevComCod
            }
            , new Object[] {
            T002K18_A396EmprCod, T002K18_A11103Nof_Hdr, T002K18_A11104Nof_r, T002K18_A11105Nof_p
            }
            , new Object[] {
            T002K19_A396EmprCod, T002K19_A840TrnCod, T002K19_A11061Trn_Diaf
            }
            , new Object[] {
            T002K20_A396EmprCod, T002K20_A252CliCod, T002K20_A10978Bros_Art
            }
            , new Object[] {
            T002K21_A396EmprCod, T002K21_A10588H_RecCod
            }
            , new Object[] {
            T002K22_A396EmprCod, T002K22_A7566Su_AlbCod
            }
            , new Object[] {
            T002K23_A396EmprCod, T002K23_A6235DevEmpCod
            }
            , new Object[] {
            T002K24_A396EmprCod, T002K24_A3617AlbTrnCod
            }
            , new Object[] {
            T002K25_A396EmprCod, T002K25_A2406ExhAlbCod
            }
            , new Object[] {
            T002K26_A396EmprCod, T002K26_A2333ExtPdoAlb
            }
            , new Object[] {
            T002K27_A396EmprCod, T002K27_A2253SalExtAlb
            }
            , new Object[] {
            T002K28_A396EmprCod, T002K28_A966PartCod, T002K28_A252CliCod, T002K28_A979PartLin
            }
            , new Object[] {
            T002K29_A396EmprCod, T002K29_A323DevGenCod
            }
            , new Object[] {
            T002K30_A396EmprCod, T002K30_A44AlbRecCod
            }
            , new Object[] {
            T002K31_A396EmprCod, T002K31_A30AlbProCod
            }
            , new Object[] {
            T002K32_A396EmprCod, T002K32_A30AlbProCod
            }
            , new Object[] {
            T002K33_A396EmprCod, T002K33_A30AlbProCod
            }
            , new Object[] {
            T002K34_A396EmprCod, T002K34_A30AlbProCod
            }
            , new Object[] {
            T002K35_A396EmprCod, T002K35_A30AlbProCod
            }
            , new Object[] {
            T002K36_A396EmprCod, T002K36_A30AlbProCod
            }
            , new Object[] {
            T002K37_A396EmprCod, T002K37_A30AlbProCod
            }
            , new Object[] {
            T002K38_A396EmprCod, T002K38_A30AlbProCod
            }
            , new Object[] {
            T002K39_A396EmprCod, T002K39_A30AlbProCod
            }
            , new Object[] {
            T002K40_A396EmprCod, T002K40_A30AlbProCod
            }
            , new Object[] {
            T002K41_A396EmprCod, T002K41_A30AlbProCod
            }
            , new Object[] {
            T002K42_A396EmprCod, T002K42_A30AlbProCod
            }
            , new Object[] {
            T002K43_A396EmprCod, T002K43_A30AlbProCod
            }
            , new Object[] {
            T002K44_A396EmprCod, T002K44_A30AlbProCod
            }
            , new Object[] {
            T002K45_A396EmprCod, T002K45_A30AlbProCod
            }
            , new Object[] {
            T002K46_A396EmprCod, T002K46_A30AlbProCod
            }
            , new Object[] {
            T002K47_A396EmprCod, T002K47_A30AlbProCod
            }
            , new Object[] {
            T002K48_A396EmprCod, T002K48_A30AlbProCod
            }
            , new Object[] {
            T002K49_A396EmprCod, T002K49_A30AlbProCod
            }
            , new Object[] {
            T002K50_A396EmprCod, T002K50_A30AlbProCod
            }
            , new Object[] {
            T002K51_A396EmprCod, T002K51_A30AlbProCod
            }
            , new Object[] {
            T002K52_A396EmprCod, T002K52_A30AlbProCod
            }
            , new Object[] {
            T002K53_A396EmprCod, T002K53_A30AlbProCod
            }
            , new Object[] {
            T002K54_A396EmprCod, T002K54_A30AlbProCod
            }
            , new Object[] {
            T002K55_A396EmprCod, T002K55_A30AlbProCod
            }
            , new Object[] {
            T002K56_A396EmprCod, T002K56_A30AlbProCod
            }
            , new Object[] {
            T002K57_A396EmprCod, T002K57_A30AlbProCod
            }
            , new Object[] {
            T002K58_A396EmprCod, T002K58_A30AlbProCod
            }
            , new Object[] {
            T002K59_A396EmprCod, T002K59_A30AlbProCod
            }
            , new Object[] {
            T002K60_A396EmprCod, T002K60_A30AlbProCod
            }
            , new Object[] {
            T002K61_A396EmprCod, T002K61_A30AlbProCod
            }
            , new Object[] {
            T002K62_A396EmprCod, T002K62_A30AlbProCod
            }
            , new Object[] {
            T002K63_A396EmprCod, T002K63_A30AlbProCod
            }
            , new Object[] {
            T002K64_A396EmprCod, T002K64_A30AlbProCod
            }
            , new Object[] {
            T002K65_A396EmprCod, T002K65_A30AlbProCod
            }
            , new Object[] {
            T002K66_A396EmprCod, T002K66_A30AlbProCod
            }
            , new Object[] {
            T002K67_A396EmprCod, T002K67_A30AlbProCod
            }
            , new Object[] {
            T002K68_A396EmprCod, T002K68_A30AlbProCod
            }
            , new Object[] {
            T002K69_A396EmprCod, T002K69_A30AlbProCod
            }
            , new Object[] {
            T002K70_A396EmprCod, T002K70_A30AlbProCod
            }
            , new Object[] {
            T002K71_A396EmprCod, T002K71_A30AlbProCod
            }
            , new Object[] {
            T002K72_A396EmprCod, T002K72_A30AlbProCod
            }
            , new Object[] {
            T002K73_A396EmprCod, T002K73_A30AlbProCod
            }
            , new Object[] {
            T002K74_A396EmprCod, T002K74_A30AlbProCod
            }
            , new Object[] {
            T002K75_A396EmprCod, T002K75_A30AlbProCod
            }
            , new Object[] {
            T002K76_A396EmprCod, T002K76_A30AlbProCod
            }
            , new Object[] {
            T002K77_A396EmprCod, T002K77_A30AlbProCod
            }
            , new Object[] {
            T002K78_A396EmprCod, T002K78_A30AlbProCod
            }
            , new Object[] {
            T002K79_A396EmprCod, T002K79_A30AlbProCod
            }
            , new Object[] {
            T002K80_A396EmprCod, T002K80_A30AlbProCod
            }
            , new Object[] {
            T002K81_A396EmprCod, T002K81_A30AlbProCod
            }
            , new Object[] {
            T002K82_A396EmprCod, T002K82_A30AlbProCod
            }
            , new Object[] {
            T002K83_A396EmprCod, T002K83_A30AlbProCod
            }
            , new Object[] {
            T002K84_A396EmprCod, T002K84_A30AlbProCod
            }
            , new Object[] {
            T002K85_A396EmprCod, T002K85_A30AlbProCod
            }
            , new Object[] {
            T002K86_A396EmprCod, T002K86_A30AlbProCod
            }
            , new Object[] {
            T002K87_A396EmprCod, T002K87_A30AlbProCod
            }
            , new Object[] {
            T002K88_A396EmprCod, T002K88_A30AlbProCod
            }
            , new Object[] {
            T002K89_A396EmprCod, T002K89_A30AlbProCod
            }
            , new Object[] {
            T002K90_A396EmprCod, T002K90_A30AlbProCod
            }
            , new Object[] {
            T002K91_A396EmprCod, T002K91_A30AlbProCod
            }
            , new Object[] {
            T002K92_A396EmprCod, T002K92_A30AlbProCod
            }
            , new Object[] {
            T002K93_A396EmprCod, T002K93_A30AlbProCod
            }
            , new Object[] {
            T002K94_A396EmprCod, T002K94_A30AlbProCod
            }
            , new Object[] {
            T002K95_A396EmprCod, T002K95_A30AlbProCod
            }
            , new Object[] {
            T002K96_A396EmprCod, T002K96_A30AlbProCod
            }
            , new Object[] {
            T002K97_A396EmprCod, T002K97_A30AlbProCod
            }
            , new Object[] {
            T002K98_A396EmprCod, T002K98_A30AlbProCod
            }
            , new Object[] {
            T002K99_A396EmprCod, T002K99_A30AlbProCod
            }
            , new Object[] {
            T002K100_A396EmprCod, T002K100_A30AlbProCod
            }
            , new Object[] {
            T002K101_A396EmprCod, T002K101_A30AlbProCod
            }
            , new Object[] {
            T002K102_A396EmprCod, T002K102_A30AlbProCod
            }
            , new Object[] {
            T002K103_A396EmprCod, T002K103_A30AlbProCod
            }
            , new Object[] {
            T002K104_A396EmprCod, T002K104_A30AlbProCod
            }
            , new Object[] {
            T002K105_A396EmprCod, T002K105_A30AlbProCod
            }
            , new Object[] {
            T002K106_A396EmprCod, T002K106_A30AlbProCod
            }
            , new Object[] {
            T002K107_A396EmprCod, T002K107_A30AlbProCod
            }
            , new Object[] {
            T002K108_A396EmprCod, T002K108_A30AlbProCod
            }
            , new Object[] {
            T002K109_A396EmprCod, T002K109_A30AlbProCod
            }
            , new Object[] {
            T002K110_A396EmprCod, T002K110_A30AlbProCod
            }
            , new Object[] {
            T002K111_A396EmprCod, T002K111_A30AlbProCod
            }
            , new Object[] {
            T002K112_A396EmprCod, T002K112_A30AlbProCod
            }
            , new Object[] {
            T002K113_A396EmprCod, T002K113_A30AlbProCod
            }
            , new Object[] {
            T002K114_A396EmprCod, T002K114_A30AlbProCod
            }
            , new Object[] {
            T002K115_A396EmprCod, T002K115_A30AlbProCod
            }
            , new Object[] {
            T002K116_A396EmprCod, T002K116_A30AlbProCod
            }
            , new Object[] {
            T002K117_A396EmprCod, T002K117_A30AlbProCod
            }
            , new Object[] {
            T002K118_A396EmprCod, T002K118_A30AlbProCod
            }
            , new Object[] {
            T002K119_A396EmprCod, T002K119_A30AlbProCod
            }
            , new Object[] {
            T002K120_A396EmprCod, T002K120_A30AlbProCod
            }
            , new Object[] {
            T002K121_A396EmprCod, T002K121_A30AlbProCod
            }
            , new Object[] {
            T002K122_A396EmprCod, T002K122_A30AlbProCod
            }
            , new Object[] {
            T002K123_A396EmprCod, T002K123_A30AlbProCod
            }
            , new Object[] {
            T002K124_A396EmprCod, T002K124_A30AlbProCod
            }
            , new Object[] {
            T002K125_A396EmprCod, T002K125_A30AlbProCod
            }
            , new Object[] {
            T002K126_A396EmprCod, T002K126_A30AlbProCod
            }
            , new Object[] {
            T002K127_A396EmprCod, T002K127_A14AlbComCod
            }
            , new Object[] {
            T002K128_A396EmprCod, T002K128_A840TrnCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV52Pgmname = "FicherosBasicos.TTRANSP" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV47TrnCod ;
   private short Z840TrnCod ;
   private short Z781PrvCod ;
   private short N781PrvCod ;
   private short AV47TrnCod ;
   private short A840TrnCod ;
   private short AV51autonumber ;
   private short A781PrvCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV50ComboPrvCod ;
   private short AV45Insert_PrvCod ;
   private short RcdFound108 ;
   private short nIsDirty_108 ;
   private short GXt_int10 ;
   private short GXv_int11[] ;
   private int trnEnded ;
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtTrnNif_Enabled ;
   private int edtTrnDom_Enabled ;
   private int edtTrnCpo_Enabled ;
   private int edtTrnCpo2_Enabled ;
   private int edtTrnPob_Enabled ;
   private int edtPrvCod_Visible ;
   private int edtPrvCod_Enabled ;
   private int edtTrnMat_Enabled ;
   private int edtTrnEmail_Enabled ;
   private int edtTrnTel1_Enabled ;
   private int edtTrnTel2_Enabled ;
   private int edtTrnFax_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavComboprvcod_Enabled ;
   private int edtavComboprvcod_Visible ;
   private int Combo_prvcod_Datalistupdateminimumcharacters ;
   private int AV53GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV40EmprCod ;
   private String Z396EmprCod ;
   private String Z841TrnNom ;
   private String Z3637TrnDom ;
   private String Z3638TrnPob ;
   private String Z3639TrnCpo ;
   private String Z13867TrnCpo2 ;
   private String Z3640TrnTel1 ;
   private String Z3641TrnTel2 ;
   private String Z3642TrnFax ;
   private String Z3643TrnNif ;
   private String Z3645TrnEmail ;
   private String Z10776TrnMat ;
   private String Combo_prvcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV40EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTrnCod_Internalname ;
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
   private String edtTrnCod_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String edtTrnNif_Internalname ;
   private String A3643TrnNif ;
   private String edtTrnNif_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtTrnDom_Internalname ;
   private String A3637TrnDom ;
   private String edtTrnDom_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtTrnCpo_Internalname ;
   private String A3639TrnCpo ;
   private String edtTrnCpo_Jsonclick ;
   private String edtTrnCpo2_Internalname ;
   private String A13867TrnCpo2 ;
   private String edtTrnCpo2_Jsonclick ;
   private String edtTrnPob_Internalname ;
   private String A3638TrnPob ;
   private String edtTrnPob_Jsonclick ;
   private String divTablesplittedprvcod_Internalname ;
   private String lblTextblockprvcod_Internalname ;
   private String lblTextblockprvcod_Jsonclick ;
   private String Combo_prvcod_Caption ;
   private String Combo_prvcod_Cls ;
   private String Combo_prvcod_Internalname ;
   private String edtPrvCod_Internalname ;
   private String edtPrvCod_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtTrnMat_Internalname ;
   private String A10776TrnMat ;
   private String edtTrnMat_Jsonclick ;
   private String edtTrnEmail_Internalname ;
   private String A3645TrnEmail ;
   private String edtTrnEmail_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtTrnTel1_Internalname ;
   private String A3640TrnTel1 ;
   private String edtTrnTel1_Jsonclick ;
   private String edtTrnTel2_Internalname ;
   private String A3641TrnTel2 ;
   private String edtTrnTel2_Jsonclick ;
   private String edtTrnFax_Internalname ;
   private String A3642TrnFax ;
   private String edtTrnFax_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_prvcod_Internalname ;
   private String edtavComboprvcod_Internalname ;
   private String edtavComboprvcod_Jsonclick ;
   private String A407EmprNom ;
   private String A787PrvDsc ;
   private String AV52Pgmname ;
   private String Combo_prvcod_Objectcall ;
   private String Combo_prvcod_Class ;
   private String Combo_prvcod_Icontype ;
   private String Combo_prvcod_Icon ;
   private String Combo_prvcod_Tooltip ;
   private String Combo_prvcod_Selectedvalue_set ;
   private String Combo_prvcod_Selectedtext_set ;
   private String Combo_prvcod_Selectedtext_get ;
   private String Combo_prvcod_Gamoauthtoken ;
   private String Combo_prvcod_Ddointernalname ;
   private String Combo_prvcod_Titlecontrolalign ;
   private String Combo_prvcod_Dropdownoptionstype ;
   private String Combo_prvcod_Titlecontrolidtoreplace ;
   private String Combo_prvcod_Datalisttype ;
   private String Combo_prvcod_Datalistfixedvalues ;
   private String Combo_prvcod_Datalistproc ;
   private String Combo_prvcod_Datalistprocparametersprefix ;
   private String Combo_prvcod_Remoteservicesparameters ;
   private String Combo_prvcod_Htmltemplate ;
   private String Combo_prvcod_Multiplevaluestype ;
   private String Combo_prvcod_Loadingdata ;
   private String Combo_prvcod_Noresultsfound ;
   private String Combo_prvcod_Emptyitemtext ;
   private String Combo_prvcod_Onlyselectedvalues ;
   private String Combo_prvcod_Selectalltext ;
   private String Combo_prvcod_Multiplevaluesseparator ;
   private String Combo_prvcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode108 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z787PrvDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean n781PrvCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prvcod_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n787PrvDsc ;
   private boolean Combo_prvcod_Enabled ;
   private boolean Combo_prvcod_Visible ;
   private boolean Combo_prvcod_Allowmultipleselection ;
   private boolean Combo_prvcod_Isgriditem ;
   private boolean Combo_prvcod_Hasdescription ;
   private boolean Combo_prvcod_Includeonlyselectedoption ;
   private boolean Combo_prvcod_Includeselectalloption ;
   private boolean Combo_prvcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n841TrnNom ;
   private boolean n3643TrnNif ;
   private boolean n3637TrnDom ;
   private boolean n3639TrnCpo ;
   private boolean n13867TrnCpo2 ;
   private boolean n3638TrnPob ;
   private boolean n10776TrnMat ;
   private boolean n3645TrnEmail ;
   private boolean n3640TrnTel1 ;
   private boolean n3641TrnTel2 ;
   private boolean n3642TrnFax ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13738TrnCNom ;
   private String AV49ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV44WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prvcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T002K4_A407EmprNom ;
   private boolean[] T002K4_n407EmprNom ;
   private String[] T002K5_A787PrvDsc ;
   private boolean[] T002K5_n787PrvDsc ;
   private short[] T002K6_A840TrnCod ;
   private boolean[] T002K6_n840TrnCod ;
   private String[] T002K6_A841TrnNom ;
   private boolean[] T002K6_n841TrnNom ;
   private String[] T002K6_A3637TrnDom ;
   private boolean[] T002K6_n3637TrnDom ;
   private String[] T002K6_A3638TrnPob ;
   private boolean[] T002K6_n3638TrnPob ;
   private String[] T002K6_A3639TrnCpo ;
   private boolean[] T002K6_n3639TrnCpo ;
   private String[] T002K6_A13867TrnCpo2 ;
   private boolean[] T002K6_n13867TrnCpo2 ;
   private String[] T002K6_A787PrvDsc ;
   private boolean[] T002K6_n787PrvDsc ;
   private String[] T002K6_A3640TrnTel1 ;
   private boolean[] T002K6_n3640TrnTel1 ;
   private String[] T002K6_A3641TrnTel2 ;
   private boolean[] T002K6_n3641TrnTel2 ;
   private String[] T002K6_A3642TrnFax ;
   private boolean[] T002K6_n3642TrnFax ;
   private String[] T002K6_A3643TrnNif ;
   private boolean[] T002K6_n3643TrnNif ;
   private String[] T002K6_A3645TrnEmail ;
   private boolean[] T002K6_n3645TrnEmail ;
   private String[] T002K6_A407EmprNom ;
   private boolean[] T002K6_n407EmprNom ;
   private String[] T002K6_A10776TrnMat ;
   private boolean[] T002K6_n10776TrnMat ;
   private String[] T002K6_A396EmprCod ;
   private short[] T002K6_A781PrvCod ;
   private boolean[] T002K6_n781PrvCod ;
   private String[] T002K7_A787PrvDsc ;
   private boolean[] T002K7_n787PrvDsc ;
   private String[] T002K8_A396EmprCod ;
   private short[] T002K8_A840TrnCod ;
   private boolean[] T002K8_n840TrnCod ;
   private short[] T002K3_A840TrnCod ;
   private boolean[] T002K3_n840TrnCod ;
   private String[] T002K3_A841TrnNom ;
   private boolean[] T002K3_n841TrnNom ;
   private String[] T002K3_A3637TrnDom ;
   private boolean[] T002K3_n3637TrnDom ;
   private String[] T002K3_A3638TrnPob ;
   private boolean[] T002K3_n3638TrnPob ;
   private String[] T002K3_A3639TrnCpo ;
   private boolean[] T002K3_n3639TrnCpo ;
   private String[] T002K3_A13867TrnCpo2 ;
   private boolean[] T002K3_n13867TrnCpo2 ;
   private String[] T002K3_A3640TrnTel1 ;
   private boolean[] T002K3_n3640TrnTel1 ;
   private String[] T002K3_A3641TrnTel2 ;
   private boolean[] T002K3_n3641TrnTel2 ;
   private String[] T002K3_A3642TrnFax ;
   private boolean[] T002K3_n3642TrnFax ;
   private String[] T002K3_A3643TrnNif ;
   private boolean[] T002K3_n3643TrnNif ;
   private String[] T002K3_A3645TrnEmail ;
   private boolean[] T002K3_n3645TrnEmail ;
   private String[] T002K3_A10776TrnMat ;
   private boolean[] T002K3_n10776TrnMat ;
   private String[] T002K3_A396EmprCod ;
   private short[] T002K3_A781PrvCod ;
   private boolean[] T002K3_n781PrvCod ;
   private String[] T002K9_A396EmprCod ;
   private short[] T002K9_A840TrnCod ;
   private boolean[] T002K9_n840TrnCod ;
   private String[] T002K10_A396EmprCod ;
   private short[] T002K10_A840TrnCod ;
   private boolean[] T002K10_n840TrnCod ;
   private short[] T002K2_A840TrnCod ;
   private boolean[] T002K2_n840TrnCod ;
   private String[] T002K2_A841TrnNom ;
   private boolean[] T002K2_n841TrnNom ;
   private String[] T002K2_A3637TrnDom ;
   private boolean[] T002K2_n3637TrnDom ;
   private String[] T002K2_A3638TrnPob ;
   private boolean[] T002K2_n3638TrnPob ;
   private String[] T002K2_A3639TrnCpo ;
   private boolean[] T002K2_n3639TrnCpo ;
   private String[] T002K2_A13867TrnCpo2 ;
   private boolean[] T002K2_n13867TrnCpo2 ;
   private String[] T002K2_A3640TrnTel1 ;
   private boolean[] T002K2_n3640TrnTel1 ;
   private String[] T002K2_A3641TrnTel2 ;
   private boolean[] T002K2_n3641TrnTel2 ;
   private String[] T002K2_A3642TrnFax ;
   private boolean[] T002K2_n3642TrnFax ;
   private String[] T002K2_A3643TrnNif ;
   private boolean[] T002K2_n3643TrnNif ;
   private String[] T002K2_A3645TrnEmail ;
   private boolean[] T002K2_n3645TrnEmail ;
   private String[] T002K2_A10776TrnMat ;
   private boolean[] T002K2_n10776TrnMat ;
   private String[] T002K2_A396EmprCod ;
   private short[] T002K2_A781PrvCod ;
   private boolean[] T002K2_n781PrvCod ;
   private String[] T002K14_A787PrvDsc ;
   private boolean[] T002K14_n787PrvDsc ;
   private String[] T002K15_A396EmprCod ;
   private int[] T002K15_A13418AlbProID ;
   private String[] T002K16_A396EmprCod ;
   private int[] T002K16_A11669DevCruId ;
   private String[] T002K17_A396EmprCod ;
   private int[] T002K17_A4850DevComCod ;
   private String[] T002K18_A396EmprCod ;
   private int[] T002K18_A11103Nof_Hdr ;
   private byte[] T002K18_A11104Nof_r ;
   private String[] T002K18_A11105Nof_p ;
   private String[] T002K19_A396EmprCod ;
   private short[] T002K19_A840TrnCod ;
   private boolean[] T002K19_n840TrnCod ;
   private java.util.Date[] T002K19_A11061Trn_Diaf ;
   private String[] T002K20_A396EmprCod ;
   private int[] T002K20_A252CliCod ;
   private String[] T002K20_A10978Bros_Art ;
   private String[] T002K21_A396EmprCod ;
   private int[] T002K21_A10588H_RecCod ;
   private String[] T002K22_A396EmprCod ;
   private long[] T002K22_A7566Su_AlbCod ;
   private String[] T002K23_A396EmprCod ;
   private int[] T002K23_A6235DevEmpCod ;
   private String[] T002K24_A396EmprCod ;
   private long[] T002K24_A3617AlbTrnCod ;
   private String[] T002K25_A396EmprCod ;
   private int[] T002K25_A2406ExhAlbCod ;
   private String[] T002K26_A396EmprCod ;
   private int[] T002K26_A2333ExtPdoAlb ;
   private String[] T002K27_A396EmprCod ;
   private int[] T002K27_A2253SalExtAlb ;
   private String[] T002K28_A396EmprCod ;
   private String[] T002K28_A966PartCod ;
   private int[] T002K28_A252CliCod ;
   private int[] T002K28_A979PartLin ;
   private String[] T002K29_A396EmprCod ;
   private int[] T002K29_A323DevGenCod ;
   private String[] T002K30_A396EmprCod ;
   private int[] T002K30_A44AlbRecCod ;
   private String[] T002K31_A396EmprCod ;
   private long[] T002K31_A30AlbProCod ;
   private String[] T002K32_A396EmprCod ;
   private long[] T002K32_A30AlbProCod ;
   private String[] T002K33_A396EmprCod ;
   private long[] T002K33_A30AlbProCod ;
   private String[] T002K34_A396EmprCod ;
   private long[] T002K34_A30AlbProCod ;
   private String[] T002K35_A396EmprCod ;
   private long[] T002K35_A30AlbProCod ;
   private String[] T002K36_A396EmprCod ;
   private long[] T002K36_A30AlbProCod ;
   private String[] T002K37_A396EmprCod ;
   private long[] T002K37_A30AlbProCod ;
   private String[] T002K38_A396EmprCod ;
   private long[] T002K38_A30AlbProCod ;
   private String[] T002K39_A396EmprCod ;
   private long[] T002K39_A30AlbProCod ;
   private String[] T002K40_A396EmprCod ;
   private long[] T002K40_A30AlbProCod ;
   private String[] T002K41_A396EmprCod ;
   private long[] T002K41_A30AlbProCod ;
   private String[] T002K42_A396EmprCod ;
   private long[] T002K42_A30AlbProCod ;
   private String[] T002K43_A396EmprCod ;
   private long[] T002K43_A30AlbProCod ;
   private String[] T002K44_A396EmprCod ;
   private long[] T002K44_A30AlbProCod ;
   private String[] T002K45_A396EmprCod ;
   private long[] T002K45_A30AlbProCod ;
   private String[] T002K46_A396EmprCod ;
   private long[] T002K46_A30AlbProCod ;
   private String[] T002K47_A396EmprCod ;
   private long[] T002K47_A30AlbProCod ;
   private String[] T002K48_A396EmprCod ;
   private long[] T002K48_A30AlbProCod ;
   private String[] T002K49_A396EmprCod ;
   private long[] T002K49_A30AlbProCod ;
   private String[] T002K50_A396EmprCod ;
   private long[] T002K50_A30AlbProCod ;
   private String[] T002K51_A396EmprCod ;
   private long[] T002K51_A30AlbProCod ;
   private String[] T002K52_A396EmprCod ;
   private long[] T002K52_A30AlbProCod ;
   private String[] T002K53_A396EmprCod ;
   private long[] T002K53_A30AlbProCod ;
   private String[] T002K54_A396EmprCod ;
   private long[] T002K54_A30AlbProCod ;
   private String[] T002K55_A396EmprCod ;
   private long[] T002K55_A30AlbProCod ;
   private String[] T002K56_A396EmprCod ;
   private long[] T002K56_A30AlbProCod ;
   private String[] T002K57_A396EmprCod ;
   private long[] T002K57_A30AlbProCod ;
   private String[] T002K58_A396EmprCod ;
   private long[] T002K58_A30AlbProCod ;
   private String[] T002K59_A396EmprCod ;
   private long[] T002K59_A30AlbProCod ;
   private String[] T002K60_A396EmprCod ;
   private long[] T002K60_A30AlbProCod ;
   private String[] T002K61_A396EmprCod ;
   private long[] T002K61_A30AlbProCod ;
   private String[] T002K62_A396EmprCod ;
   private long[] T002K62_A30AlbProCod ;
   private String[] T002K63_A396EmprCod ;
   private long[] T002K63_A30AlbProCod ;
   private String[] T002K64_A396EmprCod ;
   private long[] T002K64_A30AlbProCod ;
   private String[] T002K65_A396EmprCod ;
   private long[] T002K65_A30AlbProCod ;
   private String[] T002K66_A396EmprCod ;
   private long[] T002K66_A30AlbProCod ;
   private String[] T002K67_A396EmprCod ;
   private long[] T002K67_A30AlbProCod ;
   private String[] T002K68_A396EmprCod ;
   private long[] T002K68_A30AlbProCod ;
   private String[] T002K69_A396EmprCod ;
   private long[] T002K69_A30AlbProCod ;
   private String[] T002K70_A396EmprCod ;
   private long[] T002K70_A30AlbProCod ;
   private String[] T002K71_A396EmprCod ;
   private long[] T002K71_A30AlbProCod ;
   private String[] T002K72_A396EmprCod ;
   private long[] T002K72_A30AlbProCod ;
   private String[] T002K73_A396EmprCod ;
   private long[] T002K73_A30AlbProCod ;
   private String[] T002K74_A396EmprCod ;
   private long[] T002K74_A30AlbProCod ;
   private String[] T002K75_A396EmprCod ;
   private long[] T002K75_A30AlbProCod ;
   private String[] T002K76_A396EmprCod ;
   private long[] T002K76_A30AlbProCod ;
   private String[] T002K77_A396EmprCod ;
   private long[] T002K77_A30AlbProCod ;
   private String[] T002K78_A396EmprCod ;
   private long[] T002K78_A30AlbProCod ;
   private String[] T002K79_A396EmprCod ;
   private long[] T002K79_A30AlbProCod ;
   private String[] T002K80_A396EmprCod ;
   private long[] T002K80_A30AlbProCod ;
   private String[] T002K81_A396EmprCod ;
   private long[] T002K81_A30AlbProCod ;
   private String[] T002K82_A396EmprCod ;
   private long[] T002K82_A30AlbProCod ;
   private String[] T002K83_A396EmprCod ;
   private long[] T002K83_A30AlbProCod ;
   private String[] T002K84_A396EmprCod ;
   private long[] T002K84_A30AlbProCod ;
   private String[] T002K85_A396EmprCod ;
   private long[] T002K85_A30AlbProCod ;
   private String[] T002K86_A396EmprCod ;
   private long[] T002K86_A30AlbProCod ;
   private String[] T002K87_A396EmprCod ;
   private long[] T002K87_A30AlbProCod ;
   private String[] T002K88_A396EmprCod ;
   private long[] T002K88_A30AlbProCod ;
   private String[] T002K89_A396EmprCod ;
   private long[] T002K89_A30AlbProCod ;
   private String[] T002K90_A396EmprCod ;
   private long[] T002K90_A30AlbProCod ;
   private String[] T002K91_A396EmprCod ;
   private long[] T002K91_A30AlbProCod ;
   private String[] T002K92_A396EmprCod ;
   private long[] T002K92_A30AlbProCod ;
   private String[] T002K93_A396EmprCod ;
   private long[] T002K93_A30AlbProCod ;
   private String[] T002K94_A396EmprCod ;
   private long[] T002K94_A30AlbProCod ;
   private String[] T002K95_A396EmprCod ;
   private long[] T002K95_A30AlbProCod ;
   private String[] T002K96_A396EmprCod ;
   private long[] T002K96_A30AlbProCod ;
   private String[] T002K97_A396EmprCod ;
   private long[] T002K97_A30AlbProCod ;
   private String[] T002K98_A396EmprCod ;
   private long[] T002K98_A30AlbProCod ;
   private String[] T002K99_A396EmprCod ;
   private long[] T002K99_A30AlbProCod ;
   private String[] T002K100_A396EmprCod ;
   private long[] T002K100_A30AlbProCod ;
   private String[] T002K101_A396EmprCod ;
   private long[] T002K101_A30AlbProCod ;
   private String[] T002K102_A396EmprCod ;
   private long[] T002K102_A30AlbProCod ;
   private String[] T002K103_A396EmprCod ;
   private long[] T002K103_A30AlbProCod ;
   private String[] T002K104_A396EmprCod ;
   private long[] T002K104_A30AlbProCod ;
   private String[] T002K105_A396EmprCod ;
   private long[] T002K105_A30AlbProCod ;
   private String[] T002K106_A396EmprCod ;
   private long[] T002K106_A30AlbProCod ;
   private String[] T002K107_A396EmprCod ;
   private long[] T002K107_A30AlbProCod ;
   private String[] T002K108_A396EmprCod ;
   private long[] T002K108_A30AlbProCod ;
   private String[] T002K109_A396EmprCod ;
   private long[] T002K109_A30AlbProCod ;
   private String[] T002K110_A396EmprCod ;
   private long[] T002K110_A30AlbProCod ;
   private String[] T002K111_A396EmprCod ;
   private long[] T002K111_A30AlbProCod ;
   private String[] T002K112_A396EmprCod ;
   private long[] T002K112_A30AlbProCod ;
   private String[] T002K113_A396EmprCod ;
   private long[] T002K113_A30AlbProCod ;
   private String[] T002K114_A396EmprCod ;
   private long[] T002K114_A30AlbProCod ;
   private String[] T002K115_A396EmprCod ;
   private long[] T002K115_A30AlbProCod ;
   private String[] T002K116_A396EmprCod ;
   private long[] T002K116_A30AlbProCod ;
   private String[] T002K117_A396EmprCod ;
   private long[] T002K117_A30AlbProCod ;
   private String[] T002K118_A396EmprCod ;
   private long[] T002K118_A30AlbProCod ;
   private String[] T002K119_A396EmprCod ;
   private long[] T002K119_A30AlbProCod ;
   private String[] T002K120_A396EmprCod ;
   private long[] T002K120_A30AlbProCod ;
   private String[] T002K121_A396EmprCod ;
   private long[] T002K121_A30AlbProCod ;
   private String[] T002K122_A396EmprCod ;
   private long[] T002K122_A30AlbProCod ;
   private String[] T002K123_A396EmprCod ;
   private long[] T002K123_A30AlbProCod ;
   private String[] T002K124_A396EmprCod ;
   private long[] T002K124_A30AlbProCod ;
   private String[] T002K125_A396EmprCod ;
   private long[] T002K125_A30AlbProCod ;
   private String[] T002K126_A396EmprCod ;
   private long[] T002K126_A30AlbProCod ;
   private String[] T002K127_A396EmprCod ;
   private int[] T002K127_A14AlbComCod ;
   private String[] T002K128_A396EmprCod ;
   private short[] T002K128_A840TrnCod ;
   private boolean[] T002K128_n840TrnCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV48PrvCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV42WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV43TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV46TrnContextAtt ;
}

final  class ttransp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttransp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttransp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttransp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttransp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002K2", "SELECT TrnCod, TrnNom, TrnDom, TrnPob, TrnCpo, TrnCpo2, TrnTel1, TrnTel2, TrnFax, TrnNif, TrnEmail, TrnMat, EmprCod, PrvCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ?  FOR UPDATE OF TrnNom, TrnDom, TrnPob, TrnCpo, TrnCpo2, TrnTel1, TrnTel2, TrnFax, TrnNif, TrnEmail, TrnMat, PrvCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002K3", "SELECT TrnCod, TrnNom, TrnDom, TrnPob, TrnCpo, TrnCpo2, TrnTel1, TrnTel2, TrnFax, TrnNif, TrnEmail, TrnMat, EmprCod, PrvCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002K4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002K5", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002K6", "SELECT /*+ FIRST_ROWS(100) */ TM1.TrnCod, TM1.TrnNom, TM1.TrnDom, TM1.TrnPob, TM1.TrnCpo, TM1.TrnCpo2, T3.PrvDsc, TM1.TrnTel1, TM1.TrnTel2, TM1.TrnFax, TM1.TrnNif, TM1.TrnEmail, T2.EmprNom, TM1.TrnMat, TM1.EmprCod, TM1.PrvCod FROM ((TXPTRANSP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = TM1.PrvCod) WHERE TM1.EmprCod = ? and TM1.TrnCod = ? ORDER BY TM1.EmprCod, TM1.TrnCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002K7", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002K8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TrnCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002K9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TrnCod FROM TXPTRANSP WHERE ( TrnCod > ?) and EmprCod = ? ORDER BY EmprCod, TrnCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TrnCod FROM TXPTRANSP WHERE ( TrnCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, TrnCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002K11", "INSERT INTO TXPTRANSP(TrnCod, TrnNom, TrnDom, TrnPob, TrnCpo, TrnCpo2, TrnTel1, TrnTel2, TrnFax, TrnNif, TrnEmail, TrnMat, EmprCod, PrvCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTRANSP")
         ,new UpdateCursor("T002K12", "UPDATE TXPTRANSP SET TrnNom=?, TrnDom=?, TrnPob=?, TrnCpo=?, TrnCpo2=?, TrnTel1=?, TrnTel2=?, TrnFax=?, TrnNif=?, TrnEmail=?, TrnMat=?, PrvCod=?  WHERE EmprCod = ? AND TrnCod = ?", GX_NOMASK, "TXPTRANSP")
         ,new UpdateCursor("T002K13", "DELETE FROM TXPTRANSP  WHERE EmprCod = ? AND TrnCod = ?", GX_NOMASK, "TXPTRANSP")
         ,new ForEachCursor("T002K14", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002K15", "SELECT * FROM (SELECT EmprCod, AlbProID FROM TXPCALPRO WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K16", "SELECT * FROM (SELECT EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K17", "SELECT * FROM (SELECT EmprCod, DevComCod FROM TXPDEVCCO WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K18", "SELECT * FROM (SELECT EmprCod, Nof_Hdr, Nof_r, Nof_p FROM TXPNOFART WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K19", "SELECT * FROM (SELECT EmprCod, TrnCod, Trn_Diaf FROM TXPTRNCOS WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K20", "SELECT * FROM (SELECT EmprCod, CliCod, Bros_Art FROM TXPARTBRS WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K21", "SELECT * FROM (SELECT EmprCod, H_RecCod FROM TXPALMPZ0 WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K22", "SELECT * FROM (SELECT EmprCod, Su_AlbCod FROM TXPREMLAV WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K23", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND DevEmpCTrn = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K24", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K25", "SELECT * FROM (SELECT EmprCod, ExhAlbCod FROM TXPCEXPER WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K26", "SELECT * FROM (SELECT EmprCod, ExtPdoAlb FROM TXPCEXTPD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K27", "SELECT * FROM (SELECT EmprCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K28", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod, PartLin FROM TXPLPARTI WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K29", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenTrn = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K30", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K31", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K32", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K33", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K34", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K35", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K36", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K37", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K38", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K39", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K40", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K41", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K42", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K43", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K44", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K45", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K46", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K47", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K48", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K49", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K50", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K51", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K52", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K53", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K54", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K55", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K56", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K57", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K58", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K59", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K60", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K61", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K62", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K63", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K64", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K65", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K66", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K67", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K68", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K69", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K70", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K71", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K72", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K73", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K74", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K75", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K76", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K77", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K78", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K79", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K80", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K81", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K82", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K83", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K84", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K85", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K86", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K87", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K88", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K89", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K90", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K91", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K92", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K93", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K94", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K95", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K96", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K97", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K98", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K99", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K100", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K101", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K102", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K103", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K104", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K105", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K106", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K107", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K108", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K109", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K110", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K111", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K112", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K113", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K114", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K115", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K116", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K117", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K118", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K119", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K120", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K121", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K122", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K123", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K124", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K125", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K126", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K127", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND TrnCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002K128", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TrnCod FROM TXPTRANSP WHERE EmprCod = ? ORDER BY EmprCod, TrnCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((short[]) buf[24])[0] = rslt.getShort(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
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
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((short[]) buf[24])[0] = rslt.getShort(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
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
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((short[]) buf[28])[0] = rslt.getShort(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 113 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 114 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 115 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 116 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 117 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 118 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 119 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 121 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 123 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 124 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 125 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 126 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 7 :
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
            case 8 :
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
            case 9 :
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
                  stmt.setString(7, (String)parms[13], 15);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 15);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 15);
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 20);
               }
               stmt.setString(13, (String)parms[24], 3);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[26]).shortValue());
               }
               return;
            case 10 :
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
                  stmt.setString(6, (String)parms[11], 15);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 15);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 15);
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               stmt.setString(13, (String)parms[24], 3);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[26]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
            case 126 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

