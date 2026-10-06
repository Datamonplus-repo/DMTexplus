package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tens003_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A5532Lb_numero) ;
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
            AV33Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Lb_numero), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_NUMERO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Lb_numero), "ZZZZZZZ9")));
            AV34Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Lb_opcion", AV34Lb_opcion);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_OPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Lb_opcion, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENSAYOS, ACEPTACION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tens003_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tens003_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tens003_impl.class ));
   }

   public tens003_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_numero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_numero_Internalname, httpContext.getMessage( "Nº de Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_numero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_numero_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_opcion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_opcion_Internalname, httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_opcion_Internalname, GXutil.rtrim( A5555Lb_opcion), GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_opcion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_opcion_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_FechaEn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_FechaEn_Internalname, httpContext.getMessage( "Fecha Envio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FechaEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FechaEn_Internalname, localUtil.format(A5567Lb_FechaEn, "99/99/99"), localUtil.format( A5567Lb_FechaEn, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FechaEn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_FechaEn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FechaEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FechaEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_HoraEn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_HoraEn_Internalname, httpContext.getMessage( "Hora Envio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_HoraEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_HoraEn_Internalname, localUtil.ttoc( A5568Lb_HoraEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5568Lb_HoraEn, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_HoraEn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_HoraEn_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_HoraEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_HoraEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_FechaR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_FechaR_Internalname, httpContext.getMessage( "Fecha Recepcion Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FechaR_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FechaR_Internalname, localUtil.format(A5563Lb_FechaR, "99/99/99"), localUtil.format( A5563Lb_FechaR, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FechaR_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_FechaR_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FechaR_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FechaR_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_HoraR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_HoraR_Internalname, httpContext.getMessage( "Hora Recepcion Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_HoraR_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_HoraR_Internalname, localUtil.ttoc( A5564Lb_HoraR, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5564Lb_HoraR, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_HoraR_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_HoraR_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_HoraR_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_HoraR_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_CosteE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_CosteE_Internalname, httpContext.getMessage( "Coste Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_CosteE_Internalname, GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_CosteE_Enabled!=0) ? localUtil.format( A5565Lb_CosteE, "ZZZZ9.99999") : localUtil.format( A5565Lb_CosteE, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_CosteE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_CosteE_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_Estado_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_Estado_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Estado_Internalname, GXutil.ltrim( localUtil.ntoc( A5566Lb_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_Estado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5566Lb_Estado), "9") : localUtil.format( DecimalUtil.doubleToDec(A5566Lb_Estado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Estado_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_Estado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_numop_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_numop_Internalname, httpContext.getMessage( "Numero Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_numop_Internalname, GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_numop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_numop_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_numop_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_PreKg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_PreKg_Internalname, httpContext.getMessage( "Precio Facturacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_PreKg_Internalname, GXutil.ltrim( localUtil.ntoc( A5989Lb_PreKg, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_PreKg_Enabled!=0) ? localUtil.format( A5989Lb_PreKg, "ZZZZZ9.99999") : localUtil.format( A5989Lb_PreKg, "ZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_PreKg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_PreKg_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_FecPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_FecPre_Internalname, httpContext.getMessage( "Fecha del Precio a cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecPre_Internalname, localUtil.format(A6192Lb_FecPre, "99/99/99"), localUtil.format( A6192Lb_FecPre, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_FecPre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_FecEnt1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_FecEnt1_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecEnt1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecEnt1_Internalname, localUtil.format(A6460Lb_FecEnt1, "99/99/99"), localUtil.format( A6460Lb_FecEnt1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecEnt1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_FecEnt1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecEnt1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecEnt1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_FecNoa1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_FecNoa1_Internalname, httpContext.getMessage( "Fecha No aceptacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecNoa1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecNoa1_Internalname, localUtil.format(A6461Lb_FecNoa1, "99/99/99"), localUtil.format( A6461Lb_FecNoa1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecNoa1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_FecNoa1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecNoa1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecNoa1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_ProvDef_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_ProvDef_Internalname, httpContext.getMessage( "Provisional o Definitivo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_ProvDef_Internalname, GXutil.rtrim( A6631Lb_ProvDef), GXutil.rtrim( localUtil.format( A6631Lb_ProvDef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_ProvDef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_ProvDef_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_NumAux_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_NumAux_Internalname, httpContext.getMessage( "Nº Ensayo a cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_NumAux_Internalname, GXutil.ltrim( localUtil.ntoc( A7395Lb_NumAux, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_NumAux_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7395Lb_NumAux), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7395Lb_NumAux), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_NumAux_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_NumAux_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_CosteC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_CosteC_Internalname, httpContext.getMessage( "Coste Colorantes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_CosteC_Internalname, GXutil.ltrim( localUtil.ntoc( A1127Lb_CosteC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_CosteC_Enabled!=0) ? localUtil.format( A1127Lb_CosteC, "ZZZZ9.99999") : localUtil.format( A1127Lb_CosteC, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_CosteC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_CosteC_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_hhent1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_hhent1_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_hhent1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_hhent1_Internalname, localUtil.ttoc( A10081Lb_hhent1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10081Lb_hhent1, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_hhent1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_hhent1_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_hhent1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_hhent1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_hhnoa1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_hhnoa1_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_hhnoa1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_hhnoa1_Internalname, localUtil.ttoc( A10082Lb_hhnoa1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10082Lb_hhnoa1, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_hhnoa1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_hhnoa1_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_hhnoa1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_hhnoa1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_PreMt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_PreMt_Internalname, httpContext.getMessage( "Precio Mt", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_PreMt_Internalname, GXutil.ltrim( localUtil.ntoc( A10083Lb_PreMt, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_PreMt_Enabled!=0) ? localUtil.format( A10083Lb_PreMt, "ZZZZZ9.99999") : localUtil.format( A10083Lb_PreMt, "ZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_PreMt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_PreMt_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_ObsCR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_ObsCR_Internalname, httpContext.getMessage( "Observaciones Cliente Recepcion Cartaz", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtLb_ObsCR_Internalname, A10822Lb_ObsCR, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", (short)(0), 1, edtLb_ObsCR_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_ObsFac_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_ObsFac_Internalname, httpContext.getMessage( "Observaciones Precio Lab Dip", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtLb_ObsFac_Internalname, A12731Lb_ObsFac, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", (short)(0), 1, edtLb_ObsFac_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_GestionLaboratorio\\TENS003.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TENS003.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV38Pgmname), GXutil.rtrim( localUtil.format( AV38Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TENS003.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      e11QS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "Z5532Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5555Lb_opcion = httpContext.cgiGet( "Z5555Lb_opcion") ;
            Z5567Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( "Z5567Lb_FechaEn"), 0) ;
            Z5568Lb_HoraEn = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5568Lb_HoraEn"), 0)) ;
            Z5563Lb_FechaR = localUtil.ctod( httpContext.cgiGet( "Z5563Lb_FechaR"), 0) ;
            Z5564Lb_HoraR = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5564Lb_HoraR"), 0)) ;
            Z5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( "Z5565Lb_CosteE")) ;
            Z5566Lb_Estado = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5566Lb_Estado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5718Lb_numop"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5989Lb_PreKg = localUtil.ctond( httpContext.cgiGet( "Z5989Lb_PreKg")) ;
            Z6192Lb_FecPre = localUtil.ctod( httpContext.cgiGet( "Z6192Lb_FecPre"), 0) ;
            Z6460Lb_FecEnt1 = localUtil.ctod( httpContext.cgiGet( "Z6460Lb_FecEnt1"), 0) ;
            Z6461Lb_FecNoa1 = localUtil.ctod( httpContext.cgiGet( "Z6461Lb_FecNoa1"), 0) ;
            Z6631Lb_ProvDef = httpContext.cgiGet( "Z6631Lb_ProvDef") ;
            Z7395Lb_NumAux = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7395Lb_NumAux"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1127Lb_CosteC = localUtil.ctond( httpContext.cgiGet( "Z1127Lb_CosteC")) ;
            Z10081Lb_hhent1 = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z10081Lb_hhent1"), 0)) ;
            Z10082Lb_hhnoa1 = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z10082Lb_hhnoa1"), 0)) ;
            Z10083Lb_PreMt = localUtil.ctond( httpContext.cgiGet( "Z10083Lb_PreMt")) ;
            Z10822Lb_ObsCR = httpContext.cgiGet( "Z10822Lb_ObsCR") ;
            Z12731Lb_ObsFac = httpContext.cgiGet( "Z12731Lb_ObsFac") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV33Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "vLB_NUMERO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Lb_opcion = httpContext.cgiGet( "vLB_OPCION") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NUMERO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5532Lb_numero = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            }
            else
            {
               A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            }
            A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FechaEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECHAEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FechaEn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5567Lb_FechaEn = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A5567Lb_FechaEn", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
            }
            else
            {
               A5567Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( edtLb_FechaEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5567Lb_FechaEn", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_HoraEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "LB_HORAEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_HoraEn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A5568Lb_HoraEn", localUtil.ttoc( A5568Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A5568Lb_HoraEn = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraEn_Internalname))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5568Lb_HoraEn", localUtil.ttoc( A5568Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FechaR_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECHAR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FechaR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5563Lb_FechaR = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A5563Lb_FechaR", localUtil.format(A5563Lb_FechaR, "99/99/99"));
            }
            else
            {
               A5563Lb_FechaR = localUtil.ctod( httpContext.cgiGet( edtLb_FechaR_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5563Lb_FechaR", localUtil.format(A5563Lb_FechaR, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_HoraR_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "LB_HORAR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_HoraR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A5564Lb_HoraR", localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A5564Lb_HoraR = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraR_Internalname))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5564Lb_HoraR", localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_COSTEE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_CosteE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5565Lb_CosteE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A5565Lb_CosteE", GXutil.ltrimstr( A5565Lb_CosteE, 11, 5));
            }
            else
            {
               A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5565Lb_CosteE", GXutil.ltrimstr( A5565Lb_CosteE, 11, 5));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Estado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_Estado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_ESTADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_Estado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5566Lb_Estado = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5566Lb_Estado", GXutil.str( A5566Lb_Estado, 1, 0));
            }
            else
            {
               A5566Lb_Estado = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_Estado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5566Lb_Estado", GXutil.str( A5566Lb_Estado, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NUMOP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_numop_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5718Lb_numop = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5718Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5718Lb_numop), 2, 0));
            }
            else
            {
               A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5718Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5718Lb_numop), 2, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_PreKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_PreKg_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_PREKG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_PreKg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5989Lb_PreKg = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A5989Lb_PreKg", GXutil.ltrimstr( A5989Lb_PreKg, 12, 5));
            }
            else
            {
               A5989Lb_PreKg = localUtil.ctond( httpContext.cgiGet( edtLb_PreKg_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5989Lb_PreKg", GXutil.ltrimstr( A5989Lb_PreKg, 12, 5));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecPre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECPRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FecPre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6192Lb_FecPre = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A6192Lb_FecPre", localUtil.format(A6192Lb_FecPre, "99/99/99"));
            }
            else
            {
               A6192Lb_FecPre = localUtil.ctod( httpContext.cgiGet( edtLb_FecPre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6192Lb_FecPre", localUtil.format(A6192Lb_FecPre, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecEnt1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECENT1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FecEnt1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6460Lb_FecEnt1 = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A6460Lb_FecEnt1", localUtil.format(A6460Lb_FecEnt1, "99/99/99"));
            }
            else
            {
               A6460Lb_FecEnt1 = localUtil.ctod( httpContext.cgiGet( edtLb_FecEnt1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6460Lb_FecEnt1", localUtil.format(A6460Lb_FecEnt1, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecNoa1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECNOA1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FecNoa1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6461Lb_FecNoa1 = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A6461Lb_FecNoa1", localUtil.format(A6461Lb_FecNoa1, "99/99/99"));
            }
            else
            {
               A6461Lb_FecNoa1 = localUtil.ctod( httpContext.cgiGet( edtLb_FecNoa1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6461Lb_FecNoa1", localUtil.format(A6461Lb_FecNoa1, "99/99/99"));
            }
            A6631Lb_ProvDef = httpContext.cgiGet( edtLb_ProvDef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6631Lb_ProvDef", A6631Lb_ProvDef);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NumAux_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NumAux_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NUMAUX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_NumAux_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7395Lb_NumAux = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7395Lb_NumAux", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7395Lb_NumAux), 2, 0));
            }
            else
            {
               A7395Lb_NumAux = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_NumAux_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7395Lb_NumAux", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7395Lb_NumAux), 2, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_CosteC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_CosteC_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_COSTEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_CosteC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1127Lb_CosteC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1127Lb_CosteC", GXutil.ltrimstr( A1127Lb_CosteC, 11, 5));
            }
            else
            {
               A1127Lb_CosteC = localUtil.ctond( httpContext.cgiGet( edtLb_CosteC_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1127Lb_CosteC", GXutil.ltrimstr( A1127Lb_CosteC, 11, 5));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_hhent1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "LB_HHENT1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_hhent1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A10081Lb_hhent1", localUtil.ttoc( A10081Lb_hhent1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10081Lb_hhent1 = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_hhent1_Internalname))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10081Lb_hhent1", localUtil.ttoc( A10081Lb_hhent1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_hhnoa1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "LB_HHNOA1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_hhnoa1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A10082Lb_hhnoa1", localUtil.ttoc( A10082Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10082Lb_hhnoa1 = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_hhnoa1_Internalname))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10082Lb_hhnoa1", localUtil.ttoc( A10082Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_PreMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_PreMt_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_PREMT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_PreMt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10083Lb_PreMt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A10083Lb_PreMt", GXutil.ltrimstr( A10083Lb_PreMt, 12, 5));
            }
            else
            {
               A10083Lb_PreMt = localUtil.ctond( httpContext.cgiGet( edtLb_PreMt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10083Lb_PreMt", GXutil.ltrimstr( A10083Lb_PreMt, 12, 5));
            }
            A10822Lb_ObsCR = httpContext.cgiGet( edtLb_ObsCR_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10822Lb_ObsCR", A10822Lb_ObsCR);
            A12731Lb_ObsFac = httpContext.cgiGet( edtLb_ObsFac_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12731Lb_ObsFac", A12731Lb_ObsFac);
            AV38Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TENS003");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("gestionlaboratorio\\tens003:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
               A5555Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
               httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
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
                  sMode819 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode819 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound819 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_QS0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "LB_NUMERO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_numero_Internalname ;
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
                        e11QS2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12QS2 ();
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
         e12QS2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllQS819( ) ;
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
         disableAttributesQS819( ) ;
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

   public void confirm_QS0( )
   {
      beforeValidateQS819( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsQS819( ) ;
         }
         else
         {
            checkExtendedTableQS819( ) ;
            closeExtendedTableCursorsQS819( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaptionQS0( )
   {
   }

   public void e11QS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tens003_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tens003_impl.this.AV32EmprCod = GXv_char2[0] ;
      tens003_impl.this.AV11EmprNom = GXv_char3[0] ;
      tens003_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV35WWPContext = GXv_SdtWWPContext5[0] ;
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
   }

   public void e12QS2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
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

   public void zmQS819( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5567Lb_FechaEn = T00QS3_A5567Lb_FechaEn[0] ;
            Z5568Lb_HoraEn = T00QS3_A5568Lb_HoraEn[0] ;
            Z5563Lb_FechaR = T00QS3_A5563Lb_FechaR[0] ;
            Z5564Lb_HoraR = T00QS3_A5564Lb_HoraR[0] ;
            Z5565Lb_CosteE = T00QS3_A5565Lb_CosteE[0] ;
            Z5566Lb_Estado = T00QS3_A5566Lb_Estado[0] ;
            Z5718Lb_numop = T00QS3_A5718Lb_numop[0] ;
            Z5989Lb_PreKg = T00QS3_A5989Lb_PreKg[0] ;
            Z6192Lb_FecPre = T00QS3_A6192Lb_FecPre[0] ;
            Z6460Lb_FecEnt1 = T00QS3_A6460Lb_FecEnt1[0] ;
            Z6461Lb_FecNoa1 = T00QS3_A6461Lb_FecNoa1[0] ;
            Z6631Lb_ProvDef = T00QS3_A6631Lb_ProvDef[0] ;
            Z7395Lb_NumAux = T00QS3_A7395Lb_NumAux[0] ;
            Z1127Lb_CosteC = T00QS3_A1127Lb_CosteC[0] ;
            Z10081Lb_hhent1 = T00QS3_A10081Lb_hhent1[0] ;
            Z10082Lb_hhnoa1 = T00QS3_A10082Lb_hhnoa1[0] ;
            Z10083Lb_PreMt = T00QS3_A10083Lb_PreMt[0] ;
            Z10822Lb_ObsCR = T00QS3_A10822Lb_ObsCR[0] ;
            Z12731Lb_ObsFac = T00QS3_A12731Lb_ObsFac[0] ;
         }
         else
         {
            Z5567Lb_FechaEn = A5567Lb_FechaEn ;
            Z5568Lb_HoraEn = A5568Lb_HoraEn ;
            Z5563Lb_FechaR = A5563Lb_FechaR ;
            Z5564Lb_HoraR = A5564Lb_HoraR ;
            Z5565Lb_CosteE = A5565Lb_CosteE ;
            Z5566Lb_Estado = A5566Lb_Estado ;
            Z5718Lb_numop = A5718Lb_numop ;
            Z5989Lb_PreKg = A5989Lb_PreKg ;
            Z6192Lb_FecPre = A6192Lb_FecPre ;
            Z6460Lb_FecEnt1 = A6460Lb_FecEnt1 ;
            Z6461Lb_FecNoa1 = A6461Lb_FecNoa1 ;
            Z6631Lb_ProvDef = A6631Lb_ProvDef ;
            Z7395Lb_NumAux = A7395Lb_NumAux ;
            Z1127Lb_CosteC = A1127Lb_CosteC ;
            Z10081Lb_hhent1 = A10081Lb_hhent1 ;
            Z10082Lb_hhnoa1 = A10082Lb_hhnoa1 ;
            Z10083Lb_PreMt = A10083Lb_PreMt ;
            Z10822Lb_ObsCR = A10822Lb_ObsCR ;
            Z12731Lb_ObsFac = A12731Lb_ObsFac ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z5555Lb_opcion = A5555Lb_opcion ;
         Z5567Lb_FechaEn = A5567Lb_FechaEn ;
         Z5568Lb_HoraEn = A5568Lb_HoraEn ;
         Z5563Lb_FechaR = A5563Lb_FechaR ;
         Z5564Lb_HoraR = A5564Lb_HoraR ;
         Z5565Lb_CosteE = A5565Lb_CosteE ;
         Z5566Lb_Estado = A5566Lb_Estado ;
         Z5718Lb_numop = A5718Lb_numop ;
         Z5989Lb_PreKg = A5989Lb_PreKg ;
         Z6192Lb_FecPre = A6192Lb_FecPre ;
         Z6460Lb_FecEnt1 = A6460Lb_FecEnt1 ;
         Z6461Lb_FecNoa1 = A6461Lb_FecNoa1 ;
         Z6631Lb_ProvDef = A6631Lb_ProvDef ;
         Z7395Lb_NumAux = A7395Lb_NumAux ;
         Z1127Lb_CosteC = A1127Lb_CosteC ;
         Z10081Lb_hhent1 = A10081Lb_hhent1 ;
         Z10082Lb_hhnoa1 = A10082Lb_hhnoa1 ;
         Z10083Lb_PreMt = A10083Lb_PreMt ;
         Z10822Lb_ObsCR = A10822Lb_ObsCR ;
         Z12731Lb_ObsFac = A12731Lb_ObsFac ;
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV38Pgmname = "GestionLaboratorio.TENS003" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00QS4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00QS4_A407EmprNom[0] ;
      n407EmprNom = T00QS4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV33Lb_numero) )
      {
         A5532Lb_numero = AV33Lb_numero ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      }
      if ( ! (0==AV33Lb_numero) )
      {
         edtLb_numero_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      }
      else
      {
         edtLb_numero_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      }
      if ( ! (0==AV33Lb_numero) )
      {
         edtLb_numero_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV34Lb_opcion)==0) )
      {
         A5555Lb_opcion = AV34Lb_opcion ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      }
      if ( ! (GXutil.strcmp("", AV34Lb_opcion)==0) )
      {
         edtLb_opcion_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      }
      else
      {
         edtLb_opcion_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV34Lb_opcion)==0) )
      {
         edtLb_opcion_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
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

   public void loadQS819( )
   {
      /* Using cursor T00QS6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound819 = (short)(1) ;
         A407EmprNom = T00QS6_A407EmprNom[0] ;
         n407EmprNom = T00QS6_n407EmprNom[0] ;
         A5567Lb_FechaEn = T00QS6_A5567Lb_FechaEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5567Lb_FechaEn", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
         A5568Lb_HoraEn = T00QS6_A5568Lb_HoraEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5568Lb_HoraEn", localUtil.ttoc( A5568Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5563Lb_FechaR = T00QS6_A5563Lb_FechaR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5563Lb_FechaR", localUtil.format(A5563Lb_FechaR, "99/99/99"));
         A5564Lb_HoraR = T00QS6_A5564Lb_HoraR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5564Lb_HoraR", localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5565Lb_CosteE = T00QS6_A5565Lb_CosteE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5565Lb_CosteE", GXutil.ltrimstr( A5565Lb_CosteE, 11, 5));
         A5566Lb_Estado = T00QS6_A5566Lb_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5566Lb_Estado", GXutil.str( A5566Lb_Estado, 1, 0));
         A5718Lb_numop = T00QS6_A5718Lb_numop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5718Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5718Lb_numop), 2, 0));
         A5989Lb_PreKg = T00QS6_A5989Lb_PreKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5989Lb_PreKg", GXutil.ltrimstr( A5989Lb_PreKg, 12, 5));
         A6192Lb_FecPre = T00QS6_A6192Lb_FecPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6192Lb_FecPre", localUtil.format(A6192Lb_FecPre, "99/99/99"));
         A6460Lb_FecEnt1 = T00QS6_A6460Lb_FecEnt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6460Lb_FecEnt1", localUtil.format(A6460Lb_FecEnt1, "99/99/99"));
         A6461Lb_FecNoa1 = T00QS6_A6461Lb_FecNoa1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6461Lb_FecNoa1", localUtil.format(A6461Lb_FecNoa1, "99/99/99"));
         A6631Lb_ProvDef = T00QS6_A6631Lb_ProvDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6631Lb_ProvDef", A6631Lb_ProvDef);
         A7395Lb_NumAux = T00QS6_A7395Lb_NumAux[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7395Lb_NumAux", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7395Lb_NumAux), 2, 0));
         A1127Lb_CosteC = T00QS6_A1127Lb_CosteC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1127Lb_CosteC", GXutil.ltrimstr( A1127Lb_CosteC, 11, 5));
         A10081Lb_hhent1 = T00QS6_A10081Lb_hhent1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10081Lb_hhent1", localUtil.ttoc( A10081Lb_hhent1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10082Lb_hhnoa1 = T00QS6_A10082Lb_hhnoa1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10082Lb_hhnoa1", localUtil.ttoc( A10082Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10083Lb_PreMt = T00QS6_A10083Lb_PreMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10083Lb_PreMt", GXutil.ltrimstr( A10083Lb_PreMt, 12, 5));
         A10822Lb_ObsCR = T00QS6_A10822Lb_ObsCR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10822Lb_ObsCR", A10822Lb_ObsCR);
         A12731Lb_ObsFac = T00QS6_A12731Lb_ObsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12731Lb_ObsFac", A12731Lb_ObsFac);
         zmQS819( -9) ;
      }
      pr_default.close(4);
      onLoadActionsQS819( ) ;
   }

   public void onLoadActionsQS819( )
   {
   }

   public void checkExtendedTableQS819( )
   {
      nIsDirty_819 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00QS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursorsQS819( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          int A5532Lb_numero )
   {
      /* Using cursor T00QS7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKeyQS819( )
   {
      /* Using cursor T00QS8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound819 = (short)(1) ;
      }
      else
      {
         RcdFound819 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00QS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmQS819( 9) ;
         RcdFound819 = (short)(1) ;
         A5555Lb_opcion = T00QS3_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         A5567Lb_FechaEn = T00QS3_A5567Lb_FechaEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5567Lb_FechaEn", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
         A5568Lb_HoraEn = T00QS3_A5568Lb_HoraEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5568Lb_HoraEn", localUtil.ttoc( A5568Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5563Lb_FechaR = T00QS3_A5563Lb_FechaR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5563Lb_FechaR", localUtil.format(A5563Lb_FechaR, "99/99/99"));
         A5564Lb_HoraR = T00QS3_A5564Lb_HoraR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5564Lb_HoraR", localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5565Lb_CosteE = T00QS3_A5565Lb_CosteE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5565Lb_CosteE", GXutil.ltrimstr( A5565Lb_CosteE, 11, 5));
         A5566Lb_Estado = T00QS3_A5566Lb_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5566Lb_Estado", GXutil.str( A5566Lb_Estado, 1, 0));
         A5718Lb_numop = T00QS3_A5718Lb_numop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5718Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5718Lb_numop), 2, 0));
         A5989Lb_PreKg = T00QS3_A5989Lb_PreKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5989Lb_PreKg", GXutil.ltrimstr( A5989Lb_PreKg, 12, 5));
         A6192Lb_FecPre = T00QS3_A6192Lb_FecPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6192Lb_FecPre", localUtil.format(A6192Lb_FecPre, "99/99/99"));
         A6460Lb_FecEnt1 = T00QS3_A6460Lb_FecEnt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6460Lb_FecEnt1", localUtil.format(A6460Lb_FecEnt1, "99/99/99"));
         A6461Lb_FecNoa1 = T00QS3_A6461Lb_FecNoa1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6461Lb_FecNoa1", localUtil.format(A6461Lb_FecNoa1, "99/99/99"));
         A6631Lb_ProvDef = T00QS3_A6631Lb_ProvDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6631Lb_ProvDef", A6631Lb_ProvDef);
         A7395Lb_NumAux = T00QS3_A7395Lb_NumAux[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7395Lb_NumAux", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7395Lb_NumAux), 2, 0));
         A1127Lb_CosteC = T00QS3_A1127Lb_CosteC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1127Lb_CosteC", GXutil.ltrimstr( A1127Lb_CosteC, 11, 5));
         A10081Lb_hhent1 = T00QS3_A10081Lb_hhent1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10081Lb_hhent1", localUtil.ttoc( A10081Lb_hhent1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10082Lb_hhnoa1 = T00QS3_A10082Lb_hhnoa1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10082Lb_hhnoa1", localUtil.ttoc( A10082Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10083Lb_PreMt = T00QS3_A10083Lb_PreMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10083Lb_PreMt", GXutil.ltrimstr( A10083Lb_PreMt, 12, 5));
         A10822Lb_ObsCR = T00QS3_A10822Lb_ObsCR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10822Lb_ObsCR", A10822Lb_ObsCR);
         A12731Lb_ObsFac = T00QS3_A12731Lb_ObsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12731Lb_ObsFac", A12731Lb_ObsFac);
         A396EmprCod = T00QS3_A396EmprCod[0] ;
         A5532Lb_numero = T00QS3_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z5555Lb_opcion = A5555Lb_opcion ;
         sMode819 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadQS819( ) ;
         if ( AnyError == 1 )
         {
            RcdFound819 = (short)(0) ;
            initializeNonKeyQS819( ) ;
         }
         Gx_mode = sMode819 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound819 = (short)(0) ;
         initializeNonKeyQS819( ) ;
         sMode819 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode819 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyQS819( ) ;
      if ( RcdFound819 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound819 = (short)(0) ;
      /* Using cursor T00QS9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A5532Lb_numero), Integer.valueOf(A5532Lb_numero), A396EmprCod, A5555Lb_opcion});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00QS9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00QS9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00QS9_A5532Lb_numero[0] < A5532Lb_numero ) || ( T00QS9_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T00QS9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00QS9_A5555Lb_opcion[0], A5555Lb_opcion) < 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00QS9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00QS9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00QS9_A5532Lb_numero[0] > A5532Lb_numero ) || ( T00QS9_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T00QS9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00QS9_A5555Lb_opcion[0], A5555Lb_opcion) > 0 ) ) )
         {
            A396EmprCod = T00QS9_A396EmprCod[0] ;
            A5532Lb_numero = T00QS9_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5555Lb_opcion = T00QS9_A5555Lb_opcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            RcdFound819 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound819 = (short)(0) ;
      /* Using cursor T00QS10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A5532Lb_numero), Integer.valueOf(A5532Lb_numero), A396EmprCod, A5555Lb_opcion});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00QS10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00QS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00QS10_A5532Lb_numero[0] > A5532Lb_numero ) || ( T00QS10_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T00QS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00QS10_A5555Lb_opcion[0], A5555Lb_opcion) > 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00QS10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00QS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00QS10_A5532Lb_numero[0] < A5532Lb_numero ) || ( T00QS10_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T00QS10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00QS10_A5555Lb_opcion[0], A5555Lb_opcion) < 0 ) ) )
         {
            A396EmprCod = T00QS10_A396EmprCod[0] ;
            A5532Lb_numero = T00QS10_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5555Lb_opcion = T00QS10_A5555Lb_opcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            RcdFound819 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyQS819( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertQS819( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound819 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A5532Lb_numero = Z5532Lb_numero ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
               A5555Lb_opcion = Z5555Lb_opcion ;
               httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LB_NUMERO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateQS819( ) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertQS819( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LB_NUMERO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_numero_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtLb_numero_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertQS819( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = Z5532Lb_numero ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = Z5555Lb_opcion ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyQS819( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00QS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS002"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z5567Lb_FechaEn), GXutil.resetTime(T00QS2_A5567Lb_FechaEn[0])) ) || !( GXutil.dateCompare(Z5568Lb_HoraEn, T00QS2_A5568Lb_HoraEn[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5563Lb_FechaR), GXutil.resetTime(T00QS2_A5563Lb_FechaR[0])) ) || !( GXutil.dateCompare(Z5564Lb_HoraR, T00QS2_A5564Lb_HoraR[0]) ) || ( DecimalUtil.compareTo(Z5565Lb_CosteE, T00QS2_A5565Lb_CosteE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5566Lb_Estado != T00QS2_A5566Lb_Estado[0] ) || ( Z5718Lb_numop != T00QS2_A5718Lb_numop[0] ) || ( DecimalUtil.compareTo(Z5989Lb_PreKg, T00QS2_A5989Lb_PreKg[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z6192Lb_FecPre), GXutil.resetTime(T00QS2_A6192Lb_FecPre[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z6460Lb_FecEnt1), GXutil.resetTime(T00QS2_A6460Lb_FecEnt1[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z6461Lb_FecNoa1), GXutil.resetTime(T00QS2_A6461Lb_FecNoa1[0])) ) || ( GXutil.strcmp(Z6631Lb_ProvDef, T00QS2_A6631Lb_ProvDef[0]) != 0 ) || ( Z7395Lb_NumAux != T00QS2_A7395Lb_NumAux[0] ) || ( DecimalUtil.compareTo(Z1127Lb_CosteC, T00QS2_A1127Lb_CosteC[0]) != 0 ) || !( GXutil.dateCompare(Z10081Lb_hhent1, T00QS2_A10081Lb_hhent1[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10082Lb_hhnoa1, T00QS2_A10082Lb_hhnoa1[0]) ) || ( DecimalUtil.compareTo(Z10083Lb_PreMt, T00QS2_A10083Lb_PreMt[0]) != 0 ) || ( GXutil.strcmp(Z10822Lb_ObsCR, T00QS2_A10822Lb_ObsCR[0]) != 0 ) || ( GXutil.strcmp(Z12731Lb_ObsFac, T00QS2_A12731Lb_ObsFac[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5567Lb_FechaEn), GXutil.resetTime(T00QS2_A5567Lb_FechaEn[0])) ) )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_FechaEn");
               GXutil.writeLogRaw("Old: ",Z5567Lb_FechaEn);
               GXutil.writeLogRaw("Current: ",T00QS2_A5567Lb_FechaEn[0]);
            }
            if ( !( GXutil.dateCompare(Z5568Lb_HoraEn, T00QS2_A5568Lb_HoraEn[0]) ) )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_HoraEn");
               GXutil.writeLogRaw("Old: ",Z5568Lb_HoraEn);
               GXutil.writeLogRaw("Current: ",T00QS2_A5568Lb_HoraEn[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5563Lb_FechaR), GXutil.resetTime(T00QS2_A5563Lb_FechaR[0])) ) )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_FechaR");
               GXutil.writeLogRaw("Old: ",Z5563Lb_FechaR);
               GXutil.writeLogRaw("Current: ",T00QS2_A5563Lb_FechaR[0]);
            }
            if ( !( GXutil.dateCompare(Z5564Lb_HoraR, T00QS2_A5564Lb_HoraR[0]) ) )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_HoraR");
               GXutil.writeLogRaw("Old: ",Z5564Lb_HoraR);
               GXutil.writeLogRaw("Current: ",T00QS2_A5564Lb_HoraR[0]);
            }
            if ( DecimalUtil.compareTo(Z5565Lb_CosteE, T00QS2_A5565Lb_CosteE[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_CosteE");
               GXutil.writeLogRaw("Old: ",Z5565Lb_CosteE);
               GXutil.writeLogRaw("Current: ",T00QS2_A5565Lb_CosteE[0]);
            }
            if ( Z5566Lb_Estado != T00QS2_A5566Lb_Estado[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_Estado");
               GXutil.writeLogRaw("Old: ",Z5566Lb_Estado);
               GXutil.writeLogRaw("Current: ",T00QS2_A5566Lb_Estado[0]);
            }
            if ( Z5718Lb_numop != T00QS2_A5718Lb_numop[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_numop");
               GXutil.writeLogRaw("Old: ",Z5718Lb_numop);
               GXutil.writeLogRaw("Current: ",T00QS2_A5718Lb_numop[0]);
            }
            if ( DecimalUtil.compareTo(Z5989Lb_PreKg, T00QS2_A5989Lb_PreKg[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_PreKg");
               GXutil.writeLogRaw("Old: ",Z5989Lb_PreKg);
               GXutil.writeLogRaw("Current: ",T00QS2_A5989Lb_PreKg[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6192Lb_FecPre), GXutil.resetTime(T00QS2_A6192Lb_FecPre[0])) ) )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_FecPre");
               GXutil.writeLogRaw("Old: ",Z6192Lb_FecPre);
               GXutil.writeLogRaw("Current: ",T00QS2_A6192Lb_FecPre[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6460Lb_FecEnt1), GXutil.resetTime(T00QS2_A6460Lb_FecEnt1[0])) ) )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_FecEnt1");
               GXutil.writeLogRaw("Old: ",Z6460Lb_FecEnt1);
               GXutil.writeLogRaw("Current: ",T00QS2_A6460Lb_FecEnt1[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6461Lb_FecNoa1), GXutil.resetTime(T00QS2_A6461Lb_FecNoa1[0])) ) )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_FecNoa1");
               GXutil.writeLogRaw("Old: ",Z6461Lb_FecNoa1);
               GXutil.writeLogRaw("Current: ",T00QS2_A6461Lb_FecNoa1[0]);
            }
            if ( GXutil.strcmp(Z6631Lb_ProvDef, T00QS2_A6631Lb_ProvDef[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_ProvDef");
               GXutil.writeLogRaw("Old: ",Z6631Lb_ProvDef);
               GXutil.writeLogRaw("Current: ",T00QS2_A6631Lb_ProvDef[0]);
            }
            if ( Z7395Lb_NumAux != T00QS2_A7395Lb_NumAux[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_NumAux");
               GXutil.writeLogRaw("Old: ",Z7395Lb_NumAux);
               GXutil.writeLogRaw("Current: ",T00QS2_A7395Lb_NumAux[0]);
            }
            if ( DecimalUtil.compareTo(Z1127Lb_CosteC, T00QS2_A1127Lb_CosteC[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_CosteC");
               GXutil.writeLogRaw("Old: ",Z1127Lb_CosteC);
               GXutil.writeLogRaw("Current: ",T00QS2_A1127Lb_CosteC[0]);
            }
            if ( !( GXutil.dateCompare(Z10081Lb_hhent1, T00QS2_A10081Lb_hhent1[0]) ) )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_hhent1");
               GXutil.writeLogRaw("Old: ",Z10081Lb_hhent1);
               GXutil.writeLogRaw("Current: ",T00QS2_A10081Lb_hhent1[0]);
            }
            if ( !( GXutil.dateCompare(Z10082Lb_hhnoa1, T00QS2_A10082Lb_hhnoa1[0]) ) )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_hhnoa1");
               GXutil.writeLogRaw("Old: ",Z10082Lb_hhnoa1);
               GXutil.writeLogRaw("Current: ",T00QS2_A10082Lb_hhnoa1[0]);
            }
            if ( DecimalUtil.compareTo(Z10083Lb_PreMt, T00QS2_A10083Lb_PreMt[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_PreMt");
               GXutil.writeLogRaw("Old: ",Z10083Lb_PreMt);
               GXutil.writeLogRaw("Current: ",T00QS2_A10083Lb_PreMt[0]);
            }
            if ( GXutil.strcmp(Z10822Lb_ObsCR, T00QS2_A10822Lb_ObsCR[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_ObsCR");
               GXutil.writeLogRaw("Old: ",Z10822Lb_ObsCR);
               GXutil.writeLogRaw("Current: ",T00QS2_A10822Lb_ObsCR[0]);
            }
            if ( GXutil.strcmp(Z12731Lb_ObsFac, T00QS2_A12731Lb_ObsFac[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tens003:[seudo value changed for attri]"+"Lb_ObsFac");
               GXutil.writeLogRaw("Old: ",Z12731Lb_ObsFac);
               GXutil.writeLogRaw("Current: ",T00QS2_A12731Lb_ObsFac[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS002"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertQS819( )
   {
      beforeValidateQS819( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQS819( ) ;
      }
      if ( AnyError == 0 )
      {
         zmQS819( 0) ;
         checkOptimisticConcurrencyQS819( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmQS819( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertQS819( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00QS11 */
                  pr_default.execute(9, new Object[] {A5555Lb_opcion, A5567Lb_FechaEn, A5568Lb_HoraEn, A5563Lb_FechaR, A5564Lb_HoraR, A5565Lb_CosteE, Byte.valueOf(A5566Lb_Estado), Byte.valueOf(A5718Lb_numop), A5989Lb_PreKg, A6192Lb_FecPre, A6460Lb_FecEnt1, A6461Lb_FecNoa1, A6631Lb_ProvDef, Byte.valueOf(A7395Lb_NumAux), A1127Lb_CosteC, A10081Lb_hhent1, A10082Lb_hhnoa1, A10083Lb_PreMt, A10822Lb_ObsCR, A12731Lb_ObsFac, A396EmprCod, Integer.valueOf(A5532Lb_numero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
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
                        resetCaptionQS0( ) ;
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
            loadQS819( ) ;
         }
         endLevelQS819( ) ;
      }
      closeExtendedTableCursorsQS819( ) ;
   }

   public void updateQS819( )
   {
      beforeValidateQS819( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQS819( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyQS819( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmQS819( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateQS819( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00QS12 */
                  pr_default.execute(10, new Object[] {A5567Lb_FechaEn, A5568Lb_HoraEn, A5563Lb_FechaR, A5564Lb_HoraR, A5565Lb_CosteE, Byte.valueOf(A5566Lb_Estado), Byte.valueOf(A5718Lb_numop), A5989Lb_PreKg, A6192Lb_FecPre, A6460Lb_FecEnt1, A6461Lb_FecNoa1, A6631Lb_ProvDef, Byte.valueOf(A7395Lb_NumAux), A1127Lb_CosteC, A10081Lb_hhent1, A10082Lb_hhnoa1, A10083Lb_PreMt, A10822Lb_ObsCR, A12731Lb_ObsFac, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS002"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateQS819( ) ;
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
         endLevelQS819( ) ;
      }
      closeExtendedTableCursorsQS819( ) ;
   }

   public void deferredUpdateQS819( )
   {
   }

   public void delete( )
   {
      beforeValidateQS819( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyQS819( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsQS819( ) ;
         afterConfirmQS819( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteQS819( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00QS13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
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
      sMode819 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelQS819( ) ;
      Gx_mode = sMode819 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsQS819( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00QS14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00QS15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T00QS16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevelQS819( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteQS819( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tens003");
         if ( AnyError == 0 )
         {
            confirmValuesQS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tens003");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartQS819( )
   {
      /* Scan By routine */
      /* Using cursor T00QS17 */
      pr_default.execute(15);
      RcdFound819 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound819 = (short)(1) ;
         A396EmprCod = T00QS17_A396EmprCod[0] ;
         A5532Lb_numero = T00QS17_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = T00QS17_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextQS819( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound819 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound819 = (short)(1) ;
         A396EmprCod = T00QS17_A396EmprCod[0] ;
         A5532Lb_numero = T00QS17_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = T00QS17_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      }
   }

   public void scanEndQS819( )
   {
      pr_default.close(15);
   }

   public void afterConfirmQS819( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertQS819( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateQS819( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteQS819( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteQS819( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateQS819( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesQS819( )
   {
      edtLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      edtLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      edtLb_FechaEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FechaEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaEn_Enabled), 5, 0), true);
      edtLb_HoraEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_HoraEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_HoraEn_Enabled), 5, 0), true);
      edtLb_FechaR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FechaR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaR_Enabled), 5, 0), true);
      edtLb_HoraR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_HoraR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_HoraR_Enabled), 5, 0), true);
      edtLb_CosteE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_CosteE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_CosteE_Enabled), 5, 0), true);
      edtLb_Estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Estado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Estado_Enabled), 5, 0), true);
      edtLb_numop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numop_Enabled), 5, 0), true);
      edtLb_PreKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_PreKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PreKg_Enabled), 5, 0), true);
      edtLb_FecPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecPre_Enabled), 5, 0), true);
      edtLb_FecEnt1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecEnt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecEnt1_Enabled), 5, 0), true);
      edtLb_FecNoa1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecNoa1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecNoa1_Enabled), 5, 0), true);
      edtLb_ProvDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ProvDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ProvDef_Enabled), 5, 0), true);
      edtLb_NumAux_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NumAux_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NumAux_Enabled), 5, 0), true);
      edtLb_CosteC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_CosteC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_CosteC_Enabled), 5, 0), true);
      edtLb_hhent1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_hhent1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_hhent1_Enabled), 5, 0), true);
      edtLb_hhnoa1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_hhnoa1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_hhnoa1_Enabled), 5, 0), true);
      edtLb_PreMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_PreMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PreMt_Enabled), 5, 0), true);
      edtLb_ObsCR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ObsCR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ObsCR_Enabled), 5, 0), true);
      edtLb_ObsFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ObsFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ObsFac_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesQS819( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesQS0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.tens003", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV34Lb_opcion))}, new String[] {"Gx_mode","EmprCod","Lb_numero","Lb_opcion"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TENS003");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\tens003:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5532Lb_numero", GXutil.ltrim( localUtil.ntoc( Z5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5555Lb_opcion", GXutil.rtrim( Z5555Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5567Lb_FechaEn", localUtil.dtoc( Z5567Lb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5568Lb_HoraEn", localUtil.ttoc( Z5568Lb_HoraEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5563Lb_FechaR", localUtil.dtoc( Z5563Lb_FechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5564Lb_HoraR", localUtil.ttoc( Z5564Lb_HoraR, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5565Lb_CosteE", GXutil.ltrim( localUtil.ntoc( Z5565Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5566Lb_Estado", GXutil.ltrim( localUtil.ntoc( Z5566Lb_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5718Lb_numop", GXutil.ltrim( localUtil.ntoc( Z5718Lb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5989Lb_PreKg", GXutil.ltrim( localUtil.ntoc( Z5989Lb_PreKg, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6192Lb_FecPre", localUtil.dtoc( Z6192Lb_FecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6460Lb_FecEnt1", localUtil.dtoc( Z6460Lb_FecEnt1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6461Lb_FecNoa1", localUtil.dtoc( Z6461Lb_FecNoa1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6631Lb_ProvDef", GXutil.rtrim( Z6631Lb_ProvDef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7395Lb_NumAux", GXutil.ltrim( localUtil.ntoc( Z7395Lb_NumAux, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1127Lb_CosteC", GXutil.ltrim( localUtil.ntoc( Z1127Lb_CosteC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10081Lb_hhent1", localUtil.ttoc( Z10081Lb_hhent1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10082Lb_hhnoa1", localUtil.ttoc( Z10082Lb_hhnoa1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10083Lb_PreMt", GXutil.ltrim( localUtil.ntoc( Z10083Lb_PreMt, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10822Lb_ObsCR", Z10822Lb_ObsCR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12731Lb_ObsFac", Z12731Lb_ObsFac);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV33Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_NUMERO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_OPCION", GXutil.rtrim( AV34Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_OPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
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
      return formatLink("app.gestionlaboratorio.tens003", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV34Lb_opcion))}, new String[] {"Gx_mode","EmprCod","Lb_numero","Lb_opcion"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.TENS003" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENSAYOS, ACEPTACION", "") ;
   }

   public void initializeNonKeyQS819( )
   {
      A5567Lb_FechaEn = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5567Lb_FechaEn", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A5568Lb_HoraEn", localUtil.ttoc( A5568Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5563Lb_FechaR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5563Lb_FechaR", localUtil.format(A5563Lb_FechaR, "99/99/99"));
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A5564Lb_HoraR", localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5565Lb_CosteE", GXutil.ltrimstr( A5565Lb_CosteE, 11, 5));
      A5566Lb_Estado = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5566Lb_Estado", GXutil.str( A5566Lb_Estado, 1, 0));
      A5718Lb_numop = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5718Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5718Lb_numop), 2, 0));
      A5989Lb_PreKg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5989Lb_PreKg", GXutil.ltrimstr( A5989Lb_PreKg, 12, 5));
      A6192Lb_FecPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A6192Lb_FecPre", localUtil.format(A6192Lb_FecPre, "99/99/99"));
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A6460Lb_FecEnt1", localUtil.format(A6460Lb_FecEnt1, "99/99/99"));
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A6461Lb_FecNoa1", localUtil.format(A6461Lb_FecNoa1, "99/99/99"));
      A6631Lb_ProvDef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6631Lb_ProvDef", A6631Lb_ProvDef);
      A7395Lb_NumAux = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7395Lb_NumAux", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7395Lb_NumAux), 2, 0));
      A1127Lb_CosteC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1127Lb_CosteC", GXutil.ltrimstr( A1127Lb_CosteC, 11, 5));
      A10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10081Lb_hhent1", localUtil.ttoc( A10081Lb_hhent1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10082Lb_hhnoa1", localUtil.ttoc( A10082Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10083Lb_PreMt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10083Lb_PreMt", GXutil.ltrimstr( A10083Lb_PreMt, 12, 5));
      A10822Lb_ObsCR = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10822Lb_ObsCR", A10822Lb_ObsCR);
      A12731Lb_ObsFac = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12731Lb_ObsFac", A12731Lb_ObsFac);
      Z5567Lb_FechaEn = GXutil.nullDate() ;
      Z5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      Z5563Lb_FechaR = GXutil.nullDate() ;
      Z5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      Z5565Lb_CosteE = DecimalUtil.ZERO ;
      Z5566Lb_Estado = (byte)(0) ;
      Z5718Lb_numop = (byte)(0) ;
      Z5989Lb_PreKg = DecimalUtil.ZERO ;
      Z6192Lb_FecPre = GXutil.nullDate() ;
      Z6460Lb_FecEnt1 = GXutil.nullDate() ;
      Z6461Lb_FecNoa1 = GXutil.nullDate() ;
      Z6631Lb_ProvDef = "" ;
      Z7395Lb_NumAux = (byte)(0) ;
      Z1127Lb_CosteC = DecimalUtil.ZERO ;
      Z10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      Z10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      Z10083Lb_PreMt = DecimalUtil.ZERO ;
      Z10822Lb_ObsCR = "" ;
      Z12731Lb_ObsFac = "" ;
   }

   public void initAllQS819( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5532Lb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      A5555Lb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      initializeNonKeyQS819( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655468", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/tens003.js", "?20268211655468", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtLb_numero_Internalname = "LB_NUMERO" ;
      edtLb_opcion_Internalname = "LB_OPCION" ;
      edtLb_FechaEn_Internalname = "LB_FECHAEN" ;
      edtLb_HoraEn_Internalname = "LB_HORAEN" ;
      edtLb_FechaR_Internalname = "LB_FECHAR" ;
      edtLb_HoraR_Internalname = "LB_HORAR" ;
      edtLb_CosteE_Internalname = "LB_COSTEE" ;
      edtLb_Estado_Internalname = "LB_ESTADO" ;
      edtLb_numop_Internalname = "LB_NUMOP" ;
      edtLb_PreKg_Internalname = "LB_PREKG" ;
      edtLb_FecPre_Internalname = "LB_FECPRE" ;
      edtLb_FecEnt1_Internalname = "LB_FECENT1" ;
      edtLb_FecNoa1_Internalname = "LB_FECNOA1" ;
      edtLb_ProvDef_Internalname = "LB_PROVDEF" ;
      edtLb_NumAux_Internalname = "LB_NUMAUX" ;
      edtLb_CosteC_Internalname = "LB_COSTEC" ;
      edtLb_hhent1_Internalname = "LB_HHENT1" ;
      edtLb_hhnoa1_Internalname = "LB_HHNOA1" ;
      edtLb_PreMt_Internalname = "LB_PREMT" ;
      edtLb_ObsCR_Internalname = "LB_OBSCR" ;
      edtLb_ObsFac_Internalname = "LB_OBSFAC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      Form.setCaption( httpContext.getMessage( "ENSAYOS, ACEPTACION", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtLb_ObsFac_Enabled = 1 ;
      edtLb_ObsCR_Enabled = 1 ;
      edtLb_PreMt_Jsonclick = "" ;
      edtLb_PreMt_Enabled = 1 ;
      edtLb_hhnoa1_Jsonclick = "" ;
      edtLb_hhnoa1_Enabled = 1 ;
      edtLb_hhent1_Jsonclick = "" ;
      edtLb_hhent1_Enabled = 1 ;
      edtLb_CosteC_Jsonclick = "" ;
      edtLb_CosteC_Enabled = 1 ;
      edtLb_NumAux_Jsonclick = "" ;
      edtLb_NumAux_Enabled = 1 ;
      edtLb_ProvDef_Jsonclick = "" ;
      edtLb_ProvDef_Enabled = 1 ;
      edtLb_FecNoa1_Jsonclick = "" ;
      edtLb_FecNoa1_Enabled = 1 ;
      edtLb_FecEnt1_Jsonclick = "" ;
      edtLb_FecEnt1_Enabled = 1 ;
      edtLb_FecPre_Jsonclick = "" ;
      edtLb_FecPre_Enabled = 1 ;
      edtLb_PreKg_Jsonclick = "" ;
      edtLb_PreKg_Enabled = 1 ;
      edtLb_numop_Jsonclick = "" ;
      edtLb_numop_Enabled = 1 ;
      edtLb_Estado_Jsonclick = "" ;
      edtLb_Estado_Enabled = 1 ;
      edtLb_CosteE_Jsonclick = "" ;
      edtLb_CosteE_Enabled = 1 ;
      edtLb_HoraR_Jsonclick = "" ;
      edtLb_HoraR_Enabled = 1 ;
      edtLb_FechaR_Jsonclick = "" ;
      edtLb_FechaR_Enabled = 1 ;
      edtLb_HoraEn_Jsonclick = "" ;
      edtLb_HoraEn_Enabled = 1 ;
      edtLb_FechaEn_Jsonclick = "" ;
      edtLb_FechaEn_Enabled = 1 ;
      edtLb_opcion_Jsonclick = "" ;
      edtLb_opcion_Enabled = 1 ;
      edtLb_numero_Jsonclick = "" ;
      edtLb_numero_Enabled = 1 ;
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

   public void valid_Lb_numero( )
   {
      /* Using cursor T00QS18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
      }
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV34Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV34Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12QS2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALID_LB_OPCION","{handler:'valid_Lb_opcion',iparms:[]");
      setEventMetadata("VALID_LB_OPCION",",oparms:[]}");
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
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV34Lb_opcion = "" ;
      Z396EmprCod = "" ;
      Z5555Lb_opcion = "" ;
      Z5567Lb_FechaEn = GXutil.nullDate() ;
      Z5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      Z5563Lb_FechaR = GXutil.nullDate() ;
      Z5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      Z5565Lb_CosteE = DecimalUtil.ZERO ;
      Z5989Lb_PreKg = DecimalUtil.ZERO ;
      Z6192Lb_FecPre = GXutil.nullDate() ;
      Z6460Lb_FecEnt1 = GXutil.nullDate() ;
      Z6461Lb_FecNoa1 = GXutil.nullDate() ;
      Z6631Lb_ProvDef = "" ;
      Z1127Lb_CosteC = DecimalUtil.ZERO ;
      Z10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      Z10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      Z10083Lb_PreMt = DecimalUtil.ZERO ;
      Z10822Lb_ObsCR = "" ;
      Z12731Lb_ObsFac = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV34Lb_opcion = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A5555Lb_opcion = "" ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      A5989Lb_PreKg = DecimalUtil.ZERO ;
      A6192Lb_FecPre = GXutil.nullDate() ;
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A6631Lb_ProvDef = "" ;
      A1127Lb_CosteC = DecimalUtil.ZERO ;
      A10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A10083Lb_PreMt = DecimalUtil.ZERO ;
      A10822Lb_ObsCR = "" ;
      A12731Lb_ObsFac = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV38Pgmname = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode819 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T00QS4_A407EmprNom = new String[] {""} ;
      T00QS4_n407EmprNom = new boolean[] {false} ;
      T00QS6_A5555Lb_opcion = new String[] {""} ;
      T00QS6_A407EmprNom = new String[] {""} ;
      T00QS6_n407EmprNom = new boolean[] {false} ;
      T00QS6_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS6_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS6_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS6_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS6_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS6_A5566Lb_Estado = new byte[1] ;
      T00QS6_A5718Lb_numop = new byte[1] ;
      T00QS6_A5989Lb_PreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS6_A6192Lb_FecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS6_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS6_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS6_A6631Lb_ProvDef = new String[] {""} ;
      T00QS6_A7395Lb_NumAux = new byte[1] ;
      T00QS6_A1127Lb_CosteC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS6_A10081Lb_hhent1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS6_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS6_A10083Lb_PreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS6_A10822Lb_ObsCR = new String[] {""} ;
      T00QS6_A12731Lb_ObsFac = new String[] {""} ;
      T00QS6_A396EmprCod = new String[] {""} ;
      T00QS6_A5532Lb_numero = new int[1] ;
      T00QS5_A396EmprCod = new String[] {""} ;
      T00QS7_A396EmprCod = new String[] {""} ;
      T00QS8_A396EmprCod = new String[] {""} ;
      T00QS8_A5532Lb_numero = new int[1] ;
      T00QS8_A5555Lb_opcion = new String[] {""} ;
      T00QS3_A5555Lb_opcion = new String[] {""} ;
      T00QS3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS3_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS3_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS3_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS3_A5566Lb_Estado = new byte[1] ;
      T00QS3_A5718Lb_numop = new byte[1] ;
      T00QS3_A5989Lb_PreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS3_A6192Lb_FecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS3_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS3_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS3_A6631Lb_ProvDef = new String[] {""} ;
      T00QS3_A7395Lb_NumAux = new byte[1] ;
      T00QS3_A1127Lb_CosteC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS3_A10081Lb_hhent1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS3_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS3_A10083Lb_PreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS3_A10822Lb_ObsCR = new String[] {""} ;
      T00QS3_A12731Lb_ObsFac = new String[] {""} ;
      T00QS3_A396EmprCod = new String[] {""} ;
      T00QS3_A5532Lb_numero = new int[1] ;
      T00QS9_A396EmprCod = new String[] {""} ;
      T00QS9_A5532Lb_numero = new int[1] ;
      T00QS9_A5555Lb_opcion = new String[] {""} ;
      T00QS10_A396EmprCod = new String[] {""} ;
      T00QS10_A5532Lb_numero = new int[1] ;
      T00QS10_A5555Lb_opcion = new String[] {""} ;
      T00QS2_A5555Lb_opcion = new String[] {""} ;
      T00QS2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS2_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS2_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS2_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS2_A5566Lb_Estado = new byte[1] ;
      T00QS2_A5718Lb_numop = new byte[1] ;
      T00QS2_A5989Lb_PreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS2_A6192Lb_FecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS2_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS2_A6631Lb_ProvDef = new String[] {""} ;
      T00QS2_A7395Lb_NumAux = new byte[1] ;
      T00QS2_A1127Lb_CosteC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS2_A10081Lb_hhent1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS2_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00QS2_A10083Lb_PreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QS2_A10822Lb_ObsCR = new String[] {""} ;
      T00QS2_A12731Lb_ObsFac = new String[] {""} ;
      T00QS2_A396EmprCod = new String[] {""} ;
      T00QS2_A5532Lb_numero = new int[1] ;
      T00QS14_A396EmprCod = new String[] {""} ;
      T00QS14_A5532Lb_numero = new int[1] ;
      T00QS14_A5555Lb_opcion = new String[] {""} ;
      T00QS14_A13460Lb_linCP = new short[1] ;
      T00QS14_A13458Lb_TipCP = new String[] {""} ;
      T00QS15_A396EmprCod = new String[] {""} ;
      T00QS15_A5532Lb_numero = new int[1] ;
      T00QS15_A5555Lb_opcion = new String[] {""} ;
      T00QS15_A5560Lb_LineaPr = new short[1] ;
      T00QS16_A396EmprCod = new String[] {""} ;
      T00QS16_A5532Lb_numero = new int[1] ;
      T00QS16_A5555Lb_opcion = new String[] {""} ;
      T00QS16_A5557Lb_LineaC = new short[1] ;
      T00QS17_A396EmprCod = new String[] {""} ;
      T00QS17_A5532Lb_numero = new int[1] ;
      T00QS17_A5555Lb_opcion = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T00QS18_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tens003__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tens003__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tens003__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tens003__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tens003__default(),
         new Object[] {
             new Object[] {
            T00QS2_A5555Lb_opcion, T00QS2_A5567Lb_FechaEn, T00QS2_A5568Lb_HoraEn, T00QS2_A5563Lb_FechaR, T00QS2_A5564Lb_HoraR, T00QS2_A5565Lb_CosteE, T00QS2_A5566Lb_Estado, T00QS2_A5718Lb_numop, T00QS2_A5989Lb_PreKg, T00QS2_A6192Lb_FecPre,
            T00QS2_A6460Lb_FecEnt1, T00QS2_A6461Lb_FecNoa1, T00QS2_A6631Lb_ProvDef, T00QS2_A7395Lb_NumAux, T00QS2_A1127Lb_CosteC, T00QS2_A10081Lb_hhent1, T00QS2_A10082Lb_hhnoa1, T00QS2_A10083Lb_PreMt, T00QS2_A10822Lb_ObsCR, T00QS2_A12731Lb_ObsFac,
            T00QS2_A396EmprCod, T00QS2_A5532Lb_numero
            }
            , new Object[] {
            T00QS3_A5555Lb_opcion, T00QS3_A5567Lb_FechaEn, T00QS3_A5568Lb_HoraEn, T00QS3_A5563Lb_FechaR, T00QS3_A5564Lb_HoraR, T00QS3_A5565Lb_CosteE, T00QS3_A5566Lb_Estado, T00QS3_A5718Lb_numop, T00QS3_A5989Lb_PreKg, T00QS3_A6192Lb_FecPre,
            T00QS3_A6460Lb_FecEnt1, T00QS3_A6461Lb_FecNoa1, T00QS3_A6631Lb_ProvDef, T00QS3_A7395Lb_NumAux, T00QS3_A1127Lb_CosteC, T00QS3_A10081Lb_hhent1, T00QS3_A10082Lb_hhnoa1, T00QS3_A10083Lb_PreMt, T00QS3_A10822Lb_ObsCR, T00QS3_A12731Lb_ObsFac,
            T00QS3_A396EmprCod, T00QS3_A5532Lb_numero
            }
            , new Object[] {
            T00QS4_A407EmprNom, T00QS4_n407EmprNom
            }
            , new Object[] {
            T00QS5_A396EmprCod
            }
            , new Object[] {
            T00QS6_A5555Lb_opcion, T00QS6_A407EmprNom, T00QS6_n407EmprNom, T00QS6_A5567Lb_FechaEn, T00QS6_A5568Lb_HoraEn, T00QS6_A5563Lb_FechaR, T00QS6_A5564Lb_HoraR, T00QS6_A5565Lb_CosteE, T00QS6_A5566Lb_Estado, T00QS6_A5718Lb_numop,
            T00QS6_A5989Lb_PreKg, T00QS6_A6192Lb_FecPre, T00QS6_A6460Lb_FecEnt1, T00QS6_A6461Lb_FecNoa1, T00QS6_A6631Lb_ProvDef, T00QS6_A7395Lb_NumAux, T00QS6_A1127Lb_CosteC, T00QS6_A10081Lb_hhent1, T00QS6_A10082Lb_hhnoa1, T00QS6_A10083Lb_PreMt,
            T00QS6_A10822Lb_ObsCR, T00QS6_A12731Lb_ObsFac, T00QS6_A396EmprCod, T00QS6_A5532Lb_numero
            }
            , new Object[] {
            T00QS7_A396EmprCod
            }
            , new Object[] {
            T00QS8_A396EmprCod, T00QS8_A5532Lb_numero, T00QS8_A5555Lb_opcion
            }
            , new Object[] {
            T00QS9_A396EmprCod, T00QS9_A5532Lb_numero, T00QS9_A5555Lb_opcion
            }
            , new Object[] {
            T00QS10_A396EmprCod, T00QS10_A5532Lb_numero, T00QS10_A5555Lb_opcion
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00QS14_A396EmprCod, T00QS14_A5532Lb_numero, T00QS14_A5555Lb_opcion, T00QS14_A13460Lb_linCP, T00QS14_A13458Lb_TipCP
            }
            , new Object[] {
            T00QS15_A396EmprCod, T00QS15_A5532Lb_numero, T00QS15_A5555Lb_opcion, T00QS15_A5560Lb_LineaPr
            }
            , new Object[] {
            T00QS16_A396EmprCod, T00QS16_A5532Lb_numero, T00QS16_A5555Lb_opcion, T00QS16_A5557Lb_LineaC
            }
            , new Object[] {
            T00QS17_A396EmprCod, T00QS17_A5532Lb_numero, T00QS17_A5555Lb_opcion
            }
            , new Object[] {
            T00QS18_A396EmprCod
            }
         }
      );
      AV38Pgmname = "GestionLaboratorio.TENS003" ;
   }

   private byte Z5566Lb_Estado ;
   private byte Z5718Lb_numop ;
   private byte Z7395Lb_NumAux ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A5566Lb_Estado ;
   private byte A5718Lb_numop ;
   private byte A7395Lb_NumAux ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound819 ;
   private short nIsDirty_819 ;
   private int wcpOAV33Lb_numero ;
   private int Z5532Lb_numero ;
   private int A5532Lb_numero ;
   private int AV33Lb_numero ;
   private int trnEnded ;
   private int edtLb_numero_Enabled ;
   private int edtLb_opcion_Enabled ;
   private int edtLb_FechaEn_Enabled ;
   private int edtLb_HoraEn_Enabled ;
   private int edtLb_FechaR_Enabled ;
   private int edtLb_HoraR_Enabled ;
   private int edtLb_CosteE_Enabled ;
   private int edtLb_Estado_Enabled ;
   private int edtLb_numop_Enabled ;
   private int edtLb_PreKg_Enabled ;
   private int edtLb_FecPre_Enabled ;
   private int edtLb_FecEnt1_Enabled ;
   private int edtLb_FecNoa1_Enabled ;
   private int edtLb_ProvDef_Enabled ;
   private int edtLb_NumAux_Enabled ;
   private int edtLb_CosteC_Enabled ;
   private int edtLb_hhent1_Enabled ;
   private int edtLb_hhnoa1_Enabled ;
   private int edtLb_PreMt_Enabled ;
   private int edtLb_ObsCR_Enabled ;
   private int edtLb_ObsFac_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z5565Lb_CosteE ;
   private java.math.BigDecimal Z5989Lb_PreKg ;
   private java.math.BigDecimal Z1127Lb_CosteC ;
   private java.math.BigDecimal Z10083Lb_PreMt ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal A5989Lb_PreKg ;
   private java.math.BigDecimal A1127Lb_CosteC ;
   private java.math.BigDecimal A10083Lb_PreMt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV34Lb_opcion ;
   private String Z396EmprCod ;
   private String Z5555Lb_opcion ;
   private String Z6631Lb_ProvDef ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String AV34Lb_opcion ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLb_numero_Internalname ;
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
   private String edtLb_numero_Jsonclick ;
   private String edtLb_opcion_Internalname ;
   private String A5555Lb_opcion ;
   private String edtLb_opcion_Jsonclick ;
   private String edtLb_FechaEn_Internalname ;
   private String edtLb_FechaEn_Jsonclick ;
   private String edtLb_HoraEn_Internalname ;
   private String edtLb_HoraEn_Jsonclick ;
   private String edtLb_FechaR_Internalname ;
   private String edtLb_FechaR_Jsonclick ;
   private String edtLb_HoraR_Internalname ;
   private String edtLb_HoraR_Jsonclick ;
   private String edtLb_CosteE_Internalname ;
   private String edtLb_CosteE_Jsonclick ;
   private String edtLb_Estado_Internalname ;
   private String edtLb_Estado_Jsonclick ;
   private String edtLb_numop_Internalname ;
   private String edtLb_numop_Jsonclick ;
   private String edtLb_PreKg_Internalname ;
   private String edtLb_PreKg_Jsonclick ;
   private String edtLb_FecPre_Internalname ;
   private String edtLb_FecPre_Jsonclick ;
   private String edtLb_FecEnt1_Internalname ;
   private String edtLb_FecEnt1_Jsonclick ;
   private String edtLb_FecNoa1_Internalname ;
   private String edtLb_FecNoa1_Jsonclick ;
   private String edtLb_ProvDef_Internalname ;
   private String A6631Lb_ProvDef ;
   private String edtLb_ProvDef_Jsonclick ;
   private String edtLb_NumAux_Internalname ;
   private String edtLb_NumAux_Jsonclick ;
   private String edtLb_CosteC_Internalname ;
   private String edtLb_CosteC_Jsonclick ;
   private String edtLb_hhent1_Internalname ;
   private String edtLb_hhent1_Jsonclick ;
   private String edtLb_hhnoa1_Internalname ;
   private String edtLb_hhnoa1_Jsonclick ;
   private String edtLb_PreMt_Internalname ;
   private String edtLb_PreMt_Jsonclick ;
   private String edtLb_ObsCR_Internalname ;
   private String edtLb_ObsFac_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV38Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode819 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z5568Lb_HoraEn ;
   private java.util.Date Z5564Lb_HoraR ;
   private java.util.Date Z10081Lb_hhent1 ;
   private java.util.Date Z10082Lb_hhnoa1 ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date A10081Lb_hhent1 ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date Z5567Lb_FechaEn ;
   private java.util.Date Z5563Lb_FechaR ;
   private java.util.Date Z6192Lb_FecPre ;
   private java.util.Date Z6460Lb_FecEnt1 ;
   private java.util.Date Z6461Lb_FecNoa1 ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6192Lb_FecPre ;
   private java.util.Date A6460Lb_FecEnt1 ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z10822Lb_ObsCR ;
   private String Z12731Lb_ObsFac ;
   private String A10822Lb_ObsCR ;
   private String A12731Lb_ObsFac ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00QS4_A407EmprNom ;
   private boolean[] T00QS4_n407EmprNom ;
   private String[] T00QS6_A5555Lb_opcion ;
   private String[] T00QS6_A407EmprNom ;
   private boolean[] T00QS6_n407EmprNom ;
   private java.util.Date[] T00QS6_A5567Lb_FechaEn ;
   private java.util.Date[] T00QS6_A5568Lb_HoraEn ;
   private java.util.Date[] T00QS6_A5563Lb_FechaR ;
   private java.util.Date[] T00QS6_A5564Lb_HoraR ;
   private java.math.BigDecimal[] T00QS6_A5565Lb_CosteE ;
   private byte[] T00QS6_A5566Lb_Estado ;
   private byte[] T00QS6_A5718Lb_numop ;
   private java.math.BigDecimal[] T00QS6_A5989Lb_PreKg ;
   private java.util.Date[] T00QS6_A6192Lb_FecPre ;
   private java.util.Date[] T00QS6_A6460Lb_FecEnt1 ;
   private java.util.Date[] T00QS6_A6461Lb_FecNoa1 ;
   private String[] T00QS6_A6631Lb_ProvDef ;
   private byte[] T00QS6_A7395Lb_NumAux ;
   private java.math.BigDecimal[] T00QS6_A1127Lb_CosteC ;
   private java.util.Date[] T00QS6_A10081Lb_hhent1 ;
   private java.util.Date[] T00QS6_A10082Lb_hhnoa1 ;
   private java.math.BigDecimal[] T00QS6_A10083Lb_PreMt ;
   private String[] T00QS6_A10822Lb_ObsCR ;
   private String[] T00QS6_A12731Lb_ObsFac ;
   private String[] T00QS6_A396EmprCod ;
   private int[] T00QS6_A5532Lb_numero ;
   private String[] T00QS5_A396EmprCod ;
   private String[] T00QS7_A396EmprCod ;
   private String[] T00QS8_A396EmprCod ;
   private int[] T00QS8_A5532Lb_numero ;
   private String[] T00QS8_A5555Lb_opcion ;
   private String[] T00QS3_A5555Lb_opcion ;
   private java.util.Date[] T00QS3_A5567Lb_FechaEn ;
   private java.util.Date[] T00QS3_A5568Lb_HoraEn ;
   private java.util.Date[] T00QS3_A5563Lb_FechaR ;
   private java.util.Date[] T00QS3_A5564Lb_HoraR ;
   private java.math.BigDecimal[] T00QS3_A5565Lb_CosteE ;
   private byte[] T00QS3_A5566Lb_Estado ;
   private byte[] T00QS3_A5718Lb_numop ;
   private java.math.BigDecimal[] T00QS3_A5989Lb_PreKg ;
   private java.util.Date[] T00QS3_A6192Lb_FecPre ;
   private java.util.Date[] T00QS3_A6460Lb_FecEnt1 ;
   private java.util.Date[] T00QS3_A6461Lb_FecNoa1 ;
   private String[] T00QS3_A6631Lb_ProvDef ;
   private byte[] T00QS3_A7395Lb_NumAux ;
   private java.math.BigDecimal[] T00QS3_A1127Lb_CosteC ;
   private java.util.Date[] T00QS3_A10081Lb_hhent1 ;
   private java.util.Date[] T00QS3_A10082Lb_hhnoa1 ;
   private java.math.BigDecimal[] T00QS3_A10083Lb_PreMt ;
   private String[] T00QS3_A10822Lb_ObsCR ;
   private String[] T00QS3_A12731Lb_ObsFac ;
   private String[] T00QS3_A396EmprCod ;
   private int[] T00QS3_A5532Lb_numero ;
   private String[] T00QS9_A396EmprCod ;
   private int[] T00QS9_A5532Lb_numero ;
   private String[] T00QS9_A5555Lb_opcion ;
   private String[] T00QS10_A396EmprCod ;
   private int[] T00QS10_A5532Lb_numero ;
   private String[] T00QS10_A5555Lb_opcion ;
   private String[] T00QS2_A5555Lb_opcion ;
   private java.util.Date[] T00QS2_A5567Lb_FechaEn ;
   private java.util.Date[] T00QS2_A5568Lb_HoraEn ;
   private java.util.Date[] T00QS2_A5563Lb_FechaR ;
   private java.util.Date[] T00QS2_A5564Lb_HoraR ;
   private java.math.BigDecimal[] T00QS2_A5565Lb_CosteE ;
   private byte[] T00QS2_A5566Lb_Estado ;
   private byte[] T00QS2_A5718Lb_numop ;
   private java.math.BigDecimal[] T00QS2_A5989Lb_PreKg ;
   private java.util.Date[] T00QS2_A6192Lb_FecPre ;
   private java.util.Date[] T00QS2_A6460Lb_FecEnt1 ;
   private java.util.Date[] T00QS2_A6461Lb_FecNoa1 ;
   private String[] T00QS2_A6631Lb_ProvDef ;
   private byte[] T00QS2_A7395Lb_NumAux ;
   private java.math.BigDecimal[] T00QS2_A1127Lb_CosteC ;
   private java.util.Date[] T00QS2_A10081Lb_hhent1 ;
   private java.util.Date[] T00QS2_A10082Lb_hhnoa1 ;
   private java.math.BigDecimal[] T00QS2_A10083Lb_PreMt ;
   private String[] T00QS2_A10822Lb_ObsCR ;
   private String[] T00QS2_A12731Lb_ObsFac ;
   private String[] T00QS2_A396EmprCod ;
   private int[] T00QS2_A5532Lb_numero ;
   private String[] T00QS14_A396EmprCod ;
   private int[] T00QS14_A5532Lb_numero ;
   private String[] T00QS14_A5555Lb_opcion ;
   private short[] T00QS14_A13460Lb_linCP ;
   private String[] T00QS14_A13458Lb_TipCP ;
   private String[] T00QS15_A396EmprCod ;
   private int[] T00QS15_A5532Lb_numero ;
   private String[] T00QS15_A5555Lb_opcion ;
   private short[] T00QS15_A5560Lb_LineaPr ;
   private String[] T00QS16_A396EmprCod ;
   private int[] T00QS16_A5532Lb_numero ;
   private String[] T00QS16_A5555Lb_opcion ;
   private short[] T00QS16_A5557Lb_LineaC ;
   private String[] T00QS17_A396EmprCod ;
   private int[] T00QS17_A5532Lb_numero ;
   private String[] T00QS17_A5555Lb_opcion ;
   private String[] T00QS18_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
}

final  class tens003__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tens003__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tens003__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tens003__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tens003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00QS2", "SELECT Lb_opcion, Lb_FechaEn, Lb_HoraEn, Lb_FechaR, Lb_HoraR, Lb_CosteE, Lb_Estado, Lb_numop, Lb_PreKg, Lb_FecPre, Lb_FecEnt1, Lb_FecNoa1, Lb_ProvDef, Lb_NumAux, Lb_CosteC, Lb_hhent1, Lb_hhnoa1, Lb_PreMt, Lb_ObsCR, Lb_ObsFac, EmprCod, Lb_numero FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?  FOR UPDATE OF Lb_FechaEn, Lb_HoraEn, Lb_FechaR, Lb_HoraR, Lb_CosteE, Lb_Estado, Lb_numop, Lb_PreKg, Lb_FecPre, Lb_FecEnt1, Lb_FecNoa1, Lb_ProvDef, Lb_NumAux, Lb_CosteC, Lb_hhent1, Lb_hhnoa1, Lb_PreMt, Lb_ObsCR, Lb_ObsFac NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QS3", "SELECT Lb_opcion, Lb_FechaEn, Lb_HoraEn, Lb_FechaR, Lb_HoraR, Lb_CosteE, Lb_Estado, Lb_numop, Lb_PreKg, Lb_FecPre, Lb_FecEnt1, Lb_FecNoa1, Lb_ProvDef, Lb_NumAux, Lb_CosteC, Lb_hhent1, Lb_hhnoa1, Lb_PreMt, Lb_ObsCR, Lb_ObsFac, EmprCod, Lb_numero FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QS4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QS5", "SELECT EmprCod FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QS6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Lb_opcion, T2.EmprNom, TM1.Lb_FechaEn, TM1.Lb_HoraEn, TM1.Lb_FechaR, TM1.Lb_HoraR, TM1.Lb_CosteE, TM1.Lb_Estado, TM1.Lb_numop, TM1.Lb_PreKg, TM1.Lb_FecPre, TM1.Lb_FecEnt1, TM1.Lb_FecNoa1, TM1.Lb_ProvDef, TM1.Lb_NumAux, TM1.Lb_CosteC, TM1.Lb_hhent1, TM1.Lb_hhnoa1, TM1.Lb_PreMt, TM1.Lb_ObsCR, TM1.Lb_ObsFac, TM1.EmprCod, TM1.Lb_numero FROM (TXPENS002 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Lb_numero = ? and TM1.Lb_opcion = ? ORDER BY TM1.EmprCod, TM1.Lb_numero, TM1.Lb_opcion ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QS7", "SELECT EmprCod FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QS8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QS9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE ( EmprCod > ? or EmprCod = ? and Lb_numero > ? or Lb_numero = ? and EmprCod = ? and Lb_opcion > ?) ORDER BY EmprCod, Lb_numero, Lb_opcion) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00QS10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE ( EmprCod < ? or EmprCod = ? and Lb_numero < ? or Lb_numero = ? and EmprCod = ? and Lb_opcion < ?) ORDER BY EmprCod DESC, Lb_numero DESC, Lb_opcion DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00QS11", "INSERT INTO TXPENS002(Lb_opcion, Lb_FechaEn, Lb_HoraEn, Lb_FechaR, Lb_HoraR, Lb_CosteE, Lb_Estado, Lb_numop, Lb_PreKg, Lb_FecPre, Lb_FecEnt1, Lb_FecNoa1, Lb_ProvDef, Lb_NumAux, Lb_CosteC, Lb_hhent1, Lb_hhnoa1, Lb_PreMt, Lb_ObsCR, Lb_ObsFac, EmprCod, Lb_numero, Lb_UltLC, Lb_UltlP, Lb_TaAuxC, Lb_famc1, Lb_famc2, Lb_famc3, Lb_IntCod, Lb_opSt, Lb_opFc, Lb_UltLinC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK, "TXPENS002")
         ,new UpdateCursor("T00QS12", "UPDATE TXPENS002 SET Lb_FechaEn=?, Lb_HoraEn=?, Lb_FechaR=?, Lb_HoraR=?, Lb_CosteE=?, Lb_Estado=?, Lb_numop=?, Lb_PreKg=?, Lb_FecPre=?, Lb_FecEnt1=?, Lb_FecNoa1=?, Lb_ProvDef=?, Lb_NumAux=?, Lb_CosteC=?, Lb_hhent1=?, Lb_hhnoa1=?, Lb_PreMt=?, Lb_ObsCR=?, Lb_ObsFac=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK, "TXPENS002")
         ,new UpdateCursor("T00QS13", "DELETE FROM TXPENS002  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK, "TXPENS002")
         ,new ForEachCursor("T00QS14", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00QS15", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00QS16", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00QS17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QS18", "SELECT EmprCod FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = GXutil.resetDate(rslt.getGXDateTime(3));
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(16));
               ((java.util.Date[]) buf[16])[0] = GXutil.resetDate(rslt.getGXDateTime(17));
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((String[]) buf[19])[0] = rslt.getVarchar(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 3);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = GXutil.resetDate(rslt.getGXDateTime(3));
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(16));
               ((java.util.Date[]) buf[16])[0] = GXutil.resetDate(rslt.getGXDateTime(17));
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((String[]) buf[19])[0] = rslt.getVarchar(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 3);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,5);
               ((java.util.Date[]) buf[17])[0] = GXutil.resetDate(rslt.getGXDateTime(17));
               ((java.util.Date[]) buf[18])[0] = GXutil.resetDate(rslt.getGXDateTime(18));
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,5);
               ((String[]) buf[20])[0] = rslt.getVarchar(20);
               ((String[]) buf[21])[0] = rslt.getVarchar(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 16 :
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDateTime(3, (java.util.Date)parms[2], true);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDateTime(5, (java.util.Date)parms[4], true);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 5);
               stmt.setDateTime(16, (java.util.Date)parms[15], true);
               stmt.setDateTime(17, (java.util.Date)parms[16], true);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 5);
               stmt.setVarchar(19, (String)parms[18], 300, false);
               stmt.setVarchar(20, (String)parms[19], 200, false);
               stmt.setString(21, (String)parms[20], 3);
               stmt.setInt(22, ((Number) parms[21]).intValue());
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDateTime(2, (java.util.Date)parms[1], true);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDateTime(4, (java.util.Date)parms[3], true);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 5);
               stmt.setDateTime(15, (java.util.Date)parms[14], true);
               stmt.setDateTime(16, (java.util.Date)parms[15], true);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 5);
               stmt.setVarchar(18, (String)parms[17], 300, false);
               stmt.setVarchar(19, (String)parms[18], 200, false);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

