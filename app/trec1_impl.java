package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trec1_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5110RecNumPrg = httpContext.GetPar( "RecNumPrg") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
         AV121ExiMac = (byte)(GXutil.lval( httpContext.GetPar( "ExiMac"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV121ExiMac", GXutil.str( AV121ExiMac, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_12A408( A396EmprCod, A5110RecNumPrg, AV121ExiMac) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         AV126rectotkgm = CommonUtil.decimalVal( httpContext.GetPar( "rectotkgm"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126rectotkgm", GXutil.ltrimstr( AV126rectotkgm, 10, 2));
         A2805RecVolPrd = (int)(GXutil.lval( httpContext.GetPar( "RecVolPrd"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         AV118MaqCodold = httpContext.GetPar( "MaqCodold") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", AV118MaqCodold);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         AV123VolPProc = (byte)(GXutil.lval( httpContext.GetPar( "VolPProc"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV123VolPProc", GXutil.str( AV123VolPProc, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_28_12A408( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, AV126rectotkgm, A2805RecVolPrd, AV118MaqCodold, A602MaqCod, AV123VolPProc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         AV16UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
         A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         AV125Msg_v = httpContext.GetPar( "Msg_v") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV125Msg_v", AV125Msg_v);
         AV126rectotkgm = CommonUtil.decimalVal( httpContext.GetPar( "rectotkgm"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126rectotkgm", GXutil.ltrimstr( AV126rectotkgm, 10, 2));
         AV128rectotpie = (int)(GXutil.lval( httpContext.GetPar( "rectotpie"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV128rectotpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128rectotpie), 5, 0));
         AV127rectotmtr = CommonUtil.decimalVal( httpContext.GetPar( "rectotmtr"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV127rectotmtr", GXutil.ltrimstr( AV127rectotmtr, 10, 2));
         AV118MaqCodold = httpContext.GetPar( "MaqCodold") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", AV118MaqCodold);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A618MaqTemMax = (short)(GXutil.lval( httpContext.GetPar( "MaqTemMax"))) ;
         n618MaqTemMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
         A625MaqVolMin = (int)(GXutil.lval( httpContext.GetPar( "MaqVolMin"))) ;
         n625MaqVolMin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
         A2805RecVolPrd = (int)(GXutil.lval( httpContext.GetPar( "RecVolPrd"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         AV139Modo = httpContext.GetPar( "Modo") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV139Modo", AV139Modo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_12A408( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV16UsurCod, A2804RecLinMaq, AV125Msg_v, AV126rectotkgm, AV128rectotpie, AV127rectotmtr, AV118MaqCodold, A602MaqCod, A618MaqTemMax, A625MaqVolMin, A2805RecVolPrd, AV139Modo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"RECVOLMD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asarecvolmd12A408( A396EmprCod, A180BarMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"RECVOLMN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asarecvolmn12A408( A396EmprCod, A180BarMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"RECVOLMX") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asarecvolmx12A408( A396EmprCod, A180BarMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A396EmprCod, A602MaqCod) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            AV16UsurCod = httpContext.GetPar( "UsurCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
            A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            AV126rectotkgm = CommonUtil.decimalVal( httpContext.GetPar( "rectotkgm"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126rectotkgm", GXutil.ltrimstr( AV126rectotkgm, 10, 2));
            AV127rectotmtr = CommonUtil.decimalVal( httpContext.GetPar( "rectotmtr"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127rectotmtr", GXutil.ltrimstr( AV127rectotmtr, 10, 2));
            AV128rectotpie = (int)(GXutil.lval( httpContext.GetPar( "rectotpie"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128rectotpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128rectotpie), 5, 0));
            AV139Modo = httpContext.GetPar( "Modo") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139Modo", AV139Modo);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TRATAMIENTO RECETA-MAQUINA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public trec1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trec1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trec1_impl.class ));
   }

   public trec1_impl( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbBarEstReo = new HTMLChoice();
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
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), true);
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 5,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREC1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREC1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREC1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREC1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Codigo Tipo Colorante", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Codigo Maquina", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMaqCod_Internalname, GXutil.rtrim( A180BarMaqCod), GXutil.rtrim( localUtil.format( A180BarMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMat_Internalname, GXutil.rtrim( A182BarMat), GXutil.rtrim( localUtil.format( A182BarMat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMat_Jsonclick, 0, "", "", "", "", "", 1, edtBarMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Suavizado", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSua_Internalname, GXutil.rtrim( A214BarSua), GXutil.rtrim( localUtil.format( A214BarSua, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSua_Jsonclick, 0, "", "", "", "", "", 1, edtBarSua_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Volumen", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarVolMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarVolMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarVolMaq_Jsonclick, 0, "", "", "", "", "", 1, edtBarVolMaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Numero Añadidas", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumAny_Internalname, GXutil.ltrim( localUtil.ntoc( A189BarNumAny, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A189BarNumAny), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A189BarNumAny), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumAny_Jsonclick, 0, "", "", "", "", "", 1, edtBarNumAny_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "EmCodVir", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmCodVir_Internalname, GXutil.rtrim( A393EmCodVir), GXutil.rtrim( localUtil.format( A393EmCodVir, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmCodVir_Jsonclick, 0, "", "", "", "", "", 1, edtEmCodVir_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "FindTmx", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A918FindTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A918FindTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A918FindTmx), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindTmx_Jsonclick, 0, "", "", "", "", "", 1, edtFindTmx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "FindVolMin", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMin_Internalname, GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A480FindVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A480FindVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMin_Jsonclick, 0, "", "", "", "", "", 1, edtFindVolMin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "FindVolMax", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMax_Internalname, GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A478FindVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A478FindVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMax_Jsonclick, 0, "", "", "", "", "", 1, edtFindVolMax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Ultima Linea Maquina", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtUltLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A2803UltLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtUltLinMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2803UltLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2803UltLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUltLinMaq_Jsonclick, 0, "", "", "", "", "", 1, edtUltLinMaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Estado Reoperado", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbBarEstReo, cmbBarEstReo.getInternalname(), GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)), 1, cmbBarEstReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbBarEstReo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TREC1.htm");
      cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Vol Mx", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecVolMx_Internalname, GXutil.ltrim( localUtil.ntoc( A8644RecVolMx, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecVolMx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8644RecVolMx), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8644RecVolMx), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecVolMx_Jsonclick, 0, "", "", "", "", "", 1, edtRecVolMx_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Vol Mn", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecVolMn_Internalname, GXutil.ltrim( localUtil.ntoc( A8645RecVolMn, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecVolMn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8645RecVolMn), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8645RecVolMn), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecVolMn_Jsonclick, 0, "", "", "", "", "", 1, edtRecVolMn_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Vol Md", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecVolMd_Internalname, GXutil.ltrim( localUtil.ntoc( A8646RecVolMd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecVolMd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8646RecVolMd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8646RecVolMd), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecVolMd_Jsonclick, 0, "", "", "", "", "", 1, edtRecVolMd_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Linea Maquina", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecLinMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinMaq_Jsonclick, 0, "", "", "", "", "", 1, edtRecLinMaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Volumen por Linea Maquina", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecVolPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecVolPrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2805RecVolPrd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2805RecVolPrd), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecVolPrd_Jsonclick, 0, "", "", "", "", "", 1, edtRecVolPrd_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Factor Absorcion de la Serie", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecFA_Internalname, GXutil.ltrim( localUtil.ntoc( A2806RecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecFA_Enabled!=0) ? localUtil.format( A2806RecFA, "ZZ9.99") : localUtil.format( A2806RecFA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecFA_Jsonclick, 0, "", "", "", "", "", 1, edtRecFA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Ultima Linea Proceso Receta", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUltLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A1272UltLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtUltLinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1272UltLinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1272UltLinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUltLinPro_Jsonclick, 0, "", "", "", "", "", 1, edtUltLinPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Volumen Maximo", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolMax_Internalname, GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A623MaqVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A623MaqVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolMax_Jsonclick, 0, "", "", "", "", "", 1, edtMaqVolMax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Volumen Minimo", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolMin_Internalname, GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A625MaqVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A625MaqVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolMin_Jsonclick, 0, "", "", "", "", "", 1, edtMaqVolMin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Volumen Medio", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqVolMed_Internalname, GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqVolMed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A624MaqVolMed), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A624MaqVolMed), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqVolMed_Jsonclick, 0, "", "", "", "", "", 1, edtMaqVolMed_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Temperatura Maxima", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTemMax_Internalname, GXutil.ltrim( localUtil.ntoc( A618MaqTemMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqTemMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A618MaqTemMax), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A618MaqTemMax), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTemMax_Jsonclick, 0, "", "", "", "", "", 1, edtMaqTemMax_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Usuario Receta", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecUsrCod_Internalname, GXutil.rtrim( A4402RecUsrCod), GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecUsrCod_Jsonclick, 0, "", "", "", "", "", 1, edtRecUsrCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Hora Fecha Pesaje.", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRecFecPes_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecFecPes_Internalname, localUtil.ttoc( A4574RecFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4574RecFecPes, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecFecPes_Jsonclick, 0, "", "", "", "", "", 1, edtRecFecPes_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRecFecPes_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRecFecPes_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TREC1.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Linea Maquina Pesada", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqPes_Internalname, GXutil.ltrim( localUtil.ntoc( A4575RecMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4575RecMaqPes), "9") : localUtil.format( DecimalUtil.doubleToDec(A4575RecMaqPes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqPes_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqPes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Numero Receta Interno,Aut?", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecNumInt_Internalname, GXutil.ltrim( localUtil.ntoc( A5109RecNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecNumInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5109RecNumInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5109RecNumInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecNumInt_Jsonclick, 0, "", "", "", "", "", 1, edtRecNumInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Numero Programa Aut", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecNumPrg_Internalname, GXutil.rtrim( A5110RecNumPrg), GXutil.rtrim( localUtil.format( A5110RecNumPrg, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecNumPrg_Jsonclick, 0, "", "", "", "", "", 1, edtRecNumPrg_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Vel Inicial Salhilho (Barco)", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecBp12_Internalname, GXutil.ltrim( localUtil.ntoc( A5111RecBp12, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecBp12_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5111RecBp12), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5111RecBp12), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecBp12_Jsonclick, 0, "", "", "", "", "", 1, edtRecBp12_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Tiempo Vueltas (Barco)", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecBp13_Internalname, GXutil.ltrim( localUtil.ntoc( A5112RecBp13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecBp13_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5112RecBp13), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5112RecBp13), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecBp13_Jsonclick, 0, "", "", "", "", "", 1, edtRecBp13_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Presion Jet (Barco)", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecBp14_Internalname, GXutil.ltrim( localUtil.ntoc( A5113RecBp14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecBp14_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5113RecBp14), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5113RecBp14), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecBp14_Jsonclick, 0, "", "", "", "", "", 1, edtRecBp14_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Velocidad Bomba (Barco)", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecBp15_Internalname, GXutil.ltrim( localUtil.ntoc( A5114RecBp15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecBp15_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5114RecBp15), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5114RecBp15), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecBp15_Jsonclick, 0, "", "", "", "", "", 1, edtRecBp15_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Factor Absorcion", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecAbsFac_Internalname, GXutil.ltrim( localUtil.ntoc( A5115RecAbsFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecAbsFac_Enabled!=0) ? localUtil.format( A5115RecAbsFac, "ZZ9.99") : localUtil.format( A5115RecAbsFac, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecAbsFac_Jsonclick, 0, "", "", "", "", "", 1, edtRecAbsFac_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Recepcionada del Automata?", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecRecep_Internalname, GXutil.ltrim( localUtil.ntoc( A4701RecRecep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecRecep_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4701RecRecep), "9") : localUtil.format( DecimalUtil.doubleToDec(A4701RecRecep), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecRecep_Jsonclick, 0, "", "", "", "", "", 1, edtRecRecep_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Enviado; 0,1=Enviado,2=En Maq", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecEnvio_Internalname, GXutil.ltrim( localUtil.ntoc( A4700RecEnvio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecEnvio_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4700RecEnvio), "9") : localUtil.format( DecimalUtil.doubleToDec(A4700RecEnvio), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecEnvio_Jsonclick, 0, "", "", "", "", "", 1, edtRecEnvio_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Programa 2", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrg2_Internalname, GXutil.rtrim( A6269RecPrg2), GXutil.rtrim( localUtil.format( A6269RecPrg2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrg2_Jsonclick, 0, "", "", "", "", "", 1, edtRecPrg2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Programa 3", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrg3_Internalname, GXutil.rtrim( A6270RecPrg3), GXutil.rtrim( localUtil.format( A6270RecPrg3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrg3_Jsonclick, 0, "", "", "", "", "", 1, edtRecPrg3_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Nh", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqNh_Internalname, GXutil.ltrim( localUtil.ntoc( A7764RecMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqNh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7764RecMaqNh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7764RecMaqNh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqNh_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqNh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "VX", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqVX_Internalname, GXutil.ltrim( localUtil.ntoc( A7765RecMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqVX_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7765RecMaqVX), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7765RecMaqVX), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqVX_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqVX_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "BL", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqBL_Internalname, GXutil.ltrim( localUtil.ntoc( A7766RecMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqBL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7766RecMaqBL), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7766RecMaqBL), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqBL_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqBL_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Flow", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqFlow_Internalname, GXutil.ltrim( localUtil.ntoc( A7767RecMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqFlow_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7767RecMaqFlow), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7767RecMaqFlow), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqFlow_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqFlow_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "RecMaqRPM", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqRPM_Internalname, GXutil.ltrim( localUtil.ntoc( A7768RecMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqRPM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7768RecMaqRPM), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7768RecMaqRPM), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqRPM_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqRPM_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Mol", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqMol_Internalname, GXutil.ltrim( localUtil.ntoc( A7769RecMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqMol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7769RecMaqMol), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7769RecMaqMol), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqMol_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqMol_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Torsión", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqTor_Internalname, GXutil.ltrim( localUtil.ntoc( A7770RecMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqTor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7770RecMaqTor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7770RecMaqTor), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqTor_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqTor_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Clapeta", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqCla_Internalname, GXutil.rtrim( A7771RecMaqCla), GXutil.rtrim( localUtil.format( A7771RecMaqCla, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqCla_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqCla_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "Tipo Tejido", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqTej_Internalname, GXutil.ltrim( localUtil.ntoc( A7772RecMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqTej_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7772RecMaqTej), "9") : localUtil.format( DecimalUtil.doubleToDec(A7772RecMaqTej), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,306);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqTej_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqTej_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Delicado", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqDel_Internalname, GXutil.ltrim( localUtil.ntoc( A7773RecMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqDel_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7773RecMaqDel), "9") : localUtil.format( DecimalUtil.doubleToDec(A7773RecMaqDel), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqDel_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqDel_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Peso Metro Lineal", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMaqPML_Internalname, GXutil.ltrim( localUtil.ntoc( A7774RecMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMaqPML_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7774RecMaqPML), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7774RecMaqPML), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMaqPML_Jsonclick, 0, "", "", "", "", "", 1, edtRecMaqPML_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtRecMaqObs_Internalname, A8353RecMaqObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,321);\"", (short)(0), 1, edtRecMaqObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "4000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecTotKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A4259RecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecTotKgs_Enabled!=0) ? localUtil.format( A4259RecTotKgs, "ZZZZZZ9.99") : localUtil.format( A4259RecTotKgs, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecTotKgs_Jsonclick, 0, "", "", "", "", "", 1, edtRecTotKgs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 329,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREC1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 330,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREC1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREC1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 332,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREC1.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 333,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TREC1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      e1112A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "Z2804RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( "Z2805RecVolPrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2806RecFA = localUtil.ctond( httpContext.cgiGet( "Z2806RecFA")) ;
            Z1272UltLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1272UltLinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4402RecUsrCod = httpContext.cgiGet( "Z4402RecUsrCod") ;
            Z4574RecFecPes = localUtil.ctot( httpContext.cgiGet( "Z4574RecFecPes"), 0) ;
            Z4575RecMaqPes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4575RecMaqPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5109RecNumInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z5109RecNumInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5110RecNumPrg = httpContext.cgiGet( "Z5110RecNumPrg") ;
            Z5111RecBp12 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5111RecBp12"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5112RecBp13 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5112RecBp13"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5113RecBp14 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5113RecBp14"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5114RecBp15 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5114RecBp15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5115RecAbsFac = localUtil.ctond( httpContext.cgiGet( "Z5115RecAbsFac")) ;
            Z4701RecRecep = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4701RecRecep"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4700RecEnvio = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4700RecEnvio"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6269RecPrg2 = httpContext.cgiGet( "Z6269RecPrg2") ;
            Z6270RecPrg3 = httpContext.cgiGet( "Z6270RecPrg3") ;
            Z7764RecMaqNh = (short)(localUtil.ctol( httpContext.cgiGet( "Z7764RecMaqNh"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7765RecMaqVX = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7765RecMaqVX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7766RecMaqBL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7766RecMaqBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7767RecMaqFlow = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7767RecMaqFlow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7768RecMaqRPM = (short)(localUtil.ctol( httpContext.cgiGet( "Z7768RecMaqRPM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7769RecMaqMol = (short)(localUtil.ctol( httpContext.cgiGet( "Z7769RecMaqMol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7770RecMaqTor = (short)(localUtil.ctol( httpContext.cgiGet( "Z7770RecMaqTor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7771RecMaqCla = httpContext.cgiGet( "Z7771RecMaqCla") ;
            Z7772RecMaqTej = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7772RecMaqTej"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7773RecMaqDel = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7773RecMaqDel"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7774RecMaqPML = (short)(localUtil.ctol( httpContext.cgiGet( "Z7774RecMaqPML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4259RecTotKgs = localUtil.ctond( httpContext.cgiGet( "Z4259RecTotKgs")) ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            O602MaqCod = httpContext.cgiGet( "O602MaqCod") ;
            O2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( "O2805RecVolPrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N602MaqCod = httpContext.cgiGet( "N602MaqCod") ;
            AV16UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV109MaqCodi = httpContext.cgiGet( "vMAQCODI") ;
            AV108Kohler = (byte)(localUtil.ctol( httpContext.cgiGet( "vKOHLER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV119Staack = (byte)(localUtil.ctol( httpContext.cgiGet( "vSTAACK"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV126rectotkgm = localUtil.ctond( httpContext.cgiGet( "vRECTOTKGM")) ;
            AV31RelBany = (short)(localUtil.ctol( httpContext.cgiGet( "vRELBANY"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV104ActDos = (byte)(localUtil.ctol( httpContext.cgiGet( "vACTDOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV118MaqCodold = httpContext.cgiGet( "vMAQCODOLD") ;
            AV121ExiMac = (byte)(localUtil.ctol( httpContext.cgiGet( "vEXIMAC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV125Msg_v = httpContext.cgiGet( "vMSG_V") ;
            AV123VolPProc = (byte)(localUtil.ctol( httpContext.cgiGet( "vVOLPPROC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV128rectotpie = (int)(localUtil.ctol( httpContext.cgiGet( "vRECTOTPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV127rectotmtr = localUtil.ctond( httpContext.cgiGet( "vRECTOTMTR")) ;
            AV139Modo = httpContext.cgiGet( "vMODO") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            AV142Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
            A182BarMat = httpContext.cgiGet( edtBarMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
            A214BarSua = httpContext.cgiGet( edtBarSua_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A214BarSua", A214BarSua);
            A236BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtBarVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
            A189BarNumAny = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A189BarNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A189BarNumAny), 3, 0));
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            A393EmCodVir = GXutil.upper( httpContext.cgiGet( edtEmCodVir_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A393EmCodVir", A393EmCodVir);
            A918FindTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtFindTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n918FindTmx = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A918FindTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A918FindTmx), 4, 0));
            A480FindVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n480FindVolMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
            A478FindVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n478FindVolMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
            A2803UltLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtUltLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2803UltLinMaq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2803UltLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2803UltLinMaq), 4, 0));
            cmbBarEstReo.setValue( httpContext.cgiGet( cmbBarEstReo.getInternalname()) );
            A148BarEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarEstReo.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
            A8644RecVolMx = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolMx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8644RecVolMx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8644RecVolMx), 5, 0));
            A8645RecVolMn = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8645RecVolMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8645RecVolMn), 5, 0));
            A8646RecVolMd = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolMd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8646RecVolMd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8646RecVolMd), 5, 0));
            A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECVOLPRD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecVolPrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2805RecVolPrd = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
            }
            else
            {
               A2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecFA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecFA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECFA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecFA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2806RecFA = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
            }
            else
            {
               A2806RecFA = localUtil.ctond( httpContext.cgiGet( edtRecFA_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtUltLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtUltLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ULTLINPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUltLinPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1272UltLinPro = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
            }
            else
            {
               A1272UltLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtUltLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
            }
            A623MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n623MaqVolMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
            A625MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n625MaqVolMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
            A624MaqVolMed = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n624MaqVolMed = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
            A618MaqTemMax = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqTemMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n618MaqTemMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
            A4402RecUsrCod = httpContext.cgiGet( edtRecUsrCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", A4402RecUsrCod);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtRecFecPes_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "RECFECPES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecFecPes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A4574RecFecPes = localUtil.ctot( httpContext.cgiGet( edtRecFecPes_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQPES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqPes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4575RecMaqPes = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
            }
            else
            {
               A4575RecMaqPes = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecNumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecNumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECNUMINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecNumInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5109RecNumInt = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
            }
            else
            {
               A5109RecNumInt = (int)(localUtil.ctol( httpContext.cgiGet( edtRecNumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
            }
            A5110RecNumPrg = httpContext.cgiGet( edtRecNumPrg_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECBP12");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecBp12_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5111RecBp12 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
            }
            else
            {
               A5111RecBp12 = (short)(localUtil.ctol( httpContext.cgiGet( edtRecBp12_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECBP13");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecBp13_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5112RecBp13 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
            }
            else
            {
               A5112RecBp13 = (short)(localUtil.ctol( httpContext.cgiGet( edtRecBp13_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp14_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp14_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECBP14");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecBp14_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5113RecBp14 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
            }
            else
            {
               A5113RecBp14 = (short)(localUtil.ctol( httpContext.cgiGet( edtRecBp14_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecBp15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECBP15");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecBp15_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5114RecBp15 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
            }
            else
            {
               A5114RecBp15 = (short)(localUtil.ctol( httpContext.cgiGet( edtRecBp15_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecAbsFac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecAbsFac_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECABSFAC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecAbsFac_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5115RecAbsFac = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
            }
            else
            {
               A5115RecAbsFac = localUtil.ctond( httpContext.cgiGet( edtRecAbsFac_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecRecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecRecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECRECEP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecRecep_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4701RecRecep = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
            }
            else
            {
               A4701RecRecep = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecRecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecEnvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecEnvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECENVIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecEnvio_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4700RecEnvio = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
            }
            else
            {
               A4700RecEnvio = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEnvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
            }
            A6269RecPrg2 = httpContext.cgiGet( edtRecPrg2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", A6269RecPrg2);
            A6270RecPrg3 = httpContext.cgiGet( edtRecPrg3_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", A6270RecPrg3);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQNH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqNh_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7764RecMaqNh = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
            }
            else
            {
               A7764RecMaqNh = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQVX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqVX_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7765RecMaqVX = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
            }
            else
            {
               A7765RecMaqVX = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQBL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqBL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7766RecMaqBL = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
            }
            else
            {
               A7766RecMaqBL = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQFLOW");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqFlow_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7767RecMaqFlow = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
            }
            else
            {
               A7767RecMaqFlow = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQRPM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqRPM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7768RecMaqRPM = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
            }
            else
            {
               A7768RecMaqRPM = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQMOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqMol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7769RecMaqMol = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
            }
            else
            {
               A7769RecMaqMol = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQTOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqTor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7770RecMaqTor = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
            }
            else
            {
               A7770RecMaqTor = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
            }
            A7771RecMaqCla = httpContext.cgiGet( edtRecMaqCla_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", A7771RecMaqCla);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQTEJ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqTej_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7772RecMaqTej = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
            }
            else
            {
               A7772RecMaqTej = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQDEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqDel_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7773RecMaqDel = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
            }
            else
            {
               A7773RecMaqDel = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAQPML");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMaqPML_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7774RecMaqPML = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
            }
            else
            {
               A7774RecMaqPML = (short)(localUtil.ctol( httpContext.cgiGet( edtRecMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
            }
            A8353RecMaqObs = httpContext.cgiGet( edtRecMaqObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecTotKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecTotKgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECTOTKGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecTotKgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4259RecTotKgs = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
            }
            else
            {
               A4259RecTotKgs = localUtil.ctond( httpContext.cgiGet( edtRecTotKgs_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TREC1");
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("trec1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
               standaloneModal( ) ;
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
                     if ( GXutil.strcmp(sEvt, "'AGRUPADAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'AGRUPADAS' */
                        e1212A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ELIMINAR RECETA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'ELIMINAR RECETA' */
                        e1312A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'IMPRIMIR RECETA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'IMPRIMIR RECETA' */
                        e1412A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e1112A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SELECCION PUERTO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Seleccion Puerto' */
                        e1512A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'VER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Ver' */
                        e1612A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'VER 2'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Ver 2' */
                        e1712A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1812A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "' OBSERVACIONES RECETA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: ' Observaciones Receta' */
                        e1912A2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
                     else if ( GXutil.strcmp(sEvt, "GET") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_get( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_check( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                        /* No code required for Help button. It is implemented at the Browser level. */
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
         /* Execute user event: After Trn */
         e1812A2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll12A408( ) ;
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
      bttBtn_get_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes12A408( ) ;
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

   public void confirm_12A0( )
   {
      beforeValidate12A408( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls12A408( ) ;
         }
         else
         {
            checkExtendedTable12A408( ) ;
            if ( AnyError == 0 )
            {
               zm12A408( 31) ;
               zm12A408( 32) ;
               zm12A408( 33) ;
               zm12A408( 34) ;
               zm12A408( 35) ;
               zm12A408( 36) ;
            }
            closeExtendedTableCursors12A408( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues12A0( ) ;
      }
   }

   public void resetCaption12A0( )
   {
   }

   public void e1112A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV38Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit0", AV38Lit0);
      GXt_char1 = AV39Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN272_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Lit1", AV39Lit1);
      GXt_char1 = AV40Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN275_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Lit2", AV40Lit2);
      GXt_char1 = AV41Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Lit3", AV41Lit3);
      GXt_char1 = AV42Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN133_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Lit4", AV42Lit4);
      GXt_char1 = AV43Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lit5", AV43Lit5);
      GXt_char1 = AV44Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV44Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lit6", AV44Lit6);
      GXt_char1 = AV45Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1360_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV45Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Lit7", AV45Lit7);
      GXt_char1 = AV46Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN289_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV46Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Lit8", AV46Lit8);
      GXt_char1 = AV47Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV47Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Lit9", AV47Lit9);
      GXt_char1 = AV48Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV48Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Lit10", AV48Lit10);
      GXt_char1 = AV49Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1345_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV49Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Lit11", AV49Lit11);
      GXt_char1 = AV50Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN288_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Lit12", AV50Lit12);
      GXt_char1 = AV51Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN327_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV51Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Lit13", AV51Lit13);
      GXt_char1 = AV52Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN140_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV52Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Lit14", AV52Lit14);
      GXt_char1 = AV53Lit20 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1148_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV53Lit20 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Lit20", AV53Lit20);
      GXt_char1 = AV54Lit21 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1155_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Lit21 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Lit21", AV54Lit21);
      GXt_char1 = AV55Lit22 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1163_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV55Lit22 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Lit22", AV55Lit22);
      GXt_char1 = AV67Lit23 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT191_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV67Lit23 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Lit23", AV67Lit23);
      GXt_char1 = AV68Lit24 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT23_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV68Lit24 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Lit24", AV68Lit24);
      GXt_char1 = AV69Lit25 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT192_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV69Lit25 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Lit25", AV69Lit25);
      GXt_char1 = AV75Lit26 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1332_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV75Lit26 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Lit26", AV75Lit26);
      GXt_char1 = AV66LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV66LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66LitFe", AV66LitFe);
      GXt_char1 = AV56msg0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG239_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV56msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56msg0", AV56msg0);
      GXt_char1 = AV57msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG102_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57msg1", AV57msg1);
      GXt_char1 = AV58msg2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG234_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV58msg2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58msg2", AV58msg2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58msg2, ""))));
      GXt_char1 = AV59msg3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG244_", ""), (byte)(99), GXv_char2) ;
      trec1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV59msg3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59msg3", AV59msg3);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59msg3, ""))));
      AV37Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
      GXv_char2[0] = AV37Station ;
      GXv_char3[0] = AV18ImpCod ;
      GXv_char4[0] = AV85Puerto ;
      new app.pbuimpu(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      trec1_impl.this.AV37Station = GXv_char2[0] ;
      trec1_impl.this.AV18ImpCod = GXv_char3[0] ;
      trec1_impl.this.AV85Puerto = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV18ImpCod", AV18ImpCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV85Puerto", AV85Puerto);
      AV36Escape = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Escape", AV36Escape);
      AV30Flag = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Flag", GXutil.str( AV30Flag, 1, 0));
      AV29FlagPro = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FlagPro", GXutil.str( AV29FlagPro, 1, 0));
      GXv_int5[0] = AV30Flag ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "038001", GXv_int5) ;
      trec1_impl.this.AV30Flag = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Flag", GXutil.str( AV30Flag, 1, 0));
      AV32Mod = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Mod", AV32Mod);
      GXv_int5[0] = AV61Dosif ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOSIFI", ""), GXv_int5) ;
      trec1_impl.this.AV61Dosif = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Dosif", GXutil.str( AV61Dosif, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDOSIF", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61Dosif), "9")));
      AV63FlagCor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63FlagCor", GXutil.str( AV63FlagCor, 1, 0));
      GXv_int5[0] = AV63FlagCor ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CORREA", ""), GXv_int5) ;
      trec1_impl.this.AV63FlagCor = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63FlagCor", GXutil.str( AV63FlagCor, 1, 0));
      AV65FlagH = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65FlagH", GXutil.str( AV65FlagH, 1, 0));
      GXv_int5[0] = AV65FlagH ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILO  ", ""), GXv_int5) ;
      trec1_impl.this.AV65FlagH = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65FlagH", GXutil.str( AV65FlagH, 1, 0));
      AV70FlagRP = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70FlagRP", GXutil.str( AV70FlagRP, 1, 0));
      GXv_int5[0] = AV70FlagRP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECPZA", ""), GXv_int5) ;
      trec1_impl.this.AV70FlagRP = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70FlagRP", GXutil.str( AV70FlagRP, 1, 0));
      AV71FlagGv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71FlagGv", GXutil.str( AV71FlagGv, 1, 0));
      GXv_int5[0] = AV71FlagGv ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GAVIM ", ""), GXv_int5) ;
      trec1_impl.this.AV71FlagGv = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71FlagGv", GXutil.str( AV71FlagGv, 1, 0));
      AV74FlagSal = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74FlagSal", GXutil.str( AV74FlagSal, 1, 0));
      GXv_int5[0] = AV74FlagSal ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int5) ;
      trec1_impl.this.AV74FlagSal = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74FlagSal", GXutil.str( AV74FlagSal, 1, 0));
      AV79JMolto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79JMolto", GXutil.str( AV79JMolto, 1, 0));
      GXv_int5[0] = AV79JMolto ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JMOLTO", ""), GXv_int5) ;
      trec1_impl.this.AV79JMolto = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79JMolto", GXutil.str( AV79JMolto, 1, 0));
      AV76vFlagETAL = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76vFlagETAL", GXutil.str( AV76vFlagETAL, 1, 0));
      GXv_int5[0] = AV76vFlagETAL ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETAL  ", ""), GXv_int5) ;
      trec1_impl.this.AV76vFlagETAL = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76vFlagETAL", GXutil.str( AV76vFlagETAL, 1, 0));
      AV78FlagBros = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78FlagBros", GXutil.str( AV78FlagBros, 1, 0));
      GXv_int5[0] = AV78FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int5) ;
      trec1_impl.this.AV78FlagBros = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78FlagBros", GXutil.str( AV78FlagBros, 1, 0));
      GXv_int6[0] = AV60Copias ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "100003", GXv_int6) ;
      trec1_impl.this.AV60Copias = (byte)((byte)(GXv_int6[0])) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Copias), 2, 0));
      AV77flaghss = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77flaghss", GXutil.str( AV77flaghss, 1, 0));
      GXv_int5[0] = AV77flaghss ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS   ", ""), GXv_int5) ;
      trec1_impl.this.AV77flaghss = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77flaghss", GXutil.str( AV77flaghss, 1, 0));
      AV80Flag3d9 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Flag3d9", GXutil.str( AV80Flag3d9, 1, 0));
      GXv_int5[0] = AV80Flag3d9 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECCDB", ""), GXv_int5) ;
      trec1_impl.this.AV80Flag3d9 = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Flag3d9", GXutil.str( AV80Flag3d9, 1, 0));
      AV81FlagSalt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81FlagSalt", GXutil.str( AV81FlagSalt, 1, 0));
      GXv_int5[0] = AV81FlagSalt ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALTIN", ""), GXv_int5) ;
      trec1_impl.this.AV81FlagSalt = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81FlagSalt", GXutil.str( AV81FlagSalt, 1, 0));
      AV82FlagMab = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82FlagMab", GXutil.str( AV82FlagMab, 1, 0));
      GXv_int5[0] = AV82FlagMab ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int5) ;
      trec1_impl.this.AV82FlagMab = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82FlagMab", GXutil.str( AV82FlagMab, 1, 0));
      AV83FlagFil = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83FlagFil", GXutil.str( AV83FlagFil, 1, 0));
      GXv_int5[0] = AV83FlagFil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECFIL", ""), GXv_int5) ;
      trec1_impl.this.AV83FlagFil = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83FlagFil", GXutil.str( AV83FlagFil, 1, 0));
      AV86FlagTtx = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86FlagTtx", GXutil.str( AV86FlagTtx, 1, 0));
      GXv_int5[0] = AV86FlagTtx ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int5) ;
      trec1_impl.this.AV86FlagTtx = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86FlagTtx", GXutil.str( AV86FlagTtx, 1, 0));
      AV87FlagRib = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87FlagRib", GXutil.str( AV87FlagRib, 1, 0));
      GXv_int5[0] = AV87FlagRib ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RIBES", ""), GXv_int5) ;
      trec1_impl.this.AV87FlagRib = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87FlagRib", GXutil.str( AV87FlagRib, 1, 0));
      AV88FlagBar = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88FlagBar", GXutil.str( AV88FlagBar, 1, 0));
      GXv_int5[0] = AV88FlagBar ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECBAR", ""), GXv_int5) ;
      trec1_impl.this.AV88FlagBar = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88FlagBar", GXutil.str( AV88FlagBar, 1, 0));
      AV89Centra = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Centra", GXutil.str( AV89Centra, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENTRA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89Centra), "9")));
      GXv_int5[0] = AV89Centra ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CENTRA", ""), GXv_int5) ;
      trec1_impl.this.AV89Centra = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Centra", GXutil.str( AV89Centra, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENTRA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89Centra), "9")));
      AV93Aeuropeos = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Aeuropeos", GXutil.str( AV93Aeuropeos, 1, 0));
      GXv_int5[0] = AV93Aeuropeos ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AEUROP", ""), GXv_int5) ;
      trec1_impl.this.AV93Aeuropeos = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Aeuropeos", GXutil.str( AV93Aeuropeos, 1, 0));
      AV94RecHMat = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94RecHMat", GXutil.str( AV94RecHMat, 1, 0));
      GXv_int5[0] = AV94RecHMat ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECHMA", ""), GXv_int5) ;
      trec1_impl.this.AV94RecHMat = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94RecHMat", GXutil.str( AV94RecHMat, 1, 0));
      AV95JBP = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95JBP", GXutil.str( AV95JBP, 1, 0));
      GXv_int5[0] = AV95JBP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBURGO", ""), GXv_int5) ;
      trec1_impl.this.AV95JBP = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95JBP", GXutil.str( AV95JBP, 1, 0));
      AV96Pervaf = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Pervaf", GXutil.str( AV96Pervaf, 1, 0));
      GXv_int5[0] = AV96Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int5) ;
      trec1_impl.this.AV96Pervaf = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Pervaf", GXutil.str( AV96Pervaf, 1, 0));
      if ( AV60Copias == 0 )
      {
         AV60Copias = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Copias), 2, 0));
      }
      AV97ObsPrf = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97ObsPrf", GXutil.str( AV97ObsPrf, 1, 0));
      GXv_int5[0] = AV97ObsPrf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "OBSPRF", ""), GXv_int5) ;
      trec1_impl.this.AV97ObsPrf = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97ObsPrf", GXutil.str( AV97ObsPrf, 1, 0));
      AV98Marpei = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98Marpei", GXutil.str( AV98Marpei, 1, 0));
      GXv_int5[0] = AV98Marpei ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARPEI", ""), GXv_int5) ;
      trec1_impl.this.AV98Marpei = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98Marpei", GXutil.str( AV98Marpei, 1, 0));
      AV104ActDos = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104ActDos", GXutil.str( AV104ActDos, 1, 0));
      GXv_int5[0] = AV104ActDos ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ACTDOS", ""), GXv_int5) ;
      trec1_impl.this.AV104ActDos = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104ActDos", GXutil.str( AV104ActDos, 1, 0));
      GXt_char1 = AV99Lit30 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN043", ""), (byte)(99), GXv_char4) ;
      trec1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV99Lit30 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Lit30", AV99Lit30);
      AV53Lit20 = GXutil.trim( AV53Lit20) + httpContext.getMessage( " (F2)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Lit20", AV53Lit20);
      AV54Lit21 = GXutil.trim( AV54Lit21) + httpContext.getMessage( " (F3)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Lit21", AV54Lit21);
      AV55Lit22 = GXutil.trim( AV55Lit22) + httpContext.getMessage( " (F6)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Lit22", AV55Lit22);
      AV67Lit23 = GXutil.trim( AV67Lit23) + httpContext.getMessage( " (F7)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Lit23", AV67Lit23);
      AV68Lit24 = GXutil.trim( AV68Lit24) + httpContext.getMessage( " (F8)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Lit24", AV68Lit24);
      AV69Lit25 = GXutil.trim( AV69Lit25) + httpContext.getMessage( " (F10)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Lit25", AV69Lit25);
      GXv_int5[0] = AV100FlagStdp ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECSTD", ""), GXv_int5) ;
      trec1_impl.this.AV100FlagStdp = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100FlagStdp", GXutil.str( AV100FlagStdp, 1, 0));
      GXv_int5[0] = AV101F_obsrec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "OBSREC", ""), GXv_int5) ;
      trec1_impl.this.AV101F_obsrec = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101F_obsrec", GXutil.str( AV101F_obsrec, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vF_OBSREC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101F_obsrec), "9")));
      GXt_char1 = AV102Lit31 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT25_", ""), (byte)(99), GXv_char4) ;
      trec1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV102Lit31 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102Lit31", AV102Lit31);
      GXt_char1 = AV103Lit32 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT108_", ""), (byte)(99), GXv_char4) ;
      trec1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV103Lit32 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103Lit32", AV103Lit32);
      GXt_int7 = AV105Planing ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLANNC", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV105Planing = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105Planing", GXutil.str( AV105Planing, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105Planing), "9")));
      GXt_char1 = AV107Lit49 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN095", ""), (byte)(99), GXv_char4) ;
      trec1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV107Lit49 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107Lit49", AV107Lit49);
      GXt_int7 = AV108Kohler ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV108Kohler = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108Kohler", GXutil.str( AV108Kohler, 1, 0));
      GXt_int7 = AV119Staack ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STAACK", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV119Staack = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119Staack", GXutil.str( AV119Staack, 1, 0));
      GXt_int7 = AV110KohlerA ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KOHAUT", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV110KohlerA = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110KohlerA", GXutil.str( AV110KohlerA, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKOHLERA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110KohlerA), "9")));
      GXt_int7 = AV112Ricoltex ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RICOLT", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV112Ricoltex = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112Ricoltex", GXutil.str( AV112Ricoltex, 1, 0));
      GXt_int7 = AV116Jpf ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV116Jpf = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116Jpf", GXutil.str( AV116Jpf, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vJPF", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV116Jpf), "9")));
      AV62Modif = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Modif", AV62Modif);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODIF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Modif, ""))));
      GXt_char1 = AV113Msg4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN052", ""), (byte)(99), GXv_char4) ;
      trec1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV113Msg4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113Msg4", AV113Msg4);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV113Msg4, ""))));
      GXt_char1 = AV114Msg5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN316", ""), (byte)(99), GXv_char4) ;
      trec1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV114Msg5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114Msg5", AV114Msg5);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV114Msg5, ""))));
      GXt_char1 = AV115Msg6 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN317", ""), (byte)(99), GXv_char4) ;
      trec1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV115Msg6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Msg6", AV115Msg6);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Msg6, ""))));
      GXt_int7 = AV117carvema ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV117carvema = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117carvema", GXutil.str( AV117carvema, 1, 0));
      AV120Lit90 = httpContext.getMessage( "Programa", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120Lit90", AV120Lit90);
      GXt_int7 = AV122Eliot ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV122Eliot = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122Eliot", GXutil.str( AV122Eliot, 1, 0));
      GXt_int7 = AV123VolPProc ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VOLPPR", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV123VolPProc = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123VolPProc", GXutil.str( AV123VolPProc, 1, 0));
      AV125Msg_v = httpContext.getMessage( "Atencion, ha cambiado la Maquina. El sistema debe de Re-calcular Receta.", "") + GXutil.newLine( ) + httpContext.getMessage( "Ejecutara el boton F10 de forma automatica.Revise los volumenes de los Procesos Quimicos", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125Msg_v", AV125Msg_v);
      GXt_int7 = AV129FlagRenNro ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RENNRO", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV129FlagRenNro = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129FlagRenNro", GXutil.str( AV129FlagRenNro, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGRENNRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV129FlagRenNro), "9")));
      GXt_int8 = AV133pass000 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PWD600", "") ;
      GXv_int6[0] = GXt_int8 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      trec1_impl.this.A396EmprCod = GXv_char4[0] ;
      trec1_impl.this.GXt_int8 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV133pass000 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV133pass000", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV133pass000), 8, 0));
      GXt_int7 = AV135Exipass000 ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PWD600", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV135Exipass000 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV135Exipass000", GXutil.str( AV135Exipass000, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXIPASS000", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV135Exipass000), "9")));
      GXt_int7 = AV136sedoEdtx ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SEDOEX", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV136sedoEdtx = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV136sedoEdtx", GXutil.str( AV136sedoEdtx, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSEDOEDTX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV136sedoEdtx), "9")));
      GXt_int7 = AV137sedoB ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SEDOBR", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV137sedoB = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137sedoB", GXutil.str( AV137sedoB, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSEDOB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV137sedoB), "9")));
      GXt_int7 = AV138orgatex ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ORGATE", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV138orgatex = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138orgatex", GXutil.str( AV138orgatex, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vORGATEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV138orgatex), "9")));
      GXt_int7 = AV140Carvitin ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int5) ;
      trec1_impl.this.GXt_int7 = GXv_int5[0] ;
      AV140Carvitin = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140Carvitin", GXutil.str( AV140Carvitin, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV140Carvitin), "9")));
   }

   public void e1512A2( )
   {
      /* 'Seleccion Puerto' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void e1612A2( )
   {
      /* 'Ver' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A129BarCod ;
      GXv_int5[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A602MaqCod ;
      GXv_char9[0] = A214BarSua ;
      GXv_int10[0] = A2805RecVolPrd ;
      GXv_int11[0] = A2804RecLinMaq ;
      GXv_int12[0] = (byte)(1) ;
      GXv_char13[0] = httpContext.getMessage( "SCR", "") ;
      GXv_char14[0] = AV85Puerto ;
      GXv_char15[0] = AV18ImpCod ;
      GXv_int16[0] = (byte)(0) ;
      new app.pedirec(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_char3, GXv_char2, GXv_char9, GXv_int10, GXv_int11, GXv_int12, GXv_char13, GXv_char14, GXv_char15, GXv_int16) ;
      trec1_impl.this.A396EmprCod = GXv_char4[0] ;
      trec1_impl.this.A129BarCod = GXv_int6[0] ;
      trec1_impl.this.A132BarCodReo = GXv_int5[0] ;
      trec1_impl.this.A130BarCodPar = GXv_char3[0] ;
      trec1_impl.this.A602MaqCod = GXv_char2[0] ;
      trec1_impl.this.A214BarSua = GXv_char9[0] ;
      trec1_impl.this.A2805RecVolPrd = GXv_int10[0] ;
      trec1_impl.this.A2804RecLinMaq = GXv_int11[0] ;
      trec1_impl.this.AV85Puerto = GXv_char14[0] ;
      trec1_impl.this.AV18ImpCod = GXv_char15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      httpContext.ajax_rsp_assign_attri("", false, "A214BarSua", A214BarSua);
      httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV85Puerto", AV85Puerto);
      httpContext.ajax_rsp_assign_attri("", false, "AV18ImpCod", AV18ImpCod);
      /*  Sending Event outputs  */
   }

   public void e1712A2( )
   {
      /* 'Ver 2' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ptintrecipe", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(A2805RecVolPrd,5,0)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(AV18ImpCod)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Copias","Output"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void e1212A2( )
   {
      /* 'AGRUPADAS' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
      }
      /*  Sending Event outputs  */
   }

   public void e1312A2( )
   {
      /* 'ELIMINAR RECETA' Routine */
      returnInSub = false ;
      GXv_char15[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int16[0] = A132BarCodReo ;
      GXv_char14[0] = A130BarCodPar ;
      GXv_int11[0] = A2804RecLinMaq ;
      GXv_char13[0] = AV131Msg_peso ;
      GXv_int17[0] = AV132Nveces ;
      new app.pctrlusupeso(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int11, GXv_char13, GXv_int17) ;
      trec1_impl.this.A396EmprCod = GXv_char15[0] ;
      trec1_impl.this.A129BarCod = GXv_int10[0] ;
      trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
      trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
      trec1_impl.this.A2804RecLinMaq = GXv_int11[0] ;
      trec1_impl.this.AV131Msg_peso = GXv_char13[0] ;
      trec1_impl.this.AV132Nveces = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV131Msg_peso", AV131Msg_peso);
      httpContext.ajax_rsp_assign_attri("", false, "AV132Nveces", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132Nveces), 4, 0));
      AV134OK = httpContext.getMessage( "S", "") ;
      if ( ( AV135Exipass000 == 1 ) && ( AV132Nveces > 0 ) )
      {
         httpContext.GX_msglist.addItem(AV131Msg_peso);
      }
      if ( GXutil.strcmp(AV134OK, httpContext.getMessage( "S", "")) == 0 )
      {
         if ( AV132Nveces > 0 )
         {
            Gx_msg = AV131Msg_peso + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Confirma su ELIMINACION?", "") ;
         }
         else
         {
            Gx_msg = httpContext.getMessage( "Confirma su ELIMINACION?", "") ;
         }
         GXutil.Confirmed = true;
         if ( GXutil.Confirmed )
         {
            System.out.println( AV58msg2 );
            if ( ! (0==AV61Dosif) )
            {
               GXv_char15[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int16[0] = A132BarCodReo ;
               GXv_char14[0] = A130BarCodPar ;
               GXv_char13[0] = httpContext.getMessage( "Y", "") ;
               new app.pdosifi(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_char13) ;
               trec1_impl.this.A396EmprCod = GXv_char15[0] ;
               trec1_impl.this.A129BarCod = GXv_int10[0] ;
               trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
               trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            }
            GXv_char15[0] = A396EmprCod ;
            GXv_int10[0] = A129BarCod ;
            GXv_int16[0] = A132BarCodReo ;
            GXv_char14[0] = A130BarCodPar ;
            GXv_int17[0] = A2804RecLinMaq ;
            new app.pbajrec(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int17) ;
            trec1_impl.this.A396EmprCod = GXv_char15[0] ;
            trec1_impl.this.A129BarCod = GXv_int10[0] ;
            trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
            trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
            trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            GXv_char15[0] = A396EmprCod ;
            GXv_int10[0] = A129BarCod ;
            GXv_int16[0] = A132BarCodReo ;
            GXv_char14[0] = A130BarCodPar ;
            GXv_int17[0] = A2804RecLinMaq ;
            new app.pdelrec3(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int17) ;
            trec1_impl.this.A396EmprCod = GXv_char15[0] ;
            trec1_impl.this.A129BarCod = GXv_int10[0] ;
            trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
            trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
            trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            httpContext.GX_msglist.addItem(AV59msg3);
            AV111Texto_i = httpContext.getMessage( "Eliminacion RECETA QUIMICA", "") + GXutil.newLine( ) ;
            if ( AV132Nveces > 0 )
            {
               AV111Texto_i += AV131Msg_peso ;
            }
            if ( AV138orgatex == 1 )
            {
               GXv_char15[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int16[0] = A132BarCodReo ;
               GXv_char14[0] = A130BarCodPar ;
               GXv_int17[0] = A2804RecLinMaq ;
               new app.pdye003(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int17) ;
               trec1_impl.this.A396EmprCod = GXv_char15[0] ;
               trec1_impl.this.A129BarCod = GXv_int10[0] ;
               trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
               trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
               trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            }
            if ( ( AV136sedoEdtx == 1 ) || ( AV137sedoB == 1 ) || ( AV140Carvitin == 1 ) )
            {
               GXv_char15[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int16[0] = A132BarCodReo ;
               GXv_char14[0] = A130BarCodPar ;
               GXv_int17[0] = A2804RecLinMaq ;
               GXv_int12[0] = (byte)(3) ;
               GXv_char13[0] = AV130flagope ;
               new app.planrec3(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int17, GXv_int12, GXv_char13) ;
               trec1_impl.this.A396EmprCod = GXv_char15[0] ;
               trec1_impl.this.A129BarCod = GXv_int10[0] ;
               trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
               trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
               trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
               trec1_impl.this.AV130flagope = GXv_char13[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV130flagope", AV130flagope);
            }
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV142Pgmname, AV16UsurCod, AV37Station, AV111Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,AV16UsurCod,Short.valueOf(A2804RecLinMaq),AV126rectotkgm,AV127rectotmtr,Integer.valueOf(AV128rectotpie),AV139Modo});
            httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","AV16UsurCod","A2804RecLinMaq","AV126rectotkgm","AV127rectotmtr","AV128rectotpie","AV139Modo"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            pr_default.close(7);
            pr_default.close(6);
            pr_default.close(5);
            pr_default.close(4);
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Abortado", ""));
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1412A2( )
   {
      /* 'IMPRIMIR RECETA' Routine */
      returnInSub = false ;
      System.out.println( httpContext.getMessage( "Impresion.....", "") );
      GXv_char15[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int16[0] = A132BarCodReo ;
      GXv_char14[0] = A130BarCodPar ;
      GXv_char13[0] = A602MaqCod ;
      GXv_char9[0] = "" ;
      GXv_int6[0] = A2805RecVolPrd ;
      GXv_int17[0] = A2804RecLinMaq ;
      GXv_int12[0] = AV60Copias ;
      GXv_char4[0] = httpContext.getMessage( "PRN", "") ;
      GXv_char3[0] = AV85Puerto ;
      GXv_char2[0] = AV18ImpCod ;
      GXv_int5[0] = (byte)(0) ;
      new app.pedirec(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_char13, GXv_char9, GXv_int6, GXv_int17, GXv_int12, GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
      trec1_impl.this.A396EmprCod = GXv_char15[0] ;
      trec1_impl.this.A129BarCod = GXv_int10[0] ;
      trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
      trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
      trec1_impl.this.A602MaqCod = GXv_char13[0] ;
      trec1_impl.this.A2805RecVolPrd = GXv_int6[0] ;
      trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
      trec1_impl.this.AV60Copias = GXv_int12[0] ;
      trec1_impl.this.AV85Puerto = GXv_char3[0] ;
      trec1_impl.this.AV18ImpCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV60Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Copias), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV85Puerto", AV85Puerto);
      httpContext.ajax_rsp_assign_attri("", false, "AV18ImpCod", AV18ImpCod);
      System.out.println( httpContext.getMessage( "Imprimido.....", "") );
      /*  Sending Event outputs  */
   }

   public void e1812A2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( AV105Planing == 1 )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char14[0] = A130BarCodPar ;
         new app.ppla005(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14) ;
         trec1_impl.this.A396EmprCod = GXv_char15[0] ;
         trec1_impl.this.A129BarCod = GXv_int10[0] ;
         trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
         trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (0==AV89Centra) && ( AV110KohlerA == 0 ) && ( GXutil.strcmp(AV62Modif, httpContext.getMessage( "Y", "")) == 0 ) )
      {
         if ( AV116Jpf == 1 )
         {
            Gx_msg = httpContext.getMessage( "O sistema detectou que teve modificações", "") + GXutil.newLine( ) + httpContext.getMessage( "Deseja mudar o numero que deve ser enviado a Setex?", "") + GXutil.newLine( ) + httpContext.getMessage( "Confirma Cambio?", "") + GXutil.newLine( ) ;
            GXutil.Confirmed = true;
            if ( GXutil.Confirmed )
            {
               GXv_char15[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int16[0] = A132BarCodReo ;
               GXv_char14[0] = A130BarCodPar ;
               GXv_int17[0] = A2804RecLinMaq ;
               new app.pnumintr(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int17) ;
               trec1_impl.this.A396EmprCod = GXv_char15[0] ;
               trec1_impl.this.A129BarCod = GXv_int10[0] ;
               trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
               trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
               trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            }
         }
         Gx_msg = AV114Msg5 + GXutil.newLine( ) + AV115Msg6 + GXutil.newLine( ) ;
         GXutil.Confirmed = true;
         if ( GXutil.Confirmed )
         {
            if ( AV129FlagRenNro == 1 )
            {
               GXv_char15[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int16[0] = A132BarCodReo ;
               GXv_char14[0] = A130BarCodPar ;
               GXv_int17[0] = A2804RecLinMaq ;
               new app.pfo0005(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int17) ;
               trec1_impl.this.A396EmprCod = GXv_char15[0] ;
               trec1_impl.this.A129BarCod = GXv_int10[0] ;
               trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
               trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
               trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            }
            GXv_char15[0] = A396EmprCod ;
            GXv_int10[0] = A129BarCod ;
            GXv_int16[0] = A132BarCodReo ;
            GXv_char14[0] = A130BarCodPar ;
            GXv_int17[0] = A2804RecLinMaq ;
            GXv_int12[0] = (byte)(2) ;
            GXv_char13[0] = AV130flagope ;
            new app.planrec3(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int17, GXv_int12, GXv_char13) ;
            trec1_impl.this.A396EmprCod = GXv_char15[0] ;
            trec1_impl.this.A129BarCod = GXv_int10[0] ;
            trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
            trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
            trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
            trec1_impl.this.AV130flagope = GXv_char13[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV130flagope", AV130flagope);
            Gx_msg = AV113Msg4 ;
            GXutil.Confirmed = true;
            if ( GXutil.Confirmed )
            {
               GXv_char15[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int16[0] = A132BarCodReo ;
               GXv_char14[0] = A130BarCodPar ;
               GXv_char13[0] = A602MaqCod ;
               GXv_char9[0] = A214BarSua ;
               GXv_int6[0] = A2805RecVolPrd ;
               GXv_int17[0] = A2804RecLinMaq ;
               GXv_int12[0] = AV60Copias ;
               GXv_char4[0] = httpContext.getMessage( "PRN", "") ;
               GXv_char3[0] = AV85Puerto ;
               GXv_char2[0] = AV18ImpCod ;
               GXv_int5[0] = (byte)(0) ;
               new app.pedirec(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_char13, GXv_char9, GXv_int6, GXv_int17, GXv_int12, GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
               trec1_impl.this.A396EmprCod = GXv_char15[0] ;
               trec1_impl.this.A129BarCod = GXv_int10[0] ;
               trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
               trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
               trec1_impl.this.A602MaqCod = GXv_char13[0] ;
               trec1_impl.this.A214BarSua = GXv_char9[0] ;
               trec1_impl.this.A2805RecVolPrd = GXv_int6[0] ;
               trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
               trec1_impl.this.AV60Copias = GXv_int12[0] ;
               trec1_impl.this.AV85Puerto = GXv_char3[0] ;
               trec1_impl.this.AV18ImpCod = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               httpContext.ajax_rsp_assign_attri("", false, "A214BarSua", A214BarSua);
               httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV60Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Copias), 2, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV85Puerto", AV85Puerto);
               httpContext.ajax_rsp_assign_attri("", false, "AV18ImpCod", AV18ImpCod);
            }
         }
      }
      System.out.println( httpContext.getMessage( "Cambio Maquina en Barcad....", "") );
      GXv_char15[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int16[0] = A132BarCodReo ;
      GXv_char14[0] = A130BarCodPar ;
      GXv_int17[0] = A2804RecLinMaq ;
      new app.pcammaqb(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int17) ;
      trec1_impl.this.A396EmprCod = GXv_char15[0] ;
      trec1_impl.this.A129BarCod = GXv_int10[0] ;
      trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
      trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
      trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      /*  Sending Event outputs  */
   }

   public void e1912A2( )
   {
      /* ' Observaciones Receta' Routine */
      returnInSub = false ;
      if ( AV101F_obsrec == 1 )
      {
         callWebObject(formatLink("app.tobsrec", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0))}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void zm12A408( int GX_JID )
   {
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2805RecVolPrd = T012A3_A2805RecVolPrd[0] ;
            Z2806RecFA = T012A3_A2806RecFA[0] ;
            Z1272UltLinPro = T012A3_A1272UltLinPro[0] ;
            Z4402RecUsrCod = T012A3_A4402RecUsrCod[0] ;
            Z4574RecFecPes = T012A3_A4574RecFecPes[0] ;
            Z4575RecMaqPes = T012A3_A4575RecMaqPes[0] ;
            Z5109RecNumInt = T012A3_A5109RecNumInt[0] ;
            Z5110RecNumPrg = T012A3_A5110RecNumPrg[0] ;
            Z5111RecBp12 = T012A3_A5111RecBp12[0] ;
            Z5112RecBp13 = T012A3_A5112RecBp13[0] ;
            Z5113RecBp14 = T012A3_A5113RecBp14[0] ;
            Z5114RecBp15 = T012A3_A5114RecBp15[0] ;
            Z5115RecAbsFac = T012A3_A5115RecAbsFac[0] ;
            Z4701RecRecep = T012A3_A4701RecRecep[0] ;
            Z4700RecEnvio = T012A3_A4700RecEnvio[0] ;
            Z6269RecPrg2 = T012A3_A6269RecPrg2[0] ;
            Z6270RecPrg3 = T012A3_A6270RecPrg3[0] ;
            Z7764RecMaqNh = T012A3_A7764RecMaqNh[0] ;
            Z7765RecMaqVX = T012A3_A7765RecMaqVX[0] ;
            Z7766RecMaqBL = T012A3_A7766RecMaqBL[0] ;
            Z7767RecMaqFlow = T012A3_A7767RecMaqFlow[0] ;
            Z7768RecMaqRPM = T012A3_A7768RecMaqRPM[0] ;
            Z7769RecMaqMol = T012A3_A7769RecMaqMol[0] ;
            Z7770RecMaqTor = T012A3_A7770RecMaqTor[0] ;
            Z7771RecMaqCla = T012A3_A7771RecMaqCla[0] ;
            Z7772RecMaqTej = T012A3_A7772RecMaqTej[0] ;
            Z7773RecMaqDel = T012A3_A7773RecMaqDel[0] ;
            Z7774RecMaqPML = T012A3_A7774RecMaqPML[0] ;
            Z4259RecTotKgs = T012A3_A4259RecTotKgs[0] ;
            Z602MaqCod = T012A3_A602MaqCod[0] ;
         }
         else
         {
            Z2805RecVolPrd = A2805RecVolPrd ;
            Z2806RecFA = A2806RecFA ;
            Z1272UltLinPro = A1272UltLinPro ;
            Z4402RecUsrCod = A4402RecUsrCod ;
            Z4574RecFecPes = A4574RecFecPes ;
            Z4575RecMaqPes = A4575RecMaqPes ;
            Z5109RecNumInt = A5109RecNumInt ;
            Z5110RecNumPrg = A5110RecNumPrg ;
            Z5111RecBp12 = A5111RecBp12 ;
            Z5112RecBp13 = A5112RecBp13 ;
            Z5113RecBp14 = A5113RecBp14 ;
            Z5114RecBp15 = A5114RecBp15 ;
            Z5115RecAbsFac = A5115RecAbsFac ;
            Z4701RecRecep = A4701RecRecep ;
            Z4700RecEnvio = A4700RecEnvio ;
            Z6269RecPrg2 = A6269RecPrg2 ;
            Z6270RecPrg3 = A6270RecPrg3 ;
            Z7764RecMaqNh = A7764RecMaqNh ;
            Z7765RecMaqVX = A7765RecMaqVX ;
            Z7766RecMaqBL = A7766RecMaqBL ;
            Z7767RecMaqFlow = A7767RecMaqFlow ;
            Z7768RecMaqRPM = A7768RecMaqRPM ;
            Z7769RecMaqMol = A7769RecMaqMol ;
            Z7770RecMaqTor = A7770RecMaqTor ;
            Z7771RecMaqCla = A7771RecMaqCla ;
            Z7772RecMaqTej = A7772RecMaqTej ;
            Z7773RecMaqDel = A7773RecMaqDel ;
            Z7774RecMaqPML = A7774RecMaqPML ;
            Z4259RecTotKgs = A4259RecTotKgs ;
            Z602MaqCod = A602MaqCod ;
         }
      }
      if ( GX_JID == -30 )
      {
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z2805RecVolPrd = A2805RecVolPrd ;
         Z2806RecFA = A2806RecFA ;
         Z1272UltLinPro = A1272UltLinPro ;
         Z4402RecUsrCod = A4402RecUsrCod ;
         Z4574RecFecPes = A4574RecFecPes ;
         Z4575RecMaqPes = A4575RecMaqPes ;
         Z5109RecNumInt = A5109RecNumInt ;
         Z5110RecNumPrg = A5110RecNumPrg ;
         Z5111RecBp12 = A5111RecBp12 ;
         Z5112RecBp13 = A5112RecBp13 ;
         Z5113RecBp14 = A5113RecBp14 ;
         Z5114RecBp15 = A5114RecBp15 ;
         Z5115RecAbsFac = A5115RecAbsFac ;
         Z4701RecRecep = A4701RecRecep ;
         Z4700RecEnvio = A4700RecEnvio ;
         Z6269RecPrg2 = A6269RecPrg2 ;
         Z6270RecPrg3 = A6270RecPrg3 ;
         Z7764RecMaqNh = A7764RecMaqNh ;
         Z7765RecMaqVX = A7765RecMaqVX ;
         Z7766RecMaqBL = A7766RecMaqBL ;
         Z7767RecMaqFlow = A7767RecMaqFlow ;
         Z7768RecMaqRPM = A7768RecMaqRPM ;
         Z7769RecMaqMol = A7769RecMaqMol ;
         Z7770RecMaqTor = A7770RecMaqTor ;
         Z7771RecMaqCla = A7771RecMaqCla ;
         Z7772RecMaqTej = A7772RecMaqTej ;
         Z7773RecMaqDel = A7773RecMaqDel ;
         Z7774RecMaqPML = A7774RecMaqPML ;
         Z8353RecMaqObs = A8353RecMaqObs ;
         Z4259RecTotKgs = A4259RecTotKgs ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z212BarSer = A212BarSer ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z182BarMat = A182BarMat ;
         Z214BarSua = A214BarSua ;
         Z236BarVolMaq = A236BarVolMaq ;
         Z189BarNumAny = A189BarNumAny ;
         Z213BarSit = A213BarSit ;
         Z2803UltLinMaq = A2803UltLinMaq ;
         Z148BarEstReo = A148BarEstReo ;
         Z252CliCod = A252CliCod ;
         Z918FindTmx = A918FindTmx ;
         Z279CliNom = A279CliNom ;
         Z623MaqVolMax = A623MaqVolMax ;
         Z625MaqVolMin = A625MaqVolMin ;
         Z624MaqVolMed = A624MaqVolMed ;
         Z618MaqTemMax = A618MaqTemMax ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      AV142Pgmname = "TREC1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      /* Using cursor T012A4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T012A4_A407EmprNom[0] ;
      n407EmprNom = T012A4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T012A6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A2759BarMaqGru = T012A6_A2759BarMaqGru[0] ;
      A212BarSer = T012A6_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T012A6_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T012A6_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T012A6_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A180BarMaqCod = T012A6_A180BarMaqCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A182BarMat = T012A6_A182BarMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
      A214BarSua = T012A6_A214BarSua[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A214BarSua", A214BarSua);
      A236BarVolMaq = T012A6_A236BarVolMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      A189BarNumAny = T012A6_A189BarNumAny[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A189BarNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A189BarNumAny), 3, 0));
      A213BarSit = T012A6_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A2803UltLinMaq = T012A6_A2803UltLinMaq[0] ;
      n2803UltLinMaq = T012A6_n2803UltLinMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2803UltLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2803UltLinMaq), 4, 0));
      A148BarEstReo = T012A6_A148BarEstReo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      A252CliCod = T012A6_A252CliCod[0] ;
      n252CliCod = T012A6_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(4);
      GXt_int8 = A8646RecVolMd ;
      GXv_char15[0] = A396EmprCod ;
      GXv_char14[0] = A180BarMaqCod ;
      GXv_int10[0] = GXt_int8 ;
      new app.ppvolmd(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int10) ;
      trec1_impl.this.A396EmprCod = GXv_char15[0] ;
      trec1_impl.this.A180BarMaqCod = GXv_char14[0] ;
      trec1_impl.this.GXt_int8 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A8646RecVolMd = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8646RecVolMd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8646RecVolMd), 5, 0));
      GXt_int8 = A8645RecVolMn ;
      GXv_char15[0] = A396EmprCod ;
      GXv_char14[0] = A180BarMaqCod ;
      GXv_int10[0] = GXt_int8 ;
      new app.ppvolmn(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int10) ;
      trec1_impl.this.A396EmprCod = GXv_char15[0] ;
      trec1_impl.this.A180BarMaqCod = GXv_char14[0] ;
      trec1_impl.this.GXt_int8 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A8645RecVolMn = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8645RecVolMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8645RecVolMn), 5, 0));
      GXt_int8 = A8644RecVolMx ;
      GXv_char15[0] = A396EmprCod ;
      GXv_char14[0] = A180BarMaqCod ;
      GXv_int10[0] = GXt_int8 ;
      new app.ppvolmx(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int10) ;
      trec1_impl.this.A396EmprCod = GXv_char15[0] ;
      trec1_impl.this.A180BarMaqCod = GXv_char14[0] ;
      trec1_impl.this.GXt_int8 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A8644RecVolMx = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8644RecVolMx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8644RecVolMx), 5, 0));
      /* Using cursor T012A8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A214BarSua});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A918FindTmx = T012A8_A918FindTmx[0] ;
         n918FindTmx = T012A8_n918FindTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A918FindTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A918FindTmx), 4, 0));
      }
      else
      {
         A918FindTmx = (short)(0) ;
         n918FindTmx = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A918FindTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A918FindTmx), 4, 0));
      }
      pr_default.close(6);
      /* Using cursor T012A7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T012A7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizar función F6 para eliminar receta", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
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
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_check_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_check_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( 1 < 0 )
         {
            AV16UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
         }
      }
   }

   public void load12A408( )
   {
      /* Using cursor T012A10 */
      pr_default.execute(8, new Object[] {Short.valueOf(A2804RecLinMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound408 = (short)(1) ;
         A8353RecMaqObs = T012A10_A8353RecMaqObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
         A2759BarMaqGru = T012A10_A2759BarMaqGru[0] ;
         A2805RecVolPrd = T012A10_A2805RecVolPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         A407EmprNom = T012A10_A407EmprNom[0] ;
         n407EmprNom = T012A10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T012A10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A212BarSer = T012A10_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T012A10_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T012A10_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T012A10_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A180BarMaqCod = T012A10_A180BarMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A182BarMat = T012A10_A182BarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
         A214BarSua = T012A10_A214BarSua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A214BarSua", A214BarSua);
         A236BarVolMaq = T012A10_A236BarVolMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A189BarNumAny = T012A10_A189BarNumAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189BarNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A189BarNumAny), 3, 0));
         A213BarSit = T012A10_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A2803UltLinMaq = T012A10_A2803UltLinMaq[0] ;
         n2803UltLinMaq = T012A10_n2803UltLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2803UltLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2803UltLinMaq), 4, 0));
         A148BarEstReo = T012A10_A148BarEstReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
         A2806RecFA = T012A10_A2806RecFA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
         A1272UltLinPro = T012A10_A1272UltLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
         A623MaqVolMax = T012A10_A623MaqVolMax[0] ;
         n623MaqVolMax = T012A10_n623MaqVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
         A625MaqVolMin = T012A10_A625MaqVolMin[0] ;
         n625MaqVolMin = T012A10_n625MaqVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
         A624MaqVolMed = T012A10_A624MaqVolMed[0] ;
         n624MaqVolMed = T012A10_n624MaqVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
         A618MaqTemMax = T012A10_A618MaqTemMax[0] ;
         n618MaqTemMax = T012A10_n618MaqTemMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
         A4402RecUsrCod = T012A10_A4402RecUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", A4402RecUsrCod);
         A4574RecFecPes = T012A10_A4574RecFecPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4575RecMaqPes = T012A10_A4575RecMaqPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
         A5109RecNumInt = T012A10_A5109RecNumInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
         A5110RecNumPrg = T012A10_A5110RecNumPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
         A5111RecBp12 = T012A10_A5111RecBp12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
         A5112RecBp13 = T012A10_A5112RecBp13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
         A5113RecBp14 = T012A10_A5113RecBp14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
         A5114RecBp15 = T012A10_A5114RecBp15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
         A5115RecAbsFac = T012A10_A5115RecAbsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
         A4701RecRecep = T012A10_A4701RecRecep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
         A4700RecEnvio = T012A10_A4700RecEnvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
         A6269RecPrg2 = T012A10_A6269RecPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", A6269RecPrg2);
         A6270RecPrg3 = T012A10_A6270RecPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", A6270RecPrg3);
         A7764RecMaqNh = T012A10_A7764RecMaqNh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
         A7765RecMaqVX = T012A10_A7765RecMaqVX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
         A7766RecMaqBL = T012A10_A7766RecMaqBL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
         A7767RecMaqFlow = T012A10_A7767RecMaqFlow[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
         A7768RecMaqRPM = T012A10_A7768RecMaqRPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
         A7769RecMaqMol = T012A10_A7769RecMaqMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
         A7770RecMaqTor = T012A10_A7770RecMaqTor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
         A7771RecMaqCla = T012A10_A7771RecMaqCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", A7771RecMaqCla);
         A7772RecMaqTej = T012A10_A7772RecMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
         A7773RecMaqDel = T012A10_A7773RecMaqDel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
         A7774RecMaqPML = T012A10_A7774RecMaqPML[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
         A4259RecTotKgs = T012A10_A4259RecTotKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
         A602MaqCod = T012A10_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A252CliCod = T012A10_A252CliCod[0] ;
         n252CliCod = T012A10_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A918FindTmx = T012A10_A918FindTmx[0] ;
         n918FindTmx = T012A10_n918FindTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A918FindTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A918FindTmx), 4, 0));
         zm12A408( -30) ;
      }
      pr_default.close(8);
      onLoadActions12A408( ) ;
   }

   public void onLoadActions12A408( )
   {
      if ( 1 < 0 )
      {
         AV16UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      }
      if ( ( AV104ActDos == 1 ) && ( ( A4701RecRecep == 1 ) || ( A4700RecEnvio == 2 ) ) )
      {
         edtMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         edtMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A602MaqCod, O602MaqCod) != 0 ) && ( ( AV108Kohler == 0 ) || ( AV119Staack == 0 ) ) && ( A624MaqVolMed > 0 ) )
      {
         A2805RecVolPrd = A624MaqVolMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
      }
      AV109MaqCodi = A602MaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109MaqCodi", AV109MaqCodi);
      AV118MaqCodold = O602MaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", AV118MaqCodold);
      AV31RelBany = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(A2805RecVolPrd).divide(AV126rectotkgm, 18, java.math.RoundingMode.DOWN), 0))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31RelBany", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31RelBany), 4, 0));
   }

   public void checkExtendedTable12A408( )
   {
      nIsDirty_408 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV16UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      }
      /* Using cursor T012A5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A623MaqVolMax = T012A5_A623MaqVolMax[0] ;
      n623MaqVolMax = T012A5_n623MaqVolMax[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
      A625MaqVolMin = T012A5_A625MaqVolMin[0] ;
      n625MaqVolMin = T012A5_n625MaqVolMin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
      A624MaqVolMed = T012A5_A624MaqVolMed[0] ;
      n624MaqVolMed = T012A5_n624MaqVolMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
      A618MaqTemMax = T012A5_A618MaqTemMax[0] ;
      n618MaqTemMax = T012A5_n618MaqTemMax[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
      pr_default.close(3);
      if ( ( AV104ActDos == 1 ) && ( ( A4701RecRecep == 1 ) || ( A4700RecEnvio == 2 ) ) )
      {
         edtMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         edtMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(A602MaqCod, O602MaqCod) != 0 ) && ( ( AV108Kohler == 0 ) || ( AV119Staack == 0 ) ) && ( A624MaqVolMed > 0 ) )
      {
         nIsDirty_408 = (short)(1) ;
         A2805RecVolPrd = A624MaqVolMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
      }
      AV109MaqCodi = A602MaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109MaqCodi", AV109MaqCodi);
      AV118MaqCodold = O602MaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", AV118MaqCodold);
      if ( ( ( A2805RecVolPrd < A625MaqVolMin ) || ( A2805RecVolPrd > A623MaqVolMax ) ) && ( ! (GXutil.strcmp("", A602MaqCod)==0) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Volumen fuera de rango", ""), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV104ActDos == 1 ) && ( A4701RecRecep == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Receta dosificada", ""), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV104ActDos == 1 ) && ( A4700RecEnvio == 2 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Receta enviada a Máquina", ""), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV31RelBany = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(A2805RecVolPrd).divide(AV126rectotkgm, 18, java.math.RoundingMode.DOWN), 0))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31RelBany", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31RelBany), 4, 0));
      if ( ! ( ( ( A4575RecMaqPes >= 0 ) && ( A4575RecMaqPes <= 2 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Linea Maquina Pesada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "RECMAQPES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecMaqPes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A5110RecNumPrg)==0) )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_char14[0] = A5110RecNumPrg ;
         GXv_int16[0] = AV121ExiMac ;
         new app.peximac(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int16) ;
         trec1_impl.this.A396EmprCod = GXv_char15[0] ;
         trec1_impl.this.A5110RecNumPrg = GXv_char14[0] ;
         trec1_impl.this.AV121ExiMac = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
         httpContext.ajax_rsp_assign_attri("", false, "AV121ExiMac", GXutil.str( AV121ExiMac, 1, 0));
      }
      if ( (0==AV121ExiMac) && true /* After */ && ! (GXutil.strcmp("", A5110RecNumPrg)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.No existe Nº Programa ¡¡¡", ""), 1, "RECNUMPRG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecNumPrg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors12A408( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_32( String A396EmprCod ,
                          String A602MaqCod )
   {
      /* Using cursor T012A11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A623MaqVolMax = T012A11_A623MaqVolMax[0] ;
      n623MaqVolMax = T012A11_n623MaqVolMax[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
      A625MaqVolMin = T012A11_A625MaqVolMin[0] ;
      n625MaqVolMin = T012A11_n625MaqVolMin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
      A624MaqVolMed = T012A11_A624MaqVolMed[0] ;
      n624MaqVolMed = T012A11_n624MaqVolMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
      A618MaqTemMax = T012A11_A618MaqTemMax[0] ;
      n618MaqTemMax = T012A11_n618MaqTemMax[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A618MaqTemMax, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey12A408( )
   {
      /* Using cursor T012A12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound408 = (short)(1) ;
      }
      else
      {
         RcdFound408 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T012A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(1) != 101) && ( T012A3_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T012A3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012A3_A129BarCod[0] == A129BarCod ) && ( T012A3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T012A3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm12A408( 30) ;
         RcdFound408 = (short)(1) ;
         A8353RecMaqObs = T012A3_A8353RecMaqObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
         A2805RecVolPrd = T012A3_A2805RecVolPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         A2806RecFA = T012A3_A2806RecFA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
         A1272UltLinPro = T012A3_A1272UltLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
         A4402RecUsrCod = T012A3_A4402RecUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", A4402RecUsrCod);
         A4574RecFecPes = T012A3_A4574RecFecPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4575RecMaqPes = T012A3_A4575RecMaqPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
         A5109RecNumInt = T012A3_A5109RecNumInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
         A5110RecNumPrg = T012A3_A5110RecNumPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
         A5111RecBp12 = T012A3_A5111RecBp12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
         A5112RecBp13 = T012A3_A5112RecBp13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
         A5113RecBp14 = T012A3_A5113RecBp14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
         A5114RecBp15 = T012A3_A5114RecBp15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
         A5115RecAbsFac = T012A3_A5115RecAbsFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
         A4701RecRecep = T012A3_A4701RecRecep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
         A4700RecEnvio = T012A3_A4700RecEnvio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
         A6269RecPrg2 = T012A3_A6269RecPrg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", A6269RecPrg2);
         A6270RecPrg3 = T012A3_A6270RecPrg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", A6270RecPrg3);
         A7764RecMaqNh = T012A3_A7764RecMaqNh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
         A7765RecMaqVX = T012A3_A7765RecMaqVX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
         A7766RecMaqBL = T012A3_A7766RecMaqBL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
         A7767RecMaqFlow = T012A3_A7767RecMaqFlow[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
         A7768RecMaqRPM = T012A3_A7768RecMaqRPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
         A7769RecMaqMol = T012A3_A7769RecMaqMol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
         A7770RecMaqTor = T012A3_A7770RecMaqTor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
         A7771RecMaqCla = T012A3_A7771RecMaqCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", A7771RecMaqCla);
         A7772RecMaqTej = T012A3_A7772RecMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
         A7773RecMaqDel = T012A3_A7773RecMaqDel[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
         A7774RecMaqPML = T012A3_A7774RecMaqPML[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
         A4259RecTotKgs = T012A3_A4259RecTotKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
         A602MaqCod = T012A3_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         O602MaqCod = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         O2805RecVolPrd = A2805RecVolPrd ;
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         sMode408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load12A408( ) ;
         if ( AnyError == 1 )
         {
            RcdFound408 = (short)(0) ;
            initializeNonKey12A408( ) ;
         }
         Gx_mode = sMode408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound408 = (short)(0) ;
         initializeNonKey12A408( ) ;
         sMode408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey12A408( ) ;
      if ( RcdFound408 == 0 )
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
      RcdFound408 = (short)(0) ;
      /* Using cursor T012A13 */
      pr_default.execute(11, new Object[] {Short.valueOf(A2804RecLinMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( T012A13_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T012A13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012A13_A129BarCod[0] == A129BarCod ) && ( T012A13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T012A13_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( T012A13_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T012A13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012A13_A129BarCod[0] == A129BarCod ) && ( T012A13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T012A13_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound408 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound408 = (short)(0) ;
      /* Using cursor T012A14 */
      pr_default.execute(12, new Object[] {Short.valueOf(A2804RecLinMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( T012A14_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T012A14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012A14_A129BarCod[0] == A129BarCod ) && ( T012A14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T012A14_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( T012A14_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T012A14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012A14_A129BarCod[0] == A129BarCod ) && ( T012A14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T012A14_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound408 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey12A408( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert12A408( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound408 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update12A408( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert12A408( ) ;
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
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert12A408( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqCod_Internalname ;
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

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey12A408( ) ;
      if ( RcdFound408 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trec1");
      GX_FocusControl = edtMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_12A0( ) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart12A408( ) ;
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12A408( ) ;
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
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
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
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
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
      scanStart12A408( ) ;
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound408 != 0 )
         {
            scanNext12A408( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12A408( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency12A408( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012A2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECMAQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z2805RecVolPrd != T012A2_A2805RecVolPrd[0] ) || ( DecimalUtil.compareTo(Z2806RecFA, T012A2_A2806RecFA[0]) != 0 ) || ( Z1272UltLinPro != T012A2_A1272UltLinPro[0] ) || ( GXutil.strcmp(Z4402RecUsrCod, T012A2_A4402RecUsrCod[0]) != 0 ) || !( GXutil.dateCompare(Z4574RecFecPes, T012A2_A4574RecFecPes[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4575RecMaqPes != T012A2_A4575RecMaqPes[0] ) || ( Z5109RecNumInt != T012A2_A5109RecNumInt[0] ) || ( GXutil.strcmp(Z5110RecNumPrg, T012A2_A5110RecNumPrg[0]) != 0 ) || ( Z5111RecBp12 != T012A2_A5111RecBp12[0] ) || ( Z5112RecBp13 != T012A2_A5112RecBp13[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5113RecBp14 != T012A2_A5113RecBp14[0] ) || ( Z5114RecBp15 != T012A2_A5114RecBp15[0] ) || ( DecimalUtil.compareTo(Z5115RecAbsFac, T012A2_A5115RecAbsFac[0]) != 0 ) || ( Z4701RecRecep != T012A2_A4701RecRecep[0] ) || ( Z4700RecEnvio != T012A2_A4700RecEnvio[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6269RecPrg2, T012A2_A6269RecPrg2[0]) != 0 ) || ( GXutil.strcmp(Z6270RecPrg3, T012A2_A6270RecPrg3[0]) != 0 ) || ( Z7764RecMaqNh != T012A2_A7764RecMaqNh[0] ) || ( Z7765RecMaqVX != T012A2_A7765RecMaqVX[0] ) || ( Z7766RecMaqBL != T012A2_A7766RecMaqBL[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7767RecMaqFlow != T012A2_A7767RecMaqFlow[0] ) || ( Z7768RecMaqRPM != T012A2_A7768RecMaqRPM[0] ) || ( Z7769RecMaqMol != T012A2_A7769RecMaqMol[0] ) || ( Z7770RecMaqTor != T012A2_A7770RecMaqTor[0] ) || ( GXutil.strcmp(Z7771RecMaqCla, T012A2_A7771RecMaqCla[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7772RecMaqTej != T012A2_A7772RecMaqTej[0] ) || ( Z7773RecMaqDel != T012A2_A7773RecMaqDel[0] ) || ( Z7774RecMaqPML != T012A2_A7774RecMaqPML[0] ) || ( DecimalUtil.compareTo(Z4259RecTotKgs, T012A2_A4259RecTotKgs[0]) != 0 ) || ( GXutil.strcmp(Z602MaqCod, T012A2_A602MaqCod[0]) != 0 ) )
         {
            if ( Z2805RecVolPrd != T012A2_A2805RecVolPrd[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecVolPrd");
               GXutil.writeLogRaw("Old: ",Z2805RecVolPrd);
               GXutil.writeLogRaw("Current: ",T012A2_A2805RecVolPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z2806RecFA, T012A2_A2806RecFA[0]) != 0 )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecFA");
               GXutil.writeLogRaw("Old: ",Z2806RecFA);
               GXutil.writeLogRaw("Current: ",T012A2_A2806RecFA[0]);
            }
            if ( Z1272UltLinPro != T012A2_A1272UltLinPro[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"UltLinPro");
               GXutil.writeLogRaw("Old: ",Z1272UltLinPro);
               GXutil.writeLogRaw("Current: ",T012A2_A1272UltLinPro[0]);
            }
            if ( GXutil.strcmp(Z4402RecUsrCod, T012A2_A4402RecUsrCod[0]) != 0 )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecUsrCod");
               GXutil.writeLogRaw("Old: ",Z4402RecUsrCod);
               GXutil.writeLogRaw("Current: ",T012A2_A4402RecUsrCod[0]);
            }
            if ( !( GXutil.dateCompare(Z4574RecFecPes, T012A2_A4574RecFecPes[0]) ) )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecFecPes");
               GXutil.writeLogRaw("Old: ",Z4574RecFecPes);
               GXutil.writeLogRaw("Current: ",T012A2_A4574RecFecPes[0]);
            }
            if ( Z4575RecMaqPes != T012A2_A4575RecMaqPes[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqPes");
               GXutil.writeLogRaw("Old: ",Z4575RecMaqPes);
               GXutil.writeLogRaw("Current: ",T012A2_A4575RecMaqPes[0]);
            }
            if ( Z5109RecNumInt != T012A2_A5109RecNumInt[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecNumInt");
               GXutil.writeLogRaw("Old: ",Z5109RecNumInt);
               GXutil.writeLogRaw("Current: ",T012A2_A5109RecNumInt[0]);
            }
            if ( GXutil.strcmp(Z5110RecNumPrg, T012A2_A5110RecNumPrg[0]) != 0 )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecNumPrg");
               GXutil.writeLogRaw("Old: ",Z5110RecNumPrg);
               GXutil.writeLogRaw("Current: ",T012A2_A5110RecNumPrg[0]);
            }
            if ( Z5111RecBp12 != T012A2_A5111RecBp12[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecBp12");
               GXutil.writeLogRaw("Old: ",Z5111RecBp12);
               GXutil.writeLogRaw("Current: ",T012A2_A5111RecBp12[0]);
            }
            if ( Z5112RecBp13 != T012A2_A5112RecBp13[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecBp13");
               GXutil.writeLogRaw("Old: ",Z5112RecBp13);
               GXutil.writeLogRaw("Current: ",T012A2_A5112RecBp13[0]);
            }
            if ( Z5113RecBp14 != T012A2_A5113RecBp14[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecBp14");
               GXutil.writeLogRaw("Old: ",Z5113RecBp14);
               GXutil.writeLogRaw("Current: ",T012A2_A5113RecBp14[0]);
            }
            if ( Z5114RecBp15 != T012A2_A5114RecBp15[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecBp15");
               GXutil.writeLogRaw("Old: ",Z5114RecBp15);
               GXutil.writeLogRaw("Current: ",T012A2_A5114RecBp15[0]);
            }
            if ( DecimalUtil.compareTo(Z5115RecAbsFac, T012A2_A5115RecAbsFac[0]) != 0 )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecAbsFac");
               GXutil.writeLogRaw("Old: ",Z5115RecAbsFac);
               GXutil.writeLogRaw("Current: ",T012A2_A5115RecAbsFac[0]);
            }
            if ( Z4701RecRecep != T012A2_A4701RecRecep[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecRecep");
               GXutil.writeLogRaw("Old: ",Z4701RecRecep);
               GXutil.writeLogRaw("Current: ",T012A2_A4701RecRecep[0]);
            }
            if ( Z4700RecEnvio != T012A2_A4700RecEnvio[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecEnvio");
               GXutil.writeLogRaw("Old: ",Z4700RecEnvio);
               GXutil.writeLogRaw("Current: ",T012A2_A4700RecEnvio[0]);
            }
            if ( GXutil.strcmp(Z6269RecPrg2, T012A2_A6269RecPrg2[0]) != 0 )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecPrg2");
               GXutil.writeLogRaw("Old: ",Z6269RecPrg2);
               GXutil.writeLogRaw("Current: ",T012A2_A6269RecPrg2[0]);
            }
            if ( GXutil.strcmp(Z6270RecPrg3, T012A2_A6270RecPrg3[0]) != 0 )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecPrg3");
               GXutil.writeLogRaw("Old: ",Z6270RecPrg3);
               GXutil.writeLogRaw("Current: ",T012A2_A6270RecPrg3[0]);
            }
            if ( Z7764RecMaqNh != T012A2_A7764RecMaqNh[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqNh");
               GXutil.writeLogRaw("Old: ",Z7764RecMaqNh);
               GXutil.writeLogRaw("Current: ",T012A2_A7764RecMaqNh[0]);
            }
            if ( Z7765RecMaqVX != T012A2_A7765RecMaqVX[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqVX");
               GXutil.writeLogRaw("Old: ",Z7765RecMaqVX);
               GXutil.writeLogRaw("Current: ",T012A2_A7765RecMaqVX[0]);
            }
            if ( Z7766RecMaqBL != T012A2_A7766RecMaqBL[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqBL");
               GXutil.writeLogRaw("Old: ",Z7766RecMaqBL);
               GXutil.writeLogRaw("Current: ",T012A2_A7766RecMaqBL[0]);
            }
            if ( Z7767RecMaqFlow != T012A2_A7767RecMaqFlow[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqFlow");
               GXutil.writeLogRaw("Old: ",Z7767RecMaqFlow);
               GXutil.writeLogRaw("Current: ",T012A2_A7767RecMaqFlow[0]);
            }
            if ( Z7768RecMaqRPM != T012A2_A7768RecMaqRPM[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqRPM");
               GXutil.writeLogRaw("Old: ",Z7768RecMaqRPM);
               GXutil.writeLogRaw("Current: ",T012A2_A7768RecMaqRPM[0]);
            }
            if ( Z7769RecMaqMol != T012A2_A7769RecMaqMol[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqMol");
               GXutil.writeLogRaw("Old: ",Z7769RecMaqMol);
               GXutil.writeLogRaw("Current: ",T012A2_A7769RecMaqMol[0]);
            }
            if ( Z7770RecMaqTor != T012A2_A7770RecMaqTor[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqTor");
               GXutil.writeLogRaw("Old: ",Z7770RecMaqTor);
               GXutil.writeLogRaw("Current: ",T012A2_A7770RecMaqTor[0]);
            }
            if ( GXutil.strcmp(Z7771RecMaqCla, T012A2_A7771RecMaqCla[0]) != 0 )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqCla");
               GXutil.writeLogRaw("Old: ",Z7771RecMaqCla);
               GXutil.writeLogRaw("Current: ",T012A2_A7771RecMaqCla[0]);
            }
            if ( Z7772RecMaqTej != T012A2_A7772RecMaqTej[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqTej");
               GXutil.writeLogRaw("Old: ",Z7772RecMaqTej);
               GXutil.writeLogRaw("Current: ",T012A2_A7772RecMaqTej[0]);
            }
            if ( Z7773RecMaqDel != T012A2_A7773RecMaqDel[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqDel");
               GXutil.writeLogRaw("Old: ",Z7773RecMaqDel);
               GXutil.writeLogRaw("Current: ",T012A2_A7773RecMaqDel[0]);
            }
            if ( Z7774RecMaqPML != T012A2_A7774RecMaqPML[0] )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecMaqPML");
               GXutil.writeLogRaw("Old: ",Z7774RecMaqPML);
               GXutil.writeLogRaw("Current: ",T012A2_A7774RecMaqPML[0]);
            }
            if ( DecimalUtil.compareTo(Z4259RecTotKgs, T012A2_A4259RecTotKgs[0]) != 0 )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"RecTotKgs");
               GXutil.writeLogRaw("Old: ",Z4259RecTotKgs);
               GXutil.writeLogRaw("Current: ",T012A2_A4259RecTotKgs[0]);
            }
            if ( GXutil.strcmp(Z602MaqCod, T012A2_A602MaqCod[0]) != 0 )
            {
               GXutil.writeLogln("trec1:[seudo value changed for attri]"+"MaqCod");
               GXutil.writeLogRaw("Old: ",Z602MaqCod);
               GXutil.writeLogRaw("Current: ",T012A2_A602MaqCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECMAQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12A408( )
   {
      beforeValidate12A408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12A408( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12A408( 0) ;
         checkOptimisticConcurrency12A408( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12A408( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12A408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012A15 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A2804RecLinMaq), Integer.valueOf(A2805RecVolPrd), A2806RecFA, Byte.valueOf(A1272UltLinPro), A4402RecUsrCod, A4574RecFecPes, Byte.valueOf(A4575RecMaqPes), Integer.valueOf(A5109RecNumInt), A5110RecNumPrg, Short.valueOf(A5111RecBp12), Short.valueOf(A5112RecBp13), Short.valueOf(A5113RecBp14), Short.valueOf(A5114RecBp15), A5115RecAbsFac, Byte.valueOf(A4701RecRecep), Byte.valueOf(A4700RecEnvio), A6269RecPrg2, A6270RecPrg3, Short.valueOf(A7764RecMaqNh), Byte.valueOf(A7765RecMaqVX), Byte.valueOf(A7766RecMaqBL), Byte.valueOf(A7767RecMaqFlow), Short.valueOf(A7768RecMaqRPM), Short.valueOf(A7769RecMaqMol), Short.valueOf(A7770RecMaqTor), A7771RecMaqCla, Byte.valueOf(A7772RecMaqTej), Byte.valueOf(A7773RecMaqDel), Short.valueOf(A7774RecMaqPML), A8353RecMaqObs, A4259RecTotKgs, A396EmprCod, A602MaqCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption12A0( ) ;
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
            load12A408( ) ;
         }
         endLevel12A408( ) ;
      }
      closeExtendedTableCursors12A408( ) ;
   }

   public void update12A408( )
   {
      beforeValidate12A408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12A408( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12A408( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12A408( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate12A408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012A16 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A2805RecVolPrd), A2806RecFA, Byte.valueOf(A1272UltLinPro), A4402RecUsrCod, A4574RecFecPes, Byte.valueOf(A4575RecMaqPes), Integer.valueOf(A5109RecNumInt), A5110RecNumPrg, Short.valueOf(A5111RecBp12), Short.valueOf(A5112RecBp13), Short.valueOf(A5113RecBp14), Short.valueOf(A5114RecBp15), A5115RecAbsFac, Byte.valueOf(A4701RecRecep), Byte.valueOf(A4700RecEnvio), A6269RecPrg2, A6270RecPrg3, Short.valueOf(A7764RecMaqNh), Byte.valueOf(A7765RecMaqVX), Byte.valueOf(A7766RecMaqBL), Byte.valueOf(A7767RecMaqFlow), Short.valueOf(A7768RecMaqRPM), Short.valueOf(A7769RecMaqMol), Short.valueOf(A7770RecMaqTor), A7771RecMaqCla, Byte.valueOf(A7772RecMaqTej), Byte.valueOf(A7773RecMaqDel), Short.valueOf(A7774RecMaqPML), A8353RecMaqObs, A4259RecTotKgs, A602MaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECMAQ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate12A408( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( ( GXutil.strcmp(AV118MaqCodold, A602MaqCod) != 0 ) ) || ( ( A2805RecVolPrd != O2805RecVolPrd ) ) && true /* After */ && ( AV123VolPProc == 1 ) && true /* Level */ )
                     {
                        GXv_char15[0] = A396EmprCod ;
                        GXv_int10[0] = A129BarCod ;
                        GXv_int16[0] = A132BarCodReo ;
                        GXv_char14[0] = A130BarCodPar ;
                        GXv_int17[0] = A2804RecLinMaq ;
                        GXv_decimal18[0] = AV126rectotkgm ;
                        GXv_int6[0] = A2805RecVolPrd ;
                        new app.precrtn2(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_int17, GXv_decimal18, GXv_int6) ;
                        trec1_impl.this.A396EmprCod = GXv_char15[0] ;
                        trec1_impl.this.A129BarCod = GXv_int10[0] ;
                        trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
                        trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
                        trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
                        trec1_impl.this.AV126rectotkgm = GXv_decimal18[0] ;
                        trec1_impl.this.A2805RecVolPrd = GXv_int6[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV126rectotkgm", GXutil.ltrimstr( AV126rectotkgm, 10, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
                     }
                     if ( true /* After */ )
                     {
                        GXv_char15[0] = A396EmprCod ;
                        GXv_int10[0] = A129BarCod ;
                        GXv_int16[0] = A132BarCodReo ;
                        GXv_char14[0] = A130BarCodPar ;
                        GXv_char13[0] = AV16UsurCod ;
                        GXv_int17[0] = A2804RecLinMaq ;
                        GXv_char9[0] = AV125Msg_v ;
                        GXv_decimal18[0] = AV126rectotkgm ;
                        GXv_int6[0] = AV128rectotpie ;
                        GXv_decimal19[0] = AV127rectotmtr ;
                        GXv_char4[0] = AV118MaqCodold ;
                        GXv_char3[0] = A602MaqCod ;
                        GXv_int20[0] = A618MaqTemMax ;
                        GXv_int21[0] = A625MaqVolMin ;
                        GXv_int22[0] = A2805RecVolPrd ;
                        GXv_char2[0] = AV139Modo ;
                        new app.prec2(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int16, GXv_char14, GXv_char13, GXv_int17, GXv_char9, GXv_decimal18, GXv_int6, GXv_decimal19, GXv_char4, GXv_char3, GXv_int20, GXv_int21, GXv_int22, GXv_char2) ;
                        trec1_impl.this.A396EmprCod = GXv_char15[0] ;
                        trec1_impl.this.A129BarCod = GXv_int10[0] ;
                        trec1_impl.this.A132BarCodReo = GXv_int16[0] ;
                        trec1_impl.this.A130BarCodPar = GXv_char14[0] ;
                        trec1_impl.this.AV16UsurCod = GXv_char13[0] ;
                        trec1_impl.this.A2804RecLinMaq = GXv_int17[0] ;
                        trec1_impl.this.AV125Msg_v = GXv_char9[0] ;
                        trec1_impl.this.AV126rectotkgm = GXv_decimal18[0] ;
                        trec1_impl.this.AV128rectotpie = GXv_int6[0] ;
                        trec1_impl.this.AV127rectotmtr = GXv_decimal19[0] ;
                        trec1_impl.this.AV118MaqCodold = GXv_char4[0] ;
                        trec1_impl.this.A602MaqCod = GXv_char3[0] ;
                        trec1_impl.this.A618MaqTemMax = (short)((short)(GXv_int20[0])) ;
                        trec1_impl.this.A625MaqVolMin = GXv_int21[0] ;
                        trec1_impl.this.A2805RecVolPrd = GXv_int22[0] ;
                        trec1_impl.this.AV139Modo = GXv_char2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV125Msg_v", AV125Msg_v);
                        httpContext.ajax_rsp_assign_attri("", false, "AV126rectotkgm", GXutil.ltrimstr( AV126rectotkgm, 10, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV128rectotpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128rectotpie), 5, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV127rectotmtr", GXutil.ltrimstr( AV127rectotmtr, 10, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", AV118MaqCodold);
                        httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV139Modo", AV139Modo);
                     }
                     if ( ( GXutil.strcmp(AV118MaqCodold, A602MaqCod) != 0 ) && true /* After */ && ( AV123VolPProc == 1 ) && true /* Level */ )
                     {
                        httpContext.GX_msglist.addItem(AV125Msg_v, 0, "MAQCOD");
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption12A0( ) ;
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
         endLevel12A408( ) ;
      }
      closeExtendedTableCursors12A408( ) ;
   }

   public void deferredUpdate12A408( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12A408( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12A408( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12A408( ) ;
         afterConfirm12A408( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12A408( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T012A17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound408 == 0 )
                     {
                        initAll12A408( ) ;
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
                     resetCaption12A0( ) ;
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
      sMode408 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12A408( ) ;
      Gx_mode = sMode408 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12A408( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV16UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
         }
         /* Using cursor T012A18 */
         pr_default.execute(16, new Object[] {A396EmprCod, A602MaqCod});
         A623MaqVolMax = T012A18_A623MaqVolMax[0] ;
         n623MaqVolMax = T012A18_n623MaqVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
         A625MaqVolMin = T012A18_A625MaqVolMin[0] ;
         n625MaqVolMin = T012A18_n625MaqVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
         A624MaqVolMed = T012A18_A624MaqVolMed[0] ;
         n624MaqVolMed = T012A18_n624MaqVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
         A618MaqTemMax = T012A18_A618MaqTemMax[0] ;
         n618MaqTemMax = T012A18_n618MaqTemMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
         pr_default.close(16);
         AV109MaqCodi = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109MaqCodi", AV109MaqCodi);
         AV118MaqCodold = O602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", AV118MaqCodold);
         AV31RelBany = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(A2805RecVolPrd).divide(AV126rectotkgm, 18, java.math.RoundingMode.DOWN), 0))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31RelBany", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31RelBany), 4, 0));
         if ( ( AV104ActDos == 1 ) && ( ( A4701RecRecep == 1 ) || ( A4700RecEnvio == 2 ) ) )
         {
            edtMaqCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
         }
         else
         {
            edtMaqCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T012A19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T012A20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T012A21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECFAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T012A22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void endLevel12A408( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete12A408( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trec1");
         if ( AnyError == 0 )
         {
            confirmValues12A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trec1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart12A408( )
   {
      /* Scan By routine */
      /* Using cursor T012A23 */
      pr_default.execute(21, new Object[] {Short.valueOf(A2804RecLinMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound408 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound408 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12A408( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound408 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound408 = (short)(1) ;
      }
   }

   public void scanEnd12A408( )
   {
      pr_default.close(21);
   }

   public void afterConfirm12A408( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12A408( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12A408( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12A408( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12A408( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12A408( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12A408( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtBarMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Enabled), 5, 0), true);
      edtBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), true);
      edtBarSua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSua_Enabled), 5, 0), true);
      edtBarVolMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarVolMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolMaq_Enabled), 5, 0), true);
      edtBarNumAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumAny_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtEmCodVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmCodVir_Enabled), 5, 0), true);
      edtFindTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindTmx_Enabled), 5, 0), true);
      edtFindVolMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMin_Enabled), 5, 0), true);
      edtFindVolMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMax_Enabled), 5, 0), true);
      edtUltLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinMaq_Enabled), 5, 0), true);
      cmbBarEstReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbBarEstReo.getEnabled(), 5, 0), true);
      edtRecVolMx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecVolMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolMx_Enabled), 5, 0), true);
      edtRecVolMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecVolMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolMn_Enabled), 5, 0), true);
      edtRecVolMd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecVolMd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolMd_Enabled), 5, 0), true);
      edtRecLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtRecVolPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecVolPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolPrd_Enabled), 5, 0), true);
      edtRecFA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFA_Enabled), 5, 0), true);
      edtUltLinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinPro_Enabled), 5, 0), true);
      edtMaqVolMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMax_Enabled), 5, 0), true);
      edtMaqVolMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMin_Enabled), 5, 0), true);
      edtMaqVolMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMed_Enabled), 5, 0), true);
      edtMaqTemMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTemMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTemMax_Enabled), 5, 0), true);
      edtRecUsrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUsrCod_Enabled), 5, 0), true);
      edtRecFecPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecPes_Enabled), 5, 0), true);
      edtRecMaqPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqPes_Enabled), 5, 0), true);
      edtRecNumInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNumInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNumInt_Enabled), 5, 0), true);
      edtRecNumPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNumPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNumPrg_Enabled), 5, 0), true);
      edtRecBp12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecBp12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecBp12_Enabled), 5, 0), true);
      edtRecBp13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecBp13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecBp13_Enabled), 5, 0), true);
      edtRecBp14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecBp14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecBp14_Enabled), 5, 0), true);
      edtRecBp15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecBp15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecBp15_Enabled), 5, 0), true);
      edtRecAbsFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAbsFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAbsFac_Enabled), 5, 0), true);
      edtRecRecep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecRecep_Enabled), 5, 0), true);
      edtRecEnvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEnvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEnvio_Enabled), 5, 0), true);
      edtRecPrg2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrg2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrg2_Enabled), 5, 0), true);
      edtRecPrg3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrg3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrg3_Enabled), 5, 0), true);
      edtRecMaqNh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqNh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqNh_Enabled), 5, 0), true);
      edtRecMaqVX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqVX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqVX_Enabled), 5, 0), true);
      edtRecMaqBL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqBL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqBL_Enabled), 5, 0), true);
      edtRecMaqFlow_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqFlow_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqFlow_Enabled), 5, 0), true);
      edtRecMaqRPM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqRPM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqRPM_Enabled), 5, 0), true);
      edtRecMaqMol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqMol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqMol_Enabled), 5, 0), true);
      edtRecMaqTor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqTor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqTor_Enabled), 5, 0), true);
      edtRecMaqCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqCla_Enabled), 5, 0), true);
      edtRecMaqTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqTej_Enabled), 5, 0), true);
      edtRecMaqDel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqDel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqDel_Enabled), 5, 0), true);
      edtRecMaqPML_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqPML_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqPML_Enabled), 5, 0), true);
      edtRecMaqObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMaqObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMaqObs_Enabled), 5, 0), true);
      edtRecTotKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecTotKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTotKgs_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes12A408( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues12A0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), false);
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
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trec1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV16UsurCod)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV126rectotkgm)),GXutil.URLEncode(DecimalUtil.decToString(AV127rectotmtr)),GXutil.URLEncode(GXutil.ltrimstr(AV128rectotpie,5,0)),GXutil.URLEncode(GXutil.rtrim(AV139Modo))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","UsurCod","RecLinMaq","rectotkgm","rectotmtr","rectotpie","Modo"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "Form", true);
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TREC1");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trec1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2804RecLinMaq", GXutil.ltrim( localUtil.ntoc( Z2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2805RecVolPrd", GXutil.ltrim( localUtil.ntoc( Z2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2806RecFA", GXutil.ltrim( localUtil.ntoc( Z2806RecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1272UltLinPro", GXutil.ltrim( localUtil.ntoc( Z1272UltLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4402RecUsrCod", GXutil.rtrim( Z4402RecUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4574RecFecPes", localUtil.ttoc( Z4574RecFecPes, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4575RecMaqPes", GXutil.ltrim( localUtil.ntoc( Z4575RecMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5109RecNumInt", GXutil.ltrim( localUtil.ntoc( Z5109RecNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5110RecNumPrg", GXutil.rtrim( Z5110RecNumPrg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5111RecBp12", GXutil.ltrim( localUtil.ntoc( Z5111RecBp12, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5112RecBp13", GXutil.ltrim( localUtil.ntoc( Z5112RecBp13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5113RecBp14", GXutil.ltrim( localUtil.ntoc( Z5113RecBp14, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5114RecBp15", GXutil.ltrim( localUtil.ntoc( Z5114RecBp15, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5115RecAbsFac", GXutil.ltrim( localUtil.ntoc( Z5115RecAbsFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4701RecRecep", GXutil.ltrim( localUtil.ntoc( Z4701RecRecep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4700RecEnvio", GXutil.ltrim( localUtil.ntoc( Z4700RecEnvio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6269RecPrg2", GXutil.rtrim( Z6269RecPrg2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6270RecPrg3", GXutil.rtrim( Z6270RecPrg3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7764RecMaqNh", GXutil.ltrim( localUtil.ntoc( Z7764RecMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7765RecMaqVX", GXutil.ltrim( localUtil.ntoc( Z7765RecMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7766RecMaqBL", GXutil.ltrim( localUtil.ntoc( Z7766RecMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7767RecMaqFlow", GXutil.ltrim( localUtil.ntoc( Z7767RecMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7768RecMaqRPM", GXutil.ltrim( localUtil.ntoc( Z7768RecMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7769RecMaqMol", GXutil.ltrim( localUtil.ntoc( Z7769RecMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7770RecMaqTor", GXutil.ltrim( localUtil.ntoc( Z7770RecMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7771RecMaqCla", GXutil.rtrim( Z7771RecMaqCla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7772RecMaqTej", GXutil.ltrim( localUtil.ntoc( Z7772RecMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7773RecMaqDel", GXutil.ltrim( localUtil.ntoc( Z7773RecMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7774RecMaqPML", GXutil.ltrim( localUtil.ntoc( Z7774RecMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4259RecTotKgs", GXutil.ltrim( localUtil.ntoc( Z4259RecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O602MaqCod", GXutil.rtrim( O602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O2805RecVolPrd", GXutil.ltrim( localUtil.ntoc( O2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N602MaqCod", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV37Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vPUERTO", GXutil.rtrim( AV85Puerto));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV18ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_PESO", GXutil.rtrim( AV131Msg_peso));
      app.GxWebStd.gx_hidden_field( httpContext, "vNVECES", GXutil.ltrim( localUtil.ntoc( AV132Nveces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXIPASS000", GXutil.ltrim( localUtil.ntoc( AV135Exipass000, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXIPASS000", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV135Exipass000), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPASS000", GXutil.ltrim( localUtil.ntoc( AV133pass000, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG2", GXutil.rtrim( AV58msg2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58msg2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDOSIF", GXutil.ltrim( localUtil.ntoc( AV61Dosif, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDOSIF", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61Dosif), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG3", GXutil.rtrim( AV59msg3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59msg3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORGATEX", GXutil.ltrim( localUtil.ntoc( AV138orgatex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vORGATEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV138orgatex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSEDOEDTX", GXutil.ltrim( localUtil.ntoc( AV136sedoEdtx, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSEDOEDTX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV136sedoEdtx), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSEDOB", GXutil.ltrim( localUtil.ntoc( AV137sedoB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSEDOB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV137sedoB), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV140Carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV140Carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGOPE", GXutil.rtrim( AV130flagope));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOPIAS", GXutil.ltrim( localUtil.ntoc( AV60Copias, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLANING", GXutil.ltrim( localUtil.ntoc( AV105Planing, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105Planing), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCENTRA", GXutil.ltrim( localUtil.ntoc( AV89Centra, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENTRA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89Centra), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKOHLERA", GXutil.ltrim( localUtil.ntoc( AV110KohlerA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vKOHLERA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110KohlerA), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV62Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODIF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Modif, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vJPF", GXutil.ltrim( localUtil.ntoc( AV116Jpf, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vJPF", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV116Jpf), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG5", GXutil.rtrim( AV114Msg5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV114Msg5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG6", GXutil.rtrim( AV115Msg6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Msg6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGRENNRO", GXutil.ltrim( localUtil.ntoc( AV129FlagRenNro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGRENNRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV129FlagRenNro), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG4", GXutil.rtrim( AV113Msg4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV113Msg4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_OBSREC", GXutil.ltrim( localUtil.ntoc( AV101F_obsrec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vF_OBSREC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101F_obsrec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV16UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODI", GXutil.rtrim( AV109MaqCodi));
      app.GxWebStd.gx_hidden_field( httpContext, "vKOHLER", GXutil.ltrim( localUtil.ntoc( AV108Kohler, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTAACK", GXutil.ltrim( localUtil.ntoc( AV119Staack, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECTOTKGM", GXutil.ltrim( localUtil.ntoc( AV126rectotkgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRELBANY", GXutil.ltrim( localUtil.ntoc( AV31RelBany, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vACTDOS", GXutil.ltrim( localUtil.ntoc( AV104ActDos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODOLD", GXutil.rtrim( AV118MaqCodold));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXIMAC", GXutil.ltrim( localUtil.ntoc( AV121ExiMac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_V", GXutil.rtrim( AV125Msg_v));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLPPROC", GXutil.ltrim( localUtil.ntoc( AV123VolPProc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECTOTPIE", GXutil.ltrim( localUtil.ntoc( AV128rectotpie, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECTOTMTR", GXutil.ltrim( localUtil.ntoc( AV127rectotmtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV139Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV142Pgmname));
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
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "Form" : Form.getThemeClass())+"-fx");
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
      return formatLink("app.trec1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV16UsurCod)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV126rectotkgm)),GXutil.URLEncode(DecimalUtil.decToString(AV127rectotmtr)),GXutil.URLEncode(GXutil.ltrimstr(AV128rectotpie,5,0)),GXutil.URLEncode(GXutil.rtrim(AV139Modo))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","UsurCod","RecLinMaq","rectotkgm","rectotmtr","rectotpie","Modo"})  ;
   }

   public String getPgmname( )
   {
      return "TREC1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TRATAMIENTO RECETA-MAQUINA", "") ;
   }

   public void initializeNonKey12A408( )
   {
      AV109MaqCodi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109MaqCodi", AV109MaqCodi);
      A2805RecVolPrd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
      AV31RelBany = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31RelBany", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31RelBany), 4, 0));
      AV118MaqCodold = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", AV118MaqCodold);
      AV121ExiMac = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121ExiMac", GXutil.str( AV121ExiMac, 1, 0));
      A393EmCodVir = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A393EmCodVir", A393EmCodVir);
      A478FindVolMax = 0 ;
      n478FindVolMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
      A480FindVolMin = 0 ;
      n480FindVolMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A2806RecFA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrimstr( A2806RecFA, 6, 2));
      A1272UltLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
      A623MaqVolMax = 0 ;
      n623MaqVolMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A623MaqVolMax), 5, 0));
      A625MaqVolMin = 0 ;
      n625MaqVolMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
      A624MaqVolMed = 0 ;
      n624MaqVolMed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A624MaqVolMed), 5, 0));
      A618MaqTemMax = (short)(0) ;
      n618MaqTemMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
      A4402RecUsrCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", A4402RecUsrCod);
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A4575RecMaqPes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.str( A4575RecMaqPes, 1, 0));
      A5109RecNumInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5109RecNumInt), 8, 0));
      A5110RecNumPrg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
      A5111RecBp12 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5111RecBp12), 4, 0));
      A5112RecBp13 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5112RecBp13), 4, 0));
      A5113RecBp14 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5113RecBp14), 4, 0));
      A5114RecBp15 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5114RecBp15), 4, 0));
      A5115RecAbsFac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrimstr( A5115RecAbsFac, 6, 2));
      A4701RecRecep = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.str( A4701RecRecep, 1, 0));
      A4700RecEnvio = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.str( A4700RecEnvio, 1, 0));
      A6269RecPrg2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", A6269RecPrg2);
      A6270RecPrg3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", A6270RecPrg3);
      A7764RecMaqNh = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7764RecMaqNh), 3, 0));
      A7765RecMaqVX = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7765RecMaqVX), 2, 0));
      A7766RecMaqBL = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7766RecMaqBL), 2, 0));
      A7767RecMaqFlow = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7767RecMaqFlow), 2, 0));
      A7768RecMaqRPM = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7768RecMaqRPM), 4, 0));
      A7769RecMaqMol = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7769RecMaqMol), 3, 0));
      A7770RecMaqTor = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7770RecMaqTor), 3, 0));
      A7771RecMaqCla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", A7771RecMaqCla);
      A7772RecMaqTej = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.str( A7772RecMaqTej, 1, 0));
      A7773RecMaqDel = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.str( A7773RecMaqDel, 1, 0));
      A7774RecMaqPML = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7774RecMaqPML), 3, 0));
      A8353RecMaqObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
      A4259RecTotKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrimstr( A4259RecTotKgs, 10, 2));
      O602MaqCod = A602MaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      O2805RecVolPrd = A2805RecVolPrd ;
      httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
      Z2805RecVolPrd = 0 ;
      Z2806RecFA = DecimalUtil.ZERO ;
      Z1272UltLinPro = (byte)(0) ;
      Z4402RecUsrCod = "" ;
      Z4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z4575RecMaqPes = (byte)(0) ;
      Z5109RecNumInt = 0 ;
      Z5110RecNumPrg = "" ;
      Z5111RecBp12 = (short)(0) ;
      Z5112RecBp13 = (short)(0) ;
      Z5113RecBp14 = (short)(0) ;
      Z5114RecBp15 = (short)(0) ;
      Z5115RecAbsFac = DecimalUtil.ZERO ;
      Z4701RecRecep = (byte)(0) ;
      Z4700RecEnvio = (byte)(0) ;
      Z6269RecPrg2 = "" ;
      Z6270RecPrg3 = "" ;
      Z7764RecMaqNh = (short)(0) ;
      Z7765RecMaqVX = (byte)(0) ;
      Z7766RecMaqBL = (byte)(0) ;
      Z7767RecMaqFlow = (byte)(0) ;
      Z7768RecMaqRPM = (short)(0) ;
      Z7769RecMaqMol = (short)(0) ;
      Z7770RecMaqTor = (short)(0) ;
      Z7771RecMaqCla = "" ;
      Z7772RecMaqTej = (byte)(0) ;
      Z7773RecMaqDel = (byte)(0) ;
      Z7774RecMaqPML = (short)(0) ;
      Z4259RecTotKgs = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
   }

   public void initAll12A408( )
   {
      initializeNonKey12A408( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824154411", true, true);
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
      httpContext.AddJavascriptSource("trec1.js", "?2026824154411", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarMaqCod_Internalname = "BARMAQCOD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarMat_Internalname = "BARMAT" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarSua_Internalname = "BARSUA" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarVolMaq_Internalname = "BARVOLMAQ" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBarNumAny_Internalname = "BARNUMANY" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarSit_Internalname = "BARSIT" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtEmCodVir_Internalname = "EMCODVIR" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtFindTmx_Internalname = "FINDTMX" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtFindVolMin_Internalname = "FINDVOLMIN" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtFindVolMax_Internalname = "FINDVOLMAX" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtUltLinMaq_Internalname = "ULTLINMAQ" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      cmbBarEstReo.setInternalname( "BARESTREO" );
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtRecVolMx_Internalname = "RECVOLMX" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtRecVolMn_Internalname = "RECVOLMN" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtRecVolMd_Internalname = "RECVOLMD" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtRecVolPrd_Internalname = "RECVOLPRD" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtRecFA_Internalname = "RECFA" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtUltLinPro_Internalname = "ULTLINPRO" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtMaqVolMax_Internalname = "MAQVOLMAX" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtMaqVolMin_Internalname = "MAQVOLMIN" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtMaqVolMed_Internalname = "MAQVOLMED" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtMaqTemMax_Internalname = "MAQTEMMAX" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtRecUsrCod_Internalname = "RECUSRCOD" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtRecFecPes_Internalname = "RECFECPES" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtRecMaqPes_Internalname = "RECMAQPES" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtRecNumInt_Internalname = "RECNUMINT" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtRecNumPrg_Internalname = "RECNUMPRG" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtRecBp12_Internalname = "RECBP12" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtRecBp13_Internalname = "RECBP13" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtRecBp14_Internalname = "RECBP14" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtRecBp15_Internalname = "RECBP15" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtRecAbsFac_Internalname = "RECABSFAC" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtRecRecep_Internalname = "RECRECEP" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtRecEnvio_Internalname = "RECENVIO" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtRecPrg2_Internalname = "RECPRG2" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtRecPrg3_Internalname = "RECPRG3" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtRecMaqNh_Internalname = "RECMAQNH" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtRecMaqVX_Internalname = "RECMAQVX" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtRecMaqBL_Internalname = "RECMAQBL" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtRecMaqFlow_Internalname = "RECMAQFLOW" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtRecMaqRPM_Internalname = "RECMAQRPM" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtRecMaqMol_Internalname = "RECMAQMOL" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtRecMaqTor_Internalname = "RECMAQTOR" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtRecMaqCla_Internalname = "RECMAQCLA" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtRecMaqTej_Internalname = "RECMAQTEJ" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtRecMaqDel_Internalname = "RECMAQDEL" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtRecMaqPML_Internalname = "RECMAQPML" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtRecMaqObs_Internalname = "RECMAQOBS" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtRecTotKgs_Internalname = "RECTOTKGS" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
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
      Form.setCaption( httpContext.getMessage( "TRATAMIENTO RECETA-MAQUINA", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRecTotKgs_Jsonclick = "" ;
      edtRecTotKgs_Backcolor = (int)(0xFFFFFF) ;
      edtRecTotKgs_Enabled = 1 ;
      edtRecMaqObs_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqObs_Enabled = 1 ;
      edtRecMaqPML_Jsonclick = "" ;
      edtRecMaqPML_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqPML_Enabled = 1 ;
      edtRecMaqDel_Jsonclick = "" ;
      edtRecMaqDel_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqDel_Enabled = 1 ;
      edtRecMaqTej_Jsonclick = "" ;
      edtRecMaqTej_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqTej_Enabled = 1 ;
      edtRecMaqCla_Jsonclick = "" ;
      edtRecMaqCla_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqCla_Enabled = 1 ;
      edtRecMaqTor_Jsonclick = "" ;
      edtRecMaqTor_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqTor_Enabled = 1 ;
      edtRecMaqMol_Jsonclick = "" ;
      edtRecMaqMol_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqMol_Enabled = 1 ;
      edtRecMaqRPM_Jsonclick = "" ;
      edtRecMaqRPM_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqRPM_Enabled = 1 ;
      edtRecMaqFlow_Jsonclick = "" ;
      edtRecMaqFlow_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqFlow_Enabled = 1 ;
      edtRecMaqBL_Jsonclick = "" ;
      edtRecMaqBL_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqBL_Enabled = 1 ;
      edtRecMaqVX_Jsonclick = "" ;
      edtRecMaqVX_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqVX_Enabled = 1 ;
      edtRecMaqNh_Jsonclick = "" ;
      edtRecMaqNh_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqNh_Enabled = 1 ;
      edtRecPrg3_Jsonclick = "" ;
      edtRecPrg3_Backcolor = (int)(0xFFFFFF) ;
      edtRecPrg3_Enabled = 1 ;
      edtRecPrg2_Jsonclick = "" ;
      edtRecPrg2_Backcolor = (int)(0xFFFFFF) ;
      edtRecPrg2_Enabled = 1 ;
      edtRecEnvio_Jsonclick = "" ;
      edtRecEnvio_Backcolor = (int)(0xFFFFFF) ;
      edtRecEnvio_Enabled = 1 ;
      edtRecRecep_Jsonclick = "" ;
      edtRecRecep_Backcolor = (int)(0xFFFFFF) ;
      edtRecRecep_Enabled = 1 ;
      edtRecAbsFac_Jsonclick = "" ;
      edtRecAbsFac_Backcolor = (int)(0xFFFFFF) ;
      edtRecAbsFac_Enabled = 1 ;
      edtRecBp15_Jsonclick = "" ;
      edtRecBp15_Backcolor = (int)(0xFFFFFF) ;
      edtRecBp15_Enabled = 1 ;
      edtRecBp14_Jsonclick = "" ;
      edtRecBp14_Backcolor = (int)(0xFFFFFF) ;
      edtRecBp14_Enabled = 1 ;
      edtRecBp13_Jsonclick = "" ;
      edtRecBp13_Backcolor = (int)(0xFFFFFF) ;
      edtRecBp13_Enabled = 1 ;
      edtRecBp12_Jsonclick = "" ;
      edtRecBp12_Backcolor = (int)(0xFFFFFF) ;
      edtRecBp12_Enabled = 1 ;
      edtRecNumPrg_Jsonclick = "" ;
      edtRecNumPrg_Backcolor = (int)(0xFFFFFF) ;
      edtRecNumPrg_Enabled = 1 ;
      edtRecNumInt_Jsonclick = "" ;
      edtRecNumInt_Backcolor = (int)(0xFFFFFF) ;
      edtRecNumInt_Enabled = 1 ;
      edtRecMaqPes_Jsonclick = "" ;
      edtRecMaqPes_Backcolor = (int)(0xFFFFFF) ;
      edtRecMaqPes_Enabled = 1 ;
      edtRecFecPes_Jsonclick = "" ;
      edtRecFecPes_Backcolor = (int)(0xFFFFFF) ;
      edtRecFecPes_Enabled = 1 ;
      edtRecUsrCod_Jsonclick = "" ;
      edtRecUsrCod_Backcolor = (int)(0xFFFFFF) ;
      edtRecUsrCod_Enabled = 1 ;
      edtMaqTemMax_Jsonclick = "" ;
      edtMaqTemMax_Backcolor = (int)(0xFFFFFF) ;
      edtMaqTemMax_Enabled = 0 ;
      edtMaqVolMed_Jsonclick = "" ;
      edtMaqVolMed_Backcolor = (int)(0xFFFFFF) ;
      edtMaqVolMed_Enabled = 0 ;
      edtMaqVolMin_Jsonclick = "" ;
      edtMaqVolMin_Backcolor = (int)(0xFFFFFF) ;
      edtMaqVolMin_Enabled = 0 ;
      edtMaqVolMax_Jsonclick = "" ;
      edtMaqVolMax_Backcolor = (int)(0xFFFFFF) ;
      edtMaqVolMax_Enabled = 0 ;
      edtUltLinPro_Jsonclick = "" ;
      edtUltLinPro_Backcolor = (int)(0xFFFFFF) ;
      edtUltLinPro_Enabled = 1 ;
      edtRecFA_Jsonclick = "" ;
      edtRecFA_Backcolor = (int)(0xFFFFFF) ;
      edtRecFA_Enabled = 1 ;
      edtRecVolPrd_Jsonclick = "" ;
      edtRecVolPrd_Backcolor = (int)(0xFFFFFF) ;
      edtRecVolPrd_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRecLinMaq_Jsonclick = "" ;
      edtRecLinMaq_Backcolor = (int)(0xFFFFFF) ;
      edtRecLinMaq_Enabled = 0 ;
      edtRecVolMd_Jsonclick = "" ;
      edtRecVolMd_Backcolor = (int)(0xFFFFFF) ;
      edtRecVolMd_Enabled = 0 ;
      edtRecVolMn_Jsonclick = "" ;
      edtRecVolMn_Backcolor = (int)(0xFFFFFF) ;
      edtRecVolMn_Enabled = 0 ;
      edtRecVolMx_Jsonclick = "" ;
      edtRecVolMx_Backcolor = (int)(0xFFFFFF) ;
      edtRecVolMx_Enabled = 0 ;
      cmbBarEstReo.setJsonclick( "" );
      cmbBarEstReo.setEnabled( 0 );
      cmbBarEstReo.setIBackground( (int)(0xFFFFFF) );
      edtUltLinMaq_Jsonclick = "" ;
      edtUltLinMaq_Backcolor = (int)(0xFFFFFF) ;
      edtUltLinMaq_Enabled = 0 ;
      edtFindVolMax_Jsonclick = "" ;
      edtFindVolMax_Backcolor = (int)(0xFFFFFF) ;
      edtFindVolMax_Enabled = 0 ;
      edtFindVolMin_Jsonclick = "" ;
      edtFindVolMin_Backcolor = (int)(0xFFFFFF) ;
      edtFindVolMin_Enabled = 0 ;
      edtFindTmx_Jsonclick = "" ;
      edtFindTmx_Backcolor = (int)(0xFFFFFF) ;
      edtFindTmx_Enabled = 0 ;
      edtEmCodVir_Jsonclick = "" ;
      edtEmCodVir_Backcolor = (int)(0xFFFFFF) ;
      edtEmCodVir_Enabled = 0 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Backcolor = (int)(0xFFFFFF) ;
      edtBarSit_Enabled = 0 ;
      edtBarNumAny_Jsonclick = "" ;
      edtBarNumAny_Backcolor = (int)(0xFFFFFF) ;
      edtBarNumAny_Enabled = 0 ;
      edtBarVolMaq_Jsonclick = "" ;
      edtBarVolMaq_Backcolor = (int)(0xFFFFFF) ;
      edtBarVolMaq_Enabled = 0 ;
      edtBarSua_Jsonclick = "" ;
      edtBarSua_Backcolor = (int)(0xFFFFFF) ;
      edtBarSua_Enabled = 0 ;
      edtBarMat_Jsonclick = "" ;
      edtBarMat_Backcolor = (int)(0xFFFFFF) ;
      edtBarMat_Enabled = 0 ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarMaqCod_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipCol_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 0 ;
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

   public void gx2asarecvolmd12A408( String A396EmprCod ,
                                     String A180BarMaqCod )
   {
      GXt_int8 = A8646RecVolMd ;
      GXv_char15[0] = A396EmprCod ;
      GXv_char14[0] = A180BarMaqCod ;
      GXv_int22[0] = GXt_int8 ;
      new app.ppvolmd(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int22) ;
      trec1_impl.this.A396EmprCod = GXv_char15[0] ;
      trec1_impl.this.A180BarMaqCod = GXv_char14[0] ;
      trec1_impl.this.GXt_int8 = GXv_int22[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A8646RecVolMd = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8646RecVolMd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8646RecVolMd), 5, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8646RecVolMd, (byte)(5), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asarecvolmn12A408( String A396EmprCod ,
                                     String A180BarMaqCod )
   {
      GXt_int8 = A8645RecVolMn ;
      GXv_char15[0] = A396EmprCod ;
      GXv_char14[0] = A180BarMaqCod ;
      GXv_int22[0] = GXt_int8 ;
      new app.ppvolmn(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int22) ;
      trec1_impl.this.A396EmprCod = GXv_char15[0] ;
      trec1_impl.this.A180BarMaqCod = GXv_char14[0] ;
      trec1_impl.this.GXt_int8 = GXv_int22[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A8645RecVolMn = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8645RecVolMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8645RecVolMn), 5, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8645RecVolMn, (byte)(5), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asarecvolmx12A408( String A396EmprCod ,
                                     String A180BarMaqCod )
   {
      GXt_int8 = A8644RecVolMx ;
      GXv_char15[0] = A396EmprCod ;
      GXv_char14[0] = A180BarMaqCod ;
      GXv_int22[0] = GXt_int8 ;
      new app.ppvolmx(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int22) ;
      trec1_impl.this.A396EmprCod = GXv_char15[0] ;
      trec1_impl.this.A180BarMaqCod = GXv_char14[0] ;
      trec1_impl.this.GXt_int8 = GXv_int22[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A8644RecVolMx = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8644RecVolMx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8644RecVolMx), 5, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8644RecVolMx, (byte)(5), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_25_12A408( String A396EmprCod ,
                             String A5110RecNumPrg ,
                             byte AV121ExiMac )
   {
      if ( true /* After */ && ! (GXutil.strcmp("", A5110RecNumPrg)==0) )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_char14[0] = A5110RecNumPrg ;
         GXv_int16[0] = AV121ExiMac ;
         new app.peximac(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int16) ;
         A396EmprCod = GXv_char15[0] ;
         A5110RecNumPrg = GXv_char14[0] ;
         AV121ExiMac = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", A5110RecNumPrg);
         httpContext.ajax_rsp_assign_attri("", false, "AV121ExiMac", GXutil.str( AV121ExiMac, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5110RecNumPrg))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV121ExiMac, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_28_12A408( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short A2804RecLinMaq ,
                             java.math.BigDecimal AV126rectotkgm ,
                             int A2805RecVolPrd ,
                             String AV118MaqCodold ,
                             String A602MaqCod ,
                             byte AV123VolPProc )
   {
      if ( ( ( GXutil.strcmp(AV118MaqCodold, A602MaqCod) != 0 ) ) || ( ( A2805RecVolPrd != O2805RecVolPrd ) ) && true /* After */ && ( AV123VolPProc == 1 ) && true /* Level */ )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_int22[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char14[0] = A130BarCodPar ;
         GXv_int17[0] = A2804RecLinMaq ;
         GXv_decimal19[0] = AV126rectotkgm ;
         GXv_int21[0] = A2805RecVolPrd ;
         new app.precrtn2(remoteHandle, context).execute( GXv_char15, GXv_int22, GXv_int16, GXv_char14, GXv_int17, GXv_decimal19, GXv_int21) ;
         A396EmprCod = GXv_char15[0] ;
         A129BarCod = GXv_int22[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char14[0] ;
         A2804RecLinMaq = GXv_int17[0] ;
         AV126rectotkgm = GXv_decimal19[0] ;
         A2805RecVolPrd = GXv_int21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV126rectotkgm", GXutil.ltrimstr( AV126rectotkgm, 10, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV126rectotkgm, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_29_12A408( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String AV16UsurCod ,
                             short A2804RecLinMaq ,
                             String AV125Msg_v ,
                             java.math.BigDecimal AV126rectotkgm ,
                             int AV128rectotpie ,
                             java.math.BigDecimal AV127rectotmtr ,
                             String AV118MaqCodold ,
                             String A602MaqCod ,
                             short A618MaqTemMax ,
                             int A625MaqVolMin ,
                             int A2805RecVolPrd ,
                             String AV139Modo )
   {
      if ( true /* After */ )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_int22[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char14[0] = A130BarCodPar ;
         GXv_char13[0] = AV16UsurCod ;
         GXv_int17[0] = A2804RecLinMaq ;
         GXv_char9[0] = AV125Msg_v ;
         GXv_decimal19[0] = AV126rectotkgm ;
         GXv_int21[0] = AV128rectotpie ;
         GXv_decimal18[0] = AV127rectotmtr ;
         GXv_char4[0] = AV118MaqCodold ;
         GXv_char3[0] = A602MaqCod ;
         GXv_int20[0] = A618MaqTemMax ;
         GXv_int10[0] = A625MaqVolMin ;
         GXv_int6[0] = A2805RecVolPrd ;
         GXv_char2[0] = AV139Modo ;
         new app.prec2(remoteHandle, context).execute( GXv_char15, GXv_int22, GXv_int16, GXv_char14, GXv_char13, GXv_int17, GXv_char9, GXv_decimal19, GXv_int21, GXv_decimal18, GXv_char4, GXv_char3, GXv_int20, GXv_int10, GXv_int6, GXv_char2) ;
         A396EmprCod = GXv_char15[0] ;
         A129BarCod = GXv_int22[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char14[0] ;
         AV16UsurCod = GXv_char13[0] ;
         A2804RecLinMaq = GXv_int17[0] ;
         AV125Msg_v = GXv_char9[0] ;
         AV126rectotkgm = GXv_decimal19[0] ;
         AV128rectotpie = GXv_int21[0] ;
         AV127rectotmtr = GXv_decimal18[0] ;
         AV118MaqCodold = GXv_char4[0] ;
         A602MaqCod = GXv_char3[0] ;
         A618MaqTemMax = (short)((short)(GXv_int20[0])) ;
         A625MaqVolMin = GXv_int10[0] ;
         A2805RecVolPrd = GXv_int6[0] ;
         AV139Modo = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV125Msg_v", AV125Msg_v);
         httpContext.ajax_rsp_assign_attri("", false, "AV126rectotkgm", GXutil.ltrimstr( AV126rectotkgm, 10, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV128rectotpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128rectotpie), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV127rectotmtr", GXutil.ltrimstr( AV127rectotmtr, 10, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", AV118MaqCodold);
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A618MaqTemMax), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A625MaqVolMin), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2805RecVolPrd), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV139Modo", AV139Modo);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV16UsurCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV125Msg_v))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV126rectotkgm, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV128rectotpie, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV127rectotmtr, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV118MaqCodold))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A618MaqTemMax, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV139Modo))+"\"") ;
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
      cmbBarEstReo.setName( "BARESTREO" );
      cmbBarEstReo.setWebtags( "" );
      cmbBarEstReo.addItem("0", httpContext.getMessage( "Normal", ""), (short)(0));
      cmbBarEstReo.addItem("1", httpContext.getMessage( "No Conformidad", ""), (short)(0));
      cmbBarEstReo.addItem("2", httpContext.getMessage( "Reclamacion", ""), (short)(0));
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T012A24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T012A24_A407EmprNom[0] ;
      n407EmprNom = T012A24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T012A25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A2759BarMaqGru = T012A25_A2759BarMaqGru[0] ;
      A212BarSer = T012A25_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T012A25_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T012A25_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T012A25_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A180BarMaqCod = T012A25_A180BarMaqCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A182BarMat = T012A25_A182BarMat[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
      A214BarSua = T012A25_A214BarSua[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A214BarSua", A214BarSua);
      A236BarVolMaq = T012A25_A236BarVolMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      A189BarNumAny = T012A25_A189BarNumAny[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A189BarNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A189BarNumAny), 3, 0));
      A213BarSit = T012A25_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A2803UltLinMaq = T012A25_A2803UltLinMaq[0] ;
      n2803UltLinMaq = T012A25_n2803UltLinMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2803UltLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2803UltLinMaq), 4, 0));
      A148BarEstReo = T012A25_A148BarEstReo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      A252CliCod = T012A25_A252CliCod[0] ;
      n252CliCod = T012A25_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(23);
      /* Using cursor T012A26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A214BarSua});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A918FindTmx = T012A26_A918FindTmx[0] ;
         n918FindTmx = T012A26_n918FindTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A918FindTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A918FindTmx), 4, 0));
      }
      else
      {
         A918FindTmx = (short)(0) ;
         n918FindTmx = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A918FindTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A918FindTmx), 4, 0));
      }
      pr_default.close(24);
      /* Using cursor T012A27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T012A27_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(25);
      GX_FocusControl = edtMaqCod_Internalname ;
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

   public void valid_Reclinmaq( )
   {
      A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValue())) ;
      cmbBarEstReo.setValue( GXutil.str( A148BarEstReo, 1, 0) );
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
         cmbBarEstReo.setValue( GXutil.str( A148BarEstReo, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A918FindTmx", GXutil.ltrim( localUtil.ntoc( A918FindTmx, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A393EmCodVir", GXutil.rtrim( A393EmCodVir));
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8644RecVolMx", GXutil.ltrim( localUtil.ntoc( A8644RecVolMx, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8645RecVolMn", GXutil.ltrim( localUtil.ntoc( A8645RecVolMn, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8646RecVolMd", GXutil.ltrim( localUtil.ntoc( A8646RecVolMd, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", GXutil.rtrim( A182BarMat));
      httpContext.ajax_rsp_assign_attri("", false, "A214BarSua", GXutil.rtrim( A214BarSua));
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A189BarNumAny", GXutil.ltrim( localUtil.ntoc( A189BarNumAny, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2803UltLinMaq", GXutil.ltrim( localUtil.ntoc( A2803UltLinMaq, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), ".", "")));
      cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2806RecFA", GXutil.ltrim( localUtil.ntoc( A2806RecFA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrim( localUtil.ntoc( A1272UltLinPro, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4402RecUsrCod", GXutil.rtrim( A4402RecUsrCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4574RecFecPes", localUtil.ttoc( A4574RecFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A4575RecMaqPes", GXutil.ltrim( localUtil.ntoc( A4575RecMaqPes, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5109RecNumInt", GXutil.ltrim( localUtil.ntoc( A5109RecNumInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", GXutil.rtrim( A5110RecNumPrg));
      httpContext.ajax_rsp_assign_attri("", false, "A5111RecBp12", GXutil.ltrim( localUtil.ntoc( A5111RecBp12, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5112RecBp13", GXutil.ltrim( localUtil.ntoc( A5112RecBp13, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5113RecBp14", GXutil.ltrim( localUtil.ntoc( A5113RecBp14, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5114RecBp15", GXutil.ltrim( localUtil.ntoc( A5114RecBp15, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5115RecAbsFac", GXutil.ltrim( localUtil.ntoc( A5115RecAbsFac, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4701RecRecep", GXutil.ltrim( localUtil.ntoc( A4701RecRecep, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4700RecEnvio", GXutil.ltrim( localUtil.ntoc( A4700RecEnvio, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6269RecPrg2", GXutil.rtrim( A6269RecPrg2));
      httpContext.ajax_rsp_assign_attri("", false, "A6270RecPrg3", GXutil.rtrim( A6270RecPrg3));
      httpContext.ajax_rsp_assign_attri("", false, "A7764RecMaqNh", GXutil.ltrim( localUtil.ntoc( A7764RecMaqNh, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7765RecMaqVX", GXutil.ltrim( localUtil.ntoc( A7765RecMaqVX, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7766RecMaqBL", GXutil.ltrim( localUtil.ntoc( A7766RecMaqBL, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7767RecMaqFlow", GXutil.ltrim( localUtil.ntoc( A7767RecMaqFlow, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7768RecMaqRPM", GXutil.ltrim( localUtil.ntoc( A7768RecMaqRPM, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7769RecMaqMol", GXutil.ltrim( localUtil.ntoc( A7769RecMaqMol, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7770RecMaqTor", GXutil.ltrim( localUtil.ntoc( A7770RecMaqTor, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7771RecMaqCla", GXutil.rtrim( A7771RecMaqCla));
      httpContext.ajax_rsp_assign_attri("", false, "A7772RecMaqTej", GXutil.ltrim( localUtil.ntoc( A7772RecMaqTej, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7773RecMaqDel", GXutil.ltrim( localUtil.ntoc( A7773RecMaqDel, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7774RecMaqPML", GXutil.ltrim( localUtil.ntoc( A7774RecMaqPML, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8353RecMaqObs", A8353RecMaqObs);
      httpContext.ajax_rsp_assign_attri("", false, "A4259RecTotKgs", GXutil.ltrim( localUtil.ntoc( A4259RecTotKgs, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", GXutil.rtrim( AV16UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrim( localUtil.ntoc( A618MaqTemMax, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV109MaqCodi", GXutil.rtrim( AV109MaqCodi));
      httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", GXutil.rtrim( AV118MaqCodold));
      httpContext.ajax_rsp_assign_attri("", false, "AV31RelBany", GXutil.ltrim( localUtil.ntoc( AV31RelBany, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV121ExiMac", GXutil.ltrim( localUtil.ntoc( AV121ExiMac, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2804RecLinMaq", GXutil.ltrim( localUtil.ntoc( Z2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z918FindTmx", GXutil.ltrim( localUtil.ntoc( Z918FindTmx, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z393EmCodVir", GXutil.rtrim( Z393EmCodVir));
      app.GxWebStd.gx_hidden_field( httpContext, "Z478FindVolMax", GXutil.ltrim( localUtil.ntoc( Z478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z480FindVolMin", GXutil.ltrim( localUtil.ntoc( Z480FindVolMin, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8644RecVolMx", GXutil.ltrim( localUtil.ntoc( Z8644RecVolMx, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8645RecVolMn", GXutil.ltrim( localUtil.ntoc( Z8645RecVolMn, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8646RecVolMd", GXutil.ltrim( localUtil.ntoc( Z8646RecVolMd, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z182BarMat", GXutil.rtrim( Z182BarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z214BarSua", GXutil.rtrim( Z214BarSua));
      app.GxWebStd.gx_hidden_field( httpContext, "Z236BarVolMaq", GXutil.ltrim( localUtil.ntoc( Z236BarVolMaq, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z189BarNumAny", GXutil.ltrim( localUtil.ntoc( Z189BarNumAny, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2803UltLinMaq", GXutil.ltrim( localUtil.ntoc( Z2803UltLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z148BarEstReo", GXutil.ltrim( localUtil.ntoc( Z148BarEstReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2806RecFA", GXutil.ltrim( localUtil.ntoc( Z2806RecFA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1272UltLinPro", GXutil.ltrim( localUtil.ntoc( Z1272UltLinPro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4402RecUsrCod", GXutil.rtrim( Z4402RecUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4574RecFecPes", localUtil.ttoc( Z4574RecFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4575RecMaqPes", GXutil.ltrim( localUtil.ntoc( Z4575RecMaqPes, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5109RecNumInt", GXutil.ltrim( localUtil.ntoc( Z5109RecNumInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5110RecNumPrg", GXutil.rtrim( Z5110RecNumPrg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5111RecBp12", GXutil.ltrim( localUtil.ntoc( Z5111RecBp12, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5112RecBp13", GXutil.ltrim( localUtil.ntoc( Z5112RecBp13, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5113RecBp14", GXutil.ltrim( localUtil.ntoc( Z5113RecBp14, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5114RecBp15", GXutil.ltrim( localUtil.ntoc( Z5114RecBp15, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5115RecAbsFac", GXutil.ltrim( localUtil.ntoc( Z5115RecAbsFac, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4701RecRecep", GXutil.ltrim( localUtil.ntoc( Z4701RecRecep, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4700RecEnvio", GXutil.ltrim( localUtil.ntoc( Z4700RecEnvio, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6269RecPrg2", GXutil.rtrim( Z6269RecPrg2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6270RecPrg3", GXutil.rtrim( Z6270RecPrg3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7764RecMaqNh", GXutil.ltrim( localUtil.ntoc( Z7764RecMaqNh, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7765RecMaqVX", GXutil.ltrim( localUtil.ntoc( Z7765RecMaqVX, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7766RecMaqBL", GXutil.ltrim( localUtil.ntoc( Z7766RecMaqBL, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7767RecMaqFlow", GXutil.ltrim( localUtil.ntoc( Z7767RecMaqFlow, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7768RecMaqRPM", GXutil.ltrim( localUtil.ntoc( Z7768RecMaqRPM, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7769RecMaqMol", GXutil.ltrim( localUtil.ntoc( Z7769RecMaqMol, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7770RecMaqTor", GXutil.ltrim( localUtil.ntoc( Z7770RecMaqTor, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7771RecMaqCla", GXutil.rtrim( Z7771RecMaqCla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7772RecMaqTej", GXutil.ltrim( localUtil.ntoc( Z7772RecMaqTej, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7773RecMaqDel", GXutil.ltrim( localUtil.ntoc( Z7773RecMaqDel, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7774RecMaqPML", GXutil.ltrim( localUtil.ntoc( Z7774RecMaqPML, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8353RecMaqObs", Z8353RecMaqObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z4259RecTotKgs", GXutil.ltrim( localUtil.ntoc( Z4259RecTotKgs, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV16UsurCod", GXutil.rtrim( ZV16UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z623MaqVolMax", GXutil.ltrim( localUtil.ntoc( Z623MaqVolMax, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z625MaqVolMin", GXutil.ltrim( localUtil.ntoc( Z625MaqVolMin, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z624MaqVolMed", GXutil.ltrim( localUtil.ntoc( Z624MaqVolMed, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z618MaqTemMax", GXutil.ltrim( localUtil.ntoc( Z618MaqTemMax, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2805RecVolPrd", GXutil.ltrim( localUtil.ntoc( Z2805RecVolPrd, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV109MaqCodi", GXutil.rtrim( ZV109MaqCodi));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV118MaqCodold", GXutil.rtrim( ZV118MaqCodold));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV31RelBany", GXutil.ltrim( localUtil.ntoc( ZV31RelBany, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV121ExiMac", GXutil.ltrim( localUtil.ntoc( ZV121ExiMac, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O602MaqCod", GXutil.rtrim( O602MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "O2805RecVolPrd", GXutil.ltrim( localUtil.ntoc( O2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Emcodvir( )
   {
      n478FindVolMax = false ;
      n480FindVolMin = false ;
      A393EmCodVir = A396EmprCod ;
      /* Using cursor T012A9 */
      pr_default.execute(7, new Object[] {A393EmCodVir, A180BarMaqCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A478FindVolMax = T012A9_A478FindVolMax[0] ;
         n478FindVolMax = T012A9_n478FindVolMax[0] ;
         A480FindVolMin = T012A9_A480FindVolMin[0] ;
         n480FindVolMin = T012A9_n480FindVolMin[0] ;
      }
      else
      {
         A480FindVolMin = 0 ;
         n480FindVolMin = false ;
         A478FindVolMax = 0 ;
         n478FindVolMax = false ;
      }
      pr_default.close(7);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A393EmCodVir", GXutil.rtrim( A393EmCodVir));
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")));
   }

   public void valid_Maqcod( )
   {
      n624MaqVolMed = false ;
      n623MaqVolMax = false ;
      n625MaqVolMin = false ;
      n618MaqTemMax = false ;
      /* Using cursor T012A18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      A623MaqVolMax = T012A18_A623MaqVolMax[0] ;
      n623MaqVolMax = T012A18_n623MaqVolMax[0] ;
      A625MaqVolMin = T012A18_A625MaqVolMin[0] ;
      n625MaqVolMin = T012A18_n625MaqVolMin[0] ;
      A624MaqVolMed = T012A18_A624MaqVolMed[0] ;
      n624MaqVolMed = T012A18_n624MaqVolMed[0] ;
      A618MaqTemMax = T012A18_A618MaqTemMax[0] ;
      n618MaqTemMax = T012A18_n618MaqTemMax[0] ;
      pr_default.close(16);
      AV109MaqCodi = A602MaqCod ;
      if ( ( GXutil.strcmp(A602MaqCod, O602MaqCod) != 0 ) && ( ( AV108Kohler == 0 ) || ( AV119Staack == 0 ) ) && ( A624MaqVolMed > 0 ) )
      {
         A2805RecVolPrd = A624MaqVolMed ;
      }
      AV118MaqCodold = O602MaqCod ;
      if ( ( AV104ActDos == 1 ) && ( A4701RecRecep == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Receta dosificada", ""), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      if ( ( AV104ActDos == 1 ) && ( A4700RecEnvio == 2 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Receta enviada a Máquina", ""), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A623MaqVolMax", GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A625MaqVolMin", GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A624MaqVolMed", GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A618MaqTemMax", GXutil.ltrim( localUtil.ntoc( A618MaqTemMax, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV109MaqCodi", GXutil.rtrim( AV109MaqCodi));
      httpContext.ajax_rsp_assign_attri("", false, "A2805RecVolPrd", GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV118MaqCodold", GXutil.rtrim( AV118MaqCodold));
   }

   public void valid_Recvolprd( )
   {
      n625MaqVolMin = false ;
      n623MaqVolMax = false ;
      AV31RelBany = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(A2805RecVolPrd).divide(AV126rectotkgm, 18, java.math.RoundingMode.DOWN), 0))) ;
      if ( ( ( A2805RecVolPrd < A625MaqVolMin ) || ( A2805RecVolPrd > A623MaqVolMax ) ) && ( ! (GXutil.strcmp("", A602MaqCod)==0) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Volumen fuera de rango", ""), 1, "RECVOLPRD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecVolPrd_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV31RelBany", GXutil.ltrim( localUtil.ntoc( AV31RelBany, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Recnumprg( )
   {
      if ( true /* After */ && ! (GXutil.strcmp("", A5110RecNumPrg)==0) )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_char14[0] = A5110RecNumPrg ;
         GXv_int16[0] = AV121ExiMac ;
         new app.peximac(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int16) ;
         trec1_impl.this.A396EmprCod = GXv_char15[0] ;
         A396EmprCod = this.A396EmprCod ;
         trec1_impl.this.A5110RecNumPrg = GXv_char14[0] ;
         A5110RecNumPrg = this.A5110RecNumPrg ;
         trec1_impl.this.AV121ExiMac = GXv_int16[0] ;
         AV121ExiMac = this.AV121ExiMac ;
      }
      if ( (0==AV121ExiMac) && true /* After */ && ! (GXutil.strcmp("", A5110RecNumPrg)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.No existe Nº Programa ¡¡¡", ""), 1, "RECNUMPRG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecNumPrg_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5110RecNumPrg", GXutil.rtrim( A5110RecNumPrg));
      httpContext.ajax_rsp_assign_attri("", false, "AV121ExiMac", GXutil.ltrim( localUtil.ntoc( AV121ExiMac, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV16UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV126rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV127rectotmtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV128rectotpie',fld:'vRECTOTPIE',pic:'ZZZZ9'},{av:'AV139Modo',fld:'vMODO',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV135Exipass000',fld:'vEXIPASS000',pic:'9',hsh:true},{av:'AV58msg2',fld:'vMSG2',pic:'',hsh:true},{av:'AV61Dosif',fld:'vDOSIF',pic:'9',hsh:true},{av:'AV59msg3',fld:'vMSG3',pic:'',hsh:true},{av:'AV138orgatex',fld:'vORGATEX',pic:'9',hsh:true},{av:'AV136sedoEdtx',fld:'vSEDOEDTX',pic:'9',hsh:true},{av:'AV137sedoB',fld:'vSEDOB',pic:'9',hsh:true},{av:'AV140Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV105Planing',fld:'vPLANING',pic:'9',hsh:true},{av:'AV89Centra',fld:'vCENTRA',pic:'9',hsh:true},{av:'AV110KohlerA',fld:'vKOHLERA',pic:'9',hsh:true},{av:'AV62Modif',fld:'vMODIF',pic:'',hsh:true},{av:'AV116Jpf',fld:'vJPF',pic:'9',hsh:true},{av:'AV114Msg5',fld:'vMSG5',pic:'',hsh:true},{av:'AV115Msg6',fld:'vMSG6',pic:'',hsh:true},{av:'AV129FlagRenNro',fld:'vFLAGRENNRO',pic:'9',hsh:true},{av:'AV113Msg4',fld:'vMSG4',pic:'',hsh:true},{av:'AV101F_obsrec',fld:'vF_OBSREC',pic:'9',hsh:true},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'SELECCION PUERTO'","{handler:'e1512A2',iparms:[{av:'AV37Station',fld:'vSTATION',pic:''},{av:'AV85Puerto',fld:'vPUERTO',pic:''},{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'}]");
      setEventMetadata("'SELECCION PUERTO'",",oparms:[{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'},{av:'AV85Puerto',fld:'vPUERTO',pic:''},{av:'AV37Station',fld:'vSTATION',pic:''}]}");
      setEventMetadata("'VER'","{handler:'e1612A2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A214BarSua',fld:'BARSUA',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV85Puerto',fld:'vPUERTO',pic:''},{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'}]");
      setEventMetadata("'VER'",",oparms:[{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'},{av:'AV85Puerto',fld:'vPUERTO',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A214BarSua',fld:'BARSUA',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'VER 2'","{handler:'e1712A2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'}]");
      setEventMetadata("'VER 2'",",oparms:[{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'AGRUPADAS'","{handler:'e1212A2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'AGRUPADAS'",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'ELIMINAR RECETA'","{handler:'e1312A2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV131Msg_peso',fld:'vMSG_PESO',pic:''},{av:'AV132Nveces',fld:'vNVECES',pic:'ZZZ9'},{av:'AV135Exipass000',fld:'vEXIPASS000',pic:'9',hsh:true},{av:'AV133pass000',fld:'vPASS000',pic:'ZZZZZZZ9'},{av:'AV58msg2',fld:'vMSG2',pic:'',hsh:true},{av:'AV61Dosif',fld:'vDOSIF',pic:'9',hsh:true},{av:'AV59msg3',fld:'vMSG3',pic:'',hsh:true},{av:'AV138orgatex',fld:'vORGATEX',pic:'9',hsh:true},{av:'AV136sedoEdtx',fld:'vSEDOEDTX',pic:'9',hsh:true},{av:'AV137sedoB',fld:'vSEDOB',pic:'9',hsh:true},{av:'AV140Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV130flagope',fld:'vFLAGOPE',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV37Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("'ELIMINAR RECETA'",",oparms:[{av:'AV132Nveces',fld:'vNVECES',pic:'ZZZ9'},{av:'AV131Msg_peso',fld:'vMSG_PESO',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV133pass000',fld:'vPASS000',pic:'ZZZZZZZ9'},{av:'AV130flagope',fld:'vFLAGOPE',pic:''}]}");
      setEventMetadata("'IMPRIMIR RECETA'","{handler:'e1412A2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV60Copias',fld:'vCOPIAS',pic:'Z9'},{av:'AV85Puerto',fld:'vPUERTO',pic:''},{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'}]");
      setEventMetadata("'IMPRIMIR RECETA'",",oparms:[{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'},{av:'AV85Puerto',fld:'vPUERTO',pic:''},{av:'AV60Copias',fld:'vCOPIAS',pic:'Z9'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("AFTER TRN","{handler:'e1812A2',iparms:[{av:'AV105Planing',fld:'vPLANING',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV89Centra',fld:'vCENTRA',pic:'9',hsh:true},{av:'AV110KohlerA',fld:'vKOHLERA',pic:'9',hsh:true},{av:'AV62Modif',fld:'vMODIF',pic:'',hsh:true},{av:'AV116Jpf',fld:'vJPF',pic:'9',hsh:true},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV114Msg5',fld:'vMSG5',pic:'',hsh:true},{av:'AV115Msg6',fld:'vMSG6',pic:'',hsh:true},{av:'AV129FlagRenNro',fld:'vFLAGRENNRO',pic:'9',hsh:true},{av:'AV130flagope',fld:'vFLAGOPE',pic:''},{av:'AV113Msg4',fld:'vMSG4',pic:'',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A214BarSua',fld:'BARSUA',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'AV60Copias',fld:'vCOPIAS',pic:'Z9'},{av:'AV85Puerto',fld:'vPUERTO',pic:''},{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV130flagope',fld:'vFLAGOPE',pic:''},{av:'AV18ImpCod',fld:'vIMPCOD',pic:'@!'},{av:'AV85Puerto',fld:'vPUERTO',pic:''},{av:'AV60Copias',fld:'vCOPIAS',pic:'Z9'},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A214BarSua',fld:'BARSUA',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]}");
      setEventMetadata("' OBSERVACIONES RECETA'","{handler:'e1912A2',iparms:[{av:'AV101F_obsrec',fld:'vF_OBSREC',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("' OBSERVACIONES RECETA'",",oparms:[{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARMAQCOD","{handler:'valid_Barmaqcod',iparms:[]");
      setEventMetadata("VALID_BARMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_BARSUA","{handler:'valid_Barsua',iparms:[]");
      setEventMetadata("VALID_BARSUA",",oparms:[]}");
      setEventMetadata("VALID_EMCODVIR","{handler:'valid_Emcodvir',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A393EmCodVir',fld:'EMCODVIR',pic:'@!'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'}]");
      setEventMetadata("VALID_EMCODVIR",",oparms:[{av:'A393EmCodVir',fld:'EMCODVIR',pic:'@!'},{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'}]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[{av:'AV101F_obsrec',fld:'vF_OBSREC',pic:'9',hsh:true},{av:'AV113Msg4',fld:'vMSG4',pic:'',hsh:true},{av:'AV129FlagRenNro',fld:'vFLAGRENNRO',pic:'9',hsh:true},{av:'AV115Msg6',fld:'vMSG6',pic:'',hsh:true},{av:'AV114Msg5',fld:'vMSG5',pic:'',hsh:true},{av:'AV116Jpf',fld:'vJPF',pic:'9',hsh:true},{av:'AV62Modif',fld:'vMODIF',pic:'',hsh:true},{av:'AV110KohlerA',fld:'vKOHLERA',pic:'9',hsh:true},{av:'AV89Centra',fld:'vCENTRA',pic:'9',hsh:true},{av:'AV105Planing',fld:'vPLANING',pic:'9',hsh:true},{av:'AV140Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV137sedoB',fld:'vSEDOB',pic:'9',hsh:true},{av:'AV136sedoEdtx',fld:'vSEDOEDTX',pic:'9',hsh:true},{av:'AV138orgatex',fld:'vORGATEX',pic:'9',hsh:true},{av:'AV59msg3',fld:'vMSG3',pic:'',hsh:true},{av:'AV61Dosif',fld:'vDOSIF',pic:'9',hsh:true},{av:'AV58msg2',fld:'vMSG2',pic:'',hsh:true},{av:'AV135Exipass000',fld:'vEXIPASS000',pic:'9',hsh:true},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV125Msg_v',fld:'vMSG_V',pic:''},{av:'AV123VolPProc',fld:'vVOLPPROC',pic:'9'},{av:'AV119Staack',fld:'vSTAACK',pic:'9'},{av:'AV108Kohler',fld:'vKOHLER',pic:'9'},{av:'AV104ActDos',fld:'vACTDOS',pic:'9'},{av:'AV139Modo',fld:'vMODO',pic:''},{av:'AV128rectotpie',fld:'vRECTOTPIE',pic:'ZZZZ9'},{av:'AV127rectotmtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV126rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'cmbBarEstReo'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A214BarSua',fld:'BARSUA',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV16UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'edtMaqCod_Enabled',ctrl:'MAQCOD',prop:'Enabled'},{av:'AV109MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV118MaqCodold',fld:'vMAQCODOLD',pic:''},{av:'AV31RelBany',fld:'vRELBANY',pic:'ZZZ9'},{av:'AV121ExiMac',fld:'vEXIMAC',pic:'9'}]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[{av:'A918FindTmx',fld:'FINDTMX',pic:'ZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A393EmCodVir',fld:'EMCODVIR',pic:'@!'},{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'},{av:'A8644RecVolMx',fld:'RECVOLMX',pic:'ZZZZ9'},{av:'A8645RecVolMn',fld:'RECVOLMN',pic:'ZZZZ9'},{av:'A8646RecVolMd',fld:'RECVOLMD',pic:'ZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A214BarSua',fld:'BARSUA',pic:''},{av:'A236BarVolMaq',fld:'BARVOLMAQ',pic:'ZZZZ9'},{av:'A189BarNumAny',fld:'BARNUMANY',pic:'ZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A2803UltLinMaq',fld:'ULTLINMAQ',pic:'ZZZ9'},{av:'cmbBarEstReo'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2806RecFA',fld:'RECFA',pic:'ZZ9.99'},{av:'A1272UltLinPro',fld:'ULTLINPRO',pic:'Z9'},{av:'A4402RecUsrCod',fld:'RECUSRCOD',pic:''},{av:'A4574RecFecPes',fld:'RECFECPES',pic:'99/99/99 99:99:99'},{av:'A4575RecMaqPes',fld:'RECMAQPES',pic:'9'},{av:'A5109RecNumInt',fld:'RECNUMINT',pic:'ZZZZZZZ9'},{av:'A5110RecNumPrg',fld:'RECNUMPRG',pic:''},{av:'A5111RecBp12',fld:'RECBP12',pic:'ZZZ9'},{av:'A5112RecBp13',fld:'RECBP13',pic:'ZZZ9'},{av:'A5113RecBp14',fld:'RECBP14',pic:'ZZZ9'},{av:'A5114RecBp15',fld:'RECBP15',pic:'ZZZ9'},{av:'A5115RecAbsFac',fld:'RECABSFAC',pic:'ZZ9.99'},{av:'A4701RecRecep',fld:'RECRECEP',pic:'9'},{av:'A4700RecEnvio',fld:'RECENVIO',pic:'9'},{av:'A6269RecPrg2',fld:'RECPRG2',pic:''},{av:'A6270RecPrg3',fld:'RECPRG3',pic:''},{av:'A7764RecMaqNh',fld:'RECMAQNH',pic:'ZZ9'},{av:'A7765RecMaqVX',fld:'RECMAQVX',pic:'Z9'},{av:'A7766RecMaqBL',fld:'RECMAQBL',pic:'Z9'},{av:'A7767RecMaqFlow',fld:'RECMAQFLOW',pic:'Z9'},{av:'A7768RecMaqRPM',fld:'RECMAQRPM',pic:'ZZZ9'},{av:'A7769RecMaqMol',fld:'RECMAQMOL',pic:'ZZ9'},{av:'A7770RecMaqTor',fld:'RECMAQTOR',pic:'ZZ9'},{av:'A7771RecMaqCla',fld:'RECMAQCLA',pic:''},{av:'A7772RecMaqTej',fld:'RECMAQTEJ',pic:'9'},{av:'A7773RecMaqDel',fld:'RECMAQDEL',pic:'9'},{av:'A7774RecMaqPML',fld:'RECMAQPML',pic:'ZZ9'},{av:'A8353RecMaqObs',fld:'RECMAQOBS',pic:''},{av:'A4259RecTotKgs',fld:'RECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV16UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A618MaqTemMax',fld:'MAQTEMMAX',pic:'ZZ9'},{av:'edtMaqCod_Enabled',ctrl:'MAQCOD',prop:'Enabled'},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'AV109MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV118MaqCodold',fld:'vMAQCODOLD',pic:''},{av:'AV31RelBany',fld:'vRELBANY',pic:'ZZZ9'},{av:'AV121ExiMac',fld:'vEXIMAC',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2804RecLinMaq'},{av:'Z918FindTmx'},{av:'Z2759BarMaqGru'},{av:'Z393EmCodVir'},{av:'Z478FindVolMax'},{av:'Z480FindVolMin'},{av:'Z8644RecVolMx'},{av:'Z8645RecVolMn'},{av:'Z8646RecVolMd'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z212BarSer'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z218BarTipCol'},{av:'Z180BarMaqCod'},{av:'Z182BarMat'},{av:'Z214BarSua'},{av:'Z236BarVolMaq'},{av:'Z189BarNumAny'},{av:'Z213BarSit'},{av:'Z2803UltLinMaq'},{av:'Z148BarEstReo'},{av:'Z602MaqCod'},{av:'Z2806RecFA'},{av:'Z1272UltLinPro'},{av:'Z4402RecUsrCod'},{av:'Z4574RecFecPes'},{av:'Z4575RecMaqPes'},{av:'Z5109RecNumInt'},{av:'Z5110RecNumPrg'},{av:'Z5111RecBp12'},{av:'Z5112RecBp13'},{av:'Z5113RecBp14'},{av:'Z5114RecBp15'},{av:'Z5115RecAbsFac'},{av:'Z4701RecRecep'},{av:'Z4700RecEnvio'},{av:'Z6269RecPrg2'},{av:'Z6270RecPrg3'},{av:'Z7764RecMaqNh'},{av:'Z7765RecMaqVX'},{av:'Z7766RecMaqBL'},{av:'Z7767RecMaqFlow'},{av:'Z7768RecMaqRPM'},{av:'Z7769RecMaqMol'},{av:'Z7770RecMaqTor'},{av:'Z7771RecMaqCla'},{av:'Z7772RecMaqTej'},{av:'Z7773RecMaqDel'},{av:'Z7774RecMaqPML'},{av:'Z8353RecMaqObs'},{av:'Z4259RecTotKgs'},{av:'ZV16UsurCod'},{av:'Z623MaqVolMax'},{av:'Z625MaqVolMin'},{av:'Z624MaqVolMed'},{av:'Z618MaqTemMax'},{av:'Z2805RecVolPrd'},{av:'ZV109MaqCodi'},{av:'ZV118MaqCodold'},{av:'ZV31RelBany'},{av:'ZV121ExiMac'},{av:'O602MaqCod'},{av:'O2805RecVolPrd'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'O602MaqCod'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'AV108Kohler',fld:'vKOHLER',pic:'9'},{av:'AV119Staack',fld:'vSTAACK',pic:'9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A618MaqTemMax',fld:'MAQTEMMAX',pic:'ZZ9'},{av:'AV109MaqCodi',fld:'vMAQCODI',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'AV118MaqCodold',fld:'vMAQCODOLD',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A618MaqTemMax',fld:'MAQTEMMAX',pic:'ZZ9'},{av:'AV109MaqCodi',fld:'vMAQCODI',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'AV118MaqCodold',fld:'vMAQCODOLD',pic:''}]}");
      setEventMetadata("VALID_RECVOLPRD","{handler:'valid_Recvolprd',iparms:[{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'AV126rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV31RelBany',fld:'vRELBANY',pic:'ZZZ9'}]");
      setEventMetadata("VALID_RECVOLPRD",",oparms:[{av:'AV31RelBany',fld:'vRELBANY',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_MAQVOLMAX","{handler:'valid_Maqvolmax',iparms:[]");
      setEventMetadata("VALID_MAQVOLMAX",",oparms:[]}");
      setEventMetadata("VALID_MAQVOLMIN","{handler:'valid_Maqvolmin',iparms:[]");
      setEventMetadata("VALID_MAQVOLMIN",",oparms:[]}");
      setEventMetadata("VALID_MAQVOLMED","{handler:'valid_Maqvolmed',iparms:[]");
      setEventMetadata("VALID_MAQVOLMED",",oparms:[]}");
      setEventMetadata("VALID_MAQTEMMAX","{handler:'valid_Maqtemmax',iparms:[]");
      setEventMetadata("VALID_MAQTEMMAX",",oparms:[]}");
      setEventMetadata("VALID_RECMAQPES","{handler:'valid_Recmaqpes',iparms:[]");
      setEventMetadata("VALID_RECMAQPES",",oparms:[]}");
      setEventMetadata("VALID_RECNUMPRG","{handler:'valid_Recnumprg',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5110RecNumPrg',fld:'RECNUMPRG',pic:''},{av:'AV121ExiMac',fld:'vEXIMAC',pic:'9'}]");
      setEventMetadata("VALID_RECNUMPRG",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5110RecNumPrg',fld:'RECNUMPRG',pic:''},{av:'AV121ExiMac',fld:'vEXIMAC',pic:'9'}]}");
      setEventMetadata("VALID_RECRECEP","{handler:'valid_Recrecep',iparms:[]");
      setEventMetadata("VALID_RECRECEP",",oparms:[]}");
      setEventMetadata("VALID_RECENVIO","{handler:'valid_Recenvio',iparms:[]");
      setEventMetadata("VALID_RECENVIO",",oparms:[]}");
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
      pr_default.close(22);
      pr_default.close(16);
      pr_default.close(23);
      pr_default.close(25);
      pr_default.close(24);
      pr_default.close(7);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOAV16UsurCod = "" ;
      wcpOAV126rectotkgm = DecimalUtil.ZERO ;
      wcpOAV127rectotmtr = DecimalUtil.ZERO ;
      wcpOAV139Modo = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2806RecFA = DecimalUtil.ZERO ;
      Z4402RecUsrCod = "" ;
      Z4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z5110RecNumPrg = "" ;
      Z5115RecAbsFac = DecimalUtil.ZERO ;
      Z6269RecPrg2 = "" ;
      Z6270RecPrg3 = "" ;
      Z7771RecMaqCla = "" ;
      Z4259RecTotKgs = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
      O602MaqCod = "" ;
      N602MaqCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A5110RecNumPrg = "" ;
      A130BarCodPar = "" ;
      AV126rectotkgm = DecimalUtil.ZERO ;
      AV118MaqCodold = "" ;
      A602MaqCod = "" ;
      AV16UsurCod = "" ;
      AV125Msg_v = "" ;
      AV127rectotmtr = DecimalUtil.ZERO ;
      AV139Modo = "" ;
      A180BarMaqCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      sStyleString = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock9_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A182BarMat = "" ;
      lblTextblock14_Jsonclick = "" ;
      A214BarSua = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A393EmCodVir = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      A4402RecUsrCod = "" ;
      lblTextblock37_Jsonclick = "" ;
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      lblTextblock46_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
      lblTextblock48_Jsonclick = "" ;
      A6269RecPrg2 = "" ;
      lblTextblock49_Jsonclick = "" ;
      A6270RecPrg3 = "" ;
      lblTextblock50_Jsonclick = "" ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      lblTextblock54_Jsonclick = "" ;
      lblTextblock55_Jsonclick = "" ;
      lblTextblock56_Jsonclick = "" ;
      lblTextblock57_Jsonclick = "" ;
      A7771RecMaqCla = "" ;
      lblTextblock58_Jsonclick = "" ;
      lblTextblock59_Jsonclick = "" ;
      lblTextblock60_Jsonclick = "" ;
      lblTextblock61_Jsonclick = "" ;
      A8353RecMaqObs = "" ;
      lblTextblock62_Jsonclick = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV109MaqCodi = "" ;
      A2759BarMaqGru = "" ;
      AV142Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV38Lit0 = "" ;
      AV39Lit1 = "" ;
      AV40Lit2 = "" ;
      AV41Lit3 = "" ;
      AV42Lit4 = "" ;
      AV43Lit5 = "" ;
      AV44Lit6 = "" ;
      AV45Lit7 = "" ;
      AV46Lit8 = "" ;
      AV47Lit9 = "" ;
      AV48Lit10 = "" ;
      AV49Lit11 = "" ;
      AV50Lit12 = "" ;
      AV51Lit13 = "" ;
      AV52Lit14 = "" ;
      AV53Lit20 = "" ;
      AV54Lit21 = "" ;
      AV55Lit22 = "" ;
      AV67Lit23 = "" ;
      AV68Lit24 = "" ;
      AV69Lit25 = "" ;
      AV75Lit26 = "" ;
      AV66LitFe = "" ;
      AV56msg0 = "" ;
      AV57msg1 = "" ;
      AV58msg2 = "" ;
      AV59msg3 = "" ;
      AV37Station = "" ;
      AV18ImpCod = "" ;
      AV85Puerto = "" ;
      AV36Escape = "" ;
      AV32Mod = "" ;
      AV99Lit30 = "" ;
      AV102Lit31 = "" ;
      AV103Lit32 = "" ;
      AV107Lit49 = "" ;
      AV62Modif = "" ;
      AV113Msg4 = "" ;
      AV114Msg5 = "" ;
      AV115Msg6 = "" ;
      GXt_char1 = "" ;
      AV120Lit90 = "" ;
      GXv_int11 = new short[1] ;
      AV131Msg_peso = "" ;
      AV134OK = "" ;
      Gx_msg = "" ;
      AV111Texto_i = "" ;
      AV130flagope = "" ;
      GXv_int12 = new byte[1] ;
      GXv_int5 = new byte[1] ;
      Z8353RecMaqObs = "" ;
      Z407EmprNom = "" ;
      Z2759BarMaqGru = "" ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z180BarMaqCod = "" ;
      Z182BarMat = "" ;
      Z214BarSua = "" ;
      Z279CliNom = "" ;
      T012A4_A407EmprNom = new String[] {""} ;
      T012A4_n407EmprNom = new boolean[] {false} ;
      T012A6_A2759BarMaqGru = new String[] {""} ;
      T012A6_A212BarSer = new String[] {""} ;
      T012A6_A135BarColNom = new String[] {""} ;
      T012A6_A136BarColNum = new int[1] ;
      T012A6_A218BarTipCol = new byte[1] ;
      T012A6_A180BarMaqCod = new String[] {""} ;
      T012A6_A182BarMat = new String[] {""} ;
      T012A6_A214BarSua = new String[] {""} ;
      T012A6_A236BarVolMaq = new int[1] ;
      T012A6_A189BarNumAny = new short[1] ;
      T012A6_A213BarSit = new byte[1] ;
      T012A6_A2803UltLinMaq = new short[1] ;
      T012A6_n2803UltLinMaq = new boolean[] {false} ;
      T012A6_A148BarEstReo = new byte[1] ;
      T012A6_A252CliCod = new int[1] ;
      T012A6_n252CliCod = new boolean[] {false} ;
      T012A8_A918FindTmx = new short[1] ;
      T012A8_n918FindTmx = new boolean[] {false} ;
      T012A7_A279CliNom = new String[] {""} ;
      T012A10_A8353RecMaqObs = new String[] {""} ;
      T012A10_A764ProForCod = new String[] {""} ;
      T012A10_A2759BarMaqGru = new String[] {""} ;
      T012A10_A2804RecLinMaq = new short[1] ;
      T012A10_A2805RecVolPrd = new int[1] ;
      T012A10_A407EmprNom = new String[] {""} ;
      T012A10_n407EmprNom = new boolean[] {false} ;
      T012A10_A279CliNom = new String[] {""} ;
      T012A10_A212BarSer = new String[] {""} ;
      T012A10_A135BarColNom = new String[] {""} ;
      T012A10_A136BarColNum = new int[1] ;
      T012A10_A218BarTipCol = new byte[1] ;
      T012A10_A180BarMaqCod = new String[] {""} ;
      T012A10_A182BarMat = new String[] {""} ;
      T012A10_A214BarSua = new String[] {""} ;
      T012A10_A236BarVolMaq = new int[1] ;
      T012A10_A189BarNumAny = new short[1] ;
      T012A10_A213BarSit = new byte[1] ;
      T012A10_A2803UltLinMaq = new short[1] ;
      T012A10_n2803UltLinMaq = new boolean[] {false} ;
      T012A10_A148BarEstReo = new byte[1] ;
      T012A10_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012A10_A1272UltLinPro = new byte[1] ;
      T012A10_A623MaqVolMax = new int[1] ;
      T012A10_n623MaqVolMax = new boolean[] {false} ;
      T012A10_A625MaqVolMin = new int[1] ;
      T012A10_n625MaqVolMin = new boolean[] {false} ;
      T012A10_A624MaqVolMed = new int[1] ;
      T012A10_n624MaqVolMed = new boolean[] {false} ;
      T012A10_A618MaqTemMax = new short[1] ;
      T012A10_n618MaqTemMax = new boolean[] {false} ;
      T012A10_A4402RecUsrCod = new String[] {""} ;
      T012A10_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T012A10_A4575RecMaqPes = new byte[1] ;
      T012A10_A5109RecNumInt = new int[1] ;
      T012A10_A5110RecNumPrg = new String[] {""} ;
      T012A10_A5111RecBp12 = new short[1] ;
      T012A10_A5112RecBp13 = new short[1] ;
      T012A10_A5113RecBp14 = new short[1] ;
      T012A10_A5114RecBp15 = new short[1] ;
      T012A10_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012A10_A4701RecRecep = new byte[1] ;
      T012A10_A4700RecEnvio = new byte[1] ;
      T012A10_A6269RecPrg2 = new String[] {""} ;
      T012A10_A6270RecPrg3 = new String[] {""} ;
      T012A10_A7764RecMaqNh = new short[1] ;
      T012A10_A7765RecMaqVX = new byte[1] ;
      T012A10_A7766RecMaqBL = new byte[1] ;
      T012A10_A7767RecMaqFlow = new byte[1] ;
      T012A10_A7768RecMaqRPM = new short[1] ;
      T012A10_A7769RecMaqMol = new short[1] ;
      T012A10_A7770RecMaqTor = new short[1] ;
      T012A10_A7771RecMaqCla = new String[] {""} ;
      T012A10_A7772RecMaqTej = new byte[1] ;
      T012A10_A7773RecMaqDel = new byte[1] ;
      T012A10_A7774RecMaqPML = new short[1] ;
      T012A10_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012A10_A396EmprCod = new String[] {""} ;
      T012A10_A602MaqCod = new String[] {""} ;
      T012A10_A129BarCod = new int[1] ;
      T012A10_A132BarCodReo = new byte[1] ;
      T012A10_A130BarCodPar = new String[] {""} ;
      T012A10_A252CliCod = new int[1] ;
      T012A10_n252CliCod = new boolean[] {false} ;
      T012A10_A918FindTmx = new short[1] ;
      T012A10_n918FindTmx = new boolean[] {false} ;
      T012A5_A623MaqVolMax = new int[1] ;
      T012A5_n623MaqVolMax = new boolean[] {false} ;
      T012A5_A625MaqVolMin = new int[1] ;
      T012A5_n625MaqVolMin = new boolean[] {false} ;
      T012A5_A624MaqVolMed = new int[1] ;
      T012A5_n624MaqVolMed = new boolean[] {false} ;
      T012A5_A618MaqTemMax = new short[1] ;
      T012A5_n618MaqTemMax = new boolean[] {false} ;
      T012A11_A623MaqVolMax = new int[1] ;
      T012A11_n623MaqVolMax = new boolean[] {false} ;
      T012A11_A625MaqVolMin = new int[1] ;
      T012A11_n625MaqVolMin = new boolean[] {false} ;
      T012A11_A624MaqVolMed = new int[1] ;
      T012A11_n624MaqVolMed = new boolean[] {false} ;
      T012A11_A618MaqTemMax = new short[1] ;
      T012A11_n618MaqTemMax = new boolean[] {false} ;
      T012A12_A396EmprCod = new String[] {""} ;
      T012A12_A129BarCod = new int[1] ;
      T012A12_A132BarCodReo = new byte[1] ;
      T012A12_A130BarCodPar = new String[] {""} ;
      T012A12_A2804RecLinMaq = new short[1] ;
      T012A3_A8353RecMaqObs = new String[] {""} ;
      T012A3_A2804RecLinMaq = new short[1] ;
      T012A3_A2805RecVolPrd = new int[1] ;
      T012A3_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012A3_A1272UltLinPro = new byte[1] ;
      T012A3_A4402RecUsrCod = new String[] {""} ;
      T012A3_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T012A3_A4575RecMaqPes = new byte[1] ;
      T012A3_A5109RecNumInt = new int[1] ;
      T012A3_A5110RecNumPrg = new String[] {""} ;
      T012A3_A5111RecBp12 = new short[1] ;
      T012A3_A5112RecBp13 = new short[1] ;
      T012A3_A5113RecBp14 = new short[1] ;
      T012A3_A5114RecBp15 = new short[1] ;
      T012A3_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012A3_A4701RecRecep = new byte[1] ;
      T012A3_A4700RecEnvio = new byte[1] ;
      T012A3_A6269RecPrg2 = new String[] {""} ;
      T012A3_A6270RecPrg3 = new String[] {""} ;
      T012A3_A7764RecMaqNh = new short[1] ;
      T012A3_A7765RecMaqVX = new byte[1] ;
      T012A3_A7766RecMaqBL = new byte[1] ;
      T012A3_A7767RecMaqFlow = new byte[1] ;
      T012A3_A7768RecMaqRPM = new short[1] ;
      T012A3_A7769RecMaqMol = new short[1] ;
      T012A3_A7770RecMaqTor = new short[1] ;
      T012A3_A7771RecMaqCla = new String[] {""} ;
      T012A3_A7772RecMaqTej = new byte[1] ;
      T012A3_A7773RecMaqDel = new byte[1] ;
      T012A3_A7774RecMaqPML = new short[1] ;
      T012A3_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012A3_A396EmprCod = new String[] {""} ;
      T012A3_A602MaqCod = new String[] {""} ;
      T012A3_A129BarCod = new int[1] ;
      T012A3_A132BarCodReo = new byte[1] ;
      T012A3_A130BarCodPar = new String[] {""} ;
      sMode408 = "" ;
      T012A13_A2804RecLinMaq = new short[1] ;
      T012A13_A396EmprCod = new String[] {""} ;
      T012A13_A129BarCod = new int[1] ;
      T012A13_A132BarCodReo = new byte[1] ;
      T012A13_A130BarCodPar = new String[] {""} ;
      T012A14_A2804RecLinMaq = new short[1] ;
      T012A14_A396EmprCod = new String[] {""} ;
      T012A14_A129BarCod = new int[1] ;
      T012A14_A132BarCodReo = new byte[1] ;
      T012A14_A130BarCodPar = new String[] {""} ;
      T012A2_A8353RecMaqObs = new String[] {""} ;
      T012A2_A2804RecLinMaq = new short[1] ;
      T012A2_A2805RecVolPrd = new int[1] ;
      T012A2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012A2_A1272UltLinPro = new byte[1] ;
      T012A2_A4402RecUsrCod = new String[] {""} ;
      T012A2_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T012A2_A4575RecMaqPes = new byte[1] ;
      T012A2_A5109RecNumInt = new int[1] ;
      T012A2_A5110RecNumPrg = new String[] {""} ;
      T012A2_A5111RecBp12 = new short[1] ;
      T012A2_A5112RecBp13 = new short[1] ;
      T012A2_A5113RecBp14 = new short[1] ;
      T012A2_A5114RecBp15 = new short[1] ;
      T012A2_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012A2_A4701RecRecep = new byte[1] ;
      T012A2_A4700RecEnvio = new byte[1] ;
      T012A2_A6269RecPrg2 = new String[] {""} ;
      T012A2_A6270RecPrg3 = new String[] {""} ;
      T012A2_A7764RecMaqNh = new short[1] ;
      T012A2_A7765RecMaqVX = new byte[1] ;
      T012A2_A7766RecMaqBL = new byte[1] ;
      T012A2_A7767RecMaqFlow = new byte[1] ;
      T012A2_A7768RecMaqRPM = new short[1] ;
      T012A2_A7769RecMaqMol = new short[1] ;
      T012A2_A7770RecMaqTor = new short[1] ;
      T012A2_A7771RecMaqCla = new String[] {""} ;
      T012A2_A7772RecMaqTej = new byte[1] ;
      T012A2_A7773RecMaqDel = new byte[1] ;
      T012A2_A7774RecMaqPML = new short[1] ;
      T012A2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012A2_A396EmprCod = new String[] {""} ;
      T012A2_A602MaqCod = new String[] {""} ;
      T012A2_A129BarCod = new int[1] ;
      T012A2_A132BarCodReo = new byte[1] ;
      T012A2_A130BarCodPar = new String[] {""} ;
      T012A18_A623MaqVolMax = new int[1] ;
      T012A18_n623MaqVolMax = new boolean[] {false} ;
      T012A18_A625MaqVolMin = new int[1] ;
      T012A18_n625MaqVolMin = new boolean[] {false} ;
      T012A18_A624MaqVolMed = new int[1] ;
      T012A18_n624MaqVolMed = new boolean[] {false} ;
      T012A18_A618MaqTemMax = new short[1] ;
      T012A18_n618MaqTemMax = new boolean[] {false} ;
      T012A19_A396EmprCod = new String[] {""} ;
      T012A19_A129BarCod = new int[1] ;
      T012A19_A132BarCodReo = new byte[1] ;
      T012A19_A130BarCodPar = new String[] {""} ;
      T012A19_A2804RecLinMaq = new short[1] ;
      T012A19_A5408RecLinCol = new short[1] ;
      T012A20_A396EmprCod = new String[] {""} ;
      T012A20_A129BarCod = new int[1] ;
      T012A20_A132BarCodReo = new byte[1] ;
      T012A20_A130BarCodPar = new String[] {""} ;
      T012A20_A2804RecLinMaq = new short[1] ;
      T012A20_A5257RecLinObs = new short[1] ;
      T012A21_A396EmprCod = new String[] {""} ;
      T012A21_A129BarCod = new int[1] ;
      T012A21_A132BarCodReo = new byte[1] ;
      T012A21_A130BarCodPar = new String[] {""} ;
      T012A21_A2804RecLinMaq = new short[1] ;
      T012A21_A4274RecBarCAg = new int[1] ;
      T012A21_A4275RecBarRAg = new byte[1] ;
      T012A21_A4276RecBarPAg = new String[] {""} ;
      T012A21_A4698RecBarNPd = new int[1] ;
      T012A21_A4699RecBarOrd = new short[1] ;
      T012A22_A396EmprCod = new String[] {""} ;
      T012A22_A129BarCod = new int[1] ;
      T012A22_A132BarCodReo = new byte[1] ;
      T012A22_A130BarCodPar = new String[] {""} ;
      T012A22_A2804RecLinMaq = new short[1] ;
      T012A22_A1273RecLinPro = new byte[1] ;
      T012A23_A396EmprCod = new String[] {""} ;
      T012A23_A129BarCod = new int[1] ;
      T012A23_A132BarCodReo = new byte[1] ;
      T012A23_A130BarCodPar = new String[] {""} ;
      T012A23_A2804RecLinMaq = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int22 = new int[1] ;
      GXv_char13 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_char9 = new String[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_int21 = new int[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int20 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_char2 = new String[1] ;
      T012A24_A407EmprNom = new String[] {""} ;
      T012A24_n407EmprNom = new boolean[] {false} ;
      T012A25_A2759BarMaqGru = new String[] {""} ;
      T012A25_A212BarSer = new String[] {""} ;
      T012A25_A135BarColNom = new String[] {""} ;
      T012A25_A136BarColNum = new int[1] ;
      T012A25_A218BarTipCol = new byte[1] ;
      T012A25_A180BarMaqCod = new String[] {""} ;
      T012A25_A182BarMat = new String[] {""} ;
      T012A25_A214BarSua = new String[] {""} ;
      T012A25_A236BarVolMaq = new int[1] ;
      T012A25_A189BarNumAny = new short[1] ;
      T012A25_A213BarSit = new byte[1] ;
      T012A25_A2803UltLinMaq = new short[1] ;
      T012A25_n2803UltLinMaq = new boolean[] {false} ;
      T012A25_A148BarEstReo = new byte[1] ;
      T012A25_A252CliCod = new int[1] ;
      T012A25_n252CliCod = new boolean[] {false} ;
      T012A26_A918FindTmx = new short[1] ;
      T012A26_n918FindTmx = new boolean[] {false} ;
      T012A27_A279CliNom = new String[] {""} ;
      Z393EmCodVir = "" ;
      ZV16UsurCod = "" ;
      ZV109MaqCodi = "" ;
      ZV118MaqCodold = "" ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ393EmCodVir = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ212BarSer = "" ;
      ZZ135BarColNom = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ182BarMat = "" ;
      ZZ214BarSua = "" ;
      ZZ602MaqCod = "" ;
      ZZ2806RecFA = DecimalUtil.ZERO ;
      ZZ4402RecUsrCod = "" ;
      ZZ4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      ZZ5110RecNumPrg = "" ;
      ZZ5115RecAbsFac = DecimalUtil.ZERO ;
      ZZ6269RecPrg2 = "" ;
      ZZ6270RecPrg3 = "" ;
      ZZ7771RecMaqCla = "" ;
      ZZ8353RecMaqObs = "" ;
      ZZ4259RecTotKgs = DecimalUtil.ZERO ;
      ZZV16UsurCod = "" ;
      ZZV109MaqCodi = "" ;
      ZZV118MaqCodold = "" ;
      ZO602MaqCod = "" ;
      T012A9_A478FindVolMax = new int[1] ;
      T012A9_n478FindVolMax = new boolean[] {false} ;
      T012A9_A480FindVolMin = new int[1] ;
      T012A9_n480FindVolMin = new boolean[] {false} ;
      GXv_char15 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int16 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trec1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trec1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trec1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trec1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trec1__default(),
         new Object[] {
             new Object[] {
            T012A2_A8353RecMaqObs, T012A2_A2804RecLinMaq, T012A2_A2805RecVolPrd, T012A2_A2806RecFA, T012A2_A1272UltLinPro, T012A2_A4402RecUsrCod, T012A2_A4574RecFecPes, T012A2_A4575RecMaqPes, T012A2_A5109RecNumInt, T012A2_A5110RecNumPrg,
            T012A2_A5111RecBp12, T012A2_A5112RecBp13, T012A2_A5113RecBp14, T012A2_A5114RecBp15, T012A2_A5115RecAbsFac, T012A2_A4701RecRecep, T012A2_A4700RecEnvio, T012A2_A6269RecPrg2, T012A2_A6270RecPrg3, T012A2_A7764RecMaqNh,
            T012A2_A7765RecMaqVX, T012A2_A7766RecMaqBL, T012A2_A7767RecMaqFlow, T012A2_A7768RecMaqRPM, T012A2_A7769RecMaqMol, T012A2_A7770RecMaqTor, T012A2_A7771RecMaqCla, T012A2_A7772RecMaqTej, T012A2_A7773RecMaqDel, T012A2_A7774RecMaqPML,
            T012A2_A4259RecTotKgs, T012A2_A396EmprCod, T012A2_A602MaqCod, T012A2_A129BarCod, T012A2_A132BarCodReo, T012A2_A130BarCodPar
            }
            , new Object[] {
            T012A3_A8353RecMaqObs, T012A3_A2804RecLinMaq, T012A3_A2805RecVolPrd, T012A3_A2806RecFA, T012A3_A1272UltLinPro, T012A3_A4402RecUsrCod, T012A3_A4574RecFecPes, T012A3_A4575RecMaqPes, T012A3_A5109RecNumInt, T012A3_A5110RecNumPrg,
            T012A3_A5111RecBp12, T012A3_A5112RecBp13, T012A3_A5113RecBp14, T012A3_A5114RecBp15, T012A3_A5115RecAbsFac, T012A3_A4701RecRecep, T012A3_A4700RecEnvio, T012A3_A6269RecPrg2, T012A3_A6270RecPrg3, T012A3_A7764RecMaqNh,
            T012A3_A7765RecMaqVX, T012A3_A7766RecMaqBL, T012A3_A7767RecMaqFlow, T012A3_A7768RecMaqRPM, T012A3_A7769RecMaqMol, T012A3_A7770RecMaqTor, T012A3_A7771RecMaqCla, T012A3_A7772RecMaqTej, T012A3_A7773RecMaqDel, T012A3_A7774RecMaqPML,
            T012A3_A4259RecTotKgs, T012A3_A396EmprCod, T012A3_A602MaqCod, T012A3_A129BarCod, T012A3_A132BarCodReo, T012A3_A130BarCodPar
            }
            , new Object[] {
            T012A4_A407EmprNom, T012A4_n407EmprNom
            }
            , new Object[] {
            T012A5_A623MaqVolMax, T012A5_n623MaqVolMax, T012A5_A625MaqVolMin, T012A5_n625MaqVolMin, T012A5_A624MaqVolMed, T012A5_n624MaqVolMed, T012A5_A618MaqTemMax, T012A5_n618MaqTemMax
            }
            , new Object[] {
            T012A6_A2759BarMaqGru, T012A6_A212BarSer, T012A6_A135BarColNom, T012A6_A136BarColNum, T012A6_A218BarTipCol, T012A6_A180BarMaqCod, T012A6_A182BarMat, T012A6_A214BarSua, T012A6_A236BarVolMaq, T012A6_A189BarNumAny,
            T012A6_A213BarSit, T012A6_A2803UltLinMaq, T012A6_n2803UltLinMaq, T012A6_A148BarEstReo, T012A6_A252CliCod, T012A6_n252CliCod
            }
            , new Object[] {
            T012A7_A279CliNom
            }
            , new Object[] {
            T012A8_A918FindTmx, T012A8_n918FindTmx
            }
            , new Object[] {
            T012A9_A478FindVolMax, T012A9_n478FindVolMax, T012A9_A480FindVolMin, T012A9_n480FindVolMin
            }
            , new Object[] {
            T012A10_A8353RecMaqObs, T012A10_A764ProForCod, T012A10_A2759BarMaqGru, T012A10_A2804RecLinMaq, T012A10_A2805RecVolPrd, T012A10_A407EmprNom, T012A10_n407EmprNom, T012A10_A279CliNom, T012A10_A212BarSer, T012A10_A135BarColNom,
            T012A10_A136BarColNum, T012A10_A218BarTipCol, T012A10_A180BarMaqCod, T012A10_A182BarMat, T012A10_A214BarSua, T012A10_A236BarVolMaq, T012A10_A189BarNumAny, T012A10_A213BarSit, T012A10_A2803UltLinMaq, T012A10_n2803UltLinMaq,
            T012A10_A148BarEstReo, T012A10_A2806RecFA, T012A10_A1272UltLinPro, T012A10_A623MaqVolMax, T012A10_n623MaqVolMax, T012A10_A625MaqVolMin, T012A10_n625MaqVolMin, T012A10_A624MaqVolMed, T012A10_n624MaqVolMed, T012A10_A618MaqTemMax,
            T012A10_n618MaqTemMax, T012A10_A4402RecUsrCod, T012A10_A4574RecFecPes, T012A10_A4575RecMaqPes, T012A10_A5109RecNumInt, T012A10_A5110RecNumPrg, T012A10_A5111RecBp12, T012A10_A5112RecBp13, T012A10_A5113RecBp14, T012A10_A5114RecBp15,
            T012A10_A5115RecAbsFac, T012A10_A4701RecRecep, T012A10_A4700RecEnvio, T012A10_A6269RecPrg2, T012A10_A6270RecPrg3, T012A10_A7764RecMaqNh, T012A10_A7765RecMaqVX, T012A10_A7766RecMaqBL, T012A10_A7767RecMaqFlow, T012A10_A7768RecMaqRPM,
            T012A10_A7769RecMaqMol, T012A10_A7770RecMaqTor, T012A10_A7771RecMaqCla, T012A10_A7772RecMaqTej, T012A10_A7773RecMaqDel, T012A10_A7774RecMaqPML, T012A10_A4259RecTotKgs, T012A10_A396EmprCod, T012A10_A602MaqCod, T012A10_A129BarCod,
            T012A10_A132BarCodReo, T012A10_A130BarCodPar, T012A10_A252CliCod, T012A10_n252CliCod, T012A10_A918FindTmx, T012A10_n918FindTmx
            }
            , new Object[] {
            T012A11_A623MaqVolMax, T012A11_n623MaqVolMax, T012A11_A625MaqVolMin, T012A11_n625MaqVolMin, T012A11_A624MaqVolMed, T012A11_n624MaqVolMed, T012A11_A618MaqTemMax, T012A11_n618MaqTemMax
            }
            , new Object[] {
            T012A12_A396EmprCod, T012A12_A129BarCod, T012A12_A132BarCodReo, T012A12_A130BarCodPar, T012A12_A2804RecLinMaq
            }
            , new Object[] {
            T012A13_A2804RecLinMaq, T012A13_A396EmprCod, T012A13_A129BarCod, T012A13_A132BarCodReo, T012A13_A130BarCodPar
            }
            , new Object[] {
            T012A14_A2804RecLinMaq, T012A14_A396EmprCod, T012A14_A129BarCod, T012A14_A132BarCodReo, T012A14_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012A18_A623MaqVolMax, T012A18_n623MaqVolMax, T012A18_A625MaqVolMin, T012A18_n625MaqVolMin, T012A18_A624MaqVolMed, T012A18_n624MaqVolMed, T012A18_A618MaqTemMax, T012A18_n618MaqTemMax
            }
            , new Object[] {
            T012A19_A396EmprCod, T012A19_A129BarCod, T012A19_A132BarCodReo, T012A19_A130BarCodPar, T012A19_A2804RecLinMaq, T012A19_A5408RecLinCol
            }
            , new Object[] {
            T012A20_A396EmprCod, T012A20_A129BarCod, T012A20_A132BarCodReo, T012A20_A130BarCodPar, T012A20_A2804RecLinMaq, T012A20_A5257RecLinObs
            }
            , new Object[] {
            T012A21_A396EmprCod, T012A21_A129BarCod, T012A21_A132BarCodReo, T012A21_A130BarCodPar, T012A21_A2804RecLinMaq, T012A21_A4274RecBarCAg, T012A21_A4275RecBarRAg, T012A21_A4276RecBarPAg, T012A21_A4698RecBarNPd, T012A21_A4699RecBarOrd
            }
            , new Object[] {
            T012A22_A396EmprCod, T012A22_A129BarCod, T012A22_A132BarCodReo, T012A22_A130BarCodPar, T012A22_A2804RecLinMaq, T012A22_A1273RecLinPro
            }
            , new Object[] {
            T012A23_A396EmprCod, T012A23_A129BarCod, T012A23_A132BarCodReo, T012A23_A130BarCodPar, T012A23_A2804RecLinMaq
            }
            , new Object[] {
            T012A24_A407EmprNom, T012A24_n407EmprNom
            }
            , new Object[] {
            T012A25_A2759BarMaqGru, T012A25_A212BarSer, T012A25_A135BarColNom, T012A25_A136BarColNum, T012A25_A218BarTipCol, T012A25_A180BarMaqCod, T012A25_A182BarMat, T012A25_A214BarSua, T012A25_A236BarVolMaq, T012A25_A189BarNumAny,
            T012A25_A213BarSit, T012A25_A2803UltLinMaq, T012A25_n2803UltLinMaq, T012A25_A148BarEstReo, T012A25_A252CliCod, T012A25_n252CliCod
            }
            , new Object[] {
            T012A26_A918FindTmx, T012A26_n918FindTmx
            }
            , new Object[] {
            T012A27_A279CliNom
            }
         }
      );
      Z2804RecLinMaq = (short)(0) ;
      A2804RecLinMaq = (short)(0) ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV142Pgmname = "TREC1" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z1272UltLinPro ;
   private byte Z4575RecMaqPes ;
   private byte Z4701RecRecep ;
   private byte Z4700RecEnvio ;
   private byte Z7765RecMaqVX ;
   private byte Z7766RecMaqBL ;
   private byte Z7767RecMaqFlow ;
   private byte Z7772RecMaqTej ;
   private byte Z7773RecMaqDel ;
   private byte GxWebError ;
   private byte AV121ExiMac ;
   private byte A132BarCodReo ;
   private byte AV123VolPProc ;
   private byte nKeyPressed ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A1272UltLinPro ;
   private byte A4575RecMaqPes ;
   private byte A4701RecRecep ;
   private byte A4700RecEnvio ;
   private byte A7765RecMaqVX ;
   private byte A7766RecMaqBL ;
   private byte A7767RecMaqFlow ;
   private byte A7772RecMaqTej ;
   private byte A7773RecMaqDel ;
   private byte AV108Kohler ;
   private byte AV119Staack ;
   private byte AV104ActDos ;
   private byte AV30Flag ;
   private byte AV29FlagPro ;
   private byte AV61Dosif ;
   private byte AV63FlagCor ;
   private byte AV65FlagH ;
   private byte AV70FlagRP ;
   private byte AV71FlagGv ;
   private byte AV74FlagSal ;
   private byte AV79JMolto ;
   private byte AV76vFlagETAL ;
   private byte AV78FlagBros ;
   private byte AV60Copias ;
   private byte AV77flaghss ;
   private byte AV80Flag3d9 ;
   private byte AV81FlagSalt ;
   private byte AV82FlagMab ;
   private byte AV83FlagFil ;
   private byte AV86FlagTtx ;
   private byte AV87FlagRib ;
   private byte AV88FlagBar ;
   private byte AV89Centra ;
   private byte AV93Aeuropeos ;
   private byte AV94RecHMat ;
   private byte AV95JBP ;
   private byte AV96Pervaf ;
   private byte AV97ObsPrf ;
   private byte AV98Marpei ;
   private byte AV100FlagStdp ;
   private byte AV101F_obsrec ;
   private byte AV105Planing ;
   private byte AV110KohlerA ;
   private byte AV112Ricoltex ;
   private byte AV116Jpf ;
   private byte AV117carvema ;
   private byte AV122Eliot ;
   private byte AV129FlagRenNro ;
   private byte AV135Exipass000 ;
   private byte AV136sedoEdtx ;
   private byte AV137sedoB ;
   private byte AV138orgatex ;
   private byte AV140Carvitin ;
   private byte GXt_int7 ;
   private byte GXv_int12[] ;
   private byte GXv_int5[] ;
   private byte Z218BarTipCol ;
   private byte Z213BarSit ;
   private byte Z148BarEstReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZV121ExiMac ;
   private byte ZZ132BarCodReo ;
   private byte ZZ218BarTipCol ;
   private byte ZZ213BarSit ;
   private byte ZZ148BarEstReo ;
   private byte ZZ1272UltLinPro ;
   private byte ZZ4575RecMaqPes ;
   private byte ZZ4701RecRecep ;
   private byte ZZ4700RecEnvio ;
   private byte ZZ7765RecMaqVX ;
   private byte ZZ7766RecMaqBL ;
   private byte ZZ7767RecMaqFlow ;
   private byte ZZ7772RecMaqTej ;
   private byte ZZ7773RecMaqDel ;
   private byte ZZV121ExiMac ;
   private byte GXv_int16[] ;
   private short wcpOA2804RecLinMaq ;
   private short Z2804RecLinMaq ;
   private short Z5111RecBp12 ;
   private short Z5112RecBp13 ;
   private short Z5113RecBp14 ;
   private short Z5114RecBp15 ;
   private short Z7764RecMaqNh ;
   private short Z7768RecMaqRPM ;
   private short Z7769RecMaqMol ;
   private short Z7770RecMaqTor ;
   private short Z7774RecMaqPML ;
   private short A2804RecLinMaq ;
   private short A618MaqTemMax ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A189BarNumAny ;
   private short A918FindTmx ;
   private short A2803UltLinMaq ;
   private short A5111RecBp12 ;
   private short A5112RecBp13 ;
   private short A5113RecBp14 ;
   private short A5114RecBp15 ;
   private short A7764RecMaqNh ;
   private short A7768RecMaqRPM ;
   private short A7769RecMaqMol ;
   private short A7770RecMaqTor ;
   private short A7774RecMaqPML ;
   private short AV31RelBany ;
   private short GXv_int11[] ;
   private short AV132Nveces ;
   private short Z189BarNumAny ;
   private short Z2803UltLinMaq ;
   private short Z918FindTmx ;
   private short Z618MaqTemMax ;
   private short RcdFound408 ;
   private short nIsDirty_408 ;
   private short GXv_int17[] ;
   private short ZV31RelBany ;
   private short ZZ2804RecLinMaq ;
   private short ZZ918FindTmx ;
   private short ZZ189BarNumAny ;
   private short ZZ2803UltLinMaq ;
   private short ZZ5111RecBp12 ;
   private short ZZ5112RecBp13 ;
   private short ZZ5113RecBp14 ;
   private short ZZ5114RecBp15 ;
   private short ZZ7764RecMaqNh ;
   private short ZZ7768RecMaqRPM ;
   private short ZZ7769RecMaqMol ;
   private short ZZ7770RecMaqTor ;
   private short ZZ7774RecMaqPML ;
   private short ZZ618MaqTemMax ;
   private short ZZV31RelBany ;
   private int wcpOA129BarCod ;
   private int wcpOAV128rectotpie ;
   private int Z129BarCod ;
   private int Z2805RecVolPrd ;
   private int Z5109RecNumInt ;
   private int O2805RecVolPrd ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int AV128rectotpie ;
   private int A625MaqVolMin ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtBarMaqCod_Enabled ;
   private int edtBarMat_Enabled ;
   private int edtBarSua_Enabled ;
   private int A236BarVolMaq ;
   private int edtBarVolMaq_Enabled ;
   private int edtBarNumAny_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtEmCodVir_Enabled ;
   private int edtFindTmx_Enabled ;
   private int A480FindVolMin ;
   private int edtFindVolMin_Enabled ;
   private int A478FindVolMax ;
   private int edtFindVolMax_Enabled ;
   private int edtUltLinMaq_Enabled ;
   private int A8644RecVolMx ;
   private int edtRecVolMx_Enabled ;
   private int A8645RecVolMn ;
   private int edtRecVolMn_Enabled ;
   private int A8646RecVolMd ;
   private int edtRecVolMd_Enabled ;
   private int edtRecLinMaq_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtRecVolPrd_Enabled ;
   private int edtRecFA_Enabled ;
   private int edtUltLinPro_Enabled ;
   private int A623MaqVolMax ;
   private int edtMaqVolMax_Enabled ;
   private int edtMaqVolMin_Enabled ;
   private int A624MaqVolMed ;
   private int edtMaqVolMed_Enabled ;
   private int edtMaqTemMax_Enabled ;
   private int edtRecUsrCod_Enabled ;
   private int edtRecFecPes_Enabled ;
   private int edtRecMaqPes_Enabled ;
   private int A5109RecNumInt ;
   private int edtRecNumInt_Enabled ;
   private int edtRecNumPrg_Enabled ;
   private int edtRecBp12_Enabled ;
   private int edtRecBp13_Enabled ;
   private int edtRecBp14_Enabled ;
   private int edtRecBp15_Enabled ;
   private int edtRecAbsFac_Enabled ;
   private int edtRecRecep_Enabled ;
   private int edtRecEnvio_Enabled ;
   private int edtRecPrg2_Enabled ;
   private int edtRecPrg3_Enabled ;
   private int edtRecMaqNh_Enabled ;
   private int edtRecMaqVX_Enabled ;
   private int edtRecMaqBL_Enabled ;
   private int edtRecMaqFlow_Enabled ;
   private int edtRecMaqRPM_Enabled ;
   private int edtRecMaqMol_Enabled ;
   private int edtRecMaqTor_Enabled ;
   private int edtRecMaqCla_Enabled ;
   private int edtRecMaqTej_Enabled ;
   private int edtRecMaqDel_Enabled ;
   private int edtRecMaqPML_Enabled ;
   private int edtRecMaqObs_Enabled ;
   private int edtRecTotKgs_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV133pass000 ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z236BarVolMaq ;
   private int Z252CliCod ;
   private int Z623MaqVolMax ;
   private int Z625MaqVolMin ;
   private int Z624MaqVolMed ;
   private int idxLst ;
   private int edtRecTotKgs_Backcolor ;
   private int edtRecMaqObs_Backcolor ;
   private int edtRecMaqPML_Backcolor ;
   private int edtRecMaqDel_Backcolor ;
   private int edtRecMaqTej_Backcolor ;
   private int edtRecMaqCla_Backcolor ;
   private int edtRecMaqTor_Backcolor ;
   private int edtRecMaqMol_Backcolor ;
   private int edtRecMaqRPM_Backcolor ;
   private int edtRecMaqFlow_Backcolor ;
   private int edtRecMaqBL_Backcolor ;
   private int edtRecMaqVX_Backcolor ;
   private int edtRecMaqNh_Backcolor ;
   private int edtRecPrg3_Backcolor ;
   private int edtRecPrg2_Backcolor ;
   private int edtRecEnvio_Backcolor ;
   private int edtRecRecep_Backcolor ;
   private int edtRecAbsFac_Backcolor ;
   private int edtRecBp15_Backcolor ;
   private int edtRecBp14_Backcolor ;
   private int edtRecBp13_Backcolor ;
   private int edtRecBp12_Backcolor ;
   private int edtRecNumPrg_Backcolor ;
   private int edtRecNumInt_Backcolor ;
   private int edtRecMaqPes_Backcolor ;
   private int edtRecFecPes_Backcolor ;
   private int edtRecUsrCod_Backcolor ;
   private int edtMaqTemMax_Backcolor ;
   private int edtMaqVolMed_Backcolor ;
   private int edtMaqVolMin_Backcolor ;
   private int edtMaqVolMax_Backcolor ;
   private int edtUltLinPro_Backcolor ;
   private int edtRecFA_Backcolor ;
   private int edtRecVolPrd_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtRecLinMaq_Backcolor ;
   private int edtRecVolMd_Backcolor ;
   private int edtRecVolMn_Backcolor ;
   private int edtRecVolMx_Backcolor ;
   private int edtUltLinMaq_Backcolor ;
   private int edtFindVolMax_Backcolor ;
   private int edtFindVolMin_Backcolor ;
   private int edtFindTmx_Backcolor ;
   private int edtEmCodVir_Backcolor ;
   private int edtBarSit_Backcolor ;
   private int edtBarNumAny_Backcolor ;
   private int edtBarVolMaq_Backcolor ;
   private int edtBarSua_Backcolor ;
   private int edtBarMat_Backcolor ;
   private int edtBarMaqCod_Backcolor ;
   private int edtBarTipCol_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXt_int8 ;
   private int GXv_int22[] ;
   private int GXv_int21[] ;
   private int GXv_int20[] ;
   private int GXv_int10[] ;
   private int GXv_int6[] ;
   private int Z478FindVolMax ;
   private int Z480FindVolMin ;
   private int Z8644RecVolMx ;
   private int Z8645RecVolMn ;
   private int Z8646RecVolMd ;
   private int ZZ129BarCod ;
   private int ZZ478FindVolMax ;
   private int ZZ480FindVolMin ;
   private int ZZ8644RecVolMx ;
   private int ZZ8645RecVolMn ;
   private int ZZ8646RecVolMd ;
   private int ZZ252CliCod ;
   private int ZZ136BarColNum ;
   private int ZZ236BarVolMaq ;
   private int ZZ5109RecNumInt ;
   private int ZZ623MaqVolMax ;
   private int ZZ625MaqVolMin ;
   private int ZZ624MaqVolMed ;
   private int ZZ2805RecVolPrd ;
   private int ZO2805RecVolPrd ;
   private java.math.BigDecimal wcpOAV126rectotkgm ;
   private java.math.BigDecimal wcpOAV127rectotmtr ;
   private java.math.BigDecimal Z2806RecFA ;
   private java.math.BigDecimal Z5115RecAbsFac ;
   private java.math.BigDecimal Z4259RecTotKgs ;
   private java.math.BigDecimal AV126rectotkgm ;
   private java.math.BigDecimal AV127rectotmtr ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal ZZ2806RecFA ;
   private java.math.BigDecimal ZZ5115RecAbsFac ;
   private java.math.BigDecimal ZZ4259RecTotKgs ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOAV16UsurCod ;
   private String wcpOAV139Modo ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z4402RecUsrCod ;
   private String Z5110RecNumPrg ;
   private String Z6269RecPrg2 ;
   private String Z6270RecPrg3 ;
   private String Z7771RecMaqCla ;
   private String Z602MaqCod ;
   private String O602MaqCod ;
   private String N602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A5110RecNumPrg ;
   private String A130BarCodPar ;
   private String AV118MaqCodold ;
   private String A602MaqCod ;
   private String AV16UsurCod ;
   private String AV125Msg_v ;
   private String AV139Modo ;
   private String A180BarMaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqCod_Internalname ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
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
   private String tblTable2_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarMaqCod_Internalname ;
   private String edtBarMaqCod_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarMat_Internalname ;
   private String A182BarMat ;
   private String edtBarMat_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarSua_Internalname ;
   private String A214BarSua ;
   private String edtBarSua_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarVolMaq_Internalname ;
   private String edtBarVolMaq_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBarNumAny_Internalname ;
   private String edtBarNumAny_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtEmCodVir_Internalname ;
   private String A393EmCodVir ;
   private String edtEmCodVir_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtFindTmx_Internalname ;
   private String edtFindTmx_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtFindVolMin_Internalname ;
   private String edtFindVolMin_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtFindVolMax_Internalname ;
   private String edtFindVolMax_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtUltLinMaq_Internalname ;
   private String edtUltLinMaq_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtRecVolMx_Internalname ;
   private String edtRecVolMx_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtRecVolMn_Internalname ;
   private String edtRecVolMn_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtRecVolMd_Internalname ;
   private String edtRecVolMd_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinMaq_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtRecVolPrd_Internalname ;
   private String edtRecVolPrd_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtRecFA_Internalname ;
   private String edtRecFA_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtUltLinPro_Internalname ;
   private String edtUltLinPro_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtMaqVolMax_Internalname ;
   private String edtMaqVolMax_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtMaqVolMin_Internalname ;
   private String edtMaqVolMin_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtMaqVolMed_Internalname ;
   private String edtMaqVolMed_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtMaqTemMax_Internalname ;
   private String edtMaqTemMax_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtRecUsrCod_Internalname ;
   private String A4402RecUsrCod ;
   private String edtRecUsrCod_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtRecFecPes_Internalname ;
   private String edtRecFecPes_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtRecMaqPes_Internalname ;
   private String edtRecMaqPes_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtRecNumInt_Internalname ;
   private String edtRecNumInt_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtRecNumPrg_Internalname ;
   private String edtRecNumPrg_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtRecBp12_Internalname ;
   private String edtRecBp12_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtRecBp13_Internalname ;
   private String edtRecBp13_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtRecBp14_Internalname ;
   private String edtRecBp14_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtRecBp15_Internalname ;
   private String edtRecBp15_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtRecAbsFac_Internalname ;
   private String edtRecAbsFac_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtRecRecep_Internalname ;
   private String edtRecRecep_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtRecEnvio_Internalname ;
   private String edtRecEnvio_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtRecPrg2_Internalname ;
   private String A6269RecPrg2 ;
   private String edtRecPrg2_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtRecPrg3_Internalname ;
   private String A6270RecPrg3 ;
   private String edtRecPrg3_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtRecMaqNh_Internalname ;
   private String edtRecMaqNh_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtRecMaqVX_Internalname ;
   private String edtRecMaqVX_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtRecMaqBL_Internalname ;
   private String edtRecMaqBL_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtRecMaqFlow_Internalname ;
   private String edtRecMaqFlow_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtRecMaqRPM_Internalname ;
   private String edtRecMaqRPM_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtRecMaqMol_Internalname ;
   private String edtRecMaqMol_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtRecMaqTor_Internalname ;
   private String edtRecMaqTor_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtRecMaqCla_Internalname ;
   private String A7771RecMaqCla ;
   private String edtRecMaqCla_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtRecMaqTej_Internalname ;
   private String edtRecMaqTej_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtRecMaqDel_Internalname ;
   private String edtRecMaqDel_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtRecMaqPML_Internalname ;
   private String edtRecMaqPML_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtRecMaqObs_Internalname ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtRecTotKgs_Internalname ;
   private String edtRecTotKgs_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_check_Internalname ;
   private String bttBtn_check_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String bttBtn_help_Internalname ;
   private String bttBtn_help_Jsonclick ;
   private String Gx_mode ;
   private String AV109MaqCodi ;
   private String A2759BarMaqGru ;
   private String AV142Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV38Lit0 ;
   private String AV39Lit1 ;
   private String AV40Lit2 ;
   private String AV41Lit3 ;
   private String AV42Lit4 ;
   private String AV43Lit5 ;
   private String AV44Lit6 ;
   private String AV45Lit7 ;
   private String AV46Lit8 ;
   private String AV47Lit9 ;
   private String AV48Lit10 ;
   private String AV49Lit11 ;
   private String AV50Lit12 ;
   private String AV51Lit13 ;
   private String AV52Lit14 ;
   private String AV53Lit20 ;
   private String AV54Lit21 ;
   private String AV55Lit22 ;
   private String AV67Lit23 ;
   private String AV68Lit24 ;
   private String AV69Lit25 ;
   private String AV75Lit26 ;
   private String AV66LitFe ;
   private String AV56msg0 ;
   private String AV57msg1 ;
   private String AV58msg2 ;
   private String AV59msg3 ;
   private String AV37Station ;
   private String AV18ImpCod ;
   private String AV85Puerto ;
   private String AV36Escape ;
   private String AV32Mod ;
   private String AV99Lit30 ;
   private String AV102Lit31 ;
   private String AV103Lit32 ;
   private String AV107Lit49 ;
   private String AV62Modif ;
   private String AV113Msg4 ;
   private String AV114Msg5 ;
   private String AV115Msg6 ;
   private String GXt_char1 ;
   private String AV120Lit90 ;
   private String AV131Msg_peso ;
   private String AV134OK ;
   private String Gx_msg ;
   private String AV130flagope ;
   private String Z407EmprNom ;
   private String Z2759BarMaqGru ;
   private String Z212BarSer ;
   private String Z135BarColNom ;
   private String Z180BarMaqCod ;
   private String Z182BarMat ;
   private String Z214BarSua ;
   private String Z279CliNom ;
   private String sMode408 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char13[] ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z393EmCodVir ;
   private String ZV16UsurCod ;
   private String ZV109MaqCodi ;
   private String ZV118MaqCodold ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ393EmCodVir ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ212BarSer ;
   private String ZZ135BarColNom ;
   private String ZZ180BarMaqCod ;
   private String ZZ182BarMat ;
   private String ZZ214BarSua ;
   private String ZZ602MaqCod ;
   private String ZZ4402RecUsrCod ;
   private String ZZ5110RecNumPrg ;
   private String ZZ6269RecPrg2 ;
   private String ZZ6270RecPrg3 ;
   private String ZZ7771RecMaqCla ;
   private String ZZV16UsurCod ;
   private String ZZV109MaqCodi ;
   private String ZZV118MaqCodold ;
   private String ZO602MaqCod ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private java.util.Date Z4574RecFecPes ;
   private java.util.Date A4574RecFecPes ;
   private java.util.Date ZZ4574RecFecPes ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n618MaqTemMax ;
   private boolean n625MaqVolMin ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean n918FindTmx ;
   private boolean n480FindVolMin ;
   private boolean n478FindVolMax ;
   private boolean n2803UltLinMaq ;
   private boolean n623MaqVolMax ;
   private boolean n624MaqVolMed ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A8353RecMaqObs ;
   private String AV111Texto_i ;
   private String Z8353RecMaqObs ;
   private String ZZ8353RecMaqObs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbBarEstReo ;
   private IDataStoreProvider pr_default ;
   private String[] T012A4_A407EmprNom ;
   private boolean[] T012A4_n407EmprNom ;
   private String[] T012A6_A2759BarMaqGru ;
   private String[] T012A6_A212BarSer ;
   private String[] T012A6_A135BarColNom ;
   private int[] T012A6_A136BarColNum ;
   private byte[] T012A6_A218BarTipCol ;
   private String[] T012A6_A180BarMaqCod ;
   private String[] T012A6_A182BarMat ;
   private String[] T012A6_A214BarSua ;
   private int[] T012A6_A236BarVolMaq ;
   private short[] T012A6_A189BarNumAny ;
   private byte[] T012A6_A213BarSit ;
   private short[] T012A6_A2803UltLinMaq ;
   private boolean[] T012A6_n2803UltLinMaq ;
   private byte[] T012A6_A148BarEstReo ;
   private int[] T012A6_A252CliCod ;
   private boolean[] T012A6_n252CliCod ;
   private short[] T012A8_A918FindTmx ;
   private boolean[] T012A8_n918FindTmx ;
   private String[] T012A7_A279CliNom ;
   private String[] T012A10_A8353RecMaqObs ;
   private String[] T012A10_A764ProForCod ;
   private String[] T012A10_A2759BarMaqGru ;
   private short[] T012A10_A2804RecLinMaq ;
   private int[] T012A10_A2805RecVolPrd ;
   private String[] T012A10_A407EmprNom ;
   private boolean[] T012A10_n407EmprNom ;
   private String[] T012A10_A279CliNom ;
   private String[] T012A10_A212BarSer ;
   private String[] T012A10_A135BarColNom ;
   private int[] T012A10_A136BarColNum ;
   private byte[] T012A10_A218BarTipCol ;
   private String[] T012A10_A180BarMaqCod ;
   private String[] T012A10_A182BarMat ;
   private String[] T012A10_A214BarSua ;
   private int[] T012A10_A236BarVolMaq ;
   private short[] T012A10_A189BarNumAny ;
   private byte[] T012A10_A213BarSit ;
   private short[] T012A10_A2803UltLinMaq ;
   private boolean[] T012A10_n2803UltLinMaq ;
   private byte[] T012A10_A148BarEstReo ;
   private java.math.BigDecimal[] T012A10_A2806RecFA ;
   private byte[] T012A10_A1272UltLinPro ;
   private int[] T012A10_A623MaqVolMax ;
   private boolean[] T012A10_n623MaqVolMax ;
   private int[] T012A10_A625MaqVolMin ;
   private boolean[] T012A10_n625MaqVolMin ;
   private int[] T012A10_A624MaqVolMed ;
   private boolean[] T012A10_n624MaqVolMed ;
   private short[] T012A10_A618MaqTemMax ;
   private boolean[] T012A10_n618MaqTemMax ;
   private String[] T012A10_A4402RecUsrCod ;
   private java.util.Date[] T012A10_A4574RecFecPes ;
   private byte[] T012A10_A4575RecMaqPes ;
   private int[] T012A10_A5109RecNumInt ;
   private String[] T012A10_A5110RecNumPrg ;
   private short[] T012A10_A5111RecBp12 ;
   private short[] T012A10_A5112RecBp13 ;
   private short[] T012A10_A5113RecBp14 ;
   private short[] T012A10_A5114RecBp15 ;
   private java.math.BigDecimal[] T012A10_A5115RecAbsFac ;
   private byte[] T012A10_A4701RecRecep ;
   private byte[] T012A10_A4700RecEnvio ;
   private String[] T012A10_A6269RecPrg2 ;
   private String[] T012A10_A6270RecPrg3 ;
   private short[] T012A10_A7764RecMaqNh ;
   private byte[] T012A10_A7765RecMaqVX ;
   private byte[] T012A10_A7766RecMaqBL ;
   private byte[] T012A10_A7767RecMaqFlow ;
   private short[] T012A10_A7768RecMaqRPM ;
   private short[] T012A10_A7769RecMaqMol ;
   private short[] T012A10_A7770RecMaqTor ;
   private String[] T012A10_A7771RecMaqCla ;
   private byte[] T012A10_A7772RecMaqTej ;
   private byte[] T012A10_A7773RecMaqDel ;
   private short[] T012A10_A7774RecMaqPML ;
   private java.math.BigDecimal[] T012A10_A4259RecTotKgs ;
   private String[] T012A10_A396EmprCod ;
   private String[] T012A10_A602MaqCod ;
   private int[] T012A10_A129BarCod ;
   private byte[] T012A10_A132BarCodReo ;
   private String[] T012A10_A130BarCodPar ;
   private int[] T012A10_A252CliCod ;
   private boolean[] T012A10_n252CliCod ;
   private short[] T012A10_A918FindTmx ;
   private boolean[] T012A10_n918FindTmx ;
   private int[] T012A5_A623MaqVolMax ;
   private boolean[] T012A5_n623MaqVolMax ;
   private int[] T012A5_A625MaqVolMin ;
   private boolean[] T012A5_n625MaqVolMin ;
   private int[] T012A5_A624MaqVolMed ;
   private boolean[] T012A5_n624MaqVolMed ;
   private short[] T012A5_A618MaqTemMax ;
   private boolean[] T012A5_n618MaqTemMax ;
   private int[] T012A11_A623MaqVolMax ;
   private boolean[] T012A11_n623MaqVolMax ;
   private int[] T012A11_A625MaqVolMin ;
   private boolean[] T012A11_n625MaqVolMin ;
   private int[] T012A11_A624MaqVolMed ;
   private boolean[] T012A11_n624MaqVolMed ;
   private short[] T012A11_A618MaqTemMax ;
   private boolean[] T012A11_n618MaqTemMax ;
   private String[] T012A12_A396EmprCod ;
   private int[] T012A12_A129BarCod ;
   private byte[] T012A12_A132BarCodReo ;
   private String[] T012A12_A130BarCodPar ;
   private short[] T012A12_A2804RecLinMaq ;
   private String[] T012A3_A8353RecMaqObs ;
   private short[] T012A3_A2804RecLinMaq ;
   private int[] T012A3_A2805RecVolPrd ;
   private java.math.BigDecimal[] T012A3_A2806RecFA ;
   private byte[] T012A3_A1272UltLinPro ;
   private String[] T012A3_A4402RecUsrCod ;
   private java.util.Date[] T012A3_A4574RecFecPes ;
   private byte[] T012A3_A4575RecMaqPes ;
   private int[] T012A3_A5109RecNumInt ;
   private String[] T012A3_A5110RecNumPrg ;
   private short[] T012A3_A5111RecBp12 ;
   private short[] T012A3_A5112RecBp13 ;
   private short[] T012A3_A5113RecBp14 ;
   private short[] T012A3_A5114RecBp15 ;
   private java.math.BigDecimal[] T012A3_A5115RecAbsFac ;
   private byte[] T012A3_A4701RecRecep ;
   private byte[] T012A3_A4700RecEnvio ;
   private String[] T012A3_A6269RecPrg2 ;
   private String[] T012A3_A6270RecPrg3 ;
   private short[] T012A3_A7764RecMaqNh ;
   private byte[] T012A3_A7765RecMaqVX ;
   private byte[] T012A3_A7766RecMaqBL ;
   private byte[] T012A3_A7767RecMaqFlow ;
   private short[] T012A3_A7768RecMaqRPM ;
   private short[] T012A3_A7769RecMaqMol ;
   private short[] T012A3_A7770RecMaqTor ;
   private String[] T012A3_A7771RecMaqCla ;
   private byte[] T012A3_A7772RecMaqTej ;
   private byte[] T012A3_A7773RecMaqDel ;
   private short[] T012A3_A7774RecMaqPML ;
   private java.math.BigDecimal[] T012A3_A4259RecTotKgs ;
   private String[] T012A3_A396EmprCod ;
   private String[] T012A3_A602MaqCod ;
   private int[] T012A3_A129BarCod ;
   private byte[] T012A3_A132BarCodReo ;
   private String[] T012A3_A130BarCodPar ;
   private short[] T012A13_A2804RecLinMaq ;
   private String[] T012A13_A396EmprCod ;
   private int[] T012A13_A129BarCod ;
   private byte[] T012A13_A132BarCodReo ;
   private String[] T012A13_A130BarCodPar ;
   private short[] T012A14_A2804RecLinMaq ;
   private String[] T012A14_A396EmprCod ;
   private int[] T012A14_A129BarCod ;
   private byte[] T012A14_A132BarCodReo ;
   private String[] T012A14_A130BarCodPar ;
   private String[] T012A2_A8353RecMaqObs ;
   private short[] T012A2_A2804RecLinMaq ;
   private int[] T012A2_A2805RecVolPrd ;
   private java.math.BigDecimal[] T012A2_A2806RecFA ;
   private byte[] T012A2_A1272UltLinPro ;
   private String[] T012A2_A4402RecUsrCod ;
   private java.util.Date[] T012A2_A4574RecFecPes ;
   private byte[] T012A2_A4575RecMaqPes ;
   private int[] T012A2_A5109RecNumInt ;
   private String[] T012A2_A5110RecNumPrg ;
   private short[] T012A2_A5111RecBp12 ;
   private short[] T012A2_A5112RecBp13 ;
   private short[] T012A2_A5113RecBp14 ;
   private short[] T012A2_A5114RecBp15 ;
   private java.math.BigDecimal[] T012A2_A5115RecAbsFac ;
   private byte[] T012A2_A4701RecRecep ;
   private byte[] T012A2_A4700RecEnvio ;
   private String[] T012A2_A6269RecPrg2 ;
   private String[] T012A2_A6270RecPrg3 ;
   private short[] T012A2_A7764RecMaqNh ;
   private byte[] T012A2_A7765RecMaqVX ;
   private byte[] T012A2_A7766RecMaqBL ;
   private byte[] T012A2_A7767RecMaqFlow ;
   private short[] T012A2_A7768RecMaqRPM ;
   private short[] T012A2_A7769RecMaqMol ;
   private short[] T012A2_A7770RecMaqTor ;
   private String[] T012A2_A7771RecMaqCla ;
   private byte[] T012A2_A7772RecMaqTej ;
   private byte[] T012A2_A7773RecMaqDel ;
   private short[] T012A2_A7774RecMaqPML ;
   private java.math.BigDecimal[] T012A2_A4259RecTotKgs ;
   private String[] T012A2_A396EmprCod ;
   private String[] T012A2_A602MaqCod ;
   private int[] T012A2_A129BarCod ;
   private byte[] T012A2_A132BarCodReo ;
   private String[] T012A2_A130BarCodPar ;
   private int[] T012A18_A623MaqVolMax ;
   private boolean[] T012A18_n623MaqVolMax ;
   private int[] T012A18_A625MaqVolMin ;
   private boolean[] T012A18_n625MaqVolMin ;
   private int[] T012A18_A624MaqVolMed ;
   private boolean[] T012A18_n624MaqVolMed ;
   private short[] T012A18_A618MaqTemMax ;
   private boolean[] T012A18_n618MaqTemMax ;
   private String[] T012A19_A396EmprCod ;
   private int[] T012A19_A129BarCod ;
   private byte[] T012A19_A132BarCodReo ;
   private String[] T012A19_A130BarCodPar ;
   private short[] T012A19_A2804RecLinMaq ;
   private short[] T012A19_A5408RecLinCol ;
   private String[] T012A20_A396EmprCod ;
   private int[] T012A20_A129BarCod ;
   private byte[] T012A20_A132BarCodReo ;
   private String[] T012A20_A130BarCodPar ;
   private short[] T012A20_A2804RecLinMaq ;
   private short[] T012A20_A5257RecLinObs ;
   private String[] T012A21_A396EmprCod ;
   private int[] T012A21_A129BarCod ;
   private byte[] T012A21_A132BarCodReo ;
   private String[] T012A21_A130BarCodPar ;
   private short[] T012A21_A2804RecLinMaq ;
   private int[] T012A21_A4274RecBarCAg ;
   private byte[] T012A21_A4275RecBarRAg ;
   private String[] T012A21_A4276RecBarPAg ;
   private int[] T012A21_A4698RecBarNPd ;
   private short[] T012A21_A4699RecBarOrd ;
   private String[] T012A22_A396EmprCod ;
   private int[] T012A22_A129BarCod ;
   private byte[] T012A22_A132BarCodReo ;
   private String[] T012A22_A130BarCodPar ;
   private short[] T012A22_A2804RecLinMaq ;
   private byte[] T012A22_A1273RecLinPro ;
   private String[] T012A23_A396EmprCod ;
   private int[] T012A23_A129BarCod ;
   private byte[] T012A23_A132BarCodReo ;
   private String[] T012A23_A130BarCodPar ;
   private short[] T012A23_A2804RecLinMaq ;
   private String[] T012A24_A407EmprNom ;
   private boolean[] T012A24_n407EmprNom ;
   private String[] T012A25_A2759BarMaqGru ;
   private String[] T012A25_A212BarSer ;
   private String[] T012A25_A135BarColNom ;
   private int[] T012A25_A136BarColNum ;
   private byte[] T012A25_A218BarTipCol ;
   private String[] T012A25_A180BarMaqCod ;
   private String[] T012A25_A182BarMat ;
   private String[] T012A25_A214BarSua ;
   private int[] T012A25_A236BarVolMaq ;
   private short[] T012A25_A189BarNumAny ;
   private byte[] T012A25_A213BarSit ;
   private short[] T012A25_A2803UltLinMaq ;
   private boolean[] T012A25_n2803UltLinMaq ;
   private byte[] T012A25_A148BarEstReo ;
   private int[] T012A25_A252CliCod ;
   private boolean[] T012A25_n252CliCod ;
   private short[] T012A26_A918FindTmx ;
   private boolean[] T012A26_n918FindTmx ;
   private String[] T012A27_A279CliNom ;
   private int[] T012A9_A478FindVolMax ;
   private boolean[] T012A9_n478FindVolMax ;
   private int[] T012A9_A480FindVolMin ;
   private boolean[] T012A9_n480FindVolMin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trec1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trec1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trec1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trec1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trec1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T012A2", "SELECT RecMaqObs, RecLinMaq, RecVolPrd, RecFA, UltLinPro, RecUsrCod, RecFecPes, RecMaqPes, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecRecep, RecEnvio, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecTotKgs, EmprCod, MaqCod, BarCod, BarCodReo, BarCodPar FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?  FOR UPDATE OF RecVolPrd, RecFA, UltLinPro, RecUsrCod, RecFecPes, RecMaqPes, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecRecep, RecEnvio, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecMaqObs, RecTotKgs, MaqCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A3", "SELECT RecMaqObs, RecLinMaq, RecVolPrd, RecFA, UltLinPro, RecUsrCod, RecFecPes, RecMaqPes, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecRecep, RecEnvio, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecTotKgs, EmprCod, MaqCod, BarCod, BarCodReo, BarCodPar FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A5", "SELECT MaqVolMax, MaqVolMin, MaqVolMed, MaqTemMax FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A6", "SELECT BarMaqGru, BarSer, BarColNom, BarColNum, BarTipCol, BarMaqCod, BarMat, BarSua, BarVolMaq, BarNumAny, BarSit, UltLinMaq, BarEstReo, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A8", "SELECT COALESCE( ProForTmx, 0) AS FindTmx FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A9", "SELECT COALESCE( MaqVolMax, 0) AS FindVolMax, COALESCE( MaqVolMin, 0) AS FindVolMin FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A10", "SELECT /*+ FIRST_ROWS(1) */ TM1.RecMaqObs, T4.ProForCod, T3.BarMaqGru, TM1.RecLinMaq, TM1.RecVolPrd, T2.EmprNom, T5.CliNom, T3.BarSer, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T3.BarMaqCod, T3.BarMat, T3.BarSua, T3.BarVolMaq, T3.BarNumAny, T3.BarSit, T3.UltLinMaq, T3.BarEstReo, TM1.RecFA, TM1.UltLinPro, T6.MaqVolMax, T6.MaqVolMin, T6.MaqVolMed, T6.MaqTemMax, TM1.RecUsrCod, TM1.RecFecPes, TM1.RecMaqPes, TM1.RecNumInt, TM1.RecNumPrg, TM1.RecBp12, TM1.RecBp13, TM1.RecBp14, TM1.RecBp15, TM1.RecAbsFac, TM1.RecRecep, TM1.RecEnvio, TM1.RecPrg2, TM1.RecPrg3, TM1.RecMaqNh, TM1.RecMaqVX, TM1.RecMaqBL, TM1.RecMaqFlow, TM1.RecMaqRPM, TM1.RecMaqMol, TM1.RecMaqTor, TM1.RecMaqCla, TM1.RecMaqTej, TM1.RecMaqDel, TM1.RecMaqPML, TM1.RecTotKgs, TM1.EmprCod, TM1.MaqCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T3.CliCod, COALESCE( T4.ProForTmx, 0) AS FindTmx FROM (((((TXPRECMAQ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProForCod = T3.BarSua) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = T3.CliCod) INNER JOIN TXPMAQUIN T6 ON T6.EmprCod = TM1.EmprCod AND T6.MaqCod = TM1.MaqCod) WHERE TM1.RecLinMaq = ? and TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A11", "SELECT MaqVolMax, MaqVolMin, MaqVolMed, MaqTemMax FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RecLinMaq, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPRECMAQ WHERE RecLinMaq = ? and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RecLinMaq, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPRECMAQ WHERE RecLinMaq = ? and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, RecLinMaq DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T012A15", "INSERT INTO TXPRECMAQ(RecLinMaq, RecVolPrd, RecFA, UltLinPro, RecUsrCod, RecFecPes, RecMaqPes, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecRecep, RecEnvio, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecMaqObs, RecTotKgs, EmprCod, MaqCod, BarCod, BarCodReo, BarCodPar, RecMaqFas, RecTotMts, RecTotPrd, RecBarCod, RecBarReo, RecBarPar, RecOrdLin, RecAgrEst, RecRecLan, RecNroPar, RecFecAlt, RecFecMod, RecUsrMod, RecUltObs, RecUltLCo, RecIntCol, RecMatCol, RecFecPla, RecPriPla, RecAcab, RecPriAca, RecLtsSR, RecLtsDf, RecAbs2, RecHdrLts, RecObsq, Recgrm, RecAnc, Rsedo1, Rsedo2, Rsedo3, Rsedo4, Rsedo5, Rsedo6, RecCAut, RecAva, RecAs, RecAi, Rsedo7, Rsedo8, Rsedo9, Rsedo10, Rsedo11, Rsedo12, Rsedo13, Rsedo14) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPRECMAQ")
         ,new UpdateCursor("T012A16", "UPDATE TXPRECMAQ SET RecVolPrd=?, RecFA=?, UltLinPro=?, RecUsrCod=?, RecFecPes=?, RecMaqPes=?, RecNumInt=?, RecNumPrg=?, RecBp12=?, RecBp13=?, RecBp14=?, RecBp15=?, RecAbsFac=?, RecRecep=?, RecEnvio=?, RecPrg2=?, RecPrg3=?, RecMaqNh=?, RecMaqVX=?, RecMaqBL=?, RecMaqFlow=?, RecMaqRPM=?, RecMaqMol=?, RecMaqTor=?, RecMaqCla=?, RecMaqTej=?, RecMaqDel=?, RecMaqPML=?, RecMaqObs=?, RecTotKgs=?, MaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK, "TXPRECMAQ")
         ,new UpdateCursor("T012A17", "DELETE FROM TXPRECMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK, "TXPRECMAQ")
         ,new ForEachCursor("T012A18", "SELECT MaqVolMax, MaqVolMin, MaqVolMed, MaqTemMax FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs FROM TXPOBSREC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecBarCAg, RecBarRAg, RecBarPAg, RecBarNPd, RecBarOrd FROM TXPRECFAG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE RecLinMaq = ? and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012A24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012A25", "SELECT BarMaqGru, BarSer, BarColNom, BarColNum, BarTipCol, BarMaqCod, BarMat, BarSua, BarVolMaq, BarNumAny, BarSit, UltLinMaq, BarEstReo, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012A26", "SELECT COALESCE( ProForTmx, 0) AS FindTmx FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012A27", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 10);
               ((byte[]) buf[27])[0] = rslt.getByte(28);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((String[]) buf[31])[0] = rslt.getString(32, 3);
               ((String[]) buf[32])[0] = rslt.getString(33, 6);
               ((int[]) buf[33])[0] = rslt.getInt(34);
               ((byte[]) buf[34])[0] = rslt.getByte(35);
               ((String[]) buf[35])[0] = rslt.getString(36, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 10);
               ((byte[]) buf[27])[0] = rslt.getByte(28);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((String[]) buf[31])[0] = rslt.getString(32, 3);
               ((String[]) buf[32])[0] = rslt.getString(33, 6);
               ((int[]) buf[33])[0] = rslt.getInt(34);
               ((byte[]) buf[34])[0] = rslt.getByte(35);
               ((String[]) buf[35])[0] = rslt.getString(36, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getString(14, 6);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(23);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(25);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 8);
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(27);
               ((byte[]) buf[33])[0] = rslt.getByte(28);
               ((int[]) buf[34])[0] = rslt.getInt(29);
               ((String[]) buf[35])[0] = rslt.getString(30, 6);
               ((short[]) buf[36])[0] = rslt.getShort(31);
               ((short[]) buf[37])[0] = rslt.getShort(32);
               ((short[]) buf[38])[0] = rslt.getShort(33);
               ((short[]) buf[39])[0] = rslt.getShort(34);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(35,2);
               ((byte[]) buf[41])[0] = rslt.getByte(36);
               ((byte[]) buf[42])[0] = rslt.getByte(37);
               ((String[]) buf[43])[0] = rslt.getString(38, 6);
               ((String[]) buf[44])[0] = rslt.getString(39, 6);
               ((short[]) buf[45])[0] = rslt.getShort(40);
               ((byte[]) buf[46])[0] = rslt.getByte(41);
               ((byte[]) buf[47])[0] = rslt.getByte(42);
               ((byte[]) buf[48])[0] = rslt.getByte(43);
               ((short[]) buf[49])[0] = rslt.getShort(44);
               ((short[]) buf[50])[0] = rslt.getShort(45);
               ((short[]) buf[51])[0] = rslt.getShort(46);
               ((String[]) buf[52])[0] = rslt.getString(47, 10);
               ((byte[]) buf[53])[0] = rslt.getByte(48);
               ((byte[]) buf[54])[0] = rslt.getByte(49);
               ((short[]) buf[55])[0] = rslt.getShort(50);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(51,2);
               ((String[]) buf[57])[0] = rslt.getString(52, 3);
               ((String[]) buf[58])[0] = rslt.getString(53, 6);
               ((int[]) buf[59])[0] = rslt.getInt(54);
               ((byte[]) buf[60])[0] = rslt.getByte(55);
               ((String[]) buf[61])[0] = rslt.getString(56, 1);
               ((int[]) buf[62])[0] = rslt.getInt(57);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(58);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 24 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 6);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 6);
               stmt.setString(18, (String)parms[17], 6);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setShort(24, ((Number) parms[23]).shortValue());
               stmt.setShort(25, ((Number) parms[24]).shortValue());
               stmt.setString(26, (String)parms[25], 10);
               stmt.setByte(27, ((Number) parms[26]).byteValue());
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setLongVarchar(30, (String)parms[29], false);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setString(32, (String)parms[31], 3);
               stmt.setString(33, (String)parms[32], 6);
               stmt.setInt(34, ((Number) parms[33]).intValue());
               stmt.setByte(35, ((Number) parms[34]).byteValue());
               stmt.setString(36, (String)parms[35], 1);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 6);
               stmt.setString(17, (String)parms[16], 6);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setShort(24, ((Number) parms[23]).shortValue());
               stmt.setString(25, (String)parms[24], 10);
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setByte(27, ((Number) parms[26]).byteValue());
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               stmt.setLongVarchar(29, (String)parms[28], false);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setString(31, (String)parms[30], 6);
               stmt.setString(32, (String)parms[31], 3);
               stmt.setInt(33, ((Number) parms[32]).intValue());
               stmt.setByte(34, ((Number) parms[33]).byteValue());
               stmt.setString(35, (String)parms[34], 1);
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 21 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               return;
      }
   }

}

