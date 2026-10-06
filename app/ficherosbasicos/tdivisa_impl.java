package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdivisa_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"DIVCOD") == 0 )
      {
         AV24DivCod = (byte)(GXutil.lval( httpContext.GetPar( "DivCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24DivCod), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIVCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24DivCod), "Z9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asadivcodB4459( AV24DivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DIVCOD") == 0 )
      {
         A3099DivCod = (byte)(GXutil.lval( httpContext.GetPar( "DivCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
         AV28autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28autonumber), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asadivcodB4459( A3099DivCod, AV28autonumber) ;
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
            AV24DivCod = (byte)(GXutil.lval( httpContext.GetPar( "DivCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24DivCod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIVCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24DivCod), "Z9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DIVISAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDivCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tdivisa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdivisa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdivisa_impl.class ));
   }

   public tdivisa_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDivCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDivCod_Internalname, httpContext.getMessage( "Codigo Divisa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3099DivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3099DivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDivCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDivCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDivNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDivNom_Internalname, httpContext.getMessage( "Nombre Divisa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDivNom_Internalname, GXutil.rtrim( A3100DivNom), GXutil.rtrim( localUtil.format( A3100DivNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDivNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDivNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDivAbr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDivAbr_Internalname, httpContext.getMessage( "Abreviatura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDivAbr_Internalname, GXutil.rtrim( A3101DivAbr), GXutil.rtrim( localUtil.format( A3101DivAbr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDivAbr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDivAbr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedsection1_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDivValCam_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDivValCam_Internalname, httpContext.getMessage( "Valor Cambio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDivValCam_Internalname, GXutil.ltrim( localUtil.ntoc( A3102DivValCam, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDivValCam_Enabled!=0) ? localUtil.format( A3102DivValCam, "ZZZ9.99999") : localUtil.format( A3102DivValCam, "ZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDivValCam_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDivValCam_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDivFecCam_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDivFecCam_Internalname, httpContext.getMessage( "Fecha Cambio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDivFecCam_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDivFecCam_Internalname, localUtil.format(A3103DivFecCam, "99/99/99"), localUtil.format( A3103DivFecCam, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDivFecCam_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDivFecCam_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDivFecCam_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDivFecCam_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDivCamAnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDivCamAnt_Internalname, httpContext.getMessage( "Cambio Anterior", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDivCamAnt_Internalname, GXutil.ltrim( localUtil.ntoc( A3104DivCamAnt, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDivCamAnt_Enabled!=0) ? localUtil.format( A3104DivCamAnt, "ZZZ9.99999") : localUtil.format( A3104DivCamAnt, "ZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDivCamAnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDivCamAnt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDivFecAnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDivFecAnt_Internalname, httpContext.getMessage( "Fecha Cambio Anterior", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDivFecAnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDivFecAnt_Internalname, localUtil.format(A3105DivFecAnt, "99/99/99"), localUtil.format( A3105DivFecAnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDivFecAnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDivFecAnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDivFecAnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDivFecAnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDivFecMod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDivFecMod_Internalname, httpContext.getMessage( "Fecha Modificacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDivFecMod_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDivFecMod_Internalname, localUtil.format(A3106DivFecMod, "99/99/99"), localUtil.format( A3106DivFecMod, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDivFecMod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDivFecMod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDivFecMod_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDivFecMod_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedsection2_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDivDec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDivDec_Internalname, httpContext.getMessage( "Divisa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDivDec_Internalname, GXutil.ltrim( localUtil.ntoc( A3107DivDec, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDivDec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3107DivDec), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3107DivDec), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDivDec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDivDec_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TDIVISA.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TDIVISA.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TDIVISA.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV29Pgmname), GXutil.rtrim( localUtil.format( AV29Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TDIVISA.htm");
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
      e11B42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z3099DivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3099DivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3100DivNom = httpContext.cgiGet( "Z3100DivNom") ;
            Z3101DivAbr = httpContext.cgiGet( "Z3101DivAbr") ;
            Z3102DivValCam = localUtil.ctond( httpContext.cgiGet( "Z3102DivValCam")) ;
            Z3103DivFecCam = localUtil.ctod( httpContext.cgiGet( "Z3103DivFecCam"), 0) ;
            Z3104DivCamAnt = localUtil.ctond( httpContext.cgiGet( "Z3104DivCamAnt")) ;
            Z3105DivFecAnt = localUtil.ctod( httpContext.cgiGet( "Z3105DivFecAnt"), 0) ;
            Z3106DivFecMod = localUtil.ctod( httpContext.cgiGet( "Z3106DivFecMod"), 0) ;
            Z3107DivDec = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3107DivDec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV24DivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDivCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3099DivCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
            }
            else
            {
               A3099DivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
            }
            A3100DivNom = httpContext.cgiGet( edtDivNom_Internalname) ;
            n3100DivNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3100DivNom", A3100DivNom);
            A3101DivAbr = httpContext.cgiGet( edtDivAbr_Internalname) ;
            n3101DivAbr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3101DivAbr", A3101DivAbr);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDivValCam_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDivValCam_Internalname)), DecimalUtil.stringToDec("9999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIVVALCAM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDivValCam_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3102DivValCam = DecimalUtil.ZERO ;
               n3102DivValCam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3102DivValCam", GXutil.ltrimstr( A3102DivValCam, 10, 5));
            }
            else
            {
               A3102DivValCam = localUtil.ctond( httpContext.cgiGet( edtDivValCam_Internalname)) ;
               n3102DivValCam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3102DivValCam", GXutil.ltrimstr( A3102DivValCam, 10, 5));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtDivFecCam_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DIVFECCAM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDivFecCam_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3103DivFecCam = GXutil.nullDate() ;
               n3103DivFecCam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3103DivFecCam", localUtil.format(A3103DivFecCam, "99/99/99"));
            }
            else
            {
               A3103DivFecCam = localUtil.ctod( httpContext.cgiGet( edtDivFecCam_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n3103DivFecCam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3103DivFecCam", localUtil.format(A3103DivFecCam, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDivCamAnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDivCamAnt_Internalname)), DecimalUtil.stringToDec("9999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIVCAMANT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDivCamAnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3104DivCamAnt = DecimalUtil.ZERO ;
               n3104DivCamAnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3104DivCamAnt", GXutil.ltrimstr( A3104DivCamAnt, 10, 5));
            }
            else
            {
               A3104DivCamAnt = localUtil.ctond( httpContext.cgiGet( edtDivCamAnt_Internalname)) ;
               n3104DivCamAnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3104DivCamAnt", GXutil.ltrimstr( A3104DivCamAnt, 10, 5));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtDivFecAnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DIVFECANT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDivFecAnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3105DivFecAnt = GXutil.nullDate() ;
               n3105DivFecAnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3105DivFecAnt", localUtil.format(A3105DivFecAnt, "99/99/99"));
            }
            else
            {
               A3105DivFecAnt = localUtil.ctod( httpContext.cgiGet( edtDivFecAnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n3105DivFecAnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3105DivFecAnt", localUtil.format(A3105DivFecAnt, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtDivFecMod_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DIVFECMOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDivFecMod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3106DivFecMod = GXutil.nullDate() ;
               n3106DivFecMod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3106DivFecMod", localUtil.format(A3106DivFecMod, "99/99/99"));
            }
            else
            {
               A3106DivFecMod = localUtil.ctod( httpContext.cgiGet( edtDivFecMod_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n3106DivFecMod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3106DivFecMod", localUtil.format(A3106DivFecMod, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDivDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDivDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIVDEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDivDec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3107DivDec = (byte)(0) ;
               n3107DivDec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3107DivDec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3107DivDec), 2, 0));
            }
            else
            {
               A3107DivDec = (byte)(localUtil.ctol( httpContext.cgiGet( edtDivDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3107DivDec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3107DivDec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3107DivDec), 2, 0));
            }
            AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDIVISA");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A3099DivCod != Z3099DivCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tdivisa:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A3099DivCod = (byte)(GXutil.lval( httpContext.GetPar( "DivCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
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
                  sMode459 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode459 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound459 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_B40( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DIVCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDivCod_Internalname ;
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
                        e11B42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12B42 ();
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
         e12B42 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllB4459( ) ;
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
         disableAttributesB4459( ) ;
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

   public void confirm_B40( )
   {
      beforeValidateB4459( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsB4459( ) ;
         }
         else
         {
            checkExtendedTableB4459( ) ;
            closeExtendedTableCursorsB4459( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaptionB40( )
   {
   }

   public void e11B42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdivisa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = AV23EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdivisa_impl.this.AV23EmprCod = GXv_char2[0] ;
      tdivisa_impl.this.AV16EmprNom = GXv_char3[0] ;
      tdivisa_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV28autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV23EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      tdivisa_impl.this.GXt_int5 = GXv_int6[0] ;
      AV28autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28autonumber), 4, 0));
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tdivisa_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV23EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      tdivisa_impl.this.AV23EmprCod = GXv_char4[0] ;
      tdivisa_impl.this.AV16EmprNom = GXv_char3[0] ;
      tdivisa_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV25WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV25WWPContext = GXv_SdtWWPContext7[0] ;
      AV26TrnContext.fromxml(AV27WebSession.getValue("TrnContext"), null, null);
   }

   public void e12B42( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV26TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.tdivisaww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zmB4459( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3100DivNom = T00B43_A3100DivNom[0] ;
            Z3101DivAbr = T00B43_A3101DivAbr[0] ;
            Z3102DivValCam = T00B43_A3102DivValCam[0] ;
            Z3103DivFecCam = T00B43_A3103DivFecCam[0] ;
            Z3104DivCamAnt = T00B43_A3104DivCamAnt[0] ;
            Z3105DivFecAnt = T00B43_A3105DivFecAnt[0] ;
            Z3106DivFecMod = T00B43_A3106DivFecMod[0] ;
            Z3107DivDec = T00B43_A3107DivDec[0] ;
         }
         else
         {
            Z3100DivNom = A3100DivNom ;
            Z3101DivAbr = A3101DivAbr ;
            Z3102DivValCam = A3102DivValCam ;
            Z3103DivFecCam = A3103DivFecCam ;
            Z3104DivCamAnt = A3104DivCamAnt ;
            Z3105DivFecAnt = A3105DivFecAnt ;
            Z3106DivFecMod = A3106DivFecMod ;
            Z3107DivDec = A3107DivDec ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z3099DivCod = A3099DivCod ;
         Z3100DivNom = A3100DivNom ;
         Z3101DivAbr = A3101DivAbr ;
         Z3102DivValCam = A3102DivValCam ;
         Z3103DivFecCam = A3103DivFecCam ;
         Z3104DivCamAnt = A3104DivCamAnt ;
         Z3105DivFecAnt = A3105DivFecAnt ;
         Z3106DivFecMod = A3106DivFecMod ;
         Z3107DivDec = A3107DivDec ;
      }
   }

   public void standaloneNotModal( )
   {
      AV29Pgmname = "FicherosBasicos.TDIVISA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (0==AV24DivCod) )
      {
         A3099DivCod = AV24DivCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
      }
      if ( ! (0==AV24DivCod) )
      {
         edtDivCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDivCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV24DivCod) )
      {
         edtDivCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivCod_Enabled), 5, 0), true);
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

   public void loadB4459( )
   {
      /* Using cursor T00B44 */
      pr_default.execute(2, new Object[] {Byte.valueOf(A3099DivCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound459 = (short)(1) ;
         A3100DivNom = T00B44_A3100DivNom[0] ;
         n3100DivNom = T00B44_n3100DivNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3100DivNom", A3100DivNom);
         A3101DivAbr = T00B44_A3101DivAbr[0] ;
         n3101DivAbr = T00B44_n3101DivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3101DivAbr", A3101DivAbr);
         A3102DivValCam = T00B44_A3102DivValCam[0] ;
         n3102DivValCam = T00B44_n3102DivValCam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3102DivValCam", GXutil.ltrimstr( A3102DivValCam, 10, 5));
         A3103DivFecCam = T00B44_A3103DivFecCam[0] ;
         n3103DivFecCam = T00B44_n3103DivFecCam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3103DivFecCam", localUtil.format(A3103DivFecCam, "99/99/99"));
         A3104DivCamAnt = T00B44_A3104DivCamAnt[0] ;
         n3104DivCamAnt = T00B44_n3104DivCamAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3104DivCamAnt", GXutil.ltrimstr( A3104DivCamAnt, 10, 5));
         A3105DivFecAnt = T00B44_A3105DivFecAnt[0] ;
         n3105DivFecAnt = T00B44_n3105DivFecAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3105DivFecAnt", localUtil.format(A3105DivFecAnt, "99/99/99"));
         A3106DivFecMod = T00B44_A3106DivFecMod[0] ;
         n3106DivFecMod = T00B44_n3106DivFecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3106DivFecMod", localUtil.format(A3106DivFecMod, "99/99/99"));
         A3107DivDec = T00B44_A3107DivDec[0] ;
         n3107DivDec = T00B44_n3107DivDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3107DivDec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3107DivDec), 2, 0));
         zmB4459( -6) ;
      }
      pr_default.close(2);
      onLoadActionsB4459( ) ;
   }

   public void onLoadActionsB4459( )
   {
   }

   public void checkExtendedTableB4459( )
   {
      nIsDirty_459 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsB4459( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyB4459( )
   {
      /* Using cursor T00B45 */
      pr_default.execute(3, new Object[] {Byte.valueOf(A3099DivCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound459 = (short)(1) ;
      }
      else
      {
         RcdFound459 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00B43 */
      pr_default.execute(1, new Object[] {Byte.valueOf(A3099DivCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmB4459( 6) ;
         RcdFound459 = (short)(1) ;
         A3099DivCod = T00B43_A3099DivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
         A3100DivNom = T00B43_A3100DivNom[0] ;
         n3100DivNom = T00B43_n3100DivNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3100DivNom", A3100DivNom);
         A3101DivAbr = T00B43_A3101DivAbr[0] ;
         n3101DivAbr = T00B43_n3101DivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3101DivAbr", A3101DivAbr);
         A3102DivValCam = T00B43_A3102DivValCam[0] ;
         n3102DivValCam = T00B43_n3102DivValCam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3102DivValCam", GXutil.ltrimstr( A3102DivValCam, 10, 5));
         A3103DivFecCam = T00B43_A3103DivFecCam[0] ;
         n3103DivFecCam = T00B43_n3103DivFecCam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3103DivFecCam", localUtil.format(A3103DivFecCam, "99/99/99"));
         A3104DivCamAnt = T00B43_A3104DivCamAnt[0] ;
         n3104DivCamAnt = T00B43_n3104DivCamAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3104DivCamAnt", GXutil.ltrimstr( A3104DivCamAnt, 10, 5));
         A3105DivFecAnt = T00B43_A3105DivFecAnt[0] ;
         n3105DivFecAnt = T00B43_n3105DivFecAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3105DivFecAnt", localUtil.format(A3105DivFecAnt, "99/99/99"));
         A3106DivFecMod = T00B43_A3106DivFecMod[0] ;
         n3106DivFecMod = T00B43_n3106DivFecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3106DivFecMod", localUtil.format(A3106DivFecMod, "99/99/99"));
         A3107DivDec = T00B43_A3107DivDec[0] ;
         n3107DivDec = T00B43_n3107DivDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3107DivDec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3107DivDec), 2, 0));
         Z3099DivCod = A3099DivCod ;
         sMode459 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadB4459( ) ;
         if ( AnyError == 1 )
         {
            RcdFound459 = (short)(0) ;
            initializeNonKeyB4459( ) ;
         }
         Gx_mode = sMode459 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound459 = (short)(0) ;
         initializeNonKeyB4459( ) ;
         sMode459 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode459 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyB4459( ) ;
      if ( RcdFound459 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound459 = (short)(0) ;
      /* Using cursor T00B46 */
      pr_default.execute(4, new Object[] {Byte.valueOf(A3099DivCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00B46_A3099DivCod[0] < A3099DivCod ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00B46_A3099DivCod[0] > A3099DivCod ) ) )
         {
            A3099DivCod = T00B46_A3099DivCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
            RcdFound459 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound459 = (short)(0) ;
      /* Using cursor T00B47 */
      pr_default.execute(5, new Object[] {Byte.valueOf(A3099DivCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00B47_A3099DivCod[0] > A3099DivCod ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00B47_A3099DivCod[0] < A3099DivCod ) ) )
         {
            A3099DivCod = T00B47_A3099DivCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
            RcdFound459 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyB4459( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDivCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertB4459( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound459 == 1 )
         {
            if ( A3099DivCod != Z3099DivCod )
            {
               A3099DivCod = Z3099DivCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DIVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDivCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDivCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateB4459( ) ;
               GX_FocusControl = edtDivCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A3099DivCod != Z3099DivCod )
            {
               /* Insert record */
               GX_FocusControl = edtDivCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertB4459( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DIVCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDivCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDivCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertB4459( ) ;
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
      if ( A3099DivCod != Z3099DivCod )
      {
         A3099DivCod = Z3099DivCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DIVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDivCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDivCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyB4459( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00B42 */
         pr_default.execute(0, new Object[] {Byte.valueOf(A3099DivCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIVISA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3100DivNom, T00B42_A3100DivNom[0]) != 0 ) || ( GXutil.strcmp(Z3101DivAbr, T00B42_A3101DivAbr[0]) != 0 ) || ( DecimalUtil.compareTo(Z3102DivValCam, T00B42_A3102DivValCam[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3103DivFecCam), GXutil.resetTime(T00B42_A3103DivFecCam[0])) ) || ( DecimalUtil.compareTo(Z3104DivCamAnt, T00B42_A3104DivCamAnt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z3105DivFecAnt), GXutil.resetTime(T00B42_A3105DivFecAnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z3106DivFecMod), GXutil.resetTime(T00B42_A3106DivFecMod[0])) ) || ( Z3107DivDec != T00B42_A3107DivDec[0] ) )
         {
            if ( GXutil.strcmp(Z3100DivNom, T00B42_A3100DivNom[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tdivisa:[seudo value changed for attri]"+"DivNom");
               GXutil.writeLogRaw("Old: ",Z3100DivNom);
               GXutil.writeLogRaw("Current: ",T00B42_A3100DivNom[0]);
            }
            if ( GXutil.strcmp(Z3101DivAbr, T00B42_A3101DivAbr[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tdivisa:[seudo value changed for attri]"+"DivAbr");
               GXutil.writeLogRaw("Old: ",Z3101DivAbr);
               GXutil.writeLogRaw("Current: ",T00B42_A3101DivAbr[0]);
            }
            if ( DecimalUtil.compareTo(Z3102DivValCam, T00B42_A3102DivValCam[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tdivisa:[seudo value changed for attri]"+"DivValCam");
               GXutil.writeLogRaw("Old: ",Z3102DivValCam);
               GXutil.writeLogRaw("Current: ",T00B42_A3102DivValCam[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3103DivFecCam), GXutil.resetTime(T00B42_A3103DivFecCam[0])) ) )
            {
               GXutil.writeLogln("ficherosbasicos.tdivisa:[seudo value changed for attri]"+"DivFecCam");
               GXutil.writeLogRaw("Old: ",Z3103DivFecCam);
               GXutil.writeLogRaw("Current: ",T00B42_A3103DivFecCam[0]);
            }
            if ( DecimalUtil.compareTo(Z3104DivCamAnt, T00B42_A3104DivCamAnt[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tdivisa:[seudo value changed for attri]"+"DivCamAnt");
               GXutil.writeLogRaw("Old: ",Z3104DivCamAnt);
               GXutil.writeLogRaw("Current: ",T00B42_A3104DivCamAnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3105DivFecAnt), GXutil.resetTime(T00B42_A3105DivFecAnt[0])) ) )
            {
               GXutil.writeLogln("ficherosbasicos.tdivisa:[seudo value changed for attri]"+"DivFecAnt");
               GXutil.writeLogRaw("Old: ",Z3105DivFecAnt);
               GXutil.writeLogRaw("Current: ",T00B42_A3105DivFecAnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3106DivFecMod), GXutil.resetTime(T00B42_A3106DivFecMod[0])) ) )
            {
               GXutil.writeLogln("ficherosbasicos.tdivisa:[seudo value changed for attri]"+"DivFecMod");
               GXutil.writeLogRaw("Old: ",Z3106DivFecMod);
               GXutil.writeLogRaw("Current: ",T00B42_A3106DivFecMod[0]);
            }
            if ( Z3107DivDec != T00B42_A3107DivDec[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tdivisa:[seudo value changed for attri]"+"DivDec");
               GXutil.writeLogRaw("Old: ",Z3107DivDec);
               GXutil.writeLogRaw("Current: ",T00B42_A3107DivDec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDIVISA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertB4459( )
   {
      beforeValidateB4459( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableB4459( ) ;
      }
      if ( AnyError == 0 )
      {
         zmB4459( 0) ;
         checkOptimisticConcurrencyB4459( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmB4459( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertB4459( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00B48 */
                  pr_default.execute(6, new Object[] {Byte.valueOf(A3099DivCod), Boolean.valueOf(n3100DivNom), A3100DivNom, Boolean.valueOf(n3101DivAbr), A3101DivAbr, Boolean.valueOf(n3102DivValCam), A3102DivValCam, Boolean.valueOf(n3103DivFecCam), A3103DivFecCam, Boolean.valueOf(n3104DivCamAnt), A3104DivCamAnt, Boolean.valueOf(n3105DivFecAnt), A3105DivFecAnt, Boolean.valueOf(n3106DivFecMod), A3106DivFecMod, Boolean.valueOf(n3107DivDec), Byte.valueOf(A3107DivDec)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIVISA");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaptionB40( ) ;
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
            loadB4459( ) ;
         }
         endLevelB4459( ) ;
      }
      closeExtendedTableCursorsB4459( ) ;
   }

   public void updateB4459( )
   {
      beforeValidateB4459( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableB4459( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyB4459( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmB4459( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateB4459( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00B49 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n3100DivNom), A3100DivNom, Boolean.valueOf(n3101DivAbr), A3101DivAbr, Boolean.valueOf(n3102DivValCam), A3102DivValCam, Boolean.valueOf(n3103DivFecCam), A3103DivFecCam, Boolean.valueOf(n3104DivCamAnt), A3104DivCamAnt, Boolean.valueOf(n3105DivFecAnt), A3105DivFecAnt, Boolean.valueOf(n3106DivFecMod), A3106DivFecMod, Boolean.valueOf(n3107DivDec), Byte.valueOf(A3107DivDec), Byte.valueOf(A3099DivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIVISA");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIVISA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateB4459( ) ;
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
         endLevelB4459( ) ;
      }
      closeExtendedTableCursorsB4459( ) ;
   }

   public void deferredUpdateB4459( )
   {
   }

   public void delete( )
   {
      beforeValidateB4459( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyB4459( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsB4459( ) ;
         afterConfirmB4459( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteB4459( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00B410 */
               pr_default.execute(8, new Object[] {Byte.valueOf(A3099DivCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIVISA");
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
      sMode459 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelB4459( ) ;
      Gx_mode = sMode459 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsB4459( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00B411 */
         pr_default.execute(9, new Object[] {Byte.valueOf(A3099DivCod)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TRM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T00B412 */
         pr_default.execute(10, new Object[] {Byte.valueOf(A3099DivCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T00B413 */
         pr_default.execute(11, new Object[] {Byte.valueOf(A3099DivCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T00B414 */
         pr_default.execute(12, new Object[] {Byte.valueOf(A3099DivCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFAVEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00B415 */
         pr_default.execute(13, new Object[] {Byte.valueOf(A3099DivCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T00B416 */
         pr_default.execute(14, new Object[] {Byte.valueOf(A3099DivCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00B417 */
         pr_default.execute(15, new Object[] {Byte.valueOf(A3099DivCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevelB4459( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteB4459( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tdivisa");
         if ( AnyError == 0 )
         {
            confirmValuesB40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tdivisa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartB4459( )
   {
      /* Scan By routine */
      /* Using cursor T00B418 */
      pr_default.execute(16);
      RcdFound459 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound459 = (short)(1) ;
         A3099DivCod = T00B418_A3099DivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextB4459( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound459 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound459 = (short)(1) ;
         A3099DivCod = T00B418_A3099DivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
      }
   }

   public void scanEndB4459( )
   {
      pr_default.close(16);
   }

   public void afterConfirmB4459( )
   {
      /* After Confirm Rules */
      if ( (0==A3099DivCod) && (0==AV28autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "DIVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDivCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsertB4459( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A3099DivCod) && ( AV28autonumber == 1 ) )
      {
         GXt_int5 = A3099DivCod ;
         GXv_int6[0] = GXt_int5 ;
         new app.ficherosbasicos.tdivisa_prxid(remoteHandle, context).execute( GXv_int6) ;
         tdivisa_impl.this.GXt_int5 = GXv_int6[0] ;
         A3099DivCod = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
      }
   }

   public void beforeUpdateB4459( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteB4459( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteB4459( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateB4459( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesB4459( )
   {
      edtDivCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivCod_Enabled), 5, 0), true);
      edtDivNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDivNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivNom_Enabled), 5, 0), true);
      edtDivAbr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDivAbr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivAbr_Enabled), 5, 0), true);
      edtDivValCam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDivValCam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivValCam_Enabled), 5, 0), true);
      edtDivFecCam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDivFecCam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivFecCam_Enabled), 5, 0), true);
      edtDivCamAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDivCamAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivCamAnt_Enabled), 5, 0), true);
      edtDivFecAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDivFecAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivFecAnt_Enabled), 5, 0), true);
      edtDivFecMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDivFecMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivFecMod_Enabled), 5, 0), true);
      edtDivDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDivDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDivDec_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesB4459( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesB40( )
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tdivisa", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV24DivCod,2,0))}, new String[] {"Gx_mode","DivCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDIVISA");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tdivisa:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z3099DivCod", GXutil.ltrim( localUtil.ntoc( Z3099DivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3100DivNom", GXutil.rtrim( Z3100DivNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3101DivAbr", GXutil.rtrim( Z3101DivAbr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3102DivValCam", GXutil.ltrim( localUtil.ntoc( Z3102DivValCam, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3103DivFecCam", localUtil.dtoc( Z3103DivFecCam, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3104DivCamAnt", GXutil.ltrim( localUtil.ntoc( Z3104DivCamAnt, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3105DivFecAnt", localUtil.dtoc( Z3105DivFecAnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3106DivFecMod", localUtil.dtoc( Z3106DivFecMod, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3107DivDec", GXutil.ltrim( localUtil.ntoc( Z3107DivDec, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV26TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV26TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV26TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vDIVCOD", GXutil.ltrim( localUtil.ntoc( AV24DivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIVCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24DivCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV28autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ficherosbasicos.tdivisa", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV24DivCod,2,0))}, new String[] {"Gx_mode","DivCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TDIVISA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DIVISAS", "") ;
   }

   public void initializeNonKeyB4459( )
   {
      A3100DivNom = "" ;
      n3100DivNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3100DivNom", A3100DivNom);
      A3101DivAbr = "" ;
      n3101DivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3101DivAbr", A3101DivAbr);
      A3102DivValCam = DecimalUtil.ZERO ;
      n3102DivValCam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3102DivValCam", GXutil.ltrimstr( A3102DivValCam, 10, 5));
      A3103DivFecCam = GXutil.nullDate() ;
      n3103DivFecCam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3103DivFecCam", localUtil.format(A3103DivFecCam, "99/99/99"));
      A3104DivCamAnt = DecimalUtil.ZERO ;
      n3104DivCamAnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3104DivCamAnt", GXutil.ltrimstr( A3104DivCamAnt, 10, 5));
      A3105DivFecAnt = GXutil.nullDate() ;
      n3105DivFecAnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3105DivFecAnt", localUtil.format(A3105DivFecAnt, "99/99/99"));
      A3106DivFecMod = GXutil.nullDate() ;
      n3106DivFecMod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3106DivFecMod", localUtil.format(A3106DivFecMod, "99/99/99"));
      A3107DivDec = (byte)(0) ;
      n3107DivDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3107DivDec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3107DivDec), 2, 0));
      Z3100DivNom = "" ;
      Z3101DivAbr = "" ;
      Z3102DivValCam = DecimalUtil.ZERO ;
      Z3103DivFecCam = GXutil.nullDate() ;
      Z3104DivCamAnt = DecimalUtil.ZERO ;
      Z3105DivFecAnt = GXutil.nullDate() ;
      Z3106DivFecMod = GXutil.nullDate() ;
      Z3107DivDec = (byte)(0) ;
   }

   public void initAllB4459( )
   {
      A3099DivCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
      initializeNonKeyB4459( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211654798", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tdivisa.js", "?20268211654798", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtDivCod_Internalname = "DIVCOD" ;
      edtDivNom_Internalname = "DIVNOM" ;
      edtDivAbr_Internalname = "DIVABR" ;
      divUnnamedsection1_Internalname = "UNNAMEDSECTION1" ;
      edtDivValCam_Internalname = "DIVVALCAM" ;
      edtDivFecCam_Internalname = "DIVFECCAM" ;
      edtDivCamAnt_Internalname = "DIVCAMANT" ;
      edtDivFecAnt_Internalname = "DIVFECANT" ;
      edtDivFecMod_Internalname = "DIVFECMOD" ;
      divUnnamedsection2_Internalname = "UNNAMEDSECTION2" ;
      edtDivDec_Internalname = "DIVDEC" ;
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
      Form.setCaption( httpContext.getMessage( "DIVISAS", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDivDec_Jsonclick = "" ;
      edtDivDec_Enabled = 1 ;
      edtDivFecMod_Jsonclick = "" ;
      edtDivFecMod_Enabled = 1 ;
      edtDivFecAnt_Jsonclick = "" ;
      edtDivFecAnt_Enabled = 1 ;
      edtDivCamAnt_Jsonclick = "" ;
      edtDivCamAnt_Enabled = 1 ;
      edtDivFecCam_Jsonclick = "" ;
      edtDivFecCam_Enabled = 1 ;
      edtDivValCam_Jsonclick = "" ;
      edtDivValCam_Enabled = 1 ;
      edtDivAbr_Jsonclick = "" ;
      edtDivAbr_Enabled = 1 ;
      edtDivNom_Jsonclick = "" ;
      edtDivNom_Enabled = 1 ;
      edtDivCod_Jsonclick = "" ;
      edtDivCod_Enabled = 1 ;
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

   public void gx1asadivcodB4459( byte AV24DivCod )
   {
      if ( ! (0==AV24DivCod) )
      {
         A3099DivCod = AV24DivCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3099DivCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asadivcodB4459( byte A3099DivCod ,
                                  short AV28autonumber )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A3099DivCod) && ( AV28autonumber == 1 ) )
      {
         GXt_int5 = A3099DivCod ;
         GXv_int6[0] = GXt_int5 ;
         new app.ficherosbasicos.tdivisa_prxid(remoteHandle, context).execute( GXv_int6) ;
         tdivisa_impl.this.GXt_int5 = GXv_int6[0] ;
         A3099DivCod = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3099DivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3099DivCod), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3099DivCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV24DivCod',fld:'vDIVCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV24DivCod',fld:'vDIVCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12B42',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_DIVCOD","{handler:'valid_Divcod',iparms:[]");
      setEventMetadata("VALID_DIVCOD",",oparms:[]}");
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
      Z3100DivNom = "" ;
      Z3101DivAbr = "" ;
      Z3102DivValCam = DecimalUtil.ZERO ;
      Z3103DivFecCam = GXutil.nullDate() ;
      Z3104DivCamAnt = DecimalUtil.ZERO ;
      Z3105DivFecAnt = GXutil.nullDate() ;
      Z3106DivFecMod = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A3100DivNom = "" ;
      A3101DivAbr = "" ;
      A3102DivValCam = DecimalUtil.ZERO ;
      A3103DivFecCam = GXutil.nullDate() ;
      A3104DivCamAnt = DecimalUtil.ZERO ;
      A3105DivFecAnt = GXutil.nullDate() ;
      A3106DivFecMod = GXutil.nullDate() ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV29Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode459 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      AV23EmprCod = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV25WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV27WebSession = httpContext.getWebSession();
      T00B44_A3099DivCod = new byte[1] ;
      T00B44_A3100DivNom = new String[] {""} ;
      T00B44_n3100DivNom = new boolean[] {false} ;
      T00B44_A3101DivAbr = new String[] {""} ;
      T00B44_n3101DivAbr = new boolean[] {false} ;
      T00B44_A3102DivValCam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00B44_n3102DivValCam = new boolean[] {false} ;
      T00B44_A3103DivFecCam = new java.util.Date[] {GXutil.nullDate()} ;
      T00B44_n3103DivFecCam = new boolean[] {false} ;
      T00B44_A3104DivCamAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00B44_n3104DivCamAnt = new boolean[] {false} ;
      T00B44_A3105DivFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00B44_n3105DivFecAnt = new boolean[] {false} ;
      T00B44_A3106DivFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00B44_n3106DivFecMod = new boolean[] {false} ;
      T00B44_A3107DivDec = new byte[1] ;
      T00B44_n3107DivDec = new boolean[] {false} ;
      T00B45_A3099DivCod = new byte[1] ;
      T00B43_A3099DivCod = new byte[1] ;
      T00B43_A3100DivNom = new String[] {""} ;
      T00B43_n3100DivNom = new boolean[] {false} ;
      T00B43_A3101DivAbr = new String[] {""} ;
      T00B43_n3101DivAbr = new boolean[] {false} ;
      T00B43_A3102DivValCam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00B43_n3102DivValCam = new boolean[] {false} ;
      T00B43_A3103DivFecCam = new java.util.Date[] {GXutil.nullDate()} ;
      T00B43_n3103DivFecCam = new boolean[] {false} ;
      T00B43_A3104DivCamAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00B43_n3104DivCamAnt = new boolean[] {false} ;
      T00B43_A3105DivFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00B43_n3105DivFecAnt = new boolean[] {false} ;
      T00B43_A3106DivFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00B43_n3106DivFecMod = new boolean[] {false} ;
      T00B43_A3107DivDec = new byte[1] ;
      T00B43_n3107DivDec = new boolean[] {false} ;
      T00B46_A3099DivCod = new byte[1] ;
      T00B47_A3099DivCod = new byte[1] ;
      T00B42_A3099DivCod = new byte[1] ;
      T00B42_A3100DivNom = new String[] {""} ;
      T00B42_n3100DivNom = new boolean[] {false} ;
      T00B42_A3101DivAbr = new String[] {""} ;
      T00B42_n3101DivAbr = new boolean[] {false} ;
      T00B42_A3102DivValCam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00B42_n3102DivValCam = new boolean[] {false} ;
      T00B42_A3103DivFecCam = new java.util.Date[] {GXutil.nullDate()} ;
      T00B42_n3103DivFecCam = new boolean[] {false} ;
      T00B42_A3104DivCamAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00B42_n3104DivCamAnt = new boolean[] {false} ;
      T00B42_A3105DivFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00B42_n3105DivFecAnt = new boolean[] {false} ;
      T00B42_A3106DivFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00B42_n3106DivFecMod = new boolean[] {false} ;
      T00B42_A3107DivDec = new byte[1] ;
      T00B42_n3107DivDec = new boolean[] {false} ;
      T00B411_A396EmprCod = new String[] {""} ;
      T00B411_A14105TRMDivID = new byte[1] ;
      T00B411_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T00B412_A396EmprCod = new String[] {""} ;
      T00B412_A795PrvNum = new int[1] ;
      T00B413_A396EmprCod = new String[] {""} ;
      T00B413_A252CliCod = new int[1] ;
      T00B414_A396EmprCod = new String[] {""} ;
      T00B414_A430FacCod = new int[1] ;
      T00B415_A396EmprCod = new String[] {""} ;
      T00B415_A658PedCod = new int[1] ;
      T00B416_A396EmprCod = new String[] {""} ;
      T00B416_A14AlbComCod = new int[1] ;
      T00B417_A396EmprCod = new String[] {""} ;
      T00B417_A30AlbProCod = new long[1] ;
      T00B418_A3099DivCod = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int6 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tdivisa__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tdivisa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tdivisa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tdivisa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tdivisa__default(),
         new Object[] {
             new Object[] {
            T00B42_A3099DivCod, T00B42_A3100DivNom, T00B42_n3100DivNom, T00B42_A3101DivAbr, T00B42_n3101DivAbr, T00B42_A3102DivValCam, T00B42_n3102DivValCam, T00B42_A3103DivFecCam, T00B42_n3103DivFecCam, T00B42_A3104DivCamAnt,
            T00B42_n3104DivCamAnt, T00B42_A3105DivFecAnt, T00B42_n3105DivFecAnt, T00B42_A3106DivFecMod, T00B42_n3106DivFecMod, T00B42_A3107DivDec, T00B42_n3107DivDec
            }
            , new Object[] {
            T00B43_A3099DivCod, T00B43_A3100DivNom, T00B43_n3100DivNom, T00B43_A3101DivAbr, T00B43_n3101DivAbr, T00B43_A3102DivValCam, T00B43_n3102DivValCam, T00B43_A3103DivFecCam, T00B43_n3103DivFecCam, T00B43_A3104DivCamAnt,
            T00B43_n3104DivCamAnt, T00B43_A3105DivFecAnt, T00B43_n3105DivFecAnt, T00B43_A3106DivFecMod, T00B43_n3106DivFecMod, T00B43_A3107DivDec, T00B43_n3107DivDec
            }
            , new Object[] {
            T00B44_A3099DivCod, T00B44_A3100DivNom, T00B44_n3100DivNom, T00B44_A3101DivAbr, T00B44_n3101DivAbr, T00B44_A3102DivValCam, T00B44_n3102DivValCam, T00B44_A3103DivFecCam, T00B44_n3103DivFecCam, T00B44_A3104DivCamAnt,
            T00B44_n3104DivCamAnt, T00B44_A3105DivFecAnt, T00B44_n3105DivFecAnt, T00B44_A3106DivFecMod, T00B44_n3106DivFecMod, T00B44_A3107DivDec, T00B44_n3107DivDec
            }
            , new Object[] {
            T00B45_A3099DivCod
            }
            , new Object[] {
            T00B46_A3099DivCod
            }
            , new Object[] {
            T00B47_A3099DivCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00B411_A396EmprCod, T00B411_A14105TRMDivID, T00B411_A14106TRMFecha
            }
            , new Object[] {
            T00B412_A396EmprCod, T00B412_A795PrvNum
            }
            , new Object[] {
            T00B413_A396EmprCod, T00B413_A252CliCod
            }
            , new Object[] {
            T00B414_A396EmprCod, T00B414_A430FacCod
            }
            , new Object[] {
            T00B415_A396EmprCod, T00B415_A658PedCod
            }
            , new Object[] {
            T00B416_A396EmprCod, T00B416_A14AlbComCod
            }
            , new Object[] {
            T00B417_A396EmprCod, T00B417_A30AlbProCod
            }
            , new Object[] {
            T00B418_A3099DivCod
            }
         }
      );
      AV29Pgmname = "FicherosBasicos.TDIVISA" ;
   }

   private byte wcpOAV24DivCod ;
   private byte Z3099DivCod ;
   private byte Z3107DivDec ;
   private byte GxWebError ;
   private byte AV24DivCod ;
   private byte A3099DivCod ;
   private byte nKeyPressed ;
   private byte A3107DivDec ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short AV28autonumber ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound459 ;
   private short nIsDirty_459 ;
   private int trnEnded ;
   private int edtDivCod_Enabled ;
   private int edtDivNom_Enabled ;
   private int edtDivAbr_Enabled ;
   private int edtDivValCam_Enabled ;
   private int edtDivFecCam_Enabled ;
   private int edtDivCamAnt_Enabled ;
   private int edtDivFecAnt_Enabled ;
   private int edtDivFecMod_Enabled ;
   private int edtDivDec_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z3102DivValCam ;
   private java.math.BigDecimal Z3104DivCamAnt ;
   private java.math.BigDecimal A3102DivValCam ;
   private java.math.BigDecimal A3104DivCamAnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z3100DivNom ;
   private String Z3101DivAbr ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDivCod_Internalname ;
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
   private String edtDivCod_Jsonclick ;
   private String edtDivNom_Internalname ;
   private String A3100DivNom ;
   private String edtDivNom_Jsonclick ;
   private String edtDivAbr_Internalname ;
   private String A3101DivAbr ;
   private String edtDivAbr_Jsonclick ;
   private String divUnnamedsection1_Internalname ;
   private String edtDivValCam_Internalname ;
   private String edtDivValCam_Jsonclick ;
   private String edtDivFecCam_Internalname ;
   private String edtDivFecCam_Jsonclick ;
   private String edtDivCamAnt_Internalname ;
   private String edtDivCamAnt_Jsonclick ;
   private String edtDivFecAnt_Internalname ;
   private String edtDivFecAnt_Jsonclick ;
   private String edtDivFecMod_Internalname ;
   private String edtDivFecMod_Jsonclick ;
   private String divUnnamedsection2_Internalname ;
   private String edtDivDec_Internalname ;
   private String edtDivDec_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV29Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode459 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String AV23EmprCod ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z3103DivFecCam ;
   private java.util.Date Z3105DivFecAnt ;
   private java.util.Date Z3106DivFecMod ;
   private java.util.Date A3103DivFecCam ;
   private java.util.Date A3105DivFecAnt ;
   private java.util.Date A3106DivFecMod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n3100DivNom ;
   private boolean n3101DivAbr ;
   private boolean n3102DivValCam ;
   private boolean n3103DivFecCam ;
   private boolean n3104DivCamAnt ;
   private boolean n3105DivFecAnt ;
   private boolean n3106DivFecMod ;
   private boolean n3107DivDec ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV27WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private byte[] T00B44_A3099DivCod ;
   private String[] T00B44_A3100DivNom ;
   private boolean[] T00B44_n3100DivNom ;
   private String[] T00B44_A3101DivAbr ;
   private boolean[] T00B44_n3101DivAbr ;
   private java.math.BigDecimal[] T00B44_A3102DivValCam ;
   private boolean[] T00B44_n3102DivValCam ;
   private java.util.Date[] T00B44_A3103DivFecCam ;
   private boolean[] T00B44_n3103DivFecCam ;
   private java.math.BigDecimal[] T00B44_A3104DivCamAnt ;
   private boolean[] T00B44_n3104DivCamAnt ;
   private java.util.Date[] T00B44_A3105DivFecAnt ;
   private boolean[] T00B44_n3105DivFecAnt ;
   private java.util.Date[] T00B44_A3106DivFecMod ;
   private boolean[] T00B44_n3106DivFecMod ;
   private byte[] T00B44_A3107DivDec ;
   private boolean[] T00B44_n3107DivDec ;
   private byte[] T00B45_A3099DivCod ;
   private byte[] T00B43_A3099DivCod ;
   private String[] T00B43_A3100DivNom ;
   private boolean[] T00B43_n3100DivNom ;
   private String[] T00B43_A3101DivAbr ;
   private boolean[] T00B43_n3101DivAbr ;
   private java.math.BigDecimal[] T00B43_A3102DivValCam ;
   private boolean[] T00B43_n3102DivValCam ;
   private java.util.Date[] T00B43_A3103DivFecCam ;
   private boolean[] T00B43_n3103DivFecCam ;
   private java.math.BigDecimal[] T00B43_A3104DivCamAnt ;
   private boolean[] T00B43_n3104DivCamAnt ;
   private java.util.Date[] T00B43_A3105DivFecAnt ;
   private boolean[] T00B43_n3105DivFecAnt ;
   private java.util.Date[] T00B43_A3106DivFecMod ;
   private boolean[] T00B43_n3106DivFecMod ;
   private byte[] T00B43_A3107DivDec ;
   private boolean[] T00B43_n3107DivDec ;
   private byte[] T00B46_A3099DivCod ;
   private byte[] T00B47_A3099DivCod ;
   private byte[] T00B42_A3099DivCod ;
   private String[] T00B42_A3100DivNom ;
   private boolean[] T00B42_n3100DivNom ;
   private String[] T00B42_A3101DivAbr ;
   private boolean[] T00B42_n3101DivAbr ;
   private java.math.BigDecimal[] T00B42_A3102DivValCam ;
   private boolean[] T00B42_n3102DivValCam ;
   private java.util.Date[] T00B42_A3103DivFecCam ;
   private boolean[] T00B42_n3103DivFecCam ;
   private java.math.BigDecimal[] T00B42_A3104DivCamAnt ;
   private boolean[] T00B42_n3104DivCamAnt ;
   private java.util.Date[] T00B42_A3105DivFecAnt ;
   private boolean[] T00B42_n3105DivFecAnt ;
   private java.util.Date[] T00B42_A3106DivFecMod ;
   private boolean[] T00B42_n3106DivFecMod ;
   private byte[] T00B42_A3107DivDec ;
   private boolean[] T00B42_n3107DivDec ;
   private String[] T00B411_A396EmprCod ;
   private byte[] T00B411_A14105TRMDivID ;
   private java.util.Date[] T00B411_A14106TRMFecha ;
   private String[] T00B412_A396EmprCod ;
   private int[] T00B412_A795PrvNum ;
   private String[] T00B413_A396EmprCod ;
   private int[] T00B413_A252CliCod ;
   private String[] T00B414_A396EmprCod ;
   private int[] T00B414_A430FacCod ;
   private String[] T00B415_A396EmprCod ;
   private int[] T00B415_A658PedCod ;
   private String[] T00B416_A396EmprCod ;
   private int[] T00B416_A14AlbComCod ;
   private String[] T00B417_A396EmprCod ;
   private long[] T00B417_A30AlbProCod ;
   private byte[] T00B418_A3099DivCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV25WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV26TrnContext ;
}

final  class tdivisa__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdivisa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdivisa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdivisa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdivisa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00B42", "SELECT DivCod, DivNom, DivAbr, DivValCam, DivFecCam, DivCamAnt, DivFecAnt, DivFecMod, DivDec FROM TXPDIVISA WHERE DivCod = ?  FOR UPDATE OF DivNom, DivAbr, DivValCam, DivFecCam, DivCamAnt, DivFecAnt, DivFecMod, DivDec NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B43", "SELECT DivCod, DivNom, DivAbr, DivValCam, DivFecCam, DivCamAnt, DivFecAnt, DivFecMod, DivDec FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B44", "SELECT /*+ FIRST_ROWS(100) */ TM1.DivCod, TM1.DivNom, TM1.DivAbr, TM1.DivValCam, TM1.DivFecCam, TM1.DivCamAnt, TM1.DivFecAnt, TM1.DivFecMod, TM1.DivDec FROM TXPDIVISA TM1 WHERE TM1.DivCod = ? ORDER BY TM1.DivCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B45", "SELECT /*+ FIRST_ROWS(1) */ DivCod FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B46", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ DivCod FROM TXPDIVISA WHERE ( DivCod > ?) ORDER BY DivCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B47", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ DivCod FROM TXPDIVISA WHERE ( DivCod < ?) ORDER BY DivCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00B48", "INSERT INTO TXPDIVISA(DivCod, DivNom, DivAbr, DivValCam, DivFecCam, DivCamAnt, DivFecAnt, DivFecMod, DivDec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDIVISA")
         ,new UpdateCursor("T00B49", "UPDATE TXPDIVISA SET DivNom=?, DivAbr=?, DivValCam=?, DivFecCam=?, DivCamAnt=?, DivFecAnt=?, DivFecMod=?, DivDec=?  WHERE DivCod = ?", GX_NOMASK, "TXPDIVISA")
         ,new UpdateCursor("T00B410", "DELETE FROM TXPDIVISA  WHERE DivCod = ?", GX_NOMASK, "TXPDIVISA")
         ,new ForEachCursor("T00B411", "SELECT * FROM (SELECT EmprCod, TRMDivID, TRMFecha FROM TXPTRM WHERE TRMDivID = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B412", "SELECT * FROM (SELECT EmprCod, PrvNum FROM TXPPRVGEN WHERE PrvDivCo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B413", "SELECT * FROM (SELECT EmprCod, CliCod FROM TXPCLIENT WHERE CliDivCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B414", "SELECT * FROM (SELECT EmprCod, FacCod FROM TXPCFAVEN WHERE FacDivCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B415", "SELECT * FROM (SELECT EmprCod, PedCod FROM TXPCPEDID WHERE PedCDivCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B416", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE AlcDivCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B417", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE AlbDivCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B418", "SELECT /*+ FIRST_ROWS(100) */ DivCod FROM TXPDIVISA ORDER BY DivCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[14]);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               return;
            case 7 :
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
                  stmt.setString(2, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               stmt.setByte(9, ((Number) parms[16]).byteValue());
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 12 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 13 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 15 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
      }
   }

}

