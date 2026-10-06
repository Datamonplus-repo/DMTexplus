package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class precioporarticulo____trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A583IntCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_int") == 0 )
      {
         gxnrgridlevel_int_newrow_invoke( ) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
            AV9ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ArtCod", AV9ArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ArtCod, ""))));
            AV10TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10TipColCod), "Z9")));
            AV17CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliNom", AV17CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CliNom, ""))));
            AV18ArtDsc = httpContext.GetPar( "ArtDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ArtDsc", AV18ArtDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18ArtDsc, ""))));
            AV20TipColDsc = httpContext.GetPar( "TipColDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TipColDsc", AV20TipColDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20TipColDsc, ""))));
            AV24ArtPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "ArtPreKgm"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ArtPreKgm", GXutil.ltrimstr( AV24ArtPreKgm, 13, 5));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREKGM", getSecureSignedToken( "", localUtil.format( AV24ArtPreKgm, "ZZZZZZ9.999")));
            AV25ArtPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "ArtPreMtr"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25ArtPreMtr", GXutil.ltrimstr( AV25ArtPreMtr, 13, 5));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREMTR", getSecureSignedToken( "", localUtil.format( AV25ArtPreMtr, "ZZZZZZ9.999")));
            AV26ArtPreDef = httpContext.GetPar( "ArtPreDef") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ArtPreDef", AV26ArtPreDef);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREDEF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ArtPreDef, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Precio por Articulo / Tipo Colorante / Intensidades", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_int_newrow_invoke( )
   {
      nRC_GXsfl_75 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_75"))) ;
      nGXsfl_75_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_75_idx"))) ;
      sGXsfl_75_idx = httpContext.GetPar( "sGXsfl_75_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_int_newrow( ) ;
      /* End function gxnrGridlevel_int_newrow_invoke */
   }

   public precioporarticulo____trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public precioporarticulo____trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporarticulo____trn_impl.class ));
   }

   public precioporarticulo____trn_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavArtpredef = new HTMLChoice();
      chkIntAct = UIFactory.getCheckbox(this);
      cmbIntPreDef = new HTMLChoice();
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
      if ( cmbavArtpredef.getItemCount() > 0 )
      {
         AV26ArtPreDef = cmbavArtpredef.getValidValue(AV26ArtPreDef) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ArtPreDef", AV26ArtPreDef);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREDEF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ArtPreDef, "@!"))));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavArtpredef.setValue( GXutil.rtrim( AV26ArtPreDef) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavArtpredef.getInternalname(), "Values", cmbavArtpredef.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV17CliNom), GXutil.rtrim( localUtil.format( AV17CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavArtcod_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( AV9ArtCod), GXutil.rtrim( localUtil.format( AV9ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtdsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavArtdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavArtdsc_Internalname, GXutil.rtrim( AV18ArtDsc), GXutil.rtrim( localUtil.format( AV18ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtprekgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavArtprekgm_Internalname, httpContext.getMessage( "Preço Kg", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavArtprekgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV24ArtPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavArtprekgm_Enabled!=0) ? localUtil.format( AV24ArtPreKgm, "ZZZZZZ9.999") : localUtil.format( AV24ArtPreKgm, "ZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtprekgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtprekgm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtpremtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavArtpremtr_Internalname, httpContext.getMessage( "Preço Mt", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavArtpremtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV25ArtPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavArtpremtr_Enabled!=0) ? localUtil.format( AV25ArtPreMtr, "ZZZZZZ9.999") : localUtil.format( AV25ArtPreMtr, "ZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtpremtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtpremtr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavArtpredef.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbavArtpredef.getInternalname(), httpContext.getMessage( "D?", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavArtpredef, cmbavArtpredef.getInternalname(), GXutil.rtrim( AV26ArtPreDef), 1, cmbavArtpredef.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavArtpredef.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      cmbavArtpredef.setValue( GXutil.rtrim( AV26ArtPreDef) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavArtpredef.getInternalname(), "Values", cmbavArtpredef.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavTipcolcod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV10TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV10TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcoldsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavTipcoldsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcoldsc_Internalname, GXutil.rtrim( AV20TipColDsc), GXutil.rtrim( localUtil.format( AV20TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcoldsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcoldsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtncopiarprecios_Internalname, "", httpContext.getMessage( "Copiar Precios", ""), bttBtncopiarprecios_Jsonclick, 5, httpContext.getMessage( "Copiar Precios", ""), "", StyleString, ClassString, bttBtncopiarprecios_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCOPIARPRECIOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_int_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "Center", "top", "", "", "div");
      gxdraw_gridlevel_int( ) ;
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV27Pgmname), GXutil.rtrim( localUtil.format( AV27Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo____TRN.htm");
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

   public void gxdraw_gridlevel_int( )
   {
      /*  Grid Control  */
      startgridcontrol75( ) ;
      nGXsfl_75_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount84 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_84 = (short)(1) ;
            scanStart1TX84( ) ;
            while ( RcdFound84 != 0 )
            {
               init_level_properties84( ) ;
               getByPrimaryKey1TX84( ) ;
               addRow1TX84( ) ;
               scanNext1TX84( ) ;
            }
            scanEnd1TX84( ) ;
            nBlankRcdCount84 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1TX84( ) ;
         standaloneModal1TX84( ) ;
         sMode84 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRow1TX84( ) ;
            edtIntCod_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "INTCOD_"+sGXsfl_75_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
            edtIntCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtIntDsc_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "INTDSC_"+sGXsfl_75_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
            edtIntDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTDSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            chkIntAct.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "INTACT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkIntAct.getEnabled(), 5, 0), !bGXsfl_75_Refreshing);
            edtIntPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTPREKGM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntPreKgm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtIntPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTPREMTR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntPreMtr_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            cmbIntPreDef.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "INTPREDEF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbIntPreDef.getInternalname(), "Enabled", GXutil.ltrimstr( cmbIntPreDef.getEnabled(), 5, 0), !bGXsfl_75_Refreshing);
            imgprompt_583_Link = httpContext.cgiGet( "PROMPT_583_"+sGXsfl_75_idx+"Link") ;
            if ( ( nRcdExists_84 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1TX84( ) ;
            }
            sendRow1TX84( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode84 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount84 = (short)(5) ;
         nRcdExists_84 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1TX84( ) ;
            while ( RcdFound84 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_7584( ) ;
               init_level_properties84( ) ;
               standaloneNotModal1TX84( ) ;
               getByPrimaryKey1TX84( ) ;
               standaloneModal1TX84( ) ;
               addRow1TX84( ) ;
               scanNext1TX84( ) ;
            }
            scanEnd1TX84( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode84 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_7584( ) ;
         initAll1TX84( ) ;
         init_level_properties84( ) ;
         nRcdExists_84 = (short)(0) ;
         nIsMod_84 = (short)(0) ;
         nRcdDeleted_84 = (short)(0) ;
         nBlankRcdCount84 = (short)(nBlankRcdUsr84+nBlankRcdCount84) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount84 > 0 )
         {
            standaloneNotModal1TX84( ) ;
            standaloneModal1TX84( ) ;
            addRow1TX84( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount84 = (short)(nBlankRcdCount84-1) ;
         }
         Gx_mode = sMode84 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_intContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_int", Gridlevel_intContainer, subGridlevel_int_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_intContainerData", Gridlevel_intContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_intContainerData"+"V", Gridlevel_intContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_intContainerData"+"V"+"\" value='"+Gridlevel_intContainer.GridValuesHidden()+"'/>") ;
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
      e111TX2 ();
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
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A65ArtCod = httpContext.cgiGet( "ARTCOD") ;
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "TIPCOLCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A69ArtDsc = httpContext.cgiGet( "ARTDSC") ;
            n69ArtDsc = false ;
            A832TipColDsc = httpContext.cgiGet( "TIPCOLDSC") ;
            n832TipColDsc = false ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            A3616PreFacCod = httpContext.cgiGet( "PREFACCOD") ;
            n3616PreFacCod = false ;
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
            AV8CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
            AV17CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliNom", AV17CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CliNom, ""))));
            AV9ArtCod = httpContext.cgiGet( edtavArtcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ArtCod", AV9ArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ArtCod, ""))));
            AV18ArtDsc = httpContext.cgiGet( edtavArtdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ArtDsc", AV18ArtDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18ArtDsc, ""))));
            AV24ArtPreKgm = localUtil.ctond( httpContext.cgiGet( edtavArtprekgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ArtPreKgm", GXutil.ltrimstr( AV24ArtPreKgm, 13, 5));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREKGM", getSecureSignedToken( "", localUtil.format( AV24ArtPreKgm, "ZZZZZZ9.999")));
            AV25ArtPreMtr = localUtil.ctond( httpContext.cgiGet( edtavArtpremtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25ArtPreMtr", GXutil.ltrimstr( AV25ArtPreMtr, 13, 5));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREMTR", getSecureSignedToken( "", localUtil.format( AV25ArtPreMtr, "ZZZZZZ9.999")));
            cmbavArtpredef.setName( cmbavArtpredef.getInternalname() );
            cmbavArtpredef.setValue( httpContext.cgiGet( cmbavArtpredef.getInternalname()) );
            AV26ArtPreDef = httpContext.cgiGet( cmbavArtpredef.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ArtPreDef", AV26ArtPreDef);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREDEF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ArtPreDef, "@!"))));
            AV10TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10TipColCod), "Z9")));
            AV20TipColDsc = httpContext.cgiGet( edtavTipcoldsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TipColDsc", AV20TipColDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20TipColDsc, ""))));
            AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporArticulo____TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\precioporarticulo____trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
                  sMode83 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode83 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound83 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TX0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "");
                     AnyError = (short)(1) ;
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
                        e111TX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOCOPIARPRECIOS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoCopiarPrecios' */
                        e131TX2 ();
                        nKeyPressed = (byte)(3) ;
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
         e121TX2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TX83( ) ;
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
         disableAttributes1TX83( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtdsc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprekgm_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavArtpremtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtpremtr_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbavArtpredef.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavArtpredef.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), true);
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

   public void confirm_1TX0( )
   {
      beforeValidate1TX83( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TX83( ) ;
         }
         else
         {
            checkExtendedTable1TX83( ) ;
            closeExtendedTableCursors1TX83( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode83 = Gx_mode ;
         confirm_1TX84( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode83 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode83 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1TX84( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1TX84( ) ;
         if ( ( nRcdExists_84 != 0 ) || ( nIsMod_84 != 0 ) )
         {
            getKey1TX84( ) ;
            if ( ( nRcdExists_84 == 0 ) && ( nRcdDeleted_84 == 0 ) )
            {
               if ( RcdFound84 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1TX84( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1TX84( ) ;
                     closeExtendedTableCursors1TX84( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "INTCOD_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtIntCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound84 != 0 )
               {
                  if ( nRcdDeleted_84 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1TX84( ) ;
                     load1TX84( ) ;
                     beforeValidate1TX84( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1TX84( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_84 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1TX84( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1TX84( ) ;
                           closeExtendedTableCursors1TX84( ) ;
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
                  if ( nRcdDeleted_84 == 0 )
                  {
                     GXCCtl = "INTCOD_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtIntCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc)) ;
         httpContext.changePostValue( chkIntAct.getInternalname(), ((GXutil.strcmp(A14255IntAct, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtIntPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A586IntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A587IntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbIntPreDef.getInternalname(), GXutil.rtrim( A585IntPreDef)) ;
         httpContext.changePostValue( "ZT_"+"Z583IntCod_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z586IntPreKgm_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z586IntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z587IntPreMtr_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z587IntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z585IntPreDef_"+sGXsfl_75_idx, GXutil.rtrim( Z585IntPreDef)) ;
         httpContext.changePostValue( "ZT_"+"Z3616PreFacCod_"+sGXsfl_75_idx, GXutil.rtrim( Z3616PreFacCod)) ;
         httpContext.changePostValue( "nRcdDeleted_84_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_84, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_84_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_84, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_84_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_84, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_84 != 0 )
         {
            httpContext.changePostValue( "INTCOD_"+sGXsfl_75_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtIntCod_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDSC_"+sGXsfl_75_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTACT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkIntAct.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTPREKGM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTPREMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTPREDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbIntPreDef.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1TX0( )
   {
   }

   public void e111TX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV21Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      precioporarticulo____trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Station", AV21Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char2, GXv_char3, GXv_char4) ;
      precioporarticulo____trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      precioporarticulo____trn_impl.this.AV22EmprNom = GXv_char3[0] ;
      precioporarticulo____trn_impl.this.AV23UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprNom", AV22EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
      GXv_SdtWWPContext5[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV11WWPContext = GXv_SdtWWPContext5[0] ;
      AV12TrnContext.fromxml(AV13WebSession.getValue("TrnContext"), null, null);
   }

   public void e121TX2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e131TX2( )
   {
      /* 'DoCopiarPrecios' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.facturacion.copiarprecios_1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV18ArtDsc))}, new String[] {"emprcod","CliCod","ArtCod","ArtDsc"}) , new Object[] {});
   }

   public void zm1TX83( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -14 )
      {
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z832TipColDsc = A832TipColDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV27Pgmname = "Facturacion.PrecioporArticulo____TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TX7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TX7_A407EmprNom[0] ;
      n407EmprNom = T01TX7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV8CliCod) )
      {
         A252CliCod = AV8CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Using cursor T01TX8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01TX8_A279CliNom[0] ;
      pr_default.close(6);
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         A65ArtCod = AV9ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Using cursor T01TX9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T01TX9_A69ArtDsc[0] ;
      n69ArtDsc = T01TX9_n69ArtDsc[0] ;
      pr_default.close(7);
      if ( ! (0==AV10TipColCod) )
      {
         A831TipColCod = AV10TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      /* Using cursor T01TX10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T01TX10_A832TipColDsc[0] ;
      n832TipColDsc = T01TX10_n832TipColDsc[0] ;
      pr_default.close(8);
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

   public void load1TX83( )
   {
      /* Using cursor T01TX11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound83 = (short)(1) ;
         A407EmprNom = T01TX11_A407EmprNom[0] ;
         n407EmprNom = T01TX11_n407EmprNom[0] ;
         A279CliNom = T01TX11_A279CliNom[0] ;
         A69ArtDsc = T01TX11_A69ArtDsc[0] ;
         n69ArtDsc = T01TX11_n69ArtDsc[0] ;
         A832TipColDsc = T01TX11_A832TipColDsc[0] ;
         n832TipColDsc = T01TX11_n832TipColDsc[0] ;
         zm1TX83( -14) ;
      }
      pr_default.close(9);
      onLoadActions1TX83( ) ;
   }

   public void onLoadActions1TX83( )
   {
   }

   public void checkExtendedTable1TX83( )
   {
      nIsDirty_83 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1TX83( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1TX83( )
   {
      /* Using cursor T01TX12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound83 = (short)(1) ;
      }
      else
      {
         RcdFound83 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TX6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1TX83( 14) ;
         RcdFound83 = (short)(1) ;
         A396EmprCod = T01TX6_A396EmprCod[0] ;
         A252CliCod = T01TX6_A252CliCod[0] ;
         A65ArtCod = T01TX6_A65ArtCod[0] ;
         A831TipColCod = T01TX6_A831TipColCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         sMode83 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TX83( ) ;
         if ( AnyError == 1 )
         {
            RcdFound83 = (short)(0) ;
            initializeNonKey1TX83( ) ;
         }
         Gx_mode = sMode83 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound83 = (short)(0) ;
         initializeNonKey1TX83( ) ;
         sMode83 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode83 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1TX83( ) ;
      if ( RcdFound83 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound83 = (short)(0) ;
      /* Using cursor T01TX13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01TX13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TX13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TX13_A252CliCod[0] < A252CliCod ) || ( T01TX13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TX13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TX13_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01TX13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TX13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TX13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TX13_A831TipColCod[0] < A831TipColCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01TX13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TX13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TX13_A252CliCod[0] > A252CliCod ) || ( T01TX13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TX13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TX13_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01TX13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TX13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TX13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TX13_A831TipColCod[0] > A831TipColCod ) ) )
         {
            A396EmprCod = T01TX13_A396EmprCod[0] ;
            A252CliCod = T01TX13_A252CliCod[0] ;
            A65ArtCod = T01TX13_A65ArtCod[0] ;
            A831TipColCod = T01TX13_A831TipColCod[0] ;
            RcdFound83 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound83 = (short)(0) ;
      /* Using cursor T01TX14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01TX14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TX14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TX14_A252CliCod[0] > A252CliCod ) || ( T01TX14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TX14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TX14_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01TX14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TX14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TX14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TX14_A831TipColCod[0] > A831TipColCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01TX14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TX14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TX14_A252CliCod[0] < A252CliCod ) || ( T01TX14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TX14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TX14_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01TX14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01TX14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01TX14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TX14_A831TipColCod[0] < A831TipColCod ) ) )
         {
            A396EmprCod = T01TX14_A396EmprCod[0] ;
            A252CliCod = T01TX14_A252CliCod[0] ;
            A65ArtCod = T01TX14_A65ArtCod[0] ;
            A831TipColCod = T01TX14_A831TipColCod[0] ;
            RcdFound83 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TX83( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1TX83( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound83 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A831TipColCod = Z831TipColCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               update1TX83( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
            {
               /* Insert record */
               insert1TX83( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  /* Insert record */
                  insert1TX83( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A831TipColCod = Z831TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "");
         AnyError = (short)(1) ;
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TX83( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TX5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRETCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRETCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TX83( )
   {
      beforeValidate1TX83( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TX83( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TX83( 0) ;
         checkOptimisticConcurrency1TX83( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TX83( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TX83( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TX15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETCO");
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
                        processLevel1TX83( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1TX0( ) ;
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
            load1TX83( ) ;
         }
         endLevel1TX83( ) ;
      }
      closeExtendedTableCursors1TX83( ) ;
   }

   public void update1TX83( )
   {
      beforeValidate1TX83( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TX83( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TX83( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TX83( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TX83( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPPRETCO */
                  deferredUpdate1TX83( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1TX83( ) ;
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
         endLevel1TX83( ) ;
      }
      closeExtendedTableCursors1TX83( ) ;
   }

   public void deferredUpdate1TX83( )
   {
   }

   public void delete( )
   {
      beforeValidate1TX83( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TX83( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TX83( ) ;
         afterConfirm1TX83( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TX83( ) ;
            if ( AnyError == 0 )
            {
               scanStart1TX84( ) ;
               while ( RcdFound84 != 0 )
               {
                  getByPrimaryKey1TX84( ) ;
                  delete1TX84( ) ;
                  scanNext1TX84( ) ;
               }
               scanEnd1TX84( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TX16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETCO");
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
      sMode83 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TX83( ) ;
      Gx_mode = sMode83 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TX83( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01TX17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Precios. Rec/Bon por Intensida", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1TX84( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1TX84( ) ;
         if ( ( nRcdExists_84 != 0 ) || ( nIsMod_84 != 0 ) )
         {
            standaloneNotModal1TX84( ) ;
            getKey1TX84( ) ;
            if ( ( nRcdExists_84 == 0 ) && ( nRcdDeleted_84 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1TX84( ) ;
            }
            else
            {
               if ( RcdFound84 != 0 )
               {
                  if ( ( nRcdDeleted_84 != 0 ) && ( nRcdExists_84 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1TX84( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_84 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1TX84( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_84 == 0 )
                  {
                     GXCCtl = "INTCOD_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtIntCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc)) ;
         httpContext.changePostValue( chkIntAct.getInternalname(), ((GXutil.strcmp(A14255IntAct, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtIntPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A586IntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtIntPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A587IntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbIntPreDef.getInternalname(), GXutil.rtrim( A585IntPreDef)) ;
         httpContext.changePostValue( "ZT_"+"Z583IntCod_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z586IntPreKgm_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z586IntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z587IntPreMtr_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z587IntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z585IntPreDef_"+sGXsfl_75_idx, GXutil.rtrim( Z585IntPreDef)) ;
         httpContext.changePostValue( "ZT_"+"Z3616PreFacCod_"+sGXsfl_75_idx, GXutil.rtrim( Z3616PreFacCod)) ;
         httpContext.changePostValue( "nRcdDeleted_84_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_84, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_84_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_84, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_84_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_84, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_84 != 0 )
         {
            httpContext.changePostValue( "INTCOD_"+sGXsfl_75_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtIntCod_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDSC_"+sGXsfl_75_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTDSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTACT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkIntAct.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTPREKGM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTPREMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INTPREDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbIntPreDef.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1TX84( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_84 = (short)(0) ;
      nIsMod_84 = (short)(0) ;
      nRcdDeleted_84 = (short)(0) ;
   }

   public void processLevel1TX83( )
   {
      /* Save parent mode. */
      sMode83 = Gx_mode ;
      processNestedLevel1TX84( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode83 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1TX83( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TX83( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.precioporarticulo____trn");
         if ( AnyError == 0 )
         {
            confirmValues1TX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.precioporarticulo____trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TX83( )
   {
      /* Scan By routine */
      /* Using cursor T01TX18 */
      pr_default.execute(16);
      RcdFound83 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound83 = (short)(1) ;
         A396EmprCod = T01TX18_A396EmprCod[0] ;
         A252CliCod = T01TX18_A252CliCod[0] ;
         A65ArtCod = T01TX18_A65ArtCod[0] ;
         A831TipColCod = T01TX18_A831TipColCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TX83( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound83 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound83 = (short)(1) ;
         A396EmprCod = T01TX18_A396EmprCod[0] ;
         A252CliCod = T01TX18_A252CliCod[0] ;
         A65ArtCod = T01TX18_A65ArtCod[0] ;
         A831TipColCod = T01TX18_A831TipColCod[0] ;
      }
   }

   public void scanEnd1TX83( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1TX83( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TX83( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TX83( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TX83( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TX83( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TX83( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TX83( )
   {
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      edtavArtdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtdsc_Enabled), 5, 0), true);
      edtavArtprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprekgm_Enabled), 5, 0), true);
      edtavArtpremtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtpremtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtpremtr_Enabled), 5, 0), true);
      cmbavArtpredef.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavArtpredef.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavArtpredef.getEnabled(), 5, 0), true);
      edtavTipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_Enabled), 5, 0), true);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1TX84( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z586IntPreKgm = T01TX3_A586IntPreKgm[0] ;
            Z587IntPreMtr = T01TX3_A587IntPreMtr[0] ;
            Z585IntPreDef = T01TX3_A585IntPreDef[0] ;
            Z3616PreFacCod = T01TX3_A3616PreFacCod[0] ;
         }
         else
         {
            Z586IntPreKgm = A586IntPreKgm ;
            Z587IntPreMtr = A587IntPreMtr ;
            Z585IntPreDef = A585IntPreDef ;
            Z3616PreFacCod = A3616PreFacCod ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         Z586IntPreKgm = A586IntPreKgm ;
         Z587IntPreMtr = A587IntPreMtr ;
         Z585IntPreDef = A585IntPreDef ;
         Z3616PreFacCod = A3616PreFacCod ;
         Z396EmprCod = A396EmprCod ;
         Z583IntCod = A583IntCod ;
         Z584IntDsc = A584IntDsc ;
         Z14255IntAct = A14255IntAct ;
      }
   }

   public void standaloneNotModal1TX84( )
   {
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      chkIntAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkIntAct.getEnabled(), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void standaloneModal1TX84( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtIntCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtIntCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void load1TX84( )
   {
      /* Using cursor T01TX19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound84 = (short)(1) ;
         A584IntDsc = T01TX19_A584IntDsc[0] ;
         n584IntDsc = T01TX19_n584IntDsc[0] ;
         A14255IntAct = T01TX19_A14255IntAct[0] ;
         A586IntPreKgm = T01TX19_A586IntPreKgm[0] ;
         n586IntPreKgm = T01TX19_n586IntPreKgm[0] ;
         A587IntPreMtr = T01TX19_A587IntPreMtr[0] ;
         n587IntPreMtr = T01TX19_n587IntPreMtr[0] ;
         A585IntPreDef = T01TX19_A585IntPreDef[0] ;
         n585IntPreDef = T01TX19_n585IntPreDef[0] ;
         A3616PreFacCod = T01TX19_A3616PreFacCod[0] ;
         n3616PreFacCod = T01TX19_n3616PreFacCod[0] ;
         zm1TX84( -19) ;
      }
      pr_default.close(17);
      onLoadActions1TX84( ) ;
   }

   public void onLoadActions1TX84( )
   {
      if ( GXutil.strcmp(A14255IntAct, "N") == 0 )
      {
         edtIntCod_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
      }
      if ( GXutil.strcmp(A14255IntAct, "N") == 0 )
      {
         edtIntDsc_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void checkExtendedTable1TX84( )
   {
      nIsDirty_84 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1TX84( ) ;
      /* Using cursor T01TX4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "INTCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01TX4_A584IntDsc[0] ;
      n584IntDsc = T01TX4_n584IntDsc[0] ;
      A14255IntAct = T01TX4_A14255IntAct[0] ;
      pr_default.close(2);
      if ( GXutil.strcmp(A14255IntAct, "N") == 0 )
      {
         edtIntCod_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
      }
      if ( GXutil.strcmp(A14255IntAct, "N") == 0 )
      {
         edtIntDsc_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "INTCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Intensidad INACTIVA", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A585IntPreDef, "S") == 0 ) || ( GXutil.strcmp(A585IntPreDef, "N") == 0 ) ) )
      {
         GXCCtl = "INTPREDEF_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Precio Definitivo intensidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbIntPreDef.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1TX84( )
   {
      pr_default.close(2);
   }

   public void enableDisable1TX84( )
   {
   }

   public void gxload_20( String A396EmprCod ,
                          byte A583IntCod )
   {
      /* Using cursor T01TX20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "INTCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01TX20_A584IntDsc[0] ;
      n584IntDsc = T01TX20_n584IntDsc[0] ;
      A14255IntAct = T01TX20_A14255IntAct[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A584IntDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14255IntAct))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1TX84( )
   {
      /* Using cursor T01TX21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound84 = (short)(1) ;
      }
      else
      {
         RcdFound84 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1TX84( )
   {
      /* Using cursor T01TX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TX84( 19) ;
         RcdFound84 = (short)(1) ;
         initializeNonKey1TX84( ) ;
         A586IntPreKgm = T01TX3_A586IntPreKgm[0] ;
         n586IntPreKgm = T01TX3_n586IntPreKgm[0] ;
         A587IntPreMtr = T01TX3_A587IntPreMtr[0] ;
         n587IntPreMtr = T01TX3_n587IntPreMtr[0] ;
         A585IntPreDef = T01TX3_A585IntPreDef[0] ;
         n585IntPreDef = T01TX3_n585IntPreDef[0] ;
         A3616PreFacCod = T01TX3_A3616PreFacCod[0] ;
         n3616PreFacCod = T01TX3_n3616PreFacCod[0] ;
         A583IntCod = T01TX3_A583IntCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         Z583IntCod = A583IntCod ;
         sMode84 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TX84( ) ;
         Gx_mode = sMode84 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound84 = (short)(0) ;
         initializeNonKey1TX84( ) ;
         sMode84 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TX84( ) ;
         Gx_mode = sMode84 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1TX84( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1TX84( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRETIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z586IntPreKgm, T01TX2_A586IntPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z587IntPreMtr, T01TX2_A587IntPreMtr[0]) != 0 ) || ( GXutil.strcmp(Z585IntPreDef, T01TX2_A585IntPreDef[0]) != 0 ) || ( GXutil.strcmp(Z3616PreFacCod, T01TX2_A3616PreFacCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z586IntPreKgm, T01TX2_A586IntPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.precioporarticulo____trn:[seudo value changed for attri]"+"IntPreKgm");
               GXutil.writeLogRaw("Old: ",Z586IntPreKgm);
               GXutil.writeLogRaw("Current: ",T01TX2_A586IntPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z587IntPreMtr, T01TX2_A587IntPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.precioporarticulo____trn:[seudo value changed for attri]"+"IntPreMtr");
               GXutil.writeLogRaw("Old: ",Z587IntPreMtr);
               GXutil.writeLogRaw("Current: ",T01TX2_A587IntPreMtr[0]);
            }
            if ( GXutil.strcmp(Z585IntPreDef, T01TX2_A585IntPreDef[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.precioporarticulo____trn:[seudo value changed for attri]"+"IntPreDef");
               GXutil.writeLogRaw("Old: ",Z585IntPreDef);
               GXutil.writeLogRaw("Current: ",T01TX2_A585IntPreDef[0]);
            }
            if ( GXutil.strcmp(Z3616PreFacCod, T01TX2_A3616PreFacCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.precioporarticulo____trn:[seudo value changed for attri]"+"PreFacCod");
               GXutil.writeLogRaw("Old: ",Z3616PreFacCod);
               GXutil.writeLogRaw("Current: ",T01TX2_A3616PreFacCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRETIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TX84( )
   {
      beforeValidate1TX84( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TX84( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TX84( 0) ;
         checkOptimisticConcurrency1TX84( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TX84( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TX84( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TX22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Boolean.valueOf(n586IntPreKgm), A586IntPreKgm, Boolean.valueOf(n587IntPreMtr), A587IntPreMtr, Boolean.valueOf(n585IntPreDef), A585IntPreDef, Boolean.valueOf(n3616PreFacCod), A3616PreFacCod, A396EmprCod, Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1TX84( ) ;
         }
         endLevel1TX84( ) ;
      }
      closeExtendedTableCursors1TX84( ) ;
   }

   public void update1TX84( )
   {
      beforeValidate1TX84( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TX84( ) ;
      }
      if ( ( nIsMod_84 != 0 ) || ( nIsDirty_84 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1TX84( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1TX84( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1TX84( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01TX23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n586IntPreKgm), A586IntPreKgm, Boolean.valueOf(n587IntPreMtr), A587IntPreMtr, Boolean.valueOf(n585IntPreDef), A585IntPreDef, Boolean.valueOf(n3616PreFacCod), A3616PreFacCod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRETIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1TX84( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1TX84( ) ;
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
            endLevel1TX84( ) ;
         }
      }
      closeExtendedTableCursors1TX84( ) ;
   }

   public void deferredUpdate1TX84( )
   {
   }

   public void delete1TX84( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TX84( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TX84( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TX84( ) ;
         afterConfirm1TX84( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TX84( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TX24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
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
      sMode84 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TX84( ) ;
      Gx_mode = sMode84 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TX84( )
   {
      standaloneModal1TX84( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TX25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
         A584IntDsc = T01TX25_A584IntDsc[0] ;
         n584IntDsc = T01TX25_n584IntDsc[0] ;
         A14255IntAct = T01TX25_A14255IntAct[0] ;
         pr_default.close(23);
         if ( GXutil.strcmp(A14255IntAct, "N") == 0 )
         {
            edtIntCod_Forecolor = GXutil.getColor( 255, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
         }
         if ( GXutil.strcmp(A14255IntAct, "N") == 0 )
         {
            edtIntDsc_Forecolor = GXutil.getColor( 255, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TX26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01TX27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Precios. Rec/Bon por Intensida", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void endLevel1TX84( )
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

   public void scanStart1TX84( )
   {
      /* Scan By routine */
      /* Using cursor T01TX28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
      RcdFound84 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound84 = (short)(1) ;
         A583IntCod = T01TX28_A583IntCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TX84( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound84 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound84 = (short)(1) ;
         A583IntCod = T01TX28_A583IntCod[0] ;
      }
   }

   public void scanEnd1TX84( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1TX84( )
   {
      /* After Confirm Rules */
      if ( (0==A583IntCod) && true /* After */ )
      {
         GXCCtl = "INTCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo no Valido", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1TX84( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TX84( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TX84( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TX84( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TX84( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TX84( )
   {
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      chkIntAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkIntAct.getEnabled(), 5, 0), !bGXsfl_75_Refreshing);
      edtIntPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntPreKgm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtIntPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntPreMtr_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      cmbIntPreDef.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbIntPreDef.getInternalname(), "Enabled", GXutil.ltrimstr( cmbIntPreDef.getEnabled(), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashes1TX84( )
   {
   }

   public void send_integrity_lvl_hashes1TX83( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18ArtDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20TipColDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREKGM", getSecureSignedToken( "", localUtil.format( AV24ArtPreKgm, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREMTR", getSecureSignedToken( "", localUtil.format( AV25ArtPreMtr, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREDEF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ArtPreDef, "@!"))));
   }

   public void subsflControlProps_7584( )
   {
      edtIntCod_Internalname = "INTCOD_"+sGXsfl_75_idx ;
      imgprompt_583_Internalname = "PROMPT_583_"+sGXsfl_75_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_75_idx ;
      chkIntAct.setInternalname( "INTACT_"+sGXsfl_75_idx );
      edtIntPreKgm_Internalname = "INTPREKGM_"+sGXsfl_75_idx ;
      edtIntPreMtr_Internalname = "INTPREMTR_"+sGXsfl_75_idx ;
      cmbIntPreDef.setInternalname( "INTPREDEF_"+sGXsfl_75_idx );
   }

   public void subsflControlProps_fel_7584( )
   {
      edtIntCod_Internalname = "INTCOD_"+sGXsfl_75_fel_idx ;
      imgprompt_583_Internalname = "PROMPT_583_"+sGXsfl_75_fel_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_75_fel_idx ;
      chkIntAct.setInternalname( "INTACT_"+sGXsfl_75_fel_idx );
      edtIntPreKgm_Internalname = "INTPREKGM_"+sGXsfl_75_fel_idx ;
      edtIntPreMtr_Internalname = "INTPREMTR_"+sGXsfl_75_fel_idx ;
      cmbIntPreDef.setInternalname( "INTPREDEF_"+sGXsfl_75_fel_idx );
   }

   public void addRow1TX84( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7584( ) ;
      sendRow1TX84( ) ;
   }

   public void sendRow1TX84( )
   {
      Gridlevel_intRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_int_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_int_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_int_Class, "") != 0 )
         {
            subGridlevel_int_Linesclass = subGridlevel_int_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_int_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_int_Backstyle = (byte)(0) ;
         subGridlevel_int_Backcolor = subGridlevel_int_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_int_Class, "") != 0 )
         {
            subGridlevel_int_Linesclass = subGridlevel_int_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_int_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_int_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_int_Class, "") != 0 )
         {
            subGridlevel_int_Linesclass = subGridlevel_int_Class+"Odd" ;
         }
         subGridlevel_int_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_int_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_int_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
         {
            subGridlevel_int_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_int_Class, "") != 0 )
            {
               subGridlevel_int_Linesclass = subGridlevel_int_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_int_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_int_Class, "") != 0 )
            {
               subGridlevel_int_Linesclass = subGridlevel_int_Class+"Odd" ;
            }
         }
      }
      imgprompt_583_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tintensprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"INTCOD_"+sGXsfl_75_idx+"'), id:'"+"INTCOD_"+sGXsfl_75_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"INTDSC_"+sGXsfl_75_idx+"'), id:'"+"INTDSC_"+sGXsfl_75_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_84_"+sGXsfl_75_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_84_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_intRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntCod_Internalname,GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntCod_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtIntCod_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtIntCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_583_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_583_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_intRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_583_Internalname,sImgUrl,imgprompt_583_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_583_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_intRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDsc_Internalname,GXutil.rtrim( A584IntDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntDsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtIntDsc_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtIntDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "INTACT_" + sGXsfl_75_idx ;
      chkIntAct.setName( GXCCtl );
      chkIntAct.setWebtags( "" );
      chkIntAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "TitleCaption", chkIntAct.getCaption(), !bGXsfl_75_Refreshing);
      chkIntAct.setCheckedValue( "N" );
      A14255IntAct = ((GXutil.strcmp(GXutil.rtrim( A14255IntAct), "S")==0) ? "S" : "N") ;
      Gridlevel_intRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkIntAct.getInternalname(),A14255IntAct,"","",Integer.valueOf(-1),Integer.valueOf(chkIntAct.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_84_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_intRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A586IntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtIntPreKgm_Enabled!=0) ? localUtil.format( A586IntPreKgm, "ZZZZZZ9.999") : localUtil.format( A586IntPreKgm, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntPreKgm_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtIntPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_84_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_intRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A587IntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtIntPreMtr_Enabled!=0) ? localUtil.format( A587IntPreMtr, "ZZZZZZ9.999") : localUtil.format( A587IntPreMtr, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtIntPreMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_84_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      if ( ( cmbIntPreDef.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "INTPREDEF_" + sGXsfl_75_idx ;
         cmbIntPreDef.setName( GXCCtl );
         cmbIntPreDef.setWebtags( "" );
         cmbIntPreDef.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
         cmbIntPreDef.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
         if ( cmbIntPreDef.getItemCount() > 0 )
         {
            A585IntPreDef = cmbIntPreDef.getValidValue(A585IntPreDef) ;
            n585IntPreDef = false ;
         }
      }
      /* ComboBox */
      Gridlevel_intRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbIntPreDef,cmbIntPreDef.getInternalname(),GXutil.rtrim( A585IntPreDef),Integer.valueOf(1),cmbIntPreDef.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbIntPreDef.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","AttributeWidth100Porc","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbIntPreDef.setValue( GXutil.rtrim( A585IntPreDef) );
      httpContext.ajax_rsp_assign_prop("", false, cmbIntPreDef.getInternalname(), "Values", cmbIntPreDef.ToJavascriptSource(), !bGXsfl_75_Refreshing);
      httpContext.ajax_sending_grid_row(Gridlevel_intRow);
      send_integrity_lvl_hashes1TX84( ) ;
      GXCCtl = "Z583IntCod_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z586IntPreKgm_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z586IntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z587IntPreMtr_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z587IntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z585IntPreDef_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z585IntPreDef));
      GXCCtl = "Z3616PreFacCod_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3616PreFacCod));
      GXCCtl = "nRcdDeleted_84_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_84, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_84_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_84, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_84_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_84, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vMODE_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "EMPRCOD_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "CLICOD_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "ARTCOD_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A65ArtCod));
      GXCCtl = "TIPCOLCOD_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTCOD_"+sGXsfl_75_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtIntCod_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTDSC_"+sGXsfl_75_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTDSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTACT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkIntAct.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTPREKGM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTPREMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtIntPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTPREDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbIntPreDef.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_583_"+sGXsfl_75_idx+"Link", GXutil.rtrim( imgprompt_583_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_intContainer.AddRow(Gridlevel_intRow);
   }

   public void readRow1TX84( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7584( ) ;
      edtIntCod_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "INTCOD_"+sGXsfl_75_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIntCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIntDsc_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "INTDSC_"+sGXsfl_75_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIntDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTDSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkIntAct.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "INTACT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtIntPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTPREKGM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtIntPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INTPREMTR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbIntPreDef.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "INTPREDEF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      imgprompt_583_Link = httpContext.cgiGet( "PROMPT_583_"+sGXsfl_75_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "INTCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         wbErr = true ;
         A583IntCod = (byte)(0) ;
      }
      else
      {
         A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
      n584IntDsc = false ;
      A14255IntAct = ((GXutil.strcmp(httpContext.cgiGet( chkIntAct.getInternalname()), "S")==0) ? "S" : "N") ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIntPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIntPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "INTPREKGM_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntPreKgm_Internalname ;
         wbErr = true ;
         A586IntPreKgm = DecimalUtil.ZERO ;
         n586IntPreKgm = false ;
      }
      else
      {
         A586IntPreKgm = localUtil.ctond( httpContext.cgiGet( edtIntPreKgm_Internalname)) ;
         n586IntPreKgm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIntPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIntPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "INTPREMTR_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntPreMtr_Internalname ;
         wbErr = true ;
         A587IntPreMtr = DecimalUtil.ZERO ;
         n587IntPreMtr = false ;
      }
      else
      {
         A587IntPreMtr = localUtil.ctond( httpContext.cgiGet( edtIntPreMtr_Internalname)) ;
         n587IntPreMtr = false ;
      }
      cmbIntPreDef.setName( cmbIntPreDef.getInternalname() );
      cmbIntPreDef.setValue( httpContext.cgiGet( cmbIntPreDef.getInternalname()) );
      A585IntPreDef = httpContext.cgiGet( cmbIntPreDef.getInternalname()) ;
      n585IntPreDef = false ;
      GXCCtl = "Z583IntCod_" + sGXsfl_75_idx ;
      Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z586IntPreKgm_" + sGXsfl_75_idx ;
      Z586IntPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z587IntPreMtr_" + sGXsfl_75_idx ;
      Z587IntPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z585IntPreDef_" + sGXsfl_75_idx ;
      Z585IntPreDef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3616PreFacCod_" + sGXsfl_75_idx ;
      Z3616PreFacCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3616PreFacCod_" + sGXsfl_75_idx ;
      A3616PreFacCod = httpContext.cgiGet( GXCCtl) ;
      n3616PreFacCod = false ;
      GXCCtl = "nRcdDeleted_84_" + sGXsfl_75_idx ;
      nRcdDeleted_84 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_84_" + sGXsfl_75_idx ;
      nRcdExists_84 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_84_" + sGXsfl_75_idx ;
      nIsMod_84 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defchkIntAct_Enabled = chkIntAct.getEnabled() ;
      defedtIntDsc_Enabled = edtIntDsc_Enabled ;
      defedtIntDsc_Forecolor = edtIntDsc_Forecolor ;
      defedtIntCod_Enabled = edtIntCod_Enabled ;
      defedtIntCod_Forecolor = edtIntCod_Forecolor ;
   }

   public void confirmValues1TX0( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7584( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_7584( ) ;
         httpContext.changePostValue( "Z583IntCod_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z583IntCod_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z583IntCod_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z586IntPreKgm_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z586IntPreKgm_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z586IntPreKgm_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z587IntPreMtr_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z587IntPreMtr_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z587IntPreMtr_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z585IntPreDef_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z585IntPreDef_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z585IntPreDef_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z3616PreFacCod_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z3616PreFacCod_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3616PreFacCod_"+sGXsfl_75_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.precioporarticulo____trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV17CliNom)),GXutil.URLEncode(GXutil.rtrim(AV18ArtDsc)),GXutil.URLEncode(GXutil.rtrim(AV20TipColDsc)),GXutil.URLEncode(DecimalUtil.decToString(AV24ArtPreKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV25ArtPreMtr)),GXutil.URLEncode(GXutil.rtrim(AV26ArtPreDef))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","TipColCod","CliNom","ArtDsc","TipColDsc","ArtPreKgm","ArtPreMtr","ArtPreDef"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18ArtDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20TipColDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREKGM", getSecureSignedToken( "", localUtil.format( AV24ArtPreKgm, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREMTR", getSecureSignedToken( "", localUtil.format( AV25ArtPreMtr, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREDEF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ArtPreDef, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporArticulo____TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precioporarticulo____trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTDSC", GXutil.rtrim( A69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLDSC", GXutil.rtrim( A832TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "PREFACCOD", GXutil.rtrim( A3616PreFacCod));
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
      return formatLink("app.facturacion.precioporarticulo____trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV17CliNom)),GXutil.URLEncode(GXutil.rtrim(AV18ArtDsc)),GXutil.URLEncode(GXutil.rtrim(AV20TipColDsc)),GXutil.URLEncode(DecimalUtil.decToString(AV24ArtPreKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV25ArtPreMtr)),GXutil.URLEncode(GXutil.rtrim(AV26ArtPreDef))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","TipColCod","CliNom","ArtDsc","TipColDsc","ArtPreKgm","ArtPreMtr","ArtPreDef"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.PrecioporArticulo____TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precio por Articulo / Tipo Colorante / Intensidades", "") ;
   }

   public void initializeNonKey1TX83( )
   {
   }

   public void initAll1TX83( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A831TipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      initializeNonKey1TX83( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1TX84( )
   {
      A584IntDsc = "" ;
      n584IntDsc = false ;
      A14255IntAct = "" ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      n586IntPreKgm = false ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      n587IntPreMtr = false ;
      A585IntPreDef = "" ;
      n585IntPreDef = false ;
      A3616PreFacCod = "" ;
      n3616PreFacCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3616PreFacCod", A3616PreFacCod);
      Z586IntPreKgm = DecimalUtil.ZERO ;
      Z587IntPreMtr = DecimalUtil.ZERO ;
      Z585IntPreDef = "" ;
      Z3616PreFacCod = "" ;
   }

   public void initAll1TX84( )
   {
      A583IntCod = (byte)(0) ;
      initializeNonKey1TX84( ) ;
   }

   public void standaloneModalInsert1TX84( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102087", true, true);
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
      httpContext.AddJavascriptSource("facturacion/precioporarticulo____trn.js", "?202682116102087", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties84( )
   {
      chkIntAct.setEnabled( defchkIntAct_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkIntAct.getEnabled(), 5, 0), !bGXsfl_75_Refreshing);
      edtIntDsc_Enabled = defedtIntDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtIntDsc_Forecolor = defedtIntDsc_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
      edtIntCod_Enabled = defedtIntCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtIntCod_Forecolor = defedtIntCod_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
   }

   public void startgridcontrol75( )
   {
      Gridlevel_intContainer.AddObjectProperty("GridName", "Gridlevel_int");
      Gridlevel_intContainer.AddObjectProperty("Header", subGridlevel_int_Header);
      Gridlevel_intContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_intContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_int_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_intContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_intColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_intColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_intColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtIntCod_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_intColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddColumnProperties(Gridlevel_intColumn);
      Gridlevel_intColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_intContainer.AddColumnProperties(Gridlevel_intColumn);
      Gridlevel_intColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_intColumn.AddObjectProperty("Value", GXutil.rtrim( A584IntDsc));
      Gridlevel_intColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_intColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddColumnProperties(Gridlevel_intColumn);
      Gridlevel_intColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_intColumn.AddObjectProperty("Value", GXutil.rtrim( A14255IntAct));
      Gridlevel_intColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkIntAct.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddColumnProperties(Gridlevel_intColumn);
      Gridlevel_intColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_intColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A586IntPreKgm, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_intColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddColumnProperties(Gridlevel_intColumn);
      Gridlevel_intColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_intColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A587IntPreMtr, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_intColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtIntPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddColumnProperties(Gridlevel_intColumn);
      Gridlevel_intColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_intColumn.AddObjectProperty("Value", GXutil.rtrim( A585IntPreDef));
      Gridlevel_intColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbIntPreDef.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddColumnProperties(Gridlevel_intColumn);
      Gridlevel_intContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_int_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_int_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_int_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_int_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_int_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_int_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_intContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_int_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavArtcod_Internalname = "vARTCOD" ;
      edtavArtdsc_Internalname = "vARTDSC" ;
      edtavArtprekgm_Internalname = "vARTPREKGM" ;
      edtavArtpremtr_Internalname = "vARTPREMTR" ;
      cmbavArtpredef.setInternalname( "vARTPREDEF" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavTipcolcod_Internalname = "vTIPCOLCOD" ;
      edtavTipcoldsc_Internalname = "vTIPCOLDSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtncopiarprecios_Internalname = "BTNCOPIARPRECIOS" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtIntCod_Internalname = "INTCOD" ;
      edtIntDsc_Internalname = "INTDSC" ;
      chkIntAct.setInternalname( "INTACT" );
      edtIntPreKgm_Internalname = "INTPREKGM" ;
      edtIntPreMtr_Internalname = "INTPREMTR" ;
      cmbIntPreDef.setInternalname( "INTPREDEF" );
      divTableleaflevel_int_Internalname = "TABLELEAFLEVEL_INT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_583_Internalname = "PROMPT_583" ;
      subGridlevel_int_Internalname = "GRIDLEVEL_INT" ;
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
      subGridlevel_int_Allowcollapsing = (byte)(0) ;
      subGridlevel_int_Allowselection = (byte)(0) ;
      subGridlevel_int_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Precio por Articulo / Tipo Colorante / Intensidades", "") );
      cmbIntPreDef.setJsonclick( "" );
      edtIntPreMtr_Jsonclick = "" ;
      edtIntPreKgm_Jsonclick = "" ;
      chkIntAct.setCaption( "" );
      edtIntDsc_Jsonclick = "" ;
      imgprompt_583_Visible = 1 ;
      imgprompt_583_Link = "" ;
      imgprompt_583_Visible = 1 ;
      edtIntCod_Jsonclick = "" ;
      subGridlevel_int_Class = "GridNoBorder WorkWith" ;
      subGridlevel_int_Backcolorstyle = (byte)(0) ;
      cmbIntPreDef.setEnabled( 1 );
      edtIntPreMtr_Enabled = 1 ;
      edtIntPreKgm_Enabled = 1 ;
      chkIntAct.setEnabled( 0 );
      edtIntDsc_Enabled = 0 ;
      edtIntDsc_Forecolor = (int)(0x000000) ;
      edtIntCod_Enabled = 1 ;
      edtIntCod_Forecolor = (int)(0x000000) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      bttBtncopiarprecios_Visible = 1 ;
      edtavTipcoldsc_Jsonclick = "" ;
      edtavTipcoldsc_Enabled = 0 ;
      edtavTipcolcod_Jsonclick = "" ;
      edtavTipcolcod_Enabled = 0 ;
      cmbavArtpredef.setJsonclick( "" );
      cmbavArtpredef.setEnabled( 0 );
      edtavArtpremtr_Jsonclick = "" ;
      edtavArtpremtr_Enabled = 0 ;
      edtavArtprekgm_Jsonclick = "" ;
      edtavArtprekgm_Enabled = 0 ;
      edtavArtdsc_Jsonclick = "" ;
      edtavArtdsc_Enabled = 0 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
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

   public void gxnrgridlevel_int_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_7584( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1TX84( ) ;
         standaloneModal1TX84( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1TX84( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_7584( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_intContainer)) ;
      /* End function gxnrGridlevel_int_newrow */
   }

   public void init_web_controls( )
   {
      cmbavArtpredef.setName( "vARTPREDEF" );
      cmbavArtpredef.setWebtags( "" );
      cmbavArtpredef.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavArtpredef.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavArtpredef.getItemCount() > 0 )
      {
         AV26ArtPreDef = cmbavArtpredef.getValidValue(AV26ArtPreDef) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ArtPreDef", AV26ArtPreDef);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPREDEF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ArtPreDef, "@!"))));
      }
      GXCCtl = "INTACT_" + sGXsfl_75_idx ;
      chkIntAct.setName( GXCCtl );
      chkIntAct.setWebtags( "" );
      chkIntAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "TitleCaption", chkIntAct.getCaption(), !bGXsfl_75_Refreshing);
      chkIntAct.setCheckedValue( "N" );
      A14255IntAct = ((GXutil.strcmp(GXutil.rtrim( A14255IntAct), "S")==0) ? "S" : "N") ;
      GXCCtl = "INTPREDEF_" + sGXsfl_75_idx ;
      cmbIntPreDef.setName( GXCCtl );
      cmbIntPreDef.setWebtags( "" );
      cmbIntPreDef.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbIntPreDef.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbIntPreDef.getItemCount() > 0 )
      {
         A585IntPreDef = cmbIntPreDef.getValidValue(A585IntPreDef) ;
         n585IntPreDef = false ;
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

   public void valid_Intcod( )
   {
      n584IntDsc = false ;
      /* Using cursor T01TX25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
      }
      A584IntDsc = T01TX25_A584IntDsc[0] ;
      n584IntDsc = T01TX25_n584IntDsc[0] ;
      A14255IntAct = T01TX25_A14255IntAct[0] ;
      pr_default.close(23);
      if ( GXutil.strcmp(A14255IntAct, "N") == 0 )
      {
         edtIntCod_Forecolor = GXutil.getColor( 255, 0, 0) ;
      }
      if ( GXutil.strcmp(A14255IntAct, "N") == 0 )
      {
         edtIntDsc_Forecolor = GXutil.getColor( 255, 0, 0) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Intensidad INACTIVA", ""), 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
      }
      dynload_actions( ) ;
      A14255IntAct = ((GXutil.strcmp(GXutil.rtrim( A14255IntAct), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14255IntAct", GXutil.rtrim( A14255IntAct));
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Forecolor), 9, 0), !bGXsfl_75_Refreshing);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV10TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV17CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV18ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV20TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV24ArtPreKgm',fld:'vARTPREKGM',pic:'ZZZZZZ9.999',hsh:true},{av:'AV25ArtPreMtr',fld:'vARTPREMTR',pic:'ZZZZZZ9.999',hsh:true},{av:'cmbavArtpredef'},{av:'AV26ArtPreDef',fld:'vARTPREDEF',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV10TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV17CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV18ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV20TipColDsc',fld:'vTIPCOLDSC',pic:'',hsh:true},{av:'AV24ArtPreKgm',fld:'vARTPREKGM',pic:'ZZZZZZ9.999',hsh:true},{av:'AV25ArtPreMtr',fld:'vARTPREMTR',pic:'ZZZZZZ9.999',hsh:true},{av:'cmbavArtpredef'},{av:'AV26ArtPreDef',fld:'vARTPREDEF',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TX2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOCOPIARPRECIOS'","{handler:'e131TX2',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV18ArtDsc',fld:'vARTDSC',pic:'',hsh:true}]");
      setEventMetadata("'DOCOPIARPRECIOS'",",oparms:[]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_ARTCOD","{handler:'validv_Artcod',iparms:[]");
      setEventMetadata("VALIDV_ARTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_TIPCOLCOD","{handler:'validv_Tipcolcod',iparms:[]");
      setEventMetadata("VALIDV_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A14255IntAct',fld:'INTACT',pic:''},{av:'A584IntDsc',fld:'INTDSC',pic:''}]");
      setEventMetadata("VALID_INTCOD",",oparms:[{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'A14255IntAct',fld:'INTACT',pic:''},{av:'edtIntCod_Forecolor',ctrl:'INTCOD',prop:'Forecolor'},{av:'edtIntDsc_Forecolor',ctrl:'INTDSC',prop:'Forecolor'}]}");
      setEventMetadata("VALID_INTACT","{handler:'valid_Intact',iparms:[]");
      setEventMetadata("VALID_INTACT",",oparms:[]}");
      setEventMetadata("VALID_INTPREDEF","{handler:'valid_Intpredef',iparms:[]");
      setEventMetadata("VALID_INTPREDEF",",oparms:[]}");
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
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9ArtCod = "" ;
      wcpOAV17CliNom = "" ;
      wcpOAV18ArtDsc = "" ;
      wcpOAV20TipColDsc = "" ;
      wcpOAV24ArtPreKgm = DecimalUtil.ZERO ;
      wcpOAV25ArtPreMtr = DecimalUtil.ZERO ;
      wcpOAV26ArtPreDef = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z586IntPreKgm = DecimalUtil.ZERO ;
      Z587IntPreMtr = DecimalUtil.ZERO ;
      Z585IntPreDef = "" ;
      Z3616PreFacCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV9ArtCod = "" ;
      AV17CliNom = "" ;
      AV18ArtDsc = "" ;
      AV20TipColDsc = "" ;
      AV24ArtPreKgm = DecimalUtil.ZERO ;
      AV25ArtPreMtr = DecimalUtil.ZERO ;
      AV26ArtPreDef = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtncopiarprecios_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV27Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_intContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode84 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A65ArtCod = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      A832TipColDsc = "" ;
      A3616PreFacCod = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode83 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A584IntDsc = "" ;
      A14255IntAct = "" ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      AV21Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV22EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV23UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z832TipColDsc = "" ;
      T01TX7_A407EmprNom = new String[] {""} ;
      T01TX7_n407EmprNom = new boolean[] {false} ;
      T01TX8_A279CliNom = new String[] {""} ;
      T01TX9_A69ArtDsc = new String[] {""} ;
      T01TX9_n69ArtDsc = new boolean[] {false} ;
      T01TX10_A832TipColDsc = new String[] {""} ;
      T01TX10_n832TipColDsc = new boolean[] {false} ;
      T01TX11_A407EmprNom = new String[] {""} ;
      T01TX11_n407EmprNom = new boolean[] {false} ;
      T01TX11_A279CliNom = new String[] {""} ;
      T01TX11_A69ArtDsc = new String[] {""} ;
      T01TX11_n69ArtDsc = new boolean[] {false} ;
      T01TX11_A832TipColDsc = new String[] {""} ;
      T01TX11_n832TipColDsc = new boolean[] {false} ;
      T01TX11_A396EmprCod = new String[] {""} ;
      T01TX11_A252CliCod = new int[1] ;
      T01TX11_A65ArtCod = new String[] {""} ;
      T01TX11_A831TipColCod = new byte[1] ;
      T01TX12_A396EmprCod = new String[] {""} ;
      T01TX12_A252CliCod = new int[1] ;
      T01TX12_A65ArtCod = new String[] {""} ;
      T01TX12_A831TipColCod = new byte[1] ;
      T01TX6_A396EmprCod = new String[] {""} ;
      T01TX6_A252CliCod = new int[1] ;
      T01TX6_A65ArtCod = new String[] {""} ;
      T01TX6_A831TipColCod = new byte[1] ;
      T01TX13_A396EmprCod = new String[] {""} ;
      T01TX13_A252CliCod = new int[1] ;
      T01TX13_A65ArtCod = new String[] {""} ;
      T01TX13_A831TipColCod = new byte[1] ;
      T01TX14_A396EmprCod = new String[] {""} ;
      T01TX14_A252CliCod = new int[1] ;
      T01TX14_A65ArtCod = new String[] {""} ;
      T01TX14_A831TipColCod = new byte[1] ;
      T01TX5_A396EmprCod = new String[] {""} ;
      T01TX5_A252CliCod = new int[1] ;
      T01TX5_A65ArtCod = new String[] {""} ;
      T01TX5_A831TipColCod = new byte[1] ;
      T01TX17_A396EmprCod = new String[] {""} ;
      T01TX17_A252CliCod = new int[1] ;
      T01TX17_A65ArtCod = new String[] {""} ;
      T01TX17_A831TipColCod = new byte[1] ;
      T01TX17_A583IntCod = new byte[1] ;
      T01TX17_A4322Limite5 = new short[1] ;
      T01TX18_A396EmprCod = new String[] {""} ;
      T01TX18_A252CliCod = new int[1] ;
      T01TX18_A65ArtCod = new String[] {""} ;
      T01TX18_A831TipColCod = new byte[1] ;
      Z584IntDsc = "" ;
      Z14255IntAct = "" ;
      T01TX19_A252CliCod = new int[1] ;
      T01TX19_A65ArtCod = new String[] {""} ;
      T01TX19_A831TipColCod = new byte[1] ;
      T01TX19_A584IntDsc = new String[] {""} ;
      T01TX19_n584IntDsc = new boolean[] {false} ;
      T01TX19_A14255IntAct = new String[] {""} ;
      T01TX19_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TX19_n586IntPreKgm = new boolean[] {false} ;
      T01TX19_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TX19_n587IntPreMtr = new boolean[] {false} ;
      T01TX19_A585IntPreDef = new String[] {""} ;
      T01TX19_n585IntPreDef = new boolean[] {false} ;
      T01TX19_A3616PreFacCod = new String[] {""} ;
      T01TX19_n3616PreFacCod = new boolean[] {false} ;
      T01TX19_A396EmprCod = new String[] {""} ;
      T01TX19_A583IntCod = new byte[1] ;
      T01TX4_A584IntDsc = new String[] {""} ;
      T01TX4_n584IntDsc = new boolean[] {false} ;
      T01TX4_A14255IntAct = new String[] {""} ;
      T01TX20_A584IntDsc = new String[] {""} ;
      T01TX20_n584IntDsc = new boolean[] {false} ;
      T01TX20_A14255IntAct = new String[] {""} ;
      T01TX21_A396EmprCod = new String[] {""} ;
      T01TX21_A252CliCod = new int[1] ;
      T01TX21_A65ArtCod = new String[] {""} ;
      T01TX21_A831TipColCod = new byte[1] ;
      T01TX21_A583IntCod = new byte[1] ;
      T01TX3_A252CliCod = new int[1] ;
      T01TX3_A65ArtCod = new String[] {""} ;
      T01TX3_A831TipColCod = new byte[1] ;
      T01TX3_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TX3_n586IntPreKgm = new boolean[] {false} ;
      T01TX3_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TX3_n587IntPreMtr = new boolean[] {false} ;
      T01TX3_A585IntPreDef = new String[] {""} ;
      T01TX3_n585IntPreDef = new boolean[] {false} ;
      T01TX3_A3616PreFacCod = new String[] {""} ;
      T01TX3_n3616PreFacCod = new boolean[] {false} ;
      T01TX3_A396EmprCod = new String[] {""} ;
      T01TX3_A583IntCod = new byte[1] ;
      T01TX2_A252CliCod = new int[1] ;
      T01TX2_A65ArtCod = new String[] {""} ;
      T01TX2_A831TipColCod = new byte[1] ;
      T01TX2_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TX2_n586IntPreKgm = new boolean[] {false} ;
      T01TX2_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TX2_n587IntPreMtr = new boolean[] {false} ;
      T01TX2_A585IntPreDef = new String[] {""} ;
      T01TX2_n585IntPreDef = new boolean[] {false} ;
      T01TX2_A3616PreFacCod = new String[] {""} ;
      T01TX2_n3616PreFacCod = new boolean[] {false} ;
      T01TX2_A396EmprCod = new String[] {""} ;
      T01TX2_A583IntCod = new byte[1] ;
      T01TX25_A584IntDsc = new String[] {""} ;
      T01TX25_n584IntDsc = new boolean[] {false} ;
      T01TX25_A14255IntAct = new String[] {""} ;
      T01TX26_A396EmprCod = new String[] {""} ;
      T01TX26_A252CliCod = new int[1] ;
      T01TX26_A65ArtCod = new String[] {""} ;
      T01TX26_A831TipColCod = new byte[1] ;
      T01TX26_A583IntCod = new byte[1] ;
      T01TX26_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01TX27_A396EmprCod = new String[] {""} ;
      T01TX27_A252CliCod = new int[1] ;
      T01TX27_A65ArtCod = new String[] {""} ;
      T01TX27_A831TipColCod = new byte[1] ;
      T01TX27_A583IntCod = new byte[1] ;
      T01TX27_A4322Limite5 = new short[1] ;
      T01TX28_A396EmprCod = new String[] {""} ;
      T01TX28_A252CliCod = new int[1] ;
      T01TX28_A65ArtCod = new String[] {""} ;
      T01TX28_A831TipColCod = new byte[1] ;
      T01TX28_A583IntCod = new byte[1] ;
      Gridlevel_intRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_int_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_583_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_intColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo____trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo____trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo____trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo____trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo____trn__default(),
         new Object[] {
             new Object[] {
            T01TX2_A252CliCod, T01TX2_A65ArtCod, T01TX2_A831TipColCod, T01TX2_A586IntPreKgm, T01TX2_n586IntPreKgm, T01TX2_A587IntPreMtr, T01TX2_n587IntPreMtr, T01TX2_A585IntPreDef, T01TX2_n585IntPreDef, T01TX2_A3616PreFacCod,
            T01TX2_n3616PreFacCod, T01TX2_A396EmprCod, T01TX2_A583IntCod
            }
            , new Object[] {
            T01TX3_A252CliCod, T01TX3_A65ArtCod, T01TX3_A831TipColCod, T01TX3_A586IntPreKgm, T01TX3_n586IntPreKgm, T01TX3_A587IntPreMtr, T01TX3_n587IntPreMtr, T01TX3_A585IntPreDef, T01TX3_n585IntPreDef, T01TX3_A3616PreFacCod,
            T01TX3_n3616PreFacCod, T01TX3_A396EmprCod, T01TX3_A583IntCod
            }
            , new Object[] {
            T01TX4_A584IntDsc, T01TX4_n584IntDsc, T01TX4_A14255IntAct
            }
            , new Object[] {
            T01TX5_A396EmprCod, T01TX5_A252CliCod, T01TX5_A65ArtCod, T01TX5_A831TipColCod
            }
            , new Object[] {
            T01TX6_A396EmprCod, T01TX6_A252CliCod, T01TX6_A65ArtCod, T01TX6_A831TipColCod
            }
            , new Object[] {
            T01TX7_A407EmprNom, T01TX7_n407EmprNom
            }
            , new Object[] {
            T01TX8_A279CliNom
            }
            , new Object[] {
            T01TX9_A69ArtDsc, T01TX9_n69ArtDsc
            }
            , new Object[] {
            T01TX10_A832TipColDsc, T01TX10_n832TipColDsc
            }
            , new Object[] {
            T01TX11_A407EmprNom, T01TX11_n407EmprNom, T01TX11_A279CliNom, T01TX11_A69ArtDsc, T01TX11_n69ArtDsc, T01TX11_A832TipColDsc, T01TX11_n832TipColDsc, T01TX11_A396EmprCod, T01TX11_A252CliCod, T01TX11_A65ArtCod,
            T01TX11_A831TipColCod
            }
            , new Object[] {
            T01TX12_A396EmprCod, T01TX12_A252CliCod, T01TX12_A65ArtCod, T01TX12_A831TipColCod
            }
            , new Object[] {
            T01TX13_A396EmprCod, T01TX13_A252CliCod, T01TX13_A65ArtCod, T01TX13_A831TipColCod
            }
            , new Object[] {
            T01TX14_A396EmprCod, T01TX14_A252CliCod, T01TX14_A65ArtCod, T01TX14_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TX17_A396EmprCod, T01TX17_A252CliCod, T01TX17_A65ArtCod, T01TX17_A831TipColCod, T01TX17_A583IntCod, T01TX17_A4322Limite5
            }
            , new Object[] {
            T01TX18_A396EmprCod, T01TX18_A252CliCod, T01TX18_A65ArtCod, T01TX18_A831TipColCod
            }
            , new Object[] {
            T01TX19_A252CliCod, T01TX19_A65ArtCod, T01TX19_A831TipColCod, T01TX19_A584IntDsc, T01TX19_n584IntDsc, T01TX19_A14255IntAct, T01TX19_A586IntPreKgm, T01TX19_n586IntPreKgm, T01TX19_A587IntPreMtr, T01TX19_n587IntPreMtr,
            T01TX19_A585IntPreDef, T01TX19_n585IntPreDef, T01TX19_A3616PreFacCod, T01TX19_n3616PreFacCod, T01TX19_A396EmprCod, T01TX19_A583IntCod
            }
            , new Object[] {
            T01TX20_A584IntDsc, T01TX20_n584IntDsc, T01TX20_A14255IntAct
            }
            , new Object[] {
            T01TX21_A396EmprCod, T01TX21_A252CliCod, T01TX21_A65ArtCod, T01TX21_A831TipColCod, T01TX21_A583IntCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TX25_A584IntDsc, T01TX25_n584IntDsc, T01TX25_A14255IntAct
            }
            , new Object[] {
            T01TX26_A396EmprCod, T01TX26_A252CliCod, T01TX26_A65ArtCod, T01TX26_A831TipColCod, T01TX26_A583IntCod, T01TX26_A11092H_DiaI
            }
            , new Object[] {
            T01TX27_A396EmprCod, T01TX27_A252CliCod, T01TX27_A65ArtCod, T01TX27_A831TipColCod, T01TX27_A583IntCod, T01TX27_A4322Limite5
            }
            , new Object[] {
            T01TX28_A396EmprCod, T01TX28_A252CliCod, T01TX28_A65ArtCod, T01TX28_A831TipColCod, T01TX28_A583IntCod
            }
         }
      );
      AV27Pgmname = "Facturacion.PrecioporArticulo____TRN" ;
   }

   private byte wcpOAV10TipColCod ;
   private byte Z831TipColCod ;
   private byte Z583IntCod ;
   private byte GxWebError ;
   private byte A583IntCod ;
   private byte AV10TipColCod ;
   private byte nKeyPressed ;
   private byte A831TipColCod ;
   private byte Gx_BScreen ;
   private byte subGridlevel_int_Backcolorstyle ;
   private byte subGridlevel_int_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_int_Allowselection ;
   private byte subGridlevel_int_Allowhovering ;
   private byte subGridlevel_int_Allowcollapsing ;
   private byte subGridlevel_int_Collapsed ;
   private short nIsMod_84 ;
   private short nRcdDeleted_84 ;
   private short nRcdExists_84 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount84 ;
   private short RcdFound84 ;
   private short nBlankRcdUsr84 ;
   private short RcdFound83 ;
   private short nIsDirty_83 ;
   private short nIsDirty_84 ;
   private int wcpOAV8CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int AV8CliCod ;
   private int trnEnded ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavArtcod_Enabled ;
   private int edtavArtdsc_Enabled ;
   private int edtavArtprekgm_Enabled ;
   private int edtavArtpremtr_Enabled ;
   private int edtavTipcolcod_Enabled ;
   private int edtavTipcoldsc_Enabled ;
   private int bttBtncopiarprecios_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtIntCod_Forecolor ;
   private int edtIntCod_Enabled ;
   private int edtIntDsc_Forecolor ;
   private int edtIntDsc_Enabled ;
   private int edtIntPreKgm_Enabled ;
   private int edtIntPreMtr_Enabled ;
   private int fRowAdded ;
   private int A252CliCod ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_int_Backcolor ;
   private int subGridlevel_int_Allbackcolor ;
   private int imgprompt_583_Visible ;
   private int defchkIntAct_Enabled ;
   private int defedtIntDsc_Enabled ;
   private int defedtIntDsc_Forecolor ;
   private int defedtIntCod_Enabled ;
   private int defedtIntCod_Forecolor ;
   private int idxLst ;
   private int subGridlevel_int_Selectedindex ;
   private int subGridlevel_int_Selectioncolor ;
   private int subGridlevel_int_Hoveringcolor ;
   private long GRIDLEVEL_INT_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV24ArtPreKgm ;
   private java.math.BigDecimal wcpOAV25ArtPreMtr ;
   private java.math.BigDecimal Z586IntPreKgm ;
   private java.math.BigDecimal Z587IntPreMtr ;
   private java.math.BigDecimal AV24ArtPreKgm ;
   private java.math.BigDecimal AV25ArtPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private String sPrefix ;
   private String sGXsfl_75_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9ArtCod ;
   private String wcpOAV17CliNom ;
   private String wcpOAV18ArtDsc ;
   private String wcpOAV20TipColDsc ;
   private String wcpOAV26ArtPreDef ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z585IntPreDef ;
   private String Z3616PreFacCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV9ArtCod ;
   private String AV17CliNom ;
   private String AV18ArtDsc ;
   private String AV20TipColDsc ;
   private String AV26ArtPreDef ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavArtcod_Internalname ;
   private String edtavArtcod_Jsonclick ;
   private String edtavArtdsc_Internalname ;
   private String edtavArtdsc_Jsonclick ;
   private String edtavArtprekgm_Internalname ;
   private String edtavArtprekgm_Jsonclick ;
   private String edtavArtpremtr_Internalname ;
   private String edtavArtpremtr_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavTipcolcod_Internalname ;
   private String edtavTipcolcod_Jsonclick ;
   private String edtavTipcoldsc_Internalname ;
   private String edtavTipcoldsc_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String bttBtncopiarprecios_Internalname ;
   private String bttBtncopiarprecios_Jsonclick ;
   private String divTableleaflevel_int_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV27Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sMode84 ;
   private String edtIntCod_Internalname ;
   private String edtIntDsc_Internalname ;
   private String edtIntPreKgm_Internalname ;
   private String edtIntPreMtr_Internalname ;
   private String imgprompt_583_Link ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_int_Internalname ;
   private String A65ArtCod ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String A832TipColDsc ;
   private String A3616PreFacCod ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode83 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A584IntDsc ;
   private String A14255IntAct ;
   private String A585IntPreDef ;
   private String AV21Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV22EmprNom ;
   private String GXv_char3[] ;
   private String AV23UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z832TipColDsc ;
   private String Z584IntDsc ;
   private String Z14255IntAct ;
   private String imgprompt_583_Internalname ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGridlevel_int_Class ;
   private String subGridlevel_int_Linesclass ;
   private String ROClassString ;
   private String edtIntCod_Jsonclick ;
   private String imgprompt_583_gximage ;
   private String sImgUrl ;
   private String edtIntDsc_Jsonclick ;
   private String edtIntPreKgm_Jsonclick ;
   private String edtIntPreMtr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_int_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n832TipColDsc ;
   private boolean n3616PreFacCod ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean n584IntDsc ;
   private boolean n586IntPreKgm ;
   private boolean n587IntPreMtr ;
   private boolean n585IntPreDef ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_intContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_intRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_intColumn ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavArtpredef ;
   private ICheckbox chkIntAct ;
   private HTMLChoice cmbIntPreDef ;
   private IDataStoreProvider pr_default ;
   private String[] T01TX7_A407EmprNom ;
   private boolean[] T01TX7_n407EmprNom ;
   private String[] T01TX8_A279CliNom ;
   private String[] T01TX9_A69ArtDsc ;
   private boolean[] T01TX9_n69ArtDsc ;
   private String[] T01TX10_A832TipColDsc ;
   private boolean[] T01TX10_n832TipColDsc ;
   private String[] T01TX11_A407EmprNom ;
   private boolean[] T01TX11_n407EmprNom ;
   private String[] T01TX11_A279CliNom ;
   private String[] T01TX11_A69ArtDsc ;
   private boolean[] T01TX11_n69ArtDsc ;
   private String[] T01TX11_A832TipColDsc ;
   private boolean[] T01TX11_n832TipColDsc ;
   private String[] T01TX11_A396EmprCod ;
   private int[] T01TX11_A252CliCod ;
   private String[] T01TX11_A65ArtCod ;
   private byte[] T01TX11_A831TipColCod ;
   private String[] T01TX12_A396EmprCod ;
   private int[] T01TX12_A252CliCod ;
   private String[] T01TX12_A65ArtCod ;
   private byte[] T01TX12_A831TipColCod ;
   private String[] T01TX6_A396EmprCod ;
   private int[] T01TX6_A252CliCod ;
   private String[] T01TX6_A65ArtCod ;
   private byte[] T01TX6_A831TipColCod ;
   private String[] T01TX13_A396EmprCod ;
   private int[] T01TX13_A252CliCod ;
   private String[] T01TX13_A65ArtCod ;
   private byte[] T01TX13_A831TipColCod ;
   private String[] T01TX14_A396EmprCod ;
   private int[] T01TX14_A252CliCod ;
   private String[] T01TX14_A65ArtCod ;
   private byte[] T01TX14_A831TipColCod ;
   private String[] T01TX5_A396EmprCod ;
   private int[] T01TX5_A252CliCod ;
   private String[] T01TX5_A65ArtCod ;
   private byte[] T01TX5_A831TipColCod ;
   private String[] T01TX17_A396EmprCod ;
   private int[] T01TX17_A252CliCod ;
   private String[] T01TX17_A65ArtCod ;
   private byte[] T01TX17_A831TipColCod ;
   private byte[] T01TX17_A583IntCod ;
   private short[] T01TX17_A4322Limite5 ;
   private String[] T01TX18_A396EmprCod ;
   private int[] T01TX18_A252CliCod ;
   private String[] T01TX18_A65ArtCod ;
   private byte[] T01TX18_A831TipColCod ;
   private int[] T01TX19_A252CliCod ;
   private String[] T01TX19_A65ArtCod ;
   private byte[] T01TX19_A831TipColCod ;
   private String[] T01TX19_A584IntDsc ;
   private boolean[] T01TX19_n584IntDsc ;
   private String[] T01TX19_A14255IntAct ;
   private java.math.BigDecimal[] T01TX19_A586IntPreKgm ;
   private boolean[] T01TX19_n586IntPreKgm ;
   private java.math.BigDecimal[] T01TX19_A587IntPreMtr ;
   private boolean[] T01TX19_n587IntPreMtr ;
   private String[] T01TX19_A585IntPreDef ;
   private boolean[] T01TX19_n585IntPreDef ;
   private String[] T01TX19_A3616PreFacCod ;
   private boolean[] T01TX19_n3616PreFacCod ;
   private String[] T01TX19_A396EmprCod ;
   private byte[] T01TX19_A583IntCod ;
   private String[] T01TX4_A584IntDsc ;
   private boolean[] T01TX4_n584IntDsc ;
   private String[] T01TX4_A14255IntAct ;
   private String[] T01TX20_A584IntDsc ;
   private boolean[] T01TX20_n584IntDsc ;
   private String[] T01TX20_A14255IntAct ;
   private String[] T01TX21_A396EmprCod ;
   private int[] T01TX21_A252CliCod ;
   private String[] T01TX21_A65ArtCod ;
   private byte[] T01TX21_A831TipColCod ;
   private byte[] T01TX21_A583IntCod ;
   private int[] T01TX3_A252CliCod ;
   private String[] T01TX3_A65ArtCod ;
   private byte[] T01TX3_A831TipColCod ;
   private java.math.BigDecimal[] T01TX3_A586IntPreKgm ;
   private boolean[] T01TX3_n586IntPreKgm ;
   private java.math.BigDecimal[] T01TX3_A587IntPreMtr ;
   private boolean[] T01TX3_n587IntPreMtr ;
   private String[] T01TX3_A585IntPreDef ;
   private boolean[] T01TX3_n585IntPreDef ;
   private String[] T01TX3_A3616PreFacCod ;
   private boolean[] T01TX3_n3616PreFacCod ;
   private String[] T01TX3_A396EmprCod ;
   private byte[] T01TX3_A583IntCod ;
   private int[] T01TX2_A252CliCod ;
   private String[] T01TX2_A65ArtCod ;
   private byte[] T01TX2_A831TipColCod ;
   private java.math.BigDecimal[] T01TX2_A586IntPreKgm ;
   private boolean[] T01TX2_n586IntPreKgm ;
   private java.math.BigDecimal[] T01TX2_A587IntPreMtr ;
   private boolean[] T01TX2_n587IntPreMtr ;
   private String[] T01TX2_A585IntPreDef ;
   private boolean[] T01TX2_n585IntPreDef ;
   private String[] T01TX2_A3616PreFacCod ;
   private boolean[] T01TX2_n3616PreFacCod ;
   private String[] T01TX2_A396EmprCod ;
   private byte[] T01TX2_A583IntCod ;
   private String[] T01TX25_A584IntDsc ;
   private boolean[] T01TX25_n584IntDsc ;
   private String[] T01TX25_A14255IntAct ;
   private String[] T01TX26_A396EmprCod ;
   private int[] T01TX26_A252CliCod ;
   private String[] T01TX26_A65ArtCod ;
   private byte[] T01TX26_A831TipColCod ;
   private byte[] T01TX26_A583IntCod ;
   private java.util.Date[] T01TX26_A11092H_DiaI ;
   private String[] T01TX27_A396EmprCod ;
   private int[] T01TX27_A252CliCod ;
   private String[] T01TX27_A65ArtCod ;
   private byte[] T01TX27_A831TipColCod ;
   private byte[] T01TX27_A583IntCod ;
   private short[] T01TX27_A4322Limite5 ;
   private String[] T01TX28_A396EmprCod ;
   private int[] T01TX28_A252CliCod ;
   private String[] T01TX28_A65ArtCod ;
   private byte[] T01TX28_A831TipColCod ;
   private byte[] T01TX28_A583IntCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
}

final  class precioporarticulo____trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class precioporarticulo____trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class precioporarticulo____trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class precioporarticulo____trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class precioporarticulo____trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TX2", "SELECT CliCod, ArtCod, TipColCod, IntPreKgm, IntPreMtr, IntPreDef, PreFacCod, EmprCod, IntCod FROM TXPPRETIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ?  FOR UPDATE OF IntPreKgm, IntPreMtr, IntPreDef, PreFacCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX3", "SELECT CliCod, ArtCod, TipColCod, IntPreKgm, IntPreMtr, IntPreDef, PreFacCod, EmprCod, IntCod FROM TXPPRETIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX4", "SELECT IntDsc, IntAct FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX5", "SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX6", "SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX9", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX10", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX11", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.CliNom, T4.ArtDsc, T5.TipColDsc, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.TipColCod FROM ((((TXPPRETCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = TM1.EmprCod AND T5.TipColCod = TM1.TipColCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and EmprCod = ? and TipColCod > ?) ORDER BY EmprCod, CliCod, ArtCod, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TX14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and EmprCod = ? and TipColCod < ?) ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TX15", "INSERT INTO TXPPRETCO(EmprCod, CliCod, ArtCod, TipColCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPPRETCO")
         ,new UpdateCursor("T01TX16", "DELETE FROM TXPPRETCO  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ?", GX_NOMASK, "TXPPRETCO")
         ,new ForEachCursor("T01TX17", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, Limite5 FROM TXPRecInt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TX18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO ORDER BY EmprCod, CliCod, ArtCod, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX19", "SELECT T1.CliCod, T1.ArtCod, T1.TipColCod, T2.IntDsc, T2.IntAct, T1.IntPreKgm, T1.IntPreMtr, T1.IntPreDef, T1.PreFacCod, T1.EmprCod, T1.IntCod FROM (TXPPRETIN T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.TipColCod = ? and T1.IntCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T1.IntCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX20", "SELECT IntDsc, IntAct FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX21", "SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod FROM TXPPRETIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TX22", "INSERT INTO TXPPRETIN(CliCod, ArtCod, TipColCod, IntPreKgm, IntPreMtr, IntPreDef, PreFacCod, EmprCod, IntCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPRETIN")
         ,new UpdateCursor("T01TX23", "UPDATE TXPPRETIN SET IntPreKgm=?, IntPreMtr=?, IntPreDef=?, PreFacCod=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ?", GX_NOMASK, "TXPPRETIN")
         ,new UpdateCursor("T01TX24", "DELETE FROM TXPPRETIN  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ?", GX_NOMASK, "TXPPRETIN")
         ,new ForEachCursor("T01TX25", "SELECT IntDsc, IntAct FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TX26", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI FROM TXPHPREIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TX27", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, Limite5 FROM TXPRecInt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TX28", "SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 3);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 6);
               }
               stmt.setString(8, (String)parms[11], 3);
               stmt.setByte(9, ((Number) parms[12]).byteValue());
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 16);
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               stmt.setByte(9, ((Number) parms[12]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

