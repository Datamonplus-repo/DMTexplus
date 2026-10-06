package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tminvst_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9398MISCod = (int)(GXutil.lval( httpContext.GetPar( "MISCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         A9399MISFch = localUtil.parseDateParm( httpContext.GetPar( "MISFch")) ;
         n9399MISFch = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9399MISFch", localUtil.format(A9399MISFch, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_13Q1228( Gx_mode, A396EmprCod, A9398MISCod, A9399MISFch) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_13Q1229( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MISRCOD") == 0 )
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
         gxsgamisrcod13Q0( A396EmprCod, A13718MRCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MISRCOD") == 0 )
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
         gxsgamisrcod13Q0( A396EmprCod, A13718MRCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"MISRCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h9403MISRCod = httpContext.GetPar( "h9403MISRCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcamisrcod13Q1229( A396EmprCod, h9403MISRCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"MISCOD") == 0 )
      {
         AV13MISCod = (int)(GXutil.lval( httpContext.GetPar( "MISCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MISCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MISCod), "ZZZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asamiscod13Q1228( AV13MISCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"MISCOD") == 0 )
      {
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
         gx4asamiscod13Q1228( Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9403MISRCod = (int)(GXutil.lval( httpContext.GetPar( "MISRCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A9403MISRCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
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
            AV20EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
            AV13MISCod = (int)(GXutil.lval( httpContext.GetPar( "MISCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MISCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MISCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Inventarios de Stock", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMISFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_46 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_46"))) ;
      nGXsfl_46_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_46_idx"))) ;
      sGXsfl_46_idx = httpContext.GetPar( "sGXsfl_46_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tminvst_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tminvst_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tminvst_impl.class ));
   }

   public tminvst_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMISEst = new HTMLChoice();
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
      if ( cmbMISEst.getItemCount() > 0 )
      {
         A9402MISEst = cmbMISEst.getValidValue(A9402MISEst) ;
         n9402MISEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9402MISEst", A9402MISEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMISEst.setValue( GXutil.rtrim( A9402MISEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMISEst.getInternalname(), "Values", cmbMISEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISCod_Internalname, httpContext.getMessage( "Inventario de Stock", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9398MISCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9398MISCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMISCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISFch_Internalname, httpContext.getMessage( "Fecha del Inventario", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMISFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISFch_Internalname, localUtil.format(A9399MISFch, "99/99/99"), localUtil.format( A9399MISFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMISFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMInvSt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMISFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMISFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMInvSt.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMISEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMISEst.getInternalname(), httpContext.getMessage( "Estado del Inventario", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMISEst, cmbMISEst.getInternalname(), GXutil.rtrim( A9402MISEst), 1, cmbMISEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMISEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMInvSt.htm");
      cmbMISEst.setValue( GXutil.rtrim( A9402MISEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMISEst.getInternalname(), "Values", cmbMISEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISUsuCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISUsuCre_Internalname, httpContext.getMessage( "Usuario que creo el Inventario", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISUsuCre_Internalname, GXutil.rtrim( A9400MISUsuCre), GXutil.rtrim( localUtil.format( A9400MISUsuCre, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISUsuCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMISUsuCre_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMISFchCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMISFchCre_Internalname, httpContext.getMessage( "Fecha de Creación del Invent.", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMISFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMISFchCre_Internalname, localUtil.ttoc( A9401MISFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9401MISFchCre, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMISFchCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMISFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMInvSt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMISFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMISFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMInvSt.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, divTableleaflevel_level1_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMInvSt.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMInvSt.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMInvSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol46( ) ;
      nGXsfl_46_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1229 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1229 = (short)(1) ;
            scanStart13Q1229( ) ;
            while ( RcdFound1229 != 0 )
            {
               init_level_properties1229( ) ;
               getByPrimaryKey13Q1229( ) ;
               addRow13Q1229( ) ;
               scanNext13Q1229( ) ;
            }
            scanEnd13Q1229( ) ;
            nBlankRcdCount1229 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13Q1229( ) ;
         standaloneModal13Q1229( ) ;
         sMode1229 = Gx_mode ;
         while ( nGXsfl_46_idx < nRC_GXsfl_46 )
         {
            bGXsfl_46_Refreshing = true ;
            readRow13Q1229( ) ;
            edtMISRCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRCOD_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMISRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRCod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
            edtMISRNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRNOM_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMISRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRNom_Enabled), 5, 0), !bGXsfl_46_Refreshing);
            edtMISRStkAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRSTKACT_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMISRStkAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkAct_Enabled), 5, 0), !bGXsfl_46_Refreshing);
            edtMISRStkTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRSTKTEO_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMISRStkTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkTeo_Enabled), 5, 0), !bGXsfl_46_Refreshing);
            edtMISRStkRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRSTKREA_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMISRStkRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkRea_Enabled), 5, 0), !bGXsfl_46_Refreshing);
            edtMISRStkDif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRSTKDIF_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMISRStkDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkDif_Enabled), 5, 0), !bGXsfl_46_Refreshing);
            if ( ( nRcdExists_1229 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13Q1229( ) ;
            }
            sendRow13Q1229( ) ;
            bGXsfl_46_Refreshing = false ;
         }
         Gx_mode = sMode1229 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1229 = (short)(1) ;
         nRcdExists_1229 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13Q1229( ) ;
            while ( RcdFound1229 != 0 )
            {
               sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_461229( ) ;
               init_level_properties1229( ) ;
               standaloneNotModal13Q1229( ) ;
               getByPrimaryKey13Q1229( ) ;
               standaloneModal13Q1229( ) ;
               addRow13Q1229( ) ;
               scanNext13Q1229( ) ;
            }
            scanEnd13Q1229( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1229 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_461229( ) ;
         initAll13Q1229( ) ;
         init_level_properties1229( ) ;
         nRcdExists_1229 = (short)(0) ;
         nIsMod_1229 = (short)(0) ;
         nRcdDeleted_1229 = (short)(0) ;
         nBlankRcdCount1229 = (short)(nBlankRcdUsr1229+nBlankRcdCount1229) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1229 > 0 )
         {
            standaloneNotModal13Q1229( ) ;
            standaloneModal13Q1229( ) ;
            addRow13Q1229( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMISRStkRea_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1229 = (short)(nBlankRcdCount1229-1) ;
         }
         Gx_mode = sMode1229 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
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
      e1113Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9398MISCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9398MISCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9399MISFch = localUtil.ctod( httpContext.cgiGet( "Z9399MISFch"), 0) ;
            Z9400MISUsuCre = httpContext.cgiGet( "Z9400MISUsuCre") ;
            Z9401MISFchCre = localUtil.ctot( httpContext.cgiGet( "Z9401MISFchCre"), 0) ;
            Z9402MISEst = httpContext.cgiGet( "Z9402MISEst") ;
            Z11303MISFchApl = localUtil.ctod( httpContext.cgiGet( "Z11303MISFchApl"), 0) ;
            A11303MISFchApl = localUtil.ctod( httpContext.cgiGet( "Z11303MISFchApl"), 0) ;
            n11303MISFchApl = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV13MISCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11303MISFchApl = localUtil.ctod( httpContext.cgiGet( "MISFCHAPL"), 0) ;
            AV25Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV19ServerNow = localUtil.ctot( httpContext.cgiGet( "vSERVERNOW"), 0) ;
            AV15oMMSRCnt = localUtil.ctond( httpContext.cgiGet( "vOMMSRCNT")) ;
            AV18nMMSRCnt = localUtil.ctond( httpContext.cgiGet( "vNMMSRCNT")) ;
            A9403MISRCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCMISRCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17MTMovNom = httpContext.cgiGet( "vMTMOVNOM") ;
            AV16MTMovCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMTMOVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A9398MISCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMISCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtMISFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MISFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMISFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9399MISFch = GXutil.nullDate() ;
               n9399MISFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9399MISFch", localUtil.format(A9399MISFch, "99/99/99"));
            }
            else
            {
               A9399MISFch = localUtil.ctod( httpContext.cgiGet( edtMISFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9399MISFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9399MISFch", localUtil.format(A9399MISFch, "99/99/99"));
            }
            cmbMISEst.setName( cmbMISEst.getInternalname() );
            cmbMISEst.setValue( httpContext.cgiGet( cmbMISEst.getInternalname()) );
            A9402MISEst = httpContext.cgiGet( cmbMISEst.getInternalname()) ;
            n9402MISEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9402MISEst", A9402MISEst);
            A9400MISUsuCre = httpContext.cgiGet( edtMISUsuCre_Internalname) ;
            n9400MISUsuCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9400MISUsuCre", A9400MISUsuCre);
            A9401MISFchCre = localUtil.ctot( httpContext.cgiGet( edtMISFchCre_Internalname)) ;
            n9401MISFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9401MISFchCre", localUtil.ttoc( A9401MISFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMInvSt");
            A9400MISUsuCre = httpContext.cgiGet( edtMISUsuCre_Internalname) ;
            n9400MISUsuCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9400MISUsuCre", A9400MISUsuCre);
            forbiddenHiddens.add("MISUsuCre", GXutil.rtrim( localUtil.format( A9400MISUsuCre, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A9401MISFchCre = localUtil.ctot( httpContext.cgiGet( edtMISFchCre_Internalname)) ;
            n9401MISFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9401MISFchCre", localUtil.ttoc( A9401MISFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("MISFchCre", localUtil.format( A9401MISFchCre, "99/99/99 99:99"));
            A9402MISEst = httpContext.cgiGet( cmbMISEst.getInternalname()) ;
            n9402MISEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9402MISEst", A9402MISEst);
            forbiddenHiddens.add("MISEst", GXutil.rtrim( localUtil.format( A9402MISEst, "")));
            forbiddenHiddens.add("MISFchApl", localUtil.format(A11303MISFchApl, "99/99/99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A9398MISCod != Z9398MISCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tminvst:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A9398MISCod = (int)(GXutil.lval( httpContext.GetPar( "MISCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV13MISCod) )
               {
                  A9398MISCod = AV13MISCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A9398MISCod = AV13MISCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
                  }
               }
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode1228 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV13MISCod) )
                  {
                     A9398MISCod = AV13MISCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A9398MISCod = AV13MISCod ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
                     }
                  }
                  Gx_mode = sMode1228 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1228 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_13Q0( ) ;
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
                        e1113Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1213Q2 ();
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
         e1213Q2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13Q1228( ) ;
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
         disableAttributes13Q1228( ) ;
      }
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

   public void confirm_13Q0( )
   {
      beforeValidate13Q1228( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13Q1228( ) ;
         }
         else
         {
            checkExtendedTable13Q1228( ) ;
            closeExtendedTableCursors13Q1228( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1228 = Gx_mode ;
         confirm_13Q1229( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1228 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1228 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_13Q1229( )
   {
      nGXsfl_46_idx = 0 ;
      while ( nGXsfl_46_idx < nRC_GXsfl_46 )
      {
         readRow13Q1229( ) ;
         if ( ( nRcdExists_1229 != 0 ) || ( nIsMod_1229 != 0 ) )
         {
            getKey13Q1229( ) ;
            if ( ( nRcdExists_1229 == 0 ) && ( nRcdDeleted_1229 == 0 ) )
            {
               if ( RcdFound1229 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13Q1229( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13Q1229( ) ;
                     closeExtendedTableCursors13Q1229( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound1229 != 0 )
               {
                  if ( nRcdDeleted_1229 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13Q1229( ) ;
                     load13Q1229( ) ;
                     beforeValidate13Q1229( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13Q1229( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1229 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13Q1229( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13Q1229( ) ;
                           closeExtendedTableCursors13Q1229( ) ;
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
                  if ( nRcdDeleted_1229 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtMISRCod_Internalname, h9403MISRCod) ;
         httpContext.changePostValue( edtMISRNom_Internalname, GXutil.rtrim( A9404MISRNom)) ;
         httpContext.changePostValue( edtMISRStkAct_Internalname, GXutil.ltrim( localUtil.ntoc( A9405MISRStkAct, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMISRStkTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A9406MISRStkTeo, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMISRStkRea_Internalname, GXutil.ltrim( localUtil.ntoc( A9407MISRStkRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMISRStkDif_Internalname, GXutil.ltrim( localUtil.ntoc( A9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9403MISRCod_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z9403MISRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9408MISRStkDif_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9406MISRStkTeo_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z9406MISRStkTeo, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9407MISRStkRea_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z9407MISRStkRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9408MISRStkDif_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( O9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1229_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1229, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1229_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1229, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1229_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1229, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1229 != 0 )
         {
            httpContext.changePostValue( "MISRCOD_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRNOM_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRSTKACT_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRSTKTEO_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRSTKREA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRSTKDIF_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkDif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption13Q0( )
   {
   }

   public void e1113Q2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tminvst_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV25Pgmname, (byte)(99), GXv_char2) ;
      tminvst_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tminvst_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tminvst_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      tminvst_impl.this.A396EmprCod = GXv_char2[0] ;
      tminvst_impl.this.AV14EmprNom = GXv_char3[0] ;
      tminvst_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "IS", "") ;
      GXv_int5[0] = AV16MTMovCod ;
      GXv_char2[0] = AV17MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_char2) ;
      tminvst_impl.this.A396EmprCod = GXv_char4[0] ;
      tminvst_impl.this.AV16MTMovCod = GXv_int5[0] ;
      tminvst_impl.this.AV17MTMovNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovNom", AV17MTMovNom);
      GXt_char1 = AV11Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tminvst_impl.this.GXt_char1 = GXv_char4[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char4[0] = AV20EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char4, GXv_char3, GXv_char2) ;
      tminvst_impl.this.AV20EmprCod = GXv_char4[0] ;
      tminvst_impl.this.AV14EmprNom = GXv_char3[0] ;
      tminvst_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext6[0] = AV21WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext6) ;
      AV21WWPContext = GXv_SdtWWPContext6[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV22TrnContext.fromxml(AV23WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e1213Q2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV22TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tminvstww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm13Q1228( int GX_JID )
   {
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9399MISFch = T013Q6_A9399MISFch[0] ;
            Z9400MISUsuCre = T013Q6_A9400MISUsuCre[0] ;
            Z9401MISFchCre = T013Q6_A9401MISFchCre[0] ;
            Z9402MISEst = T013Q6_A9402MISEst[0] ;
            Z11303MISFchApl = T013Q6_A11303MISFchApl[0] ;
         }
         else
         {
            Z9399MISFch = A9399MISFch ;
            Z9400MISUsuCre = A9400MISUsuCre ;
            Z9401MISFchCre = A9401MISFchCre ;
            Z9402MISEst = A9402MISEst ;
            Z11303MISFchApl = A11303MISFchApl ;
         }
      }
      if ( GX_JID == -27 )
      {
         Z9398MISCod = A9398MISCod ;
         Z9399MISFch = A9399MISFch ;
         Z9400MISUsuCre = A9400MISUsuCre ;
         Z9401MISFchCre = A9401MISFchCre ;
         Z9402MISEst = A9402MISEst ;
         Z11303MISFchApl = A11303MISFchApl ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      divTableleaflevel_level1_Visible = (((GXutil.strcmp(Gx_mode, httpContext.getMessage( httpContext.getMessage( "INS", ""), ""))!=0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTableleaflevel_level1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableleaflevel_level1_Visible), 5, 0), true);
      edtMISUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISUsuCre_Enabled), 5, 0), true);
      edtMISFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISFchCre_Enabled), 5, 0), true);
      cmbMISEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMISEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMISEst.getEnabled(), 5, 0), true);
      AV25Pgmname = "MantenimientoMaquina.TMInvSt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMISCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISCod_Enabled), 5, 0), true);
      edtMISUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISUsuCre_Enabled), 5, 0), true);
      edtMISFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISFchCre_Enabled), 5, 0), true);
      cmbMISEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMISEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMISEst.getEnabled(), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         A396EmprCod = AV20EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T013Q7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T013Q7_A407EmprNom[0] ;
      n407EmprNom = T013Q7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13MISCod) )
      {
         edtMISCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMISCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtMISCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMISCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISCod_Enabled), 5, 0), true);
         }
         else
         {
            edtMISCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMISCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISCod_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV13MISCod) )
      {
         edtMISCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMISCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ! (0==AV13MISCod) )
      {
         A9398MISCod = AV13MISCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9398MISCod = AV13MISCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
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
      if ( isIns( )  && (GXutil.strcmp("", A9400MISUsuCre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9400MISUsuCre = AV8UsurCod ;
         n9400MISUsuCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9400MISUsuCre", A9400MISUsuCre);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A9401MISFchCre) && ( Gx_BScreen == 0 ) )
      {
         A9401MISFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n9401MISFchCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9401MISFchCre", localUtil.ttoc( A9401MISFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && (GXutil.strcmp("", A9402MISEst)==0) && ( Gx_BScreen == 0 ) )
      {
         A9402MISEst = httpContext.getMessage( httpContext.getMessage( "E", ""), "") ;
         n9402MISEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9402MISEst", A9402MISEst);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 )
         {
            bttBtntrn_delete_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         }
         else
         {
            if ( ! ( ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) )
            {
               bttBtntrn_delete_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
            }
         }
      }
   }

   public void load13Q1228( )
   {
      /* Using cursor T013Q8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1228 = (short)(1) ;
         A407EmprNom = T013Q8_A407EmprNom[0] ;
         n407EmprNom = T013Q8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9399MISFch = T013Q8_A9399MISFch[0] ;
         n9399MISFch = T013Q8_n9399MISFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9399MISFch", localUtil.format(A9399MISFch, "99/99/99"));
         A9400MISUsuCre = T013Q8_A9400MISUsuCre[0] ;
         n9400MISUsuCre = T013Q8_n9400MISUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9400MISUsuCre", A9400MISUsuCre);
         A9401MISFchCre = T013Q8_A9401MISFchCre[0] ;
         n9401MISFchCre = T013Q8_n9401MISFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9401MISFchCre", localUtil.ttoc( A9401MISFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9402MISEst = T013Q8_A9402MISEst[0] ;
         n9402MISEst = T013Q8_n9402MISEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9402MISEst", A9402MISEst);
         A11303MISFchApl = T013Q8_A11303MISFchApl[0] ;
         n11303MISFchApl = T013Q8_n11303MISFchApl[0] ;
         zm13Q1228( -27) ;
      }
      pr_default.close(6);
      onLoadActions13Q1228( ) ;
   }

   public void onLoadActions13Q1228( )
   {
      if ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 )
      {
         bttBtntrn_delete_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) )
         {
            bttBtntrn_delete_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         }
      }
   }

   public void checkExtendedTable13Q1228( )
   {
      nIsDirty_1228 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 )
      {
         bttBtntrn_delete_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) )
         {
            bttBtntrn_delete_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         }
      }
   }

   public void closeExtendedTableCursors13Q1228( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey13Q1228( )
   {
      /* Using cursor T013Q9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1228 = (short)(1) ;
      }
      else
      {
         RcdFound1228 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013Q6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T013Q6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm13Q1228( 27) ;
         RcdFound1228 = (short)(1) ;
         A9398MISCod = T013Q6_A9398MISCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         A9399MISFch = T013Q6_A9399MISFch[0] ;
         n9399MISFch = T013Q6_n9399MISFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9399MISFch", localUtil.format(A9399MISFch, "99/99/99"));
         A9400MISUsuCre = T013Q6_A9400MISUsuCre[0] ;
         n9400MISUsuCre = T013Q6_n9400MISUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9400MISUsuCre", A9400MISUsuCre);
         A9401MISFchCre = T013Q6_A9401MISFchCre[0] ;
         n9401MISFchCre = T013Q6_n9401MISFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9401MISFchCre", localUtil.ttoc( A9401MISFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9402MISEst = T013Q6_A9402MISEst[0] ;
         n9402MISEst = T013Q6_n9402MISEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9402MISEst", A9402MISEst);
         A11303MISFchApl = T013Q6_A11303MISFchApl[0] ;
         n11303MISFchApl = T013Q6_n11303MISFchApl[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9398MISCod = A9398MISCod ;
         sMode1228 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13Q1228( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1228 = (short)(0) ;
            initializeNonKey13Q1228( ) ;
         }
         Gx_mode = sMode1228 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1228 = (short)(0) ;
         initializeNonKey13Q1228( ) ;
         sMode1228 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1228 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey13Q1228( ) ;
      if ( RcdFound1228 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1228 = (short)(0) ;
      /* Using cursor T013Q10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A9398MISCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T013Q10_A9398MISCod[0] < A9398MISCod ) ) && ( GXutil.strcmp(T013Q10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T013Q10_A9398MISCod[0] > A9398MISCod ) ) && ( GXutil.strcmp(T013Q10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9398MISCod = T013Q10_A9398MISCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
            RcdFound1228 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1228 = (short)(0) ;
      /* Using cursor T013Q11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A9398MISCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T013Q11_A9398MISCod[0] > A9398MISCod ) ) && ( GXutil.strcmp(T013Q11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T013Q11_A9398MISCod[0] < A9398MISCod ) ) && ( GXutil.strcmp(T013Q11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9398MISCod = T013Q11_A9398MISCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
            RcdFound1228 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13Q1228( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMISFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13Q1228( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1228 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9398MISCod != Z9398MISCod ) )
            {
               A9398MISCod = Z9398MISCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMISFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update13Q1228( ) ;
               GX_FocusControl = edtMISFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9398MISCod != Z9398MISCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtMISFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13Q1228( ) ;
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
                  GX_FocusControl = edtMISFch_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13Q1228( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9398MISCod != Z9398MISCod ) )
      {
         A9398MISCod = Z9398MISCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMISFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency13Q1228( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013Q5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMINVST"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z9399MISFch), GXutil.resetTime(T013Q5_A9399MISFch[0])) ) || ( GXutil.strcmp(Z9400MISUsuCre, T013Q5_A9400MISUsuCre[0]) != 0 ) || !( GXutil.dateCompare(Z9401MISFchCre, T013Q5_A9401MISFchCre[0]) ) || ( GXutil.strcmp(Z9402MISEst, T013Q5_A9402MISEst[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z11303MISFchApl), GXutil.resetTime(T013Q5_A11303MISFchApl[0])) ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9399MISFch), GXutil.resetTime(T013Q5_A9399MISFch[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tminvst:[seudo value changed for attri]"+"MISFch");
               GXutil.writeLogRaw("Old: ",Z9399MISFch);
               GXutil.writeLogRaw("Current: ",T013Q5_A9399MISFch[0]);
            }
            if ( GXutil.strcmp(Z9400MISUsuCre, T013Q5_A9400MISUsuCre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tminvst:[seudo value changed for attri]"+"MISUsuCre");
               GXutil.writeLogRaw("Old: ",Z9400MISUsuCre);
               GXutil.writeLogRaw("Current: ",T013Q5_A9400MISUsuCre[0]);
            }
            if ( !( GXutil.dateCompare(Z9401MISFchCre, T013Q5_A9401MISFchCre[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tminvst:[seudo value changed for attri]"+"MISFchCre");
               GXutil.writeLogRaw("Old: ",Z9401MISFchCre);
               GXutil.writeLogRaw("Current: ",T013Q5_A9401MISFchCre[0]);
            }
            if ( GXutil.strcmp(Z9402MISEst, T013Q5_A9402MISEst[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tminvst:[seudo value changed for attri]"+"MISEst");
               GXutil.writeLogRaw("Old: ",Z9402MISEst);
               GXutil.writeLogRaw("Current: ",T013Q5_A9402MISEst[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11303MISFchApl), GXutil.resetTime(T013Q5_A11303MISFchApl[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tminvst:[seudo value changed for attri]"+"MISFchApl");
               GXutil.writeLogRaw("Old: ",Z11303MISFchApl);
               GXutil.writeLogRaw("Current: ",T013Q5_A11303MISFchApl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMINVST"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13Q1228( )
   {
      beforeValidate13Q1228( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13Q1228( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13Q1228( 0) ;
         checkOptimisticConcurrency13Q1228( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13Q1228( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13Q1228( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013Q12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A9398MISCod), Boolean.valueOf(n9399MISFch), A9399MISFch, Boolean.valueOf(n9400MISUsuCre), A9400MISUsuCre, Boolean.valueOf(n9401MISFchCre), A9401MISFchCre, Boolean.valueOf(n9402MISEst), A9402MISEst, Boolean.valueOf(n11303MISFchApl), A11303MISFchApl, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMINVST");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel13Q1228( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         else
         {
            load13Q1228( ) ;
         }
         endLevel13Q1228( ) ;
      }
      closeExtendedTableCursors13Q1228( ) ;
   }

   public void update13Q1228( )
   {
      beforeValidate13Q1228( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13Q1228( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13Q1228( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13Q1228( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13Q1228( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013Q13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n9399MISFch), A9399MISFch, Boolean.valueOf(n9400MISUsuCre), A9400MISUsuCre, Boolean.valueOf(n9401MISFchCre), A9401MISFchCre, Boolean.valueOf(n9402MISEst), A9402MISEst, Boolean.valueOf(n11303MISFchApl), A11303MISFchApl, A396EmprCod, Integer.valueOf(A9398MISCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMINVST");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMINVST"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13Q1228( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13Q1228( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
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
         endLevel13Q1228( ) ;
      }
      closeExtendedTableCursors13Q1228( ) ;
   }

   public void deferredUpdate13Q1228( )
   {
   }

   public void delete( )
   {
      beforeValidate13Q1228( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13Q1228( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13Q1228( ) ;
         afterConfirm13Q1228( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13Q1228( ) ;
            if ( AnyError == 0 )
            {
               scanStart13Q1229( ) ;
               while ( RcdFound1229 != 0 )
               {
                  getByPrimaryKey13Q1229( ) ;
                  delete13Q1229( ) ;
                  scanNext13Q1229( ) ;
               }
               scanEnd13Q1229( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013Q14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMINVST");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
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
      sMode1228 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13Q1228( ) ;
      Gx_mode = sMode1228 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13Q1228( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 )
         {
            bttBtntrn_delete_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         }
         else
         {
            if ( ! ( ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) )
            {
               bttBtntrn_delete_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
            }
         }
      }
   }

   public void processNestedLevel13Q1229( )
   {
      nGXsfl_46_idx = 0 ;
      while ( nGXsfl_46_idx < nRC_GXsfl_46 )
      {
         readRow13Q1229( ) ;
         if ( ( nRcdExists_1229 != 0 ) || ( nIsMod_1229 != 0 ) )
         {
            standaloneNotModal13Q1229( ) ;
            getKey13Q1229( ) ;
            if ( ( nRcdExists_1229 == 0 ) && ( nRcdDeleted_1229 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13Q1229( ) ;
            }
            else
            {
               if ( RcdFound1229 != 0 )
               {
                  if ( ( nRcdDeleted_1229 != 0 ) && ( nRcdExists_1229 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13Q1229( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1229 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13Q1229( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1229 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtMISRCod_Internalname, h9403MISRCod) ;
         httpContext.changePostValue( edtMISRNom_Internalname, GXutil.rtrim( A9404MISRNom)) ;
         httpContext.changePostValue( edtMISRStkAct_Internalname, GXutil.ltrim( localUtil.ntoc( A9405MISRStkAct, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMISRStkTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A9406MISRStkTeo, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMISRStkRea_Internalname, GXutil.ltrim( localUtil.ntoc( A9407MISRStkRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMISRStkDif_Internalname, GXutil.ltrim( localUtil.ntoc( A9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9403MISRCod_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z9403MISRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9408MISRStkDif_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9406MISRStkTeo_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z9406MISRStkTeo, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9407MISRStkRea_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( Z9407MISRStkRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9408MISRStkDif_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( O9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1229_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1229, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1229_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1229, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1229_"+sGXsfl_46_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1229, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1229 != 0 )
         {
            httpContext.changePostValue( "MISRCOD_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRNOM_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRSTKACT_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRSTKTEO_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRSTKREA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MISRSTKDIF_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkDif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13Q1229( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1229 = (short)(0) ;
      nIsMod_1229 = (short)(0) ;
      nRcdDeleted_1229 = (short)(0) ;
   }

   public void processLevel13Q1228( )
   {
      /* Save parent mode. */
      sMode1228 = Gx_mode ;
      processNestedLevel13Q1229( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1228 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13Q1228( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13Q1228( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tminvst");
         if ( AnyError == 0 )
         {
            confirmValues13Q0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tminvst");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13Q1228( )
   {
      /* Scan By routine */
      /* Using cursor T013Q15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1228 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1228 = (short)(1) ;
         A9398MISCod = T013Q15_A9398MISCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13Q1228( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1228 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1228 = (short)(1) ;
         A9398MISCod = T013Q15_A9398MISCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      }
   }

   public void scanEnd13Q1228( )
   {
      pr_default.close(13);
   }

   public void afterConfirm13Q1228( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXt_int7 = A9398MISCod ;
         GXv_int5[0] = GXt_int7 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTIST", ""), ""), GXv_int5) ;
         tminvst_impl.this.GXt_int7 = GXv_int5[0] ;
         A9398MISCod = GXt_int7 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      }
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9398MISCod ;
         new app.mantenimientomaquina.pmisdef(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
         tminvst_impl.this.A396EmprCod = GXv_char4[0] ;
         tminvst_impl.this.A9398MISCod = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      }
   }

   public void beforeInsert13Q1228( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13Q1228( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13Q1228( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13Q1228( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13Q1228( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13Q1228( )
   {
      edtMISCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISCod_Enabled), 5, 0), true);
      edtMISFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISFch_Enabled), 5, 0), true);
      cmbMISEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMISEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMISEst.getEnabled(), 5, 0), true);
      edtMISUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISUsuCre_Enabled), 5, 0), true);
      edtMISFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISFchCre_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm13Q1229( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9408MISRStkDif = T013Q3_A9408MISRStkDif[0] ;
            Z9406MISRStkTeo = T013Q3_A9406MISRStkTeo[0] ;
            Z9407MISRStkRea = T013Q3_A9407MISRStkRea[0] ;
         }
         else
         {
            Z9408MISRStkDif = A9408MISRStkDif ;
            Z9406MISRStkTeo = A9406MISRStkTeo ;
            Z9407MISRStkRea = A9407MISRStkRea ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z9398MISCod = A9398MISCod ;
         Z9408MISRStkDif = A9408MISRStkDif ;
         Z9406MISRStkTeo = A9406MISRStkTeo ;
         Z9407MISRStkRea = A9407MISRStkRea ;
         Z396EmprCod = A396EmprCod ;
         Z9403MISRCod = A9403MISRCod ;
         Z9404MISRNom = A9404MISRNom ;
         Z9405MISRStkAct = A9405MISRStkAct ;
      }
   }

   public void standaloneNotModal13Q1229( )
   {
      edtMISRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRCod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRStkTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkTeo_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRStkDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkDif_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRNom_Enabled), 5, 0), !bGXsfl_46_Refreshing);
   }

   public void standaloneModal13Q1229( )
   {
   }

   public void load13Q1229( )
   {
      /* Using cursor T013Q16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1229 = (short)(1) ;
         A9408MISRStkDif = T013Q16_A9408MISRStkDif[0] ;
         A9404MISRNom = T013Q16_A9404MISRNom[0] ;
         n9404MISRNom = T013Q16_n9404MISRNom[0] ;
         A9405MISRStkAct = T013Q16_A9405MISRStkAct[0] ;
         n9405MISRStkAct = T013Q16_n9405MISRStkAct[0] ;
         A9406MISRStkTeo = T013Q16_A9406MISRStkTeo[0] ;
         A9407MISRStkRea = T013Q16_A9407MISRStkRea[0] ;
         zm13Q1229( -29) ;
      }
      pr_default.close(14);
      onLoadActions13Q1229( ) ;
   }

   public void onLoadActions13Q1229( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* Level */ && true /* After */ )
      {
         A9408MISRStkDif = A9407MISRStkRea.subtract(A9406MISRStkTeo) ;
      }
      /* Using cursor T013Q17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
      h9403MISRCod = "" ;
      while ( (pr_default.getStatus(15) != 101) )
      {
         h9403MISRCod = T013Q17_A13718MRCNom[0] ;
         if (true) break;
      }
      pr_default.close(15);
      httpContext.ajax_rsp_assign_attri("", false, "h9403MISRCod", h9403MISRCod);
   }

   public void checkExtendedTable13Q1229( )
   {
      nIsDirty_1229 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13Q1229( ) ;
      /* Using cursor T013Q4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MISRCOD_" + sGXsfl_46_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MISRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMISRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9404MISRNom = T013Q4_A9404MISRNom[0] ;
      n9404MISRNom = T013Q4_n9404MISRNom[0] ;
      A9405MISRStkAct = T013Q4_A9405MISRStkAct[0] ;
      n9405MISRStkAct = T013Q4_n9405MISRStkAct[0] ;
      pr_default.close(2);
      if ( ( isIns( )  || isUpd( )  ) && true /* Level */ && true /* After */ )
      {
         nIsDirty_1229 = (short)(1) ;
         A9408MISRStkDif = A9407MISRStkRea.subtract(A9406MISRStkTeo) ;
      }
   }

   public void closeExtendedTableCursors13Q1229( )
   {
      pr_default.close(2);
   }

   public void enableDisable13Q1229( )
   {
   }

   public void gxload_30( String A396EmprCod ,
                          int A9403MISRCod )
   {
      /* Using cursor T013Q18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "MISRCOD_" + sGXsfl_46_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MISRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMISRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9404MISRNom = T013Q18_A9404MISRNom[0] ;
      n9404MISRNom = T013Q18_n9404MISRNom[0] ;
      A9405MISRStkAct = T013Q18_A9405MISRStkAct[0] ;
      n9405MISRStkAct = T013Q18_n9405MISRStkAct[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9404MISRNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9405MISRStkAct, (byte)(10), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey13Q1229( )
   {
      /* Using cursor T013Q19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1229 = (short)(1) ;
      }
      else
      {
         RcdFound1229 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey13Q1229( )
   {
      /* Using cursor T013Q3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T013Q3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm13Q1229( 29) ;
         RcdFound1229 = (short)(1) ;
         initializeNonKey13Q1229( ) ;
         A9408MISRStkDif = T013Q3_A9408MISRStkDif[0] ;
         A9406MISRStkTeo = T013Q3_A9406MISRStkTeo[0] ;
         A9407MISRStkRea = T013Q3_A9407MISRStkRea[0] ;
         A9403MISRCod = T013Q3_A9403MISRCod[0] ;
         O9408MISRStkDif = A9408MISRStkDif ;
         Z396EmprCod = A396EmprCod ;
         Z9398MISCod = A9398MISCod ;
         Z9403MISRCod = A9403MISRCod ;
         sMode1229 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13Q1229( ) ;
         Gx_mode = sMode1229 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1229 = (short)(0) ;
         initializeNonKey13Q1229( ) ;
         sMode1229 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13Q1229( ) ;
         Gx_mode = sMode1229 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13Q1229( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency13Q1229( )
   {
      if ( isDlt( ) )
      {
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T013Q2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMInSRe"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9408MISRStkDif, T013Q2_A9408MISRStkDif[0]) != 0 ) || ( DecimalUtil.compareTo(Z9406MISRStkTeo, T013Q2_A9406MISRStkTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z9407MISRStkRea, T013Q2_A9407MISRStkRea[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9408MISRStkDif, T013Q2_A9408MISRStkDif[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tminvst:[seudo value changed for attri]"+"MISRStkDif");
               GXutil.writeLogRaw("Old: ",Z9408MISRStkDif);
               GXutil.writeLogRaw("Current: ",T013Q2_A9408MISRStkDif[0]);
            }
            if ( DecimalUtil.compareTo(Z9406MISRStkTeo, T013Q2_A9406MISRStkTeo[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tminvst:[seudo value changed for attri]"+"MISRStkTeo");
               GXutil.writeLogRaw("Old: ",Z9406MISRStkTeo);
               GXutil.writeLogRaw("Current: ",T013Q2_A9406MISRStkTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z9407MISRStkRea, T013Q2_A9407MISRStkRea[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tminvst:[seudo value changed for attri]"+"MISRStkRea");
               GXutil.writeLogRaw("Old: ",Z9407MISRStkRea);
               GXutil.writeLogRaw("Current: ",T013Q2_A9407MISRStkRea[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMInSRe"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13Q1229( )
   {
      beforeValidate13Q1229( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13Q1229( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13Q1229( 0) ;
         checkOptimisticConcurrency13Q1229( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13Q1229( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13Q1229( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013Q20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A9398MISCod), A9408MISRStkDif, A9406MISRStkTeo, A9407MISRStkRea, A396EmprCod, Integer.valueOf(A9403MISRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMInSRe");
                  if ( (pr_default.getStatus(18) == 1) )
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
            load13Q1229( ) ;
         }
         endLevel13Q1229( ) ;
      }
      closeExtendedTableCursors13Q1229( ) ;
   }

   public void update13Q1229( )
   {
      beforeValidate13Q1229( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13Q1229( ) ;
      }
      if ( ( nIsMod_1229 != 0 ) || ( nIsDirty_1229 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13Q1229( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13Q1229( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13Q1229( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013Q21 */
                     pr_default.execute(19, new Object[] {A9408MISRStkDif, A9406MISRStkTeo, A9407MISRStkRea, A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMInSRe");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMInSRe"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13Q1229( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13Q1229( ) ;
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
            endLevel13Q1229( ) ;
         }
      }
      closeExtendedTableCursors13Q1229( ) ;
   }

   public void deferredUpdate13Q1229( )
   {
   }

   public void delete13Q1229( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13Q1229( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13Q1229( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13Q1229( ) ;
         afterConfirm13Q1229( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13Q1229( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013Q22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), Integer.valueOf(A9403MISRCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMInSRe");
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
      sMode1229 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13Q1229( ) ;
      Gx_mode = sMode1229 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13Q1229( )
   {
      standaloneModal13Q1229( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013Q23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
         A9404MISRNom = T013Q23_A9404MISRNom[0] ;
         n9404MISRNom = T013Q23_n9404MISRNom[0] ;
         A9405MISRStkAct = T013Q23_A9405MISRStkAct[0] ;
         n9405MISRStkAct = T013Q23_n9405MISRStkAct[0] ;
         pr_default.close(21);
      }
   }

   public void endLevel13Q1229( )
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

   public void scanStart13Q1229( )
   {
      /* Scan By routine */
      /* Using cursor T013Q24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
      RcdFound1229 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1229 = (short)(1) ;
         A9403MISRCod = T013Q24_A9403MISRCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13Q1229( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1229 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1229 = (short)(1) ;
         A9403MISRCod = T013Q24_A9403MISRCod[0] ;
      }
   }

   public void scanEnd13Q1229( )
   {
      pr_default.close(22);
   }

   public void afterConfirm13Q1229( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         AV19ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19ServerNow", localUtil.ttoc( AV19ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV15oMMSRCnt = O9408MISRStkDif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15oMMSRCnt", GXutil.ltrimstr( AV15oMMSRCnt, 10, 3));
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV18nMMSRCnt = A9408MISRStkDif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18nMMSRCnt", GXutil.ltrimstr( AV18nMMSRCnt, 10, 3));
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9398MISCod ;
         GXv_int8[0] = A9403MISRCod ;
         GXv_int9[0] = AV16MTMovCod ;
         GXv_char3[0] = AV17MTMovNom ;
         GXv_int10[0] = (byte)(1) ;
         GXv_decimal11[0] = AV15oMMSRCnt ;
         GXv_decimal12[0] = AV18nMMSRCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime13[0] = AV19ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int8, GXv_int9, GXv_char3, GXv_int10, GXv_decimal11, GXv_decimal12, GXv_char2, GXv_dtime13) ;
         tminvst_impl.this.A396EmprCod = GXv_char4[0] ;
         tminvst_impl.this.A9398MISCod = GXv_int5[0] ;
         tminvst_impl.this.A9403MISRCod = GXv_int8[0] ;
         tminvst_impl.this.AV16MTMovCod = GXv_int9[0] ;
         tminvst_impl.this.AV17MTMovNom = GXv_char3[0] ;
         tminvst_impl.this.AV15oMMSRCnt = GXv_decimal11[0] ;
         tminvst_impl.this.AV18nMMSRCnt = GXv_decimal12[0] ;
         tminvst_impl.this.AV19ServerNow = GXv_dtime13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV16MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovNom", AV17MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV15oMMSRCnt", GXutil.ltrimstr( AV15oMMSRCnt, 10, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV18nMMSRCnt", GXutil.ltrimstr( AV18nMMSRCnt, 10, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV19ServerNow", localUtil.ttoc( AV19ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void beforeInsert13Q1229( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13Q1229( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13Q1229( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13Q1229( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13Q1229( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13Q1229( )
   {
      edtMISRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRCod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRNom_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRStkAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkAct_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRStkTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkTeo_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRStkRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkRea_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRStkDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkDif_Enabled), 5, 0), !bGXsfl_46_Refreshing);
   }

   public void send_integrity_lvl_hashes13Q1229( )
   {
   }

   public void send_integrity_lvl_hashes13Q1228( )
   {
   }

   public void subsflControlProps_461229( )
   {
      edtMISRCod_Internalname = "MISRCOD_"+sGXsfl_46_idx ;
      edtMISRNom_Internalname = "MISRNOM_"+sGXsfl_46_idx ;
      edtMISRStkAct_Internalname = "MISRSTKACT_"+sGXsfl_46_idx ;
      edtMISRStkTeo_Internalname = "MISRSTKTEO_"+sGXsfl_46_idx ;
      edtMISRStkRea_Internalname = "MISRSTKREA_"+sGXsfl_46_idx ;
      edtMISRStkDif_Internalname = "MISRSTKDIF_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_461229( )
   {
      edtMISRCod_Internalname = "MISRCOD_"+sGXsfl_46_fel_idx ;
      edtMISRNom_Internalname = "MISRNOM_"+sGXsfl_46_fel_idx ;
      edtMISRStkAct_Internalname = "MISRSTKACT_"+sGXsfl_46_fel_idx ;
      edtMISRStkTeo_Internalname = "MISRSTKTEO_"+sGXsfl_46_fel_idx ;
      edtMISRStkRea_Internalname = "MISRSTKREA_"+sGXsfl_46_fel_idx ;
      edtMISRStkDif_Internalname = "MISRSTKDIF_"+sGXsfl_46_fel_idx ;
   }

   public void addRow13Q1229( )
   {
      nGXsfl_46_idx = (int)(nGXsfl_46_idx+1) ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_461229( ) ;
      sendRow13Q1229( ) ;
   }

   public void sendRow13Q1229( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_46_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMISRCod_Internalname,h9403MISRCod,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMISRCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMISRCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMISRNom_Internalname,GXutil.rtrim( A9404MISRNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMISRNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMISRNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMISRStkAct_Internalname,GXutil.ltrim( localUtil.ntoc( A9405MISRStkAct, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMISRStkAct_Enabled!=0) ? localUtil.format( A9405MISRStkAct, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9405MISRStkAct, "Z,ZZZ,ZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMISRStkAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMISRStkAct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMISRStkTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A9406MISRStkTeo, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMISRStkTeo_Enabled!=0) ? localUtil.format( A9406MISRStkTeo, "ZZZZZZZ9.999") : localUtil.format( A9406MISRStkTeo, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMISRStkTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMISRStkTeo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1229_" + sGXsfl_46_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_46_idx + "',46)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMISRStkRea_Internalname,GXutil.ltrim( localUtil.ntoc( A9407MISRStkRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMISRStkRea_Enabled!=0) ? localUtil.format( A9407MISRStkRea, "ZZZZZ9.999") : localUtil.format( A9407MISRStkRea, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMISRStkRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMISRStkRea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMISRStkDif_Internalname,GXutil.ltrim( localUtil.ntoc( A9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMISRStkDif_Enabled!=0) ? localUtil.format( A9408MISRStkDif, "ZZZZZ9.999") : localUtil.format( A9408MISRStkDif, "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMISRStkDif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMISRStkDif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes13Q1229( ) ;
      GXCCtl = "GXHCMISRCOD_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9403MISRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9403MISRCod_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9403MISRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9408MISRStkDif_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9406MISRStkTeo_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9406MISRStkTeo, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9407MISRStkRea_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9407MISRStkRea, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9408MISRStkDif_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9408MISRStkDif, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1229_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1229, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1229_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1229, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1229_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1229, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_46_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV22TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV22TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vMISCOD_" + sGXsfl_46_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13MISCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MISRCOD_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MISRNOM_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MISRSTKACT_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MISRSTKTEO_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MISRSTKREA_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MISRSTKDIF_"+sGXsfl_46_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkDif_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow13Q1229( )
   {
      nGXsfl_46_idx = (int)(nGXsfl_46_idx+1) ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_461229( ) ;
      edtMISRCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRCOD_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMISRNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRNOM_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMISRStkAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRSTKACT_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMISRStkTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRSTKTEO_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMISRStkRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRSTKREA_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMISRStkDif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MISRSTKDIF_"+sGXsfl_46_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h9403MISRCod = httpContext.cgiGet( edtMISRCod_Internalname) ;
      A9404MISRNom = httpContext.cgiGet( edtMISRNom_Internalname) ;
      n9404MISRNom = false ;
      A9405MISRStkAct = localUtil.ctond( httpContext.cgiGet( edtMISRStkAct_Internalname)) ;
      n9405MISRStkAct = false ;
      A9406MISRStkTeo = localUtil.ctond( httpContext.cgiGet( edtMISRStkTeo_Internalname)) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMISRStkRea_Internalname)), DecimalUtil.stringToDec("-99999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMISRStkRea_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "MISRSTKREA_" + sGXsfl_46_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMISRStkRea_Internalname ;
         wbErr = true ;
         A9407MISRStkRea = DecimalUtil.ZERO ;
      }
      else
      {
         A9407MISRStkRea = localUtil.ctond( httpContext.cgiGet( edtMISRStkRea_Internalname)) ;
      }
      A9408MISRStkDif = localUtil.ctond( httpContext.cgiGet( edtMISRStkDif_Internalname)) ;
      GXCCtl = "GXHCMISRCOD_" + sGXsfl_46_idx ;
      A9403MISRCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9403MISRCod_" + sGXsfl_46_idx ;
      Z9403MISRCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9408MISRStkDif_" + sGXsfl_46_idx ;
      Z9408MISRStkDif = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9406MISRStkTeo_" + sGXsfl_46_idx ;
      Z9406MISRStkTeo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9407MISRStkRea_" + sGXsfl_46_idx ;
      Z9407MISRStkRea = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9408MISRStkDif_" + sGXsfl_46_idx ;
      O9408MISRStkDif = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1229_" + sGXsfl_46_idx ;
      nRcdDeleted_1229 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1229_" + sGXsfl_46_idx ;
      nRcdExists_1229 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1229_" + sGXsfl_46_idx ;
      nIsMod_1229 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMISRStkDif_Enabled = edtMISRStkDif_Enabled ;
      defedtMISRStkTeo_Enabled = edtMISRStkTeo_Enabled ;
      defedtMISRNom_Enabled = edtMISRNom_Enabled ;
      defedtMISRCod_Enabled = edtMISRCod_Enabled ;
   }

   public void confirmValues13Q0( )
   {
      nGXsfl_46_idx = 0 ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_461229( ) ;
      while ( nGXsfl_46_idx < nRC_GXsfl_46 )
      {
         nGXsfl_46_idx = (int)(nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_461229( ) ;
         httpContext.changePostValue( "Z9403MISRCod_"+sGXsfl_46_idx, httpContext.cgiGet( "ZT_"+"Z9403MISRCod_"+sGXsfl_46_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9403MISRCod_"+sGXsfl_46_idx) ;
         httpContext.changePostValue( "Z9408MISRStkDif_"+sGXsfl_46_idx, httpContext.cgiGet( "ZT_"+"Z9408MISRStkDif_"+sGXsfl_46_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9408MISRStkDif_"+sGXsfl_46_idx) ;
         httpContext.changePostValue( "Z9406MISRStkTeo_"+sGXsfl_46_idx, httpContext.cgiGet( "ZT_"+"Z9406MISRStkTeo_"+sGXsfl_46_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9406MISRStkTeo_"+sGXsfl_46_idx) ;
         httpContext.changePostValue( "Z9407MISRStkRea_"+sGXsfl_46_idx, httpContext.cgiGet( "ZT_"+"Z9407MISRStkRea_"+sGXsfl_46_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9407MISRStkRea_"+sGXsfl_46_idx) ;
      }
      httpContext.changePostValue( "O9408MISRStkDif", httpContext.cgiGet( "T9408MISRStkDif")) ;
      httpContext.deletePostValue( "T9408MISRStkDif") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tminvst", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13MISCod,8,0))}, new String[] {"Gx_mode","EmprCod","MISCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMInvSt");
      forbiddenHiddens.add("MISUsuCre", GXutil.rtrim( localUtil.format( A9400MISUsuCre, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("MISFchCre", localUtil.format( A9401MISFchCre, "99/99/99 99:99"));
      forbiddenHiddens.add("MISEst", GXutil.rtrim( localUtil.format( A9402MISEst, "")));
      forbiddenHiddens.add("MISFchApl", localUtil.format(A11303MISFchApl, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tminvst:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9398MISCod", GXutil.ltrim( localUtil.ntoc( Z9398MISCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9399MISFch", localUtil.dtoc( Z9399MISFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9400MISUsuCre", GXutil.rtrim( Z9400MISUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9401MISFchCre", localUtil.ttoc( Z9401MISFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9402MISEst", GXutil.rtrim( Z9402MISEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11303MISFchApl", localUtil.dtoc( Z11303MISFchApl, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nGXsfl_46_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV22TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV22TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV22TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMISCOD", GXutil.ltrim( localUtil.ntoc( AV13MISCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MISCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MISFCHAPL", localUtil.dtoc( A11303MISFchApl, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV25Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERVERNOW", localUtil.ttoc( AV19ServerNow, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMMSRCNT", GXutil.ltrim( localUtil.ntoc( AV15oMMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNMMSRCNT", GXutil.ltrim( localUtil.ntoc( AV18nMMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCMISRCOD", GXutil.ltrim( localUtil.ntoc( A9403MISRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVNOM", GXutil.rtrim( AV17MTMovNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVCOD", GXutil.ltrim( localUtil.ntoc( AV16MTMovCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.mantenimientomaquina.tminvst", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13MISCod,8,0))}, new String[] {"Gx_mode","EmprCod","MISCod"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMInvSt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Inventarios de Stock", "") ;
   }

   public void initializeNonKey13Q1228( )
   {
      A9399MISFch = GXutil.nullDate() ;
      n9399MISFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9399MISFch", localUtil.format(A9399MISFch, "99/99/99"));
      A11303MISFchApl = GXutil.nullDate() ;
      n11303MISFchApl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11303MISFchApl", localUtil.format(A11303MISFchApl, "99/99/99"));
      A9400MISUsuCre = AV8UsurCod ;
      n9400MISUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9400MISUsuCre", A9400MISUsuCre);
      A9401MISFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9401MISFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9401MISFchCre", localUtil.ttoc( A9401MISFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9402MISEst = httpContext.getMessage( "E", "") ;
      n9402MISEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9402MISEst", A9402MISEst);
      Z9399MISFch = GXutil.nullDate() ;
      Z9400MISUsuCre = "" ;
      Z9401MISFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9402MISEst = "" ;
      Z11303MISFchApl = GXutil.nullDate() ;
   }

   public void initAll13Q1228( )
   {
      A9398MISCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      initializeNonKey13Q1228( ) ;
   }

   public void standaloneModalInsert( )
   {
      A9400MISUsuCre = i9400MISUsuCre ;
      n9400MISUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9400MISUsuCre", A9400MISUsuCre);
      A9401MISFchCre = i9401MISFchCre ;
      n9401MISFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9401MISFchCre", localUtil.ttoc( A9401MISFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9402MISEst = i9402MISEst ;
      n9402MISEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9402MISEst", A9402MISEst);
   }

   public void initializeNonKey13Q1229( )
   {
      A9408MISRStkDif = DecimalUtil.ZERO ;
      AV19ServerNow = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV19ServerNow", localUtil.ttoc( AV19ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV15oMMSRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15oMMSRCnt", GXutil.ltrimstr( AV15oMMSRCnt, 10, 3));
      AV18nMMSRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18nMMSRCnt", GXutil.ltrimstr( AV18nMMSRCnt, 10, 3));
      A9404MISRNom = "" ;
      n9404MISRNom = false ;
      A9405MISRStkAct = DecimalUtil.ZERO ;
      n9405MISRStkAct = false ;
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      A9407MISRStkRea = DecimalUtil.ZERO ;
      O9408MISRStkDif = A9408MISRStkDif ;
      Z9408MISRStkDif = DecimalUtil.ZERO ;
      Z9406MISRStkTeo = DecimalUtil.ZERO ;
      Z9407MISRStkRea = DecimalUtil.ZERO ;
   }

   public void initAll13Q1229( )
   {
      h9403MISRCod = "" ;
      initializeNonKey13Q1229( ) ;
   }

   public void standaloneModalInsert13Q1229( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821166530", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tminvst.js", "?2026821166530", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1229( )
   {
      edtMISRStkDif_Enabled = defedtMISRStkDif_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkDif_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRStkTeo_Enabled = defedtMISRStkTeo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRStkTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRStkTeo_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRNom_Enabled = defedtMISRNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRNom_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtMISRCod_Enabled = defedtMISRCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMISRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMISRCod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
   }

   public void startgridcontrol46( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", h9403MISRCod);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9404MISRNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9405MISRStkAct, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9406MISRStkTeo, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9407MISRStkRea, (byte)(10), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9408MISRStkDif, (byte)(10), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMISRStkDif_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtMISCod_Internalname = "MISCOD" ;
      edtMISFch_Internalname = "MISFCH" ;
      cmbMISEst.setInternalname( "MISEST" );
      edtMISUsuCre_Internalname = "MISUSUCRE" ;
      edtMISFchCre_Internalname = "MISFCHCRE" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMISRCod_Internalname = "MISRCOD" ;
      edtMISRNom_Internalname = "MISRNOM" ;
      edtMISRStkAct_Internalname = "MISRSTKACT" ;
      edtMISRStkTeo_Internalname = "MISRSTKTEO" ;
      edtMISRStkRea_Internalname = "MISRSTKREA" ;
      edtMISRStkDif_Internalname = "MISRSTKDIF" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
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
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Inventarios de Stock", "") );
      edtMISRStkDif_Jsonclick = "" ;
      edtMISRStkRea_Jsonclick = "" ;
      edtMISRStkTeo_Jsonclick = "" ;
      edtMISRStkAct_Jsonclick = "" ;
      edtMISRNom_Jsonclick = "" ;
      edtMISRCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtMISRStkDif_Enabled = 0 ;
      edtMISRStkRea_Enabled = 1 ;
      edtMISRStkTeo_Enabled = 0 ;
      edtMISRStkAct_Enabled = 0 ;
      edtMISRNom_Enabled = 0 ;
      edtMISRCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      divTableleaflevel_level1_Visible = 1 ;
      edtMISFchCre_Jsonclick = "" ;
      edtMISFchCre_Enabled = 0 ;
      edtMISUsuCre_Jsonclick = "" ;
      edtMISUsuCre_Enabled = 0 ;
      cmbMISEst.setJsonclick( "" );
      cmbMISEst.setEnabled( 0 );
      edtMISFch_Jsonclick = "" ;
      edtMISFch_Enabled = 1 ;
      edtMISCod_Jsonclick = "" ;
      edtMISCod_Enabled = 0 ;
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

   public void gxsgamisrcod13Q0( String A396EmprCod ,
                                 String A13718MRCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgamisrcod_data13Q0( A396EmprCod, A13718MRCNom) ;
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

   protected void gxsgamisrcod_data13Q0( String A396EmprCod ,
                                         String A13718MRCNom )
   {
      l13718MRCNom = GXutil.concat( GXutil.rtrim( A13718MRCNom), "%", "") ;
      /* Using cursor T013Q25 */
      pr_default.execute(23, new Object[] {A396EmprCod, l13718MRCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(23) != 101) )
      {
         gxdynajaxctrlcodr.add(T013Q25_A13718MRCNom[0]);
         gxdynajaxctrldescr.add(T013Q25_A13718MRCNom[0]);
         pr_default.readNext(23);
      }
      pr_default.close(23);
   }

   public void gxhcamisrcod13Q1229( String A396EmprCod ,
                                    String A13718MRCNom )
   {
      /* Using cursor T013Q26 */
      pr_default.execute(24, new Object[] {A13718MRCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(24) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13718MRCNom = T013Q26_A13718MRCNom[0] ;
         A396EmprCod = T013Q26_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T013Q26_A9492MRCod[0] ;
         pr_default.readNext(24);
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
      pr_default.close(24);
   }

   public void gx3asamiscod13Q1228( int AV13MISCod )
   {
      if ( ! (0==AV13MISCod) )
      {
         A9398MISCod = AV13MISCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9398MISCod = AV13MISCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9398MISCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asamiscod13Q1228( String Gx_mode ,
                                    String A396EmprCod )
   {
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXt_int7 = A9398MISCod ;
         GXv_int9[0] = GXt_int7 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTIST", ""), ""), GXv_int9) ;
         tminvst_impl.this.GXt_int7 = GXv_int9[0] ;
         A9398MISCod = GXt_int7 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9398MISCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_16_13Q1228( String Gx_mode ,
                              String A396EmprCod ,
                              int A9398MISCod ,
                              java.util.Date A9399MISFch )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A9398MISCod ;
         new app.mantenimientomaquina.pmisdef(remoteHandle, context).execute( GXv_char4, GXv_int9) ;
         A396EmprCod = GXv_char4[0] ;
         A9398MISCod = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9398MISCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_26_13Q1229( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A9398MISCod ;
         GXv_int8[0] = A9403MISRCod ;
         GXv_int5[0] = AV16MTMovCod ;
         GXv_char3[0] = AV17MTMovNom ;
         GXv_int10[0] = (byte)(1) ;
         GXv_decimal12[0] = AV15oMMSRCnt ;
         GXv_decimal11[0] = AV18nMMSRCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime13[0] = AV19ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int5, GXv_char3, GXv_int10, GXv_decimal12, GXv_decimal11, GXv_char2, GXv_dtime13) ;
         A396EmprCod = GXv_char4[0] ;
         A9398MISCod = GXv_int9[0] ;
         A9403MISRCod = GXv_int8[0] ;
         AV16MTMovCod = GXv_int5[0] ;
         AV17MTMovNom = GXv_char3[0] ;
         AV15oMMSRCnt = GXv_decimal12[0] ;
         AV18nMMSRCnt = GXv_decimal11[0] ;
         AV19ServerNow = GXv_dtime13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9398MISCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9398MISCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV16MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovNom", AV17MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV15oMMSRCnt", GXutil.ltrimstr( AV15oMMSRCnt, 10, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV18nMMSRCnt", GXutil.ltrimstr( AV18nMMSRCnt, 10, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV19ServerNow", localUtil.ttoc( AV19ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_461229( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13Q1229( ) ;
         standaloneModal13Q1229( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13Q1229( ) ;
         nGXsfl_46_idx = (int)(nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_461229( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      cmbMISEst.setName( "MISEST" );
      cmbMISEst.setWebtags( "" );
      cmbMISEst.addItem("E", httpContext.getMessage( "En ingreso", ""), (short)(0));
      cmbMISEst.addItem("A", httpContext.getMessage( "Aplicado", ""), (short)(0));
      cmbMISEst.addItem("C", httpContext.getMessage( "Cancelado", ""), (short)(0));
      if ( cmbMISEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9402MISEst)==0) )
         {
            A9402MISEst = httpContext.getMessage( "E", "") ;
            n9402MISEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9402MISEst", A9402MISEst);
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

   public void valid_Misrcod( )
   {
      n9404MISRNom = false ;
      n9405MISRStkAct = false ;
      if ( (GXutil.strcmp("", h9403MISRCod)==0) )
      {
         A9403MISRCod = 0 ;
      }
      else
      {
         A13718MRCNom = h9403MISRCod ;
         /* Using cursor T013Q27 */
         pr_default.execute(25, new Object[] {A13718MRCNom, A396EmprCod});
         A9403MISRCod = T013Q27_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(25) == 101) ) )
         {
            pr_default.readNext(25);
            if ( ! ( (pr_default.getStatus(25) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "MISRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMISRCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(25);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9403MISRCod", h9403MISRCod);
      /* Using cursor T013Q28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9403MISRCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MISRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MISRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMISRCod_Internalname ;
      }
      A9404MISRNom = T013Q28_A9404MISRNom[0] ;
      n9404MISRNom = T013Q28_n9404MISRNom[0] ;
      A9405MISRStkAct = T013Q28_A9405MISRStkAct[0] ;
      n9405MISRStkAct = T013Q28_n9405MISRStkAct[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9403MISRCod", GXutil.ltrim( localUtil.ntoc( A9403MISRCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9404MISRNom", GXutil.rtrim( A9404MISRNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9405MISRStkAct", GXutil.ltrim( localUtil.ntoc( A9405MISRStkAct, (byte)(10), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h9403MISRCod", h9403MISRCod);
   }

   public void valid_Misrstkrea( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* Level */ && true /* After */ )
      {
         A9408MISRStkDif = A9407MISRStkRea.subtract(A9406MISRStkTeo) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9408MISRStkDif", GXutil.ltrim( localUtil.ntoc( A9408MISRStkDif, (byte)(10), (byte)(3), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13MISCod',fld:'vMISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV22TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13MISCod',fld:'vMISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A9400MISUsuCre',fld:'MISUSUCRE',pic:''},{av:'A9401MISFchCre',fld:'MISFCHCRE',pic:'99/99/99 99:99'},{av:'cmbMISEst'},{av:'A9402MISEst',fld:'MISEST',pic:''},{av:'A11303MISFchApl',fld:'MISFCHAPL',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1213Q2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV22TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MISCOD","{handler:'valid_Miscod',iparms:[]");
      setEventMetadata("VALID_MISCOD",",oparms:[]}");
      setEventMetadata("VALID_MISEST","{handler:'valid_Misest',iparms:[]");
      setEventMetadata("VALID_MISEST",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MISRCOD","{handler:'valid_Misrcod',iparms:[{av:'h9403MISRCod'},{av:'A9403MISRCod',fld:'MISRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9404MISRNom',fld:'MISRNOM',pic:''},{av:'A9405MISRStkAct',fld:'MISRSTKACT',pic:'Z,ZZZ,ZZZ9.999'}]");
      setEventMetadata("VALID_MISRCOD",",oparms:[{av:'A9403MISRCod',fld:'MISRCOD',pic:'ZZZZZZZ9'},{av:'A9404MISRNom',fld:'MISRNOM',pic:''},{av:'A9405MISRStkAct',fld:'MISRSTKACT',pic:'Z,ZZZ,ZZZ9.999'},{av:'h9403MISRCod'}]}");
      setEventMetadata("VALID_MISRSTKREA","{handler:'valid_Misrstkrea',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A9407MISRStkRea',fld:'MISRSTKREA',pic:'ZZZZZ9.999'},{av:'A9408MISRStkDif',fld:'MISRSTKDIF',pic:'ZZZZZ9.999'}]");
      setEventMetadata("VALID_MISRSTKREA",",oparms:[{av:'A9408MISRStkDif',fld:'MISRSTKDIF',pic:'ZZZZZ9.999'}]}");
      setEventMetadata("VALID_MISRSTKDIF","{handler:'valid_Misrstkdif',iparms:[]");
      setEventMetadata("VALID_MISRSTKDIF",",oparms:[]}");
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
      pr_default.close(26);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV20EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9399MISFch = GXutil.nullDate() ;
      Z9400MISUsuCre = "" ;
      Z9401MISFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9402MISEst = "" ;
      Z11303MISFchApl = GXutil.nullDate() ;
      Z9408MISRStkDif = DecimalUtil.ZERO ;
      Z9406MISRStkTeo = DecimalUtil.ZERO ;
      Z9407MISRStkRea = DecimalUtil.ZERO ;
      O9408MISRStkDif = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A9399MISFch = GXutil.nullDate() ;
      A13718MRCNom = "" ;
      h9403MISRCod = "" ;
      AV20EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A9402MISEst = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A9400MISUsuCre = "" ;
      A9401MISFchCre = GXutil.resetTime( GXutil.nullDate() );
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1229 = "" ;
      sStyleString = "" ;
      A11303MISFchApl = GXutil.nullDate() ;
      AV8UsurCod = "" ;
      AV25Pgmname = "" ;
      AV19ServerNow = GXutil.resetTime( GXutil.nullDate() );
      AV15oMMSRCnt = DecimalUtil.ZERO ;
      AV18nMMSRCnt = DecimalUtil.ZERO ;
      AV17MTMovNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1228 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A9404MISRNom = "" ;
      A9405MISRStkAct = DecimalUtil.ZERO ;
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      A9407MISRStkRea = DecimalUtil.ZERO ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      T9408MISRStkDif = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV11Station = "" ;
      AV14EmprNom = "" ;
      GXt_char1 = "" ;
      AV21WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext6 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV23WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T013Q7_A407EmprNom = new String[] {""} ;
      T013Q7_n407EmprNom = new boolean[] {false} ;
      T013Q8_A9398MISCod = new int[1] ;
      T013Q8_A407EmprNom = new String[] {""} ;
      T013Q8_n407EmprNom = new boolean[] {false} ;
      T013Q8_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013Q8_n9399MISFch = new boolean[] {false} ;
      T013Q8_A9400MISUsuCre = new String[] {""} ;
      T013Q8_n9400MISUsuCre = new boolean[] {false} ;
      T013Q8_A9401MISFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013Q8_n9401MISFchCre = new boolean[] {false} ;
      T013Q8_A9402MISEst = new String[] {""} ;
      T013Q8_n9402MISEst = new boolean[] {false} ;
      T013Q8_A11303MISFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      T013Q8_n11303MISFchApl = new boolean[] {false} ;
      T013Q8_A396EmprCod = new String[] {""} ;
      T013Q9_A396EmprCod = new String[] {""} ;
      T013Q9_A9398MISCod = new int[1] ;
      T013Q6_A9398MISCod = new int[1] ;
      T013Q6_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013Q6_n9399MISFch = new boolean[] {false} ;
      T013Q6_A9400MISUsuCre = new String[] {""} ;
      T013Q6_n9400MISUsuCre = new boolean[] {false} ;
      T013Q6_A9401MISFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013Q6_n9401MISFchCre = new boolean[] {false} ;
      T013Q6_A9402MISEst = new String[] {""} ;
      T013Q6_n9402MISEst = new boolean[] {false} ;
      T013Q6_A11303MISFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      T013Q6_n11303MISFchApl = new boolean[] {false} ;
      T013Q6_A396EmprCod = new String[] {""} ;
      T013Q10_A396EmprCod = new String[] {""} ;
      T013Q10_A9398MISCod = new int[1] ;
      T013Q11_A396EmprCod = new String[] {""} ;
      T013Q11_A9398MISCod = new int[1] ;
      T013Q5_A9398MISCod = new int[1] ;
      T013Q5_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013Q5_n9399MISFch = new boolean[] {false} ;
      T013Q5_A9400MISUsuCre = new String[] {""} ;
      T013Q5_n9400MISUsuCre = new boolean[] {false} ;
      T013Q5_A9401MISFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013Q5_n9401MISFchCre = new boolean[] {false} ;
      T013Q5_A9402MISEst = new String[] {""} ;
      T013Q5_n9402MISEst = new boolean[] {false} ;
      T013Q5_A11303MISFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      T013Q5_n11303MISFchApl = new boolean[] {false} ;
      T013Q5_A396EmprCod = new String[] {""} ;
      T013Q15_A396EmprCod = new String[] {""} ;
      T013Q15_A9398MISCod = new int[1] ;
      Z9404MISRNom = "" ;
      Z9405MISRStkAct = DecimalUtil.ZERO ;
      T013Q16_A9398MISCod = new int[1] ;
      T013Q16_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q16_A9404MISRNom = new String[] {""} ;
      T013Q16_n9404MISRNom = new boolean[] {false} ;
      T013Q16_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q16_n9405MISRStkAct = new boolean[] {false} ;
      T013Q16_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q16_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q16_A396EmprCod = new String[] {""} ;
      T013Q16_A9403MISRCod = new int[1] ;
      T013Q17_A13718MRCNom = new String[] {""} ;
      T013Q17_A396EmprCod = new String[] {""} ;
      T013Q17_A9492MRCod = new int[1] ;
      T013Q4_A9404MISRNom = new String[] {""} ;
      T013Q4_n9404MISRNom = new boolean[] {false} ;
      T013Q4_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q4_n9405MISRStkAct = new boolean[] {false} ;
      GXCCtl = "" ;
      T013Q18_A9404MISRNom = new String[] {""} ;
      T013Q18_n9404MISRNom = new boolean[] {false} ;
      T013Q18_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q18_n9405MISRStkAct = new boolean[] {false} ;
      T013Q19_A396EmprCod = new String[] {""} ;
      T013Q19_A9398MISCod = new int[1] ;
      T013Q19_A9403MISRCod = new int[1] ;
      T013Q3_A9398MISCod = new int[1] ;
      T013Q3_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q3_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q3_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q3_A396EmprCod = new String[] {""} ;
      T013Q3_A9403MISRCod = new int[1] ;
      T013Q2_A9398MISCod = new int[1] ;
      T013Q2_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q2_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q2_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q2_A396EmprCod = new String[] {""} ;
      T013Q2_A9403MISRCod = new int[1] ;
      T013Q23_A9404MISRNom = new String[] {""} ;
      T013Q23_n9404MISRNom = new boolean[] {false} ;
      T013Q23_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q23_n9405MISRStkAct = new boolean[] {false} ;
      T013Q24_A396EmprCod = new String[] {""} ;
      T013Q24_A9398MISCod = new int[1] ;
      T013Q24_A9403MISRCod = new int[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i9400MISUsuCre = "" ;
      i9401MISFchCre = GXutil.resetTime( GXutil.nullDate() );
      i9402MISEst = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13718MRCNom = "" ;
      T013Q25_A13718MRCNom = new String[] {""} ;
      T013Q26_A13718MRCNom = new String[] {""} ;
      T013Q26_A396EmprCod = new String[] {""} ;
      T013Q26_A9492MRCod = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new byte[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_dtime13 = new java.util.Date[1] ;
      T013Q27_A13718MRCNom = new String[] {""} ;
      T013Q27_A396EmprCod = new String[] {""} ;
      T013Q27_A9492MRCod = new int[1] ;
      T013Q28_A9404MISRNom = new String[] {""} ;
      T013Q28_n9404MISRNom = new boolean[] {false} ;
      T013Q28_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Q28_n9405MISRStkAct = new boolean[] {false} ;
      Zh9403MISRCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tminvst__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tminvst__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tminvst__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tminvst__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tminvst__default(),
         new Object[] {
             new Object[] {
            T013Q2_A9398MISCod, T013Q2_A9408MISRStkDif, T013Q2_A9406MISRStkTeo, T013Q2_A9407MISRStkRea, T013Q2_A396EmprCod, T013Q2_A9403MISRCod
            }
            , new Object[] {
            T013Q3_A9398MISCod, T013Q3_A9408MISRStkDif, T013Q3_A9406MISRStkTeo, T013Q3_A9407MISRStkRea, T013Q3_A396EmprCod, T013Q3_A9403MISRCod
            }
            , new Object[] {
            T013Q4_A9404MISRNom, T013Q4_n9404MISRNom, T013Q4_A9405MISRStkAct, T013Q4_n9405MISRStkAct
            }
            , new Object[] {
            T013Q5_A9398MISCod, T013Q5_A9399MISFch, T013Q5_n9399MISFch, T013Q5_A9400MISUsuCre, T013Q5_n9400MISUsuCre, T013Q5_A9401MISFchCre, T013Q5_n9401MISFchCre, T013Q5_A9402MISEst, T013Q5_n9402MISEst, T013Q5_A11303MISFchApl,
            T013Q5_n11303MISFchApl, T013Q5_A396EmprCod
            }
            , new Object[] {
            T013Q6_A9398MISCod, T013Q6_A9399MISFch, T013Q6_n9399MISFch, T013Q6_A9400MISUsuCre, T013Q6_n9400MISUsuCre, T013Q6_A9401MISFchCre, T013Q6_n9401MISFchCre, T013Q6_A9402MISEst, T013Q6_n9402MISEst, T013Q6_A11303MISFchApl,
            T013Q6_n11303MISFchApl, T013Q6_A396EmprCod
            }
            , new Object[] {
            T013Q7_A407EmprNom, T013Q7_n407EmprNom
            }
            , new Object[] {
            T013Q8_A9398MISCod, T013Q8_A407EmprNom, T013Q8_n407EmprNom, T013Q8_A9399MISFch, T013Q8_n9399MISFch, T013Q8_A9400MISUsuCre, T013Q8_n9400MISUsuCre, T013Q8_A9401MISFchCre, T013Q8_n9401MISFchCre, T013Q8_A9402MISEst,
            T013Q8_n9402MISEst, T013Q8_A11303MISFchApl, T013Q8_n11303MISFchApl, T013Q8_A396EmprCod
            }
            , new Object[] {
            T013Q9_A396EmprCod, T013Q9_A9398MISCod
            }
            , new Object[] {
            T013Q10_A396EmprCod, T013Q10_A9398MISCod
            }
            , new Object[] {
            T013Q11_A396EmprCod, T013Q11_A9398MISCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013Q15_A396EmprCod, T013Q15_A9398MISCod
            }
            , new Object[] {
            T013Q16_A9398MISCod, T013Q16_A9408MISRStkDif, T013Q16_A9404MISRNom, T013Q16_n9404MISRNom, T013Q16_A9405MISRStkAct, T013Q16_n9405MISRStkAct, T013Q16_A9406MISRStkTeo, T013Q16_A9407MISRStkRea, T013Q16_A396EmprCod, T013Q16_A9403MISRCod
            }
            , new Object[] {
            T013Q17_A13718MRCNom, T013Q17_A396EmprCod, T013Q17_A9492MRCod
            }
            , new Object[] {
            T013Q18_A9404MISRNom, T013Q18_n9404MISRNom, T013Q18_A9405MISRStkAct, T013Q18_n9405MISRStkAct
            }
            , new Object[] {
            T013Q19_A396EmprCod, T013Q19_A9398MISCod, T013Q19_A9403MISRCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013Q23_A9404MISRNom, T013Q23_n9404MISRNom, T013Q23_A9405MISRStkAct, T013Q23_n9405MISRStkAct
            }
            , new Object[] {
            T013Q24_A396EmprCod, T013Q24_A9398MISCod, T013Q24_A9403MISRCod
            }
            , new Object[] {
            T013Q25_A13718MRCNom
            }
            , new Object[] {
            T013Q26_A13718MRCNom, T013Q26_A396EmprCod, T013Q26_A9492MRCod
            }
            , new Object[] {
            T013Q27_A13718MRCNom, T013Q27_A396EmprCod, T013Q27_A9492MRCod
            }
            , new Object[] {
            T013Q28_A9404MISRNom, T013Q28_n9404MISRNom, T013Q28_A9405MISRStkAct, T013Q28_n9405MISRStkAct
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV25Pgmname = "MantenimientoMaquina.TMInvSt" ;
      Z9402MISEst = httpContext.getMessage( "E", "") ;
      n9402MISEst = false ;
      A9402MISEst = httpContext.getMessage( "E", "") ;
      n9402MISEst = false ;
      i9402MISEst = httpContext.getMessage( "E", "") ;
      n9402MISEst = false ;
      Z9401MISFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9401MISFchCre = false ;
      A9401MISFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9401MISFchCre = false ;
      i9401MISFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9401MISFchCre = false ;
      Z9400MISUsuCre = "" ;
      n9400MISUsuCre = false ;
      A9400MISUsuCre = "" ;
      n9400MISUsuCre = false ;
      i9400MISUsuCre = "" ;
      n9400MISUsuCre = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int10[] ;
   private short nRcdDeleted_1229 ;
   private short nRcdExists_1229 ;
   private short nIsMod_1229 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1229 ;
   private short RcdFound1229 ;
   private short nBlankRcdUsr1229 ;
   private short RcdFound1228 ;
   private short nIsDirty_1228 ;
   private short nIsDirty_1229 ;
   private short gxhchits ;
   private int wcpOAV13MISCod ;
   private int Z9398MISCod ;
   private int nRC_GXsfl_46 ;
   private int nGXsfl_46_idx=1 ;
   private int Z9403MISRCod ;
   private int A9398MISCod ;
   private int AV13MISCod ;
   private int A9403MISRCod ;
   private int trnEnded ;
   private int edtMISCod_Enabled ;
   private int edtMISFch_Enabled ;
   private int edtMISUsuCre_Enabled ;
   private int edtMISFchCre_Enabled ;
   private int divTableleaflevel_level1_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtMISRCod_Enabled ;
   private int edtMISRNom_Enabled ;
   private int edtMISRStkAct_Enabled ;
   private int edtMISRStkTeo_Enabled ;
   private int edtMISRStkRea_Enabled ;
   private int edtMISRStkDif_Enabled ;
   private int fRowAdded ;
   private int AV16MTMovCod ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtMISRStkDif_Enabled ;
   private int defedtMISRStkTeo_Enabled ;
   private int defedtMISRNom_Enabled ;
   private int defedtMISRCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int A9492MRCod ;
   private int GXt_int7 ;
   private int GXv_int9[] ;
   private int GXv_int8[] ;
   private int GXv_int5[] ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z9408MISRStkDif ;
   private java.math.BigDecimal Z9406MISRStkTeo ;
   private java.math.BigDecimal Z9407MISRStkRea ;
   private java.math.BigDecimal O9408MISRStkDif ;
   private java.math.BigDecimal AV15oMMSRCnt ;
   private java.math.BigDecimal AV18nMMSRCnt ;
   private java.math.BigDecimal A9405MISRStkAct ;
   private java.math.BigDecimal A9406MISRStkTeo ;
   private java.math.BigDecimal A9407MISRStkRea ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private java.math.BigDecimal T9408MISRStkDif ;
   private java.math.BigDecimal Z9405MISRStkAct ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV20EmprCod ;
   private String Z396EmprCod ;
   private String Z9400MISUsuCre ;
   private String Z9402MISEst ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV20EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMISFch_Internalname ;
   private String sGXsfl_46_idx="0001" ;
   private String A9402MISEst ;
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
   private String edtMISCod_Internalname ;
   private String TempTags ;
   private String edtMISCod_Jsonclick ;
   private String edtMISFch_Jsonclick ;
   private String edtMISUsuCre_Internalname ;
   private String A9400MISUsuCre ;
   private String edtMISUsuCre_Jsonclick ;
   private String edtMISFchCre_Internalname ;
   private String edtMISFchCre_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1229 ;
   private String edtMISRCod_Internalname ;
   private String edtMISRNom_Internalname ;
   private String edtMISRStkAct_Internalname ;
   private String edtMISRStkTeo_Internalname ;
   private String edtMISRStkRea_Internalname ;
   private String edtMISRStkDif_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV8UsurCod ;
   private String AV25Pgmname ;
   private String AV17MTMovNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1228 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A9404MISRNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV11Station ;
   private String AV14EmprNom ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z9404MISRNom ;
   private String GXCCtl ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtMISRCod_Jsonclick ;
   private String edtMISRNom_Jsonclick ;
   private String edtMISRStkAct_Jsonclick ;
   private String edtMISRStkTeo_Jsonclick ;
   private String edtMISRStkRea_Jsonclick ;
   private String edtMISRStkDif_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i9400MISUsuCre ;
   private String i9402MISEst ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z9401MISFchCre ;
   private java.util.Date A9401MISFchCre ;
   private java.util.Date AV19ServerNow ;
   private java.util.Date i9401MISFchCre ;
   private java.util.Date GXv_dtime13[] ;
   private java.util.Date Z9399MISFch ;
   private java.util.Date Z11303MISFchApl ;
   private java.util.Date A9399MISFch ;
   private java.util.Date A11303MISFchApl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9399MISFch ;
   private boolean wbErr ;
   private boolean n9402MISEst ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_46_Refreshing=false ;
   private boolean n11303MISFchApl ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n9400MISUsuCre ;
   private boolean n9401MISFchCre ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n9404MISRNom ;
   private boolean n9405MISRStkAct ;
   private String A13718MRCNom ;
   private String h9403MISRCod ;
   private String l13718MRCNom ;
   private String Zh9403MISRCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbMISEst ;
   private IDataStoreProvider pr_default ;
   private String[] T013Q7_A407EmprNom ;
   private boolean[] T013Q7_n407EmprNom ;
   private int[] T013Q8_A9398MISCod ;
   private String[] T013Q8_A407EmprNom ;
   private boolean[] T013Q8_n407EmprNom ;
   private java.util.Date[] T013Q8_A9399MISFch ;
   private boolean[] T013Q8_n9399MISFch ;
   private String[] T013Q8_A9400MISUsuCre ;
   private boolean[] T013Q8_n9400MISUsuCre ;
   private java.util.Date[] T013Q8_A9401MISFchCre ;
   private boolean[] T013Q8_n9401MISFchCre ;
   private String[] T013Q8_A9402MISEst ;
   private boolean[] T013Q8_n9402MISEst ;
   private java.util.Date[] T013Q8_A11303MISFchApl ;
   private boolean[] T013Q8_n11303MISFchApl ;
   private String[] T013Q8_A396EmprCod ;
   private String[] T013Q9_A396EmprCod ;
   private int[] T013Q9_A9398MISCod ;
   private int[] T013Q6_A9398MISCod ;
   private java.util.Date[] T013Q6_A9399MISFch ;
   private boolean[] T013Q6_n9399MISFch ;
   private String[] T013Q6_A9400MISUsuCre ;
   private boolean[] T013Q6_n9400MISUsuCre ;
   private java.util.Date[] T013Q6_A9401MISFchCre ;
   private boolean[] T013Q6_n9401MISFchCre ;
   private String[] T013Q6_A9402MISEst ;
   private boolean[] T013Q6_n9402MISEst ;
   private java.util.Date[] T013Q6_A11303MISFchApl ;
   private boolean[] T013Q6_n11303MISFchApl ;
   private String[] T013Q6_A396EmprCod ;
   private String[] T013Q10_A396EmprCod ;
   private int[] T013Q10_A9398MISCod ;
   private String[] T013Q11_A396EmprCod ;
   private int[] T013Q11_A9398MISCod ;
   private int[] T013Q5_A9398MISCod ;
   private java.util.Date[] T013Q5_A9399MISFch ;
   private boolean[] T013Q5_n9399MISFch ;
   private String[] T013Q5_A9400MISUsuCre ;
   private boolean[] T013Q5_n9400MISUsuCre ;
   private java.util.Date[] T013Q5_A9401MISFchCre ;
   private boolean[] T013Q5_n9401MISFchCre ;
   private String[] T013Q5_A9402MISEst ;
   private boolean[] T013Q5_n9402MISEst ;
   private java.util.Date[] T013Q5_A11303MISFchApl ;
   private boolean[] T013Q5_n11303MISFchApl ;
   private String[] T013Q5_A396EmprCod ;
   private String[] T013Q15_A396EmprCod ;
   private int[] T013Q15_A9398MISCod ;
   private int[] T013Q16_A9398MISCod ;
   private java.math.BigDecimal[] T013Q16_A9408MISRStkDif ;
   private String[] T013Q16_A9404MISRNom ;
   private boolean[] T013Q16_n9404MISRNom ;
   private java.math.BigDecimal[] T013Q16_A9405MISRStkAct ;
   private boolean[] T013Q16_n9405MISRStkAct ;
   private java.math.BigDecimal[] T013Q16_A9406MISRStkTeo ;
   private java.math.BigDecimal[] T013Q16_A9407MISRStkRea ;
   private String[] T013Q16_A396EmprCod ;
   private int[] T013Q16_A9403MISRCod ;
   private String[] T013Q17_A13718MRCNom ;
   private String[] T013Q17_A396EmprCod ;
   private int[] T013Q17_A9492MRCod ;
   private String[] T013Q4_A9404MISRNom ;
   private boolean[] T013Q4_n9404MISRNom ;
   private java.math.BigDecimal[] T013Q4_A9405MISRStkAct ;
   private boolean[] T013Q4_n9405MISRStkAct ;
   private String[] T013Q18_A9404MISRNom ;
   private boolean[] T013Q18_n9404MISRNom ;
   private java.math.BigDecimal[] T013Q18_A9405MISRStkAct ;
   private boolean[] T013Q18_n9405MISRStkAct ;
   private String[] T013Q19_A396EmprCod ;
   private int[] T013Q19_A9398MISCod ;
   private int[] T013Q19_A9403MISRCod ;
   private int[] T013Q3_A9398MISCod ;
   private java.math.BigDecimal[] T013Q3_A9408MISRStkDif ;
   private java.math.BigDecimal[] T013Q3_A9406MISRStkTeo ;
   private java.math.BigDecimal[] T013Q3_A9407MISRStkRea ;
   private String[] T013Q3_A396EmprCod ;
   private int[] T013Q3_A9403MISRCod ;
   private int[] T013Q2_A9398MISCod ;
   private java.math.BigDecimal[] T013Q2_A9408MISRStkDif ;
   private java.math.BigDecimal[] T013Q2_A9406MISRStkTeo ;
   private java.math.BigDecimal[] T013Q2_A9407MISRStkRea ;
   private String[] T013Q2_A396EmprCod ;
   private int[] T013Q2_A9403MISRCod ;
   private String[] T013Q23_A9404MISRNom ;
   private boolean[] T013Q23_n9404MISRNom ;
   private java.math.BigDecimal[] T013Q23_A9405MISRStkAct ;
   private boolean[] T013Q23_n9405MISRStkAct ;
   private String[] T013Q24_A396EmprCod ;
   private int[] T013Q24_A9398MISCod ;
   private int[] T013Q24_A9403MISRCod ;
   private String[] T013Q25_A13718MRCNom ;
   private String[] T013Q26_A13718MRCNom ;
   private String[] T013Q26_A396EmprCod ;
   private int[] T013Q26_A9492MRCod ;
   private String[] T013Q27_A13718MRCNom ;
   private String[] T013Q27_A396EmprCod ;
   private int[] T013Q27_A9492MRCod ;
   private String[] T013Q28_A9404MISRNom ;
   private boolean[] T013Q28_n9404MISRNom ;
   private java.math.BigDecimal[] T013Q28_A9405MISRStkAct ;
   private boolean[] T013Q28_n9405MISRStkAct ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV21WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext6[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV22TrnContext ;
}

final  class tminvst__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tminvst__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tminvst__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tminvst__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tminvst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013Q2", "SELECT MISCod, MISRStkDif, MISRStkTeo, MISRStkRea, EmprCod, MISRCod FROM TXPMInSRe WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ?  FOR UPDATE OF MISRStkDif, MISRStkTeo, MISRStkRea NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q3", "SELECT MISCod, MISRStkDif, MISRStkTeo, MISRStkRea, EmprCod, MISRCod FROM TXPMInSRe WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q4", "SELECT MRNom AS MISRNom, MRStkAct AS MISRStkAct FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q5", "SELECT MISCod, MISFch, MISUsuCre, MISFchCre, MISEst, MISFchApl, EmprCod FROM TXPMINVST WHERE EmprCod = ? AND MISCod = ?  FOR UPDATE OF MISFch, MISUsuCre, MISFchCre, MISEst, MISFchApl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q6", "SELECT MISCod, MISFch, MISUsuCre, MISFchCre, MISEst, MISFchApl, EmprCod FROM TXPMINVST WHERE EmprCod = ? AND MISCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q8", "SELECT /*+ FIRST_ROWS(100) */ TM1.MISCod, T2.EmprNom, TM1.MISFch, TM1.MISUsuCre, TM1.MISFchCre, TM1.MISEst, TM1.MISFchApl, TM1.EmprCod FROM (TXPMINVST TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MISCod = ? ORDER BY TM1.EmprCod, TM1.MISCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MISCod FROM TXPMINVST WHERE EmprCod = ? AND MISCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MISCod FROM TXPMINVST WHERE ( MISCod > ?) and EmprCod = ? ORDER BY EmprCod, MISCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013Q11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MISCod FROM TXPMINVST WHERE ( MISCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, MISCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013Q12", "INSERT INTO TXPMINVST(MISCod, MISFch, MISUsuCre, MISFchCre, MISEst, MISFchApl, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMINVST")
         ,new UpdateCursor("T013Q13", "UPDATE TXPMINVST SET MISFch=?, MISUsuCre=?, MISFchCre=?, MISEst=?, MISFchApl=?  WHERE EmprCod = ? AND MISCod = ?", GX_NOMASK, "TXPMINVST")
         ,new UpdateCursor("T013Q14", "DELETE FROM TXPMINVST  WHERE EmprCod = ? AND MISCod = ?", GX_NOMASK, "TXPMINVST")
         ,new ForEachCursor("T013Q15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MISCod FROM TXPMINVST WHERE EmprCod = ? ORDER BY EmprCod, MISCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q16", "SELECT T1.MISCod, T1.MISRStkDif, T2.MRNom AS MISRNom, T2.MRStkAct AS MISRStkAct, T1.MISRStkTeo, T1.MISRStkRea, T1.EmprCod, T1.MISRCod AS MISRCod FROM (TXPMInSRe T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MISRCod) WHERE T1.EmprCod = ? and T1.MISCod = ? and T1.MISRCod = ? ORDER BY T1.EmprCod, T1.MISCod, T1.MISRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q17", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (EmprCod = ?) AND (MRCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q18", "SELECT MRNom AS MISRNom, MRStkAct AS MISRStkAct FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q19", "SELECT EmprCod, MISCod, MISRCod FROM TXPMInSRe WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013Q20", "INSERT INTO TXPMInSRe(MISCod, MISRStkDif, MISRStkTeo, MISRStkRea, EmprCod, MISRCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMInSRe")
         ,new UpdateCursor("T013Q21", "UPDATE TXPMInSRe SET MISRStkDif=?, MISRStkTeo=?, MISRStkRea=?  WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ?", GX_NOMASK, "TXPMInSRe")
         ,new UpdateCursor("T013Q22", "DELETE FROM TXPMInSRe  WHERE EmprCod = ? AND MISCod = ? AND MISRCod = ?", GX_NOMASK, "TXPMInSRe")
         ,new ForEachCursor("T013Q23", "SELECT MRNom AS MISRNom, MRStkAct AS MISRStkAct FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q24", "SELECT EmprCod, MISCod, MISRCod FROM TXPMInSRe WHERE EmprCod = ? and MISCod = ? ORDER BY EmprCod, MISCod, MISRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q25", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom FROM TXPMREPUE WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, '')))) like '%' || UPPER(?)) ORDER BY MRCNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q26", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q27", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Q28", "SELECT MRNom AS MISRNom, MRStkAct AS MISRStkAct FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 10);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
               }
               stmt.setString(7, (String)parms[11], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
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
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 19 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 255);
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

