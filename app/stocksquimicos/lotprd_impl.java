package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lotprd_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A719PrdNum) ;
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
            AV8PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8PrdNum", AV8PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PrdNum, ""))));
            AV9LoteFec = localUtil.parseDateParm( httpContext.GetPar( "LoteFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9LoteFec", localUtil.format(AV9LoteFec, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEFEC", getSecureSignedToken( "", AV9LoteFec));
            AV10LoteID = httpContext.GetPar( "LoteID") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10LoteID", AV10LoteID);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10LoteID, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Lotes Producto", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLoteFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public lotprd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lotprd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lotprd_impl.class ));
   }

   public lotprd_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbLoteCtf = new HTMLChoice();
      cmbLoteCon = new HTMLChoice();
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
      if ( cmbLoteCtf.getItemCount() > 0 )
      {
         A11667LoteCtf = cmbLoteCtf.getValidValue(A11667LoteCtf) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbLoteCtf.setValue( GXutil.rtrim( A11667LoteCtf) );
         httpContext.ajax_rsp_assign_prop("", false, cmbLoteCtf.getInternalname(), "Values", cmbLoteCtf.ToJavascriptSource(), true);
      }
      if ( cmbLoteCon.getItemCount() > 0 )
      {
         A11668LoteCon = cmbLoteCon.getValidValue(A11668LoteCon) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbLoteCon.setValue( GXutil.rtrim( A11668LoteCon) );
         httpContext.ajax_rsp_assign_prop("", false, cmbLoteCon.getInternalname(), "Values", cmbLoteCon.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Produto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LOTPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Nome", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LOTPRD.htm");
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
      /* User Defined Control */
      ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
      ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
      ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
      ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
      ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
      ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
      ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
      ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
      ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
      ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
      ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteFec_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLoteFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteFec_Internalname, localUtil.format(A11665LoteFec, "99/99/99"), localUtil.format( A11665LoteFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteFec_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\LOTPRD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLoteFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLoteFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\LOTPRD.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteID_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteID_Internalname, GXutil.rtrim( A11664LoteID), GXutil.rtrim( localUtil.format( A11664LoteID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteID_Enabled, 1, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LOTPRD.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLotePed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLotePed_Internalname, httpContext.getMessage( "Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLotePed_Internalname, GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLotePed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11666LotePed), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11666LotePed), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLotePed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLotePed_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\LOTPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteNEmb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteNEmb_Internalname, httpContext.getMessage( "Embalagem", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteNEmb_Internalname, GXutil.ltrim( localUtil.ntoc( A14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLoteNEmb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteNEmb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteNEmb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\LOTPRD.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbLoteCtf.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbLoteCtf.getInternalname(), httpContext.getMessage( "Certificado?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbLoteCtf, cmbLoteCtf.getInternalname(), GXutil.rtrim( A11667LoteCtf), 1, cmbLoteCtf.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbLoteCtf.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "", true, (byte)(0), "HLP_StocksQuimicos\\LOTPRD.htm");
      cmbLoteCtf.setValue( GXutil.rtrim( A11667LoteCtf) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLoteCtf.getInternalname(), "Values", cmbLoteCtf.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbLoteCon.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbLoteCon.getInternalname(), httpContext.getMessage( "Consumido?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbLoteCon, cmbLoteCon.getInternalname(), GXutil.rtrim( A11668LoteCon), 1, cmbLoteCon.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbLoteCon.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "", true, (byte)(0), "HLP_StocksQuimicos\\LOTPRD.htm");
      cmbLoteCon.setValue( GXutil.rtrim( A11668LoteCon) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLoteCon.getInternalname(), "Values", cmbLoteCon.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteCtfNm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteCtfNm_Internalname, httpContext.getMessage( "Certificado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteCtfNm_Internalname, GXutil.rtrim( A11711LoteCtfNm), GXutil.rtrim( localUtil.format( A11711LoteCtfNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteCtfNm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteCtfNm_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LOTPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteCtfNF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteCtfNF_Internalname, httpContext.getMessage( "Certificado Fornecedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteCtfNF_Internalname, GXutil.rtrim( A12352LoteCtfNF), GXutil.rtrim( localUtil.format( A12352LoteCtfNF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteCtfNF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteCtfNF_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LOTPRD.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LOTPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LOTPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LOTPRD.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV15Pgmname), GXutil.rtrim( localUtil.format( AV15Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LOTPRD.htm");
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
      e111TP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z11664LoteID = httpContext.cgiGet( "Z11664LoteID") ;
            Z11665LoteFec = localUtil.ctod( httpContext.cgiGet( "Z11665LoteFec"), 0) ;
            Z11666LotePed = (int)(localUtil.ctol( httpContext.cgiGet( "Z11666LotePed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11667LoteCtf = httpContext.cgiGet( "Z11667LoteCtf") ;
            Z11668LoteCon = httpContext.cgiGet( "Z11668LoteCon") ;
            Z11711LoteCtfNm = httpContext.cgiGet( "Z11711LoteCtfNm") ;
            Z12352LoteCtfNF = httpContext.cgiGet( "Z12352LoteCtfNF") ;
            Z14017LoteNEmb = (short)(localUtil.ctol( httpContext.cgiGet( "Z14017LoteNEmb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            AV9LoteFec = localUtil.ctod( httpContext.cgiGet( "vLOTEFEC"), 0) ;
            AV10LoteID = httpContext.cgiGet( "vLOTEID") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Dvpanel_unnamedtable2_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Objectcall") ;
            Dvpanel_unnamedtable2_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Class") ;
            Dvpanel_unnamedtable2_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Enabled")) ;
            Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
            Dvpanel_unnamedtable2_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Height") ;
            Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
            Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
            Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
            Dvpanel_unnamedtable2_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showheader")) ;
            Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
            Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
            Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
            Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
            Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
            Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
            Dvpanel_unnamedtable2_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Visible")) ;
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
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            if ( localUtil.vcdate( httpContext.cgiGet( edtLoteFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LOTEFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLoteFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11665LoteFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
            }
            else
            {
               A11665LoteFec = localUtil.ctod( httpContext.cgiGet( edtLoteFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
            }
            A11664LoteID = httpContext.cgiGet( edtLoteID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LOTEPED");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLotePed_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11666LotePed = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
            }
            else
            {
               A11666LotePed = (int)(localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LOTENEMB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLoteNEmb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14017LoteNEmb = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
            }
            else
            {
               A14017LoteNEmb = (short)(localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
            }
            cmbLoteCtf.setValue( httpContext.cgiGet( cmbLoteCtf.getInternalname()) );
            A11667LoteCtf = httpContext.cgiGet( cmbLoteCtf.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
            cmbLoteCon.setValue( httpContext.cgiGet( cmbLoteCon.getInternalname()) );
            A11668LoteCon = httpContext.cgiGet( cmbLoteCon.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
            A11711LoteCtfNm = httpContext.cgiGet( edtLoteCtfNm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
            A12352LoteCtfNF = httpContext.cgiGet( edtLoteCtfNF_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
            AV15Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"LOTPRD");
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            forbiddenHiddens.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A11664LoteID, Z11664LoteID) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11665LoteFec), GXutil.resetTime(Z11665LoteFec)) ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\lotprd:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A11664LoteID = httpContext.GetPar( "LoteID") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
               A11665LoteFec = localUtil.parseDateParm( httpContext.GetPar( "LoteFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
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
                  sMode1632 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1632 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1632 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TP0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PRDNUM");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
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
                        e111TP2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TP2 ();
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
         e121TP2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TP1632( ) ;
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
         disableAttributes1TP1632( ) ;
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

   public void confirm_1TP0( )
   {
      beforeValidate1TP1632( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TP1632( ) ;
         }
         else
         {
            checkExtendedTable1TP1632( ) ;
            closeExtendedTableCursors1TP1632( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TP0( )
   {
   }

   public void e111TP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      lotprd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV17Emprnom ;
      GXv_char4[0] = AV18Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      lotprd_impl.this.AV7EmprCod = GXv_char2[0] ;
      lotprd_impl.this.AV17Emprnom = GXv_char3[0] ;
      lotprd_impl.this.AV18Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Emprnom", AV17Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV18Usurcod", AV18Usurcod);
      GXv_SdtWWPContext5[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV11WWPContext = GXv_SdtWWPContext5[0] ;
      AV12TrnContext.fromxml(AV13WebSession.getValue("TrnContext"), null, null);
   }

   public void e121TP2( )
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

   public void zm1TP1632( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11666LotePed = T01TP3_A11666LotePed[0] ;
            Z11667LoteCtf = T01TP3_A11667LoteCtf[0] ;
            Z11668LoteCon = T01TP3_A11668LoteCon[0] ;
            Z11711LoteCtfNm = T01TP3_A11711LoteCtfNm[0] ;
            Z12352LoteCtfNF = T01TP3_A12352LoteCtfNF[0] ;
            Z14017LoteNEmb = T01TP3_A14017LoteNEmb[0] ;
         }
         else
         {
            Z11666LotePed = A11666LotePed ;
            Z11667LoteCtf = A11667LoteCtf ;
            Z11668LoteCon = A11668LoteCon ;
            Z11711LoteCtfNm = A11711LoteCtfNm ;
            Z12352LoteCtfNF = A12352LoteCtfNF ;
            Z14017LoteNEmb = A14017LoteNEmb ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z11664LoteID = A11664LoteID ;
         Z11665LoteFec = A11665LoteFec ;
         Z11666LotePed = A11666LotePed ;
         Z11667LoteCtf = A11667LoteCtf ;
         Z11668LoteCon = A11668LoteCon ;
         Z11711LoteCtfNm = A11711LoteCtfNm ;
         Z12352LoteCtfNF = A12352LoteCtfNF ;
         Z14017LoteNEmb = A14017LoteNEmb ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z407EmprNom = A407EmprNom ;
         Z718PrdNom = A718PrdNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      AV15Pgmname = "StocksQuimicos.LOTPRD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TP4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TP4_A407EmprNom[0] ;
      n407EmprNom = T01TP4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV8PrdNum)==0) )
      {
         A719PrdNum = AV8PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9LoteFec)) )
      {
         A11665LoteFec = AV9LoteFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9LoteFec)) )
      {
         edtLoteFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), true);
      }
      else
      {
         edtLoteFec_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), true);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9LoteFec)) )
      {
         edtLoteFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10LoteID)==0) )
      {
         A11664LoteID = AV10LoteID ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
      }
      if ( ! (GXutil.strcmp("", AV10LoteID)==0) )
      {
         edtLoteID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), true);
      }
      else
      {
         edtLoteID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10LoteID)==0) )
      {
         edtLoteID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), true);
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
      if ( isIns( )  && (GXutil.strcmp("", A11667LoteCtf)==0) && ( Gx_BScreen == 0 ) )
      {
         A11667LoteCtf = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11668LoteCon)==0) && ( Gx_BScreen == 0 ) )
      {
         A11668LoteCon = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01TP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01TP5_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         pr_default.close(3);
      }
   }

   public void load1TP1632( )
   {
      /* Using cursor T01TP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A407EmprNom = T01TP6_A407EmprNom[0] ;
         n407EmprNom = T01TP6_n407EmprNom[0] ;
         A718PrdNom = T01TP6_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A11666LotePed = T01TP6_A11666LotePed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
         A11667LoteCtf = T01TP6_A11667LoteCtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
         A11668LoteCon = T01TP6_A11668LoteCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
         A11711LoteCtfNm = T01TP6_A11711LoteCtfNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
         A12352LoteCtfNF = T01TP6_A12352LoteCtfNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
         A14017LoteNEmb = T01TP6_A14017LoteNEmb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
         zm1TP1632( -17) ;
      }
      pr_default.close(4);
      onLoadActions1TP1632( ) ;
   }

   public void onLoadActions1TP1632( )
   {
   }

   public void checkExtendedTable1TP1632( )
   {
      nIsDirty_1632 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A11664LoteID, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Lote incorrecto", ""), 1, "LOTEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLoteID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A11667LoteCtf, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A11667LoteCtf, httpContext.getMessage( "N", "")) == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor incorrecto,, solo puede ser S o N", ""), 1, "LOTECTF");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbLoteCtf.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A11668LoteCon, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A11668LoteCon, httpContext.getMessage( "N", "")) == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor incorrecto,, solo puede ser S o N", ""), 1, "LOTECON");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbLoteCon.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01TP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01TP5_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1TP1632( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01TP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01TP7_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1TP1632( )
   {
      /* Using cursor T01TP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1632 = (short)(1) ;
      }
      else
      {
         RcdFound1632 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TP1632( 17) ;
         RcdFound1632 = (short)(1) ;
         A11664LoteID = T01TP3_A11664LoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = T01TP3_A11665LoteFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
         A11666LotePed = T01TP3_A11666LotePed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
         A11667LoteCtf = T01TP3_A11667LoteCtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
         A11668LoteCon = T01TP3_A11668LoteCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
         A11711LoteCtfNm = T01TP3_A11711LoteCtfNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
         A12352LoteCtfNF = T01TP3_A12352LoteCtfNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
         A14017LoteNEmb = T01TP3_A14017LoteNEmb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
         A396EmprCod = T01TP3_A396EmprCod[0] ;
         A719PrdNum = T01TP3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z11664LoteID = A11664LoteID ;
         Z11665LoteFec = A11665LoteFec ;
         sMode1632 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TP1632( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1632 = (short)(0) ;
            initializeNonKey1TP1632( ) ;
         }
         Gx_mode = sMode1632 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1632 = (short)(0) ;
         initializeNonKey1TP1632( ) ;
         sMode1632 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1632 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TP1632( ) ;
      if ( RcdFound1632 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1632 = (short)(0) ;
      /* Using cursor T01TP9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A11664LoteID, A11664LoteID, A719PrdNum, A396EmprCod, A11665LoteFec});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01TP9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TP9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TP9_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01TP9_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01TP9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TP9_A11664LoteID[0], A11664LoteID) < 0 ) || ( GXutil.strcmp(T01TP9_A11664LoteID[0], A11664LoteID) == 0 ) && ( GXutil.strcmp(T01TP9_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01TP9_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01TP9_A11665LoteFec[0]).before( GXutil.resetTime( A11665LoteFec )) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01TP9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TP9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TP9_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01TP9_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01TP9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TP9_A11664LoteID[0], A11664LoteID) > 0 ) || ( GXutil.strcmp(T01TP9_A11664LoteID[0], A11664LoteID) == 0 ) && ( GXutil.strcmp(T01TP9_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01TP9_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01TP9_A11665LoteFec[0]).after( GXutil.resetTime( A11665LoteFec )) ) )
         {
            A396EmprCod = T01TP9_A396EmprCod[0] ;
            A719PrdNum = T01TP9_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A11664LoteID = T01TP9_A11664LoteID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
            A11665LoteFec = T01TP9_A11665LoteFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
            RcdFound1632 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1632 = (short)(0) ;
      /* Using cursor T01TP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A11664LoteID, A11664LoteID, A719PrdNum, A396EmprCod, A11665LoteFec});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01TP10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TP10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TP10_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01TP10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01TP10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TP10_A11664LoteID[0], A11664LoteID) > 0 ) || ( GXutil.strcmp(T01TP10_A11664LoteID[0], A11664LoteID) == 0 ) && ( GXutil.strcmp(T01TP10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01TP10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01TP10_A11665LoteFec[0]).after( GXutil.resetTime( A11665LoteFec )) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01TP10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TP10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TP10_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01TP10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01TP10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TP10_A11664LoteID[0], A11664LoteID) < 0 ) || ( GXutil.strcmp(T01TP10_A11664LoteID[0], A11664LoteID) == 0 ) && ( GXutil.strcmp(T01TP10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01TP10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01TP10_A11665LoteFec[0]).before( GXutil.resetTime( A11665LoteFec )) ) )
         {
            A396EmprCod = T01TP10_A396EmprCod[0] ;
            A719PrdNum = T01TP10_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A11664LoteID = T01TP10_A11664LoteID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
            A11665LoteFec = T01TP10_A11665LoteFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
            RcdFound1632 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TP1632( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLoteFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TP1632( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1632 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A11664LoteID, Z11664LoteID) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11665LoteFec), GXutil.resetTime(Z11665LoteFec)) ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A11664LoteID = Z11664LoteID ;
               httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
               A11665LoteFec = Z11665LoteFec ;
               httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLoteFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TP1632( ) ;
               GX_FocusControl = edtLoteFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A11664LoteID, Z11664LoteID) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11665LoteFec), GXutil.resetTime(Z11665LoteFec)) ) )
            {
               /* Insert record */
               GX_FocusControl = edtLoteFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TP1632( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PRDNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtLoteFec_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TP1632( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A11664LoteID, Z11664LoteID) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11665LoteFec), GXutil.resetTime(Z11665LoteFec)) ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A11664LoteID = Z11664LoteID ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = Z11665LoteFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLoteFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TP1632( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLOTPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z11666LotePed != T01TP2_A11666LotePed[0] ) || ( GXutil.strcmp(Z11667LoteCtf, T01TP2_A11667LoteCtf[0]) != 0 ) || ( GXutil.strcmp(Z11668LoteCon, T01TP2_A11668LoteCon[0]) != 0 ) || ( GXutil.strcmp(Z11711LoteCtfNm, T01TP2_A11711LoteCtfNm[0]) != 0 ) || ( GXutil.strcmp(Z12352LoteCtfNF, T01TP2_A12352LoteCtfNF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14017LoteNEmb != T01TP2_A14017LoteNEmb[0] ) )
         {
            if ( Z11666LotePed != T01TP2_A11666LotePed[0] )
            {
               GXutil.writeLogln("stocksquimicos.lotprd:[seudo value changed for attri]"+"LotePed");
               GXutil.writeLogRaw("Old: ",Z11666LotePed);
               GXutil.writeLogRaw("Current: ",T01TP2_A11666LotePed[0]);
            }
            if ( GXutil.strcmp(Z11667LoteCtf, T01TP2_A11667LoteCtf[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.lotprd:[seudo value changed for attri]"+"LoteCtf");
               GXutil.writeLogRaw("Old: ",Z11667LoteCtf);
               GXutil.writeLogRaw("Current: ",T01TP2_A11667LoteCtf[0]);
            }
            if ( GXutil.strcmp(Z11668LoteCon, T01TP2_A11668LoteCon[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.lotprd:[seudo value changed for attri]"+"LoteCon");
               GXutil.writeLogRaw("Old: ",Z11668LoteCon);
               GXutil.writeLogRaw("Current: ",T01TP2_A11668LoteCon[0]);
            }
            if ( GXutil.strcmp(Z11711LoteCtfNm, T01TP2_A11711LoteCtfNm[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.lotprd:[seudo value changed for attri]"+"LoteCtfNm");
               GXutil.writeLogRaw("Old: ",Z11711LoteCtfNm);
               GXutil.writeLogRaw("Current: ",T01TP2_A11711LoteCtfNm[0]);
            }
            if ( GXutil.strcmp(Z12352LoteCtfNF, T01TP2_A12352LoteCtfNF[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.lotprd:[seudo value changed for attri]"+"LoteCtfNF");
               GXutil.writeLogRaw("Old: ",Z12352LoteCtfNF);
               GXutil.writeLogRaw("Current: ",T01TP2_A12352LoteCtfNF[0]);
            }
            if ( Z14017LoteNEmb != T01TP2_A14017LoteNEmb[0] )
            {
               GXutil.writeLogln("stocksquimicos.lotprd:[seudo value changed for attri]"+"LoteNEmb");
               GXutil.writeLogRaw("Old: ",Z14017LoteNEmb);
               GXutil.writeLogRaw("Current: ",T01TP2_A14017LoteNEmb[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLOTPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TP1632( )
   {
      beforeValidate1TP1632( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TP1632( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TP1632( 0) ;
         checkOptimisticConcurrency1TP1632( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TP1632( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TP1632( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TP11 */
                  pr_default.execute(9, new Object[] {A11664LoteID, A11665LoteFec, Integer.valueOf(A11666LotePed), A11667LoteCtf, A11668LoteCon, A11711LoteCtfNm, A12352LoteCtfNF, Short.valueOf(A14017LoteNEmb), A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
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
                        resetCaption1TP0( ) ;
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
            load1TP1632( ) ;
         }
         endLevel1TP1632( ) ;
      }
      closeExtendedTableCursors1TP1632( ) ;
   }

   public void update1TP1632( )
   {
      beforeValidate1TP1632( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TP1632( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TP1632( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TP1632( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TP1632( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TP12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A11666LotePed), A11667LoteCtf, A11668LoteCon, A11711LoteCtfNm, A12352LoteCtfNF, Short.valueOf(A14017LoteNEmb), A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLOTPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TP1632( ) ;
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
         endLevel1TP1632( ) ;
      }
      closeExtendedTableCursors1TP1632( ) ;
   }

   public void deferredUpdate1TP1632( )
   {
   }

   public void delete( )
   {
      beforeValidate1TP1632( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TP1632( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TP1632( ) ;
         afterConfirm1TP1632( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TP1632( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TP13 */
               pr_default.execute(11, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
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
      sMode1632 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TP1632( ) ;
      Gx_mode = sMode1632 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TP1632( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TP14 */
         pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01TP14_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         pr_default.close(12);
      }
   }

   public void endLevel1TP1632( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TP1632( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.lotprd");
         if ( AnyError == 0 )
         {
            confirmValues1TP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.lotprd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TP1632( )
   {
      /* Scan By routine */
      /* Using cursor T01TP15 */
      pr_default.execute(13);
      RcdFound1632 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A396EmprCod = T01TP15_A396EmprCod[0] ;
         A719PrdNum = T01TP15_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A11664LoteID = T01TP15_A11664LoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = T01TP15_A11665LoteFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TP1632( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1632 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A396EmprCod = T01TP15_A396EmprCod[0] ;
         A719PrdNum = T01TP15_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A11664LoteID = T01TP15_A11664LoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = T01TP15_A11665LoteFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      }
   }

   public void scanEnd1TP1632( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1TP1632( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TP1632( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TP1632( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TP1632( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TP1632( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TP1632( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TP1632( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtLoteFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), true);
      edtLoteID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), true);
      edtLotePed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), true);
      edtLoteNEmb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteNEmb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteNEmb_Enabled), 5, 0), true);
      cmbLoteCtf.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbLoteCtf.getInternalname(), "Enabled", GXutil.ltrimstr( cmbLoteCtf.getEnabled(), 5, 0), true);
      cmbLoteCon.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbLoteCon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbLoteCon.getEnabled(), 5, 0), true);
      edtLoteCtfNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNm_Enabled), 5, 0), true);
      edtLoteCtfNF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNF_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TP1632( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TP0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.lotprd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.formatDateParm(AV9LoteFec)),GXutil.URLEncode(GXutil.rtrim(AV10LoteID))}, new String[] {"Gx_mode","EmprCod","PrdNum","LoteFec","LoteID"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"LOTPRD");
      forbiddenHiddens.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\lotprd:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11664LoteID", GXutil.rtrim( Z11664LoteID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11665LoteFec", localUtil.dtoc( Z11665LoteFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11666LotePed", GXutil.ltrim( localUtil.ntoc( Z11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11667LoteCtf", GXutil.rtrim( Z11667LoteCtf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11668LoteCon", GXutil.rtrim( Z11668LoteCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11711LoteCtfNm", GXutil.rtrim( Z11711LoteCtfNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12352LoteCtfNF", GXutil.rtrim( Z12352LoteCtfNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14017LoteNEmb", GXutil.ltrim( localUtil.ntoc( Z14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV8PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTEFEC", localUtil.dtoc( AV9LoteFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEFEC", getSecureSignedToken( "", AV9LoteFec));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTEID", GXutil.rtrim( AV10LoteID));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10LoteID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Enabled", GXutil.booltostr( Dvpanel_unnamedtable2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      return formatLink("app.stocksquimicos.lotprd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum)),GXutil.URLEncode(GXutil.formatDateParm(AV9LoteFec)),GXutil.URLEncode(GXutil.rtrim(AV10LoteID))}, new String[] {"Gx_mode","EmprCod","PrdNum","LoteFec","LoteID"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.LOTPRD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Lotes Producto", "") ;
   }

   public void initializeNonKey1TP1632( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A11666LotePed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
      A11711LoteCtfNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
      A12352LoteCtfNF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
      A14017LoteNEmb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
      A11667LoteCtf = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
      A11668LoteCon = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
      Z11666LotePed = 0 ;
      Z11667LoteCtf = "" ;
      Z11668LoteCon = "" ;
      Z11711LoteCtfNm = "" ;
      Z12352LoteCtfNF = "" ;
      Z14017LoteNEmb = (short)(0) ;
   }

   public void initAll1TP1632( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A11664LoteID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
      A11665LoteFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      initializeNonKey1TP1632( ) ;
   }

   public void standaloneModalInsert( )
   {
      A11667LoteCtf = i11667LoteCtf ;
      httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
      A11668LoteCon = i11668LoteCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102119", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/lotprd.js", "?202682116102120", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtLoteFec_Internalname = "LOTEFEC" ;
      edtLoteID_Internalname = "LOTEID" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtLotePed_Internalname = "LOTEPED" ;
      edtLoteNEmb_Internalname = "LOTENEMB" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      cmbLoteCtf.setInternalname( "LOTECTF" );
      cmbLoteCon.setInternalname( "LOTECON" );
      edtLoteCtfNm_Internalname = "LOTECTFNM" ;
      edtLoteCtfNF_Internalname = "LOTECTFNF" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
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
      Form.setCaption( httpContext.getMessage( "Lotes Producto", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtLoteCtfNF_Jsonclick = "" ;
      edtLoteCtfNF_Enabled = 1 ;
      edtLoteCtfNm_Jsonclick = "" ;
      edtLoteCtfNm_Enabled = 1 ;
      cmbLoteCon.setJsonclick( "" );
      cmbLoteCon.setEnabled( 1 );
      cmbLoteCtf.setJsonclick( "" );
      cmbLoteCtf.setEnabled( 1 );
      edtLoteNEmb_Jsonclick = "" ;
      edtLoteNEmb_Enabled = 1 ;
      edtLotePed_Jsonclick = "" ;
      edtLotePed_Enabled = 1 ;
      edtLoteID_Jsonclick = "" ;
      edtLoteID_Enabled = 1 ;
      edtLoteFec_Jsonclick = "" ;
      edtLoteFec_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Dados Lote", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 0 ;
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
      cmbLoteCtf.setName( "LOTECTF" );
      cmbLoteCtf.setWebtags( "" );
      cmbLoteCtf.addItem("S", httpContext.getMessage( "Sim", ""), (short)(0));
      cmbLoteCtf.addItem("N", httpContext.getMessage( "Não", ""), (short)(0));
      if ( cmbLoteCtf.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11667LoteCtf)==0) )
         {
            A11667LoteCtf = httpContext.getMessage( "N", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
         }
      }
      cmbLoteCon.setName( "LOTECON" );
      cmbLoteCon.setWebtags( "" );
      cmbLoteCon.addItem("S", httpContext.getMessage( "Sim", ""), (short)(0));
      cmbLoteCon.addItem("N", httpContext.getMessage( "Não", ""), (short)(0));
      if ( cmbLoteCon.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11668LoteCon)==0) )
         {
            A11668LoteCon = httpContext.getMessage( "N", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
         }
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

   public void valid_Prdnum( )
   {
      /* Using cursor T01TP14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01TP14_A718PrdNom[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV9LoteFec',fld:'vLOTEFEC',pic:'',hsh:true},{av:'AV10LoteID',fld:'vLOTEID',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV9LoteFec',fld:'vLOTEFEC',pic:'',hsh:true},{av:'AV10LoteID',fld:'vLOTEID',pic:'',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TP2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("VALID_LOTEFEC","{handler:'valid_Lotefec',iparms:[]");
      setEventMetadata("VALID_LOTEFEC",",oparms:[]}");
      setEventMetadata("VALID_LOTEID","{handler:'valid_Loteid',iparms:[]");
      setEventMetadata("VALID_LOTEID",",oparms:[]}");
      setEventMetadata("VALID_LOTECTF","{handler:'valid_Lotectf',iparms:[]");
      setEventMetadata("VALID_LOTECTF",",oparms:[]}");
      setEventMetadata("VALID_LOTECON","{handler:'valid_Lotecon',iparms:[]");
      setEventMetadata("VALID_LOTECON",",oparms:[]}");
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
      wcpOAV7EmprCod = "" ;
      wcpOAV8PrdNum = "" ;
      wcpOAV9LoteFec = GXutil.nullDate() ;
      wcpOAV10LoteID = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z11664LoteID = "" ;
      Z11665LoteFec = GXutil.nullDate() ;
      Z11667LoteCtf = "" ;
      Z11668LoteCon = "" ;
      Z11711LoteCtfNm = "" ;
      Z12352LoteCtfNF = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV8PrdNum = "" ;
      AV9LoteFec = GXutil.nullDate() ;
      AV10LoteID = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A11667LoteCtf = "" ;
      A11668LoteCon = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A718PrdNom = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A11665LoteFec = GXutil.nullDate() ;
      A11664LoteID = "" ;
      A11711LoteCtfNm = "" ;
      A12352LoteCtfNF = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV15Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A407EmprNom = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1632 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV16Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV17Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV18Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z718PrdNom = "" ;
      T01TP4_A407EmprNom = new String[] {""} ;
      T01TP4_n407EmprNom = new boolean[] {false} ;
      T01TP5_A718PrdNom = new String[] {""} ;
      T01TP6_A11664LoteID = new String[] {""} ;
      T01TP6_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TP6_A407EmprNom = new String[] {""} ;
      T01TP6_n407EmprNom = new boolean[] {false} ;
      T01TP6_A718PrdNom = new String[] {""} ;
      T01TP6_A11666LotePed = new int[1] ;
      T01TP6_A11667LoteCtf = new String[] {""} ;
      T01TP6_A11668LoteCon = new String[] {""} ;
      T01TP6_A11711LoteCtfNm = new String[] {""} ;
      T01TP6_A12352LoteCtfNF = new String[] {""} ;
      T01TP6_A14017LoteNEmb = new short[1] ;
      T01TP6_A396EmprCod = new String[] {""} ;
      T01TP6_A719PrdNum = new String[] {""} ;
      T01TP7_A718PrdNom = new String[] {""} ;
      T01TP8_A396EmprCod = new String[] {""} ;
      T01TP8_A719PrdNum = new String[] {""} ;
      T01TP8_A11664LoteID = new String[] {""} ;
      T01TP8_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TP3_A11664LoteID = new String[] {""} ;
      T01TP3_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TP3_A11666LotePed = new int[1] ;
      T01TP3_A11667LoteCtf = new String[] {""} ;
      T01TP3_A11668LoteCon = new String[] {""} ;
      T01TP3_A11711LoteCtfNm = new String[] {""} ;
      T01TP3_A12352LoteCtfNF = new String[] {""} ;
      T01TP3_A14017LoteNEmb = new short[1] ;
      T01TP3_A396EmprCod = new String[] {""} ;
      T01TP3_A719PrdNum = new String[] {""} ;
      T01TP9_A396EmprCod = new String[] {""} ;
      T01TP9_A719PrdNum = new String[] {""} ;
      T01TP9_A11664LoteID = new String[] {""} ;
      T01TP9_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TP10_A396EmprCod = new String[] {""} ;
      T01TP10_A719PrdNum = new String[] {""} ;
      T01TP10_A11664LoteID = new String[] {""} ;
      T01TP10_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TP2_A11664LoteID = new String[] {""} ;
      T01TP2_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TP2_A11666LotePed = new int[1] ;
      T01TP2_A11667LoteCtf = new String[] {""} ;
      T01TP2_A11668LoteCon = new String[] {""} ;
      T01TP2_A11711LoteCtfNm = new String[] {""} ;
      T01TP2_A12352LoteCtfNF = new String[] {""} ;
      T01TP2_A14017LoteNEmb = new short[1] ;
      T01TP2_A396EmprCod = new String[] {""} ;
      T01TP2_A719PrdNum = new String[] {""} ;
      T01TP14_A718PrdNom = new String[] {""} ;
      T01TP15_A396EmprCod = new String[] {""} ;
      T01TP15_A719PrdNum = new String[] {""} ;
      T01TP15_A11664LoteID = new String[] {""} ;
      T01TP15_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11667LoteCtf = "" ;
      i11668LoteCon = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotprd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotprd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotprd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotprd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotprd__default(),
         new Object[] {
             new Object[] {
            T01TP2_A11664LoteID, T01TP2_A11665LoteFec, T01TP2_A11666LotePed, T01TP2_A11667LoteCtf, T01TP2_A11668LoteCon, T01TP2_A11711LoteCtfNm, T01TP2_A12352LoteCtfNF, T01TP2_A14017LoteNEmb, T01TP2_A396EmprCod, T01TP2_A719PrdNum
            }
            , new Object[] {
            T01TP3_A11664LoteID, T01TP3_A11665LoteFec, T01TP3_A11666LotePed, T01TP3_A11667LoteCtf, T01TP3_A11668LoteCon, T01TP3_A11711LoteCtfNm, T01TP3_A12352LoteCtfNF, T01TP3_A14017LoteNEmb, T01TP3_A396EmprCod, T01TP3_A719PrdNum
            }
            , new Object[] {
            T01TP4_A407EmprNom, T01TP4_n407EmprNom
            }
            , new Object[] {
            T01TP5_A718PrdNom
            }
            , new Object[] {
            T01TP6_A11664LoteID, T01TP6_A11665LoteFec, T01TP6_A407EmprNom, T01TP6_n407EmprNom, T01TP6_A718PrdNom, T01TP6_A11666LotePed, T01TP6_A11667LoteCtf, T01TP6_A11668LoteCon, T01TP6_A11711LoteCtfNm, T01TP6_A12352LoteCtfNF,
            T01TP6_A14017LoteNEmb, T01TP6_A396EmprCod, T01TP6_A719PrdNum
            }
            , new Object[] {
            T01TP7_A718PrdNom
            }
            , new Object[] {
            T01TP8_A396EmprCod, T01TP8_A719PrdNum, T01TP8_A11664LoteID, T01TP8_A11665LoteFec
            }
            , new Object[] {
            T01TP9_A396EmprCod, T01TP9_A719PrdNum, T01TP9_A11664LoteID, T01TP9_A11665LoteFec
            }
            , new Object[] {
            T01TP10_A396EmprCod, T01TP10_A719PrdNum, T01TP10_A11664LoteID, T01TP10_A11665LoteFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TP14_A718PrdNom
            }
            , new Object[] {
            T01TP15_A396EmprCod, T01TP15_A719PrdNum, T01TP15_A11664LoteID, T01TP15_A11665LoteFec
            }
         }
      );
      AV15Pgmname = "StocksQuimicos.LOTPRD" ;
      Z11668LoteCon = httpContext.getMessage( "N", "") ;
      A11668LoteCon = httpContext.getMessage( "N", "") ;
      i11668LoteCon = httpContext.getMessage( "N", "") ;
      Z11667LoteCtf = httpContext.getMessage( "N", "") ;
      A11667LoteCtf = httpContext.getMessage( "N", "") ;
      i11667LoteCtf = httpContext.getMessage( "N", "") ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z14017LoteNEmb ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14017LoteNEmb ;
   private short RcdFound1632 ;
   private short nIsDirty_1632 ;
   private int Z11666LotePed ;
   private int trnEnded ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtLoteFec_Enabled ;
   private int edtLoteID_Enabled ;
   private int A11666LotePed ;
   private int edtLotePed_Enabled ;
   private int edtLoteNEmb_Enabled ;
   private int edtLoteCtfNm_Enabled ;
   private int edtLoteCtfNF_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV8PrdNum ;
   private String wcpOAV10LoteID ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z11664LoteID ;
   private String Z11667LoteCtf ;
   private String Z11668LoteCon ;
   private String Z11711LoteCtfNm ;
   private String Z12352LoteCtfNF ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV8PrdNum ;
   private String AV10LoteID ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLoteFec_Internalname ;
   private String A11667LoteCtf ;
   private String A11668LoteCon ;
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
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String edtLoteFec_Jsonclick ;
   private String edtLoteID_Internalname ;
   private String A11664LoteID ;
   private String edtLoteID_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtLotePed_Internalname ;
   private String edtLotePed_Jsonclick ;
   private String edtLoteNEmb_Internalname ;
   private String edtLoteNEmb_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtLoteCtfNm_Internalname ;
   private String A11711LoteCtfNm ;
   private String edtLoteCtfNm_Jsonclick ;
   private String edtLoteCtfNF_Internalname ;
   private String A12352LoteCtfNF ;
   private String edtLoteCtfNF_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV15Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A407EmprNom ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1632 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV16Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV17Emprnom ;
   private String GXv_char3[] ;
   private String AV18Usurcod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11667LoteCtf ;
   private String i11668LoteCon ;
   private java.util.Date wcpOAV9LoteFec ;
   private java.util.Date Z11665LoteFec ;
   private java.util.Date AV9LoteFec ;
   private java.util.Date A11665LoteFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbLoteCtf ;
   private HTMLChoice cmbLoteCon ;
   private IDataStoreProvider pr_default ;
   private String[] T01TP4_A407EmprNom ;
   private boolean[] T01TP4_n407EmprNom ;
   private String[] T01TP5_A718PrdNom ;
   private String[] T01TP6_A11664LoteID ;
   private java.util.Date[] T01TP6_A11665LoteFec ;
   private String[] T01TP6_A407EmprNom ;
   private boolean[] T01TP6_n407EmprNom ;
   private String[] T01TP6_A718PrdNom ;
   private int[] T01TP6_A11666LotePed ;
   private String[] T01TP6_A11667LoteCtf ;
   private String[] T01TP6_A11668LoteCon ;
   private String[] T01TP6_A11711LoteCtfNm ;
   private String[] T01TP6_A12352LoteCtfNF ;
   private short[] T01TP6_A14017LoteNEmb ;
   private String[] T01TP6_A396EmprCod ;
   private String[] T01TP6_A719PrdNum ;
   private String[] T01TP7_A718PrdNom ;
   private String[] T01TP8_A396EmprCod ;
   private String[] T01TP8_A719PrdNum ;
   private String[] T01TP8_A11664LoteID ;
   private java.util.Date[] T01TP8_A11665LoteFec ;
   private String[] T01TP3_A11664LoteID ;
   private java.util.Date[] T01TP3_A11665LoteFec ;
   private int[] T01TP3_A11666LotePed ;
   private String[] T01TP3_A11667LoteCtf ;
   private String[] T01TP3_A11668LoteCon ;
   private String[] T01TP3_A11711LoteCtfNm ;
   private String[] T01TP3_A12352LoteCtfNF ;
   private short[] T01TP3_A14017LoteNEmb ;
   private String[] T01TP3_A396EmprCod ;
   private String[] T01TP3_A719PrdNum ;
   private String[] T01TP9_A396EmprCod ;
   private String[] T01TP9_A719PrdNum ;
   private String[] T01TP9_A11664LoteID ;
   private java.util.Date[] T01TP9_A11665LoteFec ;
   private String[] T01TP10_A396EmprCod ;
   private String[] T01TP10_A719PrdNum ;
   private String[] T01TP10_A11664LoteID ;
   private java.util.Date[] T01TP10_A11665LoteFec ;
   private String[] T01TP2_A11664LoteID ;
   private java.util.Date[] T01TP2_A11665LoteFec ;
   private int[] T01TP2_A11666LotePed ;
   private String[] T01TP2_A11667LoteCtf ;
   private String[] T01TP2_A11668LoteCon ;
   private String[] T01TP2_A11711LoteCtfNm ;
   private String[] T01TP2_A12352LoteCtfNF ;
   private short[] T01TP2_A14017LoteNEmb ;
   private String[] T01TP2_A396EmprCod ;
   private String[] T01TP2_A719PrdNum ;
   private String[] T01TP14_A718PrdNom ;
   private String[] T01TP15_A396EmprCod ;
   private String[] T01TP15_A719PrdNum ;
   private String[] T01TP15_A11664LoteID ;
   private java.util.Date[] T01TP15_A11665LoteFec ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
}

final  class lotprd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lotprd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lotprd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lotprd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lotprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TP2", "SELECT LoteID, LoteFec, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, LoteNEmb, EmprCod, PrdNum FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?  FOR UPDATE OF LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, LoteNEmb NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TP3", "SELECT LoteID, LoteFec, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, LoteNEmb, EmprCod, PrdNum FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TP4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TP5", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TP6", "SELECT /*+ FIRST_ROWS(100) */ TM1.LoteID, TM1.LoteFec, T2.EmprNom, T3.PrdNom, TM1.LotePed, TM1.LoteCtf, TM1.LoteCon, TM1.LoteCtfNm, TM1.LoteCtfNF, TM1.LoteNEmb, TM1.EmprCod, TM1.PrdNum FROM ((TXPLOTPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.LoteID = ? and TM1.LoteFec = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.LoteID, TM1.LoteFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TP7", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TP8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TP9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and LoteID > ? or LoteID = ? and PrdNum = ? and EmprCod = ? and LoteFec > ?) ORDER BY EmprCod, PrdNum, LoteID, LoteFec) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TP10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and LoteID < ? or LoteID = ? and PrdNum = ? and EmprCod = ? and LoteFec < ?) ORDER BY EmprCod DESC, PrdNum DESC, LoteID DESC, LoteFec DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TP11", "INSERT INTO TXPLOTPRD(LoteID, LoteFec, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, LoteNEmb, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLOTPRD")
         ,new UpdateCursor("T01TP12", "UPDATE TXPLOTPRD SET LotePed=?, LoteCtf=?, LoteCon=?, LoteCtfNm=?, LoteCtfNF=?, LoteNEmb=?  WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?", GX_NOMASK, "TXPLOTPRD")
         ,new UpdateCursor("T01TP13", "DELETE FROM TXPLOTPRD  WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?", GX_NOMASK, "TXPLOTPRD")
         ,new ForEachCursor("T01TP14", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TP15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD ORDER BY EmprCod, PrdNum, LoteID, LoteFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 50);
               ((String[]) buf[9])[0] = rslt.getString(9, 50);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setString(7, (String)parms[6], 26);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setDate(10, (java.util.Date)parms[9]);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setString(7, (String)parms[6], 26);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setDate(10, (java.util.Date)parms[9]);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 50);
               stmt.setString(7, (String)parms[6], 50);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 50);
               stmt.setString(5, (String)parms[4], 50);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setDate(10, (java.util.Date)parms[9]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

