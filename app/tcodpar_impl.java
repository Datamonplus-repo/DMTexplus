package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcodpar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"PARCOD") == 0 )
      {
         AV30ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ParCod), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30ParCod), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asaparcod2O113( AV30ParCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"PARCOD") == 0 )
      {
         A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
         n656ParCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
         AV36autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asaparcod2O113( A656ParCod, AV36autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9396ParTMCod = (int)(GXutil.lval( httpContext.GetPar( "ParTMCod"))) ;
         n9396ParTMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A9396ParTMCod) ;
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
            AV29EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
            AV30ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ParCod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30ParCod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CODIGOS DE PARO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtParCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tcodpar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcodpar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcodpar_impl.class ));
   }

   public tcodpar_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbParCodEst = new HTMLChoice();
      chkParTMAct = UIFactory.getCheckbox(this);
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
      if ( cmbParCodEst.getItemCount() > 0 )
      {
         A8481ParCodEst = cmbParCodEst.getValidValue(A8481ParCodEst) ;
         n8481ParCodEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8481ParCodEst", A8481ParCodEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbParCodEst.setValue( GXutil.rtrim( A8481ParCodEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbParCodEst.getInternalname(), "Values", cmbParCodEst.ToJavascriptSource(), true);
      }
      A9395ParTMAct = ((GXutil.strcmp(GXutil.rtrim( A9395ParTMAct), "S")==0) ? "S" : "N") ;
      n9395ParTMAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9395ParTMAct", A9395ParTMAct);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParCod_Internalname, httpContext.getMessage( "Paro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtParCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCODPAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParCodNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParCodNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParCodNom_Internalname, GXutil.rtrim( A867ParCodNom), GXutil.rtrim( localUtil.format( A867ParCodNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParCodNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtParCodNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCODPAR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbParCodEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbParCodEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbParCodEst, cmbParCodEst.getInternalname(), GXutil.rtrim( A8481ParCodEst), 1, cmbParCodEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbParCodEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "", true, (byte)(0), "HLP_TCODPAR.htm");
      cmbParCodEst.setValue( GXutil.rtrim( A8481ParCodEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbParCodEst.getInternalname(), "Values", cmbParCodEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParTiempo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParTiempo_Internalname, httpContext.getMessage( "Tiempo (mm)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParTiempo_Internalname, GXutil.ltrim( localUtil.ntoc( A14212ParTiempo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParTiempo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14212ParTiempo), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14212ParTiempo), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParTiempo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtParTiempo_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCODPAR.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable1_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable1_cell_Class, "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkParTMAct.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkParTMAct.getInternalname(), httpContext.getMessage( "Dispara Solicitud de Mantenimiento", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkParTMAct.getInternalname(), A9395ParTMAct, "", httpContext.getMessage( "Dispara Solicitud de Mantenimiento", ""), 1, chkParTMAct.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(55, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,55);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedpartmcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpartmcod_Internalname, httpContext.getMessage( "Tarea de Mantto", ""), "", "", lblTextblockpartmcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TCODPAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_partmcod.setProperty("Caption", Combo_partmcod_Caption);
      ucCombo_partmcod.setProperty("Cls", Combo_partmcod_Cls);
      ucCombo_partmcod.setProperty("EmptyItemText", Combo_partmcod_Emptyitemtext);
      ucCombo_partmcod.setProperty("DropDownOptionsData", AV37ParTMCod_Data);
      ucCombo_partmcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_partmcod_Internalname, "COMBO_PARTMCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParTMCod_Internalname, httpContext.getMessage( "Tarea de Mantto", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParTMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9396ParTMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9396ParTMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParTMCod_Jsonclick, 0, "Attribute", "", "", "", "", edtParTMCod_Visible, edtParTMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCODPAR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCODPAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCODPAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCODPAR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_partmcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombopartmcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV39ComboParTMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombopartmcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39ComboParTMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39ComboParTMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombopartmcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombopartmcod_Visible, edtavCombopartmcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCODPAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtParTMDsc_Internalname, GXutil.rtrim( A9397ParTMDsc), GXutil.rtrim( localUtil.format( A9397ParTMDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParTMDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtParTMDsc_Visible, edtParTMDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCODPAR.htm");
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
      e112O2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARTMCOD_DATA"), AV37ParTMCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z656ParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z867ParCodNom = httpContext.cgiGet( "Z867ParCodNom") ;
            Z8481ParCodEst = httpContext.cgiGet( "Z8481ParCodEst") ;
            Z9395ParTMAct = httpContext.cgiGet( "Z9395ParTMAct") ;
            Z14212ParTiempo = (int)(localUtil.ctol( httpContext.cgiGet( "Z14212ParTiempo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10154ParOpCl = httpContext.cgiGet( "Z10154ParOpCl") ;
            Z14213ParStki = httpContext.cgiGet( "Z14213ParStki") ;
            Z14214ParParcial = httpContext.cgiGet( "Z14214ParParcial") ;
            Z14215ParFinHdr = httpContext.cgiGet( "Z14215ParFinHdr") ;
            Z9396ParTMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9396ParTMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10154ParOpCl = httpContext.cgiGet( "Z10154ParOpCl") ;
            n10154ParOpCl = false ;
            A14213ParStki = httpContext.cgiGet( "Z14213ParStki") ;
            n14213ParStki = false ;
            A14214ParParcial = httpContext.cgiGet( "Z14214ParParcial") ;
            A14215ParFinHdr = httpContext.cgiGet( "Z14215ParFinHdr") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N9396ParTMCod = (int)(localUtil.ctol( httpContext.cgiGet( "N9396ParTMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13824ParCodNomI = httpContext.cgiGet( "PARCODNOMI") ;
            AV29EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV30ParCod = (short)(localUtil.ctol( httpContext.cgiGet( "vPARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Insert_ParTMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PARTMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10154ParOpCl = httpContext.cgiGet( "PAROPCL") ;
            A14213ParStki = httpContext.cgiGet( "PARSTKI") ;
            A14214ParParcial = httpContext.cgiGet( "PARPARCIAL") ;
            A14215ParFinHdr = httpContext.cgiGet( "PARFINHDR") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            AV41Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            Combo_partmcod_Objectcall = httpContext.cgiGet( "COMBO_PARTMCOD_Objectcall") ;
            Combo_partmcod_Class = httpContext.cgiGet( "COMBO_PARTMCOD_Class") ;
            Combo_partmcod_Icontype = httpContext.cgiGet( "COMBO_PARTMCOD_Icontype") ;
            Combo_partmcod_Icon = httpContext.cgiGet( "COMBO_PARTMCOD_Icon") ;
            Combo_partmcod_Caption = httpContext.cgiGet( "COMBO_PARTMCOD_Caption") ;
            Combo_partmcod_Tooltip = httpContext.cgiGet( "COMBO_PARTMCOD_Tooltip") ;
            Combo_partmcod_Cls = httpContext.cgiGet( "COMBO_PARTMCOD_Cls") ;
            Combo_partmcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARTMCOD_Selectedvalue_set") ;
            Combo_partmcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PARTMCOD_Selectedvalue_get") ;
            Combo_partmcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PARTMCOD_Selectedtext_set") ;
            Combo_partmcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PARTMCOD_Selectedtext_get") ;
            Combo_partmcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PARTMCOD_Gamoauthtoken") ;
            Combo_partmcod_Ddointernalname = httpContext.cgiGet( "COMBO_PARTMCOD_Ddointernalname") ;
            Combo_partmcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PARTMCOD_Titlecontrolalign") ;
            Combo_partmcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PARTMCOD_Dropdownoptionstype") ;
            Combo_partmcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARTMCOD_Enabled")) ;
            Combo_partmcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARTMCOD_Visible")) ;
            Combo_partmcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PARTMCOD_Titlecontrolidtoreplace") ;
            Combo_partmcod_Datalisttype = httpContext.cgiGet( "COMBO_PARTMCOD_Datalisttype") ;
            Combo_partmcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARTMCOD_Allowmultipleselection")) ;
            Combo_partmcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PARTMCOD_Datalistfixedvalues") ;
            Combo_partmcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARTMCOD_Isgriditem")) ;
            Combo_partmcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARTMCOD_Hasdescription")) ;
            Combo_partmcod_Datalistproc = httpContext.cgiGet( "COMBO_PARTMCOD_Datalistproc") ;
            Combo_partmcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PARTMCOD_Datalistprocparametersprefix") ;
            Combo_partmcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PARTMCOD_Remoteservicesparameters") ;
            Combo_partmcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PARTMCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_partmcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARTMCOD_Includeonlyselectedoption")) ;
            Combo_partmcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARTMCOD_Includeselectalloption")) ;
            Combo_partmcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARTMCOD_Emptyitem")) ;
            Combo_partmcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARTMCOD_Includeaddnewoption")) ;
            Combo_partmcod_Htmltemplate = httpContext.cgiGet( "COMBO_PARTMCOD_Htmltemplate") ;
            Combo_partmcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARTMCOD_Multiplevaluestype") ;
            Combo_partmcod_Loadingdata = httpContext.cgiGet( "COMBO_PARTMCOD_Loadingdata") ;
            Combo_partmcod_Noresultsfound = httpContext.cgiGet( "COMBO_PARTMCOD_Noresultsfound") ;
            Combo_partmcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PARTMCOD_Emptyitemtext") ;
            Combo_partmcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PARTMCOD_Onlyselectedvalues") ;
            Combo_partmcod_Selectalltext = httpContext.cgiGet( "COMBO_PARTMCOD_Selectalltext") ;
            Combo_partmcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PARTMCOD_Multiplevaluesseparator") ;
            Combo_partmcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PARTMCOD_Addnewoptiontext") ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A656ParCod = (short)(0) ;
               n656ParCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
            }
            else
            {
               A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n656ParCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
            }
            A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
            n867ParCodNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
            cmbParCodEst.setValue( httpContext.cgiGet( cmbParCodEst.getInternalname()) );
            A8481ParCodEst = httpContext.cgiGet( cmbParCodEst.getInternalname()) ;
            n8481ParCodEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8481ParCodEst", A8481ParCodEst);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParTiempo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParTiempo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARTIEMPO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParTiempo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14212ParTiempo = 0 ;
               n14212ParTiempo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14212ParTiempo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14212ParTiempo), 6, 0));
            }
            else
            {
               A14212ParTiempo = (int)(localUtil.ctol( httpContext.cgiGet( edtParTiempo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n14212ParTiempo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14212ParTiempo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14212ParTiempo), 6, 0));
            }
            A9395ParTMAct = ((GXutil.strcmp(httpContext.cgiGet( chkParTMAct.getInternalname()), "S")==0) ? "S" : "N") ;
            n9395ParTMAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9395ParTMAct", A9395ParTMAct);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARTMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParTMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9396ParTMCod = 0 ;
               n9396ParTMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
            }
            else
            {
               A9396ParTMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtParTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9396ParTMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
            }
            AV39ComboParTMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavCombopartmcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39ComboParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39ComboParTMCod), 8, 0));
            A9397ParTMDsc = httpContext.cgiGet( edtParTMDsc_Internalname) ;
            n9397ParTMDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9397ParTMDsc", A9397ParTMDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCODPAR");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("ParOpCl", GXutil.rtrim( localUtil.format( A10154ParOpCl, "")));
            forbiddenHiddens.add("ParStki", GXutil.rtrim( localUtil.format( A14213ParStki, "")));
            forbiddenHiddens.add("ParParcial", GXutil.rtrim( localUtil.format( A14214ParParcial, "")));
            forbiddenHiddens.add("ParFinHdr", GXutil.rtrim( localUtil.format( A14215ParFinHdr, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A656ParCod != Z656ParCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tcodpar:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
               n656ParCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
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
                  sMode113 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode113 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound113 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_2O0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PARCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParCod_Internalname ;
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
                        e112O2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e122O2 ();
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
         e122O2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2O113( ) ;
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
         disableAttributes2O113( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavCombopartmcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombopartmcod_Enabled), 5, 0), true);
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

   public void confirm_2O0( )
   {
      beforeValidate2O113( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2O113( ) ;
         }
         else
         {
            checkExtendedTable2O113( ) ;
            closeExtendedTableCursors2O113( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption2O0( )
   {
   }

   public void e112O2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tcodpar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcodpar_impl.this.A396EmprCod = GXv_char2[0] ;
      tcodpar_impl.this.AV16EmprNom = GXv_char3[0] ;
      tcodpar_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV36autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      tcodpar_impl.this.GXt_int5 = GXv_int6[0] ;
      AV36autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36autonumber), 4, 0));
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tcodpar_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV29EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      tcodpar_impl.this.AV29EmprCod = GXv_char4[0] ;
      tcodpar_impl.this.AV16EmprNom = GXv_char3[0] ;
      tcodpar_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV31WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV31WWPContext = GXv_SdtWWPContext7[0] ;
      edtParTMCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Visible), 5, 0), true);
      AV39ComboParTMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ComboParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39ComboParTMCod), 8, 0));
      edtavCombopartmcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombopartmcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombopartmcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPARTMCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV32TrnContext.fromxml(AV33WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV32TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV41Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV42GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GXV1), 8, 0));
         while ( AV42GXV1 <= AV32TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV35TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV32TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV42GXV1));
            if ( GXutil.strcmp(AV35TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ParTMCod") == 0 )
            {
               AV34Insert_ParTMCod = (int)(GXutil.lval( AV35TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Insert_ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Insert_ParTMCod), 8, 0));
               if ( ! (0==AV34Insert_ParTMCod) )
               {
                  AV39ComboParTMCod = AV34Insert_ParTMCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV39ComboParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39ComboParTMCod), 8, 0));
                  Combo_partmcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV39ComboParTMCod, 8, 0)) ;
                  ucCombo_partmcod.sendProperty(context, "", false, Combo_partmcod_Internalname, "SelectedValue_set", Combo_partmcod_Selectedvalue_set);
                  Combo_partmcod_Enabled = false ;
                  ucCombo_partmcod.sendProperty(context, "", false, Combo_partmcod_Internalname, "Enabled", GXutil.booltostr( Combo_partmcod_Enabled));
               }
            }
            AV42GXV1 = (int)(AV42GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GXV1), 8, 0));
         }
      }
      edtParTMDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParTMDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMDsc_Visible), 5, 0), true);
   }

   public void e122O2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV32TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tcodparww", new String[] {}, new String[] {}) );
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

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPARTMCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV37ParTMCod_Data ;
      GXv_char4[0] = AV38ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tcodparloaddvcombo(remoteHandle, context).execute( "ParTMCod", Gx_mode, AV29EmprCod, AV30ParCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tcodpar_impl.this.AV38ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV37ParTMCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_partmcod_Selectedvalue_set = AV38ComboSelectedValue ;
      ucCombo_partmcod.sendProperty(context, "", false, Combo_partmcod_Internalname, "SelectedValue_set", Combo_partmcod_Selectedvalue_set);
      AV39ComboParTMCod = (int)(GXutil.lval( AV38ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ComboParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39ComboParTMCod), 8, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_partmcod_Enabled = false ;
         ucCombo_partmcod.sendProperty(context, "", false, Combo_partmcod_Internalname, "Enabled", GXutil.booltostr( Combo_partmcod_Enabled));
      }
   }

   public void zm2O113( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z867ParCodNom = T002O3_A867ParCodNom[0] ;
            Z8481ParCodEst = T002O3_A8481ParCodEst[0] ;
            Z9395ParTMAct = T002O3_A9395ParTMAct[0] ;
            Z14212ParTiempo = T002O3_A14212ParTiempo[0] ;
            Z10154ParOpCl = T002O3_A10154ParOpCl[0] ;
            Z14213ParStki = T002O3_A14213ParStki[0] ;
            Z14214ParParcial = T002O3_A14214ParParcial[0] ;
            Z14215ParFinHdr = T002O3_A14215ParFinHdr[0] ;
            Z9396ParTMCod = T002O3_A9396ParTMCod[0] ;
         }
         else
         {
            Z867ParCodNom = A867ParCodNom ;
            Z8481ParCodEst = A8481ParCodEst ;
            Z9395ParTMAct = A9395ParTMAct ;
            Z14212ParTiempo = A14212ParTiempo ;
            Z10154ParOpCl = A10154ParOpCl ;
            Z14213ParStki = A14213ParStki ;
            Z14214ParParcial = A14214ParParcial ;
            Z14215ParFinHdr = A14215ParFinHdr ;
            Z9396ParTMCod = A9396ParTMCod ;
         }
      }
      if ( GX_JID == -22 )
      {
         Z656ParCod = A656ParCod ;
         Z867ParCodNom = A867ParCodNom ;
         Z8481ParCodEst = A8481ParCodEst ;
         Z9395ParTMAct = A9395ParTMAct ;
         Z14212ParTiempo = A14212ParTiempo ;
         Z10154ParOpCl = A10154ParOpCl ;
         Z14213ParStki = A14213ParStki ;
         Z14214ParParcial = A14214ParParcial ;
         Z14215ParFinHdr = A14215ParFinHdr ;
         Z396EmprCod = A396EmprCod ;
         Z9396ParTMCod = A9396ParTMCod ;
         Z407EmprNom = A407EmprNom ;
         Z9397ParTMDsc = A9397ParTMDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV41Pgmname = "TCODPAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV29EmprCod)==0) )
      {
         A396EmprCod = AV29EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T002O4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T002O4_A407EmprNom[0] ;
      n407EmprNom = T002O4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNT", ""), ""), GXv_int6) ;
      tcodpar_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNT", ""), ""), GXv_int6) ;
         tcodpar_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
         }
      }
      if ( ! (0==AV30ParCod) )
      {
         A656ParCod = AV30ParCod ;
         n656ParCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
      }
      if ( ! (0==AV30ParCod) )
      {
         edtParCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Enabled), 5, 0), true);
      }
      else
      {
         edtParCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV30ParCod) )
      {
         edtParCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Enabled), 5, 0), true);
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
      if ( isIns( )  && (GXutil.strcmp("", A8481ParCodEst)==0) && ( Gx_BScreen == 0 ) )
      {
         A8481ParCodEst = httpContext.getMessage( httpContext.getMessage( "A", ""), "") ;
         n8481ParCodEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8481ParCodEst", A8481ParCodEst);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10154ParOpCl)==0) && ( Gx_BScreen == 0 ) )
      {
         A10154ParOpCl = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n10154ParOpCl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10154ParOpCl", A10154ParOpCl);
      }
      if ( isIns( )  && (GXutil.strcmp("", A14213ParStki)==0) && ( Gx_BScreen == 0 ) )
      {
         A14213ParStki = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n14213ParStki = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14213ParStki", A14213ParStki);
      }
      if ( isIns( )  && (GXutil.strcmp("", A14214ParParcial)==0) && ( Gx_BScreen == 0 ) )
      {
         A14214ParParcial = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14214ParParcial", A14214ParParcial);
      }
      if ( isIns( )  && (GXutil.strcmp("", A14215ParFinHdr)==0) && ( Gx_BScreen == 0 ) )
      {
         A14215ParFinHdr = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14215ParFinHdr", A14215ParFinHdr);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load2O113( )
   {
      /* Using cursor T002O6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound113 = (short)(1) ;
         A407EmprNom = T002O6_A407EmprNom[0] ;
         n407EmprNom = T002O6_n407EmprNom[0] ;
         A867ParCodNom = T002O6_A867ParCodNom[0] ;
         n867ParCodNom = T002O6_n867ParCodNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
         A8481ParCodEst = T002O6_A8481ParCodEst[0] ;
         n8481ParCodEst = T002O6_n8481ParCodEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8481ParCodEst", A8481ParCodEst);
         A9395ParTMAct = T002O6_A9395ParTMAct[0] ;
         n9395ParTMAct = T002O6_n9395ParTMAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9395ParTMAct", A9395ParTMAct);
         A9397ParTMDsc = T002O6_A9397ParTMDsc[0] ;
         n9397ParTMDsc = T002O6_n9397ParTMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9397ParTMDsc", A9397ParTMDsc);
         A14212ParTiempo = T002O6_A14212ParTiempo[0] ;
         n14212ParTiempo = T002O6_n14212ParTiempo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14212ParTiempo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14212ParTiempo), 6, 0));
         A10154ParOpCl = T002O6_A10154ParOpCl[0] ;
         n10154ParOpCl = T002O6_n10154ParOpCl[0] ;
         A14213ParStki = T002O6_A14213ParStki[0] ;
         n14213ParStki = T002O6_n14213ParStki[0] ;
         A14214ParParcial = T002O6_A14214ParParcial[0] ;
         A14215ParFinHdr = T002O6_A14215ParFinHdr[0] ;
         A9396ParTMCod = T002O6_A9396ParTMCod[0] ;
         n9396ParTMCod = T002O6_n9396ParTMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
         zm2O113( -22) ;
      }
      pr_default.close(4);
      onLoadActions2O113( ) ;
   }

   public void onLoadActions2O113( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV34Insert_ParTMCod) )
      {
         A9396ParTMCod = AV34Insert_ParTMCod ;
         n9396ParTMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
      }
      else
      {
         if ( (0==AV39ComboParTMCod) )
         {
            A9396ParTMCod = 0 ;
            n9396ParTMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
            n9396ParTMCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
         }
         else
         {
            if ( ! (0==AV39ComboParTMCod) )
            {
               A9396ParTMCod = AV39ComboParTMCod ;
               n9396ParTMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
            }
            else
            {
               if ( GXutil.strcmp(A9395ParTMAct, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  A9396ParTMCod = 0 ;
                  n9396ParTMCod = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
               }
            }
         }
      }
      if ( ( GXutil.strcmp(sMode113, "INS") == 0 ) && ! (0==AV34Insert_ParTMCod) )
      {
         edtParTMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A9395ParTMAct, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtParTMCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
         }
         else
         {
            edtParTMCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
         }
      }
      A13824ParCodNomI = GXutil.trim( GXutil.str( A656ParCod, 4, 0)) + "-" + GXutil.trim( A867ParCodNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13824ParCodNomI", A13824ParCodNomI);
   }

   public void checkExtendedTable2O113( )
   {
      nIsDirty_113 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV34Insert_ParTMCod) )
      {
         nIsDirty_113 = (short)(1) ;
         A9396ParTMCod = AV34Insert_ParTMCod ;
         n9396ParTMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
      }
      else
      {
         if ( (0==AV39ComboParTMCod) )
         {
            nIsDirty_113 = (short)(1) ;
            nIsDirty_113 = (short)(1) ;
            A9396ParTMCod = 0 ;
            n9396ParTMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
            n9396ParTMCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
         }
         else
         {
            if ( ! (0==AV39ComboParTMCod) )
            {
               nIsDirty_113 = (short)(1) ;
               A9396ParTMCod = AV39ComboParTMCod ;
               n9396ParTMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
            }
            else
            {
               if ( GXutil.strcmp(A9395ParTMAct, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
               {
                  nIsDirty_113 = (short)(1) ;
                  A9396ParTMCod = 0 ;
                  n9396ParTMCod = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
               }
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV34Insert_ParTMCod) )
      {
         edtParTMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A9395ParTMAct, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtParTMCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
         }
         else
         {
            edtParTMCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
         }
      }
      nIsDirty_113 = (short)(1) ;
      A13824ParCodNomI = GXutil.trim( GXutil.str( A656ParCod, 4, 0)) + "-" + GXutil.trim( A867ParCodNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13824ParCodNomI", A13824ParCodNomI);
      if ( ( A656ParCod == 0 ) && ( AV36autonumber == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo incorrecto!", ""), 1, "PARCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A8481ParCodEst, "A") == 0 ) || ( GXutil.strcmp(A8481ParCodEst, "I") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PARCODEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbParCodEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T002O5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n9396ParTMCod), Integer.valueOf(A9396ParTMCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9396ParTMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MTPar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARTMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParTMCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9397ParTMDsc = T002O5_A9397ParTMDsc[0] ;
      n9397ParTMDsc = T002O5_n9397ParTMDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9397ParTMDsc", A9397ParTMDsc);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors2O113( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_24( String A396EmprCod ,
                          int A9396ParTMCod )
   {
      /* Using cursor T002O7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n9396ParTMCod), Integer.valueOf(A9396ParTMCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9396ParTMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MTPar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARTMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParTMCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9397ParTMDsc = T002O7_A9397ParTMDsc[0] ;
      n9397ParTMDsc = T002O7_n9397ParTMDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9397ParTMDsc", A9397ParTMDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9397ParTMDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey2O113( )
   {
      /* Using cursor T002O8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound113 = (short)(1) ;
      }
      else
      {
         RcdFound113 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002O3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T002O3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm2O113( 22) ;
         RcdFound113 = (short)(1) ;
         A656ParCod = T002O3_A656ParCod[0] ;
         n656ParCod = T002O3_n656ParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
         A867ParCodNom = T002O3_A867ParCodNom[0] ;
         n867ParCodNom = T002O3_n867ParCodNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
         A8481ParCodEst = T002O3_A8481ParCodEst[0] ;
         n8481ParCodEst = T002O3_n8481ParCodEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8481ParCodEst", A8481ParCodEst);
         A9395ParTMAct = T002O3_A9395ParTMAct[0] ;
         n9395ParTMAct = T002O3_n9395ParTMAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9395ParTMAct", A9395ParTMAct);
         A14212ParTiempo = T002O3_A14212ParTiempo[0] ;
         n14212ParTiempo = T002O3_n14212ParTiempo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14212ParTiempo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14212ParTiempo), 6, 0));
         A10154ParOpCl = T002O3_A10154ParOpCl[0] ;
         n10154ParOpCl = T002O3_n10154ParOpCl[0] ;
         A14213ParStki = T002O3_A14213ParStki[0] ;
         n14213ParStki = T002O3_n14213ParStki[0] ;
         A14214ParParcial = T002O3_A14214ParParcial[0] ;
         A14215ParFinHdr = T002O3_A14215ParFinHdr[0] ;
         A9396ParTMCod = T002O3_A9396ParTMCod[0] ;
         n9396ParTMCod = T002O3_n9396ParTMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z656ParCod = A656ParCod ;
         sMode113 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2O113( ) ;
         if ( AnyError == 1 )
         {
            RcdFound113 = (short)(0) ;
            initializeNonKey2O113( ) ;
         }
         Gx_mode = sMode113 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound113 = (short)(0) ;
         initializeNonKey2O113( ) ;
         sMode113 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode113 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2O113( ) ;
      if ( RcdFound113 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound113 = (short)(0) ;
      /* Using cursor T002O9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T002O9_A656ParCod[0] < A656ParCod ) ) && ( GXutil.strcmp(T002O9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T002O9_A656ParCod[0] > A656ParCod ) ) && ( GXutil.strcmp(T002O9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A656ParCod = T002O9_A656ParCod[0] ;
            n656ParCod = T002O9_n656ParCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
            RcdFound113 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound113 = (short)(0) ;
      /* Using cursor T002O10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T002O10_A656ParCod[0] > A656ParCod ) ) && ( GXutil.strcmp(T002O10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T002O10_A656ParCod[0] < A656ParCod ) ) && ( GXutil.strcmp(T002O10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A656ParCod = T002O10_A656ParCod[0] ;
            n656ParCod = T002O10_n656ParCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
            RcdFound113 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2O113( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtParCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2O113( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound113 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A656ParCod != Z656ParCod ) )
            {
               A656ParCod = Z656ParCod ;
               n656ParCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtParCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update2O113( ) ;
               GX_FocusControl = edtParCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A656ParCod != Z656ParCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtParCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2O113( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PARCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtParCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2O113( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A656ParCod != Z656ParCod ) )
      {
         A656ParCod = Z656ParCod ;
         n656ParCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PARCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtParCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency2O113( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002O2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCODPAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z867ParCodNom, T002O2_A867ParCodNom[0]) != 0 ) || ( GXutil.strcmp(Z8481ParCodEst, T002O2_A8481ParCodEst[0]) != 0 ) || ( GXutil.strcmp(Z9395ParTMAct, T002O2_A9395ParTMAct[0]) != 0 ) || ( Z14212ParTiempo != T002O2_A14212ParTiempo[0] ) || ( GXutil.strcmp(Z10154ParOpCl, T002O2_A10154ParOpCl[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14213ParStki, T002O2_A14213ParStki[0]) != 0 ) || ( GXutil.strcmp(Z14214ParParcial, T002O2_A14214ParParcial[0]) != 0 ) || ( GXutil.strcmp(Z14215ParFinHdr, T002O2_A14215ParFinHdr[0]) != 0 ) || ( Z9396ParTMCod != T002O2_A9396ParTMCod[0] ) )
         {
            if ( GXutil.strcmp(Z867ParCodNom, T002O2_A867ParCodNom[0]) != 0 )
            {
               GXutil.writeLogln("tcodpar:[seudo value changed for attri]"+"ParCodNom");
               GXutil.writeLogRaw("Old: ",Z867ParCodNom);
               GXutil.writeLogRaw("Current: ",T002O2_A867ParCodNom[0]);
            }
            if ( GXutil.strcmp(Z8481ParCodEst, T002O2_A8481ParCodEst[0]) != 0 )
            {
               GXutil.writeLogln("tcodpar:[seudo value changed for attri]"+"ParCodEst");
               GXutil.writeLogRaw("Old: ",Z8481ParCodEst);
               GXutil.writeLogRaw("Current: ",T002O2_A8481ParCodEst[0]);
            }
            if ( GXutil.strcmp(Z9395ParTMAct, T002O2_A9395ParTMAct[0]) != 0 )
            {
               GXutil.writeLogln("tcodpar:[seudo value changed for attri]"+"ParTMAct");
               GXutil.writeLogRaw("Old: ",Z9395ParTMAct);
               GXutil.writeLogRaw("Current: ",T002O2_A9395ParTMAct[0]);
            }
            if ( Z14212ParTiempo != T002O2_A14212ParTiempo[0] )
            {
               GXutil.writeLogln("tcodpar:[seudo value changed for attri]"+"ParTiempo");
               GXutil.writeLogRaw("Old: ",Z14212ParTiempo);
               GXutil.writeLogRaw("Current: ",T002O2_A14212ParTiempo[0]);
            }
            if ( GXutil.strcmp(Z10154ParOpCl, T002O2_A10154ParOpCl[0]) != 0 )
            {
               GXutil.writeLogln("tcodpar:[seudo value changed for attri]"+"ParOpCl");
               GXutil.writeLogRaw("Old: ",Z10154ParOpCl);
               GXutil.writeLogRaw("Current: ",T002O2_A10154ParOpCl[0]);
            }
            if ( GXutil.strcmp(Z14213ParStki, T002O2_A14213ParStki[0]) != 0 )
            {
               GXutil.writeLogln("tcodpar:[seudo value changed for attri]"+"ParStki");
               GXutil.writeLogRaw("Old: ",Z14213ParStki);
               GXutil.writeLogRaw("Current: ",T002O2_A14213ParStki[0]);
            }
            if ( GXutil.strcmp(Z14214ParParcial, T002O2_A14214ParParcial[0]) != 0 )
            {
               GXutil.writeLogln("tcodpar:[seudo value changed for attri]"+"ParParcial");
               GXutil.writeLogRaw("Old: ",Z14214ParParcial);
               GXutil.writeLogRaw("Current: ",T002O2_A14214ParParcial[0]);
            }
            if ( GXutil.strcmp(Z14215ParFinHdr, T002O2_A14215ParFinHdr[0]) != 0 )
            {
               GXutil.writeLogln("tcodpar:[seudo value changed for attri]"+"ParFinHdr");
               GXutil.writeLogRaw("Old: ",Z14215ParFinHdr);
               GXutil.writeLogRaw("Current: ",T002O2_A14215ParFinHdr[0]);
            }
            if ( Z9396ParTMCod != T002O2_A9396ParTMCod[0] )
            {
               GXutil.writeLogln("tcodpar:[seudo value changed for attri]"+"ParTMCod");
               GXutil.writeLogRaw("Old: ",Z9396ParTMCod);
               GXutil.writeLogRaw("Current: ",T002O2_A9396ParTMCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCODPAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2O113( )
   {
      beforeValidate2O113( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2O113( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2O113( 0) ;
         checkOptimisticConcurrency2O113( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2O113( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2O113( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002O11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod), Boolean.valueOf(n867ParCodNom), A867ParCodNom, Boolean.valueOf(n8481ParCodEst), A8481ParCodEst, Boolean.valueOf(n9395ParTMAct), A9395ParTMAct, Boolean.valueOf(n14212ParTiempo), Integer.valueOf(A14212ParTiempo), Boolean.valueOf(n10154ParOpCl), A10154ParOpCl, Boolean.valueOf(n14213ParStki), A14213ParStki, A14214ParParcial, A14215ParFinHdr, A396EmprCod, Boolean.valueOf(n9396ParTMCod), Integer.valueOf(A9396ParTMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCODPAR");
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
                        resetCaption2O0( ) ;
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
            load2O113( ) ;
         }
         endLevel2O113( ) ;
      }
      closeExtendedTableCursors2O113( ) ;
   }

   public void update2O113( )
   {
      beforeValidate2O113( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2O113( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2O113( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2O113( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2O113( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002O12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n867ParCodNom), A867ParCodNom, Boolean.valueOf(n8481ParCodEst), A8481ParCodEst, Boolean.valueOf(n9395ParTMAct), A9395ParTMAct, Boolean.valueOf(n14212ParTiempo), Integer.valueOf(A14212ParTiempo), Boolean.valueOf(n10154ParOpCl), A10154ParOpCl, Boolean.valueOf(n14213ParStki), A14213ParStki, A14214ParParcial, A14215ParFinHdr, Boolean.valueOf(n9396ParTMCod), Integer.valueOf(A9396ParTMCod), A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCODPAR");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCODPAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2O113( ) ;
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
         endLevel2O113( ) ;
      }
      closeExtendedTableCursors2O113( ) ;
   }

   public void deferredUpdate2O113( )
   {
   }

   public void delete( )
   {
      beforeValidate2O113( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2O113( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2O113( ) ;
         afterConfirm2O113( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2O113( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002O13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCODPAR");
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
      sMode113 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2O113( ) ;
      Gx_mode = sMode113 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2O113( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13824ParCodNomI = GXutil.trim( GXutil.str( A656ParCod, 4, 0)) + "-" + GXutil.trim( A867ParCodNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13824ParCodNomI", A13824ParCodNomI);
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV34Insert_ParTMCod) )
         {
            edtParTMCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A9395ParTMAct, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
            {
               edtParTMCod_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
            }
            else
            {
               edtParTMCod_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
            }
         }
         /* Using cursor T002O14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n9396ParTMCod), Integer.valueOf(A9396ParTMCod)});
         A9397ParTMDsc = T002O14_A9397ParTMDsc[0] ;
         n9397ParTMDsc = T002O14_n9397ParTMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9397ParTMDsc", A9397ParTMDsc);
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002O15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parámetros por Paro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T002O16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel2O113( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2O113( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcodpar");
         if ( AnyError == 0 )
         {
            confirmValues2O0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcodpar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2O113( )
   {
      /* Scan By routine */
      /* Using cursor T002O17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound113 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound113 = (short)(1) ;
         A656ParCod = T002O17_A656ParCod[0] ;
         n656ParCod = T002O17_n656ParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2O113( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound113 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound113 = (short)(1) ;
         A656ParCod = T002O17_A656ParCod[0] ;
         n656ParCod = T002O17_n656ParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
      }
   }

   public void scanEnd2O113( )
   {
      pr_default.close(15);
   }

   public void afterConfirm2O113( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2O113( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A656ParCod) && ( AV36autonumber == 1 ) )
      {
         GXt_int10 = A656ParCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.lectoroptico.tcodpar_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int11) ;
         tcodpar_impl.this.GXt_int10 = GXv_int11[0] ;
         A656ParCod = GXt_int10 ;
         n656ParCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
      }
   }

   public void beforeUpdate2O113( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2O113( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2O113( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2O113( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2O113( )
   {
      edtParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Enabled), 5, 0), true);
      edtParCodNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParCodNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCodNom_Enabled), 5, 0), true);
      cmbParCodEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbParCodEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbParCodEst.getEnabled(), 5, 0), true);
      edtParTiempo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParTiempo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTiempo_Enabled), 5, 0), true);
      chkParTMAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkParTMAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkParTMAct.getEnabled(), 5, 0), true);
      edtParTMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMCod_Enabled), 5, 0), true);
      edtavCombopartmcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombopartmcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombopartmcod_Enabled), 5, 0), true);
      edtParTMDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParTMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTMDsc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2O113( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues2O0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tcodpar", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV30ParCod,4,0))}, new String[] {"Gx_mode","EmprCod","ParCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCODPAR");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("ParOpCl", GXutil.rtrim( localUtil.format( A10154ParOpCl, "")));
      forbiddenHiddens.add("ParStki", GXutil.rtrim( localUtil.format( A14213ParStki, "")));
      forbiddenHiddens.add("ParParcial", GXutil.rtrim( localUtil.format( A14214ParParcial, "")));
      forbiddenHiddens.add("ParFinHdr", GXutil.rtrim( localUtil.format( A14215ParFinHdr, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tcodpar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z656ParCod", GXutil.ltrim( localUtil.ntoc( Z656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z867ParCodNom", GXutil.rtrim( Z867ParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8481ParCodEst", GXutil.rtrim( Z8481ParCodEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9395ParTMAct", GXutil.rtrim( Z9395ParTMAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14212ParTiempo", GXutil.ltrim( localUtil.ntoc( Z14212ParTiempo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10154ParOpCl", GXutil.rtrim( Z10154ParOpCl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14213ParStki", GXutil.rtrim( Z14213ParStki));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14214ParParcial", GXutil.rtrim( Z14214ParParcial));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14215ParFinHdr", GXutil.rtrim( Z14215ParFinHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9396ParTMCod", GXutil.ltrim( localUtil.ntoc( Z9396ParTMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N9396ParTMCod", GXutil.ltrim( localUtil.ntoc( A9396ParTMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARTMCOD_DATA", AV37ParTMCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARTMCOD_DATA", AV37ParTMCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV32TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV32TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV32TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCODNOMI", A13824ParCodNomI);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV29EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARCOD", GXutil.ltrim( localUtil.ntoc( AV30ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30ParCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV36autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PARTMCOD", GXutil.ltrim( localUtil.ntoc( AV34Insert_ParTMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PAROPCL", GXutil.rtrim( A10154ParOpCl));
      app.GxWebStd.gx_hidden_field( httpContext, "PARSTKI", GXutil.rtrim( A14213ParStki));
      app.GxWebStd.gx_hidden_field( httpContext, "PARPARCIAL", GXutil.rtrim( A14214ParParcial));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFINHDR", GXutil.rtrim( A14215ParFinHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARTMCOD_Objectcall", GXutil.rtrim( Combo_partmcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARTMCOD_Cls", GXutil.rtrim( Combo_partmcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARTMCOD_Selectedvalue_set", GXutil.rtrim( Combo_partmcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARTMCOD_Enabled", GXutil.booltostr( Combo_partmcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARTMCOD_Emptyitemtext", GXutil.rtrim( Combo_partmcod_Emptyitemtext));
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
      return formatLink("app.tcodpar", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV30ParCod,4,0))}, new String[] {"Gx_mode","EmprCod","ParCod"})  ;
   }

   public String getPgmname( )
   {
      return "TCODPAR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CODIGOS DE PARO", "") ;
   }

   public void initializeNonKey2O113( )
   {
      A9396ParTMCod = 0 ;
      n9396ParTMCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9396ParTMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9396ParTMCod), 8, 0));
      A13824ParCodNomI = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13824ParCodNomI", A13824ParCodNomI);
      A867ParCodNom = "" ;
      n867ParCodNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
      A9395ParTMAct = "" ;
      n9395ParTMAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9395ParTMAct", A9395ParTMAct);
      A9397ParTMDsc = "" ;
      n9397ParTMDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9397ParTMDsc", A9397ParTMDsc);
      A14212ParTiempo = 0 ;
      n14212ParTiempo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14212ParTiempo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14212ParTiempo), 6, 0));
      A8481ParCodEst = httpContext.getMessage( "A", "") ;
      n8481ParCodEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8481ParCodEst", A8481ParCodEst);
      A10154ParOpCl = httpContext.getMessage( "N", "") ;
      n10154ParOpCl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10154ParOpCl", A10154ParOpCl);
      A14213ParStki = httpContext.getMessage( "N", "") ;
      n14213ParStki = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14213ParStki", A14213ParStki);
      A14214ParParcial = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14214ParParcial", A14214ParParcial);
      A14215ParFinHdr = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14215ParFinHdr", A14215ParFinHdr);
      Z867ParCodNom = "" ;
      Z8481ParCodEst = "" ;
      Z9395ParTMAct = "" ;
      Z14212ParTiempo = 0 ;
      Z10154ParOpCl = "" ;
      Z14213ParStki = "" ;
      Z14214ParParcial = "" ;
      Z14215ParFinHdr = "" ;
      Z9396ParTMCod = 0 ;
   }

   public void initAll2O113( )
   {
      A656ParCod = (short)(0) ;
      n656ParCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
      initializeNonKey2O113( ) ;
   }

   public void standaloneModalInsert( )
   {
      A8481ParCodEst = i8481ParCodEst ;
      n8481ParCodEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8481ParCodEst", A8481ParCodEst);
      A10154ParOpCl = i10154ParOpCl ;
      n10154ParOpCl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10154ParOpCl", A10154ParOpCl);
      A14213ParStki = i14213ParStki ;
      n14213ParStki = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14213ParStki", A14213ParStki);
      A14214ParParcial = i14214ParParcial ;
      httpContext.ajax_rsp_assign_attri("", false, "A14214ParParcial", A14214ParParcial);
      A14215ParFinHdr = i14215ParFinHdr ;
      httpContext.ajax_rsp_assign_attri("", false, "A14215ParFinHdr", A14215ParFinHdr);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211652914", true, true);
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
      httpContext.AddJavascriptSource("tcodpar.js", "?20268211652914", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      edtParCod_Internalname = "PARCOD" ;
      edtParCodNom_Internalname = "PARCODNOM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      cmbParCodEst.setInternalname( "PARCODEST" );
      edtParTiempo_Internalname = "PARTIEMPO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      chkParTMAct.setInternalname( "PARTMACT" );
      lblTextblockpartmcod_Internalname = "TEXTBLOCKPARTMCOD" ;
      Combo_partmcod_Internalname = "COMBO_PARTMCOD" ;
      edtParTMCod_Internalname = "PARTMCOD" ;
      divTablesplittedpartmcod_Internalname = "TABLESPLITTEDPARTMCOD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divDvpanel_unnamedtable1_cell_Internalname = "DVPANEL_UNNAMEDTABLE1_CELL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombopartmcod_Internalname = "vCOMBOPARTMCOD" ;
      divSectionattribute_partmcod_Internalname = "SECTIONATTRIBUTE_PARTMCOD" ;
      edtParTMDsc_Internalname = "PARTMDSC" ;
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
      Form.setCaption( httpContext.getMessage( "CODIGOS DE PARO", "") );
      edtParTMDsc_Jsonclick = "" ;
      edtParTMDsc_Enabled = 0 ;
      edtParTMDsc_Visible = 1 ;
      edtavCombopartmcod_Jsonclick = "" ;
      edtavCombopartmcod_Enabled = 0 ;
      edtavCombopartmcod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtParTMCod_Jsonclick = "" ;
      edtParTMCod_Enabled = 1 ;
      edtParTMCod_Visible = 1 ;
      Combo_partmcod_Emptyitemtext = "" ;
      Combo_partmcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_partmcod_Enabled = GXutil.toBoolean( -1) ;
      chkParTMAct.setEnabled( 1 );
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Mantenimiento", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12" ;
      edtParTiempo_Jsonclick = "" ;
      edtParTiempo_Enabled = 1 ;
      cmbParCodEst.setJsonclick( "" );
      cmbParCodEst.setEnabled( 1 );
      edtParCodNom_Jsonclick = "" ;
      edtParCodNom_Enabled = 1 ;
      edtParCod_Jsonclick = "" ;
      edtParCod_Enabled = 1 ;
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

   public void gx6asaparcod2O113( short AV30ParCod )
   {
      if ( ! (0==AV30ParCod) )
      {
         A656ParCod = AV30ParCod ;
         n656ParCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx7asaparcod2O113( short A656ParCod ,
                                  short AV36autonumber ,
                                  String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A656ParCod) && ( AV36autonumber == 1 ) )
      {
         GXt_int10 = A656ParCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.lectoroptico.tcodpar_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int11) ;
         tcodpar_impl.this.GXt_int10 = GXv_int11[0] ;
         A656ParCod = GXt_int10 ;
         n656ParCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      cmbParCodEst.setName( "PARCODEST" );
      cmbParCodEst.setWebtags( "" );
      cmbParCodEst.addItem("A", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbParCodEst.addItem("I", httpContext.getMessage( "Inactivo", ""), (short)(0));
      if ( cmbParCodEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A8481ParCodEst)==0) )
         {
            A8481ParCodEst = httpContext.getMessage( "A", "") ;
            n8481ParCodEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8481ParCodEst", A8481ParCodEst);
         }
      }
      chkParTMAct.setName( "PARTMACT" );
      chkParTMAct.setWebtags( "" );
      chkParTMAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkParTMAct.getInternalname(), "TitleCaption", chkParTMAct.getCaption(), true);
      chkParTMAct.setCheckedValue( "N" );
      A9395ParTMAct = ((GXutil.strcmp(GXutil.rtrim( A9395ParTMAct), "S")==0) ? "S" : "N") ;
      n9395ParTMAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9395ParTMAct", A9395ParTMAct);
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

   public void valid_Partmcod( )
   {
      n9396ParTMCod = false ;
      n9397ParTMDsc = false ;
      /* Using cursor T002O14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n9396ParTMCod), Integer.valueOf(A9396ParTMCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9396ParTMCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MTPar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARTMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParTMCod_Internalname ;
         }
      }
      A9397ParTMDsc = T002O14_A9397ParTMDsc[0] ;
      n9397ParTMDsc = T002O14_n9397ParTMDsc[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9397ParTMDsc", GXutil.rtrim( A9397ParTMDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV30ParCod',fld:'vPARCOD',pic:'ZZZ9',hsh:true},{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV30ParCod',fld:'vPARCOD',pic:'ZZZ9',hsh:true},{av:'A10154ParOpCl',fld:'PAROPCL',pic:''},{av:'A14213ParStki',fld:'PARSTKI',pic:''},{av:'A14214ParParcial',fld:'PARPARCIAL',pic:''},{av:'A14215ParFinHdr',fld:'PARFINHDR',pic:''},{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e122O2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]}");
      setEventMetadata("VALID_PARCOD","{handler:'valid_Parcod',iparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]");
      setEventMetadata("VALID_PARCOD",",oparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]}");
      setEventMetadata("VALID_PARCODNOM","{handler:'valid_Parcodnom',iparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]");
      setEventMetadata("VALID_PARCODNOM",",oparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]}");
      setEventMetadata("VALID_PARCODEST","{handler:'valid_Parcodest',iparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]");
      setEventMetadata("VALID_PARCODEST",",oparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]}");
      setEventMetadata("VALID_PARTMACT","{handler:'valid_Partmact',iparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]");
      setEventMetadata("VALID_PARTMACT",",oparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]}");
      setEventMetadata("VALID_PARTMCOD","{handler:'valid_Partmcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9396ParTMCod',fld:'PARTMCOD',pic:'ZZZZZZZ9'},{av:'A9397ParTMDsc',fld:'PARTMDSC',pic:''},{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]");
      setEventMetadata("VALID_PARTMCOD",",oparms:[{av:'A9397ParTMDsc',fld:'PARTMDSC',pic:''},{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]}");
      setEventMetadata("VALIDV_COMBOPARTMCOD","{handler:'validv_Combopartmcod',iparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]");
      setEventMetadata("VALIDV_COMBOPARTMCOD",",oparms:[{av:'A9395ParTMAct',fld:'PARTMACT',pic:''}]}");
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
      wcpOAV29EmprCod = "" ;
      Z396EmprCod = "" ;
      Z867ParCodNom = "" ;
      Z8481ParCodEst = "" ;
      Z9395ParTMAct = "" ;
      Z10154ParOpCl = "" ;
      Z14213ParStki = "" ;
      Z14214ParParcial = "" ;
      Z14215ParFinHdr = "" ;
      Combo_partmcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV29EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A8481ParCodEst = "" ;
      A9395ParTMAct = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A867ParCodNom = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockpartmcod_Jsonclick = "" ;
      ucCombo_partmcod = new com.genexus.webpanels.GXUserControl();
      Combo_partmcod_Caption = "" ;
      AV37ParTMCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A9397ParTMDsc = "" ;
      A10154ParOpCl = "" ;
      A14213ParStki = "" ;
      A14214ParParcial = "" ;
      A14215ParFinHdr = "" ;
      A13824ParCodNomI = "" ;
      A407EmprNom = "" ;
      AV41Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_partmcod_Objectcall = "" ;
      Combo_partmcod_Class = "" ;
      Combo_partmcod_Icontype = "" ;
      Combo_partmcod_Icon = "" ;
      Combo_partmcod_Tooltip = "" ;
      Combo_partmcod_Selectedvalue_set = "" ;
      Combo_partmcod_Selectedtext_set = "" ;
      Combo_partmcod_Selectedtext_get = "" ;
      Combo_partmcod_Gamoauthtoken = "" ;
      Combo_partmcod_Ddointernalname = "" ;
      Combo_partmcod_Titlecontrolalign = "" ;
      Combo_partmcod_Dropdownoptionstype = "" ;
      Combo_partmcod_Titlecontrolidtoreplace = "" ;
      Combo_partmcod_Datalisttype = "" ;
      Combo_partmcod_Datalistfixedvalues = "" ;
      Combo_partmcod_Datalistproc = "" ;
      Combo_partmcod_Datalistprocparametersprefix = "" ;
      Combo_partmcod_Remoteservicesparameters = "" ;
      Combo_partmcod_Htmltemplate = "" ;
      Combo_partmcod_Multiplevaluestype = "" ;
      Combo_partmcod_Loadingdata = "" ;
      Combo_partmcod_Noresultsfound = "" ;
      Combo_partmcod_Onlyselectedvalues = "" ;
      Combo_partmcod_Selectalltext = "" ;
      Combo_partmcod_Multiplevaluesseparator = "" ;
      Combo_partmcod_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode113 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV31WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV32TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV33WebSession = httpContext.getWebSession();
      AV35TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV38ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z9397ParTMDsc = "" ;
      T002O4_A407EmprNom = new String[] {""} ;
      T002O4_n407EmprNom = new boolean[] {false} ;
      GXv_int6 = new byte[1] ;
      T002O6_A656ParCod = new short[1] ;
      T002O6_n656ParCod = new boolean[] {false} ;
      T002O6_A407EmprNom = new String[] {""} ;
      T002O6_n407EmprNom = new boolean[] {false} ;
      T002O6_A867ParCodNom = new String[] {""} ;
      T002O6_n867ParCodNom = new boolean[] {false} ;
      T002O6_A8481ParCodEst = new String[] {""} ;
      T002O6_n8481ParCodEst = new boolean[] {false} ;
      T002O6_A9395ParTMAct = new String[] {""} ;
      T002O6_n9395ParTMAct = new boolean[] {false} ;
      T002O6_A9397ParTMDsc = new String[] {""} ;
      T002O6_n9397ParTMDsc = new boolean[] {false} ;
      T002O6_A14212ParTiempo = new int[1] ;
      T002O6_n14212ParTiempo = new boolean[] {false} ;
      T002O6_A10154ParOpCl = new String[] {""} ;
      T002O6_n10154ParOpCl = new boolean[] {false} ;
      T002O6_A14213ParStki = new String[] {""} ;
      T002O6_n14213ParStki = new boolean[] {false} ;
      T002O6_A14214ParParcial = new String[] {""} ;
      T002O6_A14215ParFinHdr = new String[] {""} ;
      T002O6_A396EmprCod = new String[] {""} ;
      T002O6_A9396ParTMCod = new int[1] ;
      T002O6_n9396ParTMCod = new boolean[] {false} ;
      T002O5_A9397ParTMDsc = new String[] {""} ;
      T002O5_n9397ParTMDsc = new boolean[] {false} ;
      T002O7_A9397ParTMDsc = new String[] {""} ;
      T002O7_n9397ParTMDsc = new boolean[] {false} ;
      T002O8_A396EmprCod = new String[] {""} ;
      T002O8_A656ParCod = new short[1] ;
      T002O8_n656ParCod = new boolean[] {false} ;
      T002O3_A656ParCod = new short[1] ;
      T002O3_n656ParCod = new boolean[] {false} ;
      T002O3_A867ParCodNom = new String[] {""} ;
      T002O3_n867ParCodNom = new boolean[] {false} ;
      T002O3_A8481ParCodEst = new String[] {""} ;
      T002O3_n8481ParCodEst = new boolean[] {false} ;
      T002O3_A9395ParTMAct = new String[] {""} ;
      T002O3_n9395ParTMAct = new boolean[] {false} ;
      T002O3_A14212ParTiempo = new int[1] ;
      T002O3_n14212ParTiempo = new boolean[] {false} ;
      T002O3_A10154ParOpCl = new String[] {""} ;
      T002O3_n10154ParOpCl = new boolean[] {false} ;
      T002O3_A14213ParStki = new String[] {""} ;
      T002O3_n14213ParStki = new boolean[] {false} ;
      T002O3_A14214ParParcial = new String[] {""} ;
      T002O3_A14215ParFinHdr = new String[] {""} ;
      T002O3_A396EmprCod = new String[] {""} ;
      T002O3_A9396ParTMCod = new int[1] ;
      T002O3_n9396ParTMCod = new boolean[] {false} ;
      T002O9_A396EmprCod = new String[] {""} ;
      T002O9_A656ParCod = new short[1] ;
      T002O9_n656ParCod = new boolean[] {false} ;
      T002O10_A396EmprCod = new String[] {""} ;
      T002O10_A656ParCod = new short[1] ;
      T002O10_n656ParCod = new boolean[] {false} ;
      T002O2_A656ParCod = new short[1] ;
      T002O2_n656ParCod = new boolean[] {false} ;
      T002O2_A867ParCodNom = new String[] {""} ;
      T002O2_n867ParCodNom = new boolean[] {false} ;
      T002O2_A8481ParCodEst = new String[] {""} ;
      T002O2_n8481ParCodEst = new boolean[] {false} ;
      T002O2_A9395ParTMAct = new String[] {""} ;
      T002O2_n9395ParTMAct = new boolean[] {false} ;
      T002O2_A14212ParTiempo = new int[1] ;
      T002O2_n14212ParTiempo = new boolean[] {false} ;
      T002O2_A10154ParOpCl = new String[] {""} ;
      T002O2_n10154ParOpCl = new boolean[] {false} ;
      T002O2_A14213ParStki = new String[] {""} ;
      T002O2_n14213ParStki = new boolean[] {false} ;
      T002O2_A14214ParParcial = new String[] {""} ;
      T002O2_A14215ParFinHdr = new String[] {""} ;
      T002O2_A396EmprCod = new String[] {""} ;
      T002O2_A9396ParTMCod = new int[1] ;
      T002O2_n9396ParTMCod = new boolean[] {false} ;
      T002O14_A9397ParTMDsc = new String[] {""} ;
      T002O14_n9397ParTMDsc = new boolean[] {false} ;
      T002O15_A396EmprCod = new String[] {""} ;
      T002O15_A656ParCod = new short[1] ;
      T002O15_n656ParCod = new boolean[] {false} ;
      T002O15_A3047LOParId = new String[] {""} ;
      T002O16_A396EmprCod = new String[] {""} ;
      T002O16_A602MaqCod = new String[] {""} ;
      T002O16_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002O16_A561HisProLin = new int[1] ;
      T002O17_A396EmprCod = new String[] {""} ;
      T002O17_A656ParCod = new short[1] ;
      T002O17_n656ParCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i8481ParCodEst = "" ;
      i10154ParOpCl = "" ;
      i14213ParStki = "" ;
      i14214ParParcial = "" ;
      i14215ParFinHdr = "" ;
      GXv_int11 = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcodpar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcodpar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcodpar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcodpar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcodpar__default(),
         new Object[] {
             new Object[] {
            T002O2_A656ParCod, T002O2_A867ParCodNom, T002O2_n867ParCodNom, T002O2_A8481ParCodEst, T002O2_n8481ParCodEst, T002O2_A9395ParTMAct, T002O2_n9395ParTMAct, T002O2_A14212ParTiempo, T002O2_n14212ParTiempo, T002O2_A10154ParOpCl,
            T002O2_n10154ParOpCl, T002O2_A14213ParStki, T002O2_n14213ParStki, T002O2_A14214ParParcial, T002O2_A14215ParFinHdr, T002O2_A396EmprCod, T002O2_A9396ParTMCod, T002O2_n9396ParTMCod
            }
            , new Object[] {
            T002O3_A656ParCod, T002O3_A867ParCodNom, T002O3_n867ParCodNom, T002O3_A8481ParCodEst, T002O3_n8481ParCodEst, T002O3_A9395ParTMAct, T002O3_n9395ParTMAct, T002O3_A14212ParTiempo, T002O3_n14212ParTiempo, T002O3_A10154ParOpCl,
            T002O3_n10154ParOpCl, T002O3_A14213ParStki, T002O3_n14213ParStki, T002O3_A14214ParParcial, T002O3_A14215ParFinHdr, T002O3_A396EmprCod, T002O3_A9396ParTMCod, T002O3_n9396ParTMCod
            }
            , new Object[] {
            T002O4_A407EmprNom, T002O4_n407EmprNom
            }
            , new Object[] {
            T002O5_A9397ParTMDsc, T002O5_n9397ParTMDsc
            }
            , new Object[] {
            T002O6_A656ParCod, T002O6_A407EmprNom, T002O6_n407EmprNom, T002O6_A867ParCodNom, T002O6_n867ParCodNom, T002O6_A8481ParCodEst, T002O6_n8481ParCodEst, T002O6_A9395ParTMAct, T002O6_n9395ParTMAct, T002O6_A9397ParTMDsc,
            T002O6_n9397ParTMDsc, T002O6_A14212ParTiempo, T002O6_n14212ParTiempo, T002O6_A10154ParOpCl, T002O6_n10154ParOpCl, T002O6_A14213ParStki, T002O6_n14213ParStki, T002O6_A14214ParParcial, T002O6_A14215ParFinHdr, T002O6_A396EmprCod,
            T002O6_A9396ParTMCod, T002O6_n9396ParTMCod
            }
            , new Object[] {
            T002O7_A9397ParTMDsc, T002O7_n9397ParTMDsc
            }
            , new Object[] {
            T002O8_A396EmprCod, T002O8_A656ParCod
            }
            , new Object[] {
            T002O9_A396EmprCod, T002O9_A656ParCod
            }
            , new Object[] {
            T002O10_A396EmprCod, T002O10_A656ParCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002O14_A9397ParTMDsc, T002O14_n9397ParTMDsc
            }
            , new Object[] {
            T002O15_A396EmprCod, T002O15_A656ParCod, T002O15_A3047LOParId
            }
            , new Object[] {
            T002O16_A396EmprCod, T002O16_A602MaqCod, T002O16_A558HisProFec, T002O16_A561HisProLin
            }
            , new Object[] {
            T002O17_A396EmprCod, T002O17_A656ParCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV41Pgmname = "TCODPAR" ;
      Z14215ParFinHdr = httpContext.getMessage( "N", "") ;
      A14215ParFinHdr = httpContext.getMessage( "N", "") ;
      i14215ParFinHdr = httpContext.getMessage( "N", "") ;
      Z14214ParParcial = httpContext.getMessage( "N", "") ;
      A14214ParParcial = httpContext.getMessage( "N", "") ;
      i14214ParParcial = httpContext.getMessage( "N", "") ;
      Z14213ParStki = httpContext.getMessage( "N", "") ;
      n14213ParStki = false ;
      A14213ParStki = httpContext.getMessage( "N", "") ;
      n14213ParStki = false ;
      i14213ParStki = httpContext.getMessage( "N", "") ;
      n14213ParStki = false ;
      Z10154ParOpCl = httpContext.getMessage( "N", "") ;
      n10154ParOpCl = false ;
      A10154ParOpCl = httpContext.getMessage( "N", "") ;
      n10154ParOpCl = false ;
      i10154ParOpCl = httpContext.getMessage( "N", "") ;
      n10154ParOpCl = false ;
      Z8481ParCodEst = httpContext.getMessage( "A", "") ;
      n8481ParCodEst = false ;
      A8481ParCodEst = httpContext.getMessage( "A", "") ;
      n8481ParCodEst = false ;
      i8481ParCodEst = httpContext.getMessage( "A", "") ;
      n8481ParCodEst = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte gxajaxcallmode ;
   private short wcpOAV30ParCod ;
   private short Z656ParCod ;
   private short AV30ParCod ;
   private short A656ParCod ;
   private short AV36autonumber ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound113 ;
   private short nIsDirty_113 ;
   private short GXt_int10 ;
   private short GXv_int11[] ;
   private int Z14212ParTiempo ;
   private int Z9396ParTMCod ;
   private int N9396ParTMCod ;
   private int A9396ParTMCod ;
   private int trnEnded ;
   private int edtParCod_Enabled ;
   private int edtParCodNom_Enabled ;
   private int A14212ParTiempo ;
   private int edtParTiempo_Enabled ;
   private int edtParTMCod_Visible ;
   private int edtParTMCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int AV39ComboParTMCod ;
   private int edtavCombopartmcod_Enabled ;
   private int edtavCombopartmcod_Visible ;
   private int edtParTMDsc_Visible ;
   private int edtParTMDsc_Enabled ;
   private int AV34Insert_ParTMCod ;
   private int Combo_partmcod_Datalistupdateminimumcharacters ;
   private int AV42GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV29EmprCod ;
   private String Z396EmprCod ;
   private String Z867ParCodNom ;
   private String Z8481ParCodEst ;
   private String Z9395ParTMAct ;
   private String Z10154ParOpCl ;
   private String Z14213ParStki ;
   private String Z14214ParParcial ;
   private String Z14215ParFinHdr ;
   private String Combo_partmcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV29EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtParCod_Internalname ;
   private String A8481ParCodEst ;
   private String A9395ParTMAct ;
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
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String edtParCod_Jsonclick ;
   private String edtParCodNom_Internalname ;
   private String A867ParCodNom ;
   private String edtParCodNom_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtParTiempo_Internalname ;
   private String edtParTiempo_Jsonclick ;
   private String divDvpanel_unnamedtable1_cell_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Class ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedpartmcod_Internalname ;
   private String lblTextblockpartmcod_Internalname ;
   private String lblTextblockpartmcod_Jsonclick ;
   private String Combo_partmcod_Caption ;
   private String Combo_partmcod_Cls ;
   private String Combo_partmcod_Emptyitemtext ;
   private String Combo_partmcod_Internalname ;
   private String edtParTMCod_Internalname ;
   private String edtParTMCod_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_partmcod_Internalname ;
   private String edtavCombopartmcod_Internalname ;
   private String edtavCombopartmcod_Jsonclick ;
   private String edtParTMDsc_Internalname ;
   private String A9397ParTMDsc ;
   private String edtParTMDsc_Jsonclick ;
   private String A10154ParOpCl ;
   private String A14213ParStki ;
   private String A14214ParParcial ;
   private String A14215ParFinHdr ;
   private String A407EmprNom ;
   private String AV41Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_partmcod_Objectcall ;
   private String Combo_partmcod_Class ;
   private String Combo_partmcod_Icontype ;
   private String Combo_partmcod_Icon ;
   private String Combo_partmcod_Tooltip ;
   private String Combo_partmcod_Selectedvalue_set ;
   private String Combo_partmcod_Selectedtext_set ;
   private String Combo_partmcod_Selectedtext_get ;
   private String Combo_partmcod_Gamoauthtoken ;
   private String Combo_partmcod_Ddointernalname ;
   private String Combo_partmcod_Titlecontrolalign ;
   private String Combo_partmcod_Dropdownoptionstype ;
   private String Combo_partmcod_Titlecontrolidtoreplace ;
   private String Combo_partmcod_Datalisttype ;
   private String Combo_partmcod_Datalistfixedvalues ;
   private String Combo_partmcod_Datalistproc ;
   private String Combo_partmcod_Datalistprocparametersprefix ;
   private String Combo_partmcod_Remoteservicesparameters ;
   private String Combo_partmcod_Htmltemplate ;
   private String Combo_partmcod_Multiplevaluestype ;
   private String Combo_partmcod_Loadingdata ;
   private String Combo_partmcod_Noresultsfound ;
   private String Combo_partmcod_Onlyselectedvalues ;
   private String Combo_partmcod_Selectalltext ;
   private String Combo_partmcod_Multiplevaluesseparator ;
   private String Combo_partmcod_Addnewoptiontext ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String hsh ;
   private String sMode113 ;
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
   private String Z9397ParTMDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i8481ParCodEst ;
   private String i10154ParOpCl ;
   private String i14213ParStki ;
   private String i14214ParParcial ;
   private String i14215ParFinHdr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n656ParCod ;
   private boolean n9396ParTMCod ;
   private boolean wbErr ;
   private boolean n8481ParCodEst ;
   private boolean n9395ParTMAct ;
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
   private boolean n10154ParOpCl ;
   private boolean n14213ParStki ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_partmcod_Enabled ;
   private boolean Combo_partmcod_Visible ;
   private boolean Combo_partmcod_Allowmultipleselection ;
   private boolean Combo_partmcod_Isgriditem ;
   private boolean Combo_partmcod_Hasdescription ;
   private boolean Combo_partmcod_Includeonlyselectedoption ;
   private boolean Combo_partmcod_Includeselectalloption ;
   private boolean Combo_partmcod_Emptyitem ;
   private boolean Combo_partmcod_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean n867ParCodNom ;
   private boolean n14212ParTiempo ;
   private boolean n9397ParTMDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13824ParCodNomI ;
   private String AV38ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV33WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_partmcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbParCodEst ;
   private ICheckbox chkParTMAct ;
   private IDataStoreProvider pr_default ;
   private String[] T002O4_A407EmprNom ;
   private boolean[] T002O4_n407EmprNom ;
   private short[] T002O6_A656ParCod ;
   private boolean[] T002O6_n656ParCod ;
   private String[] T002O6_A407EmprNom ;
   private boolean[] T002O6_n407EmprNom ;
   private String[] T002O6_A867ParCodNom ;
   private boolean[] T002O6_n867ParCodNom ;
   private String[] T002O6_A8481ParCodEst ;
   private boolean[] T002O6_n8481ParCodEst ;
   private String[] T002O6_A9395ParTMAct ;
   private boolean[] T002O6_n9395ParTMAct ;
   private String[] T002O6_A9397ParTMDsc ;
   private boolean[] T002O6_n9397ParTMDsc ;
   private int[] T002O6_A14212ParTiempo ;
   private boolean[] T002O6_n14212ParTiempo ;
   private String[] T002O6_A10154ParOpCl ;
   private boolean[] T002O6_n10154ParOpCl ;
   private String[] T002O6_A14213ParStki ;
   private boolean[] T002O6_n14213ParStki ;
   private String[] T002O6_A14214ParParcial ;
   private String[] T002O6_A14215ParFinHdr ;
   private String[] T002O6_A396EmprCod ;
   private int[] T002O6_A9396ParTMCod ;
   private boolean[] T002O6_n9396ParTMCod ;
   private String[] T002O5_A9397ParTMDsc ;
   private boolean[] T002O5_n9397ParTMDsc ;
   private String[] T002O7_A9397ParTMDsc ;
   private boolean[] T002O7_n9397ParTMDsc ;
   private String[] T002O8_A396EmprCod ;
   private short[] T002O8_A656ParCod ;
   private boolean[] T002O8_n656ParCod ;
   private short[] T002O3_A656ParCod ;
   private boolean[] T002O3_n656ParCod ;
   private String[] T002O3_A867ParCodNom ;
   private boolean[] T002O3_n867ParCodNom ;
   private String[] T002O3_A8481ParCodEst ;
   private boolean[] T002O3_n8481ParCodEst ;
   private String[] T002O3_A9395ParTMAct ;
   private boolean[] T002O3_n9395ParTMAct ;
   private int[] T002O3_A14212ParTiempo ;
   private boolean[] T002O3_n14212ParTiempo ;
   private String[] T002O3_A10154ParOpCl ;
   private boolean[] T002O3_n10154ParOpCl ;
   private String[] T002O3_A14213ParStki ;
   private boolean[] T002O3_n14213ParStki ;
   private String[] T002O3_A14214ParParcial ;
   private String[] T002O3_A14215ParFinHdr ;
   private String[] T002O3_A396EmprCod ;
   private int[] T002O3_A9396ParTMCod ;
   private boolean[] T002O3_n9396ParTMCod ;
   private String[] T002O9_A396EmprCod ;
   private short[] T002O9_A656ParCod ;
   private boolean[] T002O9_n656ParCod ;
   private String[] T002O10_A396EmprCod ;
   private short[] T002O10_A656ParCod ;
   private boolean[] T002O10_n656ParCod ;
   private short[] T002O2_A656ParCod ;
   private boolean[] T002O2_n656ParCod ;
   private String[] T002O2_A867ParCodNom ;
   private boolean[] T002O2_n867ParCodNom ;
   private String[] T002O2_A8481ParCodEst ;
   private boolean[] T002O2_n8481ParCodEst ;
   private String[] T002O2_A9395ParTMAct ;
   private boolean[] T002O2_n9395ParTMAct ;
   private int[] T002O2_A14212ParTiempo ;
   private boolean[] T002O2_n14212ParTiempo ;
   private String[] T002O2_A10154ParOpCl ;
   private boolean[] T002O2_n10154ParOpCl ;
   private String[] T002O2_A14213ParStki ;
   private boolean[] T002O2_n14213ParStki ;
   private String[] T002O2_A14214ParParcial ;
   private String[] T002O2_A14215ParFinHdr ;
   private String[] T002O2_A396EmprCod ;
   private int[] T002O2_A9396ParTMCod ;
   private boolean[] T002O2_n9396ParTMCod ;
   private String[] T002O14_A9397ParTMDsc ;
   private boolean[] T002O14_n9397ParTMDsc ;
   private String[] T002O15_A396EmprCod ;
   private short[] T002O15_A656ParCod ;
   private boolean[] T002O15_n656ParCod ;
   private String[] T002O15_A3047LOParId ;
   private String[] T002O16_A396EmprCod ;
   private String[] T002O16_A602MaqCod ;
   private java.util.Date[] T002O16_A558HisProFec ;
   private int[] T002O16_A561HisProLin ;
   private String[] T002O17_A396EmprCod ;
   private short[] T002O17_A656ParCod ;
   private boolean[] T002O17_n656ParCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV37ParTMCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV31WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV32TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV35TrnContextAtt ;
}

final  class tcodpar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcodpar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcodpar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcodpar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcodpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002O2", "SELECT ParCod, ParCodNom, ParCodEst, ParTMAct, ParTiempo, ParOpCl, ParStki, ParParcial, ParFinHdr, EmprCod, ParTMCod FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ?  FOR UPDATE OF ParCodNom, ParCodEst, ParTMAct, ParTiempo, ParOpCl, ParStki, ParParcial, ParFinHdr, ParTMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O3", "SELECT ParCod, ParCodNom, ParCodEst, ParTMAct, ParTiempo, ParOpCl, ParStki, ParParcial, ParFinHdr, EmprCod, ParTMCod FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O5", "SELECT TMDsc AS ParTMDsc FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O6", "SELECT /*+ FIRST_ROWS(100) */ TM1.ParCod, T2.EmprNom, TM1.ParCodNom, TM1.ParCodEst, TM1.ParTMAct, T3.TMDsc AS ParTMDsc, TM1.ParTiempo, TM1.ParOpCl, TM1.ParStki, TM1.ParParcial, TM1.ParFinHdr, TM1.EmprCod, TM1.ParTMCod AS ParTMCod FROM ((TXPCODPAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPMTAREA T3 ON T3.EmprCod = TM1.EmprCod AND T3.TMCod = TM1.ParTMCod) WHERE TM1.EmprCod = ? and TM1.ParCod = ? ORDER BY TM1.EmprCod, TM1.ParCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O7", "SELECT TMDsc AS ParTMDsc FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ParCod FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ParCod FROM TXPCODPAR WHERE ( ParCod > ?) and EmprCod = ? ORDER BY EmprCod, ParCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002O10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ParCod FROM TXPCODPAR WHERE ( ParCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, ParCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002O11", "INSERT INTO TXPCODPAR(ParCod, ParCodNom, ParCodEst, ParTMAct, ParTiempo, ParOpCl, ParStki, ParParcial, ParFinHdr, EmprCod, ParTMCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCODPAR")
         ,new UpdateCursor("T002O12", "UPDATE TXPCODPAR SET ParCodNom=?, ParCodEst=?, ParTMAct=?, ParTiempo=?, ParOpCl=?, ParStki=?, ParParcial=?, ParFinHdr=?, ParTMCod=?  WHERE EmprCod = ? AND ParCod = ?", GX_NOMASK, "TXPCODPAR")
         ,new UpdateCursor("T002O13", "DELETE FROM TXPCODPAR  WHERE EmprCod = ? AND ParCod = ?", GX_NOMASK, "TXPCODPAR")
         ,new ForEachCursor("T002O14", "SELECT TMDsc AS ParTMDsc FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O15", "SELECT * FROM (SELECT EmprCod, ParCod, LOParId FROM TXPLOParP WHERE EmprCod = ? AND ParCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002O16", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND ParCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002O17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ParCod FROM TXPCODPAR WHERE EmprCod = ? ORDER BY EmprCod, ParCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 15 :
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               stmt.setString(8, (String)parms[14], 1);
               stmt.setString(9, (String)parms[15], 1);
               stmt.setString(10, (String)parms[16], 3);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[18]).intValue());
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
                  stmt.setString(2, (String)parms[3], 1);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               stmt.setString(7, (String)parms[12], 1);
               stmt.setString(8, (String)parms[13], 1);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[15]).intValue());
               }
               stmt.setString(10, (String)parms[16], 3);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[18]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
               return;
      }
   }

}

