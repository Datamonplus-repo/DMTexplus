package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_lineas_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A14AlbComCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4717AlbComUni = (byte)(GXutil.lval( httpContext.GetPar( "AlbComUni"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4717AlbComUni", GXutil.str( A4717AlbComUni, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A4717AlbComUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
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
         gxload_20( A396EmprCod, A252CliCod) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbComCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbComCod), "ZZZZZZZ9")));
            AV9AlbComLin = (short)(GXutil.lval( httpContext.GetPar( "AlbComLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbComLin), 3, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbComLin), "ZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documento Transporte Comercial_Lineas_Trn", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public documentotransportecomercial_lineas_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransportecomercial_lineas_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_lineas_trn_impl.class ));
   }

   public documentotransportecomercial_lineas_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComCod_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbComFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFch_Internalname, localUtil.format(A17AlbComFch, "99/99/99"), localUtil.format( A17AlbComFch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComLin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A20AlbComLin), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComLin_Enabled, 1, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComDsc_Internalname, GXutil.rtrim( A15AlbComDsc), GXutil.rtrim( localUtil.format( A15AlbComDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComDc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComDc2_Internalname, httpContext.getMessage( "Descripcion II", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComDc2_Internalname, GXutil.rtrim( A10806AlbComDc2), GXutil.rtrim( localUtil.format( A10806AlbComDc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComDc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComDc2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComCnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComCnt_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComCnt_Enabled!=0) ? localUtil.format( A13AlbComCnt, "ZZZZZ9.99") : localUtil.format( A13AlbComCnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComCnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComCnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbcomuni_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbcomuni_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblockalbcomuni_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_albcomuni.setProperty("Caption", Combo_albcomuni_Caption);
      ucCombo_albcomuni.setProperty("Cls", Combo_albcomuni_Cls);
      ucCombo_albcomuni.setProperty("EmptyItem", Combo_albcomuni_Emptyitem);
      ucCombo_albcomuni.setProperty("DropDownOptionsData", AV15AlbComUni_Data);
      ucCombo_albcomuni.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albcomuni_Internalname, "COMBO_ALBCOMUNIContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComUni_Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComUni_Internalname, GXutil.ltrim( localUtil.ntoc( A4717AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4717AlbComUni), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComUni_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComUni_Visible, edtAlbComUni_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComPre_Internalname, GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComPre_Enabled!=0) ? localUtil.format( A21AlbComPre, "ZZZZZZ9.999") : localUtil.format( A21AlbComPre, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComPre_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV21Pgmname), GXutil.rtrim( localUtil.format( AV21Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_albcomuni_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboalbcomuni_Internalname, GXutil.ltrim( localUtil.ntoc( AV17ComboAlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboalbcomuni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17ComboAlbComUni), "9") : localUtil.format( DecimalUtil.doubleToDec(AV17ComboAlbComUni), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboalbcomuni_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboalbcomuni_Visible, edtavComboalbcomuni_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas_Trn.htm");
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
      e111UD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBCOMUNI_DATA"), AV15AlbComUni_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z20AlbComLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z15AlbComDsc = httpContext.cgiGet( "Z15AlbComDsc") ;
            Z10806AlbComDc2 = httpContext.cgiGet( "Z10806AlbComDc2") ;
            Z13AlbComCnt = localUtil.ctond( httpContext.cgiGet( "Z13AlbComCnt")) ;
            Z21AlbComPre = localUtil.ctond( httpContext.cgiGet( "Z21AlbComPre")) ;
            Z10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( "Z10355AlbComHd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10356ALbComR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10357AlbComP = httpContext.cgiGet( "Z10357AlbComP") ;
            Z5010AlbComProd = httpContext.cgiGet( "Z5010AlbComProd") ;
            Z4717AlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4717AlbComUni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( "Z10355AlbComHd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10356ALbComR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10357AlbComP = httpContext.cgiGet( "Z10357AlbComP") ;
            A5010AlbComProd = httpContext.cgiGet( "Z5010AlbComProd") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N4717AlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( "N4717AlbComUni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3914AlbCImpL = localUtil.ctond( httpContext.cgiGet( "ALBCIMPL")) ;
            A12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( "ALBCIMPLIN")) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBCOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( "vALBCOMLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_AlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBCOMUNI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMHD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBCOMR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10357AlbComP = httpContext.cgiGet( "ALBCOMP") ;
            A5010AlbComProd = httpContext.cgiGet( "ALBCOMPROD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A22AlbComPri = httpContext.cgiGet( "ALBCOMPRI") ;
            A5144AlbUcoDsc = httpContext.cgiGet( "ALBUCODSC") ;
            n5144AlbUcoDsc = false ;
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
            Combo_albcomuni_Objectcall = httpContext.cgiGet( "COMBO_ALBCOMUNI_Objectcall") ;
            Combo_albcomuni_Class = httpContext.cgiGet( "COMBO_ALBCOMUNI_Class") ;
            Combo_albcomuni_Icontype = httpContext.cgiGet( "COMBO_ALBCOMUNI_Icontype") ;
            Combo_albcomuni_Icon = httpContext.cgiGet( "COMBO_ALBCOMUNI_Icon") ;
            Combo_albcomuni_Caption = httpContext.cgiGet( "COMBO_ALBCOMUNI_Caption") ;
            Combo_albcomuni_Tooltip = httpContext.cgiGet( "COMBO_ALBCOMUNI_Tooltip") ;
            Combo_albcomuni_Cls = httpContext.cgiGet( "COMBO_ALBCOMUNI_Cls") ;
            Combo_albcomuni_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectedvalue_set") ;
            Combo_albcomuni_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectedvalue_get") ;
            Combo_albcomuni_Selectedtext_set = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectedtext_set") ;
            Combo_albcomuni_Selectedtext_get = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectedtext_get") ;
            Combo_albcomuni_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALBCOMUNI_Gamoauthtoken") ;
            Combo_albcomuni_Ddointernalname = httpContext.cgiGet( "COMBO_ALBCOMUNI_Ddointernalname") ;
            Combo_albcomuni_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALBCOMUNI_Titlecontrolalign") ;
            Combo_albcomuni_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALBCOMUNI_Dropdownoptionstype") ;
            Combo_albcomuni_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Enabled")) ;
            Combo_albcomuni_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Visible")) ;
            Combo_albcomuni_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALBCOMUNI_Titlecontrolidtoreplace") ;
            Combo_albcomuni_Datalisttype = httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalisttype") ;
            Combo_albcomuni_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Allowmultipleselection")) ;
            Combo_albcomuni_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalistfixedvalues") ;
            Combo_albcomuni_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Isgriditem")) ;
            Combo_albcomuni_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Hasdescription")) ;
            Combo_albcomuni_Datalistproc = httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalistproc") ;
            Combo_albcomuni_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalistprocparametersprefix") ;
            Combo_albcomuni_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALBCOMUNI_Remoteservicesparameters") ;
            Combo_albcomuni_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBCOMUNI_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_albcomuni_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Includeonlyselectedoption")) ;
            Combo_albcomuni_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Includeselectalloption")) ;
            Combo_albcomuni_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Emptyitem")) ;
            Combo_albcomuni_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Includeaddnewoption")) ;
            Combo_albcomuni_Htmltemplate = httpContext.cgiGet( "COMBO_ALBCOMUNI_Htmltemplate") ;
            Combo_albcomuni_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALBCOMUNI_Multiplevaluestype") ;
            Combo_albcomuni_Loadingdata = httpContext.cgiGet( "COMBO_ALBCOMUNI_Loadingdata") ;
            Combo_albcomuni_Noresultsfound = httpContext.cgiGet( "COMBO_ALBCOMUNI_Noresultsfound") ;
            Combo_albcomuni_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBCOMUNI_Emptyitemtext") ;
            Combo_albcomuni_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALBCOMUNI_Onlyselectedvalues") ;
            Combo_albcomuni_Selectalltext = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectalltext") ;
            Combo_albcomuni_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALBCOMUNI_Multiplevaluesseparator") ;
            Combo_albcomuni_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALBCOMUNI_Addnewoptiontext") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14AlbComCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            }
            else
            {
               A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            }
            A17AlbComFch = localUtil.ctod( httpContext.cgiGet( edtAlbComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOMLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A20AlbComLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
            }
            else
            {
               A20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
            }
            A15AlbComDsc = httpContext.cgiGet( edtAlbComDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A15AlbComDsc", A15AlbComDsc);
            A10806AlbComDc2 = httpContext.cgiGet( edtAlbComDc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10806AlbComDc2", A10806AlbComDc2);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOMCNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComCnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13AlbComCnt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A13AlbComCnt", GXutil.ltrimstr( A13AlbComCnt, 9, 2));
            }
            else
            {
               A13AlbComCnt = localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13AlbComCnt", GXutil.ltrimstr( A13AlbComCnt, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOMUNI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComUni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4717AlbComUni = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4717AlbComUni", GXutil.str( A4717AlbComUni, 1, 0));
            }
            else
            {
               A4717AlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComUni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4717AlbComUni", GXutil.str( A4717AlbComUni, 1, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOMPRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComPre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A21AlbComPre = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A21AlbComPre", GXutil.ltrimstr( A21AlbComPre, 13, 5));
            }
            else
            {
               A21AlbComPre = localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A21AlbComPre", GXutil.ltrimstr( A21AlbComPre, 13, 5));
            }
            AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
            AV17ComboAlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( edtavComboalbcomuni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ComboAlbComUni", GXutil.str( AV17ComboAlbComUni, 1, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_Lineas_Trn");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV21Pgmname, "")));
            forbiddenHiddens.add("AlbComHd", localUtil.format( DecimalUtil.doubleToDec(A10355AlbComHd), "ZZZZZZZ9"));
            forbiddenHiddens.add("ALbComR", localUtil.format( DecimalUtil.doubleToDec(A10356ALbComR), "9"));
            forbiddenHiddens.add("AlbComP", GXutil.rtrim( localUtil.format( A10357AlbComP, "")));
            forbiddenHiddens.add("AlbComProd", GXutil.rtrim( localUtil.format( A5010AlbComProd, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14AlbComCod != Z14AlbComCod ) || ( A20AlbComLin != Z20AlbComLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("documentotransportecomercial\\documentotransportecomercial_lineas_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
               A20AlbComLin = (short)(GXutil.lval( httpContext.GetPar( "AlbComLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
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
                  sMode2 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode2 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound2 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UD0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBCOMCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbComCod_Internalname ;
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
                        e111UD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UD2 ();
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
         e121UD2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UD2( ) ;
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
         disableAttributes1UD2( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbcomuni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbcomuni_Enabled), 5, 0), true);
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

   public void confirm_1UD0( )
   {
      beforeValidate1UD2( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UD2( ) ;
         }
         else
         {
            checkExtendedTable1UD2( ) ;
            closeExtendedTableCursors1UD2( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UD0( )
   {
   }

   public void e111UD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransportecomercial_lineas_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransportecomercial_lineas_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      documentotransportecomercial_lineas_trn_impl.this.AV19EmprNom = GXv_char3[0] ;
      documentotransportecomercial_lineas_trn_impl.this.AV20UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom", AV19EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV20UsurCod", AV20UsurCod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      edtAlbComUni_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComUni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComUni_Visible), 5, 0), true);
      AV17ComboAlbComUni = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboAlbComUni", GXutil.str( AV17ComboAlbComUni, 1, 0));
      edtavComboalbcomuni_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbcomuni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbcomuni_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOALBCOMUNI' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV21Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV22GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GXV1), 8, 0));
         while ( AV22GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV22GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbComUni") == 0 )
            {
               AV13Insert_AlbComUni = (byte)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_AlbComUni", GXutil.str( AV13Insert_AlbComUni, 1, 0));
               if ( ! (0==AV13Insert_AlbComUni) )
               {
                  AV17ComboAlbComUni = AV13Insert_AlbComUni ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17ComboAlbComUni", GXutil.str( AV17ComboAlbComUni, 1, 0));
                  Combo_albcomuni_Selectedvalue_set = GXutil.trim( GXutil.str( AV17ComboAlbComUni, 1, 0)) ;
                  ucCombo_albcomuni.sendProperty(context, "", false, Combo_albcomuni_Internalname, "SelectedValue_set", Combo_albcomuni_Selectedvalue_set);
                  Combo_albcomuni_Enabled = false ;
                  ucCombo_albcomuni.sendProperty(context, "", false, Combo_albcomuni_Internalname, "Enabled", GXutil.booltostr( Combo_albcomuni_Enabled));
               }
            }
            AV22GXV1 = (int)(AV22GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GXV1), 8, 0));
         }
      }
   }

   public void e121UD2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOALBCOMUNI' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV15AlbComUni_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.documentotransportecomercial.documentotransportecomercial_lineas_trnloaddvcombo(remoteHandle, context).execute( "AlbComUni", Gx_mode, AV7EmprCod, AV8AlbComCod, AV9AlbComLin, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      documentotransportecomercial_lineas_trn_impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV15AlbComUni_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_albcomuni_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_albcomuni.sendProperty(context, "", false, Combo_albcomuni_Internalname, "SelectedValue_set", Combo_albcomuni_Selectedvalue_set);
      AV17ComboAlbComUni = (byte)(GXutil.lval( AV16ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboAlbComUni", GXutil.str( AV17ComboAlbComUni, 1, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_albcomuni_Enabled = false ;
         ucCombo_albcomuni.sendProperty(context, "", false, Combo_albcomuni_Internalname, "Enabled", GXutil.booltostr( Combo_albcomuni_Enabled));
      }
   }

   public void zm1UD2( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z15AlbComDsc = T01UD3_A15AlbComDsc[0] ;
            Z10806AlbComDc2 = T01UD3_A10806AlbComDc2[0] ;
            Z13AlbComCnt = T01UD3_A13AlbComCnt[0] ;
            Z21AlbComPre = T01UD3_A21AlbComPre[0] ;
            Z10355AlbComHd = T01UD3_A10355AlbComHd[0] ;
            Z10356ALbComR = T01UD3_A10356ALbComR[0] ;
            Z10357AlbComP = T01UD3_A10357AlbComP[0] ;
            Z5010AlbComProd = T01UD3_A5010AlbComProd[0] ;
            Z4717AlbComUni = T01UD3_A4717AlbComUni[0] ;
         }
         else
         {
            Z15AlbComDsc = A15AlbComDsc ;
            Z10806AlbComDc2 = A10806AlbComDc2 ;
            Z13AlbComCnt = A13AlbComCnt ;
            Z21AlbComPre = A21AlbComPre ;
            Z10355AlbComHd = A10355AlbComHd ;
            Z10356ALbComR = A10356ALbComR ;
            Z10357AlbComP = A10357AlbComP ;
            Z5010AlbComProd = A5010AlbComProd ;
            Z4717AlbComUni = A4717AlbComUni ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z20AlbComLin = A20AlbComLin ;
         Z15AlbComDsc = A15AlbComDsc ;
         Z10806AlbComDc2 = A10806AlbComDc2 ;
         Z13AlbComCnt = A13AlbComCnt ;
         Z21AlbComPre = A21AlbComPre ;
         Z10355AlbComHd = A10355AlbComHd ;
         Z10356ALbComR = A10356ALbComR ;
         Z10357AlbComP = A10357AlbComP ;
         Z5010AlbComProd = A5010AlbComProd ;
         Z396EmprCod = A396EmprCod ;
         Z14AlbComCod = A14AlbComCod ;
         Z4717AlbComUni = A4717AlbComUni ;
         Z407EmprNom = A407EmprNom ;
         Z17AlbComFch = A17AlbComFch ;
         Z22AlbComPri = A22AlbComPri ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z5144AlbUcoDsc = A5144AlbUcoDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV21Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Lineas_Trn" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UD4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UD4_A407EmprNom[0] ;
      n407EmprNom = T01UD4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV8AlbComCod) )
      {
         A14AlbComCod = AV8AlbComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      if ( ! (0==AV8AlbComCod) )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbComCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8AlbComCod) )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9AlbComLin) )
      {
         A20AlbComLin = AV9AlbComLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
      }
      if ( ! (0==AV9AlbComLin) )
      {
         edtAlbComLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbComLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9AlbComLin) )
      {
         edtAlbComLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_AlbComUni) )
      {
         edtAlbComUni_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComUni_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbComUni_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComUni_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_AlbComUni) )
      {
         A4717AlbComUni = AV13Insert_AlbComUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A4717AlbComUni", GXutil.str( A4717AlbComUni, 1, 0));
      }
      else
      {
         A4717AlbComUni = AV17ComboAlbComUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A4717AlbComUni", GXutil.str( A4717AlbComUni, 1, 0));
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
         /* Using cursor T01UD5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         A17AlbComFch = T01UD5_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A22AlbComPri = T01UD5_A22AlbComPri[0] ;
         A252CliCod = T01UD5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(3);
         /* Using cursor T01UD7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01UD7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(5);
         /* Using cursor T01UD6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A4717AlbComUni)});
         A5144AlbUcoDsc = T01UD6_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = T01UD6_n5144AlbUcoDsc[0] ;
         pr_default.close(4);
      }
   }

   public void load1UD2( )
   {
      /* Using cursor T01UD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A407EmprNom = T01UD8_A407EmprNom[0] ;
         n407EmprNom = T01UD8_n407EmprNom[0] ;
         A17AlbComFch = T01UD8_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A22AlbComPri = T01UD8_A22AlbComPri[0] ;
         A279CliNom = T01UD8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A15AlbComDsc = T01UD8_A15AlbComDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15AlbComDsc", A15AlbComDsc);
         A10806AlbComDc2 = T01UD8_A10806AlbComDc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10806AlbComDc2", A10806AlbComDc2);
         A5144AlbUcoDsc = T01UD8_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = T01UD8_n5144AlbUcoDsc[0] ;
         A13AlbComCnt = T01UD8_A13AlbComCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13AlbComCnt", GXutil.ltrimstr( A13AlbComCnt, 9, 2));
         A21AlbComPre = T01UD8_A21AlbComPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21AlbComPre", GXutil.ltrimstr( A21AlbComPre, 13, 5));
         A10355AlbComHd = T01UD8_A10355AlbComHd[0] ;
         A10356ALbComR = T01UD8_A10356ALbComR[0] ;
         A10357AlbComP = T01UD8_A10357AlbComP[0] ;
         A5010AlbComProd = T01UD8_A5010AlbComProd[0] ;
         A4717AlbComUni = T01UD8_A4717AlbComUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4717AlbComUni", GXutil.str( A4717AlbComUni, 1, 0));
         A252CliCod = T01UD8_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1UD2( -16) ;
      }
      pr_default.close(6);
      onLoadActions1UD2( ) ;
   }

   public void onLoadActions1UD2( )
   {
      A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3914AlbCImpL", GXutil.ltrimstr( A3914AlbCImpL, 16, 5));
      A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12AlbCImpLin", GXutil.ltrimstr( A12AlbCImpLin, 14, 2));
   }

   public void checkExtendedTable1UD2( )
   {
      nIsDirty_2 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_2 = (short)(1) ;
      A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3914AlbCImpL", GXutil.ltrimstr( A3914AlbCImpL, 16, 5));
      nIsDirty_2 = (short)(1) ;
      A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12AlbCImpLin", GXutil.ltrimstr( A12AlbCImpLin, 14, 2));
      /* Using cursor T01UD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALCOM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A17AlbComFch = T01UD5_A17AlbComFch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      A22AlbComPri = T01UD5_A22AlbComPri[0] ;
      A252CliCod = T01UD5_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(3);
      /* Using cursor T01UD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A4717AlbComUni)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBCOMUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A5144AlbUcoDsc = T01UD6_A5144AlbUcoDsc[0] ;
      n5144AlbUcoDsc = T01UD6_n5144AlbUcoDsc[0] ;
      pr_default.close(4);
      /* Using cursor T01UD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01UD7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1UD2( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          int A14AlbComCod )
   {
      /* Using cursor T01UD9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALCOM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A17AlbComFch = T01UD9_A17AlbComFch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      A22AlbComPri = T01UD9_A22AlbComPri[0] ;
      A252CliCod = T01UD9_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A17AlbComFch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A22AlbComPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_19( String A396EmprCod ,
                          byte A4717AlbComUni )
   {
      /* Using cursor T01UD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A4717AlbComUni)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBCOMUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A5144AlbUcoDsc = T01UD10_A5144AlbUcoDsc[0] ;
      n5144AlbUcoDsc = T01UD10_n5144AlbUcoDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5144AlbUcoDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_20( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01UD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01UD11_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1UD2( )
   {
      /* Using cursor T01UD12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound2 = (short)(1) ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UD2( 16) ;
         RcdFound2 = (short)(1) ;
         A20AlbComLin = T01UD3_A20AlbComLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
         A15AlbComDsc = T01UD3_A15AlbComDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15AlbComDsc", A15AlbComDsc);
         A10806AlbComDc2 = T01UD3_A10806AlbComDc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10806AlbComDc2", A10806AlbComDc2);
         A13AlbComCnt = T01UD3_A13AlbComCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13AlbComCnt", GXutil.ltrimstr( A13AlbComCnt, 9, 2));
         A21AlbComPre = T01UD3_A21AlbComPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A21AlbComPre", GXutil.ltrimstr( A21AlbComPre, 13, 5));
         A10355AlbComHd = T01UD3_A10355AlbComHd[0] ;
         A10356ALbComR = T01UD3_A10356ALbComR[0] ;
         A10357AlbComP = T01UD3_A10357AlbComP[0] ;
         A5010AlbComProd = T01UD3_A5010AlbComProd[0] ;
         A396EmprCod = T01UD3_A396EmprCod[0] ;
         A14AlbComCod = T01UD3_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         A4717AlbComUni = T01UD3_A4717AlbComUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4717AlbComUni", GXutil.str( A4717AlbComUni, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z14AlbComCod = A14AlbComCod ;
         Z20AlbComLin = A20AlbComLin ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UD2( ) ;
         if ( AnyError == 1 )
         {
            RcdFound2 = (short)(0) ;
            initializeNonKey1UD2( ) ;
         }
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound2 = (short)(0) ;
         initializeNonKey1UD2( ) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UD2( ) ;
      if ( RcdFound2 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound2 = (short)(0) ;
      /* Using cursor T01UD13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod), Integer.valueOf(A14AlbComCod), A396EmprCod, Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01UD13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UD13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UD13_A14AlbComCod[0] < A14AlbComCod ) || ( T01UD13_A14AlbComCod[0] == A14AlbComCod ) && ( GXutil.strcmp(T01UD13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UD13_A20AlbComLin[0] < A20AlbComLin ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01UD13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UD13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UD13_A14AlbComCod[0] > A14AlbComCod ) || ( T01UD13_A14AlbComCod[0] == A14AlbComCod ) && ( GXutil.strcmp(T01UD13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UD13_A20AlbComLin[0] > A20AlbComLin ) ) )
         {
            A396EmprCod = T01UD13_A396EmprCod[0] ;
            A14AlbComCod = T01UD13_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            A20AlbComLin = T01UD13_A20AlbComLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound2 = (short)(0) ;
      /* Using cursor T01UD14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod), Integer.valueOf(A14AlbComCod), A396EmprCod, Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01UD14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UD14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UD14_A14AlbComCod[0] > A14AlbComCod ) || ( T01UD14_A14AlbComCod[0] == A14AlbComCod ) && ( GXutil.strcmp(T01UD14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UD14_A20AlbComLin[0] > A20AlbComLin ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01UD14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UD14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UD14_A14AlbComCod[0] < A14AlbComCod ) || ( T01UD14_A14AlbComCod[0] == A14AlbComCod ) && ( GXutil.strcmp(T01UD14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UD14_A20AlbComLin[0] < A20AlbComLin ) ) )
         {
            A396EmprCod = T01UD14_A396EmprCod[0] ;
            A14AlbComCod = T01UD14_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            A20AlbComLin = T01UD14_A20AlbComLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UD2( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UD2( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound2 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) || ( A20AlbComLin != Z20AlbComLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A14AlbComCod = Z14AlbComCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
               A20AlbComLin = Z20AlbComLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBCOMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UD2( ) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) || ( A20AlbComLin != Z20AlbComLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UD2( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBCOMCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtAlbComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UD2( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) || ( A20AlbComLin != Z20AlbComLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14AlbComCod = Z14AlbComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         A20AlbComLin = Z20AlbComLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UD2( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z15AlbComDsc, T01UD2_A15AlbComDsc[0]) != 0 ) || ( GXutil.strcmp(Z10806AlbComDc2, T01UD2_A10806AlbComDc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z13AlbComCnt, T01UD2_A13AlbComCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z21AlbComPre, T01UD2_A21AlbComPre[0]) != 0 ) || ( Z10355AlbComHd != T01UD2_A10355AlbComHd[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10356ALbComR != T01UD2_A10356ALbComR[0] ) || ( GXutil.strcmp(Z10357AlbComP, T01UD2_A10357AlbComP[0]) != 0 ) || ( GXutil.strcmp(Z5010AlbComProd, T01UD2_A5010AlbComProd[0]) != 0 ) || ( Z4717AlbComUni != T01UD2_A4717AlbComUni[0] ) )
         {
            if ( GXutil.strcmp(Z15AlbComDsc, T01UD2_A15AlbComDsc[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_lineas_trn:[seudo value changed for attri]"+"AlbComDsc");
               GXutil.writeLogRaw("Old: ",Z15AlbComDsc);
               GXutil.writeLogRaw("Current: ",T01UD2_A15AlbComDsc[0]);
            }
            if ( GXutil.strcmp(Z10806AlbComDc2, T01UD2_A10806AlbComDc2[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_lineas_trn:[seudo value changed for attri]"+"AlbComDc2");
               GXutil.writeLogRaw("Old: ",Z10806AlbComDc2);
               GXutil.writeLogRaw("Current: ",T01UD2_A10806AlbComDc2[0]);
            }
            if ( DecimalUtil.compareTo(Z13AlbComCnt, T01UD2_A13AlbComCnt[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_lineas_trn:[seudo value changed for attri]"+"AlbComCnt");
               GXutil.writeLogRaw("Old: ",Z13AlbComCnt);
               GXutil.writeLogRaw("Current: ",T01UD2_A13AlbComCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z21AlbComPre, T01UD2_A21AlbComPre[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_lineas_trn:[seudo value changed for attri]"+"AlbComPre");
               GXutil.writeLogRaw("Old: ",Z21AlbComPre);
               GXutil.writeLogRaw("Current: ",T01UD2_A21AlbComPre[0]);
            }
            if ( Z10355AlbComHd != T01UD2_A10355AlbComHd[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_lineas_trn:[seudo value changed for attri]"+"AlbComHd");
               GXutil.writeLogRaw("Old: ",Z10355AlbComHd);
               GXutil.writeLogRaw("Current: ",T01UD2_A10355AlbComHd[0]);
            }
            if ( Z10356ALbComR != T01UD2_A10356ALbComR[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_lineas_trn:[seudo value changed for attri]"+"ALbComR");
               GXutil.writeLogRaw("Old: ",Z10356ALbComR);
               GXutil.writeLogRaw("Current: ",T01UD2_A10356ALbComR[0]);
            }
            if ( GXutil.strcmp(Z10357AlbComP, T01UD2_A10357AlbComP[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_lineas_trn:[seudo value changed for attri]"+"AlbComP");
               GXutil.writeLogRaw("Old: ",Z10357AlbComP);
               GXutil.writeLogRaw("Current: ",T01UD2_A10357AlbComP[0]);
            }
            if ( GXutil.strcmp(Z5010AlbComProd, T01UD2_A5010AlbComProd[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_lineas_trn:[seudo value changed for attri]"+"AlbComProd");
               GXutil.writeLogRaw("Old: ",Z5010AlbComProd);
               GXutil.writeLogRaw("Current: ",T01UD2_A5010AlbComProd[0]);
            }
            if ( Z4717AlbComUni != T01UD2_A4717AlbComUni[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_lineas_trn:[seudo value changed for attri]"+"AlbComUni");
               GXutil.writeLogRaw("Old: ",Z4717AlbComUni);
               GXutil.writeLogRaw("Current: ",T01UD2_A4717AlbComUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UD2( )
   {
      beforeValidate1UD2( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UD2( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UD2( 0) ;
         checkOptimisticConcurrency1UD2( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UD2( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UD2( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UD15 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A20AlbComLin), A15AlbComDsc, A10806AlbComDc2, A13AlbComCnt, A21AlbComPre, Integer.valueOf(A10355AlbComHd), Byte.valueOf(A10356ALbComR), A10357AlbComP, A5010AlbComProd, A396EmprCod, Integer.valueOf(A14AlbComCod), Byte.valueOf(A4717AlbComUni)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        resetCaption1UD0( ) ;
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
            load1UD2( ) ;
         }
         endLevel1UD2( ) ;
      }
      closeExtendedTableCursors1UD2( ) ;
   }

   public void update1UD2( )
   {
      beforeValidate1UD2( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UD2( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UD2( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UD2( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UD2( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UD16 */
                  pr_default.execute(14, new Object[] {A15AlbComDsc, A10806AlbComDc2, A13AlbComCnt, A21AlbComPre, Integer.valueOf(A10355AlbComHd), Byte.valueOf(A10356ALbComR), A10357AlbComP, A5010AlbComProd, Byte.valueOf(A4717AlbComUni), A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALCOM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UD2( ) ;
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
         endLevel1UD2( ) ;
      }
      closeExtendedTableCursors1UD2( ) ;
   }

   public void deferredUpdate1UD2( )
   {
   }

   public void delete( )
   {
      beforeValidate1UD2( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UD2( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UD2( ) ;
         afterConfirm1UD2( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UD2( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UD17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
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
      sMode2 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UD2( ) ;
      Gx_mode = sMode2 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UD2( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3914AlbCImpL", GXutil.ltrimstr( A3914AlbCImpL, 16, 5));
         A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12AlbCImpLin", GXutil.ltrimstr( A12AlbCImpLin, 14, 2));
         /* Using cursor T01UD18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         A17AlbComFch = T01UD18_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A22AlbComPri = T01UD18_A22AlbComPri[0] ;
         A252CliCod = T01UD18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(16);
         /* Using cursor T01UD19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Byte.valueOf(A4717AlbComUni)});
         A5144AlbUcoDsc = T01UD19_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = T01UD19_n5144AlbUcoDsc[0] ;
         pr_default.close(17);
         /* Using cursor T01UD20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01UD20_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(18);
      }
   }

   public void endLevel1UD2( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UD2( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercial_lineas_trn");
         if ( AnyError == 0 )
         {
            confirmValues1UD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercial_lineas_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UD2( )
   {
      /* Scan By routine */
      /* Using cursor T01UD21 */
      pr_default.execute(19);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A396EmprCod = T01UD21_A396EmprCod[0] ;
         A14AlbComCod = T01UD21_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         A20AlbComLin = T01UD21_A20AlbComLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UD2( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A396EmprCod = T01UD21_A396EmprCod[0] ;
         A14AlbComCod = T01UD21_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         A20AlbComLin = T01UD21_A20AlbComLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
      }
   }

   public void scanEnd1UD2( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1UD2( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UD2( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UD2( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UD2( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UD2( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UD2( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UD2( )
   {
      edtAlbComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      edtAlbComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFch_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), true);
      edtAlbComDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDsc_Enabled), 5, 0), true);
      edtAlbComDc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDc2_Enabled), 5, 0), true);
      edtAlbComCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCnt_Enabled), 5, 0), true);
      edtAlbComUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComUni_Enabled), 5, 0), true);
      edtAlbComPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPre_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboalbcomuni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbcomuni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbcomuni_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UD2( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UD0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransportecomercial.documentotransportecomercial_lineas_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbComCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbComLin,3,0))}, new String[] {"Gx_mode","EmprCod","AlbComCod","AlbComLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_Lineas_Trn");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV21Pgmname, "")));
      forbiddenHiddens.add("AlbComHd", localUtil.format( DecimalUtil.doubleToDec(A10355AlbComHd), "ZZZZZZZ9"));
      forbiddenHiddens.add("ALbComR", localUtil.format( DecimalUtil.doubleToDec(A10356ALbComR), "9"));
      forbiddenHiddens.add("AlbComP", GXutil.rtrim( localUtil.format( A10357AlbComP, "")));
      forbiddenHiddens.add("AlbComProd", GXutil.rtrim( localUtil.format( A5010AlbComProd, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransportecomercial\\documentotransportecomercial_lineas_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14AlbComCod", GXutil.ltrim( localUtil.ntoc( Z14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z20AlbComLin", GXutil.ltrim( localUtil.ntoc( Z20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z15AlbComDsc", GXutil.rtrim( Z15AlbComDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10806AlbComDc2", GXutil.rtrim( Z10806AlbComDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13AlbComCnt", GXutil.ltrim( localUtil.ntoc( Z13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z21AlbComPre", GXutil.ltrim( localUtil.ntoc( Z21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10355AlbComHd", GXutil.ltrim( localUtil.ntoc( Z10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10356ALbComR", GXutil.ltrim( localUtil.ntoc( Z10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10357AlbComP", GXutil.rtrim( Z10357AlbComP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5010AlbComProd", GXutil.rtrim( Z5010AlbComProd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4717AlbComUni", GXutil.ltrim( localUtil.ntoc( Z4717AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N4717AlbComUni", GXutil.ltrim( localUtil.ntoc( A4717AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBCOMUNI_DATA", AV15AlbComUni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBCOMUNI_DATA", AV15AlbComUni_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCIMPL", GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCIMPLIN", GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV8AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbComCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMLIN", GXutil.ltrim( localUtil.ntoc( AV9AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbComLin), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBCOMUNI", GXutil.ltrim( localUtil.ntoc( AV13Insert_AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMHD", GXutil.ltrim( localUtil.ntoc( A10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMR", GXutil.ltrim( localUtil.ntoc( A10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMP", GXutil.rtrim( A10357AlbComP));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMPROD", GXutil.rtrim( A5010AlbComProd));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMPRI", GXutil.rtrim( A22AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBUCODSC", GXutil.rtrim( A5144AlbUcoDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Objectcall", GXutil.rtrim( Combo_albcomuni_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Cls", GXutil.rtrim( Combo_albcomuni_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Selectedvalue_set", GXutil.rtrim( Combo_albcomuni_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Enabled", GXutil.booltostr( Combo_albcomuni_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Emptyitem", GXutil.booltostr( Combo_albcomuni_Emptyitem));
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
      return formatLink("app.documentotransportecomercial.documentotransportecomercial_lineas_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbComCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbComLin,3,0))}, new String[] {"Gx_mode","EmprCod","AlbComCod","AlbComLin"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteComercial.DocumentoTransporteComercial_Lineas_Trn" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento Transporte Comercial_Lineas_Trn", "") ;
   }

   public void initializeNonKey1UD2( )
   {
      A4717AlbComUni = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4717AlbComUni", GXutil.str( A4717AlbComUni, 1, 0));
      A12AlbCImpLin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12AlbCImpLin", GXutil.ltrimstr( A12AlbCImpLin, 14, 2));
      A3914AlbCImpL = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3914AlbCImpL", GXutil.ltrimstr( A3914AlbCImpL, 16, 5));
      A17AlbComFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      A22AlbComPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A15AlbComDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A15AlbComDsc", A15AlbComDsc);
      A10806AlbComDc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10806AlbComDc2", A10806AlbComDc2);
      A5144AlbUcoDsc = "" ;
      n5144AlbUcoDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5144AlbUcoDsc", A5144AlbUcoDsc);
      A13AlbComCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13AlbComCnt", GXutil.ltrimstr( A13AlbComCnt, 9, 2));
      A21AlbComPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A21AlbComPre", GXutil.ltrimstr( A21AlbComPre, 13, 5));
      A10355AlbComHd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10355AlbComHd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10355AlbComHd), 8, 0));
      A10356ALbComR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10356ALbComR", GXutil.str( A10356ALbComR, 1, 0));
      A10357AlbComP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10357AlbComP", A10357AlbComP);
      A5010AlbComProd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5010AlbComProd", A5010AlbComProd);
      Z15AlbComDsc = "" ;
      Z10806AlbComDc2 = "" ;
      Z13AlbComCnt = DecimalUtil.ZERO ;
      Z21AlbComPre = DecimalUtil.ZERO ;
      Z10355AlbComHd = 0 ;
      Z10356ALbComR = (byte)(0) ;
      Z10357AlbComP = "" ;
      Z5010AlbComProd = "" ;
      Z4717AlbComUni = (byte)(0) ;
   }

   public void initAll1UD2( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14AlbComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      A20AlbComLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A20AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A20AlbComLin), 3, 0));
      initializeNonKey1UD2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102458", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("documentotransportecomercial/documentotransportecomercial_lineas_trn.js", "?202682116102458", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbComCod_Internalname = "ALBCOMCOD" ;
      edtAlbComFch_Internalname = "ALBCOMFCH" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtAlbComLin_Internalname = "ALBCOMLIN" ;
      edtAlbComDsc_Internalname = "ALBCOMDSC" ;
      edtAlbComDc2_Internalname = "ALBCOMDC2" ;
      edtAlbComCnt_Internalname = "ALBCOMCNT" ;
      lblTextblockalbcomuni_Internalname = "TEXTBLOCKALBCOMUNI" ;
      Combo_albcomuni_Internalname = "COMBO_ALBCOMUNI" ;
      edtAlbComUni_Internalname = "ALBCOMUNI" ;
      divTablesplittedalbcomuni_Internalname = "TABLESPLITTEDALBCOMUNI" ;
      edtAlbComPre_Internalname = "ALBCOMPRE" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboalbcomuni_Internalname = "vCOMBOALBCOMUNI" ;
      divSectionattribute_albcomuni_Internalname = "SECTIONATTRIBUTE_ALBCOMUNI" ;
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
      Form.setCaption( httpContext.getMessage( "Documento Transporte Comercial_Lineas_Trn", "") );
      edtavComboalbcomuni_Jsonclick = "" ;
      edtavComboalbcomuni_Enabled = 0 ;
      edtavComboalbcomuni_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbComPre_Jsonclick = "" ;
      edtAlbComPre_Enabled = 1 ;
      edtAlbComUni_Jsonclick = "" ;
      edtAlbComUni_Enabled = 1 ;
      edtAlbComUni_Visible = 1 ;
      Combo_albcomuni_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_albcomuni_Cls = "ExtendedCombo AttributeFL" ;
      Combo_albcomuni_Enabled = GXutil.toBoolean( -1) ;
      edtAlbComCnt_Jsonclick = "" ;
      edtAlbComCnt_Enabled = 1 ;
      edtAlbComDc2_Jsonclick = "" ;
      edtAlbComDc2_Enabled = 1 ;
      edtAlbComDsc_Jsonclick = "" ;
      edtAlbComDsc_Enabled = 1 ;
      edtAlbComLin_Jsonclick = "" ;
      edtAlbComLin_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtAlbComFch_Jsonclick = "" ;
      edtAlbComFch_Enabled = 0 ;
      edtAlbComCod_Jsonclick = "" ;
      edtAlbComCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
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

   public void valid_Albcomcod( )
   {
      /* Using cursor T01UD18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALCOM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
      }
      A17AlbComFch = T01UD18_A17AlbComFch[0] ;
      A22AlbComPri = T01UD18_A22AlbComPri[0] ;
      A252CliCod = T01UD18_A252CliCod[0] ;
      pr_default.close(16);
      /* Using cursor T01UD20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01UD20_A279CliNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", GXutil.rtrim( A22AlbComPri));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Albcomuni( )
   {
      n5144AlbUcoDsc = false ;
      /* Using cursor T01UD19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Byte.valueOf(A4717AlbComUni)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBCOMUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComUni_Internalname ;
      }
      A5144AlbUcoDsc = T01UD19_A5144AlbUcoDsc[0] ;
      n5144AlbUcoDsc = T01UD19_n5144AlbUcoDsc[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5144AlbUcoDsc", GXutil.rtrim( A5144AlbUcoDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9AlbComLin',fld:'vALBCOMLIN',pic:'ZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9AlbComLin',fld:'vALBCOMLIN',pic:'ZZ9',hsh:true},{av:'AV21Pgmname',fld:'vPGMNAME',pic:''},{av:'A10355AlbComHd',fld:'ALBCOMHD',pic:'ZZZZZZZ9'},{av:'A10356ALbComR',fld:'ALBCOMR',pic:'9'},{av:'A10357AlbComP',fld:'ALBCOMP',pic:''},{av:'A5010AlbComProd',fld:'ALBCOMPROD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UD2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMCOD","{handler:'valid_Albcomcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_ALBCOMCOD",",oparms:[{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMLIN","{handler:'valid_Albcomlin',iparms:[]");
      setEventMetadata("VALID_ALBCOMLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMCNT","{handler:'valid_Albcomcnt',iparms:[]");
      setEventMetadata("VALID_ALBCOMCNT",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMUNI","{handler:'valid_Albcomuni',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4717AlbComUni',fld:'ALBCOMUNI',pic:'9'},{av:'A5144AlbUcoDsc',fld:'ALBUCODSC',pic:''}]");
      setEventMetadata("VALID_ALBCOMUNI",",oparms:[{av:'A5144AlbUcoDsc',fld:'ALBUCODSC',pic:''}]}");
      setEventMetadata("VALID_ALBCOMPRE","{handler:'valid_Albcompre',iparms:[]");
      setEventMetadata("VALID_ALBCOMPRE",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOALBCOMUNI","{handler:'validv_Comboalbcomuni',iparms:[]");
      setEventMetadata("VALIDV_COMBOALBCOMUNI",",oparms:[]}");
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
      pr_default.close(17);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z15AlbComDsc = "" ;
      Z10806AlbComDc2 = "" ;
      Z13AlbComCnt = DecimalUtil.ZERO ;
      Z21AlbComPre = DecimalUtil.ZERO ;
      Z10357AlbComP = "" ;
      Z5010AlbComProd = "" ;
      Combo_albcomuni_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A17AlbComFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A15AlbComDsc = "" ;
      A10806AlbComDc2 = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      lblTextblockalbcomuni_Jsonclick = "" ;
      ucCombo_albcomuni = new com.genexus.webpanels.GXUserControl();
      Combo_albcomuni_Caption = "" ;
      AV15AlbComUni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A21AlbComPre = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV21Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A10357AlbComP = "" ;
      A5010AlbComProd = "" ;
      A3914AlbCImpL = DecimalUtil.ZERO ;
      A12AlbCImpLin = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A22AlbComPri = "" ;
      A5144AlbUcoDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_albcomuni_Objectcall = "" ;
      Combo_albcomuni_Class = "" ;
      Combo_albcomuni_Icontype = "" ;
      Combo_albcomuni_Icon = "" ;
      Combo_albcomuni_Tooltip = "" ;
      Combo_albcomuni_Selectedvalue_set = "" ;
      Combo_albcomuni_Selectedtext_set = "" ;
      Combo_albcomuni_Selectedtext_get = "" ;
      Combo_albcomuni_Gamoauthtoken = "" ;
      Combo_albcomuni_Ddointernalname = "" ;
      Combo_albcomuni_Titlecontrolalign = "" ;
      Combo_albcomuni_Dropdownoptionstype = "" ;
      Combo_albcomuni_Titlecontrolidtoreplace = "" ;
      Combo_albcomuni_Datalisttype = "" ;
      Combo_albcomuni_Datalistfixedvalues = "" ;
      Combo_albcomuni_Datalistproc = "" ;
      Combo_albcomuni_Datalistprocparametersprefix = "" ;
      Combo_albcomuni_Remoteservicesparameters = "" ;
      Combo_albcomuni_Htmltemplate = "" ;
      Combo_albcomuni_Multiplevaluestype = "" ;
      Combo_albcomuni_Loadingdata = "" ;
      Combo_albcomuni_Noresultsfound = "" ;
      Combo_albcomuni_Emptyitemtext = "" ;
      Combo_albcomuni_Onlyselectedvalues = "" ;
      Combo_albcomuni_Selectalltext = "" ;
      Combo_albcomuni_Multiplevaluesseparator = "" ;
      Combo_albcomuni_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV19EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV20UsurCod = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z17AlbComFch = GXutil.nullDate() ;
      Z22AlbComPri = "" ;
      Z279CliNom = "" ;
      Z5144AlbUcoDsc = "" ;
      T01UD4_A407EmprNom = new String[] {""} ;
      T01UD4_n407EmprNom = new boolean[] {false} ;
      T01UD5_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UD5_A22AlbComPri = new String[] {""} ;
      T01UD5_A252CliCod = new int[1] ;
      T01UD7_A279CliNom = new String[] {""} ;
      T01UD6_A5144AlbUcoDsc = new String[] {""} ;
      T01UD6_n5144AlbUcoDsc = new boolean[] {false} ;
      T01UD8_A20AlbComLin = new short[1] ;
      T01UD8_A407EmprNom = new String[] {""} ;
      T01UD8_n407EmprNom = new boolean[] {false} ;
      T01UD8_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UD8_A22AlbComPri = new String[] {""} ;
      T01UD8_A279CliNom = new String[] {""} ;
      T01UD8_A15AlbComDsc = new String[] {""} ;
      T01UD8_A10806AlbComDc2 = new String[] {""} ;
      T01UD8_A5144AlbUcoDsc = new String[] {""} ;
      T01UD8_n5144AlbUcoDsc = new boolean[] {false} ;
      T01UD8_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UD8_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UD8_A10355AlbComHd = new int[1] ;
      T01UD8_A10356ALbComR = new byte[1] ;
      T01UD8_A10357AlbComP = new String[] {""} ;
      T01UD8_A5010AlbComProd = new String[] {""} ;
      T01UD8_A396EmprCod = new String[] {""} ;
      T01UD8_A14AlbComCod = new int[1] ;
      T01UD8_A4717AlbComUni = new byte[1] ;
      T01UD8_A252CliCod = new int[1] ;
      T01UD9_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UD9_A22AlbComPri = new String[] {""} ;
      T01UD9_A252CliCod = new int[1] ;
      T01UD10_A5144AlbUcoDsc = new String[] {""} ;
      T01UD10_n5144AlbUcoDsc = new boolean[] {false} ;
      T01UD11_A279CliNom = new String[] {""} ;
      T01UD12_A396EmprCod = new String[] {""} ;
      T01UD12_A14AlbComCod = new int[1] ;
      T01UD12_A20AlbComLin = new short[1] ;
      T01UD3_A20AlbComLin = new short[1] ;
      T01UD3_A15AlbComDsc = new String[] {""} ;
      T01UD3_A10806AlbComDc2 = new String[] {""} ;
      T01UD3_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UD3_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UD3_A10355AlbComHd = new int[1] ;
      T01UD3_A10356ALbComR = new byte[1] ;
      T01UD3_A10357AlbComP = new String[] {""} ;
      T01UD3_A5010AlbComProd = new String[] {""} ;
      T01UD3_A396EmprCod = new String[] {""} ;
      T01UD3_A14AlbComCod = new int[1] ;
      T01UD3_A4717AlbComUni = new byte[1] ;
      T01UD13_A396EmprCod = new String[] {""} ;
      T01UD13_A14AlbComCod = new int[1] ;
      T01UD13_A20AlbComLin = new short[1] ;
      T01UD14_A396EmprCod = new String[] {""} ;
      T01UD14_A14AlbComCod = new int[1] ;
      T01UD14_A20AlbComLin = new short[1] ;
      T01UD2_A20AlbComLin = new short[1] ;
      T01UD2_A15AlbComDsc = new String[] {""} ;
      T01UD2_A10806AlbComDc2 = new String[] {""} ;
      T01UD2_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UD2_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UD2_A10355AlbComHd = new int[1] ;
      T01UD2_A10356ALbComR = new byte[1] ;
      T01UD2_A10357AlbComP = new String[] {""} ;
      T01UD2_A5010AlbComProd = new String[] {""} ;
      T01UD2_A396EmprCod = new String[] {""} ;
      T01UD2_A14AlbComCod = new int[1] ;
      T01UD2_A4717AlbComUni = new byte[1] ;
      T01UD18_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UD18_A22AlbComPri = new String[] {""} ;
      T01UD18_A252CliCod = new int[1] ;
      T01UD19_A5144AlbUcoDsc = new String[] {""} ;
      T01UD19_n5144AlbUcoDsc = new boolean[] {false} ;
      T01UD20_A279CliNom = new String[] {""} ;
      T01UD21_A396EmprCod = new String[] {""} ;
      T01UD21_A14AlbComCod = new int[1] ;
      T01UD21_A20AlbComLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_lineas_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_lineas_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_lineas_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_lineas_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_lineas_trn__default(),
         new Object[] {
             new Object[] {
            T01UD2_A20AlbComLin, T01UD2_A15AlbComDsc, T01UD2_A10806AlbComDc2, T01UD2_A13AlbComCnt, T01UD2_A21AlbComPre, T01UD2_A10355AlbComHd, T01UD2_A10356ALbComR, T01UD2_A10357AlbComP, T01UD2_A5010AlbComProd, T01UD2_A396EmprCod,
            T01UD2_A14AlbComCod, T01UD2_A4717AlbComUni
            }
            , new Object[] {
            T01UD3_A20AlbComLin, T01UD3_A15AlbComDsc, T01UD3_A10806AlbComDc2, T01UD3_A13AlbComCnt, T01UD3_A21AlbComPre, T01UD3_A10355AlbComHd, T01UD3_A10356ALbComR, T01UD3_A10357AlbComP, T01UD3_A5010AlbComProd, T01UD3_A396EmprCod,
            T01UD3_A14AlbComCod, T01UD3_A4717AlbComUni
            }
            , new Object[] {
            T01UD4_A407EmprNom, T01UD4_n407EmprNom
            }
            , new Object[] {
            T01UD5_A17AlbComFch, T01UD5_A22AlbComPri, T01UD5_A252CliCod
            }
            , new Object[] {
            T01UD6_A5144AlbUcoDsc, T01UD6_n5144AlbUcoDsc
            }
            , new Object[] {
            T01UD7_A279CliNom
            }
            , new Object[] {
            T01UD8_A20AlbComLin, T01UD8_A407EmprNom, T01UD8_n407EmprNom, T01UD8_A17AlbComFch, T01UD8_A22AlbComPri, T01UD8_A279CliNom, T01UD8_A15AlbComDsc, T01UD8_A10806AlbComDc2, T01UD8_A5144AlbUcoDsc, T01UD8_n5144AlbUcoDsc,
            T01UD8_A13AlbComCnt, T01UD8_A21AlbComPre, T01UD8_A10355AlbComHd, T01UD8_A10356ALbComR, T01UD8_A10357AlbComP, T01UD8_A5010AlbComProd, T01UD8_A396EmprCod, T01UD8_A14AlbComCod, T01UD8_A4717AlbComUni, T01UD8_A252CliCod
            }
            , new Object[] {
            T01UD9_A17AlbComFch, T01UD9_A22AlbComPri, T01UD9_A252CliCod
            }
            , new Object[] {
            T01UD10_A5144AlbUcoDsc, T01UD10_n5144AlbUcoDsc
            }
            , new Object[] {
            T01UD11_A279CliNom
            }
            , new Object[] {
            T01UD12_A396EmprCod, T01UD12_A14AlbComCod, T01UD12_A20AlbComLin
            }
            , new Object[] {
            T01UD13_A396EmprCod, T01UD13_A14AlbComCod, T01UD13_A20AlbComLin
            }
            , new Object[] {
            T01UD14_A396EmprCod, T01UD14_A14AlbComCod, T01UD14_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UD18_A17AlbComFch, T01UD18_A22AlbComPri, T01UD18_A252CliCod
            }
            , new Object[] {
            T01UD19_A5144AlbUcoDsc, T01UD19_n5144AlbUcoDsc
            }
            , new Object[] {
            T01UD20_A279CliNom
            }
            , new Object[] {
            T01UD21_A396EmprCod, T01UD21_A14AlbComCod, T01UD21_A20AlbComLin
            }
         }
      );
      AV21Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Lineas_Trn" ;
   }

   private byte Z10356ALbComR ;
   private byte Z4717AlbComUni ;
   private byte N4717AlbComUni ;
   private byte GxWebError ;
   private byte A4717AlbComUni ;
   private byte nKeyPressed ;
   private byte AV17ComboAlbComUni ;
   private byte A10356ALbComR ;
   private byte AV13Insert_AlbComUni ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV9AlbComLin ;
   private short Z20AlbComLin ;
   private short AV9AlbComLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A20AlbComLin ;
   private short RcdFound2 ;
   private short nIsDirty_2 ;
   private int wcpOAV8AlbComCod ;
   private int Z14AlbComCod ;
   private int Z10355AlbComHd ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV8AlbComCod ;
   private int trnEnded ;
   private int edtAlbComCod_Enabled ;
   private int edtAlbComFch_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtAlbComLin_Enabled ;
   private int edtAlbComDsc_Enabled ;
   private int edtAlbComDc2_Enabled ;
   private int edtAlbComCnt_Enabled ;
   private int edtAlbComUni_Visible ;
   private int edtAlbComUni_Enabled ;
   private int edtAlbComPre_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboalbcomuni_Enabled ;
   private int edtavComboalbcomuni_Visible ;
   private int A10355AlbComHd ;
   private int Combo_albcomuni_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV22GXV1 ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int idxLst ;
   private java.math.BigDecimal Z13AlbComCnt ;
   private java.math.BigDecimal Z21AlbComPre ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A3914AlbCImpL ;
   private java.math.BigDecimal A12AlbCImpLin ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z15AlbComDsc ;
   private String Z10806AlbComDc2 ;
   private String Z10357AlbComP ;
   private String Z5010AlbComProd ;
   private String Combo_albcomuni_Selectedvalue_get ;
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
   private String edtAlbComCod_Internalname ;
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
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String edtAlbComCod_Jsonclick ;
   private String edtAlbComFch_Internalname ;
   private String edtAlbComFch_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtAlbComLin_Internalname ;
   private String edtAlbComLin_Jsonclick ;
   private String edtAlbComDsc_Internalname ;
   private String A15AlbComDsc ;
   private String edtAlbComDsc_Jsonclick ;
   private String edtAlbComDc2_Internalname ;
   private String A10806AlbComDc2 ;
   private String edtAlbComDc2_Jsonclick ;
   private String edtAlbComCnt_Internalname ;
   private String edtAlbComCnt_Jsonclick ;
   private String divTablesplittedalbcomuni_Internalname ;
   private String lblTextblockalbcomuni_Internalname ;
   private String lblTextblockalbcomuni_Jsonclick ;
   private String Combo_albcomuni_Caption ;
   private String Combo_albcomuni_Cls ;
   private String Combo_albcomuni_Internalname ;
   private String edtAlbComUni_Internalname ;
   private String edtAlbComUni_Jsonclick ;
   private String edtAlbComPre_Internalname ;
   private String edtAlbComPre_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV21Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_albcomuni_Internalname ;
   private String edtavComboalbcomuni_Internalname ;
   private String edtavComboalbcomuni_Jsonclick ;
   private String A10357AlbComP ;
   private String A5010AlbComProd ;
   private String A407EmprNom ;
   private String A22AlbComPri ;
   private String A5144AlbUcoDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_albcomuni_Objectcall ;
   private String Combo_albcomuni_Class ;
   private String Combo_albcomuni_Icontype ;
   private String Combo_albcomuni_Icon ;
   private String Combo_albcomuni_Tooltip ;
   private String Combo_albcomuni_Selectedvalue_set ;
   private String Combo_albcomuni_Selectedtext_set ;
   private String Combo_albcomuni_Selectedtext_get ;
   private String Combo_albcomuni_Gamoauthtoken ;
   private String Combo_albcomuni_Ddointernalname ;
   private String Combo_albcomuni_Titlecontrolalign ;
   private String Combo_albcomuni_Dropdownoptionstype ;
   private String Combo_albcomuni_Titlecontrolidtoreplace ;
   private String Combo_albcomuni_Datalisttype ;
   private String Combo_albcomuni_Datalistfixedvalues ;
   private String Combo_albcomuni_Datalistproc ;
   private String Combo_albcomuni_Datalistprocparametersprefix ;
   private String Combo_albcomuni_Remoteservicesparameters ;
   private String Combo_albcomuni_Htmltemplate ;
   private String Combo_albcomuni_Multiplevaluestype ;
   private String Combo_albcomuni_Loadingdata ;
   private String Combo_albcomuni_Noresultsfound ;
   private String Combo_albcomuni_Emptyitemtext ;
   private String Combo_albcomuni_Onlyselectedvalues ;
   private String Combo_albcomuni_Selectalltext ;
   private String Combo_albcomuni_Multiplevaluesseparator ;
   private String Combo_albcomuni_Addnewoptiontext ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode2 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV19EmprNom ;
   private String GXv_char3[] ;
   private String AV20UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z22AlbComPri ;
   private String Z279CliNom ;
   private String Z5144AlbUcoDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date Z17AlbComFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
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
   private boolean Combo_albcomuni_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n5144AlbUcoDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_albcomuni_Enabled ;
   private boolean Combo_albcomuni_Visible ;
   private boolean Combo_albcomuni_Allowmultipleselection ;
   private boolean Combo_albcomuni_Isgriditem ;
   private boolean Combo_albcomuni_Hasdescription ;
   private boolean Combo_albcomuni_Includeonlyselectedoption ;
   private boolean Combo_albcomuni_Includeselectalloption ;
   private boolean Combo_albcomuni_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV16ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_albcomuni ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01UD4_A407EmprNom ;
   private boolean[] T01UD4_n407EmprNom ;
   private java.util.Date[] T01UD5_A17AlbComFch ;
   private String[] T01UD5_A22AlbComPri ;
   private int[] T01UD5_A252CliCod ;
   private String[] T01UD7_A279CliNom ;
   private String[] T01UD6_A5144AlbUcoDsc ;
   private boolean[] T01UD6_n5144AlbUcoDsc ;
   private short[] T01UD8_A20AlbComLin ;
   private String[] T01UD8_A407EmprNom ;
   private boolean[] T01UD8_n407EmprNom ;
   private java.util.Date[] T01UD8_A17AlbComFch ;
   private String[] T01UD8_A22AlbComPri ;
   private String[] T01UD8_A279CliNom ;
   private String[] T01UD8_A15AlbComDsc ;
   private String[] T01UD8_A10806AlbComDc2 ;
   private String[] T01UD8_A5144AlbUcoDsc ;
   private boolean[] T01UD8_n5144AlbUcoDsc ;
   private java.math.BigDecimal[] T01UD8_A13AlbComCnt ;
   private java.math.BigDecimal[] T01UD8_A21AlbComPre ;
   private int[] T01UD8_A10355AlbComHd ;
   private byte[] T01UD8_A10356ALbComR ;
   private String[] T01UD8_A10357AlbComP ;
   private String[] T01UD8_A5010AlbComProd ;
   private String[] T01UD8_A396EmprCod ;
   private int[] T01UD8_A14AlbComCod ;
   private byte[] T01UD8_A4717AlbComUni ;
   private int[] T01UD8_A252CliCod ;
   private java.util.Date[] T01UD9_A17AlbComFch ;
   private String[] T01UD9_A22AlbComPri ;
   private int[] T01UD9_A252CliCod ;
   private String[] T01UD10_A5144AlbUcoDsc ;
   private boolean[] T01UD10_n5144AlbUcoDsc ;
   private String[] T01UD11_A279CliNom ;
   private String[] T01UD12_A396EmprCod ;
   private int[] T01UD12_A14AlbComCod ;
   private short[] T01UD12_A20AlbComLin ;
   private short[] T01UD3_A20AlbComLin ;
   private String[] T01UD3_A15AlbComDsc ;
   private String[] T01UD3_A10806AlbComDc2 ;
   private java.math.BigDecimal[] T01UD3_A13AlbComCnt ;
   private java.math.BigDecimal[] T01UD3_A21AlbComPre ;
   private int[] T01UD3_A10355AlbComHd ;
   private byte[] T01UD3_A10356ALbComR ;
   private String[] T01UD3_A10357AlbComP ;
   private String[] T01UD3_A5010AlbComProd ;
   private String[] T01UD3_A396EmprCod ;
   private int[] T01UD3_A14AlbComCod ;
   private byte[] T01UD3_A4717AlbComUni ;
   private String[] T01UD13_A396EmprCod ;
   private int[] T01UD13_A14AlbComCod ;
   private short[] T01UD13_A20AlbComLin ;
   private String[] T01UD14_A396EmprCod ;
   private int[] T01UD14_A14AlbComCod ;
   private short[] T01UD14_A20AlbComLin ;
   private short[] T01UD2_A20AlbComLin ;
   private String[] T01UD2_A15AlbComDsc ;
   private String[] T01UD2_A10806AlbComDc2 ;
   private java.math.BigDecimal[] T01UD2_A13AlbComCnt ;
   private java.math.BigDecimal[] T01UD2_A21AlbComPre ;
   private int[] T01UD2_A10355AlbComHd ;
   private byte[] T01UD2_A10356ALbComR ;
   private String[] T01UD2_A10357AlbComP ;
   private String[] T01UD2_A5010AlbComProd ;
   private String[] T01UD2_A396EmprCod ;
   private int[] T01UD2_A14AlbComCod ;
   private byte[] T01UD2_A4717AlbComUni ;
   private java.util.Date[] T01UD18_A17AlbComFch ;
   private String[] T01UD18_A22AlbComPri ;
   private int[] T01UD18_A252CliCod ;
   private String[] T01UD19_A5144AlbUcoDsc ;
   private boolean[] T01UD19_n5144AlbUcoDsc ;
   private String[] T01UD20_A279CliNom ;
   private String[] T01UD21_A396EmprCod ;
   private int[] T01UD21_A14AlbComCod ;
   private short[] T01UD21_A20AlbComLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV15AlbComUni_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class documentotransportecomercial_lineas_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_lineas_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_lineas_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_lineas_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_lineas_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UD2", "SELECT AlbComLin, AlbComDsc, AlbComDc2, AlbComCnt, AlbComPre, AlbComHd, ALbComR, AlbComP, AlbComProd, EmprCod, AlbComCod, AlbComUni FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?  FOR UPDATE OF AlbComDsc, AlbComDc2, AlbComCnt, AlbComPre, AlbComHd, ALbComR, AlbComP, AlbComProd, AlbComUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD3", "SELECT AlbComLin, AlbComDsc, AlbComDc2, AlbComCnt, AlbComPre, AlbComHd, ALbComR, AlbComP, AlbComProd, EmprCod, AlbComCod, AlbComUni FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD5", "SELECT AlbComFch, AlbComPri, CliCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD6", "SELECT UniDsc AS AlbUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD8", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbComLin, T2.EmprNom, T3.AlbComFch, T3.AlbComPri, T4.CliNom, TM1.AlbComDsc, TM1.AlbComDc2, T5.UniDsc AS AlbUcoDsc, TM1.AlbComCnt, TM1.AlbComPre, TM1.AlbComHd, TM1.ALbComR, TM1.AlbComP, TM1.AlbComProd, TM1.EmprCod, TM1.AlbComCod, TM1.AlbComUni AS AlbComUni, T3.CliCod FROM ((((TXPLALCOM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCALCOM T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbComCod = TM1.AlbComCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) INNER JOIN TXPTIPUNI T5 ON T5.EmprCod = TM1.EmprCod AND T5.UniCod = TM1.AlbComUni) WHERE TM1.EmprCod = ? and TM1.AlbComCod = ? and TM1.AlbComLin = ? ORDER BY TM1.EmprCod, TM1.AlbComCod, TM1.AlbComLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD9", "SELECT AlbComFch, AlbComPri, CliCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD10", "SELECT UniDsc AS AlbUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE ( EmprCod > ? or EmprCod = ? and AlbComCod > ? or AlbComCod = ? and EmprCod = ? and AlbComLin > ?) ORDER BY EmprCod, AlbComCod, AlbComLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UD14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE ( EmprCod < ? or EmprCod = ? and AlbComCod < ? or AlbComCod = ? and EmprCod = ? and AlbComLin < ?) ORDER BY EmprCod DESC, AlbComCod DESC, AlbComLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UD15", "INSERT INTO TXPLALCOM(AlbComLin, AlbComDsc, AlbComDc2, AlbComCnt, AlbComPre, AlbComHd, ALbComR, AlbComP, AlbComProd, EmprCod, AlbComCod, AlbComUni, AlbComNRef, AlbComVDoc, AlbComPzas, AlbComMts, AlbComKgs, AlbComArt, AlbComArtD, AlbComCol) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, ' ', ' ', ' ')", GX_NOMASK, "TXPLALCOM")
         ,new UpdateCursor("T01UD16", "UPDATE TXPLALCOM SET AlbComDsc=?, AlbComDc2=?, AlbComCnt=?, AlbComPre=?, AlbComHd=?, ALbComR=?, AlbComP=?, AlbComProd=?, AlbComUni=?  WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?", GX_NOMASK, "TXPLALCOM")
         ,new UpdateCursor("T01UD17", "DELETE FROM TXPLALCOM  WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?", GX_NOMASK, "TXPLALCOM")
         ,new ForEachCursor("T01UD18", "SELECT AlbComFch, AlbComPri, CliCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD19", "SELECT UniDsc AS AlbUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD20", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UD21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM ORDER BY EmprCod, AlbComCod, AlbComLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((String[]) buf[7])[0] = rslt.getString(7, 100);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 19 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 100);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 100);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

