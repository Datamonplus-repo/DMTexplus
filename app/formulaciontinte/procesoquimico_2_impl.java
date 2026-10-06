package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesoquimico_2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV49Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
         AV35UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
         AV28Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
         AV45Msg_e = httpContext.GetPar( "Msg_e") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Msg_e", AV45Msg_e);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_1TL90( Gx_mode, A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV45Msg_e, A767ProForLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV49Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
         AV35UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
         AV28Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
         AV45Msg_e = httpContext.GetPar( "Msg_e") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Msg_e", AV45Msg_e);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         A762ProForCan = CommonUtil.decimalVal( httpContext.GetPar( "ProForCan"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A763ProForCla = httpContext.GetPar( "ProForCla") ;
         httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
         A5358ProForClv = httpContext.GetPar( "ProForClv") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_1TL90( Gx_mode, A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV45Msg_e, A767ProForLin, A762ProForCan, A490ForPrdUMe, A763ProForCla, A5358ProForClv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action35") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV49Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
         AV35UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
         AV28Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
         AV46Msg_del = httpContext.GetPar( "Msg_del") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Msg_del", AV46Msg_del);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_35_1TL90( Gx_mode, A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV46Msg_del, A767ProForLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaforprdume1TL90( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"PRDNOMFORM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asaprdnomform1TL90( A396EmprCod, A770ProForPrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"PROFORLIN") == 0 )
      {
         AV27ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ProForLin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27ProForLin), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asaproforlin1TL90( AV27ProForLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"PROFORLIN") == 0 )
      {
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asaproforlin1TL90( A767ProForLin, A396EmprCod, A764ProForCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa53581TL90( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel16"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_42") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_42( A396EmprCod, A770ProForPrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_37") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         A710PrdFind = httpContext.GetPar( "PrdFind") ;
         n710PrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_37( A396EmprCod, A764ProForCod, A767ProForLin, A710PrdFind, A770ProForPrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         A768ProForLinV = (short)(GXutil.lval( httpContext.GetPar( "ProForLinV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_38( A396EmprCod, A764ProForCod, A767ProForLin, A768ProForLinV) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_41") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_41( A396EmprCod, A490ForPrdUMe) ;
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
            AV11EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
            AV26ProForCod = httpContext.GetPar( "ProForCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ProForCod", AV26ProForCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ProForCod, ""))));
            AV27ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27ProForLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27ProForLin), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Proceso Quimico (Lineas)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProForLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public procesoquimico_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesoquimico_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesoquimico_2_impl.class ));
   }

   public procesoquimico_2_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynForPrdUMe = new HTMLChoice();
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
      if ( dynForPrdUMe.getItemCount() > 0 )
      {
         A490ForPrdUMe = (byte)(GXutil.lval( dynForPrdUMe.getValidValue(GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynForPrdUMe.setValue( GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynForPrdUMe.getInternalname(), "Values", dynForPrdUMe.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
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
      /* User Defined Control */
      ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablacontenido_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      if ( ! isFullAjaxMode( ) )
      {
         /* WebComponent */
         app.GxWebStd.gx_hidden_field( httpContext, "W0018"+"", GXutil.rtrim( WebComp_Wcprocesoquimico_4_Component));
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0018"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Wcprocesoquimico_4_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWcprocesoquimico_4), GXutil.lower( WebComp_Wcprocesoquimico_4_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0018"+"");
            }
            WebComp_Wcprocesoquimico_4.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWcprocesoquimico_4), GXutil.lower( WebComp_Wcprocesoquimico_4_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
      }
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForLin_Internalname, httpContext.getMessage( "Linea", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForLin_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedproforprd_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockproforprd_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblockproforprd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_proforprd.setProperty("Caption", Combo_proforprd_Caption);
      ucCombo_proforprd.setProperty("Cls", Combo_proforprd_Cls);
      ucCombo_proforprd.setProperty("EmptyItemText", Combo_proforprd_Emptyitemtext);
      ucCombo_proforprd.setProperty("DropDownOptionsData", AV41ProForPrd_Data);
      ucCombo_proforprd.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforprd_Internalname, "COMBO_PROFORPRDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForPrd_Internalname, httpContext.getMessage( "Codigo Producto", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForPrd_Internalname, GXutil.rtrim( A770ProForPrd), GXutil.rtrim( localUtil.format( A770ProForPrd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForPrd_Jsonclick, 0, "Attribute", "", "", "", "", edtProForPrd_Visible, edtProForPrd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDes_Internalname, httpContext.getMessage( "Descripcion", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDes_Internalname, GXutil.rtrim( A765ProForDes), GXutil.rtrim( localUtil.format( A765ProForDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForDes_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCan_Internalname, httpContext.getMessage( "Cantidad", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForCan_Enabled!=0) ? localUtil.format( A762ProForCan, "ZZZZZ9.9999") : localUtil.format( A762ProForCan, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForCan_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynForPrdUMe.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynForPrdUMe.getInternalname(), httpContext.getMessage( "Unidad", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynForPrdUMe, dynForPrdUMe.getInternalname(), GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)), 1, dynForPrdUMe.getJsonclick(), 7, "'"+""+"'"+",false,"+"'"+"e111tl90_client"+"'", "int", "", 1, dynForPrdUMe.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      dynForPrdUMe.setValue( GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynForPrdUMe.getInternalname(), "Values", dynForPrdUMe.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForNro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForNro_Internalname, httpContext.getMessage( "Nº", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForNro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForNro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTnq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTnq_Internalname, httpContext.getMessage( "Tq.", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTnq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCla_Internalname, httpContext.getMessage( "Clave I", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCla_Internalname, GXutil.rtrim( A763ProForCla), GXutil.rtrim( localUtil.format( A763ProForCla, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCla_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForCla_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforclv_cell_Internalname, 1, 0, "px", 0, "px", divProforclv_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProForClv_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForClv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForClv_Internalname, httpContext.getMessage( "Clave II", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForClv_Internalname, GXutil.rtrim( A5358ProForClv), GXutil.rtrim( localUtil.format( A5358ProForClv, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForClv_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForClv_Visible, edtProForClv_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", imgavClaves_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavClaves_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Active Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavClaves_gximage, "")==0) ? "" : "GX_Image_"+imgavClaves_gximage+"_Class") ;
      StyleString = "" ;
      AV39Claves_IsBlob = (boolean)(((GXutil.strcmp("", AV39Claves)==0)&&(GXutil.strcmp("", AV51Claves_GXI)==0))||!(GXutil.strcmp("", AV39Claves)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV39Claves)==0) ? AV51Claves_GXI : httpContext.getResourceRelative(AV39Claves)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgavClaves_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgavClaves_Visible, imgavClaves_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavClaves_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVCLAVES.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV39Claves_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", imgavClavesdel_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavClavesdel_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Active Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavClavesdel_gximage, "")==0) ? "" : "GX_Image_"+imgavClavesdel_gximage+"_Class") ;
      StyleString = "" ;
      AV40Clavesdel_IsBlob = (boolean)(((GXutil.strcmp("", AV40Clavesdel)==0)&&(GXutil.strcmp("", AV52Clavesdel_GXI)==0))||!(GXutil.strcmp("", AV40Clavesdel)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV40Clavesdel)==0) ? AV52Clavesdel_GXI : httpContext.getResourceRelative(AV40Clavesdel)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgavClavesdel_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgavClavesdel_Visible, imgavClavesdel_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 7, imgavClavesdel_Jsonclick, "'"+""+"'"+",false,"+"'"+"e121tl90_client"+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV40Clavesdel_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV49Pgmname), GXutil.rtrim( localUtil.format( AV49Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_proforprd_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboproforprd_Internalname, GXutil.rtrim( AV42ComboProForPrd), GXutil.rtrim( localUtil.format( AV42ComboProForPrd, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboproforprd_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboproforprd_Visible, edtavComboproforprd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForUli_Internalname, GXutil.ltrim( localUtil.ntoc( A773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForUli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A773ProForUli), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A773ProForUli), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForUli_Jsonclick, 0, "Attribute", "", "", "", "", edtProForUli_Visible, edtProForUli_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcprocesoquimico_4_Component) != 0 )
            {
               WebComp_Wcprocesoquimico_4.componentstart();
            }
         }
      }
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
      e131TL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORPRD_DATA"), AV41ProForPrd_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
            Z767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z767ProForLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z770ProForPrd = httpContext.cgiGet( "Z770ProForPrd") ;
            Z765ProForDes = httpContext.cgiGet( "Z765ProForDes") ;
            Z13111ProForDe2 = httpContext.cgiGet( "Z13111ProForDe2") ;
            Z762ProForCan = localUtil.ctond( httpContext.cgiGet( "Z762ProForCan")) ;
            Z1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1645ProForNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3379ProForTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6062ProForCPo = localUtil.ctond( httpContext.cgiGet( "Z6062ProForCPo")) ;
            Z13178ProForFT = httpContext.cgiGet( "Z13178ProForFT") ;
            Z763ProForCla = httpContext.cgiGet( "Z763ProForCla") ;
            Z5358ProForClv = httpContext.cgiGet( "Z5358ProForClv") ;
            Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13111ProForDe2 = httpContext.cgiGet( "Z13111ProForDe2") ;
            A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( "Z6062ProForCPo")) ;
            A13178ProForFT = httpContext.cgiGet( "Z13178ProForFT") ;
            O762ProForCan = localUtil.ctond( httpContext.cgiGet( "O762ProForCan")) ;
            O767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( "O767ProForLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "O490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O763ProForCla = httpContext.cgiGet( "O763ProForCla") ;
            O5358ProForClv = httpContext.cgiGet( "O5358ProForClv") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "N490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A13976PrdNomForm = httpContext.cgiGet( "PRDNOMFORM") ;
            A768ProForLinV = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORLINV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV11EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV26ProForCod = httpContext.cgiGet( "vPROFORCOD") ;
            A764ProForCod = httpContext.cgiGet( "PROFORCOD") ;
            AV27ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( "vPROFORLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Insert_ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_FORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4340PrdUMeFind = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFIND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4340PrdUMeFind = false ;
            A710PrdFind = httpContext.cgiGet( "PRDFIND") ;
            AV22oldCant = localUtil.ctond( httpContext.cgiGet( "vOLDCANT")) ;
            AV34Un = (byte)(localUtil.ctol( httpContext.cgiGet( "vUN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23oldProforlin = (short)(localUtil.ctol( httpContext.cgiGet( "vOLDPROFORLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV45Msg_e = httpContext.cgiGet( "vMSG_E") ;
            AV46Msg_del = httpContext.cgiGet( "vMSG_DEL") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( "PROFORCPO")) ;
            A13178ProForFT = httpContext.cgiGet( "PROFORFT") ;
            AV35UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV28Station = httpContext.cgiGet( "vSTATION") ;
            A13111ProForDe2 = httpContext.cgiGet( "PROFORDE2") ;
            A717PrdMaxFind = httpContext.cgiGet( "PRDMAXFIND") ;
            n717PrdMaxFind = false ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A766ProForDsc = httpContext.cgiGet( "PROFORDSC") ;
            A4715ProForDsc2 = httpContext.cgiGet( "PROFORDSC2") ;
            A488ForPrdDsc = httpContext.cgiGet( "FORPRDDSC") ;
            n488ForPrdDsc = false ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_proforprd_Objectcall = httpContext.cgiGet( "COMBO_PROFORPRD_Objectcall") ;
            Combo_proforprd_Class = httpContext.cgiGet( "COMBO_PROFORPRD_Class") ;
            Combo_proforprd_Icontype = httpContext.cgiGet( "COMBO_PROFORPRD_Icontype") ;
            Combo_proforprd_Icon = httpContext.cgiGet( "COMBO_PROFORPRD_Icon") ;
            Combo_proforprd_Caption = httpContext.cgiGet( "COMBO_PROFORPRD_Caption") ;
            Combo_proforprd_Tooltip = httpContext.cgiGet( "COMBO_PROFORPRD_Tooltip") ;
            Combo_proforprd_Cls = httpContext.cgiGet( "COMBO_PROFORPRD_Cls") ;
            Combo_proforprd_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORPRD_Selectedvalue_set") ;
            Combo_proforprd_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROFORPRD_Selectedvalue_get") ;
            Combo_proforprd_Selectedtext_set = httpContext.cgiGet( "COMBO_PROFORPRD_Selectedtext_set") ;
            Combo_proforprd_Selectedtext_get = httpContext.cgiGet( "COMBO_PROFORPRD_Selectedtext_get") ;
            Combo_proforprd_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROFORPRD_Gamoauthtoken") ;
            Combo_proforprd_Ddointernalname = httpContext.cgiGet( "COMBO_PROFORPRD_Ddointernalname") ;
            Combo_proforprd_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROFORPRD_Titlecontrolalign") ;
            Combo_proforprd_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROFORPRD_Dropdownoptionstype") ;
            Combo_proforprd_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORPRD_Enabled")) ;
            Combo_proforprd_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORPRD_Visible")) ;
            Combo_proforprd_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROFORPRD_Titlecontrolidtoreplace") ;
            Combo_proforprd_Datalisttype = httpContext.cgiGet( "COMBO_PROFORPRD_Datalisttype") ;
            Combo_proforprd_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORPRD_Allowmultipleselection")) ;
            Combo_proforprd_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROFORPRD_Datalistfixedvalues") ;
            Combo_proforprd_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORPRD_Isgriditem")) ;
            Combo_proforprd_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORPRD_Hasdescription")) ;
            Combo_proforprd_Datalistproc = httpContext.cgiGet( "COMBO_PROFORPRD_Datalistproc") ;
            Combo_proforprd_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROFORPRD_Datalistprocparametersprefix") ;
            Combo_proforprd_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROFORPRD_Remoteservicesparameters") ;
            Combo_proforprd_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROFORPRD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_proforprd_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORPRD_Includeonlyselectedoption")) ;
            Combo_proforprd_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORPRD_Includeselectalloption")) ;
            Combo_proforprd_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORPRD_Emptyitem")) ;
            Combo_proforprd_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORPRD_Includeaddnewoption")) ;
            Combo_proforprd_Htmltemplate = httpContext.cgiGet( "COMBO_PROFORPRD_Htmltemplate") ;
            Combo_proforprd_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROFORPRD_Multiplevaluestype") ;
            Combo_proforprd_Loadingdata = httpContext.cgiGet( "COMBO_PROFORPRD_Loadingdata") ;
            Combo_proforprd_Noresultsfound = httpContext.cgiGet( "COMBO_PROFORPRD_Noresultsfound") ;
            Combo_proforprd_Emptyitemtext = httpContext.cgiGet( "COMBO_PROFORPRD_Emptyitemtext") ;
            Combo_proforprd_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROFORPRD_Onlyselectedvalues") ;
            Combo_proforprd_Selectalltext = httpContext.cgiGet( "COMBO_PROFORPRD_Selectalltext") ;
            Combo_proforprd_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROFORPRD_Multiplevaluesseparator") ;
            Combo_proforprd_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROFORPRD_Addnewoptiontext") ;
            Combo_proforprd_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROFORPRD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A767ProForLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
            }
            else
            {
               A767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
            }
            A770ProForPrd = httpContext.cgiGet( edtProForPrd_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
            A765ProForDes = httpContext.cgiGet( edtProForDes_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORCAN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCan_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A762ProForCan = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
            }
            else
            {
               A762ProForCan = localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
            }
            dynForPrdUMe.setValue( httpContext.cgiGet( dynForPrdUMe.getInternalname()) );
            A490ForPrdUMe = (byte)(GXutil.lval( httpContext.cgiGet( dynForPrdUMe.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORNRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForNro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1645ProForNro = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
            }
            else
            {
               A1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTNQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForTnq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3379ProForTnq = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
            }
            else
            {
               A3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
            }
            A763ProForCla = httpContext.cgiGet( edtProForCla_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
            A5358ProForClv = httpContext.cgiGet( edtProForClv_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
            AV39Claves = httpContext.cgiGet( imgavClaves_Internalname) ;
            AV40Clavesdel = httpContext.cgiGet( imgavClavesdel_Internalname) ;
            AV49Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
            AV42ComboProForPrd = httpContext.cgiGet( edtavComboproforprd_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42ComboProForPrd", AV42ComboProForPrd);
            A773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( edtProForUli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ProcesoQuimico_2");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV49Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV49Pgmname, "")));
            forbiddenHiddens.add("ProForDe2", GXutil.rtrim( localUtil.format( A13111ProForDe2, "")));
            forbiddenHiddens.add("ProForCPo", localUtil.format( A6062ProForCPo, "ZZ9.99"));
            forbiddenHiddens.add("ProForFT", GXutil.rtrim( localUtil.format( A13178ProForFT, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A767ProForLin != Z767ProForLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\procesoquimico_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A764ProForCod = httpContext.GetPar( "ProForCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
               A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
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
                  sMode90 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode90 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound90 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TL0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PROFORLIN");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForLin_Internalname ;
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
                        e131TL2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e141TL2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VCLAVES.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e151TL2 ();
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
               else if ( GXutil.strcmp(sEvtType, "W") == 0 )
               {
                  sEvtType = GXutil.left( sEvt, 4) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                  nCmpId = (short)(GXutil.lval( sEvtType)) ;
                  if ( nCmpId == 18 )
                  {
                     OldWcprocesoquimico_4 = httpContext.cgiGet( "W0018") ;
                     if ( ( GXutil.len( OldWcprocesoquimico_4) == 0 ) || ( GXutil.strcmp(OldWcprocesoquimico_4, WebComp_Wcprocesoquimico_4_Component) != 0 ) )
                     {
                        WebComp_Wcprocesoquimico_4 = WebUtils.getWebComponent(getClass(), "app." + OldWcprocesoquimico_4 + "_impl", remoteHandle, context);
                        WebComp_Wcprocesoquimico_4_Component = OldWcprocesoquimico_4 ;
                     }
                     if ( GXutil.len( WebComp_Wcprocesoquimico_4_Component) != 0 )
                     {
                        WebComp_Wcprocesoquimico_4.componentprocess("W0018", "", sEvt);
                     }
                     WebComp_Wcprocesoquimico_4_Component = OldWcprocesoquimico_4 ;
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
         e141TL2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TL90( ) ;
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
         disableAttributes1TL90( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforprd_Enabled), 5, 0), true);
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

   public void confirm_1TL0( )
   {
      beforeValidate1TL90( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TL90( ) ;
         }
         else
         {
            checkExtendedTable1TL90( ) ;
            closeExtendedTableCursors1TL90( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TL0( )
   {
   }

   public void e131TL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV28Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      procesoquimico_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Station", AV28Station);
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = AV12EmprNom ;
      GXv_char4[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char2, GXv_char3, GXv_char4) ;
      procesoquimico_2_impl.this.AV11EmprCod = GXv_char2[0] ;
      procesoquimico_2_impl.this.AV12EmprNom = GXv_char3[0] ;
      procesoquimico_2_impl.this.AV35UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprNom", AV12EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
      GXv_SdtWWPContext5[0] = AV38WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV38WWPContext = GXv_SdtWWPContext5[0] ;
      edtProForPrd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPrd_Visible), 5, 0), true);
      AV42ComboProForPrd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ComboProForPrd", AV42ComboProForPrd);
      edtavComboproforprd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforprd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforprd_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPROFORPRD' */
      S112 ();
      if ( returnInSub )
      {
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
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
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
      AV32TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV32TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV49Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV50GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GXV1), 8, 0));
         while ( AV50GXV1 <= AV32TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV33TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV32TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV50GXV1));
            if ( GXutil.strcmp(AV33TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ForPrdUMe") == 0 )
            {
               AV17Insert_ForPrdUMe = (byte)(GXutil.lval( AV33TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Insert_ForPrdUMe", GXutil.str( AV17Insert_ForPrdUMe, 1, 0));
            }
            AV50GXV1 = (int)(AV50GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GXV1), 8, 0));
         }
      }
      edtProForUli_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForUli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForUli_Visible), 5, 0), true);
      GXt_int6 = (byte)(AV21ObsPrf) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "OBSPRF", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV21ObsPrf = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ObsPrf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ObsPrf), 4, 0));
      GXt_int6 = (byte)(AV15FlagLav) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "LAVAND", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV15FlagLav = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FlagLav", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagLav), 4, 0));
      GXt_int6 = (byte)(AV7CdpPor) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "%CDP", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV7CdpPor = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CdpPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CdpPor), 4, 0));
      GXt_int6 = (byte)(AV29Tecido) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "TEJIDO", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV29Tecido = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Tecido", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Tecido), 4, 0));
      GXt_int6 = (byte)(AV19Lavado) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "LAVADO", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV19Lavado = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lavado", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Lavado), 4, 0));
      GXt_int6 = (byte)(AV13Erfoc) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "ERFOC", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV13Erfoc = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Erfoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Erfoc), 4, 0));
      GXt_int6 = (byte)(AV30Texfina) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "TEXFNA", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV30Texfina = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Texfina", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Texfina), 4, 0));
      GXt_int6 = (byte)(AV8Clave2) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "CLAVE2", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV8Clave2 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Clave2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clave2), 4, 0));
      GXt_int6 = (byte)(AV20NoVisible) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "NOVISC", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV20NoVisible = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20NoVisible", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20NoVisible), 4, 0));
      GXt_int6 = (byte)(AV36Velta) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "TINTTO", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV36Velta = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Velta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Velta), 4, 0));
      GXt_int6 = (byte)(AV14Filasur) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "FILASU", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV14Filasur = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Filasur", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Filasur), 4, 0));
      GXt_int6 = (byte)(AV25Pathter) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "PATHTE", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV25Pathter = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Pathter", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Pathter), 4, 0));
      GXt_int6 = (byte)(AV18jpf) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "JPF", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV18jpf = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18jpf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18jpf), 4, 0));
      GXt_int6 = (byte)(AV24Orient) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "TORIEN", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV24Orient = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Orient", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Orient), 4, 0));
      GXt_int6 = (byte)(AV31tintutex) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, "TINTUT", GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      AV31tintutex = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31tintutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31tintutex), 4, 0));
      imgavClaves_gximage = "ActionInsert" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavClaves_Internalname, "gximage", imgavClaves_gximage, true);
      AV39Claves = context.getHttpContext().getImagePath( "5649fbb8-8ce0-4810-a5ce-bd649ea83c3a", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavClaves_Internalname, "Bitmap", ((GXutil.strcmp("", AV39Claves)==0) ? AV51Claves_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV39Claves))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavClaves_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV39Claves), true);
      AV51Claves_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "5649fbb8-8ce0-4810-a5ce-bd649ea83c3a", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavClaves_Internalname, "Bitmap", ((GXutil.strcmp("", AV39Claves)==0) ? AV51Claves_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV39Claves))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavClaves_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV39Claves), true);
      imgavClavesdel_gximage = "ActionDelete" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavClavesdel_Internalname, "gximage", imgavClavesdel_gximage, true);
      AV40Clavesdel = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavClavesdel_Internalname, "Bitmap", ((GXutil.strcmp("", AV40Clavesdel)==0) ? AV52Clavesdel_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV40Clavesdel))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavClavesdel_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV40Clavesdel), true);
      AV52Clavesdel_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavClavesdel_Internalname, "Bitmap", ((GXutil.strcmp("", AV40Clavesdel)==0) ? AV52Clavesdel_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV40Clavesdel))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavClavesdel_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV40Clavesdel), true);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcprocesoquimico_4 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcprocesoquimico_4_Component), GXutil.lower( "FormulacionTinte.ProcesoQuimico_4")) != 0 )
      {
         WebComp_Wcprocesoquimico_4 = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.procesoquimico_4_impl", remoteHandle, context);
         WebComp_Wcprocesoquimico_4_Component = "FormulacionTinte.ProcesoQuimico_4" ;
      }
      if ( GXutil.len( WebComp_Wcprocesoquimico_4_Component) != 0 )
      {
         WebComp_Wcprocesoquimico_4.setjustcreated();
         WebComp_Wcprocesoquimico_4.componentprepare(new Object[] {"W0018","",AV11EmprCod,AV26ProForCod});
         WebComp_Wcprocesoquimico_4.componentbind(new Object[] {"",""});
      }
   }

   public void e141TL2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
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

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtProForClv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), true);
      divProforclv_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforclv_cell_Internalname, "Class", divProforclv_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROFORPRD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV41ProForPrd_Data ;
      GXv_char4[0] = AV10ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.formulaciontinte.procesoquimico_2loaddvcombo(remoteHandle, context).execute( "ProForPrd", Gx_mode, AV11EmprCod, AV26ProForCod, AV27ProForLin, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      procesoquimico_2_impl.this.AV10ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV41ProForPrd_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_proforprd_Selectedvalue_set = AV10ComboSelectedValue ;
      ucCombo_proforprd.sendProperty(context, "", false, Combo_proforprd_Internalname, "SelectedValue_set", Combo_proforprd_Selectedvalue_set);
      AV42ComboProForPrd = AV10ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ComboProForPrd", AV42ComboProForPrd);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_proforprd_Enabled = false ;
         ucCombo_proforprd.sendProperty(context, "", false, Combo_proforprd_Internalname, "Enabled", GXutil.booltostr( Combo_proforprd_Enabled));
      }
   }

   public void e151TL2( )
   {
      /* Claves_Click Routine */
      returnInSub = false ;
      if ( ( A767ProForLin > 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) )
      {
         GXv_char4[0] = AV11EmprCod ;
         GXv_char3[0] = A764ProForCod ;
         GXv_int10[0] = A767ProForLin ;
         GXv_char2[0] = AV44Proforprd ;
         new app.formulaciontinte.procesoquimico_lineaanterior(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10, GXv_char2) ;
         procesoquimico_2_impl.this.AV11EmprCod = GXv_char4[0] ;
         procesoquimico_2_impl.this.A764ProForCod = GXv_char3[0] ;
         procesoquimico_2_impl.this.A767ProForLin = GXv_int10[0] ;
         procesoquimico_2_impl.this.AV44Proforprd = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         httpContext.popup(formatLink("app.formulaciontinte.procesosquimicos_claves_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod)),GXutil.URLEncode(GXutil.rtrim(A766ProForDsc)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(AV44Proforprd)),GXutil.URLEncode(GXutil.ltrimstr(A773ProForUli,4,0))}, new String[] {"Emprcod","Proforcod","Profordsc","ProForCla","ProForClv","Producto","UltimaLinea"}) , new Object[] {"AV11EmprCod","A764ProForCod","A766ProForDsc","A763ProForCla","A5358ProForClv","AV44Proforprd","A773ProForUli"});
         GX_FocusControl = edtProForCan_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO ha introducido Linea o NO es un producto¡", ""));
      }
      /*  Sending Event outputs  */
   }

   public void zm1TL90( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z770ProForPrd = T01TL3_A770ProForPrd[0] ;
            Z765ProForDes = T01TL3_A765ProForDes[0] ;
            Z13111ProForDe2 = T01TL3_A13111ProForDe2[0] ;
            Z762ProForCan = T01TL3_A762ProForCan[0] ;
            Z1645ProForNro = T01TL3_A1645ProForNro[0] ;
            Z3379ProForTnq = T01TL3_A3379ProForTnq[0] ;
            Z6062ProForCPo = T01TL3_A6062ProForCPo[0] ;
            Z13178ProForFT = T01TL3_A13178ProForFT[0] ;
            Z763ProForCla = T01TL3_A763ProForCla[0] ;
            Z5358ProForClv = T01TL3_A5358ProForClv[0] ;
            Z490ForPrdUMe = T01TL3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z770ProForPrd = A770ProForPrd ;
            Z765ProForDes = A765ProForDes ;
            Z13111ProForDe2 = A13111ProForDe2 ;
            Z762ProForCan = A762ProForCan ;
            Z1645ProForNro = A1645ProForNro ;
            Z3379ProForTnq = A3379ProForTnq ;
            Z6062ProForCPo = A6062ProForCPo ;
            Z13178ProForFT = A13178ProForFT ;
            Z763ProForCla = A763ProForCla ;
            Z5358ProForClv = A5358ProForClv ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z767ProForLin = A767ProForLin ;
         Z770ProForPrd = A770ProForPrd ;
         Z765ProForDes = A765ProForDes ;
         Z13111ProForDe2 = A13111ProForDe2 ;
         Z762ProForCan = A762ProForCan ;
         Z1645ProForNro = A1645ProForNro ;
         Z3379ProForTnq = A3379ProForTnq ;
         Z6062ProForCPo = A6062ProForCPo ;
         Z13178ProForFT = A13178ProForFT ;
         Z763ProForCla = A763ProForCla ;
         Z5358ProForClv = A5358ProForClv ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z407EmprNom = A407EmprNom ;
         Z766ProForDsc = A766ProForDsc ;
         Z4715ProForDsc2 = A4715ProForDsc2 ;
         Z773ProForUli = A773ProForUli ;
         Z710PrdFind = A710PrdFind ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtProForCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), true);
      edtProForClv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), true);
      AV49Pgmname = "FormulacionTinte.ProcesoQuimico_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtProForCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), true);
      edtProForClv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV11EmprCod)==0) )
      {
         A396EmprCod = AV11EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TL13 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TL13_A407EmprNom[0] ;
      n407EmprNom = T01TL13_n407EmprNom[0] ;
      pr_default.close(4);
      gxaforprdume_html1TL90( A396EmprCod) ;
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      edtProForClv_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divProforclv_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforclv_cell_Internalname, "Class", divProforclv_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int7) ;
         procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
         if ( GXt_int6 == 1 )
         {
            divProforclv_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-5 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforclv_cell_Internalname, "Class", divProforclv_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV26ProForCod)==0) )
      {
         A764ProForCod = AV26ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      /* Using cursor T01TL14 */
      pr_default.execute(5, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
      }
      A766ProForDsc = T01TL14_A766ProForDsc[0] ;
      A4715ProForDsc2 = T01TL14_A4715ProForDsc2[0] ;
      A773ProForUli = T01TL14_A773ProForUli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      pr_default.close(5);
      if ( ! (0==AV27ProForLin) )
      {
         A767ProForLin = AV27ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      }
      if ( ! (0==AV27ProForLin) )
      {
         edtProForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), true);
      }
      else
      {
         edtProForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV27ProForLin) )
      {
         edtProForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_ForPrdUMe) )
      {
         dynForPrdUMe.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynForPrdUMe.getInternalname(), "Enabled", GXutil.ltrimstr( dynForPrdUMe.getEnabled(), 5, 0), true);
      }
      else
      {
         dynForPrdUMe.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynForPrdUMe.getInternalname(), "Enabled", GXutil.ltrimstr( dynForPrdUMe.getEnabled(), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      A770ProForPrd = AV42ComboProForPrd ;
      httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
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
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6062ProForCPo)==0) && ( Gx_BScreen == 0 ) )
      {
         A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
      }
      if ( isIns( )  && (GXutil.strcmp("", A13178ProForFT)==0) && ( Gx_BScreen == 0 ) )
      {
         A13178ProForFT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         A768ProForLinV = A767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
         /* Using cursor T01TL12 */
         pr_default.execute(3, new Object[] {Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV)});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A717PrdMaxFind = T01TL12_A717PrdMaxFind[0] ;
            n717PrdMaxFind = T01TL12_n717PrdMaxFind[0] ;
         }
         else
         {
            A717PrdMaxFind = "" ;
            n717PrdMaxFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
         }
         pr_default.close(3);
         AV23oldProforlin = O767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23oldProforlin), 4, 0));
         /* Using cursor T01TL16 */
         pr_default.execute(7, new Object[] {A396EmprCod, A770ProForPrd});
         if ( (pr_default.getStatus(7) != 101) )
         {
            A710PrdFind = T01TL16_A710PrdFind[0] ;
            n710PrdFind = T01TL16_n710PrdFind[0] ;
         }
         else
         {
            A710PrdFind = "xxxxxx" ;
            n710PrdFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
         }
         pr_default.close(7);
         /* Using cursor T01TL6 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A4340PrdUMeFind = T01TL6_A4340PrdUMeFind[0] ;
            n4340PrdUMeFind = T01TL6_n4340PrdUMeFind[0] ;
         }
         else
         {
            A4340PrdUMeFind = (byte)(0) ;
            n4340PrdUMeFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
         }
         pr_default.close(2);
         GXt_char1 = A13976PrdNomForm ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A770ProForPrd ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         procesoquimico_2_impl.this.A396EmprCod = GXv_char4[0] ;
         procesoquimico_2_impl.this.A770ProForPrd = GXv_char3[0] ;
         procesoquimico_2_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         A13976PrdNomForm = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13976PrdNomForm", A13976PrdNomForm);
      }
   }

   public void load1TL90( )
   {
      /* Using cursor T01TL17 */
      pr_default.execute(8, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A770ProForPrd = T01TL17_A770ProForPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         A765ProForDes = T01TL17_A765ProForDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
         A407EmprNom = T01TL17_A407EmprNom[0] ;
         n407EmprNom = T01TL17_n407EmprNom[0] ;
         A766ProForDsc = T01TL17_A766ProForDsc[0] ;
         A4715ProForDsc2 = T01TL17_A4715ProForDsc2[0] ;
         A773ProForUli = T01TL17_A773ProForUli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
         A13111ProForDe2 = T01TL17_A13111ProForDe2[0] ;
         A488ForPrdDsc = T01TL17_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01TL17_n488ForPrdDsc[0] ;
         A762ProForCan = T01TL17_A762ProForCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
         A1645ProForNro = T01TL17_A1645ProForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
         A3379ProForTnq = T01TL17_A3379ProForTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
         A6062ProForCPo = T01TL17_A6062ProForCPo[0] ;
         A13178ProForFT = T01TL17_A13178ProForFT[0] ;
         A763ProForCla = T01TL17_A763ProForCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
         A5358ProForClv = T01TL17_A5358ProForClv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
         A490ForPrdUMe = T01TL17_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A710PrdFind = T01TL17_A710PrdFind[0] ;
         n710PrdFind = T01TL17_n710PrdFind[0] ;
         zm1TL90( -36) ;
      }
      pr_default.close(8);
      onLoadActions1TL90( ) ;
   }

   public void onLoadActions1TL90( )
   {
      A768ProForLinV = A767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      AV23oldProforlin = O767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23oldProforlin), 4, 0));
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A765ProForDes = A13976PrdNomForm ;
         httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
      }
      AV22oldCant = O762ProForCan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22oldCant", GXutil.ltrimstr( AV22oldCant, 12, 5));
      GXt_char1 = A13976PrdNomForm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A770ProForPrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      procesoquimico_2_impl.this.A396EmprCod = GXv_char4[0] ;
      procesoquimico_2_impl.this.A770ProForPrd = GXv_char3[0] ;
      procesoquimico_2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
      A13976PrdNomForm = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13976PrdNomForm", A13976PrdNomForm);
      /* Using cursor T01TL6 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4340PrdUMeFind = T01TL6_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01TL6_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      pr_default.close(2);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_ForPrdUMe) )
      {
         A490ForPrdUMe = AV17Insert_ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      else
      {
         if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) && isIns( )  )
         {
            A490ForPrdUMe = A4340PrdUMeFind ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
      }
      /* Using cursor T01TL12 */
      pr_default.execute(3, new Object[] {Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A717PrdMaxFind = T01TL12_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01TL12_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
      }
      pr_default.close(3);
      AV46Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Msg_del", AV46Msg_del);
      AV34Un = O490ForPrdUMe ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Un", GXutil.str( AV34Un, 1, 0));
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
      {
         AV45Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV22oldCant, 12, 5) + GXutil.trim( GXutil.str( AV34Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Msg_e", AV45Msg_e);
      }
   }

   public void checkExtendedTable1TL90( )
   {
      nIsDirty_90 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_90 = (short)(1) ;
      A768ProForLinV = A767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      AV23oldProforlin = O767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23oldProforlin), 4, 0));
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         nIsDirty_90 = (short)(1) ;
         A765ProForDes = A13976PrdNomForm ;
         httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
      }
      if ( (GXutil.strcmp("", A770ProForPrd)==0) && (GXutil.strcmp("", A765ProForDes)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("Es necesario introducir un producto o una descripcion", 1, "PROFORDES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForDes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV22oldCant = O762ProForCan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22oldCant", GXutil.ltrimstr( AV22oldCant, 12, 5));
      /* Using cursor T01TL16 */
      pr_default.execute(7, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A710PrdFind = T01TL16_A710PrdFind[0] ;
         n710PrdFind = T01TL16_n710PrdFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
      }
      pr_default.close(7);
      nIsDirty_90 = (short)(1) ;
      GXt_char1 = A13976PrdNomForm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A770ProForPrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      procesoquimico_2_impl.this.A396EmprCod = GXv_char4[0] ;
      procesoquimico_2_impl.this.A770ProForPrd = GXv_char3[0] ;
      procesoquimico_2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
      A13976PrdNomForm = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13976PrdNomForm", A13976PrdNomForm);
      /* Using cursor T01TL6 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4340PrdUMeFind = T01TL6_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01TL6_n4340PrdUMeFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      pr_default.close(2);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_ForPrdUMe) )
      {
         nIsDirty_90 = (short)(1) ;
         A490ForPrdUMe = AV17Insert_ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      else
      {
         if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) && isIns( )  )
         {
            nIsDirty_90 = (short)(1) ;
            A490ForPrdUMe = A4340PrdUMeFind ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
      }
      /* Using cursor T01TL12 */
      pr_default.execute(3, new Object[] {Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A717PrdMaxFind = T01TL12_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01TL12_n717PrdMaxFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
      }
      pr_default.close(3);
      AV46Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Msg_del", AV46Msg_del);
      /* Using cursor T01TL15 */
      pr_default.execute(6, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = dynForPrdUMe.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01TL15_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01TL15_n488ForPrdDsc[0] ;
      pr_default.close(6);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = dynForPrdUMe.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV34Un = O490ForPrdUMe ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Un", GXutil.str( AV34Un, 1, 0));
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
      {
         AV45Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV22oldCant, 12, 5) + GXutil.trim( GXutil.str( AV34Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Msg_e", AV45Msg_e);
      }
      if ( isUpd( )  && true /* Level */ && ( ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) || ( A490ForPrdUMe != O490ForPrdUMe ) || ( GXutil.strcmp(A763ProForCla, O763ProForCla) != 0 ) || ( GXutil.strcmp(A5358ProForClv, O5358ProForClv) != 0 ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV45Msg_e, 99999999, (byte)(0), "@") ;
      }
   }

   public void closeExtendedTableCursors1TL90( )
   {
      pr_default.close(7);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_42( String A396EmprCod ,
                          String A770ProForPrd )
   {
      /* Using cursor T01TL18 */
      pr_default.execute(9, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A710PrdFind = T01TL18_A710PrdFind[0] ;
         n710PrdFind = T01TL18_n710PrdFind[0] ;
      }
      else
      {
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A710PrdFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_37( String A396EmprCod ,
                          String A764ProForCod ,
                          short A767ProForLin ,
                          String A710PrdFind ,
                          String A770ProForPrd )
   {
      /* Using cursor T01TL21 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A4340PrdUMeFind = T01TL21_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01TL21_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_38( String A396EmprCod ,
                          String A764ProForCod ,
                          short A767ProForLin ,
                          short A768ProForLinV )
   {
      /* Using cursor T01TL27 */
      pr_default.execute(11, new Object[] {Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A717PrdMaxFind = T01TL27_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01TL27_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A717PrdMaxFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_41( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01TL28 */
      pr_default.execute(12, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = dynForPrdUMe.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01TL28_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01TL28_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey1TL90( )
   {
      /* Using cursor T01TL29 */
      pr_default.execute(13, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound90 = (short)(1) ;
      }
      else
      {
         RcdFound90 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TL90( 36) ;
         RcdFound90 = (short)(1) ;
         A767ProForLin = T01TL3_A767ProForLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         A770ProForPrd = T01TL3_A770ProForPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         A765ProForDes = T01TL3_A765ProForDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
         A13111ProForDe2 = T01TL3_A13111ProForDe2[0] ;
         A762ProForCan = T01TL3_A762ProForCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
         A1645ProForNro = T01TL3_A1645ProForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
         A3379ProForTnq = T01TL3_A3379ProForTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
         A6062ProForCPo = T01TL3_A6062ProForCPo[0] ;
         A13178ProForFT = T01TL3_A13178ProForFT[0] ;
         A763ProForCla = T01TL3_A763ProForCla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
         A5358ProForClv = T01TL3_A5358ProForClv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
         A396EmprCod = T01TL3_A396EmprCod[0] ;
         A764ProForCod = T01TL3_A764ProForCod[0] ;
         A490ForPrdUMe = T01TL3_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         O762ProForCan = A762ProForCan ;
         httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
         O767ProForLin = A767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         O490ForPrdUMe = A490ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         O763ProForCla = A763ProForCla ;
         httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
         O5358ProForClv = A5358ProForClv ;
         httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z767ProForLin = A767ProForLin ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TL90( ) ;
         if ( AnyError == 1 )
         {
            RcdFound90 = (short)(0) ;
            initializeNonKey1TL90( ) ;
         }
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound90 = (short)(0) ;
         initializeNonKey1TL90( ) ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TL90( ) ;
      if ( RcdFound90 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound90 = (short)(0) ;
      /* Using cursor T01TL30 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, A764ProForCod, A764ProForCod, A396EmprCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01TL30_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TL30_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TL30_A764ProForCod[0], A764ProForCod) < 0 ) || ( GXutil.strcmp(T01TL30_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01TL30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TL30_A767ProForLin[0] < A767ProForLin ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01TL30_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TL30_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TL30_A764ProForCod[0], A764ProForCod) > 0 ) || ( GXutil.strcmp(T01TL30_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01TL30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TL30_A767ProForLin[0] > A767ProForLin ) ) )
         {
            A396EmprCod = T01TL30_A396EmprCod[0] ;
            A764ProForCod = T01TL30_A764ProForCod[0] ;
            A767ProForLin = T01TL30_A767ProForLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
            RcdFound90 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound90 = (short)(0) ;
      /* Using cursor T01TL31 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, A764ProForCod, A764ProForCod, A396EmprCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01TL31_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TL31_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TL31_A764ProForCod[0], A764ProForCod) > 0 ) || ( GXutil.strcmp(T01TL31_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01TL31_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TL31_A767ProForLin[0] > A767ProForLin ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01TL31_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TL31_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TL31_A764ProForCod[0], A764ProForCod) < 0 ) || ( GXutil.strcmp(T01TL31_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01TL31_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TL31_A767ProForLin[0] < A767ProForLin ) ) )
         {
            A396EmprCod = T01TL31_A396EmprCod[0] ;
            A764ProForCod = T01TL31_A764ProForCod[0] ;
            A767ProForLin = T01TL31_A767ProForLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
            RcdFound90 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TL90( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProForLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TL90( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound90 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) || ( A767ProForLin != Z767ProForLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A764ProForCod = Z764ProForCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
               A767ProForLin = Z767ProForLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PROFORLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProForLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TL90( ) ;
               GX_FocusControl = edtProForLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) || ( A767ProForLin != Z767ProForLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtProForLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TL90( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PROFORLIN");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtProForLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TL90( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) || ( A767ProForLin != Z767ProForLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = Z764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = Z767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PROFORLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProForLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TL90( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z770ProForPrd, T01TL2_A770ProForPrd[0]) != 0 ) || ( GXutil.strcmp(Z765ProForDes, T01TL2_A765ProForDes[0]) != 0 ) || ( GXutil.strcmp(Z13111ProForDe2, T01TL2_A13111ProForDe2[0]) != 0 ) || ( DecimalUtil.compareTo(Z762ProForCan, T01TL2_A762ProForCan[0]) != 0 ) || ( Z1645ProForNro != T01TL2_A1645ProForNro[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3379ProForTnq != T01TL2_A3379ProForTnq[0] ) || ( DecimalUtil.compareTo(Z6062ProForCPo, T01TL2_A6062ProForCPo[0]) != 0 ) || ( GXutil.strcmp(Z13178ProForFT, T01TL2_A13178ProForFT[0]) != 0 ) || ( GXutil.strcmp(Z763ProForCla, T01TL2_A763ProForCla[0]) != 0 ) || ( GXutil.strcmp(Z5358ProForClv, T01TL2_A5358ProForClv[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T01TL2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z770ProForPrd, T01TL2_A770ProForPrd[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForPrd");
               GXutil.writeLogRaw("Old: ",Z770ProForPrd);
               GXutil.writeLogRaw("Current: ",T01TL2_A770ProForPrd[0]);
            }
            if ( GXutil.strcmp(Z765ProForDes, T01TL2_A765ProForDes[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForDes");
               GXutil.writeLogRaw("Old: ",Z765ProForDes);
               GXutil.writeLogRaw("Current: ",T01TL2_A765ProForDes[0]);
            }
            if ( GXutil.strcmp(Z13111ProForDe2, T01TL2_A13111ProForDe2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForDe2");
               GXutil.writeLogRaw("Old: ",Z13111ProForDe2);
               GXutil.writeLogRaw("Current: ",T01TL2_A13111ProForDe2[0]);
            }
            if ( DecimalUtil.compareTo(Z762ProForCan, T01TL2_A762ProForCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForCan");
               GXutil.writeLogRaw("Old: ",Z762ProForCan);
               GXutil.writeLogRaw("Current: ",T01TL2_A762ProForCan[0]);
            }
            if ( Z1645ProForNro != T01TL2_A1645ProForNro[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForNro");
               GXutil.writeLogRaw("Old: ",Z1645ProForNro);
               GXutil.writeLogRaw("Current: ",T01TL2_A1645ProForNro[0]);
            }
            if ( Z3379ProForTnq != T01TL2_A3379ProForTnq[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForTnq");
               GXutil.writeLogRaw("Old: ",Z3379ProForTnq);
               GXutil.writeLogRaw("Current: ",T01TL2_A3379ProForTnq[0]);
            }
            if ( DecimalUtil.compareTo(Z6062ProForCPo, T01TL2_A6062ProForCPo[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForCPo");
               GXutil.writeLogRaw("Old: ",Z6062ProForCPo);
               GXutil.writeLogRaw("Current: ",T01TL2_A6062ProForCPo[0]);
            }
            if ( GXutil.strcmp(Z13178ProForFT, T01TL2_A13178ProForFT[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForFT");
               GXutil.writeLogRaw("Old: ",Z13178ProForFT);
               GXutil.writeLogRaw("Current: ",T01TL2_A13178ProForFT[0]);
            }
            if ( GXutil.strcmp(Z763ProForCla, T01TL2_A763ProForCla[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForCla");
               GXutil.writeLogRaw("Old: ",Z763ProForCla);
               GXutil.writeLogRaw("Current: ",T01TL2_A763ProForCla[0]);
            }
            if ( GXutil.strcmp(Z5358ProForClv, T01TL2_A5358ProForClv[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ProForClv");
               GXutil.writeLogRaw("Old: ",Z5358ProForClv);
               GXutil.writeLogRaw("Current: ",T01TL2_A5358ProForClv[0]);
            }
            if ( Z490ForPrdUMe != T01TL2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_2:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01TL2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TL90( )
   {
      beforeValidate1TL90( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TL90( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TL90( 0) ;
         checkOptimisticConcurrency1TL90( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TL90( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TL90( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TL32 */
                  pr_default.execute(16, new Object[] {Short.valueOf(A767ProForLin), A770ProForPrd, A765ProForDes, A13111ProForDe2, A762ProForCan, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A6062ProForCPo, A13178ProForFT, A763ProForCla, A5358ProForClv, A396EmprCod, A764ProForCod, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                  if ( (pr_default.getStatus(16) == 1) )
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
                        resetCaption1TL0( ) ;
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
            load1TL90( ) ;
         }
         endLevel1TL90( ) ;
      }
      closeExtendedTableCursors1TL90( ) ;
   }

   public void update1TL90( )
   {
      beforeValidate1TL90( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TL90( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TL90( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TL90( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TL90( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TL33 */
                  pr_default.execute(17, new Object[] {A770ProForPrd, A765ProForDes, A13111ProForDe2, A762ProForCan, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A6062ProForCPo, A13178ProForFT, A763ProForCla, A5358ProForClv, Byte.valueOf(A490ForPrdUMe), A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TL90( ) ;
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
         endLevel1TL90( ) ;
      }
      closeExtendedTableCursors1TL90( ) ;
   }

   public void deferredUpdate1TL90( )
   {
   }

   public void delete( )
   {
      beforeValidate1TL90( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TL90( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TL90( ) ;
         afterConfirm1TL90( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TL90( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TL34 */
               pr_default.execute(18, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
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
      sMode90 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TL90( ) ;
      Gx_mode = sMode90 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TL90( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A768ProForLinV = A767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
         AV23oldProforlin = O767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23oldProforlin), 4, 0));
         AV34Un = O490ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Un", GXutil.str( AV34Un, 1, 0));
         AV22oldCant = O762ProForCan ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22oldCant", GXutil.ltrimstr( AV22oldCant, 12, 5));
         /* Using cursor T01TL35 */
         pr_default.execute(19, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01TL35_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01TL35_n488ForPrdDsc[0] ;
         pr_default.close(19);
         /* Using cursor T01TL36 */
         pr_default.execute(20, new Object[] {A396EmprCod, A770ProForPrd});
         if ( (pr_default.getStatus(20) != 101) )
         {
            A710PrdFind = T01TL36_A710PrdFind[0] ;
            n710PrdFind = T01TL36_n710PrdFind[0] ;
         }
         else
         {
            A710PrdFind = "xxxxxx" ;
            n710PrdFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
         }
         pr_default.close(20);
         GXt_char1 = A13976PrdNomForm ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A770ProForPrd ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         procesoquimico_2_impl.this.A396EmprCod = GXv_char4[0] ;
         procesoquimico_2_impl.this.A770ProForPrd = GXv_char3[0] ;
         procesoquimico_2_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
         A13976PrdNomForm = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13976PrdNomForm", A13976PrdNomForm);
         /* Using cursor T01TL39 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            A4340PrdUMeFind = T01TL39_A4340PrdUMeFind[0] ;
            n4340PrdUMeFind = T01TL39_n4340PrdUMeFind[0] ;
         }
         else
         {
            A4340PrdUMeFind = (byte)(0) ;
            n4340PrdUMeFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
         }
         pr_default.close(21);
         /* Using cursor T01TL45 */
         pr_default.execute(22, new Object[] {Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            A717PrdMaxFind = T01TL45_A717PrdMaxFind[0] ;
            n717PrdMaxFind = T01TL45_n717PrdMaxFind[0] ;
         }
         else
         {
            A717PrdMaxFind = "" ;
            n717PrdMaxFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
         }
         pr_default.close(22);
         if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
         {
            AV45Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV22oldCant, 12, 5) + GXutil.trim( GXutil.str( AV34Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45Msg_e", AV45Msg_e);
         }
         AV46Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Msg_del", AV46Msg_del);
         if ( isDlt( )  && true /* Level */ )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV46Msg_del, A767ProForLin, (byte)(0), "@") ;
         }
      }
   }

   public void endLevel1TL90( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TL90( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.procesoquimico_2");
         if ( AnyError == 0 )
         {
            confirmValues1TL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.procesoquimico_2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TL90( )
   {
      /* Scan By routine */
      /* Using cursor T01TL46 */
      pr_default.execute(23);
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A396EmprCod = T01TL46_A396EmprCod[0] ;
         A764ProForCod = T01TL46_A764ProForCod[0] ;
         A767ProForLin = T01TL46_A767ProForLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TL90( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A396EmprCod = T01TL46_A396EmprCod[0] ;
         A764ProForCod = T01TL46_A764ProForCod[0] ;
         A767ProForLin = T01TL46_A767ProForLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      }
   }

   public void scanEnd1TL90( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1TL90( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ )
      {
         AV45Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " IN Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Msg_e", AV45Msg_e);
      }
      if ( isIns( )  && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV45Msg_e, A767ProForLin, (byte)(0), "@") ;
      }
   }

   public void beforeInsert1TL90( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A767ProForLin) )
      {
         GXt_int11 = A767ProForLin ;
         GXv_int10[0] = GXt_int11 ;
         new app.formulaciontinte.procesoquimico_prxlinea(remoteHandle, context).execute( A396EmprCod, A764ProForCod, GXv_int10) ;
         procesoquimico_2_impl.this.GXt_int11 = GXv_int10[0] ;
         A767ProForLin = GXt_int11 ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      }
   }

   public void beforeUpdate1TL90( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TL90( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TL90( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TL90( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TL90( )
   {
      edtProForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), true);
      edtProForPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPrd_Enabled), 5, 0), true);
      edtProForDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDes_Enabled), 5, 0), true);
      edtProForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCan_Enabled), 5, 0), true);
      dynForPrdUMe.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynForPrdUMe.getInternalname(), "Enabled", GXutil.ltrimstr( dynForPrdUMe.getEnabled(), 5, 0), true);
      edtProForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForNro_Enabled), 5, 0), true);
      edtProForTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTnq_Enabled), 5, 0), true);
      edtProForCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), true);
      edtProForClv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboproforprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforprd_Enabled), 5, 0), true);
      edtProForUli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForUli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForUli_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TL90( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TL0( )
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.procesoquimico_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV26ProForCod)),GXutil.URLEncode(GXutil.ltrimstr(AV27ProForLin,4,0))}, new String[] {"Gx_mode","EmprCod","ProForCod","ProForLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ProcesoQuimico_2");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV49Pgmname, "")));
      forbiddenHiddens.add("ProForDe2", GXutil.rtrim( localUtil.format( A13111ProForDe2, "")));
      forbiddenHiddens.add("ProForCPo", localUtil.format( A6062ProForCPo, "ZZ9.99"));
      forbiddenHiddens.add("ProForFT", GXutil.rtrim( localUtil.format( A13178ProForFT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\procesoquimico_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z767ProForLin", GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z770ProForPrd", GXutil.rtrim( Z770ProForPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z765ProForDes", GXutil.rtrim( Z765ProForDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13111ProForDe2", GXutil.rtrim( Z13111ProForDe2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z762ProForCan", GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1645ProForNro", GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3379ProForTnq", GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6062ProForCPo", GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13178ProForFT", GXutil.rtrim( Z13178ProForFT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z763ProForCla", GXutil.rtrim( Z763ProForCla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5358ProForClv", GXutil.rtrim( Z5358ProForClv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O762ProForCan", GXutil.ltrim( localUtil.ntoc( O762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O767ProForLin", GXutil.ltrim( localUtil.ntoc( O767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O763ProForCla", GXutil.rtrim( O763ProForCla));
      app.GxWebStd.gx_hidden_field( httpContext, "O5358ProForClv", GXutil.rtrim( O5358ProForClv));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORPRD_DATA", AV41ProForPrd_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORPRD_DATA", AV41ProForPrd_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOMFORM", GXutil.rtrim( A13976PrdNomForm));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLINV", GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORCOD", GXutil.rtrim( AV26ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ProForCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD", GXutil.rtrim( A764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORLIN", GXutil.ltrim( localUtil.ntoc( AV27ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27ProForLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FORPRDUME", GXutil.ltrim( localUtil.ntoc( AV17Insert_ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFIND", GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIND", GXutil.rtrim( A710PrdFind));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDCANT", GXutil.ltrim( localUtil.ntoc( AV22oldCant, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUN", GXutil.ltrim( localUtil.ntoc( AV34Un, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPROFORLIN", GXutil.ltrim( localUtil.ntoc( AV23oldProforlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_E", AV45Msg_e);
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_DEL", AV46Msg_del);
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCPO", GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORFT", GXutil.rtrim( A13178ProForFT));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV35UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV28Station));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDE2", GXutil.rtrim( A13111ProForDe2));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDMAXFIND", GXutil.rtrim( A717PrdMaxFind));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC", GXutil.rtrim( A766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC2", GXutil.rtrim( A4715ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORPRD_Objectcall", GXutil.rtrim( Combo_proforprd_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORPRD_Cls", GXutil.rtrim( Combo_proforprd_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORPRD_Selectedvalue_set", GXutil.rtrim( Combo_proforprd_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORPRD_Enabled", GXutil.booltostr( Combo_proforprd_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORPRD_Emptyitemtext", GXutil.rtrim( Combo_proforprd_Emptyitemtext));
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
      if ( ! ( WebComp_Wcprocesoquimico_4 == null ) )
      {
         WebComp_Wcprocesoquimico_4.componentjscripts();
      }
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcprocesoquimico_4_Component) != 0 )
            {
               WebComp_Wcprocesoquimico_4.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcprocesoquimico_4_Component) != 0 )
            {
               WebComp_Wcprocesoquimico_4.componentstart();
            }
         }
      }
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
      return formatLink("app.formulaciontinte.procesoquimico_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV26ProForCod)),GXutil.URLEncode(GXutil.ltrimstr(AV27ProForLin,4,0))}, new String[] {"Gx_mode","EmprCod","ProForCod","ProForLin"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ProcesoQuimico_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Proceso Quimico (Lineas)", "") ;
   }

   public void initializeNonKey1TL90( )
   {
      A490ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      A770ProForPrd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
      A765ProForDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", A765ProForDes);
      AV22oldCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22oldCant", GXutil.ltrimstr( AV22oldCant, 12, 5));
      AV34Un = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Un", GXutil.str( AV34Un, 1, 0));
      AV23oldProforlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23oldProforlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23oldProforlin), 4, 0));
      AV45Msg_e = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Msg_e", AV45Msg_e);
      AV46Msg_del = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Msg_del", AV46Msg_del);
      A4340PrdUMeFind = (byte)(0) ;
      n4340PrdUMeFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      A768ProForLinV = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      A710PrdFind = "" ;
      n710PrdFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
      A717PrdMaxFind = "" ;
      n717PrdMaxFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
      A13976PrdNomForm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13976PrdNomForm", A13976PrdNomForm);
      A13111ProForDe2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13111ProForDe2", A13111ProForDe2);
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A762ProForCan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
      A1645ProForNro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1645ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1645ProForNro), 2, 0));
      A3379ProForTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3379ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3379ProForTnq), 2, 0));
      A763ProForCla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
      A5358ProForClv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
      A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
      A13178ProForFT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
      O762ProForCan = A762ProForCan ;
      httpContext.ajax_rsp_assign_attri("", false, "A762ProForCan", GXutil.ltrimstr( A762ProForCan, 12, 5));
      O490ForPrdUMe = A490ForPrdUMe ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      O763ProForCla = A763ProForCla ;
      httpContext.ajax_rsp_assign_attri("", false, "A763ProForCla", A763ProForCla);
      O5358ProForClv = A5358ProForClv ;
      httpContext.ajax_rsp_assign_attri("", false, "A5358ProForClv", A5358ProForClv);
      Z770ProForPrd = "" ;
      Z765ProForDes = "" ;
      Z13111ProForDe2 = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z1645ProForNro = (byte)(0) ;
      Z3379ProForTnq = (byte)(0) ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z13178ProForFT = "" ;
      Z763ProForCla = "" ;
      Z5358ProForClv = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1TL90( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A764ProForCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      A767ProForLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      initializeNonKey1TL90( ) ;
   }

   public void standaloneModalInsert( )
   {
      A6062ProForCPo = i6062ProForCPo ;
      httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
      A13178ProForFT = i13178ProForFT ;
      httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcprocesoquimico_4 == null ) )
      {
         if ( GXutil.len( WebComp_Wcprocesoquimico_4_Component) != 0 )
         {
            WebComp_Wcprocesoquimico_4.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241512628", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesoquimico_2.js", "?20268241512628", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      Datamonjs_Internalname = "DATAMONJS" ;
      edtProForLin_Internalname = "PROFORLIN" ;
      lblTextblockproforprd_Internalname = "TEXTBLOCKPROFORPRD" ;
      Combo_proforprd_Internalname = "COMBO_PROFORPRD" ;
      edtProForPrd_Internalname = "PROFORPRD" ;
      divTablesplittedproforprd_Internalname = "TABLESPLITTEDPROFORPRD" ;
      edtProForDes_Internalname = "PROFORDES" ;
      edtProForCan_Internalname = "PROFORCAN" ;
      dynForPrdUMe.setInternalname( "FORPRDUME" );
      edtProForNro_Internalname = "PROFORNRO" ;
      edtProForTnq_Internalname = "PROFORTNQ" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtProForCla_Internalname = "PROFORCLA" ;
      edtProForClv_Internalname = "PROFORCLV" ;
      divProforclv_cell_Internalname = "PROFORCLV_CELL" ;
      imgavClaves_Internalname = "vCLAVES" ;
      imgavClavesdel_Internalname = "vCLAVESDEL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablacontenido_Internalname = "TABLACONTENIDO" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboproforprd_Internalname = "vCOMBOPROFORPRD" ;
      divSectionattribute_proforprd_Internalname = "SECTIONATTRIBUTE_PROFORPRD" ;
      edtProForUli_Internalname = "PROFORULI" ;
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
      Form.setCaption( httpContext.getMessage( "Proceso Quimico (Lineas)", "") );
      edtProForUli_Jsonclick = "" ;
      edtProForUli_Enabled = 0 ;
      edtProForUli_Visible = 1 ;
      edtavComboproforprd_Jsonclick = "" ;
      edtavComboproforprd_Enabled = 0 ;
      edtavComboproforprd_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      imgavClavesdel_Jsonclick = "" ;
      imgavClavesdel_gximage = "" ;
      imgavClavesdel_Enabled = 1 ;
      imgavClavesdel_Visible = 1 ;
      imgavClaves_Jsonclick = "" ;
      imgavClaves_gximage = "" ;
      imgavClaves_Enabled = 1 ;
      imgavClaves_Visible = 1 ;
      edtProForClv_Jsonclick = "" ;
      edtProForClv_Enabled = 0 ;
      edtProForClv_Visible = 1 ;
      divProforclv_cell_Class = "col-xs-12 col-sm-5" ;
      edtProForCla_Jsonclick = "" ;
      edtProForCla_Enabled = 0 ;
      edtProForTnq_Jsonclick = "" ;
      edtProForTnq_Enabled = 1 ;
      edtProForNro_Jsonclick = "" ;
      edtProForNro_Enabled = 1 ;
      dynForPrdUMe.setJsonclick( "" );
      dynForPrdUMe.setEnabled( 1 );
      edtProForCan_Jsonclick = "" ;
      edtProForCan_Enabled = 1 ;
      edtProForDes_Jsonclick = "" ;
      edtProForDes_Enabled = 1 ;
      edtProForPrd_Jsonclick = "" ;
      edtProForPrd_Enabled = 1 ;
      edtProForPrd_Visible = 1 ;
      Combo_proforprd_Emptyitemtext = "" ;
      Combo_proforprd_Cls = "ExtendedCombo AttributeFL" ;
      Combo_proforprd_Enabled = GXutil.toBoolean( -1) ;
      edtProForLin_Jsonclick = "" ;
      edtProForLin_Enabled = 1 ;
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

   public void gxdlaforprdume1TL90( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaforprdume_data1TL90( A396EmprCod) ;
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

   public void gxaforprdume_html1TL90( String A396EmprCod )
   {
      byte gxdynajaxvalue;
      gxdlaforprdume_data1TL90( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynForPrdUMe.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynForPrdUMe.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 1, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaforprdume_data1TL90( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T01TL47 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(24) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T01TL47_A490ForPrdUMe[0], (byte)(1), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(T01TL47_A13746ForPrdCDsc[0]);
         pr_default.readNext(24);
      }
      pr_default.close(24);
   }

   public void gx4asaprdnomform1TL90( String A396EmprCod ,
                                      String A770ProForPrd )
   {
      GXt_char1 = A13976PrdNomForm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A770ProForPrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      procesoquimico_2_impl.this.A396EmprCod = GXv_char4[0] ;
      procesoquimico_2_impl.this.A770ProForPrd = GXv_char3[0] ;
      procesoquimico_2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A770ProForPrd", A770ProForPrd);
      A13976PrdNomForm = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13976PrdNomForm", A13976PrdNomForm);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13976PrdNomForm))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx10asaproforlin1TL90( short AV27ProForLin )
   {
      if ( ! (0==AV27ProForLin) )
      {
         A767ProForLin = AV27ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx11asaproforlin1TL90( short A767ProForLin ,
                                      String A396EmprCod ,
                                      String A764ProForCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A767ProForLin) )
      {
         GXt_int11 = A767ProForLin ;
         GXv_int10[0] = GXt_int11 ;
         new app.formulaciontinte.procesoquimico_prxlinea(remoteHandle, context).execute( A396EmprCod, A764ProForCod, GXv_int10) ;
         procesoquimico_2_impl.this.GXt_int11 = GXv_int10[0] ;
         A767ProForLin = GXt_int11 ;
         httpContext.ajax_rsp_assign_attri("", false, "A767ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A767ProForLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa53581TL90( String A396EmprCod )
   {
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLAVE2", ""), ""), GXv_int7) ;
      procesoquimico_2_impl.this.GXt_int6 = GXv_int7[0] ;
      edtProForClv_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Visible), 5, 0), true);
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

   public void xc_33_1TL90( String Gx_mode ,
                            String A396EmprCod ,
                            String AV49Pgmname ,
                            String AV35UsurCod ,
                            String AV28Station ,
                            String AV45Msg_e ,
                            short A767ProForLin )
   {
      if ( isIns( )  && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV45Msg_e, A767ProForLin, (byte)(0), "@") ;
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

   public void xc_34_1TL90( String Gx_mode ,
                            String A396EmprCod ,
                            String AV49Pgmname ,
                            String AV35UsurCod ,
                            String AV28Station ,
                            String AV45Msg_e ,
                            short A767ProForLin ,
                            java.math.BigDecimal A762ProForCan ,
                            byte A490ForPrdUMe ,
                            String A763ProForCla ,
                            String A5358ProForClv )
   {
      if ( isUpd( )  && true /* Level */ && ( ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) || ( A490ForPrdUMe != O490ForPrdUMe ) || ( GXutil.strcmp(A763ProForCla, O763ProForCla) != 0 ) || ( GXutil.strcmp(A5358ProForClv, O5358ProForClv) != 0 ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV45Msg_e, 99999999, (byte)(0), "@") ;
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

   public void xc_35_1TL90( String Gx_mode ,
                            String A396EmprCod ,
                            String AV49Pgmname ,
                            String AV35UsurCod ,
                            String AV28Station ,
                            String AV46Msg_del ,
                            short A767ProForLin )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV46Msg_del, A767ProForLin, (byte)(0), "@") ;
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

   public void init_web_controls( )
   {
      dynForPrdUMe.setName( "FORPRDUME" );
      dynForPrdUMe.setWebtags( "" );
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

   public void valid_Proforlin( )
   {
      A490ForPrdUMe = (byte)(GXutil.lval( dynForPrdUMe.getValue())) ;
      n717PrdMaxFind = false ;
      A768ProForLinV = A767ProForLin ;
      /* Using cursor T01TL53 */
      pr_default.execute(25, new Object[] {Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV), Short.valueOf(A768ProForLinV)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A717PrdMaxFind = T01TL53_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01TL53_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
      }
      pr_default.close(25);
      AV23oldProforlin = O767ProForLin ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", GXutil.rtrim( A717PrdMaxFind));
      httpContext.ajax_rsp_assign_attri("", false, "AV23oldProforlin", GXutil.ltrim( localUtil.ntoc( AV23oldProforlin, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Proforprd( )
   {
      n710PrdFind = false ;
      n4340PrdUMeFind = false ;
      A490ForPrdUMe = (byte)(GXutil.lval( dynForPrdUMe.getValue())) ;
      /* Using cursor T01TL54 */
      pr_default.execute(26, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A710PrdFind = T01TL54_A710PrdFind[0] ;
         n710PrdFind = T01TL54_n710PrdFind[0] ;
      }
      else
      {
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
      }
      pr_default.close(26);
      /* Using cursor T01TL57 */
      pr_default.execute(27, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A4340PrdUMeFind = T01TL57_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01TL57_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
      }
      pr_default.close(27);
      GXt_char1 = A13976PrdNomForm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A770ProForPrd ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      procesoquimico_2_impl.this.A396EmprCod = GXv_char4[0] ;
      procesoquimico_2_impl.this.A770ProForPrd = GXv_char3[0] ;
      procesoquimico_2_impl.this.GXt_char1 = GXv_char2[0] ;
      A13976PrdNomForm = GXt_char1 ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_ForPrdUMe) )
      {
         A490ForPrdUMe = AV17Insert_ForPrdUMe ;
      }
      else
      {
         if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && ! (GXutil.strcmp("", A770ProForPrd)==0) && isIns( )  )
         {
            A490ForPrdUMe = A4340PrdUMeFind ;
         }
      }
      if ( ( GXutil.strcmp(A710PrdFind, "xxxxxx") != 0 ) && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A765ProForDes = A13976PrdNomForm ;
      }
      dynload_actions( ) ;
      if ( dynForPrdUMe.getItemCount() > 0 )
      {
         A490ForPrdUMe = (byte)(GXutil.lval( dynForPrdUMe.getValidValue(GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0))))) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynForPrdUMe.setValue( GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", GXutil.rtrim( A710PrdFind));
      httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13976PrdNomForm", GXutil.rtrim( A13976PrdNomForm));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      dynForPrdUMe.setValue( GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynForPrdUMe.getInternalname(), "Values", dynForPrdUMe.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A765ProForDes", GXutil.rtrim( A765ProForDes));
   }

   public void valid_Proforcan( )
   {
      A490ForPrdUMe = (byte)(GXutil.lval( dynForPrdUMe.getValue())) ;
      AV22oldCant = O762ProForCan ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV22oldCant", GXutil.ltrim( localUtil.ntoc( AV22oldCant, (byte)(12), (byte)(5), ".", "")));
   }

   public void valid_Forprdume( )
   {
      A490ForPrdUMe = (byte)(GXutil.lval( dynForPrdUMe.getValue())) ;
      n488ForPrdDsc = false ;
      /* Using cursor T01TL58 */
      pr_default.execute(28, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = dynForPrdUMe.getInternalname() ;
      }
      A488ForPrdDsc = T01TL58_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01TL58_n488ForPrdDsc[0] ;
      pr_default.close(28);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = dynForPrdUMe.getInternalname() ;
      }
      AV34Un = O490ForPrdUMe ;
      AV46Msg_del = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( " DEL Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Producto=", "") + GXutil.trim( A770ProForPrd) + httpContext.getMessage( " Un=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant= ", "") + GXutil.str( A762ProForCan, 12, 5) ;
      if ( isDlt( )  && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV46Msg_del, A767ProForLin, (byte)(0), "@") ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Un", GXutil.ltrim( localUtil.ntoc( AV34Un, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV46Msg_del", AV46Msg_del);
   }

   public void valid_Proforclv( )
   {
      A490ForPrdUMe = (byte)(GXutil.lval( dynForPrdUMe.getValue())) ;
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) )
      {
         AV45Msg_e = httpContext.getMessage( "Proceso=", "") + GXutil.trim( A764ProForCod) + httpContext.getMessage( "UPD Linea=", "") + GXutil.str( A767ProForLin, 4, 0) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( httpContext.getMessage( " Cant New=", ""), "") + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + httpContext.getMessage( " Un New=", "") + GXutil.str( A490ForPrdUMe, 1, 0) + httpContext.getMessage( " Cant Old=", "") + GXutil.str( AV22oldCant, 12, 5) + GXutil.trim( GXutil.str( AV34Un, 1, 0)) + httpContext.getMessage( "Clave= ", "") + A763ProForCla + httpContext.getMessage( "ClaveII= ", "") + A5358ProForClv ;
      }
      if ( isUpd( )  && true /* Level */ && ( ( DecimalUtil.compareTo(A762ProForCan, O762ProForCan) != 0 ) || ( A490ForPrdUMe != O490ForPrdUMe ) || ( GXutil.strcmp(A763ProForCla, O763ProForCla) != 0 ) || ( GXutil.strcmp(A5358ProForClv, O5358ProForClv) != 0 ) ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV35UsurCod, AV28Station, AV45Msg_e, 99999999, (byte)(0), "@") ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV45Msg_e", AV45Msg_e);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26ProForCod',fld:'vPROFORCOD',pic:'',hsh:true},{av:'AV27ProForLin',fld:'vPROFORLIN',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26ProForCod',fld:'vPROFORCOD',pic:'',hsh:true},{av:'AV27ProForLin',fld:'vPROFORLIN',pic:'ZZZ9',hsh:true},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'A13111ProForDe2',fld:'PROFORDE2',pic:''},{av:'A6062ProForCPo',fld:'PROFORCPO',pic:'ZZ9.99'},{av:'A13178ProForFT',fld:'PROFORFT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e141TL2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VCLAVES.CLICK","{handler:'e151TL2',iparms:[{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A773ProForUli',fld:'PROFORULI',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VCLAVES.CLICK",",oparms:[{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A773ProForUli',fld:'PROFORULI',pic:'ZZZ9'},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("FORPRDUME.CLICK","{handler:'e111TL90',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("FORPRDUME.CLICK",",oparms:[{av:'AV17Insert_ForPrdUMe',fld:'vINSERT_FORPRDUME',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VCLAVESDEL.CLICK","{handler:'e121TL90',iparms:[{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'AV40Clavesdel',fld:'vCLAVESDEL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VCLAVESDEL.CLICK",",oparms:[{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_PROFORLIN","{handler:'valid_Proforlin',iparms:[{av:'O767ProForLin'},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A768ProForLinV',fld:'PROFORLINV',pic:'ZZZ9'},{av:'A717PrdMaxFind',fld:'PRDMAXFIND',pic:''},{av:'AV23oldProforlin',fld:'vOLDPROFORLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PROFORLIN",",oparms:[{av:'A768ProForLinV',fld:'PROFORLINV',pic:'ZZZ9'},{av:'A717PrdMaxFind',fld:'PRDMAXFIND',pic:''},{av:'AV23oldProforlin',fld:'vOLDPROFORLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_PROFORPRD","{handler:'valid_Proforprd',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A710PrdFind',fld:'PRDFIND',pic:''},{av:'AV17Insert_ForPrdUMe',fld:'vINSERT_FORPRDUME',pic:'9'},{av:'A4340PrdUMeFind',fld:'PRDUMEFIND',pic:'9'},{av:'A13976PrdNomForm',fld:'PRDNOMFORM',pic:''},{av:'A765ProForDes',fld:'PROFORDES',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PROFORPRD",",oparms:[{av:'A710PrdFind',fld:'PRDFIND',pic:''},{av:'A4340PrdUMeFind',fld:'PRDUMEFIND',pic:'9'},{av:'A13976PrdNomForm',fld:'PRDNOMFORM',pic:''},{av:'A765ProForDes',fld:'PROFORDES',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_PROFORDES","{handler:'valid_Profordes',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PROFORDES",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_PROFORCAN","{handler:'valid_Proforcan',iparms:[{av:'O762ProForCan'},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV22oldCant',fld:'vOLDCANT',pic:'ZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PROFORCAN",",oparms:[{av:'AV22oldCant',fld:'vOLDCANT',pic:'ZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O490ForPrdUMe'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV28Station',fld:'vSTATION',pic:''},{av:'AV46Msg_del',fld:'vMSG_DEL',pic:''},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'AV34Un',fld:'vUN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'AV34Un',fld:'vUN',pic:'9'},{av:'AV46Msg_del',fld:'vMSG_DEL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_PROFORCLA","{handler:'valid_Proforcla',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PROFORCLA",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_PROFORCLV","{handler:'valid_Proforclv',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O5358ProForClv'},{av:'O763ProForCla'},{av:'O490ForPrdUMe'},{av:'O762ProForCan'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A762ProForCan',fld:'PROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV22oldCant',fld:'vOLDCANT',pic:'ZZZZZ9.9999'},{av:'AV34Un',fld:'vUN',pic:'9'},{av:'A763ProForCla',fld:'PROFORCLA',pic:''},{av:'A5358ProForClv',fld:'PROFORCLV',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV28Station',fld:'vSTATION',pic:''},{av:'AV45Msg_e',fld:'vMSG_E',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PROFORCLV",",oparms:[{av:'AV45Msg_e',fld:'vMSG_E',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALIDV_COMBOPROFORPRD","{handler:'validv_Comboproforprd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALIDV_COMBOPROFORPRD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
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
      pr_default.close(28);
      pr_default.close(19);
      pr_default.close(27);
      pr_default.close(21);
      pr_default.close(26);
      pr_default.close(20);
      pr_default.close(25);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV11EmprCod = "" ;
      wcpOAV26ProForCod = "" ;
      Z396EmprCod = "" ;
      Z764ProForCod = "" ;
      Z770ProForPrd = "" ;
      Z765ProForDes = "" ;
      Z13111ProForDe2 = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z13178ProForFT = "" ;
      Z763ProForCla = "" ;
      Z5358ProForClv = "" ;
      O762ProForCan = DecimalUtil.ZERO ;
      O763ProForCla = "" ;
      O5358ProForClv = "" ;
      Combo_proforprd_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV49Pgmname = "" ;
      AV35UsurCod = "" ;
      AV28Station = "" ;
      AV45Msg_e = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      AV46Msg_del = "" ;
      A770ProForPrd = "" ;
      A764ProForCod = "" ;
      A710PrdFind = "" ;
      AV11EmprCod = "" ;
      AV26ProForCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcprocesoquimico_4_Component = "" ;
      OldWcprocesoquimico_4 = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockproforprd_Jsonclick = "" ;
      ucCombo_proforprd = new com.genexus.webpanels.GXUserControl();
      Combo_proforprd_Caption = "" ;
      AV41ProForPrd_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A765ProForDes = "" ;
      AV39Claves = "" ;
      AV51Claves_GXI = "" ;
      sImgUrl = "" ;
      AV40Clavesdel = "" ;
      AV52Clavesdel_GXI = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV42ComboProForPrd = "" ;
      A13111ProForDe2 = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A13178ProForFT = "" ;
      A13976PrdNomForm = "" ;
      AV22oldCant = DecimalUtil.ZERO ;
      A717PrdMaxFind = "" ;
      A407EmprNom = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      A488ForPrdDsc = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_proforprd_Objectcall = "" ;
      Combo_proforprd_Class = "" ;
      Combo_proforprd_Icontype = "" ;
      Combo_proforprd_Icon = "" ;
      Combo_proforprd_Tooltip = "" ;
      Combo_proforprd_Selectedvalue_set = "" ;
      Combo_proforprd_Selectedtext_set = "" ;
      Combo_proforprd_Selectedtext_get = "" ;
      Combo_proforprd_Gamoauthtoken = "" ;
      Combo_proforprd_Ddointernalname = "" ;
      Combo_proforprd_Titlecontrolalign = "" ;
      Combo_proforprd_Dropdownoptionstype = "" ;
      Combo_proforprd_Titlecontrolidtoreplace = "" ;
      Combo_proforprd_Datalisttype = "" ;
      Combo_proforprd_Datalistfixedvalues = "" ;
      Combo_proforprd_Datalistproc = "" ;
      Combo_proforprd_Datalistprocparametersprefix = "" ;
      Combo_proforprd_Remoteservicesparameters = "" ;
      Combo_proforprd_Htmltemplate = "" ;
      Combo_proforprd_Multiplevaluestype = "" ;
      Combo_proforprd_Loadingdata = "" ;
      Combo_proforprd_Noresultsfound = "" ;
      Combo_proforprd_Onlyselectedvalues = "" ;
      Combo_proforprd_Selectalltext = "" ;
      Combo_proforprd_Multiplevaluesseparator = "" ;
      Combo_proforprd_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode90 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12EmprNom = "" ;
      AV38WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV32TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      AV33TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV10ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      AV44Proforprd = "" ;
      Z407EmprNom = "" ;
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z710PrdFind = "" ;
      Z488ForPrdDsc = "" ;
      T01TL13_A407EmprNom = new String[] {""} ;
      T01TL13_n407EmprNom = new boolean[] {false} ;
      T01TL14_A766ProForDsc = new String[] {""} ;
      T01TL14_A4715ProForDsc2 = new String[] {""} ;
      T01TL14_A773ProForUli = new short[1] ;
      T01TL12_A717PrdMaxFind = new String[] {""} ;
      T01TL12_n717PrdMaxFind = new boolean[] {false} ;
      T01TL16_A710PrdFind = new String[] {""} ;
      T01TL16_n710PrdFind = new boolean[] {false} ;
      T01TL6_A4340PrdUMeFind = new byte[1] ;
      T01TL6_n4340PrdUMeFind = new boolean[] {false} ;
      T01TL17_A719PrdNum = new String[] {""} ;
      T01TL17_A767ProForLin = new short[1] ;
      T01TL17_A770ProForPrd = new String[] {""} ;
      T01TL17_A765ProForDes = new String[] {""} ;
      T01TL17_A407EmprNom = new String[] {""} ;
      T01TL17_n407EmprNom = new boolean[] {false} ;
      T01TL17_A766ProForDsc = new String[] {""} ;
      T01TL17_A4715ProForDsc2 = new String[] {""} ;
      T01TL17_A773ProForUli = new short[1] ;
      T01TL17_A13111ProForDe2 = new String[] {""} ;
      T01TL17_A488ForPrdDsc = new String[] {""} ;
      T01TL17_n488ForPrdDsc = new boolean[] {false} ;
      T01TL17_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TL17_A1645ProForNro = new byte[1] ;
      T01TL17_A3379ProForTnq = new byte[1] ;
      T01TL17_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TL17_A13178ProForFT = new String[] {""} ;
      T01TL17_A763ProForCla = new String[] {""} ;
      T01TL17_A5358ProForClv = new String[] {""} ;
      T01TL17_A396EmprCod = new String[] {""} ;
      T01TL17_A764ProForCod = new String[] {""} ;
      T01TL17_A490ForPrdUMe = new byte[1] ;
      T01TL17_A710PrdFind = new String[] {""} ;
      T01TL17_n710PrdFind = new boolean[] {false} ;
      T01TL15_A488ForPrdDsc = new String[] {""} ;
      T01TL15_n488ForPrdDsc = new boolean[] {false} ;
      T01TL18_A710PrdFind = new String[] {""} ;
      T01TL18_n710PrdFind = new boolean[] {false} ;
      T01TL21_A4340PrdUMeFind = new byte[1] ;
      T01TL21_n4340PrdUMeFind = new boolean[] {false} ;
      T01TL27_A717PrdMaxFind = new String[] {""} ;
      T01TL27_n717PrdMaxFind = new boolean[] {false} ;
      T01TL28_A488ForPrdDsc = new String[] {""} ;
      T01TL28_n488ForPrdDsc = new boolean[] {false} ;
      T01TL29_A396EmprCod = new String[] {""} ;
      T01TL29_A764ProForCod = new String[] {""} ;
      T01TL29_A767ProForLin = new short[1] ;
      T01TL3_A767ProForLin = new short[1] ;
      T01TL3_A770ProForPrd = new String[] {""} ;
      T01TL3_A765ProForDes = new String[] {""} ;
      T01TL3_A13111ProForDe2 = new String[] {""} ;
      T01TL3_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TL3_A1645ProForNro = new byte[1] ;
      T01TL3_A3379ProForTnq = new byte[1] ;
      T01TL3_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TL3_A13178ProForFT = new String[] {""} ;
      T01TL3_A763ProForCla = new String[] {""} ;
      T01TL3_A5358ProForClv = new String[] {""} ;
      T01TL3_A396EmprCod = new String[] {""} ;
      T01TL3_A764ProForCod = new String[] {""} ;
      T01TL3_A490ForPrdUMe = new byte[1] ;
      T01TL30_A396EmprCod = new String[] {""} ;
      T01TL30_A764ProForCod = new String[] {""} ;
      T01TL30_A767ProForLin = new short[1] ;
      T01TL31_A396EmprCod = new String[] {""} ;
      T01TL31_A764ProForCod = new String[] {""} ;
      T01TL31_A767ProForLin = new short[1] ;
      T01TL2_A767ProForLin = new short[1] ;
      T01TL2_A770ProForPrd = new String[] {""} ;
      T01TL2_A765ProForDes = new String[] {""} ;
      T01TL2_A13111ProForDe2 = new String[] {""} ;
      T01TL2_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TL2_A1645ProForNro = new byte[1] ;
      T01TL2_A3379ProForTnq = new byte[1] ;
      T01TL2_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TL2_A13178ProForFT = new String[] {""} ;
      T01TL2_A763ProForCla = new String[] {""} ;
      T01TL2_A5358ProForClv = new String[] {""} ;
      T01TL2_A396EmprCod = new String[] {""} ;
      T01TL2_A764ProForCod = new String[] {""} ;
      T01TL2_A490ForPrdUMe = new byte[1] ;
      T01TL35_A488ForPrdDsc = new String[] {""} ;
      T01TL35_n488ForPrdDsc = new boolean[] {false} ;
      T01TL36_A710PrdFind = new String[] {""} ;
      T01TL36_n710PrdFind = new boolean[] {false} ;
      T01TL39_A4340PrdUMeFind = new byte[1] ;
      T01TL39_n4340PrdUMeFind = new boolean[] {false} ;
      T01TL45_A717PrdMaxFind = new String[] {""} ;
      T01TL45_n717PrdMaxFind = new boolean[] {false} ;
      T01TL46_A396EmprCod = new String[] {""} ;
      T01TL46_A764ProForCod = new String[] {""} ;
      T01TL46_A767ProForLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i6062ProForCPo = DecimalUtil.ZERO ;
      i13178ProForFT = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T01TL47_A396EmprCod = new String[] {""} ;
      T01TL47_A490ForPrdUMe = new byte[1] ;
      T01TL47_A13746ForPrdCDsc = new String[] {""} ;
      GXv_int10 = new short[1] ;
      GXv_int7 = new byte[1] ;
      T01TL53_A717PrdMaxFind = new String[] {""} ;
      T01TL53_n717PrdMaxFind = new boolean[] {false} ;
      Z717PrdMaxFind = "" ;
      T01TL54_A710PrdFind = new String[] {""} ;
      T01TL54_n710PrdFind = new boolean[] {false} ;
      T01TL57_A4340PrdUMeFind = new byte[1] ;
      T01TL57_n4340PrdUMeFind = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z13976PrdNomForm = "" ;
      ZV22oldCant = DecimalUtil.ZERO ;
      T01TL58_A488ForPrdDsc = new String[] {""} ;
      T01TL58_n488ForPrdDsc = new boolean[] {false} ;
      ZV46Msg_del = "" ;
      ZV45Msg_e = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_2__default(),
         new Object[] {
             new Object[] {
            T01TL2_A767ProForLin, T01TL2_A770ProForPrd, T01TL2_A765ProForDes, T01TL2_A13111ProForDe2, T01TL2_A762ProForCan, T01TL2_A1645ProForNro, T01TL2_A3379ProForTnq, T01TL2_A6062ProForCPo, T01TL2_A13178ProForFT, T01TL2_A763ProForCla,
            T01TL2_A5358ProForClv, T01TL2_A396EmprCod, T01TL2_A764ProForCod, T01TL2_A490ForPrdUMe
            }
            , new Object[] {
            T01TL3_A767ProForLin, T01TL3_A770ProForPrd, T01TL3_A765ProForDes, T01TL3_A13111ProForDe2, T01TL3_A762ProForCan, T01TL3_A1645ProForNro, T01TL3_A3379ProForTnq, T01TL3_A6062ProForCPo, T01TL3_A13178ProForFT, T01TL3_A763ProForCla,
            T01TL3_A5358ProForClv, T01TL3_A396EmprCod, T01TL3_A764ProForCod, T01TL3_A490ForPrdUMe
            }
            , new Object[] {
            T01TL6_A4340PrdUMeFind, T01TL6_n4340PrdUMeFind
            }
            , new Object[] {
            T01TL12_A717PrdMaxFind, T01TL12_n717PrdMaxFind
            }
            , new Object[] {
            T01TL13_A407EmprNom, T01TL13_n407EmprNom
            }
            , new Object[] {
            T01TL14_A766ProForDsc, T01TL14_A4715ProForDsc2, T01TL14_A773ProForUli
            }
            , new Object[] {
            T01TL15_A488ForPrdDsc, T01TL15_n488ForPrdDsc
            }
            , new Object[] {
            T01TL16_A710PrdFind, T01TL16_n710PrdFind
            }
            , new Object[] {
            T01TL17_A719PrdNum, T01TL17_A767ProForLin, T01TL17_A770ProForPrd, T01TL17_A765ProForDes, T01TL17_A407EmprNom, T01TL17_n407EmprNom, T01TL17_A766ProForDsc, T01TL17_A4715ProForDsc2, T01TL17_A773ProForUli, T01TL17_A13111ProForDe2,
            T01TL17_A488ForPrdDsc, T01TL17_n488ForPrdDsc, T01TL17_A762ProForCan, T01TL17_A1645ProForNro, T01TL17_A3379ProForTnq, T01TL17_A6062ProForCPo, T01TL17_A13178ProForFT, T01TL17_A763ProForCla, T01TL17_A5358ProForClv, T01TL17_A396EmprCod,
            T01TL17_A764ProForCod, T01TL17_A490ForPrdUMe, T01TL17_A710PrdFind, T01TL17_n710PrdFind
            }
            , new Object[] {
            T01TL18_A710PrdFind, T01TL18_n710PrdFind
            }
            , new Object[] {
            T01TL21_A4340PrdUMeFind, T01TL21_n4340PrdUMeFind
            }
            , new Object[] {
            T01TL27_A717PrdMaxFind, T01TL27_n717PrdMaxFind
            }
            , new Object[] {
            T01TL28_A488ForPrdDsc, T01TL28_n488ForPrdDsc
            }
            , new Object[] {
            T01TL29_A396EmprCod, T01TL29_A764ProForCod, T01TL29_A767ProForLin
            }
            , new Object[] {
            T01TL30_A396EmprCod, T01TL30_A764ProForCod, T01TL30_A767ProForLin
            }
            , new Object[] {
            T01TL31_A396EmprCod, T01TL31_A764ProForCod, T01TL31_A767ProForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TL35_A488ForPrdDsc, T01TL35_n488ForPrdDsc
            }
            , new Object[] {
            T01TL36_A710PrdFind, T01TL36_n710PrdFind
            }
            , new Object[] {
            T01TL39_A4340PrdUMeFind, T01TL39_n4340PrdUMeFind
            }
            , new Object[] {
            T01TL45_A717PrdMaxFind, T01TL45_n717PrdMaxFind
            }
            , new Object[] {
            T01TL46_A396EmprCod, T01TL46_A764ProForCod, T01TL46_A767ProForLin
            }
            , new Object[] {
            T01TL47_A396EmprCod, T01TL47_A490ForPrdUMe, T01TL47_A13746ForPrdCDsc
            }
            , new Object[] {
            T01TL53_A717PrdMaxFind, T01TL53_n717PrdMaxFind
            }
            , new Object[] {
            T01TL54_A710PrdFind, T01TL54_n710PrdFind
            }
            , new Object[] {
            T01TL57_A4340PrdUMeFind, T01TL57_n4340PrdUMeFind
            }
            , new Object[] {
            T01TL58_A488ForPrdDsc, T01TL58_n488ForPrdDsc
            }
         }
      );
      AV49Pgmname = "FormulacionTinte.ProcesoQuimico_2" ;
      Z13178ProForFT = " " ;
      A13178ProForFT = " " ;
      i13178ProForFT = " " ;
      Z6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      A6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      i6062ProForCPo = DecimalUtil.stringToDec("100.00") ;
      WebComp_Wcprocesoquimico_4 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte Z1645ProForNro ;
   private byte Z3379ProForTnq ;
   private byte Z490ForPrdUMe ;
   private byte O490ForPrdUMe ;
   private byte N490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte AV17Insert_ForPrdUMe ;
   private byte A4340PrdUMeFind ;
   private byte AV34Un ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte Z4340PrdUMeFind ;
   private byte ZV34Un ;
   private short wcpOAV27ProForLin ;
   private short Z767ProForLin ;
   private short O767ProForLin ;
   private short A767ProForLin ;
   private short AV27ProForLin ;
   private short A768ProForLinV ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A773ProForUli ;
   private short AV23oldProforlin ;
   private short RcdFound90 ;
   private short nCmpId ;
   private short AV21ObsPrf ;
   private short AV15FlagLav ;
   private short AV7CdpPor ;
   private short AV29Tecido ;
   private short AV19Lavado ;
   private short AV13Erfoc ;
   private short AV30Texfina ;
   private short AV8Clave2 ;
   private short AV20NoVisible ;
   private short AV36Velta ;
   private short AV14Filasur ;
   private short AV25Pathter ;
   private short AV18jpf ;
   private short AV24Orient ;
   private short AV31tintutex ;
   private short Z773ProForUli ;
   private short nIsDirty_90 ;
   private short GXt_int11 ;
   private short GXv_int10[] ;
   private short Z768ProForLinV ;
   private short ZV23oldProforlin ;
   private int trnEnded ;
   private int edtProForLin_Enabled ;
   private int edtProForPrd_Visible ;
   private int edtProForPrd_Enabled ;
   private int edtProForDes_Enabled ;
   private int edtProForCan_Enabled ;
   private int edtProForNro_Enabled ;
   private int edtProForTnq_Enabled ;
   private int edtProForCla_Enabled ;
   private int edtProForClv_Visible ;
   private int edtProForClv_Enabled ;
   private int imgavClaves_Visible ;
   private int imgavClaves_Enabled ;
   private int imgavClavesdel_Visible ;
   private int imgavClavesdel_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboproforprd_Visible ;
   private int edtavComboproforprd_Enabled ;
   private int edtProForUli_Enabled ;
   private int edtProForUli_Visible ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_proforprd_Datalistupdateminimumcharacters ;
   private int Combo_proforprd_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int AV50GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private java.math.BigDecimal Z762ProForCan ;
   private java.math.BigDecimal Z6062ProForCPo ;
   private java.math.BigDecimal O762ProForCan ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal AV22oldCant ;
   private java.math.BigDecimal i6062ProForCPo ;
   private java.math.BigDecimal ZV22oldCant ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV11EmprCod ;
   private String wcpOAV26ProForCod ;
   private String Z396EmprCod ;
   private String Z764ProForCod ;
   private String Z770ProForPrd ;
   private String Z765ProForDes ;
   private String Z13111ProForDe2 ;
   private String Z13178ProForFT ;
   private String Z763ProForCla ;
   private String Z5358ProForClv ;
   private String O763ProForCla ;
   private String O5358ProForClv ;
   private String Combo_proforprd_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV49Pgmname ;
   private String AV35UsurCod ;
   private String AV28Station ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String A770ProForPrd ;
   private String A764ProForCod ;
   private String A710PrdFind ;
   private String AV11EmprCod ;
   private String AV26ProForCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProForLin_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Datamonjs_Internalname ;
   private String divTablacontenido_Internalname ;
   private String WebComp_Wcprocesoquimico_4_Component ;
   private String OldWcprocesoquimico_4 ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtProForLin_Jsonclick ;
   private String divTablesplittedproforprd_Internalname ;
   private String lblTextblockproforprd_Internalname ;
   private String lblTextblockproforprd_Jsonclick ;
   private String Combo_proforprd_Caption ;
   private String Combo_proforprd_Cls ;
   private String Combo_proforprd_Emptyitemtext ;
   private String Combo_proforprd_Internalname ;
   private String edtProForPrd_Internalname ;
   private String edtProForPrd_Jsonclick ;
   private String edtProForDes_Internalname ;
   private String A765ProForDes ;
   private String edtProForDes_Jsonclick ;
   private String edtProForCan_Internalname ;
   private String edtProForCan_Jsonclick ;
   private String edtProForNro_Internalname ;
   private String edtProForNro_Jsonclick ;
   private String edtProForTnq_Internalname ;
   private String edtProForTnq_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtProForCla_Internalname ;
   private String edtProForCla_Jsonclick ;
   private String divProforclv_cell_Internalname ;
   private String divProforclv_cell_Class ;
   private String edtProForClv_Internalname ;
   private String edtProForClv_Jsonclick ;
   private String imgavClaves_Internalname ;
   private String imgavClaves_gximage ;
   private String sImgUrl ;
   private String imgavClaves_Jsonclick ;
   private String imgavClavesdel_Internalname ;
   private String imgavClavesdel_gximage ;
   private String imgavClavesdel_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_proforprd_Internalname ;
   private String edtavComboproforprd_Internalname ;
   private String AV42ComboProForPrd ;
   private String edtavComboproforprd_Jsonclick ;
   private String edtProForUli_Internalname ;
   private String edtProForUli_Jsonclick ;
   private String A13111ProForDe2 ;
   private String A13178ProForFT ;
   private String A13976PrdNomForm ;
   private String A717PrdMaxFind ;
   private String A407EmprNom ;
   private String A766ProForDsc ;
   private String A4715ProForDsc2 ;
   private String A488ForPrdDsc ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_proforprd_Objectcall ;
   private String Combo_proforprd_Class ;
   private String Combo_proforprd_Icontype ;
   private String Combo_proforprd_Icon ;
   private String Combo_proforprd_Tooltip ;
   private String Combo_proforprd_Selectedvalue_set ;
   private String Combo_proforprd_Selectedtext_set ;
   private String Combo_proforprd_Selectedtext_get ;
   private String Combo_proforprd_Gamoauthtoken ;
   private String Combo_proforprd_Ddointernalname ;
   private String Combo_proforprd_Titlecontrolalign ;
   private String Combo_proforprd_Dropdownoptionstype ;
   private String Combo_proforprd_Titlecontrolidtoreplace ;
   private String Combo_proforprd_Datalisttype ;
   private String Combo_proforprd_Datalistfixedvalues ;
   private String Combo_proforprd_Datalistproc ;
   private String Combo_proforprd_Datalistprocparametersprefix ;
   private String Combo_proforprd_Remoteservicesparameters ;
   private String Combo_proforprd_Htmltemplate ;
   private String Combo_proforprd_Multiplevaluestype ;
   private String Combo_proforprd_Loadingdata ;
   private String Combo_proforprd_Noresultsfound ;
   private String Combo_proforprd_Onlyselectedvalues ;
   private String Combo_proforprd_Selectalltext ;
   private String Combo_proforprd_Multiplevaluesseparator ;
   private String Combo_proforprd_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode90 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12EmprNom ;
   private String AV44Proforprd ;
   private String Z407EmprNom ;
   private String Z766ProForDsc ;
   private String Z4715ProForDsc2 ;
   private String Z710PrdFind ;
   private String Z488ForPrdDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i13178ProForFT ;
   private String gxwrpcisep ;
   private String Z717PrdMaxFind ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13976PrdNomForm ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n710PrdFind ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean AV39Claves_IsBlob ;
   private boolean AV40Clavesdel_IsBlob ;
   private boolean n4340PrdUMeFind ;
   private boolean n717PrdMaxFind ;
   private boolean n407EmprNom ;
   private boolean n488ForPrdDsc ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_proforprd_Enabled ;
   private boolean Combo_proforprd_Visible ;
   private boolean Combo_proforprd_Allowmultipleselection ;
   private boolean Combo_proforprd_Isgriditem ;
   private boolean Combo_proforprd_Hasdescription ;
   private boolean Combo_proforprd_Includeonlyselectedoption ;
   private boolean Combo_proforprd_Includeselectalloption ;
   private boolean Combo_proforprd_Emptyitem ;
   private boolean Combo_proforprd_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcprocesoquimico_4 ;
   private boolean Gx_longc ;
   private boolean gxdyncontrolsrefreshing ;
   private String AV45Msg_e ;
   private String AV46Msg_del ;
   private String AV51Claves_GXI ;
   private String AV52Clavesdel_GXI ;
   private String AV10ComboSelectedValue ;
   private String ZV46Msg_del ;
   private String ZV45Msg_e ;
   private String AV39Claves ;
   private String AV40Clavesdel ;
   private GXWebComponent WebComp_Wcprocesoquimico_4 ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforprd ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice dynForPrdUMe ;
   private IDataStoreProvider pr_default ;
   private String[] T01TL13_A407EmprNom ;
   private boolean[] T01TL13_n407EmprNom ;
   private String[] T01TL14_A766ProForDsc ;
   private String[] T01TL14_A4715ProForDsc2 ;
   private short[] T01TL14_A773ProForUli ;
   private String[] T01TL12_A717PrdMaxFind ;
   private boolean[] T01TL12_n717PrdMaxFind ;
   private String[] T01TL16_A710PrdFind ;
   private boolean[] T01TL16_n710PrdFind ;
   private byte[] T01TL6_A4340PrdUMeFind ;
   private boolean[] T01TL6_n4340PrdUMeFind ;
   private String[] T01TL17_A719PrdNum ;
   private short[] T01TL17_A767ProForLin ;
   private String[] T01TL17_A770ProForPrd ;
   private String[] T01TL17_A765ProForDes ;
   private String[] T01TL17_A407EmprNom ;
   private boolean[] T01TL17_n407EmprNom ;
   private String[] T01TL17_A766ProForDsc ;
   private String[] T01TL17_A4715ProForDsc2 ;
   private short[] T01TL17_A773ProForUli ;
   private String[] T01TL17_A13111ProForDe2 ;
   private String[] T01TL17_A488ForPrdDsc ;
   private boolean[] T01TL17_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01TL17_A762ProForCan ;
   private byte[] T01TL17_A1645ProForNro ;
   private byte[] T01TL17_A3379ProForTnq ;
   private java.math.BigDecimal[] T01TL17_A6062ProForCPo ;
   private String[] T01TL17_A13178ProForFT ;
   private String[] T01TL17_A763ProForCla ;
   private String[] T01TL17_A5358ProForClv ;
   private String[] T01TL17_A396EmprCod ;
   private String[] T01TL17_A764ProForCod ;
   private byte[] T01TL17_A490ForPrdUMe ;
   private String[] T01TL17_A710PrdFind ;
   private boolean[] T01TL17_n710PrdFind ;
   private String[] T01TL15_A488ForPrdDsc ;
   private boolean[] T01TL15_n488ForPrdDsc ;
   private String[] T01TL18_A710PrdFind ;
   private boolean[] T01TL18_n710PrdFind ;
   private byte[] T01TL21_A4340PrdUMeFind ;
   private boolean[] T01TL21_n4340PrdUMeFind ;
   private String[] T01TL27_A717PrdMaxFind ;
   private boolean[] T01TL27_n717PrdMaxFind ;
   private String[] T01TL28_A488ForPrdDsc ;
   private boolean[] T01TL28_n488ForPrdDsc ;
   private String[] T01TL29_A396EmprCod ;
   private String[] T01TL29_A764ProForCod ;
   private short[] T01TL29_A767ProForLin ;
   private short[] T01TL3_A767ProForLin ;
   private String[] T01TL3_A770ProForPrd ;
   private String[] T01TL3_A765ProForDes ;
   private String[] T01TL3_A13111ProForDe2 ;
   private java.math.BigDecimal[] T01TL3_A762ProForCan ;
   private byte[] T01TL3_A1645ProForNro ;
   private byte[] T01TL3_A3379ProForTnq ;
   private java.math.BigDecimal[] T01TL3_A6062ProForCPo ;
   private String[] T01TL3_A13178ProForFT ;
   private String[] T01TL3_A763ProForCla ;
   private String[] T01TL3_A5358ProForClv ;
   private String[] T01TL3_A396EmprCod ;
   private String[] T01TL3_A764ProForCod ;
   private byte[] T01TL3_A490ForPrdUMe ;
   private String[] T01TL30_A396EmprCod ;
   private String[] T01TL30_A764ProForCod ;
   private short[] T01TL30_A767ProForLin ;
   private String[] T01TL31_A396EmprCod ;
   private String[] T01TL31_A764ProForCod ;
   private short[] T01TL31_A767ProForLin ;
   private short[] T01TL2_A767ProForLin ;
   private String[] T01TL2_A770ProForPrd ;
   private String[] T01TL2_A765ProForDes ;
   private String[] T01TL2_A13111ProForDe2 ;
   private java.math.BigDecimal[] T01TL2_A762ProForCan ;
   private byte[] T01TL2_A1645ProForNro ;
   private byte[] T01TL2_A3379ProForTnq ;
   private java.math.BigDecimal[] T01TL2_A6062ProForCPo ;
   private String[] T01TL2_A13178ProForFT ;
   private String[] T01TL2_A763ProForCla ;
   private String[] T01TL2_A5358ProForClv ;
   private String[] T01TL2_A396EmprCod ;
   private String[] T01TL2_A764ProForCod ;
   private byte[] T01TL2_A490ForPrdUMe ;
   private String[] T01TL35_A488ForPrdDsc ;
   private boolean[] T01TL35_n488ForPrdDsc ;
   private String[] T01TL36_A710PrdFind ;
   private boolean[] T01TL36_n710PrdFind ;
   private byte[] T01TL39_A4340PrdUMeFind ;
   private boolean[] T01TL39_n4340PrdUMeFind ;
   private String[] T01TL45_A717PrdMaxFind ;
   private boolean[] T01TL45_n717PrdMaxFind ;
   private String[] T01TL46_A396EmprCod ;
   private String[] T01TL46_A764ProForCod ;
   private short[] T01TL46_A767ProForLin ;
   private String[] T01TL47_A396EmprCod ;
   private byte[] T01TL47_A490ForPrdUMe ;
   private String[] T01TL47_A13746ForPrdCDsc ;
   private String[] T01TL53_A717PrdMaxFind ;
   private boolean[] T01TL53_n717PrdMaxFind ;
   private String[] T01TL54_A710PrdFind ;
   private boolean[] T01TL54_n710PrdFind ;
   private byte[] T01TL57_A4340PrdUMeFind ;
   private boolean[] T01TL57_n4340PrdUMeFind ;
   private String[] T01TL58_A488ForPrdDsc ;
   private boolean[] T01TL58_n488ForPrdDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV41ProForPrd_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV32TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV33TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV38WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class procesoquimico_2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesoquimico_2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesoquimico_2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesoquimico_2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesoquimico_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TL2", "SELECT ProForLin, ProForPrd, ProForDes, ProForDe2, ProForCan, ProForNro, ProForTnq, ProForCPo, ProForFT, ProForCla, ProForClv, EmprCod, ProForCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?  FOR UPDATE OF ProForPrd, ProForDes, ProForDe2, ProForCan, ProForNro, ProForTnq, ProForCPo, ProForFT, ProForCla, ProForClv, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL3", "SELECT ProForLin, ProForPrd, ProForDes, ProForDe2, ProForCan, ProForNro, ProForTnq, ProForCPo, ProForFT, ProForCla, ProForClv, EmprCod, ProForCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL6", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL12", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT MIN(T4.ProForPrd) AS GXC4 FROM (TXPLPROFO T4 INNER JOIN TXPCPROFO T6 ON T6.EmprCod = T4.EmprCod AND T6.ProForCod = T4.ProForCod) FULL OUTER JOIN  (SELECT MAX(T7.ProForLin) AS GXC7 FROM (TXPLPROFO T7 INNER JOIN TXPCPROFO T8 ON T8.EmprCod = T7.EmprCod AND T8.ProForCod = T7.ProForCod) WHERE T7.EmprCod = T8.EmprCod and T7.ProForCod = T8.ProForCod ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = T6.EmprCod and T4.ProForCod = T6.ProForCod) ) T2 FULL OUTER JOIN  (SELECT MIN(T4.ProForPrd) AS GXC3 FROM (TXPLPROFO T4 INNER JOIN TXPCPROFO T6 ON T6.EmprCod = T4.EmprCod AND T6.ProForCod = T4.ProForCod) FULL OUTER JOIN  (SELECT MAX(T7.ProForLin) AS GXC6 FROM (TXPLPROFO T7 INNER JOIN TXPCPROFO T8 ON T8.EmprCod = T7.EmprCod AND T8.ProForCod = T7.ProForCod) WHERE T7.EmprCod = T8.EmprCod and T7.ProForCod = T8.ProForCod and T7.ProForLin < ? ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.EmprCod = T6.EmprCod and T4.ProForCod = T6.ProForCod and T4.ProForLin < ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL14", "SELECT ProForDsc, ProForDsc2, ProForUli FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL15", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL16", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL17", "SELECT /*+ FIRST_ROWS(100) */ T4.PrdNum, TM1.ProForLin, TM1.ProForPrd, TM1.ProForDes, T2.EmprNom, T3.ProForDsc, T3.ProForDsc2, T3.ProForUli, TM1.ProForDe2, T5.ForPrdDsc, TM1.ProForCan, TM1.ProForNro, TM1.ProForTnq, TM1.ProForCPo, TM1.ProForFT, TM1.ProForCla, TM1.ProForClv, TM1.EmprCod, TM1.ProForCod, TM1.ForPrdUMe, COALESCE( T4.PrdNum, 'xxxxxx') AS PrdFind FROM ((((TXPLPROFO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProForCod = TM1.ProForCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrdNum = TM1.ProForPrd) INNER JOIN TXPUNMEPR T5 ON T5.EmprCod = TM1.EmprCod AND T5.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.ProForCod = ? and TM1.ProForLin = ? ORDER BY TM1.EmprCod, TM1.ProForCod, TM1.ProForLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL18", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL21", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL27", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT MIN(T4.ProForPrd) AS GXC4 FROM (TXPLPROFO T4 INNER JOIN TXPCPROFO T6 ON T6.EmprCod = T4.EmprCod AND T6.ProForCod = T4.ProForCod) FULL OUTER JOIN  (SELECT MAX(T7.ProForLin) AS GXC7 FROM (TXPLPROFO T7 INNER JOIN TXPCPROFO T8 ON T8.EmprCod = T7.EmprCod AND T8.ProForCod = T7.ProForCod) WHERE T7.EmprCod = T8.EmprCod and T7.ProForCod = T8.ProForCod ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = T6.EmprCod and T4.ProForCod = T6.ProForCod) ) T2 FULL OUTER JOIN  (SELECT MIN(T4.ProForPrd) AS GXC3 FROM (TXPLPROFO T4 INNER JOIN TXPCPROFO T6 ON T6.EmprCod = T4.EmprCod AND T6.ProForCod = T4.ProForCod) FULL OUTER JOIN  (SELECT MAX(T7.ProForLin) AS GXC6 FROM (TXPLPROFO T7 INNER JOIN TXPCPROFO T8 ON T8.EmprCod = T7.EmprCod AND T8.ProForCod = T7.ProForCod) WHERE T7.EmprCod = T8.EmprCod and T7.ProForCod = T8.ProForCod and T7.ProForLin < ? ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.EmprCod = T6.EmprCod and T4.ProForCod = T6.ProForCod and T4.ProForLin < ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL28", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL29", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL30", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE ( EmprCod > ? or EmprCod = ? and ProForCod > ? or ProForCod = ? and EmprCod = ? and ProForLin > ?) ORDER BY EmprCod, ProForCod, ProForLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TL31", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE ( EmprCod < ? or EmprCod = ? and ProForCod < ? or ProForCod = ? and EmprCod = ? and ProForLin < ?) ORDER BY EmprCod DESC, ProForCod DESC, ProForLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TL32", "INSERT INTO TXPLPROFO(ProForLin, ProForPrd, ProForDes, ProForDe2, ProForCan, ProForNro, ProForTnq, ProForCPo, ProForFT, ProForCla, ProForClv, EmprCod, ProForCod, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T01TL33", "UPDATE TXPLPROFO SET ProForPrd=?, ProForDes=?, ProForDe2=?, ProForCan=?, ProForNro=?, ProForTnq=?, ProForCPo=?, ProForFT=?, ProForCla=?, ProForClv=?, ForPrdUMe=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T01TL34", "DELETE FROM TXPLPROFO  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new ForEachCursor("T01TL35", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL36", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL39", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL45", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT MIN(T4.ProForPrd) AS GXC4 FROM (TXPLPROFO T4 INNER JOIN TXPCPROFO T6 ON T6.EmprCod = T4.EmprCod AND T6.ProForCod = T4.ProForCod) FULL OUTER JOIN  (SELECT MAX(T7.ProForLin) AS GXC7 FROM (TXPLPROFO T7 INNER JOIN TXPCPROFO T8 ON T8.EmprCod = T7.EmprCod AND T8.ProForCod = T7.ProForCod) WHERE T7.EmprCod = T8.EmprCod and T7.ProForCod = T8.ProForCod ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = T6.EmprCod and T4.ProForCod = T6.ProForCod) ) T2 FULL OUTER JOIN  (SELECT MIN(T4.ProForPrd) AS GXC3 FROM (TXPLPROFO T4 INNER JOIN TXPCPROFO T6 ON T6.EmprCod = T4.EmprCod AND T6.ProForCod = T4.ProForCod) FULL OUTER JOIN  (SELECT MAX(T7.ProForLin) AS GXC6 FROM (TXPLPROFO T7 INNER JOIN TXPCPROFO T8 ON T8.EmprCod = T7.EmprCod AND T8.ProForCod = T7.ProForCod) WHERE T7.EmprCod = T8.EmprCod and T7.ProForCod = T8.ProForCod and T7.ProForLin < ? ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.EmprCod = T6.EmprCod and T4.ProForCod = T6.ProForCod and T4.ProForLin < ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL46", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProForCod, ProForLin FROM TXPLPROFO ORDER BY EmprCod, ProForCod, ProForLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL47", "SELECT EmprCod, ForPrdUMe, RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc FROM TXPUNMEPR WHERE EmprCod = ? ORDER BY ForPrdCDsc ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL53", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT MIN(T4.ProForPrd) AS GXC4 FROM (TXPLPROFO T4 INNER JOIN TXPCPROFO T6 ON T6.EmprCod = T4.EmprCod AND T6.ProForCod = T4.ProForCod) FULL OUTER JOIN  (SELECT MAX(T7.ProForLin) AS GXC7 FROM (TXPLPROFO T7 INNER JOIN TXPCPROFO T8 ON T8.EmprCod = T7.EmprCod AND T8.ProForCod = T7.ProForCod) WHERE T7.EmprCod = T8.EmprCod and T7.ProForCod = T8.ProForCod ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = T6.EmprCod and T4.ProForCod = T6.ProForCod) ) T2 FULL OUTER JOIN  (SELECT MIN(T4.ProForPrd) AS GXC3 FROM (TXPLPROFO T4 INNER JOIN TXPCPROFO T6 ON T6.EmprCod = T4.EmprCod AND T6.ProForCod = T4.ProForCod) FULL OUTER JOIN  (SELECT MAX(T7.ProForLin) AS GXC6 FROM (TXPLPROFO T7 INNER JOIN TXPCPROFO T8 ON T8.EmprCod = T7.EmprCod AND T8.ProForCod = T7.ProForCod) WHERE T7.EmprCod = T8.EmprCod and T7.ProForCod = T8.ProForCod and T7.ProForLin < ? ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.EmprCod = T6.EmprCod and T4.ProForCod = T6.ProForCod and T4.ProForLin < ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL54", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL57", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TL58", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((String[]) buf[17])[0] = rslt.getString(16, 16);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 40);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 16);
               stmt.setString(11, (String)parms[10], 30);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 30);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 3);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 22 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

