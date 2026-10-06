package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmcompra_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MRCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13718MRCNom = httpContext.GetPar( "MRCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgamrcod1AK0( A396EmprCod, A13718MRCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MRCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13718MRCNom = httpContext.GetPar( "MRCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgamrcod1AK0( A396EmprCod, A13718MRCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"MRCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h9492MRCod = httpContext.GetPar( "h9492MRCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcamrcod1AK1472( A396EmprCod, h9492MRCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"MCOMCOD") == 0 )
      {
         AV32MComCod = GXutil.lval( httpContext.GetPar( "MComCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32MComCod), 10, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32MComCod), "ZZZZZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asamcomcod1AK1471( AV32MComCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"MCOMCOD") == 0 )
      {
         AV32MComCod = GXutil.lval( httpContext.GetPar( "MComCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32MComCod), 10, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32MComCod), "ZZZZZZZZZ9")));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asamcomcod1AK1471( AV32MComCod, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel30"+"_"+"vMCOMSOLPRE") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx30asamcomsolpre1AK1472( Gx_mode, A396EmprCod, A9492MRCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_38( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_39") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_39( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_41") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_41( A396EmprCod, A9492MRCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_rep") == 0 )
      {
         gxnrgridlevel_rep_newrow_invoke( ) ;
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
            AV41EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
            AV32MComCod = GXutil.lval( httpContext.GetPar( "MComCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32MComCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32MComCod), "ZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Compras", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMComExt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_rep_newrow_invoke( )
   {
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A11049MComEst = httpContext.GetPar( "MComEst") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_rep_newrow( ) ;
      /* End function gxnrGridlevel_rep_newrow_invoke */
   }

   public tmcompra_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmcompra_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmcompra_impl.class ));
   }

   public tmcompra_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMComEst = new HTMLChoice();
      cmbMComOri = new HTMLChoice();
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
      if ( cmbMComEst.getItemCount() > 0 )
      {
         A11049MComEst = cmbMComEst.getValidValue(A11049MComEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMComEst.setValue( GXutil.rtrim( A11049MComEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Values", cmbMComEst.ToJavascriptSource(), true);
      }
      if ( cmbMComOri.getItemCount() > 0 )
      {
         A11050MComOri = cmbMComOri.getValidValue(A11050MComOri) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMComOri.setValue( GXutil.rtrim( A11050MComOri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMComOri.getInternalname(), "Values", cmbMComOri.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComCod_Internalname, httpContext.getMessage( "Compra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A11055MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11055MComCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMComCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMCompra.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComExt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComExt_Internalname, httpContext.getMessage( "Nro Externo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComExt_Internalname, GXutil.rtrim( A11045MComExt), GXutil.rtrim( localUtil.format( A11045MComExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComExt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMComExt_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMCompra.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprvnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprvnum_Internalname, httpContext.getMessage( "Proveedor", ""), "", "", lblTextblockprvnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TMCompra.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_prvnum.setProperty("Caption", Combo_prvnum_Caption);
      ucCombo_prvnum.setProperty("Cls", Combo_prvnum_Cls);
      ucCombo_prvnum.setProperty("EmptyItemText", Combo_prvnum_Emptyitemtext);
      ucCombo_prvnum.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
      ucCombo_prvnum.setProperty("DropDownOptionsData", AV43PrvNum_Data);
      ucCombo_prvnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prvnum_Internalname, "COMBO_PRVNUMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNum_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "Attribute", "", "", "", "", edtPrvNum_Visible, edtPrvNum_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMCompra.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMComFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComFch_Internalname, localUtil.format(A11046MComFch, "99/99/99"), localUtil.format( A11046MComFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMComFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMCompra.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMComFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMComFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMCompra.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComSolFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComSolFch_Internalname, httpContext.getMessage( "Fecha Solicitada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMComSolFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComSolFch_Internalname, localUtil.format(A11047MComSolFch, "99/99/99"), localUtil.format( A11047MComSolFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComSolFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMComSolFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMCompra.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMComSolFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMComSolFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMCompra.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtMComEntFch_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComEntFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComEntFch_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMComEntFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComEntFch_Internalname, localUtil.format(A11048MComEntFch, "99/99/99"), localUtil.format( A11048MComEntFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComEntFch_Jsonclick, 0, "AttributeFL", "", "", "", "", edtMComEntFch_Visible, edtMComEntFch_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMCompra.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMComEntFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtMComEntFch_Visible==0)||(edtMComEntFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMCompra.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMComEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMComEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMComEst, cmbMComEst.getInternalname(), GXutil.rtrim( A11049MComEst), 1, cmbMComEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMComEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "", true, (byte)(0), "HLP_TMCompra.htm");
      cmbMComEst.setValue( GXutil.rtrim( A11049MComEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Values", cmbMComEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMComOri.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMComOri.getInternalname(), httpContext.getMessage( "Origen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMComOri, cmbMComOri.getInternalname(), GXutil.rtrim( A11050MComOri), 1, cmbMComOri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMComOri.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TMCompra.htm");
      cmbMComOri.setValue( GXutil.rtrim( A11050MComOri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComOri.getInternalname(), "Values", cmbMComOri.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_rep_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_rep( ) ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMCompra.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMCompra.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMCompra.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV48Pgmname), GXutil.rtrim( localUtil.format( AV48Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMCompra.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_prvnum_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprvnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV46ComboPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboprvnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV46ComboPrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV46ComboPrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprvnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprvnum_Visible, edtavComboprvnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMCompra.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMCompra.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMCompra.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "Attribute", "", "", "", "", edtPrvNom_Visible, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMCompra.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNNom_Internalname, A13719PrvNNom, GXutil.rtrim( localUtil.format( A13719PrvNNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNNom_Jsonclick, 0, "Attribute", "", "", "", "", edtPrvNNom_Visible, edtPrvNNom_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMCompra.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_rep( )
   {
      /*  Grid Control  */
      startgridcontrol65( ) ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1472 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1472 = (short)(1) ;
            scanStart1AK1472( ) ;
            while ( RcdFound1472 != 0 )
            {
               init_level_properties1472( ) ;
               getByPrimaryKey1AK1472( ) ;
               addRow1AK1472( ) ;
               scanNext1AK1472( ) ;
            }
            scanEnd1AK1472( ) ;
            nBlankRcdCount1472 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11049MComEst = A11049MComEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
         standaloneNotModal1AK1472( ) ;
         standaloneModal1AK1472( ) ;
         sMode1472 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow1AK1472( ) ;
            edtMRCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMRNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRNOM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRNom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMRCNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCNOM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRCNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCNom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMComSolCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMSOLCNT_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComSolCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolCnt_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMComSolPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMSOLPRE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComSolPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMComEntCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTCNT_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMComEntCnt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTCNT_"+sGXsfl_65_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Visible), 5, 0), !bGXsfl_65_Refreshing);
            edtMComEntPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTPRE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtMComEntPre_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTPRE_"+sGXsfl_65_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Visible), 5, 0), !bGXsfl_65_Refreshing);
            edtMRStkPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRSTKPRE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1472 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AK1472( ) ;
            }
            sendRow1AK1472( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11049MComEst = B11049MComEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1472 = (short)(5) ;
         nRcdExists_1472 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AK1472( ) ;
            while ( RcdFound1472 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651472( ) ;
               init_level_properties1472( ) ;
               standaloneNotModal1AK1472( ) ;
               getByPrimaryKey1AK1472( ) ;
               standaloneModal1AK1472( ) ;
               addRow1AK1472( ) ;
               scanNext1AK1472( ) ;
            }
            scanEnd1AK1472( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1472 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_651472( ) ;
         initAll1AK1472( ) ;
         init_level_properties1472( ) ;
         B11049MComEst = A11049MComEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
         nRcdExists_1472 = (short)(0) ;
         nIsMod_1472 = (short)(0) ;
         nRcdDeleted_1472 = (short)(0) ;
         nBlankRcdCount1472 = (short)(nBlankRcdUsr1472+nBlankRcdCount1472) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1472 > 0 )
         {
            standaloneNotModal1AK1472( ) ;
            standaloneModal1AK1472( ) ;
            addRow1AK1472( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMRCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1472 = (short)(nBlankRcdCount1472-1) ;
         }
         Gx_mode = sMode1472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11049MComEst = B11049MComEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_repContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_rep", Gridlevel_repContainer, subGridlevel_rep_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_repContainerData", Gridlevel_repContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_repContainerData"+"V", Gridlevel_repContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_repContainerData"+"V"+"\" value='"+Gridlevel_repContainer.GridValuesHidden()+"'/>") ;
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
      e111AK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRVNUM_DATA"), AV43PrvNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11055MComCod = localUtil.ctol( httpContext.cgiGet( "Z11055MComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z11045MComExt = httpContext.cgiGet( "Z11045MComExt") ;
            Z11046MComFch = localUtil.ctod( httpContext.cgiGet( "Z11046MComFch"), 0) ;
            Z11047MComSolFch = localUtil.ctod( httpContext.cgiGet( "Z11047MComSolFch"), 0) ;
            Z11048MComEntFch = localUtil.ctod( httpContext.cgiGet( "Z11048MComEntFch"), 0) ;
            Z11049MComEst = httpContext.cgiGet( "Z11049MComEst") ;
            Z11050MComOri = httpContext.cgiGet( "Z11050MComOri") ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11049MComEst = httpContext.cgiGet( "O11049MComEst") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "N795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N11049MComEst = httpContext.cgiGet( "N11049MComEst") ;
            N11048MComEntFch = localUtil.ctod( httpContext.cgiGet( "N11048MComEntFch"), 0) ;
            AV41EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV32MComCod = localUtil.ctol( httpContext.cgiGet( "vMCOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV37Insert_PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCMRCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39MComSolPre = localUtil.ctond( httpContext.cgiGet( "vMCOMSOLPRE")) ;
            A14270MComLote = httpContext.cgiGet( "MCOMLOTE") ;
            n14270MComLote = false ;
            Combo_prvnum_Objectcall = httpContext.cgiGet( "COMBO_PRVNUM_Objectcall") ;
            Combo_prvnum_Class = httpContext.cgiGet( "COMBO_PRVNUM_Class") ;
            Combo_prvnum_Icontype = httpContext.cgiGet( "COMBO_PRVNUM_Icontype") ;
            Combo_prvnum_Icon = httpContext.cgiGet( "COMBO_PRVNUM_Icon") ;
            Combo_prvnum_Caption = httpContext.cgiGet( "COMBO_PRVNUM_Caption") ;
            Combo_prvnum_Tooltip = httpContext.cgiGet( "COMBO_PRVNUM_Tooltip") ;
            Combo_prvnum_Cls = httpContext.cgiGet( "COMBO_PRVNUM_Cls") ;
            Combo_prvnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRVNUM_Selectedvalue_set") ;
            Combo_prvnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRVNUM_Selectedvalue_get") ;
            Combo_prvnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRVNUM_Selectedtext_set") ;
            Combo_prvnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRVNUM_Selectedtext_get") ;
            Combo_prvnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRVNUM_Gamoauthtoken") ;
            Combo_prvnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRVNUM_Ddointernalname") ;
            Combo_prvnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRVNUM_Titlecontrolalign") ;
            Combo_prvnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRVNUM_Dropdownoptionstype") ;
            Combo_prvnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Enabled")) ;
            Combo_prvnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Visible")) ;
            Combo_prvnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRVNUM_Titlecontrolidtoreplace") ;
            Combo_prvnum_Datalisttype = httpContext.cgiGet( "COMBO_PRVNUM_Datalisttype") ;
            Combo_prvnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Allowmultipleselection")) ;
            Combo_prvnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRVNUM_Datalistfixedvalues") ;
            Combo_prvnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Isgriditem")) ;
            Combo_prvnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Hasdescription")) ;
            Combo_prvnum_Datalistproc = httpContext.cgiGet( "COMBO_PRVNUM_Datalistproc") ;
            Combo_prvnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRVNUM_Datalistprocparametersprefix") ;
            Combo_prvnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRVNUM_Remoteservicesparameters") ;
            Combo_prvnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRVNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prvnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Includeonlyselectedoption")) ;
            Combo_prvnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Includeselectalloption")) ;
            Combo_prvnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Emptyitem")) ;
            Combo_prvnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVNUM_Includeaddnewoption")) ;
            Combo_prvnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRVNUM_Htmltemplate") ;
            Combo_prvnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRVNUM_Multiplevaluestype") ;
            Combo_prvnum_Loadingdata = httpContext.cgiGet( "COMBO_PRVNUM_Loadingdata") ;
            Combo_prvnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRVNUM_Noresultsfound") ;
            Combo_prvnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRVNUM_Emptyitemtext") ;
            Combo_prvnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRVNUM_Onlyselectedvalues") ;
            Combo_prvnum_Selectalltext = httpContext.cgiGet( "COMBO_PRVNUM_Selectalltext") ;
            Combo_prvnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRVNUM_Multiplevaluesseparator") ;
            Combo_prvnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRVNUM_Addnewoptiontext") ;
            Combo_prvnum_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRVNUM_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A11055MComCod = localUtil.ctol( httpContext.cgiGet( edtMComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            A11045MComExt = httpContext.cgiGet( edtMComExt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11045MComExt", A11045MComExt);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A795PrvNum = 0 ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
            else
            {
               A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtMComFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MCOMFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMComFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11046MComFch = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11046MComFch", localUtil.format(A11046MComFch, "99/99/99"));
            }
            else
            {
               A11046MComFch = localUtil.ctod( httpContext.cgiGet( edtMComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11046MComFch", localUtil.format(A11046MComFch, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtMComSolFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MCOMSOLFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMComSolFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11047MComSolFch = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11047MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
            }
            else
            {
               A11047MComSolFch = localUtil.ctod( httpContext.cgiGet( edtMComSolFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11047MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtMComEntFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MCOMENTFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMComEntFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11048MComEntFch = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
            }
            else
            {
               A11048MComEntFch = localUtil.ctod( httpContext.cgiGet( edtMComEntFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
            }
            cmbMComEst.setName( cmbMComEst.getInternalname() );
            cmbMComEst.setValue( httpContext.cgiGet( cmbMComEst.getInternalname()) );
            A11049MComEst = httpContext.cgiGet( cmbMComEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
            cmbMComOri.setName( cmbMComOri.getInternalname() );
            cmbMComOri.setValue( httpContext.cgiGet( cmbMComOri.getInternalname()) );
            A11050MComOri = httpContext.cgiGet( cmbMComOri.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
            AV48Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
            AV46ComboPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboprvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46ComboPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ComboPrvNum), 6, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
            n794PrvNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
            A13719PrvNNom = httpContext.cgiGet( edtPrvNNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMCompra");
            A11050MComOri = httpContext.cgiGet( cmbMComOri.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
            forbiddenHiddens.add("MComOri", GXutil.rtrim( localUtil.format( A11050MComOri, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV48Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV48Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11055MComCod != Z11055MComCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmcompra:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A11055MComCod = GXutil.lval( httpContext.GetPar( "MComCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
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
                  sMode1471 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1471 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1471 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1AK0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
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
                        e111AK2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121AK2 ();
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
         e121AK2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1AK1471( ) ;
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
         disableAttributes1AK1471( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvnum_Enabled), 5, 0), true);
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

   public void confirm_1AK0( )
   {
      beforeValidate1AK1471( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AK1471( ) ;
         }
         else
         {
            checkExtendedTable1AK1471( ) ;
            closeExtendedTableCursors1AK1471( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1471 = Gx_mode ;
         confirm_1AK1472( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1471 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1471 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1AK1472( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1AK1472( ) ;
         if ( ( nRcdExists_1472 != 0 ) || ( nIsMod_1472 != 0 ) )
         {
            getKey1AK1472( ) ;
            if ( ( nRcdExists_1472 == 0 ) && ( nRcdDeleted_1472 == 0 ) )
            {
               if ( RcdFound1472 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AK1472( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AK1472( ) ;
                     closeExtendedTableCursors1AK1472( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MRCOD_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1472 != 0 )
               {
                  if ( nRcdDeleted_1472 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AK1472( ) ;
                     load1AK1472( ) ;
                     beforeValidate1AK1472( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AK1472( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1472 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AK1472( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AK1472( ) ;
                           closeExtendedTableCursors1AK1472( ) ;
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
                  if ( nRcdDeleted_1472 == 0 )
                  {
                     GXCCtl = "MRCOD_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRCod_Internalname, h9492MRCod) ;
         httpContext.changePostValue( edtMRNom_Internalname, GXutil.rtrim( A9493MRNom)) ;
         httpContext.changePostValue( edtMRCNom_Internalname, A13718MRCNom) ;
         httpContext.changePostValue( edtMComSolCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComSolPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComEntCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9492MRCod_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11051MComSolCnt_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11052MComSolPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11053MComEntCnt_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11054MComEntPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14270MComLote_"+sGXsfl_65_idx, GXutil.rtrim( Z14270MComLote)) ;
         httpContext.changePostValue( "nRcdDeleted_1472_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1472_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1472_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11053MComEntCnt_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11054MComEntPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1472 != 0 )
         {
            httpContext.changePostValue( "MRCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRNOM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRCNOM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMSOLCNT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMSOLPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTCNT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTCNT_"+sGXsfl_65_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTPRE_"+sGXsfl_65_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRSTKPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRStkPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AK0( )
   {
   }

   public void e111AK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmcompra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV48Pgmname, (byte)(99), GXv_char2) ;
      tmcompra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmcompra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmcompra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV42ObtenerEmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmcompra_impl.this.AV42ObtenerEmprCod = GXv_char2[0] ;
      tmcompra_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmcompra_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ObtenerEmprCod", AV42ObtenerEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmcompra_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV41EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmcompra_impl.this.AV41EmprCod = GXv_char4[0] ;
      tmcompra_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmcompra_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtPrvNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), true);
      AV46ComboPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46ComboPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ComboPrvNum), 6, 0));
      edtavComboprvnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRVNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV35TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV48Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV49GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GXV1), 8, 0));
         while ( AV49GXV1 <= AV35TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV38TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV35TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV49GXV1));
            if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvNum") == 0 )
            {
               AV37Insert_PrvNum = (int)(GXutil.lval( AV38TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Insert_PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Insert_PrvNum), 6, 0));
               if ( ! (0==AV37Insert_PrvNum) )
               {
                  AV46ComboPrvNum = AV37Insert_PrvNum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV46ComboPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ComboPrvNum), 6, 0));
                  Combo_prvnum_Selectedvalue_set = GXutil.trim( GXutil.str( AV46ComboPrvNum, 6, 0)) ;
                  ucCombo_prvnum.sendProperty(context, "", false, Combo_prvnum_Internalname, "SelectedValue_set", Combo_prvnum_Selectedvalue_set);
                  Combo_prvnum_Enabled = false ;
                  ucCombo_prvnum.sendProperty(context, "", false, Combo_prvnum_Internalname, "Enabled", GXutil.booltostr( Combo_prvnum_Enabled));
               }
            }
            AV49GXV1 = (int)(AV49GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtPrvNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), true);
      edtPrvNNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNNom_Visible), 5, 0), true);
   }

   public void e121AK2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         AV40window.setPosition( 1 );
         AV40window.setWidth( 500 );
         AV40window.setHeight( 400 );
         AV40window.setLeft( 400 );
         AV40window.setTop( 200 );
         AV40window.setAutoresize( 0 );
         AV40window.setUrl( formatLink("app.pmcom00", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11055MComCod,10,0))}, new String[] {"EmprCod","MComCod"})  );
         AV40window.setReturnParms(new Object[] {"A396EmprCod","A11055MComCod",});
         httpContext.newWindow(AV40window);
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV35TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tmcompraww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRVNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV43PrvNum_Data ;
      GXv_char4[0] = AV45ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tmcompraloaddvcombo(remoteHandle, context).execute( "PrvNum", Gx_mode, AV41EmprCod, AV32MComCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmcompra_impl.this.AV45ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV43PrvNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_prvnum_Selectedvalue_set = AV45ComboSelectedValue ;
      ucCombo_prvnum.sendProperty(context, "", false, Combo_prvnum_Internalname, "SelectedValue_set", Combo_prvnum_Selectedvalue_set);
      AV46ComboPrvNum = (int)(GXutil.lval( AV45ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46ComboPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ComboPrvNum), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_prvnum_Enabled = false ;
         ucCombo_prvnum.sendProperty(context, "", false, Combo_prvnum_Internalname, "Enabled", GXutil.booltostr( Combo_prvnum_Enabled));
      }
   }

   public void zm1AK1471( int GX_JID )
   {
      if ( ( GX_JID == 37 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11045MComExt = T01AK6_A11045MComExt[0] ;
            Z11046MComFch = T01AK6_A11046MComFch[0] ;
            Z11047MComSolFch = T01AK6_A11047MComSolFch[0] ;
            Z11048MComEntFch = T01AK6_A11048MComEntFch[0] ;
            Z11049MComEst = T01AK6_A11049MComEst[0] ;
            Z11050MComOri = T01AK6_A11050MComOri[0] ;
            Z795PrvNum = T01AK6_A795PrvNum[0] ;
         }
         else
         {
            Z11045MComExt = A11045MComExt ;
            Z11046MComFch = A11046MComFch ;
            Z11047MComSolFch = A11047MComSolFch ;
            Z11048MComEntFch = A11048MComEntFch ;
            Z11049MComEst = A11049MComEst ;
            Z11050MComOri = A11050MComOri ;
            Z795PrvNum = A795PrvNum ;
         }
      }
      if ( GX_JID == -37 )
      {
         Z11055MComCod = A11055MComCod ;
         Z11045MComExt = A11045MComExt ;
         Z11046MComFch = A11046MComFch ;
         Z11047MComSolFch = A11047MComSolFch ;
         Z11048MComEntFch = A11048MComEntFch ;
         Z11049MComEst = A11049MComEst ;
         Z11050MComOri = A11050MComOri ;
         Z396EmprCod = A396EmprCod ;
         Z795PrvNum = A795PrvNum ;
         Z407EmprNom = A407EmprNom ;
         Z794PrvNom = A794PrvNom ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbMComOri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComOri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComOri.getEnabled(), 5, 0), true);
      AV48Pgmname = "TMCompra" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
      cmbMComOri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComOri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComOri.getEnabled(), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         A396EmprCod = AV41EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV32MComCod) )
      {
         A11055MComCod = AV32MComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      }
      else
      {
         if ( ! ( AV32MComCod == 0 ) )
         {
            A11055MComCod = AV32MComCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         }
      }
      if ( ! (0==AV32MComCod) )
      {
         edtMComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtMComCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
         }
         else
         {
            edtMComCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV32MComCod) )
      {
         edtMComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV37Insert_PrvNum) )
      {
         edtPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrvNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV37Insert_PrvNum) )
      {
         A795PrvNum = AV37Insert_PrvNum ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      else
      {
         if ( (0==AV46ComboPrvNum) )
         {
            A795PrvNum = 0 ;
            n795PrvNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            n795PrvNum = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         else
         {
            if ( ! (0==AV46ComboPrvNum) )
            {
               A795PrvNum = AV46ComboPrvNum ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
         }
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
      if ( isIns( )  && (GXutil.strcmp("", A11049MComEst)==0) && ( Gx_BScreen == 0 ) )
      {
         A11049MComEst = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11050MComOri)==0) && ( Gx_BScreen == 0 ) )
      {
         A11050MComOri = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01AK7 */
         pr_default.execute(5, new Object[] {A396EmprCod});
         A407EmprNom = T01AK7_A407EmprNom[0] ;
         n407EmprNom = T01AK7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(5);
         /* Using cursor T01AK8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01AK8_A794PrvNom[0] ;
         n794PrvNom = T01AK8_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(6);
         A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
         {
            cmbMComEst.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbMComEst.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
         }
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
         {
            edtMComEntFch_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
         }
         else
         {
            edtMComEntFch_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
         }
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
         {
            edtMComEntFch_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Visible), 5, 0), true);
         }
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
         {
            edtMComEntCnt_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Visible), 5, 0), !bGXsfl_65_Refreshing);
         }
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
         {
            edtMComEntPre_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Visible), 5, 0), !bGXsfl_65_Refreshing);
         }
      }
   }

   public void load1AK1471( )
   {
      /* Using cursor T01AK9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1471 = (short)(1) ;
         A407EmprNom = T01AK9_A407EmprNom[0] ;
         n407EmprNom = T01AK9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11045MComExt = T01AK9_A11045MComExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11045MComExt", A11045MComExt);
         A11046MComFch = T01AK9_A11046MComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11046MComFch", localUtil.format(A11046MComFch, "99/99/99"));
         A794PrvNom = T01AK9_A794PrvNom[0] ;
         n794PrvNom = T01AK9_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A11047MComSolFch = T01AK9_A11047MComSolFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11047MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
         A11048MComEntFch = T01AK9_A11048MComEntFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
         A11049MComEst = T01AK9_A11049MComEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
         A11050MComOri = T01AK9_A11050MComOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
         A795PrvNum = T01AK9_A795PrvNum[0] ;
         n795PrvNum = T01AK9_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         zm1AK1471( -37) ;
      }
      pr_default.close(7);
      onLoadActions1AK1471( ) ;
   }

   public void onLoadActions1AK1471( )
   {
      A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(sMode1471, "INS") == 0 ) )
      {
         cmbMComEst.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbMComEst.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( ( GXutil.strcmp(sMode1471, "INS") == 0 ) || ( GXutil.strcmp(sMode1471, "UPD") == 0 ) ) )
      {
         edtMComEntFch_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
      }
      else
      {
         edtMComEntFch_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(sMode1471, "INS") == 0 ) )
      {
         edtMComEntFch_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Visible), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(sMode1471, "INS") == 0 ) )
      {
         edtMComEntCnt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Visible), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(sMode1471, "INS") == 0 ) )
      {
         edtMComEntPre_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Visible), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void checkExtendedTable1AK1471( )
   {
      nIsDirty_1471 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01AK7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01AK7_A407EmprNom[0] ;
      n407EmprNom = T01AK7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01AK8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A795PrvNum) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A794PrvNom = T01AK8_A794PrvNom[0] ;
      n794PrvNom = T01AK8_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      pr_default.close(6);
      nIsDirty_1471 = (short)(1) ;
      A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         cmbMComEst.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbMComEst.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
      {
         edtMComEntFch_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
      }
      else
      {
         edtMComEntFch_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtMComEntFch_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Visible), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtMComEntCnt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Visible), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtMComEntPre_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Visible), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( isUpd( )  && ( GXutil.strcmp(O11049MComEst, A11049MComEst) != 0 ) && ( GXutil.strcmp(O11049MComEst, httpContext.getMessage( "P", "")) == 0 ) && ! ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) || ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "De pendiente, solo puede pasarse a Confirmada o Cancelada", ""), 1, "MCOMEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMComEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && true /* Level */ && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede eliminar repuestos de la compra", ""), 1, "MCOMEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMComEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1AK1471( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_38( String A396EmprCod )
   {
      /* Using cursor T01AK10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01AK10_A407EmprNom[0] ;
      n407EmprNom = T01AK10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_39( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T01AK11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A795PrvNum) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A794PrvNom = T01AK11_A794PrvNom[0] ;
      n794PrvNom = T01AK11_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1AK1471( )
   {
      /* Using cursor T01AK12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1471 = (short)(1) ;
      }
      else
      {
         RcdFound1471 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AK6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1AK1471( 37) ;
         RcdFound1471 = (short)(1) ;
         A11055MComCod = T01AK6_A11055MComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         A11045MComExt = T01AK6_A11045MComExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11045MComExt", A11045MComExt);
         A11046MComFch = T01AK6_A11046MComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11046MComFch", localUtil.format(A11046MComFch, "99/99/99"));
         A11047MComSolFch = T01AK6_A11047MComSolFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11047MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
         A11048MComEntFch = T01AK6_A11048MComEntFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
         A11049MComEst = T01AK6_A11049MComEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
         A11050MComOri = T01AK6_A11050MComOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
         A396EmprCod = T01AK6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T01AK6_A795PrvNum[0] ;
         n795PrvNum = T01AK6_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         O11049MComEst = A11049MComEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
         Z396EmprCod = A396EmprCod ;
         Z11055MComCod = A11055MComCod ;
         sMode1471 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1AK1471( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1471 = (short)(0) ;
            initializeNonKey1AK1471( ) ;
         }
         Gx_mode = sMode1471 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1471 = (short)(0) ;
         initializeNonKey1AK1471( ) ;
         sMode1471 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1471 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1AK1471( ) ;
      if ( RcdFound1471 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1471 = (short)(0) ;
      /* Using cursor T01AK13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01AK13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01AK13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AK13_A11055MComCod[0] < A11055MComCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01AK13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01AK13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AK13_A11055MComCod[0] > A11055MComCod ) ) )
         {
            A396EmprCod = T01AK13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11055MComCod = T01AK13_A11055MComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            RcdFound1471 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1471 = (short)(0) ;
      /* Using cursor T01AK14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01AK14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01AK14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AK14_A11055MComCod[0] > A11055MComCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01AK14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01AK14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AK14_A11055MComCod[0] < A11055MComCod ) ) )
         {
            A396EmprCod = T01AK14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11055MComCod = T01AK14_A11055MComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            RcdFound1471 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AK1471( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMComExt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AK1471( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1471 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11055MComCod != Z11055MComCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11055MComCod = Z11055MComCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMComExt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1AK1471( ) ;
               GX_FocusControl = edtMComExt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11055MComCod != Z11055MComCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtMComExt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AK1471( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtMComExt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1AK1471( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11055MComCod != Z11055MComCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11055MComCod = Z11055MComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMComExt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1AK1471( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AK5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepCo"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z11045MComExt, T01AK5_A11045MComExt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z11046MComFch), GXutil.resetTime(T01AK5_A11046MComFch[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z11047MComSolFch), GXutil.resetTime(T01AK5_A11047MComSolFch[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z11048MComEntFch), GXutil.resetTime(T01AK5_A11048MComEntFch[0])) ) || ( GXutil.strcmp(Z11049MComEst, T01AK5_A11049MComEst[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11050MComOri, T01AK5_A11050MComOri[0]) != 0 ) || ( Z795PrvNum != T01AK5_A795PrvNum[0] ) )
         {
            if ( GXutil.strcmp(Z11045MComExt, T01AK5_A11045MComExt[0]) != 0 )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComExt");
               GXutil.writeLogRaw("Old: ",Z11045MComExt);
               GXutil.writeLogRaw("Current: ",T01AK5_A11045MComExt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11046MComFch), GXutil.resetTime(T01AK5_A11046MComFch[0])) ) )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComFch");
               GXutil.writeLogRaw("Old: ",Z11046MComFch);
               GXutil.writeLogRaw("Current: ",T01AK5_A11046MComFch[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11047MComSolFch), GXutil.resetTime(T01AK5_A11047MComSolFch[0])) ) )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComSolFch");
               GXutil.writeLogRaw("Old: ",Z11047MComSolFch);
               GXutil.writeLogRaw("Current: ",T01AK5_A11047MComSolFch[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11048MComEntFch), GXutil.resetTime(T01AK5_A11048MComEntFch[0])) ) )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComEntFch");
               GXutil.writeLogRaw("Old: ",Z11048MComEntFch);
               GXutil.writeLogRaw("Current: ",T01AK5_A11048MComEntFch[0]);
            }
            if ( GXutil.strcmp(Z11049MComEst, T01AK5_A11049MComEst[0]) != 0 )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComEst");
               GXutil.writeLogRaw("Old: ",Z11049MComEst);
               GXutil.writeLogRaw("Current: ",T01AK5_A11049MComEst[0]);
            }
            if ( GXutil.strcmp(Z11050MComOri, T01AK5_A11050MComOri[0]) != 0 )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComOri");
               GXutil.writeLogRaw("Old: ",Z11050MComOri);
               GXutil.writeLogRaw("Current: ",T01AK5_A11050MComOri[0]);
            }
            if ( Z795PrvNum != T01AK5_A795PrvNum[0] )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T01AK5_A795PrvNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRepCo"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AK1471( )
   {
      beforeValidate1AK1471( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AK1471( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AK1471( 0) ;
         checkOptimisticConcurrency1AK1471( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AK1471( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AK1471( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AK15 */
                  pr_default.execute(13, new Object[] {Long.valueOf(A11055MComCod), A11045MComExt, A11046MComFch, A11047MComSolFch, A11048MComEntFch, A11049MComEst, A11050MComOri, A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepCo");
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
                        processLevel1AK1471( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AK0( ) ;
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
            load1AK1471( ) ;
         }
         endLevel1AK1471( ) ;
      }
      closeExtendedTableCursors1AK1471( ) ;
   }

   public void update1AK1471( )
   {
      beforeValidate1AK1471( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AK1471( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AK1471( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AK1471( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AK1471( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AK16 */
                  pr_default.execute(14, new Object[] {A11045MComExt, A11046MComFch, A11047MComSolFch, A11048MComEntFch, A11049MComEst, A11050MComOri, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum), A396EmprCod, Long.valueOf(A11055MComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepCo");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepCo"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AK1471( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AK1471( ) ;
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
         endLevel1AK1471( ) ;
      }
      closeExtendedTableCursors1AK1471( ) ;
   }

   public void deferredUpdate1AK1471( )
   {
   }

   public void delete( )
   {
      beforeValidate1AK1471( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AK1471( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AK1471( ) ;
         afterConfirm1AK1471( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AK1471( ) ;
            if ( AnyError == 0 )
            {
               scanStart1AK1472( ) ;
               while ( RcdFound1472 != 0 )
               {
                  getByPrimaryKey1AK1472( ) ;
                  delete1AK1472( ) ;
                  scanNext1AK1472( ) ;
               }
               scanEnd1AK1472( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AK17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepCo");
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
      sMode1471 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AK1471( ) ;
      Gx_mode = sMode1471 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AK1471( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isUpd( )  && ( GXutil.strcmp(O11049MComEst, A11049MComEst) != 0 ) && ( GXutil.strcmp(O11049MComEst, httpContext.getMessage( "P", "")) == 0 ) && ! ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) || ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "De pendiente, solo puede pasarse a Confirmada o Cancelada", ""), 1, "MCOMEST");
            AnyError = (short)(1) ;
            GX_FocusControl = cmbMComEst.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01AK18 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         A407EmprNom = T01AK18_A407EmprNom[0] ;
         n407EmprNom = T01AK18_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(16);
         /* Using cursor T01AK19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01AK19_A794PrvNom[0] ;
         n794PrvNom = T01AK19_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(17);
         A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
         {
            cmbMComEst.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbMComEst.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
         }
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
         {
            edtMComEntFch_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
         }
         else
         {
            edtMComEntFch_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
         }
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
         {
            edtMComEntFch_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Visible), 5, 0), true);
         }
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
         {
            edtMComEntCnt_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Visible), 5, 0), !bGXsfl_65_Refreshing);
         }
         if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
         {
            edtMComEntPre_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Visible), 5, 0), !bGXsfl_65_Refreshing);
         }
      }
   }

   public void processNestedLevel1AK1472( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1AK1472( ) ;
         if ( ( nRcdExists_1472 != 0 ) || ( nIsMod_1472 != 0 ) )
         {
            standaloneNotModal1AK1472( ) ;
            getKey1AK1472( ) ;
            if ( ( nRcdExists_1472 == 0 ) && ( nRcdDeleted_1472 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AK1472( ) ;
            }
            else
            {
               if ( RcdFound1472 != 0 )
               {
                  if ( ( nRcdDeleted_1472 != 0 ) && ( nRcdExists_1472 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AK1472( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1472 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AK1472( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1472 == 0 )
                  {
                     GXCCtl = "MRCOD_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRCod_Internalname, h9492MRCod) ;
         httpContext.changePostValue( edtMRNom_Internalname, GXutil.rtrim( A9493MRNom)) ;
         httpContext.changePostValue( edtMRCNom_Internalname, A13718MRCNom) ;
         httpContext.changePostValue( edtMComSolCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComSolPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComEntCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9492MRCod_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11051MComSolCnt_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11052MComSolPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11053MComEntCnt_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11054MComEntPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14270MComLote_"+sGXsfl_65_idx, GXutil.rtrim( Z14270MComLote)) ;
         httpContext.changePostValue( "nRcdDeleted_1472_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1472_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1472_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11053MComEntCnt_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11054MComEntPre_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1472 != 0 )
         {
            httpContext.changePostValue( "MRCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRNOM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRCNOM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMSOLCNT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMSOLPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTCNT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTCNT_"+sGXsfl_65_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTPRE_"+sGXsfl_65_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRSTKPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRStkPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AK1472( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1472 = (short)(0) ;
      nIsMod_1472 = (short)(0) ;
      nRcdDeleted_1472 = (short)(0) ;
   }

   public void processLevel1AK1471( )
   {
      /* Save parent mode. */
      sMode1471 = Gx_mode ;
      processNestedLevel1AK1472( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1471 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AK1471( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AK1471( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmcompra");
         if ( AnyError == 0 )
         {
            confirmValues1AK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmcompra");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AK1471( )
   {
      /* Scan By routine */
      /* Using cursor T01AK20 */
      pr_default.execute(18);
      RcdFound1471 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1471 = (short)(1) ;
         A396EmprCod = T01AK20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11055MComCod = T01AK20_A11055MComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AK1471( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1471 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1471 = (short)(1) ;
         A396EmprCod = T01AK20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11055MComCod = T01AK20_A11055MComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      }
   }

   public void scanEnd1AK1471( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1AK1471( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && ( AV32MComCod == 0 ) )
      {
         GXt_int10 = (int)(A11055MComCod) ;
         GXv_int11[0] = GXt_int10 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTCOM", ""), ""), GXv_int11) ;
         tmcompra_impl.this.GXt_int10 = GXv_int11[0] ;
         A11055MComCod = GXt_int10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      }
   }

   public void beforeInsert1AK1471( )
   {
      /* Before Insert Rules */
      if ( isIns( )  && (0==A11055MComCod) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Requiere Nro Compra", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeUpdate1AK1471( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AK1471( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AK1471( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AK1471( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AK1471( )
   {
      edtMComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
      edtMComExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComExt_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtMComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComFch_Enabled), 5, 0), true);
      edtMComSolFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolFch_Enabled), 5, 0), true);
      edtMComEntFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
      cmbMComEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
      cmbMComOri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComOri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComOri.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboprvnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvnum_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtPrvNNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNNom_Enabled), 5, 0), true);
   }

   public void zm1AK1472( int GX_JID )
   {
      if ( ( GX_JID == 40 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11051MComSolCnt = T01AK3_A11051MComSolCnt[0] ;
            Z11052MComSolPre = T01AK3_A11052MComSolPre[0] ;
            Z11053MComEntCnt = T01AK3_A11053MComEntCnt[0] ;
            Z11054MComEntPre = T01AK3_A11054MComEntPre[0] ;
            Z14270MComLote = T01AK3_A14270MComLote[0] ;
         }
         else
         {
            Z11051MComSolCnt = A11051MComSolCnt ;
            Z11052MComSolPre = A11052MComSolPre ;
            Z11053MComEntCnt = A11053MComEntCnt ;
            Z11054MComEntPre = A11054MComEntPre ;
            Z14270MComLote = A14270MComLote ;
         }
      }
      if ( GX_JID == -40 )
      {
         Z11055MComCod = A11055MComCod ;
         Z11051MComSolCnt = A11051MComSolCnt ;
         Z11052MComSolPre = A11052MComSolPre ;
         Z11053MComEntCnt = A11053MComEntCnt ;
         Z11054MComEntPre = A11054MComEntPre ;
         Z14270MComLote = A14270MComLote ;
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z9493MRNom = A9493MRNom ;
         Z9499MRStkPre = A9499MRStkPre ;
      }
   }

   public void standaloneNotModal1AK1472( )
   {
      edtMRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRNom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMRCNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCNom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtMComEntCnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtMComEntCnt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtMComEntPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtMComEntPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void standaloneModal1AK1472( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMRCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtMRCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load1AK1472( )
   {
      /* Using cursor T01AK21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1472 = (short)(1) ;
         A9493MRNom = T01AK21_A9493MRNom[0] ;
         n9493MRNom = T01AK21_n9493MRNom[0] ;
         A11051MComSolCnt = T01AK21_A11051MComSolCnt[0] ;
         A11052MComSolPre = T01AK21_A11052MComSolPre[0] ;
         A11053MComEntCnt = T01AK21_A11053MComEntCnt[0] ;
         A11054MComEntPre = T01AK21_A11054MComEntPre[0] ;
         A9499MRStkPre = T01AK21_A9499MRStkPre[0] ;
         n9499MRStkPre = T01AK21_n9499MRStkPre[0] ;
         A14270MComLote = T01AK21_A14270MComLote[0] ;
         n14270MComLote = T01AK21_n14270MComLote[0] ;
         zm1AK1472( -40) ;
      }
      pr_default.close(19);
      onLoadActions1AK1472( ) ;
   }

   public void onLoadActions1AK1472( )
   {
      A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A9492MRCod) )
      {
         GXt_decimal12 = AV39MComSolPre ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A9492MRCod ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pprc77(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_decimal13) ;
         tmcompra_impl.this.A396EmprCod = GXv_char4[0] ;
         tmcompra_impl.this.A9492MRCod = GXv_int11[0] ;
         tmcompra_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV39MComSolPre = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39MComSolPre", GXutil.ltrimstr( AV39MComSolPre, 12, 3));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A11052MComSolPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A11052MComSolPre = AV39MComSolPre ;
      }
      /* Using cursor T01AK22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      h9492MRCod = "" ;
      while ( (pr_default.getStatus(20) != 101) )
      {
         h9492MRCod = T01AK22_A13718MRCNom[0] ;
         if (true) break;
      }
      pr_default.close(20);
      httpContext.ajax_rsp_assign_attri("", false, "h9492MRCod", h9492MRCod);
   }

   public void checkExtendedTable1AK1472( )
   {
      nIsDirty_1472 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1AK1472( ) ;
      if ( (GXutil.strcmp("", h9492MRCod)==0) )
      {
         nIsDirty_1472 = (short)(1) ;
         A9492MRCod = 0 ;
      }
      else
      {
         nIsDirty_1472 = (short)(1) ;
         A13718MRCNom = h9492MRCod ;
         /* Using cursor T01AK23 */
         pr_default.execute(21, new Object[] {A13718MRCNom, A396EmprCod});
         A396EmprCod = T01AK23_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01AK23_A9492MRCod[0] ;
         A9492MRCod = T01AK23_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(21) == 101) ) )
         {
            pr_default.readNext(21);
            if ( ! ( (pr_default.getStatus(21) == 101) ) )
            {
               GXCCtl = "MRCOD_" + sGXsfl_65_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(21);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9492MRCod", h9492MRCod);
      if ( (GXutil.strcmp("", h9492MRCod)==0) )
      {
         nIsDirty_1472 = (short)(1) ;
         A9492MRCod = 0 ;
      }
      else
      {
         nIsDirty_1472 = (short)(1) ;
         A13718MRCNom = h9492MRCod ;
         /* Using cursor T01AK24 */
         pr_default.execute(22, new Object[] {A13718MRCNom, A396EmprCod});
         A9492MRCod = T01AK24_A9492MRCod[0] ;
         A9492MRCod = T01AK24_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(22) == 101) ) )
         {
            pr_default.readNext(22);
            if ( ! ( (pr_default.getStatus(22) == 101) ) )
            {
               GXCCtl = "MRCOD_" + sGXsfl_65_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(22);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9492MRCod", h9492MRCod);
      /* Using cursor T01AK4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MRCOD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9493MRNom = T01AK4_A9493MRNom[0] ;
      n9493MRNom = T01AK4_n9493MRNom[0] ;
      A9499MRStkPre = T01AK4_A9499MRStkPre[0] ;
      n9499MRStkPre = T01AK4_n9499MRStkPre[0] ;
      pr_default.close(2);
      nIsDirty_1472 = (short)(1) ;
      A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A9492MRCod) )
      {
         GXt_decimal12 = AV39MComSolPre ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A9492MRCod ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pprc77(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_decimal13) ;
         tmcompra_impl.this.A396EmprCod = GXv_char4[0] ;
         tmcompra_impl.this.A9492MRCod = GXv_int11[0] ;
         tmcompra_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV39MComSolPre = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39MComSolPre", GXutil.ltrimstr( AV39MComSolPre, 12, 3));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A11052MComSolPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1472 = (short)(1) ;
         A11052MComSolPre = AV39MComSolPre ;
      }
   }

   public void closeExtendedTableCursors1AK1472( )
   {
      pr_default.close(2);
   }

   public void enableDisable1AK1472( )
   {
   }

   public void gxload_41( String A396EmprCod ,
                          int A9492MRCod )
   {
      /* Using cursor T01AK25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         GXCCtl = "MRCOD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9493MRNom = T01AK25_A9493MRNom[0] ;
      n9493MRNom = T01AK25_n9493MRNom[0] ;
      A9499MRStkPre = T01AK25_A9499MRStkPre[0] ;
      n9499MRStkPre = T01AK25_n9499MRStkPre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9493MRNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void getKey1AK1472( )
   {
      if ( (GXutil.strcmp("", h9492MRCod)==0) )
      {
         A9492MRCod = 0 ;
      }
      else
      {
         A13718MRCNom = h9492MRCod ;
         /* Using cursor T01AK26 */
         pr_default.execute(24, new Object[] {A13718MRCNom, A396EmprCod});
         A396EmprCod = T01AK26_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01AK26_A9492MRCod[0] ;
         A9492MRCod = T01AK26_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(24) == 101) ) )
         {
            pr_default.readNext(24);
            if ( ! ( (pr_default.getStatus(24) == 101) ) )
            {
               GXCCtl = "MRCOD_" + sGXsfl_65_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(24);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9492MRCod", h9492MRCod);
      /* Using cursor T01AK27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1472 = (short)(1) ;
      }
      else
      {
         RcdFound1472 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey1AK1472( )
   {
      /* Using cursor T01AK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1AK1472( 40) ;
         RcdFound1472 = (short)(1) ;
         initializeNonKey1AK1472( ) ;
         A11051MComSolCnt = T01AK3_A11051MComSolCnt[0] ;
         A11052MComSolPre = T01AK3_A11052MComSolPre[0] ;
         A11053MComEntCnt = T01AK3_A11053MComEntCnt[0] ;
         A11054MComEntPre = T01AK3_A11054MComEntPre[0] ;
         A14270MComLote = T01AK3_A14270MComLote[0] ;
         n14270MComLote = T01AK3_n14270MComLote[0] ;
         A9492MRCod = T01AK3_A9492MRCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11055MComCod = A11055MComCod ;
         Z9492MRCod = A9492MRCod ;
         sMode1472 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1AK1472( ) ;
         Gx_mode = sMode1472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1472 = (short)(0) ;
         initializeNonKey1AK1472( ) ;
         sMode1472 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AK1472( ) ;
         Gx_mode = sMode1472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AK1472( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AK1472( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h9492MRCod)==0) )
         {
            A9492MRCod = 0 ;
         }
         else
         {
            A13718MRCNom = h9492MRCod ;
            /* Using cursor T01AK28 */
            pr_default.execute(26, new Object[] {A13718MRCNom, A396EmprCod});
            A396EmprCod = T01AK28_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9492MRCod = T01AK28_A9492MRCod[0] ;
            A9492MRCod = T01AK28_A9492MRCod[0] ;
            if ( ! ( (pr_default.getStatus(26) == 101) ) )
            {
               pr_default.readNext(26);
               if ( ! ( (pr_default.getStatus(26) == 101) ) )
               {
                  GXCCtl = "MRCOD_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(26);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h9492MRCod", h9492MRCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01AK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11051MComSolCnt, T01AK2_A11051MComSolCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z11052MComSolPre, T01AK2_A11052MComSolPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z11053MComEntCnt, T01AK2_A11053MComEntCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z11054MComEntPre, T01AK2_A11054MComEntPre[0]) != 0 ) || ( GXutil.strcmp(Z14270MComLote, T01AK2_A14270MComLote[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11051MComSolCnt, T01AK2_A11051MComSolCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComSolCnt");
               GXutil.writeLogRaw("Old: ",Z11051MComSolCnt);
               GXutil.writeLogRaw("Current: ",T01AK2_A11051MComSolCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z11052MComSolPre, T01AK2_A11052MComSolPre[0]) != 0 )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComSolPre");
               GXutil.writeLogRaw("Old: ",Z11052MComSolPre);
               GXutil.writeLogRaw("Current: ",T01AK2_A11052MComSolPre[0]);
            }
            if ( DecimalUtil.compareTo(Z11053MComEntCnt, T01AK2_A11053MComEntCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComEntCnt");
               GXutil.writeLogRaw("Old: ",Z11053MComEntCnt);
               GXutil.writeLogRaw("Current: ",T01AK2_A11053MComEntCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z11054MComEntPre, T01AK2_A11054MComEntPre[0]) != 0 )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComEntPre");
               GXutil.writeLogRaw("Old: ",Z11054MComEntPre);
               GXutil.writeLogRaw("Current: ",T01AK2_A11054MComEntPre[0]);
            }
            if ( GXutil.strcmp(Z14270MComLote, T01AK2_A14270MComLote[0]) != 0 )
            {
               GXutil.writeLogln("tmcompra:[seudo value changed for attri]"+"MComLote");
               GXutil.writeLogRaw("Old: ",Z14270MComLote);
               GXutil.writeLogRaw("Current: ",T01AK2_A14270MComLote[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRepC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AK1472( )
   {
      beforeValidate1AK1472( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AK1472( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AK1472( 0) ;
         checkOptimisticConcurrency1AK1472( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AK1472( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AK1472( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AK29 */
                  pr_default.execute(27, new Object[] {Long.valueOf(A11055MComCod), A11051MComSolCnt, A11052MComSolPre, A11053MComEntCnt, A11054MComEntPre, Boolean.valueOf(n14270MComLote), A14270MComLote, A396EmprCod, Integer.valueOf(A9492MRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepC1");
                  if ( (pr_default.getStatus(27) == 1) )
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
            load1AK1472( ) ;
         }
         endLevel1AK1472( ) ;
      }
      closeExtendedTableCursors1AK1472( ) ;
   }

   public void update1AK1472( )
   {
      beforeValidate1AK1472( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AK1472( ) ;
      }
      if ( ( nIsMod_1472 != 0 ) || ( nIsDirty_1472 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AK1472( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AK1472( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AK1472( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AK30 */
                     pr_default.execute(28, new Object[] {A11051MComSolCnt, A11052MComSolPre, A11053MComEntCnt, A11054MComEntPre, Boolean.valueOf(n14270MComLote), A14270MComLote, A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepC1");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepC1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AK1472( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AK1472( ) ;
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
            endLevel1AK1472( ) ;
         }
      }
      closeExtendedTableCursors1AK1472( ) ;
   }

   public void deferredUpdate1AK1472( )
   {
   }

   public void delete1AK1472( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AK1472( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AK1472( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AK1472( ) ;
         afterConfirm1AK1472( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AK1472( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AK31 */
               pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepC1");
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
      sMode1472 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AK1472( ) ;
      Gx_mode = sMode1472 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AK1472( )
   {
      standaloneModal1AK1472( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AK32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         A9493MRNom = T01AK32_A9493MRNom[0] ;
         n9493MRNom = T01AK32_n9493MRNom[0] ;
         A9499MRStkPre = T01AK32_A9499MRStkPre[0] ;
         n9499MRStkPre = T01AK32_n9499MRStkPre[0] ;
         pr_default.close(30);
         A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A9492MRCod) )
         {
            GXt_decimal12 = AV39MComSolPre ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int11[0] = A9492MRCod ;
            GXv_decimal13[0] = GXt_decimal12 ;
            new app.pprc77(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_decimal13) ;
            tmcompra_impl.this.A396EmprCod = GXv_char4[0] ;
            tmcompra_impl.this.A9492MRCod = GXv_int11[0] ;
            tmcompra_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            AV39MComSolPre = GXt_decimal12 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39MComSolPre", GXutil.ltrimstr( AV39MComSolPre, 12, 3));
         }
      }
   }

   public void endLevel1AK1472( )
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

   public void scanStart1AK1472( )
   {
      /* Scan By routine */
      /* Using cursor T01AK33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      RcdFound1472 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1472 = (short)(1) ;
         A9492MRCod = T01AK33_A9492MRCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AK1472( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1472 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1472 = (short)(1) ;
         A9492MRCod = T01AK33_A9492MRCod[0] ;
      }
   }

   public void scanEnd1AK1472( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1AK1472( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AK1472( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AK1472( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AK1472( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AK1472( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AK1472( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AK1472( )
   {
      edtMRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRNom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMRCNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCNom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMComSolCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolCnt_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMComSolPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMComEntCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMComEntPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMRStkPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes1AK1472( )
   {
   }

   public void send_integrity_lvl_hashes1AK1471( )
   {
   }

   public void subsflControlProps_651472( )
   {
      edtMRCod_Internalname = "MRCOD_"+sGXsfl_65_idx ;
      edtMRNom_Internalname = "MRNOM_"+sGXsfl_65_idx ;
      edtMRCNom_Internalname = "MRCNOM_"+sGXsfl_65_idx ;
      edtMComSolCnt_Internalname = "MCOMSOLCNT_"+sGXsfl_65_idx ;
      edtMComSolPre_Internalname = "MCOMSOLPRE_"+sGXsfl_65_idx ;
      edtMComEntCnt_Internalname = "MCOMENTCNT_"+sGXsfl_65_idx ;
      edtMComEntPre_Internalname = "MCOMENTPRE_"+sGXsfl_65_idx ;
      edtMRStkPre_Internalname = "MRSTKPRE_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_651472( )
   {
      edtMRCod_Internalname = "MRCOD_"+sGXsfl_65_fel_idx ;
      edtMRNom_Internalname = "MRNOM_"+sGXsfl_65_fel_idx ;
      edtMRCNom_Internalname = "MRCNOM_"+sGXsfl_65_fel_idx ;
      edtMComSolCnt_Internalname = "MCOMSOLCNT_"+sGXsfl_65_fel_idx ;
      edtMComSolPre_Internalname = "MCOMSOLPRE_"+sGXsfl_65_fel_idx ;
      edtMComEntCnt_Internalname = "MCOMENTCNT_"+sGXsfl_65_fel_idx ;
      edtMComEntPre_Internalname = "MCOMENTPRE_"+sGXsfl_65_fel_idx ;
      edtMRStkPre_Internalname = "MRSTKPRE_"+sGXsfl_65_fel_idx ;
   }

   public void addRow1AK1472( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651472( ) ;
      sendRow1AK1472( ) ;
   }

   public void sendRow1AK1472( )
   {
      Gridlevel_repRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_rep_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_rep_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_rep_Class, "") != 0 )
         {
            subGridlevel_rep_Linesclass = subGridlevel_rep_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_rep_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_rep_Backstyle = (byte)(0) ;
         subGridlevel_rep_Backcolor = subGridlevel_rep_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_rep_Class, "") != 0 )
         {
            subGridlevel_rep_Linesclass = subGridlevel_rep_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_rep_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_rep_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_rep_Class, "") != 0 )
         {
            subGridlevel_rep_Linesclass = subGridlevel_rep_Class+"Odd" ;
         }
         subGridlevel_rep_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_rep_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_rep_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
         {
            subGridlevel_rep_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_rep_Class, "") != 0 )
            {
               subGridlevel_rep_Linesclass = subGridlevel_rep_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_rep_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_rep_Class, "") != 0 )
            {
               subGridlevel_rep_Linesclass = subGridlevel_rep_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1472_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRCod_Internalname,h9492MRCod,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRNom_Internalname,GXutil.rtrim( A9493MRNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMRNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRCNom_Internalname,A13718MRCNom,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRCNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMRCNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1472_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComSolCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMComSolCnt_Enabled!=0) ? localUtil.format( A11051MComSolCnt, "ZZZZZ9.99") : localUtil.format( A11051MComSolCnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComSolCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMComSolCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1472_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComSolPre_Internalname,GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMComSolPre_Enabled!=0) ? localUtil.format( A11052MComSolPre, "ZZZZZZZ9.999") : localUtil.format( A11052MComSolPre, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComSolPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMComSolPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1472_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComEntCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11053MComEntCnt, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComEntCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtMComEntCnt_Visible),Integer.valueOf(edtMComEntCnt_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1472_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComEntPre_Internalname,GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11054MComEntPre, "ZZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComEntPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtMComEntPre_Visible),Integer.valueOf(edtMComEntPre_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRStkPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMRStkPre_Enabled!=0) ? localUtil.format( A9499MRStkPre, "ZZZZZZ9.999") : localUtil.format( A9499MRStkPre, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRStkPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRStkPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_repRow);
      send_integrity_lvl_hashes1AK1472( ) ;
      GXCCtl = "GXHCMRCOD_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9492MRCod_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11051MComSolCnt_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11052MComSolPre_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11053MComEntCnt_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11054MComEntPre_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14270MComLote_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14270MComLote));
      GXCCtl = "nRcdDeleted_1472_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1472_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1472_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N11053MComEntCnt_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N11054MComEntPre_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_65_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV35TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV35TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV41EmprCod));
      GXCCtl = "vMCOMCOD_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRNOM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRCNOM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMSOLCNT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMSOLPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMENTCNT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMENTCNT_"+sGXsfl_65_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMENTPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMENTPRE_"+sGXsfl_65_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRSTKPRE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRStkPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_repContainer.AddRow(Gridlevel_repRow);
   }

   public void readRow1AK1472( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651472( ) ;
      edtMRCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRNOM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRCNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCNOM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMComSolCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMSOLCNT_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMComSolPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMSOLPRE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMComEntCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTCNT_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMComEntCnt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTCNT_"+sGXsfl_65_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMComEntPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTPRE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMComEntPre_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTPRE_"+sGXsfl_65_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRStkPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRSTKPRE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h9492MRCod = httpContext.cgiGet( edtMRCod_Internalname) ;
      A9493MRNom = httpContext.cgiGet( edtMRNom_Internalname) ;
      n9493MRNom = false ;
      A13718MRCNom = httpContext.cgiGet( edtMRCNom_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComSolCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComSolCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MCOMSOLCNT_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMComSolCnt_Internalname ;
         wbErr = true ;
         A11051MComSolCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A11051MComSolCnt = localUtil.ctond( httpContext.cgiGet( edtMComSolCnt_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComSolPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComSolPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "MCOMSOLPRE_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMComSolPre_Internalname ;
         wbErr = true ;
         A11052MComSolPre = DecimalUtil.ZERO ;
      }
      else
      {
         A11052MComSolPre = localUtil.ctond( httpContext.cgiGet( edtMComSolPre_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MCOMENTCNT_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMComEntCnt_Internalname ;
         wbErr = true ;
         A11053MComEntCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A11053MComEntCnt = localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComEntPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComEntPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "MCOMENTPRE_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMComEntPre_Internalname ;
         wbErr = true ;
         A11054MComEntPre = DecimalUtil.ZERO ;
      }
      else
      {
         A11054MComEntPre = localUtil.ctond( httpContext.cgiGet( edtMComEntPre_Internalname)) ;
      }
      A9499MRStkPre = localUtil.ctond( httpContext.cgiGet( edtMRStkPre_Internalname)) ;
      n9499MRStkPre = false ;
      GXCCtl = "GXHCMRCOD_" + sGXsfl_65_idx ;
      A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9492MRCod_" + sGXsfl_65_idx ;
      Z9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11051MComSolCnt_" + sGXsfl_65_idx ;
      Z11051MComSolCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11052MComSolPre_" + sGXsfl_65_idx ;
      Z11052MComSolPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11053MComEntCnt_" + sGXsfl_65_idx ;
      Z11053MComEntCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11054MComEntPre_" + sGXsfl_65_idx ;
      Z11054MComEntPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14270MComLote_" + sGXsfl_65_idx ;
      Z14270MComLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14270MComLote_" + sGXsfl_65_idx ;
      A14270MComLote = httpContext.cgiGet( GXCCtl) ;
      n14270MComLote = false ;
      GXCCtl = "nRcdDeleted_1472_" + sGXsfl_65_idx ;
      nRcdDeleted_1472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1472_" + sGXsfl_65_idx ;
      nRcdExists_1472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1472_" + sGXsfl_65_idx ;
      nIsMod_1472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N11053MComEntCnt_" + sGXsfl_65_idx ;
      N11053MComEntCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N11054MComEntPre_" + sGXsfl_65_idx ;
      N11054MComEntPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
   }

   public void assign_properties_default( )
   {
      defedtMComEntPre_Enabled = edtMComEntPre_Enabled ;
      defedtMComEntCnt_Enabled = edtMComEntCnt_Enabled ;
      defedtMRCNom_Enabled = edtMRCNom_Enabled ;
      defedtMRNom_Enabled = edtMRNom_Enabled ;
      defedtMRCod_Enabled = edtMRCod_Enabled ;
   }

   public void confirmValues1AK0( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651472( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651472( ) ;
         httpContext.changePostValue( "Z9492MRCod_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z9492MRCod_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9492MRCod_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11051MComSolCnt_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11051MComSolCnt_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11051MComSolCnt_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11052MComSolPre_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11052MComSolPre_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11052MComSolPre_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11053MComEntCnt_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11053MComEntCnt_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11053MComEntCnt_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11054MComEntPre_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11054MComEntPre_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11054MComEntPre_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z14270MComLote_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z14270MComLote_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14270MComLote_"+sGXsfl_65_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmcompra", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV32MComCod,10,0))}, new String[] {"Gx_mode","EmprCod","MComCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMCompra");
      forbiddenHiddens.add("MComOri", GXutil.rtrim( localUtil.format( A11050MComOri, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV48Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmcompra:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11055MComCod", GXutil.ltrim( localUtil.ntoc( Z11055MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11045MComExt", GXutil.rtrim( Z11045MComExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11046MComFch", localUtil.dtoc( Z11046MComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11047MComSolFch", localUtil.dtoc( Z11047MComSolFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11048MComEntFch", localUtil.dtoc( Z11048MComEntFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11049MComEst", GXutil.rtrim( Z11049MComEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11050MComOri", GXutil.rtrim( Z11050MComOri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11049MComEst", GXutil.rtrim( O11049MComEst));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N11049MComEst", GXutil.rtrim( A11049MComEst));
      app.GxWebStd.gx_hidden_field( httpContext, "N11048MComEntFch", localUtil.dtoc( A11048MComEntFch, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRVNUM_DATA", AV43PrvNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRVNUM_DATA", AV43PrvNum_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV35TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV35TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV35TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV41EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMCOMCOD", GXutil.ltrim( localUtil.ntoc( AV32MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32MComCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRVNUM", GXutil.ltrim( localUtil.ntoc( AV37Insert_PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCMRCOD", GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMCOMSOLPRE", GXutil.ltrim( localUtil.ntoc( AV39MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMLOTE", GXutil.rtrim( A14270MComLote));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Objectcall", GXutil.rtrim( Combo_prvnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Cls", GXutil.rtrim( Combo_prvnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Selectedvalue_set", GXutil.rtrim( Combo_prvnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Enabled", GXutil.booltostr( Combo_prvnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVNUM_Emptyitemtext", GXutil.rtrim( Combo_prvnum_Emptyitemtext));
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
      return formatLink("app.tmcompra", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV32MComCod,10,0))}, new String[] {"Gx_mode","EmprCod","MComCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMCompra" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Compras", "") ;
   }

   public void initializeNonKey1AK1471( )
   {
      A795PrvNum = 0 ;
      n795PrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A13719PrvNNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A11045MComExt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11045MComExt", A11045MComExt);
      A11046MComFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11046MComFch", localUtil.format(A11046MComFch, "99/99/99"));
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A11047MComSolFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11047MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
      A11048MComEntFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
      A11049MComEst = httpContext.getMessage( "P", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
      A11050MComOri = httpContext.getMessage( "M", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
      O11049MComEst = A11049MComEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
      Z11045MComExt = "" ;
      Z11046MComFch = GXutil.nullDate() ;
      Z11047MComSolFch = GXutil.nullDate() ;
      Z11048MComEntFch = GXutil.nullDate() ;
      Z11049MComEst = "" ;
      Z11050MComOri = "" ;
      Z795PrvNum = 0 ;
   }

   public void initAll1AK1471( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11055MComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      initializeNonKey1AK1471( ) ;
   }

   public void standaloneModalInsert( )
   {
      A11049MComEst = i11049MComEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
      A11050MComOri = i11050MComOri ;
      httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
   }

   public void initializeNonKey1AK1472( )
   {
      AV39MComSolPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39MComSolPre", GXutil.ltrimstr( AV39MComSolPre, 12, 3));
      A9493MRNom = "" ;
      n9493MRNom = false ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      A11054MComEntPre = DecimalUtil.ZERO ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      n9499MRStkPre = false ;
      A14270MComLote = "" ;
      n14270MComLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14270MComLote", A14270MComLote);
      A11052MComSolPre = AV39MComSolPre ;
      Z11051MComSolCnt = DecimalUtil.ZERO ;
      Z11052MComSolPre = DecimalUtil.ZERO ;
      Z11053MComEntCnt = DecimalUtil.ZERO ;
      Z11054MComEntPre = DecimalUtil.ZERO ;
      Z14270MComLote = "" ;
   }

   public void initAll1AK1472( )
   {
      h9492MRCod = "" ;
      initializeNonKey1AK1472( ) ;
   }

   public void standaloneModalInsert1AK1472( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263623134837", true, true);
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
      httpContext.AddJavascriptSource("tmcompra.js", "?20263623134837", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1472( )
   {
      edtMComEntPre_Enabled = defedtMComEntPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMComEntCnt_Enabled = defedtMComEntCnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMRCNom_Enabled = defedtMRCNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCNom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMRNom_Enabled = defedtMRNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRNom_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtMRCod_Enabled = defedtMRCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void startgridcontrol65( )
   {
      Gridlevel_repContainer.AddObjectProperty("GridName", "Gridlevel_rep");
      Gridlevel_repContainer.AddObjectProperty("Header", subGridlevel_rep_Header);
      Gridlevel_repContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_repContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_rep_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_repContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_repColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repColumn.AddObjectProperty("Value", h9492MRCod);
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddColumnProperties(Gridlevel_repColumn);
      Gridlevel_repColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repColumn.AddObjectProperty("Value", GXutil.rtrim( A9493MRNom));
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddColumnProperties(Gridlevel_repColumn);
      Gridlevel_repColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repColumn.AddObjectProperty("Value", A13718MRCNom);
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddColumnProperties(Gridlevel_repColumn);
      Gridlevel_repColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11051MComSolCnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddColumnProperties(Gridlevel_repColumn);
      Gridlevel_repColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddColumnProperties(Gridlevel_repColumn);
      Gridlevel_repColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddColumnProperties(Gridlevel_repColumn);
      Gridlevel_repColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddColumnProperties(Gridlevel_repColumn);
      Gridlevel_repColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRStkPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddColumnProperties(Gridlevel_repColumn);
      Gridlevel_repContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_rep_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_rep_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_rep_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_rep_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_rep_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_rep_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_repContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_rep_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtMComCod_Internalname = "MCOMCOD" ;
      edtMComExt_Internalname = "MCOMEXT" ;
      lblTextblockprvnum_Internalname = "TEXTBLOCKPRVNUM" ;
      Combo_prvnum_Internalname = "COMBO_PRVNUM" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      divTablesplittedprvnum_Internalname = "TABLESPLITTEDPRVNUM" ;
      edtMComFch_Internalname = "MCOMFCH" ;
      edtMComSolFch_Internalname = "MCOMSOLFCH" ;
      edtMComEntFch_Internalname = "MCOMENTFCH" ;
      cmbMComEst.setInternalname( "MCOMEST" );
      cmbMComOri.setInternalname( "MCOMORI" );
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMRCod_Internalname = "MRCOD" ;
      edtMRNom_Internalname = "MRNOM" ;
      edtMRCNom_Internalname = "MRCNOM" ;
      edtMComSolCnt_Internalname = "MCOMSOLCNT" ;
      edtMComSolPre_Internalname = "MCOMSOLPRE" ;
      edtMComEntCnt_Internalname = "MCOMENTCNT" ;
      edtMComEntPre_Internalname = "MCOMENTPRE" ;
      edtMRStkPre_Internalname = "MRSTKPRE" ;
      divTableleaflevel_rep_Internalname = "TABLELEAFLEVEL_REP" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboprvnum_Internalname = "vCOMBOPRVNUM" ;
      divSectionattribute_prvnum_Internalname = "SECTIONATTRIBUTE_PRVNUM" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtPrvNNom_Internalname = "PRVNNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_rep_Internalname = "GRIDLEVEL_REP" ;
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
      subGridlevel_rep_Allowcollapsing = (byte)(0) ;
      subGridlevel_rep_Allowselection = (byte)(0) ;
      subGridlevel_rep_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Compras", "") );
      edtMRStkPre_Jsonclick = "" ;
      edtMComEntPre_Jsonclick = "" ;
      edtMComEntCnt_Jsonclick = "" ;
      edtMComSolPre_Jsonclick = "" ;
      edtMComSolCnt_Jsonclick = "" ;
      edtMRCNom_Jsonclick = "" ;
      edtMRNom_Jsonclick = "" ;
      edtMRCod_Jsonclick = "" ;
      subGridlevel_rep_Class = "GridNoBorder WorkWith" ;
      subGridlevel_rep_Backcolorstyle = (byte)(0) ;
      edtMRStkPre_Enabled = 0 ;
      edtMComEntPre_Visible = -1 ;
      edtMComEntPre_Enabled = 1 ;
      edtMComEntCnt_Visible = -1 ;
      edtMComEntCnt_Enabled = 1 ;
      edtMComSolPre_Enabled = 1 ;
      edtMComSolCnt_Enabled = 1 ;
      edtMRCNom_Enabled = 0 ;
      edtMRNom_Enabled = 0 ;
      edtMRCod_Enabled = 1 ;
      edtPrvNNom_Jsonclick = "" ;
      edtPrvNNom_Enabled = 0 ;
      edtPrvNNom_Visible = 1 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNom_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavComboprvnum_Jsonclick = "" ;
      edtavComboprvnum_Enabled = 0 ;
      edtavComboprvnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      cmbMComOri.setJsonclick( "" );
      cmbMComOri.setEnabled( 0 );
      cmbMComEst.setJsonclick( "" );
      cmbMComEst.setEnabled( 1 );
      edtMComEntFch_Jsonclick = "" ;
      edtMComEntFch_Enabled = 1 ;
      edtMComEntFch_Visible = 1 ;
      edtMComSolFch_Jsonclick = "" ;
      edtMComSolFch_Enabled = 1 ;
      edtMComFch_Jsonclick = "" ;
      edtMComFch_Enabled = 1 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 1 ;
      edtPrvNum_Visible = 1 ;
      Combo_prvnum_Emptyitemtext = "Ninguno" ;
      Combo_prvnum_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prvnum_Caption = "" ;
      Combo_prvnum_Enabled = GXutil.toBoolean( -1) ;
      edtMComExt_Jsonclick = "" ;
      edtMComExt_Enabled = 1 ;
      edtMComCod_Jsonclick = "" ;
      edtMComCod_Enabled = 0 ;
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

   public void gxsgamrcod1AK0( String A396EmprCod ,
                               String A13718MRCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgamrcod_data1AK0( A396EmprCod, A13718MRCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgamrcod_data1AK0( String A396EmprCod ,
                                       String A13718MRCNom )
   {
      l13718MRCNom = GXutil.concat( GXutil.rtrim( A13718MRCNom), "%", "") ;
      /* Using cursor T01AK34 */
      pr_default.execute(32, new Object[] {A396EmprCod, l13718MRCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(32) != 101) )
      {
         gxdynajaxctrlcodr.add(T01AK34_A13718MRCNom[0]);
         gxdynajaxctrldescr.add(T01AK34_A13718MRCNom[0]);
         pr_default.readNext(32);
      }
      pr_default.close(32);
   }

   public void gxhcamrcod1AK1472( String A396EmprCod ,
                                  String A13718MRCNom )
   {
      /* Using cursor T01AK35 */
      pr_default.execute(33, new Object[] {A13718MRCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(33) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13718MRCNom = T01AK35_A13718MRCNom[0] ;
         A396EmprCod = T01AK35_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01AK35_A9492MRCod[0] ;
         pr_default.readNext(33);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(33);
   }

   public void gx6asamcomcod1AK1471( long AV32MComCod )
   {
      if ( ! (0==AV32MComCod) )
      {
         A11055MComCod = AV32MComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      }
      else
      {
         if ( ! ( AV32MComCod == 0 ) )
         {
            A11055MComCod = AV32MComCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11055MComCod, (byte)(10), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx7asamcomcod1AK1471( long AV32MComCod ,
                                     String Gx_mode ,
                                     String A396EmprCod )
   {
      if ( isIns( )  && true /* After */ && ( AV32MComCod == 0 ) )
      {
         GXt_int10 = (int)(A11055MComCod) ;
         GXv_int11[0] = GXt_int10 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTCOM", ""), ""), GXv_int11) ;
         tmcompra_impl.this.GXt_int10 = GXv_int11[0] ;
         A11055MComCod = GXt_int10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11055MComCod, (byte)(10), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx30asamcomsolpre1AK1472( String Gx_mode ,
                                         String A396EmprCod ,
                                         int A9492MRCod )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A9492MRCod) )
      {
         GXt_decimal12 = AV39MComSolPre ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A9492MRCod ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pprc77(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_decimal13) ;
         tmcompra_impl.this.A396EmprCod = GXv_char4[0] ;
         tmcompra_impl.this.A9492MRCod = GXv_int11[0] ;
         tmcompra_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV39MComSolPre = GXt_decimal12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39MComSolPre", GXutil.ltrimstr( AV39MComSolPre, 12, 3));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV39MComSolPre, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_rep_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_651472( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AK1472( ) ;
         standaloneModal1AK1472( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AK1472( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651472( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_repContainer)) ;
      /* End function gxnrGridlevel_rep_newrow */
   }

   public void init_web_controls( )
   {
      cmbMComEst.setName( "MCOMEST" );
      cmbMComEst.setWebtags( "" );
      cmbMComEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbMComEst.addItem("C", httpContext.getMessage( "Confirmada", ""), (short)(0));
      cmbMComEst.addItem("E", httpContext.getMessage( "Enviada", ""), (short)(0));
      cmbMComEst.addItem("X", httpContext.getMessage( "Cancelada", ""), (short)(0));
      cmbMComEst.addItem("R", httpContext.getMessage( "Recibida", ""), (short)(0));
      if ( cmbMComEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11049MComEst)==0) )
         {
            A11049MComEst = httpContext.getMessage( "P", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
         }
      }
      cmbMComOri.setName( "MCOMORI" );
      cmbMComOri.setWebtags( "" );
      cmbMComOri.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbMComOri.addItem("A", httpContext.getMessage( "Automático", ""), (short)(0));
      if ( cmbMComOri.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11050MComOri)==0) )
         {
            A11050MComOri = httpContext.getMessage( "M", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01AK18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01AK18_A407EmprNom[0] ;
      n407EmprNom = T01AK18_n407EmprNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Prvnum( )
   {
      n795PrvNum = false ;
      n794PrvNom = false ;
      /* Using cursor T01AK19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A795PrvNum) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A794PrvNom = T01AK19_A794PrvNom[0] ;
      n794PrvNom = T01AK19_n794PrvNom[0] ;
      pr_default.close(17);
      A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13719PrvNNom", A13719PrvNNom);
   }

   public void valid_Mcomest( )
   {
      A11049MComEst = cmbMComEst.getValue() ;
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         cmbMComEst.setEnabled( 0 );
      }
      else
      {
         cmbMComEst.setEnabled( 1 );
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
      {
         edtMComEntFch_Enabled = 0 ;
      }
      else
      {
         edtMComEntFch_Enabled = 1 ;
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtMComEntFch_Visible = 0 ;
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtMComEntCnt_Visible = 0 ;
      }
      if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtMComEntPre_Visible = 0 ;
      }
      if ( isUpd( )  && ( GXutil.strcmp(O11049MComEst, A11049MComEst) != 0 ) && ( GXutil.strcmp(O11049MComEst, httpContext.getMessage( "P", "")) == 0 ) && ! ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) || ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "De pendiente, solo puede pasarse a Confirmada o Cancelada", ""), 1, "MCOMEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMComEst.getInternalname() ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && true /* Level */ && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede eliminar repuestos de la compra", ""), 1, "MCOMEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMComEst.getInternalname() ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Visible), 5, 0), !bGXsfl_65_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Visible), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void valid_Mrcod( )
   {
      n9493MRNom = false ;
      n9499MRStkPre = false ;
      if ( (GXutil.strcmp("", h9492MRCod)==0) )
      {
         A9492MRCod = 0 ;
      }
      else
      {
         A13718MRCNom = h9492MRCod ;
         /* Using cursor T01AK36 */
         pr_default.execute(34, new Object[] {A13718MRCNom, A396EmprCod});
         A9492MRCod = T01AK36_A9492MRCod[0] ;
         A9492MRCod = T01AK36_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(34) == 101) ) )
         {
            pr_default.readNext(34);
            if ( ! ( (pr_default.getStatus(34) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "MRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(34);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9492MRCod", h9492MRCod);
      /* Using cursor T01AK37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
      }
      A9493MRNom = T01AK37_A9493MRNom[0] ;
      n9493MRNom = T01AK37_n9493MRNom[0] ;
      A9499MRStkPre = T01AK37_A9499MRStkPre[0] ;
      n9499MRStkPre = T01AK37_n9499MRStkPre[0] ;
      pr_default.close(35);
      A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A9492MRCod) )
      {
         GXt_decimal12 = AV39MComSolPre ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int11[0] = A9492MRCod ;
         GXv_decimal13[0] = GXt_decimal12 ;
         new app.pprc77(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_decimal13) ;
         tmcompra_impl.this.A396EmprCod = GXv_char4[0] ;
         tmcompra_impl.this.A9492MRCod = GXv_int11[0] ;
         A9492MRCod = this.A9492MRCod ;
         tmcompra_impl.this.GXt_decimal12 = GXv_decimal13[0] ;
         AV39MComSolPre = GXt_decimal12 ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A11052MComSolPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A11052MComSolPre = AV39MComSolPre ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", GXutil.rtrim( A9493MRNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV39MComSolPre", GXutil.ltrim( localUtil.ntoc( AV39MComSolPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11052MComSolPre", GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h9492MRCod", h9492MRCod);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV32MComCod',fld:'vMCOMCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV32MComCod',fld:'vMCOMCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbMComOri'},{av:'A11050MComOri',fld:'MCOMORI',pic:''},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121AK2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MCOMCOD","{handler:'valid_Mcomcod',iparms:[]");
      setEventMetadata("VALID_MCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A13719PrvNNom',fld:'PRVNNOM',pic:''}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A13719PrvNNom',fld:'PRVNNOM',pic:''}]}");
      setEventMetadata("VALID_MCOMEST","{handler:'valid_Mcomest',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O11049MComEst'},{av:'cmbMComEst'},{av:'A11049MComEst',fld:'MCOMEST',pic:''}]");
      setEventMetadata("VALID_MCOMEST",",oparms:[{av:'cmbMComEst'},{av:'edtMComEntFch_Enabled',ctrl:'MCOMENTFCH',prop:'Enabled'},{av:'edtMComEntFch_Visible',ctrl:'MCOMENTFCH',prop:'Visible'},{av:'edtMComEntCnt_Visible',ctrl:'MCOMENTCNT',prop:'Visible'},{av:'edtMComEntPre_Visible',ctrl:'MCOMENTPRE',prop:'Visible'}]}");
      setEventMetadata("VALIDV_COMBOPRVNUM","{handler:'validv_Comboprvnum',iparms:[]");
      setEventMetadata("VALIDV_COMBOPRVNUM",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_PRVNOM","{handler:'valid_Prvnom',iparms:[]");
      setEventMetadata("VALID_PRVNOM",",oparms:[]}");
      setEventMetadata("VALID_MRCOD","{handler:'valid_Mrcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'h9492MRCod'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9493MRNom',fld:'MRNOM',pic:''},{av:'AV39MComSolPre',fld:'vMCOMSOLPRE',pic:'ZZZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9499MRStkPre',fld:'MRSTKPRE',pic:'ZZZZZZ9.999'},{av:'A13718MRCNom',fld:'MRCNOM',pic:''},{av:'A11052MComSolPre',fld:'MCOMSOLPRE',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_MRCOD",",oparms:[{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A9493MRNom',fld:'MRNOM',pic:''},{av:'A9499MRStkPre',fld:'MRSTKPRE',pic:'ZZZZZZ9.999'},{av:'A13718MRCNom',fld:'MRCNOM',pic:''},{av:'AV39MComSolPre',fld:'vMCOMSOLPRE',pic:'ZZZZZZZ9.999'},{av:'A11052MComSolPre',fld:'MCOMSOLPRE',pic:'ZZZZZZZ9.999'},{av:'h9492MRCod'}]}");
      setEventMetadata("VALID_MRNOM","{handler:'valid_Mrnom',iparms:[]");
      setEventMetadata("VALID_MRNOM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mrstkpre',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      pr_default.close(35);
      pr_default.close(30);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV41EmprCod = "" ;
      Z396EmprCod = "" ;
      Z11045MComExt = "" ;
      Z11046MComFch = GXutil.nullDate() ;
      Z11047MComSolFch = GXutil.nullDate() ;
      Z11048MComEntFch = GXutil.nullDate() ;
      Z11049MComEst = "" ;
      Z11050MComOri = "" ;
      O11049MComEst = "" ;
      N11049MComEst = "" ;
      N11048MComEntFch = GXutil.nullDate() ;
      Combo_prvnum_Selectedvalue_get = "" ;
      Z11051MComSolCnt = DecimalUtil.ZERO ;
      Z11052MComSolPre = DecimalUtil.ZERO ;
      Z11053MComEntCnt = DecimalUtil.ZERO ;
      Z11054MComEntPre = DecimalUtil.ZERO ;
      Z14270MComLote = "" ;
      N11053MComEntCnt = DecimalUtil.ZERO ;
      N11054MComEntPre = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13718MRCNom = "" ;
      h9492MRCod = "" ;
      Gx_mode = "" ;
      AV41EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A11049MComEst = "" ;
      A11050MComOri = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A11045MComExt = "" ;
      lblTextblockprvnum_Jsonclick = "" ;
      ucCombo_prvnum = new com.genexus.webpanels.GXUserControl();
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV43PrvNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A11046MComFch = GXutil.nullDate() ;
      A11047MComSolFch = GXutil.nullDate() ;
      A11048MComEntFch = GXutil.nullDate() ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV48Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A407EmprNom = "" ;
      A794PrvNom = "" ;
      A13719PrvNNom = "" ;
      Gridlevel_repContainer = new com.genexus.webpanels.GXWebGrid(context);
      B11049MComEst = "" ;
      sMode1472 = "" ;
      sStyleString = "" ;
      AV39MComSolPre = DecimalUtil.ZERO ;
      A14270MComLote = "" ;
      Combo_prvnum_Objectcall = "" ;
      Combo_prvnum_Class = "" ;
      Combo_prvnum_Icontype = "" ;
      Combo_prvnum_Icon = "" ;
      Combo_prvnum_Tooltip = "" ;
      Combo_prvnum_Selectedvalue_set = "" ;
      Combo_prvnum_Selectedtext_set = "" ;
      Combo_prvnum_Selectedtext_get = "" ;
      Combo_prvnum_Gamoauthtoken = "" ;
      Combo_prvnum_Ddointernalname = "" ;
      Combo_prvnum_Titlecontrolalign = "" ;
      Combo_prvnum_Dropdownoptionstype = "" ;
      Combo_prvnum_Titlecontrolidtoreplace = "" ;
      Combo_prvnum_Datalisttype = "" ;
      Combo_prvnum_Datalistfixedvalues = "" ;
      Combo_prvnum_Datalistproc = "" ;
      Combo_prvnum_Datalistprocparametersprefix = "" ;
      Combo_prvnum_Remoteservicesparameters = "" ;
      Combo_prvnum_Htmltemplate = "" ;
      Combo_prvnum_Multiplevaluestype = "" ;
      Combo_prvnum_Loadingdata = "" ;
      Combo_prvnum_Noresultsfound = "" ;
      Combo_prvnum_Onlyselectedvalues = "" ;
      Combo_prvnum_Selectalltext = "" ;
      Combo_prvnum_Multiplevaluesseparator = "" ;
      Combo_prvnum_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1471 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A9493MRNom = "" ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      A11054MComEntPre = DecimalUtil.ZERO ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV42ObtenerEmprCod = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      AV38TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV40window = new com.genexus.webpanels.GXWindow();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV45ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z794PrvNom = "" ;
      T01AK7_A407EmprNom = new String[] {""} ;
      T01AK7_n407EmprNom = new boolean[] {false} ;
      T01AK8_A794PrvNom = new String[] {""} ;
      T01AK8_n794PrvNom = new boolean[] {false} ;
      T01AK9_A11055MComCod = new long[1] ;
      T01AK9_A407EmprNom = new String[] {""} ;
      T01AK9_n407EmprNom = new boolean[] {false} ;
      T01AK9_A11045MComExt = new String[] {""} ;
      T01AK9_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AK9_A794PrvNom = new String[] {""} ;
      T01AK9_n794PrvNom = new boolean[] {false} ;
      T01AK9_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AK9_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AK9_A11049MComEst = new String[] {""} ;
      T01AK9_A11050MComOri = new String[] {""} ;
      T01AK9_A396EmprCod = new String[] {""} ;
      T01AK9_A795PrvNum = new int[1] ;
      T01AK9_n795PrvNum = new boolean[] {false} ;
      T01AK10_A407EmprNom = new String[] {""} ;
      T01AK10_n407EmprNom = new boolean[] {false} ;
      T01AK11_A794PrvNom = new String[] {""} ;
      T01AK11_n794PrvNom = new boolean[] {false} ;
      T01AK12_A396EmprCod = new String[] {""} ;
      T01AK12_A11055MComCod = new long[1] ;
      T01AK6_A11055MComCod = new long[1] ;
      T01AK6_A11045MComExt = new String[] {""} ;
      T01AK6_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AK6_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AK6_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AK6_A11049MComEst = new String[] {""} ;
      T01AK6_A11050MComOri = new String[] {""} ;
      T01AK6_A396EmprCod = new String[] {""} ;
      T01AK6_A795PrvNum = new int[1] ;
      T01AK6_n795PrvNum = new boolean[] {false} ;
      T01AK13_A396EmprCod = new String[] {""} ;
      T01AK13_A11055MComCod = new long[1] ;
      T01AK14_A396EmprCod = new String[] {""} ;
      T01AK14_A11055MComCod = new long[1] ;
      T01AK5_A11055MComCod = new long[1] ;
      T01AK5_A11045MComExt = new String[] {""} ;
      T01AK5_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AK5_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AK5_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AK5_A11049MComEst = new String[] {""} ;
      T01AK5_A11050MComOri = new String[] {""} ;
      T01AK5_A396EmprCod = new String[] {""} ;
      T01AK5_A795PrvNum = new int[1] ;
      T01AK5_n795PrvNum = new boolean[] {false} ;
      T01AK18_A407EmprNom = new String[] {""} ;
      T01AK18_n407EmprNom = new boolean[] {false} ;
      T01AK19_A794PrvNom = new String[] {""} ;
      T01AK19_n794PrvNom = new boolean[] {false} ;
      T01AK20_A396EmprCod = new String[] {""} ;
      T01AK20_A11055MComCod = new long[1] ;
      Z9493MRNom = "" ;
      Z9499MRStkPre = DecimalUtil.ZERO ;
      T01AK21_A11055MComCod = new long[1] ;
      T01AK21_A9493MRNom = new String[] {""} ;
      T01AK21_n9493MRNom = new boolean[] {false} ;
      T01AK21_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK21_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK21_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK21_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK21_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK21_n9499MRStkPre = new boolean[] {false} ;
      T01AK21_A14270MComLote = new String[] {""} ;
      T01AK21_n14270MComLote = new boolean[] {false} ;
      T01AK21_A396EmprCod = new String[] {""} ;
      T01AK21_A9492MRCod = new int[1] ;
      T01AK22_A13718MRCNom = new String[] {""} ;
      T01AK22_A396EmprCod = new String[] {""} ;
      T01AK22_A9492MRCod = new int[1] ;
      T01AK23_A13718MRCNom = new String[] {""} ;
      T01AK23_A396EmprCod = new String[] {""} ;
      T01AK23_A9492MRCod = new int[1] ;
      T01AK24_A13718MRCNom = new String[] {""} ;
      T01AK24_A396EmprCod = new String[] {""} ;
      T01AK24_A9492MRCod = new int[1] ;
      T01AK4_A9493MRNom = new String[] {""} ;
      T01AK4_n9493MRNom = new boolean[] {false} ;
      T01AK4_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK4_n9499MRStkPre = new boolean[] {false} ;
      T01AK25_A9493MRNom = new String[] {""} ;
      T01AK25_n9493MRNom = new boolean[] {false} ;
      T01AK25_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK25_n9499MRStkPre = new boolean[] {false} ;
      T01AK26_A13718MRCNom = new String[] {""} ;
      T01AK26_A396EmprCod = new String[] {""} ;
      T01AK26_A9492MRCod = new int[1] ;
      T01AK27_A396EmprCod = new String[] {""} ;
      T01AK27_A11055MComCod = new long[1] ;
      T01AK27_A9492MRCod = new int[1] ;
      T01AK3_A11055MComCod = new long[1] ;
      T01AK3_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK3_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK3_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK3_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK3_A14270MComLote = new String[] {""} ;
      T01AK3_n14270MComLote = new boolean[] {false} ;
      T01AK3_A396EmprCod = new String[] {""} ;
      T01AK3_A9492MRCod = new int[1] ;
      T01AK28_A13718MRCNom = new String[] {""} ;
      T01AK28_A396EmprCod = new String[] {""} ;
      T01AK28_A9492MRCod = new int[1] ;
      T01AK2_A11055MComCod = new long[1] ;
      T01AK2_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK2_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK2_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK2_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK2_A14270MComLote = new String[] {""} ;
      T01AK2_n14270MComLote = new boolean[] {false} ;
      T01AK2_A396EmprCod = new String[] {""} ;
      T01AK2_A9492MRCod = new int[1] ;
      T01AK32_A9493MRNom = new String[] {""} ;
      T01AK32_n9493MRNom = new boolean[] {false} ;
      T01AK32_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK32_n9499MRStkPre = new boolean[] {false} ;
      T01AK33_A396EmprCod = new String[] {""} ;
      T01AK33_A11055MComCod = new long[1] ;
      T01AK33_A9492MRCod = new int[1] ;
      Gridlevel_repRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_rep_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11049MComEst = "" ;
      i11050MComOri = "" ;
      Gridlevel_repColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13718MRCNom = "" ;
      T01AK34_A13718MRCNom = new String[] {""} ;
      T01AK35_A13718MRCNom = new String[] {""} ;
      T01AK35_A396EmprCod = new String[] {""} ;
      T01AK35_A9492MRCod = new int[1] ;
      Z13719PrvNNom = "" ;
      T01AK36_A13718MRCNom = new String[] {""} ;
      T01AK36_A396EmprCod = new String[] {""} ;
      T01AK36_A9492MRCod = new int[1] ;
      T01AK37_A9493MRNom = new String[] {""} ;
      T01AK37_n9493MRNom = new boolean[] {false} ;
      T01AK37_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AK37_n9499MRStkPre = new boolean[] {false} ;
      GXt_decimal12 = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      Z13718MRCNom = "" ;
      ZV39MComSolPre = DecimalUtil.ZERO ;
      Zh9492MRCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmcompra__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmcompra__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmcompra__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmcompra__default(),
         new Object[] {
             new Object[] {
            T01AK2_A11055MComCod, T01AK2_A11051MComSolCnt, T01AK2_A11052MComSolPre, T01AK2_A11053MComEntCnt, T01AK2_A11054MComEntPre, T01AK2_A14270MComLote, T01AK2_n14270MComLote, T01AK2_A396EmprCod, T01AK2_A9492MRCod
            }
            , new Object[] {
            T01AK3_A11055MComCod, T01AK3_A11051MComSolCnt, T01AK3_A11052MComSolPre, T01AK3_A11053MComEntCnt, T01AK3_A11054MComEntPre, T01AK3_A14270MComLote, T01AK3_n14270MComLote, T01AK3_A396EmprCod, T01AK3_A9492MRCod
            }
            , new Object[] {
            T01AK4_A9493MRNom, T01AK4_n9493MRNom, T01AK4_A9499MRStkPre, T01AK4_n9499MRStkPre
            }
            , new Object[] {
            T01AK5_A11055MComCod, T01AK5_A11045MComExt, T01AK5_A11046MComFch, T01AK5_A11047MComSolFch, T01AK5_A11048MComEntFch, T01AK5_A11049MComEst, T01AK5_A11050MComOri, T01AK5_A396EmprCod, T01AK5_A795PrvNum, T01AK5_n795PrvNum
            }
            , new Object[] {
            T01AK6_A11055MComCod, T01AK6_A11045MComExt, T01AK6_A11046MComFch, T01AK6_A11047MComSolFch, T01AK6_A11048MComEntFch, T01AK6_A11049MComEst, T01AK6_A11050MComOri, T01AK6_A396EmprCod, T01AK6_A795PrvNum, T01AK6_n795PrvNum
            }
            , new Object[] {
            T01AK7_A407EmprNom, T01AK7_n407EmprNom
            }
            , new Object[] {
            T01AK8_A794PrvNom, T01AK8_n794PrvNom
            }
            , new Object[] {
            T01AK9_A11055MComCod, T01AK9_A407EmprNom, T01AK9_n407EmprNom, T01AK9_A11045MComExt, T01AK9_A11046MComFch, T01AK9_A794PrvNom, T01AK9_n794PrvNom, T01AK9_A11047MComSolFch, T01AK9_A11048MComEntFch, T01AK9_A11049MComEst,
            T01AK9_A11050MComOri, T01AK9_A396EmprCod, T01AK9_A795PrvNum, T01AK9_n795PrvNum
            }
            , new Object[] {
            T01AK10_A407EmprNom, T01AK10_n407EmprNom
            }
            , new Object[] {
            T01AK11_A794PrvNom, T01AK11_n794PrvNom
            }
            , new Object[] {
            T01AK12_A396EmprCod, T01AK12_A11055MComCod
            }
            , new Object[] {
            T01AK13_A396EmprCod, T01AK13_A11055MComCod
            }
            , new Object[] {
            T01AK14_A396EmprCod, T01AK14_A11055MComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AK18_A407EmprNom, T01AK18_n407EmprNom
            }
            , new Object[] {
            T01AK19_A794PrvNom, T01AK19_n794PrvNom
            }
            , new Object[] {
            T01AK20_A396EmprCod, T01AK20_A11055MComCod
            }
            , new Object[] {
            T01AK21_A11055MComCod, T01AK21_A9493MRNom, T01AK21_n9493MRNom, T01AK21_A11051MComSolCnt, T01AK21_A11052MComSolPre, T01AK21_A11053MComEntCnt, T01AK21_A11054MComEntPre, T01AK21_A9499MRStkPre, T01AK21_n9499MRStkPre, T01AK21_A14270MComLote,
            T01AK21_n14270MComLote, T01AK21_A396EmprCod, T01AK21_A9492MRCod
            }
            , new Object[] {
            T01AK22_A13718MRCNom, T01AK22_A396EmprCod, T01AK22_A9492MRCod
            }
            , new Object[] {
            T01AK23_A13718MRCNom, T01AK23_A396EmprCod, T01AK23_A9492MRCod
            }
            , new Object[] {
            T01AK24_A13718MRCNom, T01AK24_A396EmprCod, T01AK24_A9492MRCod
            }
            , new Object[] {
            T01AK25_A9493MRNom, T01AK25_n9493MRNom, T01AK25_A9499MRStkPre, T01AK25_n9499MRStkPre
            }
            , new Object[] {
            T01AK26_A13718MRCNom, T01AK26_A396EmprCod, T01AK26_A9492MRCod
            }
            , new Object[] {
            T01AK27_A396EmprCod, T01AK27_A11055MComCod, T01AK27_A9492MRCod
            }
            , new Object[] {
            T01AK28_A13718MRCNom, T01AK28_A396EmprCod, T01AK28_A9492MRCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AK32_A9493MRNom, T01AK32_n9493MRNom, T01AK32_A9499MRStkPre, T01AK32_n9499MRStkPre
            }
            , new Object[] {
            T01AK33_A396EmprCod, T01AK33_A11055MComCod, T01AK33_A9492MRCod
            }
            , new Object[] {
            T01AK34_A13718MRCNom
            }
            , new Object[] {
            T01AK35_A13718MRCNom, T01AK35_A396EmprCod, T01AK35_A9492MRCod
            }
            , new Object[] {
            T01AK36_A13718MRCNom, T01AK36_A396EmprCod, T01AK36_A9492MRCod
            }
            , new Object[] {
            T01AK37_A9493MRNom, T01AK37_n9493MRNom, T01AK37_A9499MRStkPre, T01AK37_n9499MRStkPre
            }
         }
      );
      AV48Pgmname = "TMCompra" ;
      Z11052MComSolPre = DecimalUtil.ZERO ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      Z11050MComOri = httpContext.getMessage( "M", "") ;
      A11050MComOri = httpContext.getMessage( "M", "") ;
      i11050MComOri = httpContext.getMessage( "M", "") ;
      Z11049MComEst = httpContext.getMessage( "P", "") ;
      O11049MComEst = httpContext.getMessage( "P", "") ;
      N11049MComEst = httpContext.getMessage( "P", "") ;
      A11049MComEst = httpContext.getMessage( "P", "") ;
      i11049MComEst = httpContext.getMessage( "P", "") ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_rep_Backcolorstyle ;
   private byte subGridlevel_rep_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_rep_Allowselection ;
   private byte subGridlevel_rep_Allowhovering ;
   private byte subGridlevel_rep_Allowcollapsing ;
   private byte subGridlevel_rep_Collapsed ;
   private short nRcdDeleted_1472 ;
   private short nRcdExists_1472 ;
   private short nIsMod_1472 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1472 ;
   private short RcdFound1472 ;
   private short nBlankRcdUsr1472 ;
   private short RcdFound1471 ;
   private short nIsDirty_1471 ;
   private short nIsDirty_1472 ;
   private short gxhchits ;
   private int Z795PrvNum ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int N795PrvNum ;
   private int Z9492MRCod ;
   private int A9492MRCod ;
   private int A795PrvNum ;
   private int trnEnded ;
   private int edtMComCod_Enabled ;
   private int edtMComExt_Enabled ;
   private int edtPrvNum_Visible ;
   private int edtPrvNum_Enabled ;
   private int edtMComFch_Enabled ;
   private int edtMComSolFch_Enabled ;
   private int edtMComEntFch_Visible ;
   private int edtMComEntFch_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV46ComboPrvNum ;
   private int edtavComboprvnum_Enabled ;
   private int edtavComboprvnum_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtPrvNom_Visible ;
   private int edtPrvNom_Enabled ;
   private int edtPrvNNom_Visible ;
   private int edtPrvNNom_Enabled ;
   private int edtMRCod_Enabled ;
   private int edtMRNom_Enabled ;
   private int edtMRCNom_Enabled ;
   private int edtMComSolCnt_Enabled ;
   private int edtMComSolPre_Enabled ;
   private int edtMComEntCnt_Enabled ;
   private int edtMComEntCnt_Visible ;
   private int edtMComEntPre_Enabled ;
   private int edtMComEntPre_Visible ;
   private int edtMRStkPre_Enabled ;
   private int fRowAdded ;
   private int AV37Insert_PrvNum ;
   private int Combo_prvnum_Datalistupdateminimumcharacters ;
   private int Combo_prvnum_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int AV49GXV1 ;
   private int GX_JID ;
   private int subGridlevel_rep_Backcolor ;
   private int subGridlevel_rep_Allbackcolor ;
   private int defedtMComEntPre_Enabled ;
   private int defedtMComEntCnt_Enabled ;
   private int defedtMRCNom_Enabled ;
   private int defedtMRNom_Enabled ;
   private int defedtMRCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_rep_Selectedindex ;
   private int subGridlevel_rep_Selectioncolor ;
   private int subGridlevel_rep_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int GXt_int10 ;
   private int GXv_int11[] ;
   private long wcpOAV32MComCod ;
   private long Z11055MComCod ;
   private long AV32MComCod ;
   private long A11055MComCod ;
   private long GRIDLEVEL_REP_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11051MComSolCnt ;
   private java.math.BigDecimal Z11052MComSolPre ;
   private java.math.BigDecimal Z11053MComEntCnt ;
   private java.math.BigDecimal Z11054MComEntPre ;
   private java.math.BigDecimal N11053MComEntCnt ;
   private java.math.BigDecimal N11054MComEntPre ;
   private java.math.BigDecimal AV39MComSolPre ;
   private java.math.BigDecimal A11051MComSolCnt ;
   private java.math.BigDecimal A11052MComSolPre ;
   private java.math.BigDecimal A11053MComEntCnt ;
   private java.math.BigDecimal A11054MComEntPre ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal Z9499MRStkPre ;
   private java.math.BigDecimal GXt_decimal12 ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal ZV39MComSolPre ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV41EmprCod ;
   private String Z396EmprCod ;
   private String Z11045MComExt ;
   private String Z11049MComEst ;
   private String Z11050MComOri ;
   private String O11049MComEst ;
   private String N11049MComEst ;
   private String Combo_prvnum_Selectedvalue_get ;
   private String Z14270MComLote ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV41EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMComExt_Internalname ;
   private String sGXsfl_65_idx="0001" ;
   private String A11049MComEst ;
   private String A11050MComOri ;
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
   private String edtMComCod_Internalname ;
   private String TempTags ;
   private String edtMComCod_Jsonclick ;
   private String A11045MComExt ;
   private String edtMComExt_Jsonclick ;
   private String divTablesplittedprvnum_Internalname ;
   private String lblTextblockprvnum_Internalname ;
   private String lblTextblockprvnum_Jsonclick ;
   private String Combo_prvnum_Caption ;
   private String Combo_prvnum_Cls ;
   private String Combo_prvnum_Emptyitemtext ;
   private String Combo_prvnum_Internalname ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String edtMComFch_Internalname ;
   private String edtMComFch_Jsonclick ;
   private String edtMComSolFch_Internalname ;
   private String edtMComSolFch_Jsonclick ;
   private String edtMComEntFch_Internalname ;
   private String edtMComEntFch_Jsonclick ;
   private String divTableleaflevel_rep_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV48Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_prvnum_Internalname ;
   private String edtavComboprvnum_Internalname ;
   private String edtavComboprvnum_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrvNNom_Internalname ;
   private String edtPrvNNom_Jsonclick ;
   private String B11049MComEst ;
   private String sMode1472 ;
   private String edtMRCod_Internalname ;
   private String edtMRNom_Internalname ;
   private String edtMRCNom_Internalname ;
   private String edtMComSolCnt_Internalname ;
   private String edtMComSolPre_Internalname ;
   private String edtMComEntCnt_Internalname ;
   private String edtMComEntPre_Internalname ;
   private String edtMRStkPre_Internalname ;
   private String sStyleString ;
   private String subGridlevel_rep_Internalname ;
   private String A14270MComLote ;
   private String Combo_prvnum_Objectcall ;
   private String Combo_prvnum_Class ;
   private String Combo_prvnum_Icontype ;
   private String Combo_prvnum_Icon ;
   private String Combo_prvnum_Tooltip ;
   private String Combo_prvnum_Selectedvalue_set ;
   private String Combo_prvnum_Selectedtext_set ;
   private String Combo_prvnum_Selectedtext_get ;
   private String Combo_prvnum_Gamoauthtoken ;
   private String Combo_prvnum_Ddointernalname ;
   private String Combo_prvnum_Titlecontrolalign ;
   private String Combo_prvnum_Dropdownoptionstype ;
   private String Combo_prvnum_Titlecontrolidtoreplace ;
   private String Combo_prvnum_Datalisttype ;
   private String Combo_prvnum_Datalistfixedvalues ;
   private String Combo_prvnum_Datalistproc ;
   private String Combo_prvnum_Datalistprocparametersprefix ;
   private String Combo_prvnum_Remoteservicesparameters ;
   private String Combo_prvnum_Htmltemplate ;
   private String Combo_prvnum_Multiplevaluestype ;
   private String Combo_prvnum_Loadingdata ;
   private String Combo_prvnum_Noresultsfound ;
   private String Combo_prvnum_Onlyselectedvalues ;
   private String Combo_prvnum_Selectalltext ;
   private String Combo_prvnum_Multiplevaluesseparator ;
   private String Combo_prvnum_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1471 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9493MRNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV42ObtenerEmprCod ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String Z9493MRNom ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGridlevel_rep_Class ;
   private String subGridlevel_rep_Linesclass ;
   private String ROClassString ;
   private String edtMRCod_Jsonclick ;
   private String edtMRNom_Jsonclick ;
   private String edtMRCNom_Jsonclick ;
   private String edtMComSolCnt_Jsonclick ;
   private String edtMComSolPre_Jsonclick ;
   private String edtMComEntCnt_Jsonclick ;
   private String edtMComEntPre_Jsonclick ;
   private String edtMRStkPre_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11049MComEst ;
   private String i11050MComOri ;
   private String subGridlevel_rep_Header ;
   private String gxwrpcisep ;
   private String GXv_char4[] ;
   private java.util.Date Z11046MComFch ;
   private java.util.Date Z11047MComSolFch ;
   private java.util.Date Z11048MComEntFch ;
   private java.util.Date N11048MComEntFch ;
   private java.util.Date A11046MComFch ;
   private java.util.Date A11047MComSolFch ;
   private java.util.Date A11048MComEntFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n795PrvNum ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n14270MComLote ;
   private boolean Combo_prvnum_Enabled ;
   private boolean Combo_prvnum_Visible ;
   private boolean Combo_prvnum_Allowmultipleselection ;
   private boolean Combo_prvnum_Isgriditem ;
   private boolean Combo_prvnum_Hasdescription ;
   private boolean Combo_prvnum_Includeonlyselectedoption ;
   private boolean Combo_prvnum_Includeselectalloption ;
   private boolean Combo_prvnum_Emptyitem ;
   private boolean Combo_prvnum_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n9493MRNom ;
   private boolean n9499MRStkPre ;
   private String A13718MRCNom ;
   private String h9492MRCod ;
   private String A13719PrvNNom ;
   private String AV45ComboSelectedValue ;
   private String l13718MRCNom ;
   private String Z13719PrvNNom ;
   private String Z13718MRCNom ;
   private String Zh9492MRCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_repContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_repRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_repColumn ;
   private com.genexus.webpanels.GXWindow AV40window ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prvnum ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbMComEst ;
   private HTMLChoice cmbMComOri ;
   private IDataStoreProvider pr_default ;
   private String[] T01AK7_A407EmprNom ;
   private boolean[] T01AK7_n407EmprNom ;
   private String[] T01AK8_A794PrvNom ;
   private boolean[] T01AK8_n794PrvNom ;
   private long[] T01AK9_A11055MComCod ;
   private String[] T01AK9_A407EmprNom ;
   private boolean[] T01AK9_n407EmprNom ;
   private String[] T01AK9_A11045MComExt ;
   private java.util.Date[] T01AK9_A11046MComFch ;
   private String[] T01AK9_A794PrvNom ;
   private boolean[] T01AK9_n794PrvNom ;
   private java.util.Date[] T01AK9_A11047MComSolFch ;
   private java.util.Date[] T01AK9_A11048MComEntFch ;
   private String[] T01AK9_A11049MComEst ;
   private String[] T01AK9_A11050MComOri ;
   private String[] T01AK9_A396EmprCod ;
   private int[] T01AK9_A795PrvNum ;
   private boolean[] T01AK9_n795PrvNum ;
   private String[] T01AK10_A407EmprNom ;
   private boolean[] T01AK10_n407EmprNom ;
   private String[] T01AK11_A794PrvNom ;
   private boolean[] T01AK11_n794PrvNom ;
   private String[] T01AK12_A396EmprCod ;
   private long[] T01AK12_A11055MComCod ;
   private long[] T01AK6_A11055MComCod ;
   private String[] T01AK6_A11045MComExt ;
   private java.util.Date[] T01AK6_A11046MComFch ;
   private java.util.Date[] T01AK6_A11047MComSolFch ;
   private java.util.Date[] T01AK6_A11048MComEntFch ;
   private String[] T01AK6_A11049MComEst ;
   private String[] T01AK6_A11050MComOri ;
   private String[] T01AK6_A396EmprCod ;
   private int[] T01AK6_A795PrvNum ;
   private boolean[] T01AK6_n795PrvNum ;
   private String[] T01AK13_A396EmprCod ;
   private long[] T01AK13_A11055MComCod ;
   private String[] T01AK14_A396EmprCod ;
   private long[] T01AK14_A11055MComCod ;
   private long[] T01AK5_A11055MComCod ;
   private String[] T01AK5_A11045MComExt ;
   private java.util.Date[] T01AK5_A11046MComFch ;
   private java.util.Date[] T01AK5_A11047MComSolFch ;
   private java.util.Date[] T01AK5_A11048MComEntFch ;
   private String[] T01AK5_A11049MComEst ;
   private String[] T01AK5_A11050MComOri ;
   private String[] T01AK5_A396EmprCod ;
   private int[] T01AK5_A795PrvNum ;
   private boolean[] T01AK5_n795PrvNum ;
   private String[] T01AK18_A407EmprNom ;
   private boolean[] T01AK18_n407EmprNom ;
   private String[] T01AK19_A794PrvNom ;
   private boolean[] T01AK19_n794PrvNom ;
   private String[] T01AK20_A396EmprCod ;
   private long[] T01AK20_A11055MComCod ;
   private long[] T01AK21_A11055MComCod ;
   private String[] T01AK21_A9493MRNom ;
   private boolean[] T01AK21_n9493MRNom ;
   private java.math.BigDecimal[] T01AK21_A11051MComSolCnt ;
   private java.math.BigDecimal[] T01AK21_A11052MComSolPre ;
   private java.math.BigDecimal[] T01AK21_A11053MComEntCnt ;
   private java.math.BigDecimal[] T01AK21_A11054MComEntPre ;
   private java.math.BigDecimal[] T01AK21_A9499MRStkPre ;
   private boolean[] T01AK21_n9499MRStkPre ;
   private String[] T01AK21_A14270MComLote ;
   private boolean[] T01AK21_n14270MComLote ;
   private String[] T01AK21_A396EmprCod ;
   private int[] T01AK21_A9492MRCod ;
   private String[] T01AK22_A13718MRCNom ;
   private String[] T01AK22_A396EmprCod ;
   private int[] T01AK22_A9492MRCod ;
   private String[] T01AK23_A13718MRCNom ;
   private String[] T01AK23_A396EmprCod ;
   private int[] T01AK23_A9492MRCod ;
   private String[] T01AK24_A13718MRCNom ;
   private String[] T01AK24_A396EmprCod ;
   private int[] T01AK24_A9492MRCod ;
   private String[] T01AK4_A9493MRNom ;
   private boolean[] T01AK4_n9493MRNom ;
   private java.math.BigDecimal[] T01AK4_A9499MRStkPre ;
   private boolean[] T01AK4_n9499MRStkPre ;
   private String[] T01AK25_A9493MRNom ;
   private boolean[] T01AK25_n9493MRNom ;
   private java.math.BigDecimal[] T01AK25_A9499MRStkPre ;
   private boolean[] T01AK25_n9499MRStkPre ;
   private String[] T01AK26_A13718MRCNom ;
   private String[] T01AK26_A396EmprCod ;
   private int[] T01AK26_A9492MRCod ;
   private String[] T01AK27_A396EmprCod ;
   private long[] T01AK27_A11055MComCod ;
   private int[] T01AK27_A9492MRCod ;
   private long[] T01AK3_A11055MComCod ;
   private java.math.BigDecimal[] T01AK3_A11051MComSolCnt ;
   private java.math.BigDecimal[] T01AK3_A11052MComSolPre ;
   private java.math.BigDecimal[] T01AK3_A11053MComEntCnt ;
   private java.math.BigDecimal[] T01AK3_A11054MComEntPre ;
   private String[] T01AK3_A14270MComLote ;
   private boolean[] T01AK3_n14270MComLote ;
   private String[] T01AK3_A396EmprCod ;
   private int[] T01AK3_A9492MRCod ;
   private String[] T01AK28_A13718MRCNom ;
   private String[] T01AK28_A396EmprCod ;
   private int[] T01AK28_A9492MRCod ;
   private long[] T01AK2_A11055MComCod ;
   private java.math.BigDecimal[] T01AK2_A11051MComSolCnt ;
   private java.math.BigDecimal[] T01AK2_A11052MComSolPre ;
   private java.math.BigDecimal[] T01AK2_A11053MComEntCnt ;
   private java.math.BigDecimal[] T01AK2_A11054MComEntPre ;
   private String[] T01AK2_A14270MComLote ;
   private boolean[] T01AK2_n14270MComLote ;
   private String[] T01AK2_A396EmprCod ;
   private int[] T01AK2_A9492MRCod ;
   private String[] T01AK32_A9493MRNom ;
   private boolean[] T01AK32_n9493MRNom ;
   private java.math.BigDecimal[] T01AK32_A9499MRStkPre ;
   private boolean[] T01AK32_n9499MRStkPre ;
   private String[] T01AK33_A396EmprCod ;
   private long[] T01AK33_A11055MComCod ;
   private int[] T01AK33_A9492MRCod ;
   private String[] T01AK34_A13718MRCNom ;
   private String[] T01AK35_A13718MRCNom ;
   private String[] T01AK35_A396EmprCod ;
   private int[] T01AK35_A9492MRCod ;
   private String[] T01AK36_A13718MRCNom ;
   private String[] T01AK36_A396EmprCod ;
   private int[] T01AK36_A9492MRCod ;
   private String[] T01AK37_A9493MRNom ;
   private boolean[] T01AK37_n9493MRNom ;
   private java.math.BigDecimal[] T01AK37_A9499MRStkPre ;
   private boolean[] T01AK37_n9499MRStkPre ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV43PrvNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV38TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tmcompra__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmcompra__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmcompra__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmcompra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AK2", "SELECT MComCod, MComSolCnt, MComSolPre, MComEntCnt, MComEntPre, MComLote, EmprCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? AND MComCod = ? AND MRCod = ?  FOR UPDATE OF MComSolCnt, MComSolPre, MComEntCnt, MComEntPre, MComLote NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK3", "SELECT MComCod, MComSolCnt, MComSolPre, MComEntCnt, MComEntPre, MComLote, EmprCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? AND MComCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK4", "SELECT MRNom, MRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK5", "SELECT MComCod, MComExt, MComFch, MComSolFch, MComEntFch, MComEst, MComOri, EmprCod, PrvNum FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ?  FOR UPDATE OF MComExt, MComFch, MComSolFch, MComEntFch, MComEst, MComOri, PrvNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK6", "SELECT MComCod, MComExt, MComFch, MComSolFch, MComEntFch, MComEst, MComOri, EmprCod, PrvNum FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK8", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK9", "SELECT /*+ FIRST_ROWS(100) */ TM1.MComCod, T2.EmprNom, TM1.MComExt, TM1.MComFch, T3.PrvNom, TM1.MComSolFch, TM1.MComEntFch, TM1.MComEst, TM1.MComOri, TM1.EmprCod, TM1.PrvNum FROM ((TXPMRepCo TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrvNum = TM1.PrvNum) WHERE TM1.EmprCod = ? and TM1.MComCod = ? ORDER BY TM1.EmprCod, TM1.MComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK11", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MComCod FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MComCod FROM TXPMRepCo WHERE ( EmprCod > ? or EmprCod = ? and MComCod > ?) ORDER BY EmprCod, MComCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AK14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MComCod FROM TXPMRepCo WHERE ( EmprCod < ? or EmprCod = ? and MComCod < ?) ORDER BY EmprCod DESC, MComCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AK15", "INSERT INTO TXPMRepCo(MComCod, MComExt, MComFch, MComSolFch, MComEntFch, MComEst, MComOri, EmprCod, PrvNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMRepCo")
         ,new UpdateCursor("T01AK16", "UPDATE TXPMRepCo SET MComExt=?, MComFch=?, MComSolFch=?, MComEntFch=?, MComEst=?, MComOri=?, PrvNum=?  WHERE EmprCod = ? AND MComCod = ?", GX_NOMASK, "TXPMRepCo")
         ,new UpdateCursor("T01AK17", "DELETE FROM TXPMRepCo  WHERE EmprCod = ? AND MComCod = ?", GX_NOMASK, "TXPMRepCo")
         ,new ForEachCursor("T01AK18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK19", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MComCod FROM TXPMRepCo ORDER BY EmprCod, MComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK21", "SELECT T1.MComCod, T2.MRNom, T1.MComSolCnt, T1.MComSolPre, T1.MComEntCnt, T1.MComEntPre, T2.MRStkPre, T1.MComLote, T1.EmprCod, T1.MRCod FROM (TXPMRepC1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) WHERE T1.EmprCod = ? and T1.MComCod = ? and T1.MRCod = ? ORDER BY T1.EmprCod, T1.MComCod, T1.MRCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK22", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (EmprCod = ?) AND (MRCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK23", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK24", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK25", "SELECT MRNom, MRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK26", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK27", "SELECT EmprCod, MComCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? AND MComCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK28", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AK29", "INSERT INTO TXPMRepC1(MComCod, MComSolCnt, MComSolPre, MComEntCnt, MComEntPre, MComLote, EmprCod, MRCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMRepC1")
         ,new UpdateCursor("T01AK30", "UPDATE TXPMRepC1 SET MComSolCnt=?, MComSolPre=?, MComEntCnt=?, MComEntPre=?, MComLote=?  WHERE EmprCod = ? AND MComCod = ? AND MRCod = ?", GX_NOMASK, "TXPMRepC1")
         ,new UpdateCursor("T01AK31", "DELETE FROM TXPMRepC1  WHERE EmprCod = ? AND MComCod = ? AND MRCod = ?", GX_NOMASK, "TXPMRepC1")
         ,new ForEachCursor("T01AK32", "SELECT MRNom, MRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK33", "SELECT EmprCod, MComCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? and MComCod = ? ORDER BY EmprCod, MComCod, MRCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK34", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom FROM TXPMREPUE WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, '')))) like '%' || UPPER(?)) ORDER BY MRCNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK35", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK36", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AK37", "SELECT MRNom, MRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 19 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[9]).intValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               stmt.setString(8, (String)parms[8], 3);
               stmt.setLong(9, ((Number) parms[9]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
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
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 20);
               }
               stmt.setString(7, (String)parms[7], 3);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               return;
            case 28 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 20);
               }
               stmt.setString(6, (String)parms[6], 3);
               stmt.setLong(7, ((Number) parms[7]).longValue());
               stmt.setInt(8, ((Number) parms[8]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 255);
               return;
            case 33 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 34 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

