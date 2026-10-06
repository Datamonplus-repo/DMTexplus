package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmcoment_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRVNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprvnum1AJ0( A396EmprCod, A13719PrvNNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRVNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprvnum1AJ0( A396EmprCod, A13719PrvNNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PRVNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h795PrvNum = httpContext.GetPar( "h795PrvNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaprvnum1AJ1471( A396EmprCod, h795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
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
         gxload_32( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_34") == 0 )
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
         gxload_34( A396EmprCod, A9492MRCod) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV33MComCod = GXutil.lval( httpContext.GetPar( "MComCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33MComCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33MComCod), "ZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entradas de Repuestos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMComCod_Internalname ;
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
      nRC_GXsfl_59 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_59"))) ;
      nGXsfl_59_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_59_idx"))) ;
      sGXsfl_59_idx = httpContext.GetPar( "sGXsfl_59_idx") ;
      edtMRCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Horizontalalignment", edtMRCod_Horizontalalignment, !bGXsfl_59_Refreshing);
      AV43solent = (short)(GXutil.lval( httpContext.GetPar( "solent"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_rep_newrow( ) ;
      /* End function gxnrGridlevel_rep_newrow_invoke */
   }

   public tmcoment_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmcoment_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmcoment_impl.class ));
   }

   public tmcoment_impl( int remoteHandle ,
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A11055MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11055MComCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMComCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComExt_Internalname, GXutil.rtrim( A11045MComExt), GXutil.rtrim( localUtil.format( A11045MComExt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComExt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMComExt_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMComFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComFch_Internalname, localUtil.format(A11046MComFch, "99/99/99"), localUtil.format( A11046MComFch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMComFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMComFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMComFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNum_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, h795PrvNum, GXutil.rtrim( localUtil.format( h795PrvNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNum_Enabled, 1, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
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
      httpContext.writeText( "<div id=\""+edtMComSolFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComSolFch_Internalname, localUtil.format(A11047MComSolFch, "99/99/99"), localUtil.format( A11047MComSolFch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComSolFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMComSolFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMComSolFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMComSolFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComEntFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComEntFch_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMComEntFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComEntFch_Internalname, localUtil.format(A11048MComEntFch, "99/99/99"), localUtil.format( A11048MComEntFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComEntFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMComEntFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMComEntFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMComEntFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
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
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMComEst, cmbMComEst.getInternalname(), GXutil.rtrim( A11049MComEst), 1, cmbMComEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMComEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMComEnt.htm");
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
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMComOri, cmbMComOri.getInternalname(), GXutil.rtrim( A11050MComOri), 1, cmbMComOri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMComOri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMComEnt.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMComEnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMComEnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMComEnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsertline_Internalname, "", httpContext.getMessage( "Nueva Linea", ""), bttBtninsertline_Jsonclick, 7, httpContext.getMessage( "Nueva Linea", ""), "", StyleString, ClassString, bttBtninsertline_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111aj1471_client"+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMComEnt.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV44Pgmname), GXutil.rtrim( localUtil.format( AV44Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
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
      /* User Defined Control */
      ucCombo_mrcod.setProperty("Caption", Combo_mrcod_Caption);
      ucCombo_mrcod.setProperty("Cls", Combo_mrcod_Cls);
      ucCombo_mrcod.setProperty("IsGridItem", Combo_mrcod_Isgriditem);
      ucCombo_mrcod.setProperty("EmptyItem", Combo_mrcod_Emptyitem);
      ucCombo_mrcod.setProperty("DropDownOptionsTitleSettingsIcons", AV42DDO_TitleSettingsIcons);
      ucCombo_mrcod.setProperty("DropDownOptionsData", AV40MRCod_Data);
      ucCombo_mrcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_mrcod_Internalname, "COMBO_MRCODContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "Attribute", "", "", "", "", edtPrvNom_Visible, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMComEnt.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_rep( )
   {
      /*  Grid Control  */
      startgridcontrol59( ) ;
      nGXsfl_59_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1472 = (short)(subGridlevel_rep_Rows) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1472 = (short)(1) ;
            scanStart1AJ1472( ) ;
            while ( RcdFound1472 != 0 )
            {
               init_level_properties1472( ) ;
               getByPrimaryKey1AJ1472( ) ;
               addRow1AJ1472( ) ;
               scanNext1AJ1472( ) ;
            }
            scanEnd1AJ1472( ) ;
            nBlankRcdCount1472 = (short)(subGridlevel_rep_Rows) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1AJ1472( ) ;
         standaloneModal1AJ1472( ) ;
         sMode1472 = Gx_mode ;
         while ( nGXsfl_59_idx < nRC_GXsfl_59 )
         {
            bGXsfl_59_Refreshing = true ;
            readRow1AJ1472( ) ;
            edtMRCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtMRCod_Horizontalalignment = httpContext.cgiGet( "MRCOD_"+sGXsfl_59_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Horizontalalignment", edtMRCod_Horizontalalignment, !bGXsfl_59_Refreshing);
            edtMComSolCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMSOLCNT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComSolCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolCnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtMComSolPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMSOLPRE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComSolPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtMComEntCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTCNT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtMComEntPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTPRE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            if ( ( nRcdExists_1472 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AJ1472( ) ;
            }
            sendRow1AJ1472( ) ;
            bGXsfl_59_Refreshing = false ;
         }
         Gx_mode = sMode1472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1472 = (short)(subGridlevel_rep_Rows) ;
         nRcdExists_1472 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AJ1472( ) ;
            while ( RcdFound1472 != 0 )
            {
               sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_591472( ) ;
               init_level_properties1472( ) ;
               standaloneNotModal1AJ1472( ) ;
               getByPrimaryKey1AJ1472( ) ;
               standaloneModal1AJ1472( ) ;
               addRow1AJ1472( ) ;
               scanNext1AJ1472( ) ;
            }
            scanEnd1AJ1472( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1472 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_591472( ) ;
         initAll1AJ1472( ) ;
         init_level_properties1472( ) ;
         nRcdExists_1472 = (short)(0) ;
         nIsMod_1472 = (short)(0) ;
         nRcdDeleted_1472 = (short)(0) ;
         nBlankRcdCount1472 = (short)(nBlankRcdUsr1472+nBlankRcdCount1472) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1472 > 0 )
         {
            standaloneNotModal1AJ1472( ) ;
            standaloneModal1AJ1472( ) ;
            addRow1AJ1472( ) ;
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
      e121AJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV42DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMRCOD_DATA"), AV40MRCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11055MComCod = localUtil.ctol( httpContext.cgiGet( "Z11055MComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z11048MComEntFch = localUtil.ctod( httpContext.cgiGet( "Z11048MComEntFch"), 0) ;
            Z11045MComExt = httpContext.cgiGet( "Z11045MComExt") ;
            Z11046MComFch = localUtil.ctod( httpContext.cgiGet( "Z11046MComFch"), 0) ;
            Z11047MComSolFch = localUtil.ctod( httpContext.cgiGet( "Z11047MComSolFch"), 0) ;
            Z11049MComEst = httpContext.cgiGet( "Z11049MComEst") ;
            Z11050MComOri = httpContext.cgiGet( "Z11050MComOri") ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_59 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_59"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "N795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV33MComCod = localUtil.ctol( httpContext.cgiGet( "vMCOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV37Insert_PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCPRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            AV43solent = (short)(localUtil.ctol( httpContext.cgiGet( "vSOLENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9493MRNom = httpContext.cgiGet( "MRNOM") ;
            n9493MRNom = false ;
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
            Combo_mrcod_Objectcall = httpContext.cgiGet( "COMBO_MRCOD_Objectcall") ;
            Combo_mrcod_Class = httpContext.cgiGet( "COMBO_MRCOD_Class") ;
            Combo_mrcod_Icontype = httpContext.cgiGet( "COMBO_MRCOD_Icontype") ;
            Combo_mrcod_Icon = httpContext.cgiGet( "COMBO_MRCOD_Icon") ;
            Combo_mrcod_Caption = httpContext.cgiGet( "COMBO_MRCOD_Caption") ;
            Combo_mrcod_Tooltip = httpContext.cgiGet( "COMBO_MRCOD_Tooltip") ;
            Combo_mrcod_Cls = httpContext.cgiGet( "COMBO_MRCOD_Cls") ;
            Combo_mrcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MRCOD_Selectedvalue_set") ;
            Combo_mrcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MRCOD_Selectedvalue_get") ;
            Combo_mrcod_Selectedtext_set = httpContext.cgiGet( "COMBO_MRCOD_Selectedtext_set") ;
            Combo_mrcod_Selectedtext_get = httpContext.cgiGet( "COMBO_MRCOD_Selectedtext_get") ;
            Combo_mrcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_MRCOD_Gamoauthtoken") ;
            Combo_mrcod_Ddointernalname = httpContext.cgiGet( "COMBO_MRCOD_Ddointernalname") ;
            Combo_mrcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_MRCOD_Titlecontrolalign") ;
            Combo_mrcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MRCOD_Dropdownoptionstype") ;
            Combo_mrcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOD_Enabled")) ;
            Combo_mrcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOD_Visible")) ;
            Combo_mrcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MRCOD_Titlecontrolidtoreplace") ;
            Combo_mrcod_Datalisttype = httpContext.cgiGet( "COMBO_MRCOD_Datalisttype") ;
            Combo_mrcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOD_Allowmultipleselection")) ;
            Combo_mrcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MRCOD_Datalistfixedvalues") ;
            Combo_mrcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOD_Isgriditem")) ;
            Combo_mrcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOD_Hasdescription")) ;
            Combo_mrcod_Datalistproc = httpContext.cgiGet( "COMBO_MRCOD_Datalistproc") ;
            Combo_mrcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MRCOD_Datalistprocparametersprefix") ;
            Combo_mrcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MRCOD_Remoteservicesparameters") ;
            Combo_mrcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MRCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_mrcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOD_Includeonlyselectedoption")) ;
            Combo_mrcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOD_Includeselectalloption")) ;
            Combo_mrcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOD_Emptyitem")) ;
            Combo_mrcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOD_Includeaddnewoption")) ;
            Combo_mrcod_Htmltemplate = httpContext.cgiGet( "COMBO_MRCOD_Htmltemplate") ;
            Combo_mrcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MRCOD_Multiplevaluestype") ;
            Combo_mrcod_Loadingdata = httpContext.cgiGet( "COMBO_MRCOD_Loadingdata") ;
            Combo_mrcod_Noresultsfound = httpContext.cgiGet( "COMBO_MRCOD_Noresultsfound") ;
            Combo_mrcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MRCOD_Emptyitemtext") ;
            Combo_mrcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MRCOD_Onlyselectedvalues") ;
            Combo_mrcod_Selectalltext = httpContext.cgiGet( "COMBO_MRCOD_Selectalltext") ;
            Combo_mrcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MRCOD_Multiplevaluesseparator") ;
            Combo_mrcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_MRCOD_Addnewoptiontext") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MCOMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11055MComCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            }
            else
            {
               A11055MComCod = localUtil.ctol( httpContext.cgiGet( edtMComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            }
            A11045MComExt = httpContext.cgiGet( edtMComExt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11045MComExt", A11045MComExt);
            A11046MComFch = localUtil.ctod( httpContext.cgiGet( edtMComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11046MComFch", localUtil.format(A11046MComFch, "99/99/99"));
            h795PrvNum = httpContext.cgiGet( edtPrvNum_Internalname) ;
            A11047MComSolFch = localUtil.ctod( httpContext.cgiGet( edtMComSolFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11047MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
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
            AV44Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
            n794PrvNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
            /* Read subfile selected row values. */
            nGXsfl_59_idx = (int)(localUtil.cton( httpContext.cgiGet( subGridlevel_rep_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_591472( ) ;
            if ( nGXsfl_59_idx > 0 )
            {
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
               {
                  GXCCtl = "MRCOD_" + sGXsfl_59_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  wbErr = true ;
                  A9492MRCod = 0 ;
               }
               else
               {
                  A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               A11051MComSolCnt = localUtil.ctond( httpContext.cgiGet( edtMComSolCnt_Internalname)) ;
               A11052MComSolPre = localUtil.ctond( httpContext.cgiGet( edtMComSolPre_Internalname)) ;
               if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
               {
                  GXCCtl = "MCOMENTCNT_" + sGXsfl_59_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMComEntCnt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  wbErr = true ;
                  A11053MComEntCnt = DecimalUtil.ZERO ;
               }
               else
               {
                  A11053MComEntCnt = localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)) ;
               }
               if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComEntPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComEntPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
               {
                  GXCCtl = "MCOMENTPRE_" + sGXsfl_59_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMComEntPre_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  wbErr = true ;
                  A11054MComEntPre = DecimalUtil.ZERO ;
               }
               else
               {
                  A11054MComEntPre = localUtil.ctond( httpContext.cgiGet( edtMComEntPre_Internalname)) ;
               }
               GXCCtl = "Z9492MRCod_" + sGXsfl_59_idx ;
               Z9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               GXCCtl = "Z11054MComEntPre_" + sGXsfl_59_idx ;
               Z11054MComEntPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
               GXCCtl = "Z11051MComSolCnt_" + sGXsfl_59_idx ;
               Z11051MComSolCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
               GXCCtl = "Z11052MComSolPre_" + sGXsfl_59_idx ;
               Z11052MComSolPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
               GXCCtl = "Z11053MComEntCnt_" + sGXsfl_59_idx ;
               Z11053MComEntCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
               GXCCtl = "nRcdDeleted_1472_" + sGXsfl_59_idx ;
               nRcdDeleted_1472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               GXCCtl = "nRcdExists_1472_" + sGXsfl_59_idx ;
               nRcdExists_1472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               GXCCtl = "nIsMod_1472_" + sGXsfl_59_idx ;
               nIsMod_1472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               GXCCtl = "N9492MRCod_" + sGXsfl_59_idx ;
               N9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMComEnt");
            A11046MComFch = localUtil.ctod( httpContext.cgiGet( edtMComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11046MComFch", localUtil.format(A11046MComFch, "99/99/99"));
            forbiddenHiddens.add("MComFch", localUtil.format(A11046MComFch, "99/99/99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV44Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV44Pgmname, "")));
            A11045MComExt = httpContext.cgiGet( edtMComExt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11045MComExt", A11045MComExt);
            forbiddenHiddens.add("MComExt", GXutil.rtrim( localUtil.format( A11045MComExt, "")));
            A11047MComSolFch = localUtil.ctod( httpContext.cgiGet( edtMComSolFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11047MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
            forbiddenHiddens.add("MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
            A11049MComEst = httpContext.cgiGet( cmbMComEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
            forbiddenHiddens.add("MComEst", GXutil.rtrim( localUtil.format( A11049MComEst, "")));
            A11050MComOri = httpContext.cgiGet( cmbMComOri.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
            forbiddenHiddens.add("MComOri", GXutil.rtrim( localUtil.format( A11050MComOri, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11055MComCod != Z11055MComCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tmcoment:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1AJ0( ) ;
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
                        e121AJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131AJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOBTNINSERTLINE'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoBtnInsertLine' */
                        e141AJ2 ();
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
         e131AJ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1AJ1471( ) ;
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
         disableAttributes1AJ1471( ) ;
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

   public void confirm_1AJ0( )
   {
      beforeValidate1AJ1471( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AJ1471( ) ;
         }
         else
         {
            checkExtendedTable1AJ1471( ) ;
            closeExtendedTableCursors1AJ1471( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1471 = Gx_mode ;
         confirm_1AJ1472( ) ;
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

   public void confirm_1AJ1472( )
   {
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1AJ1472( ) ;
         if ( ( nRcdExists_1472 != 0 ) || ( nIsMod_1472 != 0 ) )
         {
            getKey1AJ1472( ) ;
            if ( ( nRcdExists_1472 == 0 ) && ( nRcdDeleted_1472 == 0 ) )
            {
               if ( RcdFound1472 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AJ1472( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AJ1472( ) ;
                     closeExtendedTableCursors1AJ1472( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MRCOD_" + sGXsfl_59_idx ;
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
                     getByPrimaryKey1AJ1472( ) ;
                     load1AJ1472( ) ;
                     beforeValidate1AJ1472( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AJ1472( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1472 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AJ1472( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AJ1472( ) ;
                           closeExtendedTableCursors1AJ1472( ) ;
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
                     GXCCtl = "MRCOD_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComSolCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComSolPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComEntCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9492MRCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11054MComEntPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11051MComSolCnt_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11052MComSolPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11053MComEntCnt_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1472_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1472_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1472_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N9492MRCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1472 != 0 )
         {
            httpContext.changePostValue( "MRCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRCOD_"+sGXsfl_59_idx+"Horizontalalignment", GXutil.rtrim( edtMRCod_Horizontalalignment)) ;
            httpContext.changePostValue( "MCOMSOLCNT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMSOLPRE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTCNT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTPRE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AJ0( )
   {
   }

   public void e121AJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmcoment_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmcoment_impl.this.AV32EmprCod = GXv_char2[0] ;
      tmcoment_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmcoment_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV42DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV42DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Combo_mrcod_Titlecontrolidtoreplace = edtMRCod_Internalname ;
      ucCombo_mrcod.sendProperty(context, "", false, Combo_mrcod_Internalname, "TitleControlIdToReplace", Combo_mrcod_Titlecontrolidtoreplace);
      edtMRCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Horizontalalignment", edtMRCod_Horizontalalignment, !bGXsfl_59_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOMRCOD' */
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
      if ( ( GXutil.strcmp(AV35TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV44Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV45GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GXV1), 8, 0));
         while ( AV45GXV1 <= AV35TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV38TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV35TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV45GXV1));
            if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvNum") == 0 )
            {
               AV37Insert_PrvNum = (int)(GXutil.lval( AV38TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Insert_PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Insert_PrvNum), 6, 0));
            }
            AV45GXV1 = (int)(AV45GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtPrvNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), true);
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         subGridlevel_rep_Allowselection = (byte)(1) ;
         subGridlevel_rep_Rows = 0 ;
         subGridlevel_rep_Selectedindex = -1 ;
         httpContext.ajax_rsp_assign_prop("", false, "Gridlevel_repContainerDiv", "Selectedindex", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridlevel_rep_Selectedindex), 9, 0), true);
         bttBtninsertline_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtninsertline_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtninsertline_Visible), 5, 0), true);
      }
      else
      {
         subGridlevel_rep_Rows = 10 ;
      }
      GXt_int8 = (byte)(AV43solent) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV32EmprCod, httpContext.getMessage( "SOLENT", ""), GXv_int9) ;
      tmcoment_impl.this.GXt_int8 = GXv_int9[0] ;
      AV43solent = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43solent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43solent), 4, 0));
   }

   public void e131AJ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV35TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmcomentww", new String[] {}, new String[] {}) );
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

   public void S112( )
   {
      /* 'LOADCOMBOMRCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV40MRCod_Data ;
      GXv_char4[0] = AV41ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.mantenimientomaquina.tmcomentloaddvcombo(remoteHandle, context).execute( "MRCod", Gx_mode, AV32EmprCod, AV33MComCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      tmcoment_impl.this.AV41ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV40MRCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   }

   public void e141AJ2( )
   {
      /* 'DoBtnInsertLine' Routine */
      returnInSub = false ;
      subgridlevel_rep_addlines( 1) ;
   }

   public void zm1AJ1471( int GX_JID )
   {
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11048MComEntFch = T01AJ6_A11048MComEntFch[0] ;
            Z11045MComExt = T01AJ6_A11045MComExt[0] ;
            Z11046MComFch = T01AJ6_A11046MComFch[0] ;
            Z11047MComSolFch = T01AJ6_A11047MComSolFch[0] ;
            Z11049MComEst = T01AJ6_A11049MComEst[0] ;
            Z11050MComOri = T01AJ6_A11050MComOri[0] ;
            Z795PrvNum = T01AJ6_A795PrvNum[0] ;
         }
         else
         {
            Z11048MComEntFch = A11048MComEntFch ;
            Z11045MComExt = A11045MComExt ;
            Z11046MComFch = A11046MComFch ;
            Z11047MComSolFch = A11047MComSolFch ;
            Z11049MComEst = A11049MComEst ;
            Z11050MComOri = A11050MComOri ;
            Z795PrvNum = A795PrvNum ;
         }
      }
      if ( GX_JID == -30 )
      {
         Z11055MComCod = A11055MComCod ;
         Z11048MComEntFch = A11048MComEntFch ;
         Z11045MComExt = A11045MComExt ;
         Z11046MComFch = A11046MComFch ;
         Z11047MComSolFch = A11047MComSolFch ;
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
      edtMComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComFch_Enabled), 5, 0), true);
      edtMComSolFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolFch_Enabled), 5, 0), true);
      edtMComExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComExt_Enabled), 5, 0), true);
      cmbMComEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
      cmbMComOri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComOri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComOri.getEnabled(), 5, 0), true);
      AV44Pgmname = "MantenimientoMaquina.TMComEnt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      edtMComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComFch_Enabled), 5, 0), true);
      edtMComSolFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolFch_Enabled), 5, 0), true);
      edtMComExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComExt_Enabled), 5, 0), true);
      cmbMComEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComEst.getEnabled(), 5, 0), true);
      cmbMComOri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComOri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMComOri.getEnabled(), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV33MComCod) )
      {
         A11055MComCod = AV33MComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      }
      if ( ! (0==AV33MComCod) )
      {
         edtMComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
      }
      else
      {
         edtMComCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV33MComCod) )
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
         if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
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
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No pueden crearse Compras por aquí.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede eliminar la compra.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV37Insert_PrvNum) )
      {
         A795PrvNum = AV37Insert_PrvNum ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         /* Using cursor T01AJ9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         h795PrvNum = "" ;
         while ( (pr_default.getStatus(7) != 101) )
         {
            h795PrvNum = T01AJ9_A13719PrvNNom[0] ;
            if (true) break;
         }
         pr_default.close(7);
         httpContext.ajax_rsp_assign_attri("", false, "h795PrvNum", h795PrvNum);
      }
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         edtPrvNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
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
         /* Using cursor T01AJ7 */
         pr_default.execute(5, new Object[] {A396EmprCod});
         A407EmprNom = T01AJ7_A407EmprNom[0] ;
         n407EmprNom = T01AJ7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(5);
         /* Using cursor T01AJ8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01AJ8_A794PrvNom[0] ;
         n794PrvNom = T01AJ8_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(6);
      }
   }

   public void load1AJ1471( )
   {
      /* Using cursor T01AJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1471 = (short)(1) ;
         A11048MComEntFch = T01AJ10_A11048MComEntFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
         A407EmprNom = T01AJ10_A407EmprNom[0] ;
         n407EmprNom = T01AJ10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11045MComExt = T01AJ10_A11045MComExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11045MComExt", A11045MComExt);
         A11046MComFch = T01AJ10_A11046MComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11046MComFch", localUtil.format(A11046MComFch, "99/99/99"));
         A794PrvNom = T01AJ10_A794PrvNom[0] ;
         n794PrvNom = T01AJ10_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A11047MComSolFch = T01AJ10_A11047MComSolFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11047MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
         A11049MComEst = T01AJ10_A11049MComEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
         A11050MComOri = T01AJ10_A11050MComOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
         A795PrvNum = T01AJ10_A795PrvNum[0] ;
         n795PrvNum = T01AJ10_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         zm1AJ1471( -30) ;
      }
      pr_default.close(8);
      onLoadActions1AJ1471( ) ;
   }

   public void onLoadActions1AJ1471( )
   {
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A11048MComEntFch)) )
      {
         A11048MComEntFch = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
      }
      /* Using cursor T01AJ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      h795PrvNum = "" ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         h795PrvNum = T01AJ11_A13719PrvNNom[0] ;
         if (true) break;
      }
      pr_default.close(9);
      httpContext.ajax_rsp_assign_attri("", false, "h795PrvNum", h795PrvNum);
   }

   public void checkExtendedTable1AJ1471( )
   {
      nIsDirty_1471 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h795PrvNum)==0) )
      {
         nIsDirty_1471 = (short)(1) ;
         A795PrvNum = 0 ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      else
      {
         A13719PrvNNom = h795PrvNum ;
         /* Using cursor T01AJ12 */
         pr_default.execute(10, new Object[] {A13719PrvNNom, A396EmprCod});
         A396EmprCod = T01AJ12_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T01AJ12_A795PrvNum[0] ;
         n795PrvNum = T01AJ12_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A795PrvNum = T01AJ12_A795PrvNum[0] ;
         n795PrvNum = T01AJ12_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         if ( ! ( (pr_default.getStatus(10) == 101) ) )
         {
            pr_default.readNext(10);
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "PRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(10);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h795PrvNum", h795PrvNum);
      if ( (GXutil.strcmp("", h795PrvNum)==0) )
      {
         nIsDirty_1471 = (short)(1) ;
         A795PrvNum = 0 ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      else
      {
         A13719PrvNNom = h795PrvNum ;
         /* Using cursor T01AJ13 */
         pr_default.execute(11, new Object[] {A13719PrvNNom, A396EmprCod});
         A396EmprCod = T01AJ13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T01AJ13_A795PrvNum[0] ;
         n795PrvNum = T01AJ13_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A795PrvNum = T01AJ13_A795PrvNum[0] ;
         n795PrvNum = T01AJ13_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         if ( ! ( (pr_default.getStatus(11) == 101) ) )
         {
            pr_default.readNext(11);
            if ( ! ( (pr_default.getStatus(11) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "PRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(11);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h795PrvNum", h795PrvNum);
      /* Using cursor T01AJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01AJ7_A407EmprNom[0] ;
      n407EmprNom = T01AJ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01AJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A795PrvNum) && (GXutil.strcmp("", A13719PrvNNom)==0) || (0==A795PrvNum) && n795PrvNum || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A794PrvNom = T01AJ8_A794PrvNom[0] ;
      n794PrvNom = T01AJ8_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      pr_default.close(6);
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A11048MComEntFch)) )
      {
         nIsDirty_1471 = (short)(1) ;
         A11048MComEntFch = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
      }
      if ( isUpd( )  && ! ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo pueden ingresarse datos de Compras Confirmadas.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1AJ1471( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_31( String A396EmprCod )
   {
      /* Using cursor T01AJ14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01AJ14_A407EmprNom[0] ;
      n407EmprNom = T01AJ14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_32( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T01AJ15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (0==A795PrvNum) && (GXutil.strcmp("", A13719PrvNNom)==0) || (0==A795PrvNum) && n795PrvNum || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A794PrvNom = T01AJ15_A794PrvNom[0] ;
      n794PrvNom = T01AJ15_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1AJ1471( )
   {
      /* Using cursor T01AJ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1471 = (short)(1) ;
      }
      else
      {
         RcdFound1471 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1AJ1471( 30) ;
         RcdFound1471 = (short)(1) ;
         A11055MComCod = T01AJ6_A11055MComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         A11048MComEntFch = T01AJ6_A11048MComEntFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
         A11045MComExt = T01AJ6_A11045MComExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11045MComExt", A11045MComExt);
         A11046MComFch = T01AJ6_A11046MComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11046MComFch", localUtil.format(A11046MComFch, "99/99/99"));
         A11047MComSolFch = T01AJ6_A11047MComSolFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11047MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
         A11049MComEst = T01AJ6_A11049MComEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
         A11050MComOri = T01AJ6_A11050MComOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
         A396EmprCod = T01AJ6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T01AJ6_A795PrvNum[0] ;
         n795PrvNum = T01AJ6_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z11055MComCod = A11055MComCod ;
         sMode1471 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1AJ1471( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1471 = (short)(0) ;
            initializeNonKey1AJ1471( ) ;
         }
         Gx_mode = sMode1471 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1471 = (short)(0) ;
         initializeNonKey1AJ1471( ) ;
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
      getKey1AJ1471( ) ;
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
      /* Using cursor T01AJ17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01AJ17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01AJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AJ17_A11055MComCod[0] < A11055MComCod ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01AJ17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01AJ17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AJ17_A11055MComCod[0] > A11055MComCod ) ) )
         {
            A396EmprCod = T01AJ17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11055MComCod = T01AJ17_A11055MComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            RcdFound1471 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound1471 = (short)(0) ;
      /* Using cursor T01AJ18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01AJ18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01AJ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AJ18_A11055MComCod[0] > A11055MComCod ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01AJ18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01AJ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AJ18_A11055MComCod[0] < A11055MComCod ) ) )
         {
            A396EmprCod = T01AJ18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11055MComCod = T01AJ18_A11055MComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            RcdFound1471 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AJ1471( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AJ1471( ) ;
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
               GX_FocusControl = edtMComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1AJ1471( ) ;
               GX_FocusControl = edtMComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11055MComCod != Z11055MComCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtMComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AJ1471( ) ;
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
                  GX_FocusControl = edtMComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1AJ1471( ) ;
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
         GX_FocusControl = edtMComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void subgridlevel_rep_addlines( int nLines )
   {
      nKeyPressed = (byte)(4) ;
      nBlankRcdUsr1472 = (short)(nBlankRcdUsr1472+nLines) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_59_Refreshing )
      {
         httpContext.doAjaxAddLines(59, nLines);
      }
   }

   public void checkOptimisticConcurrency1AJ1471( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h795PrvNum)==0) )
         {
            A795PrvNum = 0 ;
            n795PrvNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         else
         {
            A13719PrvNNom = h795PrvNum ;
            /* Using cursor T01AJ19 */
            pr_default.execute(17, new Object[] {A13719PrvNNom, A396EmprCod});
            A396EmprCod = T01AJ19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A795PrvNum = T01AJ19_A795PrvNum[0] ;
            n795PrvNum = T01AJ19_n795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            A795PrvNum = T01AJ19_A795PrvNum[0] ;
            n795PrvNum = T01AJ19_n795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               pr_default.readNext(17);
               if ( ! ( (pr_default.getStatus(17) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "PRVNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrvNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(17);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h795PrvNum", h795PrvNum);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01AJ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepCo"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z11048MComEntFch), GXutil.resetTime(T01AJ5_A11048MComEntFch[0])) ) || ( GXutil.strcmp(Z11045MComExt, T01AJ5_A11045MComExt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z11046MComFch), GXutil.resetTime(T01AJ5_A11046MComFch[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z11047MComSolFch), GXutil.resetTime(T01AJ5_A11047MComSolFch[0])) ) || ( GXutil.strcmp(Z11049MComEst, T01AJ5_A11049MComEst[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11050MComOri, T01AJ5_A11050MComOri[0]) != 0 ) || ( Z795PrvNum != T01AJ5_A795PrvNum[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11048MComEntFch), GXutil.resetTime(T01AJ5_A11048MComEntFch[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComEntFch");
               GXutil.writeLogRaw("Old: ",Z11048MComEntFch);
               GXutil.writeLogRaw("Current: ",T01AJ5_A11048MComEntFch[0]);
            }
            if ( GXutil.strcmp(Z11045MComExt, T01AJ5_A11045MComExt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComExt");
               GXutil.writeLogRaw("Old: ",Z11045MComExt);
               GXutil.writeLogRaw("Current: ",T01AJ5_A11045MComExt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11046MComFch), GXutil.resetTime(T01AJ5_A11046MComFch[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComFch");
               GXutil.writeLogRaw("Old: ",Z11046MComFch);
               GXutil.writeLogRaw("Current: ",T01AJ5_A11046MComFch[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11047MComSolFch), GXutil.resetTime(T01AJ5_A11047MComSolFch[0])) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComSolFch");
               GXutil.writeLogRaw("Old: ",Z11047MComSolFch);
               GXutil.writeLogRaw("Current: ",T01AJ5_A11047MComSolFch[0]);
            }
            if ( GXutil.strcmp(Z11049MComEst, T01AJ5_A11049MComEst[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComEst");
               GXutil.writeLogRaw("Old: ",Z11049MComEst);
               GXutil.writeLogRaw("Current: ",T01AJ5_A11049MComEst[0]);
            }
            if ( GXutil.strcmp(Z11050MComOri, T01AJ5_A11050MComOri[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComOri");
               GXutil.writeLogRaw("Old: ",Z11050MComOri);
               GXutil.writeLogRaw("Current: ",T01AJ5_A11050MComOri[0]);
            }
            if ( Z795PrvNum != T01AJ5_A795PrvNum[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T01AJ5_A795PrvNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRepCo"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AJ1471( )
   {
      beforeValidate1AJ1471( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AJ1471( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AJ1471( 0) ;
         checkOptimisticConcurrency1AJ1471( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AJ1471( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AJ1471( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AJ20 */
                  pr_default.execute(18, new Object[] {Long.valueOf(A11055MComCod), A11048MComEntFch, A11045MComExt, A11046MComFch, A11047MComSolFch, A11049MComEst, A11050MComOri, A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepCo");
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
                        processLevel1AJ1471( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AJ0( ) ;
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
            load1AJ1471( ) ;
         }
         endLevel1AJ1471( ) ;
      }
      closeExtendedTableCursors1AJ1471( ) ;
   }

   public void update1AJ1471( )
   {
      beforeValidate1AJ1471( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AJ1471( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AJ1471( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AJ1471( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AJ1471( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AJ21 */
                  pr_default.execute(19, new Object[] {A11048MComEntFch, A11045MComExt, A11046MComFch, A11047MComSolFch, A11049MComEst, A11050MComOri, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum), A396EmprCod, Long.valueOf(A11055MComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepCo");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepCo"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AJ1471( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AJ1471( ) ;
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
         endLevel1AJ1471( ) ;
      }
      closeExtendedTableCursors1AJ1471( ) ;
   }

   public void deferredUpdate1AJ1471( )
   {
   }

   public void delete( )
   {
      beforeValidate1AJ1471( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AJ1471( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AJ1471( ) ;
         afterConfirm1AJ1471( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AJ1471( ) ;
            if ( AnyError == 0 )
            {
               scanStart1AJ1472( ) ;
               while ( RcdFound1472 != 0 )
               {
                  getByPrimaryKey1AJ1472( ) ;
                  delete1AJ1472( ) ;
                  scanNext1AJ1472( ) ;
               }
               scanEnd1AJ1472( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AJ22 */
                  pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
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
      endLevel1AJ1471( ) ;
      Gx_mode = sMode1471 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AJ1471( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isUpd( )  && ! ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo pueden ingresarse datos de Compras Confirmadas.", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor T01AJ23 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         A407EmprNom = T01AJ23_A407EmprNom[0] ;
         n407EmprNom = T01AJ23_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(21);
         /* Using cursor T01AJ24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01AJ24_A794PrvNom[0] ;
         n794PrvNom = T01AJ24_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(22);
      }
   }

   public void processNestedLevel1AJ1472( )
   {
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1AJ1472( ) ;
         if ( ( nRcdExists_1472 != 0 ) || ( nIsMod_1472 != 0 ) )
         {
            standaloneNotModal1AJ1472( ) ;
            getKey1AJ1472( ) ;
            if ( ( nRcdExists_1472 == 0 ) && ( nRcdDeleted_1472 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AJ1472( ) ;
            }
            else
            {
               if ( RcdFound1472 != 0 )
               {
                  if ( ( nRcdDeleted_1472 != 0 ) && ( nRcdExists_1472 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AJ1472( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1472 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AJ1472( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1472 == 0 )
                  {
                     GXCCtl = "MRCOD_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComSolCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComSolPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComEntCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMComEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9492MRCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11054MComEntPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11051MComSolCnt_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11052MComSolPre_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11053MComEntCnt_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1472_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1472_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1472_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N9492MRCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1472 != 0 )
         {
            httpContext.changePostValue( "MRCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRCOD_"+sGXsfl_59_idx+"Horizontalalignment", GXutil.rtrim( edtMRCod_Horizontalalignment)) ;
            httpContext.changePostValue( "MCOMSOLCNT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMSOLPRE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTCNT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MCOMENTPRE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AJ1472( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1472 = (short)(0) ;
      nIsMod_1472 = (short)(0) ;
      nRcdDeleted_1472 = (short)(0) ;
   }

   public void processLevel1AJ1471( )
   {
      /* Save parent mode. */
      sMode1471 = Gx_mode ;
      processNestedLevel1AJ1472( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1471 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AJ1471( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AJ1471( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmcoment");
         if ( AnyError == 0 )
         {
            confirmValues1AJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmcoment");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AJ1471( )
   {
      /* Scan By routine */
      /* Using cursor T01AJ25 */
      pr_default.execute(23);
      RcdFound1471 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1471 = (short)(1) ;
         A396EmprCod = T01AJ25_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11055MComCod = T01AJ25_A11055MComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AJ1471( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1471 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1471 = (short)(1) ;
         A396EmprCod = T01AJ25_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11055MComCod = T01AJ25_A11055MComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      }
   }

   public void scanEnd1AJ1471( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1AJ1471( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AJ1471( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AJ1471( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AJ1471( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AJ1471( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AJ1471( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AJ1471( )
   {
      edtMComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
      edtMComExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComExt_Enabled), 5, 0), true);
      edtMComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComFch_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
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
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
   }

   public void zm1AJ1472( int GX_JID )
   {
      if ( ( GX_JID == 33 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11054MComEntPre = T01AJ3_A11054MComEntPre[0] ;
            Z11051MComSolCnt = T01AJ3_A11051MComSolCnt[0] ;
            Z11052MComSolPre = T01AJ3_A11052MComSolPre[0] ;
            Z11053MComEntCnt = T01AJ3_A11053MComEntCnt[0] ;
         }
         else
         {
            Z11054MComEntPre = A11054MComEntPre ;
            Z11051MComSolCnt = A11051MComSolCnt ;
            Z11052MComSolPre = A11052MComSolPre ;
            Z11053MComEntCnt = A11053MComEntCnt ;
         }
      }
      if ( GX_JID == -33 )
      {
         Z11055MComCod = A11055MComCod ;
         Z11054MComEntPre = A11054MComEntPre ;
         Z11051MComSolCnt = A11051MComSolCnt ;
         Z11052MComSolPre = A11052MComSolPre ;
         Z11053MComEntCnt = A11053MComEntCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z9493MRNom = A9493MRNom ;
      }
   }

   public void standaloneNotModal1AJ1472( )
   {
      edtMComSolPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtMComSolCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolCnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void standaloneModal1AJ1472( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         edtMRCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         edtMRCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      if ( ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) && isDlt( )  && true /* Level */ && ( AV43solent == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pueden quitar repuestos.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMRCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         edtMRCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
   }

   public void load1AJ1472( )
   {
      /* Using cursor T01AJ26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1472 = (short)(1) ;
         A11054MComEntPre = T01AJ26_A11054MComEntPre[0] ;
         A9493MRNom = T01AJ26_A9493MRNom[0] ;
         n9493MRNom = T01AJ26_n9493MRNom[0] ;
         A11051MComSolCnt = T01AJ26_A11051MComSolCnt[0] ;
         A11052MComSolPre = T01AJ26_A11052MComSolPre[0] ;
         A11053MComEntCnt = T01AJ26_A11053MComEntCnt[0] ;
         zm1AJ1472( -33) ;
      }
      pr_default.close(24);
      onLoadActions1AJ1472( ) ;
   }

   public void onLoadActions1AJ1472( )
   {
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A11054MComEntPre)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A11051MComSolCnt)==0) )
      {
         A11054MComEntPre = A11052MComSolPre ;
      }
   }

   public void checkExtendedTable1AJ1472( )
   {
      nIsDirty_1472 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1AJ1472( ) ;
      /* Using cursor T01AJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MRCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9493MRNom = T01AJ4_A9493MRNom[0] ;
      n9493MRNom = T01AJ4_n9493MRNom[0] ;
      pr_default.close(2);
      if ( ( A9492MRCod > 0 ) && true /* After */ && true /* Level */ && isIns( )  && ( AV43solent == 0 ) )
      {
         GXCCtl = "MRCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pueden agregar repuestos.", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A11054MComEntPre)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A11051MComSolCnt)==0) )
      {
         nIsDirty_1472 = (short)(1) ;
         A11054MComEntPre = A11052MComSolPre ;
      }
   }

   public void closeExtendedTableCursors1AJ1472( )
   {
      pr_default.close(2);
   }

   public void enableDisable1AJ1472( )
   {
   }

   public void gxload_34( String A396EmprCod ,
                          int A9492MRCod )
   {
      /* Using cursor T01AJ27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         GXCCtl = "MRCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9493MRNom = T01AJ27_A9493MRNom[0] ;
      n9493MRNom = T01AJ27_n9493MRNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9493MRNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKey1AJ1472( )
   {
      /* Using cursor T01AJ28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1472 = (short)(1) ;
      }
      else
      {
         RcdFound1472 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey1AJ1472( )
   {
      /* Using cursor T01AJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1AJ1472( 33) ;
         RcdFound1472 = (short)(1) ;
         initializeNonKey1AJ1472( ) ;
         A11054MComEntPre = T01AJ3_A11054MComEntPre[0] ;
         A11051MComSolCnt = T01AJ3_A11051MComSolCnt[0] ;
         A11052MComSolPre = T01AJ3_A11052MComSolPre[0] ;
         A11053MComEntCnt = T01AJ3_A11053MComEntCnt[0] ;
         A9492MRCod = T01AJ3_A9492MRCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11055MComCod = A11055MComCod ;
         Z9492MRCod = A9492MRCod ;
         sMode1472 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1AJ1472( ) ;
         Gx_mode = sMode1472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1472 = (short)(0) ;
         initializeNonKey1AJ1472( ) ;
         sMode1472 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AJ1472( ) ;
         Gx_mode = sMode1472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AJ1472( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AJ1472( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11054MComEntPre, T01AJ2_A11054MComEntPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z11051MComSolCnt, T01AJ2_A11051MComSolCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z11052MComSolPre, T01AJ2_A11052MComSolPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z11053MComEntCnt, T01AJ2_A11053MComEntCnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11054MComEntPre, T01AJ2_A11054MComEntPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComEntPre");
               GXutil.writeLogRaw("Old: ",Z11054MComEntPre);
               GXutil.writeLogRaw("Current: ",T01AJ2_A11054MComEntPre[0]);
            }
            if ( DecimalUtil.compareTo(Z11051MComSolCnt, T01AJ2_A11051MComSolCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComSolCnt");
               GXutil.writeLogRaw("Old: ",Z11051MComSolCnt);
               GXutil.writeLogRaw("Current: ",T01AJ2_A11051MComSolCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z11052MComSolPre, T01AJ2_A11052MComSolPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComSolPre");
               GXutil.writeLogRaw("Old: ",Z11052MComSolPre);
               GXutil.writeLogRaw("Current: ",T01AJ2_A11052MComSolPre[0]);
            }
            if ( DecimalUtil.compareTo(Z11053MComEntCnt, T01AJ2_A11053MComEntCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmcoment:[seudo value changed for attri]"+"MComEntCnt");
               GXutil.writeLogRaw("Old: ",Z11053MComEntCnt);
               GXutil.writeLogRaw("Current: ",T01AJ2_A11053MComEntCnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRepC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AJ1472( )
   {
      beforeValidate1AJ1472( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AJ1472( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AJ1472( 0) ;
         checkOptimisticConcurrency1AJ1472( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AJ1472( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AJ1472( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AJ29 */
                  pr_default.execute(27, new Object[] {Long.valueOf(A11055MComCod), A11054MComEntPre, A11051MComSolCnt, A11052MComSolPre, A11053MComEntCnt, A396EmprCod, Integer.valueOf(A9492MRCod)});
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
            load1AJ1472( ) ;
         }
         endLevel1AJ1472( ) ;
      }
      closeExtendedTableCursors1AJ1472( ) ;
   }

   public void update1AJ1472( )
   {
      beforeValidate1AJ1472( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AJ1472( ) ;
      }
      if ( ( nIsMod_1472 != 0 ) || ( nIsDirty_1472 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AJ1472( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AJ1472( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AJ1472( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AJ30 */
                     pr_default.execute(28, new Object[] {A11054MComEntPre, A11051MComSolCnt, A11052MComSolPre, A11053MComEntCnt, A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepC1");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepC1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AJ1472( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AJ1472( ) ;
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
            endLevel1AJ1472( ) ;
         }
      }
      closeExtendedTableCursors1AJ1472( ) ;
   }

   public void deferredUpdate1AJ1472( )
   {
   }

   public void delete1AJ1472( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AJ1472( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AJ1472( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AJ1472( ) ;
         afterConfirm1AJ1472( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AJ1472( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AJ31 */
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
      endLevel1AJ1472( ) ;
      Gx_mode = sMode1472 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AJ1472( )
   {
      standaloneModal1AJ1472( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( A9492MRCod > 0 ) && true /* After */ && true /* Level */ && isIns( )  && ( AV43solent == 0 ) )
         {
            GXCCtl = "MRCOD_" + sGXsfl_59_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pueden agregar repuestos.", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01AJ32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         A9493MRNom = T01AJ32_A9493MRNom[0] ;
         n9493MRNom = T01AJ32_n9493MRNom[0] ;
         pr_default.close(30);
      }
   }

   public void endLevel1AJ1472( )
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

   public void scanStart1AJ1472( )
   {
      /* Scan By routine */
      /* Using cursor T01AJ33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      RcdFound1472 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1472 = (short)(1) ;
         A9492MRCod = T01AJ33_A9492MRCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AJ1472( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1472 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1472 = (short)(1) ;
         A9492MRCod = T01AJ33_A9492MRCod[0] ;
      }
   }

   public void scanEnd1AJ1472( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1AJ1472( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AJ1472( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AJ1472( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AJ1472( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AJ1472( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AJ1472( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AJ1472( )
   {
      edtMRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtMComSolCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolCnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtMComSolPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtMComEntCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtMComEntPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void send_integrity_lvl_hashes1AJ1472( )
   {
   }

   public void send_integrity_lvl_hashes1AJ1471( )
   {
   }

   public void subsflControlProps_591472( )
   {
      edtMRCod_Internalname = "MRCOD_"+sGXsfl_59_idx ;
      edtMComSolCnt_Internalname = "MCOMSOLCNT_"+sGXsfl_59_idx ;
      edtMComSolPre_Internalname = "MCOMSOLPRE_"+sGXsfl_59_idx ;
      edtMComEntCnt_Internalname = "MCOMENTCNT_"+sGXsfl_59_idx ;
      edtMComEntPre_Internalname = "MCOMENTPRE_"+sGXsfl_59_idx ;
   }

   public void subsflControlProps_fel_591472( )
   {
      edtMRCod_Internalname = "MRCOD_"+sGXsfl_59_fel_idx ;
      edtMComSolCnt_Internalname = "MCOMSOLCNT_"+sGXsfl_59_fel_idx ;
      edtMComSolPre_Internalname = "MCOMSOLPRE_"+sGXsfl_59_fel_idx ;
      edtMComEntCnt_Internalname = "MCOMENTCNT_"+sGXsfl_59_fel_idx ;
      edtMComEntPre_Internalname = "MCOMENTPRE_"+sGXsfl_59_fel_idx ;
   }

   public void addRow1AJ1472( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591472( ) ;
      sendRow1AJ1472( ) ;
   }

   public void sendRow1AJ1472( )
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
         if ( ((int)((nGXsfl_59_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1472_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtMRCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComSolCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMComSolCnt_Enabled!=0) ? localUtil.format( A11051MComSolCnt, "ZZZZZ9.99") : localUtil.format( A11051MComSolCnt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComSolCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtMComSolCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComSolPre_Internalname,GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMComSolPre_Enabled!=0) ? localUtil.format( A11052MComSolPre, "ZZZZZZZ9.999") : localUtil.format( A11052MComSolPre, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComSolPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtMComSolPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1472_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComEntCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMComEntCnt_Enabled!=0) ? localUtil.format( A11053MComEntCnt, "ZZZZZ9.99") : localUtil.format( A11053MComEntCnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComEntCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtMComEntCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1472_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_repRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComEntPre_Internalname,GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMComEntPre_Enabled!=0) ? localUtil.format( A11054MComEntPre, "ZZZZZZZ9.999") : localUtil.format( A11054MComEntPre, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComEntPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtMComEntPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_repRow);
      send_integrity_lvl_hashes1AJ1472( ) ;
      GXCCtl = "Z9492MRCod_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11054MComEntPre_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11051MComSolCnt_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11052MComSolPre_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11053MComEntCnt_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1472_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1472_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1472_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1472, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N9492MRCod_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_59_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV35TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV35TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vMCOMCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRCOD_"+sGXsfl_59_idx+"Horizontalalignment", GXutil.rtrim( edtMRCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMSOLCNT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMSOLPRE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComSolPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMENTCNT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMENTPRE_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_repContainer.AddRow(Gridlevel_repRow);
   }

   public void readRow1AJ1472( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591472( ) ;
      edtMRCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRCod_Horizontalalignment = httpContext.cgiGet( "MRCOD_"+sGXsfl_59_idx+"Horizontalalignment") ;
      edtMComSolCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMSOLCNT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMComSolPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMSOLPRE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMComEntCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTCNT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMComEntPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MCOMENTPRE_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "MRCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
         wbErr = true ;
         A9492MRCod = 0 ;
      }
      else
      {
         A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11051MComSolCnt = localUtil.ctond( httpContext.cgiGet( edtMComSolCnt_Internalname)) ;
      A11052MComSolPre = localUtil.ctond( httpContext.cgiGet( edtMComSolPre_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MCOMENTCNT_" + sGXsfl_59_idx ;
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
         GXCCtl = "MCOMENTPRE_" + sGXsfl_59_idx ;
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
      GXCCtl = "Z9492MRCod_" + sGXsfl_59_idx ;
      Z9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11054MComEntPre_" + sGXsfl_59_idx ;
      Z11054MComEntPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11051MComSolCnt_" + sGXsfl_59_idx ;
      Z11051MComSolCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11052MComSolPre_" + sGXsfl_59_idx ;
      Z11052MComSolPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11053MComEntCnt_" + sGXsfl_59_idx ;
      Z11053MComEntCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1472_" + sGXsfl_59_idx ;
      nRcdDeleted_1472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1472_" + sGXsfl_59_idx ;
      nRcdExists_1472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1472_" + sGXsfl_59_idx ;
      nIsMod_1472 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N9492MRCod_" + sGXsfl_59_idx ;
      N9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMComSolPre_Enabled = edtMComSolPre_Enabled ;
      defedtMComSolCnt_Enabled = edtMComSolCnt_Enabled ;
      defedtMRCod_Enabled = edtMRCod_Enabled ;
      defedtMRCod_Enabled = edtMRCod_Enabled ;
   }

   public void confirmValues1AJ0( )
   {
      nGXsfl_59_idx = 0 ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591472( ) ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_591472( ) ;
         httpContext.changePostValue( "Z9492MRCod_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z9492MRCod_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9492MRCod_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z11054MComEntPre_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z11054MComEntPre_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11054MComEntPre_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z11051MComSolCnt_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z11051MComSolCnt_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11051MComSolCnt_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z11052MComSolPre_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z11052MComSolPre_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11052MComSolPre_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z11053MComEntCnt_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z11053MComEntCnt_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11053MComEntCnt_"+sGXsfl_59_idx) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmcoment", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33MComCod,10,0))}, new String[] {"Gx_mode","EmprCod","MComCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMComEnt");
      forbiddenHiddens.add("MComFch", localUtil.format(A11046MComFch, "99/99/99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV44Pgmname, "")));
      forbiddenHiddens.add("MComExt", GXutil.rtrim( localUtil.format( A11045MComExt, "")));
      forbiddenHiddens.add("MComSolFch", localUtil.format(A11047MComSolFch, "99/99/99"));
      forbiddenHiddens.add("MComEst", GXutil.rtrim( localUtil.format( A11049MComEst, "")));
      forbiddenHiddens.add("MComOri", GXutil.rtrim( localUtil.format( A11050MComOri, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmcoment:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11055MComCod", GXutil.ltrim( localUtil.ntoc( Z11055MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11048MComEntFch", localUtil.dtoc( Z11048MComEntFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11045MComExt", GXutil.rtrim( Z11045MComExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11046MComFch", localUtil.dtoc( Z11046MComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11047MComSolFch", localUtil.dtoc( Z11047MComSolFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11049MComEst", GXutil.rtrim( Z11049MComEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11050MComOri", GXutil.rtrim( Z11050MComOri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nGXsfl_59_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV42DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV42DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMRCOD_DATA", AV40MRCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMRCOD_DATA", AV40MRCod_Data);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMCOMCOD", GXutil.ltrim( localUtil.ntoc( AV33MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33MComCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRVNUM", GXutil.ltrim( localUtil.ntoc( AV37Insert_PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSOLENT", GXutil.ltrim( localUtil.ntoc( AV43solent, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRNOM", GXutil.rtrim( A9493MRNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOD_Objectcall", GXutil.rtrim( Combo_mrcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOD_Cls", GXutil.rtrim( Combo_mrcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOD_Enabled", GXutil.booltostr( Combo_mrcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_mrcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOD_Isgriditem", GXutil.booltostr( Combo_mrcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOD_Emptyitem", GXutil.booltostr( Combo_mrcod_Emptyitem));
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
      return formatLink("app.mantenimientomaquina.tmcoment", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33MComCod,10,0))}, new String[] {"Gx_mode","EmprCod","MComCod"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMComEnt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entradas de Repuestos", "") ;
   }

   public void initializeNonKey1AJ1471( )
   {
      h795PrvNum = "" ;
      A11048MComEntFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
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
      A11049MComEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
      A11050MComOri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
      Z11048MComEntFch = GXutil.nullDate() ;
      Z11045MComExt = "" ;
      Z11046MComFch = GXutil.nullDate() ;
      Z11047MComSolFch = GXutil.nullDate() ;
      Z11049MComEst = "" ;
      Z11050MComOri = "" ;
      Z795PrvNum = 0 ;
   }

   public void initAll1AJ1471( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11055MComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      initializeNonKey1AJ1471( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AJ1472( )
   {
      A11054MComEntPre = DecimalUtil.ZERO ;
      A9493MRNom = "" ;
      n9493MRNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      Z11054MComEntPre = DecimalUtil.ZERO ;
      Z11051MComSolCnt = DecimalUtil.ZERO ;
      Z11052MComSolPre = DecimalUtil.ZERO ;
      Z11053MComEntCnt = DecimalUtil.ZERO ;
   }

   public void initAll1AJ1472( )
   {
      A9492MRCod = 0 ;
      initializeNonKey1AJ1472( ) ;
   }

   public void standaloneModalInsert1AJ1472( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211662123", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmcoment.js", "?20268211662123", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1472( )
   {
      edtMComSolPre_Enabled = defedtMComSolPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolPre_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtMComSolCnt_Enabled = defedtMComSolCnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolCnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtMRCod_Enabled = defedtMRCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtMRCod_Enabled = defedtMRCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void startgridcontrol59( )
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
      Gridlevel_repColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtMRCod_Horizontalalignment));
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
      Gridlevel_repContainer.AddColumnProperties(Gridlevel_repColumn);
      Gridlevel_repColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_repColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_repColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMComEntPre_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMComFch_Internalname = "MCOMFCH" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtMComSolFch_Internalname = "MCOMSOLFCH" ;
      edtMComEntFch_Internalname = "MCOMENTFCH" ;
      cmbMComEst.setInternalname( "MCOMEST" );
      cmbMComOri.setInternalname( "MCOMORI" );
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMRCod_Internalname = "MRCOD" ;
      edtMComSolCnt_Internalname = "MCOMSOLCNT" ;
      edtMComSolPre_Internalname = "MCOMSOLPRE" ;
      edtMComEntCnt_Internalname = "MCOMENTCNT" ;
      edtMComEntPre_Internalname = "MCOMENTPRE" ;
      divTableleaflevel_rep_Internalname = "TABLELEAFLEVEL_REP" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      bttBtninsertline_Internalname = "BTNINSERTLINE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_mrcod_Internalname = "COMBO_MRCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
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
      subGridlevel_rep_Header = "" ;
      Combo_mrcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Entradas de Repuestos", "") );
      edtMComEntPre_Jsonclick = "" ;
      edtMComEntCnt_Jsonclick = "" ;
      edtMComSolPre_Jsonclick = "" ;
      edtMComSolCnt_Jsonclick = "" ;
      edtMRCod_Jsonclick = "" ;
      subGridlevel_rep_Class = "GridNoBorder WorkWith" ;
      subGridlevel_rep_Backcolorstyle = (byte)(0) ;
      Combo_mrcod_Titlecontrolidtoreplace = "" ;
      subGridlevel_rep_Allowselection = (byte)(0) ;
      edtMComEntPre_Enabled = 1 ;
      edtMComEntCnt_Enabled = 1 ;
      edtMComSolPre_Enabled = 0 ;
      edtMComSolCnt_Enabled = 0 ;
      edtMRCod_Enabled = 1 ;
      subGridlevel_rep_Rows = 0 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNom_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      Combo_mrcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_mrcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_mrcod_Cls = "ExtendedCombo" ;
      Combo_mrcod_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtninsertline_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      cmbMComOri.setJsonclick( "" );
      cmbMComOri.setEnabled( 0 );
      cmbMComEst.setJsonclick( "" );
      cmbMComEst.setEnabled( 0 );
      edtMComEntFch_Jsonclick = "" ;
      edtMComEntFch_Enabled = 1 ;
      edtMComSolFch_Jsonclick = "" ;
      edtMComSolFch_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 1 ;
      edtMComFch_Jsonclick = "" ;
      edtMComFch_Enabled = 0 ;
      edtMComExt_Jsonclick = "" ;
      edtMComExt_Enabled = 0 ;
      edtMComCod_Jsonclick = "" ;
      edtMComCod_Enabled = 1 ;
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
      edtMRCod_Horizontalalignment = "right" ;
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

   public void gxsgaprvnum1AJ0( String A396EmprCod ,
                                String A13719PrvNNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaprvnum_data1AJ0( A396EmprCod, A13719PrvNNom) ;
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

   protected void gxsgaprvnum_data1AJ0( String A396EmprCod ,
                                        String A13719PrvNNom )
   {
      l13719PrvNNom = GXutil.concat( GXutil.rtrim( A13719PrvNNom), "%", "") ;
      /* Using cursor T01AJ34 */
      pr_default.execute(32, new Object[] {A396EmprCod, l13719PrvNNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(32) != 101) )
      {
         gxdynajaxctrlcodr.add(T01AJ34_A13719PrvNNom[0]);
         gxdynajaxctrldescr.add(T01AJ34_A13719PrvNNom[0]);
         pr_default.readNext(32);
      }
      pr_default.close(32);
   }

   public void gxhcaprvnum1AJ1471( String A396EmprCod ,
                                   String A13719PrvNNom )
   {
      /* Using cursor T01AJ35 */
      pr_default.execute(33, new Object[] {A13719PrvNNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(33) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13719PrvNNom = T01AJ35_A13719PrvNNom[0] ;
         A396EmprCod = T01AJ35_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T01AJ35_A795PrvNum[0] ;
         n795PrvNum = T01AJ35_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         pr_default.readNext(33);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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

   public void gxnrgridlevel_rep_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_591472( ) ;
      while ( nGXsfl_59_idx <= nRC_GXsfl_59 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AJ1472( ) ;
         standaloneModal1AJ1472( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AJ1472( ) ;
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_591472( ) ;
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
         A11049MComEst = cmbMComEst.getValidValue(A11049MComEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11049MComEst", A11049MComEst);
      }
      cmbMComOri.setName( "MCOMORI" );
      cmbMComOri.setWebtags( "" );
      cmbMComOri.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbMComOri.addItem("A", httpContext.getMessage( "Automático", ""), (short)(0));
      if ( cmbMComOri.getItemCount() > 0 )
      {
         A11050MComOri = cmbMComOri.getValidValue(A11050MComOri) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11050MComOri", A11050MComOri);
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
      /* Using cursor T01AJ36 */
      pr_default.execute(34, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01AJ36_A407EmprNom[0] ;
      n407EmprNom = T01AJ36_n407EmprNom[0] ;
      pr_default.close(34);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Prvnum( )
   {
      n795PrvNum = false ;
      n794PrvNom = false ;
      if ( (GXutil.strcmp("", h795PrvNum)==0) )
      {
         A795PrvNum = 0 ;
         n795PrvNum = false ;
      }
      else
      {
         A13719PrvNNom = h795PrvNum ;
         /* Using cursor T01AJ37 */
         pr_default.execute(35, new Object[] {A13719PrvNNom, A396EmprCod});
         A396EmprCod = T01AJ37_A396EmprCod[0] ;
         A795PrvNum = T01AJ37_A795PrvNum[0] ;
         n795PrvNum = T01AJ37_n795PrvNum[0] ;
         A795PrvNum = T01AJ37_A795PrvNum[0] ;
         n795PrvNum = T01AJ37_n795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(35) == 101) ) )
         {
            pr_default.readNext(35);
            if ( ! ( (pr_default.getStatus(35) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "PRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvNum_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(35);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h795PrvNum", h795PrvNum);
      /* Using cursor T01AJ38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(36) == 101) )
      {
         if ( ! ( (0==A795PrvNum) && (GXutil.strcmp("", A13719PrvNNom)==0) || (0==A795PrvNum) && n795PrvNum || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A794PrvNom = T01AJ38_A794PrvNom[0] ;
      n794PrvNom = T01AJ38_n794PrvNom[0] ;
      pr_default.close(36);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "h795PrvNum", h795PrvNum);
   }

   public void valid_Mcomentfch( )
   {
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A11048MComEntFch)) )
      {
         A11048MComEntFch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11048MComEntFch", localUtil.format(A11048MComEntFch, "99/99/99"));
   }

   public void valid_Mrcod( )
   {
      n9493MRNom = false ;
      /* Using cursor T01AJ32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
      }
      A9493MRNom = T01AJ32_A9493MRNom[0] ;
      n9493MRNom = T01AJ32_n9493MRNom[0] ;
      pr_default.close(30);
      if ( ( A9492MRCod > 0 ) && true /* After */ && true /* Level */ && isIns( )  && ( AV43solent == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pueden agregar repuestos.", ""), 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", GXutil.rtrim( A9493MRNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33MComCod',fld:'vMCOMCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33MComCod',fld:'vMCOMCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A11046MComFch',fld:'MCOMFCH',pic:''},{av:'AV44Pgmname',fld:'vPGMNAME',pic:''},{av:'A11045MComExt',fld:'MCOMEXT',pic:''},{av:'A11047MComSolFch',fld:'MCOMSOLFCH',pic:''},{av:'cmbMComEst'},{av:'A11049MComEst',fld:'MCOMEST',pic:''},{av:'cmbMComOri'},{av:'A11050MComOri',fld:'MCOMORI',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131AJ2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOINSERTLINE'","{handler:'e111AJ1471',iparms:[]");
      setEventMetadata("'DOINSERTLINE'",",oparms:[]}");
      setEventMetadata("'DOBTNINSERTLINE'","{handler:'e141AJ2',iparms:[]");
      setEventMetadata("'DOBTNINSERTLINE'",",oparms:[]}");
      setEventMetadata("VALID_MCOMCOD","{handler:'valid_Mcomcod',iparms:[]");
      setEventMetadata("VALID_MCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'h795PrvNum'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A794PrvNom',fld:'PRVNOM',pic:''}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'h795PrvNum'}]}");
      setEventMetadata("VALID_MCOMENTFCH","{handler:'valid_Mcomentfch',iparms:[{av:'A11048MComEntFch',fld:'MCOMENTFCH',pic:''}]");
      setEventMetadata("VALID_MCOMENTFCH",",oparms:[{av:'A11048MComEntFch',fld:'MCOMENTFCH',pic:''}]}");
      setEventMetadata("VALID_MCOMEST","{handler:'valid_Mcomest',iparms:[]");
      setEventMetadata("VALID_MCOMEST",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_MRCOD","{handler:'valid_Mrcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A9493MRNom',fld:'MRNOM',pic:''}]");
      setEventMetadata("VALID_MRCOD",",oparms:[{av:'A9493MRNom',fld:'MRNOM',pic:''}]}");
      setEventMetadata("VALID_MCOMSOLCNT","{handler:'valid_Mcomsolcnt',iparms:[]");
      setEventMetadata("VALID_MCOMSOLCNT",",oparms:[]}");
      setEventMetadata("VALID_MCOMSOLPRE","{handler:'valid_Mcomsolpre',iparms:[]");
      setEventMetadata("VALID_MCOMSOLPRE",",oparms:[]}");
      setEventMetadata("VALID_MCOMENTPRE","{handler:'valid_Mcomentpre',iparms:[]");
      setEventMetadata("VALID_MCOMENTPRE",",oparms:[]}");
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
      pr_default.close(30);
      pr_default.close(34);
      pr_default.close(21);
      pr_default.close(36);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      Z396EmprCod = "" ;
      Z11048MComEntFch = GXutil.nullDate() ;
      Z11045MComExt = "" ;
      Z11046MComFch = GXutil.nullDate() ;
      Z11047MComSolFch = GXutil.nullDate() ;
      Z11049MComEst = "" ;
      Z11050MComOri = "" ;
      Z11054MComEntPre = DecimalUtil.ZERO ;
      Z11051MComSolCnt = DecimalUtil.ZERO ;
      Z11052MComSolPre = DecimalUtil.ZERO ;
      Z11053MComEntCnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13719PrvNNom = "" ;
      h795PrvNum = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
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
      A11046MComFch = GXutil.nullDate() ;
      A11047MComSolFch = GXutil.nullDate() ;
      A11048MComEntFch = GXutil.nullDate() ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      bttBtninsertline_Jsonclick = "" ;
      AV44Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_mrcod = new com.genexus.webpanels.GXUserControl();
      AV42DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV40MRCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A407EmprNom = "" ;
      A794PrvNom = "" ;
      Gridlevel_repContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1472 = "" ;
      sStyleString = "" ;
      A9493MRNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_mrcod_Objectcall = "" ;
      Combo_mrcod_Class = "" ;
      Combo_mrcod_Icontype = "" ;
      Combo_mrcod_Icon = "" ;
      Combo_mrcod_Tooltip = "" ;
      Combo_mrcod_Selectedvalue_set = "" ;
      Combo_mrcod_Selectedvalue_get = "" ;
      Combo_mrcod_Selectedtext_set = "" ;
      Combo_mrcod_Selectedtext_get = "" ;
      Combo_mrcod_Gamoauthtoken = "" ;
      Combo_mrcod_Ddointernalname = "" ;
      Combo_mrcod_Titlecontrolalign = "" ;
      Combo_mrcod_Dropdownoptionstype = "" ;
      Combo_mrcod_Datalisttype = "" ;
      Combo_mrcod_Datalistfixedvalues = "" ;
      Combo_mrcod_Datalistproc = "" ;
      Combo_mrcod_Datalistprocparametersprefix = "" ;
      Combo_mrcod_Remoteservicesparameters = "" ;
      Combo_mrcod_Htmltemplate = "" ;
      Combo_mrcod_Multiplevaluestype = "" ;
      Combo_mrcod_Loadingdata = "" ;
      Combo_mrcod_Noresultsfound = "" ;
      Combo_mrcod_Emptyitemtext = "" ;
      Combo_mrcod_Onlyselectedvalues = "" ;
      Combo_mrcod_Selectalltext = "" ;
      Combo_mrcod_Multiplevaluesseparator = "" ;
      Combo_mrcod_Addnewoptiontext = "" ;
      GXCCtl = "" ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      A11054MComEntPre = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1471 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      AV38TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_int9 = new byte[1] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV41ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z794PrvNom = "" ;
      T01AJ9_A13719PrvNNom = new String[] {""} ;
      T01AJ9_A396EmprCod = new String[] {""} ;
      T01AJ9_A795PrvNum = new int[1] ;
      T01AJ9_n795PrvNum = new boolean[] {false} ;
      T01AJ7_A407EmprNom = new String[] {""} ;
      T01AJ7_n407EmprNom = new boolean[] {false} ;
      T01AJ8_A794PrvNom = new String[] {""} ;
      T01AJ8_n794PrvNom = new boolean[] {false} ;
      T01AJ10_A11055MComCod = new long[1] ;
      T01AJ10_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AJ10_A407EmprNom = new String[] {""} ;
      T01AJ10_n407EmprNom = new boolean[] {false} ;
      T01AJ10_A11045MComExt = new String[] {""} ;
      T01AJ10_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AJ10_A794PrvNom = new String[] {""} ;
      T01AJ10_n794PrvNom = new boolean[] {false} ;
      T01AJ10_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AJ10_A11049MComEst = new String[] {""} ;
      T01AJ10_A11050MComOri = new String[] {""} ;
      T01AJ10_A396EmprCod = new String[] {""} ;
      T01AJ10_A795PrvNum = new int[1] ;
      T01AJ10_n795PrvNum = new boolean[] {false} ;
      T01AJ11_A13719PrvNNom = new String[] {""} ;
      T01AJ11_A396EmprCod = new String[] {""} ;
      T01AJ11_A795PrvNum = new int[1] ;
      T01AJ11_n795PrvNum = new boolean[] {false} ;
      T01AJ12_A13719PrvNNom = new String[] {""} ;
      T01AJ12_A396EmprCod = new String[] {""} ;
      T01AJ12_A795PrvNum = new int[1] ;
      T01AJ12_n795PrvNum = new boolean[] {false} ;
      T01AJ13_A13719PrvNNom = new String[] {""} ;
      T01AJ13_A396EmprCod = new String[] {""} ;
      T01AJ13_A795PrvNum = new int[1] ;
      T01AJ13_n795PrvNum = new boolean[] {false} ;
      T01AJ14_A407EmprNom = new String[] {""} ;
      T01AJ14_n407EmprNom = new boolean[] {false} ;
      T01AJ15_A794PrvNom = new String[] {""} ;
      T01AJ15_n794PrvNom = new boolean[] {false} ;
      T01AJ16_A396EmprCod = new String[] {""} ;
      T01AJ16_A11055MComCod = new long[1] ;
      T01AJ6_A11055MComCod = new long[1] ;
      T01AJ6_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AJ6_A11045MComExt = new String[] {""} ;
      T01AJ6_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AJ6_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AJ6_A11049MComEst = new String[] {""} ;
      T01AJ6_A11050MComOri = new String[] {""} ;
      T01AJ6_A396EmprCod = new String[] {""} ;
      T01AJ6_A795PrvNum = new int[1] ;
      T01AJ6_n795PrvNum = new boolean[] {false} ;
      T01AJ17_A396EmprCod = new String[] {""} ;
      T01AJ17_A11055MComCod = new long[1] ;
      T01AJ18_A396EmprCod = new String[] {""} ;
      T01AJ18_A11055MComCod = new long[1] ;
      T01AJ19_A13719PrvNNom = new String[] {""} ;
      T01AJ19_A396EmprCod = new String[] {""} ;
      T01AJ19_A795PrvNum = new int[1] ;
      T01AJ19_n795PrvNum = new boolean[] {false} ;
      T01AJ5_A11055MComCod = new long[1] ;
      T01AJ5_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AJ5_A11045MComExt = new String[] {""} ;
      T01AJ5_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AJ5_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01AJ5_A11049MComEst = new String[] {""} ;
      T01AJ5_A11050MComOri = new String[] {""} ;
      T01AJ5_A396EmprCod = new String[] {""} ;
      T01AJ5_A795PrvNum = new int[1] ;
      T01AJ5_n795PrvNum = new boolean[] {false} ;
      T01AJ23_A407EmprNom = new String[] {""} ;
      T01AJ23_n407EmprNom = new boolean[] {false} ;
      T01AJ24_A794PrvNom = new String[] {""} ;
      T01AJ24_n794PrvNom = new boolean[] {false} ;
      T01AJ25_A396EmprCod = new String[] {""} ;
      T01AJ25_A11055MComCod = new long[1] ;
      Z9493MRNom = "" ;
      T01AJ26_A11055MComCod = new long[1] ;
      T01AJ26_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ26_A9493MRNom = new String[] {""} ;
      T01AJ26_n9493MRNom = new boolean[] {false} ;
      T01AJ26_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ26_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ26_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ26_A396EmprCod = new String[] {""} ;
      T01AJ26_A9492MRCod = new int[1] ;
      T01AJ4_A9493MRNom = new String[] {""} ;
      T01AJ4_n9493MRNom = new boolean[] {false} ;
      T01AJ27_A9493MRNom = new String[] {""} ;
      T01AJ27_n9493MRNom = new boolean[] {false} ;
      T01AJ28_A396EmprCod = new String[] {""} ;
      T01AJ28_A11055MComCod = new long[1] ;
      T01AJ28_A9492MRCod = new int[1] ;
      T01AJ3_A11055MComCod = new long[1] ;
      T01AJ3_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ3_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ3_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ3_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ3_A396EmprCod = new String[] {""} ;
      T01AJ3_A9492MRCod = new int[1] ;
      T01AJ2_A11055MComCod = new long[1] ;
      T01AJ2_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ2_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ2_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ2_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AJ2_A396EmprCod = new String[] {""} ;
      T01AJ2_A9492MRCod = new int[1] ;
      T01AJ32_A9493MRNom = new String[] {""} ;
      T01AJ32_n9493MRNom = new boolean[] {false} ;
      T01AJ33_A396EmprCod = new String[] {""} ;
      T01AJ33_A11055MComCod = new long[1] ;
      T01AJ33_A9492MRCod = new int[1] ;
      Gridlevel_repRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_rep_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_repColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13719PrvNNom = "" ;
      T01AJ34_A13719PrvNNom = new String[] {""} ;
      T01AJ35_A13719PrvNNom = new String[] {""} ;
      T01AJ35_A396EmprCod = new String[] {""} ;
      T01AJ35_A795PrvNum = new int[1] ;
      T01AJ35_n795PrvNum = new boolean[] {false} ;
      T01AJ36_A407EmprNom = new String[] {""} ;
      T01AJ36_n407EmprNom = new boolean[] {false} ;
      T01AJ37_A13719PrvNNom = new String[] {""} ;
      T01AJ37_A396EmprCod = new String[] {""} ;
      T01AJ37_A795PrvNum = new int[1] ;
      T01AJ37_n795PrvNum = new boolean[] {false} ;
      T01AJ38_A794PrvNom = new String[] {""} ;
      T01AJ38_n794PrvNom = new boolean[] {false} ;
      Zh795PrvNum = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcoment__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcoment__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcoment__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcoment__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcoment__default(),
         new Object[] {
             new Object[] {
            T01AJ2_A11055MComCod, T01AJ2_A11054MComEntPre, T01AJ2_A11051MComSolCnt, T01AJ2_A11052MComSolPre, T01AJ2_A11053MComEntCnt, T01AJ2_A396EmprCod, T01AJ2_A9492MRCod
            }
            , new Object[] {
            T01AJ3_A11055MComCod, T01AJ3_A11054MComEntPre, T01AJ3_A11051MComSolCnt, T01AJ3_A11052MComSolPre, T01AJ3_A11053MComEntCnt, T01AJ3_A396EmprCod, T01AJ3_A9492MRCod
            }
            , new Object[] {
            T01AJ4_A9493MRNom, T01AJ4_n9493MRNom
            }
            , new Object[] {
            T01AJ5_A11055MComCod, T01AJ5_A11048MComEntFch, T01AJ5_A11045MComExt, T01AJ5_A11046MComFch, T01AJ5_A11047MComSolFch, T01AJ5_A11049MComEst, T01AJ5_A11050MComOri, T01AJ5_A396EmprCod, T01AJ5_A795PrvNum, T01AJ5_n795PrvNum
            }
            , new Object[] {
            T01AJ6_A11055MComCod, T01AJ6_A11048MComEntFch, T01AJ6_A11045MComExt, T01AJ6_A11046MComFch, T01AJ6_A11047MComSolFch, T01AJ6_A11049MComEst, T01AJ6_A11050MComOri, T01AJ6_A396EmprCod, T01AJ6_A795PrvNum, T01AJ6_n795PrvNum
            }
            , new Object[] {
            T01AJ7_A407EmprNom, T01AJ7_n407EmprNom
            }
            , new Object[] {
            T01AJ8_A794PrvNom, T01AJ8_n794PrvNom
            }
            , new Object[] {
            T01AJ9_A13719PrvNNom, T01AJ9_A396EmprCod, T01AJ9_A795PrvNum
            }
            , new Object[] {
            T01AJ10_A11055MComCod, T01AJ10_A11048MComEntFch, T01AJ10_A407EmprNom, T01AJ10_n407EmprNom, T01AJ10_A11045MComExt, T01AJ10_A11046MComFch, T01AJ10_A794PrvNom, T01AJ10_n794PrvNom, T01AJ10_A11047MComSolFch, T01AJ10_A11049MComEst,
            T01AJ10_A11050MComOri, T01AJ10_A396EmprCod, T01AJ10_A795PrvNum, T01AJ10_n795PrvNum
            }
            , new Object[] {
            T01AJ11_A13719PrvNNom, T01AJ11_A396EmprCod, T01AJ11_A795PrvNum
            }
            , new Object[] {
            T01AJ12_A13719PrvNNom, T01AJ12_A396EmprCod, T01AJ12_A795PrvNum
            }
            , new Object[] {
            T01AJ13_A13719PrvNNom, T01AJ13_A396EmprCod, T01AJ13_A795PrvNum
            }
            , new Object[] {
            T01AJ14_A407EmprNom, T01AJ14_n407EmprNom
            }
            , new Object[] {
            T01AJ15_A794PrvNom, T01AJ15_n794PrvNom
            }
            , new Object[] {
            T01AJ16_A396EmprCod, T01AJ16_A11055MComCod
            }
            , new Object[] {
            T01AJ17_A396EmprCod, T01AJ17_A11055MComCod
            }
            , new Object[] {
            T01AJ18_A396EmprCod, T01AJ18_A11055MComCod
            }
            , new Object[] {
            T01AJ19_A13719PrvNNom, T01AJ19_A396EmprCod, T01AJ19_A795PrvNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AJ23_A407EmprNom, T01AJ23_n407EmprNom
            }
            , new Object[] {
            T01AJ24_A794PrvNom, T01AJ24_n794PrvNom
            }
            , new Object[] {
            T01AJ25_A396EmprCod, T01AJ25_A11055MComCod
            }
            , new Object[] {
            T01AJ26_A11055MComCod, T01AJ26_A11054MComEntPre, T01AJ26_A9493MRNom, T01AJ26_n9493MRNom, T01AJ26_A11051MComSolCnt, T01AJ26_A11052MComSolPre, T01AJ26_A11053MComEntCnt, T01AJ26_A396EmprCod, T01AJ26_A9492MRCod
            }
            , new Object[] {
            T01AJ27_A9493MRNom, T01AJ27_n9493MRNom
            }
            , new Object[] {
            T01AJ28_A396EmprCod, T01AJ28_A11055MComCod, T01AJ28_A9492MRCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AJ32_A9493MRNom, T01AJ32_n9493MRNom
            }
            , new Object[] {
            T01AJ33_A396EmprCod, T01AJ33_A11055MComCod, T01AJ33_A9492MRCod
            }
            , new Object[] {
            T01AJ34_A13719PrvNNom
            }
            , new Object[] {
            T01AJ35_A13719PrvNNom, T01AJ35_A396EmprCod, T01AJ35_A795PrvNum
            }
            , new Object[] {
            T01AJ36_A407EmprNom, T01AJ36_n407EmprNom
            }
            , new Object[] {
            T01AJ37_A13719PrvNNom, T01AJ37_A396EmprCod, T01AJ37_A795PrvNum
            }
            , new Object[] {
            T01AJ38_A794PrvNom, T01AJ38_n794PrvNom
            }
         }
      );
      AV44Pgmname = "MantenimientoMaquina.TMComEnt" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridlevel_rep_Allowselection ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private byte Gx_BScreen ;
   private byte subGridlevel_rep_Backcolorstyle ;
   private byte subGridlevel_rep_Backstyle ;
   private byte gxajaxcallmode ;
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
   private short AV43solent ;
   private short nBlankRcdCount1472 ;
   private short RcdFound1472 ;
   private short nBlankRcdUsr1472 ;
   private short RcdFound1471 ;
   private short nIsDirty_1471 ;
   private short nIsDirty_1472 ;
   private short gxhchits ;
   private int Z795PrvNum ;
   private int nRC_GXsfl_59 ;
   private int nGXsfl_59_idx=1 ;
   private int N795PrvNum ;
   private int Z9492MRCod ;
   private int N9492MRCod ;
   private int A795PrvNum ;
   private int A9492MRCod ;
   private int trnEnded ;
   private int edtMComCod_Enabled ;
   private int edtMComExt_Enabled ;
   private int edtMComFch_Enabled ;
   private int edtPrvNum_Enabled ;
   private int edtMComSolFch_Enabled ;
   private int edtMComEntFch_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int bttBtninsertline_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtPrvNom_Visible ;
   private int edtPrvNom_Enabled ;
   private int subGridlevel_rep_Rows ;
   private int edtMRCod_Enabled ;
   private int edtMComSolCnt_Enabled ;
   private int edtMComSolPre_Enabled ;
   private int edtMComEntCnt_Enabled ;
   private int edtMComEntPre_Enabled ;
   private int fRowAdded ;
   private int AV37Insert_PrvNum ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_mrcod_Datalistupdateminimumcharacters ;
   private int AV45GXV1 ;
   private int subGridlevel_rep_Selectedindex ;
   private int GX_JID ;
   private int subGridlevel_rep_Backcolor ;
   private int subGridlevel_rep_Allbackcolor ;
   private int defedtMComSolPre_Enabled ;
   private int defedtMComSolCnt_Enabled ;
   private int defedtMRCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_rep_Selectioncolor ;
   private int subGridlevel_rep_Hoveringcolor ;
   private int gxdynajaxindex ;
   private long wcpOAV33MComCod ;
   private long Z11055MComCod ;
   private long AV33MComCod ;
   private long A11055MComCod ;
   private long GRIDLEVEL_REP_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11054MComEntPre ;
   private java.math.BigDecimal Z11051MComSolCnt ;
   private java.math.BigDecimal Z11052MComSolPre ;
   private java.math.BigDecimal Z11053MComEntCnt ;
   private java.math.BigDecimal A11051MComSolCnt ;
   private java.math.BigDecimal A11052MComSolPre ;
   private java.math.BigDecimal A11053MComEntCnt ;
   private java.math.BigDecimal A11054MComEntPre ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String Z396EmprCod ;
   private String Z11045MComExt ;
   private String Z11049MComEst ;
   private String Z11050MComOri ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMComCod_Internalname ;
   private String sGXsfl_59_idx="0001" ;
   private String edtMRCod_Horizontalalignment ;
   private String edtMRCod_Internalname ;
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
   private String TempTags ;
   private String edtMComCod_Jsonclick ;
   private String edtMComExt_Internalname ;
   private String A11045MComExt ;
   private String edtMComExt_Jsonclick ;
   private String edtMComFch_Internalname ;
   private String edtMComFch_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
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
   private String bttBtninsertline_Internalname ;
   private String bttBtninsertline_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV44Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_mrcod_Caption ;
   private String Combo_mrcod_Cls ;
   private String Combo_mrcod_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String sMode1472 ;
   private String edtMComSolCnt_Internalname ;
   private String edtMComSolPre_Internalname ;
   private String edtMComEntCnt_Internalname ;
   private String edtMComEntPre_Internalname ;
   private String sStyleString ;
   private String subGridlevel_rep_Internalname ;
   private String A9493MRNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_mrcod_Objectcall ;
   private String Combo_mrcod_Class ;
   private String Combo_mrcod_Icontype ;
   private String Combo_mrcod_Icon ;
   private String Combo_mrcod_Tooltip ;
   private String Combo_mrcod_Selectedvalue_set ;
   private String Combo_mrcod_Selectedvalue_get ;
   private String Combo_mrcod_Selectedtext_set ;
   private String Combo_mrcod_Selectedtext_get ;
   private String Combo_mrcod_Gamoauthtoken ;
   private String Combo_mrcod_Ddointernalname ;
   private String Combo_mrcod_Titlecontrolalign ;
   private String Combo_mrcod_Dropdownoptionstype ;
   private String Combo_mrcod_Titlecontrolidtoreplace ;
   private String Combo_mrcod_Datalisttype ;
   private String Combo_mrcod_Datalistfixedvalues ;
   private String Combo_mrcod_Datalistproc ;
   private String Combo_mrcod_Datalistprocparametersprefix ;
   private String Combo_mrcod_Remoteservicesparameters ;
   private String Combo_mrcod_Htmltemplate ;
   private String Combo_mrcod_Multiplevaluestype ;
   private String Combo_mrcod_Loadingdata ;
   private String Combo_mrcod_Noresultsfound ;
   private String Combo_mrcod_Emptyitemtext ;
   private String Combo_mrcod_Onlyselectedvalues ;
   private String Combo_mrcod_Selectalltext ;
   private String Combo_mrcod_Multiplevaluesseparator ;
   private String Combo_mrcod_Addnewoptiontext ;
   private String GXCCtl ;
   private String hsh ;
   private String sMode1471 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String Z9493MRNom ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String subGridlevel_rep_Class ;
   private String subGridlevel_rep_Linesclass ;
   private String ROClassString ;
   private String edtMRCod_Jsonclick ;
   private String edtMComSolCnt_Jsonclick ;
   private String edtMComSolPre_Jsonclick ;
   private String edtMComEntCnt_Jsonclick ;
   private String edtMComEntPre_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_rep_Header ;
   private String gxwrpcisep ;
   private java.util.Date Z11048MComEntFch ;
   private java.util.Date Z11046MComFch ;
   private java.util.Date Z11047MComSolFch ;
   private java.util.Date A11046MComFch ;
   private java.util.Date A11047MComSolFch ;
   private java.util.Date A11048MComEntFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n795PrvNum ;
   private boolean wbErr ;
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_mrcod_Isgriditem ;
   private boolean Combo_mrcod_Emptyitem ;
   private boolean n9493MRNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_mrcod_Enabled ;
   private boolean Combo_mrcod_Visible ;
   private boolean Combo_mrcod_Allowmultipleselection ;
   private boolean Combo_mrcod_Hasdescription ;
   private boolean Combo_mrcod_Includeonlyselectedoption ;
   private boolean Combo_mrcod_Includeselectalloption ;
   private boolean Combo_mrcod_Includeaddnewoption ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13719PrvNNom ;
   private String h795PrvNum ;
   private String AV41ComboSelectedValue ;
   private String l13719PrvNNom ;
   private String Zh795PrvNum ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_repContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_repRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_repColumn ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_mrcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbMComEst ;
   private HTMLChoice cmbMComOri ;
   private IDataStoreProvider pr_default ;
   private String[] T01AJ9_A13719PrvNNom ;
   private String[] T01AJ9_A396EmprCod ;
   private int[] T01AJ9_A795PrvNum ;
   private boolean[] T01AJ9_n795PrvNum ;
   private String[] T01AJ7_A407EmprNom ;
   private boolean[] T01AJ7_n407EmprNom ;
   private String[] T01AJ8_A794PrvNom ;
   private boolean[] T01AJ8_n794PrvNom ;
   private long[] T01AJ10_A11055MComCod ;
   private java.util.Date[] T01AJ10_A11048MComEntFch ;
   private String[] T01AJ10_A407EmprNom ;
   private boolean[] T01AJ10_n407EmprNom ;
   private String[] T01AJ10_A11045MComExt ;
   private java.util.Date[] T01AJ10_A11046MComFch ;
   private String[] T01AJ10_A794PrvNom ;
   private boolean[] T01AJ10_n794PrvNom ;
   private java.util.Date[] T01AJ10_A11047MComSolFch ;
   private String[] T01AJ10_A11049MComEst ;
   private String[] T01AJ10_A11050MComOri ;
   private String[] T01AJ10_A396EmprCod ;
   private int[] T01AJ10_A795PrvNum ;
   private boolean[] T01AJ10_n795PrvNum ;
   private String[] T01AJ11_A13719PrvNNom ;
   private String[] T01AJ11_A396EmprCod ;
   private int[] T01AJ11_A795PrvNum ;
   private boolean[] T01AJ11_n795PrvNum ;
   private String[] T01AJ12_A13719PrvNNom ;
   private String[] T01AJ12_A396EmprCod ;
   private int[] T01AJ12_A795PrvNum ;
   private boolean[] T01AJ12_n795PrvNum ;
   private String[] T01AJ13_A13719PrvNNom ;
   private String[] T01AJ13_A396EmprCod ;
   private int[] T01AJ13_A795PrvNum ;
   private boolean[] T01AJ13_n795PrvNum ;
   private String[] T01AJ14_A407EmprNom ;
   private boolean[] T01AJ14_n407EmprNom ;
   private String[] T01AJ15_A794PrvNom ;
   private boolean[] T01AJ15_n794PrvNom ;
   private String[] T01AJ16_A396EmprCod ;
   private long[] T01AJ16_A11055MComCod ;
   private long[] T01AJ6_A11055MComCod ;
   private java.util.Date[] T01AJ6_A11048MComEntFch ;
   private String[] T01AJ6_A11045MComExt ;
   private java.util.Date[] T01AJ6_A11046MComFch ;
   private java.util.Date[] T01AJ6_A11047MComSolFch ;
   private String[] T01AJ6_A11049MComEst ;
   private String[] T01AJ6_A11050MComOri ;
   private String[] T01AJ6_A396EmprCod ;
   private int[] T01AJ6_A795PrvNum ;
   private boolean[] T01AJ6_n795PrvNum ;
   private String[] T01AJ17_A396EmprCod ;
   private long[] T01AJ17_A11055MComCod ;
   private String[] T01AJ18_A396EmprCod ;
   private long[] T01AJ18_A11055MComCod ;
   private String[] T01AJ19_A13719PrvNNom ;
   private String[] T01AJ19_A396EmprCod ;
   private int[] T01AJ19_A795PrvNum ;
   private boolean[] T01AJ19_n795PrvNum ;
   private long[] T01AJ5_A11055MComCod ;
   private java.util.Date[] T01AJ5_A11048MComEntFch ;
   private String[] T01AJ5_A11045MComExt ;
   private java.util.Date[] T01AJ5_A11046MComFch ;
   private java.util.Date[] T01AJ5_A11047MComSolFch ;
   private String[] T01AJ5_A11049MComEst ;
   private String[] T01AJ5_A11050MComOri ;
   private String[] T01AJ5_A396EmprCod ;
   private int[] T01AJ5_A795PrvNum ;
   private boolean[] T01AJ5_n795PrvNum ;
   private String[] T01AJ23_A407EmprNom ;
   private boolean[] T01AJ23_n407EmprNom ;
   private String[] T01AJ24_A794PrvNom ;
   private boolean[] T01AJ24_n794PrvNom ;
   private String[] T01AJ25_A396EmprCod ;
   private long[] T01AJ25_A11055MComCod ;
   private long[] T01AJ26_A11055MComCod ;
   private java.math.BigDecimal[] T01AJ26_A11054MComEntPre ;
   private String[] T01AJ26_A9493MRNom ;
   private boolean[] T01AJ26_n9493MRNom ;
   private java.math.BigDecimal[] T01AJ26_A11051MComSolCnt ;
   private java.math.BigDecimal[] T01AJ26_A11052MComSolPre ;
   private java.math.BigDecimal[] T01AJ26_A11053MComEntCnt ;
   private String[] T01AJ26_A396EmprCod ;
   private int[] T01AJ26_A9492MRCod ;
   private String[] T01AJ4_A9493MRNom ;
   private boolean[] T01AJ4_n9493MRNom ;
   private String[] T01AJ27_A9493MRNom ;
   private boolean[] T01AJ27_n9493MRNom ;
   private String[] T01AJ28_A396EmprCod ;
   private long[] T01AJ28_A11055MComCod ;
   private int[] T01AJ28_A9492MRCod ;
   private long[] T01AJ3_A11055MComCod ;
   private java.math.BigDecimal[] T01AJ3_A11054MComEntPre ;
   private java.math.BigDecimal[] T01AJ3_A11051MComSolCnt ;
   private java.math.BigDecimal[] T01AJ3_A11052MComSolPre ;
   private java.math.BigDecimal[] T01AJ3_A11053MComEntCnt ;
   private String[] T01AJ3_A396EmprCod ;
   private int[] T01AJ3_A9492MRCod ;
   private long[] T01AJ2_A11055MComCod ;
   private java.math.BigDecimal[] T01AJ2_A11054MComEntPre ;
   private java.math.BigDecimal[] T01AJ2_A11051MComSolCnt ;
   private java.math.BigDecimal[] T01AJ2_A11052MComSolPre ;
   private java.math.BigDecimal[] T01AJ2_A11053MComEntCnt ;
   private String[] T01AJ2_A396EmprCod ;
   private int[] T01AJ2_A9492MRCod ;
   private String[] T01AJ32_A9493MRNom ;
   private boolean[] T01AJ32_n9493MRNom ;
   private String[] T01AJ33_A396EmprCod ;
   private long[] T01AJ33_A11055MComCod ;
   private int[] T01AJ33_A9492MRCod ;
   private String[] T01AJ34_A13719PrvNNom ;
   private String[] T01AJ35_A13719PrvNNom ;
   private String[] T01AJ35_A396EmprCod ;
   private int[] T01AJ35_A795PrvNum ;
   private boolean[] T01AJ35_n795PrvNum ;
   private String[] T01AJ36_A407EmprNom ;
   private boolean[] T01AJ36_n407EmprNom ;
   private String[] T01AJ37_A13719PrvNNom ;
   private String[] T01AJ37_A396EmprCod ;
   private int[] T01AJ37_A795PrvNum ;
   private boolean[] T01AJ37_n795PrvNum ;
   private String[] T01AJ38_A794PrvNom ;
   private boolean[] T01AJ38_n794PrvNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40MRCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV38TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV42DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tmcoment__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmcoment__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmcoment__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmcoment__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmcoment__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AJ2", "SELECT MComCod, MComEntPre, MComSolCnt, MComSolPre, MComEntCnt, EmprCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? AND MComCod = ? AND MRCod = ?  FOR UPDATE OF MComEntPre, MComSolCnt, MComSolPre, MComEntCnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ3", "SELECT MComCod, MComEntPre, MComSolCnt, MComSolPre, MComEntCnt, EmprCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? AND MComCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ4", "SELECT MRNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ5", "SELECT MComCod, MComEntFch, MComExt, MComFch, MComSolFch, MComEst, MComOri, EmprCod, PrvNum FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ?  FOR UPDATE OF MComEntFch, MComExt, MComFch, MComSolFch, MComEst, MComOri, PrvNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ6", "SELECT MComCod, MComEntFch, MComExt, MComFch, MComSolFch, MComEst, MComOri, EmprCod, PrvNum FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ8", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ10", "SELECT /*+ FIRST_ROWS(100) */ TM1.MComCod, TM1.MComEntFch, T2.EmprNom, TM1.MComExt, TM1.MComFch, T3.PrvNom, TM1.MComSolFch, TM1.MComEst, TM1.MComOri, TM1.EmprCod, TM1.PrvNum FROM ((TXPMRepCo TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrvNum = TM1.PrvNum) WHERE TM1.EmprCod = ? and TM1.MComCod = ? ORDER BY TM1.EmprCod, TM1.MComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ12", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ13", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ15", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MComCod FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MComCod FROM TXPMRepCo WHERE ( EmprCod > ? or EmprCod = ? and MComCod > ?) ORDER BY EmprCod, MComCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AJ18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MComCod FROM TXPMRepCo WHERE ( EmprCod < ? or EmprCod = ? and MComCod < ?) ORDER BY EmprCod DESC, MComCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AJ19", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AJ20", "INSERT INTO TXPMRepCo(MComCod, MComEntFch, MComExt, MComFch, MComSolFch, MComEst, MComOri, EmprCod, PrvNum, MComUsu) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPMRepCo")
         ,new UpdateCursor("T01AJ21", "UPDATE TXPMRepCo SET MComEntFch=?, MComExt=?, MComFch=?, MComSolFch=?, MComEst=?, MComOri=?, PrvNum=?  WHERE EmprCod = ? AND MComCod = ?", GX_NOMASK, "TXPMRepCo")
         ,new UpdateCursor("T01AJ22", "DELETE FROM TXPMRepCo  WHERE EmprCod = ? AND MComCod = ?", GX_NOMASK, "TXPMRepCo")
         ,new ForEachCursor("T01AJ23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ24", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ25", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MComCod FROM TXPMRepCo ORDER BY EmprCod, MComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ26", "SELECT T1.MComCod, T1.MComEntPre, T2.MRNom, T1.MComSolCnt, T1.MComSolPre, T1.MComEntCnt, T1.EmprCod, T1.MRCod FROM (TXPMRepC1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) WHERE T1.EmprCod = ? and T1.MComCod = ? and T1.MRCod = ? ORDER BY T1.EmprCod, T1.MComCod, T1.MRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ27", "SELECT MRNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ28", "SELECT EmprCod, MComCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? AND MComCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AJ29", "INSERT INTO TXPMRepC1(MComCod, MComEntPre, MComSolCnt, MComSolPre, MComEntCnt, EmprCod, MRCod, MComLote) VALUES(?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPMRepC1")
         ,new UpdateCursor("T01AJ30", "UPDATE TXPMRepC1 SET MComEntPre=?, MComSolCnt=?, MComSolPre=?, MComEntCnt=?  WHERE EmprCod = ? AND MComCod = ? AND MRCod = ?", GX_NOMASK, "TXPMRepC1")
         ,new UpdateCursor("T01AJ31", "DELETE FROM TXPMRepC1  WHERE EmprCod = ? AND MComCod = ? AND MRCod = ?", GX_NOMASK, "TXPMRepC1")
         ,new ForEachCursor("T01AJ32", "SELECT MRNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ33", "SELECT EmprCod, MComCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? and MComCod = ? ORDER BY EmprCod, MComCod, MRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ34", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom FROM TXPPRVGEN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, '')))) like '%' || UPPER(?)) ORDER BY PrvNNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ35", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ37", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AJ38", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 24 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
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
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 20);
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
            case 19 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 20);
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
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
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 28 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
               stmt.setVarchar(2, (String)parms[1], 50);
               return;
            case 33 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 35 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 36 :
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
      }
   }

}

