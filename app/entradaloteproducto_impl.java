package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaloteproducto_impl extends GXDataArea
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
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
            A718PrdNom = httpContext.GetPar( "PrdNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            AV7LotePed = (int)(GXutil.lval( httpContext.GetPar( "LotePed"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7LotePed), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEPED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7LotePed), "ZZZZZZZ9")));
            AV8LoteFec = localUtil.parseDateParm( httpContext.GetPar( "LoteFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8LoteFec", localUtil.format(AV8LoteFec, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEFEC", getSecureSignedToken( "", AV8LoteFec));
            A14017LoteNEmb = (short)(GXutil.lval( httpContext.GetPar( "LoteNEmb"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LOTENEMB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9")));
            AV14LoteID = httpContext.GetPar( "LoteID") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14LoteID", AV14LoteID);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14LoteID, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Lote Producto", ""), (short)(0)) ;
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

   public entradaloteproducto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaloteproducto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaloteproducto_impl.class ));
   }

   public entradaloteproducto_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 CellMarginTop", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlotes_Internalname, "", httpContext.getMessage( "Ver LOTES", ""), bttBtnlotes_Jsonclick, 7, httpContext.getMessage( "Ver LOTES", ""), "", StyleString, ClassString, bttBtnlotes_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111t71632_client"+"'", TempTags, "", 2, "HLP_EntradaLoteProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaLoteProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaLoteProducto.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteFec_Internalname, httpContext.getMessage( "Fecha Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLoteFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteFec_Internalname, localUtil.format(A11665LoteFec, "99/99/99"), localUtil.format( A11665LoteFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteFec_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaLoteProducto.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLoteFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLoteFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_EntradaLoteProducto.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteID_Internalname, httpContext.getMessage( "Lote ID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteID_Internalname, GXutil.rtrim( A11664LoteID), GXutil.rtrim( localUtil.format( A11664LoteID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteID_Enabled, 1, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaLoteProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteNEmb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteNEmb_Internalname, httpContext.getMessage( "Emb.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteNEmb_Internalname, GXutil.ltrim( localUtil.ntoc( A14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLoteNEmb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteNEmb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteNEmb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaLoteProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLotePed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLotePed_Internalname, httpContext.getMessage( "Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLotePed_Internalname, GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11666LotePed), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLotePed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLotePed_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaLoteProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbLoteCtf.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbLoteCtf.getInternalname(), httpContext.getMessage( "Cert.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbLoteCtf, cmbLoteCtf.getInternalname(), GXutil.rtrim( A11667LoteCtf), 1, cmbLoteCtf.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbLoteCtf.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "", true, (byte)(0), "HLP_EntradaLoteProducto.htm");
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
      app.GxWebStd.gx_label_element( httpContext, cmbLoteCon.getInternalname(), httpContext.getMessage( "Cons.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbLoteCon, cmbLoteCon.getInternalname(), GXutil.rtrim( A11668LoteCon), 1, cmbLoteCon.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbLoteCon.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "", true, (byte)(0), "HLP_EntradaLoteProducto.htm");
      cmbLoteCon.setValue( GXutil.rtrim( A11668LoteCon) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLoteCon.getInternalname(), "Values", cmbLoteCon.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteCtfNm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteCtfNm_Internalname, httpContext.getMessage( "Certificado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteCtfNm_Internalname, GXutil.rtrim( A11711LoteCtfNm), GXutil.rtrim( localUtil.format( A11711LoteCtfNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteCtfNm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteCtfNm_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaLoteProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteCtfNF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteCtfNF_Internalname, httpContext.getMessage( "Certificado Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteCtfNF_Internalname, GXutil.rtrim( A12352LoteCtfNF), GXutil.rtrim( localUtil.format( A12352LoteCtfNF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteCtfNF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLoteCtfNF_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaLoteProducto.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaLoteProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaLoteProducto.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaLoteProducto.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV19Pgmname), GXutil.rtrim( localUtil.format( AV19Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaLoteProducto.htm");
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
      e121T72 ();
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
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N396EmprCod = httpContext.cgiGet( "N396EmprCod") ;
            AV8LoteFec = localUtil.ctod( httpContext.cgiGet( "vLOTEFEC"), 0) ;
            AV7LotePed = (int)(localUtil.ctol( httpContext.cgiGet( "vLOTEPED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14LoteID = httpContext.cgiGet( "vLOTEID") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
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
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
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
            A14017LoteNEmb = (short)(localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LOTENEMB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9")));
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
            AV19Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Pgmname", AV19Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"EntradaLoteProducto");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A11664LoteID, Z11664LoteID) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11665LoteFec), GXutil.resetTime(Z11665LoteFec)) ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("entradaloteproducto:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
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
                        confirm_1T70( ) ;
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
                        e121T72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131T72 ();
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
         e131T72 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1T71632( ) ;
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
         disableAttributes1T71632( ) ;
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

   public void confirm_1T70( )
   {
      beforeValidate1T71632( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T71632( ) ;
         }
         else
         {
            checkExtendedTable1T71632( ) ;
            closeExtendedTableCursors1T71632( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1T70( )
   {
   }

   public void e121T72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaloteproducto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaloteproducto_impl.this.A396EmprCod = GXv_char2[0] ;
      entradaloteproducto_impl.this.AV10EmprNom = GXv_char3[0] ;
      entradaloteproducto_impl.this.AV11UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprNom", AV10EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV11UsurCod", AV11UsurCod);
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradaloteproducto_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      GXv_char4[0] = AV12EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char2[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradaloteproducto_impl.this.AV12EmprCod = GXv_char4[0] ;
      entradaloteproducto_impl.this.AV10EmprNom = GXv_char3[0] ;
      entradaloteproducto_impl.this.AV11UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprNom", AV10EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV11UsurCod", AV11UsurCod);
      GXv_SdtWWPContext5[0] = AV15WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV15WWPContext = GXv_SdtWWPContext5[0] ;
      AV16TrnContext.fromxml(AV17WebSession.getValue("TrnContext"), null, null);
   }

   public void e131T72( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.etiquetascopias", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom)),GXutil.URLEncode(GXutil.rtrim(A11664LoteID)),GXutil.URLEncode(GXutil.ltrimstr(A14017LoteNEmb,4,0)),GXutil.URLEncode(GXutil.formatDateParm(A11665LoteFec))}, new String[] {"EmprCod","PrdNum","PrdNom","EntLotN","NumeroCopiasin","LoteFec"}) , new Object[] {"A396EmprCod","A719PrdNum","A718PrdNom","A11664LoteID","A14017LoteNEmb","A11665LoteFec"});
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void zm1T71632( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11666LotePed = T01T73_A11666LotePed[0] ;
            Z11667LoteCtf = T01T73_A11667LoteCtf[0] ;
            Z11668LoteCon = T01T73_A11668LoteCon[0] ;
            Z11711LoteCtfNm = T01T73_A11711LoteCtfNm[0] ;
            Z12352LoteCtfNF = T01T73_A12352LoteCtfNF[0] ;
         }
         else
         {
            Z11666LotePed = A11666LotePed ;
            Z11667LoteCtf = A11667LoteCtf ;
            Z11668LoteCon = A11668LoteCon ;
            Z11711LoteCtfNm = A11711LoteCtfNm ;
            Z12352LoteCtfNF = A12352LoteCtfNF ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z14017LoteNEmb = A14017LoteNEmb ;
         Z11664LoteID = A11664LoteID ;
         Z11665LoteFec = A11665LoteFec ;
         Z11666LotePed = A11666LotePed ;
         Z11667LoteCtf = A11667LoteCtf ;
         Z11668LoteCon = A11668LoteCon ;
         Z11711LoteCtfNm = A11711LoteCtfNm ;
         Z12352LoteCtfNF = A12352LoteCtfNF ;
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
      AV19Pgmname = "EntradaLoteProducto" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Pgmname", AV19Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      /* Using cursor T01T74 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01T74_A407EmprNom[0] ;
      n407EmprNom = T01T74_n407EmprNom[0] ;
      pr_default.close(2);
      /* Using cursor T01T75 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
      if ( ( AV7LotePed > 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtLotePed_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), true);
      }
      else
      {
         edtLotePed_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), true);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8LoteFec)) )
      {
         A11665LoteFec = AV8LoteFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      }
      else
      {
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( AV7LotePed > 0 ) )
         {
            A11665LoteFec = AV8LoteFec ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8LoteFec)) )
      {
         edtLoteFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), true);
      }
      else
      {
         edtLoteFec_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), true);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8LoteFec)) )
      {
         edtLoteFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV14LoteID)==0) )
      {
         A11664LoteID = AV14LoteID ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
      }
      else
      {
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14LoteID)==0) )
         {
            A11664LoteID = AV14LoteID ;
            httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         }
      }
      if ( ! (GXutil.strcmp("", AV14LoteID)==0) )
      {
         edtLoteID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), true);
      }
      else
      {
         edtLoteID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV14LoteID)==0) )
      {
         edtLoteID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         A11666LotePed = AV7LotePed ;
         httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
      }
      if ( ( AV7LotePed > 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtLotePed_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), true);
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
      }
   }

   public void load1T71632( )
   {
      /* Using cursor T01T76 */
      pr_default.execute(4, new Object[] {Short.valueOf(A14017LoteNEmb), A11664LoteID, A11665LoteFec, A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A11666LotePed = T01T76_A11666LotePed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
         A407EmprNom = T01T76_A407EmprNom[0] ;
         n407EmprNom = T01T76_n407EmprNom[0] ;
         A11667LoteCtf = T01T76_A11667LoteCtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
         A11668LoteCon = T01T76_A11668LoteCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
         A11711LoteCtfNm = T01T76_A11711LoteCtfNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
         A12352LoteCtfNF = T01T76_A12352LoteCtfNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
         zm1T71632( -18) ;
      }
      pr_default.close(4);
      onLoadActions1T71632( ) ;
   }

   public void onLoadActions1T71632( )
   {
   }

   public void checkExtendedTable1T71632( )
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
   }

   public void closeExtendedTableCursors1T71632( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1T71632( )
   {
      /* Using cursor T01T77 */
      pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1632 = (short)(1) ;
      }
      else
      {
         RcdFound1632 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01T73 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(1) != 101) && ( T01T73_A14017LoteNEmb[0] == A14017LoteNEmb ) && ( GXutil.strcmp(T01T73_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01T73_A719PrdNum[0], A719PrdNum) == 0 ) )
      {
         zm1T71632( 18) ;
         RcdFound1632 = (short)(1) ;
         A11664LoteID = T01T73_A11664LoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = T01T73_A11665LoteFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
         A11666LotePed = T01T73_A11666LotePed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
         A11667LoteCtf = T01T73_A11667LoteCtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
         A11668LoteCon = T01T73_A11668LoteCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
         A11711LoteCtfNm = T01T73_A11711LoteCtfNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
         A12352LoteCtfNF = T01T73_A12352LoteCtfNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z11664LoteID = A11664LoteID ;
         Z11665LoteFec = A11665LoteFec ;
         sMode1632 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1T71632( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1632 = (short)(0) ;
            initializeNonKey1T71632( ) ;
         }
         Gx_mode = sMode1632 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1632 = (short)(0) ;
         initializeNonKey1T71632( ) ;
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
      getKey1T71632( ) ;
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
      /* Using cursor T01T78 */
      pr_default.execute(6, new Object[] {A11664LoteID, A11664LoteID, A11665LoteFec, Short.valueOf(A14017LoteNEmb), A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01T78_A11664LoteID[0], A11664LoteID) < 0 ) || ( GXutil.strcmp(T01T78_A11664LoteID[0], A11664LoteID) == 0 ) && GXutil.resetTime(T01T78_A11665LoteFec[0]).before( GXutil.resetTime( A11665LoteFec )) ) && ( T01T78_A14017LoteNEmb[0] == A14017LoteNEmb ) && ( GXutil.strcmp(T01T78_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01T78_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01T78_A11664LoteID[0], A11664LoteID) > 0 ) || ( GXutil.strcmp(T01T78_A11664LoteID[0], A11664LoteID) == 0 ) && GXutil.resetTime(T01T78_A11665LoteFec[0]).after( GXutil.resetTime( A11665LoteFec )) ) && ( T01T78_A14017LoteNEmb[0] == A14017LoteNEmb ) && ( GXutil.strcmp(T01T78_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01T78_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            A11664LoteID = T01T78_A11664LoteID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
            A11665LoteFec = T01T78_A11665LoteFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
            RcdFound1632 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1632 = (short)(0) ;
      /* Using cursor T01T79 */
      pr_default.execute(7, new Object[] {A11664LoteID, A11664LoteID, A11665LoteFec, Short.valueOf(A14017LoteNEmb), A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01T79_A11664LoteID[0], A11664LoteID) > 0 ) || ( GXutil.strcmp(T01T79_A11664LoteID[0], A11664LoteID) == 0 ) && GXutil.resetTime(T01T79_A11665LoteFec[0]).after( GXutil.resetTime( A11665LoteFec )) ) && ( T01T79_A14017LoteNEmb[0] == A14017LoteNEmb ) && ( GXutil.strcmp(T01T79_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01T79_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01T79_A11664LoteID[0], A11664LoteID) < 0 ) || ( GXutil.strcmp(T01T79_A11664LoteID[0], A11664LoteID) == 0 ) && GXutil.resetTime(T01T79_A11665LoteFec[0]).before( GXutil.resetTime( A11665LoteFec )) ) && ( T01T79_A14017LoteNEmb[0] == A14017LoteNEmb ) && ( GXutil.strcmp(T01T79_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01T79_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            A11664LoteID = T01T79_A11664LoteID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
            A11665LoteFec = T01T79_A11665LoteFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
            RcdFound1632 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T71632( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLoteFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1T71632( ) ;
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
               update1T71632( ) ;
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
               insert1T71632( ) ;
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
                  insert1T71632( ) ;
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

   public void checkOptimisticConcurrency1T71632( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T72 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLOTPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z11666LotePed != T01T72_A11666LotePed[0] ) || ( GXutil.strcmp(Z11667LoteCtf, T01T72_A11667LoteCtf[0]) != 0 ) || ( GXutil.strcmp(Z11668LoteCon, T01T72_A11668LoteCon[0]) != 0 ) || ( GXutil.strcmp(Z11711LoteCtfNm, T01T72_A11711LoteCtfNm[0]) != 0 ) || ( GXutil.strcmp(Z12352LoteCtfNF, T01T72_A12352LoteCtfNF[0]) != 0 ) )
         {
            if ( Z11666LotePed != T01T72_A11666LotePed[0] )
            {
               GXutil.writeLogln("entradaloteproducto:[seudo value changed for attri]"+"LotePed");
               GXutil.writeLogRaw("Old: ",Z11666LotePed);
               GXutil.writeLogRaw("Current: ",T01T72_A11666LotePed[0]);
            }
            if ( GXutil.strcmp(Z11667LoteCtf, T01T72_A11667LoteCtf[0]) != 0 )
            {
               GXutil.writeLogln("entradaloteproducto:[seudo value changed for attri]"+"LoteCtf");
               GXutil.writeLogRaw("Old: ",Z11667LoteCtf);
               GXutil.writeLogRaw("Current: ",T01T72_A11667LoteCtf[0]);
            }
            if ( GXutil.strcmp(Z11668LoteCon, T01T72_A11668LoteCon[0]) != 0 )
            {
               GXutil.writeLogln("entradaloteproducto:[seudo value changed for attri]"+"LoteCon");
               GXutil.writeLogRaw("Old: ",Z11668LoteCon);
               GXutil.writeLogRaw("Current: ",T01T72_A11668LoteCon[0]);
            }
            if ( GXutil.strcmp(Z11711LoteCtfNm, T01T72_A11711LoteCtfNm[0]) != 0 )
            {
               GXutil.writeLogln("entradaloteproducto:[seudo value changed for attri]"+"LoteCtfNm");
               GXutil.writeLogRaw("Old: ",Z11711LoteCtfNm);
               GXutil.writeLogRaw("Current: ",T01T72_A11711LoteCtfNm[0]);
            }
            if ( GXutil.strcmp(Z12352LoteCtfNF, T01T72_A12352LoteCtfNF[0]) != 0 )
            {
               GXutil.writeLogln("entradaloteproducto:[seudo value changed for attri]"+"LoteCtfNF");
               GXutil.writeLogRaw("Old: ",Z12352LoteCtfNF);
               GXutil.writeLogRaw("Current: ",T01T72_A12352LoteCtfNF[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLOTPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T71632( )
   {
      beforeValidate1T71632( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T71632( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T71632( 0) ;
         checkOptimisticConcurrency1T71632( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T71632( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T71632( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T710 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A14017LoteNEmb), A11664LoteID, A11665LoteFec, Integer.valueOf(A11666LotePed), A11667LoteCtf, A11668LoteCon, A11711LoteCtfNm, A12352LoteCtfNF, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption1T70( ) ;
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
            load1T71632( ) ;
         }
         endLevel1T71632( ) ;
      }
      closeExtendedTableCursors1T71632( ) ;
   }

   public void update1T71632( )
   {
      beforeValidate1T71632( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T71632( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T71632( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T71632( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T71632( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T711 */
                  pr_default.execute(9, new Object[] {Short.valueOf(A14017LoteNEmb), Integer.valueOf(A11666LotePed), A11667LoteCtf, A11668LoteCon, A11711LoteCtfNm, A12352LoteCtfNF, A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLOTPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T71632( ) ;
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
         endLevel1T71632( ) ;
      }
      closeExtendedTableCursors1T71632( ) ;
   }

   public void deferredUpdate1T71632( )
   {
   }

   public void delete( )
   {
      beforeValidate1T71632( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T71632( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T71632( ) ;
         afterConfirm1T71632( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T71632( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01T712 */
               pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
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
      endLevel1T71632( ) ;
      Gx_mode = sMode1632 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T71632( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1T71632( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1T71632( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "entradaloteproducto");
         if ( AnyError == 0 )
         {
            confirmValues1T70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "entradaloteproducto");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T71632( )
   {
      /* Scan By routine */
      /* Using cursor T01T713 */
      pr_default.execute(11, new Object[] {Short.valueOf(A14017LoteNEmb), A396EmprCod, A719PrdNum});
      RcdFound1632 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A11664LoteID = T01T713_A11664LoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = T01T713_A11665LoteFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T71632( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1632 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A11664LoteID = T01T713_A11664LoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = T01T713_A11665LoteFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      }
   }

   public void scanEnd1T71632( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1T71632( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T71632( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1T71632( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T71632( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T71632( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T71632( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T71632( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtLoteFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), true);
      edtLoteID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), true);
      edtLoteNEmb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteNEmb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteNEmb_Enabled), 5, 0), true);
      edtLotePed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), true);
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

   public void send_integrity_lvl_hashes1T71632( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LOTENEMB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9")));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1T70( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entradaloteproducto", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom)),GXutil.URLEncode(GXutil.ltrimstr(AV7LotePed,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV8LoteFec)),GXutil.URLEncode(GXutil.ltrimstr(A14017LoteNEmb,4,0)),GXutil.URLEncode(GXutil.rtrim(AV14LoteID))}, new String[] {"Gx_mode","EmprCod","PrdNum","PrdNom","LotePed","LoteFec","LoteNEmb","LoteID"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LOTENEMB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaLoteProducto");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("entradaloteproducto:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N396EmprCod", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_N396EmprCod", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTEFEC", localUtil.dtoc( AV8LoteFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEFEC", getSecureSignedToken( "", AV8LoteFec));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTEPED", GXutil.ltrim( localUtil.ntoc( AV7LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEPED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7LotePed), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTEID", GXutil.rtrim( AV14LoteID));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14LoteID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
      return formatLink("app.entradaloteproducto", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom)),GXutil.URLEncode(GXutil.ltrimstr(AV7LotePed,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV8LoteFec)),GXutil.URLEncode(GXutil.ltrimstr(A14017LoteNEmb,4,0)),GXutil.URLEncode(GXutil.rtrim(AV14LoteID))}, new String[] {"Gx_mode","EmprCod","PrdNum","PrdNom","LotePed","LoteFec","LoteNEmb","LoteID"})  ;
   }

   public String getPgmname( )
   {
      return "EntradaLoteProducto" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Lote Producto", "") ;
   }

   public void initializeNonKey1T71632( )
   {
      A11666LotePed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
      A11711LoteCtfNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
      A12352LoteCtfNF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
      A11667LoteCtf = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
      A11668LoteCon = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
      Z11666LotePed = 0 ;
      Z11667LoteCtf = "" ;
      Z11668LoteCon = "" ;
      Z11711LoteCtfNm = "" ;
      Z12352LoteCtfNF = "" ;
   }

   public void initAll1T71632( )
   {
      A11664LoteID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
      A11665LoteFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      initializeNonKey1T71632( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211695699", true, true);
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
      httpContext.AddJavascriptSource("entradaloteproducto.js", "?20268211695699", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnlotes_Internalname = "BTNLOTES" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtLoteFec_Internalname = "LOTEFEC" ;
      edtLoteID_Internalname = "LOTEID" ;
      edtLoteNEmb_Internalname = "LOTENEMB" ;
      edtLotePed_Internalname = "LOTEPED" ;
      cmbLoteCtf.setInternalname( "LOTECTF" );
      cmbLoteCon.setInternalname( "LOTECON" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtLoteCtfNm_Internalname = "LOTECTFNM" ;
      edtLoteCtfNF_Internalname = "LOTECTFNF" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
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
      Form.setCaption( httpContext.getMessage( "Entrada Lote Producto", "") );
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
      edtLotePed_Jsonclick = "" ;
      edtLotePed_Enabled = 1 ;
      edtLoteNEmb_Jsonclick = "" ;
      edtLoteNEmb_Enabled = 0 ;
      edtLoteID_Jsonclick = "" ;
      edtLoteID_Enabled = 1 ;
      edtLoteFec_Jsonclick = "" ;
      edtLoteFec_Enabled = 1 ;
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
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 0 ;
      bttBtnlotes_Visible = 1 ;
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
      cmbLoteCtf.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbLoteCtf.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
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
      cmbLoteCon.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbLoteCon.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'AV7LotePed',fld:'vLOTEPED',pic:'ZZZZZZZ9',hsh:true},{av:'AV8LoteFec',fld:'vLOTEFEC',pic:'',hsh:true},{av:'A14017LoteNEmb',fld:'LOTENEMB',pic:'ZZZ9',hsh:true},{av:'AV14LoteID',fld:'vLOTEID',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8LoteFec',fld:'vLOTEFEC',pic:'',hsh:true},{av:'AV7LotePed',fld:'vLOTEPED',pic:'ZZZZZZZ9',hsh:true},{av:'AV14LoteID',fld:'vLOTEID',pic:'',hsh:true},{av:'A14017LoteNEmb',fld:'LOTENEMB',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131T72',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A11664LoteID',fld:'LOTEID',pic:''},{av:'A14017LoteNEmb',fld:'LOTENEMB',pic:'ZZZ9',hsh:true},{av:'A11665LoteFec',fld:'LOTEFEC',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A11665LoteFec',fld:'LOTEFEC',pic:''},{av:'A14017LoteNEmb',fld:'LOTENEMB',pic:'ZZZ9',hsh:true},{av:'A11664LoteID',fld:'LOTEID',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]}");
      setEventMetadata("'DOLOTES'","{handler:'e111T71632',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("'DOLOTES'",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA719PrdNum = "" ;
      wcpOA718PrdNom = "" ;
      wcpOAV8LoteFec = GXutil.nullDate() ;
      wcpOAV14LoteID = "" ;
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
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV8LoteFec = GXutil.nullDate() ;
      AV14LoteID = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A11667LoteCtf = "" ;
      A11668LoteCon = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnlotes_Jsonclick = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A11665LoteFec = GXutil.nullDate() ;
      A11664LoteID = "" ;
      A11711LoteCtfNm = "" ;
      A12352LoteCtfNF = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV19Pgmname = "" ;
      AV12EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1632 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV9Station = "" ;
      AV10EmprNom = "" ;
      AV11UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV15WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV16TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV17WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z718PrdNom = "" ;
      T01T74_A407EmprNom = new String[] {""} ;
      T01T74_n407EmprNom = new boolean[] {false} ;
      T01T75_A718PrdNom = new String[] {""} ;
      T01T76_A718PrdNom = new String[] {""} ;
      T01T76_A14017LoteNEmb = new short[1] ;
      T01T76_A11664LoteID = new String[] {""} ;
      T01T76_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T76_A11666LotePed = new int[1] ;
      T01T76_A407EmprNom = new String[] {""} ;
      T01T76_n407EmprNom = new boolean[] {false} ;
      T01T76_A11667LoteCtf = new String[] {""} ;
      T01T76_A11668LoteCon = new String[] {""} ;
      T01T76_A11711LoteCtfNm = new String[] {""} ;
      T01T76_A12352LoteCtfNF = new String[] {""} ;
      T01T76_A396EmprCod = new String[] {""} ;
      T01T76_A719PrdNum = new String[] {""} ;
      T01T77_A396EmprCod = new String[] {""} ;
      T01T77_A719PrdNum = new String[] {""} ;
      T01T77_A11664LoteID = new String[] {""} ;
      T01T77_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T73_A14017LoteNEmb = new short[1] ;
      T01T73_A11664LoteID = new String[] {""} ;
      T01T73_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T73_A11666LotePed = new int[1] ;
      T01T73_A11667LoteCtf = new String[] {""} ;
      T01T73_A11668LoteCon = new String[] {""} ;
      T01T73_A11711LoteCtfNm = new String[] {""} ;
      T01T73_A12352LoteCtfNF = new String[] {""} ;
      T01T73_A396EmprCod = new String[] {""} ;
      T01T73_A719PrdNum = new String[] {""} ;
      T01T78_A14017LoteNEmb = new short[1] ;
      T01T78_A11664LoteID = new String[] {""} ;
      T01T78_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T78_A396EmprCod = new String[] {""} ;
      T01T78_A719PrdNum = new String[] {""} ;
      T01T79_A14017LoteNEmb = new short[1] ;
      T01T79_A11664LoteID = new String[] {""} ;
      T01T79_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T79_A396EmprCod = new String[] {""} ;
      T01T79_A719PrdNum = new String[] {""} ;
      T01T72_A14017LoteNEmb = new short[1] ;
      T01T72_A11664LoteID = new String[] {""} ;
      T01T72_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01T72_A11666LotePed = new int[1] ;
      T01T72_A11667LoteCtf = new String[] {""} ;
      T01T72_A11668LoteCon = new String[] {""} ;
      T01T72_A11711LoteCtfNm = new String[] {""} ;
      T01T72_A12352LoteCtfNF = new String[] {""} ;
      T01T72_A396EmprCod = new String[] {""} ;
      T01T72_A719PrdNum = new String[] {""} ;
      T01T713_A396EmprCod = new String[] {""} ;
      T01T713_A719PrdNum = new String[] {""} ;
      T01T713_A11664LoteID = new String[] {""} ;
      T01T713_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11667LoteCtf = "" ;
      i11668LoteCon = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.entradaloteproducto__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.entradaloteproducto__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.entradaloteproducto__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.entradaloteproducto__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradaloteproducto__default(),
         new Object[] {
             new Object[] {
            T01T72_A14017LoteNEmb, T01T72_A11664LoteID, T01T72_A11665LoteFec, T01T72_A11666LotePed, T01T72_A11667LoteCtf, T01T72_A11668LoteCon, T01T72_A11711LoteCtfNm, T01T72_A12352LoteCtfNF, T01T72_A396EmprCod, T01T72_A719PrdNum
            }
            , new Object[] {
            T01T73_A14017LoteNEmb, T01T73_A11664LoteID, T01T73_A11665LoteFec, T01T73_A11666LotePed, T01T73_A11667LoteCtf, T01T73_A11668LoteCon, T01T73_A11711LoteCtfNm, T01T73_A12352LoteCtfNF, T01T73_A396EmprCod, T01T73_A719PrdNum
            }
            , new Object[] {
            T01T74_A407EmprNom, T01T74_n407EmprNom
            }
            , new Object[] {
            T01T75_A718PrdNom
            }
            , new Object[] {
            T01T76_A718PrdNom, T01T76_A14017LoteNEmb, T01T76_A11664LoteID, T01T76_A11665LoteFec, T01T76_A11666LotePed, T01T76_A407EmprNom, T01T76_n407EmprNom, T01T76_A11667LoteCtf, T01T76_A11668LoteCon, T01T76_A11711LoteCtfNm,
            T01T76_A12352LoteCtfNF, T01T76_A396EmprCod, T01T76_A719PrdNum
            }
            , new Object[] {
            T01T77_A396EmprCod, T01T77_A719PrdNum, T01T77_A11664LoteID, T01T77_A11665LoteFec
            }
            , new Object[] {
            T01T78_A14017LoteNEmb, T01T78_A11664LoteID, T01T78_A11665LoteFec, T01T78_A396EmprCod, T01T78_A719PrdNum
            }
            , new Object[] {
            T01T79_A14017LoteNEmb, T01T79_A11664LoteID, T01T79_A11665LoteFec, T01T79_A396EmprCod, T01T79_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T713_A396EmprCod, T01T713_A719PrdNum, T01T713_A11664LoteID, T01T713_A11665LoteFec
            }
         }
      );
      Z14017LoteNEmb = (short)(0) ;
      A14017LoteNEmb = (short)(0) ;
      Z718PrdNom = "" ;
      A718PrdNom = "" ;
      Z719PrdNum = "" ;
      A719PrdNum = "" ;
      Z396EmprCod = "" ;
      N396EmprCod = "" ;
      A396EmprCod = "" ;
      AV19Pgmname = "EntradaLoteProducto" ;
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
   private short wcpOA14017LoteNEmb ;
   private short A14017LoteNEmb ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1632 ;
   private short Z14017LoteNEmb ;
   private short nIsDirty_1632 ;
   private int wcpOAV7LotePed ;
   private int Z11666LotePed ;
   private int AV7LotePed ;
   private int trnEnded ;
   private int bttBtnlotes_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtLoteFec_Enabled ;
   private int edtLoteID_Enabled ;
   private int edtLoteNEmb_Enabled ;
   private int A11666LotePed ;
   private int edtLotePed_Enabled ;
   private int edtLoteCtfNm_Enabled ;
   private int edtLoteCtfNF_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOA396EmprCod ;
   private String wcpOA719PrdNum ;
   private String wcpOA718PrdNom ;
   private String wcpOAV14LoteID ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z11664LoteID ;
   private String Z11667LoteCtf ;
   private String Z11668LoteCon ;
   private String Z11711LoteCtfNm ;
   private String Z12352LoteCtfNF ;
   private String N396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV14LoteID ;
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
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnlotes_Internalname ;
   private String bttBtnlotes_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String edtPrdNom_Jsonclick ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtLoteFec_Jsonclick ;
   private String edtLoteID_Internalname ;
   private String A11664LoteID ;
   private String edtLoteID_Jsonclick ;
   private String edtLoteNEmb_Internalname ;
   private String edtLoteNEmb_Jsonclick ;
   private String edtLotePed_Internalname ;
   private String edtLotePed_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
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
   private String AV19Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String AV12EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1632 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV9Station ;
   private String AV10EmprNom ;
   private String AV11UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11667LoteCtf ;
   private String i11668LoteCon ;
   private java.util.Date wcpOAV8LoteFec ;
   private java.util.Date Z11665LoteFec ;
   private java.util.Date AV8LoteFec ;
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
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private com.genexus.webpanels.WebSession AV17WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbLoteCtf ;
   private HTMLChoice cmbLoteCon ;
   private IDataStoreProvider pr_default ;
   private String[] T01T74_A407EmprNom ;
   private boolean[] T01T74_n407EmprNom ;
   private String[] T01T75_A718PrdNom ;
   private String[] T01T76_A718PrdNom ;
   private short[] T01T76_A14017LoteNEmb ;
   private String[] T01T76_A11664LoteID ;
   private java.util.Date[] T01T76_A11665LoteFec ;
   private int[] T01T76_A11666LotePed ;
   private String[] T01T76_A407EmprNom ;
   private boolean[] T01T76_n407EmprNom ;
   private String[] T01T76_A11667LoteCtf ;
   private String[] T01T76_A11668LoteCon ;
   private String[] T01T76_A11711LoteCtfNm ;
   private String[] T01T76_A12352LoteCtfNF ;
   private String[] T01T76_A396EmprCod ;
   private String[] T01T76_A719PrdNum ;
   private String[] T01T77_A396EmprCod ;
   private String[] T01T77_A719PrdNum ;
   private String[] T01T77_A11664LoteID ;
   private java.util.Date[] T01T77_A11665LoteFec ;
   private short[] T01T73_A14017LoteNEmb ;
   private String[] T01T73_A11664LoteID ;
   private java.util.Date[] T01T73_A11665LoteFec ;
   private int[] T01T73_A11666LotePed ;
   private String[] T01T73_A11667LoteCtf ;
   private String[] T01T73_A11668LoteCon ;
   private String[] T01T73_A11711LoteCtfNm ;
   private String[] T01T73_A12352LoteCtfNF ;
   private String[] T01T73_A396EmprCod ;
   private String[] T01T73_A719PrdNum ;
   private short[] T01T78_A14017LoteNEmb ;
   private String[] T01T78_A11664LoteID ;
   private java.util.Date[] T01T78_A11665LoteFec ;
   private String[] T01T78_A396EmprCod ;
   private String[] T01T78_A719PrdNum ;
   private short[] T01T79_A14017LoteNEmb ;
   private String[] T01T79_A11664LoteID ;
   private java.util.Date[] T01T79_A11665LoteFec ;
   private String[] T01T79_A396EmprCod ;
   private String[] T01T79_A719PrdNum ;
   private short[] T01T72_A14017LoteNEmb ;
   private String[] T01T72_A11664LoteID ;
   private java.util.Date[] T01T72_A11665LoteFec ;
   private int[] T01T72_A11666LotePed ;
   private String[] T01T72_A11667LoteCtf ;
   private String[] T01T72_A11668LoteCon ;
   private String[] T01T72_A11711LoteCtfNm ;
   private String[] T01T72_A12352LoteCtfNF ;
   private String[] T01T72_A396EmprCod ;
   private String[] T01T72_A719PrdNum ;
   private String[] T01T713_A396EmprCod ;
   private String[] T01T713_A719PrdNum ;
   private String[] T01T713_A11664LoteID ;
   private java.util.Date[] T01T713_A11665LoteFec ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV15WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV16TrnContext ;
}

final  class entradaloteproducto__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaloteproducto__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaloteproducto__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaloteproducto__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaloteproducto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T72", "SELECT LoteNEmb, LoteID, LoteFec, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, EmprCod, PrdNum FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?  FOR UPDATE OF LoteNEmb, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T73", "SELECT LoteNEmb, LoteID, LoteFec, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, EmprCod, PrdNum FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T74", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T75", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T76", "SELECT /*+ FIRST_ROWS(100) */ T3.PrdNom, TM1.LoteNEmb, TM1.LoteID, TM1.LoteFec, TM1.LotePed, T2.EmprNom, TM1.LoteCtf, TM1.LoteCon, TM1.LoteCtfNm, TM1.LoteCtfNF, TM1.EmprCod, TM1.PrdNum FROM ((TXPLOTPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) WHERE TM1.LoteNEmb = ? and TM1.LoteID = ? and TM1.LoteFec = ? and TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.LoteID, TM1.LoteFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T77", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T78", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ LoteNEmb, LoteID, LoteFec, EmprCod, PrdNum FROM TXPLOTPRD WHERE ( LoteID > ? or LoteID = ? and LoteFec > ?) and LoteNEmb = ? and EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, LoteID, LoteFec) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T79", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ LoteNEmb, LoteID, LoteFec, EmprCod, PrdNum FROM TXPLOTPRD WHERE ( LoteID < ? or LoteID = ? and LoteFec < ?) and LoteNEmb = ? and EmprCod = ? and PrdNum = ? ORDER BY EmprCod DESC, PrdNum DESC, LoteID DESC, LoteFec DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01T710", "INSERT INTO TXPLOTPRD(LoteNEmb, LoteID, LoteFec, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLOTPRD")
         ,new UpdateCursor("T01T711", "UPDATE TXPLOTPRD SET LoteNEmb=?, LotePed=?, LoteCtf=?, LoteCon=?, LoteCtfNm=?, LoteCtfNF=?  WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?", GX_NOMASK, "TXPLOTPRD")
         ,new UpdateCursor("T01T712", "DELETE FROM TXPLOTPRD  WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?", GX_NOMASK, "TXPLOTPRD")
         ,new ForEachCursor("T01T713", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE LoteNEmb = ? and EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, LoteID, LoteFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((String[]) buf[7])[0] = rslt.getString(8, 50);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((String[]) buf[7])[0] = rslt.getString(8, 50);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 50);
               ((String[]) buf[10])[0] = rslt.getString(10, 50);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 11 :
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 26);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 26);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 50);
               stmt.setString(8, (String)parms[7], 50);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 50);
               stmt.setString(6, (String)parms[5], 50);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setDate(10, (java.util.Date)parms[9]);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

