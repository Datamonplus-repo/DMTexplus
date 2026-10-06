package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class drec_impl extends GXDataArea
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
            AV11DRecId = GXutil.lval( httpContext.GetPar( "DRecId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11DRecId), 12, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDRECID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11DRecId), "ZZZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Data Recepcion Enlace c/PLC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDRecId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public drec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public drec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( drec_impl.class ));
   }

   public drec_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDRecId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDRecId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDRecId_Internalname, GXutil.ltrim( localUtil.ntoc( A14675DRecId, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14675DRecId), "ZZZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDRecId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDRecId_Enabled, 1, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Ingenieria\\Id", "right", false, "", "HLP_Ingenieria\\DRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDRecMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDRecMaqCod_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDRecMaqCod_Internalname, GXutil.rtrim( A14705DRecMaqCod), GXutil.rtrim( localUtil.format( A14705DRecMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDRecMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDRecMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\MaqCod", "left", true, "", "HLP_Ingenieria\\DRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDRecPLC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDRecPLC_Internalname, httpContext.getMessage( "Enlace c/PLC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDRecPLC_Internalname, A14706DRecPLC, GXutil.rtrim( localUtil.format( A14706DRecPLC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDRecPLC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDRecPLC_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\PLC", "left", true, "", "HLP_Ingenieria\\DRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDRecVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDRecVal_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDRecVal_Internalname, GXutil.rtrim( A14707DRecVal), GXutil.rtrim( localUtil.format( A14707DRecVal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDRecVal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDRecVal_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\DRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDRecFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDRecFec_Internalname, httpContext.getMessage( "Recepción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDRecFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDRecFec_Internalname, localUtil.ttoc( A14676DRecFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14676DRecFec, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDRecFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDRecFec_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\DRec.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDRecFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDRecFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\DRec.htm");
      httpContext.writeTextNL( "</div>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\DRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\DRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\DRec.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV16Pgmname), GXutil.rtrim( localUtil.format( AV16Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\DRec.htm");
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
      e111W92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z14675DRecId = localUtil.ctol( httpContext.cgiGet( "Z14675DRecId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z14705DRecMaqCod = httpContext.cgiGet( "Z14705DRecMaqCod") ;
            Z14706DRecPLC = httpContext.cgiGet( "Z14706DRecPLC") ;
            Z14707DRecVal = httpContext.cgiGet( "Z14707DRecVal") ;
            Z14676DRecFec = localUtil.ctot( httpContext.cgiGet( "Z14676DRecFec"), 0) ;
            Z14708DRecHdr = httpContext.cgiGet( "Z14708DRecHdr") ;
            Z14709DRecFasCod = httpContext.cgiGet( "Z14709DRecFasCod") ;
            Z14718DRecFasDsc = httpContext.cgiGet( "Z14718DRecFasDsc") ;
            Z14710DRecOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14710DRecOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14711DRecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14711DRecBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14712DRecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14712DRecBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14713DRecBarPar = httpContext.cgiGet( "Z14713DRecBarPar") ;
            Z14714DRecUsu = httpContext.cgiGet( "Z14714DRecUsu") ;
            Z14715DRecIp = httpContext.cgiGet( "Z14715DRecIp") ;
            Z14716DRecReg = localUtil.ctot( httpContext.cgiGet( "Z14716DRecReg"), 0) ;
            Z14717DRecTkn = httpContext.cgiGet( "Z14717DRecTkn") ;
            A14708DRecHdr = httpContext.cgiGet( "Z14708DRecHdr") ;
            n14708DRecHdr = false ;
            A14709DRecFasCod = httpContext.cgiGet( "Z14709DRecFasCod") ;
            n14709DRecFasCod = false ;
            A14718DRecFasDsc = httpContext.cgiGet( "Z14718DRecFasDsc") ;
            n14718DRecFasDsc = false ;
            A14710DRecOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14710DRecOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14710DRecOrd = false ;
            A14711DRecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14711DRecBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14711DRecBarCod = false ;
            A14712DRecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14712DRecBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14712DRecBarReo = false ;
            A14713DRecBarPar = httpContext.cgiGet( "Z14713DRecBarPar") ;
            n14713DRecBarPar = false ;
            A14714DRecUsu = httpContext.cgiGet( "Z14714DRecUsu") ;
            n14714DRecUsu = false ;
            A14715DRecIp = httpContext.cgiGet( "Z14715DRecIp") ;
            n14715DRecIp = false ;
            A14716DRecReg = localUtil.ctot( httpContext.cgiGet( "Z14716DRecReg"), 0) ;
            n14716DRecReg = false ;
            A14717DRecTkn = httpContext.cgiGet( "Z14717DRecTkn") ;
            n14717DRecTkn = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV11DRecId = localUtil.ctol( httpContext.cgiGet( "vDRECID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A14708DRecHdr = httpContext.cgiGet( "DRECHDR") ;
            A14709DRecFasCod = httpContext.cgiGet( "DRECFASCOD") ;
            A14718DRecFasDsc = httpContext.cgiGet( "DRECFASDSC") ;
            A14710DRecOrd = (short)(localUtil.ctol( httpContext.cgiGet( "DRECORD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14711DRecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "DRECBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14712DRecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "DRECBARREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14713DRecBarPar = httpContext.cgiGet( "DRECBARPAR") ;
            A14714DRecUsu = httpContext.cgiGet( "DRECUSU") ;
            A14715DRecIp = httpContext.cgiGet( "DRECIP") ;
            A14716DRecReg = localUtil.ctot( httpContext.cgiGet( "DRECREG"), 0) ;
            A14717DRecTkn = httpContext.cgiGet( "DRECTKN") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDRecId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDRecId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DRECID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDRecId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14675DRecId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
            }
            else
            {
               A14675DRecId = localUtil.ctol( httpContext.cgiGet( edtDRecId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
            }
            A14705DRecMaqCod = httpContext.cgiGet( edtDRecMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14705DRecMaqCod", A14705DRecMaqCod);
            A14706DRecPLC = httpContext.cgiGet( edtDRecPLC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14706DRecPLC", A14706DRecPLC);
            A14707DRecVal = httpContext.cgiGet( edtDRecVal_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14707DRecVal", A14707DRecVal);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtDRecFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DRECFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDRecFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14676DRecFec = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A14676DRecFec", localUtil.ttoc( A14676DRecFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A14676DRecFec = localUtil.ctot( httpContext.cgiGet( edtDRecFec_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14676DRecFec", localUtil.ttoc( A14676DRecFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            AV16Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DRec");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("DRecHdr", GXutil.rtrim( localUtil.format( A14708DRecHdr, "")));
            forbiddenHiddens.add("DRecFasCod", GXutil.rtrim( localUtil.format( A14709DRecFasCod, "")));
            forbiddenHiddens.add("DRecFasDsc", GXutil.rtrim( localUtil.format( A14718DRecFasDsc, "")));
            forbiddenHiddens.add("DRecOrd", localUtil.format( DecimalUtil.doubleToDec(A14710DRecOrd), "ZZZ9"));
            forbiddenHiddens.add("DRecBarCod", localUtil.format( DecimalUtil.doubleToDec(A14711DRecBarCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("DRecBarReo", localUtil.format( DecimalUtil.doubleToDec(A14712DRecBarReo), "9"));
            forbiddenHiddens.add("DRecBarPar", GXutil.rtrim( localUtil.format( A14713DRecBarPar, "")));
            forbiddenHiddens.add("DRecUsu", GXutil.rtrim( localUtil.format( A14714DRecUsu, "")));
            forbiddenHiddens.add("DRecIp", GXutil.rtrim( localUtil.format( A14715DRecIp, "")));
            forbiddenHiddens.add("DRecReg", localUtil.format( A14716DRecReg, "99/99/99 99:99:99.999"));
            forbiddenHiddens.add("DRecTkn", GXutil.rtrim( localUtil.format( A14717DRecTkn, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14675DRecId != Z14675DRecId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ingenieria\\drec:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A14675DRecId = GXutil.lval( httpContext.GetPar( "DRecId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
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
                  sMode1921 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1921 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1921 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1W90( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DRECID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDRecId_Internalname ;
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
                        e111W92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121W92 ();
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
         e121W92 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1W91921( ) ;
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
         disableAttributes1W91921( ) ;
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

   public void confirm_1W90( )
   {
      beforeValidate1W91921( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1W91921( ) ;
         }
         else
         {
            checkExtendedTable1W91921( ) ;
            closeExtendedTableCursors1W91921( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1W90( )
   {
   }

   public void e111W92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      drec_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV13EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      drec_impl.this.AV13EmprCod = GXv_char2[0] ;
      drec_impl.this.AV14EmprNom = GXv_char3[0] ;
      drec_impl.this.AV15UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXv_SdtWWPContext5[0] = AV8WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV8WWPContext = GXv_SdtWWPContext5[0] ;
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
   }

   public void e121W92( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ingenieria.drecww", new String[] {}, new String[] {}) );
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

   public void zm1W91921( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14705DRecMaqCod = T01W93_A14705DRecMaqCod[0] ;
            Z14706DRecPLC = T01W93_A14706DRecPLC[0] ;
            Z14707DRecVal = T01W93_A14707DRecVal[0] ;
            Z14676DRecFec = T01W93_A14676DRecFec[0] ;
            Z14708DRecHdr = T01W93_A14708DRecHdr[0] ;
            Z14709DRecFasCod = T01W93_A14709DRecFasCod[0] ;
            Z14718DRecFasDsc = T01W93_A14718DRecFasDsc[0] ;
            Z14710DRecOrd = T01W93_A14710DRecOrd[0] ;
            Z14711DRecBarCod = T01W93_A14711DRecBarCod[0] ;
            Z14712DRecBarReo = T01W93_A14712DRecBarReo[0] ;
            Z14713DRecBarPar = T01W93_A14713DRecBarPar[0] ;
            Z14714DRecUsu = T01W93_A14714DRecUsu[0] ;
            Z14715DRecIp = T01W93_A14715DRecIp[0] ;
            Z14716DRecReg = T01W93_A14716DRecReg[0] ;
            Z14717DRecTkn = T01W93_A14717DRecTkn[0] ;
         }
         else
         {
            Z14705DRecMaqCod = A14705DRecMaqCod ;
            Z14706DRecPLC = A14706DRecPLC ;
            Z14707DRecVal = A14707DRecVal ;
            Z14676DRecFec = A14676DRecFec ;
            Z14708DRecHdr = A14708DRecHdr ;
            Z14709DRecFasCod = A14709DRecFasCod ;
            Z14718DRecFasDsc = A14718DRecFasDsc ;
            Z14710DRecOrd = A14710DRecOrd ;
            Z14711DRecBarCod = A14711DRecBarCod ;
            Z14712DRecBarReo = A14712DRecBarReo ;
            Z14713DRecBarPar = A14713DRecBarPar ;
            Z14714DRecUsu = A14714DRecUsu ;
            Z14715DRecIp = A14715DRecIp ;
            Z14716DRecReg = A14716DRecReg ;
            Z14717DRecTkn = A14717DRecTkn ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z14675DRecId = A14675DRecId ;
         Z14705DRecMaqCod = A14705DRecMaqCod ;
         Z14706DRecPLC = A14706DRecPLC ;
         Z14707DRecVal = A14707DRecVal ;
         Z14676DRecFec = A14676DRecFec ;
         Z14708DRecHdr = A14708DRecHdr ;
         Z14709DRecFasCod = A14709DRecFasCod ;
         Z14718DRecFasDsc = A14718DRecFasDsc ;
         Z14710DRecOrd = A14710DRecOrd ;
         Z14711DRecBarCod = A14711DRecBarCod ;
         Z14712DRecBarReo = A14712DRecBarReo ;
         Z14713DRecBarPar = A14713DRecBarPar ;
         Z14714DRecUsu = A14714DRecUsu ;
         Z14715DRecIp = A14715DRecIp ;
         Z14716DRecReg = A14716DRecReg ;
         Z14717DRecTkn = A14717DRecTkn ;
      }
   }

   public void standaloneNotModal( )
   {
      AV16Pgmname = "Ingenieria.DRec" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (0==AV11DRecId) )
      {
         A14675DRecId = AV11DRecId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
      }
      if ( ! (0==AV11DRecId) )
      {
         edtDRecId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDRecId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDRecId_Enabled), 5, 0), true);
      }
      else
      {
         edtDRecId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDRecId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDRecId_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11DRecId) )
      {
         edtDRecId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDRecId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDRecId_Enabled), 5, 0), true);
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

   public void load1W91921( )
   {
      /* Using cursor T01W94 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14675DRecId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1921 = (short)(1) ;
         A14705DRecMaqCod = T01W94_A14705DRecMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14705DRecMaqCod", A14705DRecMaqCod);
         A14706DRecPLC = T01W94_A14706DRecPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14706DRecPLC", A14706DRecPLC);
         A14707DRecVal = T01W94_A14707DRecVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14707DRecVal", A14707DRecVal);
         A14676DRecFec = T01W94_A14676DRecFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14676DRecFec", localUtil.ttoc( A14676DRecFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14708DRecHdr = T01W94_A14708DRecHdr[0] ;
         n14708DRecHdr = T01W94_n14708DRecHdr[0] ;
         A14709DRecFasCod = T01W94_A14709DRecFasCod[0] ;
         n14709DRecFasCod = T01W94_n14709DRecFasCod[0] ;
         A14718DRecFasDsc = T01W94_A14718DRecFasDsc[0] ;
         n14718DRecFasDsc = T01W94_n14718DRecFasDsc[0] ;
         A14710DRecOrd = T01W94_A14710DRecOrd[0] ;
         n14710DRecOrd = T01W94_n14710DRecOrd[0] ;
         A14711DRecBarCod = T01W94_A14711DRecBarCod[0] ;
         n14711DRecBarCod = T01W94_n14711DRecBarCod[0] ;
         A14712DRecBarReo = T01W94_A14712DRecBarReo[0] ;
         n14712DRecBarReo = T01W94_n14712DRecBarReo[0] ;
         A14713DRecBarPar = T01W94_A14713DRecBarPar[0] ;
         n14713DRecBarPar = T01W94_n14713DRecBarPar[0] ;
         A14714DRecUsu = T01W94_A14714DRecUsu[0] ;
         n14714DRecUsu = T01W94_n14714DRecUsu[0] ;
         A14715DRecIp = T01W94_A14715DRecIp[0] ;
         n14715DRecIp = T01W94_n14715DRecIp[0] ;
         A14716DRecReg = T01W94_A14716DRecReg[0] ;
         n14716DRecReg = T01W94_n14716DRecReg[0] ;
         A14717DRecTkn = T01W94_A14717DRecTkn[0] ;
         n14717DRecTkn = T01W94_n14717DRecTkn[0] ;
         zm1W91921( -4) ;
      }
      pr_default.close(2);
      onLoadActions1W91921( ) ;
   }

   public void onLoadActions1W91921( )
   {
   }

   public void checkExtendedTable1W91921( )
   {
      nIsDirty_1921 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1W91921( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1W91921( )
   {
      /* Using cursor T01W95 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14675DRecId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1921 = (short)(1) ;
      }
      else
      {
         RcdFound1921 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01W93 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14675DRecId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1W91921( 4) ;
         RcdFound1921 = (short)(1) ;
         A14675DRecId = T01W93_A14675DRecId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
         A14705DRecMaqCod = T01W93_A14705DRecMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14705DRecMaqCod", A14705DRecMaqCod);
         A14706DRecPLC = T01W93_A14706DRecPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14706DRecPLC", A14706DRecPLC);
         A14707DRecVal = T01W93_A14707DRecVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14707DRecVal", A14707DRecVal);
         A14676DRecFec = T01W93_A14676DRecFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14676DRecFec", localUtil.ttoc( A14676DRecFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14708DRecHdr = T01W93_A14708DRecHdr[0] ;
         n14708DRecHdr = T01W93_n14708DRecHdr[0] ;
         A14709DRecFasCod = T01W93_A14709DRecFasCod[0] ;
         n14709DRecFasCod = T01W93_n14709DRecFasCod[0] ;
         A14718DRecFasDsc = T01W93_A14718DRecFasDsc[0] ;
         n14718DRecFasDsc = T01W93_n14718DRecFasDsc[0] ;
         A14710DRecOrd = T01W93_A14710DRecOrd[0] ;
         n14710DRecOrd = T01W93_n14710DRecOrd[0] ;
         A14711DRecBarCod = T01W93_A14711DRecBarCod[0] ;
         n14711DRecBarCod = T01W93_n14711DRecBarCod[0] ;
         A14712DRecBarReo = T01W93_A14712DRecBarReo[0] ;
         n14712DRecBarReo = T01W93_n14712DRecBarReo[0] ;
         A14713DRecBarPar = T01W93_A14713DRecBarPar[0] ;
         n14713DRecBarPar = T01W93_n14713DRecBarPar[0] ;
         A14714DRecUsu = T01W93_A14714DRecUsu[0] ;
         n14714DRecUsu = T01W93_n14714DRecUsu[0] ;
         A14715DRecIp = T01W93_A14715DRecIp[0] ;
         n14715DRecIp = T01W93_n14715DRecIp[0] ;
         A14716DRecReg = T01W93_A14716DRecReg[0] ;
         n14716DRecReg = T01W93_n14716DRecReg[0] ;
         A14717DRecTkn = T01W93_A14717DRecTkn[0] ;
         n14717DRecTkn = T01W93_n14717DRecTkn[0] ;
         Z14675DRecId = A14675DRecId ;
         sMode1921 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1W91921( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1921 = (short)(0) ;
            initializeNonKey1W91921( ) ;
         }
         Gx_mode = sMode1921 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1921 = (short)(0) ;
         initializeNonKey1W91921( ) ;
         sMode1921 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1921 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1W91921( ) ;
      if ( RcdFound1921 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1921 = (short)(0) ;
      /* Using cursor T01W96 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14675DRecId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01W96_A14675DRecId[0] < A14675DRecId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01W96_A14675DRecId[0] > A14675DRecId ) ) )
         {
            A14675DRecId = T01W96_A14675DRecId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
            RcdFound1921 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1921 = (short)(0) ;
      /* Using cursor T01W97 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14675DRecId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01W97_A14675DRecId[0] > A14675DRecId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01W97_A14675DRecId[0] < A14675DRecId ) ) )
         {
            A14675DRecId = T01W97_A14675DRecId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
            RcdFound1921 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1W91921( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDRecId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1W91921( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1921 == 1 )
         {
            if ( A14675DRecId != Z14675DRecId )
            {
               A14675DRecId = Z14675DRecId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DRECID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDRecId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDRecId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1W91921( ) ;
               GX_FocusControl = edtDRecId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14675DRecId != Z14675DRecId )
            {
               /* Insert record */
               GX_FocusControl = edtDRecId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1W91921( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DRECID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDRecId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDRecId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1W91921( ) ;
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
      if ( A14675DRecId != Z14675DRecId )
      {
         A14675DRecId = Z14675DRecId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DRECID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDRecId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDRecId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1W91921( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W92 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14675DRecId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"DRec"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14705DRecMaqCod, T01W92_A14705DRecMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z14706DRecPLC, T01W92_A14706DRecPLC[0]) != 0 ) || ( GXutil.strcmp(Z14707DRecVal, T01W92_A14707DRecVal[0]) != 0 ) || !( GXutil.dateCompare(Z14676DRecFec, T01W92_A14676DRecFec[0]) ) || ( GXutil.strcmp(Z14708DRecHdr, T01W92_A14708DRecHdr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14709DRecFasCod, T01W92_A14709DRecFasCod[0]) != 0 ) || ( GXutil.strcmp(Z14718DRecFasDsc, T01W92_A14718DRecFasDsc[0]) != 0 ) || ( Z14710DRecOrd != T01W92_A14710DRecOrd[0] ) || ( Z14711DRecBarCod != T01W92_A14711DRecBarCod[0] ) || ( Z14712DRecBarReo != T01W92_A14712DRecBarReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14713DRecBarPar, T01W92_A14713DRecBarPar[0]) != 0 ) || ( GXutil.strcmp(Z14714DRecUsu, T01W92_A14714DRecUsu[0]) != 0 ) || ( GXutil.strcmp(Z14715DRecIp, T01W92_A14715DRecIp[0]) != 0 ) || !( GXutil.dateCompare(Z14716DRecReg, T01W92_A14716DRecReg[0]) ) || ( GXutil.strcmp(Z14717DRecTkn, T01W92_A14717DRecTkn[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14705DRecMaqCod, T01W92_A14705DRecMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecMaqCod");
               GXutil.writeLogRaw("Old: ",Z14705DRecMaqCod);
               GXutil.writeLogRaw("Current: ",T01W92_A14705DRecMaqCod[0]);
            }
            if ( GXutil.strcmp(Z14706DRecPLC, T01W92_A14706DRecPLC[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecPLC");
               GXutil.writeLogRaw("Old: ",Z14706DRecPLC);
               GXutil.writeLogRaw("Current: ",T01W92_A14706DRecPLC[0]);
            }
            if ( GXutil.strcmp(Z14707DRecVal, T01W92_A14707DRecVal[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecVal");
               GXutil.writeLogRaw("Old: ",Z14707DRecVal);
               GXutil.writeLogRaw("Current: ",T01W92_A14707DRecVal[0]);
            }
            if ( !( GXutil.dateCompare(Z14676DRecFec, T01W92_A14676DRecFec[0]) ) )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecFec");
               GXutil.writeLogRaw("Old: ",Z14676DRecFec);
               GXutil.writeLogRaw("Current: ",T01W92_A14676DRecFec[0]);
            }
            if ( GXutil.strcmp(Z14708DRecHdr, T01W92_A14708DRecHdr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecHdr");
               GXutil.writeLogRaw("Old: ",Z14708DRecHdr);
               GXutil.writeLogRaw("Current: ",T01W92_A14708DRecHdr[0]);
            }
            if ( GXutil.strcmp(Z14709DRecFasCod, T01W92_A14709DRecFasCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecFasCod");
               GXutil.writeLogRaw("Old: ",Z14709DRecFasCod);
               GXutil.writeLogRaw("Current: ",T01W92_A14709DRecFasCod[0]);
            }
            if ( GXutil.strcmp(Z14718DRecFasDsc, T01W92_A14718DRecFasDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecFasDsc");
               GXutil.writeLogRaw("Old: ",Z14718DRecFasDsc);
               GXutil.writeLogRaw("Current: ",T01W92_A14718DRecFasDsc[0]);
            }
            if ( Z14710DRecOrd != T01W92_A14710DRecOrd[0] )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecOrd");
               GXutil.writeLogRaw("Old: ",Z14710DRecOrd);
               GXutil.writeLogRaw("Current: ",T01W92_A14710DRecOrd[0]);
            }
            if ( Z14711DRecBarCod != T01W92_A14711DRecBarCod[0] )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecBarCod");
               GXutil.writeLogRaw("Old: ",Z14711DRecBarCod);
               GXutil.writeLogRaw("Current: ",T01W92_A14711DRecBarCod[0]);
            }
            if ( Z14712DRecBarReo != T01W92_A14712DRecBarReo[0] )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecBarReo");
               GXutil.writeLogRaw("Old: ",Z14712DRecBarReo);
               GXutil.writeLogRaw("Current: ",T01W92_A14712DRecBarReo[0]);
            }
            if ( GXutil.strcmp(Z14713DRecBarPar, T01W92_A14713DRecBarPar[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecBarPar");
               GXutil.writeLogRaw("Old: ",Z14713DRecBarPar);
               GXutil.writeLogRaw("Current: ",T01W92_A14713DRecBarPar[0]);
            }
            if ( GXutil.strcmp(Z14714DRecUsu, T01W92_A14714DRecUsu[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecUsu");
               GXutil.writeLogRaw("Old: ",Z14714DRecUsu);
               GXutil.writeLogRaw("Current: ",T01W92_A14714DRecUsu[0]);
            }
            if ( GXutil.strcmp(Z14715DRecIp, T01W92_A14715DRecIp[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecIp");
               GXutil.writeLogRaw("Old: ",Z14715DRecIp);
               GXutil.writeLogRaw("Current: ",T01W92_A14715DRecIp[0]);
            }
            if ( !( GXutil.dateCompare(Z14716DRecReg, T01W92_A14716DRecReg[0]) ) )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecReg");
               GXutil.writeLogRaw("Old: ",Z14716DRecReg);
               GXutil.writeLogRaw("Current: ",T01W92_A14716DRecReg[0]);
            }
            if ( GXutil.strcmp(Z14717DRecTkn, T01W92_A14717DRecTkn[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.drec:[seudo value changed for attri]"+"DRecTkn");
               GXutil.writeLogRaw("Old: ",Z14717DRecTkn);
               GXutil.writeLogRaw("Current: ",T01W92_A14717DRecTkn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"DRec"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W91921( )
   {
      beforeValidate1W91921( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W91921( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W91921( 0) ;
         checkOptimisticConcurrency1W91921( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W91921( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W91921( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W98 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A14675DRecId), A14705DRecMaqCod, A14706DRecPLC, A14707DRecVal, A14676DRecFec, Boolean.valueOf(n14708DRecHdr), A14708DRecHdr, Boolean.valueOf(n14709DRecFasCod), A14709DRecFasCod, Boolean.valueOf(n14718DRecFasDsc), A14718DRecFasDsc, Boolean.valueOf(n14710DRecOrd), Short.valueOf(A14710DRecOrd), Boolean.valueOf(n14711DRecBarCod), Integer.valueOf(A14711DRecBarCod), Boolean.valueOf(n14712DRecBarReo), Byte.valueOf(A14712DRecBarReo), Boolean.valueOf(n14713DRecBarPar), A14713DRecBarPar, Boolean.valueOf(n14714DRecUsu), A14714DRecUsu, Boolean.valueOf(n14715DRecIp), A14715DRecIp, Boolean.valueOf(n14716DRecReg), A14716DRecReg, Boolean.valueOf(n14717DRecTkn), A14717DRecTkn});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("DRec");
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
                        resetCaption1W90( ) ;
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
            load1W91921( ) ;
         }
         endLevel1W91921( ) ;
      }
      closeExtendedTableCursors1W91921( ) ;
   }

   public void update1W91921( )
   {
      beforeValidate1W91921( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W91921( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W91921( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W91921( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1W91921( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W99 */
                  pr_default.execute(7, new Object[] {A14705DRecMaqCod, A14706DRecPLC, A14707DRecVal, A14676DRecFec, Boolean.valueOf(n14708DRecHdr), A14708DRecHdr, Boolean.valueOf(n14709DRecFasCod), A14709DRecFasCod, Boolean.valueOf(n14718DRecFasDsc), A14718DRecFasDsc, Boolean.valueOf(n14710DRecOrd), Short.valueOf(A14710DRecOrd), Boolean.valueOf(n14711DRecBarCod), Integer.valueOf(A14711DRecBarCod), Boolean.valueOf(n14712DRecBarReo), Byte.valueOf(A14712DRecBarReo), Boolean.valueOf(n14713DRecBarPar), A14713DRecBarPar, Boolean.valueOf(n14714DRecUsu), A14714DRecUsu, Boolean.valueOf(n14715DRecIp), A14715DRecIp, Boolean.valueOf(n14716DRecReg), A14716DRecReg, Boolean.valueOf(n14717DRecTkn), A14717DRecTkn, Long.valueOf(A14675DRecId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("DRec");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"DRec"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1W91921( ) ;
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
         endLevel1W91921( ) ;
      }
      closeExtendedTableCursors1W91921( ) ;
   }

   public void deferredUpdate1W91921( )
   {
   }

   public void delete( )
   {
      beforeValidate1W91921( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W91921( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W91921( ) ;
         afterConfirm1W91921( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W91921( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01W910 */
               pr_default.execute(8, new Object[] {Long.valueOf(A14675DRecId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("DRec");
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
      sMode1921 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W91921( ) ;
      Gx_mode = sMode1921 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W91921( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1W91921( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1W91921( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.drec");
         if ( AnyError == 0 )
         {
            confirmValues1W90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.drec");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1W91921( )
   {
      /* Scan By routine */
      /* Using cursor T01W911 */
      pr_default.execute(9);
      RcdFound1921 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1921 = (short)(1) ;
         A14675DRecId = T01W911_A14675DRecId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W91921( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1921 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1921 = (short)(1) ;
         A14675DRecId = T01W911_A14675DRecId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
      }
   }

   public void scanEnd1W91921( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1W91921( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1W91921( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W91921( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W91921( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W91921( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W91921( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W91921( )
   {
      edtDRecId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDRecId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDRecId_Enabled), 5, 0), true);
      edtDRecMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDRecMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDRecMaqCod_Enabled), 5, 0), true);
      edtDRecPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDRecPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDRecPLC_Enabled), 5, 0), true);
      edtDRecVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDRecVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDRecVal_Enabled), 5, 0), true);
      edtDRecFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDRecFec_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1W91921( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1W90( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.drec", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV11DRecId,12,0))}, new String[] {"Gx_mode","DRecId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DRec");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("DRecHdr", GXutil.rtrim( localUtil.format( A14708DRecHdr, "")));
      forbiddenHiddens.add("DRecFasCod", GXutil.rtrim( localUtil.format( A14709DRecFasCod, "")));
      forbiddenHiddens.add("DRecFasDsc", GXutil.rtrim( localUtil.format( A14718DRecFasDsc, "")));
      forbiddenHiddens.add("DRecOrd", localUtil.format( DecimalUtil.doubleToDec(A14710DRecOrd), "ZZZ9"));
      forbiddenHiddens.add("DRecBarCod", localUtil.format( DecimalUtil.doubleToDec(A14711DRecBarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("DRecBarReo", localUtil.format( DecimalUtil.doubleToDec(A14712DRecBarReo), "9"));
      forbiddenHiddens.add("DRecBarPar", GXutil.rtrim( localUtil.format( A14713DRecBarPar, "")));
      forbiddenHiddens.add("DRecUsu", GXutil.rtrim( localUtil.format( A14714DRecUsu, "")));
      forbiddenHiddens.add("DRecIp", GXutil.rtrim( localUtil.format( A14715DRecIp, "")));
      forbiddenHiddens.add("DRecReg", localUtil.format( A14716DRecReg, "99/99/99 99:99:99.999"));
      forbiddenHiddens.add("DRecTkn", GXutil.rtrim( localUtil.format( A14717DRecTkn, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\drec:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z14675DRecId", GXutil.ltrim( localUtil.ntoc( Z14675DRecId, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14705DRecMaqCod", GXutil.rtrim( Z14705DRecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14706DRecPLC", Z14706DRecPLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14707DRecVal", GXutil.rtrim( Z14707DRecVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14676DRecFec", localUtil.ttoc( Z14676DRecFec, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14708DRecHdr", GXutil.rtrim( Z14708DRecHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14709DRecFasCod", GXutil.rtrim( Z14709DRecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14718DRecFasDsc", Z14718DRecFasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14710DRecOrd", GXutil.ltrim( localUtil.ntoc( Z14710DRecOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14711DRecBarCod", GXutil.ltrim( localUtil.ntoc( Z14711DRecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14712DRecBarReo", GXutil.ltrim( localUtil.ntoc( Z14712DRecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14713DRecBarPar", GXutil.rtrim( Z14713DRecBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14714DRecUsu", GXutil.rtrim( Z14714DRecUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14715DRecIp", Z14715DRecIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14716DRecReg", localUtil.ttoc( Z14716DRecReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14717DRecTkn", Z14717DRecTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV9TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vDRECID", GXutil.ltrim( localUtil.ntoc( AV11DRecId, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDRECID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11DRecId), "ZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DRECHDR", GXutil.rtrim( A14708DRecHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "DRECFASCOD", GXutil.rtrim( A14709DRecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DRECFASDSC", A14718DRecFasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "DRECORD", GXutil.ltrim( localUtil.ntoc( A14710DRecOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DRECBARCOD", GXutil.ltrim( localUtil.ntoc( A14711DRecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DRECBARREO", GXutil.ltrim( localUtil.ntoc( A14712DRecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DRECBARPAR", GXutil.rtrim( A14713DRecBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "DRECUSU", GXutil.rtrim( A14714DRecUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "DRECIP", A14715DRecIp);
      app.GxWebStd.gx_hidden_field( httpContext, "DRECREG", localUtil.ttoc( A14716DRecReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DRECTKN", A14717DRecTkn);
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
      return formatLink("app.ingenieria.drec", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV11DRecId,12,0))}, new String[] {"Gx_mode","DRecId"})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.DRec" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Data Recepcion Enlace c/PLC", "") ;
   }

   public void initializeNonKey1W91921( )
   {
      A14705DRecMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14705DRecMaqCod", A14705DRecMaqCod);
      A14706DRecPLC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14706DRecPLC", A14706DRecPLC);
      A14707DRecVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14707DRecVal", A14707DRecVal);
      A14676DRecFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14676DRecFec", localUtil.ttoc( A14676DRecFec, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14708DRecHdr = "" ;
      n14708DRecHdr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14708DRecHdr", A14708DRecHdr);
      A14709DRecFasCod = "" ;
      n14709DRecFasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14709DRecFasCod", A14709DRecFasCod);
      A14718DRecFasDsc = "" ;
      n14718DRecFasDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14718DRecFasDsc", A14718DRecFasDsc);
      A14710DRecOrd = (short)(0) ;
      n14710DRecOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14710DRecOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14710DRecOrd), 4, 0));
      A14711DRecBarCod = 0 ;
      n14711DRecBarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14711DRecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14711DRecBarCod), 8, 0));
      A14712DRecBarReo = (byte)(0) ;
      n14712DRecBarReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14712DRecBarReo", GXutil.str( A14712DRecBarReo, 1, 0));
      A14713DRecBarPar = "" ;
      n14713DRecBarPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14713DRecBarPar", A14713DRecBarPar);
      A14714DRecUsu = "" ;
      n14714DRecUsu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14714DRecUsu", A14714DRecUsu);
      A14715DRecIp = "" ;
      n14715DRecIp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14715DRecIp", A14715DRecIp);
      A14716DRecReg = GXutil.resetTime( GXutil.nullDate() );
      n14716DRecReg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14716DRecReg", localUtil.ttoc( A14716DRecReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14717DRecTkn = "" ;
      n14717DRecTkn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14717DRecTkn", A14717DRecTkn);
      Z14705DRecMaqCod = "" ;
      Z14706DRecPLC = "" ;
      Z14707DRecVal = "" ;
      Z14676DRecFec = GXutil.resetTime( GXutil.nullDate() );
      Z14708DRecHdr = "" ;
      Z14709DRecFasCod = "" ;
      Z14718DRecFasDsc = "" ;
      Z14710DRecOrd = (short)(0) ;
      Z14711DRecBarCod = 0 ;
      Z14712DRecBarReo = (byte)(0) ;
      Z14713DRecBarPar = "" ;
      Z14714DRecUsu = "" ;
      Z14715DRecIp = "" ;
      Z14716DRecReg = GXutil.resetTime( GXutil.nullDate() );
      Z14717DRecTkn = "" ;
   }

   public void initAll1W91921( )
   {
      A14675DRecId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14675DRecId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14675DRecId), 12, 0));
      initializeNonKey1W91921( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116105783", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/drec.js", "?202682116105783", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtDRecId_Internalname = "DRECID" ;
      edtDRecMaqCod_Internalname = "DRECMAQCOD" ;
      edtDRecPLC_Internalname = "DRECPLC" ;
      edtDRecVal_Internalname = "DRECVAL" ;
      edtDRecFec_Internalname = "DRECFEC" ;
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
      Form.setCaption( httpContext.getMessage( "Data Recepcion Enlace c/PLC", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDRecFec_Jsonclick = "" ;
      edtDRecFec_Enabled = 1 ;
      edtDRecVal_Jsonclick = "" ;
      edtDRecVal_Enabled = 1 ;
      edtDRecPLC_Jsonclick = "" ;
      edtDRecPLC_Enabled = 1 ;
      edtDRecMaqCod_Jsonclick = "" ;
      edtDRecMaqCod_Enabled = 1 ;
      edtDRecId_Jsonclick = "" ;
      edtDRecId_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11DRecId',fld:'vDRECID',pic:'ZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV11DRecId',fld:'vDRECID',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'A14708DRecHdr',fld:'DRECHDR',pic:''},{av:'A14709DRecFasCod',fld:'DRECFASCOD',pic:''},{av:'A14718DRecFasDsc',fld:'DRECFASDSC',pic:''},{av:'A14710DRecOrd',fld:'DRECORD',pic:'ZZZ9'},{av:'A14711DRecBarCod',fld:'DRECBARCOD',pic:'ZZZZZZZ9'},{av:'A14712DRecBarReo',fld:'DRECBARREO',pic:'9'},{av:'A14713DRecBarPar',fld:'DRECBARPAR',pic:''},{av:'A14714DRecUsu',fld:'DRECUSU',pic:''},{av:'A14715DRecIp',fld:'DRECIP',pic:''},{av:'A14716DRecReg',fld:'DRECREG',pic:'99/99/99 99:99:99.999'},{av:'A14717DRecTkn',fld:'DRECTKN',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121W92',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_DRECID","{handler:'valid_Drecid',iparms:[]");
      setEventMetadata("VALID_DRECID",",oparms:[]}");
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
      Z14705DRecMaqCod = "" ;
      Z14706DRecPLC = "" ;
      Z14707DRecVal = "" ;
      Z14676DRecFec = GXutil.resetTime( GXutil.nullDate() );
      Z14708DRecHdr = "" ;
      Z14709DRecFasCod = "" ;
      Z14718DRecFasDsc = "" ;
      Z14713DRecBarPar = "" ;
      Z14714DRecUsu = "" ;
      Z14715DRecIp = "" ;
      Z14716DRecReg = GXutil.resetTime( GXutil.nullDate() );
      Z14717DRecTkn = "" ;
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
      A14705DRecMaqCod = "" ;
      A14706DRecPLC = "" ;
      A14707DRecVal = "" ;
      A14676DRecFec = GXutil.resetTime( GXutil.nullDate() );
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV16Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A14708DRecHdr = "" ;
      A14709DRecFasCod = "" ;
      A14718DRecFasDsc = "" ;
      A14713DRecBarPar = "" ;
      A14714DRecUsu = "" ;
      A14715DRecIp = "" ;
      A14716DRecReg = GXutil.resetTime( GXutil.nullDate() );
      A14717DRecTkn = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1921 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV13EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV14EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV15UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV8WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV9TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      T01W94_A14675DRecId = new long[1] ;
      T01W94_A14705DRecMaqCod = new String[] {""} ;
      T01W94_A14706DRecPLC = new String[] {""} ;
      T01W94_A14707DRecVal = new String[] {""} ;
      T01W94_A14676DRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W94_A14708DRecHdr = new String[] {""} ;
      T01W94_n14708DRecHdr = new boolean[] {false} ;
      T01W94_A14709DRecFasCod = new String[] {""} ;
      T01W94_n14709DRecFasCod = new boolean[] {false} ;
      T01W94_A14718DRecFasDsc = new String[] {""} ;
      T01W94_n14718DRecFasDsc = new boolean[] {false} ;
      T01W94_A14710DRecOrd = new short[1] ;
      T01W94_n14710DRecOrd = new boolean[] {false} ;
      T01W94_A14711DRecBarCod = new int[1] ;
      T01W94_n14711DRecBarCod = new boolean[] {false} ;
      T01W94_A14712DRecBarReo = new byte[1] ;
      T01W94_n14712DRecBarReo = new boolean[] {false} ;
      T01W94_A14713DRecBarPar = new String[] {""} ;
      T01W94_n14713DRecBarPar = new boolean[] {false} ;
      T01W94_A14714DRecUsu = new String[] {""} ;
      T01W94_n14714DRecUsu = new boolean[] {false} ;
      T01W94_A14715DRecIp = new String[] {""} ;
      T01W94_n14715DRecIp = new boolean[] {false} ;
      T01W94_A14716DRecReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01W94_n14716DRecReg = new boolean[] {false} ;
      T01W94_A14717DRecTkn = new String[] {""} ;
      T01W94_n14717DRecTkn = new boolean[] {false} ;
      T01W95_A14675DRecId = new long[1] ;
      T01W93_A14675DRecId = new long[1] ;
      T01W93_A14705DRecMaqCod = new String[] {""} ;
      T01W93_A14706DRecPLC = new String[] {""} ;
      T01W93_A14707DRecVal = new String[] {""} ;
      T01W93_A14676DRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W93_A14708DRecHdr = new String[] {""} ;
      T01W93_n14708DRecHdr = new boolean[] {false} ;
      T01W93_A14709DRecFasCod = new String[] {""} ;
      T01W93_n14709DRecFasCod = new boolean[] {false} ;
      T01W93_A14718DRecFasDsc = new String[] {""} ;
      T01W93_n14718DRecFasDsc = new boolean[] {false} ;
      T01W93_A14710DRecOrd = new short[1] ;
      T01W93_n14710DRecOrd = new boolean[] {false} ;
      T01W93_A14711DRecBarCod = new int[1] ;
      T01W93_n14711DRecBarCod = new boolean[] {false} ;
      T01W93_A14712DRecBarReo = new byte[1] ;
      T01W93_n14712DRecBarReo = new boolean[] {false} ;
      T01W93_A14713DRecBarPar = new String[] {""} ;
      T01W93_n14713DRecBarPar = new boolean[] {false} ;
      T01W93_A14714DRecUsu = new String[] {""} ;
      T01W93_n14714DRecUsu = new boolean[] {false} ;
      T01W93_A14715DRecIp = new String[] {""} ;
      T01W93_n14715DRecIp = new boolean[] {false} ;
      T01W93_A14716DRecReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01W93_n14716DRecReg = new boolean[] {false} ;
      T01W93_A14717DRecTkn = new String[] {""} ;
      T01W93_n14717DRecTkn = new boolean[] {false} ;
      T01W96_A14675DRecId = new long[1] ;
      T01W97_A14675DRecId = new long[1] ;
      T01W92_A14675DRecId = new long[1] ;
      T01W92_A14705DRecMaqCod = new String[] {""} ;
      T01W92_A14706DRecPLC = new String[] {""} ;
      T01W92_A14707DRecVal = new String[] {""} ;
      T01W92_A14676DRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W92_A14708DRecHdr = new String[] {""} ;
      T01W92_n14708DRecHdr = new boolean[] {false} ;
      T01W92_A14709DRecFasCod = new String[] {""} ;
      T01W92_n14709DRecFasCod = new boolean[] {false} ;
      T01W92_A14718DRecFasDsc = new String[] {""} ;
      T01W92_n14718DRecFasDsc = new boolean[] {false} ;
      T01W92_A14710DRecOrd = new short[1] ;
      T01W92_n14710DRecOrd = new boolean[] {false} ;
      T01W92_A14711DRecBarCod = new int[1] ;
      T01W92_n14711DRecBarCod = new boolean[] {false} ;
      T01W92_A14712DRecBarReo = new byte[1] ;
      T01W92_n14712DRecBarReo = new boolean[] {false} ;
      T01W92_A14713DRecBarPar = new String[] {""} ;
      T01W92_n14713DRecBarPar = new boolean[] {false} ;
      T01W92_A14714DRecUsu = new String[] {""} ;
      T01W92_n14714DRecUsu = new boolean[] {false} ;
      T01W92_A14715DRecIp = new String[] {""} ;
      T01W92_n14715DRecIp = new boolean[] {false} ;
      T01W92_A14716DRecReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01W92_n14716DRecReg = new boolean[] {false} ;
      T01W92_A14717DRecTkn = new String[] {""} ;
      T01W92_n14717DRecTkn = new boolean[] {false} ;
      T01W911_A14675DRecId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ingenieria.drec__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.drec__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.drec__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.drec__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.drec__default(),
         new Object[] {
             new Object[] {
            T01W92_A14675DRecId, T01W92_A14705DRecMaqCod, T01W92_A14706DRecPLC, T01W92_A14707DRecVal, T01W92_A14676DRecFec, T01W92_A14708DRecHdr, T01W92_n14708DRecHdr, T01W92_A14709DRecFasCod, T01W92_n14709DRecFasCod, T01W92_A14718DRecFasDsc,
            T01W92_n14718DRecFasDsc, T01W92_A14710DRecOrd, T01W92_n14710DRecOrd, T01W92_A14711DRecBarCod, T01W92_n14711DRecBarCod, T01W92_A14712DRecBarReo, T01W92_n14712DRecBarReo, T01W92_A14713DRecBarPar, T01W92_n14713DRecBarPar, T01W92_A14714DRecUsu,
            T01W92_n14714DRecUsu, T01W92_A14715DRecIp, T01W92_n14715DRecIp, T01W92_A14716DRecReg, T01W92_n14716DRecReg, T01W92_A14717DRecTkn, T01W92_n14717DRecTkn
            }
            , new Object[] {
            T01W93_A14675DRecId, T01W93_A14705DRecMaqCod, T01W93_A14706DRecPLC, T01W93_A14707DRecVal, T01W93_A14676DRecFec, T01W93_A14708DRecHdr, T01W93_n14708DRecHdr, T01W93_A14709DRecFasCod, T01W93_n14709DRecFasCod, T01W93_A14718DRecFasDsc,
            T01W93_n14718DRecFasDsc, T01W93_A14710DRecOrd, T01W93_n14710DRecOrd, T01W93_A14711DRecBarCod, T01W93_n14711DRecBarCod, T01W93_A14712DRecBarReo, T01W93_n14712DRecBarReo, T01W93_A14713DRecBarPar, T01W93_n14713DRecBarPar, T01W93_A14714DRecUsu,
            T01W93_n14714DRecUsu, T01W93_A14715DRecIp, T01W93_n14715DRecIp, T01W93_A14716DRecReg, T01W93_n14716DRecReg, T01W93_A14717DRecTkn, T01W93_n14717DRecTkn
            }
            , new Object[] {
            T01W94_A14675DRecId, T01W94_A14705DRecMaqCod, T01W94_A14706DRecPLC, T01W94_A14707DRecVal, T01W94_A14676DRecFec, T01W94_A14708DRecHdr, T01W94_n14708DRecHdr, T01W94_A14709DRecFasCod, T01W94_n14709DRecFasCod, T01W94_A14718DRecFasDsc,
            T01W94_n14718DRecFasDsc, T01W94_A14710DRecOrd, T01W94_n14710DRecOrd, T01W94_A14711DRecBarCod, T01W94_n14711DRecBarCod, T01W94_A14712DRecBarReo, T01W94_n14712DRecBarReo, T01W94_A14713DRecBarPar, T01W94_n14713DRecBarPar, T01W94_A14714DRecUsu,
            T01W94_n14714DRecUsu, T01W94_A14715DRecIp, T01W94_n14715DRecIp, T01W94_A14716DRecReg, T01W94_n14716DRecReg, T01W94_A14717DRecTkn, T01W94_n14717DRecTkn
            }
            , new Object[] {
            T01W95_A14675DRecId
            }
            , new Object[] {
            T01W96_A14675DRecId
            }
            , new Object[] {
            T01W97_A14675DRecId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W911_A14675DRecId
            }
         }
      );
      AV16Pgmname = "Ingenieria.DRec" ;
   }

   private byte Z14712DRecBarReo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14712DRecBarReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z14710DRecOrd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14710DRecOrd ;
   private short RcdFound1921 ;
   private short nIsDirty_1921 ;
   private int Z14711DRecBarCod ;
   private int trnEnded ;
   private int edtDRecId_Enabled ;
   private int edtDRecMaqCod_Enabled ;
   private int edtDRecPLC_Enabled ;
   private int edtDRecVal_Enabled ;
   private int edtDRecFec_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A14711DRecBarCod ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV11DRecId ;
   private long Z14675DRecId ;
   private long AV11DRecId ;
   private long A14675DRecId ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z14705DRecMaqCod ;
   private String Z14707DRecVal ;
   private String Z14708DRecHdr ;
   private String Z14709DRecFasCod ;
   private String Z14713DRecBarPar ;
   private String Z14714DRecUsu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDRecId_Internalname ;
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
   private String edtDRecId_Jsonclick ;
   private String edtDRecMaqCod_Internalname ;
   private String A14705DRecMaqCod ;
   private String edtDRecMaqCod_Jsonclick ;
   private String edtDRecPLC_Internalname ;
   private String edtDRecPLC_Jsonclick ;
   private String edtDRecVal_Internalname ;
   private String A14707DRecVal ;
   private String edtDRecVal_Jsonclick ;
   private String edtDRecFec_Internalname ;
   private String edtDRecFec_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV16Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A14708DRecHdr ;
   private String A14709DRecFasCod ;
   private String A14713DRecBarPar ;
   private String A14714DRecUsu ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1921 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV13EmprCod ;
   private String GXv_char2[] ;
   private String AV14EmprNom ;
   private String GXv_char3[] ;
   private String AV15UsurCod ;
   private String GXv_char4[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z14676DRecFec ;
   private java.util.Date Z14716DRecReg ;
   private java.util.Date A14676DRecFec ;
   private java.util.Date A14716DRecReg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n14708DRecHdr ;
   private boolean n14709DRecFasCod ;
   private boolean n14718DRecFasDsc ;
   private boolean n14710DRecOrd ;
   private boolean n14711DRecBarCod ;
   private boolean n14712DRecBarReo ;
   private boolean n14713DRecBarPar ;
   private boolean n14714DRecUsu ;
   private boolean n14715DRecIp ;
   private boolean n14716DRecReg ;
   private boolean n14717DRecTkn ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z14706DRecPLC ;
   private String Z14718DRecFasDsc ;
   private String Z14715DRecIp ;
   private String Z14717DRecTkn ;
   private String A14706DRecPLC ;
   private String A14718DRecFasDsc ;
   private String A14715DRecIp ;
   private String A14717DRecTkn ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private long[] T01W94_A14675DRecId ;
   private String[] T01W94_A14705DRecMaqCod ;
   private String[] T01W94_A14706DRecPLC ;
   private String[] T01W94_A14707DRecVal ;
   private java.util.Date[] T01W94_A14676DRecFec ;
   private String[] T01W94_A14708DRecHdr ;
   private boolean[] T01W94_n14708DRecHdr ;
   private String[] T01W94_A14709DRecFasCod ;
   private boolean[] T01W94_n14709DRecFasCod ;
   private String[] T01W94_A14718DRecFasDsc ;
   private boolean[] T01W94_n14718DRecFasDsc ;
   private short[] T01W94_A14710DRecOrd ;
   private boolean[] T01W94_n14710DRecOrd ;
   private int[] T01W94_A14711DRecBarCod ;
   private boolean[] T01W94_n14711DRecBarCod ;
   private byte[] T01W94_A14712DRecBarReo ;
   private boolean[] T01W94_n14712DRecBarReo ;
   private String[] T01W94_A14713DRecBarPar ;
   private boolean[] T01W94_n14713DRecBarPar ;
   private String[] T01W94_A14714DRecUsu ;
   private boolean[] T01W94_n14714DRecUsu ;
   private String[] T01W94_A14715DRecIp ;
   private boolean[] T01W94_n14715DRecIp ;
   private java.util.Date[] T01W94_A14716DRecReg ;
   private boolean[] T01W94_n14716DRecReg ;
   private String[] T01W94_A14717DRecTkn ;
   private boolean[] T01W94_n14717DRecTkn ;
   private long[] T01W95_A14675DRecId ;
   private long[] T01W93_A14675DRecId ;
   private String[] T01W93_A14705DRecMaqCod ;
   private String[] T01W93_A14706DRecPLC ;
   private String[] T01W93_A14707DRecVal ;
   private java.util.Date[] T01W93_A14676DRecFec ;
   private String[] T01W93_A14708DRecHdr ;
   private boolean[] T01W93_n14708DRecHdr ;
   private String[] T01W93_A14709DRecFasCod ;
   private boolean[] T01W93_n14709DRecFasCod ;
   private String[] T01W93_A14718DRecFasDsc ;
   private boolean[] T01W93_n14718DRecFasDsc ;
   private short[] T01W93_A14710DRecOrd ;
   private boolean[] T01W93_n14710DRecOrd ;
   private int[] T01W93_A14711DRecBarCod ;
   private boolean[] T01W93_n14711DRecBarCod ;
   private byte[] T01W93_A14712DRecBarReo ;
   private boolean[] T01W93_n14712DRecBarReo ;
   private String[] T01W93_A14713DRecBarPar ;
   private boolean[] T01W93_n14713DRecBarPar ;
   private String[] T01W93_A14714DRecUsu ;
   private boolean[] T01W93_n14714DRecUsu ;
   private String[] T01W93_A14715DRecIp ;
   private boolean[] T01W93_n14715DRecIp ;
   private java.util.Date[] T01W93_A14716DRecReg ;
   private boolean[] T01W93_n14716DRecReg ;
   private String[] T01W93_A14717DRecTkn ;
   private boolean[] T01W93_n14717DRecTkn ;
   private long[] T01W96_A14675DRecId ;
   private long[] T01W97_A14675DRecId ;
   private long[] T01W92_A14675DRecId ;
   private String[] T01W92_A14705DRecMaqCod ;
   private String[] T01W92_A14706DRecPLC ;
   private String[] T01W92_A14707DRecVal ;
   private java.util.Date[] T01W92_A14676DRecFec ;
   private String[] T01W92_A14708DRecHdr ;
   private boolean[] T01W92_n14708DRecHdr ;
   private String[] T01W92_A14709DRecFasCod ;
   private boolean[] T01W92_n14709DRecFasCod ;
   private String[] T01W92_A14718DRecFasDsc ;
   private boolean[] T01W92_n14718DRecFasDsc ;
   private short[] T01W92_A14710DRecOrd ;
   private boolean[] T01W92_n14710DRecOrd ;
   private int[] T01W92_A14711DRecBarCod ;
   private boolean[] T01W92_n14711DRecBarCod ;
   private byte[] T01W92_A14712DRecBarReo ;
   private boolean[] T01W92_n14712DRecBarReo ;
   private String[] T01W92_A14713DRecBarPar ;
   private boolean[] T01W92_n14713DRecBarPar ;
   private String[] T01W92_A14714DRecUsu ;
   private boolean[] T01W92_n14714DRecUsu ;
   private String[] T01W92_A14715DRecIp ;
   private boolean[] T01W92_n14715DRecIp ;
   private java.util.Date[] T01W92_A14716DRecReg ;
   private boolean[] T01W92_n14716DRecReg ;
   private String[] T01W92_A14717DRecTkn ;
   private boolean[] T01W92_n14717DRecTkn ;
   private long[] T01W911_A14675DRecId ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV8WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV9TrnContext ;
}

final  class drec__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class drec__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class drec__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class drec__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class drec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01W92", "SELECT DRecId, DRecMaqCod, DRecPLC, DRecVal, DRecFec, DRecHdr, DRecFasCod, DRecFasDsc, DRecOrd, DRecBarCod, DRecBarReo, DRecBarPar, DRecUsu, DRecIp, DRecReg, DRecTkn FROM DRec WHERE DRecId = ?  FOR UPDATE OF DRecMaqCod, DRecPLC, DRecVal, DRecFec, DRecHdr, DRecFasCod, DRecFasDsc, DRecOrd, DRecBarCod, DRecBarReo, DRecBarPar, DRecUsu, DRecIp, DRecReg, DRecTkn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W93", "SELECT DRecId, DRecMaqCod, DRecPLC, DRecVal, DRecFec, DRecHdr, DRecFasCod, DRecFasDsc, DRecOrd, DRecBarCod, DRecBarReo, DRecBarPar, DRecUsu, DRecIp, DRecReg, DRecTkn FROM DRec WHERE DRecId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W94", "SELECT /*+ FIRST_ROWS(100) */ TM1.DRecId, TM1.DRecMaqCod, TM1.DRecPLC, TM1.DRecVal, TM1.DRecFec, TM1.DRecHdr, TM1.DRecFasCod, TM1.DRecFasDsc, TM1.DRecOrd, TM1.DRecBarCod, TM1.DRecBarReo, TM1.DRecBarPar, TM1.DRecUsu, TM1.DRecIp, TM1.DRecReg, TM1.DRecTkn FROM DRec TM1 WHERE TM1.DRecId = ? ORDER BY TM1.DRecId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W95", "SELECT /*+ FIRST_ROWS(1) */ DRecId FROM DRec WHERE DRecId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W96", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ DRecId FROM DRec WHERE ( DRecId > ?) ORDER BY DRecId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W97", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ DRecId FROM DRec WHERE ( DRecId < ?) ORDER BY DRecId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01W98", "INSERT INTO DRec(DRecId, DRecMaqCod, DRecPLC, DRecVal, DRecFec, DRecHdr, DRecFasCod, DRecFasDsc, DRecOrd, DRecBarCod, DRecBarReo, DRecBarPar, DRecUsu, DRecIp, DRecReg, DRecTkn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "DRec")
         ,new UpdateCursor("T01W99", "UPDATE DRec SET DRecMaqCod=?, DRecPLC=?, DRecVal=?, DRecFec=?, DRecHdr=?, DRecFasCod=?, DRecFasDsc=?, DRecOrd=?, DRecBarCod=?, DRecBarReo=?, DRecBarPar=?, DRecUsu=?, DRecIp=?, DRecReg=?, DRecTkn=?  WHERE DRecId = ?", GX_NOMASK, "DRec")
         ,new UpdateCursor("T01W910", "DELETE FROM DRec  WHERE DRecId = ?", GX_NOMASK, "DRec")
         ,new ForEachCursor("T01W911", "SELECT /*+ FIRST_ROWS(100) */ DRecId FROM DRec ORDER BY DRecId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5, true);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(15, true);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5, true);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(15, true);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5, true);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(15, true);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 6);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setDateTime(5, (java.util.Date)parms[4], false, true);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 8);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[10], 100);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 8);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[22], 20);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[24], false, true);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[26], 256);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setVarchar(2, (String)parms[1], 100, false);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setDateTime(4, (java.util.Date)parms[3], false, true);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 100);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 8);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[23], false, true);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[25], 256);
               }
               stmt.setLong(16, ((Number) parms[26]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

