package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tintens_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"INTCOD") == 0 )
      {
         AV36IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36IntCod), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36IntCod), "Z9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaintcod1E64( AV36IntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"INTCOD") == 0 )
      {
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         n583IntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         AV40autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asaintcod1E64( A583IntCod, AV40autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa53591E64( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa53601E64( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"") == 0 )
      {
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
            AV35EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
            AV36IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36IntCod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36IntCod), "Z9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Intensidad", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tintens_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tintens_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tintens_impl.class ));
   }

   public tintens_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkIntAct = UIFactory.getCheckbox(this);
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
      A14255IntAct = ((GXutil.strcmp(GXutil.rtrim( A14255IntAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14255IntAct", A14255IntAct);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIntCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIntCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TINTENS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIntDsc_Internalname, httpContext.getMessage( "Intensidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc), GXutil.rtrim( localUtil.format( A584IntDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TINTENS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkIntAct.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkIntAct.getInternalname(), httpContext.getMessage( "Activa?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkIntAct.getInternalname(), A14255IntAct, "", httpContext.getMessage( "Activa?", ""), 1, chkIntAct.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(33, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,33);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntOrder_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIntOrder_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntOrder_Internalname, GXutil.ltrim( localUtil.ntoc( A13296IntOrder, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntOrder_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13296IntOrder), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13296IntOrder), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntOrder_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIntOrder_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TINTENS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntLava_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIntLava_Internalname, httpContext.getMessage( "Tiempo de Lavado(hh,mm)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntLava_Internalname, GXutil.ltrim( localUtil.ntoc( A5991IntLava, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntLava_Enabled!=0) ? localUtil.format( A5991IntLava, "ZZZ9.99") : localUtil.format( A5991IntLava, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntLava_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIntLava_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TINTENS.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, divUnnamedtable2_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntCodCtb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIntCodCtb_Internalname, httpContext.getMessage( "Tipo Ctb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCodCtb_Internalname, GXutil.ltrim( localUtil.ntoc( A5233IntCodCtb, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCodCtb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5233IntCodCtb), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5233IntCodCtb), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCodCtb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIntCodCtb_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TINTENS.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, divUnnamedtable3_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divIntlabli_cell_Internalname, 1, 0, "px", 0, "px", divIntlabli_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtIntLabLi_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntLabLi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIntLabLi_Internalname, httpContext.getMessage( "Valor Inicial % Colorante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntLabLi_Internalname, GXutil.ltrim( localUtil.ntoc( A5359IntLabLi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntLabLi_Enabled!=0) ? localUtil.format( A5359IntLabLi, "ZZZZ9.99999") : localUtil.format( A5359IntLabLi, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntLabLi_Jsonclick, 0, "AttributeFL", "", "", "", "", edtIntLabLi_Visible, edtIntLabLi_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TINTENS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divIntlablf_cell_Internalname, 1, 0, "px", 0, "px", divIntlablf_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtIntLabLf_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntLabLf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIntLabLf_Internalname, httpContext.getMessage( "Valor Final % Colorante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntLabLf_Internalname, GXutil.ltrim( localUtil.ntoc( A5360IntLabLf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntLabLf_Enabled!=0) ? localUtil.format( A5360IntLabLf, "ZZZZ9.99999") : localUtil.format( A5360IntLabLf, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntLabLf_Jsonclick, 0, "AttributeFL", "", "", "", "", edtIntLabLf_Visible, edtIntLabLf_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TINTENS.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, divUnnamedtable4_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntPreMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIntPreMin_Internalname, httpContext.getMessage( "Precio Mínimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntPreMin_Internalname, GXutil.ltrim( localUtil.ntoc( A7754IntPreMin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntPreMin_Enabled!=0) ? localUtil.format( A7754IntPreMin, "ZZZZZZ9.99") : localUtil.format( A7754IntPreMin, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntPreMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIntPreMin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TINTENS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtIntPreMax_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtIntPreMax_Internalname, httpContext.getMessage( "Precio Máximo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntPreMax_Internalname, GXutil.ltrim( localUtil.ntoc( A7755IntPreMax, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntPreMax_Enabled!=0) ? localUtil.format( A7755IntPreMax, "ZZZZZZ9.99") : localUtil.format( A7755IntPreMax, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntPreMax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtIntPreMax_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TINTENS.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TINTENS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TINTENS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TINTENS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV42Pgmname), GXutil.rtrim( localUtil.format( AV42Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TINTENS.htm");
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
      e111E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z583IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z584IntDsc = httpContext.cgiGet( "Z584IntDsc") ;
            Z5233IntCodCtb = (short)(localUtil.ctol( httpContext.cgiGet( "Z5233IntCodCtb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5359IntLabLi = localUtil.ctond( httpContext.cgiGet( "Z5359IntLabLi")) ;
            Z5360IntLabLf = localUtil.ctond( httpContext.cgiGet( "Z5360IntLabLf")) ;
            Z5991IntLava = localUtil.ctond( httpContext.cgiGet( "Z5991IntLava")) ;
            Z7754IntPreMin = localUtil.ctond( httpContext.cgiGet( "Z7754IntPreMin")) ;
            Z7755IntPreMax = localUtil.ctond( httpContext.cgiGet( "Z7755IntPreMax")) ;
            Z13296IntOrder = (short)(localUtil.ctol( httpContext.cgiGet( "Z13296IntOrder"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14255IntAct = httpContext.cgiGet( "Z14255IntAct") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A13744IntCDsc = httpContext.cgiGet( "INTCDSC") ;
            AV35EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV36IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A583IntCod = (byte)(0) ;
               n583IntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            }
            else
            {
               A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n583IntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            }
            A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
            n584IntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
            A14255IntAct = ((GXutil.strcmp(httpContext.cgiGet( chkIntAct.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14255IntAct", A14255IntAct);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntOrder_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntOrder_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntOrder_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13296IntOrder = (short)(0) ;
               n13296IntOrder = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13296IntOrder", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13296IntOrder), 4, 0));
            }
            else
            {
               A13296IntOrder = (short)(localUtil.ctol( httpContext.cgiGet( edtIntOrder_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13296IntOrder = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13296IntOrder", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13296IntOrder), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIntLava_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIntLava_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTLAVA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntLava_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5991IntLava = DecimalUtil.ZERO ;
               n5991IntLava = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5991IntLava", GXutil.ltrimstr( A5991IntLava, 7, 2));
            }
            else
            {
               A5991IntLava = localUtil.ctond( httpContext.cgiGet( edtIntLava_Internalname)) ;
               n5991IntLava = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5991IntLava", GXutil.ltrimstr( A5991IntLava, 7, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCodCtb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCodCtb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTCODCTB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntCodCtb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5233IntCodCtb = (short)(0) ;
               n5233IntCodCtb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5233IntCodCtb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5233IntCodCtb), 3, 0));
            }
            else
            {
               A5233IntCodCtb = (short)(localUtil.ctol( httpContext.cgiGet( edtIntCodCtb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5233IntCodCtb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5233IntCodCtb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5233IntCodCtb), 3, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIntLabLi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIntLabLi_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTLABLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntLabLi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5359IntLabLi = DecimalUtil.ZERO ;
               n5359IntLabLi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5359IntLabLi", GXutil.ltrimstr( A5359IntLabLi, 11, 5));
            }
            else
            {
               A5359IntLabLi = localUtil.ctond( httpContext.cgiGet( edtIntLabLi_Internalname)) ;
               n5359IntLabLi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5359IntLabLi", GXutil.ltrimstr( A5359IntLabLi, 11, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIntLabLf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIntLabLf_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTLABLF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntLabLf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5360IntLabLf = DecimalUtil.ZERO ;
               n5360IntLabLf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5360IntLabLf", GXutil.ltrimstr( A5360IntLabLf, 11, 5));
            }
            else
            {
               A5360IntLabLf = localUtil.ctond( httpContext.cgiGet( edtIntLabLf_Internalname)) ;
               n5360IntLabLf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5360IntLabLf", GXutil.ltrimstr( A5360IntLabLf, 11, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIntPreMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIntPreMin_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTPREMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntPreMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7754IntPreMin = DecimalUtil.ZERO ;
               n7754IntPreMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7754IntPreMin", GXutil.ltrimstr( A7754IntPreMin, 10, 2));
            }
            else
            {
               A7754IntPreMin = localUtil.ctond( httpContext.cgiGet( edtIntPreMin_Internalname)) ;
               n7754IntPreMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7754IntPreMin", GXutil.ltrimstr( A7754IntPreMin, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIntPreMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIntPreMax_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTPREMAX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntPreMax_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7755IntPreMax = DecimalUtil.ZERO ;
               n7755IntPreMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7755IntPreMax", GXutil.ltrimstr( A7755IntPreMax, 10, 2));
            }
            else
            {
               A7755IntPreMax = localUtil.ctond( httpContext.cgiGet( edtIntPreMax_Internalname)) ;
               n7755IntPreMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7755IntPreMax", GXutil.ltrimstr( A7755IntPreMax, 10, 2));
            }
            AV42Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TINTENS");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A583IntCod != Z583IntCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\tintens:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
               n583IntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
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
                  sMode64 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode64 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound64 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1E0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "INTCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtIntCod_Internalname ;
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
                        e111E2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121E2 ();
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
         e121E2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1E64( ) ;
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
         disableAttributes1E64( ) ;
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

   public void confirm_1E0( )
   {
      beforeValidate1E64( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1E64( ) ;
         }
         else
         {
            checkExtendedTable1E64( ) ;
            closeExtendedTableCursors1E64( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1E0( )
   {
   }

   public void e111E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tintens_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      tintens_impl.this.A396EmprCod = GXv_char2[0] ;
      tintens_impl.this.AV16EmprNom = GXv_char3[0] ;
      tintens_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV25Flag2sp ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTB2SP", ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      AV25Flag2sp = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Flag2sp", GXutil.str( AV25Flag2sp, 1, 0));
      GXt_int5 = AV29F_lavand ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29F_lavand = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29F_lavand", GXutil.str( AV29F_lavand, 1, 0));
      GXt_int5 = AV33IntPor ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTPOR", ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33IntPor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33IntPor", GXutil.str( AV33IntPor, 1, 0));
      GXt_int5 = AV31Calvet ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CALVET", ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Calvet = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Calvet", GXutil.str( AV31Calvet, 1, 0));
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV32Artextil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Artextil", GXutil.ltrimstr( AV32Artextil, 10, 2));
      GXt_int5 = AV34erfoc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34erfoc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34erfoc", GXutil.str( AV34erfoc, 1, 0));
      GXt_int5 = (byte)(AV40autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      AV40autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40autonumber), 4, 0));
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tintens_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV35EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      tintens_impl.this.AV35EmprCod = GXv_char4[0] ;
      tintens_impl.this.AV16EmprNom = GXv_char3[0] ;
      tintens_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV37WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV37WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV38TrnContext.fromxml(AV39WebSession.getValue("TrnContext"), null, null);
   }

   public void e121E2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV38TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.formulaciontinte.tintensww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divIntlabli_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divIntlabli_cell_Internalname, "Class", divIntlabli_cell_Class, true);
      divIntlablf_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divIntlablf_cell_Internalname, "Class", divIntlablf_cell_Class, true);
      if ( ( edtIntLabLi_Visible == ( 0 )) && ( edtIntLabLf_Visible == ( 0 )) )
      {
         divUnnamedtable3_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Visible), 5, 0), true);
      }
   }

   public void zm1E64( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z584IntDsc = T001E3_A584IntDsc[0] ;
            Z5233IntCodCtb = T001E3_A5233IntCodCtb[0] ;
            Z5359IntLabLi = T001E3_A5359IntLabLi[0] ;
            Z5360IntLabLf = T001E3_A5360IntLabLf[0] ;
            Z5991IntLava = T001E3_A5991IntLava[0] ;
            Z7754IntPreMin = T001E3_A7754IntPreMin[0] ;
            Z7755IntPreMax = T001E3_A7755IntPreMax[0] ;
            Z13296IntOrder = T001E3_A13296IntOrder[0] ;
            Z14255IntAct = T001E3_A14255IntAct[0] ;
         }
         else
         {
            Z584IntDsc = A584IntDsc ;
            Z5233IntCodCtb = A5233IntCodCtb ;
            Z5359IntLabLi = A5359IntLabLi ;
            Z5360IntLabLf = A5360IntLabLf ;
            Z5991IntLava = A5991IntLava ;
            Z7754IntPreMin = A7754IntPreMin ;
            Z7755IntPreMax = A7755IntPreMax ;
            Z13296IntOrder = A13296IntOrder ;
            Z14255IntAct = A14255IntAct ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z583IntCod = A583IntCod ;
         Z584IntDsc = A584IntDsc ;
         Z5233IntCodCtb = A5233IntCodCtb ;
         Z5359IntLabLi = A5359IntLabLi ;
         Z5360IntLabLf = A5360IntLabLf ;
         Z5991IntLava = A5991IntLava ;
         Z7754IntPreMin = A7754IntPreMin ;
         Z7755IntPreMax = A7755IntPreMax ;
         Z13296IntOrder = A13296IntOrder ;
         Z14255IntAct = A14255IntAct ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV42Pgmname = "FormulacionTinte.TINTENS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV35EmprCod)==0) )
      {
         A396EmprCod = AV35EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T001E4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T001E4_A407EmprNom[0] ;
      n407EmprNom = T001E4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CALVET", ""), ""), GXv_int9) ;
      tintens_impl.this.GXt_int8 = GXv_int9[0] ;
      edtIntLabLi_Visible = ((GXt_int5==1)||(GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntLabLi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntLabLi_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
      tintens_impl.this.GXt_int8 = GXv_int9[0] ;
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CALVET", ""), ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int8 == 1 ) || ( GXt_int5 == 1 ) ) )
      {
         divIntlabli_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divIntlabli_cell_Internalname, "Class", divIntlabli_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
         tintens_impl.this.GXt_int8 = GXv_int9[0] ;
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CALVET", ""), ""), GXv_int6) ;
         tintens_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( ( GXt_int8 == 1 ) || ( GXt_int5 == 1 ) )
         {
            divIntlabli_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divIntlabli_cell_Internalname, "Class", divIntlabli_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
      tintens_impl.this.GXt_int8 = GXv_int9[0] ;
      edtIntLabLf_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntLabLf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntLabLf_Visible), 5, 0), true);
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
      tintens_impl.this.GXt_int8 = GXv_int9[0] ;
      if ( ! ( ( GXt_int8 == 1 ) ) )
      {
         divIntlablf_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divIntlablf_cell_Internalname, "Class", divIntlablf_cell_Class, true);
      }
      else
      {
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
         tintens_impl.this.GXt_int8 = GXv_int9[0] ;
         if ( GXt_int8 == 1 )
         {
            divIntlablf_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divIntlablf_cell_Internalname, "Class", divIntlablf_cell_Class, true);
         }
      }
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int9) ;
      tintens_impl.this.GXt_int8 = GXv_int9[0] ;
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CALVET", ""), ""), GXv_int6) ;
      tintens_impl.this.GXt_int5 = GXv_int6[0] ;
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int11) ;
      tintens_impl.this.GXt_int10 = GXv_int11[0] ;
      divUnnamedtable3_Visible = ((((GXt_int8==1)||(GXt_int5==1))||((GXt_int10==1))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Visible), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CTB2SP", ""), ""), GXv_int11) ;
      tintens_impl.this.GXt_int10 = GXv_int11[0] ;
      divUnnamedtable2_Visible = (((GXt_int10==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int11) ;
      tintens_impl.this.GXt_int10 = GXv_int11[0] ;
      divUnnamedtable4_Visible = (((GXt_int10==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable4_Visible), 5, 0), true);
      if ( ! (0==AV36IntCod) )
      {
         A583IntCod = AV36IntCod ;
         n583IntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      }
      if ( ! (0==AV36IntCod) )
      {
         edtIntCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      }
      else
      {
         edtIntCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV36IntCod) )
      {
         edtIntCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
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
      if ( isIns( )  && (GXutil.strcmp("", A14255IntAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A14255IntAct = httpContext.getMessage( "S", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14255IntAct", A14255IntAct);
      }
   }

   public void load1E64( )
   {
      /* Using cursor T001E5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A584IntDsc = T001E5_A584IntDsc[0] ;
         n584IntDsc = T001E5_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         A407EmprNom = T001E5_A407EmprNom[0] ;
         n407EmprNom = T001E5_n407EmprNom[0] ;
         A5233IntCodCtb = T001E5_A5233IntCodCtb[0] ;
         n5233IntCodCtb = T001E5_n5233IntCodCtb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5233IntCodCtb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5233IntCodCtb), 3, 0));
         A5359IntLabLi = T001E5_A5359IntLabLi[0] ;
         n5359IntLabLi = T001E5_n5359IntLabLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5359IntLabLi", GXutil.ltrimstr( A5359IntLabLi, 11, 5));
         A5360IntLabLf = T001E5_A5360IntLabLf[0] ;
         n5360IntLabLf = T001E5_n5360IntLabLf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5360IntLabLf", GXutil.ltrimstr( A5360IntLabLf, 11, 5));
         A5991IntLava = T001E5_A5991IntLava[0] ;
         n5991IntLava = T001E5_n5991IntLava[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5991IntLava", GXutil.ltrimstr( A5991IntLava, 7, 2));
         A7754IntPreMin = T001E5_A7754IntPreMin[0] ;
         n7754IntPreMin = T001E5_n7754IntPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7754IntPreMin", GXutil.ltrimstr( A7754IntPreMin, 10, 2));
         A7755IntPreMax = T001E5_A7755IntPreMax[0] ;
         n7755IntPreMax = T001E5_n7755IntPreMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7755IntPreMax", GXutil.ltrimstr( A7755IntPreMax, 10, 2));
         A13296IntOrder = T001E5_A13296IntOrder[0] ;
         n13296IntOrder = T001E5_n13296IntOrder[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13296IntOrder", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13296IntOrder), 4, 0));
         A14255IntAct = T001E5_A14255IntAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14255IntAct", A14255IntAct);
         zm1E64( -16) ;
      }
      pr_default.close(3);
      onLoadActions1E64( ) ;
   }

   public void onLoadActions1E64( )
   {
      A13744IntCDsc = GXutil.trim( GXutil.str( A583IntCod, 2, 0)) + "-" + GXutil.trim( A584IntDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13744IntCDsc", A13744IntCDsc);
   }

   public void checkExtendedTable1E64( )
   {
      nIsDirty_64 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_64 = (short)(1) ;
      A13744IntCDsc = GXutil.trim( GXutil.str( A583IntCod, 2, 0)) + "-" + GXutil.trim( A584IntDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13744IntCDsc", A13744IntCDsc);
   }

   public void closeExtendedTableCursors1E64( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1E64( )
   {
      /* Using cursor T001E6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound64 = (short)(1) ;
      }
      else
      {
         RcdFound64 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001E3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T001E3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1E64( 16) ;
         RcdFound64 = (short)(1) ;
         A583IntCod = T001E3_A583IntCod[0] ;
         n583IntCod = T001E3_n583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A584IntDsc = T001E3_A584IntDsc[0] ;
         n584IntDsc = T001E3_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         A5233IntCodCtb = T001E3_A5233IntCodCtb[0] ;
         n5233IntCodCtb = T001E3_n5233IntCodCtb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5233IntCodCtb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5233IntCodCtb), 3, 0));
         A5359IntLabLi = T001E3_A5359IntLabLi[0] ;
         n5359IntLabLi = T001E3_n5359IntLabLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5359IntLabLi", GXutil.ltrimstr( A5359IntLabLi, 11, 5));
         A5360IntLabLf = T001E3_A5360IntLabLf[0] ;
         n5360IntLabLf = T001E3_n5360IntLabLf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5360IntLabLf", GXutil.ltrimstr( A5360IntLabLf, 11, 5));
         A5991IntLava = T001E3_A5991IntLava[0] ;
         n5991IntLava = T001E3_n5991IntLava[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5991IntLava", GXutil.ltrimstr( A5991IntLava, 7, 2));
         A7754IntPreMin = T001E3_A7754IntPreMin[0] ;
         n7754IntPreMin = T001E3_n7754IntPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7754IntPreMin", GXutil.ltrimstr( A7754IntPreMin, 10, 2));
         A7755IntPreMax = T001E3_A7755IntPreMax[0] ;
         n7755IntPreMax = T001E3_n7755IntPreMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7755IntPreMax", GXutil.ltrimstr( A7755IntPreMax, 10, 2));
         A13296IntOrder = T001E3_A13296IntOrder[0] ;
         n13296IntOrder = T001E3_n13296IntOrder[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13296IntOrder", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13296IntOrder), 4, 0));
         A14255IntAct = T001E3_A14255IntAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14255IntAct", A14255IntAct);
         Z396EmprCod = A396EmprCod ;
         Z583IntCod = A583IntCod ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1E64( ) ;
         if ( AnyError == 1 )
         {
            RcdFound64 = (short)(0) ;
            initializeNonKey1E64( ) ;
         }
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound64 = (short)(0) ;
         initializeNonKey1E64( ) ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1E64( ) ;
      if ( RcdFound64 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound64 = (short)(0) ;
      /* Using cursor T001E7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001E7_A583IntCod[0] < A583IntCod ) ) && ( GXutil.strcmp(T001E7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001E7_A583IntCod[0] > A583IntCod ) ) && ( GXutil.strcmp(T001E7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A583IntCod = T001E7_A583IntCod[0] ;
            n583IntCod = T001E7_n583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound64 = (short)(0) ;
      /* Using cursor T001E8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T001E8_A583IntCod[0] > A583IntCod ) ) && ( GXutil.strcmp(T001E8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T001E8_A583IntCod[0] < A583IntCod ) ) && ( GXutil.strcmp(T001E8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A583IntCod = T001E8_A583IntCod[0] ;
            n583IntCod = T001E8_n583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1E64( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1E64( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound64 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
            {
               A583IntCod = Z583IntCod ;
               n583IntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "INTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1E64( ) ;
               GX_FocusControl = edtIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1E64( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "INTCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtIntCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtIntCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1E64( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
      {
         A583IntCod = Z583IntCod ;
         n583IntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1E64( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001E2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINTENS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z584IntDsc, T001E2_A584IntDsc[0]) != 0 ) || ( Z5233IntCodCtb != T001E2_A5233IntCodCtb[0] ) || ( DecimalUtil.compareTo(Z5359IntLabLi, T001E2_A5359IntLabLi[0]) != 0 ) || ( DecimalUtil.compareTo(Z5360IntLabLf, T001E2_A5360IntLabLf[0]) != 0 ) || ( DecimalUtil.compareTo(Z5991IntLava, T001E2_A5991IntLava[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7754IntPreMin, T001E2_A7754IntPreMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z7755IntPreMax, T001E2_A7755IntPreMax[0]) != 0 ) || ( Z13296IntOrder != T001E2_A13296IntOrder[0] ) || ( GXutil.strcmp(Z14255IntAct, T001E2_A14255IntAct[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z584IntDsc, T001E2_A584IntDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tintens:[seudo value changed for attri]"+"IntDsc");
               GXutil.writeLogRaw("Old: ",Z584IntDsc);
               GXutil.writeLogRaw("Current: ",T001E2_A584IntDsc[0]);
            }
            if ( Z5233IntCodCtb != T001E2_A5233IntCodCtb[0] )
            {
               GXutil.writeLogln("formulaciontinte.tintens:[seudo value changed for attri]"+"IntCodCtb");
               GXutil.writeLogRaw("Old: ",Z5233IntCodCtb);
               GXutil.writeLogRaw("Current: ",T001E2_A5233IntCodCtb[0]);
            }
            if ( DecimalUtil.compareTo(Z5359IntLabLi, T001E2_A5359IntLabLi[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tintens:[seudo value changed for attri]"+"IntLabLi");
               GXutil.writeLogRaw("Old: ",Z5359IntLabLi);
               GXutil.writeLogRaw("Current: ",T001E2_A5359IntLabLi[0]);
            }
            if ( DecimalUtil.compareTo(Z5360IntLabLf, T001E2_A5360IntLabLf[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tintens:[seudo value changed for attri]"+"IntLabLf");
               GXutil.writeLogRaw("Old: ",Z5360IntLabLf);
               GXutil.writeLogRaw("Current: ",T001E2_A5360IntLabLf[0]);
            }
            if ( DecimalUtil.compareTo(Z5991IntLava, T001E2_A5991IntLava[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tintens:[seudo value changed for attri]"+"IntLava");
               GXutil.writeLogRaw("Old: ",Z5991IntLava);
               GXutil.writeLogRaw("Current: ",T001E2_A5991IntLava[0]);
            }
            if ( DecimalUtil.compareTo(Z7754IntPreMin, T001E2_A7754IntPreMin[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tintens:[seudo value changed for attri]"+"IntPreMin");
               GXutil.writeLogRaw("Old: ",Z7754IntPreMin);
               GXutil.writeLogRaw("Current: ",T001E2_A7754IntPreMin[0]);
            }
            if ( DecimalUtil.compareTo(Z7755IntPreMax, T001E2_A7755IntPreMax[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tintens:[seudo value changed for attri]"+"IntPreMax");
               GXutil.writeLogRaw("Old: ",Z7755IntPreMax);
               GXutil.writeLogRaw("Current: ",T001E2_A7755IntPreMax[0]);
            }
            if ( Z13296IntOrder != T001E2_A13296IntOrder[0] )
            {
               GXutil.writeLogln("formulaciontinte.tintens:[seudo value changed for attri]"+"IntOrder");
               GXutil.writeLogRaw("Old: ",Z13296IntOrder);
               GXutil.writeLogRaw("Current: ",T001E2_A13296IntOrder[0]);
            }
            if ( GXutil.strcmp(Z14255IntAct, T001E2_A14255IntAct[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tintens:[seudo value changed for attri]"+"IntAct");
               GXutil.writeLogRaw("Old: ",Z14255IntAct);
               GXutil.writeLogRaw("Current: ",T001E2_A14255IntAct[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINTENS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1E64( )
   {
      beforeValidate1E64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1E64( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1E64( 0) ;
         checkOptimisticConcurrency1E64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1E64( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1E64( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001E9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n584IntDsc), A584IntDsc, Boolean.valueOf(n5233IntCodCtb), Short.valueOf(A5233IntCodCtb), Boolean.valueOf(n5359IntLabLi), A5359IntLabLi, Boolean.valueOf(n5360IntLabLf), A5360IntLabLf, Boolean.valueOf(n5991IntLava), A5991IntLava, Boolean.valueOf(n7754IntPreMin), A7754IntPreMin, Boolean.valueOf(n7755IntPreMax), A7755IntPreMax, Boolean.valueOf(n13296IntOrder), Short.valueOf(A13296IntOrder), A14255IntAct, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTENS");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption1E0( ) ;
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
            load1E64( ) ;
         }
         endLevel1E64( ) ;
      }
      closeExtendedTableCursors1E64( ) ;
   }

   public void update1E64( )
   {
      beforeValidate1E64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1E64( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1E64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1E64( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1E64( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001E10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n584IntDsc), A584IntDsc, Boolean.valueOf(n5233IntCodCtb), Short.valueOf(A5233IntCodCtb), Boolean.valueOf(n5359IntLabLi), A5359IntLabLi, Boolean.valueOf(n5360IntLabLf), A5360IntLabLf, Boolean.valueOf(n5991IntLava), A5991IntLava, Boolean.valueOf(n7754IntPreMin), A7754IntPreMin, Boolean.valueOf(n7755IntPreMax), A7755IntPreMax, Boolean.valueOf(n13296IntOrder), Short.valueOf(A13296IntOrder), A14255IntAct, A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTENS");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINTENS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1E64( ) ;
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
         endLevel1E64( ) ;
      }
      closeExtendedTableCursors1E64( ) ;
   }

   public void deferredUpdate1E64( )
   {
   }

   public void delete( )
   {
      beforeValidate1E64( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1E64( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1E64( ) ;
         afterConfirm1E64( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1E64( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001E11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTENS");
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
      sMode64 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1E64( ) ;
      Gx_mode = sMode64 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1E64( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13744IntCDsc = GXutil.trim( GXutil.str( A583IntCod, 2, 0)) + "-" + GXutil.trim( A584IntDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13744IntCDsc", A13744IntCDsc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001E12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Intendidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T001E13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T001E14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T001E15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T001E16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T001E17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T001E18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T001E19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T001E20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T001E21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T001E22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void endLevel1E64( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1E64( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.tintens");
         if ( AnyError == 0 )
         {
            confirmValues1E0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.tintens");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1E64( )
   {
      /* Scan By routine */
      /* Using cursor T001E23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A583IntCod = T001E23_A583IntCod[0] ;
         n583IntCod = T001E23_n583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1E64( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A583IntCod = T001E23_A583IntCod[0] ;
         n583IntCod = T001E23_n583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      }
   }

   public void scanEnd1E64( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1E64( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1E64( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A583IntCod) && ( AV40autonumber == 1 ) )
      {
         GXt_int10 = A583IntCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.formulaciontinte.tintens_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int11) ;
         tintens_impl.this.GXt_int10 = GXv_int11[0] ;
         A583IntCod = GXt_int10 ;
         n583IntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      }
   }

   public void beforeUpdate1E64( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1E64( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1E64( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1E64( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1E64( )
   {
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), true);
      chkIntAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkIntAct.getEnabled(), 5, 0), true);
      edtIntOrder_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntOrder_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntOrder_Enabled), 5, 0), true);
      edtIntLava_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntLava_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntLava_Enabled), 5, 0), true);
      edtIntCodCtb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCodCtb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCodCtb_Enabled), 5, 0), true);
      edtIntLabLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntLabLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntLabLi_Enabled), 5, 0), true);
      edtIntLabLf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntLabLf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntLabLf_Enabled), 5, 0), true);
      edtIntPreMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntPreMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntPreMin_Enabled), 5, 0), true);
      edtIntPreMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntPreMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntPreMax_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1E64( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1E0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.tintens", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV36IntCod,2,0))}, new String[] {"Gx_mode","EmprCod","IntCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TINTENS");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\tintens:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z584IntDsc", GXutil.rtrim( Z584IntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5233IntCodCtb", GXutil.ltrim( localUtil.ntoc( Z5233IntCodCtb, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5359IntLabLi", GXutil.ltrim( localUtil.ntoc( Z5359IntLabLi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5360IntLabLf", GXutil.ltrim( localUtil.ntoc( Z5360IntLabLf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5991IntLava", GXutil.ltrim( localUtil.ntoc( Z5991IntLava, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7754IntPreMin", GXutil.ltrim( localUtil.ntoc( Z7754IntPreMin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7755IntPreMax", GXutil.ltrim( localUtil.ntoc( Z7755IntPreMax, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13296IntOrder", GXutil.ltrim( localUtil.ntoc( Z13296IntOrder, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14255IntAct", GXutil.rtrim( Z14255IntAct));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV38TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV38TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV38TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "INTCDSC", A13744IntCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV35EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTCOD", GXutil.ltrim( localUtil.ntoc( AV36IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36IntCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV40autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.formulaciontinte.tintens", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV36IntCod,2,0))}, new String[] {"Gx_mode","EmprCod","IntCod"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.TINTENS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Intensidad", "") ;
   }

   public void initializeNonKey1E64( )
   {
      A13744IntCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13744IntCDsc", A13744IntCDsc);
      A584IntDsc = "" ;
      n584IntDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      A5233IntCodCtb = (short)(0) ;
      n5233IntCodCtb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5233IntCodCtb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5233IntCodCtb), 3, 0));
      A5359IntLabLi = DecimalUtil.ZERO ;
      n5359IntLabLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5359IntLabLi", GXutil.ltrimstr( A5359IntLabLi, 11, 5));
      A5360IntLabLf = DecimalUtil.ZERO ;
      n5360IntLabLf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5360IntLabLf", GXutil.ltrimstr( A5360IntLabLf, 11, 5));
      A5991IntLava = DecimalUtil.ZERO ;
      n5991IntLava = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5991IntLava", GXutil.ltrimstr( A5991IntLava, 7, 2));
      A7754IntPreMin = DecimalUtil.ZERO ;
      n7754IntPreMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7754IntPreMin", GXutil.ltrimstr( A7754IntPreMin, 10, 2));
      A7755IntPreMax = DecimalUtil.ZERO ;
      n7755IntPreMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7755IntPreMax", GXutil.ltrimstr( A7755IntPreMax, 10, 2));
      A13296IntOrder = (short)(0) ;
      n13296IntOrder = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13296IntOrder", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13296IntOrder), 4, 0));
      A14255IntAct = "S" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14255IntAct", A14255IntAct);
      Z584IntDsc = "" ;
      Z5233IntCodCtb = (short)(0) ;
      Z5359IntLabLi = DecimalUtil.ZERO ;
      Z5360IntLabLf = DecimalUtil.ZERO ;
      Z5991IntLava = DecimalUtil.ZERO ;
      Z7754IntPreMin = DecimalUtil.ZERO ;
      Z7755IntPreMax = DecimalUtil.ZERO ;
      Z13296IntOrder = (short)(0) ;
      Z14255IntAct = "" ;
   }

   public void initAll1E64( )
   {
      A583IntCod = (byte)(0) ;
      n583IntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      initializeNonKey1E64( ) ;
   }

   public void standaloneModalInsert( )
   {
      A14255IntAct = i14255IntAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A14255IntAct", A14255IntAct);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211651294", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/tintens.js", "?20268211651294", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtIntCod_Internalname = "INTCOD" ;
      edtIntDsc_Internalname = "INTDSC" ;
      chkIntAct.setInternalname( "INTACT" );
      edtIntOrder_Internalname = "INTORDER" ;
      edtIntLava_Internalname = "INTLAVA" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtIntCodCtb_Internalname = "INTCODCTB" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtIntLabLi_Internalname = "INTLABLI" ;
      divIntlabli_cell_Internalname = "INTLABLI_CELL" ;
      edtIntLabLf_Internalname = "INTLABLF" ;
      divIntlablf_cell_Internalname = "INTLABLF_CELL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtIntPreMin_Internalname = "INTPREMIN" ;
      edtIntPreMax_Internalname = "INTPREMAX" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
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
      Form.setCaption( httpContext.getMessage( "Intensidad", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtIntPreMax_Jsonclick = "" ;
      edtIntPreMax_Enabled = 1 ;
      edtIntPreMin_Jsonclick = "" ;
      edtIntPreMin_Enabled = 1 ;
      divUnnamedtable4_Visible = 1 ;
      edtIntLabLf_Jsonclick = "" ;
      edtIntLabLf_Enabled = 1 ;
      edtIntLabLf_Visible = 1 ;
      divIntlablf_cell_Class = "col-xs-12 col-sm-6" ;
      edtIntLabLi_Jsonclick = "" ;
      edtIntLabLi_Enabled = 1 ;
      edtIntLabLi_Visible = 1 ;
      divIntlabli_cell_Class = "col-xs-12 col-sm-6" ;
      divUnnamedtable3_Visible = 1 ;
      edtIntCodCtb_Jsonclick = "" ;
      edtIntCodCtb_Enabled = 1 ;
      divUnnamedtable2_Visible = 1 ;
      edtIntLava_Jsonclick = "" ;
      edtIntLava_Enabled = 1 ;
      edtIntOrder_Jsonclick = "" ;
      edtIntOrder_Enabled = 1 ;
      chkIntAct.setEnabled( 1 );
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Enabled = 1 ;
      edtIntCod_Jsonclick = "" ;
      edtIntCod_Enabled = 1 ;
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

   public void gx3asaintcod1E64( byte AV36IntCod )
   {
      if ( ! (0==AV36IntCod) )
      {
         A583IntCod = AV36IntCod ;
         n583IntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asaintcod1E64( byte A583IntCod ,
                                 short AV40autonumber ,
                                 String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A583IntCod) && ( AV40autonumber == 1 ) )
      {
         GXt_int10 = A583IntCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.formulaciontinte.tintens_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int11) ;
         tintens_impl.this.GXt_int10 = GXv_int11[0] ;
         A583IntCod = GXt_int10 ;
         n583IntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa53591E64( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int11) ;
      tintens_impl.this.GXt_int10 = GXv_int11[0] ;
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CALVET", ""), ""), GXv_int9) ;
      tintens_impl.this.GXt_int8 = GXv_int9[0] ;
      edtIntLabLi_Visible = ((GXt_int10==1)||(GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntLabLi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntLabLi_Visible), 5, 0), true);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa53601E64( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int11) ;
      tintens_impl.this.GXt_int10 = GXv_int11[0] ;
      edtIntLabLf_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntLabLf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntLabLf_Visible), 5, 0), true);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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
      chkIntAct.setName( "INTACT" );
      chkIntAct.setWebtags( "" );
      chkIntAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "TitleCaption", chkIntAct.getCaption(), true);
      chkIntAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A14255IntAct)==0) )
      {
         A14255IntAct = "S" ;
         httpContext.ajax_rsp_assign_attri("", false, "A14255IntAct", A14255IntAct);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36IntCod',fld:'vINTCOD',pic:'Z9',hsh:true},{av:'A14255IntAct',fld:'INTACT',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A14255IntAct',fld:'INTACT',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV38TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36IntCod',fld:'vINTCOD',pic:'Z9',hsh:true},{av:'A14255IntAct',fld:'INTACT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A14255IntAct',fld:'INTACT',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e121E2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV38TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A14255IntAct',fld:'INTACT',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A14255IntAct',fld:'INTACT',pic:''}]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[{av:'A14255IntAct',fld:'INTACT',pic:''}]");
      setEventMetadata("VALID_INTCOD",",oparms:[{av:'A14255IntAct',fld:'INTACT',pic:''}]}");
      setEventMetadata("VALID_INTDSC","{handler:'valid_Intdsc',iparms:[{av:'A14255IntAct',fld:'INTACT',pic:''}]");
      setEventMetadata("VALID_INTDSC",",oparms:[{av:'A14255IntAct',fld:'INTACT',pic:''}]}");
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
      wcpOAV35EmprCod = "" ;
      Z396EmprCod = "" ;
      Z584IntDsc = "" ;
      Z5359IntLabLi = DecimalUtil.ZERO ;
      Z5360IntLabLf = DecimalUtil.ZERO ;
      Z5991IntLava = DecimalUtil.ZERO ;
      Z7754IntPreMin = DecimalUtil.ZERO ;
      Z7755IntPreMax = DecimalUtil.ZERO ;
      Z14255IntAct = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV35EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A14255IntAct = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A584IntDsc = "" ;
      A5991IntLava = DecimalUtil.ZERO ;
      A5359IntLabLi = DecimalUtil.ZERO ;
      A5360IntLabLf = DecimalUtil.ZERO ;
      A7754IntPreMin = DecimalUtil.ZERO ;
      A7755IntPreMax = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV42Pgmname = "" ;
      A13744IntCDsc = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode64 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      AV32Artextil = DecimalUtil.ZERO ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV37WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV38TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV39WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T001E4_A407EmprNom = new String[] {""} ;
      T001E4_n407EmprNom = new boolean[] {false} ;
      GXv_int6 = new byte[1] ;
      T001E5_A583IntCod = new byte[1] ;
      T001E5_n583IntCod = new boolean[] {false} ;
      T001E5_A584IntDsc = new String[] {""} ;
      T001E5_n584IntDsc = new boolean[] {false} ;
      T001E5_A407EmprNom = new String[] {""} ;
      T001E5_n407EmprNom = new boolean[] {false} ;
      T001E5_A5233IntCodCtb = new short[1] ;
      T001E5_n5233IntCodCtb = new boolean[] {false} ;
      T001E5_A5359IntLabLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E5_n5359IntLabLi = new boolean[] {false} ;
      T001E5_A5360IntLabLf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E5_n5360IntLabLf = new boolean[] {false} ;
      T001E5_A5991IntLava = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E5_n5991IntLava = new boolean[] {false} ;
      T001E5_A7754IntPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E5_n7754IntPreMin = new boolean[] {false} ;
      T001E5_A7755IntPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E5_n7755IntPreMax = new boolean[] {false} ;
      T001E5_A13296IntOrder = new short[1] ;
      T001E5_n13296IntOrder = new boolean[] {false} ;
      T001E5_A14255IntAct = new String[] {""} ;
      T001E5_A396EmprCod = new String[] {""} ;
      T001E6_A396EmprCod = new String[] {""} ;
      T001E6_A583IntCod = new byte[1] ;
      T001E6_n583IntCod = new boolean[] {false} ;
      T001E3_A583IntCod = new byte[1] ;
      T001E3_n583IntCod = new boolean[] {false} ;
      T001E3_A584IntDsc = new String[] {""} ;
      T001E3_n584IntDsc = new boolean[] {false} ;
      T001E3_A5233IntCodCtb = new short[1] ;
      T001E3_n5233IntCodCtb = new boolean[] {false} ;
      T001E3_A5359IntLabLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E3_n5359IntLabLi = new boolean[] {false} ;
      T001E3_A5360IntLabLf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E3_n5360IntLabLf = new boolean[] {false} ;
      T001E3_A5991IntLava = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E3_n5991IntLava = new boolean[] {false} ;
      T001E3_A7754IntPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E3_n7754IntPreMin = new boolean[] {false} ;
      T001E3_A7755IntPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E3_n7755IntPreMax = new boolean[] {false} ;
      T001E3_A13296IntOrder = new short[1] ;
      T001E3_n13296IntOrder = new boolean[] {false} ;
      T001E3_A14255IntAct = new String[] {""} ;
      T001E3_A396EmprCod = new String[] {""} ;
      T001E7_A396EmprCod = new String[] {""} ;
      T001E7_A583IntCod = new byte[1] ;
      T001E7_n583IntCod = new boolean[] {false} ;
      T001E8_A396EmprCod = new String[] {""} ;
      T001E8_A583IntCod = new byte[1] ;
      T001E8_n583IntCod = new boolean[] {false} ;
      T001E2_A583IntCod = new byte[1] ;
      T001E2_n583IntCod = new boolean[] {false} ;
      T001E2_A584IntDsc = new String[] {""} ;
      T001E2_n584IntDsc = new boolean[] {false} ;
      T001E2_A5233IntCodCtb = new short[1] ;
      T001E2_n5233IntCodCtb = new boolean[] {false} ;
      T001E2_A5359IntLabLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E2_n5359IntLabLi = new boolean[] {false} ;
      T001E2_A5360IntLabLf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E2_n5360IntLabLf = new boolean[] {false} ;
      T001E2_A5991IntLava = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E2_n5991IntLava = new boolean[] {false} ;
      T001E2_A7754IntPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E2_n7754IntPreMin = new boolean[] {false} ;
      T001E2_A7755IntPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001E2_n7755IntPreMax = new boolean[] {false} ;
      T001E2_A13296IntOrder = new short[1] ;
      T001E2_n13296IntOrder = new boolean[] {false} ;
      T001E2_A14255IntAct = new String[] {""} ;
      T001E2_A396EmprCod = new String[] {""} ;
      T001E12_A396EmprCod = new String[] {""} ;
      T001E12_A13183PLNColor = new byte[1] ;
      T001E12_A583IntCod = new byte[1] ;
      T001E12_n583IntCod = new boolean[] {false} ;
      T001E13_A396EmprCod = new String[] {""} ;
      T001E13_A583IntCod = new byte[1] ;
      T001E13_n583IntCod = new boolean[] {false} ;
      T001E13_A4031CCTCod = new int[1] ;
      T001E14_A396EmprCod = new String[] {""} ;
      T001E14_A252CliCod = new int[1] ;
      T001E14_A65ArtCod = new String[] {""} ;
      T001E14_A12363SocInt = new byte[1] ;
      T001E15_A396EmprCod = new String[] {""} ;
      T001E15_A829TipArtCod = new short[1] ;
      T001E15_A583IntCod = new byte[1] ;
      T001E15_n583IntCod = new boolean[] {false} ;
      T001E16_A396EmprCod = new String[] {""} ;
      T001E16_A252CliCod = new int[1] ;
      T001E16_A8521PreTAICod = new short[1] ;
      T001E16_A583IntCod = new byte[1] ;
      T001E16_n583IntCod = new boolean[] {false} ;
      T001E17_A396EmprCod = new String[] {""} ;
      T001E17_A5532Lb_numero = new int[1] ;
      T001E18_A396EmprCod = new String[] {""} ;
      T001E18_A252CliCod = new int[1] ;
      T001E18_A2141SerEst = new String[] {""} ;
      T001E18_A1013DibCli = new String[] {""} ;
      T001E18_A1014DibInt = new int[1] ;
      T001E18_A2074ColCom = new String[] {""} ;
      T001E18_A2078ColFon = new String[] {""} ;
      T001E19_A396EmprCod = new String[] {""} ;
      T001E19_A252CliCod = new int[1] ;
      T001E19_A1504CliProCod = new String[] {""} ;
      T001E19_A65ArtCod = new String[] {""} ;
      T001E19_A583IntCod = new byte[1] ;
      T001E19_n583IntCod = new boolean[] {false} ;
      T001E20_A396EmprCod = new String[] {""} ;
      T001E20_A30AlbProCod = new long[1] ;
      T001E20_A129BarCod = new int[1] ;
      T001E20_A132BarCodReo = new byte[1] ;
      T001E20_A130BarCodPar = new String[] {""} ;
      T001E21_A396EmprCod = new String[] {""} ;
      T001E21_A252CliCod = new int[1] ;
      T001E21_A65ArtCod = new String[] {""} ;
      T001E21_A831TipColCod = new byte[1] ;
      T001E21_A583IntCod = new byte[1] ;
      T001E21_n583IntCod = new boolean[] {false} ;
      T001E22_A396EmprCod = new String[] {""} ;
      T001E22_A252CliCod = new int[1] ;
      T001E22_A494ForSer = new String[] {""} ;
      T001E22_A482ForColNom = new String[] {""} ;
      T001E22_A483ForColNum = new int[1] ;
      T001E22_A831TipColCod = new byte[1] ;
      T001E23_A396EmprCod = new String[] {""} ;
      T001E23_A583IntCod = new byte[1] ;
      T001E23_n583IntCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i14255IntAct = "" ;
      GXv_int9 = new byte[1] ;
      GXv_int11 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintens__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintens__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintens__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintens__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintens__default(),
         new Object[] {
             new Object[] {
            T001E2_A583IntCod, T001E2_A584IntDsc, T001E2_n584IntDsc, T001E2_A5233IntCodCtb, T001E2_n5233IntCodCtb, T001E2_A5359IntLabLi, T001E2_n5359IntLabLi, T001E2_A5360IntLabLf, T001E2_n5360IntLabLf, T001E2_A5991IntLava,
            T001E2_n5991IntLava, T001E2_A7754IntPreMin, T001E2_n7754IntPreMin, T001E2_A7755IntPreMax, T001E2_n7755IntPreMax, T001E2_A13296IntOrder, T001E2_n13296IntOrder, T001E2_A14255IntAct, T001E2_A396EmprCod
            }
            , new Object[] {
            T001E3_A583IntCod, T001E3_A584IntDsc, T001E3_n584IntDsc, T001E3_A5233IntCodCtb, T001E3_n5233IntCodCtb, T001E3_A5359IntLabLi, T001E3_n5359IntLabLi, T001E3_A5360IntLabLf, T001E3_n5360IntLabLf, T001E3_A5991IntLava,
            T001E3_n5991IntLava, T001E3_A7754IntPreMin, T001E3_n7754IntPreMin, T001E3_A7755IntPreMax, T001E3_n7755IntPreMax, T001E3_A13296IntOrder, T001E3_n13296IntOrder, T001E3_A14255IntAct, T001E3_A396EmprCod
            }
            , new Object[] {
            T001E4_A407EmprNom, T001E4_n407EmprNom
            }
            , new Object[] {
            T001E5_A583IntCod, T001E5_A584IntDsc, T001E5_n584IntDsc, T001E5_A407EmprNom, T001E5_n407EmprNom, T001E5_A5233IntCodCtb, T001E5_n5233IntCodCtb, T001E5_A5359IntLabLi, T001E5_n5359IntLabLi, T001E5_A5360IntLabLf,
            T001E5_n5360IntLabLf, T001E5_A5991IntLava, T001E5_n5991IntLava, T001E5_A7754IntPreMin, T001E5_n7754IntPreMin, T001E5_A7755IntPreMax, T001E5_n7755IntPreMax, T001E5_A13296IntOrder, T001E5_n13296IntOrder, T001E5_A14255IntAct,
            T001E5_A396EmprCod
            }
            , new Object[] {
            T001E6_A396EmprCod, T001E6_A583IntCod
            }
            , new Object[] {
            T001E7_A396EmprCod, T001E7_A583IntCod
            }
            , new Object[] {
            T001E8_A396EmprCod, T001E8_A583IntCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001E12_A396EmprCod, T001E12_A13183PLNColor, T001E12_A583IntCod
            }
            , new Object[] {
            T001E13_A396EmprCod, T001E13_A583IntCod, T001E13_A4031CCTCod
            }
            , new Object[] {
            T001E14_A396EmprCod, T001E14_A252CliCod, T001E14_A65ArtCod, T001E14_A12363SocInt
            }
            , new Object[] {
            T001E15_A396EmprCod, T001E15_A829TipArtCod, T001E15_A583IntCod
            }
            , new Object[] {
            T001E16_A396EmprCod, T001E16_A252CliCod, T001E16_A8521PreTAICod, T001E16_A583IntCod
            }
            , new Object[] {
            T001E17_A396EmprCod, T001E17_A5532Lb_numero
            }
            , new Object[] {
            T001E18_A396EmprCod, T001E18_A252CliCod, T001E18_A2141SerEst, T001E18_A1013DibCli, T001E18_A1014DibInt, T001E18_A2074ColCom, T001E18_A2078ColFon
            }
            , new Object[] {
            T001E19_A396EmprCod, T001E19_A252CliCod, T001E19_A1504CliProCod, T001E19_A65ArtCod, T001E19_A583IntCod
            }
            , new Object[] {
            T001E20_A396EmprCod, T001E20_A30AlbProCod, T001E20_A129BarCod, T001E20_A132BarCodReo, T001E20_A130BarCodPar
            }
            , new Object[] {
            T001E21_A396EmprCod, T001E21_A252CliCod, T001E21_A65ArtCod, T001E21_A831TipColCod, T001E21_A583IntCod
            }
            , new Object[] {
            T001E22_A396EmprCod, T001E22_A252CliCod, T001E22_A494ForSer, T001E22_A482ForColNom, T001E22_A483ForColNum, T001E22_A831TipColCod
            }
            , new Object[] {
            T001E23_A396EmprCod, T001E23_A583IntCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV42Pgmname = "FormulacionTinte.TINTENS" ;
      Z14255IntAct = "S" ;
      A14255IntAct = "S" ;
      i14255IntAct = "S" ;
   }

   private byte wcpOAV36IntCod ;
   private byte Z583IntCod ;
   private byte GxWebError ;
   private byte AV36IntCod ;
   private byte A583IntCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV25Flag2sp ;
   private byte AV29F_lavand ;
   private byte AV33IntPor ;
   private byte AV31Calvet ;
   private byte AV34erfoc ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte gxajaxcallmode ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private byte GXt_int10 ;
   private byte GXv_int11[] ;
   private short Z5233IntCodCtb ;
   private short Z13296IntOrder ;
   private short AV40autonumber ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13296IntOrder ;
   private short A5233IntCodCtb ;
   private short RcdFound64 ;
   private short nIsDirty_64 ;
   private int trnEnded ;
   private int edtIntCod_Enabled ;
   private int edtIntDsc_Enabled ;
   private int edtIntOrder_Enabled ;
   private int edtIntLava_Enabled ;
   private int divUnnamedtable2_Visible ;
   private int edtIntCodCtb_Enabled ;
   private int divUnnamedtable3_Visible ;
   private int edtIntLabLi_Visible ;
   private int edtIntLabLi_Enabled ;
   private int edtIntLabLf_Visible ;
   private int edtIntLabLf_Enabled ;
   private int divUnnamedtable4_Visible ;
   private int edtIntPreMin_Enabled ;
   private int edtIntPreMax_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z5359IntLabLi ;
   private java.math.BigDecimal Z5360IntLabLf ;
   private java.math.BigDecimal Z5991IntLava ;
   private java.math.BigDecimal Z7754IntPreMin ;
   private java.math.BigDecimal Z7755IntPreMax ;
   private java.math.BigDecimal A5991IntLava ;
   private java.math.BigDecimal A5359IntLabLi ;
   private java.math.BigDecimal A5360IntLabLf ;
   private java.math.BigDecimal A7754IntPreMin ;
   private java.math.BigDecimal A7755IntPreMax ;
   private java.math.BigDecimal AV32Artextil ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV35EmprCod ;
   private String Z396EmprCod ;
   private String Z584IntDsc ;
   private String Z14255IntAct ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV35EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtIntCod_Internalname ;
   private String A14255IntAct ;
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
   private String edtIntCod_Jsonclick ;
   private String edtIntDsc_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Jsonclick ;
   private String edtIntOrder_Internalname ;
   private String edtIntOrder_Jsonclick ;
   private String edtIntLava_Internalname ;
   private String edtIntLava_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtIntCodCtb_Internalname ;
   private String edtIntCodCtb_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divIntlabli_cell_Internalname ;
   private String divIntlabli_cell_Class ;
   private String edtIntLabLi_Internalname ;
   private String edtIntLabLi_Jsonclick ;
   private String divIntlablf_cell_Internalname ;
   private String divIntlablf_cell_Class ;
   private String edtIntLabLf_Internalname ;
   private String edtIntLabLf_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtIntPreMin_Internalname ;
   private String edtIntPreMin_Jsonclick ;
   private String edtIntPreMax_Internalname ;
   private String edtIntPreMax_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV42Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode64 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i14255IntAct ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n583IntCod ;
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
   private boolean n584IntDsc ;
   private boolean n13296IntOrder ;
   private boolean n5991IntLava ;
   private boolean n5233IntCodCtb ;
   private boolean n5359IntLabLi ;
   private boolean n5360IntLabLf ;
   private boolean n7754IntPreMin ;
   private boolean n7755IntPreMax ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13744IntCDsc ;
   private com.genexus.webpanels.WebSession AV39WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkIntAct ;
   private IDataStoreProvider pr_default ;
   private String[] T001E4_A407EmprNom ;
   private boolean[] T001E4_n407EmprNom ;
   private byte[] T001E5_A583IntCod ;
   private boolean[] T001E5_n583IntCod ;
   private String[] T001E5_A584IntDsc ;
   private boolean[] T001E5_n584IntDsc ;
   private String[] T001E5_A407EmprNom ;
   private boolean[] T001E5_n407EmprNom ;
   private short[] T001E5_A5233IntCodCtb ;
   private boolean[] T001E5_n5233IntCodCtb ;
   private java.math.BigDecimal[] T001E5_A5359IntLabLi ;
   private boolean[] T001E5_n5359IntLabLi ;
   private java.math.BigDecimal[] T001E5_A5360IntLabLf ;
   private boolean[] T001E5_n5360IntLabLf ;
   private java.math.BigDecimal[] T001E5_A5991IntLava ;
   private boolean[] T001E5_n5991IntLava ;
   private java.math.BigDecimal[] T001E5_A7754IntPreMin ;
   private boolean[] T001E5_n7754IntPreMin ;
   private java.math.BigDecimal[] T001E5_A7755IntPreMax ;
   private boolean[] T001E5_n7755IntPreMax ;
   private short[] T001E5_A13296IntOrder ;
   private boolean[] T001E5_n13296IntOrder ;
   private String[] T001E5_A14255IntAct ;
   private String[] T001E5_A396EmprCod ;
   private String[] T001E6_A396EmprCod ;
   private byte[] T001E6_A583IntCod ;
   private boolean[] T001E6_n583IntCod ;
   private byte[] T001E3_A583IntCod ;
   private boolean[] T001E3_n583IntCod ;
   private String[] T001E3_A584IntDsc ;
   private boolean[] T001E3_n584IntDsc ;
   private short[] T001E3_A5233IntCodCtb ;
   private boolean[] T001E3_n5233IntCodCtb ;
   private java.math.BigDecimal[] T001E3_A5359IntLabLi ;
   private boolean[] T001E3_n5359IntLabLi ;
   private java.math.BigDecimal[] T001E3_A5360IntLabLf ;
   private boolean[] T001E3_n5360IntLabLf ;
   private java.math.BigDecimal[] T001E3_A5991IntLava ;
   private boolean[] T001E3_n5991IntLava ;
   private java.math.BigDecimal[] T001E3_A7754IntPreMin ;
   private boolean[] T001E3_n7754IntPreMin ;
   private java.math.BigDecimal[] T001E3_A7755IntPreMax ;
   private boolean[] T001E3_n7755IntPreMax ;
   private short[] T001E3_A13296IntOrder ;
   private boolean[] T001E3_n13296IntOrder ;
   private String[] T001E3_A14255IntAct ;
   private String[] T001E3_A396EmprCod ;
   private String[] T001E7_A396EmprCod ;
   private byte[] T001E7_A583IntCod ;
   private boolean[] T001E7_n583IntCod ;
   private String[] T001E8_A396EmprCod ;
   private byte[] T001E8_A583IntCod ;
   private boolean[] T001E8_n583IntCod ;
   private byte[] T001E2_A583IntCod ;
   private boolean[] T001E2_n583IntCod ;
   private String[] T001E2_A584IntDsc ;
   private boolean[] T001E2_n584IntDsc ;
   private short[] T001E2_A5233IntCodCtb ;
   private boolean[] T001E2_n5233IntCodCtb ;
   private java.math.BigDecimal[] T001E2_A5359IntLabLi ;
   private boolean[] T001E2_n5359IntLabLi ;
   private java.math.BigDecimal[] T001E2_A5360IntLabLf ;
   private boolean[] T001E2_n5360IntLabLf ;
   private java.math.BigDecimal[] T001E2_A5991IntLava ;
   private boolean[] T001E2_n5991IntLava ;
   private java.math.BigDecimal[] T001E2_A7754IntPreMin ;
   private boolean[] T001E2_n7754IntPreMin ;
   private java.math.BigDecimal[] T001E2_A7755IntPreMax ;
   private boolean[] T001E2_n7755IntPreMax ;
   private short[] T001E2_A13296IntOrder ;
   private boolean[] T001E2_n13296IntOrder ;
   private String[] T001E2_A14255IntAct ;
   private String[] T001E2_A396EmprCod ;
   private String[] T001E12_A396EmprCod ;
   private byte[] T001E12_A13183PLNColor ;
   private byte[] T001E12_A583IntCod ;
   private boolean[] T001E12_n583IntCod ;
   private String[] T001E13_A396EmprCod ;
   private byte[] T001E13_A583IntCod ;
   private boolean[] T001E13_n583IntCod ;
   private int[] T001E13_A4031CCTCod ;
   private String[] T001E14_A396EmprCod ;
   private int[] T001E14_A252CliCod ;
   private String[] T001E14_A65ArtCod ;
   private byte[] T001E14_A12363SocInt ;
   private String[] T001E15_A396EmprCod ;
   private short[] T001E15_A829TipArtCod ;
   private byte[] T001E15_A583IntCod ;
   private boolean[] T001E15_n583IntCod ;
   private String[] T001E16_A396EmprCod ;
   private int[] T001E16_A252CliCod ;
   private short[] T001E16_A8521PreTAICod ;
   private byte[] T001E16_A583IntCod ;
   private boolean[] T001E16_n583IntCod ;
   private String[] T001E17_A396EmprCod ;
   private int[] T001E17_A5532Lb_numero ;
   private String[] T001E18_A396EmprCod ;
   private int[] T001E18_A252CliCod ;
   private String[] T001E18_A2141SerEst ;
   private String[] T001E18_A1013DibCli ;
   private int[] T001E18_A1014DibInt ;
   private String[] T001E18_A2074ColCom ;
   private String[] T001E18_A2078ColFon ;
   private String[] T001E19_A396EmprCod ;
   private int[] T001E19_A252CliCod ;
   private String[] T001E19_A1504CliProCod ;
   private String[] T001E19_A65ArtCod ;
   private byte[] T001E19_A583IntCod ;
   private boolean[] T001E19_n583IntCod ;
   private String[] T001E20_A396EmprCod ;
   private long[] T001E20_A30AlbProCod ;
   private int[] T001E20_A129BarCod ;
   private byte[] T001E20_A132BarCodReo ;
   private String[] T001E20_A130BarCodPar ;
   private String[] T001E21_A396EmprCod ;
   private int[] T001E21_A252CliCod ;
   private String[] T001E21_A65ArtCod ;
   private byte[] T001E21_A831TipColCod ;
   private byte[] T001E21_A583IntCod ;
   private boolean[] T001E21_n583IntCod ;
   private String[] T001E22_A396EmprCod ;
   private int[] T001E22_A252CliCod ;
   private String[] T001E22_A494ForSer ;
   private String[] T001E22_A482ForColNom ;
   private int[] T001E22_A483ForColNum ;
   private byte[] T001E22_A831TipColCod ;
   private String[] T001E23_A396EmprCod ;
   private byte[] T001E23_A583IntCod ;
   private boolean[] T001E23_n583IntCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV37WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV38TrnContext ;
}

final  class tintens__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tintens__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tintens__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tintens__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tintens__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001E2", "SELECT IntCod, IntDsc, IntCodCtb, IntLabLi, IntLabLf, IntLava, IntPreMin, IntPreMax, IntOrder, IntAct, EmprCod FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ?  FOR UPDATE OF IntDsc, IntCodCtb, IntLabLi, IntLabLf, IntLava, IntPreMin, IntPreMax, IntOrder, IntAct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001E3", "SELECT IntCod, IntDsc, IntCodCtb, IntLabLi, IntLabLf, IntLava, IntPreMin, IntPreMax, IntOrder, IntAct, EmprCod FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001E4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001E5", "SELECT /*+ FIRST_ROWS(100) */ TM1.IntCod, TM1.IntDsc, T2.EmprNom, TM1.IntCodCtb, TM1.IntLabLi, TM1.IntLabLf, TM1.IntLava, TM1.IntPreMin, TM1.IntPreMax, TM1.IntOrder, TM1.IntAct, TM1.EmprCod FROM (TXPINTENS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.IntCod = ? ORDER BY TM1.EmprCod, TM1.IntCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001E6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, IntCod FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001E7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, IntCod FROM TXPINTENS WHERE ( IntCod > ?) and EmprCod = ? ORDER BY EmprCod, IntCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, IntCod FROM TXPINTENS WHERE ( IntCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, IntCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001E9", "INSERT INTO TXPINTENS(IntCod, IntDsc, IntCodCtb, IntLabLi, IntLabLf, IntLava, IntPreMin, IntPreMax, IntOrder, IntAct, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINTENS")
         ,new UpdateCursor("T001E10", "UPDATE TXPINTENS SET IntDsc=?, IntCodCtb=?, IntLabLi=?, IntLabLf=?, IntLava=?, IntPreMin=?, IntPreMax=?, IntOrder=?, IntAct=?  WHERE EmprCod = ? AND IntCod = ?", GX_NOMASK, "TXPINTENS")
         ,new UpdateCursor("T001E11", "DELETE FROM TXPINTENS  WHERE EmprCod = ? AND IntCod = ?", GX_NOMASK, "TXPINTENS")
         ,new ForEachCursor("T001E12", "SELECT * FROM (SELECT EmprCod, PLNColor, IntCod FROM TXPPLNCoI WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E13", "SELECT * FROM (SELECT EmprCod, IntCod, CCTCod FROM TXPPddCtr WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E14", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND SocInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E15", "SELECT * FROM (SELECT EmprCod, TipArtCod, IntCod FROM TXPTARINT WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E16", "SELECT * FROM (SELECT EmprCod, CliCod, PreTAICod, IntCod FROM TXPPRETA1 WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E17", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E18", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E19", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E20", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E21", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod FROM TXPPRETIN WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E22", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001E23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, IntCod FROM TXPINTENS WHERE EmprCod = ? ORDER BY EmprCod, IntCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 1);
               stmt.setString(11, (String)parms[19], 3);
               return;
            case 8 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               stmt.setString(9, (String)parms[16], 1);
               stmt.setString(10, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[19]).byteValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

