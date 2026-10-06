package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidodevolucion_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
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
         xc_25_1S31633( A396EmprCod, A11669DevCruId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action38") == 0 )
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
         xc_38_1S31634( A396EmprCod, A44AlbRecCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_43") == 0 )
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
         gxload_43( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_44") == 0 )
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
         gxload_44( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_46") == 0 )
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
         gxload_46( A396EmprCod, A44AlbRecCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_almacentejido") == 0 )
      {
         gxnrgridlevel_almacentejido_newrow_invoke( ) ;
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
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
            AV19DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19DevCruId), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19DevCruId), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Almacen Tejido Devolucion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtavImgalbreccodprompt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_almacentejido_newrow_invoke( )
   {
      nRC_GXsfl_72 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_72"))) ;
      nGXsfl_72_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_72_idx"))) ;
      sGXsfl_72_idx = httpContext.GetPar( "sGXsfl_72_idx") ;
      AV32imgAlbRecCodPrompt = httpContext.GetPar( "imgAlbRecCodPrompt") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_almacentejido_newrow( ) ;
      /* End function gxnrGridlevel_almacentejido_newrow_invoke */
   }

   public almacentejidodevolucion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public almacentejidodevolucion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidodevolucion_impl.class ));
   }

   public almacentejidodevolucion_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 col-md-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruId_Internalname, httpContext.getMessage( "Devolucion Id", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruId_Internalname, GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruId_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevCruFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruFec_Internalname, localUtil.format(A11670DevCruFec, "99/99/99"), localUtil.format( A11670DevCruFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevCruSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruSal_Internalname, localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11673DevCruSal, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruSal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
      ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
      ucCombo_clicod.setProperty("EmptyItem", Combo_clicod_Emptyitem);
      ucCombo_clicod.setProperty("DropDownOptionsData", AV26CliCod_Data);
      ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trncod.setProperty("Caption", Combo_trncod_Caption);
      ucCombo_trncod.setProperty("Cls", Combo_trncod_Cls);
      ucCombo_trncod.setProperty("EmptyItem", Combo_trncod_Emptyitem);
      ucCombo_trncod.setProperty("DropDownOptionsData", AV33TrnCod_Data);
      ucCombo_trncod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncod_Internalname, "COMBO_TRNCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnCod_Visible, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruMat_Internalname, GXutil.rtrim( A11672DevCruMat), GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruObs_Internalname, A11682DevCruObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", (short)(0), 1, edtDevCruObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_almacentejido_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_almacentejido( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV39Pgmname), GXutil.rtrim( localUtil.format( AV39Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_clicod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV28ComboCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28ComboCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV28ComboCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboclicod_Visible, edtavComboclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trncod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV34ComboTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34ComboTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34ComboTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCombotrncod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrncod_Visible, edtavCombotrncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruEst_Internalname, GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruEst_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruEst_Visible, edtDevCruEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruHash_Internalname, GXutil.rtrim( A11674DevCruHash), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", (short)(0), edtDevCruHash_Visible, edtDevCruHash_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruDesc_Internalname, GXutil.rtrim( A11675DevCruDesc), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", (short)(0), edtDevCruDesc_Visible, edtDevCruDesc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevCruDtSy_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruDtSy_Internalname, localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruDtSy_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruDtSy_Visible, edtDevCruDtSy_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruDtSy_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtDevCruDtSy_Visible==0)||(edtDevCruDtSy_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruGros_Internalname, GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruGros_Enabled!=0) ? localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99") : localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruGros_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruGros_Visible, edtDevCruGros_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruStt_Internalname, GXutil.rtrim( A11678DevCruStt), GXutil.rtrim( localUtil.format( A11678DevCruStt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruStt_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruStt_Visible, edtDevCruStt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruEnvA_Internalname, GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruEnvA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9") : localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruEnvA_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruEnvA_Visible, edtDevCruEnvA_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruAtId_Internalname, GXutil.rtrim( A11680DevCruAtId), GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruAtId_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruAtId_Visible, edtDevCruAtId_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruAT_Internalname, GXutil.rtrim( A11681DevCruAT), GXutil.rtrim( localUtil.format( A11681DevCruAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruAT_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruAT_Visible, edtDevCruAT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruATCU_Internalname, GXutil.rtrim( A13983DevCruATCU), GXutil.rtrim( localUtil.format( A13983DevCruATCU, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruATCU_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruATCU_Visible, edtDevCruATCU_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruSerA_Internalname, GXutil.rtrim( A13984DevCruSerA), GXutil.rtrim( localUtil.format( A13984DevCruSerA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruSerA_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruSerA_Visible, edtDevCruSerA_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruTipA_Internalname, GXutil.rtrim( A13985DevCruTipA), GXutil.rtrim( localUtil.format( A13985DevCruTipA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruTipA_Jsonclick, 0, "Attribute", "", "", "", "", edtDevCruTipA_Visible, edtDevCruTipA_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoDevolucion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_almacentejido( )
   {
      /*  Grid Control  */
      startgridcontrol72( ) ;
      nGXsfl_72_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1634 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1634 = (short)(1) ;
            scanStart1S31634( ) ;
            while ( RcdFound1634 != 0 )
            {
               init_level_properties1634( ) ;
               getByPrimaryKey1S31634( ) ;
               addRow1S31634( ) ;
               scanNext1S31634( ) ;
            }
            scanEnd1S31634( ) ;
            nBlankRcdCount1634 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1S31634( ) ;
         standaloneModal1S31634( ) ;
         sMode1634 = Gx_mode ;
         while ( nGXsfl_72_idx < nRC_GXsfl_72 )
         {
            bGXsfl_72_Refreshing = true ;
            readRow1S31634( ) ;
            edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtavImgalbreccodprompt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavImgalbreccodprompt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImgalbreccodprompt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtavImgalbreccodprompt_Link = httpContext.cgiGet( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Link") ;
            httpContext.ajax_rsp_assign_prop("", false, edtavImgalbreccodprompt_Internalname, "Link", edtavImgalbreccodprompt_Link, !bGXsfl_72_Refreshing);
            edtavImgalbreccodprompt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavImgalbreccodprompt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImgalbreccodprompt_Visible), 5, 0), !bGXsfl_72_Refreshing);
            edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREF_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtAlbRefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREFDSC_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtDevCruUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUUND_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruUnd_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            cmbAlbRUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNI_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
            edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtDevCruPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUPZS_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruPzs_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
            if ( ( nRcdExists_1634 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1S31634( ) ;
            }
            sendRow1S31634( ) ;
            bGXsfl_72_Refreshing = false ;
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
            scanStart1S31634( ) ;
            while ( RcdFound1634 != 0 )
            {
               sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_721634( ) ;
               init_level_properties1634( ) ;
               standaloneNotModal1S31634( ) ;
               getByPrimaryKey1S31634( ) ;
               standaloneModal1S31634( ) ;
               addRow1S31634( ) ;
               scanNext1S31634( ) ;
            }
            scanEnd1S31634( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1634 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_721634( ) ;
         initAll1S31634( ) ;
         init_level_properties1634( ) ;
         nRcdExists_1634 = (short)(0) ;
         nIsMod_1634 = (short)(0) ;
         nRcdDeleted_1634 = (short)(0) ;
         nBlankRcdCount1634 = (short)(nBlankRcdUsr1634+nBlankRcdCount1634) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1634 > 0 )
         {
            standaloneNotModal1S31634( ) ;
            standaloneModal1S31634( ) ;
            addRow1S31634( ) ;
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
      httpContext.writeText( "<div id=\""+"Gridlevel_almacentejidoContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_almacentejido", Gridlevel_almacentejidoContainer, subGridlevel_almacentejido_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_almacentejidoContainerData", Gridlevel_almacentejidoContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_almacentejidoContainerData"+"V", Gridlevel_almacentejidoContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_almacentejidoContainerData"+"V"+"\" value='"+Gridlevel_almacentejidoContainer.GridValuesHidden()+"'/>") ;
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
      e111S32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV26CliCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCOD_DATA"), AV33TrnCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "Z11669DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11670DevCruFec = localUtil.ctod( httpContext.cgiGet( "Z11670DevCruFec"), 0) ;
            Z11673DevCruSal = localUtil.ctot( httpContext.cgiGet( "Z11673DevCruSal"), 0) ;
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
            Z13983DevCruATCU = httpContext.cgiGet( "Z13983DevCruATCU") ;
            Z13984DevCruSerA = httpContext.cgiGet( "Z13984DevCruSerA") ;
            Z13985DevCruTipA = httpContext.cgiGet( "Z13985DevCruTipA") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_72 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_72"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV19DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "vDEVCRUID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10FirmaD = (short)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            AV17FlagCli = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_clicod_Objectcall = httpContext.cgiGet( "COMBO_CLICOD_Objectcall") ;
            Combo_clicod_Class = httpContext.cgiGet( "COMBO_CLICOD_Class") ;
            Combo_clicod_Icontype = httpContext.cgiGet( "COMBO_CLICOD_Icontype") ;
            Combo_clicod_Icon = httpContext.cgiGet( "COMBO_CLICOD_Icon") ;
            Combo_clicod_Caption = httpContext.cgiGet( "COMBO_CLICOD_Caption") ;
            Combo_clicod_Tooltip = httpContext.cgiGet( "COMBO_CLICOD_Tooltip") ;
            Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
            Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
            Combo_clicod_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_get") ;
            Combo_clicod_Selectedtext_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_set") ;
            Combo_clicod_Selectedtext_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_get") ;
            Combo_clicod_Gamoauthtoken = httpContext.cgiGet( "COMBO_CLICOD_Gamoauthtoken") ;
            Combo_clicod_Ddointernalname = httpContext.cgiGet( "COMBO_CLICOD_Ddointernalname") ;
            Combo_clicod_Titlecontrolalign = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolalign") ;
            Combo_clicod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLICOD_Dropdownoptionstype") ;
            Combo_clicod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Enabled")) ;
            Combo_clicod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Visible")) ;
            Combo_clicod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolidtoreplace") ;
            Combo_clicod_Datalisttype = httpContext.cgiGet( "COMBO_CLICOD_Datalisttype") ;
            Combo_clicod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Allowmultipleselection")) ;
            Combo_clicod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CLICOD_Datalistfixedvalues") ;
            Combo_clicod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Isgriditem")) ;
            Combo_clicod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Hasdescription")) ;
            Combo_clicod_Datalistproc = httpContext.cgiGet( "COMBO_CLICOD_Datalistproc") ;
            Combo_clicod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CLICOD_Datalistprocparametersprefix") ;
            Combo_clicod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CLICOD_Remoteservicesparameters") ;
            Combo_clicod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLICOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_clicod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeonlyselectedoption")) ;
            Combo_clicod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeselectalloption")) ;
            Combo_clicod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Emptyitem")) ;
            Combo_clicod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeaddnewoption")) ;
            Combo_clicod_Htmltemplate = httpContext.cgiGet( "COMBO_CLICOD_Htmltemplate") ;
            Combo_clicod_Multiplevaluestype = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluestype") ;
            Combo_clicod_Loadingdata = httpContext.cgiGet( "COMBO_CLICOD_Loadingdata") ;
            Combo_clicod_Noresultsfound = httpContext.cgiGet( "COMBO_CLICOD_Noresultsfound") ;
            Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
            Combo_clicod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CLICOD_Onlyselectedvalues") ;
            Combo_clicod_Selectalltext = httpContext.cgiGet( "COMBO_CLICOD_Selectalltext") ;
            Combo_clicod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluesseparator") ;
            Combo_clicod_Addnewoptiontext = httpContext.cgiGet( "COMBO_CLICOD_Addnewoptiontext") ;
            Combo_trncod_Objectcall = httpContext.cgiGet( "COMBO_TRNCOD_Objectcall") ;
            Combo_trncod_Class = httpContext.cgiGet( "COMBO_TRNCOD_Class") ;
            Combo_trncod_Icontype = httpContext.cgiGet( "COMBO_TRNCOD_Icontype") ;
            Combo_trncod_Icon = httpContext.cgiGet( "COMBO_TRNCOD_Icon") ;
            Combo_trncod_Caption = httpContext.cgiGet( "COMBO_TRNCOD_Caption") ;
            Combo_trncod_Tooltip = httpContext.cgiGet( "COMBO_TRNCOD_Tooltip") ;
            Combo_trncod_Cls = httpContext.cgiGet( "COMBO_TRNCOD_Cls") ;
            Combo_trncod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_set") ;
            Combo_trncod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_get") ;
            Combo_trncod_Selectedtext_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_set") ;
            Combo_trncod_Selectedtext_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_get") ;
            Combo_trncod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TRNCOD_Gamoauthtoken") ;
            Combo_trncod_Ddointernalname = httpContext.cgiGet( "COMBO_TRNCOD_Ddointernalname") ;
            Combo_trncod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolalign") ;
            Combo_trncod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TRNCOD_Dropdownoptionstype") ;
            Combo_trncod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Enabled")) ;
            Combo_trncod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Visible")) ;
            Combo_trncod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolidtoreplace") ;
            Combo_trncod_Datalisttype = httpContext.cgiGet( "COMBO_TRNCOD_Datalisttype") ;
            Combo_trncod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Allowmultipleselection")) ;
            Combo_trncod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Datalistfixedvalues") ;
            Combo_trncod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Isgriditem")) ;
            Combo_trncod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Hasdescription")) ;
            Combo_trncod_Datalistproc = httpContext.cgiGet( "COMBO_TRNCOD_Datalistproc") ;
            Combo_trncod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TRNCOD_Datalistprocparametersprefix") ;
            Combo_trncod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TRNCOD_Remoteservicesparameters") ;
            Combo_trncod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TRNCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_trncod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeonlyselectedoption")) ;
            Combo_trncod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeselectalloption")) ;
            Combo_trncod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Emptyitem")) ;
            Combo_trncod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeaddnewoption")) ;
            Combo_trncod_Htmltemplate = httpContext.cgiGet( "COMBO_TRNCOD_Htmltemplate") ;
            Combo_trncod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluestype") ;
            Combo_trncod_Loadingdata = httpContext.cgiGet( "COMBO_TRNCOD_Loadingdata") ;
            Combo_trncod_Noresultsfound = httpContext.cgiGet( "COMBO_TRNCOD_Noresultsfound") ;
            Combo_trncod_Emptyitemtext = httpContext.cgiGet( "COMBO_TRNCOD_Emptyitemtext") ;
            Combo_trncod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Onlyselectedvalues") ;
            Combo_trncod_Selectalltext = httpContext.cgiGet( "COMBO_TRNCOD_Selectalltext") ;
            Combo_trncod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluesseparator") ;
            Combo_trncod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TRNCOD_Addnewoptiontext") ;
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
            A11672DevCruMat = httpContext.cgiGet( edtDevCruMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
            A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
            AV39Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
            AV28ComboCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboCliCod), 6, 0));
            AV34ComboTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotrncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34ComboTrnCod), 4, 0));
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
            A13983DevCruATCU = httpContext.cgiGet( edtDevCruATCU_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
            A13984DevCruSerA = httpContext.cgiGet( edtDevCruSerA_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", A13984DevCruSerA);
            A13985DevCruTipA = httpContext.cgiGet( edtDevCruTipA_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", A13985DevCruTipA);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejidoDevolucion");
            A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("DevCruDtSy", localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV39Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV39Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A11669DevCruId != Z11669DevCruId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("almacensindetalle\\almacentejidodevolucion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1S30( ) ;
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
                        e111S32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121S32 ();
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
         e121S32 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1S31633( ) ;
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
         disableAttributes1S31633( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
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

   public void confirm_1S30( )
   {
      beforeValidate1S31633( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1S31633( ) ;
         }
         else
         {
            checkExtendedTable1S31633( ) ;
            closeExtendedTableCursors1S31633( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1633 = Gx_mode ;
         confirm_1S31634( ) ;
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

   public void confirm_1S31634( )
   {
      nGXsfl_72_idx = 0 ;
      while ( nGXsfl_72_idx < nRC_GXsfl_72 )
      {
         readRow1S31634( ) ;
         if ( ( nRcdExists_1634 != 0 ) || ( nIsMod_1634 != 0 ) )
         {
            getKey1S31634( ) ;
            if ( ( nRcdExists_1634 == 0 ) && ( nRcdDeleted_1634 == 0 ) )
            {
               if ( RcdFound1634 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1S31634( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S31634( ) ;
                     closeExtendedTableCursors1S31634( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ALBRECCOD_" + sGXsfl_72_idx ;
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
                     getByPrimaryKey1S31634( ) ;
                     load1S31634( ) ;
                     beforeValidate1S31634( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S31634( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1634 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1S31634( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S31634( ) ;
                           closeExtendedTableCursors1S31634( ) ;
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
                     GXCCtl = "ALBRECCOD_" + sGXsfl_72_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavImgalbreccodprompt_Internalname, AV32imgAlbRecCodPrompt) ;
         httpContext.changePostValue( edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc)) ;
         httpContext.changePostValue( edtDevCruUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni)) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevCruPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_72_idx, GXutil.rtrim( Z45AlbRef)) ;
         httpContext.changePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_72_idx, GXutil.rtrim( Z3613AlbRefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z56AlbRUni_"+sGXsfl_72_idx, GXutil.rtrim( Z56AlbRUni)) ;
         httpContext.changePostValue( "T11684DevCruPzs_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T54AlbRPieUti_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11683DevCruUnd_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T60AlbRUniUti_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1634_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1634_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1634_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1634 != 0 )
         {
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavImgalbreccodprompt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Link", GXutil.rtrim( edtavImgalbreccodprompt_Link)) ;
            httpContext.changePostValue( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavImgalbreccodprompt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREF_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREFDSC_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUUND_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNI_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUPZS_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1S30( )
   {
   }

   public void e111S32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      almacentejidodevolucion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      almacentejidodevolucion_impl.this.A396EmprCod = GXv_char2[0] ;
      almacentejidodevolucion_impl.this.AV8EmprNom = GXv_char3[0] ;
      almacentejidodevolucion_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXt_int5 = (byte)(AV10FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      almacentejidodevolucion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV10FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10FirmaD), 4, 0));
      GXt_int5 = (byte)(AV11Ws) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WSDM", ""), GXv_int6) ;
      almacentejidodevolucion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV11Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Ws", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Ws), 4, 0));
      GXt_int5 = (byte)(AV12Modhh) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      almacentejidodevolucion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Modhh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Modhh), 4, 0));
      GXt_int5 = (byte)(AV13Reg000) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REG000", ""), GXv_int6) ;
      almacentejidodevolucion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13Reg000 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Reg000", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Reg000), 4, 0));
      GXt_int7 = AV14copias ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVEND", ""), GXv_int8) ;
      almacentejidodevolucion_impl.this.GXt_int7 = GXv_int8[0] ;
      AV14copias = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14copias), 4, 0));
      AV14copias = (short)(((0==AV14copias) ? 1 : AV14copias)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14copias), 4, 0));
      AV15Copias2 = AV14copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Copias2), 4, 0));
      GXt_char1 = AV35Path ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CPRPEM", ""), GXv_char4) ;
      almacentejidodevolucion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35Path = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
      GXt_char1 = AV7Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      almacentejidodevolucion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char4[0] = AV18EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char3, GXv_char2) ;
      almacentejidodevolucion_impl.this.AV18EmprCod = GXv_char4[0] ;
      almacentejidodevolucion_impl.this.AV8EmprNom = GXv_char3[0] ;
      almacentejidodevolucion_impl.this.AV9UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXv_SdtWWPContext9[0] = AV20WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV20WWPContext = GXv_SdtWWPContext9[0] ;
      edtTrnCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), true);
      AV34ComboTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34ComboTrnCod), 4, 0));
      edtavCombotrncod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      AV28ComboCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboCliCod), 6, 0));
      edtavComboclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
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
      /* Execute user subroutine: 'LOADCOMBOTRNCOD' */
      S122 ();
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
      AV21TrnContext.fromxml(AV22WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV21TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV39Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV40GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GXV1), 8, 0));
         while ( AV40GXV1 <= AV21TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV25TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV21TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV40GXV1));
            if ( GXutil.strcmp(AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV23Insert_CliCod = (int)(GXutil.lval( AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Insert_CliCod), 6, 0));
               if ( ! (0==AV23Insert_CliCod) )
               {
                  AV28ComboCliCod = AV23Insert_CliCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboCliCod), 6, 0));
                  Combo_clicod_Selectedvalue_set = GXutil.trim( GXutil.str( AV28ComboCliCod, 6, 0)) ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
                  Combo_clicod_Enabled = false ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV24Insert_TrnCod = (short)(GXutil.lval( AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Insert_TrnCod), 4, 0));
               if ( ! (0==AV24Insert_TrnCod) )
               {
                  AV34ComboTrnCod = AV24Insert_TrnCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV34ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34ComboTrnCod), 4, 0));
                  Combo_trncod_Selectedvalue_set = GXutil.trim( GXutil.str( AV34ComboTrnCod, 4, 0)) ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
                  Combo_trncod_Enabled = false ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
               }
            }
            AV40GXV1 = (int)(AV40GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GXV1), 8, 0));
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
      edtDevCruATCU_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruATCU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruATCU_Visible), 5, 0), true);
      edtDevCruSerA_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSerA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruSerA_Visible), 5, 0), true);
      edtDevCruTipA_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruTipA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruTipA_Visible), 5, 0), true);
      edtavImgalbreccodprompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavImgalbreccodprompt_Internalname, "gximage", edtavImgalbreccodprompt_gximage, !bGXsfl_72_Refreshing);
      AV32imgAlbRecCodPrompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavImgalbreccodprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV32imgAlbRecCodPrompt)==0) ? AV41Imgalbreccodprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV32imgAlbRecCodPrompt))), !bGXsfl_72_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavImgalbreccodprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV32imgAlbRecCodPrompt), true);
      AV41Imgalbreccodprompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavImgalbreccodprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV32imgAlbRecCodPrompt)==0) ? AV41Imgalbreccodprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV32imgAlbRecCodPrompt))), !bGXsfl_72_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavImgalbreccodprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV32imgAlbRecCodPrompt), true);
   }

   public void e121S32( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV21TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.almacensindetalle.almacentejidodevolucionww", new String[] {}, new String[] {}) );
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
      GXv_char3[0] = AV29Cadena ;
      new app.almacensindetalle.obtengocadenaparahashdevolucionalmacen(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_date10, GXv_dtime11, GXv_int6, GXv_int12, GXv_char3) ;
      almacentejidodevolucion_impl.this.A396EmprCod = GXv_char4[0] ;
      almacentejidodevolucion_impl.this.A11669DevCruId = GXv_int8[0] ;
      almacentejidodevolucion_impl.this.A11670DevCruFec = GXv_date10[0] ;
      almacentejidodevolucion_impl.this.A11676DevCruDtSy = GXv_dtime11[0] ;
      almacentejidodevolucion_impl.this.AV29Cadena = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXv_char4[0] = AV30Hash ;
      GXv_objcol_SdtMessages_Message13[0] = AV36Messages ;
      GXv_boolean14[0] = AV37OK ;
      new app.hash_obtener(remoteHandle, context).execute( AV29Cadena, GXv_char4, GXv_objcol_SdtMessages_Message13, GXv_boolean14) ;
      almacentejidodevolucion_impl.this.AV30Hash = GXv_char4[0] ;
      AV36Messages = GXv_objcol_SdtMessages_Message13[0] ;
      almacentejidodevolucion_impl.this.AV37OK = GXv_boolean14[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A11669DevCruId ;
      GXv_char3[0] = AV29Cadena ;
      GXv_char2[0] = AV30Hash ;
      new app.almacensindetalle.actualizohashdevolucionalmacen(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      almacentejidodevolucion_impl.this.A396EmprCod = GXv_char4[0] ;
      almacentejidodevolucion_impl.this.A11669DevCruId = GXv_int8[0] ;
      almacentejidodevolucion_impl.this.AV29Cadena = GXv_char3[0] ;
      almacentejidodevolucion_impl.this.AV30Hash = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      httpContext.popup(formatLink("app.almacensindetalle.horasalidadocumentoenvioat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A11676DevCruDtSy)),GXutil.URLEncode(GXutil.rtrim(AV29Cadena)),GXutil.URLEncode(GXutil.rtrim(AV30Hash))}, new String[] {"Emprcod","DevCruId","DevCruDtSys","Cadena","Hash"}) , new Object[] {"A396EmprCod","A11669DevCruId","A11676DevCruDtSy","AV29Cadena","AV30Hash"});
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

   public void S122( )
   {
      /* 'LOADCOMBOTRNCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = AV33TrnCod_Data ;
      GXv_char4[0] = AV27ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item16[0] = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
      new app.almacensindetalle.almacentejidodevolucionloaddvcombo(remoteHandle, context).execute( "TrnCod", Gx_mode, AV18EmprCod, AV19DevCruId, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item16) ;
      almacentejidodevolucion_impl.this.AV27ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = GXv_objcol_SdtDVB_SDTComboData_Item16[0] ;
      AV33TrnCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
      Combo_trncod_Selectedvalue_set = AV27ComboSelectedValue ;
      ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
      AV34ComboTrnCod = (short)(GXutil.lval( AV27ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34ComboTrnCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_trncod_Enabled = false ;
         ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = AV26CliCod_Data ;
      GXv_char4[0] = AV27ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item16[0] = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
      new app.almacensindetalle.almacentejidodevolucionloaddvcombo(remoteHandle, context).execute( "CliCod", Gx_mode, AV18EmprCod, AV19DevCruId, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item16) ;
      almacentejidodevolucion_impl.this.AV27ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = GXv_objcol_SdtDVB_SDTComboData_Item16[0] ;
      AV26CliCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item15 ;
      Combo_clicod_Selectedvalue_set = AV27ComboSelectedValue ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
      AV28ComboCliCod = (int)(GXutil.lval( AV27ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboCliCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
   }

   public void zm1S31633( int GX_JID )
   {
      if ( ( GX_JID == 41 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11670DevCruFec = T01S37_A11670DevCruFec[0] ;
            Z11673DevCruSal = T01S37_A11673DevCruSal[0] ;
            Z11671DevCruEst = T01S37_A11671DevCruEst[0] ;
            Z11672DevCruMat = T01S37_A11672DevCruMat[0] ;
            Z11674DevCruHash = T01S37_A11674DevCruHash[0] ;
            Z11675DevCruDesc = T01S37_A11675DevCruDesc[0] ;
            Z11676DevCruDtSy = T01S37_A11676DevCruDtSy[0] ;
            Z11677DevCruGros = T01S37_A11677DevCruGros[0] ;
            Z11678DevCruStt = T01S37_A11678DevCruStt[0] ;
            Z11679DevCruEnvA = T01S37_A11679DevCruEnvA[0] ;
            Z11680DevCruAtId = T01S37_A11680DevCruAtId[0] ;
            Z11681DevCruAT = T01S37_A11681DevCruAT[0] ;
            Z11682DevCruObs = T01S37_A11682DevCruObs[0] ;
            Z13983DevCruATCU = T01S37_A13983DevCruATCU[0] ;
            Z13984DevCruSerA = T01S37_A13984DevCruSerA[0] ;
            Z13985DevCruTipA = T01S37_A13985DevCruTipA[0] ;
            Z252CliCod = T01S37_A252CliCod[0] ;
            Z840TrnCod = T01S37_A840TrnCod[0] ;
         }
         else
         {
            Z11670DevCruFec = A11670DevCruFec ;
            Z11673DevCruSal = A11673DevCruSal ;
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
            Z13983DevCruATCU = A13983DevCruATCU ;
            Z13984DevCruSerA = A13984DevCruSerA ;
            Z13985DevCruTipA = A13985DevCruTipA ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
         }
      }
      if ( GX_JID == -41 )
      {
         Z11669DevCruId = A11669DevCruId ;
         Z11670DevCruFec = A11670DevCruFec ;
         Z11673DevCruSal = A11673DevCruSal ;
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
         Z13983DevCruATCU = A13983DevCruATCU ;
         Z13984DevCruSerA = A13984DevCruSerA ;
         Z13985DevCruTipA = A13985DevCruTipA ;
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
      AV39Pgmname = "AlmacenSinDetalle.AlmacenTejidoDevolucion" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDevCruDtSy_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV18EmprCod)==0) )
      {
         A396EmprCod = AV18EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01S38 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01S38_A407EmprNom[0] ;
      n407EmprNom = T01S38_n407EmprNom[0] ;
      pr_default.close(6);
      if ( ! (0==AV19DevCruId) )
      {
         A11669DevCruId = AV19DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      if ( ! (0==AV19DevCruId) )
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
      if ( ! (0==AV19DevCruId) )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV23Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_TrnCod) )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV23Insert_CliCod) )
      {
         A252CliCod = AV23Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = AV28ComboCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_TrnCod) )
      {
         A840TrnCod = AV24Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         if ( (0==AV34ComboTrnCod) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            n840TrnCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV34ComboTrnCod) )
            {
               A840TrnCod = AV34ComboTrnCod ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
         }
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) && ( Gx_BScreen == 0 ) )
      {
         A11673DevCruSal = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01S39 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01S39_A279CliNom[0] ;
         pr_default.close(7);
         if ( true /* After */ )
         {
            AV16CliCod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
         }
         /* Using cursor T01S310 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01S310_A841TrnNom[0] ;
         n841TrnNom = T01S310_n841TrnNom[0] ;
         pr_default.close(8);
      }
   }

   public void load1S31633( )
   {
      /* Using cursor T01S311 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A407EmprNom = T01S311_A407EmprNom[0] ;
         n407EmprNom = T01S311_n407EmprNom[0] ;
         A11670DevCruFec = T01S311_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11673DevCruSal = T01S311_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A279CliNom = T01S311_A279CliNom[0] ;
         A841TrnNom = T01S311_A841TrnNom[0] ;
         n841TrnNom = T01S311_n841TrnNom[0] ;
         A11671DevCruEst = T01S311_A11671DevCruEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
         A11672DevCruMat = T01S311_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11674DevCruHash = T01S311_A11674DevCruHash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
         A11675DevCruDesc = T01S311_A11675DevCruDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
         A11676DevCruDtSy = T01S311_A11676DevCruDtSy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = T01S311_A11677DevCruGros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
         A11678DevCruStt = T01S311_A11678DevCruStt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
         A11679DevCruEnvA = T01S311_A11679DevCruEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = T01S311_A11680DevCruAtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = T01S311_A11681DevCruAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
         A11682DevCruObs = T01S311_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         A13983DevCruATCU = T01S311_A13983DevCruATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
         A13984DevCruSerA = T01S311_A13984DevCruSerA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", A13984DevCruSerA);
         A13985DevCruTipA = T01S311_A13985DevCruTipA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", A13985DevCruTipA);
         A252CliCod = T01S311_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01S311_A840TrnCod[0] ;
         n840TrnCod = T01S311_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         zm1S31633( -41) ;
      }
      pr_default.close(9);
      onLoadActions1S31633( ) ;
   }

   public void onLoadActions1S31633( )
   {
      if ( true /* After */ )
      {
         AV16CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
      }
   }

   public void checkExtendedTable1S31633( )
   {
      nIsDirty_1633 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( AV10FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
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
      if ( true /* After */ )
      {
         AV16CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
      }
      /* Using cursor T01S39 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01S39_A279CliNom[0] ;
      pr_default.close(7);
      /* Using cursor T01S310 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01S310_A841TrnNom[0] ;
      n841TrnNom = T01S310_n841TrnNom[0] ;
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1S31633( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_43( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01S312 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01S312_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_44( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01S313 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01S313_A841TrnNom[0] ;
      n841TrnNom = T01S313_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey1S31633( )
   {
      /* Using cursor T01S314 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1633 = (short)(1) ;
      }
      else
      {
         RcdFound1633 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01S37 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01S37_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S31633( 41) ;
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01S37_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A11670DevCruFec = T01S37_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11673DevCruSal = T01S37_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11671DevCruEst = T01S37_A11671DevCruEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
         A11672DevCruMat = T01S37_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11674DevCruHash = T01S37_A11674DevCruHash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
         A11675DevCruDesc = T01S37_A11675DevCruDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
         A11676DevCruDtSy = T01S37_A11676DevCruDtSy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = T01S37_A11677DevCruGros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
         A11678DevCruStt = T01S37_A11678DevCruStt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
         A11679DevCruEnvA = T01S37_A11679DevCruEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = T01S37_A11680DevCruAtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = T01S37_A11681DevCruAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
         A11682DevCruObs = T01S37_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         A13983DevCruATCU = T01S37_A13983DevCruATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
         A13984DevCruSerA = T01S37_A13984DevCruSerA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", A13984DevCruSerA);
         A13985DevCruTipA = T01S37_A13985DevCruTipA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", A13985DevCruTipA);
         A252CliCod = T01S37_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01S37_A840TrnCod[0] ;
         n840TrnCod = T01S37_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z11669DevCruId = A11669DevCruId ;
         sMode1633 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1S31633( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1633 = (short)(0) ;
            initializeNonKey1S31633( ) ;
         }
         Gx_mode = sMode1633 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1633 = (short)(0) ;
         initializeNonKey1S31633( ) ;
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
      getKey1S31633( ) ;
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
      /* Using cursor T01S315 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A11669DevCruId), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01S315_A11669DevCruId[0] < A11669DevCruId ) ) && ( GXutil.strcmp(T01S315_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01S315_A11669DevCruId[0] > A11669DevCruId ) ) && ( GXutil.strcmp(T01S315_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11669DevCruId = T01S315_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1633 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound1633 = (short)(0) ;
      /* Using cursor T01S316 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A11669DevCruId), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T01S316_A11669DevCruId[0] > A11669DevCruId ) ) && ( GXutil.strcmp(T01S316_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T01S316_A11669DevCruId[0] < A11669DevCruId ) ) && ( GXutil.strcmp(T01S316_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11669DevCruId = T01S316_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1633 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1S31633( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtavImgalbreccodprompt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1S31633( ) ;
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
               GX_FocusControl = edtavImgalbreccodprompt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1S31633( ) ;
               GX_FocusControl = edtavImgalbreccodprompt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
            {
               /* Insert record */
               GX_FocusControl = edtavImgalbreccodprompt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1S31633( ) ;
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
                  GX_FocusControl = edtavImgalbreccodprompt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1S31633( ) ;
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
         GX_FocusControl = edtavImgalbreccodprompt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1S31633( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01S36 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCRU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z11670DevCruFec), GXutil.resetTime(T01S36_A11670DevCruFec[0])) ) || !( GXutil.dateCompare(Z11673DevCruSal, T01S36_A11673DevCruSal[0]) ) || ( Z11671DevCruEst != T01S36_A11671DevCruEst[0] ) || ( GXutil.strcmp(Z11672DevCruMat, T01S36_A11672DevCruMat[0]) != 0 ) || ( GXutil.strcmp(Z11674DevCruHash, T01S36_A11674DevCruHash[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11675DevCruDesc, T01S36_A11675DevCruDesc[0]) != 0 ) || !( GXutil.dateCompare(Z11676DevCruDtSy, T01S36_A11676DevCruDtSy[0]) ) || ( DecimalUtil.compareTo(Z11677DevCruGros, T01S36_A11677DevCruGros[0]) != 0 ) || ( GXutil.strcmp(Z11678DevCruStt, T01S36_A11678DevCruStt[0]) != 0 ) || ( Z11679DevCruEnvA != T01S36_A11679DevCruEnvA[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11680DevCruAtId, T01S36_A11680DevCruAtId[0]) != 0 ) || ( GXutil.strcmp(Z11681DevCruAT, T01S36_A11681DevCruAT[0]) != 0 ) || ( GXutil.strcmp(Z11682DevCruObs, T01S36_A11682DevCruObs[0]) != 0 ) || ( GXutil.strcmp(Z13983DevCruATCU, T01S36_A13983DevCruATCU[0]) != 0 ) || ( GXutil.strcmp(Z13984DevCruSerA, T01S36_A13984DevCruSerA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13985DevCruTipA, T01S36_A13985DevCruTipA[0]) != 0 ) || ( Z252CliCod != T01S36_A252CliCod[0] ) || ( Z840TrnCod != T01S36_A840TrnCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11670DevCruFec), GXutil.resetTime(T01S36_A11670DevCruFec[0])) ) )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruFec");
               GXutil.writeLogRaw("Old: ",Z11670DevCruFec);
               GXutil.writeLogRaw("Current: ",T01S36_A11670DevCruFec[0]);
            }
            if ( !( GXutil.dateCompare(Z11673DevCruSal, T01S36_A11673DevCruSal[0]) ) )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruSal");
               GXutil.writeLogRaw("Old: ",Z11673DevCruSal);
               GXutil.writeLogRaw("Current: ",T01S36_A11673DevCruSal[0]);
            }
            if ( Z11671DevCruEst != T01S36_A11671DevCruEst[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruEst");
               GXutil.writeLogRaw("Old: ",Z11671DevCruEst);
               GXutil.writeLogRaw("Current: ",T01S36_A11671DevCruEst[0]);
            }
            if ( GXutil.strcmp(Z11672DevCruMat, T01S36_A11672DevCruMat[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruMat");
               GXutil.writeLogRaw("Old: ",Z11672DevCruMat);
               GXutil.writeLogRaw("Current: ",T01S36_A11672DevCruMat[0]);
            }
            if ( GXutil.strcmp(Z11674DevCruHash, T01S36_A11674DevCruHash[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruHash");
               GXutil.writeLogRaw("Old: ",Z11674DevCruHash);
               GXutil.writeLogRaw("Current: ",T01S36_A11674DevCruHash[0]);
            }
            if ( GXutil.strcmp(Z11675DevCruDesc, T01S36_A11675DevCruDesc[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruDesc");
               GXutil.writeLogRaw("Old: ",Z11675DevCruDesc);
               GXutil.writeLogRaw("Current: ",T01S36_A11675DevCruDesc[0]);
            }
            if ( !( GXutil.dateCompare(Z11676DevCruDtSy, T01S36_A11676DevCruDtSy[0]) ) )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruDtSy");
               GXutil.writeLogRaw("Old: ",Z11676DevCruDtSy);
               GXutil.writeLogRaw("Current: ",T01S36_A11676DevCruDtSy[0]);
            }
            if ( DecimalUtil.compareTo(Z11677DevCruGros, T01S36_A11677DevCruGros[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruGros");
               GXutil.writeLogRaw("Old: ",Z11677DevCruGros);
               GXutil.writeLogRaw("Current: ",T01S36_A11677DevCruGros[0]);
            }
            if ( GXutil.strcmp(Z11678DevCruStt, T01S36_A11678DevCruStt[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruStt");
               GXutil.writeLogRaw("Old: ",Z11678DevCruStt);
               GXutil.writeLogRaw("Current: ",T01S36_A11678DevCruStt[0]);
            }
            if ( Z11679DevCruEnvA != T01S36_A11679DevCruEnvA[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruEnvA");
               GXutil.writeLogRaw("Old: ",Z11679DevCruEnvA);
               GXutil.writeLogRaw("Current: ",T01S36_A11679DevCruEnvA[0]);
            }
            if ( GXutil.strcmp(Z11680DevCruAtId, T01S36_A11680DevCruAtId[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruAtId");
               GXutil.writeLogRaw("Old: ",Z11680DevCruAtId);
               GXutil.writeLogRaw("Current: ",T01S36_A11680DevCruAtId[0]);
            }
            if ( GXutil.strcmp(Z11681DevCruAT, T01S36_A11681DevCruAT[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruAT");
               GXutil.writeLogRaw("Old: ",Z11681DevCruAT);
               GXutil.writeLogRaw("Current: ",T01S36_A11681DevCruAT[0]);
            }
            if ( GXutil.strcmp(Z11682DevCruObs, T01S36_A11682DevCruObs[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruObs");
               GXutil.writeLogRaw("Old: ",Z11682DevCruObs);
               GXutil.writeLogRaw("Current: ",T01S36_A11682DevCruObs[0]);
            }
            if ( GXutil.strcmp(Z13983DevCruATCU, T01S36_A13983DevCruATCU[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruATCU");
               GXutil.writeLogRaw("Old: ",Z13983DevCruATCU);
               GXutil.writeLogRaw("Current: ",T01S36_A13983DevCruATCU[0]);
            }
            if ( GXutil.strcmp(Z13984DevCruSerA, T01S36_A13984DevCruSerA[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruSerA");
               GXutil.writeLogRaw("Old: ",Z13984DevCruSerA);
               GXutil.writeLogRaw("Current: ",T01S36_A13984DevCruSerA[0]);
            }
            if ( GXutil.strcmp(Z13985DevCruTipA, T01S36_A13985DevCruTipA[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruTipA");
               GXutil.writeLogRaw("Old: ",Z13985DevCruTipA);
               GXutil.writeLogRaw("Current: ",T01S36_A13985DevCruTipA[0]);
            }
            if ( Z252CliCod != T01S36_A252CliCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01S36_A252CliCod[0]);
            }
            if ( Z840TrnCod != T01S36_A840TrnCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01S36_A840TrnCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCRU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S31633( )
   {
      beforeValidate1S31633( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S31633( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S31633( 0) ;
         checkOptimisticConcurrency1S31633( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S31633( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S31633( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01S317 */
                  pr_default.execute(15, new Object[] {Integer.valueOf(A11669DevCruId), A11670DevCruFec, A11673DevCruSal, Byte.valueOf(A11671DevCruEst), A11672DevCruMat, A11674DevCruHash, A11675DevCruDesc, A11676DevCruDtSy, A11677DevCruGros, A11678DevCruStt, Byte.valueOf(A11679DevCruEnvA), A11680DevCruAtId, A11681DevCruAT, A11682DevCruObs, A13983DevCruATCU, A13984DevCruSerA, A13985DevCruTipA, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevel1S31633( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1S30( ) ;
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
            load1S31633( ) ;
         }
         endLevel1S31633( ) ;
      }
      closeExtendedTableCursors1S31633( ) ;
   }

   public void update1S31633( )
   {
      beforeValidate1S31633( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S31633( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S31633( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S31633( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S31633( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01S318 */
                  pr_default.execute(16, new Object[] {A11670DevCruFec, A11673DevCruSal, Byte.valueOf(A11671DevCruEst), A11672DevCruMat, A11674DevCruHash, A11675DevCruDesc, A11676DevCruDtSy, A11677DevCruGros, A11678DevCruStt, Byte.valueOf(A11679DevCruEnvA), A11680DevCruAtId, A11681DevCruAT, A11682DevCruObs, A13983DevCruATCU, A13984DevCruSerA, A13985DevCruTipA, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), A396EmprCod, Integer.valueOf(A11669DevCruId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCRU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1S31633( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S31633( ) ;
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
         endLevel1S31633( ) ;
      }
      closeExtendedTableCursors1S31633( ) ;
   }

   public void deferredUpdate1S31633( )
   {
   }

   public void delete( )
   {
      beforeValidate1S31633( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S31633( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S31633( ) ;
         afterConfirm1S31633( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S31633( ) ;
            if ( AnyError == 0 )
            {
               scanStart1S31634( ) ;
               while ( RcdFound1634 != 0 )
               {
                  getByPrimaryKey1S31634( ) ;
                  delete1S31634( ) ;
                  scanNext1S31634( ) ;
               }
               scanEnd1S31634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01S319 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
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
      endLevel1S31633( ) ;
      Gx_mode = sMode1633 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1S31633( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( AV10FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "DEVCRUATID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevCruAtId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* After */ )
         {
            AV16CliCod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
         }
         /* Using cursor T01S320 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01S320_A279CliNom[0] ;
         pr_default.close(18);
         /* Using cursor T01S321 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01S321_A841TrnNom[0] ;
         n841TrnNom = T01S321_n841TrnNom[0] ;
         pr_default.close(19);
      }
   }

   public void processNestedLevel1S31634( )
   {
      nGXsfl_72_idx = 0 ;
      while ( nGXsfl_72_idx < nRC_GXsfl_72 )
      {
         readRow1S31634( ) ;
         if ( ( nRcdExists_1634 != 0 ) || ( nIsMod_1634 != 0 ) )
         {
            standaloneNotModal1S31634( ) ;
            getKey1S31634( ) ;
            if ( ( nRcdExists_1634 == 0 ) && ( nRcdDeleted_1634 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1S31634( ) ;
            }
            else
            {
               if ( RcdFound1634 != 0 )
               {
                  if ( ( nRcdDeleted_1634 != 0 ) && ( nRcdExists_1634 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1S31634( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1634 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1S31634( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1634 == 0 )
                  {
                     GXCCtl = "ALBRECCOD_" + sGXsfl_72_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavImgalbreccodprompt_Internalname, AV32imgAlbRecCodPrompt) ;
         httpContext.changePostValue( edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc)) ;
         httpContext.changePostValue( edtDevCruUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni)) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevCruPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_72_idx, GXutil.rtrim( Z45AlbRef)) ;
         httpContext.changePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_72_idx, GXutil.rtrim( Z3613AlbRefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z56AlbRUni_"+sGXsfl_72_idx, GXutil.rtrim( Z56AlbRUni)) ;
         httpContext.changePostValue( "T11684DevCruPzs_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T54AlbRPieUti_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11683DevCruUnd_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T60AlbRUniUti_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1634_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1634_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1634_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1634 != 0 )
         {
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavImgalbreccodprompt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Link", GXutil.rtrim( edtavImgalbreccodprompt_Link)) ;
            httpContext.changePostValue( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavImgalbreccodprompt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREF_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREFDSC_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUUND_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNI_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUPZS_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1S31634( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1634 = (short)(0) ;
      nIsMod_1634 = (short)(0) ;
      nRcdDeleted_1634 = (short)(0) ;
   }

   public void processLevel1S31633( )
   {
      /* Save parent mode. */
      sMode1633 = Gx_mode ;
      processNestedLevel1S31634( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1633 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1S31633( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1S31633( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.almacentejidodevolucion");
         if ( AnyError == 0 )
         {
            confirmValues1S30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "almacensindetalle.almacentejidodevolucion");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1S31633( )
   {
      /* Scan By routine */
      /* Using cursor T01S322 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      RcdFound1633 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01S322_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1S31633( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1633 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01S322_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
   }

   public void scanEnd1S31633( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1S31633( )
   {
      /* After Confirm Rules */
      if ( (0==A11669DevCruId) && true /* After */ )
      {
         GXv_int8[0] = A11669DevCruId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int8) ;
         almacentejidodevolucion_impl.this.A11669DevCruId = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
   }

   public void beforeInsert1S31633( )
   {
      /* Before Insert Rules */
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         n840TrnCod = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
   }

   public void beforeUpdate1S31633( )
   {
      /* Before Update Rules */
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         n840TrnCod = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
   }

   public void beforeDelete1S31633( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S31633( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S31633( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S31633( )
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      edtavCombotrncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
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
      edtDevCruATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruATCU_Enabled), 5, 0), true);
      edtDevCruSerA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSerA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruSerA_Enabled), 5, 0), true);
      edtDevCruTipA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruTipA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruTipA_Enabled), 5, 0), true);
   }

   public void zm1S31634( int GX_JID )
   {
      if ( ( GX_JID == 45 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11683DevCruUnd = T01S33_A11683DevCruUnd[0] ;
            Z11684DevCruPzs = T01S33_A11684DevCruPzs[0] ;
         }
         else
         {
            Z11683DevCruUnd = A11683DevCruUnd ;
            Z11684DevCruPzs = A11684DevCruPzs ;
         }
      }
      if ( ( GX_JID == 46 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = T01S35_A47AlbREst[0] ;
         Z45AlbRef = T01S35_A45AlbRef[0] ;
         Z3613AlbRefDsc = T01S35_A3613AlbRefDsc[0] ;
         Z58AlbRUniEnt = T01S35_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01S35_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01S35_A56AlbRUni[0] ;
      }
      if ( GX_JID == -45 )
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

   public void standaloneNotModal1S31634( )
   {
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
   }

   public void standaloneModal1S31634( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      }
   }

   public void load1S31634( )
   {
      /* Using cursor T01S323 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A60AlbRUniUti = T01S323_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01S323_A54AlbRPieUti[0] ;
         A47AlbREst = T01S323_A47AlbREst[0] ;
         A45AlbRef = T01S323_A45AlbRef[0] ;
         A3613AlbRefDsc = T01S323_A3613AlbRefDsc[0] ;
         A11683DevCruUnd = T01S323_A11683DevCruUnd[0] ;
         A11684DevCruPzs = T01S323_A11684DevCruPzs[0] ;
         A58AlbRUniEnt = T01S323_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01S323_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01S323_A56AlbRUni[0] ;
         zm1S31634( -45) ;
      }
      pr_default.close(21);
      onLoadActions1S31634( ) ;
   }

   public void onLoadActions1S31634( )
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

   public void checkExtendedTable1S31634( )
   {
      nIsDirty_1634 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1S31634( ) ;
      /* Using cursor T01S35 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_72_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01S35_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01S35_A54AlbRPieUti[0] ;
      A47AlbREst = T01S35_A47AlbREst[0] ;
      A45AlbRef = T01S35_A45AlbRef[0] ;
      A3613AlbRefDsc = T01S35_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01S35_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01S35_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01S35_A56AlbRUni[0] ;
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
      if ( A57AlbRUniDis.doubleValue() < 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 1, "");
         AnyError = (short)(1) ;
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
         GXv_int17[0] = A252CliCod ;
         GXv_int12[0] = (byte)(AV17FlagCli) ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int17, GXv_int12) ;
         almacentejidodevolucion_impl.this.A396EmprCod = GXv_char4[0] ;
         almacentejidodevolucion_impl.this.A44AlbRecCod = GXv_int8[0] ;
         almacentejidodevolucion_impl.this.A252CliCod = GXv_int17[0] ;
         almacentejidodevolucion_impl.this.AV17FlagCli = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17FlagCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FlagCli), 4, 0));
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A11683DevCruUnd)==0) )
      {
         GXCCtl = "DEVCRUUND_" + sGXsfl_72_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Unidades a devolver ¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1S31634( )
   {
      pr_default.close(2);
   }

   public void enableDisable1S31634( )
   {
   }

   public void gxload_46( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01S35 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_72_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01S35_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01S35_A54AlbRPieUti[0] ;
      A47AlbREst = T01S35_A47AlbREst[0] ;
      A45AlbRef = T01S35_A45AlbRef[0] ;
      A3613AlbRefDsc = T01S35_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01S35_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01S35_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01S35_A56AlbRUni[0] ;
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

   public void getKey1S31634( )
   {
      /* Using cursor T01S324 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1634 = (short)(1) ;
      }
      else
      {
         RcdFound1634 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1S31634( )
   {
      /* Using cursor T01S33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01S33_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1S31634( 45) ;
         RcdFound1634 = (short)(1) ;
         initializeNonKey1S31634( ) ;
         A11683DevCruUnd = T01S33_A11683DevCruUnd[0] ;
         A11684DevCruPzs = T01S33_A11684DevCruPzs[0] ;
         A44AlbRecCod = T01S33_A44AlbRecCod[0] ;
         O11684DevCruPzs = A11684DevCruPzs ;
         O11683DevCruUnd = A11683DevCruUnd ;
         Z396EmprCod = A396EmprCod ;
         Z11669DevCruId = A11669DevCruId ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1S31634( ) ;
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1634 = (short)(0) ;
         initializeNonKey1S31634( ) ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1S31634( ) ;
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S31634( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1S31634( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01S32 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11683DevCruUnd, T01S32_A11683DevCruUnd[0]) != 0 ) || ( Z11684DevCruPzs != T01S32_A11684DevCruPzs[0] ) )
         {
            if ( DecimalUtil.compareTo(Z11683DevCruUnd, T01S32_A11683DevCruUnd[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruUnd");
               GXutil.writeLogRaw("Old: ",Z11683DevCruUnd);
               GXutil.writeLogRaw("Current: ",T01S32_A11683DevCruUnd[0]);
            }
            if ( Z11684DevCruPzs != T01S32_A11684DevCruPzs[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"DevCruPzs");
               GXutil.writeLogRaw("Old: ",Z11684DevCruPzs);
               GXutil.writeLogRaw("Current: ",T01S32_A11684DevCruPzs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCR1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01S325 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(23) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != T01S325_A47AlbREst[0] ) || ( GXutil.strcmp(Z45AlbRef, T01S325_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z3613AlbRefDsc, T01S325_A3613AlbRefDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01S325_A58AlbRUniEnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01S325_A52AlbRPieEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z56AlbRUni, T01S325_A56AlbRUni[0]) != 0 ) )
         {
            if ( Z47AlbREst != T01S325_A47AlbREst[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01S325_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01S325_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01S325_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T01S325_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01S325_A3613AlbRefDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01S325_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01S325_A58AlbRUniEnt[0]);
            }
            if ( Z52AlbRPieEnt != T01S325_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01S325_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01S325_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.almacentejidodevolucion:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01S325_A56AlbRUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S31634( )
   {
      beforeValidate1S31634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S31634( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S31634( 0) ;
         checkOptimisticConcurrency1S31634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S31634( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S31634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01S326 */
                  pr_default.execute(24, new Object[] {Integer.valueOf(A11669DevCruId), A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                  if ( (pr_default.getStatus(24) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11S31634( ) ;
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
            load1S31634( ) ;
         }
         endLevel1S31634( ) ;
      }
      closeExtendedTableCursors1S31634( ) ;
   }

   public void update1S31634( )
   {
      beforeValidate1S31634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S31634( ) ;
      }
      if ( ( nIsMod_1634 != 0 ) || ( nIsDirty_1634 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1S31634( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1S31634( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1S31634( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01S327 */
                     pr_default.execute(25, new Object[] {A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1S31634( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN11S31634( ) ;
                           getByPrimaryKey1S31634( ) ;
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
            endLevel1S31634( ) ;
         }
      }
      closeExtendedTableCursors1S31634( ) ;
   }

   public void deferredUpdate1S31634( )
   {
   }

   public void delete1S31634( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1S31634( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S31634( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S31634( ) ;
         afterConfirm1S31634( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S31634( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01S328 */
               pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
               if ( AnyError == 0 )
               {
                  updateTablesN11S31634( ) ;
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
      endLevel1S31634( ) ;
      Gx_mode = sMode1634 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1S31634( )
   {
      standaloneModal1S31634( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01S329 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Z47AlbREst = T01S329_A47AlbREst[0] ;
         Z45AlbRef = T01S329_A45AlbRef[0] ;
         Z3613AlbRefDsc = T01S329_A3613AlbRefDsc[0] ;
         Z58AlbRUniEnt = T01S329_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01S329_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01S329_A56AlbRUni[0] ;
         A60AlbRUniUti = T01S329_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01S329_A54AlbRPieUti[0] ;
         A47AlbREst = T01S329_A47AlbREst[0] ;
         A45AlbRef = T01S329_A45AlbRef[0] ;
         A3613AlbRefDsc = T01S329_A3613AlbRefDsc[0] ;
         A58AlbRUniEnt = T01S329_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01S329_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01S329_A56AlbRUni[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         O60AlbRUniUti = A60AlbRUniUti ;
         pr_default.close(27);
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

   public void updateTablesN11S31634( )
   {
      /* Using cursor T01S330 */
      pr_default.execute(28, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1S31634( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(23);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1S31634( )
   {
      /* Scan By routine */
      /* Using cursor T01S331 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A44AlbRecCod = T01S331_A44AlbRecCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1S31634( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A44AlbRecCod = T01S331_A44AlbRecCod[0] ;
      }
   }

   public void scanEnd1S31634( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1S31634( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S31634( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S31634( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S31634( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S31634( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S31634( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S31634( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtDevCruUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruUnd_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtDevCruPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruPzs_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
   }

   public void send_integrity_lvl_hashes1S31634( )
   {
   }

   public void send_integrity_lvl_hashes1S31633( )
   {
   }

   public void subsflControlProps_721634( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_72_idx ;
      edtavImgalbreccodprompt_Internalname = "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_72_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_72_idx ;
      edtDevCruUnd_Internalname = "DEVCRUUND_"+sGXsfl_72_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_72_idx );
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_72_idx ;
      edtDevCruPzs_Internalname = "DEVCRUPZS_"+sGXsfl_72_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_72_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_72_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_72_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_72_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_72_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_72_idx );
   }

   public void subsflControlProps_fel_721634( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_72_fel_idx ;
      edtavImgalbreccodprompt_Internalname = "vIMGALBRECCODPROMPT_"+sGXsfl_72_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_72_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_72_fel_idx ;
      edtDevCruUnd_Internalname = "DEVCRUUND_"+sGXsfl_72_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_72_fel_idx );
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_72_fel_idx ;
      edtDevCruPzs_Internalname = "DEVCRUPZS_"+sGXsfl_72_fel_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_72_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_72_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_72_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_72_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_72_fel_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_72_fel_idx );
   }

   public void addRow1S31634( )
   {
      nGXsfl_72_idx = (int)(nGXsfl_72_idx+1) ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_721634( ) ;
      sendRow1S31634( ) ;
   }

   public void sendRow1S31634( )
   {
      Gridlevel_almacentejidoRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_almacentejido_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_almacentejido_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
         {
            subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_almacentejido_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_almacentejido_Backstyle = (byte)(0) ;
         subGridlevel_almacentejido_Backcolor = subGridlevel_almacentejido_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
         {
            subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_almacentejido_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_almacentejido_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
         {
            subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Odd" ;
         }
         subGridlevel_almacentejido_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_almacentejido_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_almacentejido_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_72_idx) % (2))) == 0 )
         {
            subGridlevel_almacentejido_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
            {
               subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_almacentejido_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
            {
               subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Odd" ;
            }
         }
      }
      edtavImgalbreccodprompt_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.consultaalmacentejido"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"ALBRECCOD_"+sGXsfl_72_idx+"'), id:'"+"ALBRECCOD_"+sGXsfl_72_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"CLICOD"+"'), id:'"+"CLICOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"DEVCRUUND_"+sGXsfl_72_idx+"'), id:'"+"DEVCRUUND_"+sGXsfl_72_idx+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"DEVCRUPZS_"+sGXsfl_72_idx+"'), id:'"+"DEVCRUPZS_"+sGXsfl_72_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_1634_"+sGXsfl_72_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1634_" + sGXsfl_72_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_72_idx + "',72)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static Bitmap Variable */
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(edtavImgalbreccodprompt_gximage, "")==0) ? "" : "GX_Image_"+edtavImgalbreccodprompt_gximage+"_Class") ;
      StyleString = "" ;
      AV32imgAlbRecCodPrompt_IsBlob = (boolean)(((GXutil.strcmp("", AV32imgAlbRecCodPrompt)==0)&&(GXutil.strcmp("", AV41Imgalbreccodprompt_GXI)==0))||!(GXutil.strcmp("", AV32imgAlbRecCodPrompt)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV32imgAlbRecCodPrompt)==0) ? AV41Imgalbreccodprompt_GXI : httpContext.getResourceRelative(AV32imgAlbRecCodPrompt)) ;
      Gridlevel_almacentejidoRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavImgalbreccodprompt_Internalname,sImgUrl,edtavImgalbreccodprompt_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavImgalbreccodprompt_Visible),Integer.valueOf(edtavImgalbreccodprompt_Enabled),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"TrnColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV32imgAlbRecCodPrompt_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRefDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1634_" + sGXsfl_72_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_72_idx + "',72)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevCruUnd_Enabled!=0) ? localUtil.format( A11683DevCruUnd, "ZZZZZ9.99") : localUtil.format( A11683DevCruUnd, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDevCruUnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "ALBRUNI_" + sGXsfl_72_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      /* ComboBox */
      Gridlevel_almacentejidoRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbAlbRUni.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_72_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniDis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1634_" + sGXsfl_72_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_72_idx + "',72)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruPzs_Internalname,GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevCruPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDevCruPzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieDis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRUniUti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRUniEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRPieUti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRPieEnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "ALBREST_" + sGXsfl_72_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
      }
      /* ComboBox */
      Gridlevel_almacentejidoRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(cmbAlbREst.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_72_Refreshing);
      httpContext.ajax_sending_grid_row(Gridlevel_almacentejidoRow);
      send_integrity_lvl_hashes1S31634( ) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11683DevCruUnd_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11684DevCruPzs_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z47AlbREst_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z45AlbRef_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z45AlbRef));
      GXCCtl = "Z3613AlbRefDsc_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3613AlbRefDsc));
      GXCCtl = "Z58AlbRUniEnt_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z52AlbRPieEnt_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z56AlbRUni_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z56AlbRUni));
      GXCCtl = "O11684DevCruPzs_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O54AlbRPieUti_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O11683DevCruUnd_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O60AlbRUniUti_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1634_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1634_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1634_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_72_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV21TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV21TrnContext);
      }
      GXCCtl = "EMPRCOD_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vEMPRCOD_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV18EmprCod));
      GXCCtl = "vDEVCRUID_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV19DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavImgalbreccodprompt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Link", GXutil.rtrim( edtavImgalbreccodprompt_Link));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavImgalbreccodprompt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREF_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREFDSC_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUUND_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNI_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIDIS_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUPZS_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEDIS_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_almacentejidoContainer.AddRow(Gridlevel_almacentejidoRow);
   }

   public void readRow1S31634( )
   {
      nGXsfl_72_idx = (int)(nGXsfl_72_idx+1) ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_721634( ) ;
      edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavImgalbreccodprompt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavImgalbreccodprompt_Link = httpContext.cgiGet( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Link") ;
      edtavImgalbreccodprompt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vIMGALBRECCODPROMPT_"+sGXsfl_72_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREF_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREFDSC_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevCruUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUUND_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbRUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNI_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevCruPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUPZS_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_72_idx ;
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
      AV32imgAlbRecCodPrompt = httpContext.cgiGet( edtavImgalbreccodprompt_Internalname) ;
      A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
      A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DEVCRUUND_" + sGXsfl_72_idx ;
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
      cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
      cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
      A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
      A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "DEVCRUPZS_" + sGXsfl_72_idx ;
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
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_72_idx ;
      Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11683DevCruUnd_" + sGXsfl_72_idx ;
      Z11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11684DevCruPzs_" + sGXsfl_72_idx ;
      Z11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z47AlbREst_" + sGXsfl_72_idx ;
      Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z45AlbRef_" + sGXsfl_72_idx ;
      Z45AlbRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3613AlbRefDsc_" + sGXsfl_72_idx ;
      Z3613AlbRefDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z58AlbRUniEnt_" + sGXsfl_72_idx ;
      Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z52AlbRPieEnt_" + sGXsfl_72_idx ;
      Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z56AlbRUni_" + sGXsfl_72_idx ;
      Z56AlbRUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O11684DevCruPzs_" + sGXsfl_72_idx ;
      O11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O54AlbRPieUti_" + sGXsfl_72_idx ;
      O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O11683DevCruUnd_" + sGXsfl_72_idx ;
      O11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O60AlbRUniUti_" + sGXsfl_72_idx ;
      O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1634_" + sGXsfl_72_idx ;
      nRcdDeleted_1634 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1634_" + sGXsfl_72_idx ;
      nRcdExists_1634 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1634_" + sGXsfl_72_idx ;
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

   public void confirmValues1S30( )
   {
      nGXsfl_72_idx = 0 ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_721634( ) ;
      while ( nGXsfl_72_idx < nRC_GXsfl_72 )
      {
         nGXsfl_72_idx = (int)(nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_721634( ) ;
         httpContext.changePostValue( "Z44AlbRecCod_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z44AlbRecCod_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z11683DevCruUnd_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z11684DevCruPzs_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z47AlbREst_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z47AlbREst_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z45AlbRef_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z45AlbRef_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z3613AlbRefDsc_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z58AlbRUniEnt_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z52AlbRPieEnt_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z56AlbRUni_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z56AlbRUni_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z56AlbRUni_"+sGXsfl_72_idx) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.almacentejidodevolucion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19DevCruId,8,0))}, new String[] {"Gx_mode","EmprCod","DevCruId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejidoDevolucion");
      forbiddenHiddens.add("DevCruDtSy", localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV39Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\almacentejidodevolucion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11669DevCruId", GXutil.ltrim( localUtil.ntoc( Z11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11670DevCruFec", localUtil.dtoc( Z11670DevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11673DevCruSal", localUtil.ttoc( Z11673DevCruSal, 10, 8, 0, 0, "/", ":", " "));
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13983DevCruATCU", GXutil.rtrim( Z13983DevCruATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13984DevCruSerA", GXutil.rtrim( Z13984DevCruSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13985DevCruTipA", GXutil.rtrim( Z13985DevCruTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_72", GXutil.ltrim( localUtil.ntoc( nGXsfl_72_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV26CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV26CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCOD_DATA", AV33TrnCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCOD_DATA", AV33TrnCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV21TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV21TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV21TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV19DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV23Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV24Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV16CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV10FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCLI", GXutil.ltrim( localUtil.ntoc( AV17FlagCli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Objectcall", GXutil.rtrim( Combo_clicod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitem", GXutil.booltostr( Combo_clicod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Objectcall", GXutil.rtrim( Combo_trncod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Cls", GXutil.rtrim( Combo_trncod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Selectedvalue_set", GXutil.rtrim( Combo_trncod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Emptyitem", GXutil.booltostr( Combo_trncod_Emptyitem));
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
      return formatLink("app.almacensindetalle.almacentejidodevolucion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19DevCruId,8,0))}, new String[] {"Gx_mode","EmprCod","DevCruId"})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.AlmacenTejidoDevolucion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen Tejido Devolucion", "") ;
   }

   public void initializeNonKey1S31633( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      AV16CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
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
      A13983DevCruATCU = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
      A13984DevCruSerA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", A13984DevCruSerA);
      A13985DevCruTipA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", A13985DevCruTipA);
      A11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11673DevCruSal = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
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
      Z13983DevCruATCU = "" ;
      Z13984DevCruSerA = "" ;
      Z13985DevCruTipA = "" ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
   }

   public void initAll1S31633( )
   {
      A11669DevCruId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      initializeNonKey1S31633( ) ;
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
      A11673DevCruSal = i11673DevCruSal ;
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void initializeNonKey1S31634( )
   {
      AV17FlagCli = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17FlagCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FlagCli), 4, 0));
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

   public void initAll1S31634( )
   {
      A44AlbRecCod = 0 ;
      initializeNonKey1S31634( ) ;
   }

   public void standaloneModalInsert1S31634( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693051", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/almacentejidodevolucion.js", "?20268211693051", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1634( )
   {
      cmbAlbREst.setEnabled( defcmbAlbREst_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRPieEnt_Enabled = defedtAlbRPieEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRPieUti_Enabled = defedtAlbRPieUti_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRUniEnt_Enabled = defedtAlbRUniEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRUniUti_Enabled = defedtAlbRUniUti_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtAlbRecCod_Enabled = defedtAlbRecCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
   }

   public void startgridcontrol72( )
   {
      Gridlevel_almacentejidoContainer.AddObjectProperty("GridName", "Gridlevel_almacentejido");
      Gridlevel_almacentejidoContainer.AddObjectProperty("Header", subGridlevel_almacentejido_Header);
      Gridlevel_almacentejidoContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_almacentejidoContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_almacentejidoContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", httpContext.convertURL( AV32imgAlbRecCodPrompt));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImgalbreccodprompt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Link", GXutil.rtrim( edtavImgalbreccodprompt_Link));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImgalbreccodprompt_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtDevCruId_Internalname = "DEVCRUID" ;
      edtDevCruFec_Internalname = "DEVCRUFEC" ;
      edtDevCruSal_Internalname = "DEVCRUSAL" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      Combo_trncod_Internalname = "COMBO_TRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divTablesplittedtrncod_Internalname = "TABLESPLITTEDTRNCOD" ;
      edtDevCruMat_Internalname = "DEVCRUMAT" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtDevCruObs_Internalname = "DEVCRUOBS" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtavImgalbreccodprompt_Internalname = "vIMGALBRECCODPROMPT" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtDevCruUnd_Internalname = "DEVCRUUND" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtDevCruPzs_Internalname = "DEVCRUPZS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      divTableleaflevel_almacentejido_Internalname = "TABLELEAFLEVEL_ALMACENTEJIDO" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboclicod_Internalname = "vCOMBOCLICOD" ;
      divSectionattribute_clicod_Internalname = "SECTIONATTRIBUTE_CLICOD" ;
      edtavCombotrncod_Internalname = "vCOMBOTRNCOD" ;
      divSectionattribute_trncod_Internalname = "SECTIONATTRIBUTE_TRNCOD" ;
      edtDevCruEst_Internalname = "DEVCRUEST" ;
      edtDevCruHash_Internalname = "DEVCRUHASH" ;
      edtDevCruDesc_Internalname = "DEVCRUDESC" ;
      edtDevCruDtSy_Internalname = "DEVCRUDTSY" ;
      edtDevCruGros_Internalname = "DEVCRUGROS" ;
      edtDevCruStt_Internalname = "DEVCRUSTT" ;
      edtDevCruEnvA_Internalname = "DEVCRUENVA" ;
      edtDevCruAtId_Internalname = "DEVCRUATID" ;
      edtDevCruAT_Internalname = "DEVCRUAT" ;
      edtDevCruATCU_Internalname = "DEVCRUATCU" ;
      edtDevCruSerA_Internalname = "DEVCRUSERA" ;
      edtDevCruTipA_Internalname = "DEVCRUTIPA" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_almacentejido_Internalname = "GRIDLEVEL_ALMACENTEJIDO" ;
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
      subGridlevel_almacentejido_Allowcollapsing = (byte)(0) ;
      subGridlevel_almacentejido_Allowselection = (byte)(0) ;
      subGridlevel_almacentejido_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Almacen Tejido Devolucion", "") );
      cmbAlbREst.setJsonclick( "" );
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtDevCruPzs_Jsonclick = "" ;
      edtAlbRUniDis_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtDevCruUnd_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      subGridlevel_almacentejido_Class = "GridNoBorder WorkWith" ;
      subGridlevel_almacentejido_Backcolorstyle = (byte)(0) ;
      edtavImgalbreccodprompt_gximage = "" ;
      cmbAlbREst.setEnabled( 0 );
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRPieDis_Enabled = 0 ;
      edtDevCruPzs_Enabled = 1 ;
      edtAlbRUniDis_Enabled = 0 ;
      cmbAlbRUni.setEnabled( 0 );
      edtDevCruUnd_Enabled = 1 ;
      edtAlbRefDsc_Enabled = 0 ;
      edtAlbRef_Enabled = 0 ;
      edtavImgalbreccodprompt_Visible = -1 ;
      edtavImgalbreccodprompt_Link = "" ;
      edtavImgalbreccodprompt_Enabled = 1 ;
      edtAlbRecCod_Enabled = 1 ;
      edtDevCruTipA_Jsonclick = "" ;
      edtDevCruTipA_Enabled = 1 ;
      edtDevCruTipA_Visible = 1 ;
      edtDevCruSerA_Jsonclick = "" ;
      edtDevCruSerA_Enabled = 1 ;
      edtDevCruSerA_Visible = 1 ;
      edtDevCruATCU_Jsonclick = "" ;
      edtDevCruATCU_Enabled = 1 ;
      edtDevCruATCU_Visible = 1 ;
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
      edtavCombotrncod_Jsonclick = "" ;
      edtavCombotrncod_Enabled = 0 ;
      edtavCombotrncod_Visible = 1 ;
      edtavComboclicod_Jsonclick = "" ;
      edtavComboclicod_Enabled = 0 ;
      edtavComboclicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
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
      edtTrnCod_Visible = 1 ;
      Combo_trncod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_trncod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trncod_Enabled = GXutil.toBoolean( -1) ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      Combo_clicod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Enabled = GXutil.toBoolean( -1) ;
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

   public void xc_25_1S31633( String A396EmprCod ,
                              int A11669DevCruId )
   {
      if ( (0==A11669DevCruId) && true /* After */ )
      {
         GXv_int17[0] = A11669DevCruId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int17) ;
         A11669DevCruId = GXv_int17[0] ;
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

   public void xc_38_1S31634( String A396EmprCod ,
                              int A44AlbRecCod ,
                              int A252CliCod )
   {
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int17[0] = A44AlbRecCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int12[0] = (byte)(AV17FlagCli) ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int17, GXv_int8, GXv_int12) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int17[0] ;
         A252CliCod = GXv_int8[0] ;
         AV17FlagCli = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17FlagCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FlagCli), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV17FlagCli, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_almacentejido_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_721634( ) ;
      while ( nGXsfl_72_idx <= nRC_GXsfl_72 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1S31634( ) ;
         standaloneModal1S31634( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1S31634( ) ;
         nGXsfl_72_idx = (int)(nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_721634( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_almacentejidoContainer)) ;
      /* End function gxnrGridlevel_almacentejido_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "ALBRUNI_" + sGXsfl_72_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      GXCCtl = "ALBREST_" + sGXsfl_72_idx ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01S320 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01S320_A279CliNom[0] ;
      pr_default.close(18);
      if ( true /* After */ )
      {
         AV16CliCod = A252CliCod ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrim( localUtil.ntoc( AV16CliCod, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01S321 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01S321_A841TrnNom[0] ;
      n841TrnNom = T01S321_n841TrnNom[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Devcruatid( )
   {
      if ( ( AV10FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
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
      /* Using cursor T01S329 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Z47AlbREst = T01S329_A47AlbREst[0] ;
      Z45AlbRef = T01S329_A45AlbRef[0] ;
      Z3613AlbRefDsc = T01S329_A3613AlbRefDsc[0] ;
      Z58AlbRUniEnt = T01S329_A58AlbRUniEnt[0] ;
      Z52AlbRPieEnt = T01S329_A52AlbRPieEnt[0] ;
      Z56AlbRUni = T01S329_A56AlbRUni[0] ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A60AlbRUniUti = T01S329_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01S329_A54AlbRPieUti[0] ;
      A47AlbREst = T01S329_A47AlbREst[0] ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      A45AlbRef = T01S329_A45AlbRef[0] ;
      A3613AlbRefDsc = T01S329_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01S329_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01S329_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01S329_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(27);
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int17[0] = A44AlbRecCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int12[0] = (byte)(AV17FlagCli) ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int17, GXv_int8, GXv_int12) ;
         almacentejidodevolucion_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         almacentejidodevolucion_impl.this.A44AlbRecCod = GXv_int17[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         almacentejidodevolucion_impl.this.A252CliCod = GXv_int8[0] ;
         A252CliCod = this.A252CliCod ;
         almacentejidodevolucion_impl.this.AV17FlagCli = GXv_int12[0] ;
         AV17FlagCli = this.AV17FlagCli ;
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
      httpContext.ajax_rsp_assign_attri("", false, "AV17FlagCli", GXutil.ltrim( localUtil.ntoc( AV17FlagCli, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV21TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'AV39Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121S32',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV21TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_DEVCRUID","{handler:'valid_Devcruid',iparms:[]");
      setEventMetadata("VALID_DEVCRUID",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALIDV_COMBOCLICOD","{handler:'validv_Comboclicod',iparms:[]");
      setEventMetadata("VALIDV_COMBOCLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRNCOD","{handler:'validv_Combotrncod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRNCOD",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUATID","{handler:'valid_Devcruatid',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10FirmaD',fld:'vFIRMAD',pic:'ZZZ9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''}]");
      setEventMetadata("VALID_DEVCRUATID",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'AV17FlagCli',fld:'vFLAGCLI',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV17FlagCli',fld:'vFLAGCLI',pic:'ZZZ9'}]}");
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
      pr_default.close(27);
      pr_default.close(18);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV18EmprCod = "" ;
      Z396EmprCod = "" ;
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Z11672DevCruMat = "" ;
      Z11674DevCruHash = "" ;
      Z11675DevCruDesc = "" ;
      Z11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      Z11677DevCruGros = DecimalUtil.ZERO ;
      Z11678DevCruStt = "" ;
      Z11680DevCruAtId = "" ;
      Z11681DevCruAT = "" ;
      Z11682DevCruObs = "" ;
      Z13983DevCruATCU = "" ;
      Z13984DevCruSerA = "" ;
      Z13985DevCruTipA = "" ;
      Combo_trncod_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
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
      Gx_mode = "" ;
      AV18EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      AV32imgAlbRecCodPrompt = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockclicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_Caption = "" ;
      AV26CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocktrncod_Jsonclick = "" ;
      ucCombo_trncod = new com.genexus.webpanels.GXUserControl();
      Combo_trncod_Caption = "" ;
      AV33TrnCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV39Pgmname = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11677DevCruGros = DecimalUtil.ZERO ;
      A11678DevCruStt = "" ;
      A11680DevCruAtId = "" ;
      A11681DevCruAT = "" ;
      A13983DevCruATCU = "" ;
      A13984DevCruSerA = "" ;
      A13985DevCruTipA = "" ;
      Gridlevel_almacentejidoContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1634 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      Combo_clicod_Objectcall = "" ;
      Combo_clicod_Class = "" ;
      Combo_clicod_Icontype = "" ;
      Combo_clicod_Icon = "" ;
      Combo_clicod_Tooltip = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_clicod_Selectedtext_set = "" ;
      Combo_clicod_Selectedtext_get = "" ;
      Combo_clicod_Gamoauthtoken = "" ;
      Combo_clicod_Ddointernalname = "" ;
      Combo_clicod_Titlecontrolalign = "" ;
      Combo_clicod_Dropdownoptionstype = "" ;
      Combo_clicod_Titlecontrolidtoreplace = "" ;
      Combo_clicod_Datalisttype = "" ;
      Combo_clicod_Datalistfixedvalues = "" ;
      Combo_clicod_Datalistproc = "" ;
      Combo_clicod_Datalistprocparametersprefix = "" ;
      Combo_clicod_Remoteservicesparameters = "" ;
      Combo_clicod_Htmltemplate = "" ;
      Combo_clicod_Multiplevaluestype = "" ;
      Combo_clicod_Loadingdata = "" ;
      Combo_clicod_Noresultsfound = "" ;
      Combo_clicod_Emptyitemtext = "" ;
      Combo_clicod_Onlyselectedvalues = "" ;
      Combo_clicod_Selectalltext = "" ;
      Combo_clicod_Multiplevaluesseparator = "" ;
      Combo_clicod_Addnewoptiontext = "" ;
      Combo_trncod_Objectcall = "" ;
      Combo_trncod_Class = "" ;
      Combo_trncod_Icontype = "" ;
      Combo_trncod_Icon = "" ;
      Combo_trncod_Tooltip = "" ;
      Combo_trncod_Selectedvalue_set = "" ;
      Combo_trncod_Selectedtext_set = "" ;
      Combo_trncod_Selectedtext_get = "" ;
      Combo_trncod_Gamoauthtoken = "" ;
      Combo_trncod_Ddointernalname = "" ;
      Combo_trncod_Titlecontrolalign = "" ;
      Combo_trncod_Dropdownoptionstype = "" ;
      Combo_trncod_Titlecontrolidtoreplace = "" ;
      Combo_trncod_Datalisttype = "" ;
      Combo_trncod_Datalistfixedvalues = "" ;
      Combo_trncod_Datalistproc = "" ;
      Combo_trncod_Datalistprocparametersprefix = "" ;
      Combo_trncod_Remoteservicesparameters = "" ;
      Combo_trncod_Htmltemplate = "" ;
      Combo_trncod_Multiplevaluestype = "" ;
      Combo_trncod_Loadingdata = "" ;
      Combo_trncod_Noresultsfound = "" ;
      Combo_trncod_Emptyitemtext = "" ;
      Combo_trncod_Onlyselectedvalues = "" ;
      Combo_trncod_Selectalltext = "" ;
      Combo_trncod_Multiplevaluesseparator = "" ;
      Combo_trncod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
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
      A56AlbRUni = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      T11683DevCruUnd = DecimalUtil.ZERO ;
      T60AlbRUniUti = DecimalUtil.ZERO ;
      AV7Station = "" ;
      AV8EmprNom = "" ;
      AV9UsurCod = "" ;
      AV35Path = "" ;
      GXt_char1 = "" ;
      AV20WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV22WebSession = httpContext.getWebSession();
      AV25TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV41Imgalbreccodprompt_GXI = "" ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      GXv_int6 = new byte[1] ;
      AV29Cadena = "" ;
      AV30Hash = "" ;
      AV36Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message13 = new GXBaseCollection[1] ;
      GXv_boolean14 = new boolean[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV27ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item15 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item16 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z841TrnNom = "" ;
      T01S38_A407EmprNom = new String[] {""} ;
      T01S38_n407EmprNom = new boolean[] {false} ;
      T01S39_A279CliNom = new String[] {""} ;
      T01S310_A841TrnNom = new String[] {""} ;
      T01S310_n841TrnNom = new boolean[] {false} ;
      T01S311_A11669DevCruId = new int[1] ;
      T01S311_A407EmprNom = new String[] {""} ;
      T01S311_n407EmprNom = new boolean[] {false} ;
      T01S311_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01S311_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01S311_A279CliNom = new String[] {""} ;
      T01S311_A841TrnNom = new String[] {""} ;
      T01S311_n841TrnNom = new boolean[] {false} ;
      T01S311_A11671DevCruEst = new byte[1] ;
      T01S311_A11672DevCruMat = new String[] {""} ;
      T01S311_A11674DevCruHash = new String[] {""} ;
      T01S311_A11675DevCruDesc = new String[] {""} ;
      T01S311_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01S311_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S311_A11678DevCruStt = new String[] {""} ;
      T01S311_A11679DevCruEnvA = new byte[1] ;
      T01S311_A11680DevCruAtId = new String[] {""} ;
      T01S311_A11681DevCruAT = new String[] {""} ;
      T01S311_A11682DevCruObs = new String[] {""} ;
      T01S311_A13983DevCruATCU = new String[] {""} ;
      T01S311_A13984DevCruSerA = new String[] {""} ;
      T01S311_A13985DevCruTipA = new String[] {""} ;
      T01S311_A396EmprCod = new String[] {""} ;
      T01S311_A252CliCod = new int[1] ;
      T01S311_A840TrnCod = new short[1] ;
      T01S311_n840TrnCod = new boolean[] {false} ;
      T01S312_A279CliNom = new String[] {""} ;
      T01S313_A841TrnNom = new String[] {""} ;
      T01S313_n841TrnNom = new boolean[] {false} ;
      T01S314_A396EmprCod = new String[] {""} ;
      T01S314_A11669DevCruId = new int[1] ;
      T01S37_A11669DevCruId = new int[1] ;
      T01S37_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01S37_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01S37_A11671DevCruEst = new byte[1] ;
      T01S37_A11672DevCruMat = new String[] {""} ;
      T01S37_A11674DevCruHash = new String[] {""} ;
      T01S37_A11675DevCruDesc = new String[] {""} ;
      T01S37_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01S37_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S37_A11678DevCruStt = new String[] {""} ;
      T01S37_A11679DevCruEnvA = new byte[1] ;
      T01S37_A11680DevCruAtId = new String[] {""} ;
      T01S37_A11681DevCruAT = new String[] {""} ;
      T01S37_A11682DevCruObs = new String[] {""} ;
      T01S37_A13983DevCruATCU = new String[] {""} ;
      T01S37_A13984DevCruSerA = new String[] {""} ;
      T01S37_A13985DevCruTipA = new String[] {""} ;
      T01S37_A396EmprCod = new String[] {""} ;
      T01S37_A252CliCod = new int[1] ;
      T01S37_A840TrnCod = new short[1] ;
      T01S37_n840TrnCod = new boolean[] {false} ;
      T01S315_A396EmprCod = new String[] {""} ;
      T01S315_A11669DevCruId = new int[1] ;
      T01S316_A396EmprCod = new String[] {""} ;
      T01S316_A11669DevCruId = new int[1] ;
      T01S36_A11669DevCruId = new int[1] ;
      T01S36_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01S36_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01S36_A11671DevCruEst = new byte[1] ;
      T01S36_A11672DevCruMat = new String[] {""} ;
      T01S36_A11674DevCruHash = new String[] {""} ;
      T01S36_A11675DevCruDesc = new String[] {""} ;
      T01S36_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01S36_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S36_A11678DevCruStt = new String[] {""} ;
      T01S36_A11679DevCruEnvA = new byte[1] ;
      T01S36_A11680DevCruAtId = new String[] {""} ;
      T01S36_A11681DevCruAT = new String[] {""} ;
      T01S36_A11682DevCruObs = new String[] {""} ;
      T01S36_A13983DevCruATCU = new String[] {""} ;
      T01S36_A13984DevCruSerA = new String[] {""} ;
      T01S36_A13985DevCruTipA = new String[] {""} ;
      T01S36_A396EmprCod = new String[] {""} ;
      T01S36_A252CliCod = new int[1] ;
      T01S36_A840TrnCod = new short[1] ;
      T01S36_n840TrnCod = new boolean[] {false} ;
      T01S320_A279CliNom = new String[] {""} ;
      T01S321_A841TrnNom = new String[] {""} ;
      T01S321_n841TrnNom = new boolean[] {false} ;
      T01S322_A396EmprCod = new String[] {""} ;
      T01S322_A11669DevCruId = new int[1] ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      T01S323_A11669DevCruId = new int[1] ;
      T01S323_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S323_A54AlbRPieUti = new int[1] ;
      T01S323_A47AlbREst = new byte[1] ;
      T01S323_A45AlbRef = new String[] {""} ;
      T01S323_A3613AlbRefDsc = new String[] {""} ;
      T01S323_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S323_A11684DevCruPzs = new int[1] ;
      T01S323_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S323_A52AlbRPieEnt = new int[1] ;
      T01S323_A56AlbRUni = new String[] {""} ;
      T01S323_A396EmprCod = new String[] {""} ;
      T01S323_A44AlbRecCod = new int[1] ;
      T01S35_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S35_A54AlbRPieUti = new int[1] ;
      T01S35_A47AlbREst = new byte[1] ;
      T01S35_A45AlbRef = new String[] {""} ;
      T01S35_A3613AlbRefDsc = new String[] {""} ;
      T01S35_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S35_A52AlbRPieEnt = new int[1] ;
      T01S35_A56AlbRUni = new String[] {""} ;
      T01S324_A396EmprCod = new String[] {""} ;
      T01S324_A11669DevCruId = new int[1] ;
      T01S324_A44AlbRecCod = new int[1] ;
      T01S33_A11669DevCruId = new int[1] ;
      T01S33_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S33_A11684DevCruPzs = new int[1] ;
      T01S33_A396EmprCod = new String[] {""} ;
      T01S33_A44AlbRecCod = new int[1] ;
      T01S32_A11669DevCruId = new int[1] ;
      T01S32_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S32_A11684DevCruPzs = new int[1] ;
      T01S32_A396EmprCod = new String[] {""} ;
      T01S32_A44AlbRecCod = new int[1] ;
      T01S325_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S325_A54AlbRPieUti = new int[1] ;
      T01S325_A47AlbREst = new byte[1] ;
      T01S325_A45AlbRef = new String[] {""} ;
      T01S325_A3613AlbRefDsc = new String[] {""} ;
      T01S325_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S325_A52AlbRPieEnt = new int[1] ;
      T01S325_A56AlbRUni = new String[] {""} ;
      T01S329_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S329_A54AlbRPieUti = new int[1] ;
      T01S329_A47AlbREst = new byte[1] ;
      T01S329_A45AlbRef = new String[] {""} ;
      T01S329_A3613AlbRefDsc = new String[] {""} ;
      T01S329_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01S329_A52AlbRPieEnt = new int[1] ;
      T01S329_A56AlbRUni = new String[] {""} ;
      T01S331_A396EmprCod = new String[] {""} ;
      T01S331_A11669DevCruId = new int[1] ;
      T01S331_A44AlbRecCod = new int[1] ;
      Gridlevel_almacentejidoRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_almacentejido_Linesclass = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11670DevCruFec = GXutil.nullDate() ;
      i11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      i11680DevCruAtId = "" ;
      i11681DevCruAT = "" ;
      i11678DevCruStt = "" ;
      i11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Gridlevel_almacentejidoColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_int17 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int12 = new byte[1] ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidodevolucion__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidodevolucion__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidodevolucion__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidodevolucion__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidodevolucion__default(),
         new Object[] {
             new Object[] {
            T01S32_A11669DevCruId, T01S32_A11683DevCruUnd, T01S32_A11684DevCruPzs, T01S32_A396EmprCod, T01S32_A44AlbRecCod
            }
            , new Object[] {
            T01S33_A11669DevCruId, T01S33_A11683DevCruUnd, T01S33_A11684DevCruPzs, T01S33_A396EmprCod, T01S33_A44AlbRecCod
            }
            , new Object[] {
            T01S34_A60AlbRUniUti, T01S34_A54AlbRPieUti, T01S34_A47AlbREst, T01S34_A45AlbRef, T01S34_A3613AlbRefDsc, T01S34_A58AlbRUniEnt, T01S34_A52AlbRPieEnt, T01S34_A56AlbRUni
            }
            , new Object[] {
            T01S35_A60AlbRUniUti, T01S35_A54AlbRPieUti, T01S35_A47AlbREst, T01S35_A45AlbRef, T01S35_A3613AlbRefDsc, T01S35_A58AlbRUniEnt, T01S35_A52AlbRPieEnt, T01S35_A56AlbRUni
            }
            , new Object[] {
            T01S36_A11669DevCruId, T01S36_A11670DevCruFec, T01S36_A11673DevCruSal, T01S36_A11671DevCruEst, T01S36_A11672DevCruMat, T01S36_A11674DevCruHash, T01S36_A11675DevCruDesc, T01S36_A11676DevCruDtSy, T01S36_A11677DevCruGros, T01S36_A11678DevCruStt,
            T01S36_A11679DevCruEnvA, T01S36_A11680DevCruAtId, T01S36_A11681DevCruAT, T01S36_A11682DevCruObs, T01S36_A13983DevCruATCU, T01S36_A13984DevCruSerA, T01S36_A13985DevCruTipA, T01S36_A396EmprCod, T01S36_A252CliCod, T01S36_A840TrnCod,
            T01S36_n840TrnCod
            }
            , new Object[] {
            T01S37_A11669DevCruId, T01S37_A11670DevCruFec, T01S37_A11673DevCruSal, T01S37_A11671DevCruEst, T01S37_A11672DevCruMat, T01S37_A11674DevCruHash, T01S37_A11675DevCruDesc, T01S37_A11676DevCruDtSy, T01S37_A11677DevCruGros, T01S37_A11678DevCruStt,
            T01S37_A11679DevCruEnvA, T01S37_A11680DevCruAtId, T01S37_A11681DevCruAT, T01S37_A11682DevCruObs, T01S37_A13983DevCruATCU, T01S37_A13984DevCruSerA, T01S37_A13985DevCruTipA, T01S37_A396EmprCod, T01S37_A252CliCod, T01S37_A840TrnCod,
            T01S37_n840TrnCod
            }
            , new Object[] {
            T01S38_A407EmprNom, T01S38_n407EmprNom
            }
            , new Object[] {
            T01S39_A279CliNom
            }
            , new Object[] {
            T01S310_A841TrnNom, T01S310_n841TrnNom
            }
            , new Object[] {
            T01S311_A11669DevCruId, T01S311_A407EmprNom, T01S311_n407EmprNom, T01S311_A11670DevCruFec, T01S311_A11673DevCruSal, T01S311_A279CliNom, T01S311_A841TrnNom, T01S311_n841TrnNom, T01S311_A11671DevCruEst, T01S311_A11672DevCruMat,
            T01S311_A11674DevCruHash, T01S311_A11675DevCruDesc, T01S311_A11676DevCruDtSy, T01S311_A11677DevCruGros, T01S311_A11678DevCruStt, T01S311_A11679DevCruEnvA, T01S311_A11680DevCruAtId, T01S311_A11681DevCruAT, T01S311_A11682DevCruObs, T01S311_A13983DevCruATCU,
            T01S311_A13984DevCruSerA, T01S311_A13985DevCruTipA, T01S311_A396EmprCod, T01S311_A252CliCod, T01S311_A840TrnCod, T01S311_n840TrnCod
            }
            , new Object[] {
            T01S312_A279CliNom
            }
            , new Object[] {
            T01S313_A841TrnNom, T01S313_n841TrnNom
            }
            , new Object[] {
            T01S314_A396EmprCod, T01S314_A11669DevCruId
            }
            , new Object[] {
            T01S315_A396EmprCod, T01S315_A11669DevCruId
            }
            , new Object[] {
            T01S316_A396EmprCod, T01S316_A11669DevCruId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01S320_A279CliNom
            }
            , new Object[] {
            T01S321_A841TrnNom, T01S321_n841TrnNom
            }
            , new Object[] {
            T01S322_A396EmprCod, T01S322_A11669DevCruId
            }
            , new Object[] {
            T01S323_A11669DevCruId, T01S323_A60AlbRUniUti, T01S323_A54AlbRPieUti, T01S323_A47AlbREst, T01S323_A45AlbRef, T01S323_A3613AlbRefDsc, T01S323_A11683DevCruUnd, T01S323_A11684DevCruPzs, T01S323_A58AlbRUniEnt, T01S323_A52AlbRPieEnt,
            T01S323_A56AlbRUni, T01S323_A396EmprCod, T01S323_A44AlbRecCod
            }
            , new Object[] {
            T01S324_A396EmprCod, T01S324_A11669DevCruId, T01S324_A44AlbRecCod
            }
            , new Object[] {
            T01S325_A60AlbRUniUti, T01S325_A54AlbRPieUti, T01S325_A47AlbREst, T01S325_A45AlbRef, T01S325_A3613AlbRefDsc, T01S325_A58AlbRUniEnt, T01S325_A52AlbRPieEnt, T01S325_A56AlbRUni
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01S329_A60AlbRUniUti, T01S329_A54AlbRPieUti, T01S329_A47AlbREst, T01S329_A45AlbRef, T01S329_A3613AlbRefDsc, T01S329_A58AlbRUniEnt, T01S329_A52AlbRPieEnt, T01S329_A56AlbRUni
            }
            , new Object[] {
            }
            , new Object[] {
            T01S331_A396EmprCod, T01S331_A11669DevCruId, T01S331_A44AlbRecCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV39Pgmname = "AlmacenSinDetalle.AlmacenTejidoDevolucion" ;
      Z11673DevCruSal = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A11673DevCruSal = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i11673DevCruSal = GXutil.serverNow( context, remoteHandle, pr_default) ;
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
      A11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
   }

   private byte Z11671DevCruEst ;
   private byte Z11679DevCruEnvA ;
   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private byte Gx_BScreen ;
   private byte A47AlbREst ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGridlevel_almacentejido_Backcolorstyle ;
   private byte subGridlevel_almacentejido_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i11679DevCruEnvA ;
   private byte subGridlevel_almacentejido_Allowselection ;
   private byte subGridlevel_almacentejido_Allowhovering ;
   private byte subGridlevel_almacentejido_Allowcollapsing ;
   private byte subGridlevel_almacentejido_Collapsed ;
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
   private short AV34ComboTrnCod ;
   private short nBlankRcdCount1634 ;
   private short RcdFound1634 ;
   private short nBlankRcdUsr1634 ;
   private short AV24Insert_TrnCod ;
   private short AV10FirmaD ;
   private short AV17FlagCli ;
   private short RcdFound1633 ;
   private short AV11Ws ;
   private short AV12Modhh ;
   private short AV13Reg000 ;
   private short AV14copias ;
   private short AV15Copias2 ;
   private short nIsDirty_1633 ;
   private short nIsDirty_1634 ;
   private short ZV17FlagCli ;
   private int wcpOAV19DevCruId ;
   private int Z11669DevCruId ;
   private int Z252CliCod ;
   private int nRC_GXsfl_72 ;
   private int nGXsfl_72_idx=1 ;
   private int N252CliCod ;
   private int Z44AlbRecCod ;
   private int Z11684DevCruPzs ;
   private int Z52AlbRPieEnt ;
   private int O11684DevCruPzs ;
   private int O54AlbRPieUti ;
   private int A11669DevCruId ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV19DevCruId ;
   private int trnEnded ;
   private int edtDevCruId_Enabled ;
   private int edtDevCruFec_Enabled ;
   private int edtDevCruSal_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtTrnCod_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtDevCruMat_Enabled ;
   private int edtDevCruObs_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV28ComboCliCod ;
   private int edtavComboclicod_Enabled ;
   private int edtavComboclicod_Visible ;
   private int edtavCombotrncod_Enabled ;
   private int edtavCombotrncod_Visible ;
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
   private int edtDevCruATCU_Visible ;
   private int edtDevCruATCU_Enabled ;
   private int edtDevCruSerA_Visible ;
   private int edtDevCruSerA_Enabled ;
   private int edtDevCruTipA_Visible ;
   private int edtDevCruTipA_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtavImgalbreccodprompt_Enabled ;
   private int edtavImgalbreccodprompt_Visible ;
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
   private int AV23Insert_CliCod ;
   private int AV16CliCod ;
   private int Combo_clicod_Datalistupdateminimumcharacters ;
   private int Combo_trncod_Datalistupdateminimumcharacters ;
   private int A11684DevCruPzs ;
   private int A51AlbRPieDis ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int T11684DevCruPzs ;
   private int T54AlbRPieUti ;
   private int GXt_int7 ;
   private int AV40GXV1 ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int subGridlevel_almacentejido_Backcolor ;
   private int subGridlevel_almacentejido_Allbackcolor ;
   private int defcmbAlbREst_Enabled ;
   private int defedtAlbRPieEnt_Enabled ;
   private int defedtAlbRPieUti_Enabled ;
   private int defedtAlbRUniEnt_Enabled ;
   private int defedtAlbRUniUti_Enabled ;
   private int defedtAlbRecCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_almacentejido_Selectedindex ;
   private int subGridlevel_almacentejido_Selectioncolor ;
   private int subGridlevel_almacentejido_Hoveringcolor ;
   private int ZV16CliCod ;
   private int GXv_int17[] ;
   private int GXv_int8[] ;
   private int ZO54AlbRPieUti ;
   private long GRIDLEVEL_ALMACENTEJIDO_nFirstRecordOnPage ;
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
   private String sGXsfl_72_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV18EmprCod ;
   private String Z396EmprCod ;
   private String Z11672DevCruMat ;
   private String Z11674DevCruHash ;
   private String Z11675DevCruDesc ;
   private String Z11678DevCruStt ;
   private String Z11680DevCruAtId ;
   private String Z11681DevCruAT ;
   private String Z13983DevCruATCU ;
   private String Z13984DevCruSerA ;
   private String Z13985DevCruTipA ;
   private String Combo_trncod_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String Z45AlbRef ;
   private String Z3613AlbRefDsc ;
   private String Z56AlbRUni ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV18EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtavImgalbreccodprompt_Internalname ;
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
   private String edtDevCruId_Internalname ;
   private String TempTags ;
   private String edtDevCruId_Jsonclick ;
   private String edtDevCruFec_Internalname ;
   private String edtDevCruFec_Jsonclick ;
   private String edtDevCruSal_Internalname ;
   private String edtDevCruSal_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divTablesplittedtrncod_Internalname ;
   private String lblTextblocktrncod_Internalname ;
   private String lblTextblocktrncod_Jsonclick ;
   private String Combo_trncod_Caption ;
   private String Combo_trncod_Cls ;
   private String Combo_trncod_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtDevCruMat_Internalname ;
   private String A11672DevCruMat ;
   private String edtDevCruMat_Jsonclick ;
   private String edtDevCruObs_Internalname ;
   private String divTableleaflevel_almacentejido_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV39Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_clicod_Internalname ;
   private String edtavComboclicod_Internalname ;
   private String edtavComboclicod_Jsonclick ;
   private String divSectionattribute_trncod_Internalname ;
   private String edtavCombotrncod_Internalname ;
   private String edtavCombotrncod_Jsonclick ;
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
   private String edtDevCruATCU_Internalname ;
   private String A13983DevCruATCU ;
   private String edtDevCruATCU_Jsonclick ;
   private String edtDevCruSerA_Internalname ;
   private String A13984DevCruSerA ;
   private String edtDevCruSerA_Jsonclick ;
   private String edtDevCruTipA_Internalname ;
   private String A13985DevCruTipA ;
   private String edtDevCruTipA_Jsonclick ;
   private String sMode1634 ;
   private String edtAlbRecCod_Internalname ;
   private String edtavImgalbreccodprompt_Link ;
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
   private String sStyleString ;
   private String subGridlevel_almacentejido_Internalname ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String Combo_clicod_Objectcall ;
   private String Combo_clicod_Class ;
   private String Combo_clicod_Icontype ;
   private String Combo_clicod_Icon ;
   private String Combo_clicod_Tooltip ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Selectedtext_set ;
   private String Combo_clicod_Selectedtext_get ;
   private String Combo_clicod_Gamoauthtoken ;
   private String Combo_clicod_Ddointernalname ;
   private String Combo_clicod_Titlecontrolalign ;
   private String Combo_clicod_Dropdownoptionstype ;
   private String Combo_clicod_Titlecontrolidtoreplace ;
   private String Combo_clicod_Datalisttype ;
   private String Combo_clicod_Datalistfixedvalues ;
   private String Combo_clicod_Datalistproc ;
   private String Combo_clicod_Datalistprocparametersprefix ;
   private String Combo_clicod_Remoteservicesparameters ;
   private String Combo_clicod_Htmltemplate ;
   private String Combo_clicod_Multiplevaluestype ;
   private String Combo_clicod_Loadingdata ;
   private String Combo_clicod_Noresultsfound ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_clicod_Onlyselectedvalues ;
   private String Combo_clicod_Selectalltext ;
   private String Combo_clicod_Multiplevaluesseparator ;
   private String Combo_clicod_Addnewoptiontext ;
   private String Combo_trncod_Objectcall ;
   private String Combo_trncod_Class ;
   private String Combo_trncod_Icontype ;
   private String Combo_trncod_Icon ;
   private String Combo_trncod_Tooltip ;
   private String Combo_trncod_Selectedvalue_set ;
   private String Combo_trncod_Selectedtext_set ;
   private String Combo_trncod_Selectedtext_get ;
   private String Combo_trncod_Gamoauthtoken ;
   private String Combo_trncod_Ddointernalname ;
   private String Combo_trncod_Titlecontrolalign ;
   private String Combo_trncod_Dropdownoptionstype ;
   private String Combo_trncod_Titlecontrolidtoreplace ;
   private String Combo_trncod_Datalisttype ;
   private String Combo_trncod_Datalistfixedvalues ;
   private String Combo_trncod_Datalistproc ;
   private String Combo_trncod_Datalistprocparametersprefix ;
   private String Combo_trncod_Remoteservicesparameters ;
   private String Combo_trncod_Htmltemplate ;
   private String Combo_trncod_Multiplevaluestype ;
   private String Combo_trncod_Loadingdata ;
   private String Combo_trncod_Noresultsfound ;
   private String Combo_trncod_Emptyitemtext ;
   private String Combo_trncod_Onlyselectedvalues ;
   private String Combo_trncod_Selectalltext ;
   private String Combo_trncod_Multiplevaluesseparator ;
   private String Combo_trncod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
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
   private String AV7Station ;
   private String AV8EmprNom ;
   private String AV9UsurCod ;
   private String AV35Path ;
   private String GXt_char1 ;
   private String edtavImgalbreccodprompt_gximage ;
   private String AV29Cadena ;
   private String AV30Hash ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String sGXsfl_72_fel_idx="0001" ;
   private String subGridlevel_almacentejido_Class ;
   private String subGridlevel_almacentejido_Linesclass ;
   private String ROClassString ;
   private String edtAlbRecCod_Jsonclick ;
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
   private String subGridlevel_almacentejido_Header ;
   private String GXv_char4[] ;
   private java.util.Date Z11673DevCruSal ;
   private java.util.Date Z11676DevCruDtSy ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date i11676DevCruDtSy ;
   private java.util.Date i11673DevCruSal ;
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
   private boolean Combo_clicod_Emptyitem ;
   private boolean Combo_trncod_Emptyitem ;
   private boolean bGXsfl_72_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean Combo_clicod_Enabled ;
   private boolean Combo_clicod_Visible ;
   private boolean Combo_clicod_Allowmultipleselection ;
   private boolean Combo_clicod_Isgriditem ;
   private boolean Combo_clicod_Hasdescription ;
   private boolean Combo_clicod_Includeonlyselectedoption ;
   private boolean Combo_clicod_Includeselectalloption ;
   private boolean Combo_clicod_Includeaddnewoption ;
   private boolean Combo_trncod_Enabled ;
   private boolean Combo_trncod_Visible ;
   private boolean Combo_trncod_Allowmultipleselection ;
   private boolean Combo_trncod_Isgriditem ;
   private boolean Combo_trncod_Hasdescription ;
   private boolean Combo_trncod_Includeonlyselectedoption ;
   private boolean Combo_trncod_Includeselectalloption ;
   private boolean Combo_trncod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean AV37OK ;
   private boolean GXv_boolean14[] ;
   private boolean Gx_longc ;
   private boolean AV32imgAlbRecCodPrompt_IsBlob ;
   private String Z11682DevCruObs ;
   private String A11682DevCruObs ;
   private String AV41Imgalbreccodprompt_GXI ;
   private String AV27ComboSelectedValue ;
   private String AV32imgAlbRecCodPrompt ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_almacentejidoContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_almacentejidoRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_almacentejidoColumn ;
   private com.genexus.webpanels.WebSession AV22WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private String[] T01S38_A407EmprNom ;
   private boolean[] T01S38_n407EmprNom ;
   private String[] T01S39_A279CliNom ;
   private String[] T01S310_A841TrnNom ;
   private boolean[] T01S310_n841TrnNom ;
   private int[] T01S311_A11669DevCruId ;
   private String[] T01S311_A407EmprNom ;
   private boolean[] T01S311_n407EmprNom ;
   private java.util.Date[] T01S311_A11670DevCruFec ;
   private java.util.Date[] T01S311_A11673DevCruSal ;
   private String[] T01S311_A279CliNom ;
   private String[] T01S311_A841TrnNom ;
   private boolean[] T01S311_n841TrnNom ;
   private byte[] T01S311_A11671DevCruEst ;
   private String[] T01S311_A11672DevCruMat ;
   private String[] T01S311_A11674DevCruHash ;
   private String[] T01S311_A11675DevCruDesc ;
   private java.util.Date[] T01S311_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01S311_A11677DevCruGros ;
   private String[] T01S311_A11678DevCruStt ;
   private byte[] T01S311_A11679DevCruEnvA ;
   private String[] T01S311_A11680DevCruAtId ;
   private String[] T01S311_A11681DevCruAT ;
   private String[] T01S311_A11682DevCruObs ;
   private String[] T01S311_A13983DevCruATCU ;
   private String[] T01S311_A13984DevCruSerA ;
   private String[] T01S311_A13985DevCruTipA ;
   private String[] T01S311_A396EmprCod ;
   private int[] T01S311_A252CliCod ;
   private short[] T01S311_A840TrnCod ;
   private boolean[] T01S311_n840TrnCod ;
   private String[] T01S312_A279CliNom ;
   private String[] T01S313_A841TrnNom ;
   private boolean[] T01S313_n841TrnNom ;
   private String[] T01S314_A396EmprCod ;
   private int[] T01S314_A11669DevCruId ;
   private int[] T01S37_A11669DevCruId ;
   private java.util.Date[] T01S37_A11670DevCruFec ;
   private java.util.Date[] T01S37_A11673DevCruSal ;
   private byte[] T01S37_A11671DevCruEst ;
   private String[] T01S37_A11672DevCruMat ;
   private String[] T01S37_A11674DevCruHash ;
   private String[] T01S37_A11675DevCruDesc ;
   private java.util.Date[] T01S37_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01S37_A11677DevCruGros ;
   private String[] T01S37_A11678DevCruStt ;
   private byte[] T01S37_A11679DevCruEnvA ;
   private String[] T01S37_A11680DevCruAtId ;
   private String[] T01S37_A11681DevCruAT ;
   private String[] T01S37_A11682DevCruObs ;
   private String[] T01S37_A13983DevCruATCU ;
   private String[] T01S37_A13984DevCruSerA ;
   private String[] T01S37_A13985DevCruTipA ;
   private String[] T01S37_A396EmprCod ;
   private int[] T01S37_A252CliCod ;
   private short[] T01S37_A840TrnCod ;
   private boolean[] T01S37_n840TrnCod ;
   private String[] T01S315_A396EmprCod ;
   private int[] T01S315_A11669DevCruId ;
   private String[] T01S316_A396EmprCod ;
   private int[] T01S316_A11669DevCruId ;
   private int[] T01S36_A11669DevCruId ;
   private java.util.Date[] T01S36_A11670DevCruFec ;
   private java.util.Date[] T01S36_A11673DevCruSal ;
   private byte[] T01S36_A11671DevCruEst ;
   private String[] T01S36_A11672DevCruMat ;
   private String[] T01S36_A11674DevCruHash ;
   private String[] T01S36_A11675DevCruDesc ;
   private java.util.Date[] T01S36_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01S36_A11677DevCruGros ;
   private String[] T01S36_A11678DevCruStt ;
   private byte[] T01S36_A11679DevCruEnvA ;
   private String[] T01S36_A11680DevCruAtId ;
   private String[] T01S36_A11681DevCruAT ;
   private String[] T01S36_A11682DevCruObs ;
   private String[] T01S36_A13983DevCruATCU ;
   private String[] T01S36_A13984DevCruSerA ;
   private String[] T01S36_A13985DevCruTipA ;
   private String[] T01S36_A396EmprCod ;
   private int[] T01S36_A252CliCod ;
   private short[] T01S36_A840TrnCod ;
   private boolean[] T01S36_n840TrnCod ;
   private String[] T01S320_A279CliNom ;
   private String[] T01S321_A841TrnNom ;
   private boolean[] T01S321_n841TrnNom ;
   private String[] T01S322_A396EmprCod ;
   private int[] T01S322_A11669DevCruId ;
   private int[] T01S323_A11669DevCruId ;
   private java.math.BigDecimal[] T01S323_A60AlbRUniUti ;
   private int[] T01S323_A54AlbRPieUti ;
   private byte[] T01S323_A47AlbREst ;
   private String[] T01S323_A45AlbRef ;
   private String[] T01S323_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01S323_A11683DevCruUnd ;
   private int[] T01S323_A11684DevCruPzs ;
   private java.math.BigDecimal[] T01S323_A58AlbRUniEnt ;
   private int[] T01S323_A52AlbRPieEnt ;
   private String[] T01S323_A56AlbRUni ;
   private String[] T01S323_A396EmprCod ;
   private int[] T01S323_A44AlbRecCod ;
   private java.math.BigDecimal[] T01S35_A60AlbRUniUti ;
   private int[] T01S35_A54AlbRPieUti ;
   private byte[] T01S35_A47AlbREst ;
   private String[] T01S35_A45AlbRef ;
   private String[] T01S35_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01S35_A58AlbRUniEnt ;
   private int[] T01S35_A52AlbRPieEnt ;
   private String[] T01S35_A56AlbRUni ;
   private String[] T01S324_A396EmprCod ;
   private int[] T01S324_A11669DevCruId ;
   private int[] T01S324_A44AlbRecCod ;
   private int[] T01S33_A11669DevCruId ;
   private java.math.BigDecimal[] T01S33_A11683DevCruUnd ;
   private int[] T01S33_A11684DevCruPzs ;
   private String[] T01S33_A396EmprCod ;
   private int[] T01S33_A44AlbRecCod ;
   private int[] T01S32_A11669DevCruId ;
   private java.math.BigDecimal[] T01S32_A11683DevCruUnd ;
   private int[] T01S32_A11684DevCruPzs ;
   private String[] T01S32_A396EmprCod ;
   private int[] T01S32_A44AlbRecCod ;
   private java.math.BigDecimal[] T01S325_A60AlbRUniUti ;
   private int[] T01S325_A54AlbRPieUti ;
   private byte[] T01S325_A47AlbREst ;
   private String[] T01S325_A45AlbRef ;
   private String[] T01S325_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01S325_A58AlbRUniEnt ;
   private int[] T01S325_A52AlbRPieEnt ;
   private String[] T01S325_A56AlbRUni ;
   private java.math.BigDecimal[] T01S329_A60AlbRUniUti ;
   private int[] T01S329_A54AlbRPieUti ;
   private byte[] T01S329_A47AlbREst ;
   private String[] T01S329_A45AlbRef ;
   private String[] T01S329_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01S329_A58AlbRUniEnt ;
   private int[] T01S329_A52AlbRPieEnt ;
   private String[] T01S329_A56AlbRUni ;
   private String[] T01S331_A396EmprCod ;
   private int[] T01S331_A11669DevCruId ;
   private int[] T01S331_A44AlbRecCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01S34_A60AlbRUniUti ;
   private int[] T01S34_A54AlbRPieUti ;
   private byte[] T01S34_A47AlbREst ;
   private String[] T01S34_A45AlbRef ;
   private String[] T01S34_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01S34_A58AlbRUniEnt ;
   private int[] T01S34_A52AlbRPieEnt ;
   private String[] T01S34_A56AlbRUni ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV26CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV33TrnCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item15 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item16[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV36Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV20WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV21TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV25TrnContextAtt ;
}

final  class almacentejidodevolucion__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class almacentejidodevolucion__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class almacentejidodevolucion__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class almacentejidodevolucion__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class almacentejidodevolucion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01S32", "SELECT DevCruId, DevCruUnd, DevCruPzs, EmprCod, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?  FOR UPDATE OF DevCruUnd, DevCruPzs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S33", "SELECT DevCruId, DevCruUnd, DevCruPzs, EmprCod, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S34", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S35", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S36", "SELECT DevCruId, DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA, EmprCod, CliCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ?  FOR UPDATE OF DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA, CliCod, TrnCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S37", "SELECT DevCruId, DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA, EmprCod, CliCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S38", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S39", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S310", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S311", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevCruId, T2.EmprNom, TM1.DevCruFec, TM1.DevCruSal, T3.CliNom, T4.TrnNom, TM1.DevCruEst, TM1.DevCruMat, TM1.DevCruHash, TM1.DevCruDesc, TM1.DevCruDtSy, TM1.DevCruGros, TM1.DevCruStt, TM1.DevCruEnvA, TM1.DevCruAtId, TM1.DevCruAT, TM1.DevCruObs, TM1.DevCruATCU, TM1.DevCruSerA, TM1.DevCruTipA, TM1.EmprCod, TM1.CliCod, TM1.TrnCod FROM (((TXPDEVCRU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.DevCruId = ? ORDER BY TM1.EmprCod, TM1.DevCruId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S312", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S313", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S314", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S315", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE ( DevCruId > ?) and EmprCod = ? ORDER BY EmprCod, DevCruId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01S316", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE ( DevCruId < ?) and EmprCod = ? ORDER BY EmprCod DESC, DevCruId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01S317", "INSERT INTO TXPDEVCRU(DevCruId, DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA, EmprCod, CliCod, TrnCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVCRU")
         ,new UpdateCursor("T01S318", "UPDATE TXPDEVCRU SET DevCruFec=?, DevCruSal=?, DevCruEst=?, DevCruMat=?, DevCruHash=?, DevCruDesc=?, DevCruDtSy=?, DevCruGros=?, DevCruStt=?, DevCruEnvA=?, DevCruAtId=?, DevCruAT=?, DevCruObs=?, DevCruATCU=?, DevCruSerA=?, DevCruTipA=?, CliCod=?, TrnCod=?  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK, "TXPDEVCRU")
         ,new UpdateCursor("T01S319", "DELETE FROM TXPDEVCRU  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK, "TXPDEVCRU")
         ,new ForEachCursor("T01S320", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S321", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S322", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? ORDER BY EmprCod, DevCruId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S323", "SELECT T1.DevCruId, T2.AlbRUniUti, T2.AlbRPieUti, T2.AlbREst, T2.AlbRef, T2.AlbRefDsc, T1.DevCruUnd, T1.DevCruPzs, T2.AlbRUniEnt, T2.AlbRPieEnt, T2.AlbRUni, T1.EmprCod, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S324", "SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01S325", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01S326", "INSERT INTO TXPDEVCR1(DevCruId, DevCruUnd, DevCruPzs, EmprCod, AlbRecCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01S327", "UPDATE TXPDEVCR1 SET DevCruUnd=?, DevCruPzs=?  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01S328", "DELETE FROM TXPDEVCR1  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new ForEachCursor("T01S329", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01S330", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01S331", "SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId, AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
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
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 4);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
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
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 4);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
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
               ((String[]) buf[19])[0] = rslt.getString(18, 20);
               ((String[]) buf[20])[0] = rslt.getString(19, 20);
               ((String[]) buf[21])[0] = rslt.getString(20, 4);
               ((String[]) buf[22])[0] = rslt.getString(21, 3);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 27 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
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
               stmt.setString(15, (String)parms[14], 20);
               stmt.setString(16, (String)parms[15], 20);
               stmt.setString(17, (String)parms[16], 4);
               stmt.setString(18, (String)parms[17], 3);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[20]).shortValue());
               }
               return;
            case 16 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
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
               stmt.setString(14, (String)parms[13], 20);
               stmt.setString(15, (String)parms[14], 20);
               stmt.setString(16, (String)parms[15], 4);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[18]).shortValue());
               }
               stmt.setString(19, (String)parms[19], 3);
               stmt.setInt(20, ((Number) parms[20]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 25 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

