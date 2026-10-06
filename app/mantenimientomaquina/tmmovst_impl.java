package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmmovst_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action31") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_31_13R1231( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"MMSCOD") == 0 )
      {
         AV13MMSCod = (int)(GXutil.lval( httpContext.GetPar( "MMSCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MMSCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMMSCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MMSCod), "ZZZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asammscod13R1230( AV13MMSCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"MMSCOD") == 0 )
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
         gx6asammscod13R1230( Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_36( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_37") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9414MMSPrvNum = (int)(GXutil.lval( httpContext.GetPar( "MMSPrvNum"))) ;
         n9414MMSPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_37( A396EmprCod, A9414MMSPrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_39") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9421MMSRCod = (int)(GXutil.lval( httpContext.GetPar( "MMSRCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_39( A396EmprCod, A9421MMSRCod) ;
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
            AV23EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23EmprCod, "@!"))));
            AV13MMSCod = (int)(GXutil.lval( httpContext.GetPar( "MMSCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MMSCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMMSCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MMSCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Movimientos de Stock", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = cmbMMSTpo.getInternalname() ;
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
      nRC_GXsfl_74 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_74"))) ;
      nGXsfl_74_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_74_idx"))) ;
      sGXsfl_74_idx = httpContext.GetPar( "sGXsfl_74_idx") ;
      edtMMSRCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRCod_Internalname, "Horizontalalignment", edtMMSRCod_Horizontalalignment, !bGXsfl_74_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tmmovst_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmmovst_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmmovst_impl.class ));
   }

   public tmmovst_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMMSTpo = new HTMLChoice();
      cmbMMSEst = new HTMLChoice();
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
      if ( cmbMMSTpo.getItemCount() > 0 )
      {
         A9413MMSTpo = cmbMMSTpo.getValidValue(A9413MMSTpo) ;
         n9413MMSTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9413MMSTpo", A9413MMSTpo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMMSTpo.setValue( GXutil.rtrim( A9413MMSTpo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMMSTpo.getInternalname(), "Values", cmbMMSTpo.ToJavascriptSource(), true);
      }
      if ( cmbMMSEst.getItemCount() > 0 )
      {
         A9420MMSEst = cmbMMSEst.getValidValue(A9420MMSEst) ;
         n9420MMSEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9420MMSEst", A9420MMSEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMMSEst.setValue( GXutil.rtrim( A9420MMSEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMMSEst.getInternalname(), "Values", cmbMMSEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSCod_Internalname, httpContext.getMessage( "Mov Stock", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9412MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9412MMSCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMMSTpo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMMSTpo.getInternalname(), httpContext.getMessage( "Tipo de Mov de Stock", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMMSTpo, cmbMMSTpo.getInternalname(), GXutil.rtrim( A9413MMSTpo), 1, cmbMMSTpo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMMSTpo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMMovSt.htm");
      cmbMMSTpo.setValue( GXutil.rtrim( A9413MMSTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMMSTpo.getInternalname(), "Values", cmbMMSTpo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMMSFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSFch_Internalname, localUtil.format(A9416MMSFch, "99/99/99"), localUtil.format( A9416MMSFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMMSFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMSFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMMSEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMMSEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMMSEst, cmbMMSEst.getInternalname(), GXutil.rtrim( A9420MMSEst), 1, cmbMMSEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMMSEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMMovSt.htm");
      cmbMMSEst.setValue( GXutil.rtrim( A9420MMSEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMMSEst.getInternalname(), "Values", cmbMMSEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedmmsprvnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmmsprvnum_Internalname, httpContext.getMessage( "Proveedor", ""), "", "", lblTextblockmmsprvnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_mmsprvnum.setProperty("Caption", Combo_mmsprvnum_Caption);
      ucCombo_mmsprvnum.setProperty("Cls", Combo_mmsprvnum_Cls);
      ucCombo_mmsprvnum.setProperty("EmptyItem", Combo_mmsprvnum_Emptyitem);
      ucCombo_mmsprvnum.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
      ucCombo_mmsprvnum.setProperty("DropDownOptionsData", AV31MMSPrvNum_Data);
      ucCombo_mmsprvnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_mmsprvnum_Internalname, "COMBO_MMSPRVNUMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSPrvNum_Internalname, httpContext.getMessage( "Num Proveedor", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A9414MMSPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9414MMSPrvNum), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSPrvNum_Jsonclick, 0, "Attribute", "", "", "", "", edtMMSPrvNum_Visible, edtMMSPrvNum_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSDto_Internalname, httpContext.getMessage( "% Descuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSDto_Internalname, GXutil.ltrim( localUtil.ntoc( A11509MMSDto, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSDto_Enabled!=0) ? localUtil.format( A11509MMSDto, "ZZ9.99%") : localUtil.format( A11509MMSDto, "ZZ9.99%"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSDto_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSNroExt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSNroExt_Internalname, httpContext.getMessage( "Nro Externo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSNroExt_Internalname, GXutil.rtrim( A9419MMSNroExt), GXutil.rtrim( localUtil.format( A9419MMSNroExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSNroExt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSNroExt_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSUsuCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSUsuCre_Internalname, httpContext.getMessage( "Usuario que crea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSUsuCre_Internalname, GXutil.rtrim( A9417MMSUsuCre), GXutil.rtrim( localUtil.format( A9417MMSUsuCre, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSUsuCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSUsuCre_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSFchCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSFchCre_Internalname, httpContext.getMessage( "Fecha de Creación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMMSFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSFchCre_Internalname, localUtil.ttoc( A9418MMSFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9418MMSFchCre, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSFchCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMMSFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMSFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSFchApl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSFchApl_Internalname, httpContext.getMessage( "Fecha de Aplicación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMMSFchApl_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSFchApl_Internalname, localUtil.ttoc( A11304MMSFchApl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11304MMSFchApl, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSFchApl_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMMSFchApl_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMMSFchApl_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMSFchApl_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMMovSt.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_mmsprvnum_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombommsprvnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV33ComboMMSPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombommsprvnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33ComboMMSPrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33ComboMMSPrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombommsprvnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombommsprvnum_Visible, edtavCombommsprvnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* User Defined Control */
      ucCombo_mmsrcod.setProperty("Caption", Combo_mmsrcod_Caption);
      ucCombo_mmsrcod.setProperty("Cls", Combo_mmsrcod_Cls);
      ucCombo_mmsrcod.setProperty("IsGridItem", Combo_mmsrcod_Isgriditem);
      ucCombo_mmsrcod.setProperty("EmptyItem", Combo_mmsrcod_Emptyitem);
      ucCombo_mmsrcod.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
      ucCombo_mmsrcod.setProperty("DropDownOptionsData", AV35MMSRCod_Data);
      ucCombo_mmsrcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_mmsrcod_Internalname, "COMBO_MMSRCODContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSPrvNom_Internalname, GXutil.rtrim( A9415MMSPrvNom), GXutil.rtrim( localUtil.format( A9415MMSPrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSPrvNom_Jsonclick, 0, "Attribute", "", "", "", "", edtMMSPrvNom_Visible, edtMMSPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMMovSt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol74( ) ;
      nGXsfl_74_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1231 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1231 = (short)(1) ;
            scanStart13R1231( ) ;
            while ( RcdFound1231 != 0 )
            {
               init_level_properties1231( ) ;
               getByPrimaryKey13R1231( ) ;
               addRow13R1231( ) ;
               scanNext13R1231( ) ;
            }
            scanEnd13R1231( ) ;
            nBlankRcdCount1231 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13R1231( ) ;
         standaloneModal13R1231( ) ;
         sMode1231 = Gx_mode ;
         while ( nGXsfl_74_idx < nRC_GXsfl_74 )
         {
            bGXsfl_74_Refreshing = true ;
            readRow13R1231( ) ;
            edtMMSRCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRCOD_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRCod_Enabled), 5, 0), !bGXsfl_74_Refreshing);
            edtMMSRCod_Horizontalalignment = httpContext.cgiGet( "MMSRCOD_"+sGXsfl_74_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRCod_Internalname, "Horizontalalignment", edtMMSRCod_Horizontalalignment, !bGXsfl_74_Refreshing);
            edtMMSRNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRNOM_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRNom_Enabled), 5, 0), !bGXsfl_74_Refreshing);
            edtMMSRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRCNT_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRCnt_Enabled), 5, 0), !bGXsfl_74_Refreshing);
            edtMMSRPreD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRPRED_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRPreD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPreD_Enabled), 5, 0), !bGXsfl_74_Refreshing);
            edtMMSRStkPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRSTKPRE_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRStkPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
            edtMMSRTot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRTOT_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), !bGXsfl_74_Refreshing);
            edtMMSRDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRDTO_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRDto_Enabled), 5, 0), !bGXsfl_74_Refreshing);
            edtMMSRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRPRE_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
            if ( ( nRcdExists_1231 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13R1231( ) ;
            }
            sendRow13R1231( ) ;
            bGXsfl_74_Refreshing = false ;
         }
         Gx_mode = sMode1231 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1231 = (short)(5) ;
         nRcdExists_1231 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13R1231( ) ;
            while ( RcdFound1231 != 0 )
            {
               sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_741231( ) ;
               init_level_properties1231( ) ;
               standaloneNotModal13R1231( ) ;
               getByPrimaryKey13R1231( ) ;
               standaloneModal13R1231( ) ;
               addRow13R1231( ) ;
               scanNext13R1231( ) ;
            }
            scanEnd13R1231( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1231 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_741231( ) ;
         initAll13R1231( ) ;
         init_level_properties1231( ) ;
         nRcdExists_1231 = (short)(0) ;
         nIsMod_1231 = (short)(0) ;
         nRcdDeleted_1231 = (short)(0) ;
         nBlankRcdCount1231 = (short)(nBlankRcdUsr1231+nBlankRcdCount1231) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1231 > 0 )
         {
            standaloneNotModal13R1231( ) ;
            standaloneModal13R1231( ) ;
            addRow13R1231( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMMSRCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1231 = (short)(nBlankRcdCount1231-1) ;
         }
         Gx_mode = sMode1231 ;
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
      e1113R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV34DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMMSPRVNUM_DATA"), AV31MMSPrvNum_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMMSRCOD_DATA"), AV35MMSRCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9412MMSCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9413MMSTpo = httpContext.cgiGet( "Z9413MMSTpo") ;
            Z9416MMSFch = localUtil.ctod( httpContext.cgiGet( "Z9416MMSFch"), 0) ;
            Z9417MMSUsuCre = httpContext.cgiGet( "Z9417MMSUsuCre") ;
            Z9418MMSFchCre = localUtil.ctot( httpContext.cgiGet( "Z9418MMSFchCre"), 0) ;
            Z11304MMSFchApl = localUtil.ctot( httpContext.cgiGet( "Z11304MMSFchApl"), 0) ;
            Z9419MMSNroExt = httpContext.cgiGet( "Z9419MMSNroExt") ;
            Z9420MMSEst = httpContext.cgiGet( "Z9420MMSEst") ;
            Z11509MMSDto = localUtil.ctond( httpContext.cgiGet( "Z11509MMSDto")) ;
            Z9414MMSPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z9414MMSPrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_74 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9414MMSPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "N9414MMSPrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV13MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMMSCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24Insert_MMSPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_MMSPRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV15oMMSRCnt = localUtil.ctond( httpContext.cgiGet( "vOMMSRCNT")) ;
            AV18nMMSRCnt = localUtil.ctond( httpContext.cgiGet( "vNMMSRCNT")) ;
            AV21ServerNow = localUtil.ctot( httpContext.cgiGet( "vSERVERNOW"), 0) ;
            AV17MTMovNom = httpContext.cgiGet( "vMTMOVNOM") ;
            AV16MTMovCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMTMOVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_mmsprvnum_Objectcall = httpContext.cgiGet( "COMBO_MMSPRVNUM_Objectcall") ;
            Combo_mmsprvnum_Class = httpContext.cgiGet( "COMBO_MMSPRVNUM_Class") ;
            Combo_mmsprvnum_Icontype = httpContext.cgiGet( "COMBO_MMSPRVNUM_Icontype") ;
            Combo_mmsprvnum_Icon = httpContext.cgiGet( "COMBO_MMSPRVNUM_Icon") ;
            Combo_mmsprvnum_Caption = httpContext.cgiGet( "COMBO_MMSPRVNUM_Caption") ;
            Combo_mmsprvnum_Tooltip = httpContext.cgiGet( "COMBO_MMSPRVNUM_Tooltip") ;
            Combo_mmsprvnum_Cls = httpContext.cgiGet( "COMBO_MMSPRVNUM_Cls") ;
            Combo_mmsprvnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_MMSPRVNUM_Selectedvalue_set") ;
            Combo_mmsprvnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_MMSPRVNUM_Selectedvalue_get") ;
            Combo_mmsprvnum_Selectedtext_set = httpContext.cgiGet( "COMBO_MMSPRVNUM_Selectedtext_set") ;
            Combo_mmsprvnum_Selectedtext_get = httpContext.cgiGet( "COMBO_MMSPRVNUM_Selectedtext_get") ;
            Combo_mmsprvnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_MMSPRVNUM_Gamoauthtoken") ;
            Combo_mmsprvnum_Ddointernalname = httpContext.cgiGet( "COMBO_MMSPRVNUM_Ddointernalname") ;
            Combo_mmsprvnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_MMSPRVNUM_Titlecontrolalign") ;
            Combo_mmsprvnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MMSPRVNUM_Dropdownoptionstype") ;
            Combo_mmsprvnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSPRVNUM_Enabled")) ;
            Combo_mmsprvnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSPRVNUM_Visible")) ;
            Combo_mmsprvnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MMSPRVNUM_Titlecontrolidtoreplace") ;
            Combo_mmsprvnum_Datalisttype = httpContext.cgiGet( "COMBO_MMSPRVNUM_Datalisttype") ;
            Combo_mmsprvnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSPRVNUM_Allowmultipleselection")) ;
            Combo_mmsprvnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MMSPRVNUM_Datalistfixedvalues") ;
            Combo_mmsprvnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSPRVNUM_Isgriditem")) ;
            Combo_mmsprvnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSPRVNUM_Hasdescription")) ;
            Combo_mmsprvnum_Datalistproc = httpContext.cgiGet( "COMBO_MMSPRVNUM_Datalistproc") ;
            Combo_mmsprvnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MMSPRVNUM_Datalistprocparametersprefix") ;
            Combo_mmsprvnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MMSPRVNUM_Remoteservicesparameters") ;
            Combo_mmsprvnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MMSPRVNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_mmsprvnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSPRVNUM_Includeonlyselectedoption")) ;
            Combo_mmsprvnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSPRVNUM_Includeselectalloption")) ;
            Combo_mmsprvnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSPRVNUM_Emptyitem")) ;
            Combo_mmsprvnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSPRVNUM_Includeaddnewoption")) ;
            Combo_mmsprvnum_Htmltemplate = httpContext.cgiGet( "COMBO_MMSPRVNUM_Htmltemplate") ;
            Combo_mmsprvnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_MMSPRVNUM_Multiplevaluestype") ;
            Combo_mmsprvnum_Loadingdata = httpContext.cgiGet( "COMBO_MMSPRVNUM_Loadingdata") ;
            Combo_mmsprvnum_Noresultsfound = httpContext.cgiGet( "COMBO_MMSPRVNUM_Noresultsfound") ;
            Combo_mmsprvnum_Emptyitemtext = httpContext.cgiGet( "COMBO_MMSPRVNUM_Emptyitemtext") ;
            Combo_mmsprvnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MMSPRVNUM_Onlyselectedvalues") ;
            Combo_mmsprvnum_Selectalltext = httpContext.cgiGet( "COMBO_MMSPRVNUM_Selectalltext") ;
            Combo_mmsprvnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MMSPRVNUM_Multiplevaluesseparator") ;
            Combo_mmsprvnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_MMSPRVNUM_Addnewoptiontext") ;
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
            Combo_mmsrcod_Objectcall = httpContext.cgiGet( "COMBO_MMSRCOD_Objectcall") ;
            Combo_mmsrcod_Class = httpContext.cgiGet( "COMBO_MMSRCOD_Class") ;
            Combo_mmsrcod_Icontype = httpContext.cgiGet( "COMBO_MMSRCOD_Icontype") ;
            Combo_mmsrcod_Icon = httpContext.cgiGet( "COMBO_MMSRCOD_Icon") ;
            Combo_mmsrcod_Caption = httpContext.cgiGet( "COMBO_MMSRCOD_Caption") ;
            Combo_mmsrcod_Tooltip = httpContext.cgiGet( "COMBO_MMSRCOD_Tooltip") ;
            Combo_mmsrcod_Cls = httpContext.cgiGet( "COMBO_MMSRCOD_Cls") ;
            Combo_mmsrcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MMSRCOD_Selectedvalue_set") ;
            Combo_mmsrcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MMSRCOD_Selectedvalue_get") ;
            Combo_mmsrcod_Selectedtext_set = httpContext.cgiGet( "COMBO_MMSRCOD_Selectedtext_set") ;
            Combo_mmsrcod_Selectedtext_get = httpContext.cgiGet( "COMBO_MMSRCOD_Selectedtext_get") ;
            Combo_mmsrcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_MMSRCOD_Gamoauthtoken") ;
            Combo_mmsrcod_Ddointernalname = httpContext.cgiGet( "COMBO_MMSRCOD_Ddointernalname") ;
            Combo_mmsrcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_MMSRCOD_Titlecontrolalign") ;
            Combo_mmsrcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MMSRCOD_Dropdownoptionstype") ;
            Combo_mmsrcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSRCOD_Enabled")) ;
            Combo_mmsrcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSRCOD_Visible")) ;
            Combo_mmsrcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MMSRCOD_Titlecontrolidtoreplace") ;
            Combo_mmsrcod_Datalisttype = httpContext.cgiGet( "COMBO_MMSRCOD_Datalisttype") ;
            Combo_mmsrcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSRCOD_Allowmultipleselection")) ;
            Combo_mmsrcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MMSRCOD_Datalistfixedvalues") ;
            Combo_mmsrcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSRCOD_Isgriditem")) ;
            Combo_mmsrcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSRCOD_Hasdescription")) ;
            Combo_mmsrcod_Datalistproc = httpContext.cgiGet( "COMBO_MMSRCOD_Datalistproc") ;
            Combo_mmsrcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MMSRCOD_Datalistprocparametersprefix") ;
            Combo_mmsrcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MMSRCOD_Remoteservicesparameters") ;
            Combo_mmsrcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MMSRCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_mmsrcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSRCOD_Includeonlyselectedoption")) ;
            Combo_mmsrcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSRCOD_Includeselectalloption")) ;
            Combo_mmsrcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSRCOD_Emptyitem")) ;
            Combo_mmsrcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MMSRCOD_Includeaddnewoption")) ;
            Combo_mmsrcod_Htmltemplate = httpContext.cgiGet( "COMBO_MMSRCOD_Htmltemplate") ;
            Combo_mmsrcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MMSRCOD_Multiplevaluestype") ;
            Combo_mmsrcod_Loadingdata = httpContext.cgiGet( "COMBO_MMSRCOD_Loadingdata") ;
            Combo_mmsrcod_Noresultsfound = httpContext.cgiGet( "COMBO_MMSRCOD_Noresultsfound") ;
            Combo_mmsrcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MMSRCOD_Emptyitemtext") ;
            Combo_mmsrcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MMSRCOD_Onlyselectedvalues") ;
            Combo_mmsrcod_Selectalltext = httpContext.cgiGet( "COMBO_MMSRCOD_Selectalltext") ;
            Combo_mmsrcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MMSRCOD_Multiplevaluesseparator") ;
            Combo_mmsrcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_MMSRCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
            cmbMMSTpo.setName( cmbMMSTpo.getInternalname() );
            cmbMMSTpo.setValue( httpContext.cgiGet( cmbMMSTpo.getInternalname()) );
            A9413MMSTpo = httpContext.cgiGet( cmbMMSTpo.getInternalname()) ;
            n9413MMSTpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9413MMSTpo", A9413MMSTpo);
            if ( localUtil.vcdate( httpContext.cgiGet( edtMMSFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MMSFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMMSFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9416MMSFch = GXutil.nullDate() ;
               n9416MMSFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9416MMSFch", localUtil.format(A9416MMSFch, "99/99/99"));
            }
            else
            {
               A9416MMSFch = localUtil.ctod( httpContext.cgiGet( edtMMSFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9416MMSFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9416MMSFch", localUtil.format(A9416MMSFch, "99/99/99"));
            }
            cmbMMSEst.setName( cmbMMSEst.getInternalname() );
            cmbMMSEst.setValue( httpContext.cgiGet( cmbMMSEst.getInternalname()) );
            A9420MMSEst = httpContext.cgiGet( cmbMMSEst.getInternalname()) ;
            n9420MMSEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9420MMSEst", A9420MMSEst);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMMSPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMMSPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMSPRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMMSPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9414MMSPrvNum = 0 ;
               n9414MMSPrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
            }
            else
            {
               A9414MMSPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9414MMSPrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMMSDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSDto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMSDTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMMSDto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11509MMSDto = DecimalUtil.ZERO ;
               n11509MMSDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11509MMSDto", GXutil.ltrimstr( A11509MMSDto, 6, 2));
            }
            else
            {
               A11509MMSDto = localUtil.ctond( httpContext.cgiGet( edtMMSDto_Internalname)) ;
               n11509MMSDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11509MMSDto", GXutil.ltrimstr( A11509MMSDto, 6, 2));
            }
            A9419MMSNroExt = httpContext.cgiGet( edtMMSNroExt_Internalname) ;
            n9419MMSNroExt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9419MMSNroExt", A9419MMSNroExt);
            A9417MMSUsuCre = httpContext.cgiGet( edtMMSUsuCre_Internalname) ;
            n9417MMSUsuCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9417MMSUsuCre", A9417MMSUsuCre);
            A9418MMSFchCre = localUtil.ctot( httpContext.cgiGet( edtMMSFchCre_Internalname)) ;
            n9418MMSFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9418MMSFchCre", localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A11304MMSFchApl = localUtil.ctot( httpContext.cgiGet( edtMMSFchApl_Internalname)) ;
            n11304MMSFchApl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11304MMSFchApl", localUtil.ttoc( A11304MMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV33ComboMMSPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavCombommsprvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33ComboMMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ComboMMSPrvNum), 6, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9415MMSPrvNom = httpContext.cgiGet( edtMMSPrvNom_Internalname) ;
            n9415MMSPrvNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9415MMSPrvNom", A9415MMSPrvNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMMovSt");
            A9417MMSUsuCre = httpContext.cgiGet( edtMMSUsuCre_Internalname) ;
            n9417MMSUsuCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9417MMSUsuCre", A9417MMSUsuCre);
            forbiddenHiddens.add("MMSUsuCre", GXutil.rtrim( localUtil.format( A9417MMSUsuCre, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A9418MMSFchCre = localUtil.ctot( httpContext.cgiGet( edtMMSFchCre_Internalname)) ;
            n9418MMSFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9418MMSFchCre", localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("MMSFchCre", localUtil.format( A9418MMSFchCre, "99/99/99 99:99"));
            A11304MMSFchApl = localUtil.ctot( httpContext.cgiGet( edtMMSFchApl_Internalname)) ;
            n11304MMSFchApl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11304MMSFchApl", localUtil.ttoc( A11304MMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("MMSFchApl", localUtil.format( A11304MMSFchApl, "99/99/99 99:99"));
            A9420MMSEst = httpContext.cgiGet( cmbMMSEst.getInternalname()) ;
            n9420MMSEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9420MMSEst", A9420MMSEst);
            forbiddenHiddens.add("MMSEst", GXutil.rtrim( localUtil.format( A9420MMSEst, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9412MMSCod != Z9412MMSCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tmmovst:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A9412MMSCod = (int)(GXutil.lval( httpContext.GetPar( "MMSCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV13MMSCod) )
               {
                  A9412MMSCod = AV13MMSCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A9412MMSCod = AV13MMSCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
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
                  sMode1230 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV13MMSCod) )
                  {
                     A9412MMSCod = AV13MMSCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A9412MMSCod = AV13MMSCod ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
                     }
                  }
                  Gx_mode = sMode1230 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1230 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_13R0( ) ;
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
                        e1113R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1213R2 ();
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
         e1213R2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13R1230( ) ;
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
         disableAttributes13R1230( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavCombommsprvnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombommsprvnum_Enabled), 5, 0), true);
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

   public void confirm_13R0( )
   {
      beforeValidate13R1230( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13R1230( ) ;
         }
         else
         {
            checkExtendedTable13R1230( ) ;
            closeExtendedTableCursors13R1230( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1230 = Gx_mode ;
         confirm_13R1231( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1230 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1230 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_13R1231( )
   {
      nGXsfl_74_idx = 0 ;
      while ( nGXsfl_74_idx < nRC_GXsfl_74 )
      {
         readRow13R1231( ) ;
         if ( ( nRcdExists_1231 != 0 ) || ( nIsMod_1231 != 0 ) )
         {
            getKey13R1231( ) ;
            if ( ( nRcdExists_1231 == 0 ) && ( nRcdDeleted_1231 == 0 ) )
            {
               if ( RcdFound1231 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13R1231( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13R1231( ) ;
                     closeExtendedTableCursors13R1231( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MMSRCOD_" + sGXsfl_74_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMMSRCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1231 != 0 )
               {
                  if ( nRcdDeleted_1231 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13R1231( ) ;
                     load13R1231( ) ;
                     beforeValidate13R1231( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13R1231( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1231 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13R1231( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13R1231( ) ;
                           closeExtendedTableCursors13R1231( ) ;
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
                  if ( nRcdDeleted_1231 == 0 )
                  {
                     GXCCtl = "MMSRCOD_" + sGXsfl_74_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMMSRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMMSRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9421MMSRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRNom_Internalname, GXutil.rtrim( A9422MMSRNom)) ;
         httpContext.changePostValue( edtMMSRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRPreD_Internalname, GXutil.ltrim( localUtil.ntoc( A11510MMSRPreD, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9423MMSRStkPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRTot_Internalname, GXutil.ltrim( localUtil.ntoc( A11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRDto_Internalname, GXutil.ltrim( localUtil.ntoc( A11512MMSRDto, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9421MMSRCod_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z9421MMSRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9424MMSRPre_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11511MMSRTot_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11510MMSRPreD_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z11510MMSRPreD, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11512MMSRDto_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z11512MMSRDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9409MMSRCnt_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9409MMSRCnt_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( O9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1231_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1231, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1231_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1231, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1231_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1231, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11511MMSRTot_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( A11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N9424MMSRPre_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1231 != 0 )
         {
            httpContext.changePostValue( "MMSRCOD_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRCOD_"+sGXsfl_74_idx+"Horizontalalignment", GXutil.rtrim( edtMMSRCod_Horizontalalignment)) ;
            httpContext.changePostValue( "MMSRNOM_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRCNT_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRPRED_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRPreD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRSTKPRE_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRStkPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRTOT_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRTot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRDTO_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRPRE_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption13R0( )
   {
   }

   public void e1113R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmmovst_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      tmmovst_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmmovst_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmmovst_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char2[0] = AV30ObtenerEmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmmovst_impl.this.AV30ObtenerEmprCod = GXv_char2[0] ;
      tmmovst_impl.this.AV14EmprNom = GXv_char3[0] ;
      tmmovst_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30ObtenerEmprCod", AV30ObtenerEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_char4[0] = AV23EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "MS", "") ;
      GXv_int5[0] = AV16MTMovCod ;
      GXv_char2[0] = AV17MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_char2) ;
      tmmovst_impl.this.AV23EmprCod = GXv_char4[0] ;
      tmmovst_impl.this.AV16MTMovCod = GXv_int5[0] ;
      tmmovst_impl.this.AV17MTMovNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovNom", AV17MTMovNom);
      GXt_char1 = AV11Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmmovst_impl.this.GXt_char1 = GXv_char4[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char4[0] = AV23EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmmovst_impl.this.AV23EmprCod = GXv_char4[0] ;
      tmmovst_impl.this.AV14EmprNom = GXv_char3[0] ;
      tmmovst_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext6[0] = AV28WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext6) ;
      AV28WWPContext = GXv_SdtWWPContext6[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV34DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV34DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Combo_mmsrcod_Titlecontrolidtoreplace = edtMMSRCod_Internalname ;
      ucCombo_mmsrcod.sendProperty(context, "", false, Combo_mmsrcod_Internalname, "TitleControlIdToReplace", Combo_mmsrcod_Titlecontrolidtoreplace);
      edtMMSRCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRCod_Internalname, "Horizontalalignment", edtMMSRCod_Horizontalalignment, !bGXsfl_74_Refreshing);
      edtMMSPrvNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSPrvNum_Visible), 5, 0), true);
      AV33ComboMMSPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ComboMMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ComboMMSPrvNum), 6, 0));
      edtavCombommsprvnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombommsprvnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombommsprvnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMMSPRVNUM' */
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
      /* Execute user subroutine: 'LOADCOMBOMMSRCOD' */
      S122 ();
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
      AV25TrnContext.fromxml(AV27WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV25TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV37Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV38GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GXV1), 8, 0));
         while ( AV38GXV1 <= AV25TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV26TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV25TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV38GXV1));
            if ( GXutil.strcmp(AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MMSPrvNum") == 0 )
            {
               AV24Insert_MMSPrvNum = (int)(GXutil.lval( AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Insert_MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Insert_MMSPrvNum), 6, 0));
               if ( ! (0==AV24Insert_MMSPrvNum) )
               {
                  AV33ComboMMSPrvNum = AV24Insert_MMSPrvNum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV33ComboMMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ComboMMSPrvNum), 6, 0));
                  Combo_mmsprvnum_Selectedvalue_set = GXutil.trim( GXutil.str( AV33ComboMMSPrvNum, 6, 0)) ;
                  ucCombo_mmsprvnum.sendProperty(context, "", false, Combo_mmsprvnum_Internalname, "SelectedValue_set", Combo_mmsprvnum_Selectedvalue_set);
                  Combo_mmsprvnum_Enabled = false ;
                  ucCombo_mmsprvnum.sendProperty(context, "", false, Combo_mmsprvnum_Internalname, "Enabled", GXutil.booltostr( Combo_mmsprvnum_Enabled));
               }
            }
            AV38GXV1 = (int)(AV38GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtMMSPrvNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSPrvNom_Visible), 5, 0), true);
   }

   public void e1213R2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
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
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV25TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmmovstww", new String[] {}, new String[] {}) );
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
   }

   public void S122( )
   {
      /* 'LOADCOMBOMMSRCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = AV35MMSRCod_Data ;
      GXv_char4[0] = AV32ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item10[0] = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
      new app.mantenimientomaquina.tmmovstloaddvcombo(remoteHandle, context).execute( "MMSRCod", Gx_mode, AV23EmprCod, AV13MMSCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item10) ;
      tmmovst_impl.this.AV32ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = GXv_objcol_SdtDVB_SDTComboData_Item10[0] ;
      AV35MMSRCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
   }

   public void S112( )
   {
      /* 'LOADCOMBOMMSPRVNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = AV31MMSPrvNum_Data ;
      GXv_char4[0] = AV32ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item10[0] = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
      new app.mantenimientomaquina.tmmovstloaddvcombo(remoteHandle, context).execute( "MMSPrvNum", Gx_mode, AV23EmprCod, AV13MMSCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item10) ;
      tmmovst_impl.this.AV32ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = GXv_objcol_SdtDVB_SDTComboData_Item10[0] ;
      AV31MMSPrvNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
      Combo_mmsprvnum_Selectedvalue_set = AV32ComboSelectedValue ;
      ucCombo_mmsprvnum.sendProperty(context, "", false, Combo_mmsprvnum_Internalname, "SelectedValue_set", Combo_mmsprvnum_Selectedvalue_set);
      AV33ComboMMSPrvNum = (int)(GXutil.lval( AV32ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ComboMMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ComboMMSPrvNum), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_mmsprvnum_Enabled = false ;
         ucCombo_mmsprvnum.sendProperty(context, "", false, Combo_mmsprvnum_Internalname, "Enabled", GXutil.booltostr( Combo_mmsprvnum_Enabled));
      }
   }

   public void zm13R1230( int GX_JID )
   {
      if ( ( GX_JID == 35 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9413MMSTpo = T013R6_A9413MMSTpo[0] ;
            Z9416MMSFch = T013R6_A9416MMSFch[0] ;
            Z9417MMSUsuCre = T013R6_A9417MMSUsuCre[0] ;
            Z9418MMSFchCre = T013R6_A9418MMSFchCre[0] ;
            Z11304MMSFchApl = T013R6_A11304MMSFchApl[0] ;
            Z9419MMSNroExt = T013R6_A9419MMSNroExt[0] ;
            Z9420MMSEst = T013R6_A9420MMSEst[0] ;
            Z11509MMSDto = T013R6_A11509MMSDto[0] ;
            Z9414MMSPrvNum = T013R6_A9414MMSPrvNum[0] ;
         }
         else
         {
            Z9413MMSTpo = A9413MMSTpo ;
            Z9416MMSFch = A9416MMSFch ;
            Z9417MMSUsuCre = A9417MMSUsuCre ;
            Z9418MMSFchCre = A9418MMSFchCre ;
            Z11304MMSFchApl = A11304MMSFchApl ;
            Z9419MMSNroExt = A9419MMSNroExt ;
            Z9420MMSEst = A9420MMSEst ;
            Z11509MMSDto = A11509MMSDto ;
            Z9414MMSPrvNum = A9414MMSPrvNum ;
         }
      }
      if ( GX_JID == -35 )
      {
         Z9412MMSCod = A9412MMSCod ;
         Z9413MMSTpo = A9413MMSTpo ;
         Z9416MMSFch = A9416MMSFch ;
         Z9417MMSUsuCre = A9417MMSUsuCre ;
         Z9418MMSFchCre = A9418MMSFchCre ;
         Z11304MMSFchApl = A11304MMSFchApl ;
         Z9419MMSNroExt = A9419MMSNroExt ;
         Z9420MMSEst = A9420MMSEst ;
         Z11509MMSDto = A11509MMSDto ;
         Z396EmprCod = A396EmprCod ;
         Z9414MMSPrvNum = A9414MMSPrvNum ;
         Z407EmprNom = A407EmprNom ;
         Z9415MMSPrvNom = A9415MMSPrvNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMMSUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSUsuCre_Enabled), 5, 0), true);
      edtMMSFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFchCre_Enabled), 5, 0), true);
      edtMMSFchApl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFchApl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFchApl_Enabled), 5, 0), true);
      cmbMMSEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMMSEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMMSEst.getEnabled(), 5, 0), true);
      AV37Pgmname = "MantenimientoMaquina.TMMovSt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMMSCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSCod_Enabled), 5, 0), true);
      edtMMSUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSUsuCre_Enabled), 5, 0), true);
      edtMMSFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFchCre_Enabled), 5, 0), true);
      edtMMSFchApl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFchApl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFchApl_Enabled), 5, 0), true);
      cmbMMSEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMMSEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMMSEst.getEnabled(), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV23EmprCod)==0) )
      {
         A396EmprCod = AV23EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV23EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV23EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13MMSCod) )
      {
         edtMMSCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtMMSCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSCod_Enabled), 5, 0), true);
         }
         else
         {
            edtMMSCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSCod_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV13MMSCod) )
      {
         edtMMSCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_MMSPrvNum) )
      {
         edtMMSPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSPrvNum_Enabled), 5, 0), true);
      }
      else
      {
         edtMMSPrvNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSPrvNum_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_MMSPrvNum) )
      {
         A9414MMSPrvNum = AV24Insert_MMSPrvNum ;
         n9414MMSPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
      }
      else
      {
         A9414MMSPrvNum = AV33ComboMMSPrvNum ;
         n9414MMSPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
      }
      if ( ! (0==AV13MMSCod) )
      {
         A9412MMSCod = AV13MMSCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9412MMSCod = AV13MMSCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
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
      if ( isIns( )  && (GXutil.strcmp("", A9417MMSUsuCre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9417MMSUsuCre = AV8UsurCod ;
         n9417MMSUsuCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9417MMSUsuCre", A9417MMSUsuCre);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A9418MMSFchCre) && ( Gx_BScreen == 0 ) )
      {
         A9418MMSFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n9418MMSFchCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9418MMSFchCre", localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9416MMSFch)) && ( Gx_BScreen == 0 ) )
      {
         A9416MMSFch = GXutil.today( ) ;
         n9416MMSFch = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9416MMSFch", localUtil.format(A9416MMSFch, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A9420MMSEst)==0) && ( Gx_BScreen == 0 ) )
      {
         A9420MMSEst = httpContext.getMessage( httpContext.getMessage( "E", ""), "") ;
         n9420MMSEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9420MMSEst", A9420MMSEst);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T013R7 */
         pr_default.execute(5, new Object[] {A396EmprCod});
         A407EmprNom = T013R7_A407EmprNom[0] ;
         n407EmprNom = T013R7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(5);
         /* Using cursor T013R8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n9414MMSPrvNum), Integer.valueOf(A9414MMSPrvNum)});
         A9415MMSPrvNom = T013R8_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = T013R8_n9415MMSPrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9415MMSPrvNom", A9415MMSPrvNom);
         pr_default.close(6);
      }
   }

   public void load13R1230( )
   {
      /* Using cursor T013R9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1230 = (short)(1) ;
         A407EmprNom = T013R9_A407EmprNom[0] ;
         n407EmprNom = T013R9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9413MMSTpo = T013R9_A9413MMSTpo[0] ;
         n9413MMSTpo = T013R9_n9413MMSTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9413MMSTpo", A9413MMSTpo);
         A9415MMSPrvNom = T013R9_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = T013R9_n9415MMSPrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9415MMSPrvNom", A9415MMSPrvNom);
         A9416MMSFch = T013R9_A9416MMSFch[0] ;
         n9416MMSFch = T013R9_n9416MMSFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9416MMSFch", localUtil.format(A9416MMSFch, "99/99/99"));
         A9417MMSUsuCre = T013R9_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = T013R9_n9417MMSUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9417MMSUsuCre", A9417MMSUsuCre);
         A9418MMSFchCre = T013R9_A9418MMSFchCre[0] ;
         n9418MMSFchCre = T013R9_n9418MMSFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9418MMSFchCre", localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11304MMSFchApl = T013R9_A11304MMSFchApl[0] ;
         n11304MMSFchApl = T013R9_n11304MMSFchApl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11304MMSFchApl", localUtil.ttoc( A11304MMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9419MMSNroExt = T013R9_A9419MMSNroExt[0] ;
         n9419MMSNroExt = T013R9_n9419MMSNroExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9419MMSNroExt", A9419MMSNroExt);
         A9420MMSEst = T013R9_A9420MMSEst[0] ;
         n9420MMSEst = T013R9_n9420MMSEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9420MMSEst", A9420MMSEst);
         A11509MMSDto = T013R9_A11509MMSDto[0] ;
         n11509MMSDto = T013R9_n11509MMSDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11509MMSDto", GXutil.ltrimstr( A11509MMSDto, 6, 2));
         A9414MMSPrvNum = T013R9_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = T013R9_n9414MMSPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
         zm13R1230( -35) ;
      }
      pr_default.close(7);
      onLoadActions13R1230( ) ;
   }

   public void onLoadActions13R1230( )
   {
   }

   public void checkExtendedTable13R1230( )
   {
      nIsDirty_1230 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T013R7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013R7_A407EmprNom[0] ;
      n407EmprNom = T013R7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T013R8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n9414MMSPrvNum), Integer.valueOf(A9414MMSPrvNum)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSPrv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9415MMSPrvNom = T013R8_A9415MMSPrvNom[0] ;
      n9415MMSPrvNom = T013R8_n9415MMSPrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9415MMSPrvNom", A9415MMSPrvNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors13R1230( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_36( String A396EmprCod )
   {
      /* Using cursor T013R10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013R10_A407EmprNom[0] ;
      n407EmprNom = T013R10_n407EmprNom[0] ;
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

   public void gxload_37( String A396EmprCod ,
                          int A9414MMSPrvNum )
   {
      /* Using cursor T013R11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n9414MMSPrvNum), Integer.valueOf(A9414MMSPrvNum)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSPrv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9415MMSPrvNom = T013R11_A9415MMSPrvNom[0] ;
      n9415MMSPrvNom = T013R11_n9415MMSPrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9415MMSPrvNom", A9415MMSPrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9415MMSPrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey13R1230( )
   {
      /* Using cursor T013R12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1230 = (short)(1) ;
      }
      else
      {
         RcdFound1230 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013R6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm13R1230( 35) ;
         RcdFound1230 = (short)(1) ;
         A9412MMSCod = T013R6_A9412MMSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         A9413MMSTpo = T013R6_A9413MMSTpo[0] ;
         n9413MMSTpo = T013R6_n9413MMSTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9413MMSTpo", A9413MMSTpo);
         A9416MMSFch = T013R6_A9416MMSFch[0] ;
         n9416MMSFch = T013R6_n9416MMSFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9416MMSFch", localUtil.format(A9416MMSFch, "99/99/99"));
         A9417MMSUsuCre = T013R6_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = T013R6_n9417MMSUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9417MMSUsuCre", A9417MMSUsuCre);
         A9418MMSFchCre = T013R6_A9418MMSFchCre[0] ;
         n9418MMSFchCre = T013R6_n9418MMSFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9418MMSFchCre", localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11304MMSFchApl = T013R6_A11304MMSFchApl[0] ;
         n11304MMSFchApl = T013R6_n11304MMSFchApl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11304MMSFchApl", localUtil.ttoc( A11304MMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9419MMSNroExt = T013R6_A9419MMSNroExt[0] ;
         n9419MMSNroExt = T013R6_n9419MMSNroExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9419MMSNroExt", A9419MMSNroExt);
         A9420MMSEst = T013R6_A9420MMSEst[0] ;
         n9420MMSEst = T013R6_n9420MMSEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9420MMSEst", A9420MMSEst);
         A11509MMSDto = T013R6_A11509MMSDto[0] ;
         n11509MMSDto = T013R6_n11509MMSDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11509MMSDto", GXutil.ltrimstr( A11509MMSDto, 6, 2));
         A396EmprCod = T013R6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9414MMSPrvNum = T013R6_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = T013R6_n9414MMSPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z9412MMSCod = A9412MMSCod ;
         sMode1230 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13R1230( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1230 = (short)(0) ;
            initializeNonKey13R1230( ) ;
         }
         Gx_mode = sMode1230 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1230 = (short)(0) ;
         initializeNonKey13R1230( ) ;
         sMode1230 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1230 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey13R1230( ) ;
      if ( RcdFound1230 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1230 = (short)(0) ;
      /* Using cursor T013R13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9412MMSCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T013R13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013R13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013R13_A9412MMSCod[0] < A9412MMSCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T013R13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013R13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013R13_A9412MMSCod[0] > A9412MMSCod ) ) )
         {
            A396EmprCod = T013R13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9412MMSCod = T013R13_A9412MMSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
            RcdFound1230 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1230 = (short)(0) ;
      /* Using cursor T013R14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9412MMSCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T013R14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013R14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013R14_A9412MMSCod[0] > A9412MMSCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T013R14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013R14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013R14_A9412MMSCod[0] < A9412MMSCod ) ) )
         {
            A396EmprCod = T013R14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9412MMSCod = T013R14_A9412MMSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
            RcdFound1230 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13R1230( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = cmbMMSTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13R1230( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1230 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9412MMSCod != Z9412MMSCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9412MMSCod = Z9412MMSCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = cmbMMSTpo.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update13R1230( ) ;
               GX_FocusControl = cmbMMSTpo.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9412MMSCod != Z9412MMSCod ) )
            {
               /* Insert record */
               GX_FocusControl = cmbMMSTpo.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13R1230( ) ;
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
                  GX_FocusControl = cmbMMSTpo.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13R1230( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9412MMSCod != Z9412MMSCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9412MMSCod = Z9412MMSCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = cmbMMSTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency13R1230( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013R5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMMoStk"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z9413MMSTpo, T013R5_A9413MMSTpo[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9416MMSFch), GXutil.resetTime(T013R5_A9416MMSFch[0])) ) || ( GXutil.strcmp(Z9417MMSUsuCre, T013R5_A9417MMSUsuCre[0]) != 0 ) || !( GXutil.dateCompare(Z9418MMSFchCre, T013R5_A9418MMSFchCre[0]) ) || !( GXutil.dateCompare(Z11304MMSFchApl, T013R5_A11304MMSFchApl[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9419MMSNroExt, T013R5_A9419MMSNroExt[0]) != 0 ) || ( GXutil.strcmp(Z9420MMSEst, T013R5_A9420MMSEst[0]) != 0 ) || ( DecimalUtil.compareTo(Z11509MMSDto, T013R5_A11509MMSDto[0]) != 0 ) || ( Z9414MMSPrvNum != T013R5_A9414MMSPrvNum[0] ) )
         {
            if ( GXutil.strcmp(Z9413MMSTpo, T013R5_A9413MMSTpo[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSTpo");
               GXutil.writeLogRaw("Old: ",Z9413MMSTpo);
               GXutil.writeLogRaw("Current: ",T013R5_A9413MMSTpo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9416MMSFch), GXutil.resetTime(T013R5_A9416MMSFch[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSFch");
               GXutil.writeLogRaw("Old: ",Z9416MMSFch);
               GXutil.writeLogRaw("Current: ",T013R5_A9416MMSFch[0]);
            }
            if ( GXutil.strcmp(Z9417MMSUsuCre, T013R5_A9417MMSUsuCre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSUsuCre");
               GXutil.writeLogRaw("Old: ",Z9417MMSUsuCre);
               GXutil.writeLogRaw("Current: ",T013R5_A9417MMSUsuCre[0]);
            }
            if ( !( GXutil.dateCompare(Z9418MMSFchCre, T013R5_A9418MMSFchCre[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSFchCre");
               GXutil.writeLogRaw("Old: ",Z9418MMSFchCre);
               GXutil.writeLogRaw("Current: ",T013R5_A9418MMSFchCre[0]);
            }
            if ( !( GXutil.dateCompare(Z11304MMSFchApl, T013R5_A11304MMSFchApl[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSFchApl");
               GXutil.writeLogRaw("Old: ",Z11304MMSFchApl);
               GXutil.writeLogRaw("Current: ",T013R5_A11304MMSFchApl[0]);
            }
            if ( GXutil.strcmp(Z9419MMSNroExt, T013R5_A9419MMSNroExt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSNroExt");
               GXutil.writeLogRaw("Old: ",Z9419MMSNroExt);
               GXutil.writeLogRaw("Current: ",T013R5_A9419MMSNroExt[0]);
            }
            if ( GXutil.strcmp(Z9420MMSEst, T013R5_A9420MMSEst[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSEst");
               GXutil.writeLogRaw("Old: ",Z9420MMSEst);
               GXutil.writeLogRaw("Current: ",T013R5_A9420MMSEst[0]);
            }
            if ( DecimalUtil.compareTo(Z11509MMSDto, T013R5_A11509MMSDto[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSDto");
               GXutil.writeLogRaw("Old: ",Z11509MMSDto);
               GXutil.writeLogRaw("Current: ",T013R5_A11509MMSDto[0]);
            }
            if ( Z9414MMSPrvNum != T013R5_A9414MMSPrvNum[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSPrvNum");
               GXutil.writeLogRaw("Old: ",Z9414MMSPrvNum);
               GXutil.writeLogRaw("Current: ",T013R5_A9414MMSPrvNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMMoStk"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13R1230( )
   {
      beforeValidate13R1230( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13R1230( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13R1230( 0) ;
         checkOptimisticConcurrency13R1230( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13R1230( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13R1230( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013R15 */
                  pr_default.execute(13, new Object[] {Integer.valueOf(A9412MMSCod), Boolean.valueOf(n9413MMSTpo), A9413MMSTpo, Boolean.valueOf(n9416MMSFch), A9416MMSFch, Boolean.valueOf(n9417MMSUsuCre), A9417MMSUsuCre, Boolean.valueOf(n9418MMSFchCre), A9418MMSFchCre, Boolean.valueOf(n11304MMSFchApl), A11304MMSFchApl, Boolean.valueOf(n9419MMSNroExt), A9419MMSNroExt, Boolean.valueOf(n9420MMSEst), A9420MMSEst, Boolean.valueOf(n11509MMSDto), A11509MMSDto, A396EmprCod, Boolean.valueOf(n9414MMSPrvNum), Integer.valueOf(A9414MMSPrvNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStk");
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
                        processLevel13R1230( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption13R0( ) ;
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
            load13R1230( ) ;
         }
         endLevel13R1230( ) ;
      }
      closeExtendedTableCursors13R1230( ) ;
   }

   public void update13R1230( )
   {
      beforeValidate13R1230( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13R1230( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13R1230( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13R1230( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13R1230( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013R16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n9413MMSTpo), A9413MMSTpo, Boolean.valueOf(n9416MMSFch), A9416MMSFch, Boolean.valueOf(n9417MMSUsuCre), A9417MMSUsuCre, Boolean.valueOf(n9418MMSFchCre), A9418MMSFchCre, Boolean.valueOf(n11304MMSFchApl), A11304MMSFchApl, Boolean.valueOf(n9419MMSNroExt), A9419MMSNroExt, Boolean.valueOf(n9420MMSEst), A9420MMSEst, Boolean.valueOf(n11509MMSDto), A11509MMSDto, Boolean.valueOf(n9414MMSPrvNum), Integer.valueOf(A9414MMSPrvNum), A396EmprCod, Integer.valueOf(A9412MMSCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStk");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMMoStk"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13R1230( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13R1230( ) ;
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
         endLevel13R1230( ) ;
      }
      closeExtendedTableCursors13R1230( ) ;
   }

   public void deferredUpdate13R1230( )
   {
   }

   public void delete( )
   {
      beforeValidate13R1230( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13R1230( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13R1230( ) ;
         afterConfirm13R1230( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13R1230( ) ;
            if ( AnyError == 0 )
            {
               scanStart13R1231( ) ;
               while ( RcdFound1231 != 0 )
               {
                  getByPrimaryKey13R1231( ) ;
                  delete13R1231( ) ;
                  scanNext13R1231( ) ;
               }
               scanEnd13R1231( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013R17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStk");
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
      sMode1230 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13R1230( ) ;
      Gx_mode = sMode1230 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13R1230( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013R18 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         A407EmprNom = T013R18_A407EmprNom[0] ;
         n407EmprNom = T013R18_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(16);
         /* Using cursor T013R19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n9414MMSPrvNum), Integer.valueOf(A9414MMSPrvNum)});
         A9415MMSPrvNom = T013R19_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = T013R19_n9415MMSPrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9415MMSPrvNom", A9415MMSPrvNom);
         pr_default.close(17);
      }
   }

   public void processNestedLevel13R1231( )
   {
      nGXsfl_74_idx = 0 ;
      while ( nGXsfl_74_idx < nRC_GXsfl_74 )
      {
         readRow13R1231( ) ;
         if ( ( nRcdExists_1231 != 0 ) || ( nIsMod_1231 != 0 ) )
         {
            standaloneNotModal13R1231( ) ;
            getKey13R1231( ) ;
            if ( ( nRcdExists_1231 == 0 ) && ( nRcdDeleted_1231 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13R1231( ) ;
            }
            else
            {
               if ( RcdFound1231 != 0 )
               {
                  if ( ( nRcdDeleted_1231 != 0 ) && ( nRcdExists_1231 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13R1231( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1231 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13R1231( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1231 == 0 )
                  {
                     GXCCtl = "MMSRCOD_" + sGXsfl_74_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMMSRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMMSRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9421MMSRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRNom_Internalname, GXutil.rtrim( A9422MMSRNom)) ;
         httpContext.changePostValue( edtMMSRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRPreD_Internalname, GXutil.ltrim( localUtil.ntoc( A11510MMSRPreD, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9423MMSRStkPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRTot_Internalname, GXutil.ltrim( localUtil.ntoc( A11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRDto_Internalname, GXutil.ltrim( localUtil.ntoc( A11512MMSRDto, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMMSRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9421MMSRCod_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z9421MMSRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9424MMSRPre_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11511MMSRTot_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11510MMSRPreD_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z11510MMSRPreD, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11512MMSRDto_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z11512MMSRDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9409MMSRCnt_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( Z9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9409MMSRCnt_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( O9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1231_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1231, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1231_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1231, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1231_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1231, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N11511MMSRTot_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( A11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N9424MMSRPre_"+sGXsfl_74_idx, GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1231 != 0 )
         {
            httpContext.changePostValue( "MMSRCOD_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRCOD_"+sGXsfl_74_idx+"Horizontalalignment", GXutil.rtrim( edtMMSRCod_Horizontalalignment)) ;
            httpContext.changePostValue( "MMSRNOM_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRCNT_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRPRED_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRPreD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRSTKPRE_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRStkPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRTOT_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRTot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRDTO_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMSRPRE_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13R1231( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1231 = (short)(0) ;
      nIsMod_1231 = (short)(0) ;
      nRcdDeleted_1231 = (short)(0) ;
   }

   public void processLevel13R1230( )
   {
      /* Save parent mode. */
      sMode1230 = Gx_mode ;
      processNestedLevel13R1231( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1230 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13R1230( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13R1230( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmmovst");
         if ( AnyError == 0 )
         {
            confirmValues13R0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmmovst");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13R1230( )
   {
      /* Scan By routine */
      /* Using cursor T013R20 */
      pr_default.execute(18);
      RcdFound1230 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1230 = (short)(1) ;
         A396EmprCod = T013R20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9412MMSCod = T013R20_A9412MMSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13R1230( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1230 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1230 = (short)(1) ;
         A396EmprCod = T013R20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9412MMSCod = T013R20_A9412MMSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      }
   }

   public void scanEnd13R1230( )
   {
      pr_default.close(18);
   }

   public void afterConfirm13R1230( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXt_int11 = A9412MMSCod ;
         GXv_int5[0] = GXt_int11 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTMST", ""), ""), GXv_int5) ;
         tmmovst_impl.this.GXt_int11 = GXv_int5[0] ;
         A9412MMSCod = GXt_int11 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      }
   }

   public void beforeInsert13R1230( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13R1230( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13R1230( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13R1230( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13R1230( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13R1230( )
   {
      edtMMSCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSCod_Enabled), 5, 0), true);
      cmbMMSTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMMSTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMMSTpo.getEnabled(), 5, 0), true);
      edtMMSFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFch_Enabled), 5, 0), true);
      cmbMMSEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMMSEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMMSEst.getEnabled(), 5, 0), true);
      edtMMSPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSPrvNum_Enabled), 5, 0), true);
      edtMMSDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSDto_Enabled), 5, 0), true);
      edtMMSNroExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSNroExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSNroExt_Enabled), 5, 0), true);
      edtMMSUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSUsuCre_Enabled), 5, 0), true);
      edtMMSFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFchCre_Enabled), 5, 0), true);
      edtMMSFchApl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFchApl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFchApl_Enabled), 5, 0), true);
      edtavCombommsprvnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombommsprvnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombommsprvnum_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMMSPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSPrvNom_Enabled), 5, 0), true);
   }

   public void zm13R1231( int GX_JID )
   {
      if ( ( GX_JID == 38 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9424MMSRPre = T013R3_A9424MMSRPre[0] ;
            Z11511MMSRTot = T013R3_A11511MMSRTot[0] ;
            Z11510MMSRPreD = T013R3_A11510MMSRPreD[0] ;
            Z11512MMSRDto = T013R3_A11512MMSRDto[0] ;
            Z9409MMSRCnt = T013R3_A9409MMSRCnt[0] ;
         }
         else
         {
            Z9424MMSRPre = A9424MMSRPre ;
            Z11511MMSRTot = A11511MMSRTot ;
            Z11510MMSRPreD = A11510MMSRPreD ;
            Z11512MMSRDto = A11512MMSRDto ;
            Z9409MMSRCnt = A9409MMSRCnt ;
         }
      }
      if ( GX_JID == -38 )
      {
         Z9412MMSCod = A9412MMSCod ;
         Z9424MMSRPre = A9424MMSRPre ;
         Z11511MMSRTot = A11511MMSRTot ;
         Z11510MMSRPreD = A11510MMSRPreD ;
         Z11512MMSRDto = A11512MMSRDto ;
         Z9409MMSRCnt = A9409MMSRCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9421MMSRCod = A9421MMSRCod ;
         Z9422MMSRNom = A9422MMSRNom ;
         Z9423MMSRStkPre = A9423MMSRStkPre ;
      }
   }

   public void standaloneNotModal13R1231( )
   {
      edtMMSRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRNom_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRStkPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRStkPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
   }

   public void standaloneModal13R1231( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMMSRCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRCod_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
      else
      {
         edtMMSRCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRCod_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
   }

   public void load13R1231( )
   {
      /* Using cursor T013R21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1231 = (short)(1) ;
         A9424MMSRPre = T013R21_A9424MMSRPre[0] ;
         A11511MMSRTot = T013R21_A11511MMSRTot[0] ;
         A9422MMSRNom = T013R21_A9422MMSRNom[0] ;
         n9422MMSRNom = T013R21_n9422MMSRNom[0] ;
         A9423MMSRStkPre = T013R21_A9423MMSRStkPre[0] ;
         n9423MMSRStkPre = T013R21_n9423MMSRStkPre[0] ;
         A11510MMSRPreD = T013R21_A11510MMSRPreD[0] ;
         A11512MMSRDto = T013R21_A11512MMSRDto[0] ;
         A9409MMSRCnt = T013R21_A9409MMSRCnt[0] ;
         zm13R1231( -38) ;
      }
      pr_default.close(19);
      onLoadActions13R1231( ) ;
   }

   public void onLoadActions13R1231( )
   {
      if ( A11510MMSRPreD.doubleValue() > 0 )
      {
         A11511MMSRTot = A11510MMSRPreD.multiply(A9409MMSRCnt) ;
      }
      if ( A11510MMSRPreD.doubleValue() > 0 )
      {
         edtMMSRTot_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
      else
      {
         edtMMSRTot_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9424MMSRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9424MMSRPre = A9423MMSRStkPre ;
      }
      else
      {
         if ( A11511MMSRTot.doubleValue() > 0 )
         {
            A9424MMSRPre = ((A11511MMSRTot.divide(A9409MMSRCnt, 18, java.math.RoundingMode.DOWN)).multiply((DecimalUtil.doubleToDec(100).subtract(A11512MMSRDto)))).multiply((DecimalUtil.doubleToDec(100).subtract(A11509MMSDto))).divide(DecimalUtil.doubleToDec(10000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            if ( ( A11511MMSRTot.doubleValue() > 0 ) && true /* Level */ )
            {
               A9424MMSRPre = ((A11511MMSRTot.divide(A9409MMSRCnt, 18, java.math.RoundingMode.DOWN)).multiply((DecimalUtil.doubleToDec(100).subtract(A11512MMSRDto)))).multiply((DecimalUtil.doubleToDec(100).subtract(A11509MMSDto))).divide(DecimalUtil.doubleToDec(10000), 18, java.math.RoundingMode.DOWN) ;
            }
         }
      }
      if ( A11511MMSRTot.doubleValue() != 0 )
      {
         edtMMSRPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
      else
      {
         edtMMSRPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
   }

   public void checkExtendedTable13R1231( )
   {
      nIsDirty_1231 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal13R1231( ) ;
      /* Using cursor T013R4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MMSRCOD_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9422MMSRNom = T013R4_A9422MMSRNom[0] ;
      n9422MMSRNom = T013R4_n9422MMSRNom[0] ;
      A9423MMSRStkPre = T013R4_A9423MMSRStkPre[0] ;
      n9423MMSRStkPre = T013R4_n9423MMSRStkPre[0] ;
      pr_default.close(2);
      if ( A11510MMSRPreD.doubleValue() > 0 )
      {
         nIsDirty_1231 = (short)(1) ;
         A11511MMSRTot = A11510MMSRPreD.multiply(A9409MMSRCnt) ;
      }
      if ( A11510MMSRPreD.doubleValue() > 0 )
      {
         edtMMSRTot_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
      else
      {
         edtMMSRTot_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9424MMSRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1231 = (short)(1) ;
         A9424MMSRPre = A9423MMSRStkPre ;
      }
      else
      {
         if ( A11511MMSRTot.doubleValue() > 0 )
         {
            nIsDirty_1231 = (short)(1) ;
            A9424MMSRPre = ((A11511MMSRTot.divide(A9409MMSRCnt, 18, java.math.RoundingMode.DOWN)).multiply((DecimalUtil.doubleToDec(100).subtract(A11512MMSRDto)))).multiply((DecimalUtil.doubleToDec(100).subtract(A11509MMSDto))).divide(DecimalUtil.doubleToDec(10000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            if ( ( A11511MMSRTot.doubleValue() > 0 ) && true /* Level */ )
            {
               nIsDirty_1231 = (short)(1) ;
               A9424MMSRPre = ((A11511MMSRTot.divide(A9409MMSRCnt, 18, java.math.RoundingMode.DOWN)).multiply((DecimalUtil.doubleToDec(100).subtract(A11512MMSRDto)))).multiply((DecimalUtil.doubleToDec(100).subtract(A11509MMSDto))).divide(DecimalUtil.doubleToDec(10000), 18, java.math.RoundingMode.DOWN) ;
            }
         }
      }
      if ( A11511MMSRTot.doubleValue() != 0 )
      {
         edtMMSRPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
      else
      {
         edtMMSRPre_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      }
   }

   public void closeExtendedTableCursors13R1231( )
   {
      pr_default.close(2);
   }

   public void enableDisable13R1231( )
   {
   }

   public void gxload_39( String A396EmprCod ,
                          int A9421MMSRCod )
   {
      /* Using cursor T013R22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "MMSRCOD_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9422MMSRNom = T013R22_A9422MMSRNom[0] ;
      n9422MMSRNom = T013R22_n9422MMSRNom[0] ;
      A9423MMSRStkPre = T013R22_A9423MMSRStkPre[0] ;
      n9423MMSRStkPre = T013R22_n9423MMSRStkPre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9422MMSRNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9423MMSRStkPre, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey13R1231( )
   {
      /* Using cursor T013R23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1231 = (short)(1) ;
      }
      else
      {
         RcdFound1231 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey13R1231( )
   {
      /* Using cursor T013R3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm13R1231( 38) ;
         RcdFound1231 = (short)(1) ;
         initializeNonKey13R1231( ) ;
         A9424MMSRPre = T013R3_A9424MMSRPre[0] ;
         A11511MMSRTot = T013R3_A11511MMSRTot[0] ;
         A11510MMSRPreD = T013R3_A11510MMSRPreD[0] ;
         A11512MMSRDto = T013R3_A11512MMSRDto[0] ;
         A9409MMSRCnt = T013R3_A9409MMSRCnt[0] ;
         A9421MMSRCod = T013R3_A9421MMSRCod[0] ;
         O9409MMSRCnt = A9409MMSRCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9412MMSCod = A9412MMSCod ;
         Z9421MMSRCod = A9421MMSRCod ;
         sMode1231 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13R1231( ) ;
         Gx_mode = sMode1231 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1231 = (short)(0) ;
         initializeNonKey13R1231( ) ;
         sMode1231 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13R1231( ) ;
         Gx_mode = sMode1231 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13R1231( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency13R1231( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013R2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMMoStR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9424MMSRPre, T013R2_A9424MMSRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z11511MMSRTot, T013R2_A11511MMSRTot[0]) != 0 ) || ( DecimalUtil.compareTo(Z11510MMSRPreD, T013R2_A11510MMSRPreD[0]) != 0 ) || ( DecimalUtil.compareTo(Z11512MMSRDto, T013R2_A11512MMSRDto[0]) != 0 ) || ( DecimalUtil.compareTo(Z9409MMSRCnt, T013R2_A9409MMSRCnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9424MMSRPre, T013R2_A9424MMSRPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSRPre");
               GXutil.writeLogRaw("Old: ",Z9424MMSRPre);
               GXutil.writeLogRaw("Current: ",T013R2_A9424MMSRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z11511MMSRTot, T013R2_A11511MMSRTot[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSRTot");
               GXutil.writeLogRaw("Old: ",Z11511MMSRTot);
               GXutil.writeLogRaw("Current: ",T013R2_A11511MMSRTot[0]);
            }
            if ( DecimalUtil.compareTo(Z11510MMSRPreD, T013R2_A11510MMSRPreD[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSRPreD");
               GXutil.writeLogRaw("Old: ",Z11510MMSRPreD);
               GXutil.writeLogRaw("Current: ",T013R2_A11510MMSRPreD[0]);
            }
            if ( DecimalUtil.compareTo(Z11512MMSRDto, T013R2_A11512MMSRDto[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSRDto");
               GXutil.writeLogRaw("Old: ",Z11512MMSRDto);
               GXutil.writeLogRaw("Current: ",T013R2_A11512MMSRDto[0]);
            }
            if ( DecimalUtil.compareTo(Z9409MMSRCnt, T013R2_A9409MMSRCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmmovst:[seudo value changed for attri]"+"MMSRCnt");
               GXutil.writeLogRaw("Old: ",Z9409MMSRCnt);
               GXutil.writeLogRaw("Current: ",T013R2_A9409MMSRCnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMMoStR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13R1231( )
   {
      beforeValidate13R1231( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13R1231( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13R1231( 0) ;
         checkOptimisticConcurrency13R1231( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13R1231( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13R1231( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013R24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A9412MMSCod), A9424MMSRPre, A11511MMSRTot, A11510MMSRPreD, A11512MMSRDto, A9409MMSRCnt, A396EmprCod, Integer.valueOf(A9421MMSRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStR");
                  if ( (pr_default.getStatus(22) == 1) )
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
            load13R1231( ) ;
         }
         endLevel13R1231( ) ;
      }
      closeExtendedTableCursors13R1231( ) ;
   }

   public void update13R1231( )
   {
      beforeValidate13R1231( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13R1231( ) ;
      }
      if ( ( nIsMod_1231 != 0 ) || ( nIsDirty_1231 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13R1231( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13R1231( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13R1231( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013R25 */
                     pr_default.execute(23, new Object[] {A9424MMSRPre, A11511MMSRTot, A11510MMSRPreD, A11512MMSRDto, A9409MMSRCnt, A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStR");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMMoStR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13R1231( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13R1231( ) ;
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
            endLevel13R1231( ) ;
         }
      }
      closeExtendedTableCursors13R1231( ) ;
   }

   public void deferredUpdate13R1231( )
   {
   }

   public void delete13R1231( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13R1231( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13R1231( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13R1231( ) ;
         afterConfirm13R1231( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13R1231( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013R26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStR");
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
      sMode1231 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13R1231( ) ;
      Gx_mode = sMode1231 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13R1231( )
   {
      standaloneModal13R1231( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013R27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9421MMSRCod)});
         A9422MMSRNom = T013R27_A9422MMSRNom[0] ;
         n9422MMSRNom = T013R27_n9422MMSRNom[0] ;
         A9423MMSRStkPre = T013R27_A9423MMSRStkPre[0] ;
         n9423MMSRStkPre = T013R27_n9423MMSRStkPre[0] ;
         pr_default.close(25);
         if ( A11510MMSRPreD.doubleValue() > 0 )
         {
            edtMMSRTot_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), !bGXsfl_74_Refreshing);
         }
         else
         {
            edtMMSRTot_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), !bGXsfl_74_Refreshing);
         }
         if ( A11511MMSRTot.doubleValue() != 0 )
         {
            edtMMSRPre_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
         }
         else
         {
            edtMMSRPre_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
         }
      }
   }

   public void endLevel13R1231( )
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

   public void scanStart13R1231( )
   {
      /* Scan By routine */
      /* Using cursor T013R28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
      RcdFound1231 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1231 = (short)(1) ;
         A9421MMSRCod = T013R28_A9421MMSRCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13R1231( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1231 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1231 = (short)(1) ;
         A9421MMSRCod = T013R28_A9421MMSRCod[0] ;
      }
   }

   public void scanEnd13R1231( )
   {
      pr_default.close(26);
   }

   public void afterConfirm13R1231( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         AV21ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21ServerNow", localUtil.ttoc( AV21ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( A11511MMSRTot.doubleValue() > 0 ) && true /* After */ )
      {
         A9424MMSRPre = ((A11511MMSRTot.divide(A9409MMSRCnt, 18, java.math.RoundingMode.DOWN)).multiply((DecimalUtil.doubleToDec(100).subtract(A11512MMSRDto)))).multiply((DecimalUtil.doubleToDec(100).subtract(A11509MMSDto))).divide(DecimalUtil.doubleToDec(10000), 18, java.math.RoundingMode.DOWN) ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV15oMMSRCnt = O9409MMSRCnt.multiply(((GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( httpContext.getMessage( "S", ""), ""))==0) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(-1))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15oMMSRCnt", GXutil.ltrimstr( AV15oMMSRCnt, 10, 3));
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV18nMMSRCnt = A9409MMSRCnt.multiply(((GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( httpContext.getMessage( "S", ""), ""))==0) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(-1))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18nMMSRCnt", GXutil.ltrimstr( AV18nMMSRCnt, 10, 3));
      }
      if ( ( A9409MMSRCnt.doubleValue() <= 0 ) && true /* After */ )
      {
         GXCCtl = "MMSRCNT_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad NO Permitida", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRCnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A9412MMSCod ;
         GXv_int12[0] = A9421MMSRCod ;
         GXv_int13[0] = AV16MTMovCod ;
         GXv_char3[0] = AV17MTMovNom ;
         GXv_int14[0] = (byte)(1) ;
         GXv_decimal15[0] = AV15oMMSRCnt ;
         GXv_decimal16[0] = AV18nMMSRCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime17[0] = AV21ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int12, GXv_int13, GXv_char3, GXv_int14, GXv_decimal15, GXv_decimal16, GXv_char2, GXv_dtime17) ;
         tmmovst_impl.this.A396EmprCod = GXv_char4[0] ;
         tmmovst_impl.this.A9412MMSCod = GXv_int5[0] ;
         tmmovst_impl.this.A9421MMSRCod = GXv_int12[0] ;
         tmmovst_impl.this.AV16MTMovCod = GXv_int13[0] ;
         tmmovst_impl.this.AV17MTMovNom = GXv_char3[0] ;
         tmmovst_impl.this.AV15oMMSRCnt = GXv_decimal15[0] ;
         tmmovst_impl.this.AV18nMMSRCnt = GXv_decimal16[0] ;
         tmmovst_impl.this.AV21ServerNow = GXv_dtime17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV16MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovNom", AV17MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV15oMMSRCnt", GXutil.ltrimstr( AV15oMMSRCnt, 10, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV18nMMSRCnt", GXutil.ltrimstr( AV18nMMSRCnt, 10, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV21ServerNow", localUtil.ttoc( AV21ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void beforeInsert13R1231( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13R1231( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13R1231( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13R1231( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13R1231( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13R1231( )
   {
      edtMMSRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRCod_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRNom_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRCnt_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRPreD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRPreD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPreD_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRStkPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRStkPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRDto_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
   }

   public void send_integrity_lvl_hashes13R1231( )
   {
   }

   public void send_integrity_lvl_hashes13R1230( )
   {
   }

   public void subsflControlProps_741231( )
   {
      edtMMSRCod_Internalname = "MMSRCOD_"+sGXsfl_74_idx ;
      edtMMSRNom_Internalname = "MMSRNOM_"+sGXsfl_74_idx ;
      edtMMSRCnt_Internalname = "MMSRCNT_"+sGXsfl_74_idx ;
      edtMMSRPreD_Internalname = "MMSRPRED_"+sGXsfl_74_idx ;
      edtMMSRStkPre_Internalname = "MMSRSTKPRE_"+sGXsfl_74_idx ;
      edtMMSRTot_Internalname = "MMSRTOT_"+sGXsfl_74_idx ;
      edtMMSRDto_Internalname = "MMSRDTO_"+sGXsfl_74_idx ;
      edtMMSRPre_Internalname = "MMSRPRE_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_741231( )
   {
      edtMMSRCod_Internalname = "MMSRCOD_"+sGXsfl_74_fel_idx ;
      edtMMSRNom_Internalname = "MMSRNOM_"+sGXsfl_74_fel_idx ;
      edtMMSRCnt_Internalname = "MMSRCNT_"+sGXsfl_74_fel_idx ;
      edtMMSRPreD_Internalname = "MMSRPRED_"+sGXsfl_74_fel_idx ;
      edtMMSRStkPre_Internalname = "MMSRSTKPRE_"+sGXsfl_74_fel_idx ;
      edtMMSRTot_Internalname = "MMSRTOT_"+sGXsfl_74_fel_idx ;
      edtMMSRDto_Internalname = "MMSRDTO_"+sGXsfl_74_fel_idx ;
      edtMMSRPre_Internalname = "MMSRPRE_"+sGXsfl_74_fel_idx ;
   }

   public void addRow13R1231( )
   {
      nGXsfl_74_idx = (int)(nGXsfl_74_idx+1) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_741231( ) ;
      sendRow13R1231( ) ;
   }

   public void sendRow13R1231( )
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
         if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1231_" + sGXsfl_74_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_74_idx + "',74)\"" ;
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSRCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9421MMSRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9421MMSRCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSRCod_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMMSRCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtMMSRCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSRNom_Internalname,GXutil.rtrim( A9422MMSRNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSRNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMMSRNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1231_" + sGXsfl_74_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_74_idx + "',74)\"" ;
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMMSRCnt_Enabled!=0) ? localUtil.format( A9409MMSRCnt, "ZZZZZ9.999") : localUtil.format( A9409MMSRCnt, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSRCnt_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMMSRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1231_" + sGXsfl_74_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_74_idx + "',74)\"" ;
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSRPreD_Internalname,GXutil.ltrim( localUtil.ntoc( A11510MMSRPreD, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMMSRPreD_Enabled!=0) ? localUtil.format( A11510MMSRPreD, "ZZZZZZZ9.999") : localUtil.format( A11510MMSRPreD, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSRPreD_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMMSRPreD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSRStkPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9423MMSRStkPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMMSRStkPre_Enabled!=0) ? localUtil.format( A9423MMSRStkPre, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9423MMSRStkPre, "Z,ZZZ,ZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSRStkPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMMSRStkPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1231_" + sGXsfl_74_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_74_idx + "',74)\"" ;
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSRTot_Internalname,GXutil.ltrim( localUtil.ntoc( A11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11511MMSRTot, "ZZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSRTot_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMMSRTot_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1231_" + sGXsfl_74_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_74_idx + "',74)\"" ;
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSRDto_Internalname,GXutil.ltrim( localUtil.ntoc( A11512MMSRDto, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMMSRDto_Enabled!=0) ? localUtil.format( A11512MMSRDto, "ZZ9.99%") : localUtil.format( A11512MMSRDto, "ZZ9.99%"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSRDto_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMMSRDto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1231_" + sGXsfl_74_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_74_idx + "',74)\"" ;
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSRPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9424MMSRPre, "ZZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSRPre_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMMSRPre_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes13R1231( ) ;
      GXCCtl = "Z9421MMSRCod_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9421MMSRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9424MMSRPre_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11511MMSRTot_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11510MMSRPreD_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11510MMSRPreD, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11512MMSRDto_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11512MMSRDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9409MMSRCnt_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9409MMSRCnt_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1231_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1231, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1231_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1231, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1231_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1231, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N11511MMSRTot_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N9424MMSRPre_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_74_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV25TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV25TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV23EmprCod));
      GXCCtl = "vMMSCOD_" + sGXsfl_74_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMSRCOD_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMSRCOD_"+sGXsfl_74_idx+"Horizontalalignment", GXutil.rtrim( edtMMSRCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "MMSRNOM_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMSRCNT_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMSRPRED_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRPreD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMSRSTKPRE_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRStkPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMSRTOT_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRTot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMSRDTO_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMSRPRE_"+sGXsfl_74_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow13R1231( )
   {
      nGXsfl_74_idx = (int)(nGXsfl_74_idx+1) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_741231( ) ;
      edtMMSRCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRCOD_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMMSRCod_Horizontalalignment = httpContext.cgiGet( "MMSRCOD_"+sGXsfl_74_idx+"Horizontalalignment") ;
      edtMMSRNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRNOM_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMMSRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRCNT_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMMSRPreD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRPRED_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMMSRStkPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRSTKPRE_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMMSRTot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRTOT_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMMSRDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRDTO_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMMSRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMSRPRE_"+sGXsfl_74_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMMSRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMMSRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "MMSRCOD_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRCod_Internalname ;
         wbErr = true ;
         A9421MMSRCod = 0 ;
      }
      else
      {
         A9421MMSRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9422MMSRNom = httpContext.cgiGet( edtMMSRNom_Internalname) ;
      n9422MMSRNom = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRCnt_Internalname)), DecimalUtil.stringToDec("-99999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRCnt_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "MMSRCNT_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRCnt_Internalname ;
         wbErr = true ;
         A9409MMSRCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9409MMSRCnt = localUtil.ctond( httpContext.cgiGet( edtMMSRCnt_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMMSRPreD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRPreD_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "MMSRPRED_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRPreD_Internalname ;
         wbErr = true ;
         A11510MMSRPreD = DecimalUtil.ZERO ;
      }
      else
      {
         A11510MMSRPreD = localUtil.ctond( httpContext.cgiGet( edtMMSRPreD_Internalname)) ;
      }
      A9423MMSRStkPre = localUtil.ctond( httpContext.cgiGet( edtMMSRStkPre_Internalname)) ;
      n9423MMSRStkPre = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMMSRTot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRTot_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "MMSRTOT_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRTot_Internalname ;
         wbErr = true ;
         A11511MMSRTot = DecimalUtil.ZERO ;
      }
      else
      {
         A11511MMSRTot = localUtil.ctond( httpContext.cgiGet( edtMMSRTot_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMMSRDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRDto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MMSRDTO_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRDto_Internalname ;
         wbErr = true ;
         A11512MMSRDto = DecimalUtil.ZERO ;
      }
      else
      {
         A11512MMSRDto = localUtil.ctond( httpContext.cgiGet( edtMMSRDto_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRPre_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "MMSRPRE_" + sGXsfl_74_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRPre_Internalname ;
         wbErr = true ;
         A9424MMSRPre = DecimalUtil.ZERO ;
      }
      else
      {
         A9424MMSRPre = localUtil.ctond( httpContext.cgiGet( edtMMSRPre_Internalname)) ;
      }
      GXCCtl = "Z9421MMSRCod_" + sGXsfl_74_idx ;
      Z9421MMSRCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9424MMSRPre_" + sGXsfl_74_idx ;
      Z9424MMSRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11511MMSRTot_" + sGXsfl_74_idx ;
      Z11511MMSRTot = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11510MMSRPreD_" + sGXsfl_74_idx ;
      Z11510MMSRPreD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11512MMSRDto_" + sGXsfl_74_idx ;
      Z11512MMSRDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9409MMSRCnt_" + sGXsfl_74_idx ;
      Z9409MMSRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9409MMSRCnt_" + sGXsfl_74_idx ;
      O9409MMSRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1231_" + sGXsfl_74_idx ;
      nRcdDeleted_1231 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1231_" + sGXsfl_74_idx ;
      nRcdExists_1231 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1231_" + sGXsfl_74_idx ;
      nIsMod_1231 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N11511MMSRTot_" + sGXsfl_74_idx ;
      N11511MMSRTot = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N9424MMSRPre_" + sGXsfl_74_idx ;
      N9424MMSRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
   }

   public void assign_properties_default( )
   {
      defedtMMSRPre_Enabled = edtMMSRPre_Enabled ;
      defedtMMSRTot_Enabled = edtMMSRTot_Enabled ;
      defedtMMSRStkPre_Enabled = edtMMSRStkPre_Enabled ;
      defedtMMSRNom_Enabled = edtMMSRNom_Enabled ;
      defedtMMSRCod_Enabled = edtMMSRCod_Enabled ;
   }

   public void confirmValues13R0( )
   {
      nGXsfl_74_idx = 0 ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_741231( ) ;
      while ( nGXsfl_74_idx < nRC_GXsfl_74 )
      {
         nGXsfl_74_idx = (int)(nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_741231( ) ;
         httpContext.changePostValue( "Z9421MMSRCod_"+sGXsfl_74_idx, httpContext.cgiGet( "ZT_"+"Z9421MMSRCod_"+sGXsfl_74_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9421MMSRCod_"+sGXsfl_74_idx) ;
         httpContext.changePostValue( "Z9424MMSRPre_"+sGXsfl_74_idx, httpContext.cgiGet( "ZT_"+"Z9424MMSRPre_"+sGXsfl_74_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9424MMSRPre_"+sGXsfl_74_idx) ;
         httpContext.changePostValue( "Z11511MMSRTot_"+sGXsfl_74_idx, httpContext.cgiGet( "ZT_"+"Z11511MMSRTot_"+sGXsfl_74_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11511MMSRTot_"+sGXsfl_74_idx) ;
         httpContext.changePostValue( "Z11510MMSRPreD_"+sGXsfl_74_idx, httpContext.cgiGet( "ZT_"+"Z11510MMSRPreD_"+sGXsfl_74_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11510MMSRPreD_"+sGXsfl_74_idx) ;
         httpContext.changePostValue( "Z11512MMSRDto_"+sGXsfl_74_idx, httpContext.cgiGet( "ZT_"+"Z11512MMSRDto_"+sGXsfl_74_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11512MMSRDto_"+sGXsfl_74_idx) ;
         httpContext.changePostValue( "Z9409MMSRCnt_"+sGXsfl_74_idx, httpContext.cgiGet( "ZT_"+"Z9409MMSRCnt_"+sGXsfl_74_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9409MMSRCnt_"+sGXsfl_74_idx) ;
      }
      httpContext.changePostValue( "O9409MMSRCnt", httpContext.cgiGet( "T9409MMSRCnt")) ;
      httpContext.deletePostValue( "T9409MMSRCnt") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmmovst", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV23EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13MMSCod,8,0))}, new String[] {"Gx_mode","EmprCod","MMSCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMMovSt");
      forbiddenHiddens.add("MMSUsuCre", GXutil.rtrim( localUtil.format( A9417MMSUsuCre, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("MMSFchCre", localUtil.format( A9418MMSFchCre, "99/99/99 99:99"));
      forbiddenHiddens.add("MMSFchApl", localUtil.format( A11304MMSFchApl, "99/99/99 99:99"));
      forbiddenHiddens.add("MMSEst", GXutil.rtrim( localUtil.format( A9420MMSEst, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmmovst:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9412MMSCod", GXutil.ltrim( localUtil.ntoc( Z9412MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9413MMSTpo", GXutil.rtrim( Z9413MMSTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9416MMSFch", localUtil.dtoc( Z9416MMSFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9417MMSUsuCre", GXutil.rtrim( Z9417MMSUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9418MMSFchCre", localUtil.ttoc( Z9418MMSFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11304MMSFchApl", localUtil.ttoc( Z11304MMSFchApl, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9419MMSNroExt", GXutil.rtrim( Z9419MMSNroExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9420MMSEst", GXutil.rtrim( Z9420MMSEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11509MMSDto", GXutil.ltrim( localUtil.ntoc( Z11509MMSDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9414MMSPrvNum", GXutil.ltrim( localUtil.ntoc( Z9414MMSPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nGXsfl_74_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9414MMSPrvNum", GXutil.ltrim( localUtil.ntoc( A9414MMSPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMMSPRVNUM_DATA", AV31MMSPrvNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMMSPRVNUM_DATA", AV31MMSPrvNum_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMMSRCOD_DATA", AV35MMSRCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMMSRCOD_DATA", AV35MMSRCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV25TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV25TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV25TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV23EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMMSCOD", GXutil.ltrim( localUtil.ntoc( AV13MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMMSCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13MMSCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MMSPRVNUM", GXutil.ltrim( localUtil.ntoc( AV24Insert_MMSPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMMSRCNT", GXutil.ltrim( localUtil.ntoc( AV15oMMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNMMSRCNT", GXutil.ltrim( localUtil.ntoc( AV18nMMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERVERNOW", localUtil.ttoc( AV21ServerNow, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVNOM", GXutil.rtrim( AV17MTMovNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVCOD", GXutil.ltrim( localUtil.ntoc( AV16MTMovCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSPRVNUM_Objectcall", GXutil.rtrim( Combo_mmsprvnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSPRVNUM_Cls", GXutil.rtrim( Combo_mmsprvnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSPRVNUM_Selectedvalue_set", GXutil.rtrim( Combo_mmsprvnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSPRVNUM_Enabled", GXutil.booltostr( Combo_mmsprvnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSPRVNUM_Emptyitem", GXutil.booltostr( Combo_mmsprvnum_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSRCOD_Objectcall", GXutil.rtrim( Combo_mmsrcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSRCOD_Cls", GXutil.rtrim( Combo_mmsrcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSRCOD_Enabled", GXutil.booltostr( Combo_mmsrcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSRCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_mmsrcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSRCOD_Isgriditem", GXutil.booltostr( Combo_mmsrcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MMSRCOD_Emptyitem", GXutil.booltostr( Combo_mmsrcod_Emptyitem));
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
      return formatLink("app.mantenimientomaquina.tmmovst", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV23EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13MMSCod,8,0))}, new String[] {"Gx_mode","EmprCod","MMSCod"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMMovSt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Movimientos de Stock", "") ;
   }

   public void initializeNonKey13R1230( )
   {
      A9414MMSPrvNum = 0 ;
      n9414MMSPrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9414MMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9414MMSPrvNum), 6, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A9413MMSTpo = "" ;
      n9413MMSTpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9413MMSTpo", A9413MMSTpo);
      A9415MMSPrvNom = "" ;
      n9415MMSPrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9415MMSPrvNom", A9415MMSPrvNom);
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      n11304MMSFchApl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11304MMSFchApl", localUtil.ttoc( A11304MMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9419MMSNroExt = "" ;
      n9419MMSNroExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9419MMSNroExt", A9419MMSNroExt);
      A11509MMSDto = DecimalUtil.ZERO ;
      n11509MMSDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11509MMSDto", GXutil.ltrimstr( A11509MMSDto, 6, 2));
      A9416MMSFch = GXutil.today( ) ;
      n9416MMSFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9416MMSFch", localUtil.format(A9416MMSFch, "99/99/99"));
      A9417MMSUsuCre = AV8UsurCod ;
      n9417MMSUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9417MMSUsuCre", A9417MMSUsuCre);
      A9418MMSFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9418MMSFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9418MMSFchCre", localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9420MMSEst = httpContext.getMessage( "E", "") ;
      n9420MMSEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9420MMSEst", A9420MMSEst);
      Z9413MMSTpo = "" ;
      Z9416MMSFch = GXutil.nullDate() ;
      Z9417MMSUsuCre = "" ;
      Z9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      Z9419MMSNroExt = "" ;
      Z9420MMSEst = "" ;
      Z11509MMSDto = DecimalUtil.ZERO ;
      Z9414MMSPrvNum = 0 ;
   }

   public void initAll13R1230( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9412MMSCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      initializeNonKey13R1230( ) ;
   }

   public void standaloneModalInsert( )
   {
      A9417MMSUsuCre = i9417MMSUsuCre ;
      n9417MMSUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9417MMSUsuCre", A9417MMSUsuCre);
      A9418MMSFchCre = i9418MMSFchCre ;
      n9418MMSFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9418MMSFchCre", localUtil.ttoc( A9418MMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9416MMSFch = i9416MMSFch ;
      n9416MMSFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9416MMSFch", localUtil.format(A9416MMSFch, "99/99/99"));
      A9420MMSEst = i9420MMSEst ;
      n9420MMSEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9420MMSEst", A9420MMSEst);
   }

   public void initializeNonKey13R1231( )
   {
      AV15oMMSRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15oMMSRCnt", GXutil.ltrimstr( AV15oMMSRCnt, 10, 3));
      AV18nMMSRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18nMMSRCnt", GXutil.ltrimstr( AV18nMMSRCnt, 10, 3));
      AV21ServerNow = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV21ServerNow", localUtil.ttoc( AV21ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11511MMSRTot = DecimalUtil.ZERO ;
      A9422MMSRNom = "" ;
      n9422MMSRNom = false ;
      A9423MMSRStkPre = DecimalUtil.ZERO ;
      n9423MMSRStkPre = false ;
      A11510MMSRPreD = DecimalUtil.ZERO ;
      A11512MMSRDto = DecimalUtil.ZERO ;
      A9409MMSRCnt = DecimalUtil.ZERO ;
      A9424MMSRPre = DecimalUtil.ZERO ;
      O9409MMSRCnt = A9409MMSRCnt ;
      Z9424MMSRPre = DecimalUtil.ZERO ;
      Z11511MMSRTot = DecimalUtil.ZERO ;
      Z11510MMSRPreD = DecimalUtil.ZERO ;
      Z11512MMSRDto = DecimalUtil.ZERO ;
      Z9409MMSRCnt = DecimalUtil.ZERO ;
   }

   public void initAll13R1231( )
   {
      A9421MMSRCod = 0 ;
      initializeNonKey13R1231( ) ;
   }

   public void standaloneModalInsert13R1231( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821166852", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmmovst.js", "?2026821166852", false, true);
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

   public void init_level_properties1231( )
   {
      edtMMSRPre_Enabled = defedtMMSRPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRTot_Enabled = defedtMMSRTot_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRStkPre_Enabled = defedtMMSRStkPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRStkPre_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRNom_Enabled = defedtMMSRNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRNom_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtMMSRCod_Enabled = defedtMMSRCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRCod_Enabled), 5, 0), !bGXsfl_74_Refreshing);
   }

   public void startgridcontrol74( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9421MMSRCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtMMSRCod_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9422MMSRNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9409MMSRCnt, (byte)(10), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11510MMSRPreD, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRPreD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9423MMSRStkPre, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRStkPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11511MMSRTot, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRTot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11512MMSRDto, (byte)(7), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMSRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMMSCod_Internalname = "MMSCOD" ;
      cmbMMSTpo.setInternalname( "MMSTPO" );
      edtMMSFch_Internalname = "MMSFCH" ;
      cmbMMSEst.setInternalname( "MMSEST" );
      lblTextblockmmsprvnum_Internalname = "TEXTBLOCKMMSPRVNUM" ;
      Combo_mmsprvnum_Internalname = "COMBO_MMSPRVNUM" ;
      edtMMSPrvNum_Internalname = "MMSPRVNUM" ;
      divTablesplittedmmsprvnum_Internalname = "TABLESPLITTEDMMSPRVNUM" ;
      edtMMSDto_Internalname = "MMSDTO" ;
      edtMMSNroExt_Internalname = "MMSNROEXT" ;
      edtMMSUsuCre_Internalname = "MMSUSUCRE" ;
      edtMMSFchCre_Internalname = "MMSFCHCRE" ;
      edtMMSFchApl_Internalname = "MMSFCHAPL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMMSRCod_Internalname = "MMSRCOD" ;
      edtMMSRNom_Internalname = "MMSRNOM" ;
      edtMMSRCnt_Internalname = "MMSRCNT" ;
      edtMMSRPreD_Internalname = "MMSRPRED" ;
      edtMMSRStkPre_Internalname = "MMSRSTKPRE" ;
      edtMMSRTot_Internalname = "MMSRTOT" ;
      edtMMSRDto_Internalname = "MMSRDTO" ;
      edtMMSRPre_Internalname = "MMSRPRE" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombommsprvnum_Internalname = "vCOMBOMMSPRVNUM" ;
      divSectionattribute_mmsprvnum_Internalname = "SECTIONATTRIBUTE_MMSPRVNUM" ;
      Combo_mmsrcod_Internalname = "COMBO_MMSRCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtMMSPrvNom_Internalname = "MMSPRVNOM" ;
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
      Combo_mmsrcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Movimientos de Stock", "") );
      edtMMSRPre_Jsonclick = "" ;
      edtMMSRDto_Jsonclick = "" ;
      edtMMSRTot_Jsonclick = "" ;
      edtMMSRStkPre_Jsonclick = "" ;
      edtMMSRPreD_Jsonclick = "" ;
      edtMMSRCnt_Jsonclick = "" ;
      edtMMSRNom_Jsonclick = "" ;
      edtMMSRCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_mmsrcod_Titlecontrolidtoreplace = "" ;
      edtMMSRPre_Enabled = 1 ;
      edtMMSRDto_Enabled = 1 ;
      edtMMSRTot_Enabled = 1 ;
      edtMMSRStkPre_Enabled = 0 ;
      edtMMSRPreD_Enabled = 1 ;
      edtMMSRCnt_Enabled = 1 ;
      edtMMSRNom_Enabled = 0 ;
      edtMMSRCod_Enabled = 1 ;
      edtMMSPrvNom_Jsonclick = "" ;
      edtMMSPrvNom_Enabled = 0 ;
      edtMMSPrvNom_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      Combo_mmsrcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_mmsrcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_mmsrcod_Cls = "ExtendedCombo" ;
      Combo_mmsrcod_Caption = "" ;
      edtavCombommsprvnum_Jsonclick = "" ;
      edtavCombommsprvnum_Enabled = 0 ;
      edtavCombommsprvnum_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtMMSFchApl_Jsonclick = "" ;
      edtMMSFchApl_Enabled = 0 ;
      edtMMSFchCre_Jsonclick = "" ;
      edtMMSFchCre_Enabled = 0 ;
      edtMMSUsuCre_Jsonclick = "" ;
      edtMMSUsuCre_Enabled = 0 ;
      edtMMSNroExt_Jsonclick = "" ;
      edtMMSNroExt_Enabled = 1 ;
      edtMMSDto_Jsonclick = "" ;
      edtMMSDto_Enabled = 1 ;
      edtMMSPrvNum_Jsonclick = "" ;
      edtMMSPrvNum_Enabled = 1 ;
      edtMMSPrvNum_Visible = 1 ;
      Combo_mmsprvnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_mmsprvnum_Cls = "ExtendedCombo AttributeFL" ;
      Combo_mmsprvnum_Caption = "" ;
      Combo_mmsprvnum_Enabled = GXutil.toBoolean( -1) ;
      cmbMMSEst.setJsonclick( "" );
      cmbMMSEst.setEnabled( 0 );
      edtMMSFch_Jsonclick = "" ;
      edtMMSFch_Enabled = 1 ;
      cmbMMSTpo.setJsonclick( "" );
      cmbMMSTpo.setEnabled( 1 );
      edtMMSCod_Jsonclick = "" ;
      edtMMSCod_Enabled = 0 ;
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
      edtMMSRCod_Horizontalalignment = "right" ;
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

   public void gx5asammscod13R1230( int AV13MMSCod )
   {
      if ( ! (0==AV13MMSCod) )
      {
         A9412MMSCod = AV13MMSCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9412MMSCod = AV13MMSCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9412MMSCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asammscod13R1230( String Gx_mode ,
                                    String A396EmprCod )
   {
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXt_int11 = A9412MMSCod ;
         GXv_int13[0] = GXt_int11 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTMST", ""), ""), GXv_int13) ;
         tmmovst_impl.this.GXt_int11 = GXv_int13[0] ;
         A9412MMSCod = GXt_int11 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9412MMSCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_31_13R1231( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int13[0] = A9412MMSCod ;
         GXv_int12[0] = A9421MMSRCod ;
         GXv_int5[0] = AV16MTMovCod ;
         GXv_char3[0] = AV17MTMovNom ;
         GXv_int14[0] = (byte)(1) ;
         GXv_decimal16[0] = AV15oMMSRCnt ;
         GXv_decimal15[0] = AV18nMMSRCnt ;
         GXv_char2[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime17[0] = AV21ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int12, GXv_int5, GXv_char3, GXv_int14, GXv_decimal16, GXv_decimal15, GXv_char2, GXv_dtime17) ;
         A396EmprCod = GXv_char4[0] ;
         A9412MMSCod = GXv_int13[0] ;
         A9421MMSRCod = GXv_int12[0] ;
         AV16MTMovCod = GXv_int5[0] ;
         AV17MTMovNom = GXv_char3[0] ;
         AV15oMMSRCnt = GXv_decimal16[0] ;
         AV18nMMSRCnt = GXv_decimal15[0] ;
         AV21ServerNow = GXv_dtime17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV16MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovNom", AV17MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV15oMMSRCnt", GXutil.ltrimstr( AV15oMMSRCnt, 10, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV18nMMSRCnt", GXutil.ltrimstr( AV18nMMSRCnt, 10, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV21ServerNow", localUtil.ttoc( AV21ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      subsflControlProps_741231( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13R1231( ) ;
         standaloneModal13R1231( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13R1231( ) ;
         nGXsfl_74_idx = (int)(nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_741231( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      cmbMMSTpo.setName( "MMSTPO" );
      cmbMMSTpo.setWebtags( "" );
      cmbMMSTpo.addItem("E", httpContext.getMessage( "Entrada", ""), (short)(0));
      cmbMMSTpo.addItem("S", httpContext.getMessage( "Salida", ""), (short)(0));
      if ( cmbMMSTpo.getItemCount() > 0 )
      {
         A9413MMSTpo = cmbMMSTpo.getValidValue(A9413MMSTpo) ;
         n9413MMSTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9413MMSTpo", A9413MMSTpo);
      }
      cmbMMSEst.setName( "MMSEST" );
      cmbMMSEst.setWebtags( "" );
      cmbMMSEst.addItem("E", httpContext.getMessage( "En ingreso", ""), (short)(0));
      cmbMMSEst.addItem("A", httpContext.getMessage( "Aplicado", ""), (short)(0));
      cmbMMSEst.addItem("C", httpContext.getMessage( "Cancelado", ""), (short)(0));
      if ( cmbMMSEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9420MMSEst)==0) )
         {
            A9420MMSEst = httpContext.getMessage( "E", "") ;
            n9420MMSEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9420MMSEst", A9420MMSEst);
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
      /* Using cursor T013R18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T013R18_A407EmprNom[0] ;
      n407EmprNom = T013R18_n407EmprNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Mmsprvnum( )
   {
      n9414MMSPrvNum = false ;
      n9415MMSPrvNom = false ;
      /* Using cursor T013R19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n9414MMSPrvNum), Integer.valueOf(A9414MMSPrvNum)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSPrv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9415MMSPrvNom = T013R19_A9415MMSPrvNom[0] ;
      n9415MMSPrvNom = T013R19_n9415MMSPrvNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9415MMSPrvNom", GXutil.rtrim( A9415MMSPrvNom));
   }

   public void valid_Mmsrcod( )
   {
      n9422MMSRNom = false ;
      n9423MMSRStkPre = false ;
      /* Using cursor T013R27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMMSRCod_Internalname ;
      }
      A9422MMSRNom = T013R27_A9422MMSRNom[0] ;
      n9422MMSRNom = T013R27_n9422MMSRNom[0] ;
      A9423MMSRStkPre = T013R27_A9423MMSRStkPre[0] ;
      n9423MMSRStkPre = T013R27_n9423MMSRStkPre[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9422MMSRNom", GXutil.rtrim( A9422MMSRNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9423MMSRStkPre", GXutil.ltrim( localUtil.ntoc( A9423MMSRStkPre, (byte)(12), (byte)(3), ".", "")));
   }

   public void valid_Mmsrdto( )
   {
      n9423MMSRStkPre = false ;
      n11509MMSDto = false ;
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9424MMSRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9424MMSRPre = A9423MMSRStkPre ;
      }
      else
      {
         if ( A11511MMSRTot.doubleValue() > 0 )
         {
            A9424MMSRPre = ((A11511MMSRTot.divide(A9409MMSRCnt, 18, java.math.RoundingMode.DOWN)).multiply((DecimalUtil.doubleToDec(100).subtract(A11512MMSRDto)))).multiply((DecimalUtil.doubleToDec(100).subtract(A11509MMSDto))).divide(DecimalUtil.doubleToDec(10000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            if ( ( A11511MMSRTot.doubleValue() > 0 ) && true /* Level */ )
            {
               A9424MMSRPre = ((A11511MMSRTot.divide(A9409MMSRCnt, 18, java.math.RoundingMode.DOWN)).multiply((DecimalUtil.doubleToDec(100).subtract(A11512MMSRDto)))).multiply((DecimalUtil.doubleToDec(100).subtract(A11509MMSDto))).divide(DecimalUtil.doubleToDec(10000), 18, java.math.RoundingMode.DOWN) ;
            }
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9424MMSRPre", GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13MMSCod',fld:'vMMSCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV25TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13MMSCod',fld:'vMMSCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A9417MMSUsuCre',fld:'MMSUSUCRE',pic:''},{av:'A9418MMSFchCre',fld:'MMSFCHCRE',pic:'99/99/99 99:99'},{av:'A11304MMSFchApl',fld:'MMSFCHAPL',pic:'99/99/99 99:99'},{av:'cmbMMSEst'},{av:'A9420MMSEst',fld:'MMSEST',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1213R2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV25TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MMSCOD","{handler:'valid_Mmscod',iparms:[]");
      setEventMetadata("VALID_MMSCOD",",oparms:[]}");
      setEventMetadata("VALID_MMSTPO","{handler:'valid_Mmstpo',iparms:[]");
      setEventMetadata("VALID_MMSTPO",",oparms:[]}");
      setEventMetadata("VALID_MMSPRVNUM","{handler:'valid_Mmsprvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9414MMSPrvNum',fld:'MMSPRVNUM',pic:'ZZZZZ9'},{av:'A9415MMSPrvNom',fld:'MMSPRVNOM',pic:''}]");
      setEventMetadata("VALID_MMSPRVNUM",",oparms:[{av:'A9415MMSPrvNom',fld:'MMSPRVNOM',pic:''}]}");
      setEventMetadata("VALID_MMSDTO","{handler:'valid_Mmsdto',iparms:[]");
      setEventMetadata("VALID_MMSDTO",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOMMSPRVNUM","{handler:'validv_Combommsprvnum',iparms:[]");
      setEventMetadata("VALIDV_COMBOMMSPRVNUM",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_MMSRCOD","{handler:'valid_Mmsrcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9421MMSRCod',fld:'MMSRCOD',pic:'ZZZZZZZ9'},{av:'A9422MMSRNom',fld:'MMSRNOM',pic:''},{av:'A9423MMSRStkPre',fld:'MMSRSTKPRE',pic:'Z,ZZZ,ZZZ9.999'}]");
      setEventMetadata("VALID_MMSRCOD",",oparms:[{av:'A9422MMSRNom',fld:'MMSRNOM',pic:''},{av:'A9423MMSRStkPre',fld:'MMSRSTKPRE',pic:'Z,ZZZ,ZZZ9.999'}]}");
      setEventMetadata("VALID_MMSRCNT","{handler:'valid_Mmsrcnt',iparms:[]");
      setEventMetadata("VALID_MMSRCNT",",oparms:[]}");
      setEventMetadata("VALID_MMSRPRED","{handler:'valid_Mmsrpred',iparms:[]");
      setEventMetadata("VALID_MMSRPRED",",oparms:[]}");
      setEventMetadata("VALID_MMSRSTKPRE","{handler:'valid_Mmsrstkpre',iparms:[]");
      setEventMetadata("VALID_MMSRSTKPRE",",oparms:[]}");
      setEventMetadata("VALID_MMSRTOT","{handler:'valid_Mmsrtot',iparms:[]");
      setEventMetadata("VALID_MMSRTOT",",oparms:[]}");
      setEventMetadata("VALID_MMSRDTO","{handler:'valid_Mmsrdto',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A9423MMSRStkPre',fld:'MMSRSTKPRE',pic:'Z,ZZZ,ZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A11511MMSRTot',fld:'MMSRTOT',pic:'ZZZZZZZ9.999'},{av:'A9409MMSRCnt',fld:'MMSRCNT',pic:'ZZZZZ9.999'},{av:'A11512MMSRDto',fld:'MMSRDTO',pic:'ZZ9.99%'},{av:'A11509MMSDto',fld:'MMSDTO',pic:'ZZ9.99%'},{av:'A9424MMSRPre',fld:'MMSRPRE',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_MMSRDTO",",oparms:[{av:'A9424MMSRPre',fld:'MMSRPRE',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("NULL","{handler:'valid_Mmsrpre',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV23EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9413MMSTpo = "" ;
      Z9416MMSFch = GXutil.nullDate() ;
      Z9417MMSUsuCre = "" ;
      Z9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      Z9419MMSNroExt = "" ;
      Z9420MMSEst = "" ;
      Z11509MMSDto = DecimalUtil.ZERO ;
      Combo_mmsprvnum_Selectedvalue_get = "" ;
      Z9424MMSRPre = DecimalUtil.ZERO ;
      Z11511MMSRTot = DecimalUtil.ZERO ;
      Z11510MMSRPreD = DecimalUtil.ZERO ;
      Z11512MMSRDto = DecimalUtil.ZERO ;
      Z9409MMSRCnt = DecimalUtil.ZERO ;
      O9409MMSRCnt = DecimalUtil.ZERO ;
      N11511MMSRTot = DecimalUtil.ZERO ;
      N9424MMSRPre = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV23EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A9413MMSTpo = "" ;
      A9420MMSEst = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A9416MMSFch = GXutil.nullDate() ;
      lblTextblockmmsprvnum_Jsonclick = "" ;
      ucCombo_mmsprvnum = new com.genexus.webpanels.GXUserControl();
      AV34DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV31MMSPrvNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A11509MMSDto = DecimalUtil.ZERO ;
      A9419MMSNroExt = "" ;
      A9417MMSUsuCre = "" ;
      A9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucCombo_mmsrcod = new com.genexus.webpanels.GXUserControl();
      AV35MMSRCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A407EmprNom = "" ;
      A9415MMSPrvNom = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1231 = "" ;
      sStyleString = "" ;
      AV8UsurCod = "" ;
      AV37Pgmname = "" ;
      AV15oMMSRCnt = DecimalUtil.ZERO ;
      AV18nMMSRCnt = DecimalUtil.ZERO ;
      AV21ServerNow = GXutil.resetTime( GXutil.nullDate() );
      AV17MTMovNom = "" ;
      Combo_mmsprvnum_Objectcall = "" ;
      Combo_mmsprvnum_Class = "" ;
      Combo_mmsprvnum_Icontype = "" ;
      Combo_mmsprvnum_Icon = "" ;
      Combo_mmsprvnum_Tooltip = "" ;
      Combo_mmsprvnum_Selectedvalue_set = "" ;
      Combo_mmsprvnum_Selectedtext_set = "" ;
      Combo_mmsprvnum_Selectedtext_get = "" ;
      Combo_mmsprvnum_Gamoauthtoken = "" ;
      Combo_mmsprvnum_Ddointernalname = "" ;
      Combo_mmsprvnum_Titlecontrolalign = "" ;
      Combo_mmsprvnum_Dropdownoptionstype = "" ;
      Combo_mmsprvnum_Titlecontrolidtoreplace = "" ;
      Combo_mmsprvnum_Datalisttype = "" ;
      Combo_mmsprvnum_Datalistfixedvalues = "" ;
      Combo_mmsprvnum_Datalistproc = "" ;
      Combo_mmsprvnum_Datalistprocparametersprefix = "" ;
      Combo_mmsprvnum_Remoteservicesparameters = "" ;
      Combo_mmsprvnum_Htmltemplate = "" ;
      Combo_mmsprvnum_Multiplevaluestype = "" ;
      Combo_mmsprvnum_Loadingdata = "" ;
      Combo_mmsprvnum_Noresultsfound = "" ;
      Combo_mmsprvnum_Emptyitemtext = "" ;
      Combo_mmsprvnum_Onlyselectedvalues = "" ;
      Combo_mmsprvnum_Selectalltext = "" ;
      Combo_mmsprvnum_Multiplevaluesseparator = "" ;
      Combo_mmsprvnum_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_mmsrcod_Objectcall = "" ;
      Combo_mmsrcod_Class = "" ;
      Combo_mmsrcod_Icontype = "" ;
      Combo_mmsrcod_Icon = "" ;
      Combo_mmsrcod_Tooltip = "" ;
      Combo_mmsrcod_Selectedvalue_set = "" ;
      Combo_mmsrcod_Selectedvalue_get = "" ;
      Combo_mmsrcod_Selectedtext_set = "" ;
      Combo_mmsrcod_Selectedtext_get = "" ;
      Combo_mmsrcod_Gamoauthtoken = "" ;
      Combo_mmsrcod_Ddointernalname = "" ;
      Combo_mmsrcod_Titlecontrolalign = "" ;
      Combo_mmsrcod_Dropdownoptionstype = "" ;
      Combo_mmsrcod_Datalisttype = "" ;
      Combo_mmsrcod_Datalistfixedvalues = "" ;
      Combo_mmsrcod_Datalistproc = "" ;
      Combo_mmsrcod_Datalistprocparametersprefix = "" ;
      Combo_mmsrcod_Remoteservicesparameters = "" ;
      Combo_mmsrcod_Htmltemplate = "" ;
      Combo_mmsrcod_Multiplevaluestype = "" ;
      Combo_mmsrcod_Loadingdata = "" ;
      Combo_mmsrcod_Noresultsfound = "" ;
      Combo_mmsrcod_Emptyitemtext = "" ;
      Combo_mmsrcod_Onlyselectedvalues = "" ;
      Combo_mmsrcod_Selectalltext = "" ;
      Combo_mmsrcod_Multiplevaluesseparator = "" ;
      Combo_mmsrcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1230 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A9422MMSRNom = "" ;
      A9409MMSRCnt = DecimalUtil.ZERO ;
      A11510MMSRPreD = DecimalUtil.ZERO ;
      A9423MMSRStkPre = DecimalUtil.ZERO ;
      A11511MMSRTot = DecimalUtil.ZERO ;
      A11512MMSRDto = DecimalUtil.ZERO ;
      A9424MMSRPre = DecimalUtil.ZERO ;
      T9409MMSRCnt = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV11Station = "" ;
      AV30ObtenerEmprCod = "" ;
      AV14EmprNom = "" ;
      GXt_char1 = "" ;
      AV28WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext6 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV25TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV27WebSession = httpContext.getWebSession();
      AV26TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV32ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z9415MMSPrvNom = "" ;
      T013R7_A407EmprNom = new String[] {""} ;
      T013R7_n407EmprNom = new boolean[] {false} ;
      T013R8_A9415MMSPrvNom = new String[] {""} ;
      T013R8_n9415MMSPrvNom = new boolean[] {false} ;
      T013R9_A9412MMSCod = new int[1] ;
      T013R9_A407EmprNom = new String[] {""} ;
      T013R9_n407EmprNom = new boolean[] {false} ;
      T013R9_A9413MMSTpo = new String[] {""} ;
      T013R9_n9413MMSTpo = new boolean[] {false} ;
      T013R9_A9415MMSPrvNom = new String[] {""} ;
      T013R9_n9415MMSPrvNom = new boolean[] {false} ;
      T013R9_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013R9_n9416MMSFch = new boolean[] {false} ;
      T013R9_A9417MMSUsuCre = new String[] {""} ;
      T013R9_n9417MMSUsuCre = new boolean[] {false} ;
      T013R9_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013R9_n9418MMSFchCre = new boolean[] {false} ;
      T013R9_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      T013R9_n11304MMSFchApl = new boolean[] {false} ;
      T013R9_A9419MMSNroExt = new String[] {""} ;
      T013R9_n9419MMSNroExt = new boolean[] {false} ;
      T013R9_A9420MMSEst = new String[] {""} ;
      T013R9_n9420MMSEst = new boolean[] {false} ;
      T013R9_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R9_n11509MMSDto = new boolean[] {false} ;
      T013R9_A396EmprCod = new String[] {""} ;
      T013R9_A9414MMSPrvNum = new int[1] ;
      T013R9_n9414MMSPrvNum = new boolean[] {false} ;
      T013R10_A407EmprNom = new String[] {""} ;
      T013R10_n407EmprNom = new boolean[] {false} ;
      T013R11_A9415MMSPrvNom = new String[] {""} ;
      T013R11_n9415MMSPrvNom = new boolean[] {false} ;
      T013R12_A396EmprCod = new String[] {""} ;
      T013R12_A9412MMSCod = new int[1] ;
      T013R6_A9412MMSCod = new int[1] ;
      T013R6_A9413MMSTpo = new String[] {""} ;
      T013R6_n9413MMSTpo = new boolean[] {false} ;
      T013R6_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013R6_n9416MMSFch = new boolean[] {false} ;
      T013R6_A9417MMSUsuCre = new String[] {""} ;
      T013R6_n9417MMSUsuCre = new boolean[] {false} ;
      T013R6_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013R6_n9418MMSFchCre = new boolean[] {false} ;
      T013R6_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      T013R6_n11304MMSFchApl = new boolean[] {false} ;
      T013R6_A9419MMSNroExt = new String[] {""} ;
      T013R6_n9419MMSNroExt = new boolean[] {false} ;
      T013R6_A9420MMSEst = new String[] {""} ;
      T013R6_n9420MMSEst = new boolean[] {false} ;
      T013R6_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R6_n11509MMSDto = new boolean[] {false} ;
      T013R6_A396EmprCod = new String[] {""} ;
      T013R6_A9414MMSPrvNum = new int[1] ;
      T013R6_n9414MMSPrvNum = new boolean[] {false} ;
      T013R13_A396EmprCod = new String[] {""} ;
      T013R13_A9412MMSCod = new int[1] ;
      T013R14_A396EmprCod = new String[] {""} ;
      T013R14_A9412MMSCod = new int[1] ;
      T013R5_A9412MMSCod = new int[1] ;
      T013R5_A9413MMSTpo = new String[] {""} ;
      T013R5_n9413MMSTpo = new boolean[] {false} ;
      T013R5_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013R5_n9416MMSFch = new boolean[] {false} ;
      T013R5_A9417MMSUsuCre = new String[] {""} ;
      T013R5_n9417MMSUsuCre = new boolean[] {false} ;
      T013R5_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013R5_n9418MMSFchCre = new boolean[] {false} ;
      T013R5_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      T013R5_n11304MMSFchApl = new boolean[] {false} ;
      T013R5_A9419MMSNroExt = new String[] {""} ;
      T013R5_n9419MMSNroExt = new boolean[] {false} ;
      T013R5_A9420MMSEst = new String[] {""} ;
      T013R5_n9420MMSEst = new boolean[] {false} ;
      T013R5_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R5_n11509MMSDto = new boolean[] {false} ;
      T013R5_A396EmprCod = new String[] {""} ;
      T013R5_A9414MMSPrvNum = new int[1] ;
      T013R5_n9414MMSPrvNum = new boolean[] {false} ;
      T013R18_A407EmprNom = new String[] {""} ;
      T013R18_n407EmprNom = new boolean[] {false} ;
      T013R19_A9415MMSPrvNom = new String[] {""} ;
      T013R19_n9415MMSPrvNom = new boolean[] {false} ;
      T013R20_A396EmprCod = new String[] {""} ;
      T013R20_A9412MMSCod = new int[1] ;
      Z9422MMSRNom = "" ;
      Z9423MMSRStkPre = DecimalUtil.ZERO ;
      T013R21_A9412MMSCod = new int[1] ;
      T013R21_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R21_A11511MMSRTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R21_A9422MMSRNom = new String[] {""} ;
      T013R21_n9422MMSRNom = new boolean[] {false} ;
      T013R21_A9423MMSRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R21_n9423MMSRStkPre = new boolean[] {false} ;
      T013R21_A11510MMSRPreD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R21_A11512MMSRDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R21_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R21_A396EmprCod = new String[] {""} ;
      T013R21_A9421MMSRCod = new int[1] ;
      T013R4_A9422MMSRNom = new String[] {""} ;
      T013R4_n9422MMSRNom = new boolean[] {false} ;
      T013R4_A9423MMSRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R4_n9423MMSRStkPre = new boolean[] {false} ;
      T013R22_A9422MMSRNom = new String[] {""} ;
      T013R22_n9422MMSRNom = new boolean[] {false} ;
      T013R22_A9423MMSRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R22_n9423MMSRStkPre = new boolean[] {false} ;
      T013R23_A396EmprCod = new String[] {""} ;
      T013R23_A9412MMSCod = new int[1] ;
      T013R23_A9421MMSRCod = new int[1] ;
      T013R3_A9412MMSCod = new int[1] ;
      T013R3_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R3_A11511MMSRTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R3_A11510MMSRPreD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R3_A11512MMSRDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R3_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R3_A396EmprCod = new String[] {""} ;
      T013R3_A9421MMSRCod = new int[1] ;
      T013R2_A9412MMSCod = new int[1] ;
      T013R2_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R2_A11511MMSRTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R2_A11510MMSRPreD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R2_A11512MMSRDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R2_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R2_A396EmprCod = new String[] {""} ;
      T013R2_A9421MMSRCod = new int[1] ;
      T013R27_A9422MMSRNom = new String[] {""} ;
      T013R27_n9422MMSRNom = new boolean[] {false} ;
      T013R27_A9423MMSRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013R27_n9423MMSRStkPre = new boolean[] {false} ;
      T013R28_A396EmprCod = new String[] {""} ;
      T013R28_A9412MMSCod = new int[1] ;
      T013R28_A9421MMSRCod = new int[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i9417MMSUsuCre = "" ;
      i9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      i9416MMSFch = GXutil.nullDate() ;
      i9420MMSEst = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int14 = new byte[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_dtime17 = new java.util.Date[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmmovst__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmmovst__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmmovst__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmmovst__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmmovst__default(),
         new Object[] {
             new Object[] {
            T013R2_A9412MMSCod, T013R2_A9424MMSRPre, T013R2_A11511MMSRTot, T013R2_A11510MMSRPreD, T013R2_A11512MMSRDto, T013R2_A9409MMSRCnt, T013R2_A396EmprCod, T013R2_A9421MMSRCod
            }
            , new Object[] {
            T013R3_A9412MMSCod, T013R3_A9424MMSRPre, T013R3_A11511MMSRTot, T013R3_A11510MMSRPreD, T013R3_A11512MMSRDto, T013R3_A9409MMSRCnt, T013R3_A396EmprCod, T013R3_A9421MMSRCod
            }
            , new Object[] {
            T013R4_A9422MMSRNom, T013R4_n9422MMSRNom, T013R4_A9423MMSRStkPre, T013R4_n9423MMSRStkPre
            }
            , new Object[] {
            T013R5_A9412MMSCod, T013R5_A9413MMSTpo, T013R5_n9413MMSTpo, T013R5_A9416MMSFch, T013R5_n9416MMSFch, T013R5_A9417MMSUsuCre, T013R5_n9417MMSUsuCre, T013R5_A9418MMSFchCre, T013R5_n9418MMSFchCre, T013R5_A11304MMSFchApl,
            T013R5_n11304MMSFchApl, T013R5_A9419MMSNroExt, T013R5_n9419MMSNroExt, T013R5_A9420MMSEst, T013R5_n9420MMSEst, T013R5_A11509MMSDto, T013R5_n11509MMSDto, T013R5_A396EmprCod, T013R5_A9414MMSPrvNum, T013R5_n9414MMSPrvNum
            }
            , new Object[] {
            T013R6_A9412MMSCod, T013R6_A9413MMSTpo, T013R6_n9413MMSTpo, T013R6_A9416MMSFch, T013R6_n9416MMSFch, T013R6_A9417MMSUsuCre, T013R6_n9417MMSUsuCre, T013R6_A9418MMSFchCre, T013R6_n9418MMSFchCre, T013R6_A11304MMSFchApl,
            T013R6_n11304MMSFchApl, T013R6_A9419MMSNroExt, T013R6_n9419MMSNroExt, T013R6_A9420MMSEst, T013R6_n9420MMSEst, T013R6_A11509MMSDto, T013R6_n11509MMSDto, T013R6_A396EmprCod, T013R6_A9414MMSPrvNum, T013R6_n9414MMSPrvNum
            }
            , new Object[] {
            T013R7_A407EmprNom, T013R7_n407EmprNom
            }
            , new Object[] {
            T013R8_A9415MMSPrvNom, T013R8_n9415MMSPrvNom
            }
            , new Object[] {
            T013R9_A9412MMSCod, T013R9_A407EmprNom, T013R9_n407EmprNom, T013R9_A9413MMSTpo, T013R9_n9413MMSTpo, T013R9_A9415MMSPrvNom, T013R9_n9415MMSPrvNom, T013R9_A9416MMSFch, T013R9_n9416MMSFch, T013R9_A9417MMSUsuCre,
            T013R9_n9417MMSUsuCre, T013R9_A9418MMSFchCre, T013R9_n9418MMSFchCre, T013R9_A11304MMSFchApl, T013R9_n11304MMSFchApl, T013R9_A9419MMSNroExt, T013R9_n9419MMSNroExt, T013R9_A9420MMSEst, T013R9_n9420MMSEst, T013R9_A11509MMSDto,
            T013R9_n11509MMSDto, T013R9_A396EmprCod, T013R9_A9414MMSPrvNum, T013R9_n9414MMSPrvNum
            }
            , new Object[] {
            T013R10_A407EmprNom, T013R10_n407EmprNom
            }
            , new Object[] {
            T013R11_A9415MMSPrvNom, T013R11_n9415MMSPrvNom
            }
            , new Object[] {
            T013R12_A396EmprCod, T013R12_A9412MMSCod
            }
            , new Object[] {
            T013R13_A396EmprCod, T013R13_A9412MMSCod
            }
            , new Object[] {
            T013R14_A396EmprCod, T013R14_A9412MMSCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013R18_A407EmprNom, T013R18_n407EmprNom
            }
            , new Object[] {
            T013R19_A9415MMSPrvNom, T013R19_n9415MMSPrvNom
            }
            , new Object[] {
            T013R20_A396EmprCod, T013R20_A9412MMSCod
            }
            , new Object[] {
            T013R21_A9412MMSCod, T013R21_A9424MMSRPre, T013R21_A11511MMSRTot, T013R21_A9422MMSRNom, T013R21_n9422MMSRNom, T013R21_A9423MMSRStkPre, T013R21_n9423MMSRStkPre, T013R21_A11510MMSRPreD, T013R21_A11512MMSRDto, T013R21_A9409MMSRCnt,
            T013R21_A396EmprCod, T013R21_A9421MMSRCod
            }
            , new Object[] {
            T013R22_A9422MMSRNom, T013R22_n9422MMSRNom, T013R22_A9423MMSRStkPre, T013R22_n9423MMSRStkPre
            }
            , new Object[] {
            T013R23_A396EmprCod, T013R23_A9412MMSCod, T013R23_A9421MMSRCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013R27_A9422MMSRNom, T013R27_n9422MMSRNom, T013R27_A9423MMSRStkPre, T013R27_n9423MMSRStkPre
            }
            , new Object[] {
            T013R28_A396EmprCod, T013R28_A9412MMSCod, T013R28_A9421MMSRCod
            }
         }
      );
      AV37Pgmname = "MantenimientoMaquina.TMMovSt" ;
      Z9420MMSEst = httpContext.getMessage( "E", "") ;
      n9420MMSEst = false ;
      A9420MMSEst = httpContext.getMessage( "E", "") ;
      n9420MMSEst = false ;
      i9420MMSEst = httpContext.getMessage( "E", "") ;
      n9420MMSEst = false ;
      Z9416MMSFch = GXutil.today( ) ;
      n9416MMSFch = false ;
      A9416MMSFch = GXutil.today( ) ;
      n9416MMSFch = false ;
      i9416MMSFch = GXutil.today( ) ;
      n9416MMSFch = false ;
      Z9418MMSFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9418MMSFchCre = false ;
      A9418MMSFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9418MMSFchCre = false ;
      i9418MMSFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9418MMSFchCre = false ;
      Z9417MMSUsuCre = "" ;
      n9417MMSUsuCre = false ;
      A9417MMSUsuCre = "" ;
      n9417MMSUsuCre = false ;
      i9417MMSUsuCre = "" ;
      n9417MMSUsuCre = false ;
      Z9424MMSRPre = DecimalUtil.ZERO ;
      N9424MMSRPre = DecimalUtil.ZERO ;
      A9424MMSRPre = DecimalUtil.ZERO ;
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
   private byte GXv_int14[] ;
   private short nRcdDeleted_1231 ;
   private short nRcdExists_1231 ;
   private short nIsMod_1231 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1231 ;
   private short RcdFound1231 ;
   private short nBlankRcdUsr1231 ;
   private short RcdFound1230 ;
   private short nIsDirty_1230 ;
   private short nIsDirty_1231 ;
   private int wcpOAV13MMSCod ;
   private int Z9412MMSCod ;
   private int Z9414MMSPrvNum ;
   private int nRC_GXsfl_74 ;
   private int nGXsfl_74_idx=1 ;
   private int N9414MMSPrvNum ;
   private int Z9421MMSRCod ;
   private int AV13MMSCod ;
   private int A9414MMSPrvNum ;
   private int A9421MMSRCod ;
   private int trnEnded ;
   private int A9412MMSCod ;
   private int edtMMSCod_Enabled ;
   private int edtMMSFch_Enabled ;
   private int edtMMSPrvNum_Visible ;
   private int edtMMSPrvNum_Enabled ;
   private int edtMMSDto_Enabled ;
   private int edtMMSNroExt_Enabled ;
   private int edtMMSUsuCre_Enabled ;
   private int edtMMSFchCre_Enabled ;
   private int edtMMSFchApl_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int AV33ComboMMSPrvNum ;
   private int edtavCombommsprvnum_Enabled ;
   private int edtavCombommsprvnum_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtMMSPrvNom_Visible ;
   private int edtMMSPrvNom_Enabled ;
   private int edtMMSRCod_Enabled ;
   private int edtMMSRNom_Enabled ;
   private int edtMMSRCnt_Enabled ;
   private int edtMMSRPreD_Enabled ;
   private int edtMMSRStkPre_Enabled ;
   private int edtMMSRTot_Enabled ;
   private int edtMMSRDto_Enabled ;
   private int edtMMSRPre_Enabled ;
   private int fRowAdded ;
   private int AV24Insert_MMSPrvNum ;
   private int AV16MTMovCod ;
   private int Combo_mmsprvnum_Datalistupdateminimumcharacters ;
   private int Combo_mmsrcod_Datalistupdateminimumcharacters ;
   private int AV38GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtMMSRPre_Enabled ;
   private int defedtMMSRTot_Enabled ;
   private int defedtMMSRStkPre_Enabled ;
   private int defedtMMSRNom_Enabled ;
   private int defedtMMSRCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXt_int11 ;
   private int GXv_int13[] ;
   private int GXv_int12[] ;
   private int GXv_int5[] ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11509MMSDto ;
   private java.math.BigDecimal Z9424MMSRPre ;
   private java.math.BigDecimal Z11511MMSRTot ;
   private java.math.BigDecimal Z11510MMSRPreD ;
   private java.math.BigDecimal Z11512MMSRDto ;
   private java.math.BigDecimal Z9409MMSRCnt ;
   private java.math.BigDecimal O9409MMSRCnt ;
   private java.math.BigDecimal N11511MMSRTot ;
   private java.math.BigDecimal N9424MMSRPre ;
   private java.math.BigDecimal A11509MMSDto ;
   private java.math.BigDecimal AV15oMMSRCnt ;
   private java.math.BigDecimal AV18nMMSRCnt ;
   private java.math.BigDecimal A9409MMSRCnt ;
   private java.math.BigDecimal A11510MMSRPreD ;
   private java.math.BigDecimal A9423MMSRStkPre ;
   private java.math.BigDecimal A11511MMSRTot ;
   private java.math.BigDecimal A11512MMSRDto ;
   private java.math.BigDecimal A9424MMSRPre ;
   private java.math.BigDecimal T9409MMSRCnt ;
   private java.math.BigDecimal Z9423MMSRStkPre ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV23EmprCod ;
   private String Z396EmprCod ;
   private String Z9413MMSTpo ;
   private String Z9417MMSUsuCre ;
   private String Z9419MMSNroExt ;
   private String Z9420MMSEst ;
   private String Combo_mmsprvnum_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV23EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String sGXsfl_74_idx="0001" ;
   private String edtMMSRCod_Horizontalalignment ;
   private String edtMMSRCod_Internalname ;
   private String A9413MMSTpo ;
   private String A9420MMSEst ;
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
   private String edtMMSCod_Internalname ;
   private String TempTags ;
   private String edtMMSCod_Jsonclick ;
   private String edtMMSFch_Internalname ;
   private String edtMMSFch_Jsonclick ;
   private String divTablesplittedmmsprvnum_Internalname ;
   private String lblTextblockmmsprvnum_Internalname ;
   private String lblTextblockmmsprvnum_Jsonclick ;
   private String Combo_mmsprvnum_Caption ;
   private String Combo_mmsprvnum_Cls ;
   private String Combo_mmsprvnum_Internalname ;
   private String edtMMSPrvNum_Internalname ;
   private String edtMMSPrvNum_Jsonclick ;
   private String edtMMSDto_Internalname ;
   private String edtMMSDto_Jsonclick ;
   private String edtMMSNroExt_Internalname ;
   private String A9419MMSNroExt ;
   private String edtMMSNroExt_Jsonclick ;
   private String edtMMSUsuCre_Internalname ;
   private String A9417MMSUsuCre ;
   private String edtMMSUsuCre_Jsonclick ;
   private String edtMMSFchCre_Internalname ;
   private String edtMMSFchCre_Jsonclick ;
   private String edtMMSFchApl_Internalname ;
   private String edtMMSFchApl_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_mmsprvnum_Internalname ;
   private String edtavCombommsprvnum_Internalname ;
   private String edtavCombommsprvnum_Jsonclick ;
   private String Combo_mmsrcod_Caption ;
   private String Combo_mmsrcod_Cls ;
   private String Combo_mmsrcod_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtMMSPrvNom_Internalname ;
   private String A9415MMSPrvNom ;
   private String edtMMSPrvNom_Jsonclick ;
   private String sMode1231 ;
   private String edtMMSRNom_Internalname ;
   private String edtMMSRCnt_Internalname ;
   private String edtMMSRPreD_Internalname ;
   private String edtMMSRStkPre_Internalname ;
   private String edtMMSRTot_Internalname ;
   private String edtMMSRDto_Internalname ;
   private String edtMMSRPre_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV8UsurCod ;
   private String AV37Pgmname ;
   private String AV17MTMovNom ;
   private String Combo_mmsprvnum_Objectcall ;
   private String Combo_mmsprvnum_Class ;
   private String Combo_mmsprvnum_Icontype ;
   private String Combo_mmsprvnum_Icon ;
   private String Combo_mmsprvnum_Tooltip ;
   private String Combo_mmsprvnum_Selectedvalue_set ;
   private String Combo_mmsprvnum_Selectedtext_set ;
   private String Combo_mmsprvnum_Selectedtext_get ;
   private String Combo_mmsprvnum_Gamoauthtoken ;
   private String Combo_mmsprvnum_Ddointernalname ;
   private String Combo_mmsprvnum_Titlecontrolalign ;
   private String Combo_mmsprvnum_Dropdownoptionstype ;
   private String Combo_mmsprvnum_Titlecontrolidtoreplace ;
   private String Combo_mmsprvnum_Datalisttype ;
   private String Combo_mmsprvnum_Datalistfixedvalues ;
   private String Combo_mmsprvnum_Datalistproc ;
   private String Combo_mmsprvnum_Datalistprocparametersprefix ;
   private String Combo_mmsprvnum_Remoteservicesparameters ;
   private String Combo_mmsprvnum_Htmltemplate ;
   private String Combo_mmsprvnum_Multiplevaluestype ;
   private String Combo_mmsprvnum_Loadingdata ;
   private String Combo_mmsprvnum_Noresultsfound ;
   private String Combo_mmsprvnum_Emptyitemtext ;
   private String Combo_mmsprvnum_Onlyselectedvalues ;
   private String Combo_mmsprvnum_Selectalltext ;
   private String Combo_mmsprvnum_Multiplevaluesseparator ;
   private String Combo_mmsprvnum_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_mmsrcod_Objectcall ;
   private String Combo_mmsrcod_Class ;
   private String Combo_mmsrcod_Icontype ;
   private String Combo_mmsrcod_Icon ;
   private String Combo_mmsrcod_Tooltip ;
   private String Combo_mmsrcod_Selectedvalue_set ;
   private String Combo_mmsrcod_Selectedvalue_get ;
   private String Combo_mmsrcod_Selectedtext_set ;
   private String Combo_mmsrcod_Selectedtext_get ;
   private String Combo_mmsrcod_Gamoauthtoken ;
   private String Combo_mmsrcod_Ddointernalname ;
   private String Combo_mmsrcod_Titlecontrolalign ;
   private String Combo_mmsrcod_Dropdownoptionstype ;
   private String Combo_mmsrcod_Titlecontrolidtoreplace ;
   private String Combo_mmsrcod_Datalisttype ;
   private String Combo_mmsrcod_Datalistfixedvalues ;
   private String Combo_mmsrcod_Datalistproc ;
   private String Combo_mmsrcod_Datalistprocparametersprefix ;
   private String Combo_mmsrcod_Remoteservicesparameters ;
   private String Combo_mmsrcod_Htmltemplate ;
   private String Combo_mmsrcod_Multiplevaluestype ;
   private String Combo_mmsrcod_Loadingdata ;
   private String Combo_mmsrcod_Noresultsfound ;
   private String Combo_mmsrcod_Emptyitemtext ;
   private String Combo_mmsrcod_Onlyselectedvalues ;
   private String Combo_mmsrcod_Selectalltext ;
   private String Combo_mmsrcod_Multiplevaluesseparator ;
   private String Combo_mmsrcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode1230 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9422MMSRNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV11Station ;
   private String AV30ObtenerEmprCod ;
   private String AV14EmprNom ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z9415MMSPrvNom ;
   private String Z9422MMSRNom ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtMMSRCod_Jsonclick ;
   private String edtMMSRNom_Jsonclick ;
   private String edtMMSRCnt_Jsonclick ;
   private String edtMMSRPreD_Jsonclick ;
   private String edtMMSRStkPre_Jsonclick ;
   private String edtMMSRTot_Jsonclick ;
   private String edtMMSRDto_Jsonclick ;
   private String edtMMSRPre_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i9417MMSUsuCre ;
   private String i9420MMSEst ;
   private String subGridlevel_level1_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z9418MMSFchCre ;
   private java.util.Date Z11304MMSFchApl ;
   private java.util.Date A9418MMSFchCre ;
   private java.util.Date A11304MMSFchApl ;
   private java.util.Date AV21ServerNow ;
   private java.util.Date i9418MMSFchCre ;
   private java.util.Date GXv_dtime17[] ;
   private java.util.Date Z9416MMSFch ;
   private java.util.Date A9416MMSFch ;
   private java.util.Date i9416MMSFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9414MMSPrvNum ;
   private boolean wbErr ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean n9413MMSTpo ;
   private boolean n9420MMSEst ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_mmsprvnum_Emptyitem ;
   private boolean Combo_mmsrcod_Isgriditem ;
   private boolean Combo_mmsrcod_Emptyitem ;
   private boolean Combo_mmsprvnum_Enabled ;
   private boolean Combo_mmsprvnum_Visible ;
   private boolean Combo_mmsprvnum_Allowmultipleselection ;
   private boolean Combo_mmsprvnum_Isgriditem ;
   private boolean Combo_mmsprvnum_Hasdescription ;
   private boolean Combo_mmsprvnum_Includeonlyselectedoption ;
   private boolean Combo_mmsprvnum_Includeselectalloption ;
   private boolean Combo_mmsprvnum_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_mmsrcod_Enabled ;
   private boolean Combo_mmsrcod_Visible ;
   private boolean Combo_mmsrcod_Allowmultipleselection ;
   private boolean Combo_mmsrcod_Hasdescription ;
   private boolean Combo_mmsrcod_Includeonlyselectedoption ;
   private boolean Combo_mmsrcod_Includeselectalloption ;
   private boolean Combo_mmsrcod_Includeaddnewoption ;
   private boolean n9416MMSFch ;
   private boolean n11509MMSDto ;
   private boolean n9419MMSNroExt ;
   private boolean n9417MMSUsuCre ;
   private boolean n9418MMSFchCre ;
   private boolean n11304MMSFchApl ;
   private boolean n407EmprNom ;
   private boolean n9415MMSPrvNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n9422MMSRNom ;
   private boolean n9423MMSRStkPre ;
   private String AV32ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV27WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_mmsprvnum ;
   private com.genexus.webpanels.GXUserControl ucCombo_mmsrcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbMMSTpo ;
   private HTMLChoice cmbMMSEst ;
   private IDataStoreProvider pr_default ;
   private String[] T013R7_A407EmprNom ;
   private boolean[] T013R7_n407EmprNom ;
   private String[] T013R8_A9415MMSPrvNom ;
   private boolean[] T013R8_n9415MMSPrvNom ;
   private int[] T013R9_A9412MMSCod ;
   private String[] T013R9_A407EmprNom ;
   private boolean[] T013R9_n407EmprNom ;
   private String[] T013R9_A9413MMSTpo ;
   private boolean[] T013R9_n9413MMSTpo ;
   private String[] T013R9_A9415MMSPrvNom ;
   private boolean[] T013R9_n9415MMSPrvNom ;
   private java.util.Date[] T013R9_A9416MMSFch ;
   private boolean[] T013R9_n9416MMSFch ;
   private String[] T013R9_A9417MMSUsuCre ;
   private boolean[] T013R9_n9417MMSUsuCre ;
   private java.util.Date[] T013R9_A9418MMSFchCre ;
   private boolean[] T013R9_n9418MMSFchCre ;
   private java.util.Date[] T013R9_A11304MMSFchApl ;
   private boolean[] T013R9_n11304MMSFchApl ;
   private String[] T013R9_A9419MMSNroExt ;
   private boolean[] T013R9_n9419MMSNroExt ;
   private String[] T013R9_A9420MMSEst ;
   private boolean[] T013R9_n9420MMSEst ;
   private java.math.BigDecimal[] T013R9_A11509MMSDto ;
   private boolean[] T013R9_n11509MMSDto ;
   private String[] T013R9_A396EmprCod ;
   private int[] T013R9_A9414MMSPrvNum ;
   private boolean[] T013R9_n9414MMSPrvNum ;
   private String[] T013R10_A407EmprNom ;
   private boolean[] T013R10_n407EmprNom ;
   private String[] T013R11_A9415MMSPrvNom ;
   private boolean[] T013R11_n9415MMSPrvNom ;
   private String[] T013R12_A396EmprCod ;
   private int[] T013R12_A9412MMSCod ;
   private int[] T013R6_A9412MMSCod ;
   private String[] T013R6_A9413MMSTpo ;
   private boolean[] T013R6_n9413MMSTpo ;
   private java.util.Date[] T013R6_A9416MMSFch ;
   private boolean[] T013R6_n9416MMSFch ;
   private String[] T013R6_A9417MMSUsuCre ;
   private boolean[] T013R6_n9417MMSUsuCre ;
   private java.util.Date[] T013R6_A9418MMSFchCre ;
   private boolean[] T013R6_n9418MMSFchCre ;
   private java.util.Date[] T013R6_A11304MMSFchApl ;
   private boolean[] T013R6_n11304MMSFchApl ;
   private String[] T013R6_A9419MMSNroExt ;
   private boolean[] T013R6_n9419MMSNroExt ;
   private String[] T013R6_A9420MMSEst ;
   private boolean[] T013R6_n9420MMSEst ;
   private java.math.BigDecimal[] T013R6_A11509MMSDto ;
   private boolean[] T013R6_n11509MMSDto ;
   private String[] T013R6_A396EmprCod ;
   private int[] T013R6_A9414MMSPrvNum ;
   private boolean[] T013R6_n9414MMSPrvNum ;
   private String[] T013R13_A396EmprCod ;
   private int[] T013R13_A9412MMSCod ;
   private String[] T013R14_A396EmprCod ;
   private int[] T013R14_A9412MMSCod ;
   private int[] T013R5_A9412MMSCod ;
   private String[] T013R5_A9413MMSTpo ;
   private boolean[] T013R5_n9413MMSTpo ;
   private java.util.Date[] T013R5_A9416MMSFch ;
   private boolean[] T013R5_n9416MMSFch ;
   private String[] T013R5_A9417MMSUsuCre ;
   private boolean[] T013R5_n9417MMSUsuCre ;
   private java.util.Date[] T013R5_A9418MMSFchCre ;
   private boolean[] T013R5_n9418MMSFchCre ;
   private java.util.Date[] T013R5_A11304MMSFchApl ;
   private boolean[] T013R5_n11304MMSFchApl ;
   private String[] T013R5_A9419MMSNroExt ;
   private boolean[] T013R5_n9419MMSNroExt ;
   private String[] T013R5_A9420MMSEst ;
   private boolean[] T013R5_n9420MMSEst ;
   private java.math.BigDecimal[] T013R5_A11509MMSDto ;
   private boolean[] T013R5_n11509MMSDto ;
   private String[] T013R5_A396EmprCod ;
   private int[] T013R5_A9414MMSPrvNum ;
   private boolean[] T013R5_n9414MMSPrvNum ;
   private String[] T013R18_A407EmprNom ;
   private boolean[] T013R18_n407EmprNom ;
   private String[] T013R19_A9415MMSPrvNom ;
   private boolean[] T013R19_n9415MMSPrvNom ;
   private String[] T013R20_A396EmprCod ;
   private int[] T013R20_A9412MMSCod ;
   private int[] T013R21_A9412MMSCod ;
   private java.math.BigDecimal[] T013R21_A9424MMSRPre ;
   private java.math.BigDecimal[] T013R21_A11511MMSRTot ;
   private String[] T013R21_A9422MMSRNom ;
   private boolean[] T013R21_n9422MMSRNom ;
   private java.math.BigDecimal[] T013R21_A9423MMSRStkPre ;
   private boolean[] T013R21_n9423MMSRStkPre ;
   private java.math.BigDecimal[] T013R21_A11510MMSRPreD ;
   private java.math.BigDecimal[] T013R21_A11512MMSRDto ;
   private java.math.BigDecimal[] T013R21_A9409MMSRCnt ;
   private String[] T013R21_A396EmprCod ;
   private int[] T013R21_A9421MMSRCod ;
   private String[] T013R4_A9422MMSRNom ;
   private boolean[] T013R4_n9422MMSRNom ;
   private java.math.BigDecimal[] T013R4_A9423MMSRStkPre ;
   private boolean[] T013R4_n9423MMSRStkPre ;
   private String[] T013R22_A9422MMSRNom ;
   private boolean[] T013R22_n9422MMSRNom ;
   private java.math.BigDecimal[] T013R22_A9423MMSRStkPre ;
   private boolean[] T013R22_n9423MMSRStkPre ;
   private String[] T013R23_A396EmprCod ;
   private int[] T013R23_A9412MMSCod ;
   private int[] T013R23_A9421MMSRCod ;
   private int[] T013R3_A9412MMSCod ;
   private java.math.BigDecimal[] T013R3_A9424MMSRPre ;
   private java.math.BigDecimal[] T013R3_A11511MMSRTot ;
   private java.math.BigDecimal[] T013R3_A11510MMSRPreD ;
   private java.math.BigDecimal[] T013R3_A11512MMSRDto ;
   private java.math.BigDecimal[] T013R3_A9409MMSRCnt ;
   private String[] T013R3_A396EmprCod ;
   private int[] T013R3_A9421MMSRCod ;
   private int[] T013R2_A9412MMSCod ;
   private java.math.BigDecimal[] T013R2_A9424MMSRPre ;
   private java.math.BigDecimal[] T013R2_A11511MMSRTot ;
   private java.math.BigDecimal[] T013R2_A11510MMSRPreD ;
   private java.math.BigDecimal[] T013R2_A11512MMSRDto ;
   private java.math.BigDecimal[] T013R2_A9409MMSRCnt ;
   private String[] T013R2_A396EmprCod ;
   private int[] T013R2_A9421MMSRCod ;
   private String[] T013R27_A9422MMSRNom ;
   private boolean[] T013R27_n9422MMSRNom ;
   private java.math.BigDecimal[] T013R27_A9423MMSRStkPre ;
   private boolean[] T013R27_n9423MMSRStkPre ;
   private String[] T013R28_A396EmprCod ;
   private int[] T013R28_A9412MMSCod ;
   private int[] T013R28_A9421MMSRCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV31MMSPrvNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV35MMSRCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item9 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item10[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV25TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV26TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV28WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV34DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class tmmovst__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmmovst__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmmovst__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmmovst__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmmovst__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013R2", "SELECT MMSCod, MMSRPre, MMSRTot, MMSRPreD, MMSRDto, MMSRCnt, EmprCod, MMSRCod FROM TXPMMoStR WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ?  FOR UPDATE OF MMSRPre, MMSRTot, MMSRPreD, MMSRDto, MMSRCnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R3", "SELECT MMSCod, MMSRPre, MMSRTot, MMSRPreD, MMSRDto, MMSRCnt, EmprCod, MMSRCod FROM TXPMMoStR WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R4", "SELECT MRNom AS MMSRNom, MRStkPre AS MMSRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R5", "SELECT MMSCod, MMSTpo, MMSFch, MMSUsuCre, MMSFchCre, MMSFchApl, MMSNroExt, MMSEst, MMSDto, EmprCod, MMSPrvNum FROM TXPMMoStk WHERE EmprCod = ? AND MMSCod = ?  FOR UPDATE OF MMSTpo, MMSFch, MMSUsuCre, MMSFchCre, MMSFchApl, MMSNroExt, MMSEst, MMSDto, MMSPrvNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R6", "SELECT MMSCod, MMSTpo, MMSFch, MMSUsuCre, MMSFchCre, MMSFchApl, MMSNroExt, MMSEst, MMSDto, EmprCod, MMSPrvNum FROM TXPMMoStk WHERE EmprCod = ? AND MMSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R8", "SELECT PrvNom AS MMSPrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R9", "SELECT /*+ FIRST_ROWS(100) */ TM1.MMSCod, T2.EmprNom, TM1.MMSTpo, T3.PrvNom AS MMSPrvNom, TM1.MMSFch, TM1.MMSUsuCre, TM1.MMSFchCre, TM1.MMSFchApl, TM1.MMSNroExt, TM1.MMSEst, TM1.MMSDto, TM1.EmprCod, TM1.MMSPrvNum AS MMSPrvNum FROM ((TXPMMoStk TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrvNum = TM1.MMSPrvNum) WHERE TM1.EmprCod = ? and TM1.MMSCod = ? ORDER BY TM1.EmprCod, TM1.MMSCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R11", "SELECT PrvNom AS MMSPrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MMSCod FROM TXPMMoStk WHERE EmprCod = ? AND MMSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MMSCod FROM TXPMMoStk WHERE ( EmprCod > ? or EmprCod = ? and MMSCod > ?) ORDER BY EmprCod, MMSCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013R14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MMSCod FROM TXPMMoStk WHERE ( EmprCod < ? or EmprCod = ? and MMSCod < ?) ORDER BY EmprCod DESC, MMSCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013R15", "INSERT INTO TXPMMoStk(MMSCod, MMSTpo, MMSFch, MMSUsuCre, MMSFchCre, MMSFchApl, MMSNroExt, MMSEst, MMSDto, EmprCod, MMSPrvNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMMoStk")
         ,new UpdateCursor("T013R16", "UPDATE TXPMMoStk SET MMSTpo=?, MMSFch=?, MMSUsuCre=?, MMSFchCre=?, MMSFchApl=?, MMSNroExt=?, MMSEst=?, MMSDto=?, MMSPrvNum=?  WHERE EmprCod = ? AND MMSCod = ?", GX_NOMASK, "TXPMMoStk")
         ,new UpdateCursor("T013R17", "DELETE FROM TXPMMoStk  WHERE EmprCod = ? AND MMSCod = ?", GX_NOMASK, "TXPMMoStk")
         ,new ForEachCursor("T013R18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R19", "SELECT PrvNom AS MMSPrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MMSCod FROM TXPMMoStk ORDER BY EmprCod, MMSCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R21", "SELECT T1.MMSCod, T1.MMSRPre, T1.MMSRTot, T2.MRNom AS MMSRNom, T2.MRStkPre AS MMSRStkPre, T1.MMSRPreD, T1.MMSRDto, T1.MMSRCnt, T1.EmprCod, T1.MMSRCod AS MMSRCod FROM (TXPMMoStR T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MMSRCod) WHERE T1.EmprCod = ? and T1.MMSCod = ? and T1.MMSRCod = ? ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R22", "SELECT MRNom AS MMSRNom, MRStkPre AS MMSRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R23", "SELECT EmprCod, MMSCod, MMSRCod FROM TXPMMoStR WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013R24", "INSERT INTO TXPMMoStR(MMSCod, MMSRPre, MMSRTot, MMSRPreD, MMSRDto, MMSRCnt, EmprCod, MMSRCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMMoStR")
         ,new UpdateCursor("T013R25", "UPDATE TXPMMoStR SET MMSRPre=?, MMSRTot=?, MMSRPreD=?, MMSRDto=?, MMSRCnt=?  WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ?", GX_NOMASK, "TXPMMoStR")
         ,new UpdateCursor("T013R26", "DELETE FROM TXPMMoStR  WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ?", GX_NOMASK, "TXPMMoStR")
         ,new ForEachCursor("T013R27", "SELECT MRNom AS MMSRNom, MRStkPre AS MMSRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013R28", "SELECT EmprCod, MMSCod, MMSRCod FROM TXPMMoStR WHERE EmprCod = ? and MMSCod = ? ORDER BY EmprCod, MMSCod, MMSRCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 26 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 20);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 2);
               }
               stmt.setString(10, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
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
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setInt(11, ((Number) parms[19]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 23 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

