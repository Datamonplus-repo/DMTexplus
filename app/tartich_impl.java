package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tartich_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A829TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A829TipArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2707NumTexCod = httpContext.GetPar( "NumTexCod") ;
         n2707NumTexCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2707NumTexCod", A2707NumTexCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A2707NumTexCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A252CliCod) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO DE ARTICULOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tartich_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tartich_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tartich_impl.class ));
   }

   public tartich_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "Container FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MANTENIMIENTO DE ARTICULOS", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtMat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtMat_Internalname, GXutil.rtrim( A87ArtMat), GXutil.rtrim( localUtil.format( A87ArtMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtMat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipArtCod_Internalname, httpContext.getMessage( "Código Tipo Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtCod_Internalname, GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipArtCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipArtCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipArtDsc_Internalname, httpContext.getMessage( "Descripción Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtDsc_Internalname, GXutil.rtrim( A830TipArtDsc), GXutil.rtrim( localUtil.format( A830TipArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipArtDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtEti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtEti_Internalname, httpContext.getMessage( "Etiquetas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtEti_Internalname, GXutil.rtrim( A73ArtEti), GXutil.rtrim( localUtil.format( A73ArtEti, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtEti_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtEti_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliUrg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliUrg_Internalname, httpContext.getMessage( "Urgencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliUrg_Internalname, GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliUrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A306CliUrg), "9") : localUtil.format( DecimalUtil.doubleToDec(A306CliUrg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliUrg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliUrg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtUrg_Internalname, httpContext.getMessage( "Urgencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrg_Internalname, GXutil.ltrim( localUtil.ntoc( A117ArtUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A117ArtUrg), "9") : localUtil.format( DecimalUtil.doubleToDec(A117ArtUrg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtUrg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTra1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtTra1_Internalname, httpContext.getMessage( "Trama1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTra1_Internalname, GXutil.rtrim( A105ArtTra1), GXutil.rtrim( localUtil.format( A105ArtTra1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTra1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtTra1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTra2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtTra2_Internalname, httpContext.getMessage( "Trama2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTra2_Internalname, GXutil.rtrim( A106ArtTra2), GXutil.rtrim( localUtil.format( A106ArtTra2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTra2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtTra2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTra3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtTra3_Internalname, httpContext.getMessage( "Trama3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTra3_Internalname, GXutil.rtrim( A107ArtTra3), GXutil.rtrim( localUtil.format( A107ArtTra3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTra3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtTra3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTraP1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtTraP1_Internalname, httpContext.getMessage( "% Trama1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTraP1_Internalname, GXutil.ltrim( localUtil.ntoc( A108ArtTraP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTraP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A108ArtTraP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A108ArtTraP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTraP1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtTraP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTraP2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtTraP2_Internalname, httpContext.getMessage( "%Trama2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTraP2_Internalname, GXutil.ltrim( localUtil.ntoc( A109ArtTraP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTraP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A109ArtTraP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A109ArtTraP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTraP2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtTraP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtTraP3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtTraP3_Internalname, httpContext.getMessage( "% Trama3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTraP3_Internalname, GXutil.ltrim( localUtil.ntoc( A110ArtTraP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTraP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A110ArtTraP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A110ArtTraP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTraP3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtTraP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrd1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtUrd1_Internalname, httpContext.getMessage( "Urdido1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrd1_Internalname, GXutil.rtrim( A111ArtUrd1), GXutil.rtrim( localUtil.format( A111ArtUrd1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrd1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtUrd1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrd2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtUrd2_Internalname, httpContext.getMessage( "Urdido2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrd2_Internalname, GXutil.rtrim( A112ArtUrd2), GXutil.rtrim( localUtil.format( A112ArtUrd2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrd2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtUrd2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrd3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtUrd3_Internalname, httpContext.getMessage( "Urdido3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrd3_Internalname, GXutil.rtrim( A113ArtUrd3), GXutil.rtrim( localUtil.format( A113ArtUrd3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,128);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrd3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtUrd3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrdP1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtUrdP1_Internalname, httpContext.getMessage( "% Urdido1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrdP1_Internalname, GXutil.ltrim( localUtil.ntoc( A114ArtUrdP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrdP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A114ArtUrdP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A114ArtUrdP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrdP1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtUrdP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrdP2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtUrdP2_Internalname, httpContext.getMessage( "% Urdido2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrdP2_Internalname, GXutil.ltrim( localUtil.ntoc( A115ArtUrdP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrdP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A115ArtUrdP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A115ArtUrdP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,138);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrdP2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtUrdP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUrdP3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtUrdP3_Internalname, httpContext.getMessage( "% Urdido3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrdP3_Internalname, GXutil.ltrim( localUtil.ntoc( A116ArtUrdP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrdP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A116ArtUrdP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A116ArtUrdP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrdP3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtUrdP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtNMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtNMtr_Internalname, httpContext.getMessage( "Número Métrico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtNMtr_Internalname, GXutil.rtrim( A967ArtNMtr), GXutil.rtrim( localUtil.format( A967ArtNMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,148);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtNMtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtNMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtObs_Internalname, httpContext.getMessage( "Observacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtObs_Internalname, GXutil.rtrim( A89ArtObs), GXutil.rtrim( localUtil.format( A89ArtObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtObs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtObs_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtObsFac_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtObsFac_Internalname, httpContext.getMessage( "Observacion Factura", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtArtObsFac_Internalname, GXutil.rtrim( A90ArtObsFac), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,158);\"", (short)(0), 1, edtArtObsFac_Enabled, 0, 100, "%", 2, "row", (byte)(0), StyleString, ClassString, "", "", "40", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtNumTex1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtNumTex1_Internalname, httpContext.getMessage( "Primera Parte Nmetrico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtNumTex1_Internalname, GXutil.ltrim( localUtil.ntoc( A2750ArtNumTex1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtNumTex1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2750ArtNumTex1), "9") : localUtil.format( DecimalUtil.doubleToDec(A2750ArtNumTex1), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,163);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtNumTex1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtNumTex1_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtNumTex2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtNumTex2_Internalname, httpContext.getMessage( "Segunda Parte Nmetrico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtNumTex2_Internalname, GXutil.ltrim( localUtil.ntoc( A2751ArtNumTex2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtNumTex2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2751ArtNumTex2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2751ArtNumTex2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,168);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtNumTex2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtNumTex2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNumTexCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNumTexCod_Internalname, httpContext.getMessage( "Codigo Numeracion Textil", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNumTexCod_Internalname, GXutil.rtrim( A2707NumTexCod), GXutil.rtrim( localUtil.format( A2707NumTexCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNumTexCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtNumTexCod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNumTexDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNumTexDsc_Internalname, httpContext.getMessage( "Desc Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNumTexDsc_Internalname, GXutil.rtrim( A2708NumTexDsc), GXutil.rtrim( localUtil.format( A2708NumTexDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNumTexDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtNumTexDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtObsLon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtObsLon_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtArtObsLon_Internalname, A3072ArtObsLon, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,183);\"", (short)(0), 1, edtArtObsLon_Enabled, 0, 100, "%", 2, "row", (byte)(0), StyleString, ClassString, "", "", "400", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtFacAbs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtFacAbs_Internalname, httpContext.getMessage( "Factor Absorcion Serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtFacAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A2791ArtFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtFacAbs_Enabled!=0) ? localUtil.format( A2791ArtFacAbs, "ZZ9.99") : localUtil.format( A2791ArtFacAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,188);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtFacAbs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtFacAbs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtFecCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtFecCre_Internalname, httpContext.getMessage( "Fecha Creacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtArtFecCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtFecCre_Internalname, localUtil.format(A3683ArtFecCre, "99/99/99"), localUtil.format( A3683ArtFecCre, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,193);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtFecCre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtFecCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtArtFecCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtArtFecCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TARTICH.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtUsrCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtUsrCod_Internalname, httpContext.getMessage( "Usuario creo/modif. serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUsrCod_Internalname, GXutil.rtrim( A4353ArtUsrCod), GXutil.rtrim( localUtil.format( A4353ArtUsrCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,198);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUsrCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtUsrCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtFecMod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtFecMod_Internalname, httpContext.getMessage( "Fecha Modificación", ""), "col-sm-3 AttributeLabel", 1, true, "");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtArtFecMod_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtFecMod_Internalname, localUtil.format(A4354ArtFecMod, "99/99/9999"), localUtil.format( A4354ArtFecMod, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,203);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtFecMod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtFecMod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtArtFecMod_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtArtFecMod_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TARTICH.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCdb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCdb_Internalname, httpContext.getMessage( "Codigo de Barrar", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCdb_Internalname, GXutil.rtrim( A4980ArtCdb), GXutil.rtrim( localUtil.format( A4980ArtCdb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,208);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCdb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtCdb_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtAncSal2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtAncSal2_Internalname, httpContext.getMessage( "Ancho Salida 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtAncSal2_Internalname, GXutil.ltrim( localUtil.ntoc( A3123ArtAncSal2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtAncSal2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3123ArtAncSal2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3123ArtAncSal2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,213);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAncSal2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtAncSal2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtAncSal1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtAncSal1_Internalname, httpContext.getMessage( "Ancho Salida 1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtAncSal1_Internalname, GXutil.ltrim( localUtil.ntoc( A3122ArtAncSal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtAncSal1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3122ArtAncSal1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3122ArtAncSal1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,218);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAncSal1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtAncSal1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtPle2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtPle2_Internalname, httpContext.getMessage( "Plegado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtPle2_Internalname, GXutil.rtrim( A2834ArtPle2), GXutil.rtrim( localUtil.format( A2834ArtPle2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,223);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtPle2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtPle2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtBlo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtBlo_Internalname, httpContext.getMessage( "Bloqueado?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtBlo_Internalname, GXutil.rtrim( A7779ArtBlo), GXutil.rtrim( localUtil.format( A7779ArtBlo, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,228);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtBlo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtBlo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICH.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 237,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICH.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
         Z87ArtMat = httpContext.cgiGet( "Z87ArtMat") ;
         Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
         Z73ArtEti = httpContext.cgiGet( "Z73ArtEti") ;
         Z117ArtUrg = (byte)(localUtil.ctol( httpContext.cgiGet( "Z117ArtUrg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z105ArtTra1 = httpContext.cgiGet( "Z105ArtTra1") ;
         Z106ArtTra2 = httpContext.cgiGet( "Z106ArtTra2") ;
         Z107ArtTra3 = httpContext.cgiGet( "Z107ArtTra3") ;
         Z108ArtTraP1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z108ArtTraP1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z109ArtTraP2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z109ArtTraP2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z110ArtTraP3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z110ArtTraP3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z111ArtUrd1 = httpContext.cgiGet( "Z111ArtUrd1") ;
         Z112ArtUrd2 = httpContext.cgiGet( "Z112ArtUrd2") ;
         Z113ArtUrd3 = httpContext.cgiGet( "Z113ArtUrd3") ;
         Z114ArtUrdP1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z114ArtUrdP1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z115ArtUrdP2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z115ArtUrdP2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z116ArtUrdP3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z116ArtUrdP3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z967ArtNMtr = httpContext.cgiGet( "Z967ArtNMtr") ;
         Z89ArtObs = httpContext.cgiGet( "Z89ArtObs") ;
         Z90ArtObsFac = httpContext.cgiGet( "Z90ArtObsFac") ;
         Z2750ArtNumTex1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2750ArtNumTex1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2751ArtNumTex2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z2751ArtNumTex2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2791ArtFacAbs = localUtil.ctond( httpContext.cgiGet( "Z2791ArtFacAbs")) ;
         Z3683ArtFecCre = localUtil.ctod( httpContext.cgiGet( "Z3683ArtFecCre"), 0) ;
         Z4353ArtUsrCod = httpContext.cgiGet( "Z4353ArtUsrCod") ;
         Z4354ArtFecMod = localUtil.ctod( httpContext.cgiGet( "Z4354ArtFecMod"), 0) ;
         Z4980ArtCdb = httpContext.cgiGet( "Z4980ArtCdb") ;
         Z3123ArtAncSal2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3123ArtAncSal2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3122ArtAncSal1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3122ArtAncSal1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2834ArtPle2 = httpContext.cgiGet( "Z2834ArtPle2") ;
         Z7779ArtBlo = httpContext.cgiGet( "Z7779ArtBlo") ;
         Z829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z829TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2707NumTexCod = httpContext.cgiGet( "Z2707NumTexCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A252CliCod = 0 ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A87ArtMat = httpContext.cgiGet( edtArtMat_Internalname) ;
         n87ArtMat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", A87ArtMat);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPARTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipArtCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A829TipArtCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         }
         else
         {
            A829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         }
         A830TipArtDsc = httpContext.cgiGet( edtTipArtDsc_Internalname) ;
         n830TipArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
         A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
         n69ArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A73ArtEti = GXutil.upper( httpContext.cgiGet( edtArtEti_Internalname)) ;
         n73ArtEti = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
         A306CliUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTURG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtUrg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A117ArtUrg = (byte)(0) ;
            n117ArtUrg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
         }
         else
         {
            A117ArtUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n117ArtUrg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
         }
         A105ArtTra1 = httpContext.cgiGet( edtArtTra1_Internalname) ;
         n105ArtTra1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", A105ArtTra1);
         A106ArtTra2 = httpContext.cgiGet( edtArtTra2_Internalname) ;
         n106ArtTra2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", A106ArtTra2);
         A107ArtTra3 = httpContext.cgiGet( edtArtTra3_Internalname) ;
         n107ArtTra3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", A107ArtTra3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTTRAP1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtTraP1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A108ArtTraP1 = (short)(0) ;
            n108ArtTraP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
         }
         else
         {
            A108ArtTraP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n108ArtTraP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTTRAP2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtTraP2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A109ArtTraP2 = (short)(0) ;
            n109ArtTraP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
         }
         else
         {
            A109ArtTraP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n109ArtTraP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTTRAP3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtTraP3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A110ArtTraP3 = (short)(0) ;
            n110ArtTraP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
         }
         else
         {
            A110ArtTraP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n110ArtTraP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
         }
         A111ArtUrd1 = httpContext.cgiGet( edtArtUrd1_Internalname) ;
         n111ArtUrd1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", A111ArtUrd1);
         A112ArtUrd2 = httpContext.cgiGet( edtArtUrd2_Internalname) ;
         n112ArtUrd2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", A112ArtUrd2);
         A113ArtUrd3 = httpContext.cgiGet( edtArtUrd3_Internalname) ;
         n113ArtUrd3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", A113ArtUrd3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTURDP1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtUrdP1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A114ArtUrdP1 = (short)(0) ;
            n114ArtUrdP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
         }
         else
         {
            A114ArtUrdP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUrdP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n114ArtUrdP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTURDP2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtUrdP2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A115ArtUrdP2 = (short)(0) ;
            n115ArtUrdP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
         }
         else
         {
            A115ArtUrdP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUrdP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n115ArtUrdP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTURDP3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtUrdP3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A116ArtUrdP3 = (short)(0) ;
            n116ArtUrdP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
         }
         else
         {
            A116ArtUrdP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUrdP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n116ArtUrdP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
         }
         A967ArtNMtr = httpContext.cgiGet( edtArtNMtr_Internalname) ;
         n967ArtNMtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
         A89ArtObs = httpContext.cgiGet( edtArtObs_Internalname) ;
         n89ArtObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A89ArtObs", A89ArtObs);
         A90ArtObsFac = httpContext.cgiGet( edtArtObsFac_Internalname) ;
         n90ArtObsFac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A90ArtObsFac", A90ArtObsFac);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtNumTex1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtNumTex1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTNUMTEX1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtNumTex1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2750ArtNumTex1 = (byte)(0) ;
            n2750ArtNumTex1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2750ArtNumTex1", GXutil.str( A2750ArtNumTex1, 1, 0));
         }
         else
         {
            A2750ArtNumTex1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtArtNumTex1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2750ArtNumTex1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2750ArtNumTex1", GXutil.str( A2750ArtNumTex1, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtNumTex2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtNumTex2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTNUMTEX2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtNumTex2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2751ArtNumTex2 = (short)(0) ;
            n2751ArtNumTex2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2751ArtNumTex2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2751ArtNumTex2), 3, 0));
         }
         else
         {
            A2751ArtNumTex2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtNumTex2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2751ArtNumTex2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2751ArtNumTex2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2751ArtNumTex2), 3, 0));
         }
         A2707NumTexCod = httpContext.cgiGet( edtNumTexCod_Internalname) ;
         n2707NumTexCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2707NumTexCod", A2707NumTexCod);
         A2708NumTexDsc = httpContext.cgiGet( edtNumTexDsc_Internalname) ;
         n2708NumTexDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2708NumTexDsc", A2708NumTexDsc);
         A3072ArtObsLon = httpContext.cgiGet( edtArtObsLon_Internalname) ;
         n3072ArtObsLon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3072ArtObsLon", A3072ArtObsLon);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtFacAbs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtFacAbs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTFACABS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtFacAbs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2791ArtFacAbs = DecimalUtil.ZERO ;
            n2791ArtFacAbs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
         }
         else
         {
            A2791ArtFacAbs = localUtil.ctond( httpContext.cgiGet( edtArtFacAbs_Internalname)) ;
            n2791ArtFacAbs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtArtFecCre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ARTFECCRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtFecCre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3683ArtFecCre = GXutil.nullDate() ;
            n3683ArtFecCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
         }
         else
         {
            A3683ArtFecCre = localUtil.ctod( httpContext.cgiGet( edtArtFecCre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3683ArtFecCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
         }
         A4353ArtUsrCod = httpContext.cgiGet( edtArtUsrCod_Internalname) ;
         n4353ArtUsrCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", A4353ArtUsrCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtArtFecMod_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ARTFECMOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtFecMod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4354ArtFecMod = GXutil.nullDate() ;
            n4354ArtFecMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
         }
         else
         {
            A4354ArtFecMod = localUtil.ctod( httpContext.cgiGet( edtArtFecMod_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4354ArtFecMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
         }
         A4980ArtCdb = httpContext.cgiGet( edtArtCdb_Internalname) ;
         n4980ArtCdb = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4980ArtCdb", A4980ArtCdb);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTANCSAL2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtAncSal2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3123ArtAncSal2 = (short)(0) ;
            n3123ArtAncSal2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
         }
         else
         {
            A3123ArtAncSal2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3123ArtAncSal2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTANCSAL1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtAncSal1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3122ArtAncSal1 = (short)(0) ;
            n3122ArtAncSal1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
         }
         else
         {
            A3122ArtAncSal1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3122ArtAncSal1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
         }
         A2834ArtPle2 = httpContext.cgiGet( edtArtPle2_Internalname) ;
         n2834ArtPle2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", A2834ArtPle2);
         A7779ArtBlo = GXutil.upper( httpContext.cgiGet( edtArtBlo_Internalname)) ;
         n7779ArtBlo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7779ArtBlo", A7779ArtBlo);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll3A10( ) ;
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
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes3A10( ) ;
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

   public void resetCaption3A0( )
   {
   }

   public void zm3A10( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z87ArtMat = T003A3_A87ArtMat[0] ;
            Z69ArtDsc = T003A3_A69ArtDsc[0] ;
            Z73ArtEti = T003A3_A73ArtEti[0] ;
            Z117ArtUrg = T003A3_A117ArtUrg[0] ;
            Z105ArtTra1 = T003A3_A105ArtTra1[0] ;
            Z106ArtTra2 = T003A3_A106ArtTra2[0] ;
            Z107ArtTra3 = T003A3_A107ArtTra3[0] ;
            Z108ArtTraP1 = T003A3_A108ArtTraP1[0] ;
            Z109ArtTraP2 = T003A3_A109ArtTraP2[0] ;
            Z110ArtTraP3 = T003A3_A110ArtTraP3[0] ;
            Z111ArtUrd1 = T003A3_A111ArtUrd1[0] ;
            Z112ArtUrd2 = T003A3_A112ArtUrd2[0] ;
            Z113ArtUrd3 = T003A3_A113ArtUrd3[0] ;
            Z114ArtUrdP1 = T003A3_A114ArtUrdP1[0] ;
            Z115ArtUrdP2 = T003A3_A115ArtUrdP2[0] ;
            Z116ArtUrdP3 = T003A3_A116ArtUrdP3[0] ;
            Z967ArtNMtr = T003A3_A967ArtNMtr[0] ;
            Z89ArtObs = T003A3_A89ArtObs[0] ;
            Z90ArtObsFac = T003A3_A90ArtObsFac[0] ;
            Z2750ArtNumTex1 = T003A3_A2750ArtNumTex1[0] ;
            Z2751ArtNumTex2 = T003A3_A2751ArtNumTex2[0] ;
            Z2791ArtFacAbs = T003A3_A2791ArtFacAbs[0] ;
            Z3683ArtFecCre = T003A3_A3683ArtFecCre[0] ;
            Z4353ArtUsrCod = T003A3_A4353ArtUsrCod[0] ;
            Z4354ArtFecMod = T003A3_A4354ArtFecMod[0] ;
            Z4980ArtCdb = T003A3_A4980ArtCdb[0] ;
            Z3123ArtAncSal2 = T003A3_A3123ArtAncSal2[0] ;
            Z3122ArtAncSal1 = T003A3_A3122ArtAncSal1[0] ;
            Z2834ArtPle2 = T003A3_A2834ArtPle2[0] ;
            Z7779ArtBlo = T003A3_A7779ArtBlo[0] ;
            Z829TipArtCod = T003A3_A829TipArtCod[0] ;
            Z2707NumTexCod = T003A3_A2707NumTexCod[0] ;
         }
         else
         {
            Z87ArtMat = A87ArtMat ;
            Z69ArtDsc = A69ArtDsc ;
            Z73ArtEti = A73ArtEti ;
            Z117ArtUrg = A117ArtUrg ;
            Z105ArtTra1 = A105ArtTra1 ;
            Z106ArtTra2 = A106ArtTra2 ;
            Z107ArtTra3 = A107ArtTra3 ;
            Z108ArtTraP1 = A108ArtTraP1 ;
            Z109ArtTraP2 = A109ArtTraP2 ;
            Z110ArtTraP3 = A110ArtTraP3 ;
            Z111ArtUrd1 = A111ArtUrd1 ;
            Z112ArtUrd2 = A112ArtUrd2 ;
            Z113ArtUrd3 = A113ArtUrd3 ;
            Z114ArtUrdP1 = A114ArtUrdP1 ;
            Z115ArtUrdP2 = A115ArtUrdP2 ;
            Z116ArtUrdP3 = A116ArtUrdP3 ;
            Z967ArtNMtr = A967ArtNMtr ;
            Z89ArtObs = A89ArtObs ;
            Z90ArtObsFac = A90ArtObsFac ;
            Z2750ArtNumTex1 = A2750ArtNumTex1 ;
            Z2751ArtNumTex2 = A2751ArtNumTex2 ;
            Z2791ArtFacAbs = A2791ArtFacAbs ;
            Z3683ArtFecCre = A3683ArtFecCre ;
            Z4353ArtUsrCod = A4353ArtUsrCod ;
            Z4354ArtFecMod = A4354ArtFecMod ;
            Z4980ArtCdb = A4980ArtCdb ;
            Z3123ArtAncSal2 = A3123ArtAncSal2 ;
            Z3122ArtAncSal1 = A3122ArtAncSal1 ;
            Z2834ArtPle2 = A2834ArtPle2 ;
            Z7779ArtBlo = A7779ArtBlo ;
            Z829TipArtCod = A829TipArtCod ;
            Z2707NumTexCod = A2707NumTexCod ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z65ArtCod = A65ArtCod ;
         Z87ArtMat = A87ArtMat ;
         Z69ArtDsc = A69ArtDsc ;
         Z73ArtEti = A73ArtEti ;
         Z117ArtUrg = A117ArtUrg ;
         Z105ArtTra1 = A105ArtTra1 ;
         Z106ArtTra2 = A106ArtTra2 ;
         Z107ArtTra3 = A107ArtTra3 ;
         Z108ArtTraP1 = A108ArtTraP1 ;
         Z109ArtTraP2 = A109ArtTraP2 ;
         Z110ArtTraP3 = A110ArtTraP3 ;
         Z111ArtUrd1 = A111ArtUrd1 ;
         Z112ArtUrd2 = A112ArtUrd2 ;
         Z113ArtUrd3 = A113ArtUrd3 ;
         Z114ArtUrdP1 = A114ArtUrdP1 ;
         Z115ArtUrdP2 = A115ArtUrdP2 ;
         Z116ArtUrdP3 = A116ArtUrdP3 ;
         Z967ArtNMtr = A967ArtNMtr ;
         Z89ArtObs = A89ArtObs ;
         Z90ArtObsFac = A90ArtObsFac ;
         Z2750ArtNumTex1 = A2750ArtNumTex1 ;
         Z2751ArtNumTex2 = A2751ArtNumTex2 ;
         Z3072ArtObsLon = A3072ArtObsLon ;
         Z2791ArtFacAbs = A2791ArtFacAbs ;
         Z3683ArtFecCre = A3683ArtFecCre ;
         Z4353ArtUsrCod = A4353ArtUsrCod ;
         Z4354ArtFecMod = A4354ArtFecMod ;
         Z4980ArtCdb = A4980ArtCdb ;
         Z3123ArtAncSal2 = A3123ArtAncSal2 ;
         Z3122ArtAncSal1 = A3122ArtAncSal1 ;
         Z2834ArtPle2 = A2834ArtPle2 ;
         Z7779ArtBlo = A7779ArtBlo ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z829TipArtCod = A829TipArtCod ;
         Z2707NumTexCod = A2707NumTexCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z306CliUrg = A306CliUrg ;
         Z830TipArtDsc = A830TipArtDsc ;
         Z2708NumTexDsc = A2708NumTexDsc ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load3A10( )
   {
      /* Using cursor T003A8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A3072ArtObsLon = T003A8_A3072ArtObsLon[0] ;
         n3072ArtObsLon = T003A8_n3072ArtObsLon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3072ArtObsLon", A3072ArtObsLon);
         A279CliNom = T003A8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T003A8_A407EmprNom[0] ;
         n407EmprNom = T003A8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A87ArtMat = T003A8_A87ArtMat[0] ;
         n87ArtMat = T003A8_n87ArtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", A87ArtMat);
         A830TipArtDsc = T003A8_A830TipArtDsc[0] ;
         n830TipArtDsc = T003A8_n830TipArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
         A69ArtDsc = T003A8_A69ArtDsc[0] ;
         n69ArtDsc = T003A8_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A73ArtEti = T003A8_A73ArtEti[0] ;
         n73ArtEti = T003A8_n73ArtEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
         A306CliUrg = T003A8_A306CliUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         A117ArtUrg = T003A8_A117ArtUrg[0] ;
         n117ArtUrg = T003A8_n117ArtUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
         A105ArtTra1 = T003A8_A105ArtTra1[0] ;
         n105ArtTra1 = T003A8_n105ArtTra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", A105ArtTra1);
         A106ArtTra2 = T003A8_A106ArtTra2[0] ;
         n106ArtTra2 = T003A8_n106ArtTra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", A106ArtTra2);
         A107ArtTra3 = T003A8_A107ArtTra3[0] ;
         n107ArtTra3 = T003A8_n107ArtTra3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", A107ArtTra3);
         A108ArtTraP1 = T003A8_A108ArtTraP1[0] ;
         n108ArtTraP1 = T003A8_n108ArtTraP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
         A109ArtTraP2 = T003A8_A109ArtTraP2[0] ;
         n109ArtTraP2 = T003A8_n109ArtTraP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
         A110ArtTraP3 = T003A8_A110ArtTraP3[0] ;
         n110ArtTraP3 = T003A8_n110ArtTraP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
         A111ArtUrd1 = T003A8_A111ArtUrd1[0] ;
         n111ArtUrd1 = T003A8_n111ArtUrd1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", A111ArtUrd1);
         A112ArtUrd2 = T003A8_A112ArtUrd2[0] ;
         n112ArtUrd2 = T003A8_n112ArtUrd2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", A112ArtUrd2);
         A113ArtUrd3 = T003A8_A113ArtUrd3[0] ;
         n113ArtUrd3 = T003A8_n113ArtUrd3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", A113ArtUrd3);
         A114ArtUrdP1 = T003A8_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = T003A8_n114ArtUrdP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
         A115ArtUrdP2 = T003A8_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = T003A8_n115ArtUrdP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
         A116ArtUrdP3 = T003A8_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = T003A8_n116ArtUrdP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
         A967ArtNMtr = T003A8_A967ArtNMtr[0] ;
         n967ArtNMtr = T003A8_n967ArtNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
         A89ArtObs = T003A8_A89ArtObs[0] ;
         n89ArtObs = T003A8_n89ArtObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89ArtObs", A89ArtObs);
         A90ArtObsFac = T003A8_A90ArtObsFac[0] ;
         n90ArtObsFac = T003A8_n90ArtObsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90ArtObsFac", A90ArtObsFac);
         A2750ArtNumTex1 = T003A8_A2750ArtNumTex1[0] ;
         n2750ArtNumTex1 = T003A8_n2750ArtNumTex1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2750ArtNumTex1", GXutil.str( A2750ArtNumTex1, 1, 0));
         A2751ArtNumTex2 = T003A8_A2751ArtNumTex2[0] ;
         n2751ArtNumTex2 = T003A8_n2751ArtNumTex2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2751ArtNumTex2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2751ArtNumTex2), 3, 0));
         A2708NumTexDsc = T003A8_A2708NumTexDsc[0] ;
         n2708NumTexDsc = T003A8_n2708NumTexDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2708NumTexDsc", A2708NumTexDsc);
         A2791ArtFacAbs = T003A8_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = T003A8_n2791ArtFacAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
         A3683ArtFecCre = T003A8_A3683ArtFecCre[0] ;
         n3683ArtFecCre = T003A8_n3683ArtFecCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
         A4353ArtUsrCod = T003A8_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = T003A8_n4353ArtUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", A4353ArtUsrCod);
         A4354ArtFecMod = T003A8_A4354ArtFecMod[0] ;
         n4354ArtFecMod = T003A8_n4354ArtFecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
         A4980ArtCdb = T003A8_A4980ArtCdb[0] ;
         n4980ArtCdb = T003A8_n4980ArtCdb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4980ArtCdb", A4980ArtCdb);
         A3123ArtAncSal2 = T003A8_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = T003A8_n3123ArtAncSal2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
         A3122ArtAncSal1 = T003A8_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = T003A8_n3122ArtAncSal1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
         A2834ArtPle2 = T003A8_A2834ArtPle2[0] ;
         n2834ArtPle2 = T003A8_n2834ArtPle2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", A2834ArtPle2);
         A7779ArtBlo = T003A8_A7779ArtBlo[0] ;
         n7779ArtBlo = T003A8_n7779ArtBlo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7779ArtBlo", A7779ArtBlo);
         A829TipArtCod = T003A8_A829TipArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         A2707NumTexCod = T003A8_A2707NumTexCod[0] ;
         n2707NumTexCod = T003A8_n2707NumTexCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2707NumTexCod", A2707NumTexCod);
         zm3A10( -3) ;
      }
      pr_default.close(6);
      onLoadActions3A10( ) ;
   }

   public void onLoadActions3A10( )
   {
   }

   public void checkExtendedTable3A10( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T003A4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T003A4_A407EmprNom[0] ;
      n407EmprNom = T003A4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T003A6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A830TipArtDsc = T003A6_A830TipArtDsc[0] ;
      n830TipArtDsc = T003A6_n830TipArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
      pr_default.close(4);
      /* Using cursor T003A7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n2707NumTexCod), A2707NumTexCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "NUMTEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "NUMTEXCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2708NumTexDsc = T003A7_A2708NumTexDsc[0] ;
      n2708NumTexDsc = T003A7_n2708NumTexDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2708NumTexDsc", A2708NumTexDsc);
      pr_default.close(5);
      /* Using cursor T003A5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T003A5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A306CliUrg = T003A5_A306CliUrg[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
      pr_default.close(3);
      if ( ! ( ( GXutil.strcmp(A73ArtEti, "S") == 0 ) || ( GXutil.strcmp(A73ArtEti, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Etiquetas", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ARTETI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtEti_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A117ArtUrg >= 0 ) && ( A117ArtUrg <= 9 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Urgencia", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ARTURG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtUrg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors3A10( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T003A9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T003A9_A407EmprNom[0] ;
      n407EmprNom = T003A9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_6( String A396EmprCod ,
                         short A829TipArtCod )
   {
      /* Using cursor T003A10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A830TipArtDsc = T003A10_A830TipArtDsc[0] ;
      n830TipArtDsc = T003A10_n830TipArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A830TipArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_7( String A396EmprCod ,
                         String A2707NumTexCod )
   {
      /* Using cursor T003A11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n2707NumTexCod), A2707NumTexCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "NUMTEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "NUMTEXCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2708NumTexDsc = T003A11_A2708NumTexDsc[0] ;
      n2708NumTexDsc = T003A11_n2708NumTexDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2708NumTexDsc", A2708NumTexDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2708NumTexDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T003A12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T003A12_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A306CliUrg = T003A12_A306CliUrg[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey3A10( )
   {
      /* Using cursor T003A13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T003A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm3A10( 3) ;
         RcdFound10 = (short)(1) ;
         A3072ArtObsLon = T003A3_A3072ArtObsLon[0] ;
         n3072ArtObsLon = T003A3_n3072ArtObsLon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3072ArtObsLon", A3072ArtObsLon);
         A65ArtCod = T003A3_A65ArtCod[0] ;
         n65ArtCod = T003A3_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A87ArtMat = T003A3_A87ArtMat[0] ;
         n87ArtMat = T003A3_n87ArtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", A87ArtMat);
         A69ArtDsc = T003A3_A69ArtDsc[0] ;
         n69ArtDsc = T003A3_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A73ArtEti = T003A3_A73ArtEti[0] ;
         n73ArtEti = T003A3_n73ArtEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
         A117ArtUrg = T003A3_A117ArtUrg[0] ;
         n117ArtUrg = T003A3_n117ArtUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
         A105ArtTra1 = T003A3_A105ArtTra1[0] ;
         n105ArtTra1 = T003A3_n105ArtTra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", A105ArtTra1);
         A106ArtTra2 = T003A3_A106ArtTra2[0] ;
         n106ArtTra2 = T003A3_n106ArtTra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", A106ArtTra2);
         A107ArtTra3 = T003A3_A107ArtTra3[0] ;
         n107ArtTra3 = T003A3_n107ArtTra3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", A107ArtTra3);
         A108ArtTraP1 = T003A3_A108ArtTraP1[0] ;
         n108ArtTraP1 = T003A3_n108ArtTraP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
         A109ArtTraP2 = T003A3_A109ArtTraP2[0] ;
         n109ArtTraP2 = T003A3_n109ArtTraP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
         A110ArtTraP3 = T003A3_A110ArtTraP3[0] ;
         n110ArtTraP3 = T003A3_n110ArtTraP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
         A111ArtUrd1 = T003A3_A111ArtUrd1[0] ;
         n111ArtUrd1 = T003A3_n111ArtUrd1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", A111ArtUrd1);
         A112ArtUrd2 = T003A3_A112ArtUrd2[0] ;
         n112ArtUrd2 = T003A3_n112ArtUrd2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", A112ArtUrd2);
         A113ArtUrd3 = T003A3_A113ArtUrd3[0] ;
         n113ArtUrd3 = T003A3_n113ArtUrd3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", A113ArtUrd3);
         A114ArtUrdP1 = T003A3_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = T003A3_n114ArtUrdP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
         A115ArtUrdP2 = T003A3_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = T003A3_n115ArtUrdP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
         A116ArtUrdP3 = T003A3_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = T003A3_n116ArtUrdP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
         A967ArtNMtr = T003A3_A967ArtNMtr[0] ;
         n967ArtNMtr = T003A3_n967ArtNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
         A89ArtObs = T003A3_A89ArtObs[0] ;
         n89ArtObs = T003A3_n89ArtObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89ArtObs", A89ArtObs);
         A90ArtObsFac = T003A3_A90ArtObsFac[0] ;
         n90ArtObsFac = T003A3_n90ArtObsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90ArtObsFac", A90ArtObsFac);
         A2750ArtNumTex1 = T003A3_A2750ArtNumTex1[0] ;
         n2750ArtNumTex1 = T003A3_n2750ArtNumTex1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2750ArtNumTex1", GXutil.str( A2750ArtNumTex1, 1, 0));
         A2751ArtNumTex2 = T003A3_A2751ArtNumTex2[0] ;
         n2751ArtNumTex2 = T003A3_n2751ArtNumTex2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2751ArtNumTex2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2751ArtNumTex2), 3, 0));
         A2791ArtFacAbs = T003A3_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = T003A3_n2791ArtFacAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
         A3683ArtFecCre = T003A3_A3683ArtFecCre[0] ;
         n3683ArtFecCre = T003A3_n3683ArtFecCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
         A4353ArtUsrCod = T003A3_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = T003A3_n4353ArtUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", A4353ArtUsrCod);
         A4354ArtFecMod = T003A3_A4354ArtFecMod[0] ;
         n4354ArtFecMod = T003A3_n4354ArtFecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
         A4980ArtCdb = T003A3_A4980ArtCdb[0] ;
         n4980ArtCdb = T003A3_n4980ArtCdb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4980ArtCdb", A4980ArtCdb);
         A3123ArtAncSal2 = T003A3_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = T003A3_n3123ArtAncSal2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
         A3122ArtAncSal1 = T003A3_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = T003A3_n3122ArtAncSal1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
         A2834ArtPle2 = T003A3_A2834ArtPle2[0] ;
         n2834ArtPle2 = T003A3_n2834ArtPle2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", A2834ArtPle2);
         A7779ArtBlo = T003A3_A7779ArtBlo[0] ;
         n7779ArtBlo = T003A3_n7779ArtBlo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7779ArtBlo", A7779ArtBlo);
         A396EmprCod = T003A3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T003A3_A252CliCod[0] ;
         n252CliCod = T003A3_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A829TipArtCod = T003A3_A829TipArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         A2707NumTexCod = T003A3_A2707NumTexCod[0] ;
         n2707NumTexCod = T003A3_n2707NumTexCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2707NumTexCod", A2707NumTexCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load3A10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey3A10( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey3A10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey3A10( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T003A14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T003A14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T003A14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T003A14_A252CliCod[0] < A252CliCod ) || ( T003A14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T003A14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T003A14_A65ArtCod[0], A65ArtCod) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T003A14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T003A14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T003A14_A252CliCod[0] > A252CliCod ) || ( T003A14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T003A14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T003A14_A65ArtCod[0], A65ArtCod) > 0 ) ) )
         {
            A396EmprCod = T003A14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T003A14_A252CliCod[0] ;
            n252CliCod = T003A14_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T003A14_A65ArtCod[0] ;
            n65ArtCod = T003A14_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T003A15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T003A15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T003A15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T003A15_A252CliCod[0] > A252CliCod ) || ( T003A15_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T003A15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T003A15_A65ArtCod[0], A65ArtCod) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T003A15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T003A15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T003A15_A252CliCod[0] < A252CliCod ) || ( T003A15_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T003A15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T003A15_A65ArtCod[0], A65ArtCod) < 0 ) ) )
         {
            A396EmprCod = T003A15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T003A15_A252CliCod[0] ;
            n252CliCod = T003A15_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T003A15_A65ArtCod[0] ;
            n65ArtCod = T003A15_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey3A10( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert3A10( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update3A10( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert3A10( ) ;
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
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert3A10( ) ;
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
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart3A10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd3A10( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart3A10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext3A10( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd3A10( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency3A10( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T003A2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z87ArtMat, T003A2_A87ArtMat[0]) != 0 ) || ( GXutil.strcmp(Z69ArtDsc, T003A2_A69ArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z73ArtEti, T003A2_A73ArtEti[0]) != 0 ) || ( Z117ArtUrg != T003A2_A117ArtUrg[0] ) || ( GXutil.strcmp(Z105ArtTra1, T003A2_A105ArtTra1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z106ArtTra2, T003A2_A106ArtTra2[0]) != 0 ) || ( GXutil.strcmp(Z107ArtTra3, T003A2_A107ArtTra3[0]) != 0 ) || ( Z108ArtTraP1 != T003A2_A108ArtTraP1[0] ) || ( Z109ArtTraP2 != T003A2_A109ArtTraP2[0] ) || ( Z110ArtTraP3 != T003A2_A110ArtTraP3[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z111ArtUrd1, T003A2_A111ArtUrd1[0]) != 0 ) || ( GXutil.strcmp(Z112ArtUrd2, T003A2_A112ArtUrd2[0]) != 0 ) || ( GXutil.strcmp(Z113ArtUrd3, T003A2_A113ArtUrd3[0]) != 0 ) || ( Z114ArtUrdP1 != T003A2_A114ArtUrdP1[0] ) || ( Z115ArtUrdP2 != T003A2_A115ArtUrdP2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z116ArtUrdP3 != T003A2_A116ArtUrdP3[0] ) || ( GXutil.strcmp(Z967ArtNMtr, T003A2_A967ArtNMtr[0]) != 0 ) || ( GXutil.strcmp(Z89ArtObs, T003A2_A89ArtObs[0]) != 0 ) || ( GXutil.strcmp(Z90ArtObsFac, T003A2_A90ArtObsFac[0]) != 0 ) || ( Z2750ArtNumTex1 != T003A2_A2750ArtNumTex1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z2751ArtNumTex2 != T003A2_A2751ArtNumTex2[0] ) || ( DecimalUtil.compareTo(Z2791ArtFacAbs, T003A2_A2791ArtFacAbs[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3683ArtFecCre), GXutil.resetTime(T003A2_A3683ArtFecCre[0])) ) || ( GXutil.strcmp(Z4353ArtUsrCod, T003A2_A4353ArtUsrCod[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4354ArtFecMod), GXutil.resetTime(T003A2_A4354ArtFecMod[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4980ArtCdb, T003A2_A4980ArtCdb[0]) != 0 ) || ( Z3123ArtAncSal2 != T003A2_A3123ArtAncSal2[0] ) || ( Z3122ArtAncSal1 != T003A2_A3122ArtAncSal1[0] ) || ( GXutil.strcmp(Z2834ArtPle2, T003A2_A2834ArtPle2[0]) != 0 ) || ( GXutil.strcmp(Z7779ArtBlo, T003A2_A7779ArtBlo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z829TipArtCod != T003A2_A829TipArtCod[0] ) || ( GXutil.strcmp(Z2707NumTexCod, T003A2_A2707NumTexCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z87ArtMat, T003A2_A87ArtMat[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtMat");
               GXutil.writeLogRaw("Old: ",Z87ArtMat);
               GXutil.writeLogRaw("Current: ",T003A2_A87ArtMat[0]);
            }
            if ( GXutil.strcmp(Z69ArtDsc, T003A2_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T003A2_A69ArtDsc[0]);
            }
            if ( GXutil.strcmp(Z73ArtEti, T003A2_A73ArtEti[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtEti");
               GXutil.writeLogRaw("Old: ",Z73ArtEti);
               GXutil.writeLogRaw("Current: ",T003A2_A73ArtEti[0]);
            }
            if ( Z117ArtUrg != T003A2_A117ArtUrg[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtUrg");
               GXutil.writeLogRaw("Old: ",Z117ArtUrg);
               GXutil.writeLogRaw("Current: ",T003A2_A117ArtUrg[0]);
            }
            if ( GXutil.strcmp(Z105ArtTra1, T003A2_A105ArtTra1[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtTra1");
               GXutil.writeLogRaw("Old: ",Z105ArtTra1);
               GXutil.writeLogRaw("Current: ",T003A2_A105ArtTra1[0]);
            }
            if ( GXutil.strcmp(Z106ArtTra2, T003A2_A106ArtTra2[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtTra2");
               GXutil.writeLogRaw("Old: ",Z106ArtTra2);
               GXutil.writeLogRaw("Current: ",T003A2_A106ArtTra2[0]);
            }
            if ( GXutil.strcmp(Z107ArtTra3, T003A2_A107ArtTra3[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtTra3");
               GXutil.writeLogRaw("Old: ",Z107ArtTra3);
               GXutil.writeLogRaw("Current: ",T003A2_A107ArtTra3[0]);
            }
            if ( Z108ArtTraP1 != T003A2_A108ArtTraP1[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtTraP1");
               GXutil.writeLogRaw("Old: ",Z108ArtTraP1);
               GXutil.writeLogRaw("Current: ",T003A2_A108ArtTraP1[0]);
            }
            if ( Z109ArtTraP2 != T003A2_A109ArtTraP2[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtTraP2");
               GXutil.writeLogRaw("Old: ",Z109ArtTraP2);
               GXutil.writeLogRaw("Current: ",T003A2_A109ArtTraP2[0]);
            }
            if ( Z110ArtTraP3 != T003A2_A110ArtTraP3[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtTraP3");
               GXutil.writeLogRaw("Old: ",Z110ArtTraP3);
               GXutil.writeLogRaw("Current: ",T003A2_A110ArtTraP3[0]);
            }
            if ( GXutil.strcmp(Z111ArtUrd1, T003A2_A111ArtUrd1[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtUrd1");
               GXutil.writeLogRaw("Old: ",Z111ArtUrd1);
               GXutil.writeLogRaw("Current: ",T003A2_A111ArtUrd1[0]);
            }
            if ( GXutil.strcmp(Z112ArtUrd2, T003A2_A112ArtUrd2[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtUrd2");
               GXutil.writeLogRaw("Old: ",Z112ArtUrd2);
               GXutil.writeLogRaw("Current: ",T003A2_A112ArtUrd2[0]);
            }
            if ( GXutil.strcmp(Z113ArtUrd3, T003A2_A113ArtUrd3[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtUrd3");
               GXutil.writeLogRaw("Old: ",Z113ArtUrd3);
               GXutil.writeLogRaw("Current: ",T003A2_A113ArtUrd3[0]);
            }
            if ( Z114ArtUrdP1 != T003A2_A114ArtUrdP1[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtUrdP1");
               GXutil.writeLogRaw("Old: ",Z114ArtUrdP1);
               GXutil.writeLogRaw("Current: ",T003A2_A114ArtUrdP1[0]);
            }
            if ( Z115ArtUrdP2 != T003A2_A115ArtUrdP2[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtUrdP2");
               GXutil.writeLogRaw("Old: ",Z115ArtUrdP2);
               GXutil.writeLogRaw("Current: ",T003A2_A115ArtUrdP2[0]);
            }
            if ( Z116ArtUrdP3 != T003A2_A116ArtUrdP3[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtUrdP3");
               GXutil.writeLogRaw("Old: ",Z116ArtUrdP3);
               GXutil.writeLogRaw("Current: ",T003A2_A116ArtUrdP3[0]);
            }
            if ( GXutil.strcmp(Z967ArtNMtr, T003A2_A967ArtNMtr[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtNMtr");
               GXutil.writeLogRaw("Old: ",Z967ArtNMtr);
               GXutil.writeLogRaw("Current: ",T003A2_A967ArtNMtr[0]);
            }
            if ( GXutil.strcmp(Z89ArtObs, T003A2_A89ArtObs[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtObs");
               GXutil.writeLogRaw("Old: ",Z89ArtObs);
               GXutil.writeLogRaw("Current: ",T003A2_A89ArtObs[0]);
            }
            if ( GXutil.strcmp(Z90ArtObsFac, T003A2_A90ArtObsFac[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtObsFac");
               GXutil.writeLogRaw("Old: ",Z90ArtObsFac);
               GXutil.writeLogRaw("Current: ",T003A2_A90ArtObsFac[0]);
            }
            if ( Z2750ArtNumTex1 != T003A2_A2750ArtNumTex1[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtNumTex1");
               GXutil.writeLogRaw("Old: ",Z2750ArtNumTex1);
               GXutil.writeLogRaw("Current: ",T003A2_A2750ArtNumTex1[0]);
            }
            if ( Z2751ArtNumTex2 != T003A2_A2751ArtNumTex2[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtNumTex2");
               GXutil.writeLogRaw("Old: ",Z2751ArtNumTex2);
               GXutil.writeLogRaw("Current: ",T003A2_A2751ArtNumTex2[0]);
            }
            if ( DecimalUtil.compareTo(Z2791ArtFacAbs, T003A2_A2791ArtFacAbs[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtFacAbs");
               GXutil.writeLogRaw("Old: ",Z2791ArtFacAbs);
               GXutil.writeLogRaw("Current: ",T003A2_A2791ArtFacAbs[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3683ArtFecCre), GXutil.resetTime(T003A2_A3683ArtFecCre[0])) ) )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtFecCre");
               GXutil.writeLogRaw("Old: ",Z3683ArtFecCre);
               GXutil.writeLogRaw("Current: ",T003A2_A3683ArtFecCre[0]);
            }
            if ( GXutil.strcmp(Z4353ArtUsrCod, T003A2_A4353ArtUsrCod[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtUsrCod");
               GXutil.writeLogRaw("Old: ",Z4353ArtUsrCod);
               GXutil.writeLogRaw("Current: ",T003A2_A4353ArtUsrCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4354ArtFecMod), GXutil.resetTime(T003A2_A4354ArtFecMod[0])) ) )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtFecMod");
               GXutil.writeLogRaw("Old: ",Z4354ArtFecMod);
               GXutil.writeLogRaw("Current: ",T003A2_A4354ArtFecMod[0]);
            }
            if ( GXutil.strcmp(Z4980ArtCdb, T003A2_A4980ArtCdb[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtCdb");
               GXutil.writeLogRaw("Old: ",Z4980ArtCdb);
               GXutil.writeLogRaw("Current: ",T003A2_A4980ArtCdb[0]);
            }
            if ( Z3123ArtAncSal2 != T003A2_A3123ArtAncSal2[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtAncSal2");
               GXutil.writeLogRaw("Old: ",Z3123ArtAncSal2);
               GXutil.writeLogRaw("Current: ",T003A2_A3123ArtAncSal2[0]);
            }
            if ( Z3122ArtAncSal1 != T003A2_A3122ArtAncSal1[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtAncSal1");
               GXutil.writeLogRaw("Old: ",Z3122ArtAncSal1);
               GXutil.writeLogRaw("Current: ",T003A2_A3122ArtAncSal1[0]);
            }
            if ( GXutil.strcmp(Z2834ArtPle2, T003A2_A2834ArtPle2[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtPle2");
               GXutil.writeLogRaw("Old: ",Z2834ArtPle2);
               GXutil.writeLogRaw("Current: ",T003A2_A2834ArtPle2[0]);
            }
            if ( GXutil.strcmp(Z7779ArtBlo, T003A2_A7779ArtBlo[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"ArtBlo");
               GXutil.writeLogRaw("Old: ",Z7779ArtBlo);
               GXutil.writeLogRaw("Current: ",T003A2_A7779ArtBlo[0]);
            }
            if ( Z829TipArtCod != T003A2_A829TipArtCod[0] )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"TipArtCod");
               GXutil.writeLogRaw("Old: ",Z829TipArtCod);
               GXutil.writeLogRaw("Current: ",T003A2_A829TipArtCod[0]);
            }
            if ( GXutil.strcmp(Z2707NumTexCod, T003A2_A2707NumTexCod[0]) != 0 )
            {
               GXutil.writeLogln("tartich:[seudo value changed for attri]"+"NumTexCod");
               GXutil.writeLogRaw("Old: ",Z2707NumTexCod);
               GXutil.writeLogRaw("Current: ",T003A2_A2707NumTexCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert3A10( )
   {
      beforeValidate3A10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable3A10( ) ;
      }
      if ( AnyError == 0 )
      {
         zm3A10( 0) ;
         checkOptimisticConcurrency3A10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm3A10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert3A10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003A16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n87ArtMat), A87ArtMat, Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n89ArtObs), A89ArtObs, Boolean.valueOf(n90ArtObsFac), A90ArtObsFac, Boolean.valueOf(n2750ArtNumTex1), Byte.valueOf(A2750ArtNumTex1), Boolean.valueOf(n2751ArtNumTex2), Short.valueOf(A2751ArtNumTex2), Boolean.valueOf(n3072ArtObsLon), A3072ArtObsLon, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n4980ArtCdb), A4980ArtCdb, Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n7779ArtBlo), A7779ArtBlo, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A829TipArtCod), Boolean.valueOf(n2707NumTexCod), A2707NumTexCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        resetCaption3A0( ) ;
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
            load3A10( ) ;
         }
         endLevel3A10( ) ;
      }
      closeExtendedTableCursors3A10( ) ;
   }

   public void update3A10( )
   {
      beforeValidate3A10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable3A10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency3A10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm3A10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate3A10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003A17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n87ArtMat), A87ArtMat, Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n89ArtObs), A89ArtObs, Boolean.valueOf(n90ArtObsFac), A90ArtObsFac, Boolean.valueOf(n2750ArtNumTex1), Byte.valueOf(A2750ArtNumTex1), Boolean.valueOf(n2751ArtNumTex2), Short.valueOf(A2751ArtNumTex2), Boolean.valueOf(n3072ArtObsLon), A3072ArtObsLon, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n4980ArtCdb), A4980ArtCdb, Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n7779ArtBlo), A7779ArtBlo, Short.valueOf(A829TipArtCod), Boolean.valueOf(n2707NumTexCod), A2707NumTexCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate3A10( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
                     tartich_impl.this.A396EmprCod = GXv_char1[0] ;
                     tartich_impl.this.A252CliCod = GXv_int2[0] ;
                     tartich_impl.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption3A0( ) ;
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
         endLevel3A10( ) ;
      }
      closeExtendedTableCursors3A10( ) ;
   }

   public void deferredUpdate3A10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate3A10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency3A10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls3A10( ) ;
         afterConfirm3A10( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete3A10( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T003A18 */
               pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound10 == 0 )
                     {
                        initAll3A10( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption3A0( ) ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel3A10( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls3A10( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T003A19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T003A19_A407EmprNom[0] ;
         n407EmprNom = T003A19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T003A20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T003A20_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A306CliUrg = T003A20_A306CliUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         pr_default.close(18);
         /* Using cursor T003A21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
         A830TipArtDsc = T003A21_A830TipArtDsc[0] ;
         n830TipArtDsc = T003A21_n830TipArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
         pr_default.close(19);
         /* Using cursor T003A22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n2707NumTexCod), A2707NumTexCod});
         A2708NumTexDsc = T003A22_A2708NumTexDsc[0] ;
         n2708NumTexDsc = T003A22_n2708NumTexDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2708NumTexDsc", A2708NumTexDsc);
         pr_default.close(20);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T003A23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T003A24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T003A25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T003A26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T003A27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T003A28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T003A29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T003A30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T003A31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T003A32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T003A33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T003A34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T003A35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T003A36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T003A37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T003A38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T003A39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T003A40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T003A41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T003A42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T003A43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T003A44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T003A45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T003A46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T003A47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T003A48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T003A49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T003A50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T003A51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T003A52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T003A53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T003A54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T003A55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T003A56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T003A57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T003A58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T003A59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T003A60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T003A61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T003A62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T003A63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T003A64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T003A65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T003A66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
      }
   }

   public void endLevel3A10( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete3A10( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tartich");
         if ( AnyError == 0 )
         {
            confirmValues3A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tartich");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart3A10( )
   {
      /* Using cursor T003A67 */
      pr_default.execute(65);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(65) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A396EmprCod = T003A67_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T003A67_A252CliCod[0] ;
         n252CliCod = T003A67_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T003A67_A65ArtCod[0] ;
         n65ArtCod = T003A67_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext3A10( )
   {
      /* Scan next routine */
      pr_default.readNext(65);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(65) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A396EmprCod = T003A67_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T003A67_A252CliCod[0] ;
         n252CliCod = T003A67_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T003A67_A65ArtCod[0] ;
         n65ArtCod = T003A67_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
   }

   public void scanEnd3A10( )
   {
      pr_default.close(65);
   }

   public void afterConfirm3A10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert3A10( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate3A10( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete3A10( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete3A10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate3A10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes3A10( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtArtMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMat_Enabled), 5, 0), true);
      edtTipArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), true);
      edtTipArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtDsc_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtArtEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtEti_Enabled), 5, 0), true);
      edtCliUrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUrg_Enabled), 5, 0), true);
      edtArtUrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrg_Enabled), 5, 0), true);
      edtArtTra1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTra1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTra1_Enabled), 5, 0), true);
      edtArtTra2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTra2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTra2_Enabled), 5, 0), true);
      edtArtTra3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTra3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTra3_Enabled), 5, 0), true);
      edtArtTraP1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTraP1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTraP1_Enabled), 5, 0), true);
      edtArtTraP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTraP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTraP2_Enabled), 5, 0), true);
      edtArtTraP3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTraP3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTraP3_Enabled), 5, 0), true);
      edtArtUrd1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrd1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrd1_Enabled), 5, 0), true);
      edtArtUrd2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrd2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrd2_Enabled), 5, 0), true);
      edtArtUrd3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrd3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrd3_Enabled), 5, 0), true);
      edtArtUrdP1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrdP1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrdP1_Enabled), 5, 0), true);
      edtArtUrdP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrdP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrdP2_Enabled), 5, 0), true);
      edtArtUrdP3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrdP3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrdP3_Enabled), 5, 0), true);
      edtArtNMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtNMtr_Enabled), 5, 0), true);
      edtArtObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtObs_Enabled), 5, 0), true);
      edtArtObsFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtObsFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtObsFac_Enabled), 5, 0), true);
      edtArtNumTex1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtNumTex1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtNumTex1_Enabled), 5, 0), true);
      edtArtNumTex2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtNumTex2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtNumTex2_Enabled), 5, 0), true);
      edtNumTexCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumTexCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumTexCod_Enabled), 5, 0), true);
      edtNumTexDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumTexDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumTexDsc_Enabled), 5, 0), true);
      edtArtObsLon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtObsLon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtObsLon_Enabled), 5, 0), true);
      edtArtFacAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtFacAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFacAbs_Enabled), 5, 0), true);
      edtArtFecCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtFecCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFecCre_Enabled), 5, 0), true);
      edtArtUsrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUsrCod_Enabled), 5, 0), true);
      edtArtFecMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtFecMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFecMod_Enabled), 5, 0), true);
      edtArtCdb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCdb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCdb_Enabled), 5, 0), true);
      edtArtAncSal2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAncSal2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAncSal2_Enabled), 5, 0), true);
      edtArtAncSal1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAncSal1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAncSal1_Enabled), 5, 0), true);
      edtArtPle2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPle2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPle2_Enabled), 5, 0), true);
      edtArtBlo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtBlo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtBlo_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes3A10( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues3A0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tartich", new String[] {}, new String[] {}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z87ArtMat", GXutil.rtrim( Z87ArtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z73ArtEti", GXutil.rtrim( Z73ArtEti));
      app.GxWebStd.gx_hidden_field( httpContext, "Z117ArtUrg", GXutil.ltrim( localUtil.ntoc( Z117ArtUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z105ArtTra1", GXutil.rtrim( Z105ArtTra1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z106ArtTra2", GXutil.rtrim( Z106ArtTra2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z107ArtTra3", GXutil.rtrim( Z107ArtTra3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z108ArtTraP1", GXutil.ltrim( localUtil.ntoc( Z108ArtTraP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z109ArtTraP2", GXutil.ltrim( localUtil.ntoc( Z109ArtTraP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z110ArtTraP3", GXutil.ltrim( localUtil.ntoc( Z110ArtTraP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z111ArtUrd1", GXutil.rtrim( Z111ArtUrd1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z112ArtUrd2", GXutil.rtrim( Z112ArtUrd2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z113ArtUrd3", GXutil.rtrim( Z113ArtUrd3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z114ArtUrdP1", GXutil.ltrim( localUtil.ntoc( Z114ArtUrdP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z115ArtUrdP2", GXutil.ltrim( localUtil.ntoc( Z115ArtUrdP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z116ArtUrdP3", GXutil.ltrim( localUtil.ntoc( Z116ArtUrdP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z967ArtNMtr", GXutil.rtrim( Z967ArtNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z89ArtObs", GXutil.rtrim( Z89ArtObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z90ArtObsFac", GXutil.rtrim( Z90ArtObsFac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2750ArtNumTex1", GXutil.ltrim( localUtil.ntoc( Z2750ArtNumTex1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2751ArtNumTex2", GXutil.ltrim( localUtil.ntoc( Z2751ArtNumTex2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2791ArtFacAbs", GXutil.ltrim( localUtil.ntoc( Z2791ArtFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3683ArtFecCre", localUtil.dtoc( Z3683ArtFecCre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4353ArtUsrCod", GXutil.rtrim( Z4353ArtUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4354ArtFecMod", localUtil.dtoc( Z4354ArtFecMod, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4980ArtCdb", GXutil.rtrim( Z4980ArtCdb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3123ArtAncSal2", GXutil.ltrim( localUtil.ntoc( Z3123ArtAncSal2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3122ArtAncSal1", GXutil.ltrim( localUtil.ntoc( Z3122ArtAncSal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2834ArtPle2", GXutil.rtrim( Z2834ArtPle2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7779ArtBlo", GXutil.rtrim( Z7779ArtBlo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z829TipArtCod", GXutil.ltrim( localUtil.ntoc( Z829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2707NumTexCod", GXutil.rtrim( Z2707NumTexCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tartich", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TARTICH" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO DE ARTICULOS", "") ;
   }

   public void initializeNonKey3A10( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A87ArtMat = "" ;
      n87ArtMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", A87ArtMat);
      A829TipArtCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
      A830TipArtDsc = "" ;
      n830TipArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A73ArtEti = "" ;
      n73ArtEti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
      A306CliUrg = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
      A117ArtUrg = (byte)(0) ;
      n117ArtUrg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
      A105ArtTra1 = "" ;
      n105ArtTra1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", A105ArtTra1);
      A106ArtTra2 = "" ;
      n106ArtTra2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", A106ArtTra2);
      A107ArtTra3 = "" ;
      n107ArtTra3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", A107ArtTra3);
      A108ArtTraP1 = (short)(0) ;
      n108ArtTraP1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
      A109ArtTraP2 = (short)(0) ;
      n109ArtTraP2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
      A110ArtTraP3 = (short)(0) ;
      n110ArtTraP3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
      A111ArtUrd1 = "" ;
      n111ArtUrd1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", A111ArtUrd1);
      A112ArtUrd2 = "" ;
      n112ArtUrd2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", A112ArtUrd2);
      A113ArtUrd3 = "" ;
      n113ArtUrd3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", A113ArtUrd3);
      A114ArtUrdP1 = (short)(0) ;
      n114ArtUrdP1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
      A115ArtUrdP2 = (short)(0) ;
      n115ArtUrdP2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
      A116ArtUrdP3 = (short)(0) ;
      n116ArtUrdP3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
      A967ArtNMtr = "" ;
      n967ArtNMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
      A89ArtObs = "" ;
      n89ArtObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A89ArtObs", A89ArtObs);
      A90ArtObsFac = "" ;
      n90ArtObsFac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A90ArtObsFac", A90ArtObsFac);
      A2750ArtNumTex1 = (byte)(0) ;
      n2750ArtNumTex1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2750ArtNumTex1", GXutil.str( A2750ArtNumTex1, 1, 0));
      A2751ArtNumTex2 = (short)(0) ;
      n2751ArtNumTex2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2751ArtNumTex2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2751ArtNumTex2), 3, 0));
      A2707NumTexCod = "" ;
      n2707NumTexCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2707NumTexCod", A2707NumTexCod);
      A2708NumTexDsc = "" ;
      n2708NumTexDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2708NumTexDsc", A2708NumTexDsc);
      A3072ArtObsLon = "" ;
      n3072ArtObsLon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3072ArtObsLon", A3072ArtObsLon);
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      n2791ArtFacAbs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
      A3683ArtFecCre = GXutil.nullDate() ;
      n3683ArtFecCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
      A4353ArtUsrCod = "" ;
      n4353ArtUsrCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", A4353ArtUsrCod);
      A4354ArtFecMod = GXutil.nullDate() ;
      n4354ArtFecMod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
      A4980ArtCdb = "" ;
      n4980ArtCdb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4980ArtCdb", A4980ArtCdb);
      A3123ArtAncSal2 = (short)(0) ;
      n3123ArtAncSal2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
      A3122ArtAncSal1 = (short)(0) ;
      n3122ArtAncSal1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
      A2834ArtPle2 = "" ;
      n2834ArtPle2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", A2834ArtPle2);
      A7779ArtBlo = "" ;
      n7779ArtBlo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7779ArtBlo", A7779ArtBlo);
      Z87ArtMat = "" ;
      Z69ArtDsc = "" ;
      Z73ArtEti = "" ;
      Z117ArtUrg = (byte)(0) ;
      Z105ArtTra1 = "" ;
      Z106ArtTra2 = "" ;
      Z107ArtTra3 = "" ;
      Z108ArtTraP1 = (short)(0) ;
      Z109ArtTraP2 = (short)(0) ;
      Z110ArtTraP3 = (short)(0) ;
      Z111ArtUrd1 = "" ;
      Z112ArtUrd2 = "" ;
      Z113ArtUrd3 = "" ;
      Z114ArtUrdP1 = (short)(0) ;
      Z115ArtUrdP2 = (short)(0) ;
      Z116ArtUrdP3 = (short)(0) ;
      Z967ArtNMtr = "" ;
      Z89ArtObs = "" ;
      Z90ArtObsFac = "" ;
      Z2750ArtNumTex1 = (byte)(0) ;
      Z2751ArtNumTex2 = (short)(0) ;
      Z2791ArtFacAbs = DecimalUtil.ZERO ;
      Z3683ArtFecCre = GXutil.nullDate() ;
      Z4353ArtUsrCod = "" ;
      Z4354ArtFecMod = GXutil.nullDate() ;
      Z4980ArtCdb = "" ;
      Z3123ArtAncSal2 = (short)(0) ;
      Z3122ArtAncSal1 = (short)(0) ;
      Z2834ArtPle2 = "" ;
      Z7779ArtBlo = "" ;
      Z829TipArtCod = (short)(0) ;
      Z2707NumTexCod = "" ;
   }

   public void initAll3A10( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      n65ArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      initializeNonKey3A10( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241563116", true, true);
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
      httpContext.AddJavascriptSource("tartich.js", "?20268241563116", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtArtMat_Internalname = "ARTMAT" ;
      edtTipArtCod_Internalname = "TIPARTCOD" ;
      edtTipArtDsc_Internalname = "TIPARTDSC" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      edtArtEti_Internalname = "ARTETI" ;
      edtCliUrg_Internalname = "CLIURG" ;
      edtArtUrg_Internalname = "ARTURG" ;
      edtArtTra1_Internalname = "ARTTRA1" ;
      edtArtTra2_Internalname = "ARTTRA2" ;
      edtArtTra3_Internalname = "ARTTRA3" ;
      edtArtTraP1_Internalname = "ARTTRAP1" ;
      edtArtTraP2_Internalname = "ARTTRAP2" ;
      edtArtTraP3_Internalname = "ARTTRAP3" ;
      edtArtUrd1_Internalname = "ARTURD1" ;
      edtArtUrd2_Internalname = "ARTURD2" ;
      edtArtUrd3_Internalname = "ARTURD3" ;
      edtArtUrdP1_Internalname = "ARTURDP1" ;
      edtArtUrdP2_Internalname = "ARTURDP2" ;
      edtArtUrdP3_Internalname = "ARTURDP3" ;
      edtArtNMtr_Internalname = "ARTNMTR" ;
      edtArtObs_Internalname = "ARTOBS" ;
      edtArtObsFac_Internalname = "ARTOBSFAC" ;
      edtArtNumTex1_Internalname = "ARTNUMTEX1" ;
      edtArtNumTex2_Internalname = "ARTNUMTEX2" ;
      edtNumTexCod_Internalname = "NUMTEXCOD" ;
      edtNumTexDsc_Internalname = "NUMTEXDSC" ;
      edtArtObsLon_Internalname = "ARTOBSLON" ;
      edtArtFacAbs_Internalname = "ARTFACABS" ;
      edtArtFecCre_Internalname = "ARTFECCRE" ;
      edtArtUsrCod_Internalname = "ARTUSRCOD" ;
      edtArtFecMod_Internalname = "ARTFECMOD" ;
      edtArtCdb_Internalname = "ARTCDB" ;
      edtArtAncSal2_Internalname = "ARTANCSAL2" ;
      edtArtAncSal1_Internalname = "ARTANCSAL1" ;
      edtArtPle2_Internalname = "ARTPLE2" ;
      edtArtBlo_Internalname = "ARTBLO" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO DE ARTICULOS", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtArtBlo_Jsonclick = "" ;
      edtArtBlo_Enabled = 1 ;
      edtArtPle2_Jsonclick = "" ;
      edtArtPle2_Enabled = 1 ;
      edtArtAncSal1_Jsonclick = "" ;
      edtArtAncSal1_Enabled = 1 ;
      edtArtAncSal2_Jsonclick = "" ;
      edtArtAncSal2_Enabled = 1 ;
      edtArtCdb_Jsonclick = "" ;
      edtArtCdb_Enabled = 1 ;
      edtArtFecMod_Jsonclick = "" ;
      edtArtFecMod_Enabled = 1 ;
      edtArtUsrCod_Jsonclick = "" ;
      edtArtUsrCod_Enabled = 1 ;
      edtArtFecCre_Jsonclick = "" ;
      edtArtFecCre_Enabled = 1 ;
      edtArtFacAbs_Jsonclick = "" ;
      edtArtFacAbs_Enabled = 1 ;
      edtArtObsLon_Enabled = 1 ;
      edtNumTexDsc_Jsonclick = "" ;
      edtNumTexDsc_Enabled = 0 ;
      edtNumTexCod_Jsonclick = "" ;
      edtNumTexCod_Enabled = 1 ;
      edtArtNumTex2_Jsonclick = "" ;
      edtArtNumTex2_Enabled = 1 ;
      edtArtNumTex1_Jsonclick = "" ;
      edtArtNumTex1_Enabled = 1 ;
      edtArtObsFac_Enabled = 1 ;
      edtArtObs_Jsonclick = "" ;
      edtArtObs_Enabled = 1 ;
      edtArtNMtr_Jsonclick = "" ;
      edtArtNMtr_Enabled = 1 ;
      edtArtUrdP3_Jsonclick = "" ;
      edtArtUrdP3_Enabled = 1 ;
      edtArtUrdP2_Jsonclick = "" ;
      edtArtUrdP2_Enabled = 1 ;
      edtArtUrdP1_Jsonclick = "" ;
      edtArtUrdP1_Enabled = 1 ;
      edtArtUrd3_Jsonclick = "" ;
      edtArtUrd3_Enabled = 1 ;
      edtArtUrd2_Jsonclick = "" ;
      edtArtUrd2_Enabled = 1 ;
      edtArtUrd1_Jsonclick = "" ;
      edtArtUrd1_Enabled = 1 ;
      edtArtTraP3_Jsonclick = "" ;
      edtArtTraP3_Enabled = 1 ;
      edtArtTraP2_Jsonclick = "" ;
      edtArtTraP2_Enabled = 1 ;
      edtArtTraP1_Jsonclick = "" ;
      edtArtTraP1_Enabled = 1 ;
      edtArtTra3_Jsonclick = "" ;
      edtArtTra3_Enabled = 1 ;
      edtArtTra2_Jsonclick = "" ;
      edtArtTra2_Enabled = 1 ;
      edtArtTra1_Jsonclick = "" ;
      edtArtTra1_Enabled = 1 ;
      edtArtUrg_Jsonclick = "" ;
      edtArtUrg_Enabled = 1 ;
      edtCliUrg_Jsonclick = "" ;
      edtCliUrg_Enabled = 0 ;
      edtArtEti_Jsonclick = "" ;
      edtArtEti_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Enabled = 1 ;
      edtTipArtDsc_Jsonclick = "" ;
      edtTipArtDsc_Enabled = 0 ;
      edtTipArtCod_Jsonclick = "" ;
      edtTipArtCod_Enabled = 1 ;
      edtArtMat_Jsonclick = "" ;
      edtArtMat_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
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

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T003A19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T003A19_A407EmprNom[0] ;
      n407EmprNom = T003A19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T003A20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T003A20_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A306CliUrg = T003A20_A306CliUrg[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
      pr_default.close(18);
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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
      /* Using cursor T003A19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T003A19_A407EmprNom[0] ;
      n407EmprNom = T003A19_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T003A20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T003A20_A279CliNom[0] ;
      A306CliUrg = T003A20_A306CliUrg[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Artcod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", GXutil.rtrim( A87ArtMat));
      httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", GXutil.rtrim( A73ArtEti));
      httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.ltrim( localUtil.ntoc( A117ArtUrg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", GXutil.rtrim( A105ArtTra1));
      httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", GXutil.rtrim( A106ArtTra2));
      httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", GXutil.rtrim( A107ArtTra3));
      httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrim( localUtil.ntoc( A108ArtTraP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrim( localUtil.ntoc( A109ArtTraP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrim( localUtil.ntoc( A110ArtTraP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", GXutil.rtrim( A111ArtUrd1));
      httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", GXutil.rtrim( A112ArtUrd2));
      httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", GXutil.rtrim( A113ArtUrd3));
      httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrim( localUtil.ntoc( A114ArtUrdP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrim( localUtil.ntoc( A115ArtUrdP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrim( localUtil.ntoc( A116ArtUrdP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", GXutil.rtrim( A967ArtNMtr));
      httpContext.ajax_rsp_assign_attri("", false, "A89ArtObs", GXutil.rtrim( A89ArtObs));
      httpContext.ajax_rsp_assign_attri("", false, "A90ArtObsFac", GXutil.rtrim( A90ArtObsFac));
      httpContext.ajax_rsp_assign_attri("", false, "A2750ArtNumTex1", GXutil.ltrim( localUtil.ntoc( A2750ArtNumTex1, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2751ArtNumTex2", GXutil.ltrim( localUtil.ntoc( A2751ArtNumTex2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2707NumTexCod", GXutil.rtrim( A2707NumTexCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3072ArtObsLon", A3072ArtObsLon);
      httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrim( localUtil.ntoc( A2791ArtFacAbs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", GXutil.rtrim( A4353ArtUsrCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
      httpContext.ajax_rsp_assign_attri("", false, "A4980ArtCdb", GXutil.rtrim( A4980ArtCdb));
      httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrim( localUtil.ntoc( A3123ArtAncSal2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrim( localUtil.ntoc( A3122ArtAncSal1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", GXutil.rtrim( A2834ArtPle2));
      httpContext.ajax_rsp_assign_attri("", false, "A7779ArtBlo", GXutil.rtrim( A7779ArtBlo));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", GXutil.rtrim( A830TipArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A2708NumTexDsc", GXutil.rtrim( A2708NumTexDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z87ArtMat", GXutil.rtrim( Z87ArtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z829TipArtCod", GXutil.ltrim( localUtil.ntoc( Z829TipArtCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z73ArtEti", GXutil.rtrim( Z73ArtEti));
      app.GxWebStd.gx_hidden_field( httpContext, "Z117ArtUrg", GXutil.ltrim( localUtil.ntoc( Z117ArtUrg, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z105ArtTra1", GXutil.rtrim( Z105ArtTra1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z106ArtTra2", GXutil.rtrim( Z106ArtTra2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z107ArtTra3", GXutil.rtrim( Z107ArtTra3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z108ArtTraP1", GXutil.ltrim( localUtil.ntoc( Z108ArtTraP1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z109ArtTraP2", GXutil.ltrim( localUtil.ntoc( Z109ArtTraP2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z110ArtTraP3", GXutil.ltrim( localUtil.ntoc( Z110ArtTraP3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z111ArtUrd1", GXutil.rtrim( Z111ArtUrd1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z112ArtUrd2", GXutil.rtrim( Z112ArtUrd2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z113ArtUrd3", GXutil.rtrim( Z113ArtUrd3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z114ArtUrdP1", GXutil.ltrim( localUtil.ntoc( Z114ArtUrdP1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z115ArtUrdP2", GXutil.ltrim( localUtil.ntoc( Z115ArtUrdP2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z116ArtUrdP3", GXutil.ltrim( localUtil.ntoc( Z116ArtUrdP3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z967ArtNMtr", GXutil.rtrim( Z967ArtNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z89ArtObs", GXutil.rtrim( Z89ArtObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z90ArtObsFac", GXutil.rtrim( Z90ArtObsFac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2750ArtNumTex1", GXutil.ltrim( localUtil.ntoc( Z2750ArtNumTex1, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2751ArtNumTex2", GXutil.ltrim( localUtil.ntoc( Z2751ArtNumTex2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2707NumTexCod", GXutil.rtrim( Z2707NumTexCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3072ArtObsLon", Z3072ArtObsLon);
      app.GxWebStd.gx_hidden_field( httpContext, "Z2791ArtFacAbs", GXutil.ltrim( localUtil.ntoc( Z2791ArtFacAbs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3683ArtFecCre", localUtil.format(Z3683ArtFecCre, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4353ArtUsrCod", GXutil.rtrim( Z4353ArtUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4354ArtFecMod", localUtil.format(Z4354ArtFecMod, "99/99/9999"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4980ArtCdb", GXutil.rtrim( Z4980ArtCdb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3123ArtAncSal2", GXutil.ltrim( localUtil.ntoc( Z3123ArtAncSal2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3122ArtAncSal1", GXutil.ltrim( localUtil.ntoc( Z3122ArtAncSal1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2834ArtPle2", GXutil.rtrim( Z2834ArtPle2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7779ArtBlo", GXutil.rtrim( Z7779ArtBlo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z830TipArtDsc", GXutil.rtrim( Z830TipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2708NumTexDsc", GXutil.rtrim( Z2708NumTexDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z306CliUrg", GXutil.ltrim( localUtil.ntoc( Z306CliUrg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tipartcod( )
   {
      n830TipArtDsc = false ;
      /* Using cursor T003A21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A830TipArtDsc = T003A21_A830TipArtDsc[0] ;
      n830TipArtDsc = T003A21_n830TipArtDsc[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", GXutil.rtrim( A830TipArtDsc));
   }

   public void valid_Numtexcod( )
   {
      n2707NumTexCod = false ;
      n2708NumTexDsc = false ;
      /* Using cursor T003A22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n2707NumTexCod), A2707NumTexCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "NUMTEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "NUMTEXCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A2708NumTexDsc = T003A22_A2708NumTexDsc[0] ;
      n2708NumTexDsc = T003A22_n2708NumTexDsc[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2708NumTexDsc", GXutil.rtrim( A2708NumTexDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A306CliUrg',fld:'CLIURG',pic:'9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A306CliUrg',fld:'CLIURG',pic:'9'}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A87ArtMat',fld:'ARTMAT',pic:''},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A73ArtEti',fld:'ARTETI',pic:'@!'},{av:'A117ArtUrg',fld:'ARTURG',pic:'9'},{av:'A105ArtTra1',fld:'ARTTRA1',pic:''},{av:'A106ArtTra2',fld:'ARTTRA2',pic:''},{av:'A107ArtTra3',fld:'ARTTRA3',pic:''},{av:'A108ArtTraP1',fld:'ARTTRAP1',pic:'ZZ9'},{av:'A109ArtTraP2',fld:'ARTTRAP2',pic:'ZZ9'},{av:'A110ArtTraP3',fld:'ARTTRAP3',pic:'ZZ9'},{av:'A111ArtUrd1',fld:'ARTURD1',pic:''},{av:'A112ArtUrd2',fld:'ARTURD2',pic:''},{av:'A113ArtUrd3',fld:'ARTURD3',pic:''},{av:'A114ArtUrdP1',fld:'ARTURDP1',pic:'ZZ9'},{av:'A115ArtUrdP2',fld:'ARTURDP2',pic:'ZZ9'},{av:'A116ArtUrdP3',fld:'ARTURDP3',pic:'ZZ9'},{av:'A967ArtNMtr',fld:'ARTNMTR',pic:''},{av:'A89ArtObs',fld:'ARTOBS',pic:''},{av:'A90ArtObsFac',fld:'ARTOBSFAC',pic:''},{av:'A2750ArtNumTex1',fld:'ARTNUMTEX1',pic:'9'},{av:'A2751ArtNumTex2',fld:'ARTNUMTEX2',pic:'ZZ9'},{av:'A2707NumTexCod',fld:'NUMTEXCOD',pic:''},{av:'A3072ArtObsLon',fld:'ARTOBSLON',pic:''},{av:'A2791ArtFacAbs',fld:'ARTFACABS',pic:'ZZ9.99'},{av:'A3683ArtFecCre',fld:'ARTFECCRE',pic:''},{av:'A4353ArtUsrCod',fld:'ARTUSRCOD',pic:''},{av:'A4354ArtFecMod',fld:'ARTFECMOD',pic:''},{av:'A4980ArtCdb',fld:'ARTCDB',pic:''},{av:'A3123ArtAncSal2',fld:'ARTANCSAL2',pic:'ZZZ9'},{av:'A3122ArtAncSal1',fld:'ARTANCSAL1',pic:'ZZZ9'},{av:'A2834ArtPle2',fld:'ARTPLE2',pic:''},{av:'A7779ArtBlo',fld:'ARTBLO',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A830TipArtDsc',fld:'TIPARTDSC',pic:''},{av:'A2708NumTexDsc',fld:'NUMTEXDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A306CliUrg',fld:'CLIURG',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z87ArtMat'},{av:'Z829TipArtCod'},{av:'Z69ArtDsc'},{av:'Z73ArtEti'},{av:'Z117ArtUrg'},{av:'Z105ArtTra1'},{av:'Z106ArtTra2'},{av:'Z107ArtTra3'},{av:'Z108ArtTraP1'},{av:'Z109ArtTraP2'},{av:'Z110ArtTraP3'},{av:'Z111ArtUrd1'},{av:'Z112ArtUrd2'},{av:'Z113ArtUrd3'},{av:'Z114ArtUrdP1'},{av:'Z115ArtUrdP2'},{av:'Z116ArtUrdP3'},{av:'Z967ArtNMtr'},{av:'Z89ArtObs'},{av:'Z90ArtObsFac'},{av:'Z2750ArtNumTex1'},{av:'Z2751ArtNumTex2'},{av:'Z2707NumTexCod'},{av:'Z3072ArtObsLon'},{av:'Z2791ArtFacAbs'},{av:'Z3683ArtFecCre'},{av:'Z4353ArtUsrCod'},{av:'Z4354ArtFecMod'},{av:'Z4980ArtCdb'},{av:'Z3123ArtAncSal2'},{av:'Z3122ArtAncSal1'},{av:'Z2834ArtPle2'},{av:'Z7779ArtBlo'},{av:'Z407EmprNom'},{av:'Z830TipArtDsc'},{av:'Z2708NumTexDsc'},{av:'Z279CliNom'},{av:'Z306CliUrg'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_TIPARTCOD","{handler:'valid_Tipartcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'A830TipArtDsc',fld:'TIPARTDSC',pic:''}]");
      setEventMetadata("VALID_TIPARTCOD",",oparms:[{av:'A830TipArtDsc',fld:'TIPARTDSC',pic:''}]}");
      setEventMetadata("VALID_ARTETI","{handler:'valid_Arteti',iparms:[]");
      setEventMetadata("VALID_ARTETI",",oparms:[]}");
      setEventMetadata("VALID_ARTURG","{handler:'valid_Arturg',iparms:[]");
      setEventMetadata("VALID_ARTURG",",oparms:[]}");
      setEventMetadata("VALID_NUMTEXCOD","{handler:'valid_Numtexcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2707NumTexCod',fld:'NUMTEXCOD',pic:''},{av:'A2708NumTexDsc',fld:'NUMTEXDSC',pic:''}]");
      setEventMetadata("VALID_NUMTEXCOD",",oparms:[{av:'A2708NumTexDsc',fld:'NUMTEXDSC',pic:''}]}");
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
      pr_default.close(18);
      pr_default.close(17);
      pr_default.close(19);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z87ArtMat = "" ;
      Z69ArtDsc = "" ;
      Z73ArtEti = "" ;
      Z105ArtTra1 = "" ;
      Z106ArtTra2 = "" ;
      Z107ArtTra3 = "" ;
      Z111ArtUrd1 = "" ;
      Z112ArtUrd2 = "" ;
      Z113ArtUrd3 = "" ;
      Z967ArtNMtr = "" ;
      Z89ArtObs = "" ;
      Z90ArtObsFac = "" ;
      Z2791ArtFacAbs = DecimalUtil.ZERO ;
      Z3683ArtFecCre = GXutil.nullDate() ;
      Z4353ArtUsrCod = "" ;
      Z4354ArtFecMod = GXutil.nullDate() ;
      Z4980ArtCdb = "" ;
      Z2834ArtPle2 = "" ;
      Z7779ArtBlo = "" ;
      Z2707NumTexCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A2707NumTexCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A65ArtCod = "" ;
      A279CliNom = "" ;
      A407EmprNom = "" ;
      A87ArtMat = "" ;
      A830TipArtDsc = "" ;
      A69ArtDsc = "" ;
      A73ArtEti = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      A967ArtNMtr = "" ;
      A89ArtObs = "" ;
      A90ArtObsFac = "" ;
      A2708NumTexDsc = "" ;
      A3072ArtObsLon = "" ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A3683ArtFecCre = GXutil.nullDate() ;
      A4353ArtUsrCod = "" ;
      A4354ArtFecMod = GXutil.nullDate() ;
      A4980ArtCdb = "" ;
      A2834ArtPle2 = "" ;
      A7779ArtBlo = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z3072ArtObsLon = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z830TipArtDsc = "" ;
      Z2708NumTexDsc = "" ;
      T003A8_A3072ArtObsLon = new String[] {""} ;
      T003A8_n3072ArtObsLon = new boolean[] {false} ;
      T003A8_A65ArtCod = new String[] {""} ;
      T003A8_n65ArtCod = new boolean[] {false} ;
      T003A8_A279CliNom = new String[] {""} ;
      T003A8_A407EmprNom = new String[] {""} ;
      T003A8_n407EmprNom = new boolean[] {false} ;
      T003A8_A87ArtMat = new String[] {""} ;
      T003A8_n87ArtMat = new boolean[] {false} ;
      T003A8_A830TipArtDsc = new String[] {""} ;
      T003A8_n830TipArtDsc = new boolean[] {false} ;
      T003A8_A69ArtDsc = new String[] {""} ;
      T003A8_n69ArtDsc = new boolean[] {false} ;
      T003A8_A73ArtEti = new String[] {""} ;
      T003A8_n73ArtEti = new boolean[] {false} ;
      T003A8_A306CliUrg = new byte[1] ;
      T003A8_A117ArtUrg = new byte[1] ;
      T003A8_n117ArtUrg = new boolean[] {false} ;
      T003A8_A105ArtTra1 = new String[] {""} ;
      T003A8_n105ArtTra1 = new boolean[] {false} ;
      T003A8_A106ArtTra2 = new String[] {""} ;
      T003A8_n106ArtTra2 = new boolean[] {false} ;
      T003A8_A107ArtTra3 = new String[] {""} ;
      T003A8_n107ArtTra3 = new boolean[] {false} ;
      T003A8_A108ArtTraP1 = new short[1] ;
      T003A8_n108ArtTraP1 = new boolean[] {false} ;
      T003A8_A109ArtTraP2 = new short[1] ;
      T003A8_n109ArtTraP2 = new boolean[] {false} ;
      T003A8_A110ArtTraP3 = new short[1] ;
      T003A8_n110ArtTraP3 = new boolean[] {false} ;
      T003A8_A111ArtUrd1 = new String[] {""} ;
      T003A8_n111ArtUrd1 = new boolean[] {false} ;
      T003A8_A112ArtUrd2 = new String[] {""} ;
      T003A8_n112ArtUrd2 = new boolean[] {false} ;
      T003A8_A113ArtUrd3 = new String[] {""} ;
      T003A8_n113ArtUrd3 = new boolean[] {false} ;
      T003A8_A114ArtUrdP1 = new short[1] ;
      T003A8_n114ArtUrdP1 = new boolean[] {false} ;
      T003A8_A115ArtUrdP2 = new short[1] ;
      T003A8_n115ArtUrdP2 = new boolean[] {false} ;
      T003A8_A116ArtUrdP3 = new short[1] ;
      T003A8_n116ArtUrdP3 = new boolean[] {false} ;
      T003A8_A967ArtNMtr = new String[] {""} ;
      T003A8_n967ArtNMtr = new boolean[] {false} ;
      T003A8_A89ArtObs = new String[] {""} ;
      T003A8_n89ArtObs = new boolean[] {false} ;
      T003A8_A90ArtObsFac = new String[] {""} ;
      T003A8_n90ArtObsFac = new boolean[] {false} ;
      T003A8_A2750ArtNumTex1 = new byte[1] ;
      T003A8_n2750ArtNumTex1 = new boolean[] {false} ;
      T003A8_A2751ArtNumTex2 = new short[1] ;
      T003A8_n2751ArtNumTex2 = new boolean[] {false} ;
      T003A8_A2708NumTexDsc = new String[] {""} ;
      T003A8_n2708NumTexDsc = new boolean[] {false} ;
      T003A8_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003A8_n2791ArtFacAbs = new boolean[] {false} ;
      T003A8_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      T003A8_n3683ArtFecCre = new boolean[] {false} ;
      T003A8_A4353ArtUsrCod = new String[] {""} ;
      T003A8_n4353ArtUsrCod = new boolean[] {false} ;
      T003A8_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T003A8_n4354ArtFecMod = new boolean[] {false} ;
      T003A8_A4980ArtCdb = new String[] {""} ;
      T003A8_n4980ArtCdb = new boolean[] {false} ;
      T003A8_A3123ArtAncSal2 = new short[1] ;
      T003A8_n3123ArtAncSal2 = new boolean[] {false} ;
      T003A8_A3122ArtAncSal1 = new short[1] ;
      T003A8_n3122ArtAncSal1 = new boolean[] {false} ;
      T003A8_A2834ArtPle2 = new String[] {""} ;
      T003A8_n2834ArtPle2 = new boolean[] {false} ;
      T003A8_A7779ArtBlo = new String[] {""} ;
      T003A8_n7779ArtBlo = new boolean[] {false} ;
      T003A8_A396EmprCod = new String[] {""} ;
      T003A8_A252CliCod = new int[1] ;
      T003A8_n252CliCod = new boolean[] {false} ;
      T003A8_A829TipArtCod = new short[1] ;
      T003A8_A2707NumTexCod = new String[] {""} ;
      T003A8_n2707NumTexCod = new boolean[] {false} ;
      T003A4_A407EmprNom = new String[] {""} ;
      T003A4_n407EmprNom = new boolean[] {false} ;
      T003A6_A830TipArtDsc = new String[] {""} ;
      T003A6_n830TipArtDsc = new boolean[] {false} ;
      T003A7_A2708NumTexDsc = new String[] {""} ;
      T003A7_n2708NumTexDsc = new boolean[] {false} ;
      T003A5_A279CliNom = new String[] {""} ;
      T003A5_A306CliUrg = new byte[1] ;
      T003A9_A407EmprNom = new String[] {""} ;
      T003A9_n407EmprNom = new boolean[] {false} ;
      T003A10_A830TipArtDsc = new String[] {""} ;
      T003A10_n830TipArtDsc = new boolean[] {false} ;
      T003A11_A2708NumTexDsc = new String[] {""} ;
      T003A11_n2708NumTexDsc = new boolean[] {false} ;
      T003A12_A279CliNom = new String[] {""} ;
      T003A12_A306CliUrg = new byte[1] ;
      T003A13_A396EmprCod = new String[] {""} ;
      T003A13_A252CliCod = new int[1] ;
      T003A13_n252CliCod = new boolean[] {false} ;
      T003A13_A65ArtCod = new String[] {""} ;
      T003A13_n65ArtCod = new boolean[] {false} ;
      T003A3_A3072ArtObsLon = new String[] {""} ;
      T003A3_n3072ArtObsLon = new boolean[] {false} ;
      T003A3_A65ArtCod = new String[] {""} ;
      T003A3_n65ArtCod = new boolean[] {false} ;
      T003A3_A87ArtMat = new String[] {""} ;
      T003A3_n87ArtMat = new boolean[] {false} ;
      T003A3_A69ArtDsc = new String[] {""} ;
      T003A3_n69ArtDsc = new boolean[] {false} ;
      T003A3_A73ArtEti = new String[] {""} ;
      T003A3_n73ArtEti = new boolean[] {false} ;
      T003A3_A117ArtUrg = new byte[1] ;
      T003A3_n117ArtUrg = new boolean[] {false} ;
      T003A3_A105ArtTra1 = new String[] {""} ;
      T003A3_n105ArtTra1 = new boolean[] {false} ;
      T003A3_A106ArtTra2 = new String[] {""} ;
      T003A3_n106ArtTra2 = new boolean[] {false} ;
      T003A3_A107ArtTra3 = new String[] {""} ;
      T003A3_n107ArtTra3 = new boolean[] {false} ;
      T003A3_A108ArtTraP1 = new short[1] ;
      T003A3_n108ArtTraP1 = new boolean[] {false} ;
      T003A3_A109ArtTraP2 = new short[1] ;
      T003A3_n109ArtTraP2 = new boolean[] {false} ;
      T003A3_A110ArtTraP3 = new short[1] ;
      T003A3_n110ArtTraP3 = new boolean[] {false} ;
      T003A3_A111ArtUrd1 = new String[] {""} ;
      T003A3_n111ArtUrd1 = new boolean[] {false} ;
      T003A3_A112ArtUrd2 = new String[] {""} ;
      T003A3_n112ArtUrd2 = new boolean[] {false} ;
      T003A3_A113ArtUrd3 = new String[] {""} ;
      T003A3_n113ArtUrd3 = new boolean[] {false} ;
      T003A3_A114ArtUrdP1 = new short[1] ;
      T003A3_n114ArtUrdP1 = new boolean[] {false} ;
      T003A3_A115ArtUrdP2 = new short[1] ;
      T003A3_n115ArtUrdP2 = new boolean[] {false} ;
      T003A3_A116ArtUrdP3 = new short[1] ;
      T003A3_n116ArtUrdP3 = new boolean[] {false} ;
      T003A3_A967ArtNMtr = new String[] {""} ;
      T003A3_n967ArtNMtr = new boolean[] {false} ;
      T003A3_A89ArtObs = new String[] {""} ;
      T003A3_n89ArtObs = new boolean[] {false} ;
      T003A3_A90ArtObsFac = new String[] {""} ;
      T003A3_n90ArtObsFac = new boolean[] {false} ;
      T003A3_A2750ArtNumTex1 = new byte[1] ;
      T003A3_n2750ArtNumTex1 = new boolean[] {false} ;
      T003A3_A2751ArtNumTex2 = new short[1] ;
      T003A3_n2751ArtNumTex2 = new boolean[] {false} ;
      T003A3_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003A3_n2791ArtFacAbs = new boolean[] {false} ;
      T003A3_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      T003A3_n3683ArtFecCre = new boolean[] {false} ;
      T003A3_A4353ArtUsrCod = new String[] {""} ;
      T003A3_n4353ArtUsrCod = new boolean[] {false} ;
      T003A3_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T003A3_n4354ArtFecMod = new boolean[] {false} ;
      T003A3_A4980ArtCdb = new String[] {""} ;
      T003A3_n4980ArtCdb = new boolean[] {false} ;
      T003A3_A3123ArtAncSal2 = new short[1] ;
      T003A3_n3123ArtAncSal2 = new boolean[] {false} ;
      T003A3_A3122ArtAncSal1 = new short[1] ;
      T003A3_n3122ArtAncSal1 = new boolean[] {false} ;
      T003A3_A2834ArtPle2 = new String[] {""} ;
      T003A3_n2834ArtPle2 = new boolean[] {false} ;
      T003A3_A7779ArtBlo = new String[] {""} ;
      T003A3_n7779ArtBlo = new boolean[] {false} ;
      T003A3_A396EmprCod = new String[] {""} ;
      T003A3_A252CliCod = new int[1] ;
      T003A3_n252CliCod = new boolean[] {false} ;
      T003A3_A829TipArtCod = new short[1] ;
      T003A3_A2707NumTexCod = new String[] {""} ;
      T003A3_n2707NumTexCod = new boolean[] {false} ;
      sMode10 = "" ;
      T003A14_A396EmprCod = new String[] {""} ;
      T003A14_A252CliCod = new int[1] ;
      T003A14_n252CliCod = new boolean[] {false} ;
      T003A14_A65ArtCod = new String[] {""} ;
      T003A14_n65ArtCod = new boolean[] {false} ;
      T003A15_A396EmprCod = new String[] {""} ;
      T003A15_A252CliCod = new int[1] ;
      T003A15_n252CliCod = new boolean[] {false} ;
      T003A15_A65ArtCod = new String[] {""} ;
      T003A15_n65ArtCod = new boolean[] {false} ;
      T003A2_A3072ArtObsLon = new String[] {""} ;
      T003A2_n3072ArtObsLon = new boolean[] {false} ;
      T003A2_A65ArtCod = new String[] {""} ;
      T003A2_n65ArtCod = new boolean[] {false} ;
      T003A2_A87ArtMat = new String[] {""} ;
      T003A2_n87ArtMat = new boolean[] {false} ;
      T003A2_A69ArtDsc = new String[] {""} ;
      T003A2_n69ArtDsc = new boolean[] {false} ;
      T003A2_A73ArtEti = new String[] {""} ;
      T003A2_n73ArtEti = new boolean[] {false} ;
      T003A2_A117ArtUrg = new byte[1] ;
      T003A2_n117ArtUrg = new boolean[] {false} ;
      T003A2_A105ArtTra1 = new String[] {""} ;
      T003A2_n105ArtTra1 = new boolean[] {false} ;
      T003A2_A106ArtTra2 = new String[] {""} ;
      T003A2_n106ArtTra2 = new boolean[] {false} ;
      T003A2_A107ArtTra3 = new String[] {""} ;
      T003A2_n107ArtTra3 = new boolean[] {false} ;
      T003A2_A108ArtTraP1 = new short[1] ;
      T003A2_n108ArtTraP1 = new boolean[] {false} ;
      T003A2_A109ArtTraP2 = new short[1] ;
      T003A2_n109ArtTraP2 = new boolean[] {false} ;
      T003A2_A110ArtTraP3 = new short[1] ;
      T003A2_n110ArtTraP3 = new boolean[] {false} ;
      T003A2_A111ArtUrd1 = new String[] {""} ;
      T003A2_n111ArtUrd1 = new boolean[] {false} ;
      T003A2_A112ArtUrd2 = new String[] {""} ;
      T003A2_n112ArtUrd2 = new boolean[] {false} ;
      T003A2_A113ArtUrd3 = new String[] {""} ;
      T003A2_n113ArtUrd3 = new boolean[] {false} ;
      T003A2_A114ArtUrdP1 = new short[1] ;
      T003A2_n114ArtUrdP1 = new boolean[] {false} ;
      T003A2_A115ArtUrdP2 = new short[1] ;
      T003A2_n115ArtUrdP2 = new boolean[] {false} ;
      T003A2_A116ArtUrdP3 = new short[1] ;
      T003A2_n116ArtUrdP3 = new boolean[] {false} ;
      T003A2_A967ArtNMtr = new String[] {""} ;
      T003A2_n967ArtNMtr = new boolean[] {false} ;
      T003A2_A89ArtObs = new String[] {""} ;
      T003A2_n89ArtObs = new boolean[] {false} ;
      T003A2_A90ArtObsFac = new String[] {""} ;
      T003A2_n90ArtObsFac = new boolean[] {false} ;
      T003A2_A2750ArtNumTex1 = new byte[1] ;
      T003A2_n2750ArtNumTex1 = new boolean[] {false} ;
      T003A2_A2751ArtNumTex2 = new short[1] ;
      T003A2_n2751ArtNumTex2 = new boolean[] {false} ;
      T003A2_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003A2_n2791ArtFacAbs = new boolean[] {false} ;
      T003A2_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      T003A2_n3683ArtFecCre = new boolean[] {false} ;
      T003A2_A4353ArtUsrCod = new String[] {""} ;
      T003A2_n4353ArtUsrCod = new boolean[] {false} ;
      T003A2_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T003A2_n4354ArtFecMod = new boolean[] {false} ;
      T003A2_A4980ArtCdb = new String[] {""} ;
      T003A2_n4980ArtCdb = new boolean[] {false} ;
      T003A2_A3123ArtAncSal2 = new short[1] ;
      T003A2_n3123ArtAncSal2 = new boolean[] {false} ;
      T003A2_A3122ArtAncSal1 = new short[1] ;
      T003A2_n3122ArtAncSal1 = new boolean[] {false} ;
      T003A2_A2834ArtPle2 = new String[] {""} ;
      T003A2_n2834ArtPle2 = new boolean[] {false} ;
      T003A2_A7779ArtBlo = new String[] {""} ;
      T003A2_n7779ArtBlo = new boolean[] {false} ;
      T003A2_A396EmprCod = new String[] {""} ;
      T003A2_A252CliCod = new int[1] ;
      T003A2_n252CliCod = new boolean[] {false} ;
      T003A2_A829TipArtCod = new short[1] ;
      T003A2_A2707NumTexCod = new String[] {""} ;
      T003A2_n2707NumTexCod = new boolean[] {false} ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      T003A19_A407EmprNom = new String[] {""} ;
      T003A19_n407EmprNom = new boolean[] {false} ;
      T003A20_A279CliNom = new String[] {""} ;
      T003A20_A306CliUrg = new byte[1] ;
      T003A21_A830TipArtDsc = new String[] {""} ;
      T003A21_n830TipArtDsc = new boolean[] {false} ;
      T003A22_A2708NumTexDsc = new String[] {""} ;
      T003A22_n2708NumTexDsc = new boolean[] {false} ;
      T003A23_A396EmprCod = new String[] {""} ;
      T003A23_A252CliCod = new int[1] ;
      T003A23_n252CliCod = new boolean[] {false} ;
      T003A23_A65ArtCod = new String[] {""} ;
      T003A23_n65ArtCod = new boolean[] {false} ;
      T003A23_A499GrpFamCod = new byte[1] ;
      T003A24_A396EmprCod = new String[] {""} ;
      T003A24_A252CliCod = new int[1] ;
      T003A24_n252CliCod = new boolean[] {false} ;
      T003A24_A12814ARTConID = new String[] {""} ;
      T003A24_A65ArtCod = new String[] {""} ;
      T003A24_n65ArtCod = new boolean[] {false} ;
      T003A25_A396EmprCod = new String[] {""} ;
      T003A25_A252CliCod = new int[1] ;
      T003A25_n252CliCod = new boolean[] {false} ;
      T003A25_A65ArtCod = new String[] {""} ;
      T003A25_n65ArtCod = new boolean[] {false} ;
      T003A25_A12363SocInt = new byte[1] ;
      T003A26_A396EmprCod = new String[] {""} ;
      T003A26_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T003A26_A5728JBCLLin = new short[1] ;
      T003A27_A396EmprCod = new String[] {""} ;
      T003A27_A252CliCod = new int[1] ;
      T003A27_n252CliCod = new boolean[] {false} ;
      T003A27_A5809MMezCod = new String[] {""} ;
      T003A27_A65ArtCod = new String[] {""} ;
      T003A27_n65ArtCod = new boolean[] {false} ;
      T003A28_A396EmprCod = new String[] {""} ;
      T003A28_A252CliCod = new int[1] ;
      T003A28_n252CliCod = new boolean[] {false} ;
      T003A28_A5234MezCod = new String[] {""} ;
      T003A28_A5240MezLin = new byte[1] ;
      T003A29_A396EmprCod = new String[] {""} ;
      T003A29_A252CliCod = new int[1] ;
      T003A29_n252CliCod = new boolean[] {false} ;
      T003A29_A65ArtCod = new String[] {""} ;
      T003A29_n65ArtCod = new boolean[] {false} ;
      T003A29_A4116estreclim = new int[1] ;
      T003A30_A396EmprCod = new String[] {""} ;
      T003A30_A252CliCod = new int[1] ;
      T003A30_n252CliCod = new boolean[] {false} ;
      T003A30_A65ArtCod = new String[] {""} ;
      T003A30_n65ArtCod = new boolean[] {false} ;
      T003A30_A4061EstNomCol = new String[] {""} ;
      T003A31_A396EmprCod = new String[] {""} ;
      T003A31_A9705ErpNped = new String[] {""} ;
      T003A31_A8652ErpLin = new short[1] ;
      T003A32_A396EmprCod = new String[] {""} ;
      T003A32_A252CliCod = new int[1] ;
      T003A32_n252CliCod = new boolean[] {false} ;
      T003A32_A65ArtCod = new String[] {""} ;
      T003A32_n65ArtCod = new boolean[] {false} ;
      T003A32_A7266CAAqP = new String[] {""} ;
      T003A33_A396EmprCod = new String[] {""} ;
      T003A33_A252CliCod = new int[1] ;
      T003A33_n252CliCod = new boolean[] {false} ;
      T003A33_A65ArtCod = new String[] {""} ;
      T003A33_n65ArtCod = new boolean[] {false} ;
      T003A33_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T003A34_A396EmprCod = new String[] {""} ;
      T003A34_A252CliCod = new int[1] ;
      T003A34_n252CliCod = new boolean[] {false} ;
      T003A34_A65ArtCod = new String[] {""} ;
      T003A34_n65ArtCod = new boolean[] {false} ;
      T003A34_A10972Int_cod = new byte[1] ;
      T003A35_A396EmprCod = new String[] {""} ;
      T003A35_A252CliCod = new int[1] ;
      T003A35_n252CliCod = new boolean[] {false} ;
      T003A35_A65ArtCod = new String[] {""} ;
      T003A35_n65ArtCod = new boolean[] {false} ;
      T003A35_A10577Pg_Procod = new String[] {""} ;
      T003A36_A396EmprCod = new String[] {""} ;
      T003A36_A252CliCod = new int[1] ;
      T003A36_n252CliCod = new boolean[] {false} ;
      T003A36_A65ArtCod = new String[] {""} ;
      T003A36_n65ArtCod = new boolean[] {false} ;
      T003A36_A10272Hz_cod = new String[] {""} ;
      T003A37_A396EmprCod = new String[] {""} ;
      T003A37_A252CliCod = new int[1] ;
      T003A37_n252CliCod = new boolean[] {false} ;
      T003A37_A65ArtCod = new String[] {""} ;
      T003A37_n65ArtCod = new boolean[] {false} ;
      T003A37_A10041ArtSH = new String[] {""} ;
      T003A38_A396EmprCod = new String[] {""} ;
      T003A38_A252CliCod = new int[1] ;
      T003A38_n252CliCod = new boolean[] {false} ;
      T003A38_A65ArtCod = new String[] {""} ;
      T003A38_n65ArtCod = new boolean[] {false} ;
      T003A38_A8427TipoCt = new String[] {""} ;
      T003A38_A8428CapMxMq = new int[1] ;
      T003A39_A396EmprCod = new String[] {""} ;
      T003A39_A252CliCod = new int[1] ;
      T003A39_n252CliCod = new boolean[] {false} ;
      T003A39_A65ArtCod = new String[] {""} ;
      T003A39_n65ArtCod = new boolean[] {false} ;
      T003A39_A8342CodPred = new short[1] ;
      T003A40_A396EmprCod = new String[] {""} ;
      T003A40_A252CliCod = new int[1] ;
      T003A40_n252CliCod = new boolean[] {false} ;
      T003A40_A65ArtCod = new String[] {""} ;
      T003A40_n65ArtCod = new boolean[] {false} ;
      T003A40_A8089ArtcodTj = new String[] {""} ;
      T003A41_A396EmprCod = new String[] {""} ;
      T003A41_A252CliCod = new int[1] ;
      T003A41_n252CliCod = new boolean[] {false} ;
      T003A41_A65ArtCod = new String[] {""} ;
      T003A41_n65ArtCod = new boolean[] {false} ;
      T003A41_A7956Mq_CodM = new String[] {""} ;
      T003A42_A396EmprCod = new String[] {""} ;
      T003A42_A252CliCod = new int[1] ;
      T003A42_n252CliCod = new boolean[] {false} ;
      T003A42_A65ArtCod = new String[] {""} ;
      T003A42_n65ArtCod = new boolean[] {false} ;
      T003A42_A7949Par_Art = new short[1] ;
      T003A43_A396EmprCod = new String[] {""} ;
      T003A43_A252CliCod = new int[1] ;
      T003A43_n252CliCod = new boolean[] {false} ;
      T003A43_A65ArtCod = new String[] {""} ;
      T003A43_n65ArtCod = new boolean[] {false} ;
      T003A43_A7135Lin_fast = new short[1] ;
      T003A44_A396EmprCod = new String[] {""} ;
      T003A44_A252CliCod = new int[1] ;
      T003A44_n252CliCod = new boolean[] {false} ;
      T003A44_A65ArtCod = new String[] {""} ;
      T003A44_n65ArtCod = new boolean[] {false} ;
      T003A44_A6954Mat_lin = new short[1] ;
      T003A45_A396EmprCod = new String[] {""} ;
      T003A45_A602MaqCod = new String[] {""} ;
      T003A45_A6078MaqCliCod = new int[1] ;
      T003A45_A6079MaqArtCod = new String[] {""} ;
      T003A46_A396EmprCod = new String[] {""} ;
      T003A46_A252CliCod = new int[1] ;
      T003A46_n252CliCod = new boolean[] {false} ;
      T003A46_A65ArtCod = new String[] {""} ;
      T003A46_n65ArtCod = new boolean[] {false} ;
      T003A46_A5382EstCatAny = new short[1] ;
      T003A46_A5383EstCatSer = new String[] {""} ;
      T003A46_A5384EstCatTip = new short[1] ;
      T003A47_A396EmprCod = new String[] {""} ;
      T003A47_A252CliCod = new int[1] ;
      T003A47_n252CliCod = new boolean[] {false} ;
      T003A47_A65ArtCod = new String[] {""} ;
      T003A47_n65ArtCod = new boolean[] {false} ;
      T003A47_A4658MdlCod = new String[] {""} ;
      T003A48_A396EmprCod = new String[] {""} ;
      T003A48_A252CliCod = new int[1] ;
      T003A48_n252CliCod = new boolean[] {false} ;
      T003A48_A4175WebEmpCod = new String[] {""} ;
      T003A49_A396EmprCod = new String[] {""} ;
      T003A49_A252CliCod = new int[1] ;
      T003A49_n252CliCod = new boolean[] {false} ;
      T003A49_A4079WEBDISCOD = new String[] {""} ;
      T003A50_A396EmprCod = new String[] {""} ;
      T003A50_A252CliCod = new int[1] ;
      T003A50_n252CliCod = new boolean[] {false} ;
      T003A50_A65ArtCod = new String[] {""} ;
      T003A50_n65ArtCod = new boolean[] {false} ;
      T003A50_A4058CCFColNom = new String[] {""} ;
      T003A50_A4059CCFColNum = new int[1] ;
      T003A51_A396EmprCod = new String[] {""} ;
      T003A51_A252CliCod = new int[1] ;
      T003A51_n252CliCod = new boolean[] {false} ;
      T003A51_A65ArtCod = new String[] {""} ;
      T003A51_n65ArtCod = new boolean[] {false} ;
      T003A51_A1177Dibujo = new String[] {""} ;
      T003A51_A1790DibIntCod = new int[1] ;
      T003A52_A396EmprCod = new String[] {""} ;
      T003A52_A252CliCod = new int[1] ;
      T003A52_n252CliCod = new boolean[] {false} ;
      T003A52_A65ArtCod = new String[] {""} ;
      T003A52_n65ArtCod = new boolean[] {false} ;
      T003A52_A1080LinPre = new byte[1] ;
      T003A53_A396EmprCod = new String[] {""} ;
      T003A53_A3814PePCod = new long[1] ;
      T003A54_A396EmprCod = new String[] {""} ;
      T003A54_A3413OpeManCod = new byte[1] ;
      T003A54_A3430PreManNMt = new String[] {""} ;
      T003A54_A252CliCod = new int[1] ;
      T003A54_n252CliCod = new boolean[] {false} ;
      T003A54_A65ArtCod = new String[] {""} ;
      T003A54_n65ArtCod = new boolean[] {false} ;
      T003A55_A396EmprCod = new String[] {""} ;
      T003A55_A3415ParManNum = new int[1] ;
      T003A56_A396EmprCod = new String[] {""} ;
      T003A56_A3331LanBroCod = new byte[1] ;
      T003A56_A3333LanBroLin = new short[1] ;
      T003A57_A396EmprCod = new String[] {""} ;
      T003A57_A252CliCod = new int[1] ;
      T003A57_n252CliCod = new boolean[] {false} ;
      T003A57_A65ArtCod = new String[] {""} ;
      T003A57_n65ArtCod = new boolean[] {false} ;
      T003A57_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003A58_A396EmprCod = new String[] {""} ;
      T003A58_A252CliCod = new int[1] ;
      T003A58_n252CliCod = new boolean[] {false} ;
      T003A58_A65ArtCod = new String[] {""} ;
      T003A58_n65ArtCod = new boolean[] {false} ;
      T003A58_A3288CCalCod = new String[] {""} ;
      T003A59_A396EmprCod = new String[] {""} ;
      T003A59_A252CliCod = new int[1] ;
      T003A59_n252CliCod = new boolean[] {false} ;
      T003A59_A65ArtCod = new String[] {""} ;
      T003A59_n65ArtCod = new boolean[] {false} ;
      T003A59_A3033CCCod = new String[] {""} ;
      T003A60_A396EmprCod = new String[] {""} ;
      T003A60_A252CliCod = new int[1] ;
      T003A60_n252CliCod = new boolean[] {false} ;
      T003A60_A65ArtCod = new String[] {""} ;
      T003A60_n65ArtCod = new boolean[] {false} ;
      T003A60_A2937RecIntCod = new byte[1] ;
      T003A61_A396EmprCod = new String[] {""} ;
      T003A61_A252CliCod = new int[1] ;
      T003A61_n252CliCod = new boolean[] {false} ;
      T003A61_A65ArtCod = new String[] {""} ;
      T003A61_n65ArtCod = new boolean[] {false} ;
      T003A61_A2931Limite2 = new short[1] ;
      T003A62_A396EmprCod = new String[] {""} ;
      T003A62_A252CliCod = new int[1] ;
      T003A62_n252CliCod = new boolean[] {false} ;
      T003A62_A65ArtCod = new String[] {""} ;
      T003A62_n65ArtCod = new boolean[] {false} ;
      T003A62_A71ArtEstAny = new short[1] ;
      T003A62_A2756ArtEstSer = new String[] {""} ;
      T003A63_A396EmprCod = new String[] {""} ;
      T003A63_A252CliCod = new int[1] ;
      T003A63_n252CliCod = new boolean[] {false} ;
      T003A63_A1504CliProCod = new String[] {""} ;
      T003A63_A65ArtCod = new String[] {""} ;
      T003A63_n65ArtCod = new boolean[] {false} ;
      T003A64_A396EmprCod = new String[] {""} ;
      T003A64_A252CliCod = new int[1] ;
      T003A64_n252CliCod = new boolean[] {false} ;
      T003A64_A65ArtCod = new String[] {""} ;
      T003A64_n65ArtCod = new boolean[] {false} ;
      T003A64_A598LinRec = new byte[1] ;
      T003A65_A396EmprCod = new String[] {""} ;
      T003A65_A252CliCod = new int[1] ;
      T003A65_n252CliCod = new boolean[] {false} ;
      T003A65_A65ArtCod = new String[] {""} ;
      T003A65_n65ArtCod = new boolean[] {false} ;
      T003A65_A831TipColCod = new byte[1] ;
      T003A66_A396EmprCod = new String[] {""} ;
      T003A66_A252CliCod = new int[1] ;
      T003A66_n252CliCod = new boolean[] {false} ;
      T003A66_A65ArtCod = new String[] {""} ;
      T003A66_n65ArtCod = new boolean[] {false} ;
      T003A66_A758ProCod = new String[] {""} ;
      T003A67_A396EmprCod = new String[] {""} ;
      T003A67_A252CliCod = new int[1] ;
      T003A67_n252CliCod = new boolean[] {false} ;
      T003A67_A65ArtCod = new String[] {""} ;
      T003A67_n65ArtCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ87ArtMat = "" ;
      ZZ69ArtDsc = "" ;
      ZZ73ArtEti = "" ;
      ZZ105ArtTra1 = "" ;
      ZZ106ArtTra2 = "" ;
      ZZ107ArtTra3 = "" ;
      ZZ111ArtUrd1 = "" ;
      ZZ112ArtUrd2 = "" ;
      ZZ113ArtUrd3 = "" ;
      ZZ967ArtNMtr = "" ;
      ZZ89ArtObs = "" ;
      ZZ90ArtObsFac = "" ;
      ZZ2707NumTexCod = "" ;
      ZZ3072ArtObsLon = "" ;
      ZZ2791ArtFacAbs = DecimalUtil.ZERO ;
      ZZ3683ArtFecCre = GXutil.nullDate() ;
      ZZ4353ArtUsrCod = "" ;
      ZZ4354ArtFecMod = GXutil.nullDate() ;
      ZZ4980ArtCdb = "" ;
      ZZ2834ArtPle2 = "" ;
      ZZ7779ArtBlo = "" ;
      ZZ407EmprNom = "" ;
      ZZ830TipArtDsc = "" ;
      ZZ2708NumTexDsc = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tartich__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tartich__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tartich__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tartich__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tartich__default(),
         new Object[] {
             new Object[] {
            T003A2_A3072ArtObsLon, T003A2_n3072ArtObsLon, T003A2_A65ArtCod, T003A2_A87ArtMat, T003A2_n87ArtMat, T003A2_A69ArtDsc, T003A2_n69ArtDsc, T003A2_A73ArtEti, T003A2_n73ArtEti, T003A2_A117ArtUrg,
            T003A2_n117ArtUrg, T003A2_A105ArtTra1, T003A2_n105ArtTra1, T003A2_A106ArtTra2, T003A2_n106ArtTra2, T003A2_A107ArtTra3, T003A2_n107ArtTra3, T003A2_A108ArtTraP1, T003A2_n108ArtTraP1, T003A2_A109ArtTraP2,
            T003A2_n109ArtTraP2, T003A2_A110ArtTraP3, T003A2_n110ArtTraP3, T003A2_A111ArtUrd1, T003A2_n111ArtUrd1, T003A2_A112ArtUrd2, T003A2_n112ArtUrd2, T003A2_A113ArtUrd3, T003A2_n113ArtUrd3, T003A2_A114ArtUrdP1,
            T003A2_n114ArtUrdP1, T003A2_A115ArtUrdP2, T003A2_n115ArtUrdP2, T003A2_A116ArtUrdP3, T003A2_n116ArtUrdP3, T003A2_A967ArtNMtr, T003A2_n967ArtNMtr, T003A2_A89ArtObs, T003A2_n89ArtObs, T003A2_A90ArtObsFac,
            T003A2_n90ArtObsFac, T003A2_A2750ArtNumTex1, T003A2_n2750ArtNumTex1, T003A2_A2751ArtNumTex2, T003A2_n2751ArtNumTex2, T003A2_A2791ArtFacAbs, T003A2_n2791ArtFacAbs, T003A2_A3683ArtFecCre, T003A2_n3683ArtFecCre, T003A2_A4353ArtUsrCod,
            T003A2_n4353ArtUsrCod, T003A2_A4354ArtFecMod, T003A2_n4354ArtFecMod, T003A2_A4980ArtCdb, T003A2_n4980ArtCdb, T003A2_A3123ArtAncSal2, T003A2_n3123ArtAncSal2, T003A2_A3122ArtAncSal1, T003A2_n3122ArtAncSal1, T003A2_A2834ArtPle2,
            T003A2_n2834ArtPle2, T003A2_A7779ArtBlo, T003A2_n7779ArtBlo, T003A2_A396EmprCod, T003A2_A252CliCod, T003A2_A829TipArtCod, T003A2_A2707NumTexCod, T003A2_n2707NumTexCod
            }
            , new Object[] {
            T003A3_A3072ArtObsLon, T003A3_n3072ArtObsLon, T003A3_A65ArtCod, T003A3_A87ArtMat, T003A3_n87ArtMat, T003A3_A69ArtDsc, T003A3_n69ArtDsc, T003A3_A73ArtEti, T003A3_n73ArtEti, T003A3_A117ArtUrg,
            T003A3_n117ArtUrg, T003A3_A105ArtTra1, T003A3_n105ArtTra1, T003A3_A106ArtTra2, T003A3_n106ArtTra2, T003A3_A107ArtTra3, T003A3_n107ArtTra3, T003A3_A108ArtTraP1, T003A3_n108ArtTraP1, T003A3_A109ArtTraP2,
            T003A3_n109ArtTraP2, T003A3_A110ArtTraP3, T003A3_n110ArtTraP3, T003A3_A111ArtUrd1, T003A3_n111ArtUrd1, T003A3_A112ArtUrd2, T003A3_n112ArtUrd2, T003A3_A113ArtUrd3, T003A3_n113ArtUrd3, T003A3_A114ArtUrdP1,
            T003A3_n114ArtUrdP1, T003A3_A115ArtUrdP2, T003A3_n115ArtUrdP2, T003A3_A116ArtUrdP3, T003A3_n116ArtUrdP3, T003A3_A967ArtNMtr, T003A3_n967ArtNMtr, T003A3_A89ArtObs, T003A3_n89ArtObs, T003A3_A90ArtObsFac,
            T003A3_n90ArtObsFac, T003A3_A2750ArtNumTex1, T003A3_n2750ArtNumTex1, T003A3_A2751ArtNumTex2, T003A3_n2751ArtNumTex2, T003A3_A2791ArtFacAbs, T003A3_n2791ArtFacAbs, T003A3_A3683ArtFecCre, T003A3_n3683ArtFecCre, T003A3_A4353ArtUsrCod,
            T003A3_n4353ArtUsrCod, T003A3_A4354ArtFecMod, T003A3_n4354ArtFecMod, T003A3_A4980ArtCdb, T003A3_n4980ArtCdb, T003A3_A3123ArtAncSal2, T003A3_n3123ArtAncSal2, T003A3_A3122ArtAncSal1, T003A3_n3122ArtAncSal1, T003A3_A2834ArtPle2,
            T003A3_n2834ArtPle2, T003A3_A7779ArtBlo, T003A3_n7779ArtBlo, T003A3_A396EmprCod, T003A3_A252CliCod, T003A3_A829TipArtCod, T003A3_A2707NumTexCod, T003A3_n2707NumTexCod
            }
            , new Object[] {
            T003A4_A407EmprNom, T003A4_n407EmprNom
            }
            , new Object[] {
            T003A5_A279CliNom, T003A5_A306CliUrg
            }
            , new Object[] {
            T003A6_A830TipArtDsc, T003A6_n830TipArtDsc
            }
            , new Object[] {
            T003A7_A2708NumTexDsc, T003A7_n2708NumTexDsc
            }
            , new Object[] {
            T003A8_A3072ArtObsLon, T003A8_n3072ArtObsLon, T003A8_A65ArtCod, T003A8_A279CliNom, T003A8_A407EmprNom, T003A8_n407EmprNom, T003A8_A87ArtMat, T003A8_n87ArtMat, T003A8_A830TipArtDsc, T003A8_n830TipArtDsc,
            T003A8_A69ArtDsc, T003A8_n69ArtDsc, T003A8_A73ArtEti, T003A8_n73ArtEti, T003A8_A306CliUrg, T003A8_A117ArtUrg, T003A8_n117ArtUrg, T003A8_A105ArtTra1, T003A8_n105ArtTra1, T003A8_A106ArtTra2,
            T003A8_n106ArtTra2, T003A8_A107ArtTra3, T003A8_n107ArtTra3, T003A8_A108ArtTraP1, T003A8_n108ArtTraP1, T003A8_A109ArtTraP2, T003A8_n109ArtTraP2, T003A8_A110ArtTraP3, T003A8_n110ArtTraP3, T003A8_A111ArtUrd1,
            T003A8_n111ArtUrd1, T003A8_A112ArtUrd2, T003A8_n112ArtUrd2, T003A8_A113ArtUrd3, T003A8_n113ArtUrd3, T003A8_A114ArtUrdP1, T003A8_n114ArtUrdP1, T003A8_A115ArtUrdP2, T003A8_n115ArtUrdP2, T003A8_A116ArtUrdP3,
            T003A8_n116ArtUrdP3, T003A8_A967ArtNMtr, T003A8_n967ArtNMtr, T003A8_A89ArtObs, T003A8_n89ArtObs, T003A8_A90ArtObsFac, T003A8_n90ArtObsFac, T003A8_A2750ArtNumTex1, T003A8_n2750ArtNumTex1, T003A8_A2751ArtNumTex2,
            T003A8_n2751ArtNumTex2, T003A8_A2708NumTexDsc, T003A8_n2708NumTexDsc, T003A8_A2791ArtFacAbs, T003A8_n2791ArtFacAbs, T003A8_A3683ArtFecCre, T003A8_n3683ArtFecCre, T003A8_A4353ArtUsrCod, T003A8_n4353ArtUsrCod, T003A8_A4354ArtFecMod,
            T003A8_n4354ArtFecMod, T003A8_A4980ArtCdb, T003A8_n4980ArtCdb, T003A8_A3123ArtAncSal2, T003A8_n3123ArtAncSal2, T003A8_A3122ArtAncSal1, T003A8_n3122ArtAncSal1, T003A8_A2834ArtPle2, T003A8_n2834ArtPle2, T003A8_A7779ArtBlo,
            T003A8_n7779ArtBlo, T003A8_A396EmprCod, T003A8_A252CliCod, T003A8_A829TipArtCod, T003A8_A2707NumTexCod, T003A8_n2707NumTexCod
            }
            , new Object[] {
            T003A9_A407EmprNom, T003A9_n407EmprNom
            }
            , new Object[] {
            T003A10_A830TipArtDsc, T003A10_n830TipArtDsc
            }
            , new Object[] {
            T003A11_A2708NumTexDsc, T003A11_n2708NumTexDsc
            }
            , new Object[] {
            T003A12_A279CliNom, T003A12_A306CliUrg
            }
            , new Object[] {
            T003A13_A396EmprCod, T003A13_A252CliCod, T003A13_A65ArtCod
            }
            , new Object[] {
            T003A14_A396EmprCod, T003A14_A252CliCod, T003A14_A65ArtCod
            }
            , new Object[] {
            T003A15_A396EmprCod, T003A15_A252CliCod, T003A15_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T003A19_A407EmprNom, T003A19_n407EmprNom
            }
            , new Object[] {
            T003A20_A279CliNom, T003A20_A306CliUrg
            }
            , new Object[] {
            T003A21_A830TipArtDsc, T003A21_n830TipArtDsc
            }
            , new Object[] {
            T003A22_A2708NumTexDsc, T003A22_n2708NumTexDsc
            }
            , new Object[] {
            T003A23_A396EmprCod, T003A23_A252CliCod, T003A23_A65ArtCod, T003A23_A499GrpFamCod
            }
            , new Object[] {
            T003A24_A396EmprCod, T003A24_A252CliCod, T003A24_A12814ARTConID, T003A24_A65ArtCod
            }
            , new Object[] {
            T003A25_A396EmprCod, T003A25_A252CliCod, T003A25_A65ArtCod, T003A25_A12363SocInt
            }
            , new Object[] {
            T003A26_A396EmprCod, T003A26_A4929Inc_Dia, T003A26_A5728JBCLLin
            }
            , new Object[] {
            T003A27_A396EmprCod, T003A27_A252CliCod, T003A27_A5809MMezCod, T003A27_A65ArtCod
            }
            , new Object[] {
            T003A28_A396EmprCod, T003A28_A252CliCod, T003A28_A5234MezCod, T003A28_A5240MezLin
            }
            , new Object[] {
            T003A29_A396EmprCod, T003A29_A252CliCod, T003A29_A65ArtCod, T003A29_A4116estreclim
            }
            , new Object[] {
            T003A30_A396EmprCod, T003A30_A252CliCod, T003A30_A65ArtCod, T003A30_A4061EstNomCol
            }
            , new Object[] {
            T003A31_A396EmprCod, T003A31_A9705ErpNped, T003A31_A8652ErpLin
            }
            , new Object[] {
            T003A32_A396EmprCod, T003A32_A252CliCod, T003A32_A65ArtCod, T003A32_A7266CAAqP
            }
            , new Object[] {
            T003A33_A396EmprCod, T003A33_A252CliCod, T003A33_A65ArtCod, T003A33_A11084H_DiaA
            }
            , new Object[] {
            T003A34_A396EmprCod, T003A34_A252CliCod, T003A34_A65ArtCod, T003A34_A10972Int_cod
            }
            , new Object[] {
            T003A35_A396EmprCod, T003A35_A252CliCod, T003A35_A65ArtCod, T003A35_A10577Pg_Procod
            }
            , new Object[] {
            T003A36_A396EmprCod, T003A36_A252CliCod, T003A36_A65ArtCod, T003A36_A10272Hz_cod
            }
            , new Object[] {
            T003A37_A396EmprCod, T003A37_A252CliCod, T003A37_A65ArtCod, T003A37_A10041ArtSH
            }
            , new Object[] {
            T003A38_A396EmprCod, T003A38_A252CliCod, T003A38_A65ArtCod, T003A38_A8427TipoCt, T003A38_A8428CapMxMq
            }
            , new Object[] {
            T003A39_A396EmprCod, T003A39_A252CliCod, T003A39_A65ArtCod, T003A39_A8342CodPred
            }
            , new Object[] {
            T003A40_A396EmprCod, T003A40_A252CliCod, T003A40_A65ArtCod, T003A40_A8089ArtcodTj
            }
            , new Object[] {
            T003A41_A396EmprCod, T003A41_A252CliCod, T003A41_A65ArtCod, T003A41_A7956Mq_CodM
            }
            , new Object[] {
            T003A42_A396EmprCod, T003A42_A252CliCod, T003A42_A65ArtCod, T003A42_A7949Par_Art
            }
            , new Object[] {
            T003A43_A396EmprCod, T003A43_A252CliCod, T003A43_A65ArtCod, T003A43_A7135Lin_fast
            }
            , new Object[] {
            T003A44_A396EmprCod, T003A44_A252CliCod, T003A44_A65ArtCod, T003A44_A6954Mat_lin
            }
            , new Object[] {
            T003A45_A396EmprCod, T003A45_A602MaqCod, T003A45_A6078MaqCliCod, T003A45_A6079MaqArtCod
            }
            , new Object[] {
            T003A46_A396EmprCod, T003A46_A252CliCod, T003A46_A65ArtCod, T003A46_A5382EstCatAny, T003A46_A5383EstCatSer, T003A46_A5384EstCatTip
            }
            , new Object[] {
            T003A47_A396EmprCod, T003A47_A252CliCod, T003A47_A65ArtCod, T003A47_A4658MdlCod
            }
            , new Object[] {
            T003A48_A396EmprCod, T003A48_A252CliCod, T003A48_A4175WebEmpCod
            }
            , new Object[] {
            T003A49_A396EmprCod, T003A49_A252CliCod, T003A49_A4079WEBDISCOD
            }
            , new Object[] {
            T003A50_A396EmprCod, T003A50_A252CliCod, T003A50_A65ArtCod, T003A50_A4058CCFColNom, T003A50_A4059CCFColNum
            }
            , new Object[] {
            T003A51_A396EmprCod, T003A51_A252CliCod, T003A51_A65ArtCod, T003A51_A1177Dibujo, T003A51_A1790DibIntCod
            }
            , new Object[] {
            T003A52_A396EmprCod, T003A52_A252CliCod, T003A52_A65ArtCod, T003A52_A1080LinPre
            }
            , new Object[] {
            T003A53_A396EmprCod, T003A53_A3814PePCod
            }
            , new Object[] {
            T003A54_A396EmprCod, T003A54_A3413OpeManCod, T003A54_A3430PreManNMt, T003A54_A252CliCod, T003A54_A65ArtCod
            }
            , new Object[] {
            T003A55_A396EmprCod, T003A55_A3415ParManNum
            }
            , new Object[] {
            T003A56_A396EmprCod, T003A56_A3331LanBroCod, T003A56_A3333LanBroLin
            }
            , new Object[] {
            T003A57_A396EmprCod, T003A57_A252CliCod, T003A57_A65ArtCod, T003A57_A3319ArtCapKgs
            }
            , new Object[] {
            T003A58_A396EmprCod, T003A58_A252CliCod, T003A58_A65ArtCod, T003A58_A3288CCalCod
            }
            , new Object[] {
            T003A59_A396EmprCod, T003A59_A252CliCod, T003A59_A65ArtCod, T003A59_A3033CCCod
            }
            , new Object[] {
            T003A60_A396EmprCod, T003A60_A252CliCod, T003A60_A65ArtCod, T003A60_A2937RecIntCod
            }
            , new Object[] {
            T003A61_A396EmprCod, T003A61_A252CliCod, T003A61_A65ArtCod, T003A61_A2931Limite2
            }
            , new Object[] {
            T003A62_A396EmprCod, T003A62_A252CliCod, T003A62_A65ArtCod, T003A62_A71ArtEstAny, T003A62_A2756ArtEstSer
            }
            , new Object[] {
            T003A63_A396EmprCod, T003A63_A252CliCod, T003A63_A1504CliProCod, T003A63_A65ArtCod
            }
            , new Object[] {
            T003A64_A396EmprCod, T003A64_A252CliCod, T003A64_A65ArtCod, T003A64_A598LinRec
            }
            , new Object[] {
            T003A65_A396EmprCod, T003A65_A252CliCod, T003A65_A65ArtCod, T003A65_A831TipColCod
            }
            , new Object[] {
            T003A66_A396EmprCod, T003A66_A252CliCod, T003A66_A65ArtCod, T003A66_A758ProCod
            }
            , new Object[] {
            T003A67_A396EmprCod, T003A67_A252CliCod, T003A67_A65ArtCod
            }
         }
      );
   }

   private byte Z117ArtUrg ;
   private byte Z2750ArtNumTex1 ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A306CliUrg ;
   private byte A117ArtUrg ;
   private byte A2750ArtNumTex1 ;
   private byte Z306CliUrg ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ117ArtUrg ;
   private byte ZZ2750ArtNumTex1 ;
   private byte ZZ306CliUrg ;
   private short Z108ArtTraP1 ;
   private short Z109ArtTraP2 ;
   private short Z110ArtTraP3 ;
   private short Z114ArtUrdP1 ;
   private short Z115ArtUrdP2 ;
   private short Z116ArtUrdP3 ;
   private short Z2751ArtNumTex2 ;
   private short Z3123ArtAncSal2 ;
   private short Z3122ArtAncSal1 ;
   private short Z829TipArtCod ;
   private short A829TipArtCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short A2751ArtNumTex2 ;
   private short A3123ArtAncSal2 ;
   private short A3122ArtAncSal1 ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private short ZZ829TipArtCod ;
   private short ZZ108ArtTraP1 ;
   private short ZZ109ArtTraP2 ;
   private short ZZ110ArtTraP3 ;
   private short ZZ114ArtUrdP1 ;
   private short ZZ115ArtUrdP2 ;
   private short ZZ116ArtUrdP3 ;
   private short ZZ2751ArtNumTex2 ;
   private short ZZ3123ArtAncSal2 ;
   private short ZZ3122ArtAncSal1 ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtArtMat_Enabled ;
   private int edtTipArtCod_Enabled ;
   private int edtTipArtDsc_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtArtEti_Enabled ;
   private int edtCliUrg_Enabled ;
   private int edtArtUrg_Enabled ;
   private int edtArtTra1_Enabled ;
   private int edtArtTra2_Enabled ;
   private int edtArtTra3_Enabled ;
   private int edtArtTraP1_Enabled ;
   private int edtArtTraP2_Enabled ;
   private int edtArtTraP3_Enabled ;
   private int edtArtUrd1_Enabled ;
   private int edtArtUrd2_Enabled ;
   private int edtArtUrd3_Enabled ;
   private int edtArtUrdP1_Enabled ;
   private int edtArtUrdP2_Enabled ;
   private int edtArtUrdP3_Enabled ;
   private int edtArtNMtr_Enabled ;
   private int edtArtObs_Enabled ;
   private int edtArtObsFac_Enabled ;
   private int edtArtNumTex1_Enabled ;
   private int edtArtNumTex2_Enabled ;
   private int edtNumTexCod_Enabled ;
   private int edtNumTexDsc_Enabled ;
   private int edtArtObsLon_Enabled ;
   private int edtArtFacAbs_Enabled ;
   private int edtArtFecCre_Enabled ;
   private int edtArtUsrCod_Enabled ;
   private int edtArtFecMod_Enabled ;
   private int edtArtCdb_Enabled ;
   private int edtArtAncSal2_Enabled ;
   private int edtArtAncSal1_Enabled ;
   private int edtArtPle2_Enabled ;
   private int edtArtBlo_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int GXv_int2[] ;
   private int idxLst ;
   private int ZZ252CliCod ;
   private java.math.BigDecimal Z2791ArtFacAbs ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal ZZ2791ArtFacAbs ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z87ArtMat ;
   private String Z69ArtDsc ;
   private String Z73ArtEti ;
   private String Z105ArtTra1 ;
   private String Z106ArtTra2 ;
   private String Z107ArtTra3 ;
   private String Z111ArtUrd1 ;
   private String Z112ArtUrd2 ;
   private String Z113ArtUrd3 ;
   private String Z967ArtNMtr ;
   private String Z89ArtObs ;
   private String Z90ArtObsFac ;
   private String Z4353ArtUsrCod ;
   private String Z4980ArtCdb ;
   private String Z2834ArtPle2 ;
   private String Z7779ArtBlo ;
   private String Z2707NumTexCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A2707NumTexCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String divTablemain_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String A65ArtCod ;
   private String edtArtCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtArtMat_Internalname ;
   private String A87ArtMat ;
   private String edtArtMat_Jsonclick ;
   private String edtTipArtCod_Internalname ;
   private String edtTipArtCod_Jsonclick ;
   private String edtTipArtDsc_Internalname ;
   private String A830TipArtDsc ;
   private String edtTipArtDsc_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String edtArtEti_Internalname ;
   private String A73ArtEti ;
   private String edtArtEti_Jsonclick ;
   private String edtCliUrg_Internalname ;
   private String edtCliUrg_Jsonclick ;
   private String edtArtUrg_Internalname ;
   private String edtArtUrg_Jsonclick ;
   private String edtArtTra1_Internalname ;
   private String A105ArtTra1 ;
   private String edtArtTra1_Jsonclick ;
   private String edtArtTra2_Internalname ;
   private String A106ArtTra2 ;
   private String edtArtTra2_Jsonclick ;
   private String edtArtTra3_Internalname ;
   private String A107ArtTra3 ;
   private String edtArtTra3_Jsonclick ;
   private String edtArtTraP1_Internalname ;
   private String edtArtTraP1_Jsonclick ;
   private String edtArtTraP2_Internalname ;
   private String edtArtTraP2_Jsonclick ;
   private String edtArtTraP3_Internalname ;
   private String edtArtTraP3_Jsonclick ;
   private String edtArtUrd1_Internalname ;
   private String A111ArtUrd1 ;
   private String edtArtUrd1_Jsonclick ;
   private String edtArtUrd2_Internalname ;
   private String A112ArtUrd2 ;
   private String edtArtUrd2_Jsonclick ;
   private String edtArtUrd3_Internalname ;
   private String A113ArtUrd3 ;
   private String edtArtUrd3_Jsonclick ;
   private String edtArtUrdP1_Internalname ;
   private String edtArtUrdP1_Jsonclick ;
   private String edtArtUrdP2_Internalname ;
   private String edtArtUrdP2_Jsonclick ;
   private String edtArtUrdP3_Internalname ;
   private String edtArtUrdP3_Jsonclick ;
   private String edtArtNMtr_Internalname ;
   private String A967ArtNMtr ;
   private String edtArtNMtr_Jsonclick ;
   private String edtArtObs_Internalname ;
   private String A89ArtObs ;
   private String edtArtObs_Jsonclick ;
   private String edtArtObsFac_Internalname ;
   private String A90ArtObsFac ;
   private String edtArtNumTex1_Internalname ;
   private String edtArtNumTex1_Jsonclick ;
   private String edtArtNumTex2_Internalname ;
   private String edtArtNumTex2_Jsonclick ;
   private String edtNumTexCod_Internalname ;
   private String edtNumTexCod_Jsonclick ;
   private String edtNumTexDsc_Internalname ;
   private String A2708NumTexDsc ;
   private String edtNumTexDsc_Jsonclick ;
   private String edtArtObsLon_Internalname ;
   private String edtArtFacAbs_Internalname ;
   private String edtArtFacAbs_Jsonclick ;
   private String edtArtFecCre_Internalname ;
   private String edtArtFecCre_Jsonclick ;
   private String edtArtUsrCod_Internalname ;
   private String A4353ArtUsrCod ;
   private String edtArtUsrCod_Jsonclick ;
   private String edtArtFecMod_Internalname ;
   private String edtArtFecMod_Jsonclick ;
   private String edtArtCdb_Internalname ;
   private String A4980ArtCdb ;
   private String edtArtCdb_Jsonclick ;
   private String edtArtAncSal2_Internalname ;
   private String edtArtAncSal2_Jsonclick ;
   private String edtArtAncSal1_Internalname ;
   private String edtArtAncSal1_Jsonclick ;
   private String edtArtPle2_Internalname ;
   private String A2834ArtPle2 ;
   private String edtArtPle2_Jsonclick ;
   private String edtArtBlo_Internalname ;
   private String A7779ArtBlo ;
   private String edtArtBlo_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z830TipArtDsc ;
   private String Z2708NumTexDsc ;
   private String sMode10 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ87ArtMat ;
   private String ZZ69ArtDsc ;
   private String ZZ73ArtEti ;
   private String ZZ105ArtTra1 ;
   private String ZZ106ArtTra2 ;
   private String ZZ107ArtTra3 ;
   private String ZZ111ArtUrd1 ;
   private String ZZ112ArtUrd2 ;
   private String ZZ113ArtUrd3 ;
   private String ZZ967ArtNMtr ;
   private String ZZ89ArtObs ;
   private String ZZ90ArtObsFac ;
   private String ZZ2707NumTexCod ;
   private String ZZ4353ArtUsrCod ;
   private String ZZ4980ArtCdb ;
   private String ZZ2834ArtPle2 ;
   private String ZZ7779ArtBlo ;
   private String ZZ407EmprNom ;
   private String ZZ830TipArtDsc ;
   private String ZZ2708NumTexDsc ;
   private String ZZ279CliNom ;
   private java.util.Date Z3683ArtFecCre ;
   private java.util.Date Z4354ArtFecMod ;
   private java.util.Date A3683ArtFecCre ;
   private java.util.Date A4354ArtFecMod ;
   private java.util.Date ZZ3683ArtFecCre ;
   private java.util.Date ZZ4354ArtFecMod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n2707NumTexCod ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n65ArtCod ;
   private boolean n407EmprNom ;
   private boolean n87ArtMat ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private boolean n73ArtEti ;
   private boolean n117ArtUrg ;
   private boolean n105ArtTra1 ;
   private boolean n106ArtTra2 ;
   private boolean n107ArtTra3 ;
   private boolean n108ArtTraP1 ;
   private boolean n109ArtTraP2 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n112ArtUrd2 ;
   private boolean n113ArtUrd3 ;
   private boolean n114ArtUrdP1 ;
   private boolean n115ArtUrdP2 ;
   private boolean n116ArtUrdP3 ;
   private boolean n967ArtNMtr ;
   private boolean n89ArtObs ;
   private boolean n90ArtObsFac ;
   private boolean n2750ArtNumTex1 ;
   private boolean n2751ArtNumTex2 ;
   private boolean n2708NumTexDsc ;
   private boolean n3072ArtObsLon ;
   private boolean n2791ArtFacAbs ;
   private boolean n3683ArtFecCre ;
   private boolean n4353ArtUsrCod ;
   private boolean n4354ArtFecMod ;
   private boolean n4980ArtCdb ;
   private boolean n3123ArtAncSal2 ;
   private boolean n3122ArtAncSal1 ;
   private boolean n2834ArtPle2 ;
   private boolean n7779ArtBlo ;
   private boolean Gx_longc ;
   private String A3072ArtObsLon ;
   private String Z3072ArtObsLon ;
   private String ZZ3072ArtObsLon ;
   private IDataStoreProvider pr_default ;
   private String[] T003A8_A3072ArtObsLon ;
   private boolean[] T003A8_n3072ArtObsLon ;
   private String[] T003A8_A65ArtCod ;
   private boolean[] T003A8_n65ArtCod ;
   private String[] T003A8_A279CliNom ;
   private String[] T003A8_A407EmprNom ;
   private boolean[] T003A8_n407EmprNom ;
   private String[] T003A8_A87ArtMat ;
   private boolean[] T003A8_n87ArtMat ;
   private String[] T003A8_A830TipArtDsc ;
   private boolean[] T003A8_n830TipArtDsc ;
   private String[] T003A8_A69ArtDsc ;
   private boolean[] T003A8_n69ArtDsc ;
   private String[] T003A8_A73ArtEti ;
   private boolean[] T003A8_n73ArtEti ;
   private byte[] T003A8_A306CliUrg ;
   private byte[] T003A8_A117ArtUrg ;
   private boolean[] T003A8_n117ArtUrg ;
   private String[] T003A8_A105ArtTra1 ;
   private boolean[] T003A8_n105ArtTra1 ;
   private String[] T003A8_A106ArtTra2 ;
   private boolean[] T003A8_n106ArtTra2 ;
   private String[] T003A8_A107ArtTra3 ;
   private boolean[] T003A8_n107ArtTra3 ;
   private short[] T003A8_A108ArtTraP1 ;
   private boolean[] T003A8_n108ArtTraP1 ;
   private short[] T003A8_A109ArtTraP2 ;
   private boolean[] T003A8_n109ArtTraP2 ;
   private short[] T003A8_A110ArtTraP3 ;
   private boolean[] T003A8_n110ArtTraP3 ;
   private String[] T003A8_A111ArtUrd1 ;
   private boolean[] T003A8_n111ArtUrd1 ;
   private String[] T003A8_A112ArtUrd2 ;
   private boolean[] T003A8_n112ArtUrd2 ;
   private String[] T003A8_A113ArtUrd3 ;
   private boolean[] T003A8_n113ArtUrd3 ;
   private short[] T003A8_A114ArtUrdP1 ;
   private boolean[] T003A8_n114ArtUrdP1 ;
   private short[] T003A8_A115ArtUrdP2 ;
   private boolean[] T003A8_n115ArtUrdP2 ;
   private short[] T003A8_A116ArtUrdP3 ;
   private boolean[] T003A8_n116ArtUrdP3 ;
   private String[] T003A8_A967ArtNMtr ;
   private boolean[] T003A8_n967ArtNMtr ;
   private String[] T003A8_A89ArtObs ;
   private boolean[] T003A8_n89ArtObs ;
   private String[] T003A8_A90ArtObsFac ;
   private boolean[] T003A8_n90ArtObsFac ;
   private byte[] T003A8_A2750ArtNumTex1 ;
   private boolean[] T003A8_n2750ArtNumTex1 ;
   private short[] T003A8_A2751ArtNumTex2 ;
   private boolean[] T003A8_n2751ArtNumTex2 ;
   private String[] T003A8_A2708NumTexDsc ;
   private boolean[] T003A8_n2708NumTexDsc ;
   private java.math.BigDecimal[] T003A8_A2791ArtFacAbs ;
   private boolean[] T003A8_n2791ArtFacAbs ;
   private java.util.Date[] T003A8_A3683ArtFecCre ;
   private boolean[] T003A8_n3683ArtFecCre ;
   private String[] T003A8_A4353ArtUsrCod ;
   private boolean[] T003A8_n4353ArtUsrCod ;
   private java.util.Date[] T003A8_A4354ArtFecMod ;
   private boolean[] T003A8_n4354ArtFecMod ;
   private String[] T003A8_A4980ArtCdb ;
   private boolean[] T003A8_n4980ArtCdb ;
   private short[] T003A8_A3123ArtAncSal2 ;
   private boolean[] T003A8_n3123ArtAncSal2 ;
   private short[] T003A8_A3122ArtAncSal1 ;
   private boolean[] T003A8_n3122ArtAncSal1 ;
   private String[] T003A8_A2834ArtPle2 ;
   private boolean[] T003A8_n2834ArtPle2 ;
   private String[] T003A8_A7779ArtBlo ;
   private boolean[] T003A8_n7779ArtBlo ;
   private String[] T003A8_A396EmprCod ;
   private int[] T003A8_A252CliCod ;
   private boolean[] T003A8_n252CliCod ;
   private short[] T003A8_A829TipArtCod ;
   private String[] T003A8_A2707NumTexCod ;
   private boolean[] T003A8_n2707NumTexCod ;
   private String[] T003A4_A407EmprNom ;
   private boolean[] T003A4_n407EmprNom ;
   private String[] T003A6_A830TipArtDsc ;
   private boolean[] T003A6_n830TipArtDsc ;
   private String[] T003A7_A2708NumTexDsc ;
   private boolean[] T003A7_n2708NumTexDsc ;
   private String[] T003A5_A279CliNom ;
   private byte[] T003A5_A306CliUrg ;
   private String[] T003A9_A407EmprNom ;
   private boolean[] T003A9_n407EmprNom ;
   private String[] T003A10_A830TipArtDsc ;
   private boolean[] T003A10_n830TipArtDsc ;
   private String[] T003A11_A2708NumTexDsc ;
   private boolean[] T003A11_n2708NumTexDsc ;
   private String[] T003A12_A279CliNom ;
   private byte[] T003A12_A306CliUrg ;
   private String[] T003A13_A396EmprCod ;
   private int[] T003A13_A252CliCod ;
   private boolean[] T003A13_n252CliCod ;
   private String[] T003A13_A65ArtCod ;
   private boolean[] T003A13_n65ArtCod ;
   private String[] T003A3_A3072ArtObsLon ;
   private boolean[] T003A3_n3072ArtObsLon ;
   private String[] T003A3_A65ArtCod ;
   private boolean[] T003A3_n65ArtCod ;
   private String[] T003A3_A87ArtMat ;
   private boolean[] T003A3_n87ArtMat ;
   private String[] T003A3_A69ArtDsc ;
   private boolean[] T003A3_n69ArtDsc ;
   private String[] T003A3_A73ArtEti ;
   private boolean[] T003A3_n73ArtEti ;
   private byte[] T003A3_A117ArtUrg ;
   private boolean[] T003A3_n117ArtUrg ;
   private String[] T003A3_A105ArtTra1 ;
   private boolean[] T003A3_n105ArtTra1 ;
   private String[] T003A3_A106ArtTra2 ;
   private boolean[] T003A3_n106ArtTra2 ;
   private String[] T003A3_A107ArtTra3 ;
   private boolean[] T003A3_n107ArtTra3 ;
   private short[] T003A3_A108ArtTraP1 ;
   private boolean[] T003A3_n108ArtTraP1 ;
   private short[] T003A3_A109ArtTraP2 ;
   private boolean[] T003A3_n109ArtTraP2 ;
   private short[] T003A3_A110ArtTraP3 ;
   private boolean[] T003A3_n110ArtTraP3 ;
   private String[] T003A3_A111ArtUrd1 ;
   private boolean[] T003A3_n111ArtUrd1 ;
   private String[] T003A3_A112ArtUrd2 ;
   private boolean[] T003A3_n112ArtUrd2 ;
   private String[] T003A3_A113ArtUrd3 ;
   private boolean[] T003A3_n113ArtUrd3 ;
   private short[] T003A3_A114ArtUrdP1 ;
   private boolean[] T003A3_n114ArtUrdP1 ;
   private short[] T003A3_A115ArtUrdP2 ;
   private boolean[] T003A3_n115ArtUrdP2 ;
   private short[] T003A3_A116ArtUrdP3 ;
   private boolean[] T003A3_n116ArtUrdP3 ;
   private String[] T003A3_A967ArtNMtr ;
   private boolean[] T003A3_n967ArtNMtr ;
   private String[] T003A3_A89ArtObs ;
   private boolean[] T003A3_n89ArtObs ;
   private String[] T003A3_A90ArtObsFac ;
   private boolean[] T003A3_n90ArtObsFac ;
   private byte[] T003A3_A2750ArtNumTex1 ;
   private boolean[] T003A3_n2750ArtNumTex1 ;
   private short[] T003A3_A2751ArtNumTex2 ;
   private boolean[] T003A3_n2751ArtNumTex2 ;
   private java.math.BigDecimal[] T003A3_A2791ArtFacAbs ;
   private boolean[] T003A3_n2791ArtFacAbs ;
   private java.util.Date[] T003A3_A3683ArtFecCre ;
   private boolean[] T003A3_n3683ArtFecCre ;
   private String[] T003A3_A4353ArtUsrCod ;
   private boolean[] T003A3_n4353ArtUsrCod ;
   private java.util.Date[] T003A3_A4354ArtFecMod ;
   private boolean[] T003A3_n4354ArtFecMod ;
   private String[] T003A3_A4980ArtCdb ;
   private boolean[] T003A3_n4980ArtCdb ;
   private short[] T003A3_A3123ArtAncSal2 ;
   private boolean[] T003A3_n3123ArtAncSal2 ;
   private short[] T003A3_A3122ArtAncSal1 ;
   private boolean[] T003A3_n3122ArtAncSal1 ;
   private String[] T003A3_A2834ArtPle2 ;
   private boolean[] T003A3_n2834ArtPle2 ;
   private String[] T003A3_A7779ArtBlo ;
   private boolean[] T003A3_n7779ArtBlo ;
   private String[] T003A3_A396EmprCod ;
   private int[] T003A3_A252CliCod ;
   private boolean[] T003A3_n252CliCod ;
   private short[] T003A3_A829TipArtCod ;
   private String[] T003A3_A2707NumTexCod ;
   private boolean[] T003A3_n2707NumTexCod ;
   private String[] T003A14_A396EmprCod ;
   private int[] T003A14_A252CliCod ;
   private boolean[] T003A14_n252CliCod ;
   private String[] T003A14_A65ArtCod ;
   private boolean[] T003A14_n65ArtCod ;
   private String[] T003A15_A396EmprCod ;
   private int[] T003A15_A252CliCod ;
   private boolean[] T003A15_n252CliCod ;
   private String[] T003A15_A65ArtCod ;
   private boolean[] T003A15_n65ArtCod ;
   private String[] T003A2_A3072ArtObsLon ;
   private boolean[] T003A2_n3072ArtObsLon ;
   private String[] T003A2_A65ArtCod ;
   private boolean[] T003A2_n65ArtCod ;
   private String[] T003A2_A87ArtMat ;
   private boolean[] T003A2_n87ArtMat ;
   private String[] T003A2_A69ArtDsc ;
   private boolean[] T003A2_n69ArtDsc ;
   private String[] T003A2_A73ArtEti ;
   private boolean[] T003A2_n73ArtEti ;
   private byte[] T003A2_A117ArtUrg ;
   private boolean[] T003A2_n117ArtUrg ;
   private String[] T003A2_A105ArtTra1 ;
   private boolean[] T003A2_n105ArtTra1 ;
   private String[] T003A2_A106ArtTra2 ;
   private boolean[] T003A2_n106ArtTra2 ;
   private String[] T003A2_A107ArtTra3 ;
   private boolean[] T003A2_n107ArtTra3 ;
   private short[] T003A2_A108ArtTraP1 ;
   private boolean[] T003A2_n108ArtTraP1 ;
   private short[] T003A2_A109ArtTraP2 ;
   private boolean[] T003A2_n109ArtTraP2 ;
   private short[] T003A2_A110ArtTraP3 ;
   private boolean[] T003A2_n110ArtTraP3 ;
   private String[] T003A2_A111ArtUrd1 ;
   private boolean[] T003A2_n111ArtUrd1 ;
   private String[] T003A2_A112ArtUrd2 ;
   private boolean[] T003A2_n112ArtUrd2 ;
   private String[] T003A2_A113ArtUrd3 ;
   private boolean[] T003A2_n113ArtUrd3 ;
   private short[] T003A2_A114ArtUrdP1 ;
   private boolean[] T003A2_n114ArtUrdP1 ;
   private short[] T003A2_A115ArtUrdP2 ;
   private boolean[] T003A2_n115ArtUrdP2 ;
   private short[] T003A2_A116ArtUrdP3 ;
   private boolean[] T003A2_n116ArtUrdP3 ;
   private String[] T003A2_A967ArtNMtr ;
   private boolean[] T003A2_n967ArtNMtr ;
   private String[] T003A2_A89ArtObs ;
   private boolean[] T003A2_n89ArtObs ;
   private String[] T003A2_A90ArtObsFac ;
   private boolean[] T003A2_n90ArtObsFac ;
   private byte[] T003A2_A2750ArtNumTex1 ;
   private boolean[] T003A2_n2750ArtNumTex1 ;
   private short[] T003A2_A2751ArtNumTex2 ;
   private boolean[] T003A2_n2751ArtNumTex2 ;
   private java.math.BigDecimal[] T003A2_A2791ArtFacAbs ;
   private boolean[] T003A2_n2791ArtFacAbs ;
   private java.util.Date[] T003A2_A3683ArtFecCre ;
   private boolean[] T003A2_n3683ArtFecCre ;
   private String[] T003A2_A4353ArtUsrCod ;
   private boolean[] T003A2_n4353ArtUsrCod ;
   private java.util.Date[] T003A2_A4354ArtFecMod ;
   private boolean[] T003A2_n4354ArtFecMod ;
   private String[] T003A2_A4980ArtCdb ;
   private boolean[] T003A2_n4980ArtCdb ;
   private short[] T003A2_A3123ArtAncSal2 ;
   private boolean[] T003A2_n3123ArtAncSal2 ;
   private short[] T003A2_A3122ArtAncSal1 ;
   private boolean[] T003A2_n3122ArtAncSal1 ;
   private String[] T003A2_A2834ArtPle2 ;
   private boolean[] T003A2_n2834ArtPle2 ;
   private String[] T003A2_A7779ArtBlo ;
   private boolean[] T003A2_n7779ArtBlo ;
   private String[] T003A2_A396EmprCod ;
   private int[] T003A2_A252CliCod ;
   private boolean[] T003A2_n252CliCod ;
   private short[] T003A2_A829TipArtCod ;
   private String[] T003A2_A2707NumTexCod ;
   private boolean[] T003A2_n2707NumTexCod ;
   private String[] T003A19_A407EmprNom ;
   private boolean[] T003A19_n407EmprNom ;
   private String[] T003A20_A279CliNom ;
   private byte[] T003A20_A306CliUrg ;
   private String[] T003A21_A830TipArtDsc ;
   private boolean[] T003A21_n830TipArtDsc ;
   private String[] T003A22_A2708NumTexDsc ;
   private boolean[] T003A22_n2708NumTexDsc ;
   private String[] T003A23_A396EmprCod ;
   private int[] T003A23_A252CliCod ;
   private boolean[] T003A23_n252CliCod ;
   private String[] T003A23_A65ArtCod ;
   private boolean[] T003A23_n65ArtCod ;
   private byte[] T003A23_A499GrpFamCod ;
   private String[] T003A24_A396EmprCod ;
   private int[] T003A24_A252CliCod ;
   private boolean[] T003A24_n252CliCod ;
   private String[] T003A24_A12814ARTConID ;
   private String[] T003A24_A65ArtCod ;
   private boolean[] T003A24_n65ArtCod ;
   private String[] T003A25_A396EmprCod ;
   private int[] T003A25_A252CliCod ;
   private boolean[] T003A25_n252CliCod ;
   private String[] T003A25_A65ArtCod ;
   private boolean[] T003A25_n65ArtCod ;
   private byte[] T003A25_A12363SocInt ;
   private String[] T003A26_A396EmprCod ;
   private java.util.Date[] T003A26_A4929Inc_Dia ;
   private short[] T003A26_A5728JBCLLin ;
   private String[] T003A27_A396EmprCod ;
   private int[] T003A27_A252CliCod ;
   private boolean[] T003A27_n252CliCod ;
   private String[] T003A27_A5809MMezCod ;
   private String[] T003A27_A65ArtCod ;
   private boolean[] T003A27_n65ArtCod ;
   private String[] T003A28_A396EmprCod ;
   private int[] T003A28_A252CliCod ;
   private boolean[] T003A28_n252CliCod ;
   private String[] T003A28_A5234MezCod ;
   private byte[] T003A28_A5240MezLin ;
   private String[] T003A29_A396EmprCod ;
   private int[] T003A29_A252CliCod ;
   private boolean[] T003A29_n252CliCod ;
   private String[] T003A29_A65ArtCod ;
   private boolean[] T003A29_n65ArtCod ;
   private int[] T003A29_A4116estreclim ;
   private String[] T003A30_A396EmprCod ;
   private int[] T003A30_A252CliCod ;
   private boolean[] T003A30_n252CliCod ;
   private String[] T003A30_A65ArtCod ;
   private boolean[] T003A30_n65ArtCod ;
   private String[] T003A30_A4061EstNomCol ;
   private String[] T003A31_A396EmprCod ;
   private String[] T003A31_A9705ErpNped ;
   private short[] T003A31_A8652ErpLin ;
   private String[] T003A32_A396EmprCod ;
   private int[] T003A32_A252CliCod ;
   private boolean[] T003A32_n252CliCod ;
   private String[] T003A32_A65ArtCod ;
   private boolean[] T003A32_n65ArtCod ;
   private String[] T003A32_A7266CAAqP ;
   private String[] T003A33_A396EmprCod ;
   private int[] T003A33_A252CliCod ;
   private boolean[] T003A33_n252CliCod ;
   private String[] T003A33_A65ArtCod ;
   private boolean[] T003A33_n65ArtCod ;
   private java.util.Date[] T003A33_A11084H_DiaA ;
   private String[] T003A34_A396EmprCod ;
   private int[] T003A34_A252CliCod ;
   private boolean[] T003A34_n252CliCod ;
   private String[] T003A34_A65ArtCod ;
   private boolean[] T003A34_n65ArtCod ;
   private byte[] T003A34_A10972Int_cod ;
   private String[] T003A35_A396EmprCod ;
   private int[] T003A35_A252CliCod ;
   private boolean[] T003A35_n252CliCod ;
   private String[] T003A35_A65ArtCod ;
   private boolean[] T003A35_n65ArtCod ;
   private String[] T003A35_A10577Pg_Procod ;
   private String[] T003A36_A396EmprCod ;
   private int[] T003A36_A252CliCod ;
   private boolean[] T003A36_n252CliCod ;
   private String[] T003A36_A65ArtCod ;
   private boolean[] T003A36_n65ArtCod ;
   private String[] T003A36_A10272Hz_cod ;
   private String[] T003A37_A396EmprCod ;
   private int[] T003A37_A252CliCod ;
   private boolean[] T003A37_n252CliCod ;
   private String[] T003A37_A65ArtCod ;
   private boolean[] T003A37_n65ArtCod ;
   private String[] T003A37_A10041ArtSH ;
   private String[] T003A38_A396EmprCod ;
   private int[] T003A38_A252CliCod ;
   private boolean[] T003A38_n252CliCod ;
   private String[] T003A38_A65ArtCod ;
   private boolean[] T003A38_n65ArtCod ;
   private String[] T003A38_A8427TipoCt ;
   private int[] T003A38_A8428CapMxMq ;
   private String[] T003A39_A396EmprCod ;
   private int[] T003A39_A252CliCod ;
   private boolean[] T003A39_n252CliCod ;
   private String[] T003A39_A65ArtCod ;
   private boolean[] T003A39_n65ArtCod ;
   private short[] T003A39_A8342CodPred ;
   private String[] T003A40_A396EmprCod ;
   private int[] T003A40_A252CliCod ;
   private boolean[] T003A40_n252CliCod ;
   private String[] T003A40_A65ArtCod ;
   private boolean[] T003A40_n65ArtCod ;
   private String[] T003A40_A8089ArtcodTj ;
   private String[] T003A41_A396EmprCod ;
   private int[] T003A41_A252CliCod ;
   private boolean[] T003A41_n252CliCod ;
   private String[] T003A41_A65ArtCod ;
   private boolean[] T003A41_n65ArtCod ;
   private String[] T003A41_A7956Mq_CodM ;
   private String[] T003A42_A396EmprCod ;
   private int[] T003A42_A252CliCod ;
   private boolean[] T003A42_n252CliCod ;
   private String[] T003A42_A65ArtCod ;
   private boolean[] T003A42_n65ArtCod ;
   private short[] T003A42_A7949Par_Art ;
   private String[] T003A43_A396EmprCod ;
   private int[] T003A43_A252CliCod ;
   private boolean[] T003A43_n252CliCod ;
   private String[] T003A43_A65ArtCod ;
   private boolean[] T003A43_n65ArtCod ;
   private short[] T003A43_A7135Lin_fast ;
   private String[] T003A44_A396EmprCod ;
   private int[] T003A44_A252CliCod ;
   private boolean[] T003A44_n252CliCod ;
   private String[] T003A44_A65ArtCod ;
   private boolean[] T003A44_n65ArtCod ;
   private short[] T003A44_A6954Mat_lin ;
   private String[] T003A45_A396EmprCod ;
   private String[] T003A45_A602MaqCod ;
   private int[] T003A45_A6078MaqCliCod ;
   private String[] T003A45_A6079MaqArtCod ;
   private String[] T003A46_A396EmprCod ;
   private int[] T003A46_A252CliCod ;
   private boolean[] T003A46_n252CliCod ;
   private String[] T003A46_A65ArtCod ;
   private boolean[] T003A46_n65ArtCod ;
   private short[] T003A46_A5382EstCatAny ;
   private String[] T003A46_A5383EstCatSer ;
   private short[] T003A46_A5384EstCatTip ;
   private String[] T003A47_A396EmprCod ;
   private int[] T003A47_A252CliCod ;
   private boolean[] T003A47_n252CliCod ;
   private String[] T003A47_A65ArtCod ;
   private boolean[] T003A47_n65ArtCod ;
   private String[] T003A47_A4658MdlCod ;
   private String[] T003A48_A396EmprCod ;
   private int[] T003A48_A252CliCod ;
   private boolean[] T003A48_n252CliCod ;
   private String[] T003A48_A4175WebEmpCod ;
   private String[] T003A49_A396EmprCod ;
   private int[] T003A49_A252CliCod ;
   private boolean[] T003A49_n252CliCod ;
   private String[] T003A49_A4079WEBDISCOD ;
   private String[] T003A50_A396EmprCod ;
   private int[] T003A50_A252CliCod ;
   private boolean[] T003A50_n252CliCod ;
   private String[] T003A50_A65ArtCod ;
   private boolean[] T003A50_n65ArtCod ;
   private String[] T003A50_A4058CCFColNom ;
   private int[] T003A50_A4059CCFColNum ;
   private String[] T003A51_A396EmprCod ;
   private int[] T003A51_A252CliCod ;
   private boolean[] T003A51_n252CliCod ;
   private String[] T003A51_A65ArtCod ;
   private boolean[] T003A51_n65ArtCod ;
   private String[] T003A51_A1177Dibujo ;
   private int[] T003A51_A1790DibIntCod ;
   private String[] T003A52_A396EmprCod ;
   private int[] T003A52_A252CliCod ;
   private boolean[] T003A52_n252CliCod ;
   private String[] T003A52_A65ArtCod ;
   private boolean[] T003A52_n65ArtCod ;
   private byte[] T003A52_A1080LinPre ;
   private String[] T003A53_A396EmprCod ;
   private long[] T003A53_A3814PePCod ;
   private String[] T003A54_A396EmprCod ;
   private byte[] T003A54_A3413OpeManCod ;
   private String[] T003A54_A3430PreManNMt ;
   private int[] T003A54_A252CliCod ;
   private boolean[] T003A54_n252CliCod ;
   private String[] T003A54_A65ArtCod ;
   private boolean[] T003A54_n65ArtCod ;
   private String[] T003A55_A396EmprCod ;
   private int[] T003A55_A3415ParManNum ;
   private String[] T003A56_A396EmprCod ;
   private byte[] T003A56_A3331LanBroCod ;
   private short[] T003A56_A3333LanBroLin ;
   private String[] T003A57_A396EmprCod ;
   private int[] T003A57_A252CliCod ;
   private boolean[] T003A57_n252CliCod ;
   private String[] T003A57_A65ArtCod ;
   private boolean[] T003A57_n65ArtCod ;
   private java.math.BigDecimal[] T003A57_A3319ArtCapKgs ;
   private String[] T003A58_A396EmprCod ;
   private int[] T003A58_A252CliCod ;
   private boolean[] T003A58_n252CliCod ;
   private String[] T003A58_A65ArtCod ;
   private boolean[] T003A58_n65ArtCod ;
   private String[] T003A58_A3288CCalCod ;
   private String[] T003A59_A396EmprCod ;
   private int[] T003A59_A252CliCod ;
   private boolean[] T003A59_n252CliCod ;
   private String[] T003A59_A65ArtCod ;
   private boolean[] T003A59_n65ArtCod ;
   private String[] T003A59_A3033CCCod ;
   private String[] T003A60_A396EmprCod ;
   private int[] T003A60_A252CliCod ;
   private boolean[] T003A60_n252CliCod ;
   private String[] T003A60_A65ArtCod ;
   private boolean[] T003A60_n65ArtCod ;
   private byte[] T003A60_A2937RecIntCod ;
   private String[] T003A61_A396EmprCod ;
   private int[] T003A61_A252CliCod ;
   private boolean[] T003A61_n252CliCod ;
   private String[] T003A61_A65ArtCod ;
   private boolean[] T003A61_n65ArtCod ;
   private short[] T003A61_A2931Limite2 ;
   private String[] T003A62_A396EmprCod ;
   private int[] T003A62_A252CliCod ;
   private boolean[] T003A62_n252CliCod ;
   private String[] T003A62_A65ArtCod ;
   private boolean[] T003A62_n65ArtCod ;
   private short[] T003A62_A71ArtEstAny ;
   private String[] T003A62_A2756ArtEstSer ;
   private String[] T003A63_A396EmprCod ;
   private int[] T003A63_A252CliCod ;
   private boolean[] T003A63_n252CliCod ;
   private String[] T003A63_A1504CliProCod ;
   private String[] T003A63_A65ArtCod ;
   private boolean[] T003A63_n65ArtCod ;
   private String[] T003A64_A396EmprCod ;
   private int[] T003A64_A252CliCod ;
   private boolean[] T003A64_n252CliCod ;
   private String[] T003A64_A65ArtCod ;
   private boolean[] T003A64_n65ArtCod ;
   private byte[] T003A64_A598LinRec ;
   private String[] T003A65_A396EmprCod ;
   private int[] T003A65_A252CliCod ;
   private boolean[] T003A65_n252CliCod ;
   private String[] T003A65_A65ArtCod ;
   private boolean[] T003A65_n65ArtCod ;
   private byte[] T003A65_A831TipColCod ;
   private String[] T003A66_A396EmprCod ;
   private int[] T003A66_A252CliCod ;
   private boolean[] T003A66_n252CliCod ;
   private String[] T003A66_A65ArtCod ;
   private boolean[] T003A66_n65ArtCod ;
   private String[] T003A66_A758ProCod ;
   private String[] T003A67_A396EmprCod ;
   private int[] T003A67_A252CliCod ;
   private boolean[] T003A67_n252CliCod ;
   private String[] T003A67_A65ArtCod ;
   private boolean[] T003A67_n65ArtCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tartich__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartich__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartich__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartich__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartich__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T003A2", "SELECT ArtObsLon, ArtCod, ArtMat, ArtDsc, ArtEti, ArtUrg, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtNMtr, ArtObs, ArtObsFac, ArtNumTex1, ArtNumTex2, ArtFacAbs, ArtFecCre, ArtUsrCod, ArtFecMod, ArtCdb, ArtAncSal2, ArtAncSal1, ArtPle2, ArtBlo, EmprCod, CliCod, TipArtCod, NumTexCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtMat, ArtDsc, ArtEti, ArtUrg, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtNMtr, ArtObs, ArtObsFac, ArtNumTex1, ArtNumTex2, ArtObsLon, ArtFacAbs, ArtFecCre, ArtUsrCod, ArtFecMod, ArtCdb, ArtAncSal2, ArtAncSal1, ArtPle2, ArtBlo, TipArtCod, NumTexCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A3", "SELECT ArtObsLon, ArtCod, ArtMat, ArtDsc, ArtEti, ArtUrg, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtNMtr, ArtObs, ArtObsFac, ArtNumTex1, ArtNumTex2, ArtFacAbs, ArtFecCre, ArtUsrCod, ArtFecMod, ArtCdb, ArtAncSal2, ArtAncSal1, ArtPle2, ArtBlo, EmprCod, CliCod, TipArtCod, NumTexCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A5", "SELECT CliNom, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A6", "SELECT TipArtDsc FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A7", "SELECT NumTexDsc FROM TXPNUMTEX WHERE EmprCod = ? AND NumTexCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A8", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtObsLon, TM1.ArtCod, T3.CliNom, T2.EmprNom, TM1.ArtMat, T4.TipArtDsc, TM1.ArtDsc, TM1.ArtEti, T3.CliUrg, TM1.ArtUrg, TM1.ArtTra1, TM1.ArtTra2, TM1.ArtTra3, TM1.ArtTraP1, TM1.ArtTraP2, TM1.ArtTraP3, TM1.ArtUrd1, TM1.ArtUrd2, TM1.ArtUrd3, TM1.ArtUrdP1, TM1.ArtUrdP2, TM1.ArtUrdP3, TM1.ArtNMtr, TM1.ArtObs, TM1.ArtObsFac, TM1.ArtNumTex1, TM1.ArtNumTex2, T5.NumTexDsc, TM1.ArtFacAbs, TM1.ArtFecCre, TM1.ArtUsrCod, TM1.ArtFecMod, TM1.ArtCdb, TM1.ArtAncSal2, TM1.ArtAncSal1, TM1.ArtPle2, TM1.ArtBlo, TM1.EmprCod, TM1.CliCod, TM1.TipArtCod, TM1.NumTexCod FROM ((((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPTIPART T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipArtCod = TM1.TipArtCod) LEFT JOIN TXPNUMTEX T5 ON T5.EmprCod = TM1.EmprCod AND T5.NumTexCod = TM1.NumTexCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A10", "SELECT TipArtDsc FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A11", "SELECT NumTexDsc FROM TXPNUMTEX WHERE EmprCod = ? AND NumTexCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A12", "SELECT CliNom, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ArtCod > ?) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ArtCod < ?) ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T003A16", "INSERT INTO TXPARTICU(ArtCod, ArtMat, ArtDsc, ArtEti, ArtUrg, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtNMtr, ArtObs, ArtObsFac, ArtNumTex1, ArtNumTex2, ArtObsLon, ArtFacAbs, ArtFecCre, ArtUsrCod, ArtFecMod, ArtCdb, ArtAncSal2, ArtAncSal1, ArtPle2, ArtBlo, EmprCod, CliCod, TipArtCod, NumTexCod, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtMer, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtCosBase, ArtNumCor, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T003A17", "UPDATE TXPARTICU SET ArtMat=?, ArtDsc=?, ArtEti=?, ArtUrg=?, ArtTra1=?, ArtTra2=?, ArtTra3=?, ArtTraP1=?, ArtTraP2=?, ArtTraP3=?, ArtUrd1=?, ArtUrd2=?, ArtUrd3=?, ArtUrdP1=?, ArtUrdP2=?, ArtUrdP3=?, ArtNMtr=?, ArtObs=?, ArtObsFac=?, ArtNumTex1=?, ArtNumTex2=?, ArtObsLon=?, ArtFacAbs=?, ArtFecCre=?, ArtUsrCod=?, ArtFecMod=?, ArtCdb=?, ArtAncSal2=?, ArtAncSal1=?, ArtPle2=?, ArtBlo=?, TipArtCod=?, NumTexCod=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T003A18", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T003A19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A20", "SELECT CliNom, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A21", "SELECT TipArtDsc FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A22", "SELECT NumTexDsc FROM TXPNUMTEX WHERE EmprCod = ? AND NumTexCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003A23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A24", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A25", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A26", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A27", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A28", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A30", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A31", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A32", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A33", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A34", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A35", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A36", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A37", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A38", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A39", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A40", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A41", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A42", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A43", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A44", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A45", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A46", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A47", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A48", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A49", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A50", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A51", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A52", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A53", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A54", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A55", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A56", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A57", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A58", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A59", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A60", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A61", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A62", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A63", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A64", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A65", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A66", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003A67", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 60);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 40);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 20);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 3);
               ((int[]) buf[64])[0] = rslt.getInt(34);
               ((short[]) buf[65])[0] = rslt.getShort(35);
               ((String[]) buf[66])[0] = rslt.getString(36, 4);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 60);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 40);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 20);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 3);
               ((int[]) buf[64])[0] = rslt.getInt(34);
               ((short[]) buf[65])[0] = rslt.getShort(35);
               ((String[]) buf[66])[0] = rslt.getString(36, 4);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 4);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 4);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 4);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 10);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 60);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(25, 40);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[55])[0] = rslt.getGXDate(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(32);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(33, 20);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(35);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 30);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 3);
               ((int[]) buf[72])[0] = rslt.getInt(39);
               ((short[]) buf[73])[0] = rslt.getShort(40);
               ((String[]) buf[74])[0] = rslt.getString(41, 4);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 26);
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
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 4);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 4);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 4);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 4);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 10);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 60);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 40);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[41]).byteValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(23, (String)parms[45]);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DATE );
               }
               else
               {
                  stmt.setDate(25, (java.util.Date)parms[49]);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 8);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DATE );
               }
               else
               {
                  stmt.setDate(27, (java.util.Date)parms[53]);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 20);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 30);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 1);
               }
               stmt.setString(33, (String)parms[64], 3);
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(34, ((Number) parms[66]).intValue());
               }
               stmt.setShort(35, ((Number) parms[67]).shortValue());
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[69], 4);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
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
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 4);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 4);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 4);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 4);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 10);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 60);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 40);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[39]).byteValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(22, (String)parms[43]);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DATE );
               }
               else
               {
                  stmt.setDate(24, (java.util.Date)parms[47]);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 8);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DATE );
               }
               else
               {
                  stmt.setDate(26, (java.util.Date)parms[51]);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 20);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 30);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 1);
               }
               stmt.setShort(32, ((Number) parms[62]).shortValue());
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[64], 4);
               }
               stmt.setString(34, (String)parms[65], 3);
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(35, ((Number) parms[67]).intValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[69], 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
      }
   }

}

